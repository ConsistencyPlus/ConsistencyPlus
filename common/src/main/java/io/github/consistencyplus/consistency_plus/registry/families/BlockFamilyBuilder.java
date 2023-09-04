package io.github.consistencyplus.consistency_plus.registry.families;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.items.CPlusItemGroups;
import io.github.consistencyplus.consistency_plus.registry.families.factories.blocks.BlockFactory;
import io.github.consistencyplus.consistency_plus.registry.families.factories.blocks.JustSettingsBlockFactory;
import io.github.consistencyplus.consistency_plus.registry.families.factories.blocks.NoStyleBlockFactory;
import io.github.consistencyplus.consistency_plus.registry.families.factories.names.BlockNameFactory;
import io.github.consistencyplus.consistency_plus.registry.families.factories.names.StandardBlockNameFactory;
import io.github.consistencyplus.consistency_plus.registry.families.filters.BlockFilter;
import io.github.consistencyplus.consistency_plus.registry.families.filters.NotRegisteredBlockFilter;
import io.github.consistencyplus.consistency_plus.util.LoaderUtils;
import io.github.consistencyplus.consistency_plus.util.RequiredValue;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BlockFamilyBuilder {
    private final String name;
    private final Table<BlockStyle, BlockShape, Block> knownVariants = HashBasedTable.create();
    private final Map<BlockStyle, Block> baseBlocks = new HashMap<>();
    private final RequiredValue<RegistryKey<ItemGroup>> itemGroup = new RequiredValue<>("itemGroup");
    private final Map<BlockShape, BlockFactory> blockFactories = Util.make(new HashMap<>(), map -> {
        for (BlockShape shape : BlockShape.values()) {
            map.put(shape, shape.defaultFactory);
        }
    });
    private AbstractBlock.Settings baseSettings = AbstractBlock.Settings.create();
    private CPlusRenderType renderType = CPlusRenderType.SOLID;
    private BlockFilter filter = NotRegisteredBlockFilter.INSTANCE;
    private BlockNameFactory nameFactory = StandardBlockNameFactory.INSTANCE;
    private BlockFamily oxidizedOf = null;
    private BlockFamily waxedOf = null;
    private boolean hasBrickItem = true;

    public BlockFamilyBuilder(String name) {
        this.name = name;
    }

    public BlockFamilyBuilder baseSettingsFrom(Block block) {
        this.baseSettings = AbstractBlock.Settings.copy(block);
        return this;
    }

    public BlockFamilyBuilder addKnownVariant(Block block, BlockStyle style, BlockShape shape) {
        this.knownVariants.put(style, shape, block);
        if (shape == BlockShape.CUBE) {
            baseBlocks.put(style, block);
        }
        return this;
    }

    public BlockFamilyBuilder itemGroup(RegistryKey<ItemGroup> group) {
        this.itemGroup.set(group);
        return this;
    }

    public BlockFamilyBuilder itemGroup(CPlusItemGroups.GroupInfo info) {
        return itemGroup(info.key());
    }

    public BlockFamilyBuilder setShapeFactory(BlockShape shape, BlockFactory factory) {
        this.blockFactories.put(shape, factory);
        return this;
    }

    public BlockFamilyBuilder setShapeFactory(BlockShape shape, NoStyleBlockFactory factory) {
        return setShapeFactory(shape, (style, settings, base) -> factory.create(settings, base));
    }

    public BlockFamilyBuilder setShapeFactory(BlockShape shape, JustSettingsBlockFactory factory) {
        return setShapeFactory(shape, (settings, base) -> factory.create(settings));
    }

    public BlockFamilyBuilder settings(Consumer<AbstractBlock.Settings> consumer) {
        consumer.accept(baseSettings);
        return this;
    }

    public BlockFamilyBuilder renderType(CPlusRenderType type) {
        this.renderType = type;
        return this;
    }

    public BlockFamilyBuilder filter(BlockFilter filter) {
        this.filter = filter;
        return this;
    }

    public BlockFamilyBuilder nameFactory(BlockNameFactory factory) {
        this.nameFactory = factory;
        return this;
    }

    public BlockFamilyBuilder oxidizedOf(BlockFamily family) {
        this.oxidizedOf = family;
        return this;
    }

    public BlockFamilyBuilder waxedOf(BlockFamily family) {
        this.waxedOf = family;
        return this;
    }

    public BlockFamilyBuilder noBrickItem() {
        this.hasBrickItem = false;
        return this;
    }

    public BlockFamily build() {
        Table<BlockStyle, BlockShape, BlockEntry> table = HashBasedTable.create();
        for (BlockStyle style : BlockStyle.values()) {
            Block baseBlock = getOrCreateBaseBlock(table, style);
            if (style.hasShapes) {
                for (BlockShape shape : BlockShape.NON_CUBE) {
                    if (!knownVariants.contains(style, shape)) {
                        String name = nameFactory.makeName(this.name, style, shape);
                        if (filter.shouldCreate(style, shape, this.name, name)) {
                            BlockFactory factory = blockFactories.get(shape);
                            Block block = factory.create(style, getSettings(), baseBlock);
                            if (block != null) {
                                Identifier id = ConsistencyPlusMain.id(name);
                                BlockItem item = new BlockItem(block, new Settings());
                                table.put(style, shape, new BlockEntry(id, block, item));
                            }
                        }
                    }
                }
            }
        }

        if (oxidizedOf != null) {
            mapWith(table, oxidizedOf, (to, from) -> LoaderUtils.registerOxidation(from, to));
        }

        if (waxedOf != null) {
            mapWith(table, waxedOf, (to, from) -> LoaderUtils.registerWaxing(from, to));
        }

        Item brickItem = hasBrickItem ? new Item(new Settings().arch$tab(ItemGroups.INGREDIENTS)) : null;

        return new BlockFamily(this.name, table, brickItem, itemGroup.get(), this.renderType);
    }

    public BlockFamily buildTo(List<BlockFamily> list) {
        BlockFamily family = build();
        list.add(family);
        return family;
    }

    private Block getOrCreateBaseBlock(Table<BlockStyle, BlockShape, BlockEntry> table, BlockStyle style) {
        return baseBlocks.computeIfAbsent(style, $ -> {
            String name = nameFactory.makeName(this.name, style, BlockShape.CUBE);
            if (filter.shouldCreate(style, BlockShape.CUBE, this.name, name)) {
                BlockFactory factory = blockFactories.get(BlockShape.CUBE);
                Block block = factory.create(style, getSettings(), null);
                Identifier id = ConsistencyPlusMain.id(name);
                BlockItem item = new BlockItem(block, new Settings());
                table.put(style, BlockShape.CUBE, new BlockEntry(id, block, item));
                return block;
            } else {
                Identifier mcId = new Identifier("minecraft", name);
                Block vanilla = Registries.BLOCK.get(mcId);
                if (vanilla != Blocks.AIR) {
                    return vanilla;
                }
                throw new IllegalStateException("Could not create " + name + ", but no vanilla block could be found");
            }
        });
    }

    private AbstractBlock.Settings getSettings() {
        return LoaderUtils.copySettings(baseSettings);
    }

    private void mapWith(Table<BlockStyle, BlockShape, BlockEntry> table, BlockFamily other, BiConsumer<Block, Block> consumer) {
        for (BlockStyle style : BlockStyle.values()) {
            for (BlockShape shape : BlockShape.values()) {
                BlockEntry a = table.get(style, shape);
                Block b = other.getBlock(style, shape);
                if (a != null && b != null) {
                    consumer.accept(a.block(), b);
                }
            }
        }
    }
}

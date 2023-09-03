package io.github.consistencyplus.consistency_plus.registry.families;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.items.CPlusItemGroups;
import io.github.consistencyplus.consistency_plus.util.LoaderUtils;
import io.github.consistencyplus.consistency_plus.util.RequiredValue;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroup;
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
    private BlockFamily oxidizedOf = null;
    private BlockFamily waxedOf = null;

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

    public BlockFamilyBuilder oxidizedOf(BlockFamily family) {
        this.oxidizedOf = family;
        return this;
    }

    public BlockFamilyBuilder waxedOf(BlockFamily family) {
        this.waxedOf = family;
        return this;
    }

    public BlockFamily build() {
        Table<BlockStyle, BlockShape, BlockEntry> table = HashBasedTable.create();
        for (BlockStyle style : BlockStyle.values()) {
            Block baseBlock = getOrCreateBaseBlock(table, style);
            if (style.hasShapes) {
                for (BlockShape shape : BlockShape.NON_CUBE) {
                    if (!knownVariants.contains(style, shape)) {
                        String name = style.makeBlockName(this.name, shape);
                        if (filter.shouldCreate(style, shape, this.name, name)) {
                            BlockFactory factory = blockFactories.get(shape);
                            Block block = factory.create(getSettings(), baseBlock);
                            Identifier id = ConsistencyPlusMain.id(name);
                            BlockItem item = new BlockItem(block, new Settings());
                            table.put(style, shape, new BlockEntry(id, block, item));
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

        return new BlockFamily(table, renderType);
    }

    public BlockFamily buildTo(List<BlockFamily> list) {
        BlockFamily family = build();
        list.add(family);
        return family;
    }

    private Block getOrCreateBaseBlock(Table<BlockStyle, BlockShape, BlockEntry> table, BlockStyle style) {
        return baseBlocks.computeIfAbsent(style, $ -> {
            String name = style.makeBlockName(this.name, BlockShape.CUBE);
            Identifier mcId = new Identifier("minecraft", name);
            Block vanilla = Registries.BLOCK.get(mcId);
            if (vanilla != Blocks.AIR) {
                return vanilla;
            }
            // not found, create it
            BlockFactory factory = blockFactories.get(BlockShape.CUBE);
            Block block = factory.create(getSettings(), null);
            Identifier id = ConsistencyPlusMain.id(name);
            BlockItem item = new BlockItem(block, new Settings());
            table.put(style, BlockShape.CUBE, new BlockEntry(id, block, item));
            return block;
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

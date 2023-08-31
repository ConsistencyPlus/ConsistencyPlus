package io.github.consistencyplus.consistency_plus.registry.families;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.items.CPlusItemGroups;
import io.github.consistencyplus.consistency_plus.util.LoaderUtils;
import io.github.consistencyplus.consistency_plus.util.RequiredValue;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class BlockFamilyBuilder {
    private AbstractBlock.Settings baseSettings = AbstractBlock.Settings.create();
    private final Table<BlockStyle, BlockShape, Block> blockTable = HashBasedTable.create();
    private final RequiredValue<RegistryKey<ItemGroup>> itemGroup = new RequiredValue<>("itemGroup");
    private final Map<BlockShape, BlockFactory> blockFactories = Util.make(new HashMap<>(), map -> {
        for (BlockShape shape : BlockShape.values()) {
            map.put(shape, shape.defaultFactory);
        }
    });
    private CPlusRenderType renderType = CPlusRenderType.SOLID;
    private final String name;
    private BlockFilter filter = NotRegisteredBlockFilter.INSTANCE;

    public BlockFamilyBuilder(String name) {
        this.name = name;
    }

    public BlockFamilyBuilder baseSettingsFrom(Block block) {
        this.baseSettings = AbstractBlock.Settings.copy(block);
        return this;
    }

    public BlockFamilyBuilder addKnownVariant(Block block, BlockStyle style, BlockShape shape) {
        this.blockTable.put(style, shape, block);
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

    public BlockFamily build() {
        if (!LoaderUtils.registrationReady()) {
            throw new IllegalStateException("Trying to register BlockFamily " + name + " before registration is ready!");
        }
        for (BlockStyle style : BlockStyle.values()) {
            String baseBlockName = style.makeBlockName(this.name, BlockShape.CUBE);
            if (filter.shouldCreate(style, BlockShape.CUBE, this.name, baseBlockName)) {
                Block baseBlock = getOrCreateBaseBlock(style);
                if (style.hasShapes) {
                    for (BlockShape shape : BlockShape.NON_CUBE) {
                        if (!blockTable.contains(style, shape)) {
                            String name = style.makeBlockName(this.name, shape);
                            if (filter.shouldCreate(style, shape, this.name, name)) {
                                BlockFactory factory = blockFactories.get(shape);
                                Block block = factory.create(getSettings(), baseBlock);
                                blockTable.put(style, shape, block);
                                Identifier id = ConsistencyPlusMain.id(name);
                                Registry.register(Registries.BLOCK, id, block);
                            }
                        }
                    }
                }
            }
        }

        return new BlockFamily(blockTable);
    }

    private Block getOrCreateBaseBlock(BlockStyle style) {
        Block block = blockTable.get(style, BlockShape.CUBE);
        if (block == null) {
            BlockFactory factory = blockFactories.get(BlockShape.CUBE);
            block = factory.create(getSettings(), null);
            blockTable.put(style, BlockShape.CUBE, block);
        }
        return block;
    }

    private AbstractBlock.Settings getSettings() {
        return this.baseSettings;
    }
}

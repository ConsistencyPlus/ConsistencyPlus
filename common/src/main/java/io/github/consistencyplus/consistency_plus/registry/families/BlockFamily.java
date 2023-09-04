package io.github.consistencyplus.consistency_plus.registry.families;

import com.google.common.collect.Table;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class BlockFamily {
    public final Table<BlockStyle, BlockShape, BlockEntry> blockTable;
    public final CPlusRenderType renderLayer;

    protected BlockFamily(Table<BlockStyle, BlockShape, BlockEntry> blockTable, CPlusRenderType renderLayer) {
        this.blockTable = blockTable;
        this.renderLayer = renderLayer;
    }

    public BlockEntry get(BlockStyle style, BlockShape shape) {
        return blockTable.get(style, shape);
    }

    public Block getBlock(BlockStyle style, BlockShape shape) {
        BlockEntry entry = get(style, shape);
        return entry == null ? null : entry.block();
    }

    public Block getBaseBlock() {
        return getBlock(BlockStyle.PLAIN, BlockShape.CUBE);
    }

    public static BlockFamilyBuilder builder(String name) {
        return new BlockFamilyBuilder(name);
    }

    public void register() {
        blockTable.values().forEach(entry -> {
            Registry.register(Registries.BLOCK, entry.id(), entry.block());
            Registry.register(Registries.ITEM, entry.id(), entry.item());
        });
    }
}

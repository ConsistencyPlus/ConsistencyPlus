package io.github.consistencyplus.consistency_plus.registry.families;

import com.google.common.collect.Table;
import net.minecraft.block.Block;

public class BlockFamily {
    private final Table<BlockStyle, BlockShape, Block> blockTable;

    protected BlockFamily(Table<BlockStyle, BlockShape, Block> blockTable) {
        this.blockTable = blockTable;
    }

    public static BlockFamilyBuilder builder(String name) {
        return new BlockFamilyBuilder(name);
    }
}

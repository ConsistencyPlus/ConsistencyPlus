package io.github.consistencyplus.consistency_plus.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;

public class CPlusStairsBlock extends StairsBlock {
    public CPlusStairsBlock(Settings settings) {
        super(Blocks.STONE.getDefaultState(), settings);
    }
}

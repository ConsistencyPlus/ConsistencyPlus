package io.github.consistencyplus.consistency_plus.blocks.base;

import io.github.consistencyplus.consistency_plus.blocks.SelfDroppingBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;

public class CPlusStairsBlock extends StairsBlock implements SelfDroppingBlock {
    public CPlusStairsBlock(BlockState base, Settings settings) {
        super(base, settings);
    }
}

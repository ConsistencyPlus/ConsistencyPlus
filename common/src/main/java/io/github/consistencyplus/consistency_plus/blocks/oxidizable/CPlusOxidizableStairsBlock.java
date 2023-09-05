package io.github.consistencyplus.consistency_plus.blocks.oxidizable;

import io.github.consistencyplus.consistency_plus.blocks.SelfDroppingBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.OxidizableStairsBlock;

public class CPlusOxidizableStairsBlock extends OxidizableStairsBlock implements SelfDroppingBlock {
    public CPlusOxidizableStairsBlock(OxidationLevel oxidationLevel, BlockState baseBlockState, Settings settings) {
        super(oxidationLevel, baseBlockState, settings);
    }
}

package io.github.consistencyplus.consistency_plus.blocks.oxidizable;

import io.github.consistencyplus.consistency_plus.blocks.SelfDroppingBlock;
import net.minecraft.block.OxidizableBlock;

public class CPlusOxidizableBlock extends OxidizableBlock implements SelfDroppingBlock {
    public CPlusOxidizableBlock(OxidationLevel oxidationLevel, Settings settings) {
        super(oxidationLevel, settings);
    }
}

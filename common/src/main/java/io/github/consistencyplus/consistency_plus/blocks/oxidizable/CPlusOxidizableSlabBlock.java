package io.github.consistencyplus.consistency_plus.blocks.oxidizable;

import io.github.consistencyplus.consistency_plus.blocks.SelfDroppingBlock;
import net.minecraft.block.OxidizableSlabBlock;

public class CPlusOxidizableSlabBlock extends OxidizableSlabBlock implements SelfDroppingBlock {
    public CPlusOxidizableSlabBlock(OxidationLevel oxidationLevel, Settings settings) {
        super(oxidationLevel, settings);
    }
}

package io.github.consistencyplus.consistency_plus.blocks.base;

import io.github.consistencyplus.consistency_plus.blocks.SelfDroppingBlock;
import net.minecraft.block.SlabBlock;

public class CPlusSlabBlock extends SlabBlock implements SelfDroppingBlock {
    public CPlusSlabBlock(Settings settings) {
        super(settings);
    }
}

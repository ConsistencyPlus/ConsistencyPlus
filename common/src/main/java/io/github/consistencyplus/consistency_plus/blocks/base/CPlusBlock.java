package io.github.consistencyplus.consistency_plus.blocks.base;

import io.github.consistencyplus.consistency_plus.blocks.SelfDroppingBlock;
import net.minecraft.block.Block;

public class CPlusBlock extends Block implements SelfDroppingBlock {
    public CPlusBlock(Settings settings) {
        super(settings);
    }
}

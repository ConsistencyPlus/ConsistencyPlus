package io.github.consistencyplus.consistency_plus.blocks.base;

import io.github.consistencyplus.consistency_plus.blocks.SelfDroppingBlock;
import net.minecraft.block.PillarBlock;

public class CPlusPillarBlock extends PillarBlock implements SelfDroppingBlock {
    public CPlusPillarBlock(Settings settings) {
        super(settings);
    }
}

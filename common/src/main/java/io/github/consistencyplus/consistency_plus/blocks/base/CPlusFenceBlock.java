package io.github.consistencyplus.consistency_plus.blocks.base;

import io.github.consistencyplus.consistency_plus.blocks.SelfDroppingBlock;
import net.minecraft.block.FenceBlock;

public class CPlusFenceBlock extends FenceBlock implements SelfDroppingBlock {
    public CPlusFenceBlock(Settings settings) {
        super(settings);
    }
}

package io.github.consistencyplus.consistency_plus.blocks.base;

import io.github.consistencyplus.consistency_plus.blocks.SelfDroppingBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.WoodType;

public class CPlusFenceGateBlock extends FenceGateBlock implements SelfDroppingBlock {
    public CPlusFenceGateBlock(Settings settings, WoodType type) {
        super(settings, type);
    }
}

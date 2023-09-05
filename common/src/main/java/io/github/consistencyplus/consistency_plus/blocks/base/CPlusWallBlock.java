package io.github.consistencyplus.consistency_plus.blocks.base;

import io.github.consistencyplus.consistency_plus.blocks.SelfDroppingBlock;
import net.minecraft.block.WallBlock;

public class CPlusWallBlock extends WallBlock implements SelfDroppingBlock {
    public CPlusWallBlock(Settings settings) {
        super(settings);
    }
}

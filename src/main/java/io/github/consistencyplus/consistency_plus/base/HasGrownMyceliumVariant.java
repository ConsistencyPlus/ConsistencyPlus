package io.github.consistencyplus.consistency_plus.base;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface HasGrownMyceliumVariant {
    BlockState getGrownMyceliumVariant(World world, BlockPos pos);
}

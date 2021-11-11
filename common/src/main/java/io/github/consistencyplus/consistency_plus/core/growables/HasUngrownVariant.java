package io.github.consistencyplus.consistency_plus.core.growables;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface HasUngrownVariant {
	BlockState getUngrownVariant(World world, BlockPos pos);
}

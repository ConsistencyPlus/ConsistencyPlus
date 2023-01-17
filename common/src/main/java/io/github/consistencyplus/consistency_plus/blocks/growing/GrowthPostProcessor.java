package io.github.consistencyplus.consistency_plus.blocks.growing;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

/**
 * Post-process freshly grown blocks. For example, making grass snowy when there's snow above.
 */
public interface GrowthPostProcessor {
	GrowthPostProcessor NOTHING = (current, world, pos) -> current;
	GrowthPostProcessor SNOWIFY = (current, world, pos) -> {
		if (current.contains(Properties.SNOWY)) {
			boolean snowy = world.getBlockState(pos.up()).isOf(Blocks.SNOW);
			return current.with(Properties.SNOWY, snowy);
		}
		return current;
	};

	BlockState modifyState(BlockState current, WorldView world, BlockPos pos);
}

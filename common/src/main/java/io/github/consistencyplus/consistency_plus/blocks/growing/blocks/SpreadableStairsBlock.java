package io.github.consistencyplus.consistency_plus.blocks.growing.blocks;

import io.github.consistencyplus.consistency_plus.blocks.growing.DirtGrowth;
import io.github.consistencyplus.consistency_plus.blocks.growing.SpreadType;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class SpreadableStairsBlock extends StairsBlock {
	protected final SpreadType type;

	public SpreadableStairsBlock(SpreadType type, BlockState baseBlockState, Settings settings) {
		super(baseBlockState, settings);
		this.type = type;
	}

	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		DirtGrowth.randomTickSpreadable(state, world, pos, random, type);
	}
}

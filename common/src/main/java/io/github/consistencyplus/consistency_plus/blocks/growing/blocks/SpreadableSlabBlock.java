package io.github.consistencyplus.consistency_plus.blocks.growing.blocks;

import io.github.consistencyplus.consistency_plus.blocks.growing.DirtGrowth;
import io.github.consistencyplus.consistency_plus.blocks.growing.SpreadType;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class SpreadableSlabBlock extends SlabBlock {
	protected final SpreadType type;

	public SpreadableSlabBlock(SpreadType type, Settings settings) {
		super(settings);
		this.type = type;
	}

	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		DirtGrowth.randomTickSpreadable(state, world, pos, random, type);
	}
}

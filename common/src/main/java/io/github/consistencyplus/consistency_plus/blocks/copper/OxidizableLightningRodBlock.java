package io.github.consistencyplus.consistency_plus.blocks.copper;

import net.minecraft.block.BlockState;
import net.minecraft.block.LightningRodBlock;
import net.minecraft.block.Oxidizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import net.minecraft.util.random.RandomGenerator;

public class OxidizableLightningRodBlock extends LightningRodBlock implements Oxidizable {
	private final OxidizationLevel oxidationLevel;
	
	public OxidizableLightningRodBlock(OxidizationLevel level, Settings settings) {
		super(settings);
		this.oxidationLevel = level;
	}
	
	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, RandomGenerator random) {
		this.tickDegradation(state, world, pos, random);
	}
	
	@Override
	public boolean hasRandomTicks(BlockState state) {
		return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
	}
	
	@Override
	public OxidizationLevel getDegradationLevel() {
		return this.oxidationLevel;
	}
}

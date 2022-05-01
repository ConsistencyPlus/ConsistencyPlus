package io.github.consistencyplus.consistency_plus.blocks.copper;

import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.WallBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class OxidizableWallBlock extends WallBlock implements Oxidizable {
	private final OxidizationLevel oxidationLevel;
	
	public OxidizableWallBlock(OxidizationLevel level, Settings settings) {
		super(settings);
		this.oxidationLevel = level;
	}
	
	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
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

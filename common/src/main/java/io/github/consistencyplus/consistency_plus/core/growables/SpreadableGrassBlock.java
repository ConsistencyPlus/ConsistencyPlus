package io.github.consistencyplus.consistency_plus.core.growables;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SnowBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;

import java.util.Random;

import static net.minecraft.block.SnowyBlock.SNOWY;

public interface SpreadableGrassBlock {
	default boolean customCanSurvive(BlockState state, WorldView worldView, BlockPos pos) {
		BlockState stateAbove = worldView.getBlockState(pos.up());
		if (stateAbove.isOf(Blocks.SNOW) && stateAbove.get(SnowBlock.LAYERS) == 1) {
			return true;
		} else if (stateAbove.getFluidState().getLevel() == 8) {
			return false;
		} else {
			int i = ChunkLightProvider.getRealisticOpacity(worldView, state, pos, stateAbove, pos.up(), Direction.UP, stateAbove.getOpacity(worldView, pos.up()));
			return i < worldView.getMaxLightLevel();
		}
	}
	
	default boolean customCanSpread(BlockState state, WorldView worldView, BlockPos pos) {
		BlockPos blockPos = pos.up();
		return customCanSurvive(state, worldView, pos) && !worldView.getFluidState(blockPos).isIn(FluidTags.WATER);
	}
	
	default void grow(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		if (!customCanSurvive(state, world, pos)) {
			world.setBlockState(pos, ((HasUngrownVariant) this).getUngrownVariant(world, pos));
		} else {
			if (world.getLightLevel(pos.up()) >= 9) {
				for (int i = 0; i < 4; ++i) {
					
					BlockPos targetPos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
					
					// vanilla handling
					if (world.getBlockState(targetPos).isOf(Blocks.DIRT) && customCanSpread(world.getBlockState(pos), world, targetPos)) {
						// snow check
						if (world.getBlockState(targetPos.up()).isOf(Blocks.SNOW_BLOCK) || world.getBlockState(targetPos.up()).isOf(Blocks.SNOW)) {
							world.setBlockState(targetPos, Blocks.GRASS_BLOCK.getDefaultState().with(SNOWY, true));
						} else {
							world.setBlockState(targetPos, Blocks.GRASS_BLOCK.getDefaultState());
						}
					}
					
					// HasGrownGrassVariant handling
					if (world.getBlockState(targetPos).getBlock() instanceof HasGrownGrassVariant && customCanSpread(world.getBlockState(pos), world, targetPos)) {
						HasGrownGrassVariant targetBlock = (HasGrownGrassVariant) world.getBlockState(targetPos).getBlock();
						
						// snow check
						if (world.getBlockState(targetPos.up()).isOf(Blocks.SNOW_BLOCK) || world.getBlockState(targetPos.up()).isOf(Blocks.SNOW)) {
							world.setBlockState(targetPos, targetBlock.getGrownGrassVariant(world, targetPos).with(SNOWY, true));
						} else {
							world.setBlockState(targetPos, targetBlock.getGrownGrassVariant(world, targetPos));
						}
					}
				}
			}
		}
	}
}

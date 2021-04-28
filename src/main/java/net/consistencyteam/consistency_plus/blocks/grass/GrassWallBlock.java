package net.consistencyteam.consistency_plus.blocks.grass;

import net.consistencyteam.consistency_plus.base.HasUngrownVariant;
import net.consistencyteam.consistency_plus.base.IsSpreadableGrassBlock;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

import static net.consistencyteam.consistency_plus.registry.Blocks.DIRT_WALL;

public class GrassWallBlock extends WallBlock implements HasUngrownVariant, IsSpreadableGrassBlock {
	public GrassWallBlock(Settings settings) {
		super(settings);
	}
	@Override
	public BlockState getUngrownVariant(World world, BlockPos pos) {
		BlockState oldState = world.getBlockState(pos);
		return DIRT_WALL.getDefaultState().with(UP, oldState.get(UP)).with(WATERLOGGED, oldState.get(WATERLOGGED))
				.with(NORTH_SHAPE, oldState.get(NORTH_SHAPE)).with(SOUTH_SHAPE, oldState.get(SOUTH_SHAPE))
				.with(EAST_SHAPE, oldState.get(EAST_SHAPE)).with(WEST_SHAPE, oldState.get(WEST_SHAPE));
	}
	
	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		grow(state, world, pos, random);
	}
}

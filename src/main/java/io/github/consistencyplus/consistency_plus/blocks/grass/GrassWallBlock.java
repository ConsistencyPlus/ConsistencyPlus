package io.github.consistencyplus.consistency_plus.blocks.grass;

import io.github.consistencyplus.consistency_plus.core.HasUngrownVariant;
import io.github.consistencyplus.consistency_plus.core.SpreadableGrassBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SnowBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;

import java.util.Random;

import static io.github.consistencyplus.consistency_plus.registry.CPlusBlocks.DIRT_WALL;
import static net.minecraft.block.Blocks.AIR;

public class GrassWallBlock extends WallBlock implements HasUngrownVariant, SpreadableGrassBlock {
	public GrassWallBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public boolean customCanSurvive(BlockState state, WorldView worldView, BlockPos pos) {
		BlockState stateAbove = worldView.getBlockState(pos.up());
		if (stateAbove.isOf(Blocks.SNOW) && stateAbove.get(SnowBlock.LAYERS) == 1) {
			return true;
		} else if (stateAbove.getFluidState().getLevel() == 8) {
			return false;
		} else {
			if (state.getBlock() instanceof GrassWallBlock) {
				if (stateAbove.getBlock() != AIR) {
					return false;
				}
			}
			int i = ChunkLightProvider.getRealisticOpacity(worldView, state, pos, stateAbove, pos.up(), Direction.UP, stateAbove.getOpacity(worldView, pos.up()));
			return i < worldView.getMaxLightLevel();
		}
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

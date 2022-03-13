package io.github.consistencyplus.consistency_plus.blocks.dirt;

import io.github.consistencyplus.consistency_plus.core.growables.HasGrownGrassVariant;
import io.github.consistencyplus.consistency_plus.core.growables.HasGrownMyceliumVariant;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import static io.github.consistencyplus.consistency_plus.registry.CPlusBlocks.GRASS_WALL;
import static io.github.consistencyplus.consistency_plus.registry.CPlusBlocks.MYCELIUM_WALL;

public class DirtWallBlock extends WallBlock implements HasGrownGrassVariant, HasGrownMyceliumVariant {
	public DirtWallBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public BlockState getGrownGrassVariant(World world, BlockPos pos) {
		BlockState oldState = world.getBlockState(pos);
		return GRASS_WALL.get().getDefaultState().with(UP, oldState.get(UP)).with(WATERLOGGED, oldState.get(WATERLOGGED))
				.with(NORTH_SHAPE, oldState.get(NORTH_SHAPE)).with(SOUTH_SHAPE, oldState.get(SOUTH_SHAPE))
				.with(EAST_SHAPE, oldState.get(EAST_SHAPE)).with(WEST_SHAPE, oldState.get(WEST_SHAPE));
	}
	
	@Override
	public BlockState getGrownMyceliumVariant(World world, BlockPos pos) {
		BlockState oldState = world.getBlockState(pos);
		return MYCELIUM_WALL.get().getDefaultState().with(UP, oldState.get(UP)).with(WATERLOGGED, oldState.get(WATERLOGGED))
				.with(NORTH_SHAPE, oldState.get(NORTH_SHAPE)).with(SOUTH_SHAPE, oldState.get(SOUTH_SHAPE))
				.with(EAST_SHAPE, oldState.get(EAST_SHAPE)).with(WEST_SHAPE, oldState.get(WEST_SHAPE));

	}
}

package net.consistencyteam.consistency_plus.blocks.dirt;

import net.consistencyteam.consistency_plus.base.HasGrownGrassVariant;
import net.consistencyteam.consistency_plus.base.HasGrownMyceliumVariant;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static net.consistencyteam.consistency_plus.registry.Blocks.*;

public class DirtWallBlock extends WallBlock implements HasGrownGrassVariant, HasGrownMyceliumVariant {
	public DirtWallBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public BlockState getGrownGrassVariant(World world, BlockPos pos) {
		BlockState oldState = world.getBlockState(pos);
		return GRASS_WALL.getDefaultState().with(UP, oldState.get(UP)).with(WATERLOGGED, oldState.get(WATERLOGGED))
				.with(NORTH_SHAPE, oldState.get(NORTH_SHAPE)).with(SOUTH_SHAPE, oldState.get(SOUTH_SHAPE))
				.with(EAST_SHAPE, oldState.get(EAST_SHAPE)).with(WEST_SHAPE, oldState.get(WEST_SHAPE));
	}
	
	@Override
	public BlockState getGrownMyceliumVariant(World world, BlockPos pos) {
		BlockState oldState = world.getBlockState(pos);
		return MYCELIUM_WALL.getDefaultState().with(UP, oldState.get(UP)).with(WATERLOGGED, oldState.get(WATERLOGGED))
				.with(NORTH_SHAPE, oldState.get(NORTH_SHAPE)).with(SOUTH_SHAPE, oldState.get(SOUTH_SHAPE))
				.with(EAST_SHAPE, oldState.get(EAST_SHAPE)).with(WEST_SHAPE, oldState.get(WEST_SHAPE));
	}
}

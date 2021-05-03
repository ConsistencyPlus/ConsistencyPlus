package net.consistencyteam.consistency_plus.blocks.dirt;

import net.consistencyteam.consistency_plus.base.HasGrownGrassVariant;
import net.consistencyteam.consistency_plus.base.HasGrownMyceliumVariant;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static net.consistencyteam.consistency_plus.registry.Blocks.*;

public class DirtStairsBlock extends StairsBlock implements HasGrownGrassVariant, HasGrownMyceliumVariant {
	public DirtStairsBlock(BlockState baseBlockState, Settings settings) {
		super(baseBlockState, settings);
	}
	
	@Override
	public BlockState getGrownGrassVariant(World world, BlockPos pos) {
		BlockState oldState = world.getBlockState(pos);
		return GRASS_STAIRS.getDefaultState().with(WATERLOGGED, oldState.get(WATERLOGGED)).with(FACING, oldState.get(FACING))
				.with(HALF, oldState.get(HALF)).with(SHAPE, oldState.get(SHAPE));
	}
	
	@Override
	public BlockState getGrownMyceliumVariant(World world, BlockPos pos) {
		BlockState oldState = world.getBlockState(pos);
		return MYCELIUM_STAIRS.getDefaultState().with(WATERLOGGED, oldState.get(WATERLOGGED)).with(FACING, oldState.get(FACING))
				.with(HALF, oldState.get(HALF)).with(SHAPE, oldState.get(SHAPE));
	}
}

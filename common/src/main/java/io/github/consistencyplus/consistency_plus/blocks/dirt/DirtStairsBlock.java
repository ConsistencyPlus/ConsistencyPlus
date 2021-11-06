package io.github.consistencyplus.consistency_plus.blocks.dirt;

import io.github.consistencyplus.consistency_plus.core.HasGrownGrassVariant;
import io.github.consistencyplus.consistency_plus.core.HasGrownMyceliumVariant;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static io.github.consistencyplus.consistency_plus.registry.CPlusBlocks.GRASS_STAIRS;
import static io.github.consistencyplus.consistency_plus.registry.CPlusBlocks.MYCELIUM_STAIRS;

public class DirtStairsBlock extends StairsBlock implements HasGrownGrassVariant, HasGrownMyceliumVariant {
	public DirtStairsBlock(BlockState baseBlockState, Settings settings) {
		super(baseBlockState, settings);
	}
	
	@Override
	public BlockState getGrownGrassVariant(World world, BlockPos pos) {
		BlockState oldState = world.getBlockState(pos);
		return GRASS_STAIRS.get().getDefaultState().with(WATERLOGGED, oldState.get(WATERLOGGED)).with(FACING, oldState.get(FACING))
				.with(HALF, oldState.get(HALF)).with(SHAPE, oldState.get(SHAPE));
	}
	
	@Override
	public BlockState getGrownMyceliumVariant(World world, BlockPos pos) {
		BlockState oldState = world.getBlockState(pos);
		return MYCELIUM_STAIRS.get().getDefaultState().with(WATERLOGGED, oldState.get(WATERLOGGED)).with(FACING, oldState.get(FACING))
				.with(HALF, oldState.get(HALF)).with(SHAPE, oldState.get(SHAPE));
	}
}

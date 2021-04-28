package net.consistencyteam.consistency_plus.blocks.dirt;

import net.consistencyteam.consistency_plus.base.HasGrownGrassVariant;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static net.consistencyteam.consistency_plus.registry.Blocks.GRASS_SLAB;

public class DirtSlabBlock extends SlabBlock implements HasGrownGrassVariant {
	public DirtSlabBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public BlockState getGrownGrassVariant(World world, BlockPos pos) {
		BlockState oldState = world.getBlockState(pos);
		return GRASS_SLAB.getDefaultState().with(TYPE, oldState.get(TYPE)).with(WATERLOGGED, oldState.get(WATERLOGGED));
	}
}

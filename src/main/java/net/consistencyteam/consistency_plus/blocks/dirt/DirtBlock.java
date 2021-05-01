package net.consistencyteam.consistency_plus.blocks.dirt;

import net.consistencyteam.consistency_plus.base.HasGrownGrassVariant;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DirtBlock extends Block implements HasGrownGrassVariant {
	public DirtBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public BlockState getGrownGrassVariant(World world, BlockPos pos) {
		return Blocks.GRASS_BLOCK.getDefaultState();
	}
	
}

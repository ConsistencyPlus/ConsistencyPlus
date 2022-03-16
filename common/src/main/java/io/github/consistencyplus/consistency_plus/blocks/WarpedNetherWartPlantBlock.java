package io.github.consistencyplus.consistency_plus.blocks;

import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.NetherWartBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class WarpedNetherWartPlantBlock extends NetherWartBlock {
	public WarpedNetherWartPlantBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
		return new ItemStack(CPlusItems.WARPED_WART.get());
	}
	
}

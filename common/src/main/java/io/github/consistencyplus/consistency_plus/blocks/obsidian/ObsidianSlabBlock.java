package io.github.consistencyplus.consistency_plus.blocks.obsidian;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ObsidianSlabBlock extends SlabBlock {
	public ObsidianSlabBlock(Settings settings) {
		super(settings);
	}
	
	// @Override // this will override on forge, because it has a system for this. On fabric, see AreaHelperMixin
	public boolean isPortalFrame(BlockState state, BlockView world, BlockPos pos) {
		return ObsidianBlock.isValidPortalBlock(state);
	}
}

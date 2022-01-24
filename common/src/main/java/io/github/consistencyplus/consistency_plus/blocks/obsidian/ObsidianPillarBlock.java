package io.github.consistencyplus.consistency_plus.blocks.obsidian;

import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ObsidianPillarBlock extends PillarBlock {
	public ObsidianPillarBlock(Settings settings) {
		super(settings);
	}
	
	// @Override // this will override on forge, because it has a system for this. On fabric, see AreaHelperMixin
	public boolean isPortalFrame(BlockState state, BlockView world, BlockPos pos) {
		return ObsidianBlock.isValidPortalBlock(state);
	}
}

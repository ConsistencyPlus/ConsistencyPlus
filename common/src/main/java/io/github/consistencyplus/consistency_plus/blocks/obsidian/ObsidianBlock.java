package io.github.consistencyplus.consistency_plus.blocks.obsidian;

import dev.architectury.hooks.tags.TagHooks;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.tag.Tag;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ObsidianBlock extends Block {
	private static final Tag.Identified<Block> VALID_PORTAL_BLOCKS = TagHooks.optionalBlock(ConsistencyPlusMain.id("valid_portal_blocks"));
	
	public ObsidianBlock(Settings settings) {
		super(settings);
	}
	
	// @Override // this will override on forge, because it has a system for this. On fabric, see AreaHelperMixin
	public boolean isPortalFrame(BlockState state, BlockView world, BlockPos pos) {
		return isValidPortalBlock(state);
	}
	
	public static boolean isValidPortalBlock(BlockState state) {
		Block block = state.getBlock();
		if (VALID_PORTAL_BLOCKS.contains(block)) {
			if (state.contains(SlabBlock.TYPE)) {
				return state.get(SlabBlock.TYPE) == SlabType.DOUBLE;
			}
			return true;
		}
		return false;
	}
}

package io.github.consistencyplus.consistency_plus.registry.family;

import io.github.consistencyplus.consistency_plus.blocks.BlockOverlay;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import java.util.Map;

/**
 * Represents a family of blocks and their variants. Ex. stone, stone bricks, stone slabs, cobblestone
 */
public record BlockFamily(Identifier id, Map<BlockEntryKey, Block> blocks) {

	public Block getBlock(BlockTypes type, BlockShapes shape, BlockOverlay overlay) {
		BlockEntryKey key = new BlockEntryKey(type, shape, overlay);
		return getBlock(key);
	}

	public Block getBlock(BlockEntryKey key) {
		return blocks.get(key);
	}

	public boolean hasBlock(BlockTypes type, BlockShapes shape, BlockOverlay overlay) {
		BlockEntryKey key = new BlockEntryKey(type, shape, overlay);
		return hasBlock(key);
	}

	public boolean hasBlock(BlockEntryKey key) {
		return blocks.containsKey(key);
	}
}

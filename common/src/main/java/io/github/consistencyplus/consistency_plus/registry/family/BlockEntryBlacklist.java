package io.github.consistencyplus.consistency_plus.registry.family;

import io.github.consistencyplus.consistency_plus.blocks.BlockOverlay;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;

public interface BlockEntryBlacklist {
	void add(BlockTypes type, BlockShapes shape, BlockOverlay overlay);

	default void addAll(BlockTypes type) {
		for (BlockShapes shape : BlockShapes.values()) {
			for (BlockOverlay overlay : BlockOverlay.values()) {
				add(type, shape, overlay);
			}
		}
	}

	default void addAll(BlockShapes shape) {
		for (BlockTypes type : BlockTypes.values()) {
			for (BlockOverlay overlay : BlockOverlay.values()) {
				add(type, shape, overlay);
			}
		}
	}

	default void addAll(BlockOverlay overlay) {
		for (BlockTypes type : BlockTypes.values()) {
			for (BlockShapes shape : BlockShapes.values()) {
				add(type, shape, overlay);
			}
		}
	}
}

package io.github.consistencyplus.consistency_plus.registry.family;

import io.github.consistencyplus.consistency_plus.blocks.BlockOverlay;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;

public record BlockEntryKey(BlockTypes type, BlockShapes shape, BlockOverlay overlay) {
}

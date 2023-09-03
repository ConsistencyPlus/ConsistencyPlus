package io.github.consistencyplus.consistency_plus.registry.families.filters;

import io.github.consistencyplus.consistency_plus.registry.families.BlockShape;
import io.github.consistencyplus.consistency_plus.registry.families.BlockStyle;

public interface BlockFilter {
    boolean shouldCreate(BlockStyle style, BlockShape shape, String familyName, String name);
}

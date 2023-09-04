package io.github.consistencyplus.consistency_plus.registry.families.filters;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.registry.families.BlockShape;
import io.github.consistencyplus.consistency_plus.registry.families.BlockStyle;

public class NotRegisteredBlockFilter implements BlockFilter {
    protected static final boolean printCollisions = false;

    public static final BlockFilter INSTANCE = new NotRegisteredBlockFilter();

    @Override
    public boolean shouldCreate(BlockStyle style, BlockShape shape, String familyName, String name) {
        boolean registered = BlockFilter.isRegistered(name);
        if (printCollisions && registered) {
            ConsistencyPlusMain.LOGGER.info("Block already exists: {} ({}, {})", name, style, shape);
        }
        return !registered;
    }
}

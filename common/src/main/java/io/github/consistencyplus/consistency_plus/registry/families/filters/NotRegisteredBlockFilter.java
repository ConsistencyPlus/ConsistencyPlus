package io.github.consistencyplus.consistency_plus.registry.families.filters;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.registry.families.BlockShape;
import io.github.consistencyplus.consistency_plus.registry.families.BlockStyle;
import io.github.consistencyplus.consistency_plus.util.LoaderUtils;

import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class NotRegisteredBlockFilter implements BlockFilter {
    protected static final boolean printCollisions = LoaderUtils.isDevEnv();

    public static final BlockFilter INSTANCE = new NotRegisteredBlockFilter();

    @Override
    public boolean shouldCreate(BlockStyle style, BlockShape shape, String familyName, String name) {
        Identifier id = new Identifier("minecraft", name);
        boolean exists = Registries.BLOCK.containsId(id);
        if (printCollisions && exists) {
            ConsistencyPlusMain.LOGGER.info("Block already exists: {} ({}, {})", name, style, shape);
        }
        return !exists;
    }
}

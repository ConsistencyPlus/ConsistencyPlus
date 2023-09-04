package io.github.consistencyplus.consistency_plus.registry.families.filters;

import io.github.consistencyplus.consistency_plus.registry.families.BlockShape;
import io.github.consistencyplus.consistency_plus.registry.families.BlockStyle;

import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public interface BlockFilter {
    boolean shouldCreate(BlockStyle style, BlockShape shape, String familyName, String name);

    static boolean isRegistered(String name) {
        Identifier id = new Identifier("minecraft", name);
        return Registries.BLOCK.containsId(id);
    }
}

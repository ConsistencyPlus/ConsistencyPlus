package io.github.consistencyplus.consistency_plus.registry.families;

import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class NotRegisteredBlockFilter implements BlockFilter {
    public static final BlockFilter INSTANCE = new NotRegisteredBlockFilter();

    @Override
    public boolean shouldCreate(String name) {
        Identifier id = new Identifier("minecraft", name);
        return !Registries.BLOCK.containsId(id);
    }
}

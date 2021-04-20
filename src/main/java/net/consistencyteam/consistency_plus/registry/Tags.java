package net.consistencyteam.consistency_plus.registry;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

// This code is based on code from Draylar's "Tiered" mod, found here: https://github.com/Draylar/tiered/blob/1.16/src/main/java/draylar/tiered/api/TieredItemTags.java
// That code is licensed under MIT.
// Thanks for your work, Draylar!

// Also, code is not being registered/initalized due to the fact that it does not have its usage JUST yet.

public class Tags {
    public static final Tag<Block> GATES = register("gates");

    private static Tag<Block> register(String id) {
        return TagRegistry.block(new Identifier("consistency_plus", id));
    }

    public static void init() {
    }
}

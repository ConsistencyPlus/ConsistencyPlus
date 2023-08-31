package io.github.consistencyplus.consistency_plus.registry;

import io.github.consistencyplus.consistency_plus.items.CPlusItemGroups;
import io.github.consistencyplus.consistency_plus.registry.families.BlockFamily;
import net.minecraft.block.Blocks;

import static io.github.consistencyplus.consistency_plus.registry.families.BlockShape.*;
import static io.github.consistencyplus.consistency_plus.registry.families.BlockStyle.*;

public class CPlusBlockFamilies {
    public static final BlockFamily STONE = BlockFamily.builder("stone")
            .baseSettingsFrom(Blocks.STONE)
            .addKnownVariant(Blocks.COBBLESTONE, COBBLED, CUBE)
            .addKnownVariant(Blocks.COBBLESTONE_SLAB, COBBLED, SLAB)
            .addKnownVariant(Blocks.COBBLESTONE_STAIRS, COBBLED, STAIR)
            .addKnownVariant(Blocks.COBBLESTONE_WALL, COBBLED, WALL)
            .build();
    public static final BlockFamily CALCITE = BlockFamily.builder("calcite")
            .baseSettingsFrom(Blocks.CALCITE)
            .addKnownVariant(Blocks.CALCITE, PLAIN, CUBE)
            .itemGroup(CPlusItemGroups.STONES)
            .build();

    public static void init() {
    }
}

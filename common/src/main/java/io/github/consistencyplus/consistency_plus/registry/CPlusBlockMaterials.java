package io.github.consistencyplus.consistency_plus.registry;

import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.piston.PistonBehavior;

public class CPlusBlockMaterials {
    public static final Material OBSIDIAN = new Material(MapColor.BLACK, false, true, true, true, false, false, PistonBehavior.BLOCK);
    public static final Material GLAZED_TERRACOTTA = new Material(MapColor.WHITE, false, true, true, true, false, false, PistonBehavior.PUSH_ONLY);
}

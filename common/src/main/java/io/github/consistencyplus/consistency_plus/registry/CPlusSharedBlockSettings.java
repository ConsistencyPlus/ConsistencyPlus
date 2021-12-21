package io.github.consistencyplus.consistency_plus.registry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;

public class CPlusSharedBlockSettings {
    // THIS IS NOT A REPLACEMENT FOR `Block.Settings`
    // Rather, this is actually more so like `CPlusItemGroups` but for Block Settings

    public static AbstractBlock.Settings obsidian() {
        return AbstractBlock.Settings.of(CPlusBlockMaterials.OBSIDIAN, MapColor.BLACK).requiresTool().strength(50.0F, 1200.0F);
    }

    public static AbstractBlock.Settings glazedTerracotta(MapColor color) {
        return AbstractBlock.Settings.of(CPlusBlockMaterials.GLAZED_TERRACOTTA, color).requiresTool().strength(1.4F);
    }

    public static AbstractBlock.Settings cryingObsidian() {
        return AbstractBlock.Settings.of(CPlusBlockMaterials.OBSIDIAN, MapColor.BLACK).requiresTool().strength(50.0F, 1200.0F).luminance(state -> 10);
    }
}

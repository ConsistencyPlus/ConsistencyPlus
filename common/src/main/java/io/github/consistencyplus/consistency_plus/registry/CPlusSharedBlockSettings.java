package io.github.consistencyplus.consistency_plus.registry;

import io.github.consistencyplus.consistency_plus.blocks.CopperOxidization;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;

import static net.minecraft.block.Blocks.GLASS;
import static net.minecraft.block.Blocks.TINTED_GLASS;

public class CPlusSharedBlockSettings {
    // THIS IS NOT A REPLACEMENT FOR `Block.Settings`
    // Rather, this is actually more so like `CPlusItemGroups` but for Block Settings

    public static AbstractBlock.Settings stone() {
        return AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F);
    }

    public static AbstractBlock.Settings cobblestone() {
        return AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(2.0F, 6.0F);
    }

    public static AbstractBlock.Settings deepslate() {
        return AbstractBlock.Settings.of(Material.STONE, MapColor.DEEPSLATE_GRAY).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.DEEPSLATE);
    }

    public static AbstractBlock.Settings andesite() {
        return AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(1.5F, 6.0F);
    }

    public static AbstractBlock.Settings diorite() {
        return AbstractBlock.Settings.of(Material.STONE, MapColor.OFF_WHITE).requiresTool().strength(1.5F, 6.0F);
    }

    public static AbstractBlock.Settings granite() {
        return AbstractBlock.Settings.of(Material.STONE, MapColor.DIRT_BROWN).requiresTool().strength(1.5F, 6.0F);
    }

    public static AbstractBlock.Settings calcite() {
        return AbstractBlock.Settings.of(Material.STONE, MapColor.TERRACOTTA_WHITE).sounds(BlockSoundGroup.CALCITE).requiresTool().strength(0.75F);
    }

    public static AbstractBlock.Settings dripstone() {
        return AbstractBlock.Settings.of(Material.STONE, MapColor.TERRACOTTA_BROWN).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).requiresTool().strength(1.5F, 1.0F);
    }

    public static AbstractBlock.Settings tuff() {
        return AbstractBlock.Settings.copy(Blocks.TUFF);
    }

    public static AbstractBlock.Settings soulSandstone() {
        return AbstractBlock.Settings.of(Material.STONE).strength(0.8F);
    }

    public static AbstractBlock.Settings witheredBone() {
        return AbstractBlock.Settings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(2.0F).sounds(CPlusSoundGroups.WITHER_BONES);
    }

    public static AbstractBlock.Settings obsidian() {
        return AbstractBlock.Settings.of(CPlusBlockMaterials.OBSIDIAN, MapColor.BLACK).requiresTool().strength(50.0F, 1200.0F);
    }

    public static AbstractBlock.Settings cryingObsidian() {
        return AbstractBlock.Settings.of(CPlusBlockMaterials.OBSIDIAN, MapColor.BLACK).requiresTool().strength(50.0F, 1200.0F).luminance(state -> 10);
    }

    public static AbstractBlock.Settings glazedTerracotta() {
        return AbstractBlock.Settings.of(CPlusBlockMaterials.GLAZED_TERRACOTTA).requiresTool().strength(1.4F);
    }

    public static AbstractBlock.Settings terracotta() {
        return AbstractBlock.Settings.of(Material.STONE, MapColor.ORANGE).requiresTool().strength(1.25F, 4.2F);
    }

    public static AbstractBlock.Settings concrete() {
        return AbstractBlock.Settings.of(Material.STONE, DyeColor.WHITE).requiresTool().strength(1.8F);
    }

    public static AbstractBlock.Settings glowstone() {
        return AbstractBlock.Settings.of(Material.GLASS).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance((state) ->15).nonOpaque();
    }

    public static AbstractBlock.Settings tintedGlass() {
        return AbstractBlock.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque();
    }

    public static AbstractBlock.Settings warpedWartConstructed() {
        return AbstractBlock.Settings.of(Material.STONE, MapColor.BLUE).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS);
    }

    public static AbstractBlock.Settings copper(CopperOxidization oxidization) {
        return AbstractBlock.Settings.of(Material.METAL, oxidization.getColor()).requiresTool().strength(3.0f, 6.0f).ticksRandomly().sounds(BlockSoundGroup.COPPER);
    }
//AbstractBlock.Settings.of(Material.METAL, oxidization.getColor()).requiresTool().strength(3.0f, 6.0f).ticksRandomly().sounds(BlockSoundGroup.COPPER);

    public static AbstractBlock.Settings misc() {
        return AbstractBlock.Settings.of(Material.STONE).strength(1);
    }
}

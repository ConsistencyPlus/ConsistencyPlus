package io.github.consistencyplus.consistency_plus.registry;

import io.github.consistencyplus.consistency_plus.blocks.CopperOxidization;
import io.github.consistencyplus.consistency_plus.core.entries.v2.RegistryEntryGroup;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class CPlusNewEntries {
    public static final Map<String, Identifier> nameToOverrideIdMap = nameToOverrideID();
    /*public static final RegistryEntryGroup STONE = new StoneRegistryEntryGroup("stone", CPlusSharedBlockSettings.stone());
    public static final RegistryEntryGroup ANDESITE = new ModifierStoneRegistryEntryGroup("andesite", CPlusSharedBlockSettings.andesite());
    public static final RegistryEntryGroup DIORITE = new StoneRegistryEntryGroup("diorite", CPlusSharedBlockSettings.diorite());
    public static final RegistryEntryGroup GRANITE = new StoneRegistryEntryGroup("granite", CPlusSharedBlockSettings.granite());
    public static final RegistryEntryGroup DEEPSLATE = new StoneRegistryEntryGroup("deepslate", CPlusSharedBlockSettings.deepslate());
    public static final RegistryEntryGroup CALCITE = new StoneRegistryEntryGroup("calcite", CPlusSharedBlockSettings.calcite());
    public static final RegistryEntryGroup DRIPSTONE = new StoneRegistryEntryGroup("dripstone", CPlusSharedBlockSettings.dripstone());
    public static final RegistryEntryGroup TUFF = new StoneRegistryEntryGroup("tuff", CPlusSharedBlockSettings.tuff());
    public static final RegistryEntryGroup SANDSTONE = new StoneRegistryEntryGroup("sandstone", AbstractBlock.Settings.copy(Blocks.SANDSTONE));
    public static final RegistryEntryGroup RED_SANDSTONE = new StoneRegistryEntryGroup("red_sandstone", AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE));
    */public static final RegistryEntryGroup SOUL_SANDSTONE = new RegistryEntryGroup("soul_sandstone", new RegistryEntryGroup.RegistryEntrySettings(RegistryEntryGroup.SetCategory.STONE, CPlusSharedBlockSettings.soulSandstone()));
    /*public static final RegistryEntryGroup BLACKSTONE = new StoneRegistryEntryGroup("blackstone", AbstractBlock.Settings.copy(Blocks.BLACKSTONE));
    public static final RegistryEntryGroup QUARTZ = new StoneRegistryEntryGroup("quartz", AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK));
    public static final RegistryEntryGroup BASALT = new StoneRegistryEntryGroup("basalt", AbstractBlock.Settings.copy(Blocks.BASALT));
    public static final RegistryEntryGroup END_STONE = new StoneRegistryEntryGroup("end_stone", AbstractBlock.Settings.copy(Blocks.END_STONE));
    public static final RegistryEntryGroup OBSIDIAN = new StoneRegistryEntryGroup("obsidian", CPlusSharedBlockSettings.obsidian());
    public static final RegistryEntryGroup CRYING_OBSIDIAN = new StoneRegistryEntryGroup("crying_obsidian", CPlusSharedBlockSettings.cryingObsidian());
    public static final RegistryEntryGroup PURPUR = new MiscRegistryEntryGroup("purpur", Block.Settings.copy(Blocks.PURPUR_BLOCK));
    public static final RegistryEntryGroup PRISMARINE = new MiscRegistryEntryGroup("prismarine", Block.Settings.copy(Blocks.PRISMARINE));
    public static final RegistryEntryGroup DARK_PRISMARINE = new MiscRegistryEntryGroup("dark_prismarine", Block.Settings.copy(Blocks.DARK_PRISMARINE));
    public static final RegistryEntryGroup NETHERRACK = new MiscRegistryEntryGroup("netherrack", Block.Settings.copy(Blocks.NETHER_BRICKS));
    public static final RegistryEntryGroup CRIMSON_WART = new MiscRegistryEntryGroup("crimson_wart", AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS));
    public static final RegistryEntryGroup WARPED_WART = new MiscRegistryEntryGroup("warped_wart", CPlusSharedBlockSettings.warpedWartConstructed());
    public static final RegistryEntryGroup BONE = new MiscRegistryEntryGroup("bone", Block.Settings.copy(Blocks.BONE_BLOCK));
    public static final RegistryEntryGroup WITHERED_BONE = new MiscRegistryEntryGroup("withered_bone", CPlusSharedBlockSettings.witheredBone());
    public static final MetalRegistryEntryGroup COPPER = new MetalRegistryEntryGroup("copper", CPlusSharedBlockSettings.copper(CopperOxidization.BASE));
    public static final DyedRegistryEntryGroup TERRACOTTA = new DyedRegistryEntryGroup("terracotta", CPlusSharedBlockSettings.terracotta(), true);
    public static final DyedRegistryEntryGroup CONCRETE = new DyedRegistryEntryGroup("concrete", CPlusSharedBlockSettings.concrete(), false);
    public static final DyedRegistryEntryGroup GLOWSTONE = new DyedRegistryEntryGroup("glowstone", CPlusSharedBlockSettings.glowstone(), true);
    public static final DyedRegistryEntryGroup TINTED_GLASS = new TintedGlassRegistryEntryGroup("tinted_glass", CPlusSharedBlockSettings.tintedGlass(), false);
    public static final DyedRegistryEntryGroup GLAZED_TERRACOTTA = new PolishedGlazedTerracottaRegistryEntryGroup("glazed_terracotta", CPlusSharedBlockSettings.glazedTerracotta());
    public static final DyedIceRegistryEntryGroup DYED_ICE = new DyedIceRegistryEntryGroup("ice", AbstractBlock.Settings.copy(Blocks.BLUE_ICE));

    public static final RegistryEntryGroup ICE = new IceRegistryEntryGroup("ice", AbstractBlock.Settings.copy(Blocks.ICE));
    public static final RegistryEntryGroup PACKED_ICE = new MiscRegistryEntryGroup("packed_ice", AbstractBlock.Settings.copy(Blocks.PACKED_ICE));
    public static final RegistryEntryGroup BLUE_ICE = new MiscRegistryEntryGroup("blue_ice", AbstractBlock.Settings.copy(Blocks.BLUE_ICE));
    public static final RegistryEntryGroup CLAY = new MiscRegistryEntryGroup("clay", AbstractBlock.Settings.copy(Blocks.CLAY));
    public static final RegistryEntryGroup SNOW = new MiscRegistryEntryGroup("snow", AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK));
    public static final RegistryEntryGroup MUD = new MiscRegistryEntryGroup("mud", AbstractBlock.Settings.copy(Blocks.MUD));
    public static final RegistryEntryGroup PACKED_MUD = new MiscRegistryEntryGroup("packed_mud", AbstractBlock.Settings.copy(Blocks.PACKED_MUD));*/

    public static Map<String, Identifier> nameToOverrideID() {
        Map<String, Identifier> overrides = new HashMap<>();
        overrides.put("chiseled_stone", new Identifier("minecraft","chiseled_stone_bricks"));
        overrides.put("carved_netherrack", new Identifier("minecraft","chiseled_nether_bricks"));
        overrides.put("warped_wart_block", new Identifier("minecraft","warped_wart_block"));
        overrides.put("crimson_wart_block", new Identifier("minecraft","crimson_wart_block"));
        overrides.put("crimson_wart_bricks", new Identifier("minecraft","red_nether_bricks"));
        overrides.put("crimson_wart_brick_slab", new Identifier("minecraft","red_nether_brick_slab"));
        overrides.put("crimson_wart_brick_stairs", new Identifier("minecraft","red_nether_brick_stairs"));
        overrides.put("crimson_wart_brick_wall", new Identifier("minecraft","red_nether_brick_wall"));
        overrides.put("blackstone_bricks", new Identifier("minecraft","polished_blackstone_bricks"));
        overrides.put("blackstone_brick_slab", new Identifier("minecraft","polished_blackstone_brick_slab"));
        overrides.put("blackstone_brick_stairs", new Identifier("minecraft","polished_blackstone_brick_stairs"));
        overrides.put("blackstone_brick_wall", new Identifier("minecraft","polished_blackstone_brick_wall"));
        overrides.put("carved_blackstone", new Identifier("minecraft","chiseled_polished_blackstone"));
        overrides.put("snow_block", new Identifier("minecraft","snow_block"));
        overrides.put("dripstone_block", new Identifier("minecraft","dripstone_block"));
        overrides.put("quartz_block", new Identifier("minecraft","quartz_block"));
        overrides.put("chiseled_quartz", new Identifier("minecraft","chiseled_quartz_block"));
        overrides.put("bone_block", new Identifier("minecraft","bone_block"));
        overrides.put("terracotta_bricks", new Identifier("minecraft","bricks"));
        overrides.put("terracotta_brick_slab", new Identifier("minecraft","brick_slab"));
        overrides.put("terracotta_brick_stairs", new Identifier("minecraft","brick_stairs"));
        overrides.put("terracotta_brick_wall", new Identifier("minecraft","brick_wall"));
        overrides.put("terracotta_brick_gate", new Identifier("consistency_plus", "brick_gate"));
        overrides.put("purpur", new Identifier("consistency_plus", "purpur_block"));
        overrides.put("purpur_tiles", new Identifier("minecraft","purpur_block"));
        overrides.put("purpur_tile_slab", new Identifier("minecraft","purpur_slab"));
        overrides.put("purpur_tile_stairs", new Identifier("minecraft","purpur_stairs"));
        overrides.put("carved_sandstone", new Identifier("minecraft","chiseled_sandstone"));
        overrides.put("carved_red_sandstone", new Identifier("minecraft","chiseled_red_sandstone"));
        overrides.put("basalt_pillar", new Identifier("minecraft","polished_basalt"));
        return overrides;
    }

    public static Map<Pair<String, String>, Pair<String, String>> patternMatchSwap() {
        Map<Pair<String, String>, Pair<String, String>> overrides = new HashMap<>();
        overrides.put(new Pair<>("consistency_plus", "crimson_wart_brick"), new Pair<>("minecraft", "red_nether_brick"));
        overrides.put(new Pair<>("consistency_plus", "blackstone_bricks"), new Pair<>("minecraft", "polished_blackstone_bricks"));
        //overrides.put(new Pair<>("consistency_plus", "copper_tile_slab"), new Pair<>("minecraft", "cut_copper_slab"));
        //overrides.put(new Pair<>("consistency_plus", "copper_tile_stairs"), new Pair<>("minecraft", "cut_copper_stairs"));
        return overrides;
    }

    public static void init() {}
}

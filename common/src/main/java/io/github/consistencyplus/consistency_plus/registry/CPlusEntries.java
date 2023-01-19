package io.github.consistencyplus.consistency_plus.registry;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.CopperOxidization;
import io.github.consistencyplus.consistency_plus.core.entries.block.*;
import io.github.consistencyplus.consistency_plus.core.entries.block.deprecated.DyedIceRegistryEntryGroup;
import io.github.consistencyplus.consistency_plus.core.entries.items.AbstractItemRegistryEntryGroup;
import io.github.consistencyplus.consistency_plus.core.entries.items.DyedItemRegistryEntryGroup;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.*;
public class CPlusEntries {
    public static final List<String> blacklistedIDs = createBlacklist();
    public static final List<String> whitelistedIDs = createWhitelist();
    public static final List<String> cobblelessMaterials = createCobbleless();
    public static final List<String> baseOnlyIDs = createBaseOnly();
    public static final Map<String, String> overrideMap = createOverrideMap();

    public static final DyedItemRegistryEntryGroup DYED_BUNDLE = new DyedItemRegistryEntryGroup("dyed_bundle", new Item.Settings().maxCount(1));
    public static final RegistryEntryGroup STONE = new StoneRegistryEntryGroup("stone", CPlusSharedBlockSettings.stone());
    public static final RegistryEntryGroup ANDESITE = new ModifierStoneRegistryEntryGroup("andesite", CPlusSharedBlockSettings.andesite());
    public static final RegistryEntryGroup DIORITE = new StoneRegistryEntryGroup("diorite", CPlusSharedBlockSettings.diorite());
    public static final RegistryEntryGroup GRANITE = new StoneRegistryEntryGroup("granite", CPlusSharedBlockSettings.granite());
    public static final RegistryEntryGroup DEEPSLATE = new StoneRegistryEntryGroup("deepslate", CPlusSharedBlockSettings.deepslate());
    public static final RegistryEntryGroup CALCITE = new StoneRegistryEntryGroup("calcite", CPlusSharedBlockSettings.calcite());
    public static final RegistryEntryGroup DRIPSTONE = new StoneRegistryEntryGroup("dripstone", CPlusSharedBlockSettings.dripstone());
    public static final RegistryEntryGroup TUFF = new StoneRegistryEntryGroup("tuff", CPlusSharedBlockSettings.tuff());
    public static final RegistryEntryGroup SANDSTONE = new StoneRegistryEntryGroup("sandstone", AbstractBlock.Settings.copy(Blocks.SANDSTONE));
    public static final RegistryEntryGroup RED_SANDSTONE = new StoneRegistryEntryGroup("red_sandstone", AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE));
    public static final RegistryEntryGroup SOUL_SANDSTONE = new StoneRegistryEntryGroup("soul_sandstone", CPlusSharedBlockSettings.soulSandstone());
    public static final RegistryEntryGroup BLACKSTONE = new StoneRegistryEntryGroup("blackstone", AbstractBlock.Settings.copy(Blocks.BLACKSTONE));
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
    public static final RegistryEntryGroup PACKED_MUD = new MiscRegistryEntryGroup("packed_mud", AbstractBlock.Settings.copy(Blocks.PACKED_MUD));


    public static boolean checkMinecraft(String id) {
        Identifier MCID = new Identifier("minecraft", id);
        if (Registry.BLOCK.getOrEmpty(MCID).isPresent() || Registry.ITEM.getOrEmpty(MCID).isPresent()) {
            return !whitelistedIDs.contains(id);
        } else return false;
    }

    public static List<String> createBlacklist() {
        List<String> blacklist = new ArrayList<>();
        blacklist.add("carved_netherrack");
        blacklist.add("dripstone");
        blacklist.add("bone");
        blacklist.add("terracotta_bricks");
        blacklist.add("terracotta_brick_slab");
        blacklist.add("terracotta_brick_stairs");
        blacklist.add("terracotta_brick_wall");
        blacklist.add("warped_wart");
        blacklist.add("purpur_tiles");
        blacklist.add("purpur_tile_slab");
        blacklist.add("purpur_tile_stairs");
        blacklist.add("carved_sandstone");
        blacklist.add("carved_red_sandstone");
        blacklist.add("quartz");
        blacklist.add("chiseled_quartz");
        blacklist.add("basalt_pillar");
        blacklist.add("netherrack_bricks");
        blacklist.add("netherrack_brick_slab");
        blacklist.add("netherrack_brick_stairs");
        blacklist.add("netherrack_brick_wall");
        blacklist.add("netherrack_brick_gate");
        blacklist.add("crimson_wart");
        blacklist.add("crimson_wart_block");
        blacklist.add("crimson_wart_bricks");
        blacklist.add("crimson_wart_brick_slab");
        blacklist.add("crimson_wart_brick_stairs");
        blacklist.add("crimson_wart_brick_wall");
        blacklist.add("cobbled_stone");
        blacklist.add("cobbled_stone_slab");
        blacklist.add("cobbled_stone_stairs");
        blacklist.add("cobbled_stone_wall");
        blacklist.add("chiseled_stone");
        blacklist.add("blackstone_bricks");
        blacklist.add("blackstone_brick_slab");
        blacklist.add("blackstone_brick_stairs");
        blacklist.add("blackstone_brick_wall");
        blacklist.add("packed_mud_bricks");
        blacklist.add("packed_mud_brick_slab");
        blacklist.add("packed_mud_brick_stairs");
        blacklist.add("packed_mud_brick_wall");
        blacklist.add("carved_blackstone");
        blacklist.add("terracotta_brick");
        blacklist.add("glowstone_brick");
        blacklist.add("netherrack_brick");
        blacklist.add("prismarine_brick");
        blacklist.add("snow");
        return blacklist;
    }

    public static List<String> createWhitelist() {
        List<String> whitelist = new ArrayList<>();
        whitelist.add("purpur_block");
        whitelist.add("purpur_slab");
        whitelist.add("purpur_stairs");
        whitelist.add("chiseled_sandstone");
        whitelist.add("chiseled_red_sandstone");
        whitelist.add("polished_basalt");
        whitelist.add("mud_bricks");
        whitelist.add("mud_brick_slab");
        whitelist.add("mud_brick_stairs");
        whitelist.add("mud_brick_wall");
        for (CopperOxidization oxidization : CopperOxidization.values()) {
            whitelist.add(oxidization.addOxidization("cut_copper"));
            whitelist.add(oxidization.addOxidization("cut_copper_slab"));
            whitelist.add(oxidization.addOxidization("cut_copper_stairs"));
            whitelist.add("waxed_" + oxidization.addOxidization("cut_copper"));
            whitelist.add("waxed_" + oxidization.addOxidization("cut_copper_slab"));
            whitelist.add("waxed_" + oxidization.addOxidization("cut_copper_stairs"));
        }
        return whitelist;
    }

    public static List<String> createCobbleless() {
        List<String> cobbleless = new ArrayList<>();
        cobbleless.add("clay");
        cobbleless.add("snow");
        cobbleless.add("ice");
        cobbleless.add("packed_ice");
        cobbleless.add("blue_ice");
        cobbleless.add("prismarine");
        cobbleless.add("dark_prismarine");
        cobbleless.add("bone");
        cobbleless.add("withered_bone");
        cobbleless.add("purpur");
        cobbleless.add("obsidian");
        cobbleless.add("crying_obsidian");
        cobbleless.add("crimson_wart");
        cobbleless.add("warped_wart");
        cobbleless.add("quartz");
        cobbleless.add("concrete");
        cobbleless.add("copper");
        cobbleless.add("mud");
        cobbleless.add("packed_mud");
        return cobbleless;
    }

    public static List<String> createBaseOnly() {
        List<String> baseOnly = new ArrayList<>();
        baseOnly.add("tinted_glass");
        baseOnly.add("glowstone");
        return baseOnly;
    }

    public static Map<String, String> createOverrideMap() {
        Map<String, String> overrides = new HashMap<>();
        overrides.put("withered_bone", "withered_bone_block");
        overrides.put("terracotta_brick_gate", "brick_gate");
        overrides.put("purpur", "purpur_block");
        overrides.put("cobbled_stone_gate", "cobblestone_gate");
        overrides.put("quartz", "quartz_block");
        overrides.put("bone", "bone_block");
        overrides.put("warped_wart", "warped_wart_block");
        overrides.put("crimson_wart", "crimson_wart_block");
        overrides.put("chiseled_quartz", "chiseled_quartz_block");
        return overrides;
    }

    public static MapColor toTerracottaMapColor(DyeColor dyeColor) {
        return switch (dyeColor) {
            case RED -> MapColor.TERRACOTTA_RED;
            case ORANGE -> MapColor.TERRACOTTA_ORANGE;
            case YELLOW -> MapColor.TERRACOTTA_YELLOW;
            case LIME -> MapColor.TERRACOTTA_LIME;
            case GREEN -> MapColor.TERRACOTTA_GREEN;
            case BLUE -> MapColor.TERRACOTTA_BLUE;
            case CYAN -> MapColor.TERRACOTTA_CYAN;
            case LIGHT_BLUE -> MapColor.TERRACOTTA_LIGHT_BLUE;
            case PURPLE -> MapColor.TERRACOTTA_PURPLE;
            case MAGENTA -> MapColor.TERRACOTTA_MAGENTA;
            case PINK -> MapColor.TERRACOTTA_PINK;
            case WHITE -> MapColor.TERRACOTTA_WHITE;
            case LIGHT_GRAY -> MapColor.TERRACOTTA_LIGHT_GRAY;
            case GRAY -> MapColor.TERRACOTTA_GRAY;
            case BLACK -> MapColor.TERRACOTTA_BLACK;
            case BROWN -> MapColor.TERRACOTTA_BROWN;
        };
    }

    public static void init() {
    }
}

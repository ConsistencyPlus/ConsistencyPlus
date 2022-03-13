package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.core.entries.block.*;
import io.github.consistencyplus.consistency_plus.core.entries.block.deprecated.DyedIceRegistryEntry;
import io.github.consistencyplus.consistency_plus.core.entries.items.AbstractItemRegistryEntry;
import io.github.consistencyplus.consistency_plus.core.entries.items.DyedItemRegistryEntry;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusFenceGateBlock;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusStairBlock;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.*;
public class CPlusEnhancedRegistry {
    public static final List<String> blacklistedIDs = createBlacklist();
    public static final List<String> whitelistedIDs = createWhitelist();
    public static final List<String> cobblelessMaterials = createCobbleless();
    public static final List<String> baseOnlyIDs = createBaseOnly();
    public static final Map<String, String> overrideMap = createOverrideMap();

    public static final AbstractItemRegistryEntry TERRACOTTA_BRICK = new DyedItemRegistryEntry("terracotta_brick", new Item.Settings().group(ItemGroup.MISC));
    public static final DyedItemRegistryEntry DYED_BUNDLE = new DyedItemRegistryEntry("dyed_bundle", new Item.Settings().maxCount(1));
    public static final AbstractRegistryEntry STONE = new StoneRegistryEntry("stone", CPlusSharedBlockSettings.stone());
    public static final AbstractRegistryEntry ANDESITE = new ModifierStoneRegistryEntry("andesite", CPlusSharedBlockSettings.andesite());
    public static final AbstractRegistryEntry DIORITE = new StoneRegistryEntry("diorite", CPlusSharedBlockSettings.diorite());
    public static final AbstractRegistryEntry GRANITE = new StoneRegistryEntry("granite", CPlusSharedBlockSettings.granite());
    public static final AbstractRegistryEntry DEEPSLATE = new StoneRegistryEntry("deepslate", CPlusSharedBlockSettings.deepslate());
    public static final AbstractRegistryEntry CALCITE = new StoneRegistryEntry("calcite", CPlusSharedBlockSettings.calcite());
    public static final AbstractRegistryEntry DRIPSTONE = new StoneRegistryEntry("dripstone", CPlusSharedBlockSettings.dripstone());
    public static final AbstractRegistryEntry TUFF = new StoneRegistryEntry("tuff", CPlusSharedBlockSettings.tuff());
    public static final AbstractRegistryEntry SANDSTONE = new StoneRegistryEntry("sandstone", AbstractBlock.Settings.copy(Blocks.SANDSTONE));
    public static final AbstractRegistryEntry RED_SANDSTONE = new StoneRegistryEntry("red_sandstone", AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE));
    public static final AbstractRegistryEntry SOUL_SANDSTONE = new StoneRegistryEntry("soul_sandstone", CPlusSharedBlockSettings.soulSandstone());
    public static final AbstractRegistryEntry BLACKSTONE = new StoneRegistryEntry("blackstone", AbstractBlock.Settings.copy(Blocks.BLACKSTONE));
    public static final AbstractRegistryEntry QUARTZ = new StoneRegistryEntry("quartz", AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK));
    public static final AbstractRegistryEntry BASALT = new StoneRegistryEntry("basalt", AbstractBlock.Settings.copy(Blocks.BASALT));
    public static final AbstractRegistryEntry END_STONE = new StoneRegistryEntry("end_stone", AbstractBlock.Settings.copy(Blocks.END_STONE));
    public static final AbstractRegistryEntry OBSIDIAN = new StoneRegistryEntry("obsidian", CPlusSharedBlockSettings.obsidian());
    public static final AbstractRegistryEntry CRYING_OBSIDIAN = new StoneRegistryEntry("crying_obsidian", CPlusSharedBlockSettings.cryingObsidian());
    public static final AbstractRegistryEntry PURPUR = new MiscRegistryEntry("purpur", Block.Settings.copy(Blocks.PURPUR_BLOCK));
    public static final AbstractRegistryEntry PRISMARINE = new MiscRegistryEntry("prismarine", Block.Settings.copy(Blocks.PRISMARINE));
    public static final AbstractRegistryEntry DARK_PRISMARINE = new MiscRegistryEntry("dark_prismarine", Block.Settings.copy(Blocks.DARK_PRISMARINE));
    public static final AbstractRegistryEntry NETHERRACK = new MiscRegistryEntry("netherrack", Block.Settings.copy(Blocks.NETHER_BRICKS));
    public static final AbstractRegistryEntry CRIMSON_WART = new MiscRegistryEntry("crimson_wart", AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS));
    public static final AbstractRegistryEntry WARPED_WART = new MiscRegistryEntry("warped_wart", CPlusSharedBlockSettings.warpedWartConstructed());
    public static final AbstractRegistryEntry BONE = new MiscRegistryEntry("bone", Block.Settings.copy(Blocks.BONE_BLOCK));
    public static final AbstractRegistryEntry WITHERED_BONE = new MiscRegistryEntry("withered_bone", CPlusSharedBlockSettings.witheredBone());
    public static final AbstractRegistryEntry TERRACOTTA = new DyedRegistryEntry("terracotta", CPlusSharedBlockSettings.terracotta(MapColor.ORANGE), true);
    public static final AbstractRegistryEntry CONCRETE = new DyedRegistryEntry("concrete", CPlusSharedBlockSettings.concrete(), false);
    public static final AbstractRegistryEntry GLOWSTONE = new DyedRegistryEntry("glowstone", CPlusSharedBlockSettings.glowstone(MapColor.GOLD), true);
    public static final AbstractRegistryEntry TINTED_GLASS = new DyedRegistryEntry("tinted_glass", CPlusSharedBlockSettings.tintedGlass(), false);
    public static final AbstractRegistryEntry GLAZED_TERRACOTTA = new PolishedGlazedTerracottaRegistryEntry("glazed_terracotta", CPlusSharedBlockSettings.glazedTerracotta(MapColor.WHITE));
    // Copper stuff would be here
    public static final AbstractRegistryEntry ICE = new DyedIceRegistryEntry("ice", AbstractBlock.Settings.copy(Blocks.BLUE_ICE));


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
        blacklist.add("carved_blackstone");
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
        return whitelist;
    }

    public static List<String> createCobbleless() {
        List<String> cobbleless = new ArrayList<>();
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
        if (ConsistencyPlusMain.DEVENV) ConsistencyPlusMain.LOGGER.info("CPlusEnhancedRegistry - initialization point");
    }
}

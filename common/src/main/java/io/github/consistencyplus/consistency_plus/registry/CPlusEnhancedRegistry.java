package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.BlockVariations;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusFenceGateBlock;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusStairBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.registry.Registry;

import java.util.*;

import static net.minecraft.block.Blocks.END_STONE;

public class CPlusEnhancedRegistry {
    public static final List<String> blacklistedIDs = createBlacklist();
    public static final List<String> whitelistedIDs = createWhitelist();
    public static final List<String> cobblelessMaterials = createCobbleless();
    public static final List<String> baseOnlyIDs = createBaseOnly();
    public static final List<String> tintedGlassIDs = createTintedGlass();
    public static final Map<String, String> overrideMap = createOverrideMap();

    public static final String STONE = registerFromStoneMaterial("stone", AbstractBlock.Settings.copy(Blocks.STONE));
    public static final String ANDESITE = registerFromStoneMaterial("andesite", AbstractBlock.Settings.copy(Blocks.ANDESITE));
    public static final String DIORITE = registerFromStoneMaterial("diorite", AbstractBlock.Settings.copy(Blocks.DIORITE));
    public static final String GRANITE = registerFromStoneMaterial("granite", AbstractBlock.Settings.copy(Blocks.GRANITE));
    public static final String DEEPSLATE = registerFromStoneMaterial("deepslate", AbstractBlock.Settings.copy(Blocks.DEEPSLATE));
    public static final String CALCITE = registerFromStoneMaterial("calcite", CPlusSharedBlockSettings.calcite());
    public static final String DRIPSTONE = registerFromStoneMaterial("dripstone", CPlusSharedBlockSettings.dripstone());
    public static final String TUFF = registerFromStoneMaterial("tuff", CPlusSharedBlockSettings.tuff());
    public static final String SANDSTONE = registerFromStoneMaterial("sandstone", AbstractBlock.Settings.copy(Blocks.SANDSTONE));
    public static final String RED_SANDSTONE = registerFromStoneMaterial("red_sandstone", AbstractBlock.Settings.copy(Blocks.RED_SANDSTONE));
    public static final String SOUL_SANDSTONE = registerFromStoneMaterial("soul_sandstone", CPlusSharedBlockSettings.soulSandstone());
    public static final String BLACKSTONE = registerFromStoneMaterial("blackstone", AbstractBlock.Settings.copy(Blocks.BLACKSTONE));
    public static final String QUARTZ = registerFromStoneMaterial("quartz", AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK));
    public static final String BASALT = registerFromStoneMaterial("basalt", AbstractBlock.Settings.copy(Blocks.BASALT));
    public static final String END_STONE = registerFromStoneMaterial("end_stone", AbstractBlock.Settings.copy(Blocks.END_STONE));
    public static final String OBSIDIAN = registerFromStoneMaterial("obsidian", CPlusSharedBlockSettings.obsidian());
    public static final String CRYING_OBSIDIAN = registerFromStoneMaterial("crying_obsidian", CPlusSharedBlockSettings.cryingObsidian());
    public static final String PURPUR = registerFromMiscMaterial("purpur", Block.Settings.copy(Blocks.PURPUR_BLOCK));
    public static final String PRISMARINE = registerFromMiscMaterial("prismarine", Block.Settings.copy(Blocks.PRISMARINE));
    public static final String DARK_PRISMARINE = registerFromMiscMaterial("dark_prismarine", Block.Settings.copy(Blocks.DARK_PRISMARINE));
    public static final String NETHERRACK = registerFromMiscMaterial("netherrack", Block.Settings.copy(Blocks.NETHER_BRICKS));
    public static final String CRIMSON_WART = registerFromMiscMaterial("crimson_wart", AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS));
    public static final String WARPED_WART = registerFromMiscMaterial("warped_wart", CPlusSharedBlockSettings.warpedWartConstructed());
    public static final String BONE = registerFromMiscMaterial("bone", Block.Settings.copy(Blocks.BONE_BLOCK));
    public static final String WITHERED_BONE = registerFromMiscMaterial("withered_bone", CPlusSharedBlockSettings.witheredBone());
    public static final String TERRACOTTA = registerFromDyedMaterial("terracotta", CPlusSharedBlockSettings.terracotta(MapColor.ORANGE), true, true);
    public static final String CONCRETE = registerFromDyedMaterial("concrete", CPlusSharedBlockSettings.concrete(), false, false);
    public static final String GLOWSTONE = registerFromDyedMaterial("glowstone", CPlusSharedBlockSettings.glowstone(MapColor.GOLD), true, false);
    public static final String TINTED_GLASS = registerFromDyedMaterial("tinted_glass", CPlusSharedBlockSettings.tintedGlass(), false, false);

    public static boolean checkMinecraft(String id) {
        Identifier MCID = new Identifier("minecraft", id);
        if (Registry.BLOCK.getOrEmpty(MCID).isPresent() || Registry.ITEM.getOrEmpty(MCID).isPresent()) {
            return !whitelistedIDs.contains(id);
        } else return false;
    }

    public static Block getBlock(String material, BlockVariations variations, BlockTypes type) {
        String typedMaterial = type.addType(material);
        String id = variations.addVariations(typedMaterial, type);
        overrideMap.getOrDefault(id, id);
        return Registry.BLOCK.get(ConsistencyPlusMain.id(id));
    }

    public static Block getDyedBlock(String material, BlockVariations variations, BlockTypes type, DyeColor color) {
        String coloredMaterial = color.toString() + "_" + material;
        return getBlock(coloredMaterial, variations, type);
    }

    public static Item getItem(String material, BlockVariations variations, BlockTypes type) {
        String typedMaterial = type.addType(material);
        String id = variations.addVariations(typedMaterial, type);
        overrideMap.getOrDefault(id, id);
        return Registry.ITEM.get(ConsistencyPlusMain.id(id));
    }

    public static String registerFromStoneMaterial(String id, AbstractBlock.Settings blockSettings) {
        return registerFromMaterial(id, blockSettings, CPlusItemGroups.consistencyPlusStoneItemSettings());
    }

    public static String registerFromMiscMaterial(String id, AbstractBlock.Settings blockSettings) {
        return registerFromMaterial(id, blockSettings, CPlusItemGroups.consistencyPlusMiscItemSettings());
    }

    public static String registerFromDyedMaterial(String id, AbstractBlock.Settings blockSettings, boolean withBase, boolean terracotta) {
        if (withBase) registerFromMaterial(id, blockSettings, CPlusItemGroups.consistencyPlusDyeableItemSettings());
        for (DyeColor colors : DyeColor.values()) {
            blockSettings = (terracotta) ? blockSettings.mapColor(toTerracottaMapColor(colors)) : blockSettings.mapColor(colors.getMapColor());
            registerFromMaterial(colors + "_" + id, blockSettings, CPlusItemGroups.consistencyPlusDyeableItemSettings());
        }

        return id;
    }

    public static String registerFromMaterial(String material, AbstractBlock.Settings blockSettings, Item.Settings itemSettings) {
        for (BlockTypes type : BlockTypes.values()) {
            for (BlockVariations variation : BlockVariations.values()) {
                String id = variation.addVariations(type.addType(material), type);
                if (!type.equals(BlockTypes.BASE) && baseOnlyIDs.contains(material)) break;
                if (type.equals(BlockTypes.COBBLED) && (cobblelessMaterials.contains(material))) break;
                if (!type.equals(BlockTypes.BASE) && !variation.withTypes()) break;
                if (!variation.equals(BlockVariations.BLOCK) && tintedGlassIDs.contains(material)) break;
                if (!variation.withTypes() && baseOnlyIDs.contains(material)) break;
                construct(id, variation, material, blockSettings, itemSettings, type);
            }
        }
        return material;
    }

    public static void construct(String id, BlockVariations variation, String material, Block.Settings blockSettings, Item.Settings itemSettings, BlockTypes type) {
        id = overrideMap.getOrDefault(id, id);
        if (checkMinecraft(id)) return;
        if (blacklistedIDs.contains(id)) return;
        itemRegistration(id, new BlockItem(blockRegistration(id, variation, material, blockSettings, type), itemSettings));
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
        for (DyeColor colors : DyeColor.values()) cobbleless.add(colors.toString() + "_concrete");
        return cobbleless;
    }

    public static List<String> createBaseOnly() {
        List<String> baseOnly = new ArrayList<>();
        for (DyeColor colors : DyeColor.values()) baseOnly.add(colors.toString() + "_glowstone");
        baseOnly.add("glowstone");
        for (DyeColor colors : DyeColor.values()) baseOnly.add(colors.toString() + "_tinted_glass");
        return baseOnly;
    }

    public static List<String> createTintedGlass() {
        List<String> tintedGlass = new ArrayList<>();
        for (DyeColor colors : DyeColor.values()) tintedGlass.add(colors.toString() + "_tinted_glass");
        return tintedGlass;
    }

    public static Map<String, String> createOverrideMap() {
        Map<String, String> overrides = new HashMap<>();
        overrides.put("withered_bone", "withered_bone_block");
        overrides.put("terracotta_brick_gate", "brick_gate");
        overrides.put("purpur", "purpur_block");
        overrides.put("cobbled_stone_gate", "cobblestone_gate");
        return overrides;
    }


    public static Item itemRegistration(String name, Item item) {
        RegistrySupplier<Item> itemSupplied = CPlusItems.ITEMS.register(name, () -> item);
        return item;
    }

    public static Block blockRegistration(String name, BlockVariations blockVariations, String material, AbstractBlock.Settings blockSettings, BlockTypes type) {
        Block block;
        if (name.equals("withered_bone_block")) block = new PillarBlock(blockSettings);
        else switch (blockVariations) {
            case SLAB -> block = new SlabBlock(blockSettings);
            case STAIRS -> block = new CPlusStairBlock(getBlock(material, BlockVariations.BLOCK, type).getDefaultState(), blockSettings);
            case WALL -> block = new WallBlock(blockSettings);
            case GATE -> block = new CPlusFenceGateBlock(blockSettings);
            case PILLAR -> block = new PillarBlock(blockSettings);
            default -> block = new Block(blockSettings);
        }

        RegistrySupplier<Block> blockSupplied = CPlusBlocks.BLOCKS.register(name, () -> block);
        return block;
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

package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockColors;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.BlockVariations;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusFenceGateBlock;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusStairBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.*;

import static net.minecraft.block.Blocks.END_STONE;

public class CPlusEnhancedRegistry {
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
    public static final String NETHERRACK = registerFromMiscMaterial("netherrack", Block.Settings.copy(Blocks.NETHERRACK));
    public static final String CRIMSON_WART = registerFromMiscMaterial("crimson_wart", AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK));
    public static final String WARPED_WART = registerFromMiscMaterial("warped_wart", Block.Settings.copy(Blocks.WARPED_WART_BLOCK));
    public static final String BONE = registerFromMiscMaterial("bone", Block.Settings.copy(Blocks.BONE_BLOCK));
    public static final String WITHERED_BONE = registerFromMiscMaterial("withered_bone", CPlusSharedBlockSettings.witheredBone());
    public static final String TERRACOTTA = registerFromDyedMaterial("terracotta", CPlusSharedBlockSettings.terracotta(MapColor.ORANGE), true, true);
    public static final String CONCRETE = registerFromDyedMaterial("concrete", CPlusSharedBlockSettings.concrete(), false, false);
    public static final String GLOWSTONE = registerFromDyedMaterial("glowstone", CPlusSharedBlockSettings.glowstone(MapColor.GOLD), true, false);
    public static final String TINTED_GLASS = registerFromDyedMaterial("tinted_glass", CPlusSharedBlockSettings.tintedGlass(), false, false);


    public static ArrayList<String> blacklist() {
        ArrayList<String> blacklistedIDs = new ArrayList<>();
        blacklistedIDs.add("carved_netherrack");
        blacklistedIDs.add("dripstone");
        blacklistedIDs.add("bone");
        blacklistedIDs.add("terracotta_bricks");
        blacklistedIDs.add("terracotta_brick_slab");
        blacklistedIDs.add("terracotta_brick_stairs");
        blacklistedIDs.add("terracotta_brick_wall");
        blacklistedIDs.add("warped_wart");
        blacklistedIDs.add("purpur_tiles");
        blacklistedIDs.add("purpur_tile_slab");
        blacklistedIDs.add("purpur_tile_stairs");
        blacklistedIDs.add("carved_sandstone");
        blacklistedIDs.add("carved_red_sandstone");
        blacklistedIDs.add("quartz");
        blacklistedIDs.add("chiseled_quartz");
        blacklistedIDs.add("basalt_pillar");
        blacklistedIDs.add("netherrack_bricks");
        blacklistedIDs.add("netherrack_brick_slab");
        blacklistedIDs.add("netherrack_brick_stairs");
        blacklistedIDs.add("netherrack_brick_wall");
        blacklistedIDs.add("netherrack_brick_gate");
        blacklistedIDs.add("crimson_wart");
        blacklistedIDs.add("crimson_wart_bricks");
        blacklistedIDs.add("crimson_wart_brick_slab");
        blacklistedIDs.add("crimson_wart_brick_stairs");
        blacklistedIDs.add("crimson_wart_brick_wall");
        blacklistedIDs.add("cobbled_stone");
        blacklistedIDs.add("cobbled_stone_slab");
        blacklistedIDs.add("cobbled_stone_stairs");
        blacklistedIDs.add("cobbled_stone_wall");
        blacklistedIDs.add("chiseled_stone");
        blacklistedIDs.add("blackstone_bricks");
        blacklistedIDs.add("blackstone_brick_slab");
        blacklistedIDs.add("blackstone_brick_stairs");
        blacklistedIDs.add("blackstone_brick_wall");
        blacklistedIDs.add("carved_blackstone");

        return blacklistedIDs;
    }

    public static ArrayList<String> cobbleless() {
        ArrayList<String> blacklistedIDs = new ArrayList<>();
        blacklistedIDs.add("prismarine");
        blacklistedIDs.add("dark_prismarine");
        blacklistedIDs.add("bone");
        blacklistedIDs.add("withered_bone");
        blacklistedIDs.add("purpur");
        blacklistedIDs.add("obsidian");
        blacklistedIDs.add("crying_obsidian");
        blacklistedIDs.add("crimson_wart");
        blacklistedIDs.add("warped_wart");
        blacklistedIDs.add("quartz");
        for (BlockColors colors : BlockColors.values()) blacklistedIDs.add(colors.toString() + "_concrete");
        return blacklistedIDs;
    }

    public static ArrayList<String> baseOnly() {
        ArrayList<String> whitelistedIDs = new ArrayList<>();
        for (BlockColors colors : BlockColors.values()) whitelistedIDs.add(colors.toString() + "_glowstone");
        whitelistedIDs.add("glowstone");
        for (BlockColors colors : BlockColors.values()) whitelistedIDs.add(colors.toString() + "_tinted_glass");
        return whitelistedIDs;
    }

    public static ArrayList<String> tintedGlassSet() {
        ArrayList<String> whitelistedIDs = new ArrayList<>();
        for (BlockColors colors : BlockColors.values()) whitelistedIDs.add(colors.toString() + "_tinted_glass");
        return whitelistedIDs;
    }

    public static Map<String, String> overrideMap() {
        Map<String, String> overrideMap = new HashMap<>();
        overrideMap.put("withered_bone", "withered_bone_block");
        overrideMap.put("terracotta_brick_gate", "brick_gate");
        overrideMap.put("purpur", "purpur_block");
        overrideMap.put("cobbled_stone_gate", "cobblestone_gate");
        return overrideMap;
    }

    public static boolean checkMinecraft(String id) {
        Identifier MCID = new Identifier("minecraft", id);
        if (Registry.BLOCK.getOrEmpty(MCID).isPresent() || Registry.ITEM.getOrEmpty(MCID).isPresent()) {
            return !allowAnyways().contains(id);
        } else return false;
    }

    public static ArrayList<String> allowAnyways() {
        ArrayList<String> whitelistedIDs = new ArrayList<>();
        whitelistedIDs.add("purpur_block");
        whitelistedIDs.add("purpur_slab");
        whitelistedIDs.add("purpur_stairs");
        whitelistedIDs.add("chiseled_sandstone");
        whitelistedIDs.add("chiseled_red_sandstone");
        whitelistedIDs.add("polished_basalt");
        return whitelistedIDs;
    }

    public static Block getBlock(String material, BlockVariations variations, BlockTypes type) {
        String typedMaterial = type.addType(material);
        String id = variations.addVariations(typedMaterial, type);
        overrideMap().getOrDefault(id, id);
        return Registry.BLOCK.get(ConsistencyPlusMain.id(id));
    }

    public static Block getDyedBlock(String material, BlockVariations variations, BlockTypes type, BlockColors color) {
        String coloredMaterial = color.toString() + "_" + material;
        String typedMaterial = type.addType(coloredMaterial);
        String id = variations.addVariations(typedMaterial, type);
        overrideMap().getOrDefault(id, id);
        return Registry.BLOCK.get(ConsistencyPlusMain.id(id));
    }

    public static Item getItem(String material, BlockVariations variations, BlockTypes type) {
        String typedMaterial = type.addType(material);
        String id = variations.addVariations(typedMaterial, type);
        overrideMap().getOrDefault(id, id);
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
        for (BlockColors colors : BlockColors.values()) {
            blockSettings = blockSettings.mapColor(BlockColors.toMapColor(colors, terracotta));
            registerFromMaterial(colors.toString() + "_" + id, blockSettings, CPlusItemGroups.consistencyPlusDyeableItemSettings());
        }

        return id;
    }

    public static String registerFromMaterial(String material, AbstractBlock.Settings blockSettings, Item.Settings itemSettings) {
        for (BlockTypes type : BlockTypes.values()) {
            String typedMaterial = type.addType(material);
            for (BlockVariations variation : BlockVariations.values()) {
                String id = variation.addVariations(typedMaterial, type);
                if (!type.equals(BlockTypes.BASE) && !variation.withTypes()) break;
                if (!type.equals(BlockTypes.BASE) && baseOnly().contains(material)) break;
                if (!variation.equals(BlockVariations.BLOCK) && tintedGlassSet().contains(material)) break; // If it is not a full block and it is a tinted glass, go to next entry.
                if (!variation.withTypes() && baseOnly().contains(material)) break; // If it is a Pillar/Corner Pillar/Chiseled/Carved and it is a glowstone/tinted glass, go to next entry.
                if (type.equals(BlockTypes.COBBLED) && (cobbleless().contains(material))) break;
                construct(id, variation, material, blockSettings, itemSettings, type);
            }
        }
        return material;
    }

    public static void construct(String id, BlockVariations variation, String material, Block.Settings blockSettings, Item.Settings itemSettings, BlockTypes type) {
        id = overrideMap().getOrDefault(id, id);
        if (checkMinecraft(id)) return;
        if (blacklist().contains(id)) return;
        itemRegistration(id, new BlockItem(blockRegistration(id, variation, material, blockSettings, type), itemSettings));
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

    public static void init() {}
}

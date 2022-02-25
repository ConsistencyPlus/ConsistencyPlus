package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
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
    public static final String CALCITE = registerFromMaterial("calcite");
    public static final String DRIPSTONE = registerFromMaterial("dripstone");
    public static final String TUFF = registerFromMaterial("tuff");
    public static final String SOUL_SANDSTONE = registerFromMaterial("soul_sandstone");
    public static final String END_STONE = registerFromMaterial("end_stone");
    public static final String PRISMARINE = registerFromMaterial("prismarine");
    public static final String DARK_PRISMARINE = registerFromMaterial("dark_prismarine");
    public static final String BONE = registerFromMaterial("bone");
    public static final String WITHERED_BONE = registerFromMaterial("withered_bone");


    public enum BlockTypes {
        BASE, POLISHED, BRICK, CUT, TILE, COBBLED, SMOOTH;

        @Override
        public String toString() {
            if (this == BASE) return "";
            return name().toLowerCase(Locale.ROOT);
        }

        public boolean isASuffix() {
            return suffixCheck(this);
        }

        public boolean suffixCheck(BlockTypes type) {
            return type == BRICK || type == TILE;
        }

        public String addType(String id) {
            return switch (this) {
                case COBBLED, POLISHED, CUT, SMOOTH -> this + "_" + id;
                case BRICK, TILE -> id + "_" + this;
                default -> id;
            };
        }
    }

    public enum BlockVariations {
        BLOCK, SLAB, STAIRS, WALL, GATE, PILLAR, CORNER_PILLAR, CARVED, CHISELED;

        public boolean withTypes() {
            return this != CARVED && this != CHISELED && this != PILLAR && this != CORNER_PILLAR;
        }

        @Override
        public String toString() {
            if (this == BLOCK) return "";
            return name().toLowerCase(Locale.ROOT);
        }

        public String addVariations(String id, BlockTypes type) {
            if (this.withTypes()) {
                return switch (this) {
                    case SLAB, STAIRS, WALL, GATE -> id + "_" + this;
                    default -> (type.isASuffix()) ? id + "s" : id;
                };
            } else {
                return switch (this) {
                    case PILLAR, CORNER_PILLAR -> id + "_" + this;
                    default -> this + "_" + id;
                };
            }
        }
    }

    //todo: Make blacklist work.
    public static List<String> stoneTabMaterials = List.of("dripstone");

    public static ArrayList<String> blacklist() {
        ArrayList<String> blacklistedIDs = new ArrayList<String>();
        blacklistedIDs.add("dripstone");
        blacklistedIDs.add("bone");
        blacklistedIDs.add("withered_bone");
        return blacklistedIDs;
    }

    public static String overrides(String id) {
        if (id == "withered_bone") {
            return "withered_bone_block";
        }
        return id;
    }

    public static ArrayList<String> miscTab() {
        ArrayList<String> miscList = new ArrayList<String>();
        miscList.add("bone");
        miscList.add("withered_bone");
        miscList.add("prismarine");
        miscList.add("dark_prismarine");
        return miscList;
    }

    public static String registerFromMaterial(String id) {
        for (BlockTypes blockType : BlockTypes.values()) {
            String typedId = blockType.addType(id);
            for (BlockVariations blockVariation : BlockVariations.values()) {
                String variatedId = blockVariation.addVariations(typedId, blockType);
                if (!blockType.equals(BlockTypes.BASE) && !blockVariation.withTypes()) break;
                if (miscTab().contains(id) && blockType.equals(BlockTypes.COBBLED)) break;
                Item.Settings itemSettings = getItemSettings(id);
                AbstractBlock.Settings blockSettings = getBlockSettings(id);
                construct(variatedId, blockVariation, id, blockSettings, itemSettings, blockType);
            }
        }
        return id;
    }

    public static Block getBlock(String material, BlockVariations variations, BlockTypes type) {
        String typedMaterial = type.addType(material);
        String id = variations.addVariations(typedMaterial, type);
        return Registry.BLOCK.get(ConsistencyPlusMain.id(id));
    }

    public static void construct(String id, BlockVariations blockVariations, String material, Block.Settings blockSettings, Item.Settings itemSettings, BlockTypes type) {
        id = overrides(id);
        if (Registry.BLOCK.getOrEmpty(new Identifier("minecraft", id)).isPresent() || Registry.ITEM.getOrEmpty(new Identifier("minecraft", id)).isPresent()) return;
        if (blacklist().contains(id)) return;
        itemRegistration(id, new BlockItem(blockRegistration(id, blockVariations, material, blockSettings, type), itemSettings));
    }

    public static Block.Settings getBlockSettings(String material){
        //if (stoneTabMaterials.contains(material)) return CPlusItemGroups.consistencyPlusStoneItemSettings();
        return switch (material) {
            default -> CPlusBlockSettings.DRIPSTONE;
            case "calcite" -> CPlusBlockSettings.CALCITE;
            case "tuff" -> CPlusBlockSettings.TUFF;
            case "soul_sandstone" -> CPlusBlockSettings.SOUL_SANDSTONE;
            case "end_stone" -> Block.Settings.copy(Blocks.END_STONE);
            case "prismarine" -> Block.Settings.copy(Blocks.PRISMARINE);
            case "dark_prismarine" -> Block.Settings.copy(Blocks.DARK_PRISMARINE);
            case "bone" -> Block.Settings.copy(Blocks.BONE_BLOCK);
            case "withered_bone" -> CPlusBlockSettings.WITHERED_BONE;
        };
    }

    public static Item.Settings getItemSettings(String material){
        //if (stoneTabMaterials.contains(material)) return CPlusItemGroups.consistencyPlusStoneItemSettings();
        if (miscTab().contains(material)) return CPlusItemGroups.consistencyPlusMiscItemSettings();
        return CPlusItemGroups.consistencyPlusStoneItemSettings();
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

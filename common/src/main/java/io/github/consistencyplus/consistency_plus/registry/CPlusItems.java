package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.items.NubertMinecartItem;
import io.github.consistencyplus.consistency_plus.items.RedirectedBlockItem;

import io.github.consistencyplus.consistency_plus.items.NetheriteHorseArmorItem;

import net.minecraft.block.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain.isSoulIceLoaded;
import static net.minecraft.block.Blocks.BLUE_ICE;

public class CPlusItems {
	/*
	templates:
	block item: public static final RegistrySupplier<Item> SMOOTH_STONE_WALL = ConsistencyPlusMain.ITEMS.register("smooth_stone_wall", () -> new BlockItem(CPlusCPlusBlocks.SMOOTH_STONE_WALL, CPlusCPlusItemGroups.consistencyPlusStoneItemSettings()));
	 */
	
	// STONE
	// Base
	// Mossy Cobblestone
	public static final RegistrySupplier<Item> MOSSY_COBBLESTONE_GATE = ConsistencyPlusMain.ITEMS.register("mossy_cobblestone_gate", () -> new BlockItem(CPlusBlocks.MOSSY_COBBLESTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Stone Bricks
	public static final RegistrySupplier<Item> MOSSY_STONE_BRICK_GATE = ConsistencyPlusMain.ITEMS.register("mossy_stone_brick_gate", () -> new BlockItem(CPlusBlocks.MOSSY_STONE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Stone Bricks
	public static final RegistrySupplier<Item> CRACKED_STONE_BRICK_SLAB = ConsistencyPlusMain.ITEMS.register("cracked_stone_brick_slab", () -> new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_STONE_BRICK_STAIRS = ConsistencyPlusMain.ITEMS.register("cracked_stone_brick_stairs", () -> new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_STONE_BRICK_WALL = ConsistencyPlusMain.ITEMS.register("cracked_stone_brick_wall", () -> new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_STONE_BRICK_GATE = ConsistencyPlusMain.ITEMS.register("cracked_stone_brick_gate", () -> new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));


	// Mossy Stone Pillar
	public static final RegistrySupplier<Item> MOSSY_STONE_PILLAR = ConsistencyPlusMain.ITEMS.register("mossy_stone_pillar", () -> new BlockItem(CPlusBlocks.MOSSY_STONE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_STONE_CORNER_PILLAR = ConsistencyPlusMain.ITEMS.register("mossy_stone_corner_pillar", () -> new BlockItem(CPlusBlocks.MOSSY_STONE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Stone Pillar
	public static final RegistrySupplier<Item> CRACKED_STONE_PILLAR = ConsistencyPlusMain.ITEMS.register("cracked_stone_pillar", () -> new BlockItem(CPlusBlocks.CRACKED_STONE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_STONE_CORNER_PILLAR = ConsistencyPlusMain.ITEMS.register("cracked_stone_corner_pillar", () -> new BlockItem(CPlusBlocks.CRACKED_STONE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Chiseled Stone
	public static final RegistrySupplier<Item> MOSSY_CHISELED_STONE = ConsistencyPlusMain.ITEMS.register("mossy_chiseled_stone", () -> new BlockItem(CPlusBlocks.MOSSY_CHISELED_STONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Chiseled Stone
	public static final RegistrySupplier<Item> CRACKED_CHISELED_STONE = ConsistencyPlusMain.ITEMS.register("cracked_chiseled_stone", () -> new BlockItem(CPlusBlocks.CRACKED_CHISELED_STONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));


// DEEPSLATE
	// Cracked Deepslate Bricks
	public static final RegistrySupplier<Item> CRACKED_DEEPSLATE_BRICK_SLAB = ConsistencyPlusMain.ITEMS.register("cracked_deepslate_brick_slab", () -> new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_DEEPSLATE_BRICK_STAIRS = ConsistencyPlusMain.ITEMS.register("cracked_deepslate_brick_stairs", () -> new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_DEEPSLATE_BRICK_WALL = ConsistencyPlusMain.ITEMS.register("cracked_deepslate_brick_wall", () -> new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_DEEPSLATE_BRICK_GATE = ConsistencyPlusMain.ITEMS.register("cracked_deepslate_brick_gate", () -> new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Deepslate Tiles
	public static final RegistrySupplier<Item> CRACKED_DEEPSLATE_TILE_SLAB = ConsistencyPlusMain.ITEMS.register("cracked_deepslate_tile_slab", () -> new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_DEEPSLATE_TILE_STAIRS = ConsistencyPlusMain.ITEMS.register("cracked_deepslate_tile_stairs", () -> new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_DEEPSLATE_TILE_WALL = ConsistencyPlusMain.ITEMS.register("cracked_deepslate_tile_wall", () -> new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_DEEPSLATE_TILE_GATE = ConsistencyPlusMain.ITEMS.register("cracked_deepslate_tile_gate", () -> new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));


	// Mossy Blackstone Bricks
	public static final RegistrySupplier<Item> MOSSY_BLACKSTONE_BRICKS = ConsistencyPlusMain.ITEMS.register("mossy_blackstone_bricks", () -> new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICKS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_BLACKSTONE_BRICK_SLAB = ConsistencyPlusMain.ITEMS.register("mossy_blackstone_brick_slab", () -> new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_BLACKSTONE_BRICK_STAIRS = ConsistencyPlusMain.ITEMS.register("mossy_blackstone_brick_stairs", () -> new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_BLACKSTONE_BRICK_WALL = ConsistencyPlusMain.ITEMS.register("mossy_blackstone_brick_wall", () -> new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_BLACKSTONE_BRICK_GATE = ConsistencyPlusMain.ITEMS.register("mossy_blackstone_brick_gate", () -> new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Blackstone Bricks
	public static final RegistrySupplier<Item> CRACKED_BLACKSTONE_BRICK_SLAB = ConsistencyPlusMain.ITEMS.register("cracked_blackstone_brick_slab", () -> new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_BLACKSTONE_BRICK_STAIRS = ConsistencyPlusMain.ITEMS.register("cracked_blackstone_brick_stairs", () -> new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_BLACKSTONE_BRICK_WALL = ConsistencyPlusMain.ITEMS.register("cracked_blackstone_brick_wall", () -> new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_BLACKSTONE_BRICK_GATE = ConsistencyPlusMain.ITEMS.register("cracked_blackstone_brick_gate", () -> new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	public static final RegistrySupplier<Item> MOSSY_BLACKSTONE_PILLAR = ConsistencyPlusMain.ITEMS.register("mossy_blackstone_pillar", () -> new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_BLACKSTONE_CORNER_PILLAR = ConsistencyPlusMain.ITEMS.register("mossy_blackstone_corner_pillar", () -> new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_BLACKSTONE_PILLAR = ConsistencyPlusMain.ITEMS.register("cracked_blackstone_pillar", () -> new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_BLACKSTONE_CORNER_PILLAR = ConsistencyPlusMain.ITEMS.register("cracked_blackstone_corner_pillar", () -> new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_CHISELED_BLACKSTONE = ConsistencyPlusMain.ITEMS.register("mossy_chiseled_blackstone", () -> new BlockItem(CPlusBlocks.MOSSY_CHISELED_BLACKSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_CHISELED_BLACKSTONE = ConsistencyPlusMain.ITEMS.register("cracked_chiseled_blackstone", () -> new BlockItem(CPlusBlocks.CRACKED_CHISELED_BLACKSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_CARVED_BLACKSTONE = ConsistencyPlusMain.ITEMS.register("mossy_carved_blackstone", () -> new BlockItem(CPlusBlocks.MOSSY_CARVED_BLACKSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_CARVED_BLACKSTONE = ConsistencyPlusMain.ITEMS.register("cracked_carved_blackstone", () -> new BlockItem(CPlusBlocks.CRACKED_CARVED_BLACKSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));


// QUARTZ
	// Cracked Purpur Bricks
	public static final RegistrySupplier<Item> CRACKED_PURPUR_BRICKS = ConsistencyPlusMain.ITEMS.register("cracked_purpur_bricks", () -> new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICKS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_PURPUR_BRICK_SLAB = ConsistencyPlusMain.ITEMS.register("cracked_purpur_brick_slab", () -> new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_PURPUR_BRICK_STAIRS = ConsistencyPlusMain.ITEMS.register("cracked_purpur_brick_stairs", () -> new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_PURPUR_BRICK_WALL = ConsistencyPlusMain.ITEMS.register("cracked_purpur_brick_wall", () -> new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_PURPUR_BRICK_GATE = ConsistencyPlusMain.ITEMS.register("cracked_purpur_brick_gate", () -> new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));


	public static final RegistrySupplier<Item> CRACKED_NETHER_BRICK_SLAB = ConsistencyPlusMain.ITEMS.register("cracked_nether_brick_slab", () -> new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_NETHER_BRICK_STAIRS = ConsistencyPlusMain.ITEMS.register("cracked_nether_brick_stairs", () -> new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_NETHER_BRICK_WALL = ConsistencyPlusMain.ITEMS.register("cracked_nether_brick_wall", () -> new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_NETHER_BRICK_FENCE_GATE = ConsistencyPlusMain.ITEMS.register("cracked_nether_brick_fence_gate", () -> new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_FENCE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Soul
	public static final RegistrySupplier<Item> SOUL_GLOWSTONE = ConsistencyPlusMain.ITEMS.register("soul_glowstone", () -> new BlockItem(CPlusBlocks.SOUL_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SOUL_GLOWSTONE_SLAB = ConsistencyPlusMain.ITEMS.register("soul_glowstone_slab", () -> new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SOUL_GLOWSTONE_STAIRS = ConsistencyPlusMain.ITEMS.register("soul_glowstone_stairs", () -> new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SOUL_GLOWSTONE_WALL = ConsistencyPlusMain.ITEMS.register("soul_glowstone_wall", () -> new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SOUL_GLOWSTONE_GATE = ConsistencyPlusMain.ITEMS.register("soul_glowstone_gate", () -> new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// ORGANICS

	// Dirt
	public static final RegistrySupplier<Item> DIRT_SLAB = ConsistencyPlusMain.ITEMS.register("dirt_slab", () -> new BlockItem(CPlusBlocks.DIRT_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> DIRT_STAIRS = ConsistencyPlusMain.ITEMS.register("dirt_stairs", () -> new BlockItem(CPlusBlocks.DIRT_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> DIRT_WALL = ConsistencyPlusMain.ITEMS.register("dirt_wall", () -> new BlockItem(CPlusBlocks.DIRT_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Grass
	public static final RegistrySupplier<Item> GRASS_SLAB = ConsistencyPlusMain.ITEMS.register("grass_slab", () -> new BlockItem(CPlusBlocks.GRASS_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> GRASS_STAIRS = ConsistencyPlusMain.ITEMS.register("grass_stairs", () -> new BlockItem(CPlusBlocks.GRASS_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> GRASS_WALL = ConsistencyPlusMain.ITEMS.register("grass_wall", () -> new BlockItem(CPlusBlocks.GRASS_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Mycelium
	public static final RegistrySupplier<Item> MYCELIUM_SLAB = ConsistencyPlusMain.ITEMS.register("mycelium_slab", () -> new BlockItem(CPlusBlocks.MYCELIUM_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> MYCELIUM_STAIRS = ConsistencyPlusMain.ITEMS.register("mycelium_stairs", () -> new BlockItem(CPlusBlocks.MYCELIUM_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> MYCELIUM_WALL = ConsistencyPlusMain.ITEMS.register("mycelium_wall", () -> new BlockItem(CPlusBlocks.MYCELIUM_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));


// MISC

	public static final RegistrySupplier<Item> JACK_O_SOUL = ConsistencyPlusMain.ITEMS.register("jack_o_soul", () -> new BlockItem(CPlusBlocks.JACK_O_SOUL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> PINEAPPLE = ConsistencyPlusMain.ITEMS.register("pineapple", () -> new BlockItem(CPlusBlocks.PINEAPPLE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> NETHERITE_STAIRS = ConsistencyPlusMain.ITEMS.register("netherite_stairs", () -> new BlockItem(CPlusBlocks.NETHERITE_STAIRS.get(),  new Item.Settings()));
	public static final RegistrySupplier<Item> SUSPICIOUS_SLAB = ConsistencyPlusMain.ITEMS.register("suspicious_slab", () -> new BlockItem(CPlusBlocks.SUSPICIOUS_SLAB.get(), new Item.Settings()));
	public static final RegistrySupplier<Item> JET = ConsistencyPlusMain.ITEMS.register("jet", () -> new BlockItem(CPlusBlocks.JET.get(), new Item.Settings()));
	public static final RegistrySupplier<Item> NUBERT = ConsistencyPlusMain.ITEMS.register("nubert", () -> new BlockItem(CPlusBlocks.NUBERT.get(), new Item.Settings().fireproof().rarity(Rarity.EPIC)));
	public static final RegistrySupplier<Item> WIGGED_NUBERT = ConsistencyPlusMain.ITEMS.register("wigged_nubert", () -> new BlockItem(CPlusBlocks.WIGGED_NUBERT.get(), new Item.Settings().fireproof().rarity(Rarity.EPIC)));
	public static final RegistrySupplier<Item> NUBERT_MINECART = ConsistencyPlusMain.ITEMS.register("nubert_minecart", () -> new NubertMinecartItem(new Item.Settings().maxCount(1), false));
	public static final RegistrySupplier<Item> WIGGED_NUBERT_MINECART = ConsistencyPlusMain.ITEMS.register("wigged_nubert_minecart", () -> new NubertMinecartItem(new Item.Settings().maxCount(1), true));


// ITEMS

	// Random
	public static final RegistrySupplier<Item> WARPED_WART = ConsistencyPlusMain.ITEMS.register("warped_wart", () -> new AliasedBlockItem(CPlusBlocks.WARPED_WART.get(), new Item.Settings().group(ItemGroup.MISC)));
	public static final RegistrySupplier<Item> COPPER_NUGGET = ConsistencyPlusMain.ITEMS.register("copper_nugget", () -> new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final RegistrySupplier<Item> NETHERITE_NUGGET = ConsistencyPlusMain.ITEMS.register("netherite_nugget", () -> new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final RegistrySupplier<Item> NETHERITE_HORSE_ARMOR = ConsistencyPlusMain.ITEMS.register("netherite_horse_armor", () -> new NetheriteHorseArmorItem(15, "netherite", new Item.Settings().maxCount(1).fireproof().group(ItemGroup.MISC)));
	public static final RegistrySupplier<Item> WITHERED_BONE = ConsistencyPlusMain.ITEMS.register("withered_bone", () -> new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final RegistrySupplier<Item> WITHERED_BONE_MEAL = ConsistencyPlusMain.ITEMS.register("withered_bone_meal", () -> new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final RegistrySupplier<Item> GLOW_INK_SAC = ConsistencyPlusMain.ITEMS.register("glow_ink_sac", () -> new Item(new Item.Settings().group(ItemGroup.MISC)));

	// 🐢
	public static final RegistrySupplier<Item> TURTLE_CHESTPLATE = ConsistencyPlusMain.ITEMS.register("turtle_chestplate", () -> new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
	public static final RegistrySupplier<Item> TURTLE_LEGGINGS = ConsistencyPlusMain.ITEMS.register("turtle_leggings", () -> new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
	public static final RegistrySupplier<Item> TURTLE_BOOTS = ConsistencyPlusMain.ITEMS.register("turtle_boots", () -> new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));

/*
// Deprecated Blocks
	public static final RegistrySupplier<Item> CARVED_STONE_BRICKS = ConsistencyPlusMain.ITEMS.register("carved_stone_bricks", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("stone", BlockVariations.CARVED, BlockTypes.BASE).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CARVED_STONE_BRICKS));
	public static final RegistrySupplier<Item> STONE_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("stone_brick_pillar", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("stone", BlockVariations.PILLAR, BlockTypes.BASE).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.STONE_BRICK_PILLAR));
	public static final RegistrySupplier<Item> MOSSY_STONE_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("mossy_stone_brick_pillar", () -> new RedirectedBlockItem(CPlusBlocks.MOSSY_STONE_PILLAR.get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.MOSSY_STONE_BRICK_PILLAR));
	public static final RegistrySupplier<Item> CRACKED_STONE_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("cracked_stone_brick_pillar", () -> new RedirectedBlockItem(CPlusBlocks.CRACKED_STONE_PILLAR.get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_STONE_BRICK_PILLAR));
	public static final RegistrySupplier<Item> CRACKED_CHISELED_STONE_BRICKS = ConsistencyPlusMain.ITEMS.register("cracked_chiseled_stone_bricks", () -> new RedirectedBlockItem(CPlusBlocks.CRACKED_CHISELED_STONE_BRICKS.get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_CHISELED_STONE));
	public static final RegistrySupplier<Item> MOSSY_CHISELED_STONE_BRICKS = ConsistencyPlusMain.ITEMS.register("mossy_chiseled_stone_bricks", () -> new RedirectedBlockItem(CPlusBlocks.MOSSY_CHISELED_STONE.get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.MOSSY_CHISELED_STONE_BRICKS));
	public static final RegistrySupplier<Item> BLACKSTONE_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("blackstone_brick_pillar", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("blackstone", BlockVariations.PILLAR, BlockTypes.BASE).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLACKSTONE_BRICK_PILLAR));
	public static final RegistrySupplier<Item> CRACKED_BLACKSTONE_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("cracked_blackstone_brick_pillar", () -> new RedirectedBlockItem(CPlusBlocks.CRACKED_BLACKSTONE_PILLAR.get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLACKSTONE_BRICK_PILLAR));
	public static final RegistrySupplier<Item> MOSSY_BLACKSTONE_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("mossy_blackstone_brick_pillar", () -> new RedirectedBlockItem(CPlusBlocks.MOSSY_BLACKSTONE_PILLAR.get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.MOSSY_BLACKSTONE_BRICK_PILLAR));
	public static final RegistrySupplier<Item> CHISELED_BRICKS = ConsistencyPlusMain.ITEMS.register("chiseled_bricks", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("terracotta", BlockVariations.CHISELED, BlockTypes.BASE).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CHISELED_BRICKS));
	public static final RegistrySupplier<Item> BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("brick_pillar", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("terracotta", BlockVariations.PILLAR, BlockTypes.BASE).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BRICK_PILLAR));
	public static final RegistrySupplier<Item> CARVED_BRICKS = ConsistencyPlusMain.ITEMS.register("carved_bricks", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("terracotta", BlockVariations.CARVED, BlockTypes.BASE).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CARVED_BRICKS));
	public static final RegistrySupplier<Item> SMOOTH_PURPUR_BLOCK = ConsistencyPlusMain.ITEMS.register("smooth_purpur_block", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("purpur", BlockVariations.BLOCK, BlockTypes.SMOOTH).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.SMOOTH_PURPUR_BLOCK));
	public static final RegistrySupplier<Item> POLISHED_PURPUR_BLOCK = ConsistencyPlusMain.ITEMS.register("polished_purpur_block", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("purpur", BlockVariations.BLOCK, BlockTypes.POLISHED).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.POLISHED_PURPUR_BLOCK));
	public static final RegistrySupplier<Item> CHISELED_PURPUR_BLOCK = ConsistencyPlusMain.ITEMS.register("chiseled_purpur_block", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("purpur", BlockVariations.CHISELED, BlockTypes.BASE).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CHISELED_PURPUR_BLOCK));
	public static final RegistrySupplier<Item> END_STONE_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("end_stone_brick_pillar", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("end_stone", BlockVariations.PILLAR, BlockTypes.BASE).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.END_STONE_BRICK_PILLAR));
	public static final RegistrySupplier<Item> NETHER_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("nether_brick_pillar", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("netherrack", BlockVariations.PILLAR, BlockTypes.BASE).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.NETHER_BRICK_PILLAR));
	public static final RegistrySupplier<Item> CHISELED_NETHER_BRICKS = ConsistencyPlusMain.ITEMS.register("chiseled_nether_bricks", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("netherrack", BlockVariations.CHISELED, BlockTypes.BASE).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CHISELED_NETHER_BRICKS));
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICKS = ConsistencyPlusMain.ITEMS.register("blue_nether_bricks", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.BLOCK, BlockTypes.BRICK).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICKS));
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICK_SLAB = ConsistencyPlusMain.ITEMS.register("blue_nether_brick_slab", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.SLAB, BlockTypes.BRICK).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICK_SLAB));
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICK_STAIRS = ConsistencyPlusMain.ITEMS.register("blue_nether_brick_stairs", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.STAIRS, BlockTypes.BRICK).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICK_STAIRS));
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICK_WALL = ConsistencyPlusMain.ITEMS.register("blue_nether_brick_wall", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.WALL, BlockTypes.BRICK).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICK_WALL));
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICK_FENCE_GATE = ConsistencyPlusMain.ITEMS.register("blue_nether_brick_fence_gate", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.GATE, BlockTypes.BRICK).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICK_FENCE_GATE));
	public static final RegistrySupplier<Item> CRACKED_BLUE_NETHER_BRICKS = ConsistencyPlusMain.ITEMS.register("cracked_blue_nether_bricks", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.BLOCK, BlockTypes.BRICK).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLUE_NETHER_BRICKS));
	public static final RegistrySupplier<Item> CRACKED_BLUE_NETHER_BRICK_SLAB = ConsistencyPlusMain.ITEMS.register("cracked_blue_nether_brick_slab", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.SLAB, BlockTypes.BRICK).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB));
	public static final RegistrySupplier<Item> CRACKED_BLUE_NETHER_BRICK_STAIRS = ConsistencyPlusMain.ITEMS.register("cracked_blue_nether_brick_stairs", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.STAIRS, BlockTypes.BRICK).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS));
	public static final RegistrySupplier<Item> CRACKED_BLUE_NETHER_BRICK_WALL = ConsistencyPlusMain.ITEMS.register("cracked_blue_nether_brick_wall", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.WALL, BlockTypes.BRICK).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_WALL));
	public static final RegistrySupplier<Item> CRACKED_BLUE_NETHER_BRICK_FENCE_GATE = ConsistencyPlusMain.ITEMS.register("cracked_blue_nether_brick_fence_gate", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.GATE, BlockTypes.BRICK).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE));
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("blue_nether_brick_pillar", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.PILLAR, BlockTypes.BASE).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICK_PILLAR));
	public static final RegistrySupplier<Item> CHISELED_BLUE_NETHER_BRICKS = ConsistencyPlusMain.ITEMS.register("chiseled_blue_nether_bricks", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.CHISELED, BlockTypes.BASE).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CHISELED_BLUE_NETHER_BRICKS));
	public static final RegistrySupplier<Item> CARVED_BLUE_NETHER_BRICKS = ConsistencyPlusMain.ITEMS.register("carved_blue_nether_bricks", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.CARVED, BlockTypes.BASE).get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CARVED_BLUE_NETHER_BRICKS));
	public static final RegistrySupplier<Item> RED_NETHER_BRICK_FENCE_GATE = ConsistencyPlusMain.ITEMS.register("red_nether_brick_fence_gate", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("crimson_wart", BlockVariations.GATE, BlockTypes.BRICK).get(), CPlusItemGroups.consistencyPlusMiscItemSettings(), CPlusBlocks.RED_NETHER_BRICK_FENCE_GATE));
	public static final RegistrySupplier<Item> RED_NETHER_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("red_nether_brick_pillar", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("crimson_wart", BlockVariations.PILLAR, BlockTypes.BASE).get(), CPlusItemGroups.consistencyPlusMiscItemSettings(), CPlusBlocks.RED_NETHER_BRICK_PILLAR));
	public static final RegistrySupplier<Item> CHISELED_RED_NETHER_BRICKS = ConsistencyPlusMain.ITEMS.register("chiseled_red_nether_bricks", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("crimson_wart", BlockVariations.CHISELED, BlockTypes.BASE).get(), CPlusItemGroups.consistencyPlusMiscItemSettings(), CPlusBlocks.CHISELED_RED_NETHER_BRICKS));
	public static final RegistrySupplier<Item> CARVED_RED_NETHER_BRICKS = ConsistencyPlusMain.ITEMS.register("carved_red_nether_bricks", () -> new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("crimson_wart", BlockVariations.CARVED, BlockTypes.BASE).get(), CPlusItemGroups.consistencyPlusMiscItemSettings(), CPlusBlocks.CARVED_RED_NETHER_BRICKS));

	// Soul
	public static final RegistrySupplier<Item> SOUL_ICE = soulIceTester("soul_ice", BLUE_ICE, CPlusBlocks.SOUL_ICE);
	public static final RegistrySupplier<Item> SOUL_ICE_SLAB = soulIceTester("soul_ice_slab", CPlusBlocks.BLUE_ICE_SLAB, CPlusBlocks.SOUL_ICE_SLAB);
	public static final RegistrySupplier<Item> SOUL_ICE_STAIRS = soulIceTester("soul_ice_stairs", CPlusBlocks.BLUE_ICE_STAIRS, CPlusBlocks.SOUL_ICE_STAIRS);
	public static final RegistrySupplier<Item> SOUL_ICE_WALL = soulIceTester("soul_ice_wall", CPlusBlocks.BLUE_ICE_WALL, CPlusBlocks.SOUL_ICE_WALL);
	public static final RegistrySupplier<Item> SOUL_ICE_GATE = soulIceTester("soul_ice_gate", CPlusBlocks.BLUE_ICE_GATE, CPlusBlocks.SOUL_ICE_GATE);
*/

	private static RegistrySupplier<Item> soulIceTester(String id, Block backupBlock, Block fromBlock) {
		Block toBlock = (isSoulIceLoaded) ? Registry.BLOCK.getOrEmpty(new Identifier("soul_ice", id)).get() : backupBlock;
		return  ConsistencyPlusMain.ITEMS.register(id, () -> new RedirectedBlockItem(toBlock, CPlusItemGroups.consistencyPlusDeprecatedSettings(), fromBlock));
	}

	public static void init() {
		if (ConsistencyPlusMain.DEVENV) ConsistencyPlusMain.LOGGER.info("CPlusItems - initialization point");
	}
}
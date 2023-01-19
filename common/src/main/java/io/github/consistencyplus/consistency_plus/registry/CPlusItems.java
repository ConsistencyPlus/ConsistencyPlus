package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.core.entries.block.deprecated.DyedIceRegistryEntryGroup;
import io.github.consistencyplus.consistency_plus.items.NubertMinecartItem;
import io.github.consistencyplus.consistency_plus.items.RedirectedBlockItem;

import io.github.consistencyplus.consistency_plus.items.NetheriteHorseArmorItem;

import net.minecraft.block.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static io.github.consistencyplus.consistency_plus.registry.CPlusEntries.*;
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
	public static final RegistrySupplier<Item> NUBERT_MINECART = ConsistencyPlusMain.ITEMS.register("nubert_minecart", () -> new NubertMinecartItem(new Item.Settings().maxCount(1), CPlusBlocks.NUBERT.get(), false));
	public static final RegistrySupplier<Item> WIGGED_NUBERT_MINECART = ConsistencyPlusMain.ITEMS.register("wigged_nubert_minecart", () -> new NubertMinecartItem(new Item.Settings().maxCount(1), CPlusBlocks.WIGGED_NUBERT.get(), true));


// ITEMS

	// Random
	public static final RegistrySupplier<Item> WARPED_WART = ConsistencyPlusMain.ITEMS.register("warped_wart", () -> new AliasedBlockItem(CPlusBlocks.WARPED_WART.get(), new Item.Settings().group(ItemGroup.MISC)));
	public static final RegistrySupplier<Item> COPPER_NUGGET = ConsistencyPlusMain.ITEMS.register("copper_nugget", () -> new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final RegistrySupplier<Item> NETHERITE_NUGGET = ConsistencyPlusMain.ITEMS.register("netherite_nugget", () -> new Item(new Item.Settings().group(ItemGroup.MISC).fireproof()));
	public static final RegistrySupplier<Item> NETHERITE_HORSE_ARMOR = ConsistencyPlusMain.ITEMS.register("netherite_horse_armor", () -> new NetheriteHorseArmorItem(15, "netherite", new Item.Settings().maxCount(1).fireproof().group(ItemGroup.MISC)));
	public static final RegistrySupplier<Item> WITHERED_BONE = ConsistencyPlusMain.ITEMS.register("withered_bone", () -> new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final RegistrySupplier<Item> WITHERED_BONE_MEAL = ConsistencyPlusMain.ITEMS.register("withered_bone_meal", () -> new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final RegistrySupplier<Item> GLOW_INK_SAC = ConsistencyPlusMain.ITEMS.register("glow_ink_sac", () -> new Item(new Item.Settings().group(ItemGroup.MISC)));

	// 🐢
	public static final RegistrySupplier<Item> TURTLE_CHESTPLATE = ConsistencyPlusMain.ITEMS.register("turtle_chestplate", () -> new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
	public static final RegistrySupplier<Item> TURTLE_LEGGINGS = ConsistencyPlusMain.ITEMS.register("turtle_leggings", () -> new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
	public static final RegistrySupplier<Item> TURTLE_BOOTS = ConsistencyPlusMain.ITEMS.register("turtle_boots", () -> new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));


// Deprecated Blocks
	public static final RegistrySupplier<Item> CARVED_STONE_BRICKS = ConsistencyPlusMain.ITEMS.register("carved_stone_bricks", () -> new RedirectedBlockItem(STONE.getBlock(BlockShapes.CARVED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CARVED_STONE_BRICKS.get())); 
	public static final RegistrySupplier<Item> STONE_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("stone_brick_pillar", () -> new RedirectedBlockItem(STONE.getBlock(BlockShapes.PILLAR, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.STONE_BRICK_PILLAR.get())); 
	public static final RegistrySupplier<Item> MOSSY_STONE_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("mossy_stone_brick_pillar", () -> new RedirectedBlockItem(CPlusBlocks.MOSSY_STONE_PILLAR.get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.MOSSY_STONE_BRICK_PILLAR.get())); 
	public static final RegistrySupplier<Item> CRACKED_STONE_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("cracked_stone_brick_pillar", () -> new RedirectedBlockItem(CPlusBlocks.CRACKED_STONE_PILLAR.get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_STONE_BRICK_PILLAR.get())); 
	public static final RegistrySupplier<Item> CRACKED_CHISELED_STONE_BRICKS = ConsistencyPlusMain.ITEMS.register("cracked_chiseled_stone_bricks", () -> new RedirectedBlockItem(CPlusBlocks.CRACKED_CHISELED_STONE_BRICKS.get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_CHISELED_STONE.get())); 
	public static final RegistrySupplier<Item> MOSSY_CHISELED_STONE_BRICKS = ConsistencyPlusMain.ITEMS.register("mossy_chiseled_stone_bricks", () -> new RedirectedBlockItem(CPlusBlocks.MOSSY_CHISELED_STONE.get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.MOSSY_CHISELED_STONE_BRICKS.get())); 
	public static final RegistrySupplier<Item> BLACKSTONE_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("blackstone_brick_pillar", () -> new RedirectedBlockItem(BLACKSTONE.getBlock(BlockShapes.PILLAR, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLACKSTONE_BRICK_PILLAR.get())); 
	public static final RegistrySupplier<Item> CRACKED_BLACKSTONE_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("cracked_blackstone_brick_pillar", () -> new RedirectedBlockItem(CPlusBlocks.CRACKED_BLACKSTONE_PILLAR.get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLACKSTONE_BRICK_PILLAR.get())); 
	public static final RegistrySupplier<Item> MOSSY_BLACKSTONE_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("mossy_blackstone_brick_pillar", () -> new RedirectedBlockItem(CPlusBlocks.MOSSY_BLACKSTONE_PILLAR.get(), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.MOSSY_BLACKSTONE_BRICK_PILLAR.get())); 
	public static final RegistrySupplier<Item> CHISELED_BRICKS = ConsistencyPlusMain.ITEMS.register("chiseled_bricks", () -> new RedirectedBlockItem(TERRACOTTA.getBlock(BlockShapes.CHISELED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CHISELED_BRICKS.get())); 
	public static final RegistrySupplier<Item> BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("brick_pillar", () -> new RedirectedBlockItem(TERRACOTTA.getBlock(BlockShapes.PILLAR, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BRICK_PILLAR.get())); 
	public static final RegistrySupplier<Item> CARVED_BRICKS = ConsistencyPlusMain.ITEMS.register("carved_bricks", () -> new RedirectedBlockItem(TERRACOTTA.getBlock(BlockShapes.CARVED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CARVED_BRICKS.get())); 
	public static final RegistrySupplier<Item> SMOOTH_PURPUR_BLOCK = ConsistencyPlusMain.ITEMS.register("smooth_purpur_block", () -> new RedirectedBlockItem(PURPUR.getBlock(BlockShapes.BLOCK, BlockTypes.SMOOTH), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.SMOOTH_PURPUR_BLOCK.get())); 
	public static final RegistrySupplier<Item> POLISHED_PURPUR_BLOCK = ConsistencyPlusMain.ITEMS.register("polished_purpur_block", () -> new RedirectedBlockItem(PURPUR.getBlock(BlockShapes.BLOCK, BlockTypes.POLISHED), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.POLISHED_PURPUR_BLOCK.get())); 
	public static final RegistrySupplier<Item> CHISELED_PURPUR_BLOCK = ConsistencyPlusMain.ITEMS.register("chiseled_purpur_block", () -> new RedirectedBlockItem(PURPUR.getBlock(BlockShapes.CHISELED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CHISELED_PURPUR_BLOCK.get())); 
	public static final RegistrySupplier<Item> END_STONE_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("end_stone_brick_pillar", () -> new RedirectedBlockItem(END_STONE.getBlock(BlockShapes.PILLAR, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.END_STONE_BRICK_PILLAR.get())); 
	public static final RegistrySupplier<Item> NETHER_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("nether_brick_pillar", () -> new RedirectedBlockItem(NETHERRACK.getBlock(BlockShapes.PILLAR, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.NETHER_BRICK_PILLAR.get())); 
	public static final RegistrySupplier<Item> CHISELED_NETHER_BRICKS = ConsistencyPlusMain.ITEMS.register("chiseled_nether_bricks", () -> new RedirectedBlockItem(NETHERRACK.getBlock(BlockShapes.CHISELED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CHISELED_NETHER_BRICKS.get())); 
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICKS = ConsistencyPlusMain.ITEMS.register("blue_nether_bricks", () -> new RedirectedBlockItem(CPlusEntries.WARPED_WART.getBlock(BlockShapes.BLOCK, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICKS.get())); 
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICK_SLAB = ConsistencyPlusMain.ITEMS.register("blue_nether_brick_slab", () -> new RedirectedBlockItem(CPlusEntries.WARPED_WART.getBlock(BlockShapes.SLAB, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICK_SLAB.get())); 
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICK_STAIRS = ConsistencyPlusMain.ITEMS.register("blue_nether_brick_stairs", () -> new RedirectedBlockItem(CPlusEntries.WARPED_WART.getBlock(BlockShapes.STAIRS, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICK_STAIRS.get())); 
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICK_WALL = ConsistencyPlusMain.ITEMS.register("blue_nether_brick_wall", () -> new RedirectedBlockItem(CPlusEntries.WARPED_WART.getBlock(BlockShapes.WALL, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICK_WALL.get())); 
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICK_FENCE_GATE = ConsistencyPlusMain.ITEMS.register("blue_nether_brick_fence_gate", () -> new RedirectedBlockItem(CPlusEntries.WARPED_WART.getBlock(BlockShapes.GATE, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICK_FENCE_GATE.get())); 
	public static final RegistrySupplier<Item> CRACKED_BLUE_NETHER_BRICKS = ConsistencyPlusMain.ITEMS.register("cracked_blue_nether_bricks", () -> new RedirectedBlockItem(CPlusEntries.WARPED_WART.getBlock(BlockShapes.BLOCK, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLUE_NETHER_BRICKS.get())); 
	public static final RegistrySupplier<Item> CRACKED_BLUE_NETHER_BRICK_SLAB = ConsistencyPlusMain.ITEMS.register("cracked_blue_nether_brick_slab", () -> new RedirectedBlockItem(CPlusEntries.WARPED_WART.getBlock(BlockShapes.SLAB, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB.get())); 
	public static final RegistrySupplier<Item> CRACKED_BLUE_NETHER_BRICK_STAIRS = ConsistencyPlusMain.ITEMS.register("cracked_blue_nether_brick_stairs", () -> new RedirectedBlockItem(CPlusEntries.WARPED_WART.getBlock(BlockShapes.STAIRS, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS.get())); 
	public static final RegistrySupplier<Item> CRACKED_BLUE_NETHER_BRICK_WALL = ConsistencyPlusMain.ITEMS.register("cracked_blue_nether_brick_wall", () -> new RedirectedBlockItem(CPlusEntries.WARPED_WART.getBlock(BlockShapes.WALL, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_WALL.get())); 
	public static final RegistrySupplier<Item> CRACKED_BLUE_NETHER_BRICK_FENCE_GATE = ConsistencyPlusMain.ITEMS.register("cracked_blue_nether_brick_fence_gate", () -> new RedirectedBlockItem(CPlusEntries.WARPED_WART.getBlock(BlockShapes.GATE, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE.get())); 
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("blue_nether_brick_pillar", () -> new RedirectedBlockItem(CPlusEntries.WARPED_WART.getBlock(BlockShapes.PILLAR, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICK_PILLAR.get())); 
	public static final RegistrySupplier<Item> CHISELED_BLUE_NETHER_BRICKS = ConsistencyPlusMain.ITEMS.register("chiseled_blue_nether_bricks", () -> new RedirectedBlockItem(CPlusEntries.WARPED_WART.getBlock(BlockShapes.CHISELED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CHISELED_BLUE_NETHER_BRICKS.get())); 
	public static final RegistrySupplier<Item> CARVED_BLUE_NETHER_BRICKS = ConsistencyPlusMain.ITEMS.register("carved_blue_nether_bricks", () -> new RedirectedBlockItem(CPlusEntries.WARPED_WART.getBlock(BlockShapes.CARVED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CARVED_BLUE_NETHER_BRICKS.get())); 
	public static final RegistrySupplier<Item> RED_NETHER_BRICK_FENCE_GATE = ConsistencyPlusMain.ITEMS.register("red_nether_brick_fence_gate", () -> new RedirectedBlockItem(CRIMSON_WART.getBlock(BlockShapes.GATE, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusMiscItemSettings(), CPlusBlocks.RED_NETHER_BRICK_FENCE_GATE.get())); 
	public static final RegistrySupplier<Item> RED_NETHER_BRICK_PILLAR = ConsistencyPlusMain.ITEMS.register("red_nether_brick_pillar", () -> new RedirectedBlockItem(CRIMSON_WART.getBlock(BlockShapes.PILLAR, BlockTypes.BASE), CPlusItemGroups.consistencyPlusMiscItemSettings(), CPlusBlocks.RED_NETHER_BRICK_PILLAR.get())); 
	public static final RegistrySupplier<Item> CHISELED_RED_NETHER_BRICKS = ConsistencyPlusMain.ITEMS.register("chiseled_red_nether_bricks", () -> new RedirectedBlockItem(CRIMSON_WART.getBlock(BlockShapes.CHISELED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusMiscItemSettings(), CPlusBlocks.CHISELED_RED_NETHER_BRICKS.get())); 
	public static final RegistrySupplier<Item> CARVED_RED_NETHER_BRICKS = ConsistencyPlusMain.ITEMS.register("carved_red_nether_bricks", () -> new RedirectedBlockItem(CRIMSON_WART.getBlock(BlockShapes.CARVED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusMiscItemSettings(), CPlusBlocks.CARVED_RED_NETHER_BRICKS.get())); 

	// Soul
	public static final RegistrySupplier<Item> SOUL_ICE = ConsistencyPlusMain.ITEMS.register("soul_ice", () -> new RedirectedBlockItem((isSoulIceLoaded) ? Registry.BLOCK.get(new Identifier("soul_ice", "soul_ice")) : BLUE_ICE, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.SOUL_ICE.get()));
	public static final RegistrySupplier<Item> SOUL_ICE_SLAB = ConsistencyPlusMain.ITEMS.register("soul_ice_slab", () -> new RedirectedBlockItem((isSoulIceLoaded) ? Registry.BLOCK.get(new Identifier("soul_ice", "soul_ice_slab")) : DYED_ICE.getDyedBlock(DyeColor.BLUE, BlockShapes.SLAB, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.SOUL_ICE_SLAB.get()));
	public static final RegistrySupplier<Item> SOUL_ICE_STAIRS = ConsistencyPlusMain.ITEMS.register("soul_ice_stairs", () -> new RedirectedBlockItem((isSoulIceLoaded) ? Registry.BLOCK.get(new Identifier("soul_ice", "soul_ice_stairs")) : DYED_ICE.getDyedBlock(DyeColor.BLUE, BlockShapes.STAIRS, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.SOUL_ICE_STAIRS.get()));
	public static final RegistrySupplier<Item> SOUL_ICE_WALL = ConsistencyPlusMain.ITEMS.register("soul_ice_wall", () -> new RedirectedBlockItem((isSoulIceLoaded) ? Registry.BLOCK.get(new Identifier("soul_ice", "soul_ice_wall")) : DYED_ICE.getDyedBlock(DyeColor.BLUE, BlockShapes.WALL, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.SOUL_ICE_WALL.get()));
	public static final RegistrySupplier<Item> SOUL_ICE_GATE = ConsistencyPlusMain.ITEMS.register("soul_ice_gate", () -> new RedirectedBlockItem((isSoulIceLoaded) ? Registry.BLOCK.get(new Identifier("soul_ice", "soul_ice_gate")) : DYED_ICE.getDyedBlock(DyeColor.BLUE, BlockShapes.GATE, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.SOUL_ICE_GATE.get()));

	public static void init() {
	}
}
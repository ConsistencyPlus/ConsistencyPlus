package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.BlockVariations;
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
import static net.minecraft.block.Blocks.*;

public class CPlusItems {
	/*
	templates:
	block item: public static final Item SMOOTH_STONE_WALL = register("smooth_stone_wall", new BlockItem(CPlusCPlusBlocks.SMOOTH_STONE_WALL, CPlusCPlusItemGroups.consistencyPlusStoneItemSettings()));
	 */

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ConsistencyPlusMain.ID, Registry.ITEM_KEY);

	// STONE
	// Base
	// Mossy Cobblestone
	public static final Item MOSSY_COBBLESTONE_GATE = register("mossy_cobblestone_gate", new BlockItem(CPlusBlocks.MOSSY_COBBLESTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Stone Bricks
	public static final Item MOSSY_STONE_BRICK_GATE = register("mossy_stone_brick_gate", new BlockItem(CPlusBlocks.MOSSY_STONE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Stone Bricks
	public static final Item CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab", new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_STONE_BRICK_GATE = register("cracked_stone_brick_gate", new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


	// Mossy Stone Pillar
	public static final Item MOSSY_STONE_PILLAR = register("mossy_stone_pillar", new BlockItem(CPlusBlocks.MOSSY_STONE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_STONE_CORNER_PILLAR = register("mossy_stone_corner_pillar", new BlockItem(CPlusBlocks.MOSSY_STONE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Stone Pillar
	public static final Item CRACKED_STONE_PILLAR = register("cracked_stone_pillar", new BlockItem(CPlusBlocks.CRACKED_STONE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_STONE_CORNER_PILLAR = register("cracked_stone_corner_pillar", new BlockItem(CPlusBlocks.CRACKED_STONE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Chiseled Stone
	public static final Item MOSSY_CHISELED_STONE = register("mossy_chiseled_stone", new BlockItem(CPlusBlocks.MOSSY_CHISELED_STONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Chiseled Stone
	public static final Item CRACKED_CHISELED_STONE = register("cracked_chiseled_stone", new BlockItem(CPlusBlocks.CRACKED_CHISELED_STONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


// ANDESITE

	// Base
	// Mossy Base
	public static final Item MOSSY_ANDESITE = register("mossy_andesite", new BlockItem(CPlusBlocks.MOSSY_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_SLAB = register("mossy_andesite_slab", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_STAIRS = register("mossy_andesite_stairs", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_WALL = register("mossy_andesite_wall", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_GATE = register("mossy_andesite_gate", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Polished Andesite
	public static final Item MOSSY_POLISHED_ANDESITE = register("mossy_polished_andesite", new BlockItem(CPlusBlocks.MOSSY_POLISHED_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_POLISHED_ANDESITE_SLAB = register("mossy_polished_andesite_slab", new BlockItem(CPlusBlocks.MOSSY_POLISHED_ANDESITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_POLISHED_ANDESITE_STAIRS = register("mossy_polished_andesite_stairs", new BlockItem(CPlusBlocks.MOSSY_POLISHED_ANDESITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_POLISHED_ANDESITE_WALL = register("mossy_polished_andesite_wall", new BlockItem(CPlusBlocks.MOSSY_POLISHED_ANDESITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_POLISHED_ANDESITE_GATE = register("mossy_polished_andesite_gate", new BlockItem(CPlusBlocks.MOSSY_POLISHED_ANDESITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Polished Andesite
	public static final Item CRACKED_POLISHED_ANDESITE = register("cracked_polished_andesite", new BlockItem(CPlusBlocks.CRACKED_POLISHED_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_POLISHED_ANDESITE_SLAB = register("cracked_polished_andesite_slab", new BlockItem(CPlusBlocks.CRACKED_POLISHED_ANDESITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_POLISHED_ANDESITE_STAIRS = register("cracked_polished_andesite_stairs", new BlockItem(CPlusBlocks.CRACKED_POLISHED_ANDESITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_POLISHED_ANDESITE_WALL = register("cracked_polished_andesite_wall", new BlockItem(CPlusBlocks.CRACKED_POLISHED_ANDESITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_POLISHED_ANDESITE_GATE = register("cracked_polished_andesite_gate", new BlockItem(CPlusBlocks.CRACKED_POLISHED_ANDESITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


	// Mossy Smooth Andesite
	public static final Item MOSSY_SMOOTH_ANDESITE = register("mossy_smooth_andesite", new BlockItem(CPlusBlocks.MOSSY_SMOOTH_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_SMOOTH_ANDESITE_SLAB = register("mossy_smooth_andesite_slab", new BlockItem(CPlusBlocks.MOSSY_SMOOTH_ANDESITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_SMOOTH_ANDESITE_STAIRS = register("mossy_smooth_andesite_stairs", new BlockItem(CPlusBlocks.MOSSY_SMOOTH_ANDESITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_SMOOTH_ANDESITE_WALL = register("mossy_smooth_andesite_wall", new BlockItem(CPlusBlocks.MOSSY_SMOOTH_ANDESITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_SMOOTH_ANDESITE_GATE = register("mossy_smooth_andesite_gate", new BlockItem(CPlusBlocks.MOSSY_SMOOTH_ANDESITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Smooth Andesite
	public static final Item CRACKED_SMOOTH_ANDESITE = register("cracked_smooth_andesite", new BlockItem(CPlusBlocks.CRACKED_SMOOTH_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_SMOOTH_ANDESITE_SLAB = register("cracked_smooth_andesite_slab", new BlockItem(CPlusBlocks.CRACKED_SMOOTH_ANDESITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_SMOOTH_ANDESITE_STAIRS = register("cracked_smooth_andesite_stairs", new BlockItem(CPlusBlocks.CRACKED_SMOOTH_ANDESITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_SMOOTH_ANDESITE_WALL = register("cracked_smooth_andesite_wall", new BlockItem(CPlusBlocks.CRACKED_SMOOTH_ANDESITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_SMOOTH_ANDESITE_GATE = register("cracked_smooth_andesite_gate", new BlockItem(CPlusBlocks.CRACKED_SMOOTH_ANDESITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


	// Mossy Andesite Bricks
	public static final Item MOSSY_ANDESITE_BRICKS = register("mossy_andesite_bricks", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_BRICKS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_BRICK_SLAB = register("mossy_andesite_brick_slab", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_BRICK_STAIRS = register("mossy_andesite_brick_stairs", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_BRICK_WALL = register("mossy_andesite_brick_wall", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_BRICK_GATE = register("mossy_andesite_brick_gate", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Andesite Bricks
	public static final Item CRACKED_ANDESITE_BRICKS = register("cracked_andesite_bricks", new BlockItem(CPlusBlocks.CRACKED_ANDESITE_BRICKS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_ANDESITE_BRICK_SLAB = register("cracked_andesite_brick_slab", new BlockItem(CPlusBlocks.CRACKED_ANDESITE_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_ANDESITE_BRICK_STAIRS = register("cracked_andesite_brick_stairs", new BlockItem(CPlusBlocks.CRACKED_ANDESITE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_ANDESITE_BRICK_WALL = register("cracked_andesite_brick_wall", new BlockItem(CPlusBlocks.CRACKED_ANDESITE_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_ANDESITE_BRICK_GATE = register("cracked_andesite_brick_gate", new BlockItem(CPlusBlocks.CRACKED_ANDESITE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


	// Mossy Cut Andesite
	public static final Item MOSSY_CUT_ANDESITE = register("mossy_cut_andesite", new BlockItem(CPlusBlocks.MOSSY_CUT_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_CUT_ANDESITE_SLAB = register("mossy_cut_andesite_slab", new BlockItem(CPlusBlocks.MOSSY_CUT_ANDESITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_CUT_ANDESITE_STAIRS = register("mossy_cut_andesite_stairs", new BlockItem(CPlusBlocks.MOSSY_CUT_ANDESITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_CUT_ANDESITE_WALL = register("mossy_cut_andesite_wall", new BlockItem(CPlusBlocks.MOSSY_CUT_ANDESITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_CUT_ANDESITE_GATE = register("mossy_cut_andesite_gate", new BlockItem(CPlusBlocks.MOSSY_CUT_ANDESITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Cut Andesite
	public static final Item CRACKED_CUT_ANDESITE = register("cracked_cut_andesite", new BlockItem(CPlusBlocks.CRACKED_CUT_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_CUT_ANDESITE_SLAB = register("cracked_cut_andesite_slab", new BlockItem(CPlusBlocks.CRACKED_CUT_ANDESITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_CUT_ANDESITE_STAIRS = register("cracked_cut_andesite_stairs", new BlockItem(CPlusBlocks.CRACKED_CUT_ANDESITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_CUT_ANDESITE_WALL = register("cracked_cut_andesite_wall", new BlockItem(CPlusBlocks.CRACKED_CUT_ANDESITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_CUT_ANDESITE_GATE = register("cracked_cut_andesite_gate", new BlockItem(CPlusBlocks.CRACKED_CUT_ANDESITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Andesite Tiles
	public static final Item MOSSY_ANDESITE_TILES = register("mossy_andesite_tiles", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_TILES, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_TILE_SLAB = register("mossy_andesite_tile_slab", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_TILE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_TILE_STAIRS = register("mossy_andesite_tile_stairs", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_TILE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_TILE_WALL = register("mossy_andesite_tile_wall", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_TILE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_TILE_GATE = register("mossy_andesite_tile_gate", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Andesite Tiles
	public static final Item CRACKED_ANDESITE_TILES = register("cracked_andesite_tiles", new BlockItem(CPlusBlocks.CRACKED_ANDESITE_TILES, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_ANDESITE_TILE_SLAB = register("cracked_andesite_tile_slab", new BlockItem(CPlusBlocks.CRACKED_ANDESITE_TILE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_ANDESITE_TILE_STAIRS = register("cracked_andesite_tile_stairs", new BlockItem(CPlusBlocks.CRACKED_ANDESITE_TILE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_ANDESITE_TILE_WALL = register("cracked_andesite_tile_wall", new BlockItem(CPlusBlocks.CRACKED_ANDESITE_TILE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_ANDESITE_TILE_GATE = register("cracked_andesite_tile_gate", new BlockItem(CPlusBlocks.CRACKED_ANDESITE_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Andesite Pillar

	// Mossy Andesite Pillar
	public static final Item MOSSY_ANDESITE_PILLAR = register("mossy_andesite_pillar", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_CORNER_PILLAR = register("mossy_andesite_corner_pillar", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Andesite Pillar
	public static final Item CRACKED_ANDESITE_PILLAR = register("cracked_andesite_pillar", new BlockItem(CPlusBlocks.CRACKED_ANDESITE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_ANDESITE_CORNER_PILLAR = register("cracked_andesite_corner_pillar", new BlockItem(CPlusBlocks.CRACKED_ANDESITE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled andesite

	// Mossy Chiseled Andesite
	public static final Item MOSSY_CHISELED_ANDESITE = register("mossy_chiseled_andesite", new BlockItem(CPlusBlocks.MOSSY_CHISELED_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Chiseled Andesite
	public static final Item CRACKED_CHISELED_ANDESITE = register("cracked_chiseled_andesite", new BlockItem(CPlusBlocks.CRACKED_CHISELED_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved Andesite

	// Mossy Carved Andesite
	public static final Item MOSSY_CARVED_ANDESITE = register("mossy_carved_andesite", new BlockItem(CPlusBlocks.MOSSY_CARVED_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Carved Andesite
	public static final Item CRACKED_CARVED_ANDESITE = register("cracked_carved_andesite", new BlockItem(CPlusBlocks.CRACKED_CARVED_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


// DEEPSLATE
	// Cracked Deepslate Bricks
	public static final Item CRACKED_DEEPSLATE_BRICK_SLAB = register("cracked_deepslate_brick_slab", new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_DEEPSLATE_BRICK_STAIRS = register("cracked_deepslate_brick_stairs", new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_DEEPSLATE_BRICK_WALL = register("cracked_deepslate_brick_wall", new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_DEEPSLATE_BRICK_GATE = register("cracked_deepslate_brick_gate", new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Deepslate Tiles
	public static final Item CRACKED_DEEPSLATE_TILE_SLAB = register("cracked_deepslate_tile_slab", new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_DEEPSLATE_TILE_STAIRS = register("cracked_deepslate_tile_stairs", new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_DEEPSLATE_TILE_WALL = register("cracked_deepslate_tile_wall", new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_DEEPSLATE_TILE_GATE = register("cracked_deepslate_tile_gate", new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


	// Mossy Blackstone Bricks
	public static final Item MOSSY_BLACKSTONE_BRICKS = register("mossy_blackstone_bricks", new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICKS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_BLACKSTONE_BRICK_SLAB = register("mossy_blackstone_brick_slab", new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_BLACKSTONE_BRICK_STAIRS = register("mossy_blackstone_brick_stairs", new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_BLACKSTONE_BRICK_WALL = register("mossy_blackstone_brick_wall", new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_BLACKSTONE_BRICK_GATE = register("mossy_blackstone_brick_gate", new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Blackstone Bricks
	public static final Item CRACKED_BLACKSTONE_BRICK_SLAB = register("cracked_blackstone_brick_slab", new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_BLACKSTONE_BRICK_STAIRS = register("cracked_blackstone_brick_stairs", new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_BLACKSTONE_BRICK_WALL = register("cracked_blackstone_brick_wall", new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_BLACKSTONE_BRICK_GATE = register("cracked_blackstone_brick_gate", new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	public static final Item MOSSY_BLACKSTONE_PILLAR = register("mossy_blackstone_pillar", new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_BLACKSTONE_CORNER_PILLAR = register("mossy_blackstone_corner_pillar", new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_BLACKSTONE_PILLAR = register("cracked_blackstone_pillar", new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_BLACKSTONE_CORNER_PILLAR = register("cracked_blackstone_corner_pillar", new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_CHISELED_BLACKSTONE = register("mossy_chiseled_blackstone", new BlockItem(CPlusBlocks.MOSSY_CHISELED_BLACKSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_CHISELED_BLACKSTONE = register("cracked_chiseled_blackstone", new BlockItem(CPlusBlocks.CRACKED_CHISELED_BLACKSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_CARVED_BLACKSTONE = register("mossy_carved_blackstone", new BlockItem(CPlusBlocks.MOSSY_CARVED_BLACKSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_CARVED_BLACKSTONE = register("cracked_carved_blackstone", new BlockItem(CPlusBlocks.CRACKED_CARVED_BLACKSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


// QUARTZ
	// Cracked Purpur Bricks
	public static final Item CRACKED_PURPUR_BRICKS = register("cracked_purpur_bricks", new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICKS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_PURPUR_BRICK_SLAB = register("cracked_purpur_brick_slab", new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_PURPUR_BRICK_STAIRS = register("cracked_purpur_brick_stairs", new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_PURPUR_BRICK_WALL = register("cracked_purpur_brick_wall", new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_PURPUR_BRICK_GATE = register("cracked_purpur_brick_gate", new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));


	public static final Item CRACKED_NETHER_BRICK_SLAB = register("cracked_nether_brick_slab", new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_NETHER_BRICK_STAIRS = register("cracked_nether_brick_stairs", new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_NETHER_BRICK_WALL = register("cracked_nether_brick_wall", new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_NETHER_BRICK_FENCE_GATE = register("cracked_nether_brick_fence_gate", new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_FENCE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

// RED GLAZED TERRACOTTA
	public static final Item POLISHED_RED_GLAZED_TERRACOTTA = register("polished_red_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_RED_GLAZED_TERRACOTTA_SLAB = register("polished_red_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_RED_GLAZED_TERRACOTTA_STAIRS = register("polished_red_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_RED_GLAZED_TERRACOTTA_WALL = register("polished_red_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_RED_GLAZED_TERRACOTTA_GATE = register("polished_red_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// ORANGE GLAZED TERRACOTTA
	public static final Item POLISHED_ORANGE_GLAZED_TERRACOTTA = register("polished_orange_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_ORANGE_GLAZED_TERRACOTTA_SLAB = register("polished_orange_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_ORANGE_GLAZED_TERRACOTTA_STAIRS = register("polished_orange_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_ORANGE_GLAZED_TERRACOTTA_WALL = register("polished_orange_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_ORANGE_GLAZED_TERRACOTTA_GATE = register("polished_orange_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// YELLOW GLAZED TERRACOTTA
	public static final Item POLISHED_YELLOW_GLAZED_TERRACOTTA = register("polished_yellow_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_YELLOW_GLAZED_TERRACOTTA_SLAB = register("polished_yellow_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_YELLOW_GLAZED_TERRACOTTA_STAIRS = register("polished_yellow_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_YELLOW_GLAZED_TERRACOTTA_WALL = register("polished_yellow_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_YELLOW_GLAZED_TERRACOTTA_GATE = register("polished_yellow_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// LIME GLAZED TERRACOTTA
	public static final Item POLISHED_LIME_GLAZED_TERRACOTTA = register("polished_lime_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIME_GLAZED_TERRACOTTA_SLAB = register("polished_lime_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIME_GLAZED_TERRACOTTA_STAIRS = register("polished_lime_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIME_GLAZED_TERRACOTTA_WALL = register("polished_lime_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIME_GLAZED_TERRACOTTA_GATE = register("polished_lime_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// GREEN GLAZED TERRACOTTA
	public static final Item POLISHED_GREEN_GLAZED_TERRACOTTA = register("polished_green_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GREEN_GLAZED_TERRACOTTA_SLAB = register("polished_green_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GREEN_GLAZED_TERRACOTTA_STAIRS = register("polished_green_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GREEN_GLAZED_TERRACOTTA_WALL = register("polished_green_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GREEN_GLAZED_TERRACOTTA_GATE = register("polished_green_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// BLUE GLAZED TERRACOTTA
	public static final Item POLISHED_BLUE_GLAZED_TERRACOTTA = register("polished_blue_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLUE_GLAZED_TERRACOTTA_SLAB = register("polished_blue_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLUE_GLAZED_TERRACOTTA_STAIRS = register("polished_blue_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLUE_GLAZED_TERRACOTTA_WALL = register("polished_blue_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLUE_GLAZED_TERRACOTTA_GATE = register("polished_blue_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// CYAN GLAZED TERRACOTTA
	public static final Item POLISHED_CYAN_GLAZED_TERRACOTTA = register("polished_cyan_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_CYAN_GLAZED_TERRACOTTA_SLAB = register("polished_cyan_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_CYAN_GLAZED_TERRACOTTA_STAIRS = register("polished_cyan_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_CYAN_GLAZED_TERRACOTTA_WALL = register("polished_cyan_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_CYAN_GLAZED_TERRACOTTA_GATE = register("polished_cyan_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// LIGHT BLUE GLAZED TERRACOTTA
	public static final Item POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA = register("polished_light_blue_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = register("polished_light_blue_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = register("polished_light_blue_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = register("polished_light_blue_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_GATE = register("polished_light_blue_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// PURPLE GLAZED TERRACOTTA
	public static final Item POLISHED_PURPLE_GLAZED_TERRACOTTA = register("polished_purple_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PURPLE_GLAZED_TERRACOTTA_SLAB = register("polished_purple_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PURPLE_GLAZED_TERRACOTTA_STAIRS = register("polished_purple_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PURPLE_GLAZED_TERRACOTTA_WALL = register("polished_purple_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PURPLE_GLAZED_TERRACOTTA_GATE = register("polished_purple_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// MAGENTA GLAZED TERRACOTTA
	public static final Item POLISHED_MAGENTA_GLAZED_TERRACOTTA = register("polished_magenta_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_MAGENTA_GLAZED_TERRACOTTA_SLAB = register("polished_magenta_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_MAGENTA_GLAZED_TERRACOTTA_STAIRS = register("polished_magenta_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_MAGENTA_GLAZED_TERRACOTTA_WALL = register("polished_magenta_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_MAGENTA_GLAZED_TERRACOTTA_GATE = register("polished_magenta_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// PINK GLAZED TERRACOTTA
	public static final Item POLISHED_PINK_GLAZED_TERRACOTTA = register("polished_pink_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PINK_GLAZED_TERRACOTTA_SLAB = register("polished_pink_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PINK_GLAZED_TERRACOTTA_STAIRS = register("polished_pink_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PINK_GLAZED_TERRACOTTA_WALL = register("polished_pink_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PINK_GLAZED_TERRACOTTA_GATE = register("polished_pink_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// WHITE GLAZED TERRACOTTA
	public static final Item POLISHED_WHITE_GLAZED_TERRACOTTA = register("polished_white_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_WHITE_GLAZED_TERRACOTTA_SLAB = register("polished_white_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_WHITE_GLAZED_TERRACOTTA_STAIRS = register("polished_white_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_WHITE_GLAZED_TERRACOTTA_WALL = register("polished_white_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_WHITE_GLAZED_TERRACOTTA_GATE = register("polished_white_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// LIGHT GRAY GLAZED TERRACOTTA
	public static final Item POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA = register("polished_light_gray_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = register("polished_light_gray_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = register("polished_light_gray_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = register("polished_light_gray_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_GATE = register("polished_light_gray_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// GRAY GLAZED TERRACOTTA
	public static final Item POLISHED_GRAY_GLAZED_TERRACOTTA = register("polished_gray_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GRAY_GLAZED_TERRACOTTA_SLAB = register("polished_gray_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GRAY_GLAZED_TERRACOTTA_STAIRS = register("polished_gray_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GRAY_GLAZED_TERRACOTTA_WALL = register("polished_gray_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GRAY_GLAZED_TERRACOTTA_GATE = register("polished_gray_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// BLACK GLAZED TERRACOTTA
	public static final Item POLISHED_BLACK_GLAZED_TERRACOTTA = register("polished_black_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLACK_GLAZED_TERRACOTTA_SLAB = register("polished_black_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLACK_GLAZED_TERRACOTTA_STAIRS = register("polished_black_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLACK_GLAZED_TERRACOTTA_WALL = register("polished_black_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLACK_GLAZED_TERRACOTTA_GATE = register("polished_black_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// BROWN GLAZED TERRACOTTA
	public static final Item POLISHED_BROWN_GLAZED_TERRACOTTA = register("polished_brown_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BROWN_GLAZED_TERRACOTTA_SLAB = register("polished_brown_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BROWN_GLAZED_TERRACOTTA_STAIRS = register("polished_brown_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BROWN_GLAZED_TERRACOTTA_WALL = register("polished_brown_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BROWN_GLAZED_TERRACOTTA_GATE = register("polished_brown_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


	// Soul
	public static final Item SOUL_GLOWSTONE = register("soul_glowstone", new BlockItem(CPlusBlocks.SOUL_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SOUL_GLOWSTONE_SLAB = register("soul_glowstone_slab", new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SOUL_GLOWSTONE_STAIRS = register("soul_glowstone_stairs", new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SOUL_GLOWSTONE_WALL = register("soul_glowstone_wall", new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SOUL_GLOWSTONE_GATE = register("soul_glowstone_gate", new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// ORGANICS

	// Dirt
	public static final Item DIRT_SLAB = register("dirt_slab", new BlockItem(CPlusBlocks.DIRT_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item DIRT_STAIRS = register("dirt_stairs", new BlockItem(CPlusBlocks.DIRT_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item DIRT_WALL = register("dirt_wall", new BlockItem(CPlusBlocks.DIRT_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Grass
	public static final Item GRASS_SLAB = register("grass_slab", new BlockItem(CPlusBlocks.GRASS_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item GRASS_STAIRS = register("grass_stairs", new BlockItem(CPlusBlocks.GRASS_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item GRASS_WALL = register("grass_wall", new BlockItem(CPlusBlocks.GRASS_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Mycelium
	public static final Item MYCELIUM_SLAB = register("mycelium_slab", new BlockItem(CPlusBlocks.MYCELIUM_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item MYCELIUM_STAIRS = register("mycelium_stairs", new BlockItem(CPlusBlocks.MYCELIUM_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item MYCELIUM_WALL = register("mycelium_wall", new BlockItem(CPlusBlocks.MYCELIUM_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));


// MISC

	public static final Item JACK_O_SOUL = register("jack_o_soul", new BlockItem(CPlusBlocks.JACK_O_SOUL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item PINEAPPLE = register("pineapple", new BlockItem(CPlusBlocks.PINEAPPLE, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item KFP_BLOCK = register("kfp_block", new BlockItem(CPlusBlocks.KFP_BLOCK, new Item.Settings()));
	public static final Item NETHERITE_STAIRS = register("netherite_stairs", new BlockItem(CPlusBlocks.NETHERITE_STAIRS, new Item.Settings()));
	public static final Item SUSPICIOUS_SLAB = register("suspicious_slab", new BlockItem(CPlusBlocks.SUSPICIOUS_SLAB, new Item.Settings()));
	public static final Item JET = register("jet", new BlockItem(CPlusBlocks.JET, new Item.Settings()));
	public static final Item NUBERT = register("nubert", new BlockItem(CPlusBlocks.NUBERT, new Item.Settings().fireproof().rarity(Rarity.EPIC)));
	public static final Item WIGGED_NUBERT = register("wigged_nubert", new BlockItem(CPlusBlocks.WIGGED_NUBERT, new Item.Settings().fireproof().rarity(Rarity.EPIC)));
	public static final Item NUBERT_MINECART = register("nubert_minecart", new NubertMinecartItem(new Item.Settings().maxCount(1), false));
	public static final Item WIGGED_NUBERT_MINECART = register("wigged_nubert_minecart", new NubertMinecartItem(new Item.Settings().maxCount(1), true));


// ITEMS

	// Random
	public static final Item WARPED_WART = register("warped_wart", new AliasedBlockItem(CPlusBlocks.WARPED_WART, new Item.Settings().group(ItemGroup.MISC)));
	public static final Item COPPER_NUGGET = register("copper_nugget", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item NETHERITE_NUGGET = register("netherite_nugget", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item NETHERITE_HORSE_ARMOR = register("netherite_horse_armor", new NetheriteHorseArmorItem(15, "netherite", new Item.Settings().maxCount(1).fireproof().group(ItemGroup.MISC)));
	public static final Item WITHERED_BONE = register("withered_bone", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item WITHERED_BONE_MEAL = register("withered_bone_meal", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item GLOW_INK_SAC = register("glow_ink_sac", new Item(new Item.Settings().group(ItemGroup.MISC)));


//brickbrickbrickbrick
	public static final Item RED_TERRACOTTA_BRICK = register("red_terracotta_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item ORANGE_TERRACOTTA_BRICK = register("orange_terracotta_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item YELLOW_TERRACOTTA_BRICK = register("yellow_terracotta_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item LIME_TERRACOTTA_BRICK = register("lime_terracotta_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item GREEN_TERRACOTTA_BRICK = register("green_terracotta_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item BLUE_TERRACOTTA_BRICK = register("blue_terracotta_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item CYAN_TERRACOTTA_BRICK = register("cyan_terracotta_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item LIGHT_BLUE_TERRACOTTA_BRICK = register("light_blue_terracotta_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item PURPLE_TERRACOTTA_BRICK = register("purple_terracotta_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item MAGENTA_TERRACOTTA_BRICK = register("magenta_terracotta_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item PINK_TERRACOTTA_BRICK = register("pink_terracotta_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item WHITE_TERRACOTTA_BRICK = register("white_terracotta_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item LIGHT_TERRACOTTA_GRAY_BRICK = register("light_gray_terracotta_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item GRAY_TERRACOTTA_BRICK = register("gray_terracotta_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item BLACK_TERRACOTTA_BRICK = register("black_terracotta_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item BROWN_TERRACOTTA_BRICK = register("brown_terracotta_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item CRIMSON_WART_BRICK = register("crimson_wart_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final Item WARPED_WART_BRICK = register("warped_wart_brick", new Item(new Item.Settings().group(ItemGroup.MISC)));



	// 🐢
	public static final Item TURTLE_CHESTPLATE = register("turtle_chestplate", new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item TURTLE_LEGGINGS = register("turtle_leggings", new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item TURTLE_BOOTS = register("turtle_boots", new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));

	// Bundles
	public static final Item RED_BUNDLE = register("red_dyed_bundle", new BundleItem(new Item.Settings().maxCount(1)));
	public static final Item ORANGE_BUNDLE = register("orange_dyed_bundle", new BundleItem(new Item.Settings().maxCount(1)));
	public static final Item YELLOW_BUNDLE = register("yellow_dyed_bundle", new BundleItem(new Item.Settings().maxCount(1)));
	public static final Item LIME_BUNDLE = register("lime_dyed_bundle", new BundleItem(new Item.Settings().maxCount(1)));
	public static final Item GREEN_BUNDLE = register("green_dyed_bundle", new BundleItem(new Item.Settings().maxCount(1)));
	public static final Item BLUE_BUNDLE = register("blue_dyed_bundle", new BundleItem(new Item.Settings().maxCount(1)));
	public static final Item CYAN_BUNDLE = register("cyan_dyed_bundle", new BundleItem(new Item.Settings().maxCount(1)));
	public static final Item LIGHT_BLUE_BUNDLE = register("light_blue_dyed_bundle", new BundleItem(new Item.Settings().maxCount(1)));
	public static final Item PURPLE_BUNDLE = register("purple_dyed_bundle", new BundleItem(new Item.Settings().maxCount(1)));
	public static final Item MAGENTA_BUNDLE = register("magenta_dyed_bundle", new BundleItem(new Item.Settings().maxCount(1)));
	public static final Item PINK_BUNDLE = register("pink_dyed_bundle", new BundleItem(new Item.Settings().maxCount(1)));
	public static final Item WHITE_BUNDLE = register("white_dyed_bundle", new BundleItem(new Item.Settings().maxCount(1)));
	public static final Item LIGHT_GRAY_BUNDLE = register("light_gray_dyed_bundle", new BundleItem(new Item.Settings().maxCount(1)));
	public static final Item GRAY_BUNDLE = register("gray_dyed_bundle", new BundleItem(new Item.Settings().maxCount(1)));
	public static final Item BROWN_BUNDLE = register("brown_dyed_bundle", new BundleItem(new Item.Settings().maxCount(1)));
	public static final Item BLACK_BUNDLE = register("black_dyed_bundle", new BundleItem(new Item.Settings().maxCount(1)));


// Deprecated Blocks
	public static final Item CARVED_STONE_BRICKS = register("carved_stone_bricks", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("stone", BlockVariations.CARVED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CARVED_STONE_BRICKS));
	public static final Item STONE_BRICK_PILLAR = register("stone_brick_pillar", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("stone", BlockVariations.PILLAR, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.STONE_BRICK_PILLAR));
	public static final Item MOSSY_STONE_BRICK_PILLAR = register("mossy_stone_brick_pillar", new RedirectedBlockItem(CPlusBlocks.MOSSY_STONE_PILLAR, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.MOSSY_STONE_BRICK_PILLAR));
	public static final Item CRACKED_STONE_BRICK_PILLAR = register("cracked_stone_brick_pillar", new RedirectedBlockItem(CPlusBlocks.CRACKED_STONE_PILLAR, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_STONE_BRICK_PILLAR));
	public static final Item CRACKED_CHISELED_STONE_BRICKS = register("cracked_chiseled_stone_bricks", new RedirectedBlockItem(CPlusBlocks.CRACKED_CHISELED_STONE_BRICKS, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_CHISELED_STONE));
	public static final Item MOSSY_CHISELED_STONE_BRICKS = register("mossy_chiseled_stone_bricks", new RedirectedBlockItem(CPlusBlocks.MOSSY_CHISELED_STONE, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.MOSSY_CHISELED_STONE_BRICKS));
	public static final Item BLACKSTONE_BRICK_PILLAR = register("blackstone_brick_pillar", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("blackstone", BlockVariations.PILLAR, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLACKSTONE_BRICK_PILLAR));
	public static final Item CRACKED_BLACKSTONE_BRICK_PILLAR = register("cracked_blackstone_brick_pillar", new RedirectedBlockItem(CPlusBlocks.CRACKED_BLACKSTONE_PILLAR, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLACKSTONE_BRICK_PILLAR));
	public static final Item MOSSY_BLACKSTONE_BRICK_PILLAR = register("mossy_blackstone_brick_pillar", new RedirectedBlockItem(CPlusBlocks.MOSSY_BLACKSTONE_PILLAR, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.MOSSY_BLACKSTONE_BRICK_PILLAR));
	public static final Item CHISELED_BRICKS = register("chiseled_bricks", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("terracotta", BlockVariations.CHISELED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CHISELED_BRICKS));
	public static final Item BRICK_PILLAR = register("brick_pillar", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("terracotta", BlockVariations.PILLAR, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BRICK_PILLAR));
	public static final Item CARVED_BRICKS = register("carved_bricks", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("terracotta", BlockVariations.CARVED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CARVED_BRICKS));
	public static final Item SMOOTH_PURPUR_BLOCK = register("smooth_purpur_block", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("purpur", BlockVariations.BLOCK, BlockTypes.SMOOTH), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.SMOOTH_PURPUR_BLOCK));
	public static final Item POLISHED_PURPUR_BLOCK = register("polished_purpur_block", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("purpur", BlockVariations.BLOCK, BlockTypes.POLISHED), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.POLISHED_PURPUR_BLOCK));
	public static final Item CHISELED_PURPUR_BLOCK = register("chiseled_purpur_block", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("purpur", BlockVariations.CHISELED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CHISELED_PURPUR_BLOCK));
	public static final Item END_STONE_BRICK_PILLAR = register("end_stone_brick_pillar", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("end_stone", BlockVariations.PILLAR, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.END_STONE_BRICK_PILLAR));
	public static final Item NETHER_BRICK_PILLAR = register("nether_brick_pillar", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("netherrack", BlockVariations.PILLAR, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.NETHER_BRICK_PILLAR));
	public static final Item CHISELED_NETHER_BRICKS = register("chiseled_nether_bricks", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("netherrack", BlockVariations.CHISELED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CHISELED_NETHER_BRICKS));
	public static final Item BLUE_NETHER_BRICKS = register("blue_nether_bricks", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.BLOCK, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICKS));
	public static final Item BLUE_NETHER_BRICK_SLAB = register("blue_nether_brick_slab", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.SLAB, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICK_SLAB));
	public static final Item BLUE_NETHER_BRICK_STAIRS = register("blue_nether_brick_stairs", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.STAIRS, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICK_STAIRS));
	public static final Item BLUE_NETHER_BRICK_WALL = register("blue_nether_brick_wall", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.WALL, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICK_WALL));
	public static final Item BLUE_NETHER_BRICK_FENCE_GATE = register("blue_nether_brick_fence_gate", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.GATE, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICK_FENCE_GATE));
	public static final Item CRACKED_BLUE_NETHER_BRICKS = register("cracked_blue_nether_bricks", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.BLOCK, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLUE_NETHER_BRICKS));
	public static final Item CRACKED_BLUE_NETHER_BRICK_SLAB = register("cracked_blue_nether_brick_slab", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.SLAB, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB));
	public static final Item CRACKED_BLUE_NETHER_BRICK_STAIRS = register("cracked_blue_nether_brick_stairs", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.STAIRS, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS));
	public static final Item CRACKED_BLUE_NETHER_BRICK_WALL = register("cracked_blue_nether_brick_wall", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.WALL, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_WALL));
	public static final Item CRACKED_BLUE_NETHER_BRICK_FENCE_GATE = register("cracked_blue_nether_brick_fence_gate", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.GATE, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE));
	public static final Item BLUE_NETHER_BRICK_PILLAR = register("blue_nether_brick_pillar", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.PILLAR, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLUE_NETHER_BRICK_PILLAR));
	public static final Item CHISELED_BLUE_NETHER_BRICKS = register("chiseled_blue_nether_bricks", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.CHISELED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CHISELED_BLUE_NETHER_BRICKS));
	public static final Item CARVED_BLUE_NETHER_BRICKS = register("carved_blue_nether_bricks", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("warped_wart", BlockVariations.CARVED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CARVED_BLUE_NETHER_BRICKS));
	public static final Item RED_NETHER_BRICK_FENCE_GATE = register("red_nether_brick_fence_gate", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("crimson_wart", BlockVariations.GATE, BlockTypes.BRICK), CPlusItemGroups.consistencyPlusMiscItemSettings(), CPlusBlocks.RED_NETHER_BRICK_FENCE_GATE));
	public static final Item RED_NETHER_BRICK_PILLAR = register("red_nether_brick_pillar", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("crimson_wart", BlockVariations.PILLAR, BlockTypes.BASE), CPlusItemGroups.consistencyPlusMiscItemSettings(), CPlusBlocks.RED_NETHER_BRICK_PILLAR));
	public static final Item CHISELED_RED_NETHER_BRICKS = register("chiseled_red_nether_bricks", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("crimson_wart", BlockVariations.CHISELED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusMiscItemSettings(), CPlusBlocks.CHISELED_RED_NETHER_BRICKS));
	public static final Item CARVED_RED_NETHER_BRICKS = register("carved_red_nether_bricks", new RedirectedBlockItem(CPlusEnhancedRegistry.getBlock("crimson_wart", BlockVariations.CARVED, BlockTypes.BASE), CPlusItemGroups.consistencyPlusMiscItemSettings(), CPlusBlocks.CARVED_RED_NETHER_BRICKS));



	// Red
	public static final Item RED_ICE = register("red_ice", new BlockItem(CPlusBlocks.RED_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_ICE_SLAB = register("red_ice_slab", new BlockItem(CPlusBlocks.RED_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_ICE_STAIRS = register("red_ice_stairs", new BlockItem(CPlusBlocks.RED_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_ICE_WALL = register("red_ice_wall", new BlockItem(CPlusBlocks.RED_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_ICE_GATE = register("red_ice_gate", new BlockItem(CPlusBlocks.RED_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_ICE = register("orange_ice", new BlockItem(CPlusBlocks.ORANGE_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_ICE_SLAB = register("orange_ice_slab", new BlockItem(CPlusBlocks.ORANGE_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_ICE_STAIRS = register("orange_ice_stairs", new BlockItem(CPlusBlocks.ORANGE_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_ICE_WALL = register("orange_ice_wall", new BlockItem(CPlusBlocks.ORANGE_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_ICE_GATE = register("orange_ice_gate", new BlockItem(CPlusBlocks.ORANGE_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_ICE = register("yellow_ice", new BlockItem(CPlusBlocks.YELLOW_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_ICE_SLAB = register("yellow_ice_slab", new BlockItem(CPlusBlocks.YELLOW_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_ICE_STAIRS = register("yellow_ice_stairs", new BlockItem(CPlusBlocks.YELLOW_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_ICE_WALL = register("yellow_ice_wall", new BlockItem(CPlusBlocks.YELLOW_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_ICE_GATE = register("yellow_ice_gate", new BlockItem(CPlusBlocks.YELLOW_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_ICE = register("lime_ice", new BlockItem(CPlusBlocks.LIME_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_ICE_SLAB = register("lime_ice_slab", new BlockItem(CPlusBlocks.LIME_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_ICE_STAIRS = register("lime_ice_stairs", new BlockItem(CPlusBlocks.LIME_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_ICE_WALL = register("lime_ice_wall", new BlockItem(CPlusBlocks.LIME_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_ICE_GATE = register("lime_ice_gate", new BlockItem(CPlusBlocks.LIME_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_ICE = register("green_ice", new BlockItem(CPlusBlocks.GREEN_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_ICE_SLAB = register("green_ice_slab", new BlockItem(CPlusBlocks.GREEN_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_ICE_STAIRS = register("green_ice_stairs", new BlockItem(CPlusBlocks.GREEN_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_ICE_WALL = register("green_ice_wall", new BlockItem(CPlusBlocks.GREEN_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_ICE_GATE = register("green_ice_gate", new BlockItem(CPlusBlocks.GREEN_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_ICE_SLAB = register("blue_ice_slab", new BlockItem(CPlusBlocks.BLUE_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_ICE_STAIRS = register("blue_ice_stairs", new BlockItem(CPlusBlocks.BLUE_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_ICE_WALL = register("blue_ice_wall", new BlockItem(CPlusBlocks.BLUE_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_ICE_GATE = register("blue_ice_gate", new BlockItem(CPlusBlocks.BLUE_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_ICE = register("cyan_ice", new BlockItem(CPlusBlocks.CYAN_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_ICE_SLAB = register("cyan_ice_slab", new BlockItem(CPlusBlocks.CYAN_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_ICE_STAIRS = register("cyan_ice_stairs", new BlockItem(CPlusBlocks.CYAN_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_ICE_WALL = register("cyan_ice_wall", new BlockItem(CPlusBlocks.CYAN_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_ICE_GATE = register("cyan_ice_gate", new BlockItem(CPlusBlocks.CYAN_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_ICE = register("light_blue_ice", new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_ICE_SLAB = register("light_blue_ice_slab", new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_ICE_STAIRS = register("light_blue_ice_stairs", new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_ICE_WALL = register("light_blue_ice_wall", new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_ICE_GATE = register("light_blue_ice_gate", new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_ICE = register("purple_ice", new BlockItem(CPlusBlocks.PURPLE_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_ICE_SLAB = register("purple_ice_slab", new BlockItem(CPlusBlocks.PURPLE_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_ICE_STAIRS = register("purple_ice_stairs", new BlockItem(CPlusBlocks.PURPLE_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_ICE_WALL = register("purple_ice_wall", new BlockItem(CPlusBlocks.PURPLE_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_ICE_GATE = register("purple_ice_gate", new BlockItem(CPlusBlocks.PURPLE_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_ICE = register("magenta_ice", new BlockItem(CPlusBlocks.MAGENTA_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_ICE_SLAB = register("magenta_ice_slab", new BlockItem(CPlusBlocks.MAGENTA_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_ICE_STAIRS = register("magenta_ice_stairs", new BlockItem(CPlusBlocks.MAGENTA_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_ICE_WALL = register("magenta_ice_wall", new BlockItem(CPlusBlocks.MAGENTA_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_ICE_GATE = register("magenta_ice_gate", new BlockItem(CPlusBlocks.MAGENTA_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_ICE = register("pink_ice", new BlockItem(CPlusBlocks.PINK_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_ICE_SLAB = register("pink_ice_slab", new BlockItem(CPlusBlocks.PINK_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_ICE_STAIRS = register("pink_ice_stairs", new BlockItem(CPlusBlocks.PINK_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_ICE_WALL = register("pink_ice_wall", new BlockItem(CPlusBlocks.PINK_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_ICE_GATE = register("pink_ice_gate", new BlockItem(CPlusBlocks.PINK_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_ICE = register("white_ice", new BlockItem(CPlusBlocks.WHITE_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_ICE_SLAB = register("white_ice_slab", new BlockItem(CPlusBlocks.WHITE_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_ICE_STAIRS = register("white_ice_stairs", new BlockItem(CPlusBlocks.WHITE_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_ICE_WALL = register("white_ice_wall", new BlockItem(CPlusBlocks.WHITE_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_ICE_GATE = register("white_ice_gate", new BlockItem(CPlusBlocks.WHITE_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_ICE = register("light_gray_ice", new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_ICE_SLAB = register("light_gray_ice_slab", new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_ICE_STAIRS = register("light_gray_ice_stairs", new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_ICE_WALL = register("light_gray_ice_wall", new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_ICE_GATE = register("light_gray_ice_gate", new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_ICE = register("gray_ice", new BlockItem(CPlusBlocks.GRAY_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_ICE_SLAB = register("gray_ice_slab", new BlockItem(CPlusBlocks.GRAY_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_ICE_STAIRS = register("gray_ice_stairs", new BlockItem(CPlusBlocks.GRAY_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_ICE_WALL = register("gray_ice_wall", new BlockItem(CPlusBlocks.GRAY_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_ICE_GATE = register("gray_ice_gate", new BlockItem(CPlusBlocks.GRAY_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_ICE = register("black_ice", new BlockItem(CPlusBlocks.BLACK_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_ICE_SLAB = register("black_ice_slab", new BlockItem(CPlusBlocks.BLACK_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_ICE_STAIRS = register("black_ice_stairs", new BlockItem(CPlusBlocks.BLACK_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_ICE_WALL = register("black_ice_wall", new BlockItem(CPlusBlocks.BLACK_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_ICE_GATE = register("black_ice_gate", new BlockItem(CPlusBlocks.BLACK_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_ICE = register("brown_ice", new BlockItem(CPlusBlocks.BROWN_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_ICE_SLAB = register("brown_ice_slab", new BlockItem(CPlusBlocks.BROWN_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_ICE_STAIRS = register("brown_ice_stairs", new BlockItem(CPlusBlocks.BROWN_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_ICE_WALL = register("brown_ice_wall", new BlockItem(CPlusBlocks.BROWN_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_ICE_GATE = register("brown_ice_gate", new BlockItem(CPlusBlocks.BROWN_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Soul
	public static final Item SOUL_ICE = soulIceTester("soul_ice", BLUE_ICE, CPlusBlocks.SOUL_ICE);
	public static final Item SOUL_ICE_SLAB = soulIceTester("soul_ice_slab", CPlusBlocks.BLUE_ICE_SLAB, CPlusBlocks.SOUL_ICE_SLAB);
	public static final Item SOUL_ICE_STAIRS = soulIceTester("soul_ice_stairs", CPlusBlocks.BLUE_ICE_STAIRS, CPlusBlocks.SOUL_ICE_STAIRS);
	public static final Item SOUL_ICE_WALL = soulIceTester("soul_ice_wall", CPlusBlocks.BLUE_ICE_WALL, CPlusBlocks.SOUL_ICE_WALL);
	public static final Item SOUL_ICE_GATE = soulIceTester("soul_ice_gate", CPlusBlocks.BLUE_ICE_GATE, CPlusBlocks.SOUL_ICE_GATE);



	protected static Item register(String name, Item item) {
		RegistrySupplier<Item> itemSupplied = ITEMS.register(name, () -> item);
		return item;
	}

	private static Item soulIceTester(String id, Block backupBlock, Block fromBlock) {
		Block toBlock = backupBlock;
		if (isSoulIceLoaded) toBlock = Registry.BLOCK.getOrEmpty(new Identifier("soul_ice", id)).get();

		return register(id, new RedirectedBlockItem(toBlock, CPlusItemGroups.consistencyPlusDeprecatedSettings(), fromBlock));
	}

	public static void init() {
		if (ConsistencyPlusMain.DEVENV) ConsistencyPlusMain.LOGGER.info("CPlusItems - initialization point");
	}
	
	public static void register() {
		ITEMS.register();
	}
}
package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusStairBlock;
import io.github.consistencyplus.consistency_plus.items.NubertMinecartItem;
import io.github.consistencyplus.consistency_plus.items.RedirectedBlockItem;

import io.github.consistencyplus.consistency_plus.items.NetheriteHorseArmorItem;

import net.minecraft.block.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static net.minecraft.block.Blocks.*;
import static net.minecraft.block.Blocks.TERRACOTTA;

public class CPlusItems {
	/*
	templates:
	block item: public static final Item SMOOTH_STONE_WALL = register("smooth_stone_wall", new BlockItem(CPlusCPlusBlocks.SMOOTH_STONE_WALL, CPlusCPlusItemGroups.consistencyPlusStoneItemSettings()));
	 */

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ConsistencyPlusMain.ID, Registry.ITEM_KEY);



	// STONE
	// Base
	public static final Item STONE_WALL = register("stone_wall", new BlockItem(CPlusBlocks.STONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item STONE_GATE = register("stone_gate", new BlockItem(CPlusBlocks.STONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobblestone
	public static final Item COBBLESTONE_GATE = register("cobblestone_gate", new BlockItem(CPlusBlocks.COBBLESTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Cobblestone
	public static final Item MOSSY_COBBLESTONE_GATE = register("mossy_cobblestone_gate", new BlockItem(CPlusBlocks.MOSSY_COBBLESTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Stone
	public static final Item POLISHED_STONE = register("polished_stone", new BlockItem(CPlusBlocks.POLISHED_STONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_STONE_WALL = register("polished_stone_wall", new BlockItem(CPlusBlocks.POLISHED_STONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_STONE_STAIRS = register("polished_stone_stairs", new BlockItem(CPlusBlocks.POLISHED_STONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_STONE_SLAB = register("polished_stone_slab", new BlockItem(CPlusBlocks.POLISHED_STONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_STONE_GATE = register("polished_stone_gate", new BlockItem(CPlusBlocks.POLISHED_STONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Stone
	public static final Item SMOOTH_STONE_WALL = register("smooth_stone_wall", new BlockItem(CPlusBlocks.SMOOTH_STONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_STONE_STAIRS = register("smooth_stone_stairs", new BlockItem(CPlusBlocks.SMOOTH_STONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_STONE_GATE = register("smooth_stone_gate", new BlockItem(CPlusBlocks.SMOOTH_STONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Stone Bricks
	public static final Item STONE_BRICK_GATE = register("stone_brick_gate", new BlockItem(CPlusBlocks.STONE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Stone Bricks
	public static final Item MOSSY_STONE_BRICK_GATE = register("mossy_stone_brick_gate", new BlockItem(CPlusBlocks.MOSSY_STONE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Stone Bricks
	public static final Item CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab", new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_STONE_BRICK_GATE = register("cracked_stone_brick_gate", new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Stone
	public static final Item CUT_STONE = register("cut_stone", new BlockItem(CPlusBlocks.CUT_STONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_STONE_SLAB = register("cut_stone_slab", new BlockItem(CPlusBlocks.CUT_STONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_STONE_STAIRS = register("cut_stone_stairs", new BlockItem(CPlusBlocks.CUT_STONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_STONE_WALL = register("cut_stone_wall", new BlockItem(CPlusBlocks.CUT_STONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_STONE_GATE = register("cut_stone_gate", new BlockItem(CPlusBlocks.CUT_STONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Stone Tiles
	public static final Item STONE_TILES = register("stone_tiles", new BlockItem(CPlusBlocks.STONE_TILES, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item STONE_TILE_SLAB = register("stone_tile_slab", new BlockItem(CPlusBlocks.STONE_TILE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item STONE_TILE_STAIRS = register("stone_tile_stairs", new BlockItem(CPlusBlocks.STONE_TILE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item STONE_TILE_WALL = register("stone_tile_wall", new BlockItem(CPlusBlocks.STONE_TILE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item STONE_TILE_GATE = register("stone_tile_gate", new BlockItem(CPlusBlocks.STONE_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Stone Pillar
	// The block that started it all
	public static final Item STONE_PILLAR = register("stone_pillar", new BlockItem(CPlusBlocks.STONE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item STONE_CORNER_PILLAR = register("stone_corner_pillar", new BlockItem(CPlusBlocks.STONE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

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

	// Carved Stone
	public static final Item CARVED_STONE = register("carved_stone", new BlockItem(CPlusBlocks.CARVED_STONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


// ANDESITE

	// Base
	public static final Item ANDESITE_GATE = register("andesite_gate", new BlockItem(CPlusBlocks.ANDESITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Base
	public static final Item MOSSY_ANDESITE = register("mossy_andesite", new BlockItem(CPlusBlocks.MOSSY_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_SLAB = register("mossy_andesite_slab", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_STAIRS = register("mossy_andesite_stairs", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_WALL = register("mossy_andesite_wall", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_GATE = register("mossy_andesite_gate", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Andesite
	public static final Item COBBLED_ANDESITE = register("cobbled_andesite", new BlockItem(CPlusBlocks.COBBLED_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_ANDESITE_SLAB = register("cobbled_andesite_slab", new BlockItem(CPlusBlocks.COBBLED_ANDESITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_ANDESITE_STAIRS = register("cobbled_andesite_stairs", new BlockItem(CPlusBlocks.COBBLED_ANDESITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_ANDESITE_WALL = register("cobbled_andesite_wall", new BlockItem(CPlusBlocks.COBBLED_ANDESITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_ANDESITE_GATE = register("cobbled_andesite_gate", new BlockItem(CPlusBlocks.COBBLED_ANDESITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Andesite
	public static final Item POLISHED_ANDESITE_WALL = register("polished_andesite_wall", new BlockItem(CPlusBlocks.POLISHED_ANDESITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_ANDESITE_GATE = register("polished_andesite_gate", new BlockItem(CPlusBlocks.POLISHED_ANDESITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

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

	// Smooth Andesite
	public static final Item SMOOTH_ANDESITE = register("smooth_andesite", new BlockItem(CPlusBlocks.SMOOTH_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_ANDESITE_SLAB = register("smooth_andesite_slab", new BlockItem(CPlusBlocks.SMOOTH_ANDESITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_ANDESITE_STAIRS = register("smooth_andesite_stairs", new BlockItem(CPlusBlocks.SMOOTH_ANDESITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_ANDESITE_WALL = register("smooth_andesite_wall", new BlockItem(CPlusBlocks.SMOOTH_ANDESITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_ANDESITE_GATE = register("smooth_andesite_gate", new BlockItem(CPlusBlocks.SMOOTH_ANDESITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

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

	// Andesite Bricks
	public static final Item ANDESITE_BRICKS = register("andesite_bricks", new BlockItem(CPlusBlocks.ANDESITE_BRICKS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item ANDESITE_BRICK_SLAB = register("andesite_brick_slab", new BlockItem(CPlusBlocks.ANDESITE_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item ANDESITE_BRICK_STAIRS = register("andesite_brick_stairs", new BlockItem(CPlusBlocks.ANDESITE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item ANDESITE_BRICK_WALL = register("andesite_brick_wall", new BlockItem(CPlusBlocks.ANDESITE_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item ANDESITE_BRICK_GATE = register("andesite_brick_gate", new BlockItem(CPlusBlocks.ANDESITE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

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

	// Cut Andesite
	public static final Item CUT_ANDESITE = register("cut_andesite", new BlockItem(CPlusBlocks.CUT_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_ANDESITE_SLAB = register("cut_andesite_slab", new BlockItem(CPlusBlocks.CUT_ANDESITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_ANDESITE_STAIRS = register("cut_andesite_stairs", new BlockItem(CPlusBlocks.CUT_ANDESITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_ANDESITE_WALL = register("cut_andesite_wall", new BlockItem(CPlusBlocks.CUT_ANDESITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_ANDESITE_GATE = register("cut_andesite_gate", new BlockItem(CPlusBlocks.CUT_ANDESITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

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

	// Andesite Tiles
	public static final Item ANDESITE_TILES = register("andesite_tiles", new BlockItem(CPlusBlocks.ANDESITE_TILES, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item ANDESITE_TILE_SLAB = register("andesite_tile_slab", new BlockItem(CPlusBlocks.ANDESITE_TILE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item ANDESITE_TILE_STAIRS = register("andesite_tile_stairs", new BlockItem(CPlusBlocks.ANDESITE_TILE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item ANDESITE_TILE_WALL = register("andesite_tile_wall", new BlockItem(CPlusBlocks.ANDESITE_TILE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item ANDESITE_TILE_GATE = register("andesite_tile_gate", new BlockItem(CPlusBlocks.ANDESITE_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

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
	public static final Item ANDESITE_PILLAR = register("andesite_pillar", new BlockItem(CPlusBlocks.ANDESITE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item ANDESITE_CORNER_PILLAR = register("andesite_corner_pillar", new BlockItem(CPlusBlocks.ANDESITE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Andesite Pillar
	public static final Item MOSSY_ANDESITE_PILLAR = register("mossy_andesite_pillar", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_ANDESITE_CORNER_PILLAR = register("mossy_andesite_corner_pillar", new BlockItem(CPlusBlocks.MOSSY_ANDESITE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Andesite Pillar
	public static final Item CRACKED_ANDESITE_PILLAR = register("cracked_andesite_pillar", new BlockItem(CPlusBlocks.CRACKED_ANDESITE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_ANDESITE_CORNER_PILLAR = register("cracked_andesite_corner_pillar", new BlockItem(CPlusBlocks.CRACKED_ANDESITE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled andesite
	public static final Item CHISELED_ANDESITE = register("chiseled_andesite", new BlockItem(CPlusBlocks.CHISELED_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Chiseled Andesite
	public static final Item MOSSY_CHISELED_ANDESITE = register("mossy_chiseled_andesite", new BlockItem(CPlusBlocks.MOSSY_CHISELED_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Chiseled Andesite
	public static final Item CRACKED_CHISELED_ANDESITE = register("cracked_chiseled_andesite", new BlockItem(CPlusBlocks.CRACKED_CHISELED_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved Andesite
	public static final Item CARVED_ANDESITE = register("carved_andesite", new BlockItem(CPlusBlocks.CARVED_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Carved Andesite
	public static final Item MOSSY_CARVED_ANDESITE = register("mossy_carved_andesite", new BlockItem(CPlusBlocks.MOSSY_CARVED_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Carved Andesite
	public static final Item CRACKED_CARVED_ANDESITE = register("cracked_carved_andesite", new BlockItem(CPlusBlocks.CRACKED_CARVED_ANDESITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


// DIORITE

	// Base
	public static final Item DIORITE_GATE = register("diorite_gate", new BlockItem(CPlusBlocks.DIORITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Diorite
	public static final Item COBBLED_DIORITE = register("cobbled_diorite", new BlockItem(CPlusBlocks.COBBLED_DIORITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_DIORITE_SLAB = register("cobbled_diorite_slab", new BlockItem(CPlusBlocks.COBBLED_DIORITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_DIORITE_STAIRS = register("cobbled_diorite_stairs", new BlockItem(CPlusBlocks.COBBLED_DIORITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_DIORITE_WALL = register("cobbled_diorite_wall", new BlockItem(CPlusBlocks.COBBLED_DIORITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_DIORITE_GATE = register("cobbled_diorite_gate", new BlockItem(CPlusBlocks.COBBLED_DIORITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Diorite
	public static final Item POLISHED_DIORITE_WALL = register("polished_diorite_wall", new BlockItem(CPlusBlocks.POLISHED_DIORITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_DIORITE_GATE = register("polished_diorite_gate", new BlockItem(CPlusBlocks.POLISHED_DIORITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Diorite
	public static final Item SMOOTH_DIORITE = register("smooth_diorite", new BlockItem(CPlusBlocks.SMOOTH_DIORITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_DIORITE_SLAB = register("smooth_diorite_slab", new BlockItem(CPlusBlocks.SMOOTH_DIORITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_DIORITE_STAIRS = register("smooth_diorite_stairs", new BlockItem(CPlusBlocks.SMOOTH_DIORITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_DIORITE_WALL = register("smooth_diorite_wall", new BlockItem(CPlusBlocks.SMOOTH_DIORITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_DIORITE_GATE = register("smooth_diorite_gate", new BlockItem(CPlusBlocks.SMOOTH_DIORITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Diorite Bricks
	public static final Item DIORITE_BRICKS = register("diorite_bricks", new BlockItem(CPlusBlocks.DIORITE_BRICKS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DIORITE_BRICK_SLAB = register("diorite_brick_slab", new BlockItem(CPlusBlocks.DIORITE_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DIORITE_BRICK_STAIRS = register("diorite_brick_stairs", new BlockItem(CPlusBlocks.DIORITE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DIORITE_BRICK_WALL = register("diorite_brick_wall", new BlockItem(CPlusBlocks.DIORITE_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DIORITE_BRICK_GATE = register("diorite_brick_gate", new BlockItem(CPlusBlocks.DIORITE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Diorite
	public static final Item CUT_DIORITE = register("cut_diorite", new BlockItem(CPlusBlocks.CUT_DIORITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_DIORITE_SLAB = register("cut_diorite_slab", new BlockItem(CPlusBlocks.CUT_DIORITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_DIORITE_STAIRS = register("cut_diorite_stairs", new BlockItem(CPlusBlocks.CUT_DIORITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_DIORITE_WALL = register("cut_diorite_wall", new BlockItem(CPlusBlocks.CUT_DIORITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_DIORITE_GATE = register("cut_diorite_gate", new BlockItem(CPlusBlocks.CUT_DIORITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Diorite Tiles
	public static final Item DIORITE_TILES = register("diorite_tiles", new BlockItem(CPlusBlocks.DIORITE_TILES, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DIORITE_TILE_SLAB = register("diorite_tile_slab", new BlockItem(CPlusBlocks.DIORITE_TILE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DIORITE_TILE_STAIRS = register("diorite_tile_stairs", new BlockItem(CPlusBlocks.DIORITE_TILE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DIORITE_TILE_WALL = register("diorite_tile_wall", new BlockItem(CPlusBlocks.DIORITE_TILE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DIORITE_TILE_GATE = register("diorite_tile_gate", new BlockItem(CPlusBlocks.DIORITE_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Diorite Pillar
	public static final Item DIORITE_PILLAR = register("diorite_pillar", new BlockItem(CPlusBlocks.DIORITE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DIORITE_CORNER_PILLAR = register("diorite_corner_pillar", new BlockItem(CPlusBlocks.DIORITE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Diorite
	public static final Item CHISELED_DIORITE = register("chiseled_diorite", new BlockItem(CPlusBlocks.CHISELED_DIORITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved Diorite
	public static final Item CARVED_DIORITE = register("carved_diorite", new BlockItem(CPlusBlocks.CARVED_DIORITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


// GRANITE

	// Base
	public static final Item GRANITE_GATE = register("granite_gate", new BlockItem(CPlusBlocks.GRANITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Granite
	public static final Item COBBLED_GRANITE = register("cobbled_granite", new BlockItem(CPlusBlocks.COBBLED_GRANITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_GRANITE_SLAB = register("cobbled_granite_slab", new BlockItem(CPlusBlocks.COBBLED_GRANITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_GRANITE_STAIRS = register("cobbled_granite_stairs", new BlockItem(CPlusBlocks.COBBLED_GRANITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_GRANITE_WALL = register("cobbled_granite_wall", new BlockItem(CPlusBlocks.COBBLED_GRANITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_GRANITE_GATE = register("cobbled_granite_gate", new BlockItem(CPlusBlocks.COBBLED_GRANITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Granite
	public static final Item POLISHED_GRANITE_WALL = register("polished_granite_wall", new BlockItem(CPlusBlocks.POLISHED_GRANITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_GRANITE_GATE = register("polished_granite_gate", new BlockItem(CPlusBlocks.POLISHED_GRANITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Granite
	public static final Item SMOOTH_GRANITE = register("smooth_granite", new BlockItem(CPlusBlocks.SMOOTH_GRANITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_GRANITE_SLAB = register("smooth_granite_slab", new BlockItem(CPlusBlocks.SMOOTH_GRANITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_GRANITE_STAIRS = register("smooth_granite_stairs", new BlockItem(CPlusBlocks.SMOOTH_GRANITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_GRANITE_WALL = register("smooth_granite_wall", new BlockItem(CPlusBlocks.SMOOTH_GRANITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_GRANITE_GATE = register("smooth_granite_gate", new BlockItem(CPlusBlocks.SMOOTH_GRANITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Granite Bricks
	public static final Item GRANITE_BRICKS = register("granite_bricks", new BlockItem(CPlusBlocks.GRANITE_BRICKS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item GRANITE_BRICK_SLAB = register("granite_brick_slab", new BlockItem(CPlusBlocks.GRANITE_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item GRANITE_BRICK_STAIRS = register("granite_brick_stairs", new BlockItem(CPlusBlocks.GRANITE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item GRANITE_BRICK_WALL = register("granite_brick_wall", new BlockItem(CPlusBlocks.GRANITE_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item GRANITE_BRICK_GATE = register("granite_brick_gate", new BlockItem(CPlusBlocks.GRANITE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Granite
	public static final Item CUT_GRANITE = register("cut_granite", new BlockItem(CPlusBlocks.CUT_GRANITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_GRANITE_SLAB = register("cut_granite_slab", new BlockItem(CPlusBlocks.CUT_GRANITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_GRANITE_STAIRS = register("cut_granite_stairs", new BlockItem(CPlusBlocks.CUT_GRANITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_GRANITE_WALL = register("cut_granite_wall", new BlockItem(CPlusBlocks.CUT_GRANITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_GRANITE_GATE = register("cut_granite_gate", new BlockItem(CPlusBlocks.CUT_GRANITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Granite Tiles
	public static final Item GRANITE_TILES = register("granite_tiles", new BlockItem(CPlusBlocks.GRANITE_TILES, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item GRANITE_TILE_SLAB = register("granite_tile_slab", new BlockItem(CPlusBlocks.GRANITE_TILE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item GRANITE_TILE_STAIRS = register("granite_tile_stairs", new BlockItem(CPlusBlocks.GRANITE_TILE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item GRANITE_TILE_WALL = register("granite_tile_wall", new BlockItem(CPlusBlocks.GRANITE_TILE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item GRANITE_TILE_GATE = register("granite_tile_gate", new BlockItem(CPlusBlocks.GRANITE_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Granite Pillar
	public static final Item GRANITE_PILLAR = register("granite_pillar", new BlockItem(CPlusBlocks.GRANITE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item GRANITE_CORNER_PILLAR = register("granite_corner_pillar", new BlockItem(CPlusBlocks.GRANITE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Granite
	public static final Item CHISELED_GRANITE = register("chiseled_granite", new BlockItem(CPlusBlocks.CHISELED_GRANITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved Granite
	public static final Item CARVED_GRANITE = register("carved_granite", new BlockItem(CPlusBlocks.CARVED_GRANITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


// CALCITE

	// Base
	public static final Item CALCITE_SLAB = register("calcite_slab", new BlockItem(CPlusBlocks.CALCITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CALCITE_STAIRS = register("calcite_stairs", new BlockItem(CPlusBlocks.CALCITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CALCITE_WALL = register("calcite_wall", new BlockItem(CPlusBlocks.CALCITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CALCITE_GATE = register("calcite_gate", new BlockItem(CPlusBlocks.CALCITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Calcite
	public static final Item COBBLED_CALCITE = register("cobbled_calcite", new BlockItem(CPlusBlocks.COBBLED_CALCITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_CALCITE_SLAB = register("cobbled_calcite_slab", new BlockItem(CPlusBlocks.COBBLED_CALCITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_CALCITE_STAIRS = register("cobbled_calcite_stairs", new BlockItem(CPlusBlocks.COBBLED_CALCITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_CALCITE_WALL = register("cobbled_calcite_wall", new BlockItem(CPlusBlocks.COBBLED_CALCITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_CALCITE_GATE = register("cobbled_calcite_gate", new BlockItem(CPlusBlocks.COBBLED_CALCITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Calcite
	public static final Item POLISHED_CALCITE = register("polished_calcite", new BlockItem(CPlusBlocks.POLISHED_CALCITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_CALCITE_SLAB = register("polished_calcite_slab", new BlockItem(CPlusBlocks.POLISHED_CALCITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_CALCITE_STAIRS = register("polished_calcite_stairs", new BlockItem(CPlusBlocks.POLISHED_CALCITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_CALCITE_WALL = register("polished_calcite_wall", new BlockItem(CPlusBlocks.POLISHED_CALCITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_CALCITE_GATE = register("polished_calcite_gate", new BlockItem(CPlusBlocks.POLISHED_CALCITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Calcite
	public static final Item SMOOTH_CALCITE = register("smooth_calcite", new BlockItem(CPlusBlocks.SMOOTH_CALCITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_CALCITE_SLAB = register("smooth_calcite_slab", new BlockItem(CPlusBlocks.SMOOTH_CALCITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_CALCITE_STAIRS = register("smooth_calcite_stairs", new BlockItem(CPlusBlocks.SMOOTH_CALCITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_CALCITE_WALL = register("smooth_calcite_wall", new BlockItem(CPlusBlocks.SMOOTH_CALCITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_CALCITE_GATE = register("smooth_calcite_gate", new BlockItem(CPlusBlocks.SMOOTH_CALCITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Calcite Bricks
	public static final Item CALCITE_BRICKS = register("calcite_bricks", new BlockItem(CPlusBlocks.CALCITE_BRICKS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CALCITE_BRICK_SLAB = register("calcite_brick_slab", new BlockItem(CPlusBlocks.CALCITE_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CALCITE_BRICk_STAIRS = register("calcite_brick_stairs", new BlockItem(CPlusBlocks.CALCITE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CALCITE_BRICK_WALL = register("calcite_brick_wall", new BlockItem(CPlusBlocks.CALCITE_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CALCITE_BRICK_GATE = register("calcite_brick_gate", new BlockItem(CPlusBlocks.CALCITE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Calcite
	public static final Item CUT_CALCITE = register("cut_calcite", new BlockItem(CPlusBlocks.CUT_CALCITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_CALCITE_SLAB = register("cut_calcite_slab", new BlockItem(CPlusBlocks.CUT_CALCITE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_CALCITE_STAIRS = register("cut_calcite_stairs", new BlockItem(CPlusBlocks.CUT_CALCITE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_CALCITE_WALL = register("cut_calcite_wall", new BlockItem(CPlusBlocks.CUT_CALCITE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_CALCITE_GATE = register("cut_calcite_gate", new BlockItem(CPlusBlocks.CUT_CALCITE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Calcite Tiles
	public static final Item CALCITE_TILES = register("calcite_tiles", new BlockItem(CPlusBlocks.CALCITE_TILES, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CALCITE_TILE_SLAB = register("calcite_tile_slab", new BlockItem(CPlusBlocks.CALCITE_TILE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CALCITE_TILE_STAIRS = register("calcite_tile_stairs", new BlockItem(CPlusBlocks.CALCITE_TILE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CALCITE_TILE_WALL = register("calcite_tile_wall", new BlockItem(CPlusBlocks.CALCITE_TILE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CALCITE_TILE_GATE = register("calcite_tile_gate", new BlockItem(CPlusBlocks.CALCITE_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Calcite Pillar
	public static final Item CALCITE_PILLAR = register("calcite_pillar", new BlockItem(CPlusBlocks.CALCITE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CALCITE_CORNER_PILLAR = register("calcite_corner_pillar", new BlockItem(CPlusBlocks.CALCITE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Calcite
	public static final Item CHISELED_CALCITE = register("chiseled_calcite", new BlockItem(CPlusBlocks.CHISELED_CALCITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved Calcite
	public static final Item CARVED_CALCITE = register("carved_calcite", new BlockItem(CPlusBlocks.CARVED_CALCITE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


// DRIPSTONE

	// Base
	public static final Item DRIPSTONE_SLAB = register("dripstone_slab", new BlockItem(CPlusBlocks.DRIPSTONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DRIPSTONE_STAIRS = register("dripstone_stairs", new BlockItem(CPlusBlocks.DRIPSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DRIPSTONE_WALL = register("dripstone_wall", new BlockItem(CPlusBlocks.DRIPSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DRIPSTONE_GATE = register("dripstone_gate", new BlockItem(CPlusBlocks.DRIPSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Dripstone
	public static final Item COBBLED_DRIPSTONE = register("cobbled_dripstone", new BlockItem(CPlusBlocks.COBBLED_DRIPSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_DRIPSTONE_SLAB = register("cobbled_dripstone_slab", new BlockItem(CPlusBlocks.COBBLED_DRIPSTONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_DRIPSTONE_STAIRS = register("cobbled_dripstone_stairs", new BlockItem(CPlusBlocks.COBBLED_DRIPSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_DRIPSTONE_WALL = register("cobbled_dripstone_wall", new BlockItem(CPlusBlocks.COBBLED_DRIPSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_DRIPSTONE_GATE = register("cobbled_dripstone_gate", new BlockItem(CPlusBlocks.COBBLED_DRIPSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Dripstone
	public static final Item POLISHED_DRIPSTONE = register("polished_dripstone", new BlockItem(CPlusBlocks.POLISHED_DRIPSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_DRIPSTONE_SLAB = register("polished_dripstone_slab", new BlockItem(CPlusBlocks.POLISHED_DRIPSTONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_DRIPSTONE_STAIRS = register("polished_dripstone_stairs", new BlockItem(CPlusBlocks.POLISHED_DRIPSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_DRIPSTONE_WALL = register("polished_dripstone_wall", new BlockItem(CPlusBlocks.POLISHED_DRIPSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_DRIPSTONE_GATE = register("polished_dripstone_gate", new BlockItem(CPlusBlocks.POLISHED_DRIPSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Dripstone
	public static final Item SMOOTH_DRIPSTONE = register("smooth_dripstone", new BlockItem(CPlusBlocks.SMOOTH_DRIPSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_DRIPSTONE_SLAB = register("smooth_dripstone_slab", new BlockItem(CPlusBlocks.SMOOTH_DRIPSTONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_DRIPSTONE_STAIRS = register("smooth_dripstone_stairs", new BlockItem(CPlusBlocks.SMOOTH_DRIPSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_DRIPSTONE_WALL = register("smooth_dripstone_wall", new BlockItem(CPlusBlocks.SMOOTH_DRIPSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_DRIPSTONE_GATE = register("smooth_dripstone_gate", new BlockItem(CPlusBlocks.SMOOTH_DRIPSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Dripstone Bricks
	public static final Item DRIPSTONE_BRICKS = register("dripstone_bricks", new BlockItem(CPlusBlocks.DRIPSTONE_BRICKS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DRIPSTONE_BRICK_SLAB = register("dripstone_brick_slab", new BlockItem(CPlusBlocks.DRIPSTONE_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DRIPSTONE_BRICK_STAIRS = register("dripstone_brick_stairs", new BlockItem(CPlusBlocks.DRIPSTONE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DRIPSTONE_BRICK_WALL = register("dripstone_brick_wall", new BlockItem(CPlusBlocks.DRIPSTONE_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DRIPSTONE_BRICK_GATE = register("dripstone_brick_gate", new BlockItem(CPlusBlocks.DRIPSTONE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Dripstone
	public static final Item CUT_DRIPSTONE = register("cut_dripstone", new BlockItem(CPlusBlocks.CUT_DRIPSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_DRIPSTONE_SLAB = register("cut_dripstone_slab", new BlockItem(CPlusBlocks.CUT_DRIPSTONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_DRIPSTONE_STAIRS = register("cut_dripstone_stairs", new BlockItem(CPlusBlocks.CUT_DRIPSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_DRIPSTONE_WALL = register("cut_dripstone_wall", new BlockItem(CPlusBlocks.CUT_DRIPSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_DRIPSTONE_GATE = register("cut_dripstone_gate", new BlockItem(CPlusBlocks.CUT_DRIPSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Dripstone Tiles
	public static final Item DRIPSTONE_TILES = register("dripstone_tiles", new BlockItem(CPlusBlocks.DRIPSTONE_TILES, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DRIPSTONE_TILE_SLAB = register("dripstone_tile_slab", new BlockItem(CPlusBlocks.DRIPSTONE_TILE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DRIPSTONE_TILE_STAIRS = register("dripstone_tile_stairs", new BlockItem(CPlusBlocks.DRIPSTONE_TILE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DRIPSTONE_TILE_WALL = register("dripstone_tile_wall", new BlockItem(CPlusBlocks.DRIPSTONE_TILE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DRIPSTONE_TILE_GATE = register("dripstone_tile_gate", new BlockItem(CPlusBlocks.DRIPSTONE_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Dripstone Pillar
	public static final Item DRIPSTONE_PILLAR = register("dripstone_pillar", new BlockItem(CPlusBlocks.DRIPSTONE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DRIPSTONE_CORNER_PILLAR = register("dripstone_corner_pillar", new BlockItem(CPlusBlocks.DRIPSTONE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Dripstone
	public static final Item CHISELED_DRIPSTONE = register("chiseled_dripstone", new BlockItem(CPlusBlocks.CHISELED_DRIPSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved Dripstone
	public static final Item CARVED_DRIPSTONE = register("carved_dripstone", new BlockItem(CPlusBlocks.CARVED_DRIPSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


// TUFF

	// Base
	public static final Item TUFF_SLAB = register("tuff_slab", new BlockItem(CPlusBlocks.TUFF_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item TUFF_STAIRS = register("tuff_stairs", new BlockItem(CPlusBlocks.TUFF_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item TUFF_WALL = register("tuff_wall", new BlockItem(CPlusBlocks.TUFF_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item TUFF_GATE = register("tuff_gate", new BlockItem(CPlusBlocks.TUFF_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Tuff
	public static final Item COBBLED_TUFF = register("cobbled_tuff", new BlockItem(CPlusBlocks.COBBLED_TUFF, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_TUFF_SLAB = register("cobbled_tuff_slab", new BlockItem(CPlusBlocks.COBBLED_TUFF_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_TUFF_STAIRS = register("cobbled_tuff_stairs", new BlockItem(CPlusBlocks.COBBLED_TUFF_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_TUFF_WALL = register("cobbled_tuff_wall", new BlockItem(CPlusBlocks.COBBLED_TUFF_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_TUFF_GATE = register("cobbled_tuff_gate", new BlockItem(CPlusBlocks.COBBLED_TUFF_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Tuff
	public static final Item POLISHED_TUFF = register("polished_tuff", new BlockItem(CPlusBlocks.POLISHED_TUFF, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_TUFF_SLAB = register("polished_tuff_slab", new BlockItem(CPlusBlocks.POLISHED_TUFF_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_TUFF_STAIRS = register("polished_tuff_stairs", new BlockItem(CPlusBlocks.POLISHED_TUFF_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_TUFF_WALL = register("polished_tuff_wall", new BlockItem(CPlusBlocks.POLISHED_TUFF_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_TUFF_GATE = register("polished_tuff_gate", new BlockItem(CPlusBlocks.POLISHED_TUFF_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Tuff
	public static final Item SMOOTH_TUFF = register("smooth_tuff", new BlockItem(CPlusBlocks.SMOOTH_TUFF, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_TUFF_SLAB = register("smooth_tuff_slab", new BlockItem(CPlusBlocks.SMOOTH_TUFF_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_TUFF_STAIRS = register("smooth_tuff_stairs", new BlockItem(CPlusBlocks.SMOOTH_TUFF_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_TUFF_WALL = register("smooth_tuff_wall", new BlockItem(CPlusBlocks.SMOOTH_TUFF_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_TUFF_GATE = register("smooth_tuff_gate", new BlockItem(CPlusBlocks.SMOOTH_TUFF_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Tuff Bricks
	public static final Item TUFF_BRICKS = register("tuff_bricks", new BlockItem(CPlusBlocks.TUFF_BRICKS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item TUFF_BRICK_SLAB = register("tuff_brick_slab", new BlockItem(CPlusBlocks.TUFF_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item TUFF_BRICk_STAIRS = register("tuff_brick_stairs", new BlockItem(CPlusBlocks.TUFF_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item TUFF_BRICK_WALL = register("tuff_brick_wall", new BlockItem(CPlusBlocks.TUFF_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item TUFF_BRICK_GATE = register("tuff_brick_gate", new BlockItem(CPlusBlocks.TUFF_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Tuff
	public static final Item CUT_TUFF = register("cut_tuff", new BlockItem(CPlusBlocks.CUT_TUFF, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_TUFF_SLAB = register("cut_tuff_slab", new BlockItem(CPlusBlocks.CUT_TUFF_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_TUFF_STAIRS = register("cut_tuff_stairs", new BlockItem(CPlusBlocks.CUT_TUFF_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_TUFF_WALL = register("cut_tuff_wall", new BlockItem(CPlusBlocks.CUT_TUFF_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_TUFF_GATE = register("cut_tuff_gate", new BlockItem(CPlusBlocks.CUT_TUFF_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Tuff Tiles
	public static final Item TUFF_TILES = register("tuff_tiles", new BlockItem(CPlusBlocks.TUFF_TILES, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item TUFF_TILE_SLAB = register("tuff_tile_slab", new BlockItem(CPlusBlocks.TUFF_TILE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item TUFF_TILE_STAIRS = register("tuff_tile_stairs", new BlockItem(CPlusBlocks.TUFF_TILE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item TUFF_TILE_WALL = register("tuff_tile_wall", new BlockItem(CPlusBlocks.TUFF_TILE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item TUFF_TILE_GATE = register("tuff_tile_gate", new BlockItem(CPlusBlocks.TUFF_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Tuff Pillar
	public static final Item TUFF_PILLAR = register("tuff_pillar", new BlockItem(CPlusBlocks.TUFF_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item TUFF_CORNER_PILLAR = register("tuff_corner_pillar", new BlockItem(CPlusBlocks.TUFF_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Tuff
	public static final Item CHISELED_TUFF = register("chiseled_tuff", new BlockItem(CPlusBlocks.CHISELED_TUFF, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved Tuff
	public static final Item CARVED_TUFF = register("carved_tuff", new BlockItem(CPlusBlocks.CARVED_TUFF, CPlusItemGroups.consistencyPlusStoneItemSettings()));


// DEEPSLATE

	// Base
	public static final Item DEEPSLATE_SLAB = register("deepslate_slab", new BlockItem(CPlusBlocks.DEEPSLATE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DEEPSLATE_STAIRS = register("deepslate_stairs", new BlockItem(CPlusBlocks.DEEPSLATE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DEEPSLATE_WALL = register("deepslate_wall", new BlockItem(CPlusBlocks.DEEPSLATE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DEEPSLATE_GATE = register("deepslate_gate", new BlockItem(CPlusBlocks.DEEPSLATE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Deepslate
	public static final Item COBBLED_DEEPSLATE_GATE = register("cobbled_deepslate_gate", new BlockItem(CPlusBlocks.COBBLED_DEEPSLATE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Deepslate
	public static final Item POLISHED_DEEPSLATE_GATE = register("polished_deepslate_gate", new BlockItem(CPlusBlocks.POLISHED_DEEPSLATE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Deepslate
	public static final Item SMOOTH_DEEPSLATE = register("smooth_deepslate", new BlockItem(CPlusBlocks.SMOOTH_DEEPSLATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_DEEPSLATE_SLAB = register("smooth_deepslate_slab", new BlockItem(CPlusBlocks.SMOOTH_DEEPSLATE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_DEEPSLATE_STAIRS = register("smooth_deepslate_stairs", new BlockItem(CPlusBlocks.SMOOTH_DEEPSLATE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_DEEPSLATE_WALL = register("smooth_deepslate_wall", new BlockItem(CPlusBlocks.SMOOTH_DEEPSLATE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_DEEPSLATE_GATE = register("smooth_deepslate_gate", new BlockItem(CPlusBlocks.SMOOTH_DEEPSLATE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Deepslate Bricks
	public static final Item DEEPSLATE_BRICK_GATE = register("deepslate_brick_gate", new BlockItem(CPlusBlocks.DEEPSLATE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Deepslate Bricks
	public static final Item CRACKED_DEEPSLATE_BRICK_SLAB = register("cracked_deepslate_brick_slab", new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_DEEPSLATE_BRICK_STAIRS = register("cracked_deepslate_brick_stairs", new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_DEEPSLATE_BRICK_WALL = register("cracked_deepslate_brick_wall", new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_DEEPSLATE_BRICK_GATE = register("cracked_deepslate_brick_gate", new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Deepslate
	public static final Item CUT_DEEPSLATE = register("cut_deepslate", new BlockItem(CPlusBlocks.CUT_DEEPSLATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_DEEPSLATE_SLAB = register("cut_deepslate_slab", new BlockItem(CPlusBlocks.CUT_DEEPSLATE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_DEEPSLATE_STAIRS = register("cut_deepslate_stairs", new BlockItem(CPlusBlocks.CUT_DEEPSLATE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_DEEPSLATE_WALL = register("cut_deepslate_wall", new BlockItem(CPlusBlocks.CUT_DEEPSLATE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_DEEPSLATE_GATE = register("cut_deepslate_gate", new BlockItem(CPlusBlocks.CUT_DEEPSLATE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Deepslate Tiles
	public static final Item DEEPSLATE_TILE_GATE = register("deepslate_tile_gate", new BlockItem(CPlusBlocks.DEEPSLATE_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Deepslate Tiles
	public static final Item CRACKED_DEEPSLATE_TILE_SLAB = register("cracked_deepslate_tile_slab", new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_DEEPSLATE_TILE_STAIRS = register("cracked_deepslate_tile_stairs", new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_DEEPSLATE_TILE_WALL = register("cracked_deepslate_tile_wall", new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_DEEPSLATE_TILE_GATE = register("cracked_deepslate_tile_gate", new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Deepslate Pillar
	public static final Item DEEPSLATE_PILLAR = register("deepslate_pillar", new BlockItem(CPlusBlocks.DEEPSLATE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item DEEPSLATE_CORNER_PILLAR = register("deepslate_corner_pillar", new BlockItem(CPlusBlocks.DEEPSLATE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved Deepslate
	public static final Item CARVED_DEEPSLATE = register("carved_deepslate", new BlockItem(CPlusBlocks.CARVED_DEEPSLATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


// BLACKSTONE

	// Base
	public static final Item BLACKSTONE_GATE = register("blackstone_gate", new BlockItem(CPlusBlocks.BLACKSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Blackstone
	public static final Item COBBLED_BLACKSTONE = register("cobbled_blackstone", new BlockItem(CPlusBlocks.COBBLED_BLACKSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_BLACKSTONE_SLAB = register("cobbled_blackstone_slab", new BlockItem(CPlusBlocks.COBBLED_BLACKSTONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_BLACKSTONE_STAIRS = register("cobbled_blackstone_stairs", new BlockItem(CPlusBlocks.COBBLED_BLACKSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_BLACKSTONE_WALL = register("cobbled_blackstone_wall", new BlockItem(CPlusBlocks.COBBLED_BLACKSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_BLACKSTONE_GATE = register("cobbled_blackstone_gate", new BlockItem(CPlusBlocks.COBBLED_BLACKSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Blackstone
	public static final Item POLISHED_BLACKSTONE_GATE = register("polished_blackstone_gate", new BlockItem(CPlusBlocks.POLISHED_BLACKSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Blackstone
	public static final Item SMOOTH_BLACKSTONE = register("smooth_blackstone", new BlockItem(CPlusBlocks.SMOOTH_BLACKSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_BLACKSTONE_SLAB = register("smooth_blackstone_slab", new BlockItem(CPlusBlocks.SMOOTH_BLACKSTONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_BLACKSTONE_STAIRS = register("smooth_blackstone_stairs", new BlockItem(CPlusBlocks.SMOOTH_BLACKSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_BLACKSTONE_WALL = register("smooth_blackstone_wall", new BlockItem(CPlusBlocks.SMOOTH_BLACKSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_BLACKSTONE_GATE = register("smooth_blackstone_gate", new BlockItem(CPlusBlocks.SMOOTH_BLACKSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Blackstone Bricks
	public static final Item BLACKSTONE_BRICK_GATE = register("blackstone_brick_gate", new BlockItem(CPlusBlocks.BLACKSTONE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

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

	// Cut Blackstone
	public static final Item CUT_BLACKSTONE = register("cut_blackstone", new BlockItem(CPlusBlocks.CUT_BLACKSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_BLACKSTONE_SLAB = register("cut_blackstone_slab", new BlockItem(CPlusBlocks.CUT_BLACKSTONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_BLACKSTONE_STAIRS = register("cut_blackstone_stairs", new BlockItem(CPlusBlocks.CUT_BLACKSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_BLACKSTONE_WALL = register("cut_blackstone_wall", new BlockItem(CPlusBlocks.CUT_BLACKSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_BLACKSTONE_GATE = register("cut_blackstone_gate", new BlockItem(CPlusBlocks.CUT_BLACKSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Blackstone Tiles
	public static final Item BLACKSTONE_TILES = register("blackstone_tiles", new BlockItem(CPlusBlocks.BLACKSTONE_TILES, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item BLACKSTONE_TILE_SLAB = register("blackstone_tile_slab", new BlockItem(CPlusBlocks.BLACKSTONE_TILE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item BLACKSTONE_TILE_STAIRS = register("blackstone_tile_stairs", new BlockItem(CPlusBlocks.BLACKSTONE_TILE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item BLACKSTONE_TILE_WALL = register("blackstone_tile_wall", new BlockItem(CPlusBlocks.BLACKSTONE_TILE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item BLACKSTONE_TILE_GATE = register("blackstone_tile_gate", new BlockItem(CPlusBlocks.BLACKSTONE_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Blackstone Pillar
	public static final Item BLACKSTONE_PILLAR = register("blackstone_pillar", new BlockItem(CPlusBlocks.BLACKSTONE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item BLACKSTONE_CORNER_PILLAR = register("blackstone_corner_pillar", new BlockItem(CPlusBlocks.BLACKSTONE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Blackstone Pillar
	public static final Item MOSSY_BLACKSTONE_PILLAR = register("mossy_blackstone_pillar", new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item MOSSY_BLACKSTONE_CORNER_PILLAR = register("mossy_blackstone_corner_pillar", new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Blackstone Pillar
	public static final Item CRACKED_BLACKSTONE_PILLAR = register("cracked_blackstone_pillar", new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CRACKED_BLACKSTONE_CORNER_PILLAR = register("cracked_blackstone_corner_pillar", new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Blackstone
	public static final Item CHISELED_BLACKSTONE = register("chiseled_blackstone", new BlockItem(CPlusBlocks.CHISELED_BLACKSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Chiseled Blackstone
	public static final Item MOSSY_CHISELED_BLACKSTONE = register("mossy_chiseled_blackstone", new BlockItem(CPlusBlocks.MOSSY_CHISELED_BLACKSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Chiseled Blackstone
	public static final Item CRACKED_CHISELED_BLACKSTONE = register("cracked_chiseled_blackstone", new BlockItem(CPlusBlocks.CRACKED_CHISELED_BLACKSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Carved Blackstone
	public static final Item MOSSY_CARVED_BLACKSTONE = register("mossy_carved_blackstone", new BlockItem(CPlusBlocks.MOSSY_CARVED_BLACKSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Carved Blackstone
	public static final Item CRACKED_CARVED_BLACKSTONE = register("cracked_carved_blackstone", new BlockItem(CPlusBlocks.CRACKED_CARVED_BLACKSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


// SANDSTONE

	// Base
	public static final Item SANDSTONE_GATE = register("sandstone_gate", new BlockItem(CPlusBlocks.SANDSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Sandstone
	public static final Item COBBLED_SANDSTONE = register("cobbled_sandstone", new BlockItem(CPlusBlocks.COBBLED_SANDSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_SANDSTONE_SLAB = register("cobbled_sandstone_slab", new BlockItem(CPlusBlocks.COBBLED_SANDSTONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_SANDSTONE_STAIRS = register("cobbled_sandstone_stairs", new BlockItem(CPlusBlocks.COBBLED_SANDSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_SANDSTONE_WALL = register("cobbled_sandstone_wall", new BlockItem(CPlusBlocks.COBBLED_SANDSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_SANDSTONE_GATE = register("cobbled_sandstone_gate", new BlockItem(CPlusBlocks.COBBLED_SANDSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Sandstone
	public static final Item POLISHED_SANDSTONE = register("polished_sandstone", new BlockItem(CPlusBlocks.POLISHED_SANDSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_SANDSTONE_SLAB = register("polished_sandstone_slab", new BlockItem(CPlusBlocks.POLISHED_SANDSTONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_SANDSTONE_STAIRS = register("polished_sandstone_stairs", new BlockItem(CPlusBlocks.POLISHED_SANDSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_SANDSTONE_WALL = register("polished_sandstone_wall", new BlockItem(CPlusBlocks.POLISHED_SANDSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_SANDSTONE_GATE = register("polished_sandstone_gate", new BlockItem(CPlusBlocks.POLISHED_SANDSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Sandstone
	public static final Item SMOOTH_SANDSTONE_WALL = register("smooth_sandstone_wall", new BlockItem(CPlusBlocks.SMOOTH_SANDSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_SANDSTONE_GATE = register("smooth_sandstone_gate", new BlockItem(CPlusBlocks.SMOOTH_SANDSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Sandstone Bricks
	public static final Item SANDSTONE_BRICKS = register("sandstone_bricks", new BlockItem(CPlusBlocks.SANDSTONE_BRICKS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SANDSTONE_BRICK_SLAB = register("sandstone_brick_slab", new BlockItem(CPlusBlocks.SANDSTONE_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SANDSTONE_BRICK_STAIRS = register("sandstone_brick_stairs", new BlockItem(CPlusBlocks.SANDSTONE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SANDSTONE_BRICK_WALL = register("sandstone_brick_wall", new BlockItem(CPlusBlocks.SANDSTONE_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SANDSTONE_BRICK_GATE = register("sandstone_brick_gate", new BlockItem(CPlusBlocks.SANDSTONE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Sandstone
	public static final Item CUT_SANDSTONE_STAIRS = register("cut_sandstone_stairs", new BlockItem(CPlusBlocks.CUT_SANDSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_SANDSTONE_WALL = register("cut_sandstone_wall", new BlockItem(CPlusBlocks.CUT_SANDSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_SANDSTONE_GATE = register("cut_sandstone_gate", new BlockItem(CPlusBlocks.CUT_SANDSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Sandstone Tiles
	public static final Item SANDSTONE_TILES = register("sandstone_tiles", new BlockItem(CPlusBlocks.SANDSTONE_TILES, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SANDSTONE_TILE_SLAB = register("sandstone_tile_slab", new BlockItem(CPlusBlocks.SANDSTONE_TILE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SANDSTONE_TILE_STAIRS = register("sandstone_tile_stairs", new BlockItem(CPlusBlocks.SANDSTONE_TILE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SANDSTONE_TILE_WALL = register("sandstone_tile_wall", new BlockItem(CPlusBlocks.SANDSTONE_TILE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SANDSTONE_TILE_GATE = register("sandstone_tile_gate", new BlockItem(CPlusBlocks.SANDSTONE_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Sandstone Pillar
	public static final Item SANDSTONE_PILLAR = register("sandstone_pillar", new BlockItem(CPlusBlocks.SANDSTONE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SANDSTONE_CORNER_PILLAR = register("sandstone_corner_pillar", new BlockItem(CPlusBlocks.SANDSTONE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Sandstone
	public static final Item CHISELED_SANDSTONE = register("chiseled_sandstone", new BlockItem(CPlusBlocks.CHISELED_SANDSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


// RED SANDSTONE

	// Base
	public static final Item RED_SANDSTONE_GATE = register("red_sandstone_gate", new BlockItem(CPlusBlocks.RED_SANDSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Red Sandstone
	public static final Item COBBLED_RED_SANDSTONE = register("cobbled_red_sandstone", new BlockItem(CPlusBlocks.COBBLED_RED_SANDSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_RED_SANDSTONE_SLAB = register("cobbled_red_sandstone_slab", new BlockItem(CPlusBlocks.COBBLED_RED_SANDSTONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_RED_SANDSTONE_STAIRS = register("cobbled_red_sandstone_stairs", new BlockItem(CPlusBlocks.COBBLED_RED_SANDSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_RED_SANDSTONE_WALL = register("cobbled_red_sandstone_wall", new BlockItem(CPlusBlocks.COBBLED_RED_SANDSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_RED_SANDSTONE_GATE = register("cobbled_red_sandstone_gate", new BlockItem(CPlusBlocks.COBBLED_RED_SANDSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Red Sandstone
	public static final Item POLISHED_RED_SANDSTONE = register("polished_red_sandstone", new BlockItem(CPlusBlocks.POLISHED_RED_SANDSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_RED_SANDSTONE_SLAB = register("polished_red_sandstone_slab", new BlockItem(CPlusBlocks.POLISHED_RED_SANDSTONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_RED_SANDSTONE_STAIRS = register("polished_red_sandstone_stairs", new BlockItem(CPlusBlocks.POLISHED_RED_SANDSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_RED_SANDSTONE_WALL = register("polished_red_sandstone_wall", new BlockItem(CPlusBlocks.POLISHED_RED_SANDSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_RED_SANDSTONE_GATE = register("polished_red_sandstone_gate", new BlockItem(CPlusBlocks.POLISHED_RED_SANDSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Red Sandstone
	public static final Item SMOOTH_RED_SANDSTONE_WALL = register("smooth_red_sandstone_wall", new BlockItem(CPlusBlocks.SMOOTH_RED_SANDSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_RED_SANDSTONE_GATE = register("smooth_red_sandstone_gate", new BlockItem(CPlusBlocks.SMOOTH_RED_SANDSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Red Sandstone Bricks
	public static final Item RED_SANDSTONE_BRICKS = register("red_sandstone_bricks", new BlockItem(CPlusBlocks.RED_SANDSTONE_BRICKS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item RED_SANDSTONE_BRICK_SLAB = register("red_sandstone_brick_slab", new BlockItem(CPlusBlocks.RED_SANDSTONE_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item RED_SANDSTONE_BRICK_STAIRS = register("red_sandstone_brick_stairs", new BlockItem(CPlusBlocks.RED_SANDSTONE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item RED_SANDSTONE_BRICK_WALL = register("red_sandstone_brick_wall", new BlockItem(CPlusBlocks.RED_SANDSTONE_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item RED_SANDSTONE_BRICK_GATE = register("red_sandstone_brick_gate", new BlockItem(CPlusBlocks.RED_SANDSTONE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Red Sandstone
	public static final Item CUT_RED_SANDSTONE_STAIRS = register("cut_red_sandstone_stairs", new BlockItem(CPlusBlocks.CUT_RED_SANDSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_RED_SANDSTONE_WALL = register("cut_red_sandstone_wall", new BlockItem(CPlusBlocks.CUT_RED_SANDSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_RED_SANDSTONE_GATE = register("cut_red_sandstone_gate", new BlockItem(CPlusBlocks.CUT_RED_SANDSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Red Sandstone Tiles
	public static final Item RED_SANDSTONE_TILES = register("red_sandstone_tiles", new BlockItem(CPlusBlocks.RED_SANDSTONE_TILES, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item RED_SANDSTONE_TILE_SLAB = register("red_sandstone_tile_slab", new BlockItem(CPlusBlocks.RED_SANDSTONE_TILE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item RED_SANDSTONE_TILE_STAIRS = register("red_sandstone_tile_stairs", new BlockItem(CPlusBlocks.RED_SANDSTONE_TILE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item RED_SANDSTONE_TILE_WALL = register("red_sandstone_tile_wall", new BlockItem(CPlusBlocks.RED_SANDSTONE_TILE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item RED_SANDSTONE_TILE_GATE = register("red_sandstone_tile_gate", new BlockItem(CPlusBlocks.RED_SANDSTONE_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Red Sandstone Pillar
	public static final Item RED_SANDSTONE_PILLAR = register("red_sandstone_pillar", new BlockItem(CPlusBlocks.RED_SANDSTONE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item RED_SANDSTONE_CORNER_PILLAR = register("red_sandstone_corner_pillar", new BlockItem(CPlusBlocks.RED_SANDSTONE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Red Sandstone
	public static final Item CHISELED_RED_SANDSTONE = register("chiseled_red_sandstone", new BlockItem(CPlusBlocks.CHISELED_RED_SANDSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


// SOUL SANDSTONE

	// Base
	public static final Item SOUL_SANDSTONE = register("soul_sandstone", new BlockItem(CPlusBlocks.SOUL_SANDSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SOUL_SANDSTONE_SLAB = register("soul_sandstone_slab", new BlockItem(CPlusBlocks.SOUL_SANDSTONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SOUL_SANDSTONE_STAIRS = register("soul_sandstone_stairs", new BlockItem(CPlusBlocks.SOUL_SANDSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SOUL_SANDSTONE_WALL = register("soul_sandstone_wall", new BlockItem(CPlusBlocks.SOUL_SANDSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SOUL_SANDSTONE_GATE = register("soul_sandstone_gate", new BlockItem(CPlusBlocks.SOUL_SANDSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Soul Sandstone
	public static final Item COBBLED_SOUL_SANDSTONE = register("cobbled_soul_sandstone", new BlockItem(CPlusBlocks.COBBLED_SOUL_SANDSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_SOUL_SANDSTONE_SLAB = register("cobbled_soul_sandstone_slab", new BlockItem(CPlusBlocks.COBBLED_SOUL_SANDSTONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_SOUL_SANDSTONE_STAIRS = register("cobbled_soul_sandstone_stairs", new BlockItem(CPlusBlocks.COBBLED_SOUL_SANDSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_SOUL_SANDSTONE_WALL = register("cobbled_soul_sandstone_wall", new BlockItem(CPlusBlocks.COBBLED_SOUL_SANDSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_SOUL_SANDSTONE_GATE = register("cobbled_soul_sandstone_gate", new BlockItem(CPlusBlocks.COBBLED_SOUL_SANDSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Soul Sandstone
	public static final Item POLISHED_SOUL_SANDSTONE = register("polished_soul_sandstone", new BlockItem(CPlusBlocks.POLISHED_SOUL_SANDSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_SOUL_SANDSTONE_SLAB = register("polished_soul_sandstone_slab", new BlockItem(CPlusBlocks.POLISHED_SOUL_SANDSTONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_SOUL_SANDSTONE_STAIRS = register("polished_soul_sandstone_stairs", new BlockItem(CPlusBlocks.POLISHED_SOUL_SANDSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_SOUL_SANDSTONE_WALL = register("polished_soul_sandstone_wall", new BlockItem(CPlusBlocks.POLISHED_SOUL_SANDSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_SOUL_SANDSTONE_GATE = register("polished_soul_sandstone_gate", new BlockItem(CPlusBlocks.POLISHED_SOUL_SANDSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Soul Sandstone
	public static final Item SMOOTH_SOUL_SANDSTONE = register("smooth_soul_sandstone", new BlockItem(CPlusBlocks.SMOOTH_SOUL_SANDSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_SOUL_SANDSTONE_SLAB = register("smooth_soul_sandstone_slab", new BlockItem(CPlusBlocks.SMOOTH_SOUL_SANDSTONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_SOUL_SANDSTONE_STAIRS = register("smooth_soul_sandstone_stairs", new BlockItem(CPlusBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_SOUL_SANDSTONE_WALL = register("smooth_soul_sandstone_wall", new BlockItem(CPlusBlocks.SMOOTH_SOUL_SANDSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_SOUL_SANDSTONE_GATE = register("smooth_soul_sandstone_gate", new BlockItem(CPlusBlocks.SMOOTH_SOUL_SANDSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Soul Sandstone Bricks
	public static final Item SOUL_SANDSTONE_BRICKS = register("soul_sandstone_bricks", new BlockItem(CPlusBlocks.SOUL_SANDSTONE_BRICKS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SOUL_SANDSTONE_BRICK_SLAB = register("soul_sandstone_brick_slab", new BlockItem(CPlusBlocks.SOUL_SANDSTONE_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SOUL_SANDSTONE_BRICK_STAIRS = register("soul_sandstone_brick_stairs", new BlockItem(CPlusBlocks.SOUL_SANDSTONE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SOUL_SANDSTONE_BRICK_WALL = register("soul_sandstone_brick_wall", new BlockItem(CPlusBlocks.SOUL_SANDSTONE_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SOUL_SANDSTONE_BRICK_GATE = register("soul_sandstone_brick_gate", new BlockItem(CPlusBlocks.SOUL_SANDSTONE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Soul Sandstone
	public static final Item CUT_SOUL_SANDSTONE = register("cut_soul_sandstone", new BlockItem(CPlusBlocks.CUT_SOUL_SANDSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_SOUL_SANDSTONE_SLAB = register("cut_soul_sandstone_slab", new BlockItem(CPlusBlocks.CUT_SOUL_SANDSTONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_SOUL_SANDSTONE_STAIRS = register("cut_soul_sandstone_stairs", new BlockItem(CPlusBlocks.CUT_SOUL_SANDSTONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_SOUL_SANDSTONE_WALL = register("cut_soul_sandstone_wall", new BlockItem(CPlusBlocks.CUT_SOUL_SANDSTONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_SOUL_SANDSTONE_GATE = register("cut_soul_sandstone_gate", new BlockItem(CPlusBlocks.CUT_SOUL_SANDSTONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Soul Sandstone Tiles
	public static final Item SOUL_SANDSTONE_TILES = register("soul_sandstone_tiles", new BlockItem(CPlusBlocks.SOUL_SANDSTONE_TILES, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SOUL_SANDSTONE_TILE_SLAB = register("soul_sandstone_tile_slab", new BlockItem(CPlusBlocks.SOUL_SANDSTONE_TILE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SOUL_SANDSTONE_TILE_STAIRS = register("soul_sandstone_tile_stairs", new BlockItem(CPlusBlocks.SOUL_SANDSTONE_TILE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SOUL_SANDSTONE_TILE_WALL = register("soul_sandstone_tile_wall", new BlockItem(CPlusBlocks.SOUL_SANDSTONE_TILE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SOUL_SANDSTONE_TILE_GATE = register("soul_sandstone_tile_gate", new BlockItem(CPlusBlocks.SOUL_SANDSTONE_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Soul Sandstone Pillar
	public static final Item SOUL_SANDSTONE_PILLAR = register("soul_sandstone_pillar", new BlockItem(CPlusBlocks.SOUL_SANDSTONE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SOUL_SANDSTONE_CORNER_PILLAR = register("soul_sandstone_corner_pillar", new BlockItem(CPlusBlocks.SOUL_SANDSTONE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Soul Sandstone
	public static final Item CHISELED_SOUL_SANDSTONE = register("chiseled_soul_sandstone", new BlockItem(CPlusBlocks.CHISELED_SOUL_SANDSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Caved Soul Sandstone
	public static final Item CARVED_SOUL_SANDSTONE = register("carved_soul_sandstone", new BlockItem(CPlusBlocks.CARVED_SOUL_SANDSTONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

//Basalt

	// Base
	public static final Item BASALT_SLAB = register("basalt_slab", new BlockItem(CPlusBlocks.BASALT_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item BASALT_STAIRS = register("basalt_stairs", new BlockItem(CPlusBlocks.BASALT_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item BASALT_WALL = register("basalt_wall", new BlockItem(CPlusBlocks.BASALT_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item BASALT_GATE = register("basalt_gate", new BlockItem(CPlusBlocks.BASALT_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Soul Sandstone
	public static final Item COBBLED_BASALT = register("cobbled_basalt", new BlockItem(CPlusBlocks.COBBLED_BASALT, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_BASALT_SLAB = register("cobbled_basalt_slab", new BlockItem(CPlusBlocks.COBBLED_BASALT_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_BASALT_STAIRS = register("cobbled_basalt_stairs", new BlockItem(CPlusBlocks.COBBLED_BASALT_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_BASALT_WALL = register("cobbled_basalt_wall", new BlockItem(CPlusBlocks.COBBLED_BASALT_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_BASALT_GATE = register("cobbled_basalt_gate", new BlockItem(CPlusBlocks.COBBLED_BASALT_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Soul Sandstone
	public static final Item POLISHED_BASALT = register("polished_basalt", new BlockItem(CPlusBlocks.POLISHED_BASALT, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_BASALT_SLAB = register("polished_basalt_slab", new BlockItem(CPlusBlocks.POLISHED_BASALT_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_BASALT_STAIRS = register("polished_basalt_stairs", new BlockItem(CPlusBlocks.POLISHED_BASALT_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_BASALT_WALL = register("polished_basalt_wall", new BlockItem(CPlusBlocks.POLISHED_BASALT_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_BASALT_GATE = register("polished_basalt_gate", new BlockItem(CPlusBlocks.POLISHED_BASALT_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Soul Sandstone
	public static final Item SMOOTH_BASALT_SLAB = register("smooth_basalt_slab", new BlockItem(CPlusBlocks.SMOOTH_BASALT_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_BASALT_STAIRS = register("smooth_basalt_stairs", new BlockItem(CPlusBlocks.SMOOTH_BASALT_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_BASALT_WALL = register("smooth_basalt_wall", new BlockItem(CPlusBlocks.SMOOTH_BASALT_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_BASALT_GATE = register("smooth_basalt_gate", new BlockItem(CPlusBlocks.SMOOTH_BASALT_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Soul Sandstone Bricks
	public static final Item BASALT_BRICKS = register("basalt_bricks", new BlockItem(CPlusBlocks.BASALT_BRICKS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item BASALT_BRICK_SLAB = register("basalt_brick_slab", new BlockItem(CPlusBlocks.BASALT_BRICK_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item BASALT_BRICK_STAIRS = register("basalt_brick_stairs", new BlockItem(CPlusBlocks.BASALT_BRICK_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item BASALT_BRICK_WALL = register("basalt_brick_wall", new BlockItem(CPlusBlocks.BASALT_BRICK_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item BASALT_BRICK_GATE = register("basalt_brick_gate", new BlockItem(CPlusBlocks.BASALT_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Soul Sandstone
	public static final Item CUT_BASALT = register("cut_basalt", new BlockItem(CPlusBlocks.CUT_BASALT, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_BASALT_SLAB = register("cut_basalt_slab", new BlockItem(CPlusBlocks.CUT_BASALT_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_BASALT_STAIRS = register("cut_basalt_stairs", new BlockItem(CPlusBlocks.CUT_BASALT_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_BASALT_WALL = register("cut_basalt_wall", new BlockItem(CPlusBlocks.CUT_BASALT_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_BASALT_GATE = register("cut_basalt_gate", new BlockItem(CPlusBlocks.CUT_BASALT_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Soul Sandstone Tiles
	public static final Item BASALT_TILES = register("basalt_tiles", new BlockItem(CPlusBlocks.BASALT_TILES, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item BASALT_TILE_SLAB = register("basalt_tile_slab", new BlockItem(CPlusBlocks.BASALT_TILE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item BASALT_TILE_STAIRS = register("basalt_tile_stairs", new BlockItem(CPlusBlocks.BASALT_TILE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item BASALT_TILE_WALL = register("basalt_tile_wall", new BlockItem(CPlusBlocks.BASALT_TILE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item BASALT_TILE_GATE = register("basalt_tile_gate", new BlockItem(CPlusBlocks.BASALT_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Soul Sandstone Pillar
	public static final Item BASALT_CORNER_PILLAR = register("basalt_corner_pillar", new BlockItem(CPlusBlocks.BASALT_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Soul Sandstone
	public static final Item CHISELED_BASALT = register("chiseled_basalt", new BlockItem(CPlusBlocks.CHISELED_BASALT, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Caved Soul Sandstone
	public static final Item CARVED_BASALT = register("carved_basalt", new BlockItem(CPlusBlocks.CARVED_BASALT, CPlusItemGroups.consistencyPlusStoneItemSettings()));




// QUARTZ

	// Base
	public static final Item QUARTZ_WALL = register("quartz_wall", new BlockItem(CPlusBlocks.QUARTZ_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item QUARTZ_GATE = register("quartz_gate", new BlockItem(CPlusBlocks.QUARTZ_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Polished Quartz
	public static final Item POLISHED_QUARTZ = register("polished_quartz", new BlockItem(CPlusBlocks.POLISHED_QUARTZ, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_QUARTZ_SLAB = register("polished_quartz_slab", new BlockItem(CPlusBlocks.POLISHED_QUARTZ_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_QUARTZ_STAIRS = register("polished_quartz_stairs", new BlockItem(CPlusBlocks.POLISHED_QUARTZ_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_QUARTZ_WALL = register("polished_quartz_wall", new BlockItem(CPlusBlocks.POLISHED_QUARTZ_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_QUARTZ_GATE = register("polished_quartz_gate", new BlockItem(CPlusBlocks.POLISHED_QUARTZ_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Smooth Quartz
	public static final Item SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall", new BlockItem(CPlusBlocks.SMOOTH_QUARTZ_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_QUARTZ_GATE = register("smooth_quartz_gate", new BlockItem(CPlusBlocks.SMOOTH_QUARTZ_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Quartz Bricks
	public static final Item QUARTZ_BRICK_SLAB = register("quartz_brick_slab", new BlockItem(CPlusBlocks.QUARTZ_BRICK_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs", new BlockItem(CPlusBlocks.QUARTZ_BRICK_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item QUARTZ_BRICK_WALL = register("quartz_brick_wall", new BlockItem(CPlusBlocks.QUARTZ_BRICK_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item QUARTZ_BRICK_GATE = register("quartz_brick_gate", new BlockItem(CPlusBlocks.QUARTZ_BRICK_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Quartz
	public static final Item CUT_QUARTZ = register("cut_quartz", new BlockItem(CPlusBlocks.CUT_QUARTZ, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_QUARTZ_SLAB = register("cut_quartz_slab", new BlockItem(CPlusBlocks.CUT_QUARTZ_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_QUARTZ_STAIRS = register("cut_quartz_stairs", new BlockItem(CPlusBlocks.CUT_QUARTZ_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_QUARTZ_WALL = register("cut_quartz_wall", new BlockItem(CPlusBlocks.CUT_QUARTZ_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_QUARTZ_GATE = register("cut_quartz_gate", new BlockItem(CPlusBlocks.CUT_QUARTZ_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Quartz Tiles
	public static final Item QUARTZ_TILES = register("quartz_tiles", new BlockItem(CPlusBlocks.QUARTZ_TILES, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item QUARTZ_TILE_SLAB = register("quartz_tile_slab", new BlockItem(CPlusBlocks.QUARTZ_TILE_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item QUARTZ_TILE_STAIRS = register("quartz_tile_stairs", new BlockItem(CPlusBlocks.QUARTZ_TILE_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item QUARTZ_TILE_WALL = register("quartz_tile_wall", new BlockItem(CPlusBlocks.QUARTZ_TILE_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item QUARTZ_TILE_GATE = register("quartz_tile_gate", new BlockItem(CPlusBlocks.QUARTZ_TILE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Quartz Pillar
	public static final Item QUARTZ_CORNER_PILLAR = register("quartz_corner_pillar", new BlockItem(CPlusBlocks.QUARTZ_CORNER_PILLAR, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Carved Quartz
	public static final Item CARVED_QUARTZ = register("carved_quartz", new BlockItem(CPlusBlocks.CARVED_QUARTZ, CPlusItemGroups.consistencyPlusMiscItemSettings()));


// NETHERRACK

	// Base

	// Cobbled Netherrack

	// Polished Netherrack

	// Smooth Netherrack

	// Netherrack Bricks

	// Cracked Netherrack Bricks
	public static final Item CRACKED_NETHER_BRICK_SLAB = register("cracked_nether_brick_slab", new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_NETHER_BRICK_STAIRS = register("cracked_nether_brick_stairs", new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_NETHER_BRICK_WALL = register("cracked_nether_brick_wall", new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_NETHER_BRICK_FENCE_GATE = register("cracked_nether_brick_fence_gate", new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_FENCE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Netherrack

	// Netherrack Tiles

	// Netherrack Pillar
	public static final Item NETHER_BRICK_PILLAR = register("nether_brick_pillar", new BlockItem(CPlusBlocks.NETHER_BRICK_PILLAR, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Chiseled Netherrack
	public static final Item CHISELED_NETHER_BRICKS = register("chiseled_nether_bricks", new BlockItem(CPlusBlocks.CHISELED_NETHER_BRICKS, CPlusItemGroups.consistencyPlusMiscItemSettings()));


// CRIMSON WART

	// Base

	// Polished Crimson Wart

	// Smooth Crimson Wart

	// Crimson Wart Bricks
	public static final Item RED_NETHER_BRICK_FENCE_GATE = register("red_nether_brick_fence_gate", new BlockItem(CPlusBlocks.RED_NETHER_BRICK_FENCE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Crimson Wart

	// Crimson Wart Tiles

	// Crimson Wart Pillar
	public static final Item RED_NETHER_BRICK_PILLAR = register("red_nether_brick_pillar", new BlockItem(CPlusBlocks.RED_NETHER_BRICK_PILLAR, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Chiseled Crimson Wart
	public static final Item CHISELED_RED_NETHER_BRICKS = register("chiseled_red_nether_bricks", new BlockItem(CPlusBlocks.CHISELED_RED_NETHER_BRICKS, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Carved Crimson Wart
	public static final Item CARVED_RED_NETHER_BRICKS = register("carved_red_nether_bricks", new BlockItem(CPlusBlocks.CARVED_RED_NETHER_BRICKS, CPlusItemGroups.consistencyPlusMiscItemSettings()));


// WARPED WART

	// Base

	// Polished Warped Wart

	// Smooth Warped Wart

	// Warped Wart Bricks
	/*
	public static final Item WARPED_NETHER_BRICKS = register("warped_nether_bricks", new BlockItem(CPlusBlocks.WARPED_NETHER_BRICKS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item WARPED_NETHER_BRICK_SLAB = register("warped_nether_brick_slab", new BlockItem(CPlusBlocks.WARPED_NETHER_BRICK_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item WARPED_NETHER_BRICK_STAIRS = register("warped_nether_brick_stairs", new BlockItem(CPlusBlocks.WARPED_NETHER_BRICK_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item WARPED_NETHER_BRICK_WALL = register("warped_nether_brick_wall", new BlockItem(CPlusBlocks.WARPED_NETHER_BRICK_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item WARPED_NETHER_BRICK_FENCE_GATE = register("warped_nether_brick_fence_gate", new BlockItem(CPlusBlocks.WARPED_NETHER_BRICK_FENCE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cracked Warped Wart Bricks
	public static final Item CRACKED_WARPED_NETHER_BRICKS = register("cracked_warped_nether_bricks", new BlockItem(CPlusBlocks.CRACKED_WARPED_NETHER_BRICKS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_WARPED_NETHER_BRICK_SLAB = register("cracked_warped_nether_brick_slab", new BlockItem(CPlusBlocks.CRACKED_WARPED_NETHER_BRICK_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_WARPED_NETHER_BRICK_STAIRS = register("cracked_warped_nether_brick_stairs", new BlockItem(CPlusBlocks.CRACKED_WARPED_NETHER_BRICK_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_WARPED_NETHER_BRICK_WALL = register("cracked_warped_nether_brick_wall", new BlockItem(CPlusBlocks.CRACKED_WARPED_NETHER_BRICK_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_WARPED_NETHER_BRICK_FENCE_GATE = register("cracked_warped_nether_brick_fence_gate", new BlockItem(CPlusBlocks.CRACKED_WARPED_NETHER_BRICK_FENCE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Warped Wart

	// Warped Wart Tiles

	// Warped Wart Pillar
	public static final Item WARPED_NETHER_BRICK_PILLAR = register("warped_nether_brick_pillar", new BlockItem(CPlusBlocks.WARPED_NETHER_BRICK_PILLAR, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Chiseled Warped Wart
	public static final Item CHISELED_WARPED_NETHER_BRICKS = register("chiseled_warped_nether_bricks", new BlockItem(CPlusBlocks.CHISELED_WARPED_NETHER_BRICKS, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Carved Warted Wart
	public static final Item CARVED_WARPED_NETHER_BRICKS = register("carved_warped_nether_bricks", new BlockItem(CPlusBlocks.CARVED_WARPED_NETHER_BRICKS, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	 */

// BASALT

	// Base

	// Cobbled Basalt

	// Polished Basalt

	// Smooth Basalt

	// Basalt Bricks

	// Cut Basalt

	// Basalt Tiles

	// Basalt Pillar

	// Chiseled Basalt

	// Carved Basalt


// PRISMARINE

	// Base
	public static final Item PRISMARINE_GATE = register("prismarine_gate", new BlockItem(CPlusBlocks.PRISMARINE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Polished Prismarine
	public static final Item POLISHED_PRISMARINE = register("polished_prismarine", new BlockItem(CPlusBlocks.POLISHED_PRISMARINE, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_PRISMARINE_SLAB = register("polished_prismarine_slab", new BlockItem(CPlusBlocks.POLISHED_PRISMARINE_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_PRISMARINE_STAIRS = register("polished_prismarine_stairs", new BlockItem(CPlusBlocks.POLISHED_PRISMARINE_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_PRISMARINE_WALL = register("polished_prismarine_wall", new BlockItem(CPlusBlocks.POLISHED_PRISMARINE_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_PRISMARINE_GATE = register("polished_prismarine_gate", new BlockItem(CPlusBlocks.POLISHED_PRISMARINE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Smooth Prismarine
	public static final Item SMOOTH_PRISMARINE = register("smooth_prismarine", new BlockItem(CPlusBlocks.SMOOTH_PRISMARINE, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_PRISMARINE_SLAB = register("smooth_prismarine_slab", new BlockItem(CPlusBlocks.SMOOTH_PRISMARINE_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_PRISMARINE_STAIRS = register("smooth_prismarine_stairs", new BlockItem(CPlusBlocks.SMOOTH_PRISMARINE_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_PRISMARINE_WALL = register("smooth_prismarine_wall", new BlockItem(CPlusBlocks.SMOOTH_PRISMARINE_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_PRISMARINE_GATE = register("smooth_prismarine_gate", new BlockItem(CPlusBlocks.SMOOTH_PRISMARINE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Prismarine Bricks
	public static final Item PRISMARINE_BRICK_WALL = register("prismarine_brick_wall", new BlockItem(CPlusBlocks.PRISMARINE_BRICK_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item PRISMARINE_BRICK_GATE = register("prismarine_brick_gate", new BlockItem(CPlusBlocks.PRISMARINE_BRICK_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Prismarine
	public static final Item CUT_PRISMARINE = register("cut_prismarine", new BlockItem(CPlusBlocks.CUT_PRISMARINE, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_PRISMARINE_SLAB = register("cut_prismarine_slab", new BlockItem(CPlusBlocks.CUT_PRISMARINE_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_PRISMARINE_STAIRS = register("cut_prismarine_stairs", new BlockItem(CPlusBlocks.CUT_PRISMARINE_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_PRISMARINE_WALL = register("cut_prismarine_wall", new BlockItem(CPlusBlocks.CUT_PRISMARINE_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_PRISMARINE_GATE = register("cut_prismarine_gate", new BlockItem(CPlusBlocks.CUT_PRISMARINE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Prismarine Tiles
	public static final Item PRISMARINE_TILES = register("prismarine_tiles", new BlockItem(CPlusBlocks.PRISMARINE_TILES, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item PRISMARINE_TILE_SLAB = register("prismarine_tile_slab", new BlockItem(CPlusBlocks.PRISMARINE_TILE_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item PRISMARINE_TILE_STAIRS = register("prismarine_tile_stairs", new BlockItem(CPlusBlocks.PRISMARINE_TILE_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item PRISMARINE_TILE_WALL = register("prismarine_tile_wall", new BlockItem(CPlusBlocks.PRISMARINE_TILE_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item PRISMARINE_TILE_GATE = register("prismarine_tile_gate", new BlockItem(CPlusBlocks.PRISMARINE_TILE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Prismarine Pillar
	public static final Item PRISMARINE_PILLAR = register("prismarine_pillar", new BlockItem(CPlusBlocks.PRISMARINE_PILLAR, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item PRISMARINE_CORNER_PILLAR = register("prismarine_corner_pillar", new BlockItem(CPlusBlocks.PRISMARINE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Chiseled Prismarine
	public static final Item CHISELED_PRISMARINE = register("chiseled_prismarine", new BlockItem(CPlusBlocks.CHISELED_PRISMARINE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Carved Prismarine
	public static final Item CARVED_PRISMARINE = register("carved_prismarine", new BlockItem(CPlusBlocks.CARVED_PRISMARINE, CPlusItemGroups.consistencyPlusMiscItemSettings()));


// DARK PRISMARINE

	// Base
	public static final Item DARK_PRISMARINE_WALL = register("dark_prismarine_wall", new BlockItem(CPlusBlocks.DARK_PRISMARINE_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item DARK_PRISMARINE_GATE = register("dark_prismarine_gate", new BlockItem(CPlusBlocks.DARK_PRISMARINE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Polished Dark Prismarine
	public static final Item POLISHED_DARK_PRISMARINE = register("polished_dark_prismarine", new BlockItem(CPlusBlocks.POLISHED_DARK_PRISMARINE, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_DARK_PRISMARINE_SLAB = register("polished_dark_prismarine_slab", new BlockItem(CPlusBlocks.POLISHED_DARK_PRISMARINE_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_DARK_PRISMARINE_STAIRS = register("polished_dark_prismarine_stairs", new BlockItem(CPlusBlocks.POLISHED_DARK_PRISMARINE_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_DARK_PRISMARINE_WALL = register("polished_dark_prismarine_wall", new BlockItem(CPlusBlocks.POLISHED_DARK_PRISMARINE_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_DARK_PRISMARINE_GATE = register("polished_dark_prismarine_gate", new BlockItem(CPlusBlocks.POLISHED_DARK_PRISMARINE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Smooth Dark Prismarine
	public static final Item SMOOTH_DARK_PRISMARINE = register("smooth_dark_prismarine", new BlockItem(CPlusBlocks.SMOOTH_DARK_PRISMARINE, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_DARK_PRISMARINE_SLAB = register("smooth_dark_prismarine_slab", new BlockItem(CPlusBlocks.SMOOTH_DARK_PRISMARINE_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_DARK_PRISMARINE_STAIRS = register("smooth_dark_prismarine_stairs", new BlockItem(CPlusBlocks.SMOOTH_DARK_PRISMARINE_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_DARK_PRISMARINE_WALL = register("smooth_dark_prismarine_wall", new BlockItem(CPlusBlocks.SMOOTH_DARK_PRISMARINE_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_DARK_PRISMARINE_GATE = register("smooth_dark_prismarine_gate", new BlockItem(CPlusBlocks.SMOOTH_DARK_PRISMARINE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Dark Prismarine Bricks
	public static final Item DARK_PRISMARINE_BRICKS = register("dark_prismarine_bricks", new BlockItem(CPlusBlocks.DARK_PRISMARINE_BRICKS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item DARK_PRISMARINE_BRICK_SLAB = register("dark_prismarine_brick_slab", new BlockItem(CPlusBlocks.DARK_PRISMARINE_BRICK_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item DARK_PRISMARINE_BRICK_STAIRS = register("dark_prismarine_brick_stairs", new BlockItem(CPlusBlocks.DARK_PRISMARINE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item DARK_PRISMARINE_BRICK_WALL = register("dark_prismarine_brick_wall", new BlockItem(CPlusBlocks.DARK_PRISMARINE_BRICK_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item DARK_PRISMARINE_BRICK_GATE = register("dark_prismarine_brick_gate", new BlockItem(CPlusBlocks.DARK_PRISMARINE_BRICK_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Dark Prismarine
	public static final Item CUT_DARK_PRISMARINE = register("cut_dark_prismarine", new BlockItem(CPlusBlocks.CUT_DARK_PRISMARINE, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_DARK_PRISMARINE_SLAB = register("cut_dark_prismarine_slab", new BlockItem(CPlusBlocks.CUT_DARK_PRISMARINE_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_DARK_PRISMARINE_STAIRS = register("cut_dark_prismarine_stairs", new BlockItem(CPlusBlocks.CUT_DARK_PRISMARINE_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_DARK_PRISMARINE_WALL = register("cut_dark_prismarine_wall", new BlockItem(CPlusBlocks.CUT_DARK_PRISMARINE_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_DARK_PRISMARINE_GATE = register("cut_dark_prismarine_gate", new BlockItem(CPlusBlocks.CUT_DARK_PRISMARINE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Dark Prismarine Tiles
	public static final Item DARK_PRISMARINE_TILES = register("dark_prismarine_tiles", new BlockItem(CPlusBlocks.DARK_PRISMARINE_TILES, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item DARK_PRISMARINE_TILE_SLAB = register("dark_prismarine_tile_slab", new BlockItem(CPlusBlocks.DARK_PRISMARINE_TILE_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item DARK_PRISMARINE_TILE_STAIRS = register("dark_prismarine_tile_stairs", new BlockItem(CPlusBlocks.DARK_PRISMARINE_TILE_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item DARK_PRISMARINE_TILE_WALL = register("dark_prismarine_tile_wall", new BlockItem(CPlusBlocks.DARK_PRISMARINE_TILE_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item DARK_PRISMARINE_TILE_GATE = register("dark_prismarine_tile_gate", new BlockItem(CPlusBlocks.DARK_PRISMARINE_TILE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Dark Prismarine Pillar
	public static final Item DARK_PRISMARINE_PILLAR = register("dark_prismarine_pillar", new BlockItem(CPlusBlocks.DARK_PRISMARINE_PILLAR, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item DARK_PRISMARINE_CORNER_PILLAR = register("dark_prismarine_corner_pillar", new BlockItem(CPlusBlocks.DARK_PRISMARINE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Chiseled Dark Prismarine
	public static final Item CHISELED_DARK_PRISMARINE = register("chiseled_dark_prismarine", new BlockItem(CPlusBlocks.CHISELED_DARK_PRISMARINE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Carved Dark Prismarine
	public static final Item CARVED_DARK_PRISMARINE = register("carved_dark_prismarine", new BlockItem(CPlusBlocks.CARVED_DARK_PRISMARINE, CPlusItemGroups.consistencyPlusMiscItemSettings()));


// PURPUR

	// Base
	public static final Item PURPUR_BLOCK = register("purpur_block", new BlockItem(CPlusBlocks.PURPUR_BLOCK, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item PURPUR_SLAB = register("purpur_slab", new BlockItem(CPlusBlocks.PURPUR_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item PURPUR_STAIRS = register("purpur_stairs", new BlockItem(CPlusBlocks.PURPUR_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item PURPUR_WALL = register("purpur_wall", new BlockItem(CPlusBlocks.PURPUR_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item PURPUR_GATE = register("purpur_gate", new BlockItem(CPlusBlocks.PURPUR_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Polished Purpur
	public static final Item POLISHED_PURPUR = register("polished_purpur", new BlockItem(CPlusBlocks.POLISHED_PURPUR, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_PURPUR_SLAB = register("polished_purpur_slab", new BlockItem(CPlusBlocks.POLISHED_PURPUR_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_PURPUR_STAIRS = register("polished_purpur_stairs", new BlockItem(CPlusBlocks.POLISHED_PURPUR_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_PURPUR_WALL = register("polished_purpur_wall", new BlockItem(CPlusBlocks.POLISHED_PURPUR_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_PURPUR_GATE = register("polished_purpur_gate", new BlockItem(CPlusBlocks.POLISHED_PURPUR_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Smooth Purpur
	public static final Item SMOOTH_PURPUR = register("smooth_purpur", new BlockItem(CPlusBlocks.SMOOTH_PURPUR, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_PURPUR_SLAB = register("smooth_purpur_slab", new BlockItem(CPlusBlocks.SMOOTH_PURPUR_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_PURPUR_STAIRS = register("smooth_purpur_stairs", new BlockItem(CPlusBlocks.SMOOTH_PURPUR_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_PURPUR_WALL = register("smooth_purpur_wall", new BlockItem(CPlusBlocks.SMOOTH_PURPUR_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_PURPUR_GATE = register("smooth_purpur_gate", new BlockItem(CPlusBlocks.SMOOTH_PURPUR_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Purpur Bricks
	public static final Item PURPUR_BRICKS = register("purpur_bricks", new BlockItem(CPlusBlocks.PURPUR_BRICKS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item PURPUR_BRICK_SLAB = register("purpur_brick_slab", new BlockItem(CPlusBlocks.PURPUR_BRICK_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item PURPUR_BRICK_STAIRS = register("purpur_brick_stairs", new BlockItem(CPlusBlocks.PURPUR_BRICK_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item PURPUR_BRICK_WALL = register("purpur_brick_wall", new BlockItem(CPlusBlocks.PURPUR_BRICK_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item PURPUR_BRICK_GATE = register("purpur_brick_gate", new BlockItem(CPlusBlocks.PURPUR_BRICK_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cracked Purpur Bricks
	public static final Item CRACKED_PURPUR_BRICKS = register("cracked_purpur_bricks", new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICKS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_PURPUR_BRICK_SLAB = register("cracked_purpur_brick_slab", new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_PURPUR_BRICK_STAIRS = register("cracked_purpur_brick_stairs", new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_PURPUR_BRICK_WALL = register("cracked_purpur_brick_wall", new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_PURPUR_BRICK_GATE = register("cracked_purpur_brick_gate", new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Purpur
	public static final Item CUT_PURPUR = register("cut_purpur", new BlockItem(CPlusBlocks.CUT_PURPUR, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_PURPUR_SLAB = register("cut_purpur_slab", new BlockItem(CPlusBlocks.CUT_PURPUR_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_PURPUR_STAIRS = register("cut_purpur_stairs", new BlockItem(CPlusBlocks.CUT_PURPUR_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_PURPUR_WALL = register("cut_purpur_wall", new BlockItem(CPlusBlocks.CUT_PURPUR_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_PURPUR_GATE = register("cut_purpur_gate", new BlockItem(CPlusBlocks.CUT_PURPUR_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Purpur Tiles
	public static final Item PURPUR_TILE_WALL = register("purpur_tile_wall", new BlockItem(CPlusBlocks.PURPUR_TILE_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item PURPUR_TILE_GATE = register("purpur_tile_gate", new BlockItem(CPlusBlocks.PURPUR_TILE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Purpur Pillar
	public static final Item PURPUR_CORNER_PILLAR = register("purpur_corner_pillar", new BlockItem(CPlusBlocks.PURPUR_CORNER_PILLAR, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Chiseled Purpur
	public static final Item CHISELED_PURPUR = register("chiseled_purpur", new BlockItem(CPlusBlocks.CHISELED_PURPUR, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Carved Purpur
	public static final Item CARVED_PURPUR = register("carved_purpur", new BlockItem(CPlusBlocks.CARVED_PURPUR, CPlusItemGroups.consistencyPlusMiscItemSettings()));


// END STONE

	// Base
	public static final Item END_STONE_SLAB = register("end_stone_slab", new BlockItem(CPlusBlocks.END_STONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item END_STONE_STAIRS = register("end_stone_stairs", new BlockItem(CPlusBlocks.END_STONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item END_STONE_WALL = register("end_stone_wall", new BlockItem(CPlusBlocks.END_STONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item END_STONE_GATE = register("end_stone_gate", new BlockItem(CPlusBlocks.END_STONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled End Stone
	public static final Item COBBLED_END_STONE = register("cobbled_end_stone", new BlockItem(CPlusBlocks.COBBLED_END_STONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_END_STONE_SLAB = register("cobbled_end_stone_slab", new BlockItem(CPlusBlocks.COBBLED_END_STONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_END_STONE_STAIRS = register("cobbled_end_stone_stairs", new BlockItem(CPlusBlocks.COBBLED_END_STONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_END_STONE_WALL = register("cobbled_end_stone_wall", new BlockItem(CPlusBlocks.COBBLED_END_STONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item COBBLED_END_STONE_GATE = register("cobbled_end_stone_gate", new BlockItem(CPlusBlocks.COBBLED_END_STONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished End Stone
	public static final Item POLISHED_END_STONE = register("polished_end_stone", new BlockItem(CPlusBlocks.POLISHED_END_STONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_END_STONE_SLAB = register("polished_end_stone_slab", new BlockItem(CPlusBlocks.POLISHED_END_STONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_END_STONE_STAIRS = register("polished_end_stone_stairs", new BlockItem(CPlusBlocks.POLISHED_END_STONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_END_STONE_WALL = register("polished_end_stone_wall", new BlockItem(CPlusBlocks.POLISHED_END_STONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item POLISHED_END_STONE_GATE = register("polished_end_stone_gate", new BlockItem(CPlusBlocks.POLISHED_END_STONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth End Stone
	public static final Item SMOOTH_END_STONE = register("smooth_end_stone", new BlockItem(CPlusBlocks.SMOOTH_END_STONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_END_STONE_SLAB = register("smooth_end_stone_slab", new BlockItem(CPlusBlocks.SMOOTH_END_STONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_END_STONE_STAIRS = register("smooth_end_stone_stairs", new BlockItem(CPlusBlocks.SMOOTH_END_STONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_END_STONE_WALL = register("smooth_end_stone_wall", new BlockItem(CPlusBlocks.SMOOTH_END_STONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item SMOOTH_END_STONE_GATE = register("smooth_end_stone_gate", new BlockItem(CPlusBlocks.SMOOTH_END_STONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// End Stone Bricks
	public static final Item END_STONE_BRICK_GATE = register("end_stone_brick_gate", new BlockItem(CPlusBlocks.END_STONE_BRICK_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut End Stone
	public static final Item CUT_END_STONE = register("cut_end_stone", new BlockItem(CPlusBlocks.CUT_END_STONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_END_STONE_SLAB = register("cut_end_stone_slab", new BlockItem(CPlusBlocks.CUT_END_STONE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_END_STONE_STAIRS = register("cut_end_stone_stairs", new BlockItem(CPlusBlocks.CUT_END_STONE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_END_STONE_WALL = register("cut_end_stone_wall", new BlockItem(CPlusBlocks.CUT_END_STONE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item CUT_END_STONE_GATE = register("cut_end_stone_gate", new BlockItem(CPlusBlocks.CUT_END_STONE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// End Stone Tiles
	public static final Item END_STONE_TILES = register("end_stone_tiles", new BlockItem(CPlusBlocks.END_STONE_TILES, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item END_STONE_TILE_SLAB = register("end_stone_tile_slab", new BlockItem(CPlusBlocks.END_STONE_TILE_SLAB, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item END_STONE_TILE_STAIRS = register("end_stone_tile_stairs", new BlockItem(CPlusBlocks.END_STONE_TILE_STAIRS, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item END_STONE_TILE_WALL = register("end_stone_tile_wall", new BlockItem(CPlusBlocks.END_STONE_TILE_WALL, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item END_STONE_TILE_GATE = register("end_stone_tile_gate", new BlockItem(CPlusBlocks.END_STONE_TILE_GATE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// End Stone Pillar
	public static final Item END_STONE_PILLAR = register("end_stone_pillar", new BlockItem(CPlusBlocks.END_STONE_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final Item END_STONE_CORNER_PILLAR = register("end_stone_corner_pillar", new BlockItem(CPlusBlocks.END_STONE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled End Stone
	public static final Item CHISELED_END_STONE = register("chiseled_end_stone", new BlockItem(CPlusBlocks.CHISELED_END_STONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved End Stone
	public static final Item CARVED_END_STONE = register("carved_end_stone", new BlockItem(CPlusBlocks.CARVED_END_STONE, CPlusItemGroups.consistencyPlusStoneItemSettings()));


// OBSIDIAN

	// Base
	public static final Item OBSIDIAN_SLAB = register("obsidian_slab", new BlockItem(CPlusBlocks.OBSIDIAN_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item OBSIDIAN_STAIRS = register("obsidian_stairs", new BlockItem(CPlusBlocks.OBSIDIAN_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item OBSIDIAN_WALL = register("obsidian_wall", new BlockItem(CPlusBlocks.OBSIDIAN_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item OBSIDIAN_GATE = register("obsidian_gate", new BlockItem(CPlusBlocks.OBSIDIAN_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Crying Base
	public static final Item CRYING_OBSIDIAN_SLAB = register("crying_obsidian_slab", new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRYING_OBSIDIAN_STAIRS = register("crying_obsidian_stairs", new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRYING_OBSIDIAN_WALL = register("crying_obsidian_wall", new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRYING_OBSIDIAN_GATE = register("crying_obsidian_gate", new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Polished Obsidian
	public static final Item POLISHED_OBSIDIAN = register("polished_obsidian", new BlockItem(CPlusBlocks.POLISHED_OBSIDIAN, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_OBSIDIAN_SLAB = register("polished_obsidian_slab", new BlockItem(CPlusBlocks.POLISHED_OBSIDIAN_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_OBSIDIAN_STAIRS = register("polished_obsidian_stairs", new BlockItem(CPlusBlocks.POLISHED_OBSIDIAN_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_OBSIDIAN_WALL = register("polished_obsidian_wall", new BlockItem(CPlusBlocks.POLISHED_OBSIDIAN_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_OBSIDIAN_GATE = register("polished_obsidian_gate", new BlockItem(CPlusBlocks.POLISHED_OBSIDIAN_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Polished Crying Obsidian
	public static final Item POLISHED_CRYING_OBSIDIAN = register("polished_crying_obsidian", new BlockItem(CPlusBlocks.POLISHED_CRYING_OBSIDIAN, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_CRYING_OBSIDIAN_SLAB = register("polished_crying_obsidian_slab", new BlockItem(CPlusBlocks.POLISHED_CRYING_OBSIDIAN_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_CRYING_OBSIDIAN_STAIRS = register("polished_crying_obsidian_stairs", new BlockItem(CPlusBlocks.POLISHED_CRYING_OBSIDIAN_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_CRYING_OBSIDIAN_WALL = register("polished_crying_obsidian_wall", new BlockItem(CPlusBlocks.POLISHED_CRYING_OBSIDIAN_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item POLISHED_CRYING_OBSIDIAN_GATE = register("polished_crying_obsidian_gate", new BlockItem(CPlusBlocks.POLISHED_CRYING_OBSIDIAN_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Smooth Obsidian
	public static final Item SMOOTH_OBSIDIAN = register("smooth_obsidian", new BlockItem(CPlusBlocks.SMOOTH_OBSIDIAN, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_OBSIDIAN_SLAB = register("smooth_obsidian_slab", new BlockItem(CPlusBlocks.SMOOTH_OBSIDIAN_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_OBSIDIAN_STAIRS = register("smooth_obsidian_stairs", new BlockItem(CPlusBlocks.SMOOTH_OBSIDIAN_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_OBSIDIAN_WALL = register("smooth_obsidian_wall", new BlockItem(CPlusBlocks.SMOOTH_OBSIDIAN_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_OBSIDIAN_GATE = register("smooth_obsidian_gate", new BlockItem(CPlusBlocks.SMOOTH_OBSIDIAN_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Smooth Crying Obsidian
	public static final Item SMOOTH_CRYING_OBSIDIAN = register("smooth_crying_obsidian", new BlockItem(CPlusBlocks.SMOOTH_CRYING_OBSIDIAN, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_CRYING_OBSIDIAN_SLAB = register("smooth_crying_obsidian_slab", new BlockItem(CPlusBlocks.SMOOTH_CRYING_OBSIDIAN_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_CRYING_OBSIDIAN_STAIRS = register("smooth_crying_obsidian_stairs", new BlockItem(CPlusBlocks.SMOOTH_CRYING_OBSIDIAN_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_CRYING_OBSIDIAN_WALL = register("smooth_crying_obsidian_wall", new BlockItem(CPlusBlocks.SMOOTH_CRYING_OBSIDIAN_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item SMOOTH_CRYING_OBSIDIAN_GATE = register("smooth_crying_obsidian_gate", new BlockItem(CPlusBlocks.SMOOTH_CRYING_OBSIDIAN_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Obsidian Bricks
	public static final Item OBSIDIAN_BRICKS = register("obsidian_bricks", new BlockItem(CPlusBlocks.OBSIDIAN_BRICKS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item OBSIDIAN_BRICK_SLAB = register("obsidian_brick_slab", new BlockItem(CPlusBlocks.OBSIDIAN_BRICK_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item OBSIDIAN_BRICK_STAIRS = register("obsidian_brick_stairs", new BlockItem(CPlusBlocks.OBSIDIAN_BRICK_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item OBSIDIAN_BRICK_WALL = register("obsidian_brick_wall", new BlockItem(CPlusBlocks.OBSIDIAN_BRICK_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item OBSIDIAN_BRICK_GATE = register("obsidian_brick_gate", new BlockItem(CPlusBlocks.OBSIDIAN_BRICK_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Crying Obsidian Bricks
	public static final Item CRYING_OBSIDIAN_BRICKS = register("crying_obsidian_bricks", new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_BRICKS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRYING_OBSIDIAN_BRICK_SLAB = register("crying_obsidian_brick_slab", new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_BRICK_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRYING_OBSIDIAN_BRICK_STAIRS = register("crying_obsidian_brick_stairs", new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_BRICK_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRYING_OBSIDIAN_BRICK_WALL = register("crying_obsidian_brick_wall", new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_BRICK_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRYING_OBSIDIAN_BRICK_GATE = register("crying_obsidian_brick_gate", new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_BRICK_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Obsidian
	public static final Item CUT_OBSIDIAN = register("cut_obsidian", new BlockItem(CPlusBlocks.CUT_OBSIDIAN, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_OBSIDIAN_SLAB = register("cut_obsidian_slab", new BlockItem(CPlusBlocks.CUT_OBSIDIAN_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_OBSIDIAN_STAIRS = register("cut_obsidian_stairs", new BlockItem(CPlusBlocks.CUT_OBSIDIAN_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_OBSIDIAN_WALL = register("cut_obsidian_wall", new BlockItem(CPlusBlocks.CUT_OBSIDIAN_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_OBSIDIAN_GATE = register("cut_obsidian_gate", new BlockItem(CPlusBlocks.CUT_OBSIDIAN_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Crying Obsidian
	public static final Item CUT_CRYING_OBSIDIAN = register("cut_crying_obsidian", new BlockItem(CPlusBlocks.CUT_CRYING_OBSIDIAN, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_CRYING_OBSIDIAN_SLAB = register("cut_crying_obsidian_slab", new BlockItem(CPlusBlocks.CUT_CRYING_OBSIDIAN_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_CRYING_OBSIDIAN_STAIRS = register("cut_crying_obsidian_stairs", new BlockItem(CPlusBlocks.CUT_CRYING_OBSIDIAN_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_CRYING_OBSIDIAN_WALL = register("cut_crying_obsidian_wall", new BlockItem(CPlusBlocks.CUT_CRYING_OBSIDIAN_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CUT_CRYING_OBSIDIAN_GATE = register("cut_crying_obsidian_gate", new BlockItem(CPlusBlocks.CUT_CRYING_OBSIDIAN_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Obsidian Tiles
	public static final Item OBSIDIAN_TILES = register("obsidian_tiles", new BlockItem(CPlusBlocks.OBSIDIAN_TILES, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item OBSIDIAN_TILE_SLAB = register("obsidian_tile_slab", new BlockItem(CPlusBlocks.OBSIDIAN_TILE_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item OBSIDIAN_TILE_STAIRS = register("obsidian_tile_stairs", new BlockItem(CPlusBlocks.OBSIDIAN_TILE_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item OBSIDIAN_TILE_WALL = register("obsidian_tile_wall", new BlockItem(CPlusBlocks.OBSIDIAN_TILE_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item OBSIDIAN_TILE_GATE = register("obsidian_tile_gate", new BlockItem(CPlusBlocks.OBSIDIAN_TILE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Crying Obsidian Tiles
	public static final Item CRYING_OBSIDIAN_TILES = register("crying_obsidian_tiles", new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_TILES, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRYING_OBSIDIAN_TILE_SLAB = register("crying_obsidian_tile_slab", new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_TILE_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRYING_OBSIDIAN_TILE_STAIRS = register("crying_obsidian_tile_stairs", new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_TILE_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRYING_OBSIDIAN_TILE_WALL = register("crying_obsidian_tile_wall", new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_TILE_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRYING_OBSIDIAN_TILE_GATE = register("crying_obsidian_tile_gate", new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_TILE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Obsidian Pillar
	public static final Item OBSIDIAN_PILLAR = register("obsidian_pillar", new BlockItem(CPlusBlocks.OBSIDIAN_PILLAR, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item OBSIDIAN_CORNER_PILLAR = register("obsidian_corner_pillar", new BlockItem(CPlusBlocks.OBSIDIAN_CORNER_PILLAR, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Crying Obsidian Pillar
	public static final Item CRYING_OBSIDIAN_PILLAR = register("crying_obsidian_pillar", new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_PILLAR, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRYING_OBSIDIAN_CORNER_PILLAR = register("crying_obsidian_corner_pillar", new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_CORNER_PILLAR, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Chiseled Obsidian
	public static final Item CHISELED_OBSIDIAN = register("chiseled_obsidian", new BlockItem(CPlusBlocks.CHISELED_OBSIDIAN, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Chiseled Crying Obsidian
	public static final Item CHISELED_CRYING_OBSIDIAN = register("chiseled_crying_obsidian", new BlockItem(CPlusBlocks.CHISELED_CRYING_OBSIDIAN, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Carved Obsidian
	public static final Item CARVED_OBSIDIAN = register("carved_obsidian", new BlockItem(CPlusBlocks.CARVED_OBSIDIAN, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Carved Crying Obsidian
	public static final Item CARVED_CRYING_OBSIDIAN = register("carved_crying_obsidian", new BlockItem(CPlusBlocks.CARVED_CRYING_OBSIDIAN, CPlusItemGroups.consistencyPlusMiscItemSettings()));


// COPPER

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// EXPOSED COPPER

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// WEATHERED COPPER

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// OXIDIZED COPPER

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// WAXED COPPER

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// WAXED EXPOSED COPPER

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// WAXED WEATHERED COPPER

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// WAXED OXIDIZED COPPER

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// IRON

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// EXPOSED IRON

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// WEATHERED IRON

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// RUSTED IRON

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// WAXED IRON

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// WAXED EXPOSED IRON

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// WAXED WEATHERED IRON

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// WAXED RUSTED IRON

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// GOLD

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// EXPOSED GOLD

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// WEATHERED GOLD

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// CORRODED GOLD

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// WAXED GOLD

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// WAXED EXPOSED GOLD

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// WAXED WEATHERED GOLD

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// WAXED CORRODED GOLD

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// TERRACOTTA

	// Base
	public static final Item TERRACOTTA_SLAB = register("terracotta_slab", new BlockItem(CPlusBlocks.TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item TERRACOTTA_STAIRS = register("terracotta_stairs", new BlockItem(CPlusBlocks.TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item TERRACOTTA_WALL = register("terracotta_wall", new BlockItem(CPlusBlocks.TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item TERRACOTTA_GATE = register("terracotta_gate", new BlockItem(CPlusBlocks.TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Terracotta
	public static final Item COBBLED_TERRACOTTA = register("cobbled_terracotta", new BlockItem(CPlusBlocks.COBBLED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_TERRACOTTA_SLAB = register("cobbled_terracotta_slab", new BlockItem(CPlusBlocks.COBBLED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_TERRACOTTA_STAIRS = register("cobbled_terracotta_stairs", new BlockItem(CPlusBlocks.COBBLED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_TERRACOTTA_WALL = register("cobbled_terracotta_wall", new BlockItem(CPlusBlocks.COBBLED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_TERRACOTTA_GATE = register("cobbled_terracotta_gate", new BlockItem(CPlusBlocks.COBBLED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Terracotta
	public static final Item POLISHED_TERRACOTTA = register("polished_terracotta", new BlockItem(CPlusBlocks.POLISHED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_TERRACOTTA_SLAB = register("polished_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_TERRACOTTA_STAIRS = register("polished_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_TERRACOTTA_WALL = register("polished_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_TERRACOTTA_GATE = register("polished_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Terracotta
	public static final Item SMOOTH_TERRACOTTA = register("smooth_terracotta", new BlockItem(CPlusBlocks.SMOOTH_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_TERRACOTTA_SLAB = register("smooth_terracotta_slab", new BlockItem(CPlusBlocks.SMOOTH_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_TERRACOTTA_STAIRS = register("smooth_terracotta_stairs", new BlockItem(CPlusBlocks.SMOOTH_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_TERRACOTTA_WALL = register("smooth_terracotta_wall", new BlockItem(CPlusBlocks.SMOOTH_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_TERRACOTTA_GATE = register("smooth_terracotta_gate", new BlockItem(CPlusBlocks.SMOOTH_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Terracotta Bricks
	public static final Item BRICK_GATE = register("brick_gate", new BlockItem(CPlusBlocks.BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Terracotta
	public static final Item CUT_TERRACOTTA = register("cut_terracotta", new BlockItem(CPlusBlocks.CUT_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_TERRACOTTA_SLAB = register("cut_terracotta_slab", new BlockItem(CPlusBlocks.CUT_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_TERRACOTTA_STAIRS = register("cut_terracotta_stairs", new BlockItem(CPlusBlocks.CUT_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_TERRACOTTA_WALL = register("cut_terracotta_wall", new BlockItem(CPlusBlocks.CUT_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_TERRACOTTA_GATE = register("cut_terracotta_gate", new BlockItem(CPlusBlocks.CUT_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Terracotta Tiles
	public static final Item TERRACOTTA_TILES = register("terracotta_tiles", new BlockItem(CPlusBlocks.TERRACOTTA_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item TERRACOTTA_TILE_SLAB = register("terracotta_tile_slab", new BlockItem(CPlusBlocks.TERRACOTTA_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item TERRACOTTA_TILE_STAIRS = register("terracotta_tile_stairs", new BlockItem(CPlusBlocks.TERRACOTTA_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item TERRACOTTA_TILE_WALL = register("terracotta_tile_wall", new BlockItem(CPlusBlocks.TERRACOTTA_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item TERRACOTTA_TILE_GATE = register("terracotta_tile_gate", new BlockItem(CPlusBlocks.TERRACOTTA_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Terracotta Pillar
	public static final Item TERRACOTTA_PILLAR = register("terracotta_pillar", new BlockItem(CPlusBlocks.TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item TERRACOTTA_CORNER_PILLAR = register("terracotta_corner_pillar", new BlockItem(CPlusBlocks.TERRACOTTA_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Terracotta
	public static final Item CHISELED_TERRACOTTA = register("chiseled_terracotta", new BlockItem(CPlusBlocks.CHISELED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Terracotta
	public static final Item CARVED_TERRACOTTA = register("carved_terracotta", new BlockItem(CPlusBlocks.CARVED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// RED TERRACOTTA

	// Base
	public static final Item RED_TERRACOTTA_SLAB = register("red_terracotta_slab", new BlockItem(CPlusBlocks.RED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_TERRACOTTA_STAIRS = register("red_terracotta_stairs", new BlockItem(CPlusBlocks.RED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_TERRACOTTA_WALL = register("red_terracotta_wall", new BlockItem(CPlusBlocks.RED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_TERRACOTTA_GATE = register("red_terracotta_gate", new BlockItem(CPlusBlocks.RED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Red Terracotta
	public static final Item COBBLED_RED_TERRACOTTA = register("cobbled_red_terracotta", new BlockItem(CPlusBlocks.COBBLED_RED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_RED_TERRACOTTA_SLAB = register("cobbled_red_terracotta_slab", new BlockItem(CPlusBlocks.COBBLED_RED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_RED_TERRACOTTA_STAIRS = register("cobbled_red_terracotta_stairs", new BlockItem(CPlusBlocks.COBBLED_RED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_RED_TERRACOTTA_WALL = register("cobbled_red_terracotta_wall", new BlockItem(CPlusBlocks.COBBLED_RED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_RED_TERRACOTTA_GATE = register("cobbled_red_terracotta_gate", new BlockItem(CPlusBlocks.COBBLED_RED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Red Terracotta
	public static final Item POLISHED_RED_TERRACOTTA = register("polished_red_terracotta", new BlockItem(CPlusBlocks.POLISHED_RED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_RED_TERRACOTTA_SLAB = register("polished_red_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_RED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_RED_TERRACOTTA_STAIRS = register("polished_red_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_RED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_RED_TERRACOTTA_WALL = register("polished_red_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_RED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_RED_TERRACOTTA_GATE = register("polished_red_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_RED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Red Terracotta
	public static final Item SMOOTH_RED_TERRACOTTA = register("smooth_red_terracotta", new BlockItem(CPlusBlocks.SMOOTH_RED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_RED_TERRACOTTA_SLAB = register("smooth_red_terracotta_slab", new BlockItem(CPlusBlocks.SMOOTH_RED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_RED_TERRACOTTA_STAIRS = register("smooth_red_terracotta_stairs", new BlockItem(CPlusBlocks.SMOOTH_RED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_RED_TERRACOTTA_WALL = register("smooth_red_terracotta_wall", new BlockItem(CPlusBlocks.SMOOTH_RED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_RED_TERRACOTTA_GATE = register("smooth_red_terracotta_gate", new BlockItem(CPlusBlocks.SMOOTH_RED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Red Terracotta Bricks
	public static final Item RED_TERRACOTTA_BRICKS = register("red_terracotta_bricks", new BlockItem(CPlusBlocks.RED_TERRACOTTA_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_TERRACOTTA_BRICK_SLAB = register("red_terracotta_brick_slab", new BlockItem(CPlusBlocks.RED_TERRACOTTA_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_TERRACOTTA_BRICK_STAIRS = register("red_terracotta_brick_stairs", new BlockItem(CPlusBlocks.RED_TERRACOTTA_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_TERRACOTTA_BRICK_WALL = register("red_terracotta_brick_wall", new BlockItem(CPlusBlocks.RED_TERRACOTTA_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_TERRACOTTA_BRICK_GATE = register("red_terracotta_brick_gate", new BlockItem(CPlusBlocks.RED_TERRACOTTA_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Red Terracotta
	public static final Item CUT_RED_TERRACOTTA = register("cut_red_terracotta", new BlockItem(CPlusBlocks.CUT_RED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_RED_TERRACOTTA_SLAB = register("cut_red_terracotta_slab", new BlockItem(CPlusBlocks.CUT_RED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_RED_TERRACOTTA_STAIRS = register("cut_red_terracotta_stairs", new BlockItem(CPlusBlocks.CUT_RED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_RED_TERRACOTTA_WALL = register("cut_red_terracotta_wall", new BlockItem(CPlusBlocks.CUT_RED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_RED_TERRACOTTA_GATE = register("cut_red_terracotta_gate", new BlockItem(CPlusBlocks.CUT_RED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Red Terracotta Tiles
	public static final Item RED_TERRACOTTA_TILES = register("red_terracotta_tiles", new BlockItem(CPlusBlocks.RED_TERRACOTTA_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_TERRACOTTA_TILE_SLAB = register("red_terracotta_tile_slab", new BlockItem(CPlusBlocks.RED_TERRACOTTA_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_TERRACOTTA_TILE_STAIRS = register("red_terracotta_tile_stairs", new BlockItem(CPlusBlocks.RED_TERRACOTTA_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_TERRACOTTA_TILE_WALL = register("red_terracotta_tile_wall", new BlockItem(CPlusBlocks.RED_TERRACOTTA_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_TERRACOTTA_TILE_GATE = register("red_terracotta_tile_gate", new BlockItem(CPlusBlocks.RED_TERRACOTTA_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Red Terracotta Pillar
	public static final Item RED_TERRACOTTA_PILLAR = register("red_terracotta_pillar", new BlockItem(CPlusBlocks.RED_TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_TERRACOTTA_CORNER_PILLAR = register("red_terracotta_corner_pillar", new BlockItem(CPlusBlocks.RED_TERRACOTTA_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Red Terracotta
	public static final Item CHISELED_RED_TERRACOTTA = register("chiseled_red_terracotta", new BlockItem(CPlusBlocks.CHISELED_RED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Red Terracotta
	public static final Item CARVED_RED_TERRACOTTA = register("carved_red_terracotta", new BlockItem(CPlusBlocks.CARVED_RED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// ORANGE TERRACOTTA

	// Base
	public static final Item ORANGE_TERRACOTTA_SLAB = register("orange_terracotta_slab", new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_TERRACOTTA_STAIRS = register("orange_terracotta_stairs", new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_TERRACOTTA_WALL = register("orange_terracotta_wall", new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_TERRACOTTA_GATE = register("orange_terracotta_gate", new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Orange Terracotta
	public static final Item COBBLED_ORANGE_TERRACOTTA = register("cobbled_orange_terracotta", new BlockItem(CPlusBlocks.COBBLED_ORANGE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_ORANGE_TERRACOTTA_SLAB = register("cobbled_orange_terracotta_slab", new BlockItem(CPlusBlocks.COBBLED_ORANGE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_ORANGE_TERRACOTTA_STAIRS = register("cobbled_orange_terracotta_stairs", new BlockItem(CPlusBlocks.COBBLED_ORANGE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_ORANGE_TERRACOTTA_WALL = register("cobbled_orange_terracotta_wall", new BlockItem(CPlusBlocks.COBBLED_ORANGE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_ORANGE_TERRACOTTA_GATE = register("cobbled_orange_terracotta_gate", new BlockItem(CPlusBlocks.COBBLED_ORANGE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Orange Terracotta
	public static final Item POLISHED_ORANGE_TERRACOTTA = register("polished_orange_terracotta", new BlockItem(CPlusBlocks.POLISHED_ORANGE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_ORANGE_TERRACOTTA_SLAB = register("polished_orange_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_ORANGE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_ORANGE_TERRACOTTA_STAIRS = register("polished_orange_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_ORANGE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_ORANGE_TERRACOTTA_WALL = register("polished_orange_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_ORANGE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_ORANGE_TERRACOTTA_GATE = register("polished_orange_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_ORANGE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Orange Terracotta
	public static final Item SMOOTH_ORANGE_TERRACOTTA = register("smooth_orange_terracotta", new BlockItem(CPlusBlocks.SMOOTH_ORANGE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_ORANGE_TERRACOTTA_SLAB = register("smooth_orange_terracotta_slab", new BlockItem(CPlusBlocks.SMOOTH_ORANGE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_ORANGE_TERRACOTTA_STAIRS = register("smooth_orange_terracotta_stairs", new BlockItem(CPlusBlocks.SMOOTH_ORANGE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_ORANGE_TERRACOTTA_WALL = register("smooth_orange_terracotta_wall", new BlockItem(CPlusBlocks.SMOOTH_ORANGE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_ORANGE_TERRACOTTA_GATE = register("smooth_orange_terracotta_gate", new BlockItem(CPlusBlocks.SMOOTH_ORANGE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Orange Terracotta Bricks
	public static final Item ORANGE_TERRACOTTA_BRICKS = register("orange_terracotta_bricks", new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_TERRACOTTA_BRICK_SLAB = register("orange_terracotta_brick_slab", new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_TERRACOTTA_BRICK_STAIRS = register("orange_terracotta_brick_stairs", new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_TERRACOTTA_BRICK_WALL = register("orange_terracotta_brick_wall", new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_TERRACOTTA_BRICK_GATE = register("orange_terracotta_brick_gate", new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Orange Terracotta
	public static final Item CUT_ORANGE_TERRACOTTA = register("cut_orange_terracotta", new BlockItem(CPlusBlocks.CUT_ORANGE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_ORANGE_TERRACOTTA_SLAB = register("cut_orange_terracotta_slab", new BlockItem(CPlusBlocks.CUT_ORANGE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_ORANGE_TERRACOTTA_STAIRS = register("cut_orange_terracotta_stairs", new BlockItem(CPlusBlocks.CUT_ORANGE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_ORANGE_TERRACOTTA_WALL = register("cut_orange_terracotta_wall", new BlockItem(CPlusBlocks.CUT_ORANGE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_ORANGE_TERRACOTTA_GATE = register("cut_orange_terracotta_gate", new BlockItem(CPlusBlocks.CUT_ORANGE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Orange Terracotta Tiles
	public static final Item ORANGE_TERRACOTTA_TILES = register("orange_terracotta_tiles", new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_TERRACOTTA_TILE_SLAB = register("orange_terracotta_tile_slab", new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_TERRACOTTA_TILE_STAIRS = register("orange_terracotta_tile_stairs", new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_TERRACOTTA_TILE_WALL = register("orange_terracotta_tile_wall", new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_TERRACOTTA_TILE_GATE = register("orange_terracotta_tile_gate", new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Orange Terracotta Pillar
	public static final Item ORANGE_TERRACOTTA_PILLAR = register("orange_terracotta_pillar", new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_TERRACOTTA_CORNER_PILLAR = register("orange_terracotta_corner_pillar", new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Orange Terracotta
	public static final Item CHISELED_ORANGE_TERRACOTTA = register("chiseled_orange_terracotta", new BlockItem(CPlusBlocks.CHISELED_ORANGE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Orange Terracotta
	public static final Item CARVED_ORANGE_TERRACOTTA = register("carved_orange_terracotta", new BlockItem(CPlusBlocks.CARVED_ORANGE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// YELLOW TERRACOTTA

	// Base
	public static final Item YELLOW_TERRACOTTA_SLAB = register("yellow_terracotta_slab", new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_TERRACOTTA_STAIRS = register("yellow_terracotta_stairs", new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_TERRACOTTA_WALL = register("yellow_terracotta_wall", new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_TERRACOTTA_GATE = register("yellow_terracotta_gate", new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Yellow Terracotta
	public static final Item COBBLED_YELLOW_TERRACOTTA = register("cobbled_yellow_terracotta", new BlockItem(CPlusBlocks.COBBLED_YELLOW_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_YELLOW_TERRACOTTA_SLAB = register("cobbled_yellow_terracotta_slab", new BlockItem(CPlusBlocks.COBBLED_YELLOW_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_YELLOW_TERRACOTTA_STAIRS = register("cobbled_yellow_terracotta_stairs", new BlockItem(CPlusBlocks.COBBLED_YELLOW_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_YELLOW_TERRACOTTA_WALL = register("cobbled_yellow_terracotta_wall", new BlockItem(CPlusBlocks.COBBLED_YELLOW_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_YELLOW_TERRACOTTA_GATE = register("cobbled_yellow_terracotta_gate", new BlockItem(CPlusBlocks.COBBLED_YELLOW_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Yellow Terracotta
	public static final Item POLISHED_YELLOW_TERRACOTTA = register("polished_yellow_terracotta", new BlockItem(CPlusBlocks.POLISHED_YELLOW_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_YELLOW_TERRACOTTA_SLAB = register("polished_yellow_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_YELLOW_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_YELLOW_TERRACOTTA_STAIRS = register("polished_yellow_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_YELLOW_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_YELLOW_TERRACOTTA_WALL = register("polished_yellow_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_YELLOW_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_YELLOW_TERRACOTTA_GATE = register("polished_yellow_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_YELLOW_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Yellow Terracotta
	public static final Item SMOOTH_YELLOW_TERRACOTTA = register("smooth_yellow_terracotta", new BlockItem(CPlusBlocks.SMOOTH_YELLOW_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_YELLOW_TERRACOTTA_SLAB = register("smooth_yellow_terracotta_slab", new BlockItem(CPlusBlocks.SMOOTH_YELLOW_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_YELLOW_TERRACOTTA_STAIRS = register("smooth_yellow_terracotta_stairs", new BlockItem(CPlusBlocks.SMOOTH_YELLOW_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_YELLOW_TERRACOTTA_WALL = register("smooth_yellow_terracotta_wall", new BlockItem(CPlusBlocks.SMOOTH_YELLOW_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_YELLOW_TERRACOTTA_GATE = register("smooth_yellow_terracotta_gate", new BlockItem(CPlusBlocks.SMOOTH_YELLOW_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Yellow Terracotta Bricks
	public static final Item YELLOW_TERRACOTTA_BRICKS = register("yellow_terracotta_bricks", new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_TERRACOTTA_BRICK_SLAB = register("yellow_terracotta_brick_slab", new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_TERRACOTTA_BRICK_STAIRS = register("yellow_terracotta_brick_stairs", new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_TERRACOTTA_BRICK_WALL = register("yellow_terracotta_brick_wall", new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_TERRACOTTA_BRICK_GATE = register("yellow_terracotta_brick_gate", new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Yellow Terracotta
	public static final Item CUT_YELLOW_TERRACOTTA = register("cut_yellow_terracotta", new BlockItem(CPlusBlocks.CUT_YELLOW_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_YELLOW_TERRACOTTA_SLAB = register("cut_yellow_terracotta_slab", new BlockItem(CPlusBlocks.CUT_YELLOW_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_YELLOW_TERRACOTTA_STAIRS = register("cut_yellow_terracotta_stairs", new BlockItem(CPlusBlocks.CUT_YELLOW_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_YELLOW_TERRACOTTA_WALL = register("cut_yellow_terracotta_wall", new BlockItem(CPlusBlocks.CUT_YELLOW_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_YELLOW_TERRACOTTA_GATE = register("cut_yellow_terracotta_gate", new BlockItem(CPlusBlocks.CUT_YELLOW_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Yellow Terracotta Tiles
	public static final Item YELLOW_TERRACOTTA_TILES = register("yellow_terracotta_tiles", new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_TERRACOTTA_TILE_SLAB = register("yellow_terracotta_tile_slab", new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_TERRACOTTA_TILE_STAIRS = register("yellow_terracotta_tile_stairs", new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_TERRACOTTA_TILE_WALL = register("yellow_terracotta_tile_wall", new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_TERRACOTTA_TILE_GATE = register("yellow_terracotta_tile_gate", new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Yellow Terracotta Pillar
	public static final Item YELLOW_TERRACOTTA_PILLAR = register("yellow_terracotta_pillar", new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_TERRACOTTA_CORNER_PILLAR = register("yellow_terracotta_corner_pillar", new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Yellow Terracotta
	public static final Item CHISELED_YELLOW_TERRACOTTA = register("chiseled_yellow_terracotta", new BlockItem(CPlusBlocks.CHISELED_YELLOW_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Yellow Terracotta
	public static final Item CARVED_YELLOW_TERRACOTTA = register("carved_yellow_terracotta", new BlockItem(CPlusBlocks.CARVED_YELLOW_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// LIME TERRACOTTA

	// Base
	public static final Item LIME_TERRACOTTA_SLAB = register("lime_terracotta_slab", new BlockItem(CPlusBlocks.LIME_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_TERRACOTTA_STAIRS = register("lime_terracotta_stairs", new BlockItem(CPlusBlocks.LIME_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_TERRACOTTA_WALL = register("lime_terracotta_wall", new BlockItem(CPlusBlocks.LIME_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_TERRACOTTA_GATE = register("lime_terracotta_gate", new BlockItem(CPlusBlocks.LIME_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Lime Terracotta
	public static final Item COBBLED_LIME_TERRACOTTA = register("cobbled_lime_terracotta", new BlockItem(CPlusBlocks.COBBLED_LIME_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_LIME_TERRACOTTA_SLAB = register("cobbled_lime_terracotta_slab", new BlockItem(CPlusBlocks.COBBLED_LIME_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_LIME_TERRACOTTA_STAIRS = register("cobbled_lime_terracotta_stairs", new BlockItem(CPlusBlocks.COBBLED_LIME_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_LIME_TERRACOTTA_WALL = register("cobbled_lime_terracotta_wall", new BlockItem(CPlusBlocks.COBBLED_LIME_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_LIME_TERRACOTTA_GATE = register("cobbled_lime_terracotta_gate", new BlockItem(CPlusBlocks.COBBLED_LIME_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Lime Terracotta
	public static final Item POLISHED_LIME_TERRACOTTA = register("polished_lime_terracotta", new BlockItem(CPlusBlocks.POLISHED_LIME_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIME_TERRACOTTA_SLAB = register("polished_lime_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_LIME_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIME_TERRACOTTA_STAIRS = register("polished_lime_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_LIME_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIME_TERRACOTTA_WALL = register("polished_lime_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_LIME_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIME_TERRACOTTA_GATE = register("polished_lime_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_LIME_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Lime Terracotta
	public static final Item SMOOTH_LIME_TERRACOTTA = register("smooth_lime_terracotta", new BlockItem(CPlusBlocks.SMOOTH_LIME_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIME_TERRACOTTA_SLAB = register("smooth_lime_terracotta_slab", new BlockItem(CPlusBlocks.SMOOTH_LIME_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIME_TERRACOTTA_STAIRS = register("smooth_lime_terracotta_stairs", new BlockItem(CPlusBlocks.SMOOTH_LIME_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIME_TERRACOTTA_WALL = register("smooth_lime_terracotta_wall", new BlockItem(CPlusBlocks.SMOOTH_LIME_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIME_TERRACOTTA_GATE = register("smooth_lime_terracotta_gate", new BlockItem(CPlusBlocks.SMOOTH_LIME_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Lime Terracotta Bricks
	public static final Item LIME_TERRACOTTA_BRICKS = register("lime_terracotta_bricks", new BlockItem(CPlusBlocks.LIME_TERRACOTTA_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_TERRACOTTA_BRICK_SLAB = register("lime_terracotta_brick_slab", new BlockItem(CPlusBlocks.LIME_TERRACOTTA_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_TERRACOTTA_BRICK_STAIRS = register("lime_terracotta_brick_stairs", new BlockItem(CPlusBlocks.LIME_TERRACOTTA_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_TERRACOTTA_BRICK_WALL = register("lime_terracotta_brick_wall", new BlockItem(CPlusBlocks.LIME_TERRACOTTA_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_TERRACOTTA_BRICK_GATE = register("lime_terracotta_brick_gate", new BlockItem(CPlusBlocks.LIME_TERRACOTTA_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Lime Terracotta
	public static final Item CUT_LIME_TERRACOTTA = register("cut_lime_terracotta", new BlockItem(CPlusBlocks.CUT_LIME_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIME_TERRACOTTA_SLAB = register("cut_lime_terracotta_slab", new BlockItem(CPlusBlocks.CUT_LIME_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIME_TERRACOTTA_STAIRS = register("cut_lime_terracotta_stairs", new BlockItem(CPlusBlocks.CUT_LIME_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIME_TERRACOTTA_WALL = register("cut_lime_terracotta_wall", new BlockItem(CPlusBlocks.CUT_LIME_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIME_TERRACOTTA_GATE = register("cut_lime_terracotta_gate", new BlockItem(CPlusBlocks.CUT_LIME_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Lime Terracotta Tiles
	public static final Item LIME_TERRACOTTA_TILES = register("lime_terracotta_tiles", new BlockItem(CPlusBlocks.LIME_TERRACOTTA_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_TERRACOTTA_TILE_SLAB = register("lime_terracotta_tile_slab", new BlockItem(CPlusBlocks.LIME_TERRACOTTA_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_TERRACOTTA_TILE_STAIRS = register("lime_terracotta_tile_stairs", new BlockItem(CPlusBlocks.LIME_TERRACOTTA_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_TERRACOTTA_TILE_WALL = register("lime_terracotta_tile_wall", new BlockItem(CPlusBlocks.LIME_TERRACOTTA_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_TERRACOTTA_TILE_GATE = register("lime_terracotta_tile_gate", new BlockItem(CPlusBlocks.LIME_TERRACOTTA_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Lime Terracotta Pillar
	public static final Item LIME_TERRACOTTA_PILLAR = register("lime_terracotta_pillar", new BlockItem(CPlusBlocks.LIME_TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_TERRACOTTA_CORNER_PILLAR = register("lime_terracotta_corner_pillar", new BlockItem(CPlusBlocks.LIME_TERRACOTTA_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseld Lime Terracotta
	public static final Item CHISELED_LIME_TERRACOTTA = register("chiseled_lime_terracotta", new BlockItem(CPlusBlocks.CHISELED_LIME_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Lime Terracotta
	public static final Item CARVED_LIME_TERRACOTTA = register("carved_lime_terracotta", new BlockItem(CPlusBlocks.CARVED_LIME_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// GREEN TERRACOTTA

	// Base
	public static final Item GREEN_TERRACOTTA_SLAB = register("green_terracotta_slab", new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_TERRACOTTA_STAIRS = register("green_terracotta_stairs", new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_TERRACOTTA_WALL = register("green_terracotta_wall", new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_TERRACOTTA_GATE = register("green_terracotta_gate", new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Green Terracotta
	public static final Item COBBLED_GREEN_TERRACOTTA = register("cobbled_green_terracotta", new BlockItem(CPlusBlocks.COBBLED_GREEN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_GREEN_TERRACOTTA_SLAB = register("cobbled_green_terracotta_slab", new BlockItem(CPlusBlocks.COBBLED_GREEN_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_GREEN_TERRACOTTA_STAIRS = register("cobbled_green_terracotta_stairs", new BlockItem(CPlusBlocks.COBBLED_GREEN_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_GREEN_TERRACOTTA_WALL = register("cobbled_green_terracotta_wall", new BlockItem(CPlusBlocks.COBBLED_GREEN_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_GREEN_TERRACOTTA_GATE = register("cobbled_green_terracotta_gate", new BlockItem(CPlusBlocks.COBBLED_GREEN_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Green Terracotta
	public static final Item POLISHED_GREEN_TERRACOTTA = register("polished_green_terracotta", new BlockItem(CPlusBlocks.POLISHED_GREEN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GREEN_TERRACOTTA_SLAB = register("polished_green_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_GREEN_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GREEN_TERRACOTTA_STAIRS = register("polished_green_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_GREEN_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GREEN_TERRACOTTA_WALL = register("polished_green_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_GREEN_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GREEN_TERRACOTTA_GATE = register("polished_green_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_GREEN_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Green Terracotta
	public static final Item SMOOTH_GREEN_TERRACOTTA = register("smooth_green_terracotta", new BlockItem(CPlusBlocks.SMOOTH_GREEN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_GREEN_TERRACOTTA_SLAB = register("smooth_green_terracotta_slab", new BlockItem(CPlusBlocks.SMOOTH_GREEN_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_GREEN_TERRACOTTA_STAIRS = register("smooth_green_terracotta_stairs", new BlockItem(CPlusBlocks.SMOOTH_GREEN_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_GREEN_TERRACOTTA_WALL = register("smooth_green_terracotta_wall", new BlockItem(CPlusBlocks.SMOOTH_GREEN_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_GREEN_TERRACOTTA_GATE = register("smooth_green_terracotta_gate", new BlockItem(CPlusBlocks.SMOOTH_GREEN_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Green Terracotta Bricks
	public static final Item GREEN_TERRACOTTA_BRICKS = register("green_terracotta_bricks", new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_TERRACOTTA_BRICK_SLAB = register("green_terracotta_brick_slab", new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_TERRACOTTA_BRICK_STAIRS = register("green_terracotta_brick_stairs", new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_TERRACOTTA_BRICK_WALL = register("green_terracotta_brick_wall", new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_TERRACOTTA_BRICK_GATE = register("green_terracotta_brick_gate", new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Green Terracotta
	public static final Item CUT_GREEN_TERRACOTTA = register("cut_green_terracotta", new BlockItem(CPlusBlocks.CUT_GREEN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_GREEN_TERRACOTTA_SLAB = register("cut_green_terracotta_slab", new BlockItem(CPlusBlocks.CUT_GREEN_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_GREEN_TERRACOTTA_STAIRS = register("cut_green_terracotta_stairs", new BlockItem(CPlusBlocks.CUT_GREEN_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_GREEN_TERRACOTTA_WALL = register("cut_green_terracotta_wall", new BlockItem(CPlusBlocks.CUT_GREEN_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_GREEN_TERRACOTTA_GATE = register("cut_green_terracotta_gate", new BlockItem(CPlusBlocks.CUT_GREEN_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Green Terracotta Tiles
	public static final Item GREEN_TERRACOTTA_TILES = register("green_terracotta_tiles", new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_TERRACOTTA_TILE_SLAB = register("green_terracotta_tile_slab", new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_TERRACOTTA_TILE_STAIRS = register("green_terracotta_tile_stairs", new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_TERRACOTTA_TILE_WALL = register("green_terracotta_tile_wall", new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_TERRACOTTA_TILE_GATE = register("green_terracotta_tile_gate", new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Green Terracotta Pillar
	public static final Item GREEN_TERRACOTTA_PILLAR = register("green_terracotta_pillar", new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_TERRACOTTA_CORNER_PILLAR = register("green_terracotta_corner_pillar", new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Green Terracotta
	public static final Item CHISELED_GREEN_TERRACOTTA = register("chiseled_green_terracotta", new BlockItem(CPlusBlocks.CHISELED_GREEN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Green Terracotta
	public static final Item CARVED_GREEN_TERRACOTTA = register("carved_green_terracotta", new BlockItem(CPlusBlocks.CARVED_GREEN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// BLUE TERRACOTTA

	// Base
	public static final Item BLUE_TERRACOTTA_SLAB = register("blue_terracotta_slab", new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_TERRACOTTA_STAIRS = register("blue_terracotta_stairs", new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_TERRACOTTA_WALL = register("blue_terracotta_wall", new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_TERRACOTTA_GATE = register("blue_terracotta_gate", new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Blue Terracotta
	public static final Item COBBLED_BLUE_TERRACOTTA = register("cobbled_blue_terracotta", new BlockItem(CPlusBlocks.COBBLED_BLUE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_BLUE_TERRACOTTA_SLAB = register("cobbled_blue_terracotta_slab", new BlockItem(CPlusBlocks.COBBLED_BLUE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_BLUE_TERRACOTTA_STAIRS = register("cobbled_blue_terracotta_stairs", new BlockItem(CPlusBlocks.COBBLED_BLUE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_BLUE_TERRACOTTA_WALL = register("cobbled_blue_terracotta_wall", new BlockItem(CPlusBlocks.COBBLED_BLUE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_BLUE_TERRACOTTA_GATE = register("cobbled_blue_terracotta_gate", new BlockItem(CPlusBlocks.COBBLED_BLUE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Blue Terracotta
	public static final Item POLISHED_BLUE_TERRACOTTA = register("polished_blue_terracotta", new BlockItem(CPlusBlocks.POLISHED_BLUE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLUE_TERRACOTTA_SLAB = register("polished_blue_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_BLUE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLUE_TERRACOTTA_STAIRS = register("polished_blue_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_BLUE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLUE_TERRACOTTA_WALL = register("polished_blue_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_BLUE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLUE_TERRACOTTA_GATE = register("polished_blue_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_BLUE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Blue Terracotta
	public static final Item SMOOTH_BLUE_TERRACOTTA = register("smooth_blue_terracotta", new BlockItem(CPlusBlocks.SMOOTH_BLUE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BLUE_TERRACOTTA_SLAB = register("smooth_blue_terracotta_slab", new BlockItem(CPlusBlocks.SMOOTH_BLUE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BLUE_TERRACOTTA_STAIRS = register("smooth_blue_terracotta_stairs", new BlockItem(CPlusBlocks.SMOOTH_BLUE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BLUE_TERRACOTTA_WALL = register("smooth_blue_terracotta_wall", new BlockItem(CPlusBlocks.SMOOTH_BLUE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BLUE_TERRACOTTA_GATE = register("smooth_blue_terracotta_gate", new BlockItem(CPlusBlocks.SMOOTH_BLUE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Blue Terracotta Bricks
	public static final Item BLUE_TERRACOTTA_BRICKS = register("blue_terracotta_bricks", new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_TERRACOTTA_BRICK_SLAB = register("blue_terracotta_brick_slab", new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_TERRACOTTA_BRICK_STAIRS = register("blue_terracotta_brick_stairs", new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_TERRACOTTA_BRICK_WALL = register("blue_terracotta_brick_wall", new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_TERRACOTTA_BRICK_GATE = register("blue_terracotta_brick_gate", new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Blue Terracotta
	public static final Item CUT_BLUE_TERRACOTTA = register("cut_blue_terracotta", new BlockItem(CPlusBlocks.CUT_BLUE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BLUE_TERRACOTTA_SLAB = register("cut_blue_terracotta_slab", new BlockItem(CPlusBlocks.CUT_BLUE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BLUE_TERRACOTTA_STAIRS = register("cut_blue_terracotta_stairs", new BlockItem(CPlusBlocks.CUT_BLUE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BLUE_TERRACOTTA_WALL = register("cut_blue_terracotta_wall", new BlockItem(CPlusBlocks.CUT_BLUE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BLUE_TERRACOTTA_GATE = register("cut_blue_terracotta_gate", new BlockItem(CPlusBlocks.CUT_BLUE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Blue Terracotta Tiles
	public static final Item BLUE_TERRACOTTA_TILES = register("blue_terracotta_tiles", new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_TERRACOTTA_TILE_SLAB = register("blue_terracotta_tile_slab", new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_TERRACOTTA_TILE_STAIRS = register("blue_terracotta_tile_stairs", new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_TERRACOTTA_TILE_WALL = register("blue_terracotta_tile_wall", new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_TERRACOTTA_TILE_GATE = register("blue_terracotta_tile_gate", new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Blue Terracotta Pillar
	public static final Item BLUE_TERRACOTTA_PILLAR = register("blue_terracotta_pillar", new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_TERRACOTTA_CORNER_PILLAR = register("blue_terracotta_corner_pillar", new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Blue Terracotta
	public static final Item CHISELED_BLUE_TERRACOTTA = register("chiseled_blue_terracotta", new BlockItem(CPlusBlocks.CHISELED_BLUE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Blue Terracotta
	public static final Item CARVED_BLUE_TERRACOTTA = register("carved_blue_terracotta", new BlockItem(CPlusBlocks.CARVED_BLUE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// CYAN TERRACOTTA

	// Base
	public static final Item CYAN_TERRACOTTA_SLAB = register("cyan_terracotta_slab", new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_TERRACOTTA_STAIRS = register("cyan_terracotta_stairs", new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_TERRACOTTA_WALL = register("cyan_terracotta_wall", new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_TERRACOTTA_GATE = register("cyan_terracotta_gate", new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Cyan Terracotta
	public static final Item COBBLED_CYAN_TERRACOTTA = register("cobbled_cyan_terracotta", new BlockItem(CPlusBlocks.COBBLED_CYAN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_CYAN_TERRACOTTA_SLAB = register("cobbled_cyan_terracotta_slab", new BlockItem(CPlusBlocks.COBBLED_CYAN_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_CYAN_TERRACOTTA_STAIRS = register("cobbled_cyan_terracotta_stairs", new BlockItem(CPlusBlocks.COBBLED_CYAN_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_CYAN_TERRACOTTA_WALL = register("cobbled_cyan_terracotta_wall", new BlockItem(CPlusBlocks.COBBLED_CYAN_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_CYAN_TERRACOTTA_GATE = register("cobbled_cyan_terracotta_gate", new BlockItem(CPlusBlocks.COBBLED_CYAN_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Cyan Terracotta
	public static final Item POLISHED_CYAN_TERRACOTTA = register("polished_cyan_terracotta", new BlockItem(CPlusBlocks.POLISHED_CYAN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_CYAN_TERRACOTTA_SLAB = register("polished_cyan_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_CYAN_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_CYAN_TERRACOTTA_STAIRS = register("polished_cyan_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_CYAN_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_CYAN_TERRACOTTA_WALL = register("polished_cyan_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_CYAN_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_CYAN_TERRACOTTA_GATE = register("polished_cyan_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_CYAN_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Cyan Terracotta
	public static final Item SMOOTH_CYAN_TERRACOTTA = register("smooth_cyan_terracotta", new BlockItem(CPlusBlocks.SMOOTH_CYAN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_CYAN_TERRACOTTA_SLAB = register("smooth_cyan_terracotta_slab", new BlockItem(CPlusBlocks.SMOOTH_CYAN_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_CYAN_TERRACOTTA_STAIRS = register("smooth_cyan_terracotta_stairs", new BlockItem(CPlusBlocks.SMOOTH_CYAN_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_CYAN_TERRACOTTA_WALL = register("smooth_cyan_terracotta_wall", new BlockItem(CPlusBlocks.SMOOTH_CYAN_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_CYAN_TERRACOTTA_GATE = register("smooth_cyan_terracotta_gate", new BlockItem(CPlusBlocks.SMOOTH_CYAN_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cyan Terracotta Bricks
	public static final Item CYAN_TERRACOTTA_BRICKS = register("cyan_terracotta_bricks", new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_TERRACOTTA_BRICK_SLAB = register("cyan_terracotta_brick_slab", new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_TERRACOTTA_BRICK_STAIRS = register("cyan_terracotta_brick_stairs", new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_TERRACOTTA_BRICK_WALL = register("cyan_terracotta_brick_wall", new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_TERRACOTTA_BRICK_GATE = register("cyan_terracotta_brick_gate", new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Cyan Terracotta
	public static final Item CUT_CYAN_TERRACOTTA = register("cut_cyan_terracotta", new BlockItem(CPlusBlocks.CUT_CYAN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_CYAN_TERRACOTTA_SLAB = register("cut_cyan_terracotta_slab", new BlockItem(CPlusBlocks.CUT_CYAN_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_CYAN_TERRACOTTA_STAIRS = register("cut_cyan_terracotta_stairs", new BlockItem(CPlusBlocks.CUT_CYAN_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_CYAN_TERRACOTTA_WALL = register("cut_cyan_terracotta_wall", new BlockItem(CPlusBlocks.CUT_CYAN_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_CYAN_TERRACOTTA_GATE = register("cut_cyan_terracotta_gate", new BlockItem(CPlusBlocks.CUT_CYAN_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cyan Terracotta Tiles
	public static final Item CYAN_TERRACOTTA_TILES = register("cyan_terracotta_tiles", new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_TERRACOTTA_TILE_SLAB = register("cyan_terracotta_tile_slab", new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_TERRACOTTA_TILE_STAIRS = register("cyan_terracotta_tile_stairs", new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_TERRACOTTA_TILE_WALL = register("cyan_terracotta_tile_wall", new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_TERRACOTTA_TILE_GATE = register("cyan_terracotta_tile_gate", new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cyan Terracotta Pillar
	public static final Item CYAN_TERRACOTTA_PILLAR = register("cyan_terracotta_pillar", new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_TERRACOTTA_CORNER_PILLAR = register("cyan_terracotta_corner_pillar", new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Cyan Terracotta
	public static final Item CHISELED_CYAN_TERRACOTTA = register("chiseled_cyan_terracotta", new BlockItem(CPlusBlocks.CHISELED_CYAN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Cyan Terracotta
	public static final Item CARVED_CYAN_TERRACOTTA = register("carved_cyan_terracotta", new BlockItem(CPlusBlocks.CARVED_CYAN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// LIGHT BLUE TERRACOTTA

	// Base
	public static final Item LIGHT_BLUE_TERRACOTTA_SLAB = register("light_blue_terracotta_slab", new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_TERRACOTTA_STAIRS = register("light_blue_terracotta_stairs", new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_TERRACOTTA_WALL = register("light_blue_terracotta_wall", new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_TERRACOTTA_GATE = register("light_blue_terracotta_gate", new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Light Blue Terracotta
	public static final Item COBBLED_LIGHT_BLUE_TERRACOTTA = register("cobbled_light_blue_terracotta", new BlockItem(CPlusBlocks.COBBLED_LIGHT_BLUE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_LIGHT_BLUE_TERRACOTTA_SLAB = register("cobbled_light_blue_terracotta_slab", new BlockItem(CPlusBlocks.COBBLED_LIGHT_BLUE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_LIGHT_BLUE_TERRACOTTA_STAIRS = register("cobbled_light_blue_terracotta_stairs", new BlockItem(CPlusBlocks.COBBLED_LIGHT_BLUE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_LIGHT_BLUE_TERRACOTTA_WALL = register("cobbled_light_blue_terracotta_wall", new BlockItem(CPlusBlocks.COBBLED_LIGHT_BLUE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_LIGHT_BLUE_TERRACOTTA_GATE = register("cobbled_light_blue_terracotta_gate", new BlockItem(CPlusBlocks.COBBLED_LIGHT_BLUE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Light Blue Terracotta
	public static final Item POLISHED_LIGHT_BLUE_TERRACOTTA = register("polished_light_blue_terracotta", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_BLUE_TERRACOTTA_SLAB = register("polished_light_blue_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_BLUE_TERRACOTTA_STAIRS = register("polished_light_blue_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_BLUE_TERRACOTTA_WALL = register("polished_light_blue_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_BLUE_TERRACOTTA_GATE = register("polished_light_blue_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Light Blue Terracotta
	public static final Item SMOOTH_LIGHT_BLUE_TERRACOTTA = register("smooth_light_blue_terracotta", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIGHT_BLUE_TERRACOTTA_SLAB = register("smooth_light_blue_terracotta_slab", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIGHT_BLUE_TERRACOTTA_STAIRS = register("smooth_light_blue_terracotta_stairs", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIGHT_BLUE_TERRACOTTA_WALL = register("smooth_light_blue_terracotta_wall", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIGHT_BLUE_TERRACOTTA_GATE = register("smooth_light_blue_terracotta_gate", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Blue Terracotta Bricks
	public static final Item LIGHT_BLUE_TERRACOTTA_BRICKS = register("light_blue_terracotta_bricks", new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = register("light_blue_terracotta_brick_slab", new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = register("light_blue_terracotta_brick_stairs", new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_TERRACOTTA_BRICK_WALL = register("light_blue_terracotta_brick_wall", new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_TERRACOTTA_BRICK_GATE = register("light_blue_terracotta_brick_gate", new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Light Blue Terracotta
	public static final Item CUT_LIGHT_BLUE_TERRACOTTA = register("cut_light_blue_terracotta", new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIGHT_BLUE_TERRACOTTA_SLAB = register("cut_light_blue_terracotta_slab", new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIGHT_BLUE_TERRACOTTA_STAIRS = register("cut_light_blue_terracotta_stairs", new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIGHT_BLUE_TERRACOTTA_WALL = register("cut_light_blue_terracotta_wall", new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIGHT_BLUE_TERRACOTTA_GATE = register("cut_light_blue_terracotta_gate", new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Blue Terracotta Tiles
	public static final Item LIGHT_BLUE_TERRACOTTA_TILES = register("light_blue_terracotta_tiles", new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_TERRACOTTA_TILE_SLAB = register("light_blue_terracotta_tile_slab", new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_TERRACOTTA_TILE_STAIRS = register("light_blue_terracotta_tile_stairs", new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_TERRACOTTA_TILE_WALL = register("light_blue_terracotta_tile_wall", new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_TERRACOTTA_TILE_GATE = register("light_blue_terracotta_tile_gate", new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Blue Terracotta Pillar
	public static final Item LIGHT_BLUE_TERRACOTTA_PILLAR = register("light_blue_terracotta_pillar", new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_TERRACOTTA_CORNER_PILLAR = register("light_blue_terracotta_corner_pillar", new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Light Blue Terracotta
	public static final Item CHISELED_LIGHT_BLUE_TERRACOTTA = register("chiseled_light_blue_terracotta", new BlockItem(CPlusBlocks.CHISELED_LIGHT_BLUE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Light Blue Terracotta
	public static final Item CARVED_LIGHT_BLUE_TERRACOTTA = register("carved_light_blue_terracotta", new BlockItem(CPlusBlocks.CARVED_LIGHT_BLUE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// PURPLE TERRACOTTA

	// Base
	public static final Item PURPLE_TERRACOTTA_SLAB = register("purple_terracotta_slab", new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_TERRACOTTA_STAIRS = register("purple_terracotta_stairs", new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_TERRACOTTA_WALL = register("purple_terracotta_wall", new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_TERRACOTTA_GATE = register("purple_terracotta_gate", new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Purple Terracotta
	public static final Item COBBLED_PURPLE_TERRACOTTA = register("cobbled_purple_terracotta", new BlockItem(CPlusBlocks.COBBLED_PURPLE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_PURPLE_TERRACOTTA_SLAB = register("cobbled_purple_terracotta_slab", new BlockItem(CPlusBlocks.COBBLED_PURPLE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_PURPLE_TERRACOTTA_STAIRS = register("cobbled_purple_terracotta_stairs", new BlockItem(CPlusBlocks.COBBLED_PURPLE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_PURPLE_TERRACOTTA_WALL = register("cobbled_purple_terracotta_wall", new BlockItem(CPlusBlocks.COBBLED_PURPLE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_PURPLE_TERRACOTTA_GATE = register("cobbled_purple_terracotta_gate", new BlockItem(CPlusBlocks.COBBLED_PURPLE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Purple Terracotta
	public static final Item POLISHED_PURPLE_TERRACOTTA = register("polished_purple_terracotta", new BlockItem(CPlusBlocks.POLISHED_PURPLE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PURPLE_TERRACOTTA_SLAB = register("polished_purple_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_PURPLE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PURPLE_TERRACOTTA_STAIRS = register("polished_purple_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_PURPLE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PURPLE_TERRACOTTA_WALL = register("polished_purple_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_PURPLE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PURPLE_TERRACOTTA_GATE = register("polished_purple_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_PURPLE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Purple Terracotta
	public static final Item SMOOTH_PURPLE_TERRACOTTA = register("smooth_purple_terracotta", new BlockItem(CPlusBlocks.SMOOTH_PURPLE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_PURPLE_TERRACOTTA_SLAB = register("smooth_purple_terracotta_slab", new BlockItem(CPlusBlocks.SMOOTH_PURPLE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_PURPLE_TERRACOTTA_STAIRS = register("smooth_purple_terracotta_stairs", new BlockItem(CPlusBlocks.SMOOTH_PURPLE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_PURPLE_TERRACOTTA_WALL = register("smooth_purple_terracotta_wall", new BlockItem(CPlusBlocks.SMOOTH_PURPLE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_PURPLE_TERRACOTTA_GATE = register("smooth_purple_terracotta_gate", new BlockItem(CPlusBlocks.SMOOTH_PURPLE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Purple Terracotta Bricks
	public static final Item PURPLE_TERRACOTTA_BRICKS = register("purple_terracotta_bricks", new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_TERRACOTTA_BRICK_SLAB = register("purple_terracotta_brick_slab", new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_TERRACOTTA_BRICK_STAIRS = register("purple_terracotta_brick_stairs", new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_TERRACOTTA_BRICK_WALL = register("purple_terracotta_brick_wall", new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_TERRACOTTA_BRICK_GATE = register("purple_terracotta_brick_gate", new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Purple Terracotta
	public static final Item CUT_PURPLE_TERRACOTTA = register("cut_purple_terracotta", new BlockItem(CPlusBlocks.CUT_PURPLE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_PURPLE_TERRACOTTA_SLAB = register("cut_purple_terracotta_slab", new BlockItem(CPlusBlocks.CUT_PURPLE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_PURPLE_TERRACOTTA_STAIRS = register("cut_purple_terracotta_stairs", new BlockItem(CPlusBlocks.CUT_PURPLE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_PURPLE_TERRACOTTA_WALL = register("cut_purple_terracotta_wall", new BlockItem(CPlusBlocks.CUT_PURPLE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_PURPLE_TERRACOTTA_GATE = register("cut_purple_terracotta_gate", new BlockItem(CPlusBlocks.CUT_PURPLE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Purple Terracotta Tiles
	public static final Item PURPLE_TERRACOTTA_TILES = register("purple_terracotta_tiles", new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_TERRACOTTA_TILE_SLAB = register("purple_terracotta_tile_slab", new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_TERRACOTTA_TILE_STAIRS = register("purple_terracotta_tile_stairs", new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_TERRACOTTA_TILE_WALL = register("purple_terracotta_tile_wall", new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_TERRACOTTA_TILE_GATE = register("purple_terracotta_tile_gate", new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Purple Terracotta Pillar
	public static final Item PURPLE_TERRACOTTA_PILLAR = register("purple_terracotta_pillar", new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_TERRACOTTA_CORNER_PILLAR = register("purple_terracotta_corner_pillar", new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Purple Terracotta
	public static final Item CHISELED_PURPLE_TERRACOTTA = register("chiseled_purple_terracotta", new BlockItem(CPlusBlocks.CHISELED_PURPLE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Purple Terracotta
	public static final Item CARVED_PURPLE_TERRACOTTA = register("carved_purple_terracotta", new BlockItem(CPlusBlocks.CARVED_PURPLE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// MAGENTA TERRACOTTA

	// Base
	public static final Item MAGENTA_TERRACOTTA_SLAB = register("magenta_terracotta_slab", new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_TERRACOTTA_STAIRS = register("magenta_terracotta_stairs", new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_TERRACOTTA_WALL = register("magenta_terracotta_wall", new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_TERRACOTTA_GATE = register("magenta_terracotta_gate", new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Magenta Terracotta
	public static final Item COBBLED_MAGENTA_TERRACOTTA = register("cobbled_magenta_terracotta", new BlockItem(CPlusBlocks.COBBLED_MAGENTA_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_MAGENTA_TERRACOTTA_SLAB = register("cobbled_magenta_terracotta_slab", new BlockItem(CPlusBlocks.COBBLED_MAGENTA_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_MAGENTA_TERRACOTTA_STAIRS = register("cobbled_magenta_terracotta_stairs", new BlockItem(CPlusBlocks.COBBLED_MAGENTA_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_MAGENTA_TERRACOTTA_WALL = register("cobbled_magenta_terracotta_wall", new BlockItem(CPlusBlocks.COBBLED_MAGENTA_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_MAGENTA_TERRACOTTA_GATE = register("cobbled_magenta_terracotta_gate", new BlockItem(CPlusBlocks.COBBLED_MAGENTA_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Magenta Terracotta
	public static final Item POLISHED_MAGENTA_TERRACOTTA = register("polished_magenta_terracotta", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_MAGENTA_TERRACOTTA_SLAB = register("polished_magenta_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_MAGENTA_TERRACOTTA_STAIRS = register("polished_magenta_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_MAGENTA_TERRACOTTA_WALL = register("polished_magenta_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_MAGENTA_TERRACOTTA_GATE = register("polished_magenta_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Magenta Terracotta
	public static final Item SMOOTH_MAGENTA_TERRACOTTA = register("smooth_magenta_terracotta", new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_MAGENTA_TERRACOTTA_SLAB = register("smooth_magenta_terracotta_slab", new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_MAGENTA_TERRACOTTA_STAIRS = register("smooth_magenta_terracotta_stairs", new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_MAGENTA_TERRACOTTA_WALL = register("smooth_magenta_terracotta_wall", new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_MAGENTA_TERRACOTTA_GATE = register("smooth_magenta_terracotta_gate", new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Magenta Terracotta Bricks
	public static final Item MAGENTA_TERRACOTTA_BRICKS = register("magenta_terracotta_bricks", new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_TERRACOTTA_BRICK_SLAB = register("magenta_terracotta_brick_slab", new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_TERRACOTTA_BRICK_STAIRS = register("magenta_terracotta_brick_stairs", new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_TERRACOTTA_BRICK_WALL = register("magenta_terracotta_brick_wall", new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_TERRACOTTA_BRICK_GATE = register("magenta_terracotta_brick_gate", new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Magenta Terracotta
	public static final Item CUT_MAGENTA_TERRACOTTA = register("cut_magenta_terracotta", new BlockItem(CPlusBlocks.CUT_MAGENTA_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_MAGENTA_TERRACOTTA_SLAB = register("cut_magenta_terracotta_slab", new BlockItem(CPlusBlocks.CUT_MAGENTA_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_MAGENTA_TERRACOTTA_STAIRS = register("cut_magenta_terracotta_stairs", new BlockItem(CPlusBlocks.CUT_MAGENTA_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_MAGENTA_TERRACOTTA_WALL = register("cut_magenta_terracotta_wall", new BlockItem(CPlusBlocks.CUT_MAGENTA_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_MAGENTA_TERRACOTTA_GATE = register("cut_magenta_terracotta_gate", new BlockItem(CPlusBlocks.CUT_MAGENTA_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Magenta Terracotta Tiles
	public static final Item MAGENTA_TERRACOTTA_TILES = register("magenta_terracotta_tiles", new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_TERRACOTTA_TILE_SLAB = register("magenta_terracotta_tile_slab", new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_TERRACOTTA_TILE_STAIRS = register("magenta_terracotta_tile_stairs", new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_TERRACOTTA_TILE_WALL = register("magenta_terracotta_tile_wall", new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_TERRACOTTA_TILE_GATE = register("magenta_terracotta_tile_gate", new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Magenta Terracotta Pillar
	public static final Item MAGENTA_TERRACOTTA_PILLAR = register("magenta_terracotta_pillar", new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_TERRACOTTA_CORNER_PILLAR = register("magenta_terracotta_corner_pillar", new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Magenta Terracotta
	public static final Item CHISELED_MAGENTA_TERRACOTTA = register("chiseled_magenta_terracotta", new BlockItem(CPlusBlocks.CHISELED_MAGENTA_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Magenta Terracotta
	public static final Item CARVED_MAGENTA_TERRACOTTA = register("carved_magenta_terracotta", new BlockItem(CPlusBlocks.CARVED_MAGENTA_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// PINK TERRACOTTA

	// Base
	public static final Item PINK_TERRACOTTA_SLAB = register("pink_terracotta_slab", new BlockItem(CPlusBlocks.PINK_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_TERRACOTTA_STAIRS = register("pink_terracotta_stairs", new BlockItem(CPlusBlocks.PINK_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_TERRACOTTA_WALL = register("pink_terracotta_wall", new BlockItem(CPlusBlocks.PINK_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_TERRACOTTA_GATE = register("pink_terracotta_gate", new BlockItem(CPlusBlocks.PINK_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Pink Terracotta
	public static final Item COBBLED_PINK_TERRACOTTA = register("cobbled_pink_terracotta", new BlockItem(CPlusBlocks.COBBLED_PINK_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_PINK_TERRACOTTA_SLAB = register("cobbled_pink_terracotta_slab", new BlockItem(CPlusBlocks.COBBLED_PINK_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_PINK_TERRACOTTA_STAIRS = register("cobbled_pink_terracotta_stairs", new BlockItem(CPlusBlocks.COBBLED_PINK_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_PINK_TERRACOTTA_WALL = register("cobbled_pink_terracotta_wall", new BlockItem(CPlusBlocks.COBBLED_PINK_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_PINK_TERRACOTTA_GATE = register("cobbled_pink_terracotta_gate", new BlockItem(CPlusBlocks.COBBLED_PINK_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Pink Terracotta
	public static final Item POLISHED_PINK_TERRACOTTA = register("polished_pink_terracotta", new BlockItem(CPlusBlocks.POLISHED_PINK_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PINK_TERRACOTTA_SLAB = register("polished_pink_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_PINK_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PINK_TERRACOTTA_STAIRS = register("polished_pink_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_PINK_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PINK_TERRACOTTA_WALL = register("polished_pink_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_PINK_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PINK_TERRACOTTA_GATE = register("polished_pink_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_PINK_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Pink Terracotta
	public static final Item SMOOTH_PINK_TERRACOTTA = register("smooth_pink_terracotta", new BlockItem(CPlusBlocks.SMOOTH_PINK_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_PINK_TERRACOTTA_SLAB = register("smooth_pink_terracotta_slab", new BlockItem(CPlusBlocks.SMOOTH_PINK_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_PINK_TERRACOTTA_STAIRS = register("smooth_pink_terracotta_stairs", new BlockItem(CPlusBlocks.SMOOTH_PINK_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_PINK_TERRACOTTA_WALL = register("smooth_pink_terracotta_wall", new BlockItem(CPlusBlocks.SMOOTH_PINK_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_PINK_TERRACOTTA_GATE = register("smooth_pink_terracotta_gate", new BlockItem(CPlusBlocks.SMOOTH_PINK_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Pink Terracotta Bricks
	public static final Item PINK_TERRACOTTA_BRICKS = register("pink_terracotta_bricks", new BlockItem(CPlusBlocks.PINK_TERRACOTTA_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_TERRACOTTA_BRICK_SLAB = register("pink_terracotta_brick_slab", new BlockItem(CPlusBlocks.PINK_TERRACOTTA_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_TERRACOTTA_BRICK_STAIRS = register("pink_terracotta_brick_stairs", new BlockItem(CPlusBlocks.PINK_TERRACOTTA_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_TERRACOTTA_BRICK_WALL = register("pink_terracotta_brick_wall", new BlockItem(CPlusBlocks.PINK_TERRACOTTA_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_TERRACOTTA_BRICK_GATE = register("pink_terracotta_brick_gate", new BlockItem(CPlusBlocks.PINK_TERRACOTTA_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Pink Terracotta
	public static final Item CUT_PINK_TERRACOTTA = register("cut_pink_terracotta", new BlockItem(CPlusBlocks.CUT_PINK_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_PINK_TERRACOTTA_SLAB = register("cut_pink_terracotta_slab", new BlockItem(CPlusBlocks.CUT_PINK_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_PINK_TERRACOTTA_STAIRS = register("cut_pink_terracotta_stairs", new BlockItem(CPlusBlocks.CUT_PINK_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_PINK_TERRACOTTA_WALL = register("cut_pink_terracotta_wall", new BlockItem(CPlusBlocks.CUT_PINK_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_PINK_TERRACOTTA_GATE = register("cut_pink_terracotta_gate", new BlockItem(CPlusBlocks.CUT_PINK_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Pink Terracotta Tiles
	public static final Item PINK_TERRACOTTA_TILES = register("pink_terracotta_tiles", new BlockItem(CPlusBlocks.PINK_TERRACOTTA_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_TERRACOTTA_TILE_SLAB = register("pink_terracotta_tile_slab", new BlockItem(CPlusBlocks.PINK_TERRACOTTA_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_TERRACOTTA_TILE_STAIRS = register("pink_terracotta_tile_stairs", new BlockItem(CPlusBlocks.PINK_TERRACOTTA_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_TERRACOTTA_TILE_WALL = register("pink_terracotta_tile_wall", new BlockItem(CPlusBlocks.PINK_TERRACOTTA_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_TERRACOTTA_TILE_GATE = register("pink_terracotta_tile_gate", new BlockItem(CPlusBlocks.PINK_TERRACOTTA_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Pink Terracotta Pillar
	public static final Item PINK_TERRACOTTA_PILLAR = register("pink_terracotta_pillar", new BlockItem(CPlusBlocks.PINK_TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_TERRACOTTA_CORNER_PILLAR = register("pink_terracotta_corner_pillar", new BlockItem(CPlusBlocks.PINK_TERRACOTTA_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Pink Terracotta
	public static final Item CHISELED_PINK_TERRACOTTA = register("chiseled_pink_terracotta", new BlockItem(CPlusBlocks.CHISELED_PINK_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Pink Terracotta
	public static final Item CARVED_PINK_TERRACOTTA = register("carved_pink_terracotta", new BlockItem(CPlusBlocks.CARVED_PINK_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// WHITE TERRACOTTa

	// Base
	public static final Item WHITE_TERRACOTTA_SLAB = register("white_terracotta_slab", new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_TERRACOTTA_STAIRS = register("white_terracotta_stairs", new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_TERRACOTTA_WALL = register("white_terracotta_wall", new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_TERRACOTTA_GATE = register("white_terracotta_gate", new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled White Terracotta
	public static final Item COBBLED_WHITE_TERRACOTTA = register("cobbled_white_terracotta", new BlockItem(CPlusBlocks.COBBLED_WHITE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_WHITE_TERRACOTTA_SLAB = register("cobbled_white_terracotta_slab", new BlockItem(CPlusBlocks.COBBLED_WHITE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_WHITE_TERRACOTTA_STAIRS = register("cobbled_white_terracotta_stairs", new BlockItem(CPlusBlocks.COBBLED_WHITE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_WHITE_TERRACOTTA_WALL = register("cobbled_white_terracotta_wall", new BlockItem(CPlusBlocks.COBBLED_WHITE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_WHITE_TERRACOTTA_GATE = register("cobbled_white_terracotta_gate", new BlockItem(CPlusBlocks.COBBLED_WHITE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished White Terracotta
	public static final Item POLISHED_WHITE_TERRACOTTA = register("polished_white_terracotta", new BlockItem(CPlusBlocks.POLISHED_WHITE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_WHITE_TERRACOTTA_SLAB = register("polished_white_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_WHITE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_WHITE_TERRACOTTA_STAIRS = register("polished_white_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_WHITE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_WHITE_TERRACOTTA_WALL = register("polished_white_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_WHITE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_WHITE_TERRACOTTA_GATE = register("polished_white_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_WHITE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth White Terracotta
	public static final Item SMOOTH_WHITE_TERRACOTTA = register("smooth_white_terracotta", new BlockItem(CPlusBlocks.SMOOTH_WHITE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_WHITE_TERRACOTTA_SLAB = register("smooth_white_terracotta_slab", new BlockItem(CPlusBlocks.SMOOTH_WHITE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_WHITE_TERRACOTTA_STAIRS = register("smooth_white_terracotta_stairs", new BlockItem(CPlusBlocks.SMOOTH_WHITE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_WHITE_TERRACOTTA_WALL = register("smooth_white_terracotta_wall", new BlockItem(CPlusBlocks.SMOOTH_WHITE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_WHITE_TERRACOTTA_GATE = register("smooth_white_terracotta_gate", new BlockItem(CPlusBlocks.SMOOTH_WHITE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// White Terracotta Bricks
	public static final Item WHITE_TERRACOTTA_BRICKS = register("white_terracotta_bricks", new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_TERRACOTTA_BRICK_SLAB = register("white_terracotta_brick_slab", new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_TERRACOTTA_BRICK_STAIRS = register("white_terracotta_brick_stairs", new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_TERRACOTTA_BRICK_WALL = register("white_terracotta_brick_wall", new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_TERRACOTTA_BRICK_GATE = register("white_terracotta_brick_gate", new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut White Terracotta
	public static final Item CUT_WHITE_TERRACOTTA = register("cut_white_terracotta", new BlockItem(CPlusBlocks.CUT_WHITE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_WHITE_TERRACOTTA_SLAB = register("cut_white_terracotta_slab", new BlockItem(CPlusBlocks.CUT_WHITE_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_WHITE_TERRACOTTA_STAIRS = register("cut_white_terracotta_stairs", new BlockItem(CPlusBlocks.CUT_WHITE_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_WHITE_TERRACOTTA_WALL = register("cut_white_terracotta_wall", new BlockItem(CPlusBlocks.CUT_WHITE_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_WHITE_TERRACOTTA_GATE = register("cut_white_terracotta_gate", new BlockItem(CPlusBlocks.CUT_WHITE_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// White Terracotta Tiles
	public static final Item WHITE_TERRACOTTA_TILES = register("white_terracotta_tiles", new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_TERRACOTTA_TILE_SLAB = register("white_terracotta_tile_slab", new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_TERRACOTTA_TILE_STAIRS = register("white_terracotta_tile_stairs", new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_TERRACOTTA_TILE_WALL = register("white_terracotta_tile_wall", new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_TERRACOTTA_TILE_GATE = register("white_terracotta_tile_gate", new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// White Terracotta Pillar
	public static final Item WHITE_TERRACOTTA_PILLAR = register("white_terracotta_pillar", new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_TERRACOTTA_CORNER_PILLAR = register("white_terracotta_corner_pillar", new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled White Terracotta
	public static final Item CHISELED_WHITE_TERRACOTTA = register("chiseled_white_terracotta", new BlockItem(CPlusBlocks.CHISELED_WHITE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved White Terracotta
	public static final Item CARVED_WHITE_TERRACOTTA = register("carved_white_terracotta", new BlockItem(CPlusBlocks.CARVED_WHITE_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// LIGHT GRAY TERRACOTTA

	// Base
	public static final Item LIGHT_GRAY_TERRACOTTA_SLAB = register("light_gray_terracotta_slab", new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_TERRACOTTA_STAIRS = register("light_gray_terracotta_stairs", new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_TERRACOTTA_WALL = register("light_gray_terracotta_wall", new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_TERRACOTTA_GATE = register("light_gray_terracotta_gate", new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Light Gray Terracotta
	public static final Item COBBLED_LIGHT_GRAY_TERRACOTTA = register("cobbled_light_gray_terracotta", new BlockItem(CPlusBlocks.COBBLED_LIGHT_GRAY_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_LIGHT_GRAY_TERRACOTTA_SLAB = register("cobbled_light_gray_terracotta_slab", new BlockItem(CPlusBlocks.COBBLED_LIGHT_GRAY_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_LIGHT_GRAY_TERRACOTTA_STAIRS = register("cobbled_light_gray_terracotta_stairs", new BlockItem(CPlusBlocks.COBBLED_LIGHT_GRAY_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_LIGHT_GRAY_TERRACOTTA_WALL = register("cobbled_light_gray_terracotta_wall", new BlockItem(CPlusBlocks.COBBLED_LIGHT_GRAY_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_LIGHT_GRAY_TERRACOTTA_GATE = register("cobbled_light_gray_terracotta_gate", new BlockItem(CPlusBlocks.COBBLED_LIGHT_GRAY_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Light Gray Terracotta
	public static final Item POLISHED_LIGHT_GRAY_TERRACOTTA = register("polished_light_gray_terracotta", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_GRAY_TERRACOTTA_SLAB = register("polished_light_gray_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_GRAY_TERRACOTTA_STAIRS = register("polished_light_gray_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_GRAY_TERRACOTTA_WALL = register("polished_light_gray_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_GRAY_TERRACOTTA_GATE = register("polished_light_gray_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Light Gray Terracotta
	public static final Item SMOOTH_LIGHT_GRAY_TERRACOTTA = register("smooth_light_gray_terracotta", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIGHT_GRAY_TERRACOTTA_SLAB = register("smooth_light_gray_terracotta_slab", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIGHT_GRAY_TERRACOTTA_STAIRS = register("smooth_light_gray_terracotta_stairs", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIGHT_GRAY_TERRACOTTA_WALL = register("smooth_light_gray_terracotta_wall", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIGHT_GRAY_TERRACOTTA_GATE = register("smooth_light_gray_terracotta_gate", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Gray Terracotta Bricks
	public static final Item LIGHT_GRAY_TERRACOTTA_BRICKS = register("light_gray_terracotta_bricks", new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = register("light_gray_terracotta_brick_slab", new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = register("light_gray_terracotta_brick_stairs", new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_TERRACOTTA_BRICK_WALL = register("light_gray_terracotta_brick_wall", new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_TERRACOTTA_BRICK_GATE = register("light_gray_terracotta_brick_gate", new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Light Gray Terracotta
	public static final Item CUT_LIGHT_GRAY_TERRACOTTA = register("cut_light_gray_terracotta", new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIGHT_GRAY_TERRACOTTA_SLAB = register("cut_light_gray_terracotta_slab", new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIGHT_GRAY_TERRACOTTA_STAIRS = register("cut_light_gray_terracotta_stairs", new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIGHT_GRAY_TERRACOTTA_WALL = register("cut_light_gray_terracotta_wall", new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIGHT_GRAY_TERRACOTTA_GATE = register("cut_light_gray_terracotta_gate", new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Gray Terracotta Tiles
	public static final Item LIGHT_GRAY_TERRACOTTA_TILES = register("light_gray_terracotta_tiles", new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_TERRACOTTA_TILE_SLAB = register("light_gray_terracotta_tile_slab", new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_TERRACOTTA_TILE_STAIRS = register("light_gray_terracotta_tile_stairs", new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_TERRACOTTA_TILE_WALL = register("light_gray_terracotta_tile_wall", new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_TERRACOTTA_TILE_GATE = register("light_gray_terracotta_tile_gate", new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Gray Terracotta Pillar
	public static final Item LIGHT_GRAY_TERRACOTTA_PILLAR = register("light_gray_terracotta_pillar", new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_TERRACOTTA_CORNER_PILLAR = register("light_gray_terracotta_corner_pillar", new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Light Gray Terracotta
	public static final Item CHISELED_LIGHT_GRAY_TERRACOTTA = register("chiseled_light_gray_terracotta", new BlockItem(CPlusBlocks.CHISELED_LIGHT_GRAY_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Light Gray Terracotta
	public static final Item CARVED_LIGHT_GRAY_TERRACOTTA = register("carved_light_gray_terracotta", new BlockItem(CPlusBlocks.CARVED_LIGHT_GRAY_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// GRAY TERRACOTTA

	// Base
	public static final Item GRAY_TERRACOTTA_SLAB = register("gray_terracotta_slab", new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_TERRACOTTA_STAIRS = register("gray_terracotta_stairs", new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_TERRACOTTA_WALL = register("gray_terracotta_wall", new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_TERRACOTTA_GATE = register("gray_terracotta_gate", new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Gray Terracotta
	public static final Item COBBLED_GRAY_TERRACOTTA = register("cobbled_gray_terracotta", new BlockItem(CPlusBlocks.COBBLED_GRAY_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_GRAY_TERRACOTTA_SLAB = register("cobbled_gray_terracotta_slab", new BlockItem(CPlusBlocks.COBBLED_GRAY_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_GRAY_TERRACOTTA_STAIRS = register("cobbled_gray_terracotta_stairs", new BlockItem(CPlusBlocks.COBBLED_GRAY_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_GRAY_TERRACOTTA_WALL = register("cobbled_gray_terracotta_wall", new BlockItem(CPlusBlocks.COBBLED_GRAY_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_GRAY_TERRACOTTA_GATE = register("cobbled_gray_terracotta_gate", new BlockItem(CPlusBlocks.COBBLED_GRAY_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Gray Terracotta
	public static final Item POLISHED_GRAY_TERRACOTTA = register("polished_gray_terracotta", new BlockItem(CPlusBlocks.POLISHED_GRAY_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GRAY_TERRACOTTA_SLAB = register("polished_gray_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_GRAY_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GRAY_TERRACOTTA_STAIRS = register("polished_gray_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_GRAY_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GRAY_TERRACOTTA_WALL = register("polished_gray_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_GRAY_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GRAY_TERRACOTTA_GATE = register("polished_gray_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_GRAY_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Gray Terracotta
	public static final Item SMOOTH_GRAY_TERRACOTTA = register("smooth_gray_terracotta", new BlockItem(CPlusBlocks.SMOOTH_GRAY_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_GRAY_TERRACOTTA_SLAB = register("smooth_gray_terracotta_slab", new BlockItem(CPlusBlocks.SMOOTH_GRAY_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_GRAY_TERRACOTTA_STAIRS = register("smooth_gray_terracotta_stairs", new BlockItem(CPlusBlocks.SMOOTH_GRAY_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_GRAY_TERRACOTTA_WALL = register("smooth_gray_terracotta_wall", new BlockItem(CPlusBlocks.SMOOTH_GRAY_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_GRAY_TERRACOTTA_GATE = register("smooth_gray_terracotta_gate", new BlockItem(CPlusBlocks.SMOOTH_GRAY_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Gray Terracotta Bricks
	public static final Item GRAY_TERRACOTTA_BRICKS = register("gray_terracotta_bricks", new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_TERRACOTTA_BRICK_SLAB = register("gray_terracotta_brick_slab", new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_TERRACOTTA_BRICK_STAIRS = register("gray_terracotta_brick_stairs", new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_TERRACOTTA_BRICK_WALL = register("gray_terracotta_brick_wall", new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_TERRACOTTA_BRICK_GATE = register("gray_terracotta_brick_gate", new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Gray Terracotta
	public static final Item CUT_GRAY_TERRACOTTA = register("cut_gray_terracotta", new BlockItem(CPlusBlocks.CUT_GRAY_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_GRAY_TERRACOTTA_SLAB = register("cut_gray_terracotta_slab", new BlockItem(CPlusBlocks.CUT_GRAY_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_GRAY_TERRACOTTA_STAIRS = register("cut_gray_terracotta_stairs", new BlockItem(CPlusBlocks.CUT_GRAY_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_GRAY_TERRACOTTA_WALL = register("cut_gray_terracotta_wall", new BlockItem(CPlusBlocks.CUT_GRAY_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_GRAY_TERRACOTTA_GATE = register("cut_gray_terracotta_gate", new BlockItem(CPlusBlocks.CUT_GRAY_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Gray Terracotta Tiles
	public static final Item GRAY_TERRACOTTA_TILES = register("gray_terracotta_tiles", new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_TERRACOTTA_TILE_SLAB = register("gray_terracotta_tile_slab", new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_TERRACOTTA_TILE_STAIRS = register("gray_terracotta_tile_stairs", new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_TERRACOTTA_TILE_WALL = register("gray_terracotta_tile_wall", new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_TERRACOTTA_TILE_GATE = register("gray_terracotta_tile_gate", new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Gray Terracotta Pillar
	public static final Item GRAY_TERRACOTTA_PILLAR = register("gray_terracotta_pillar", new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_TERRACOTTA_CORNER_PILLAR = register("gray_terracotta_corner_pillar", new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Gray Terracotta
	public static final Item CHISELED_GRAY_TERRACOTTA = register("chiseled_gray_terracotta", new BlockItem(CPlusBlocks.CHISELED_GRAY_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved  Gray Terracotta
	public static final Item CARVED_GRAY_TERRACOTTA = register("carved_gray_terracotta", new BlockItem(CPlusBlocks.CARVED_GRAY_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// BLACK TERRACOTTA

	// Base
	public static final Item BLACK_TERRACOTTA_SLAB = register("black_terracotta_slab", new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_TERRACOTTA_STAIRS = register("black_terracotta_stairs", new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_TERRACOTTA_WALL = register("black_terracotta_wall", new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_TERRACOTTA_GATE = register("black_terracotta_gate", new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Black Terracotta
	public static final Item COBBLED_BLACK_TERRACOTTA = register("cobbled_black_terracotta", new BlockItem(CPlusBlocks.COBBLED_BLACK_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_BLACK_TERRACOTTA_SLAB = register("cobbled_black_terracotta_slab", new BlockItem(CPlusBlocks.COBBLED_BLACK_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_BLACK_TERRACOTTA_STAIRS = register("cobbled_black_terracotta_stairs", new BlockItem(CPlusBlocks.COBBLED_BLACK_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_BLACK_TERRACOTTA_WALL = register("cobbled_black_terracotta_wall", new BlockItem(CPlusBlocks.COBBLED_BLACK_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_BLACK_TERRACOTTA_GATE = register("cobbled_black_terracotta_gate", new BlockItem(CPlusBlocks.COBBLED_BLACK_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Black Terracotta
	public static final Item POLISHED_BLACK_TERRACOTTA = register("polished_black_terracotta", new BlockItem(CPlusBlocks.POLISHED_BLACK_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLACK_TERRACOTTA_SLAB = register("polished_black_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_BLACK_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLACK_TERRACOTTA_STAIRS = register("polished_black_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_BLACK_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLACK_TERRACOTTA_WALL = register("polished_black_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_BLACK_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLACK_TERRACOTTA_GATE = register("polished_black_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_BLACK_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Black Terracotta
	public static final Item SMOOTH_BLACK_TERRACOTTA = register("smooth_black_terracotta", new BlockItem(CPlusBlocks.SMOOTH_BLACK_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BLACK_TERRACOTTA_SLAB = register("smooth_black_terracotta_slab", new BlockItem(CPlusBlocks.SMOOTH_BLACK_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BLACK_TERRACOTTA_STAIRS = register("smooth_black_terracotta_stairs", new BlockItem(CPlusBlocks.SMOOTH_BLACK_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BLACK_TERRACOTTA_WALL = register("smooth_black_terracotta_wall", new BlockItem(CPlusBlocks.SMOOTH_BLACK_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BLACK_TERRACOTTA_GATE = register("smooth_black_terracotta_gate", new BlockItem(CPlusBlocks.SMOOTH_BLACK_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Black Terracotta Bricks
	public static final Item BLACK_TERRACOTTA_BRICKS = register("black_terracotta_bricks", new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_TERRACOTTA_BRICK_SLAB = register("black_terracotta_brick_slab", new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_TERRACOTTA_BRICK_STAIRS = register("black_terracotta_brick_stairs", new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_TERRACOTTA_BRICK_WALL = register("black_terracotta_brick_wall", new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_TERRACOTTA_BRICK_GATE = register("black_terracotta_brick_gate", new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Black Terracotta
	public static final Item CUT_BLACK_TERRACOTTA = register("cut_black_terracotta", new BlockItem(CPlusBlocks.CUT_BLACK_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BLACK_TERRACOTTA_SLAB = register("cut_black_terracotta_slab", new BlockItem(CPlusBlocks.CUT_BLACK_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BLACK_TERRACOTTA_STAIRS = register("cut_black_terracotta_stairs", new BlockItem(CPlusBlocks.CUT_BLACK_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BLACK_TERRACOTTA_WALL = register("cut_black_terracotta_wall", new BlockItem(CPlusBlocks.CUT_BLACK_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BLACK_TERRACOTTA_GATE = register("cut_black_terracotta_gate", new BlockItem(CPlusBlocks.CUT_BLACK_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Black Terracotta Tiles
	public static final Item BLACK_TERRACOTTA_TILES = register("black_terracotta_tiles", new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_TERRACOTTA_TILE_SLAB = register("black_terracotta_tile_slab", new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_TERRACOTTA_TILE_STAIRS = register("black_terracotta_tile_stairs", new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_TERRACOTTA_TILE_WALL = register("black_terracotta_tile_wall", new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_TERRACOTTA_TILE_GATE = register("black_terracotta_tile_gate", new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Black Terracotta Pillar
	public static final Item BLACK_TERRACOTTA_PILLAR = register("black_terracotta_pillar", new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_TERRACOTTA_CORNER_PILLAR = register("black_terracotta_corner_pillar", new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Black Terracotta
	public static final Item CHISELED_BLACK_TERRACOTTA = register("chiseled_black_terracotta", new BlockItem(CPlusBlocks.CHISELED_BLACK_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Black Terracotta
	public static final Item CARVED_BLACK_TERRACOTTA = register("carved_black_terracotta", new BlockItem(CPlusBlocks.CARVED_BLACK_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// BROWN TERRACOTTA

	// Base
	public static final Item BROWN_TERRACOTTA_SLAB = register("brown_terracotta_slab", new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_TERRACOTTA_STAIRS = register("brown_terracotta_stairs", new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_TERRACOTTA_WALL = register("brown_terracotta_wall", new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_TERRACOTTA_GATE = register("brown_terracotta_gate", new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Brown Terracotta
	public static final Item COBBLED_BROWN_TERRACOTTA = register("cobbled_brown_terracotta", new BlockItem(CPlusBlocks.COBBLED_BROWN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_BROWN_TERRACOTTA_SLAB = register("cobbled_brown_terracotta_slab", new BlockItem(CPlusBlocks.COBBLED_BROWN_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_BROWN_TERRACOTTA_STAIRS = register("cobbled_brown_terracotta_stairs", new BlockItem(CPlusBlocks.COBBLED_BROWN_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_BROWN_TERRACOTTA_WALL = register("cobbled_brown_terracotta_wall", new BlockItem(CPlusBlocks.COBBLED_BROWN_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item COBBLED_BROWN_TERRACOTTA_GATE = register("cobbled_brown_terracotta_gate", new BlockItem(CPlusBlocks.COBBLED_BROWN_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Brown Terracotta
	public static final Item POLISHED_BROWN_TERRACOTTA = register("polished_brown_terracotta", new BlockItem(CPlusBlocks.POLISHED_BROWN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BROWN_TERRACOTTA_SLAB = register("polished_brown_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_BROWN_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BROWN_TERRACOTTA_STAIRS = register("polished_brown_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_BROWN_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BROWN_TERRACOTTA_WALL = register("polished_brown_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_BROWN_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BROWN_TERRACOTTA_GATE = register("polished_brown_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_BROWN_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Brown Terracotta
	public static final Item SMOOTH_BROWN_TERRACOTTA = register("smooth_brown_terracotta", new BlockItem(CPlusBlocks.SMOOTH_BROWN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BROWN_TERRACOTTA_SLAB = register("smooth_brown_terracotta_slab", new BlockItem(CPlusBlocks.SMOOTH_BROWN_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BROWN_TERRACOTTA_STAIRS = register("smooth_brown_terracotta_stairs", new BlockItem(CPlusBlocks.SMOOTH_BROWN_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BROWN_TERRACOTTA_WALL = register("smooth_brown_terracotta_wall", new BlockItem(CPlusBlocks.SMOOTH_BROWN_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BROWN_TERRACOTTA_GATE = register("smooth_brown_terracotta_gate", new BlockItem(CPlusBlocks.SMOOTH_BROWN_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Brown Terracotta Bricks
	public static final Item BROWN_TERRACOTTA_BRICKS = register("brown_terracotta_bricks", new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_TERRACOTTA_BRICK_SLAB = register("brown_terracotta_brick_slab", new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_TERRACOTTA_BRICK_STAIRS = register("brown_terracotta_brick_stairs", new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_TERRACOTTA_BRICK_WALL = register("brown_terracotta_brick_wall", new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_TERRACOTTA_BRICK_GATE = register("brown_terracotta_brick_gate", new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Brown Terracotta
	public static final Item CUT_BROWN_TERRACOTTA = register("cut_brown_terracotta", new BlockItem(CPlusBlocks.CUT_BROWN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BROWN_TERRACOTTA_SLAB = register("cut_brown_terracotta_slab", new BlockItem(CPlusBlocks.CUT_BROWN_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BROWN_TERRACOTTA_STAIRS = register("cut_brown_terracotta_stairs", new BlockItem(CPlusBlocks.CUT_BROWN_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BROWN_TERRACOTTA_WALL = register("cut_brown_terracotta_wall", new BlockItem(CPlusBlocks.CUT_BROWN_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BROWN_TERRACOTTA_GATE = register("cut_brown_terracotta_gate", new BlockItem(CPlusBlocks.CUT_BROWN_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Brown Terracotta Tiles
	public static final Item BROWN_TERRACOTTA_TILES = register("brown_terracotta_tiles", new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_TERRACOTTA_TILE_SLAB = register("brown_terracotta_tile_slab", new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_TERRACOTTA_TILE_STAIRS = register("brown_terracotta_tile_stairs", new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_TERRACOTTA_TILE_WALL = register("brown_terracotta_tile_wall", new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_TERRACOTTA_TILE_GATE = register("brown_terracotta_tile_gate", new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Brown Terracotta Pillar
	public static final Item BROWN_TERRACOTTA_PILLAR = register("brown_terracotta_pillar", new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_TERRACOTTA_CORNER_PILLAR = register("brown_terracotta_corner_pillar", new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Brown Terracotta
	public static final Item CHISELED_BROWN_TERRACOTTA = register("chiseled_brown_terracotta", new BlockItem(CPlusBlocks.CHISELED_BROWN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Brown Terracotta
	public static final Item CARVED_BROWN_TERRACOTTA = register("carved_brown_terracotta", new BlockItem(CPlusBlocks.CARVED_BROWN_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// GLAZED TERRACOTTA

	// Base

	// Polished Glazed Terracotta

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// RED GLAZED TERRACOTTA

	// Base

	// Polished
	public static final Item POLISHED_RED_GLAZED_TERRACOTTA = register("polished_red_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_RED_GLAZED_TERRACOTTA_SLAB = register("polished_red_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_RED_GLAZED_TERRACOTTA_STAIRS = register("polished_red_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_RED_GLAZED_TERRACOTTA_WALL = register("polished_red_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_RED_GLAZED_TERRACOTTA_GATE = register("polished_red_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// ORANGE GLAZED TERRACOTTA

	// Base

	// Polished
	public static final Item POLISHED_ORANGE_GLAZED_TERRACOTTA = register("polished_orange_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_ORANGE_GLAZED_TERRACOTTA_SLAB = register("polished_orange_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_ORANGE_GLAZED_TERRACOTTA_STAIRS = register("polished_orange_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_ORANGE_GLAZED_TERRACOTTA_WALL = register("polished_orange_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_ORANGE_GLAZED_TERRACOTTA_GATE = register("polished_orange_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// YELLOW GLAZED TERRACOTTA

	// Base

	// Polished
	public static final Item POLISHED_YELLOW_GLAZED_TERRACOTTA = register("polished_yellow_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_YELLOW_GLAZED_TERRACOTTA_SLAB = register("polished_yellow_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_YELLOW_GLAZED_TERRACOTTA_STAIRS = register("polished_yellow_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_YELLOW_GLAZED_TERRACOTTA_WALL = register("polished_yellow_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_YELLOW_GLAZED_TERRACOTTA_GATE = register("polished_yellow_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// LIME GLAZED TERRACOTTA

	// Base

	// Polished
	public static final Item POLISHED_LIME_GLAZED_TERRACOTTA = register("polished_lime_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIME_GLAZED_TERRACOTTA_SLAB = register("polished_lime_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIME_GLAZED_TERRACOTTA_STAIRS = register("polished_lime_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIME_GLAZED_TERRACOTTA_WALL = register("polished_lime_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIME_GLAZED_TERRACOTTA_GATE = register("polished_lime_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// GREEN GLAZED TERRACOTTA

	// Base

	// Polished
	public static final Item POLISHED_GREEN_GLAZED_TERRACOTTA = register("polished_green_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GREEN_GLAZED_TERRACOTTA_SLAB = register("polished_green_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GREEN_GLAZED_TERRACOTTA_STAIRS = register("polished_green_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GREEN_GLAZED_TERRACOTTA_WALL = register("polished_green_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GREEN_GLAZED_TERRACOTTA_GATE = register("polished_green_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// BLUE GLAZED TERRACOTTA

	// Base

	// Polished
	public static final Item POLISHED_BLUE_GLAZED_TERRACOTTA = register("polished_blue_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLUE_GLAZED_TERRACOTTA_SLAB = register("polished_blue_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLUE_GLAZED_TERRACOTTA_STAIRS = register("polished_blue_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLUE_GLAZED_TERRACOTTA_WALL = register("polished_blue_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLUE_GLAZED_TERRACOTTA_GATE = register("polished_blue_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// CYAN GLAZED TERRACOTTA

	// Base

	// Polished
	public static final Item POLISHED_CYAN_GLAZED_TERRACOTTA = register("polished_cyan_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_CYAN_GLAZED_TERRACOTTA_SLAB = register("polished_cyan_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_CYAN_GLAZED_TERRACOTTA_STAIRS = register("polished_cyan_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_CYAN_GLAZED_TERRACOTTA_WALL = register("polished_cyan_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_CYAN_GLAZED_TERRACOTTA_GATE = register("polished_cyan_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// LIGHT BLUE GLAZED TERRACOTTA

	// Base

	// Polished
	public static final Item POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA = register("polished_light_blue_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = register("polished_light_blue_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = register("polished_light_blue_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = register("polished_light_blue_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_GATE = register("polished_light_blue_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// PURPLE GLAZED TERRACOTTA

	// Base

	// Polished
	public static final Item POLISHED_PURPLE_GLAZED_TERRACOTTA = register("polished_purple_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PURPLE_GLAZED_TERRACOTTA_SLAB = register("polished_purple_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PURPLE_GLAZED_TERRACOTTA_STAIRS = register("polished_purple_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PURPLE_GLAZED_TERRACOTTA_WALL = register("polished_purple_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PURPLE_GLAZED_TERRACOTTA_GATE = register("polished_purple_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// MAGENTA GLAZED TERRACOTTA

	// Base

	// Polished
	public static final Item POLISHED_MAGENTA_GLAZED_TERRACOTTA = register("polished_magenta_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_MAGENTA_GLAZED_TERRACOTTA_SLAB = register("polished_magenta_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_MAGENTA_GLAZED_TERRACOTTA_STAIRS = register("polished_magenta_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_MAGENTA_GLAZED_TERRACOTTA_WALL = register("polished_magenta_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_MAGENTA_GLAZED_TERRACOTTA_GATE = register("polished_magenta_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// PINK GLAZED TERRACOTTA

	// Base

	// Polished
	public static final Item POLISHED_PINK_GLAZED_TERRACOTTA = register("polished_pink_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PINK_GLAZED_TERRACOTTA_SLAB = register("polished_pink_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PINK_GLAZED_TERRACOTTA_STAIRS = register("polished_pink_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PINK_GLAZED_TERRACOTTA_WALL = register("polished_pink_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PINK_GLAZED_TERRACOTTA_GATE = register("polished_pink_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// WHITE GLAZED TERRACOTTA

	// Base

	// Polished
	public static final Item POLISHED_WHITE_GLAZED_TERRACOTTA = register("polished_white_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_WHITE_GLAZED_TERRACOTTA_SLAB = register("polished_white_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_WHITE_GLAZED_TERRACOTTA_STAIRS = register("polished_white_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_WHITE_GLAZED_TERRACOTTA_WALL = register("polished_white_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_WHITE_GLAZED_TERRACOTTA_GATE = register("polished_white_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// LIGHT GRAY GLAZED TERRACOTTA

	// Base

	// Polished
	public static final Item POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA = register("polished_light_gray_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = register("polished_light_gray_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = register("polished_light_gray_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = register("polished_light_gray_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_GATE = register("polished_light_gray_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// GRAY GLAZED TERRACOTTA

	// Base

	// Polished
	public static final Item POLISHED_GRAY_GLAZED_TERRACOTTA = register("polished_gray_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GRAY_GLAZED_TERRACOTTA_SLAB = register("polished_gray_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GRAY_GLAZED_TERRACOTTA_STAIRS = register("polished_gray_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GRAY_GLAZED_TERRACOTTA_WALL = register("polished_gray_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GRAY_GLAZED_TERRACOTTA_GATE = register("polished_gray_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// BLACK GLAZED TERRACOTTA

	// Base

	// Polished
	public static final Item POLISHED_BLACK_GLAZED_TERRACOTTA = register("polished_black_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLACK_GLAZED_TERRACOTTA_SLAB = register("polished_black_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLACK_GLAZED_TERRACOTTA_STAIRS = register("polished_black_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLACK_GLAZED_TERRACOTTA_WALL = register("polished_black_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLACK_GLAZED_TERRACOTTA_GATE = register("polished_black_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// BROWN GLAZED TERRACOTTA

	// Base

	// Polished
	public static final Item POLISHED_BROWN_GLAZED_TERRACOTTA = register("polished_brown_glazed_terracotta", new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BROWN_GLAZED_TERRACOTTA_SLAB = register("polished_brown_glazed_terracotta_slab", new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BROWN_GLAZED_TERRACOTTA_STAIRS = register("polished_brown_glazed_terracotta_stairs", new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BROWN_GLAZED_TERRACOTTA_WALL = register("polished_brown_glazed_terracotta_wall", new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BROWN_GLAZED_TERRACOTTA_GATE = register("polished_brown_glazed_terracotta_gate", new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// RED CONCRETE

	// Base
	public static final Item RED_CONCRETE_SLAB = register("red_concrete_slab", new BlockItem(CPlusBlocks.RED_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_CONCRETE_STAIRS = register("red_concrete_stairs", new BlockItem(CPlusBlocks.RED_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_CONCRETE_WALL = register("red_concrete_wall", new BlockItem(CPlusBlocks.RED_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_CONCRETE_GATE = register("red_concrete_gate", new BlockItem(CPlusBlocks.RED_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final Item POLISHED_RED_CONCRETE = register("polished_red_concrete", new BlockItem(CPlusBlocks.POLISHED_RED_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_RED_CONCRETE_SLAB = register("polished_red_concrete_slab", new BlockItem(CPlusBlocks.POLISHED_RED_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_RED_CONCRETE_STAIRS = register("polished_red_concrete_stairs", new BlockItem(CPlusBlocks.POLISHED_RED_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_RED_CONCRETE_WALL = register("polished_red_concrete_wall", new BlockItem(CPlusBlocks.POLISHED_RED_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_RED_CONCRETE_GATE = register("polished_red_concrete_gate", new BlockItem(CPlusBlocks.POLISHED_RED_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final Item SMOOTH_RED_CONCRETE = register("smooth_red_concrete", new BlockItem(CPlusBlocks.SMOOTH_RED_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_RED_CONCRETE_SLAB = register("smooth_red_concrete_slab", new BlockItem(CPlusBlocks.SMOOTH_RED_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_RED_CONCRETE_STAIRS = register("smooth_red_concrete_stairs", new BlockItem(CPlusBlocks.SMOOTH_RED_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_RED_CONCRETE_WALL = register("smooth_red_concrete_wall", new BlockItem(CPlusBlocks.SMOOTH_RED_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_RED_CONCRETE_GATE = register("smooth_red_concrete_gate", new BlockItem(CPlusBlocks.SMOOTH_RED_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final Item RED_CONCRETE_BRICKS = register("red_concrete_bricks", new BlockItem(CPlusBlocks.RED_CONCRETE_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_CONCRETE_BRICK_SLAB = register("red_concrete_brick_slab", new BlockItem(CPlusBlocks.RED_CONCRETE_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_CONCRETE_BRICK_STAIRS = register("red_concrete_brick_stairs", new BlockItem(CPlusBlocks.RED_CONCRETE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_CONCRETE_BRICK_WALL = register("red_concrete_brick_wall", new BlockItem(CPlusBlocks.RED_CONCRETE_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_CONCRETE_BRICK_GATE = register("red_concrete_brick_gate", new BlockItem(CPlusBlocks.RED_CONCRETE_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final Item CUT_RED_CONCRETE = register("cut_red_concrete", new BlockItem(CPlusBlocks.CUT_RED_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_RED_CONCRETE_SLAB = register("cut_red_concrete_slab", new BlockItem(CPlusBlocks.CUT_RED_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_RED_CONCRETE_STAIRS = register("cut_red_concrete_stairs", new BlockItem(CPlusBlocks.CUT_RED_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_RED_CONCRETE_WALL = register("cut_red_concrete_wall", new BlockItem(CPlusBlocks.CUT_RED_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_RED_CONCRETE_GATE = register("cut_red_concrete_gate", new BlockItem(CPlusBlocks.CUT_RED_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final Item RED_CONCRETE_TILES = register("red_concrete_tiles", new BlockItem(CPlusBlocks.RED_CONCRETE_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_CONCRETE_TILE_SLAB = register("red_concrete_tile_slab", new BlockItem(CPlusBlocks.RED_CONCRETE_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_CONCRETE_TILE_STAIRS = register("red_concrete_tile_stairs", new BlockItem(CPlusBlocks.RED_CONCRETE_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_CONCRETE_TILE_WALL = register("red_concrete_tile_wall", new BlockItem(CPlusBlocks.RED_CONCRETE_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_CONCRETE_TILE_GATE = register("red_concrete_tile_gate", new BlockItem(CPlusBlocks.RED_CONCRETE_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final Item RED_CONCRETE_PILLAR = register("red_concrete_pillar", new BlockItem(CPlusBlocks.RED_CONCRETE_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_CONCRETE_CORNER_PILLAR = register("red_concrete_corner_pillar", new BlockItem(CPlusBlocks.RED_CONCRETE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final Item CHISELED_RED_CONCRETE = register("chiseled_red_concrete", new BlockItem(CPlusBlocks.CHISELED_RED_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final Item CARVED_RED_CONCRETE = register("carved_red_concrete", new BlockItem(CPlusBlocks.CARVED_RED_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// ORANGE CONCRETE

	// Base
	public static final Item ORANGE_CONCRETE_SLAB = register("orange_concrete_slab", new BlockItem(CPlusBlocks.ORANGE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs", new BlockItem(CPlusBlocks.ORANGE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_CONCRETE_WALL = register("orange_concrete_wall", new BlockItem(CPlusBlocks.ORANGE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_CONCRETE_GATE = register("orange_concrete_gate", new BlockItem(CPlusBlocks.ORANGE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final Item POLISHED_ORANGE_CONCRETE = register("polished_orange_concrete", new BlockItem(CPlusBlocks.POLISHED_ORANGE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_ORANGE_CONCRETE_SLAB = register("polished_orange_concrete_slab", new BlockItem(CPlusBlocks.POLISHED_ORANGE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_ORANGE_CONCRETE_STAIRS = register("polished_orange_concrete_stairs", new BlockItem(CPlusBlocks.POLISHED_ORANGE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_ORANGE_CONCRETE_WALL = register("polished_orange_concrete_wall", new BlockItem(CPlusBlocks.POLISHED_ORANGE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_ORANGE_CONCRETE_GATE = register("polished_orange_concrete_gate", new BlockItem(CPlusBlocks.POLISHED_ORANGE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final Item SMOOTH_ORANGE_CONCRETE = register("smooth_orange_concrete", new BlockItem(CPlusBlocks.SMOOTH_ORANGE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_ORANGE_CONCRETE_SLAB = register("smooth_orange_concrete_slab", new BlockItem(CPlusBlocks.SMOOTH_ORANGE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_ORANGE_CONCRETE_STAIRS = register("smooth_orange_concrete_stairs", new BlockItem(CPlusBlocks.SMOOTH_ORANGE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_ORANGE_CONCRETE_WALL = register("smooth_orange_concrete_wall", new BlockItem(CPlusBlocks.SMOOTH_ORANGE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_ORANGE_CONCRETE_GATE = register("smooth_orange_concrete_gate", new BlockItem(CPlusBlocks.SMOOTH_ORANGE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final Item ORANGE_CONCRETE_BRICKS = register("orange_concrete_bricks", new BlockItem(CPlusBlocks.ORANGE_CONCRETE_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_CONCRETE_BRICK_SLAB = register("orange_concrete_brick_slab", new BlockItem(CPlusBlocks.ORANGE_CONCRETE_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_CONCRETE_BRICK_STAIRS = register("orange_concrete_brick_stairs", new BlockItem(CPlusBlocks.ORANGE_CONCRETE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_CONCRETE_BRICK_WALL = register("orange_concrete_brick_wall", new BlockItem(CPlusBlocks.ORANGE_CONCRETE_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_CONCRETE_BRICK_GATE = register("orange_concrete_brick_gate", new BlockItem(CPlusBlocks.ORANGE_CONCRETE_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final Item CUT_ORANGE_CONCRETE = register("cut_orange_concrete", new BlockItem(CPlusBlocks.CUT_ORANGE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_ORANGE_CONCRETE_SLAB = register("cut_orange_concrete_slab", new BlockItem(CPlusBlocks.CUT_ORANGE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_ORANGE_CONCRETE_STAIRS = register("cut_orange_concrete_stairs", new BlockItem(CPlusBlocks.CUT_ORANGE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_ORANGE_CONCRETE_WALL = register("cut_orange_concrete_wall", new BlockItem(CPlusBlocks.CUT_ORANGE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_ORANGE_CONCRETE_GATE = register("cut_orange_concrete_gate", new BlockItem(CPlusBlocks.CUT_ORANGE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final Item ORANGE_CONCRETE_TILES = register("orange_concrete_tiles", new BlockItem(CPlusBlocks.ORANGE_CONCRETE_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_CONCRETE_TILE_SLAB = register("orange_concrete_tile_slab", new BlockItem(CPlusBlocks.ORANGE_CONCRETE_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_CONCRETE_TILE_STAIRS = register("orange_concrete_tile_stairs", new BlockItem(CPlusBlocks.ORANGE_CONCRETE_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_CONCRETE_TILE_WALL = register("orange_concrete_tile_wall", new BlockItem(CPlusBlocks.ORANGE_CONCRETE_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_CONCRETE_TILE_GATE = register("orange_concrete_tile_gate", new BlockItem(CPlusBlocks.ORANGE_CONCRETE_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final Item ORANGE_CONCRETE_PILLAR = register("orange_concrete_pillar", new BlockItem(CPlusBlocks.ORANGE_CONCRETE_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_CONCRETE_CORNER_PILLAR = register("orange_concrete_corner_pillar", new BlockItem(CPlusBlocks.ORANGE_CONCRETE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final Item CHISELED_ORANGE_CONCRETE = register("chiseled_orange_concrete", new BlockItem(CPlusBlocks.CHISELED_ORANGE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final Item CARVED_ORANGE_CONCRETE = register("carved_orange_concrete", new BlockItem(CPlusBlocks.CARVED_ORANGE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// YELLOW CONCRETE

	// Base
	public static final Item YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab", new BlockItem(CPlusBlocks.YELLOW_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs", new BlockItem(CPlusBlocks.YELLOW_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_CONCRETE_WALL = register("yellow_concrete_wall", new BlockItem(CPlusBlocks.YELLOW_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_CONCRETE_GATE = register("yellow_concrete_gate", new BlockItem(CPlusBlocks.YELLOW_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final Item POLISHED_YELLOW_CONCRETE = register("polished_yellow_concrete", new BlockItem(CPlusBlocks.POLISHED_YELLOW_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_YELLOW_CONCRETE_SLAB = register("polished_yellow_concrete_slab", new BlockItem(CPlusBlocks.POLISHED_YELLOW_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_YELLOW_CONCRETE_STAIRS = register("polished_yellow_concrete_stairs", new BlockItem(CPlusBlocks.POLISHED_YELLOW_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_YELLOW_CONCRETE_WALL = register("polished_yellow_concrete_wall", new BlockItem(CPlusBlocks.POLISHED_YELLOW_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_YELLOW_CONCRETE_GATE = register("polished_yellow_concrete_gate", new BlockItem(CPlusBlocks.POLISHED_YELLOW_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final Item SMOOTH_YELLOW_CONCRETE = register("smooth_yellow_concrete", new BlockItem(CPlusBlocks.SMOOTH_YELLOW_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_YELLOW_CONCRETE_SLAB = register("smooth_yellow_concrete_slab", new BlockItem(CPlusBlocks.SMOOTH_YELLOW_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_YELLOW_CONCRETE_STAIRS = register("smooth_yellow_concrete_stairs", new BlockItem(CPlusBlocks.SMOOTH_YELLOW_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_YELLOW_CONCRETE_WALL = register("smooth_yellow_concrete_wall", new BlockItem(CPlusBlocks.SMOOTH_YELLOW_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_YELLOW_CONCRETE_GATE = register("smooth_yellow_concrete_gate", new BlockItem(CPlusBlocks.SMOOTH_YELLOW_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final Item YELLOW_CONCRETE_BRICKS = register("yellow_concrete_bricks", new BlockItem(CPlusBlocks.YELLOW_CONCRETE_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_CONCRETE_BRICK_SLAB = register("yellow_concrete_brick_slab", new BlockItem(CPlusBlocks.YELLOW_CONCRETE_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_CONCRETE_BRICK_STAIRS = register("yellow_concrete_brick_stairs", new BlockItem(CPlusBlocks.YELLOW_CONCRETE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_CONCRETE_BRICK_WALL = register("yellow_concrete_brick_wall", new BlockItem(CPlusBlocks.YELLOW_CONCRETE_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_CONCRETE_BRICK_GATE = register("yellow_concrete_brick_gate", new BlockItem(CPlusBlocks.YELLOW_CONCRETE_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final Item CUT_YELLOW_CONCRETE = register("cut_yellow_concrete", new BlockItem(CPlusBlocks.CUT_YELLOW_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_YELLOW_CONCRETE_SLAB = register("cut_yellow_concrete_slab", new BlockItem(CPlusBlocks.CUT_YELLOW_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_YELLOW_CONCRETE_STAIRS = register("cut_yellow_concrete_stairs", new BlockItem(CPlusBlocks.CUT_YELLOW_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_YELLOW_CONCRETE_WALL = register("cut_yellow_concrete_wall", new BlockItem(CPlusBlocks.CUT_YELLOW_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_YELLOW_CONCRETE_GATE = register("cut_yellow_concrete_gate", new BlockItem(CPlusBlocks.CUT_YELLOW_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final Item YELLOW_CONCRETE_TILES = register("yellow_concrete_tiles", new BlockItem(CPlusBlocks.YELLOW_CONCRETE_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_CONCRETE_TILE_SLAB = register("yellow_concrete_tile_slab", new BlockItem(CPlusBlocks.YELLOW_CONCRETE_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_CONCRETE_TILE_STAIRS = register("yellow_concrete_tile_stairs", new BlockItem(CPlusBlocks.YELLOW_CONCRETE_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_CONCRETE_TILE_WALL = register("yellow_concrete_tile_wall", new BlockItem(CPlusBlocks.YELLOW_CONCRETE_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_CONCRETE_TILE_GATE = register("yellow_concrete_tile_gate", new BlockItem(CPlusBlocks.YELLOW_CONCRETE_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final Item YELLOW_CONCRETE_PILLAR = register("yellow_concrete_pillar", new BlockItem(CPlusBlocks.YELLOW_CONCRETE_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_CONCRETE_CORNER_PILLAR = register("yellow_concrete_corner_pillar", new BlockItem(CPlusBlocks.YELLOW_CONCRETE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final Item CHISELED_YELLOW_CONCRETE = register("chiseled_yellow_concrete", new BlockItem(CPlusBlocks.CHISELED_YELLOW_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final Item CARVED_YELLOW_CONCRETE = register("carved_yellow_concrete", new BlockItem(CPlusBlocks.CARVED_YELLOW_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// LIME CONCRETE

	// Base
	public static final Item LIME_CONCRETE_SLAB = register("lime_concrete_slab", new BlockItem(CPlusBlocks.LIME_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_CONCRETE_STAIRS = register("lime_concrete_stairs", new BlockItem(CPlusBlocks.LIME_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_CONCRETE_WALL = register("lime_concrete_wall", new BlockItem(CPlusBlocks.LIME_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_CONCRETE_GATE = register("lime_concrete_gate", new BlockItem(CPlusBlocks.LIME_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final Item POLISHED_LIME_CONCRETE = register("polished_lime_concrete", new BlockItem(CPlusBlocks.POLISHED_LIME_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIME_CONCRETE_SLAB = register("polished_lime_concrete_slab", new BlockItem(CPlusBlocks.POLISHED_LIME_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIME_CONCRETE_STAIRS = register("polished_lime_concrete_stairs", new BlockItem(CPlusBlocks.POLISHED_LIME_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIME_CONCRETE_WALL = register("polished_lime_concrete_wall", new BlockItem(CPlusBlocks.POLISHED_LIME_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIME_CONCRETE_GATE = register("polished_lime_concrete_gate", new BlockItem(CPlusBlocks.POLISHED_LIME_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final Item SMOOTH_LIME_CONCRETE = register("smooth_lime_concrete", new BlockItem(CPlusBlocks.SMOOTH_LIME_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIME_CONCRETE_SLAB = register("smooth_lime_concrete_slab", new BlockItem(CPlusBlocks.SMOOTH_LIME_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIME_CONCRETE_STAIRS = register("smooth_lime_concrete_stairs", new BlockItem(CPlusBlocks.SMOOTH_LIME_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIME_CONCRETE_WALL = register("smooth_lime_concrete_wall", new BlockItem(CPlusBlocks.SMOOTH_LIME_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIME_CONCRETE_GATE = register("smooth_lime_concrete_gate", new BlockItem(CPlusBlocks.SMOOTH_LIME_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final Item LIME_CONCRETE_BRICKS = register("lime_concrete_bricks", new BlockItem(CPlusBlocks.LIME_CONCRETE_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_CONCRETE_BRICK_SLAB = register("lime_concrete_brick_slab", new BlockItem(CPlusBlocks.LIME_CONCRETE_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_CONCRETE_BRICK_STAIRS = register("lime_concrete_brick_stairs", new BlockItem(CPlusBlocks.LIME_CONCRETE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_CONCRETE_BRICK_WALL = register("lime_concrete_brick_wall", new BlockItem(CPlusBlocks.LIME_CONCRETE_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_CONCRETE_BRICK_GATE = register("lime_concrete_brick_gate", new BlockItem(CPlusBlocks.LIME_CONCRETE_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final Item CUT_LIME_CONCRETE = register("cut_lime_concrete", new BlockItem(CPlusBlocks.CUT_LIME_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIME_CONCRETE_SLAB = register("cut_lime_concrete_slab", new BlockItem(CPlusBlocks.CUT_LIME_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIME_CONCRETE_STAIRS = register("cut_lime_concrete_stairs", new BlockItem(CPlusBlocks.CUT_LIME_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIME_CONCRETE_WALL = register("cut_lime_concrete_wall", new BlockItem(CPlusBlocks.CUT_LIME_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIME_CONCRETE_GATE = register("cut_lime_concrete_gate", new BlockItem(CPlusBlocks.CUT_LIME_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final Item LIME_CONCRETE_TILES = register("lime_concrete_tiles", new BlockItem(CPlusBlocks.LIME_CONCRETE_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_CONCRETE_TILE_SLAB = register("lime_concrete_tile_slab", new BlockItem(CPlusBlocks.LIME_CONCRETE_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_CONCRETE_TILE_STAIRS = register("lime_concrete_tile_stairs", new BlockItem(CPlusBlocks.LIME_CONCRETE_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_CONCRETE_TILE_WALL = register("lime_concrete_tile_wall", new BlockItem(CPlusBlocks.LIME_CONCRETE_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_CONCRETE_TILE_GATE = register("lime_concrete_tile_gate", new BlockItem(CPlusBlocks.LIME_CONCRETE_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final Item LIME_CONCRETE_PILLAR = register("lime_concrete_pillar", new BlockItem(CPlusBlocks.LIME_CONCRETE_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_CONCRETE_CORNER_PILLAR = register("lime_concrete_corner_pillar", new BlockItem(CPlusBlocks.LIME_CONCRETE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final Item CHISELED_LIME_CONCRETE = register("chiseled_lime_concrete", new BlockItem(CPlusBlocks.CHISELED_LIME_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final Item CARVED_LIME_CONCRETE = register("carved_lime_concrete", new BlockItem(CPlusBlocks.CARVED_LIME_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// GREEN CONCRETE

	// Base
	public static final Item GREEN_CONCRETE_SLAB = register("green_concrete_slab", new BlockItem(CPlusBlocks.GREEN_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_CONCRETE_STAIRS = register("green_concrete_stairs", new BlockItem(CPlusBlocks.GREEN_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_CONCRETE_WALL = register("green_concrete_wall", new BlockItem(CPlusBlocks.GREEN_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_CONCRETE_GATE = register("green_concrete_gate", new BlockItem(CPlusBlocks.GREEN_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final Item POLISHED_GREEN_CONCRETE = register("polished_green_concrete", new BlockItem(CPlusBlocks.POLISHED_GREEN_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GREEN_CONCRETE_SLAB = register("polished_green_concrete_slab", new BlockItem(CPlusBlocks.POLISHED_GREEN_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GREEN_CONCRETE_STAIRS = register("polished_green_concrete_stairs", new BlockItem(CPlusBlocks.POLISHED_GREEN_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GREEN_CONCRETE_WALL = register("polished_green_concrete_wall", new BlockItem(CPlusBlocks.POLISHED_GREEN_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GREEN_CONCRETE_GATE = register("polished_green_concrete_gate", new BlockItem(CPlusBlocks.POLISHED_GREEN_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final Item SMOOTH_GREEN_CONCRETE = register("smooth_green_concrete", new BlockItem(CPlusBlocks.SMOOTH_GREEN_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_GREEN_CONCRETE_SLAB = register("smooth_green_concrete_slab", new BlockItem(CPlusBlocks.SMOOTH_GREEN_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_GREEN_CONCRETE_STAIRS = register("smooth_green_concrete_stairs", new BlockItem(CPlusBlocks.SMOOTH_GREEN_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_GREEN_CONCRETE_WALL = register("smooth_green_concrete_wall", new BlockItem(CPlusBlocks.SMOOTH_GREEN_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_GREEN_CONCRETE_GATE = register("smooth_green_concrete_gate", new BlockItem(CPlusBlocks.SMOOTH_GREEN_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final Item GREEN_CONCRETE_BRICKS = register("green_concrete_bricks", new BlockItem(CPlusBlocks.GREEN_CONCRETE_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_CONCRETE_BRICK_SLAB = register("green_concrete_brick_slab", new BlockItem(CPlusBlocks.GREEN_CONCRETE_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_CONCRETE_BRICK_STAIRS = register("green_concrete_brick_stairs", new BlockItem(CPlusBlocks.GREEN_CONCRETE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_CONCRETE_BRICK_WALL = register("green_concrete_brick_wall", new BlockItem(CPlusBlocks.GREEN_CONCRETE_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_CONCRETE_BRICK_GATE = register("green_concrete_brick_gate", new BlockItem(CPlusBlocks.GREEN_CONCRETE_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final Item CUT_GREEN_CONCRETE = register("cut_green_concrete", new BlockItem(CPlusBlocks.CUT_GREEN_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_GREEN_CONCRETE_SLAB = register("cut_green_concrete_slab", new BlockItem(CPlusBlocks.CUT_GREEN_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_GREEN_CONCRETE_STAIRS = register("cut_green_concrete_stairs", new BlockItem(CPlusBlocks.CUT_GREEN_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_GREEN_CONCRETE_WALL = register("cut_green_concrete_wall", new BlockItem(CPlusBlocks.CUT_GREEN_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_GREEN_CONCRETE_GATE = register("cut_green_concrete_gate", new BlockItem(CPlusBlocks.CUT_GREEN_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final Item GREEN_CONCRETE_TILES = register("green_concrete_tiles", new BlockItem(CPlusBlocks.GREEN_CONCRETE_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_CONCRETE_TILE_SLAB = register("green_concrete_tile_slab", new BlockItem(CPlusBlocks.GREEN_CONCRETE_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_CONCRETE_TILE_STAIRS = register("green_concrete_tile_stairs", new BlockItem(CPlusBlocks.GREEN_CONCRETE_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_CONCRETE_TILE_WALL = register("green_concrete_tile_wall", new BlockItem(CPlusBlocks.GREEN_CONCRETE_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_CONCRETE_TILE_GATE = register("green_concrete_tile_gate", new BlockItem(CPlusBlocks.GREEN_CONCRETE_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final Item GREEN_CONCRETE_PILLAR = register("green_concrete_pillar", new BlockItem(CPlusBlocks.GREEN_CONCRETE_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_CONCRETE_CORNER_PILLAR = register("green_concrete_corner_pillar", new BlockItem(CPlusBlocks.GREEN_CONCRETE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final Item CHISELED_GREEN_CONCRETE = register("chiseled_green_concrete", new BlockItem(CPlusBlocks.CHISELED_GREEN_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final Item CARVED_GREEN_CONCRETE = register("carved_green_concrete", new BlockItem(CPlusBlocks.CARVED_GREEN_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// BLUE CONCRETE

	// Base
	public static final Item BLUE_CONCRETE_SLAB = register("blue_concrete_slab", new BlockItem(CPlusBlocks.BLUE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs", new BlockItem(CPlusBlocks.BLUE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_CONCRETE_WALL = register("blue_concrete_wall", new BlockItem(CPlusBlocks.BLUE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_CONCRETE_GATE = register("blue_concrete_gate", new BlockItem(CPlusBlocks.BLUE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final Item POLISHED_BLUE_CONCRETE = register("polished_blue_concrete", new BlockItem(CPlusBlocks.POLISHED_BLUE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLUE_CONCRETE_SLAB = register("polished_blue_concrete_slab", new BlockItem(CPlusBlocks.POLISHED_BLUE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLUE_CONCRETE_STAIRS = register("polished_blue_concrete_stairs", new BlockItem(CPlusBlocks.POLISHED_BLUE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLUE_CONCRETE_WALL = register("polished_blue_concrete_wall", new BlockItem(CPlusBlocks.POLISHED_BLUE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLUE_CONCRETE_GATE = register("polished_blue_concrete_gate", new BlockItem(CPlusBlocks.POLISHED_BLUE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final Item SMOOTH_BLUE_CONCRETE = register("smooth_blue_concrete", new BlockItem(CPlusBlocks.SMOOTH_BLUE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BLUE_CONCRETE_SLAB = register("smooth_blue_concrete_slab", new BlockItem(CPlusBlocks.SMOOTH_BLUE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BLUE_CONCRETE_STAIRS = register("smooth_blue_concrete_stairs", new BlockItem(CPlusBlocks.SMOOTH_BLUE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BLUE_CONCRETE_WALL = register("smooth_blue_concrete_wall", new BlockItem(CPlusBlocks.SMOOTH_BLUE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BLUE_CONCRETE_GATE = register("smooth_blue_concrete_gate", new BlockItem(CPlusBlocks.SMOOTH_BLUE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final Item BLUE_CONCRETE_BRICKS = register("blue_concrete_bricks", new BlockItem(CPlusBlocks.BLUE_CONCRETE_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_CONCRETE_BRICK_SLAB = register("blue_concrete_brick_slab", new BlockItem(CPlusBlocks.BLUE_CONCRETE_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_CONCRETE_BRICK_STAIRS = register("blue_concrete_brick_stairs", new BlockItem(CPlusBlocks.BLUE_CONCRETE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_CONCRETE_BRICK_WALL = register("blue_concrete_brick_wall", new BlockItem(CPlusBlocks.BLUE_CONCRETE_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_CONCRETE_BRICK_GATE = register("blue_concrete_brick_gate", new BlockItem(CPlusBlocks.BLUE_CONCRETE_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final Item CUT_BLUE_CONCRETE = register("cut_blue_concrete", new BlockItem(CPlusBlocks.CUT_BLUE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BLUE_CONCRETE_SLAB = register("cut_blue_concrete_slab", new BlockItem(CPlusBlocks.CUT_BLUE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BLUE_CONCRETE_STAIRS = register("cut_blue_concrete_stairs", new BlockItem(CPlusBlocks.CUT_BLUE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BLUE_CONCRETE_WALL = register("cut_blue_concrete_wall", new BlockItem(CPlusBlocks.CUT_BLUE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BLUE_CONCRETE_GATE = register("cut_blue_concrete_gate", new BlockItem(CPlusBlocks.CUT_BLUE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final Item BLUE_CONCRETE_TILES = register("blue_concrete_tiles", new BlockItem(CPlusBlocks.BLUE_CONCRETE_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_CONCRETE_TILE_SLAB = register("blue_concrete_tile_slab", new BlockItem(CPlusBlocks.BLUE_CONCRETE_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_CONCRETE_TILE_STAIRS = register("blue_concrete_tile_stairs", new BlockItem(CPlusBlocks.BLUE_CONCRETE_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_CONCRETE_TILE_WALL = register("blue_concrete_tile_wall", new BlockItem(CPlusBlocks.BLUE_CONCRETE_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_CONCRETE_TILE_GATE = register("blue_concrete_tile_gate", new BlockItem(CPlusBlocks.BLUE_CONCRETE_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final Item BLUE_CONCRETE_PILLAR = register("blue_concrete_pillar", new BlockItem(CPlusBlocks.BLUE_CONCRETE_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_CONCRETE_CORNER_PILLAR = register("blue_concrete_corner_pillar", new BlockItem(CPlusBlocks.BLUE_CONCRETE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final Item CHISELED_BLUE_CONCRETE = register("chiseled_blue_concrete", new BlockItem(CPlusBlocks.CHISELED_BLUE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final Item CARVED_BLUE_CONCRETE = register("carved_blue_concrete", new BlockItem(CPlusBlocks.CARVED_BLUE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// CYAN CONCRETE

	// Base
	public static final Item CYAN_CONCRETE_SLAB = register("cyan_concrete_slab", new BlockItem(CPlusBlocks.CYAN_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs", new BlockItem(CPlusBlocks.CYAN_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_CONCRETE_WALL = register("cyan_concrete_wall", new BlockItem(CPlusBlocks.CYAN_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_CONCRETE_GATE = register("cyan_concrete_gate", new BlockItem(CPlusBlocks.CYAN_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final Item POLISHED_CYAN_CONCRETE = register("polished_cyan_concrete", new BlockItem(CPlusBlocks.POLISHED_CYAN_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_CYAN_CONCRETE_SLAB = register("polished_cyan_concrete_slab", new BlockItem(CPlusBlocks.POLISHED_CYAN_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_CYAN_CONCRETE_STAIRS = register("polished_cyan_concrete_stairs", new BlockItem(CPlusBlocks.POLISHED_CYAN_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_CYAN_CONCRETE_WALL = register("polished_cyan_concrete_wall", new BlockItem(CPlusBlocks.POLISHED_CYAN_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_CYAN_CONCRETE_GATE = register("polished_cyan_concrete_gate", new BlockItem(CPlusBlocks.POLISHED_CYAN_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final Item SMOOTH_CYAN_CONCRETE = register("smooth_cyan_concrete", new BlockItem(CPlusBlocks.SMOOTH_CYAN_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_CYAN_CONCRETE_SLAB = register("smooth_cyan_concrete_slab", new BlockItem(CPlusBlocks.SMOOTH_CYAN_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_CYAN_CONCRETE_STAIRS = register("smooth_cyan_concrete_stairs", new BlockItem(CPlusBlocks.SMOOTH_CYAN_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_CYAN_CONCRETE_WALL = register("smooth_cyan_concrete_wall", new BlockItem(CPlusBlocks.SMOOTH_CYAN_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_CYAN_CONCRETE_GATE = register("smooth_cyan_concrete_gate", new BlockItem(CPlusBlocks.SMOOTH_CYAN_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final Item CYAN_CONCRETE_BRICKS = register("cyan_concrete_bricks", new BlockItem(CPlusBlocks.CYAN_CONCRETE_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_CONCRETE_BRICK_SLAB = register("cyan_concrete_brick_slab", new BlockItem(CPlusBlocks.CYAN_CONCRETE_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_CONCRETE_BRICK_STAIRS = register("cyan_concrete_brick_stairs", new BlockItem(CPlusBlocks.CYAN_CONCRETE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_CONCRETE_BRICK_WALL = register("cyan_concrete_brick_wall", new BlockItem(CPlusBlocks.CYAN_CONCRETE_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_CONCRETE_BRICK_GATE = register("cyan_concrete_brick_gate", new BlockItem(CPlusBlocks.CYAN_CONCRETE_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final Item CUT_CYAN_CONCRETE = register("cut_cyan_concrete", new BlockItem(CPlusBlocks.CUT_CYAN_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_CYAN_CONCRETE_SLAB = register("cut_cyan_concrete_slab", new BlockItem(CPlusBlocks.CUT_CYAN_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_CYAN_CONCRETE_STAIRS = register("cut_cyan_concrete_stairs", new BlockItem(CPlusBlocks.CUT_CYAN_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_CYAN_CONCRETE_WALL = register("cut_cyan_concrete_wall", new BlockItem(CPlusBlocks.CUT_CYAN_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_CYAN_CONCRETE_GATE = register("cut_cyan_concrete_gate", new BlockItem(CPlusBlocks.CUT_CYAN_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final Item CYAN_CONCRETE_TILES = register("cyan_concrete_tiles", new BlockItem(CPlusBlocks.CYAN_CONCRETE_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_CONCRETE_TILE_SLAB = register("cyan_concrete_tile_slab", new BlockItem(CPlusBlocks.CYAN_CONCRETE_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_CONCRETE_TILE_STAIRS = register("cyan_concrete_tile_stairs", new BlockItem(CPlusBlocks.CYAN_CONCRETE_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_CONCRETE_TILE_WALL = register("cyan_concrete_tile_wall", new BlockItem(CPlusBlocks.CYAN_CONCRETE_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_CONCRETE_TILE_GATE = register("cyan_concrete_tile_gate", new BlockItem(CPlusBlocks.CYAN_CONCRETE_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final Item CYAN_CONCRETE_PILLAR = register("cyan_concrete_pillar", new BlockItem(CPlusBlocks.CYAN_CONCRETE_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_CONCRETE_CORNER_PILLAR = register("cyan_concrete_corner_pillar", new BlockItem(CPlusBlocks.CYAN_CONCRETE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final Item CHISELED_CYAN_CONCRETE = register("chiseled_cyan_concrete", new BlockItem(CPlusBlocks.CHISELED_CYAN_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final Item CARVED_CYAN_CONCRETE = register("carved_cyan_concrete", new BlockItem(CPlusBlocks.CARVED_CYAN_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// LIGHT BLUE CONCRETE

	// Base
	public static final Item LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab", new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs", new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_CONCRETE_WALL = register("light_blue_concrete_wall", new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_CONCRETE_GATE = register("light_blue_concrete_gate", new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final Item POLISHED_LIGHT_BLUE_CONCRETE = register("polished_light_blue_concrete", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_BLUE_CONCRETE_SLAB = register("polished_light_blue_concrete_slab", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_BLUE_CONCRETE_STAIRS = register("polished_light_blue_concrete_stairs", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_BLUE_CONCRETE_WALL = register("polished_light_blue_concrete_wall", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_BLUE_CONCRETE_GATE = register("polished_light_blue_concrete_gate", new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final Item SMOOTH_LIGHT_BLUE_CONCRETE = register("smooth_light_blue_concrete", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIGHT_BLUE_CONCRETE_SLAB = register("smooth_light_blue_concrete_slab", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIGHT_BLUE_CONCRETE_STAIRS = register("smooth_light_blue_concrete_stairs", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIGHT_BLUE_CONCRETE_WALL = register("smooth_light_blue_concrete_wall", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIGHT_BLUE_CONCRETE_GATE = register("smooth_light_blue_concrete_gate", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final Item LIGHT_BLUE_CONCRETE_BRICKS = register("light_blue_concrete_bricks", new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_CONCRETE_BRICK_SLAB = register("light_blue_concrete_brick_slab", new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_CONCRETE_BRICK_STAIRS = register("light_blue_concrete_brick_stairs", new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_CONCRETE_BRICK_WALL = register("light_blue_concrete_brick_wall", new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_CONCRETE_BRICK_GATE = register("light_blue_concrete_brick_gate", new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final Item CUT_LIGHT_BLUE_CONCRETE = register("cut_light_blue_concrete", new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIGHT_BLUE_CONCRETE_SLAB = register("cut_light_blue_concrete_slab", new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIGHT_BLUE_CONCRETE_STAIRS = register("cut_light_blue_concrete_stairs", new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIGHT_BLUE_CONCRETE_WALL = register("cut_light_blue_concrete_wall", new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIGHT_BLUE_CONCRETE_GATE = register("cut_light_blue_concrete_gate", new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final Item LIGHT_BLUE_CONCRETE_TILES = register("light_blue_concrete_tiles", new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_CONCRETE_TILE_SLAB = register("light_blue_concrete_tile_slab", new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_CONCRETE_TILE_STAIRS = register("light_blue_concrete_tile_stairs", new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_CONCRETE_TILE_WALL = register("light_blue_concrete_tile_wall", new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_CONCRETE_TILE_GATE = register("light_blue_concrete_tile_gate", new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final Item LIGHT_BLUE_CONCRETE_PILLAR = register("light_blue_concrete_pillar", new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_CONCRETE_CORNER_PILLAR = register("light_blue_concrete_corner_pillar", new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final Item CHISELED_LIGHT_BLUE_CONCRETE = register("chiseled_light_blue_concrete", new BlockItem(CPlusBlocks.CHISELED_LIGHT_BLUE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final Item CARVED_LIGHT_BLUE_CONCRETE = register("carved_light_blue_concrete", new BlockItem(CPlusBlocks.CARVED_LIGHT_BLUE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// PURPLE CONCRETE

	// Base
	public static final Item PURPLE_CONCRETE_SLAB = register("purple_concrete_slab", new BlockItem(CPlusBlocks.PURPLE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_CONCRETE_STAIRS = register("purple_concrete_stairs", new BlockItem(CPlusBlocks.PURPLE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_CONCRETE_WALL = register("purple_concrete_wall", new BlockItem(CPlusBlocks.PURPLE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_CONCRETE_GATE = register("purple_concrete_gate", new BlockItem(CPlusBlocks.PURPLE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final Item POLISHED_PURPLE_CONCRETE = register("polished_purple_concrete", new BlockItem(CPlusBlocks.POLISHED_PURPLE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PURPLE_CONCRETE_SLAB = register("polished_purple_concrete_slab", new BlockItem(CPlusBlocks.POLISHED_PURPLE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PURPLE_CONCRETE_STAIRS = register("polished_purple_concrete_stairs", new BlockItem(CPlusBlocks.POLISHED_PURPLE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PURPLE_CONCRETE_WALL = register("polished_purple_concrete_wall", new BlockItem(CPlusBlocks.POLISHED_PURPLE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PURPLE_CONCRETE_GATE = register("polished_purple_concrete_gate", new BlockItem(CPlusBlocks.POLISHED_PURPLE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final Item SMOOTH_PURPLE_CONCRETE = register("smooth_purple_concrete", new BlockItem(CPlusBlocks.SMOOTH_PURPLE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_PURPLE_CONCRETE_SLAB = register("smooth_purple_concrete_slab", new BlockItem(CPlusBlocks.SMOOTH_PURPLE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_PURPLE_CONCRETE_STAIRS = register("smooth_purple_concrete_stairs", new BlockItem(CPlusBlocks.SMOOTH_PURPLE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_PURPLE_CONCRETE_WALL = register("smooth_purple_concrete_wall", new BlockItem(CPlusBlocks.SMOOTH_PURPLE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_PURPLE_CONCRETE_GATE = register("smooth_purple_concrete_gate", new BlockItem(CPlusBlocks.SMOOTH_PURPLE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final Item PURPLE_CONCRETE_BRICKS = register("purple_concrete_bricks", new BlockItem(CPlusBlocks.PURPLE_CONCRETE_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_CONCRETE_BRICK_SLAB = register("purple_concrete_brick_slab", new BlockItem(CPlusBlocks.PURPLE_CONCRETE_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_CONCRETE_BRICK_STAIRS = register("purple_concrete_brick_stairs", new BlockItem(CPlusBlocks.PURPLE_CONCRETE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_CONCRETE_BRICK_WALL = register("purple_concrete_brick_wall", new BlockItem(CPlusBlocks.PURPLE_CONCRETE_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_CONCRETE_BRICK_GATE = register("purple_concrete_brick_gate", new BlockItem(CPlusBlocks.PURPLE_CONCRETE_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final Item CUT_PURPLE_CONCRETE = register("cut_purple_concrete", new BlockItem(CPlusBlocks.CUT_PURPLE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_PURPLE_CONCRETE_SLAB = register("cut_purple_concrete_slab", new BlockItem(CPlusBlocks.CUT_PURPLE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_PURPLE_CONCRETE_STAIRS = register("cut_purple_concrete_stairs", new BlockItem(CPlusBlocks.CUT_PURPLE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_PURPLE_CONCRETE_WALL = register("cut_purple_concrete_wall", new BlockItem(CPlusBlocks.CUT_PURPLE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_PURPLE_CONCRETE_GATE = register("cut_purple_concrete_gate", new BlockItem(CPlusBlocks.CUT_PURPLE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final Item PURPLE_CONCRETE_TILES = register("purple_concrete_tiles", new BlockItem(CPlusBlocks.PURPLE_CONCRETE_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_CONCRETE_TILE_SLAB = register("purple_concrete_tile_slab", new BlockItem(CPlusBlocks.PURPLE_CONCRETE_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_CONCRETE_TILE_STAIRS = register("purple_concrete_tile_stairs", new BlockItem(CPlusBlocks.PURPLE_CONCRETE_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_CONCRETE_TILE_WALL = register("purple_concrete_tile_wall", new BlockItem(CPlusBlocks.PURPLE_CONCRETE_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_CONCRETE_TILE_GATE = register("purple_concrete_tile_gate", new BlockItem(CPlusBlocks.PURPLE_CONCRETE_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final Item PURPLE_CONCRETE_PILLAR = register("purple_concrete_pillar", new BlockItem(CPlusBlocks.PURPLE_CONCRETE_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_CONCRETE_CORNER_PILLAR = register("purple_concrete_corner_pillar", new BlockItem(CPlusBlocks.PURPLE_CONCRETE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final Item CHISELED_PURPLE_CONCRETE = register("chiseled_purple_concrete", new BlockItem(CPlusBlocks.CHISELED_PURPLE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final Item CARVED_PURPLE_CONCRETE = register("carved_purple_concrete", new BlockItem(CPlusBlocks.CARVED_PURPLE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// MAGENTA CONCRETE

	// Base
	public static final Item MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab", new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_CONCRETE_STAIRS = register("magenta_concrete_stairs", new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_CONCRETE_WALL = register("magenta_concrete_wall", new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_CONCRETE_GATE = register("magenta_concrete_gate", new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final Item POLISHED_MAGENTA_CONCRETE = register("polished_magenta_concrete", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_MAGENTA_CONCRETE_SLAB = register("polished_magenta_concrete_slab", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_MAGENTA_CONCRETE_STAIRS = register("polished_magenta_concrete_stairs", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_MAGENTA_CONCRETE_WALL = register("polished_magenta_concrete_wall", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_MAGENTA_CONCRETE_GATE = register("polished_magenta_concrete_gate", new BlockItem(CPlusBlocks.POLISHED_MAGENTA_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final Item SMOOTH_MAGENTA_CONCRETE = register("smooth_magenta_concrete", new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_MAGENTA_CONCRETE_SLAB = register("smooth_magenta_concrete_slab", new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_MAGENTA_CONCRETE_STAIRS = register("smooth_magenta_concrete_stairs", new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_MAGENTA_CONCRETE_WALL = register("smooth_magenta_concrete_wall", new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_MAGENTA_CONCRETE_GATE = register("smooth_magenta_concrete_gate", new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final Item MAGENTA_CONCRETE_BRICKS = register("magenta_concrete_bricks", new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_CONCRETE_BRICK_SLAB = register("magenta_concrete_brick_slab", new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_CONCRETE_BRICK_STAIRS = register("magenta_concrete_brick_stairs", new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_CONCRETE_BRICK_WALL = register("magenta_concrete_brick_wall", new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_CONCRETE_BRICK_GATE = register("magenta_concrete_brick_gate", new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final Item CUT_MAGENTA_CONCRETE = register("cut_magenta_concrete", new BlockItem(CPlusBlocks.CUT_MAGENTA_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_MAGENTA_CONCRETE_SLAB = register("cut_magenta_concrete_slab", new BlockItem(CPlusBlocks.CUT_MAGENTA_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_MAGENTA_CONCRETE_STAIRS = register("cut_magenta_concrete_stairs", new BlockItem(CPlusBlocks.CUT_MAGENTA_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_MAGENTA_CONCRETE_WALL = register("cut_magenta_concrete_wall", new BlockItem(CPlusBlocks.CUT_MAGENTA_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_MAGENTA_CONCRETE_GATE = register("cut_magenta_concrete_gate", new BlockItem(CPlusBlocks.CUT_MAGENTA_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final Item MAGENTA_CONCRETE_TILES = register("magenta_concrete_tiles", new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_CONCRETE_TILE_SLAB = register("magenta_concrete_tile_slab", new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_CONCRETE_TILE_STAIRS = register("magenta_concrete_tile_stairs", new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_CONCRETE_TILE_WALL = register("magenta_concrete_tile_wall", new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_CONCRETE_TILE_GATE = register("magenta_concrete_tile_gate", new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final Item MAGENTA_CONCRETE_PILLAR = register("magenta_concrete_pillar", new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_CONCRETE_CORNER_PILLAR = register("magenta_concrete_corner_pillar", new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final Item CHISELED_MAGENTA_CONCRETE = register("chiseled_magenta_concrete", new BlockItem(CPlusBlocks.CHISELED_MAGENTA_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final Item CARVED_MAGENTA_CONCRETE = register("carved_magenta_concrete", new BlockItem(CPlusBlocks.CARVED_MAGENTA_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// PINK CONCRETE

	// Base
	public static final Item PINK_CONCRETE_SLAB = register("pink_concrete_slab", new BlockItem(CPlusBlocks.PINK_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_CONCRETE_STAIRS = register("pink_concrete_stairs", new BlockItem(CPlusBlocks.PINK_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_CONCRETE_WALL = register("pink_concrete_wall", new BlockItem(CPlusBlocks.PINK_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_CONCRETE_GATE = register("pink_concrete_gate", new BlockItem(CPlusBlocks.PINK_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final Item POLISHED_PINK_CONCRETE = register("polished_pink_concrete", new BlockItem(CPlusBlocks.POLISHED_PINK_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PINK_CONCRETE_SLAB = register("polished_pink_concrete_slab", new BlockItem(CPlusBlocks.POLISHED_PINK_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PINK_CONCRETE_STAIRS = register("polished_pink_concrete_stairs", new BlockItem(CPlusBlocks.POLISHED_PINK_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PINK_CONCRETE_WALL = register("polished_pink_concrete_wall", new BlockItem(CPlusBlocks.POLISHED_PINK_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_PINK_CONCRETE_GATE = register("polished_pink_concrete_gate", new BlockItem(CPlusBlocks.POLISHED_PINK_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final Item SMOOTH_PINK_CONCRETE = register("smooth_pink_concrete", new BlockItem(CPlusBlocks.SMOOTH_PINK_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_PINK_CONCRETE_SLAB = register("smooth_pink_concrete_slab", new BlockItem(CPlusBlocks.SMOOTH_PINK_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_PINK_CONCRETE_STAIRS = register("smooth_pink_concrete_stairs", new BlockItem(CPlusBlocks.SMOOTH_PINK_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_PINK_CONCRETE_WALL = register("smooth_pink_concrete_wall", new BlockItem(CPlusBlocks.SMOOTH_PINK_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_PINK_CONCRETE_GATE = register("smooth_pink_concrete_gate", new BlockItem(CPlusBlocks.SMOOTH_PINK_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final Item PINK_CONCRETE_BRICKS = register("pink_concrete_bricks", new BlockItem(CPlusBlocks.PINK_CONCRETE_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_CONCRETE_BRICK_SLAB = register("pink_concrete_brick_slab", new BlockItem(CPlusBlocks.PINK_CONCRETE_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_CONCRETE_BRICK_STAIRS = register("pink_concrete_brick_stairs", new BlockItem(CPlusBlocks.PINK_CONCRETE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_CONCRETE_BRICK_WALL = register("pink_concrete_brick_wall", new BlockItem(CPlusBlocks.PINK_CONCRETE_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_CONCRETE_BRICK_GATE = register("pink_concrete_brick_gate", new BlockItem(CPlusBlocks.PINK_CONCRETE_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final Item CUT_PINK_CONCRETE = register("cut_pink_concrete", new BlockItem(CPlusBlocks.CUT_PINK_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_PINK_CONCRETE_SLAB = register("cut_pink_concrete_slab", new BlockItem(CPlusBlocks.CUT_PINK_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_PINK_CONCRETE_STAIRS = register("cut_pink_concrete_stairs", new BlockItem(CPlusBlocks.CUT_PINK_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_PINK_CONCRETE_WALL = register("cut_pink_concrete_wall", new BlockItem(CPlusBlocks.CUT_PINK_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_PINK_CONCRETE_GATE = register("cut_pink_concrete_gate", new BlockItem(CPlusBlocks.CUT_PINK_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final Item PINK_CONCRETE_TILES = register("pink_concrete_tiles", new BlockItem(CPlusBlocks.PINK_CONCRETE_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_CONCRETE_TILE_SLAB = register("pink_concrete_tile_slab", new BlockItem(CPlusBlocks.PINK_CONCRETE_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_CONCRETE_TILE_STAIRS = register("pink_concrete_tile_stairs", new BlockItem(CPlusBlocks.PINK_CONCRETE_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_CONCRETE_TILE_WALL = register("pink_concrete_tile_wall", new BlockItem(CPlusBlocks.PINK_CONCRETE_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_CONCRETE_TILE_GATE = register("pink_concrete_tile_gate", new BlockItem(CPlusBlocks.PINK_CONCRETE_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final Item PINK_CONCRETE_PILLAR = register("pink_concrete_pillar", new BlockItem(CPlusBlocks.PINK_CONCRETE_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_CONCRETE_CORNER_PILLAR = register("pink_concrete_corner_pillar", new BlockItem(CPlusBlocks.PINK_CONCRETE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final Item CHISELED_PINK_CONCRETE = register("chiseled_pink_concrete", new BlockItem(CPlusBlocks.CHISELED_PINK_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final Item CARVED_PINK_CONCRETE = register("carved_pink_concrete", new BlockItem(CPlusBlocks.CARVED_PINK_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// WHITE CONCRETE

	// Base
	public static final Item WHITE_CONCRETE_SLAB = register("white_concrete_slab", new BlockItem(CPlusBlocks.WHITE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_CONCRETE_STAIRS = register("white_concrete_stairs", new BlockItem(CPlusBlocks.WHITE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_CONCRETE_WALL = register("white_concrete_wall", new BlockItem(CPlusBlocks.WHITE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_CONCRETE_GATE = register("white_concrete_gate", new BlockItem(CPlusBlocks.WHITE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final Item POLISHED_WHITE_CONCRETE = register("polished_white_concrete", new BlockItem(CPlusBlocks.POLISHED_WHITE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_WHITE_CONCRETE_SLAB = register("polished_white_concrete_slab", new BlockItem(CPlusBlocks.POLISHED_WHITE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_WHITE_CONCRETE_STAIRS = register("polished_white_concrete_stairs", new BlockItem(CPlusBlocks.POLISHED_WHITE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_WHITE_CONCRETE_WALL = register("polished_white_concrete_wall", new BlockItem(CPlusBlocks.POLISHED_WHITE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_WHITE_CONCRETE_GATE = register("polished_white_concrete_gate", new BlockItem(CPlusBlocks.POLISHED_WHITE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final Item SMOOTH_WHITE_CONCRETE = register("smooth_white_concrete", new BlockItem(CPlusBlocks.SMOOTH_WHITE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_WHITE_CONCRETE_SLAB = register("smooth_white_concrete_slab", new BlockItem(CPlusBlocks.SMOOTH_WHITE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_WHITE_CONCRETE_STAIRS = register("smooth_white_concrete_stairs", new BlockItem(CPlusBlocks.SMOOTH_WHITE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_WHITE_CONCRETE_WALL = register("smooth_white_concrete_wall", new BlockItem(CPlusBlocks.SMOOTH_WHITE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_WHITE_CONCRETE_GATE = register("smooth_white_concrete_gate", new BlockItem(CPlusBlocks.SMOOTH_WHITE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final Item WHITE_CONCRETE_BRICKS = register("white_concrete_bricks", new BlockItem(CPlusBlocks.WHITE_CONCRETE_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_CONCRETE_BRICK_SLAB = register("white_concrete_brick_slab", new BlockItem(CPlusBlocks.WHITE_CONCRETE_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_CONCRETE_BRICK_STAIRS = register("white_concrete_brick_stairs", new BlockItem(CPlusBlocks.WHITE_CONCRETE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_CONCRETE_BRICK_WALL = register("white_concrete_brick_wall", new BlockItem(CPlusBlocks.WHITE_CONCRETE_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_CONCRETE_BRICK_GATE = register("white_concrete_brick_gate", new BlockItem(CPlusBlocks.WHITE_CONCRETE_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final Item CUT_WHITE_CONCRETE = register("cut_white_concrete", new BlockItem(CPlusBlocks.CUT_WHITE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_WHITE_CONCRETE_SLAB = register("cut_white_concrete_slab", new BlockItem(CPlusBlocks.CUT_WHITE_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_WHITE_CONCRETE_STAIRS = register("cut_white_concrete_stairs", new BlockItem(CPlusBlocks.CUT_WHITE_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_WHITE_CONCRETE_WALL = register("cut_white_concrete_wall", new BlockItem(CPlusBlocks.CUT_WHITE_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_WHITE_CONCRETE_GATE = register("cut_white_concrete_gate", new BlockItem(CPlusBlocks.CUT_WHITE_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final Item WHITE_CONCRETE_TILES = register("white_concrete_tiles", new BlockItem(CPlusBlocks.WHITE_CONCRETE_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_CONCRETE_TILE_SLAB = register("white_concrete_tile_slab", new BlockItem(CPlusBlocks.WHITE_CONCRETE_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_CONCRETE_TILE_STAIRS = register("white_concrete_tile_stairs", new BlockItem(CPlusBlocks.WHITE_CONCRETE_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_CONCRETE_TILE_WALL = register("white_concrete_tile_wall", new BlockItem(CPlusBlocks.WHITE_CONCRETE_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_CONCRETE_TILE_GATE = register("white_concrete_tile_gate", new BlockItem(CPlusBlocks.WHITE_CONCRETE_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final Item WHITE_CONCRETE_PILLAR = register("white_concrete_pillar", new BlockItem(CPlusBlocks.WHITE_CONCRETE_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_CONCRETE_CORNER_PILLAR = register("white_concrete_corner_pillar", new BlockItem(CPlusBlocks.WHITE_CONCRETE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final Item CHISELED_WHITE_CONCRETE = register("chiseled_white_concrete", new BlockItem(CPlusBlocks.CHISELED_WHITE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final Item CARVED_WHITE_CONCRETE = register("carved_white_concrete", new BlockItem(CPlusBlocks.CARVED_WHITE_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// LIGHT GRAY CONCRETE

	// Base
	public static final Item LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab", new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_CONCRETE_STAIRS = register("light_gray_concrete_stairs", new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_CONCRETE_WALL = register("light_gray_concrete_wall", new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_CONCRETE_GATE = register("light_gray_concrete_gate", new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final Item POLISHED_LIGHT_GRAY_CONCRETE = register("polished_light_gray_concrete", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_GRAY_CONCRETE_SLAB = register("polished_light_gray_concrete_slab", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_GRAY_CONCRETE_STAIRS = register("polished_light_gray_concrete_stairs", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_GRAY_CONCRETE_WALL = register("polished_light_gray_concrete_wall", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_LIGHT_GRAY_CONCRETE_GATE = register("polished_light_gray_concrete_gate", new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final Item SMOOTH_LIGHT_GRAY_CONCRETE = register("smooth_light_gray_concrete", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIGHT_GRAY_CONCRETE_SLAB = register("smooth_light_gray_concrete_slab", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIGHT_GRAY_CONCRETE_STAIRS = register("smooth_light_gray_concrete_stairs", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIGHT_GRAY_CONCRETE_WALL = register("smooth_light_gray_concrete_wall", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_LIGHT_GRAY_CONCRETE_GATE = register("smooth_light_gray_concrete_gate", new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final Item LIGHT_GRAY_CONCRETE_BRICKS = register("light_gray_concrete_bricks", new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_CONCRETE_BRICK_SLAB = register("light_gray_concrete_brick_slab", new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_CONCRETE_BRICK_STAIRS = register("light_gray_concrete_brick_stairs", new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_CONCRETE_BRICK_WALL = register("light_gray_concrete_brick_wall", new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_CONCRETE_BRICK_GATE = register("light_gray_concrete_brick_gate", new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final Item CUT_LIGHT_GRAY_CONCRETE = register("cut_light_gray_concrete", new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIGHT_GRAY_CONCRETE_SLAB = register("cut_light_gray_concrete_slab", new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIGHT_GRAY_CONCRETE_STAIRS = register("cut_light_gray_concrete_stairs", new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIGHT_GRAY_CONCRETE_WALL = register("cut_light_gray_concrete_wall", new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_LIGHT_GRAY_CONCRETE_GATE = register("cut_light_gray_concrete_gate", new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final Item LIGHT_GRAY_CONCRETE_TILES = register("light_gray_concrete_tiles", new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_CONCRETE_TILE_SLAB = register("light_gray_concrete_tile_slab", new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_CONCRETE_TILE_STAIRS = register("light_gray_concrete_tile_stairs", new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_CONCRETE_TILE_WALL = register("light_gray_concrete_tile_wall", new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_CONCRETE_TILE_GATE = register("light_gray_concrete_tile_gate", new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final Item LIGHT_GRAY_CONCRETE_PILLAR = register("light_gray_concrete_pillar", new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_CONCRETE_CORNER_PILLAR = register("light_gray_concrete_corner_pillar", new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final Item CHISELED_LIGHT_GRAY_CONCRETE = register("chiseled_light_gray_concrete", new BlockItem(CPlusBlocks.CHISELED_LIGHT_GRAY_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final Item CARVED_LIGHT_GRAY_CONCRETE = register("carved_light_gray_concrete", new BlockItem(CPlusBlocks.CARVED_LIGHT_GRAY_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// GRAY CONCRETE

	// Base
	public static final Item GRAY_CONCRETE_SLAB = register("gray_concrete_slab", new BlockItem(CPlusBlocks.GRAY_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_CONCRETE_STAIRS = register("gray_concrete_stairs", new BlockItem(CPlusBlocks.GRAY_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_CONCRETE_WALL = register("gray_concrete_wall", new BlockItem(CPlusBlocks.GRAY_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_CONCRETE_GATE = register("gray_concrete_gate", new BlockItem(CPlusBlocks.GRAY_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final Item POLISHED_GRAY_CONCRETE = register("polished_gray_concrete", new BlockItem(CPlusBlocks.POLISHED_GRAY_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GRAY_CONCRETE_SLAB = register("polished_gray_concrete_slab", new BlockItem(CPlusBlocks.POLISHED_GRAY_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GRAY_CONCRETE_STAIRS = register("polished_gray_concrete_stairs", new BlockItem(CPlusBlocks.POLISHED_GRAY_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GRAY_CONCRETE_WALL = register("polished_gray_concrete_wall", new BlockItem(CPlusBlocks.POLISHED_GRAY_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_GRAY_CONCRETE_GATE = register("polished_gray_concrete_gate", new BlockItem(CPlusBlocks.POLISHED_GRAY_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final Item SMOOTH_GRAY_CONCRETE = register("smooth_gray_concrete", new BlockItem(CPlusBlocks.SMOOTH_GRAY_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_GRAY_CONCRETE_SLAB = register("smooth_gray_concrete_slab", new BlockItem(CPlusBlocks.SMOOTH_GRAY_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_GRAY_CONCRETE_STAIRS = register("smooth_gray_concrete_stairs", new BlockItem(CPlusBlocks.SMOOTH_GRAY_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_GRAY_CONCRETE_WALL = register("smooth_gray_concrete_wall", new BlockItem(CPlusBlocks.SMOOTH_GRAY_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_GRAY_CONCRETE_GATE = register("smooth_gray_concrete_gate", new BlockItem(CPlusBlocks.SMOOTH_GRAY_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final Item GRAY_CONCRETE_BRICKS = register("gray_concrete_bricks", new BlockItem(CPlusBlocks.GRAY_CONCRETE_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_CONCRETE_BRICK_SLAB = register("gray_concrete_brick_slab", new BlockItem(CPlusBlocks.GRAY_CONCRETE_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_CONCRETE_BRICK_STAIRS = register("gray_concrete_brick_stairs", new BlockItem(CPlusBlocks.GRAY_CONCRETE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_CONCRETE_BRICK_WALL = register("gray_concrete_brick_wall", new BlockItem(CPlusBlocks.GRAY_CONCRETE_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_CONCRETE_BRICK_GATE = register("gray_concrete_brick_gate", new BlockItem(CPlusBlocks.GRAY_CONCRETE_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final Item CUT_GRAY_CONCRETE = register("cut_gray_concrete", new BlockItem(CPlusBlocks.CUT_GRAY_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_GRAY_CONCRETE_SLAB = register("cut_gray_concrete_slab", new BlockItem(CPlusBlocks.CUT_GRAY_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_GRAY_CONCRETE_STAIRS = register("cut_gray_concrete_stairs", new BlockItem(CPlusBlocks.CUT_GRAY_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_GRAY_CONCRETE_WALL = register("cut_gray_concrete_wall", new BlockItem(CPlusBlocks.CUT_GRAY_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_GRAY_CONCRETE_GATE = register("cut_gray_concrete_gate", new BlockItem(CPlusBlocks.CUT_GRAY_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final Item GRAY_CONCRETE_TILES = register("gray_concrete_tiles", new BlockItem(CPlusBlocks.GRAY_CONCRETE_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_CONCRETE_TILE_SLAB = register("gray_concrete_tile_slab", new BlockItem(CPlusBlocks.GRAY_CONCRETE_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_CONCRETE_TILE_STAIRS = register("gray_concrete_tile_stairs", new BlockItem(CPlusBlocks.GRAY_CONCRETE_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_CONCRETE_TILE_WALL = register("gray_concrete_tile_wall", new BlockItem(CPlusBlocks.GRAY_CONCRETE_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_CONCRETE_TILE_GATE = register("gray_concrete_tile_gate", new BlockItem(CPlusBlocks.GRAY_CONCRETE_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final Item GRAY_CONCRETE_PILLAR = register("gray_concrete_pillar", new BlockItem(CPlusBlocks.GRAY_CONCRETE_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_CONCRETE_CORNER_PILLAR = register("gray_concrete_corner_pillar", new BlockItem(CPlusBlocks.GRAY_CONCRETE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final Item CHISELED_GRAY_CONCRETE = register("chiseled_gray_concrete", new BlockItem(CPlusBlocks.CHISELED_GRAY_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final Item CARVED_GRAY_CONCRETE = register("carved_gray_concrete", new BlockItem(CPlusBlocks.CARVED_GRAY_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// BLACK CONCRETE

	// Base
	public static final Item BLACK_CONCRETE_SLAB = register("black_concrete_slab", new BlockItem(CPlusBlocks.BLACK_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_CONCRETE_STAIRS = register("black_concrete_stairs", new BlockItem(CPlusBlocks.BLACK_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_CONCRETE_WALL = register("black_concrete_wall", new BlockItem(CPlusBlocks.BLACK_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_CONCRETE_GATE = register("black_concrete_gate", new BlockItem(CPlusBlocks.BLACK_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final Item POLISHED_BLACK_CONCRETE = register("polished_black_concrete", new BlockItem(CPlusBlocks.POLISHED_BLACK_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLACK_CONCRETE_SLAB = register("polished_black_concrete_slab", new BlockItem(CPlusBlocks.POLISHED_BLACK_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLACK_CONCRETE_STAIRS = register("polished_black_concrete_stairs", new BlockItem(CPlusBlocks.POLISHED_BLACK_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLACK_CONCRETE_WALL = register("polished_black_concrete_wall", new BlockItem(CPlusBlocks.POLISHED_BLACK_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BLACK_CONCRETE_GATE = register("polished_black_concrete_gate", new BlockItem(CPlusBlocks.POLISHED_BLACK_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final Item SMOOTH_BLACK_CONCRETE = register("smooth_black_concrete", new BlockItem(CPlusBlocks.SMOOTH_BLACK_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BLACK_CONCRETE_SLAB = register("smooth_black_concrete_slab", new BlockItem(CPlusBlocks.SMOOTH_BLACK_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BLACK_CONCRETE_STAIRS = register("smooth_black_concrete_stairs", new BlockItem(CPlusBlocks.SMOOTH_BLACK_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BLACK_CONCRETE_WALL = register("smooth_black_concrete_wall", new BlockItem(CPlusBlocks.SMOOTH_BLACK_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BLACK_CONCRETE_GATE = register("smooth_black_concrete_gate", new BlockItem(CPlusBlocks.SMOOTH_BLACK_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final Item BLACK_CONCRETE_BRICKS = register("black_concrete_bricks", new BlockItem(CPlusBlocks.BLACK_CONCRETE_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_CONCRETE_BRICK_SLAB = register("black_concrete_brick_slab", new BlockItem(CPlusBlocks.BLACK_CONCRETE_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_CONCRETE_BRICK_STAIRS = register("black_concrete_brick_stairs", new BlockItem(CPlusBlocks.BLACK_CONCRETE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_CONCRETE_BRICK_WALL = register("black_concrete_brick_wall", new BlockItem(CPlusBlocks.BLACK_CONCRETE_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_CONCRETE_BRICK_GATE = register("black_concrete_brick_gate", new BlockItem(CPlusBlocks.BLACK_CONCRETE_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final Item CUT_BLACK_CONCRETE = register("cut_black_concrete", new BlockItem(CPlusBlocks.CUT_BLACK_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BLACK_CONCRETE_SLAB = register("cut_black_concrete_slab", new BlockItem(CPlusBlocks.CUT_BLACK_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BLACK_CONCRETE_STAIRS = register("cut_black_concrete_stairs", new BlockItem(CPlusBlocks.CUT_BLACK_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BLACK_CONCRETE_WALL = register("cut_black_concrete_wall", new BlockItem(CPlusBlocks.CUT_BLACK_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BLACK_CONCRETE_GATE = register("cut_black_concrete_gate", new BlockItem(CPlusBlocks.CUT_BLACK_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final Item BLACK_CONCRETE_TILES = register("black_concrete_tiles", new BlockItem(CPlusBlocks.BLACK_CONCRETE_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_CONCRETE_TILE_SLAB = register("black_concrete_tile_slab", new BlockItem(CPlusBlocks.BLACK_CONCRETE_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_CONCRETE_TILE_STAIRS = register("black_concrete_tile_stairs", new BlockItem(CPlusBlocks.BLACK_CONCRETE_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_CONCRETE_TILE_WALL = register("black_concrete_tile_wall", new BlockItem(CPlusBlocks.BLACK_CONCRETE_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_CONCRETE_TILE_GATE = register("black_concrete_tile_gate", new BlockItem(CPlusBlocks.BLACK_CONCRETE_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final Item BLACK_CONCRETE_PILLAR = register("black_concrete_pillar", new BlockItem(CPlusBlocks.BLACK_CONCRETE_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_CONCRETE_CORNER_PILLAR = register("black_concrete_corner_pillar", new BlockItem(CPlusBlocks.BLACK_CONCRETE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final Item CHISELED_BLACK_CONCRETE = register("chiseled_black_concrete", new BlockItem(CPlusBlocks.CHISELED_BLACK_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final Item CARVED_BLACK_CONCRETE = register("carved_black_concrete", new BlockItem(CPlusBlocks.CARVED_BLACK_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// BROWN CONCRETE

	// Base
	public static final Item BROWN_CONCRETE_SLAB = register("brown_concrete_slab", new BlockItem(CPlusBlocks.BROWN_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_CONCRETE_STAIRS = register("brown_concrete_stairs", new BlockItem(CPlusBlocks.BROWN_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_CONCRETE_WALL = register("brown_concrete_wall", new BlockItem(CPlusBlocks.BROWN_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_CONCRETE_GATE = register("brown_concrete_gate", new BlockItem(CPlusBlocks.BROWN_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final Item POLISHED_BROWN_CONCRETE = register("polished_brown_concrete", new BlockItem(CPlusBlocks.POLISHED_BROWN_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BROWN_CONCRETE_SLAB = register("polished_brown_concrete_slab", new BlockItem(CPlusBlocks.POLISHED_BROWN_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BROWN_CONCRETE_STAIRS = register("polished_brown_concrete_stairs", new BlockItem(CPlusBlocks.POLISHED_BROWN_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BROWN_CONCRETE_WALL = register("polished_brown_concrete_wall", new BlockItem(CPlusBlocks.POLISHED_BROWN_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item POLISHED_BROWN_CONCRETE_GATE = register("polished_brown_concrete_gate", new BlockItem(CPlusBlocks.POLISHED_BROWN_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final Item SMOOTH_BROWN_CONCRETE = register("smooth_brown_concrete", new BlockItem(CPlusBlocks.SMOOTH_BROWN_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BROWN_CONCRETE_SLAB = register("smooth_brown_concrete_slab", new BlockItem(CPlusBlocks.SMOOTH_BROWN_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BROWN_CONCRETE_STAIRS = register("smooth_brown_concrete_stairs", new BlockItem(CPlusBlocks.SMOOTH_BROWN_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BROWN_CONCRETE_WALL = register("smooth_brown_concrete_wall", new BlockItem(CPlusBlocks.SMOOTH_BROWN_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SMOOTH_BROWN_CONCRETE_GATE = register("smooth_brown_concrete_gate", new BlockItem(CPlusBlocks.SMOOTH_BROWN_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final Item BROWN_CONCRETE_BRICKS = register("brown_concrete_bricks", new BlockItem(CPlusBlocks.BROWN_CONCRETE_BRICKS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_CONCRETE_BRICK_SLAB = register("brown_concrete_brick_slab", new BlockItem(CPlusBlocks.BROWN_CONCRETE_BRICK_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_CONCRETE_BRICK_STAIRS = register("brown_concrete_brick_stairs", new BlockItem(CPlusBlocks.BROWN_CONCRETE_BRICK_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_CONCRETE_BRICK_WALL = register("brown_concrete_brick_wall", new BlockItem(CPlusBlocks.BROWN_CONCRETE_BRICK_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_CONCRETE_BRICK_GATE = register("brown_concrete_brick_gate", new BlockItem(CPlusBlocks.BROWN_CONCRETE_BRICK_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final Item CUT_BROWN_CONCRETE = register("cut_brown_concrete", new BlockItem(CPlusBlocks.CUT_BROWN_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BROWN_CONCRETE_SLAB = register("cut_brown_concrete_slab", new BlockItem(CPlusBlocks.CUT_BROWN_CONCRETE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BROWN_CONCRETE_STAIRS = register("cut_brown_concrete_stairs", new BlockItem(CPlusBlocks.CUT_BROWN_CONCRETE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BROWN_CONCRETE_WALL = register("cut_brown_concrete_wall", new BlockItem(CPlusBlocks.CUT_BROWN_CONCRETE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CUT_BROWN_CONCRETE_GATE = register("cut_brown_concrete_gate", new BlockItem(CPlusBlocks.CUT_BROWN_CONCRETE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final Item BROWN_CONCRETE_TILES = register("brown_concrete_tiles", new BlockItem(CPlusBlocks.BROWN_CONCRETE_TILES, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_CONCRETE_TILE_SLAB = register("brown_concrete_tile_slab", new BlockItem(CPlusBlocks.BROWN_CONCRETE_TILE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_CONCRETE_TILE_STAIRS = register("brown_concrete_tile_stairs", new BlockItem(CPlusBlocks.BROWN_CONCRETE_TILE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_CONCRETE_TILE_WALL = register("brown_concrete_tile_wall", new BlockItem(CPlusBlocks.BROWN_CONCRETE_TILE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_CONCRETE_TILE_GATE = register("brown_concrete_tile_gate", new BlockItem(CPlusBlocks.BROWN_CONCRETE_TILE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final Item BROWN_CONCRETE_PILLAR = register("brown_concrete_pillar", new BlockItem(CPlusBlocks.BROWN_CONCRETE_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_CONCRETE_CORNER_PILLAR = register("brown_concrete_corner_pillar", new BlockItem(CPlusBlocks.BROWN_CONCRETE_CORNER_PILLAR, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final Item CHISELED_BROWN_CONCRETE = register("chiseled_brown_concrete", new BlockItem(CPlusBlocks.CHISELED_BROWN_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final Item CARVED_BROWN_CONCRETE = register("carved_brown_concrete", new BlockItem(CPlusBlocks.CARVED_BROWN_CONCRETE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// RED GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// ORANGE GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// YELLOW GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// LIME GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// GREEN GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// BLUE GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// CYAN GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// LIGHT BLUE GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// PURPLE GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// MAGENTA GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// PINK GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// WHITE GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// LIGHT GRAY GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// GRAY GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// BLACK GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// BROWN GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// TINTED GLASS

	// Base

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// RED TINTED GLASS

	// Base
	public static final Item RED_TINTED_GLASS = register("red_tinted_glass", new BlockItem(CPlusBlocks.RED_TINTED_GLASS_BLOCK, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// ORANGE TINTED GLASS

	// Base
	public static final Item ORANGE_TINTED_GLASS = register("orange_tinted_glass", new BlockItem(CPlusBlocks.ORANGE_TINTED_GLASS_BLOCK, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// YELLOW TINTED GLASS

	// Base
	public static final Item YELLOW_TINTED_GLASS = register("yellow_tinted_glass", new BlockItem(CPlusBlocks.YELLOW_TINTED_GLASS_BLOCK, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// LIME TINTED GLASS

	// Base
	public static final Item LIME_TINTED_GLASS = register("lime_tinted_glass", new BlockItem(CPlusBlocks.LIME_TINTED_GLASS_BLOCK, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// GREEN TINTED GLASS

	// Base
	public static final Item GREEN_TINTED_GLASS = register("green_tinted_glass", new BlockItem(CPlusBlocks.GREEN_TINTED_GLASS_BLOCK, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// BLUE TINTED GLASS

	// Base
	public static final Item BLUE_TINTED_GLASS = register("blue_tinted_glass", new BlockItem(CPlusBlocks.BLUE_TINTED_GLASS_BLOCK, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// CYAN TINTED GLASS

	// Base
	public static final Item CYAN_TINTED_GLASS = register("cyan_tinted_glass", new BlockItem(CPlusBlocks.CYAN_TINTED_GLASS_BLOCK, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// LIGHT BLUE TINTED GLASS

	// Base
	public static final Item LIGHT_BLUE_TINTED_GLASS = register("light_blue_tinted_glass", new BlockItem(CPlusBlocks.LIGHT_BLUE_TINTED_GLASS_BLOCK, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// PURPLE TINTED GLASS

	// Base
	public static final Item PURPLE_TINTED_GLASS = register("purple_tinted_glass", new BlockItem(CPlusBlocks.PURPLE_TINTED_GLASS_BLOCK, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// MAGENTA TINTED GLASS

	// Base
	public static final Item MAGENTA_TINTED_GLASS = register("magenta_tinted_glass", new BlockItem(CPlusBlocks.MAGENTA_TINTED_GLASS_BLOCK, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// PINK TINTED GLASS

	// Base
	public static final Item PINK_TINTED_GLASS = register("pink_tinted_glass", new BlockItem(CPlusBlocks.PINK_TINTED_GLASS_BLOCK, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// WHITE TINTED GLASS

	// Base
	public static final Item WHITE_TINTED_GLASS = register("white_tinted_glass", new BlockItem(CPlusBlocks.WHITE_TINTED_GLASS_BLOCK, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// LIGHT GRAY TINTED GLASS

	// Base
	public static final Item LIGHT_GRAY_TINTED_GLASS = register("light_gray_tinted_glass", new BlockItem(CPlusBlocks.LIGHT_GRAY_TINTED_GLASS_BLOCK, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// GRAY TINTED GLASS

	// Base
	public static final Item GRAY_TINTED_GLASS = register("gray_tinted_glass", new BlockItem(CPlusBlocks.GRAY_TINTED_GLASS_BLOCK, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// BLACK TINTED GLASS

	// Base
	public static final Item BLACK_TINTED_GLASS = register("black_tinted_glass", new BlockItem(CPlusBlocks.BLACK_TINTED_GLASS_BLOCK, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// BROWN TINTED GLASS

	// Base
	public static final Item BROWN_TINTED_GLASS = register("brown_tinted_glass", new BlockItem(CPlusBlocks.BROWN_TINTED_GLASS_BLOCK, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished

	// Smooth

	// Bricks

	// Cut

	// Tiles

	// Pillar

	// Chiseled

	// Carved


// GLOWSTONE

	// Base
	public static final Item GLOWSTONE_SLAB = register("glowstone_slab", new BlockItem(CPlusBlocks.GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GLOWSTONE_STAIRS = register("glowstone_stairs", new BlockItem(CPlusBlocks.GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GLOWSTONE_WALL = register("glowstone_wall", new BlockItem(CPlusBlocks.GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GLOWSTONE_GATE = register("glowstone_gate", new BlockItem(CPlusBlocks.GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Red
	public static final Item RED_GLOWSTONE = register("red_glowstone", new BlockItem(CPlusBlocks.RED_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_GLOWSTONE_SLAB = register("red_glowstone_slab", new BlockItem(CPlusBlocks.RED_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_GLOWSTONE_STAIRS = register("red_glowstone_stairs", new BlockItem(CPlusBlocks.RED_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_GLOWSTONE_WALL = register("red_glowstone_wall", new BlockItem(CPlusBlocks.RED_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_GLOWSTONE_GATE = register("red_glowstone_gate", new BlockItem(CPlusBlocks.RED_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Orange
	public static final Item ORANGE_GLOWSTONE = register("orange_glowstone", new BlockItem(CPlusBlocks.ORANGE_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_GLOWSTONE_SLAB = register("orange_glowstone_slab", new BlockItem(CPlusBlocks.ORANGE_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_GLOWSTONE_STAIRS = register("orange_glowstone_stairs", new BlockItem(CPlusBlocks.ORANGE_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_GLOWSTONE_WALL = register("orange_glowstone_wall", new BlockItem(CPlusBlocks.ORANGE_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_GLOWSTONE_GATE = register("orange_glowstone_gate", new BlockItem(CPlusBlocks.ORANGE_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Yellow
	public static final Item YELLOW_GLOWSTONE = register("yellow_glowstone", new BlockItem(CPlusBlocks.YELLOW_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_GLOWSTONE_SLAB = register("yellow_glowstone_slab", new BlockItem(CPlusBlocks.YELLOW_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_GLOWSTONE_STAIRS = register("yellow_glowstone_stairs", new BlockItem(CPlusBlocks.YELLOW_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_GLOWSTONE_WALL = register("yellow_glowstone_wall", new BlockItem(CPlusBlocks.YELLOW_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_GLOWSTONE_GATE = register("yellow_glowstone_gate", new BlockItem(CPlusBlocks.YELLOW_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Lime
	public static final Item LIME_GLOWSTONE = register("lime_glowstone", new BlockItem(CPlusBlocks.LIME_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_GLOWSTONE_SLAB = register("lime_glowstone_slab", new BlockItem(CPlusBlocks.LIME_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_GLOWSTONE_STAIRS = register("lime_glowstone_stairs", new BlockItem(CPlusBlocks.LIME_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_GLOWSTONE_WALL = register("lime_glowstone_wall", new BlockItem(CPlusBlocks.LIME_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_GLOWSTONE_GATE = register("lime_glowstone_gate", new BlockItem(CPlusBlocks.LIME_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Green
	public static final Item GREEN_GLOWSTONE = register("green_glowstone", new BlockItem(CPlusBlocks.GREEN_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_GLOWSTONE_SLAB = register("green_glowstone_slab", new BlockItem(CPlusBlocks.GREEN_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_GLOWSTONE_STAIRS = register("green_glowstone_stairs", new BlockItem(CPlusBlocks.GREEN_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_GLOWSTONE_WALL = register("green_glowstone_wall", new BlockItem(CPlusBlocks.GREEN_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_GLOWSTONE_GATE = register("green_glowstone_gate", new BlockItem(CPlusBlocks.GREEN_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Blue
	public static final Item BLUE_GLOWSTONE = register("blue_glowstone", new BlockItem(CPlusBlocks.BLUE_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_GLOWSTONE_SLAB = register("blue_glowstone_slab", new BlockItem(CPlusBlocks.BLUE_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_GLOWSTONE_STAIRS = register("blue_glowstone_stairs", new BlockItem(CPlusBlocks.BLUE_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_GLOWSTONE_WALL = register("blue_glowstone_wall", new BlockItem(CPlusBlocks.BLUE_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_GLOWSTONE_GATE = register("blue_glowstone_gate", new BlockItem(CPlusBlocks.BLUE_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cyan
	public static final Item CYAN_GLOWSTONE = register("cyan_glowstone", new BlockItem(CPlusBlocks.CYAN_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_GLOWSTONE_SLAB = register("cyan_glowstone_slab", new BlockItem(CPlusBlocks.CYAN_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_GLOWSTONE_STAIRS = register("cyan_glowstone_stairs", new BlockItem(CPlusBlocks.CYAN_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_GLOWSTONE_WALL = register("cyan_glowstone_wall", new BlockItem(CPlusBlocks.CYAN_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_GLOWSTONE_GATE = register("cyan_glowstone_gate", new BlockItem(CPlusBlocks.CYAN_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Blue
	public static final Item LIGHT_BLUE_GLOWSTONE = register("light_blue_glowstone", new BlockItem(CPlusBlocks.LIGHT_BLUE_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_GLOWSTONE_SLAB = register("light_blue_glowstone_slab", new BlockItem(CPlusBlocks.LIGHT_BLUE_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_GLOWSTONE_STAIRS = register("light_blue_glowstone_stairs", new BlockItem(CPlusBlocks.LIGHT_BLUE_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_GLOWSTONE_WALL = register("light_blue_glowstone_wall", new BlockItem(CPlusBlocks.LIGHT_BLUE_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_GLOWSTONE_GATE = register("light_blue_glowstone_gate", new BlockItem(CPlusBlocks.LIGHT_BLUE_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Purple
	public static final Item PURPLE_GLOWSTONE = register("purple_glowstone", new BlockItem(CPlusBlocks.PURPLE_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_GLOWSTONE_SLAB = register("purple_glowstone_slab", new BlockItem(CPlusBlocks.PURPLE_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_GLOWSTONE_STAIRS = register("purple_glowstone_stairs", new BlockItem(CPlusBlocks.PURPLE_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_GLOWSTONE_WALL = register("purple_glowstone_wall", new BlockItem(CPlusBlocks.PURPLE_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_GLOWSTONE_GATE = register("purple_glowstone_gate", new BlockItem(CPlusBlocks.PURPLE_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Magenta
	public static final Item MAGENTA_GLOWSTONE = register("magenta_glowstone", new BlockItem(CPlusBlocks.MAGENTA_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_GLOWSTONE_SLAB = register("magenta_glowstone_slab", new BlockItem(CPlusBlocks.MAGENTA_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_GLOWSTONE_STAIRS = register("magenta_glowstone_stairs", new BlockItem(CPlusBlocks.MAGENTA_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_GLOWSTONE_WALL = register("magenta_glowstone_wall", new BlockItem(CPlusBlocks.MAGENTA_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_GLOWSTONE_GATE = register("magenta_glowstone_gate", new BlockItem(CPlusBlocks.MAGENTA_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Pink
	public static final Item PINK_GLOWSTONE = register("pink_glowstone", new BlockItem(CPlusBlocks.PINK_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_GLOWSTONE_SLAB = register("pink_glowstone_slab", new BlockItem(CPlusBlocks.PINK_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_GLOWSTONE_STAIRS = register("pink_glowstone_stairs", new BlockItem(CPlusBlocks.PINK_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_GLOWSTONE_WALL = register("pink_glowstone_wall", new BlockItem(CPlusBlocks.PINK_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_GLOWSTONE_GATE = register("pink_glowstone_gate", new BlockItem(CPlusBlocks.PINK_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// White
	public static final Item WHITE_GLOWSTONE = register("white_glowstone", new BlockItem(CPlusBlocks.WHITE_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_GLOWSTONE_SLAB = register("white_glowstone_slab", new BlockItem(CPlusBlocks.WHITE_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_GLOWSTONE_STAIRS = register("white_glowstone_stairs", new BlockItem(CPlusBlocks.WHITE_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_GLOWSTONE_WALL = register("white_glowstone_wall", new BlockItem(CPlusBlocks.WHITE_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_GLOWSTONE_GATE = register("white_glowstone_gate", new BlockItem(CPlusBlocks.WHITE_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Gray
	public static final Item LIGHT_GRAY_GLOWSTONE = register("light_gray_glowstone", new BlockItem(CPlusBlocks.LIGHT_GRAY_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_GLOWSTONE_SLAB = register("light_gray_glowstone_slab", new BlockItem(CPlusBlocks.LIGHT_GRAY_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_GLOWSTONE_STAIRS = register("light_gray_glowstone_stairs", new BlockItem(CPlusBlocks.LIGHT_GRAY_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_GLOWSTONE_WALL = register("light_gray_glowstone_wall", new BlockItem(CPlusBlocks.LIGHT_GRAY_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_GLOWSTONE_GATE = register("light_gray_glowstone_gate", new BlockItem(CPlusBlocks.LIGHT_GRAY_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Gary :snail:
	public static final Item GRAY_GLOWSTONE = register("gray_glowstone", new BlockItem(CPlusBlocks.GRAY_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_GLOWSTONE_SLAB = register("gray_glowstone_slab", new BlockItem(CPlusBlocks.GRAY_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_GLOWSTONE_WALL = register("gray_glowstone_wall", new BlockItem(CPlusBlocks.GRAY_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_GLOWSTONE_STAIRS = register("gray_glowstone_stairs", new BlockItem(CPlusBlocks.GRAY_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_GLOWSTONE_GATE = register("gray_glowstone_gate", new BlockItem(CPlusBlocks.GRAY_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Black
	public static final Item BLACK_GLOWSTONE = register("black_glowstone", new BlockItem(CPlusBlocks.BLACK_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_GLOWSTONE_SLAB = register("black_glowstone_slab", new BlockItem(CPlusBlocks.BLACK_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_GLOWSTONE_STAIRS = register("black_glowstone_stairs", new BlockItem(CPlusBlocks.BLACK_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_GLOWSTONE_WALL = register("black_glowstone_wall", new BlockItem(CPlusBlocks.BLACK_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_GLOWSTONE_GATE = register("black_glowstone_gate", new BlockItem(CPlusBlocks.BLACK_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Brown
	public static final Item BROWN_GLOWSTONE = register("brown_glowstone", new BlockItem(CPlusBlocks.BROWN_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_GLOWSTONE_SLAB = register("brown_glowstone_slab", new BlockItem(CPlusBlocks.BROWN_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_GLOWSTONE_STAIRS = register("brown_glowstone_stairs", new BlockItem(CPlusBlocks.BROWN_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_GLOWSTONE_WALL = register("brown_glowstone_wall", new BlockItem(CPlusBlocks.BROWN_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_GLOWSTONE_GATE = register("brown_glowstone_gate", new BlockItem(CPlusBlocks.BROWN_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Soul
	public static final Item SOUL_GLOWSTONE = register("soul_glowstone", new BlockItem(CPlusBlocks.SOUL_GLOWSTONE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SOUL_GLOWSTONE_SLAB = register("soul_glowstone_slab", new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SOUL_GLOWSTONE_STAIRS = register("soul_glowstone_stairs", new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SOUL_GLOWSTONE_WALL = register("soul_glowstone_wall", new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SOUL_GLOWSTONE_GATE = register("soul_glowstone_gate", new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// ICE

	// Red
	public static final Item RED_ICE = register("red_ice", new BlockItem(CPlusBlocks.RED_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_ICE_SLAB = register("red_ice_slab", new BlockItem(CPlusBlocks.RED_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_ICE_STAIRS = register("red_ice_stairs", new BlockItem(CPlusBlocks.RED_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_ICE_WALL = register("red_ice_wall", new BlockItem(CPlusBlocks.RED_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item RED_ICE_GATE = register("red_ice_gate", new BlockItem(CPlusBlocks.RED_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Orange
	public static final Item ORANGE_ICE = register("orange_ice", new BlockItem(CPlusBlocks.ORANGE_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_ICE_SLAB = register("orange_ice_slab", new BlockItem(CPlusBlocks.ORANGE_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_ICE_STAIRS = register("orange_ice_stairs", new BlockItem(CPlusBlocks.ORANGE_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_ICE_WALL = register("orange_ice_wall", new BlockItem(CPlusBlocks.ORANGE_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item ORANGE_ICE_GATE = register("orange_ice_gate", new BlockItem(CPlusBlocks.ORANGE_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Yellow
	public static final Item YELLOW_ICE = register("yellow_ice", new BlockItem(CPlusBlocks.YELLOW_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_ICE_SLAB = register("yellow_ice_slab", new BlockItem(CPlusBlocks.YELLOW_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_ICE_STAIRS = register("yellow_ice_stairs", new BlockItem(CPlusBlocks.YELLOW_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_ICE_WALL = register("yellow_ice_wall", new BlockItem(CPlusBlocks.YELLOW_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item YELLOW_ICE_GATE = register("yellow_ice_gate", new BlockItem(CPlusBlocks.YELLOW_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Lime
	public static final Item LIME_ICE = register("lime_ice", new BlockItem(CPlusBlocks.LIME_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_ICE_SLAB = register("lime_ice_slab", new BlockItem(CPlusBlocks.LIME_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_ICE_STAIRS = register("lime_ice_stairs", new BlockItem(CPlusBlocks.LIME_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_ICE_WALL = register("lime_ice_wall", new BlockItem(CPlusBlocks.LIME_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIME_ICE_GATE = register("lime_ice_gate", new BlockItem(CPlusBlocks.LIME_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Green
	public static final Item GREEN_ICE = register("green_ice", new BlockItem(CPlusBlocks.GREEN_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_ICE_SLAB = register("green_ice_slab", new BlockItem(CPlusBlocks.GREEN_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_ICE_STAIRS = register("green_ice_stairs", new BlockItem(CPlusBlocks.GREEN_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_ICE_WALL = register("green_ice_wall", new BlockItem(CPlusBlocks.GREEN_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GREEN_ICE_GATE = register("green_ice_gate", new BlockItem(CPlusBlocks.GREEN_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Blue
	public static final Item BLUE_ICE_SLAB = register("blue_ice_slab", new BlockItem(CPlusBlocks.BLUE_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_ICE_STAIRS = register("blue_ice_stairs", new BlockItem(CPlusBlocks.BLUE_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_ICE_WALL = register("blue_ice_wall", new BlockItem(CPlusBlocks.BLUE_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLUE_ICE_GATE = register("blue_ice_gate", new BlockItem(CPlusBlocks.BLUE_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cyan
	public static final Item CYAN_ICE = register("cyan_ice", new BlockItem(CPlusBlocks.CYAN_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_ICE_SLAB = register("cyan_ice_slab", new BlockItem(CPlusBlocks.CYAN_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_ICE_STAIRS = register("cyan_ice_stairs", new BlockItem(CPlusBlocks.CYAN_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_ICE_WALL = register("cyan_ice_wall", new BlockItem(CPlusBlocks.CYAN_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item CYAN_ICE_GATE = register("cyan_ice_gate", new BlockItem(CPlusBlocks.CYAN_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Blue
	public static final Item LIGHT_BLUE_ICE = register("light_blue_ice", new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_ICE_SLAB = register("light_blue_ice_slab", new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_ICE_STAIRS = register("light_blue_ice_stairs", new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_ICE_WALL = register("light_blue_ice_wall", new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_BLUE_ICE_GATE = register("light_blue_ice_gate", new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Purple
	public static final Item PURPLE_ICE = register("purple_ice", new BlockItem(CPlusBlocks.PURPLE_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_ICE_SLAB = register("purple_ice_slab", new BlockItem(CPlusBlocks.PURPLE_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_ICE_STAIRS = register("purple_ice_stairs", new BlockItem(CPlusBlocks.PURPLE_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_ICE_WALL = register("purple_ice_wall", new BlockItem(CPlusBlocks.PURPLE_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PURPLE_ICE_GATE = register("purple_ice_gate", new BlockItem(CPlusBlocks.PURPLE_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Magenta
	public static final Item MAGENTA_ICE = register("magenta_ice", new BlockItem(CPlusBlocks.MAGENTA_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_ICE_SLAB = register("magenta_ice_slab", new BlockItem(CPlusBlocks.MAGENTA_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_ICE_STAIRS = register("magenta_ice_stairs", new BlockItem(CPlusBlocks.MAGENTA_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_ICE_WALL = register("magenta_ice_wall", new BlockItem(CPlusBlocks.MAGENTA_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item MAGENTA_ICE_GATE = register("magenta_ice_gate", new BlockItem(CPlusBlocks.MAGENTA_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Pink
	public static final Item PINK_ICE = register("pink_ice", new BlockItem(CPlusBlocks.PINK_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_ICE_SLAB = register("pink_ice_slab", new BlockItem(CPlusBlocks.PINK_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_ICE_STAIRS = register("pink_ice_stairs", new BlockItem(CPlusBlocks.PINK_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_ICE_WALL = register("pink_ice_wall", new BlockItem(CPlusBlocks.PINK_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item PINK_ICE_GATE = register("pink_ice_gate", new BlockItem(CPlusBlocks.PINK_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// White
	public static final Item WHITE_ICE = register("white_ice", new BlockItem(CPlusBlocks.WHITE_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_ICE_SLAB = register("white_ice_slab", new BlockItem(CPlusBlocks.WHITE_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_ICE_STAIRS = register("white_ice_stairs", new BlockItem(CPlusBlocks.WHITE_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_ICE_WALL = register("white_ice_wall", new BlockItem(CPlusBlocks.WHITE_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item WHITE_ICE_GATE = register("white_ice_gate", new BlockItem(CPlusBlocks.WHITE_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Gray
	public static final Item LIGHT_GRAY_ICE = register("light_gray_ice", new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_ICE_SLAB = register("light_gray_ice_slab", new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_ICE_STAIRS = register("light_gray_ice_stairs", new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_ICE_WALL = register("light_gray_ice_wall", new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item LIGHT_GRAY_ICE_GATE = register("light_gray_ice_gate", new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Gray
	public static final Item GRAY_ICE = register("gray_ice", new BlockItem(CPlusBlocks.GRAY_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_ICE_SLAB = register("gray_ice_slab", new BlockItem(CPlusBlocks.GRAY_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_ICE_STAIRS = register("gray_ice_stairs", new BlockItem(CPlusBlocks.GRAY_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_ICE_WALL = register("gray_ice_wall", new BlockItem(CPlusBlocks.GRAY_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item GRAY_ICE_GATE = register("gray_ice_gate", new BlockItem(CPlusBlocks.GRAY_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Black
	public static final Item BLACK_ICE = register("black_ice", new BlockItem(CPlusBlocks.BLACK_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_ICE_SLAB = register("black_ice_slab", new BlockItem(CPlusBlocks.BLACK_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_ICE_STAIRS = register("black_ice_stairs", new BlockItem(CPlusBlocks.BLACK_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_ICE_WALL = register("black_ice_wall", new BlockItem(CPlusBlocks.BLACK_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BLACK_ICE_GATE = register("black_ice_gate", new BlockItem(CPlusBlocks.BLACK_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Brown
	public static final Item BROWN_ICE = register("brown_ice", new BlockItem(CPlusBlocks.BROWN_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_ICE_SLAB = register("brown_ice_slab", new BlockItem(CPlusBlocks.BROWN_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_ICE_STAIRS = register("brown_ice_stairs", new BlockItem(CPlusBlocks.BROWN_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_ICE_WALL = register("brown_ice_wall", new BlockItem(CPlusBlocks.BROWN_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item BROWN_ICE_GATE = register("brown_ice_gate", new BlockItem(CPlusBlocks.BROWN_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Soul
	public static final Item SOUL_ICE = register("soul_ice", new BlockItem(CPlusBlocks.SOUL_ICE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SOUL_ICE_SLAB = register("soul_ice_slab", new BlockItem(CPlusBlocks.SOUL_ICE_SLAB, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SOUL_ICE_STAIRS = register("soul_ice_stairs", new BlockItem(CPlusBlocks.SOUL_ICE_STAIRS, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SOUL_ICE_WALL = register("soul_ice_wall", new BlockItem(CPlusBlocks.SOUL_ICE_WALL, CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final Item SOUL_ICE_GATE = register("soul_ice_gate", new BlockItem(CPlusBlocks.SOUL_ICE_GATE, CPlusItemGroups.consistencyPlusDyeableItemSettings()));


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
	public static final Item NETHERITE_HORSE_ARMOR = register("netherite_horse_armor", new NetheriteHorseArmorItem(15, "netherite", new Item.Settings().maxCount(1).fireproof().group(ItemGroup.MISC)));

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
	public static final Item CARVED_STONE_BRICKS = register("carved_stone_bricks", new RedirectedBlockItem(CPlusBlocks.CARVED_STONE, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CARVED_STONE_BRICKS));
	public static final Item STONE_BRICK_PILLAR = register("stone_brick_pillar", new RedirectedBlockItem(CPlusBlocks.STONE_PILLAR, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.STONE_BRICK_PILLAR));
	public static final Item MOSSY_STONE_BRICK_PILLAR = register("mossy_stone_brick_pillar", new RedirectedBlockItem(CPlusBlocks.MOSSY_STONE_PILLAR, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.MOSSY_STONE_BRICK_PILLAR));
	public static final Item CRACKED_STONE_BRICK_PILLAR = register("cracked_stone_brick_pillar", new RedirectedBlockItem(CPlusBlocks.CRACKED_STONE_PILLAR, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_STONE_BRICK_PILLAR));
	public static final Item CRACKED_CHISELED_STONE_BRICKS = register("cracked_chiseled_stone_bricks", new RedirectedBlockItem(CPlusBlocks.CRACKED_CHISELED_STONE, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_CHISELED_STONE));
	public static final Item MOSSY_CHISELED_STONE_BRICKS = register("mossy_chiseled_stone_bricks", new RedirectedBlockItem(CPlusBlocks.MOSSY_CHISELED_STONE, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.MOSSY_CHISELED_STONE_BRICKS));
	public static final Item BLACKSTONE_BRICK_PILLAR = register("blackstone_brick_pillar", new RedirectedBlockItem(CPlusBlocks.BLACKSTONE_PILLAR, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BLACKSTONE_BRICK_PILLAR));
	public static final Item CRACKED_BLACKSTONE_BRICK_PILLAR = register("cracked_blackstone_brick_pillar", new RedirectedBlockItem(CPlusBlocks.CRACKED_BLACKSTONE_PILLAR, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CRACKED_BLACKSTONE_BRICK_PILLAR));
	public static final Item MOSSY_BLACKSTONE_BRICK_PILLAR = register("mossy_blackstone_brick_pillar", new RedirectedBlockItem(CPlusBlocks.MOSSY_BLACKSTONE_PILLAR, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.MOSSY_BLACKSTONE_BRICK_PILLAR));
	public static final Item CHISELED_BRICKS = register("chiseled_bricks", new RedirectedBlockItem(CPlusBlocks.CHISELED_TERRACOTTA, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CHISELED_BRICKS));
	public static final Item BRICK_PILLAR = register("brick_pillar", new RedirectedBlockItem(CPlusBlocks.TERRACOTTA_PILLAR, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.BRICK_PILLAR));
	public static final Item CARVED_BRICKS = register("carved_bricks", new RedirectedBlockItem(CPlusBlocks.CARVED_TERRACOTTA, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CARVED_BRICKS));
	public static final Item SMOOTH_PURPUR_BLOCK = register("smooth_purpur_block", new RedirectedBlockItem(CPlusBlocks.SMOOTH_PURPUR, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.SMOOTH_PURPUR_BLOCK));
	public static final Item POLISHED_PURPUR_BLOCK = register("polished_purpur_block", new RedirectedBlockItem(CPlusBlocks.POLISHED_PURPUR, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.POLISHED_PURPUR_BLOCK));
	public static final Item CHISELED_PURPUR_BLOCK = register("chiseled_purpur_block", new RedirectedBlockItem(CPlusBlocks.CHISELED_PURPUR, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.CHISELED_PURPUR_BLOCK));
	public static final Item END_STONE_BRICK_PILLAR = register("end_stone_brick_pillar", new RedirectedBlockItem(CPlusBlocks.END_STONE_PILLAR, CPlusItemGroups.consistencyPlusDeprecatedSettings(), CPlusBlocks.END_STONE_BRICK_PILLAR));

	public static final Item BLUE_NETHER_BRICKS = register("blue_nether_bricks", new BlockItem(CPlusBlocks.BLUE_NETHER_BRICKS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item BLUE_NETHER_BRICK_SLAB = register("blue_nether_brick_slab", new BlockItem(CPlusBlocks.BLUE_NETHER_BRICK_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item BLUE_NETHER_BRICK_STAIRS = register("blue_nether_brick_stairs", new BlockItem(CPlusBlocks.BLUE_NETHER_BRICK_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item BLUE_NETHER_BRICK_WALL = register("blue_nether_brick_wall", new BlockItem(CPlusBlocks.BLUE_NETHER_BRICK_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item BLUE_NETHER_BRICK_FENCE_GATE = register("blue_nether_brick_fence_gate", new BlockItem(CPlusBlocks.BLUE_NETHER_BRICK_FENCE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cracked Warped Wart Bricks
	public static final Item CRACKED_BLUE_NETHER_BRICKS = register("cracked_blue_nether_bricks", new BlockItem(CPlusBlocks.CRACKED_BLUE_NETHER_BRICKS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_BLUE_NETHER_BRICK_SLAB = register("cracked_blue_nether_brick_slab", new BlockItem(CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_BLUE_NETHER_BRICK_STAIRS = register("cracked_blue_nether_brick_stairs", new BlockItem(CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_BLUE_NETHER_BRICK_WALL = register("cracked_blue_nether_brick_wall", new BlockItem(CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_WALL, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final Item CRACKED_BLUE_NETHER_BRICK_FENCE_GATE = register("cracked_blue_nether_brick_fence_gate", new BlockItem(CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Warped Wart

	// Warped Wart Tiles

	// Warped Wart Pillar
	public static final Item BLUE_NETHER_BRICK_PILLAR = register("blue_nether_brick_pillar", new BlockItem(CPlusBlocks.BLUE_NETHER_BRICK_PILLAR, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Chiseled Warped Wart
	public static final Item CHISELED_BLUE_NETHER_BRICKS = register("chiseled_blue_nether_bricks", new BlockItem(CPlusBlocks.CHISELED_BLUE_NETHER_BRICKS, CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Carved Warted Wart
	public static final Item CARVED_BLUE_NETHER_BRICKS = register("carved_blue_nether_bricks", new BlockItem(CPlusBlocks.CARVED_BLUE_NETHER_BRICKS, CPlusItemGroups.consistencyPlusMiscItemSettings()));



	private static Item register(String name, Item item) {
		RegistrySupplier<Item> itemSupplied = ITEMS.register(name, () -> item);
		return item;
	}

	public static void init() {
	}
	
	public static void register() {
		ITEMS.register();
	}
}
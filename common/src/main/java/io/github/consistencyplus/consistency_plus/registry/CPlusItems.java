package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.items.NetheriteHorseArmorItem;
import io.github.consistencyplus.consistency_plus.items.NubertMinecartItem;
import io.github.consistencyplus.consistency_plus.items.RedirectedBlockItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static io.github.consistencyplus.consistency_plus.registry.CPlusBlocks.*;
import static io.github.consistencyplus.consistency_plus.registry.CPlusItemGroups.*;

@SuppressWarnings("unused")
public class CPlusItems {
	/*
	templates:
	block item: SMOOTH_STONE_WALL = ITEMS.register("smooth_stone_wall", () ->
            new BlockItem(CPlusCPlusBlocks.SMOOTH_STONE_WALL.get(), CPlusCPlusItemGroups.stones())),
	 */

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ConsistencyPlusMain.ID, Registry.ITEM_KEY);
	
	public static final RegistrySupplier<Item>
			
			// STONE
	// Base
	STONE_WALL = ITEMS.register("stone_wall", () ->
            new BlockItem(CPlusBlocks.STONE_WALL.get(), stones())),
	STONE_GATE = ITEMS.register("stone_gate", () ->
            new BlockItem(CPlusBlocks.STONE_GATE.get(), stones())),

	// Cobblestone
	COBBLESTONE_GATE = ITEMS.register("cobblestone_gate", () ->
            new BlockItem(CPlusBlocks.COBBLESTONE_GATE.get(), stones())),

	// Mossy Cobblestone
	MOSSY_COBBLESTONE_GATE = ITEMS.register("mossy_cobblestone_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_COBBLESTONE_GATE.get(), stones())),

	// Polished Stone
	POLISHED_STONE = ITEMS.register("polished_stone", () ->
            new BlockItem(CPlusBlocks.POLISHED_STONE.get(), stones())),
	POLISHED_STONE_WALL = ITEMS.register("polished_stone_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_STONE_WALL.get(), stones())),
	POLISHED_STONE_STAIRS = ITEMS.register("polished_stone_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_STONE_STAIRS.get(), stones())),
	POLISHED_STONE_SLAB = ITEMS.register("polished_stone_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_STONE_SLAB.get(), stones())),
	POLISHED_STONE_GATE = ITEMS.register("polished_stone_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_STONE_GATE.get(), stones())),

	// Smooth Stone
	SMOOTH_STONE_WALL = ITEMS.register("smooth_stone_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_STONE_WALL.get(), stones())),
	SMOOTH_STONE_STAIRS = ITEMS.register("smooth_stone_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_STONE_STAIRS.get(), stones())),
	SMOOTH_STONE_GATE = ITEMS.register("smooth_stone_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_STONE_GATE.get(), stones())),

	// Stone Bricks
	STONE_BRICK_GATE = ITEMS.register("stone_brick_gate", () ->
            new BlockItem(CPlusBlocks.STONE_BRICK_GATE.get(), stones())),

	// Mossy Stone Bricks
	MOSSY_STONE_BRICK_GATE = ITEMS.register("mossy_stone_brick_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_STONE_BRICK_GATE.get(), stones())),

	// Cracked Stone Bricks
	CRACKED_STONE_BRICK_SLAB = ITEMS.register("cracked_stone_brick_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_SLAB.get(), stones())),
	CRACKED_STONE_BRICK_STAIRS = ITEMS.register("cracked_stone_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_STAIRS.get(), stones())),
	CRACKED_STONE_BRICK_WALL = ITEMS.register("cracked_stone_brick_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_WALL.get(), stones())),
	CRACKED_STONE_BRICK_GATE = ITEMS.register("cracked_stone_brick_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_GATE.get(), stones())),

	// Cut Stone
	CUT_STONE = ITEMS.register("cut_stone", () ->
            new BlockItem(CPlusBlocks.CUT_STONE.get(), stones())),
	CUT_STONE_SLAB = ITEMS.register("cut_stone_slab", () ->
            new BlockItem(CPlusBlocks.CUT_STONE_SLAB.get(), stones())),
	CUT_STONE_STAIRS = ITEMS.register("cut_stone_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_STONE_STAIRS.get(), stones())),
	CUT_STONE_WALL = ITEMS.register("cut_stone_wall", () ->
            new BlockItem(CPlusBlocks.CUT_STONE_WALL.get(), stones())),
	CUT_STONE_GATE = ITEMS.register("cut_stone_gate", () ->
            new BlockItem(CPlusBlocks.CUT_STONE_GATE.get(), stones())),

	// Stone Tiles
	STONE_TILES = ITEMS.register("stone_tiles", () ->
            new BlockItem(CPlusBlocks.STONE_TILES.get(), stones())),
	STONE_TILE_SLAB = ITEMS.register("stone_tile_slab", () ->
            new BlockItem(CPlusBlocks.STONE_TILE_SLAB.get(), stones())),
	STONE_TILE_STAIRS = ITEMS.register("stone_tile_stairs", () ->
            new BlockItem(CPlusBlocks.STONE_TILE_STAIRS.get(), stones())),
	STONE_TILE_WALL = ITEMS.register("stone_tile_wall", () ->
            new BlockItem(CPlusBlocks.STONE_TILE_WALL.get(), stones())),
	STONE_TILE_GATE = ITEMS.register("stone_tile_gate", () ->
            new BlockItem(CPlusBlocks.STONE_TILE_GATE.get(), stones())),

	// Stone Pillar
	// The block that started it all
	STONE_PILLAR = ITEMS.register("stone_pillar", () ->
            new BlockItem(CPlusBlocks.STONE_PILLAR.get(), stones())),
	STONE_CORNER_PILLAR = ITEMS.register("stone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.STONE_CORNER_PILLAR.get(), stones())),

	// Mossy Stone Pillar
	MOSSY_STONE_PILLAR = ITEMS.register("mossy_stone_pillar", () ->
            new BlockItem(CPlusBlocks.MOSSY_STONE_PILLAR.get(), stones())),
	MOSSY_STONE_CORNER_PILLAR = ITEMS.register("mossy_stone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.MOSSY_STONE_CORNER_PILLAR.get(), stones())),

	// Cracked Stone Pillar
	CRACKED_STONE_PILLAR = ITEMS.register("cracked_stone_pillar", () ->
            new BlockItem(CPlusBlocks.CRACKED_STONE_PILLAR.get(), stones())),
	CRACKED_STONE_CORNER_PILLAR = ITEMS.register("cracked_stone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.CRACKED_STONE_CORNER_PILLAR.get(), stones())),

	// Mossy Chiseled Stone
	MOSSY_CHISELED_STONE = ITEMS.register("mossy_chiseled_stone", () ->
            new BlockItem(CPlusBlocks.MOSSY_CHISELED_STONE.get(), stones())),

	// Cracked Chiseled Stone
	CRACKED_CHISELED_STONE = ITEMS.register("cracked_chiseled_stone", () ->
            new BlockItem(CPlusBlocks.CRACKED_CHISELED_STONE.get(), stones())),

	// Carved Stone
	CARVED_STONE = ITEMS.register("carved_stone", () ->
            new BlockItem(CPlusBlocks.CARVED_STONE.get(), stones())),


// ANDESITE

	// Base
	ANDESITE_GATE = ITEMS.register("andesite_gate", () ->
            new BlockItem(CPlusBlocks.ANDESITE_GATE.get(), stones())),

	// Mossy Base
	MOSSY_ANDESITE = ITEMS.register("mossy_andesite", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE.get(), stones())),
	MOSSY_ANDESITE_SLAB = ITEMS.register("mossy_andesite_slab", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_SLAB.get(), stones())),
	MOSSY_ANDESITE_STAIRS = ITEMS.register("mossy_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_STAIRS.get(), stones())),
	MOSSY_ANDESITE_WALL = ITEMS.register("mossy_andesite_wall", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_WALL.get(), stones())),
	MOSSY_ANDESITE_GATE = ITEMS.register("mossy_andesite_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_GATE.get(), stones())),

	// Cobbled Andesite
	COBBLED_ANDESITE = ITEMS.register("cobbled_andesite", () ->
            new BlockItem(CPlusBlocks.COBBLED_ANDESITE.get(), stones())),
	COBBLED_ANDESITE_SLAB = ITEMS.register("cobbled_andesite_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_ANDESITE_SLAB.get(), stones())),
	COBBLED_ANDESITE_STAIRS = ITEMS.register("cobbled_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_ANDESITE_STAIRS.get(), stones())),
	COBBLED_ANDESITE_WALL = ITEMS.register("cobbled_andesite_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_ANDESITE_WALL.get(), stones())),
	COBBLED_ANDESITE_GATE = ITEMS.register("cobbled_andesite_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_ANDESITE_GATE.get(), stones())),

	// Polished Andesite
	POLISHED_ANDESITE_WALL = ITEMS.register("polished_andesite_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_ANDESITE_WALL.get(), stones())),
	POLISHED_ANDESITE_GATE = ITEMS.register("polished_andesite_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_ANDESITE_GATE.get(), stones())),

	// Mossy Polished Andesite
	MOSSY_POLISHED_ANDESITE = ITEMS.register("mossy_polished_andesite", () ->
            new BlockItem(CPlusBlocks.MOSSY_POLISHED_ANDESITE.get(), stones())),
	MOSSY_POLISHED_ANDESITE_SLAB = ITEMS.register("mossy_polished_andesite_slab", () ->
            new BlockItem(CPlusBlocks.MOSSY_POLISHED_ANDESITE_SLAB.get(), stones())),
	MOSSY_POLISHED_ANDESITE_STAIRS = ITEMS.register("mossy_polished_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.MOSSY_POLISHED_ANDESITE_STAIRS.get(), stones())),
	MOSSY_POLISHED_ANDESITE_WALL = ITEMS.register("mossy_polished_andesite_wall", () ->
            new BlockItem(CPlusBlocks.MOSSY_POLISHED_ANDESITE_WALL.get(), stones())),
	MOSSY_POLISHED_ANDESITE_GATE = ITEMS.register("mossy_polished_andesite_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_POLISHED_ANDESITE_GATE.get(), stones())),

	// Cracked Polished Andesite
	CRACKED_POLISHED_ANDESITE = ITEMS.register("cracked_polished_andesite", () ->
            new BlockItem(CPlusBlocks.CRACKED_POLISHED_ANDESITE.get(), stones())),
	CRACKED_POLISHED_ANDESITE_SLAB = ITEMS.register("cracked_polished_andesite_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_POLISHED_ANDESITE_SLAB.get(), stones())),
	CRACKED_POLISHED_ANDESITE_STAIRS = ITEMS.register("cracked_polished_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_POLISHED_ANDESITE_STAIRS.get(), stones())),
	CRACKED_POLISHED_ANDESITE_WALL = ITEMS.register("cracked_polished_andesite_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_POLISHED_ANDESITE_WALL.get(), stones())),
	CRACKED_POLISHED_ANDESITE_GATE = ITEMS.register("cracked_polished_andesite_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_POLISHED_ANDESITE_GATE.get(), stones())),

	// Smooth Andesite
	SMOOTH_ANDESITE = ITEMS.register("smooth_andesite", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ANDESITE.get(), stones())),
	SMOOTH_ANDESITE_SLAB = ITEMS.register("smooth_andesite_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ANDESITE_SLAB.get(), stones())),
	SMOOTH_ANDESITE_STAIRS = ITEMS.register("smooth_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ANDESITE_STAIRS.get(), stones())),
	SMOOTH_ANDESITE_WALL = ITEMS.register("smooth_andesite_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ANDESITE_WALL.get(), stones())),
	SMOOTH_ANDESITE_GATE = ITEMS.register("smooth_andesite_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ANDESITE_GATE.get(), stones())),

	// Mossy Smooth Andesite
	MOSSY_SMOOTH_ANDESITE = ITEMS.register("mossy_smooth_andesite", () ->
            new BlockItem(CPlusBlocks.MOSSY_SMOOTH_ANDESITE.get(), stones())),
	MOSSY_SMOOTH_ANDESITE_SLAB = ITEMS.register("mossy_smooth_andesite_slab", () ->
            new BlockItem(CPlusBlocks.MOSSY_SMOOTH_ANDESITE_SLAB.get(), stones())),
	MOSSY_SMOOTH_ANDESITE_STAIRS = ITEMS.register("mossy_smooth_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.MOSSY_SMOOTH_ANDESITE_STAIRS.get(), stones())),
	MOSSY_SMOOTH_ANDESITE_WALL = ITEMS.register("mossy_smooth_andesite_wall", () ->
            new BlockItem(CPlusBlocks.MOSSY_SMOOTH_ANDESITE_WALL.get(), stones())),
	MOSSY_SMOOTH_ANDESITE_GATE = ITEMS.register("mossy_smooth_andesite_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_SMOOTH_ANDESITE_GATE.get(), stones())),

	// Cracked Smooth Andesite
	CRACKED_SMOOTH_ANDESITE = ITEMS.register("cracked_smooth_andesite", () ->
            new BlockItem(CPlusBlocks.CRACKED_SMOOTH_ANDESITE.get(), stones())),
	CRACKED_SMOOTH_ANDESITE_SLAB = ITEMS.register("cracked_smooth_andesite_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_SMOOTH_ANDESITE_SLAB.get(), stones())),
	CRACKED_SMOOTH_ANDESITE_STAIRS = ITEMS.register("cracked_smooth_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_SMOOTH_ANDESITE_STAIRS.get(), stones())),
	CRACKED_SMOOTH_ANDESITE_WALL = ITEMS.register("cracked_smooth_andesite_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_SMOOTH_ANDESITE_WALL.get(), stones())),
	CRACKED_SMOOTH_ANDESITE_GATE = ITEMS.register("cracked_smooth_andesite_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_SMOOTH_ANDESITE_GATE.get(), stones())),

	// Andesite Bricks
	ANDESITE_BRICKS = ITEMS.register("andesite_bricks", () ->
            new BlockItem(CPlusBlocks.ANDESITE_BRICKS.get(), stones())),
	ANDESITE_BRICK_SLAB = ITEMS.register("andesite_brick_slab", () ->
            new BlockItem(CPlusBlocks.ANDESITE_BRICK_SLAB.get(), stones())),
	ANDESITE_BRICK_STAIRS = ITEMS.register("andesite_brick_stairs", () ->
            new BlockItem(CPlusBlocks.ANDESITE_BRICK_STAIRS.get(), stones())),
	ANDESITE_BRICK_WALL = ITEMS.register("andesite_brick_wall", () ->
            new BlockItem(CPlusBlocks.ANDESITE_BRICK_WALL.get(), stones())),
	ANDESITE_BRICK_GATE = ITEMS.register("andesite_brick_gate", () ->
            new BlockItem(CPlusBlocks.ANDESITE_BRICK_GATE.get(), stones())),

	// Mossy Andesite Bricks
	MOSSY_ANDESITE_BRICKS = ITEMS.register("mossy_andesite_bricks", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_BRICKS.get(), stones())),
	MOSSY_ANDESITE_BRICK_SLAB = ITEMS.register("mossy_andesite_brick_slab", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_BRICK_SLAB.get(), stones())),
	MOSSY_ANDESITE_BRICK_STAIRS = ITEMS.register("mossy_andesite_brick_stairs", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_BRICK_STAIRS.get(), stones())),
	MOSSY_ANDESITE_BRICK_WALL = ITEMS.register("mossy_andesite_brick_wall", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_BRICK_WALL.get(), stones())),
	MOSSY_ANDESITE_BRICK_GATE = ITEMS.register("mossy_andesite_brick_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_BRICK_GATE.get(), stones())),

	// Cracked Andesite Bricks
	CRACKED_ANDESITE_BRICKS = ITEMS.register("cracked_andesite_bricks", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_BRICKS.get(), stones())),
	CRACKED_ANDESITE_BRICK_SLAB = ITEMS.register("cracked_andesite_brick_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_BRICK_SLAB.get(), stones())),
	CRACKED_ANDESITE_BRICK_STAIRS = ITEMS.register("cracked_andesite_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_BRICK_STAIRS.get(), stones())),
	CRACKED_ANDESITE_BRICK_WALL = ITEMS.register("cracked_andesite_brick_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_BRICK_WALL.get(), stones())),
	CRACKED_ANDESITE_BRICK_GATE = ITEMS.register("cracked_andesite_brick_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_BRICK_GATE.get(), stones())),

	// Cut Andesite
	CUT_ANDESITE = ITEMS.register("cut_andesite", () ->
            new BlockItem(CPlusBlocks.CUT_ANDESITE.get(), stones())),
	CUT_ANDESITE_SLAB = ITEMS.register("cut_andesite_slab", () ->
            new BlockItem(CPlusBlocks.CUT_ANDESITE_SLAB.get(), stones())),
	CUT_ANDESITE_STAIRS = ITEMS.register("cut_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_ANDESITE_STAIRS.get(), stones())),
	CUT_ANDESITE_WALL = ITEMS.register("cut_andesite_wall", () ->
            new BlockItem(CPlusBlocks.CUT_ANDESITE_WALL.get(), stones())),
	CUT_ANDESITE_GATE = ITEMS.register("cut_andesite_gate", () ->
            new BlockItem(CPlusBlocks.CUT_ANDESITE_GATE.get(), stones())),

	// Mossy Cut Andesite
	MOSSY_CUT_ANDESITE = ITEMS.register("mossy_cut_andesite", () ->
            new BlockItem(CPlusBlocks.MOSSY_CUT_ANDESITE.get(), stones())),
	MOSSY_CUT_ANDESITE_SLAB = ITEMS.register("mossy_cut_andesite_slab", () ->
            new BlockItem(CPlusBlocks.MOSSY_CUT_ANDESITE_SLAB.get(), stones())),
	MOSSY_CUT_ANDESITE_STAIRS = ITEMS.register("mossy_cut_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.MOSSY_CUT_ANDESITE_STAIRS.get(), stones())),
	MOSSY_CUT_ANDESITE_WALL = ITEMS.register("mossy_cut_andesite_wall", () ->
            new BlockItem(CPlusBlocks.MOSSY_CUT_ANDESITE_WALL.get(), stones())),
	MOSSY_CUT_ANDESITE_GATE = ITEMS.register("mossy_cut_andesite_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_CUT_ANDESITE_GATE.get(), stones())),

	// Cracked Cut Andesite
	CRACKED_CUT_ANDESITE = ITEMS.register("cracked_cut_andesite", () ->
            new BlockItem(CPlusBlocks.CRACKED_CUT_ANDESITE.get(), stones())),
	CRACKED_CUT_ANDESITE_SLAB = ITEMS.register("cracked_cut_andesite_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_CUT_ANDESITE_SLAB.get(), stones())),
	CRACKED_CUT_ANDESITE_STAIRS = ITEMS.register("cracked_cut_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_CUT_ANDESITE_STAIRS.get(), stones())),
	CRACKED_CUT_ANDESITE_WALL = ITEMS.register("cracked_cut_andesite_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_CUT_ANDESITE_WALL.get(), stones())),
	CRACKED_CUT_ANDESITE_GATE = ITEMS.register("cracked_cut_andesite_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_CUT_ANDESITE_GATE.get(), stones())),

	// Andesite Tiles
	ANDESITE_TILES = ITEMS.register("andesite_tiles", () ->
            new BlockItem(CPlusBlocks.ANDESITE_TILES.get(), stones())),
	ANDESITE_TILE_SLAB = ITEMS.register("andesite_tile_slab", () ->
            new BlockItem(CPlusBlocks.ANDESITE_TILE_SLAB.get(), stones())),
	ANDESITE_TILE_STAIRS = ITEMS.register("andesite_tile_stairs", () ->
            new BlockItem(CPlusBlocks.ANDESITE_TILE_STAIRS.get(), stones())),
	ANDESITE_TILE_WALL = ITEMS.register("andesite_tile_wall", () ->
            new BlockItem(CPlusBlocks.ANDESITE_TILE_WALL.get(), stones())),
	ANDESITE_TILE_GATE = ITEMS.register("andesite_tile_gate", () ->
            new BlockItem(CPlusBlocks.ANDESITE_TILE_GATE.get(), stones())),

	// Mossy Andesite Tiles
	MOSSY_ANDESITE_TILES = ITEMS.register("mossy_andesite_tiles", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_TILES.get(), stones())),
	MOSSY_ANDESITE_TILE_SLAB = ITEMS.register("mossy_andesite_tile_slab", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_TILE_SLAB.get(), stones())),
	MOSSY_ANDESITE_TILE_STAIRS = ITEMS.register("mossy_andesite_tile_stairs", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_TILE_STAIRS.get(), stones())),
	MOSSY_ANDESITE_TILE_WALL = ITEMS.register("mossy_andesite_tile_wall", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_TILE_WALL.get(), stones())),
	MOSSY_ANDESITE_TILE_GATE = ITEMS.register("mossy_andesite_tile_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_TILE_GATE.get(), stones())),

	// Cracked Andesite Tiles
	CRACKED_ANDESITE_TILES = ITEMS.register("cracked_andesite_tiles", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_TILES.get(), stones())),
	CRACKED_ANDESITE_TILE_SLAB = ITEMS.register("cracked_andesite_tile_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_TILE_SLAB.get(), stones())),
	CRACKED_ANDESITE_TILE_STAIRS = ITEMS.register("cracked_andesite_tile_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_TILE_STAIRS.get(), stones())),
	CRACKED_ANDESITE_TILE_WALL = ITEMS.register("cracked_andesite_tile_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_TILE_WALL.get(), stones())),
	CRACKED_ANDESITE_TILE_GATE = ITEMS.register("cracked_andesite_tile_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_TILE_GATE.get(), stones())),

	// Andesite Pillar
	ANDESITE_PILLAR = ITEMS.register("andesite_pillar", () ->
            new BlockItem(CPlusBlocks.ANDESITE_PILLAR.get(), stones())),
	ANDESITE_CORNER_PILLAR = ITEMS.register("andesite_corner_pillar", () ->
            new BlockItem(CPlusBlocks.ANDESITE_CORNER_PILLAR.get(), stones())),

	// Mossy Andesite Pillar
	MOSSY_ANDESITE_PILLAR = ITEMS.register("mossy_andesite_pillar", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_PILLAR.get(), stones())),
	MOSSY_ANDESITE_CORNER_PILLAR = ITEMS.register("mossy_andesite_corner_pillar", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_CORNER_PILLAR.get(), stones())),

	// Cracked Andesite Pillar
	CRACKED_ANDESITE_PILLAR = ITEMS.register("cracked_andesite_pillar", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_PILLAR.get(), stones())),
	CRACKED_ANDESITE_CORNER_PILLAR = ITEMS.register("cracked_andesite_corner_pillar", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_CORNER_PILLAR.get(), stones())),

	// Chiseled andesite
	CHISELED_ANDESITE = ITEMS.register("chiseled_andesite", () ->
            new BlockItem(CPlusBlocks.CHISELED_ANDESITE.get(), stones())),

	// Mossy Chiseled Andesite
	MOSSY_CHISELED_ANDESITE = ITEMS.register("mossy_chiseled_andesite", () ->
            new BlockItem(CPlusBlocks.MOSSY_CHISELED_ANDESITE.get(), stones())),

	// Cracked Chiseled Andesite
	CRACKED_CHISELED_ANDESITE = ITEMS.register("cracked_chiseled_andesite", () ->
            new BlockItem(CPlusBlocks.CRACKED_CHISELED_ANDESITE.get(), stones())),

	// Carved Andesite
	CARVED_ANDESITE = ITEMS.register("carved_andesite", () ->
            new BlockItem(CPlusBlocks.CARVED_ANDESITE.get(), stones())),

	// Mossy Carved Andesite
	MOSSY_CARVED_ANDESITE = ITEMS.register("mossy_carved_andesite", () ->
            new BlockItem(CPlusBlocks.MOSSY_CARVED_ANDESITE.get(), stones())),

	// Cracked Carved Andesite
	CRACKED_CARVED_ANDESITE = ITEMS.register("cracked_carved_andesite", () ->
            new BlockItem(CPlusBlocks.CRACKED_CARVED_ANDESITE.get(), stones())),


// DIORITE

	// Base
	DIORITE_GATE = ITEMS.register("diorite_gate", () ->
            new BlockItem(CPlusBlocks.DIORITE_GATE.get(), stones())),

	// Cobbled Diorite
	COBBLED_DIORITE = ITEMS.register("cobbled_diorite", () ->
            new BlockItem(CPlusBlocks.COBBLED_DIORITE.get(), stones())),
	COBBLED_DIORITE_SLAB = ITEMS.register("cobbled_diorite_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_DIORITE_SLAB.get(), stones())),
	COBBLED_DIORITE_STAIRS = ITEMS.register("cobbled_diorite_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_DIORITE_STAIRS.get(), stones())),
	COBBLED_DIORITE_WALL = ITEMS.register("cobbled_diorite_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_DIORITE_WALL.get(), stones())),
	COBBLED_DIORITE_GATE = ITEMS.register("cobbled_diorite_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_DIORITE_GATE.get(), stones())),

	// Polished Diorite
	POLISHED_DIORITE_WALL = ITEMS.register("polished_diorite_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_DIORITE_WALL.get(), stones())),
	POLISHED_DIORITE_GATE = ITEMS.register("polished_diorite_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_DIORITE_GATE.get(), stones())),

	// Smooth Diorite
	SMOOTH_DIORITE = ITEMS.register("smooth_diorite", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DIORITE.get(), stones())),
	SMOOTH_DIORITE_SLAB = ITEMS.register("smooth_diorite_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DIORITE_SLAB.get(), stones())),
	SMOOTH_DIORITE_STAIRS = ITEMS.register("smooth_diorite_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DIORITE_STAIRS.get(), stones())),
	SMOOTH_DIORITE_WALL = ITEMS.register("smooth_diorite_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DIORITE_WALL.get(), stones())),
	SMOOTH_DIORITE_GATE = ITEMS.register("smooth_diorite_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DIORITE_GATE.get(), stones())),

	// Diorite Bricks
	DIORITE_BRICKS = ITEMS.register("diorite_bricks", () ->
            new BlockItem(CPlusBlocks.DIORITE_BRICKS.get(), stones())),
	DIORITE_BRICK_SLAB = ITEMS.register("diorite_brick_slab", () ->
            new BlockItem(CPlusBlocks.DIORITE_BRICK_SLAB.get(), stones())),
	DIORITE_BRICK_STAIRS = ITEMS.register("diorite_brick_stairs", () ->
            new BlockItem(CPlusBlocks.DIORITE_BRICK_STAIRS.get(), stones())),
	DIORITE_BRICK_WALL = ITEMS.register("diorite_brick_wall", () ->
            new BlockItem(CPlusBlocks.DIORITE_BRICK_WALL.get(), stones())),
	DIORITE_BRICK_GATE = ITEMS.register("diorite_brick_gate", () ->
            new BlockItem(CPlusBlocks.DIORITE_BRICK_GATE.get(), stones())),

	// Cut Diorite
	CUT_DIORITE = ITEMS.register("cut_diorite", () ->
            new BlockItem(CPlusBlocks.CUT_DIORITE.get(), stones())),
	CUT_DIORITE_SLAB = ITEMS.register("cut_diorite_slab", () ->
            new BlockItem(CPlusBlocks.CUT_DIORITE_SLAB.get(), stones())),
	CUT_DIORITE_STAIRS = ITEMS.register("cut_diorite_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_DIORITE_STAIRS.get(), stones())),
	CUT_DIORITE_WALL = ITEMS.register("cut_diorite_wall", () ->
            new BlockItem(CPlusBlocks.CUT_DIORITE_WALL.get(), stones())),
	CUT_DIORITE_GATE = ITEMS.register("cut_diorite_gate", () ->
            new BlockItem(CPlusBlocks.CUT_DIORITE_GATE.get(), stones())),

	// Diorite Tiles
	DIORITE_TILES = ITEMS.register("diorite_tiles", () ->
            new BlockItem(CPlusBlocks.DIORITE_TILES.get(), stones())),
	DIORITE_TILE_SLAB = ITEMS.register("diorite_tile_slab", () ->
            new BlockItem(CPlusBlocks.DIORITE_TILE_SLAB.get(), stones())),
	DIORITE_TILE_STAIRS = ITEMS.register("diorite_tile_stairs", () ->
            new BlockItem(CPlusBlocks.DIORITE_TILE_STAIRS.get(), stones())),
	DIORITE_TILE_WALL = ITEMS.register("diorite_tile_wall", () ->
            new BlockItem(CPlusBlocks.DIORITE_TILE_WALL.get(), stones())),
	DIORITE_TILE_GATE = ITEMS.register("diorite_tile_gate", () ->
            new BlockItem(CPlusBlocks.DIORITE_TILE_GATE.get(), stones())),

	// Diorite Pillar
	DIORITE_PILLAR = ITEMS.register("diorite_pillar", () ->
            new BlockItem(CPlusBlocks.DIORITE_PILLAR.get(), stones())),
	DIORITE_CORNER_PILLAR = ITEMS.register("diorite_corner_pillar", () ->
            new BlockItem(CPlusBlocks.DIORITE_CORNER_PILLAR.get(), stones())),

	// Chiseled Diorite
	CHISELED_DIORITE = ITEMS.register("chiseled_diorite", () ->
            new BlockItem(CPlusBlocks.CHISELED_DIORITE.get(), stones())),

	// Carved Diorite
	CARVED_DIORITE = ITEMS.register("carved_diorite", () ->
            new BlockItem(CPlusBlocks.CARVED_DIORITE.get(), stones())),


// GRANITE

	// Base
	GRANITE_GATE = ITEMS.register("granite_gate", () ->
            new BlockItem(CPlusBlocks.GRANITE_GATE.get(), stones())),

	// Cobbled Granite
	COBBLED_GRANITE = ITEMS.register("cobbled_granite", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRANITE.get(), stones())),
	COBBLED_GRANITE_SLAB = ITEMS.register("cobbled_granite_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRANITE_SLAB.get(), stones())),
	COBBLED_GRANITE_STAIRS = ITEMS.register("cobbled_granite_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRANITE_STAIRS.get(), stones())),
	COBBLED_GRANITE_WALL = ITEMS.register("cobbled_granite_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRANITE_WALL.get(), stones())),
	COBBLED_GRANITE_GATE = ITEMS.register("cobbled_granite_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRANITE_GATE.get(), stones())),

	// Polished Granite
	POLISHED_GRANITE_WALL = ITEMS.register("polished_granite_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRANITE_WALL.get(), stones())),
	POLISHED_GRANITE_GATE = ITEMS.register("polished_granite_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRANITE_GATE.get(), stones())),

	// Smooth Granite
	SMOOTH_GRANITE = ITEMS.register("smooth_granite", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRANITE.get(), stones())),
	SMOOTH_GRANITE_SLAB = ITEMS.register("smooth_granite_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRANITE_SLAB.get(), stones())),
	SMOOTH_GRANITE_STAIRS = ITEMS.register("smooth_granite_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRANITE_STAIRS.get(), stones())),
	SMOOTH_GRANITE_WALL = ITEMS.register("smooth_granite_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRANITE_WALL.get(), stones())),
	SMOOTH_GRANITE_GATE = ITEMS.register("smooth_granite_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRANITE_GATE.get(), stones())),

	// Granite Bricks
	GRANITE_BRICKS = ITEMS.register("granite_bricks", () ->
            new BlockItem(CPlusBlocks.GRANITE_BRICKS.get(), stones())),
	GRANITE_BRICK_SLAB = ITEMS.register("granite_brick_slab", () ->
            new BlockItem(CPlusBlocks.GRANITE_BRICK_SLAB.get(), stones())),
	GRANITE_BRICK_STAIRS = ITEMS.register("granite_brick_stairs", () ->
            new BlockItem(CPlusBlocks.GRANITE_BRICK_STAIRS.get(), stones())),
	GRANITE_BRICK_WALL = ITEMS.register("granite_brick_wall", () ->
            new BlockItem(CPlusBlocks.GRANITE_BRICK_WALL.get(), stones())),
	GRANITE_BRICK_GATE = ITEMS.register("granite_brick_gate", () ->
            new BlockItem(CPlusBlocks.GRANITE_BRICK_GATE.get(), stones())),

	// Cut Granite
	CUT_GRANITE = ITEMS.register("cut_granite", () ->
            new BlockItem(CPlusBlocks.CUT_GRANITE.get(), stones())),
	CUT_GRANITE_SLAB = ITEMS.register("cut_granite_slab", () ->
            new BlockItem(CPlusBlocks.CUT_GRANITE_SLAB.get(), stones())),
	CUT_GRANITE_STAIRS = ITEMS.register("cut_granite_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_GRANITE_STAIRS.get(), stones())),
	CUT_GRANITE_WALL = ITEMS.register("cut_granite_wall", () ->
            new BlockItem(CPlusBlocks.CUT_GRANITE_WALL.get(), stones())),
	CUT_GRANITE_GATE = ITEMS.register("cut_granite_gate", () ->
            new BlockItem(CPlusBlocks.CUT_GRANITE_GATE.get(), stones())),

	// Granite Tiles
	GRANITE_TILES = ITEMS.register("granite_tiles", () ->
            new BlockItem(CPlusBlocks.GRANITE_TILES.get(), stones())),
	GRANITE_TILE_SLAB = ITEMS.register("granite_tile_slab", () ->
            new BlockItem(CPlusBlocks.GRANITE_TILE_SLAB.get(), stones())),
	GRANITE_TILE_STAIRS = ITEMS.register("granite_tile_stairs", () ->
            new BlockItem(CPlusBlocks.GRANITE_TILE_STAIRS.get(), stones())),
	GRANITE_TILE_WALL = ITEMS.register("granite_tile_wall", () ->
            new BlockItem(CPlusBlocks.GRANITE_TILE_WALL.get(), stones())),
	GRANITE_TILE_GATE = ITEMS.register("granite_tile_gate", () ->
            new BlockItem(CPlusBlocks.GRANITE_TILE_GATE.get(), stones())),

	// Granite Pillar
	GRANITE_PILLAR = ITEMS.register("granite_pillar", () ->
            new BlockItem(CPlusBlocks.GRANITE_PILLAR.get(), stones())),
	GRANITE_CORNER_PILLAR = ITEMS.register("granite_corner_pillar", () ->
            new BlockItem(CPlusBlocks.GRANITE_CORNER_PILLAR.get(), stones())),

	// Chiseled Granite
	CHISELED_GRANITE = ITEMS.register("chiseled_granite", () ->
            new BlockItem(CPlusBlocks.CHISELED_GRANITE.get(), stones())),

	// Carved Granite
	CARVED_GRANITE = ITEMS.register("carved_granite", () ->
            new BlockItem(CPlusBlocks.CARVED_GRANITE.get(), stones())),


// CALCITE

	// Base
	CALCITE_SLAB = ITEMS.register("calcite_slab", () ->
            new BlockItem(CPlusBlocks.CALCITE_SLAB.get(), stones())),
	CALCITE_STAIRS = ITEMS.register("calcite_stairs", () ->
            new BlockItem(CPlusBlocks.CALCITE_STAIRS.get(), stones())),
	CALCITE_WALL = ITEMS.register("calcite_wall", () ->
            new BlockItem(CPlusBlocks.CALCITE_WALL.get(), stones())),
	CALCITE_GATE = ITEMS.register("calcite_gate", () ->
            new BlockItem(CPlusBlocks.CALCITE_GATE.get(), stones())),

	// Cobbled Calcite
	COBBLED_CALCITE = ITEMS.register("cobbled_calcite", () ->
            new BlockItem(CPlusBlocks.COBBLED_CALCITE.get(), stones())),
	COBBLED_CALCITE_SLAB = ITEMS.register("cobbled_calcite_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_CALCITE_SLAB.get(), stones())),
	COBBLED_CALCITE_STAIRS = ITEMS.register("cobbled_calcite_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_CALCITE_STAIRS.get(), stones())),
	COBBLED_CALCITE_WALL = ITEMS.register("cobbled_calcite_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_CALCITE_WALL.get(), stones())),
	COBBLED_CALCITE_GATE = ITEMS.register("cobbled_calcite_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_CALCITE_GATE.get(), stones())),

	// Polished Calcite
	POLISHED_CALCITE = ITEMS.register("polished_calcite", () ->
            new BlockItem(CPlusBlocks.POLISHED_CALCITE.get(), stones())),
	POLISHED_CALCITE_SLAB = ITEMS.register("polished_calcite_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_CALCITE_SLAB.get(), stones())),
	POLISHED_CALCITE_STAIRS = ITEMS.register("polished_calcite_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_CALCITE_STAIRS.get(), stones())),
	POLISHED_CALCITE_WALL = ITEMS.register("polished_calcite_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_CALCITE_WALL.get(), stones())),
	POLISHED_CALCITE_GATE = ITEMS.register("polished_calcite_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_CALCITE_GATE.get(), stones())),

	// Smooth Calcite
	SMOOTH_CALCITE = ITEMS.register("smooth_calcite", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CALCITE.get(), stones())),
	SMOOTH_CALCITE_SLAB = ITEMS.register("smooth_calcite_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CALCITE_SLAB.get(), stones())),
	SMOOTH_CALCITE_STAIRS = ITEMS.register("smooth_calcite_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CALCITE_STAIRS.get(), stones())),
	SMOOTH_CALCITE_WALL = ITEMS.register("smooth_calcite_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CALCITE_WALL.get(), stones())),
	SMOOTH_CALCITE_GATE = ITEMS.register("smooth_calcite_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CALCITE_GATE.get(), stones())),

	// Calcite Bricks
	CALCITE_BRICKS = ITEMS.register("calcite_bricks", () ->
            new BlockItem(CPlusBlocks.CALCITE_BRICKS.get(), stones())),
	CALCITE_BRICK_SLAB = ITEMS.register("calcite_brick_slab", () ->
            new BlockItem(CPlusBlocks.CALCITE_BRICK_SLAB.get(), stones())),
	CALCITE_BRICK_STAIRS = ITEMS.register("calcite_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CALCITE_BRICK_STAIRS.get(), stones())),
	CALCITE_BRICK_WALL = ITEMS.register("calcite_brick_wall", () ->
            new BlockItem(CPlusBlocks.CALCITE_BRICK_WALL.get(), stones())),
	CALCITE_BRICK_GATE = ITEMS.register("calcite_brick_gate", () ->
            new BlockItem(CPlusBlocks.CALCITE_BRICK_GATE.get(), stones())),

	// Cut Calcite
	CUT_CALCITE = ITEMS.register("cut_calcite", () ->
            new BlockItem(CPlusBlocks.CUT_CALCITE.get(), stones())),
	CUT_CALCITE_SLAB = ITEMS.register("cut_calcite_slab", () ->
            new BlockItem(CPlusBlocks.CUT_CALCITE_SLAB.get(), stones())),
	CUT_CALCITE_STAIRS = ITEMS.register("cut_calcite_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_CALCITE_STAIRS.get(), stones())),
	CUT_CALCITE_WALL = ITEMS.register("cut_calcite_wall", () ->
            new BlockItem(CPlusBlocks.CUT_CALCITE_WALL.get(), stones())),
	CUT_CALCITE_GATE = ITEMS.register("cut_calcite_gate", () ->
            new BlockItem(CPlusBlocks.CUT_CALCITE_GATE.get(), stones())),

	// Calcite Tiles
	CALCITE_TILES = ITEMS.register("calcite_tiles", () ->
            new BlockItem(CPlusBlocks.CALCITE_TILES.get(), stones())),
	CALCITE_TILE_SLAB = ITEMS.register("calcite_tile_slab", () ->
            new BlockItem(CPlusBlocks.CALCITE_TILE_SLAB.get(), stones())),
	CALCITE_TILE_STAIRS = ITEMS.register("calcite_tile_stairs", () ->
            new BlockItem(CPlusBlocks.CALCITE_TILE_STAIRS.get(), stones())),
	CALCITE_TILE_WALL = ITEMS.register("calcite_tile_wall", () ->
            new BlockItem(CPlusBlocks.CALCITE_TILE_WALL.get(), stones())),
	CALCITE_TILE_GATE = ITEMS.register("calcite_tile_gate", () ->
            new BlockItem(CPlusBlocks.CALCITE_TILE_GATE.get(), stones())),

	// Calcite Pillar
	CALCITE_PILLAR = ITEMS.register("calcite_pillar", () ->
            new BlockItem(CPlusBlocks.CALCITE_PILLAR.get(), stones())),
	CALCITE_CORNER_PILLAR = ITEMS.register("calcite_corner_pillar", () ->
            new BlockItem(CPlusBlocks.CALCITE_CORNER_PILLAR.get(), stones())),

	// Chiseled Calcite
	CHISELED_CALCITE = ITEMS.register("chiseled_calcite", () ->
            new BlockItem(CPlusBlocks.CHISELED_CALCITE.get(), stones())),

	// Carved Calcite
	CARVED_CALCITE = ITEMS.register("carved_calcite", () ->
            new BlockItem(CPlusBlocks.CARVED_CALCITE.get(), stones())),


// DRIPSTONE

	// Base
	DRIPSTONE_SLAB = ITEMS.register("dripstone_slab", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_SLAB.get(), stones())),
	DRIPSTONE_STAIRS = ITEMS.register("dripstone_stairs", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_STAIRS.get(), stones())),
	DRIPSTONE_WALL = ITEMS.register("dripstone_wall", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_WALL.get(), stones())),
	DRIPSTONE_GATE = ITEMS.register("dripstone_gate", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_GATE.get(), stones())),

	// Cobbled Dripstone
	COBBLED_DRIPSTONE = ITEMS.register("cobbled_dripstone", () ->
            new BlockItem(CPlusBlocks.COBBLED_DRIPSTONE.get(), stones())),
	COBBLED_DRIPSTONE_SLAB = ITEMS.register("cobbled_dripstone_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_DRIPSTONE_SLAB.get(), stones())),
	COBBLED_DRIPSTONE_STAIRS = ITEMS.register("cobbled_dripstone_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_DRIPSTONE_STAIRS.get(), stones())),
	COBBLED_DRIPSTONE_WALL = ITEMS.register("cobbled_dripstone_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_DRIPSTONE_WALL.get(), stones())),
	COBBLED_DRIPSTONE_GATE = ITEMS.register("cobbled_dripstone_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_DRIPSTONE_GATE.get(), stones())),

	// Polished Dripstone
	POLISHED_DRIPSTONE = ITEMS.register("polished_dripstone", () ->
            new BlockItem(CPlusBlocks.POLISHED_DRIPSTONE.get(), stones())),
	POLISHED_DRIPSTONE_SLAB = ITEMS.register("polished_dripstone_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_DRIPSTONE_SLAB.get(), stones())),
	POLISHED_DRIPSTONE_STAIRS = ITEMS.register("polished_dripstone_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_DRIPSTONE_STAIRS.get(), stones())),
	POLISHED_DRIPSTONE_WALL = ITEMS.register("polished_dripstone_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_DRIPSTONE_WALL.get(), stones())),
	POLISHED_DRIPSTONE_GATE = ITEMS.register("polished_dripstone_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_DRIPSTONE_GATE.get(), stones())),

	// Smooth Dripstone
	SMOOTH_DRIPSTONE = ITEMS.register("smooth_dripstone", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DRIPSTONE.get(), stones())),
	SMOOTH_DRIPSTONE_SLAB = ITEMS.register("smooth_dripstone_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DRIPSTONE_SLAB.get(), stones())),
	SMOOTH_DRIPSTONE_STAIRS = ITEMS.register("smooth_dripstone_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DRIPSTONE_STAIRS.get(), stones())),
	SMOOTH_DRIPSTONE_WALL = ITEMS.register("smooth_dripstone_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DRIPSTONE_WALL.get(), stones())),
	SMOOTH_DRIPSTONE_GATE = ITEMS.register("smooth_dripstone_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DRIPSTONE_GATE.get(), stones())),

	// Dripstone Bricks
	DRIPSTONE_BRICKS = ITEMS.register("dripstone_bricks", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_BRICKS.get(), stones())),
	DRIPSTONE_BRICK_SLAB = ITEMS.register("dripstone_brick_slab", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_BRICK_SLAB.get(), stones())),
	DRIPSTONE_BRICK_STAIRS = ITEMS.register("dripstone_brick_stairs", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_BRICK_STAIRS.get(), stones())),
	DRIPSTONE_BRICK_WALL = ITEMS.register("dripstone_brick_wall", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_BRICK_WALL.get(), stones())),
	DRIPSTONE_BRICK_GATE = ITEMS.register("dripstone_brick_gate", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_BRICK_GATE.get(), stones())),

	// Cut Dripstone
	CUT_DRIPSTONE = ITEMS.register("cut_dripstone", () ->
            new BlockItem(CPlusBlocks.CUT_DRIPSTONE.get(), stones())),
	CUT_DRIPSTONE_SLAB = ITEMS.register("cut_dripstone_slab", () ->
            new BlockItem(CPlusBlocks.CUT_DRIPSTONE_SLAB.get(), stones())),
	CUT_DRIPSTONE_STAIRS = ITEMS.register("cut_dripstone_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_DRIPSTONE_STAIRS.get(), stones())),
	CUT_DRIPSTONE_WALL = ITEMS.register("cut_dripstone_wall", () ->
            new BlockItem(CPlusBlocks.CUT_DRIPSTONE_WALL.get(), stones())),
	CUT_DRIPSTONE_GATE = ITEMS.register("cut_dripstone_gate", () ->
            new BlockItem(CPlusBlocks.CUT_DRIPSTONE_GATE.get(), stones())),

	// Dripstone Tiles
	DRIPSTONE_TILES = ITEMS.register("dripstone_tiles", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_TILES.get(), stones())),
	DRIPSTONE_TILE_SLAB = ITEMS.register("dripstone_tile_slab", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_TILE_SLAB.get(), stones())),
	DRIPSTONE_TILE_STAIRS = ITEMS.register("dripstone_tile_stairs", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_TILE_STAIRS.get(), stones())),
	DRIPSTONE_TILE_WALL = ITEMS.register("dripstone_tile_wall", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_TILE_WALL.get(), stones())),
	DRIPSTONE_TILE_GATE = ITEMS.register("dripstone_tile_gate", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_TILE_GATE.get(), stones())),

	// Dripstone Pillar
	DRIPSTONE_PILLAR = ITEMS.register("dripstone_pillar", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_PILLAR.get(), stones())),
	DRIPSTONE_CORNER_PILLAR = ITEMS.register("dripstone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_CORNER_PILLAR.get(), stones())),

	// Chiseled Dripstone
	CHISELED_DRIPSTONE = ITEMS.register("chiseled_dripstone", () ->
            new BlockItem(CPlusBlocks.CHISELED_DRIPSTONE.get(), stones())),

	// Carved Dripstone
	CARVED_DRIPSTONE = ITEMS.register("carved_dripstone", () ->
            new BlockItem(CPlusBlocks.CARVED_DRIPSTONE.get(), stones())),


// TUFF

	// Base
	TUFF_SLAB = ITEMS.register("tuff_slab", () ->
            new BlockItem(CPlusBlocks.TUFF_SLAB.get(), stones())),
	TUFF_STAIRS = ITEMS.register("tuff_stairs", () ->
            new BlockItem(CPlusBlocks.TUFF_STAIRS.get(), stones())),
	TUFF_WALL = ITEMS.register("tuff_wall", () ->
            new BlockItem(CPlusBlocks.TUFF_WALL.get(), stones())),
	TUFF_GATE = ITEMS.register("tuff_gate", () ->
            new BlockItem(CPlusBlocks.TUFF_GATE.get(), stones())),

	// Cobbled Tuff
	COBBLED_TUFF = ITEMS.register("cobbled_tuff", () ->
            new BlockItem(CPlusBlocks.COBBLED_TUFF.get(), stones())),
	COBBLED_TUFF_SLAB = ITEMS.register("cobbled_tuff_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_TUFF_SLAB.get(), stones())),
	COBBLED_TUFF_STAIRS = ITEMS.register("cobbled_tuff_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_TUFF_STAIRS.get(), stones())),
	COBBLED_TUFF_WALL = ITEMS.register("cobbled_tuff_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_TUFF_WALL.get(), stones())),
	COBBLED_TUFF_GATE = ITEMS.register("cobbled_tuff_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_TUFF_GATE.get(), stones())),

	// Polished Tuff
	POLISHED_TUFF = ITEMS.register("polished_tuff", () ->
            new BlockItem(CPlusBlocks.POLISHED_TUFF.get(), stones())),
	POLISHED_TUFF_SLAB = ITEMS.register("polished_tuff_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_TUFF_SLAB.get(), stones())),
	POLISHED_TUFF_STAIRS = ITEMS.register("polished_tuff_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_TUFF_STAIRS.get(), stones())),
	POLISHED_TUFF_WALL = ITEMS.register("polished_tuff_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_TUFF_WALL.get(), stones())),
	POLISHED_TUFF_GATE = ITEMS.register("polished_tuff_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_TUFF_GATE.get(), stones())),

	// Smooth Tuff
	SMOOTH_TUFF = ITEMS.register("smooth_tuff", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TUFF.get(), stones())),
	SMOOTH_TUFF_SLAB = ITEMS.register("smooth_tuff_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TUFF_SLAB.get(), stones())),
	SMOOTH_TUFF_STAIRS = ITEMS.register("smooth_tuff_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TUFF_STAIRS.get(), stones())),
	SMOOTH_TUFF_WALL = ITEMS.register("smooth_tuff_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TUFF_WALL.get(), stones())),
	SMOOTH_TUFF_GATE = ITEMS.register("smooth_tuff_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TUFF_GATE.get(), stones())),

	// Tuff Bricks
	TUFF_BRICKS = ITEMS.register("tuff_bricks", () ->
            new BlockItem(CPlusBlocks.TUFF_BRICKS.get(), stones())),
	TUFF_BRICK_SLAB = ITEMS.register("tuff_brick_slab", () ->
            new BlockItem(CPlusBlocks.TUFF_BRICK_SLAB.get(), stones())),
	TUFF_BRICK_STAIRS = ITEMS.register("tuff_brick_stairs", () ->
            new BlockItem(CPlusBlocks.TUFF_BRICK_STAIRS.get(), stones())),
	TUFF_BRICK_WALL = ITEMS.register("tuff_brick_wall", () ->
            new BlockItem(CPlusBlocks.TUFF_BRICK_WALL.get(), stones())),
	TUFF_BRICK_GATE = ITEMS.register("tuff_brick_gate", () ->
            new BlockItem(CPlusBlocks.TUFF_BRICK_GATE.get(), stones())),

	// Cut Tuff
	CUT_TUFF = ITEMS.register("cut_tuff", () ->
            new BlockItem(CPlusBlocks.CUT_TUFF.get(), stones())),
	CUT_TUFF_SLAB = ITEMS.register("cut_tuff_slab", () ->
            new BlockItem(CPlusBlocks.CUT_TUFF_SLAB.get(), stones())),
	CUT_TUFF_STAIRS = ITEMS.register("cut_tuff_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_TUFF_STAIRS.get(), stones())),
	CUT_TUFF_WALL = ITEMS.register("cut_tuff_wall", () ->
            new BlockItem(CPlusBlocks.CUT_TUFF_WALL.get(), stones())),
	CUT_TUFF_GATE = ITEMS.register("cut_tuff_gate", () ->
            new BlockItem(CPlusBlocks.CUT_TUFF_GATE.get(), stones())),

	// Tuff Tiles
	TUFF_TILES = ITEMS.register("tuff_tiles", () ->
            new BlockItem(CPlusBlocks.TUFF_TILES.get(), stones())),
	TUFF_TILE_SLAB = ITEMS.register("tuff_tile_slab", () ->
            new BlockItem(CPlusBlocks.TUFF_TILE_SLAB.get(), stones())),
	TUFF_TILE_STAIRS = ITEMS.register("tuff_tile_stairs", () ->
            new BlockItem(CPlusBlocks.TUFF_TILE_STAIRS.get(), stones())),
	TUFF_TILE_WALL = ITEMS.register("tuff_tile_wall", () ->
            new BlockItem(CPlusBlocks.TUFF_TILE_WALL.get(), stones())),
	TUFF_TILE_GATE = ITEMS.register("tuff_tile_gate", () ->
            new BlockItem(CPlusBlocks.TUFF_TILE_GATE.get(), stones())),

	// Tuff Pillar
	TUFF_PILLAR = ITEMS.register("tuff_pillar", () ->
            new BlockItem(CPlusBlocks.TUFF_PILLAR.get(), stones())),
	TUFF_CORNER_PILLAR = ITEMS.register("tuff_corner_pillar", () ->
            new BlockItem(CPlusBlocks.TUFF_CORNER_PILLAR.get(), stones())),

	// Chiseled Tuff
	CHISELED_TUFF = ITEMS.register("chiseled_tuff", () ->
            new BlockItem(CPlusBlocks.CHISELED_TUFF.get(), stones())),

	// Carved Tuff
	CARVED_TUFF = ITEMS.register("carved_tuff", () ->
            new BlockItem(CPlusBlocks.CARVED_TUFF.get(), stones())),


// DEEPSLATE

	// Base
	DEEPSLATE_SLAB = ITEMS.register("deepslate_slab", () ->
            new BlockItem(CPlusBlocks.DEEPSLATE_SLAB.get(), stones())),
	DEEPSLATE_STAIRS = ITEMS.register("deepslate_stairs", () ->
            new BlockItem(CPlusBlocks.DEEPSLATE_STAIRS.get(), stones())),
	DEEPSLATE_WALL = ITEMS.register("deepslate_wall", () ->
            new BlockItem(CPlusBlocks.DEEPSLATE_WALL.get(), stones())),
	DEEPSLATE_GATE = ITEMS.register("deepslate_gate", () ->
            new BlockItem(CPlusBlocks.DEEPSLATE_GATE.get(), stones())),

	// Cobbled Deepslate
	COBBLED_DEEPSLATE_GATE = ITEMS.register("cobbled_deepslate_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_DEEPSLATE_GATE.get(), stones())),

	// Polished Deepslate
	POLISHED_DEEPSLATE_GATE = ITEMS.register("polished_deepslate_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_DEEPSLATE_GATE.get(), stones())),

	// Smooth Deepslate
	SMOOTH_DEEPSLATE = ITEMS.register("smooth_deepslate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DEEPSLATE.get(), stones())),
	SMOOTH_DEEPSLATE_SLAB = ITEMS.register("smooth_deepslate_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DEEPSLATE_SLAB.get(), stones())),
	SMOOTH_DEEPSLATE_STAIRS = ITEMS.register("smooth_deepslate_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DEEPSLATE_STAIRS.get(), stones())),
	SMOOTH_DEEPSLATE_WALL = ITEMS.register("smooth_deepslate_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DEEPSLATE_WALL.get(), stones())),
	SMOOTH_DEEPSLATE_GATE = ITEMS.register("smooth_deepslate_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DEEPSLATE_GATE.get(), stones())),

	// Deepslate Bricks
	DEEPSLATE_BRICK_GATE = ITEMS.register("deepslate_brick_gate", () ->
            new BlockItem(CPlusBlocks.DEEPSLATE_BRICK_GATE.get(), stones())),

	// Cracked Deepslate Bricks
	CRACKED_DEEPSLATE_BRICK_SLAB = ITEMS.register("cracked_deepslate_brick_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(), stones())),
	CRACKED_DEEPSLATE_BRICK_STAIRS = ITEMS.register("cracked_deepslate_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(), stones())),
	CRACKED_DEEPSLATE_BRICK_WALL = ITEMS.register("cracked_deepslate_brick_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get(), stones())),
	CRACKED_DEEPSLATE_BRICK_GATE = ITEMS.register("cracked_deepslate_brick_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_GATE.get(), stones())),

	// Cut Deepslate
	CUT_DEEPSLATE = ITEMS.register("cut_deepslate", () ->
            new BlockItem(CPlusBlocks.CUT_DEEPSLATE.get(), stones())),
	CUT_DEEPSLATE_SLAB = ITEMS.register("cut_deepslate_slab", () ->
            new BlockItem(CPlusBlocks.CUT_DEEPSLATE_SLAB.get(), stones())),
	CUT_DEEPSLATE_STAIRS = ITEMS.register("cut_deepslate_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_DEEPSLATE_STAIRS.get(), stones())),
	CUT_DEEPSLATE_WALL = ITEMS.register("cut_deepslate_wall", () ->
            new BlockItem(CPlusBlocks.CUT_DEEPSLATE_WALL.get(), stones())),
	CUT_DEEPSLATE_GATE = ITEMS.register("cut_deepslate_gate", () ->
            new BlockItem(CPlusBlocks.CUT_DEEPSLATE_GATE.get(), stones())),

	// Deepslate Tiles
	DEEPSLATE_TILE_GATE = ITEMS.register("deepslate_tile_gate", () ->
            new BlockItem(CPlusBlocks.DEEPSLATE_TILE_GATE.get(), stones())),

	// Cracked Deepslate Tiles
	CRACKED_DEEPSLATE_TILE_SLAB = ITEMS.register("cracked_deepslate_tile_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(), stones())),
	CRACKED_DEEPSLATE_TILE_STAIRS = ITEMS.register("cracked_deepslate_tile_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(), stones())),
	CRACKED_DEEPSLATE_TILE_WALL = ITEMS.register("cracked_deepslate_tile_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_WALL.get(), stones())),
	CRACKED_DEEPSLATE_TILE_GATE = ITEMS.register("cracked_deepslate_tile_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_GATE.get(), stones())),

	// Deepslate Pillar
	DEEPSLATE_PILLAR = ITEMS.register("deepslate_pillar", () ->
            new BlockItem(CPlusBlocks.DEEPSLATE_PILLAR.get(), stones())),
	DEEPSLATE_CORNER_PILLAR = ITEMS.register("deepslate_corner_pillar", () ->
            new BlockItem(CPlusBlocks.DEEPSLATE_CORNER_PILLAR.get(), stones())),

	// Carved Deepslate
	CARVED_DEEPSLATE = ITEMS.register("carved_deepslate", () ->
            new BlockItem(CPlusBlocks.CARVED_DEEPSLATE.get(), stones())),


// BLACKSTONE

	// Base
	BLACKSTONE_GATE = ITEMS.register("blackstone_gate", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_GATE.get(), stones())),

	// Cobbled Blackstone
	COBBLED_BLACKSTONE = ITEMS.register("cobbled_blackstone", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACKSTONE.get(), stones())),
	COBBLED_BLACKSTONE_SLAB = ITEMS.register("cobbled_blackstone_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACKSTONE_SLAB.get(), stones())),
	COBBLED_BLACKSTONE_STAIRS = ITEMS.register("cobbled_blackstone_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACKSTONE_STAIRS.get(), stones())),
	COBBLED_BLACKSTONE_WALL = ITEMS.register("cobbled_blackstone_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACKSTONE_WALL.get(), stones())),
	COBBLED_BLACKSTONE_GATE = ITEMS.register("cobbled_blackstone_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACKSTONE_GATE.get(), stones())),

	// Polished Blackstone
	POLISHED_BLACKSTONE_GATE = ITEMS.register("polished_blackstone_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACKSTONE_GATE.get(), stones())),

	// Smooth Blackstone
	SMOOTH_BLACKSTONE = ITEMS.register("smooth_blackstone", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACKSTONE.get(), stones())),
	SMOOTH_BLACKSTONE_SLAB = ITEMS.register("smooth_blackstone_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACKSTONE_SLAB.get(), stones())),
	SMOOTH_BLACKSTONE_STAIRS = ITEMS.register("smooth_blackstone_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACKSTONE_STAIRS.get(), stones())),
	SMOOTH_BLACKSTONE_WALL = ITEMS.register("smooth_blackstone_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACKSTONE_WALL.get(), stones())),
	SMOOTH_BLACKSTONE_GATE = ITEMS.register("smooth_blackstone_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACKSTONE_GATE.get(), stones())),

	// Blackstone Bricks
	BLACKSTONE_BRICK_GATE = ITEMS.register("blackstone_brick_gate", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_BRICK_GATE.get(), stones())),

	// Mossy Blackstone Bricks
	MOSSY_BLACKSTONE_BRICKS = ITEMS.register("mossy_blackstone_bricks", () ->
            new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICKS.get(), stones())),
	MOSSY_BLACKSTONE_BRICK_SLAB = ITEMS.register("mossy_blackstone_brick_slab", () ->
            new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICK_SLAB.get(), stones())),
	MOSSY_BLACKSTONE_BRICK_STAIRS = ITEMS.register("mossy_blackstone_brick_stairs", () ->
            new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICK_STAIRS.get(), stones())),
	MOSSY_BLACKSTONE_BRICK_WALL = ITEMS.register("mossy_blackstone_brick_wall", () ->
            new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICK_WALL.get(), stones())),
	MOSSY_BLACKSTONE_BRICK_GATE = ITEMS.register("mossy_blackstone_brick_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICK_GATE.get(), stones())),

	// Cracked Blackstone Bricks
	CRACKED_BLACKSTONE_BRICK_SLAB = ITEMS.register("cracked_blackstone_brick_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_BRICK_SLAB.get(), stones())),
	CRACKED_BLACKSTONE_BRICK_STAIRS = ITEMS.register("cracked_blackstone_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_BRICK_STAIRS.get(), stones())),
	CRACKED_BLACKSTONE_BRICK_WALL = ITEMS.register("cracked_blackstone_brick_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_BRICK_WALL.get(), stones())),
	CRACKED_BLACKSTONE_BRICK_GATE = ITEMS.register("cracked_blackstone_brick_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_BRICK_GATE.get(), stones())),

	// Cut Blackstone
	CUT_BLACKSTONE = ITEMS.register("cut_blackstone", () ->
            new BlockItem(CPlusBlocks.CUT_BLACKSTONE.get(), stones())),
	CUT_BLACKSTONE_SLAB = ITEMS.register("cut_blackstone_slab", () ->
            new BlockItem(CPlusBlocks.CUT_BLACKSTONE_SLAB.get(), stones())),
	CUT_BLACKSTONE_STAIRS = ITEMS.register("cut_blackstone_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_BLACKSTONE_STAIRS.get(), stones())),
	CUT_BLACKSTONE_WALL = ITEMS.register("cut_blackstone_wall", () ->
            new BlockItem(CPlusBlocks.CUT_BLACKSTONE_WALL.get(), stones())),
	CUT_BLACKSTONE_GATE = ITEMS.register("cut_blackstone_gate", () ->
            new BlockItem(CPlusBlocks.CUT_BLACKSTONE_GATE.get(), stones())),

	// Blackstone Tiles
	BLACKSTONE_TILES = ITEMS.register("blackstone_tiles", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_TILES.get(), stones())),
	BLACKSTONE_TILE_SLAB = ITEMS.register("blackstone_tile_slab", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_TILE_SLAB.get(), stones())),
	BLACKSTONE_TILE_STAIRS = ITEMS.register("blackstone_tile_stairs", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_TILE_STAIRS.get(), stones())),
	BLACKSTONE_TILE_WALL = ITEMS.register("blackstone_tile_wall", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_TILE_WALL.get(), stones())),
	BLACKSTONE_TILE_GATE = ITEMS.register("blackstone_tile_gate", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_TILE_GATE.get(), stones())),

	// Blackstone Pillar
	BLACKSTONE_PILLAR = ITEMS.register("blackstone_pillar", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_PILLAR.get(), stones())),
	BLACKSTONE_CORNER_PILLAR = ITEMS.register("blackstone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_CORNER_PILLAR.get(), stones())),

	// Mossy Blackstone Pillar
	MOSSY_BLACKSTONE_PILLAR = ITEMS.register("mossy_blackstone_pillar", () ->
            new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_PILLAR.get(), stones())),
	MOSSY_BLACKSTONE_CORNER_PILLAR = ITEMS.register("mossy_blackstone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_CORNER_PILLAR.get(), stones())),

	// Cracked Blackstone Pillar
	CRACKED_BLACKSTONE_PILLAR = ITEMS.register("cracked_blackstone_pillar", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_PILLAR.get(), stones())),
	CRACKED_BLACKSTONE_CORNER_PILLAR = ITEMS.register("cracked_blackstone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_CORNER_PILLAR.get(), stones())),

	// Chiseled Blackstone
	CHISELED_BLACKSTONE = ITEMS.register("chiseled_blackstone", () ->
            new BlockItem(CPlusBlocks.CHISELED_BLACKSTONE.get(), stones())),

	// Mossy Chiseled Blackstone
	MOSSY_CHISELED_BLACKSTONE = ITEMS.register("mossy_chiseled_blackstone", () ->
            new BlockItem(CPlusBlocks.MOSSY_CHISELED_BLACKSTONE.get(), stones())),

	// Cracked Chiseled Blackstone
	CRACKED_CHISELED_BLACKSTONE = ITEMS.register("cracked_chiseled_blackstone", () ->
            new BlockItem(CPlusBlocks.CRACKED_CHISELED_BLACKSTONE.get(), stones())),

	// Mossy Carved Blackstone
	MOSSY_CARVED_BLACKSTONE = ITEMS.register("mossy_carved_blackstone", () ->
            new BlockItem(CPlusBlocks.MOSSY_CARVED_BLACKSTONE.get(), stones())),

	// Cracked Carved Blackstone
	CRACKED_CARVED_BLACKSTONE = ITEMS.register("cracked_carved_blackstone", () ->
            new BlockItem(CPlusBlocks.CRACKED_CARVED_BLACKSTONE.get(), stones())),


// SANDSTONE

	// Base
	SANDSTONE_GATE = ITEMS.register("sandstone_gate", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_GATE.get(), stones())),

	// Cobbled Sandstone
	COBBLED_SANDSTONE = ITEMS.register("cobbled_sandstone", () ->
            new BlockItem(CPlusBlocks.COBBLED_SANDSTONE.get(), stones())),
	COBBLED_SANDSTONE_SLAB = ITEMS.register("cobbled_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_SANDSTONE_SLAB.get(), stones())),
	COBBLED_SANDSTONE_STAIRS = ITEMS.register("cobbled_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_SANDSTONE_STAIRS.get(), stones())),
	COBBLED_SANDSTONE_WALL = ITEMS.register("cobbled_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_SANDSTONE_WALL.get(), stones())),
	COBBLED_SANDSTONE_GATE = ITEMS.register("cobbled_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_SANDSTONE_GATE.get(), stones())),

	// Polished Sandstone
	POLISHED_SANDSTONE = ITEMS.register("polished_sandstone", () ->
            new BlockItem(CPlusBlocks.POLISHED_SANDSTONE.get(), stones())),
	POLISHED_SANDSTONE_SLAB = ITEMS.register("polished_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_SANDSTONE_SLAB.get(), stones())),
	POLISHED_SANDSTONE_STAIRS = ITEMS.register("polished_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_SANDSTONE_STAIRS.get(), stones())),
	POLISHED_SANDSTONE_WALL = ITEMS.register("polished_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_SANDSTONE_WALL.get(), stones())),
	POLISHED_SANDSTONE_GATE = ITEMS.register("polished_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_SANDSTONE_GATE.get(), stones())),

	// Smooth Sandstone
	SMOOTH_SANDSTONE_WALL = ITEMS.register("smooth_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_SANDSTONE_WALL.get(), stones())),
	SMOOTH_SANDSTONE_GATE = ITEMS.register("smooth_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_SANDSTONE_GATE.get(), stones())),

	// Sandstone Bricks
	SANDSTONE_BRICKS = ITEMS.register("sandstone_bricks", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_BRICKS.get(), stones())),
	SANDSTONE_BRICK_SLAB = ITEMS.register("sandstone_brick_slab", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_BRICK_SLAB.get(), stones())),
	SANDSTONE_BRICK_STAIRS = ITEMS.register("sandstone_brick_stairs", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_BRICK_STAIRS.get(), stones())),
	SANDSTONE_BRICK_WALL = ITEMS.register("sandstone_brick_wall", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_BRICK_WALL.get(), stones())),
	SANDSTONE_BRICK_GATE = ITEMS.register("sandstone_brick_gate", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_BRICK_GATE.get(), stones())),

	// Cut Sandstone
	CUT_SANDSTONE_STAIRS = ITEMS.register("cut_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_SANDSTONE_STAIRS.get(), stones())),
	CUT_SANDSTONE_WALL = ITEMS.register("cut_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.CUT_SANDSTONE_WALL.get(), stones())),
	CUT_SANDSTONE_GATE = ITEMS.register("cut_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.CUT_SANDSTONE_GATE.get(), stones())),

	// Sandstone Tiles
	SANDSTONE_TILES = ITEMS.register("sandstone_tiles", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_TILES.get(), stones())),
	SANDSTONE_TILE_SLAB = ITEMS.register("sandstone_tile_slab", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_TILE_SLAB.get(), stones())),
	SANDSTONE_TILE_STAIRS = ITEMS.register("sandstone_tile_stairs", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_TILE_STAIRS.get(), stones())),
	SANDSTONE_TILE_WALL = ITEMS.register("sandstone_tile_wall", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_TILE_WALL.get(), stones())),
	SANDSTONE_TILE_GATE = ITEMS.register("sandstone_tile_gate", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_TILE_GATE.get(), stones())),

	// Sandstone Pillar
	SANDSTONE_PILLAR = ITEMS.register("sandstone_pillar", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_PILLAR.get(), stones())),
	SANDSTONE_CORNER_PILLAR = ITEMS.register("sandstone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_CORNER_PILLAR.get(), stones())),

	// Chiseled Sandstone
	CHISELED_SANDSTONE = ITEMS.register("chiseled_sandstone", () ->
            new BlockItem(CPlusBlocks.CHISELED_SANDSTONE.get(), stones())),


// RED SANDSTONE

	// Base
	RED_SANDSTONE_GATE = ITEMS.register("red_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_GATE.get(), stones())),

	// Cobbled Red Sandstone
	COBBLED_RED_SANDSTONE = ITEMS.register("cobbled_red_sandstone", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_SANDSTONE.get(), stones())),
	COBBLED_RED_SANDSTONE_SLAB = ITEMS.register("cobbled_red_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_SANDSTONE_SLAB.get(), stones())),
	COBBLED_RED_SANDSTONE_STAIRS = ITEMS.register("cobbled_red_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_SANDSTONE_STAIRS.get(), stones())),
	COBBLED_RED_SANDSTONE_WALL = ITEMS.register("cobbled_red_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_SANDSTONE_WALL.get(), stones())),
	COBBLED_RED_SANDSTONE_GATE = ITEMS.register("cobbled_red_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_SANDSTONE_GATE.get(), stones())),

	// Polished Red Sandstone
	POLISHED_RED_SANDSTONE = ITEMS.register("polished_red_sandstone", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_SANDSTONE.get(), stones())),
	POLISHED_RED_SANDSTONE_SLAB = ITEMS.register("polished_red_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_SANDSTONE_SLAB.get(), stones())),
	POLISHED_RED_SANDSTONE_STAIRS = ITEMS.register("polished_red_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_SANDSTONE_STAIRS.get(), stones())),
	POLISHED_RED_SANDSTONE_WALL = ITEMS.register("polished_red_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_SANDSTONE_WALL.get(), stones())),
	POLISHED_RED_SANDSTONE_GATE = ITEMS.register("polished_red_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_SANDSTONE_GATE.get(), stones())),

	// Smooth Red Sandstone
	SMOOTH_RED_SANDSTONE_WALL = ITEMS.register("smooth_red_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_SANDSTONE_WALL.get(), stones())),
	SMOOTH_RED_SANDSTONE_GATE = ITEMS.register("smooth_red_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_SANDSTONE_GATE.get(), stones())),

	// Red Sandstone Bricks
	RED_SANDSTONE_BRICKS = ITEMS.register("red_sandstone_bricks", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_BRICKS.get(), stones())),
	RED_SANDSTONE_BRICK_SLAB = ITEMS.register("red_sandstone_brick_slab", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_BRICK_SLAB.get(), stones())),
	RED_SANDSTONE_BRICK_STAIRS = ITEMS.register("red_sandstone_brick_stairs", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_BRICK_STAIRS.get(), stones())),
	RED_SANDSTONE_BRICK_WALL = ITEMS.register("red_sandstone_brick_wall", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_BRICK_WALL.get(), stones())),
	RED_SANDSTONE_BRICK_GATE = ITEMS.register("red_sandstone_brick_gate", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_BRICK_GATE.get(), stones())),

	// Cut Red Sandstone
	CUT_RED_SANDSTONE_STAIRS = ITEMS.register("cut_red_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_RED_SANDSTONE_STAIRS.get(), stones())),
	CUT_RED_SANDSTONE_WALL = ITEMS.register("cut_red_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.CUT_RED_SANDSTONE_WALL.get(), stones())),
	CUT_RED_SANDSTONE_GATE = ITEMS.register("cut_red_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.CUT_RED_SANDSTONE_GATE.get(), stones())),

	// Red Sandstone Tiles
	RED_SANDSTONE_TILES = ITEMS.register("red_sandstone_tiles", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_TILES.get(), stones())),
	RED_SANDSTONE_TILE_SLAB = ITEMS.register("red_sandstone_tile_slab", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_TILE_SLAB.get(), stones())),
	RED_SANDSTONE_TILE_STAIRS = ITEMS.register("red_sandstone_tile_stairs", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_TILE_STAIRS.get(), stones())),
	RED_SANDSTONE_TILE_WALL = ITEMS.register("red_sandstone_tile_wall", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_TILE_WALL.get(), stones())),
	RED_SANDSTONE_TILE_GATE = ITEMS.register("red_sandstone_tile_gate", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_TILE_GATE.get(), stones())),

	// Red Sandstone Pillar
	RED_SANDSTONE_PILLAR = ITEMS.register("red_sandstone_pillar", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_PILLAR.get(), stones())),
	RED_SANDSTONE_CORNER_PILLAR = ITEMS.register("red_sandstone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_CORNER_PILLAR.get(), stones())),

	// Chiseled Red Sandstone
	CHISELED_RED_SANDSTONE = ITEMS.register("chiseled_red_sandstone", () ->
            new BlockItem(CPlusBlocks.CHISELED_RED_SANDSTONE.get(), stones())),


// SOUL SANDSTONE

	// Base
	SOUL_SANDSTONE = ITEMS.register("soul_sandstone", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE.get(), stones())),
	SOUL_SANDSTONE_SLAB = ITEMS.register("soul_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_SLAB.get(), stones())),
	SOUL_SANDSTONE_STAIRS = ITEMS.register("soul_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_STAIRS.get(), stones())),
	SOUL_SANDSTONE_WALL = ITEMS.register("soul_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_WALL.get(), stones())),
	SOUL_SANDSTONE_GATE = ITEMS.register("soul_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_GATE.get(), stones())),

	// Cobbled Soul Sandstone
	COBBLED_SOUL_SANDSTONE = ITEMS.register("cobbled_soul_sandstone", () ->
            new BlockItem(CPlusBlocks.COBBLED_SOUL_SANDSTONE.get(), stones())),
	COBBLED_SOUL_SANDSTONE_SLAB = ITEMS.register("cobbled_soul_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_SOUL_SANDSTONE_SLAB.get(), stones())),
	COBBLED_SOUL_SANDSTONE_STAIRS = ITEMS.register("cobbled_soul_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_SOUL_SANDSTONE_STAIRS.get(), stones())),
	COBBLED_SOUL_SANDSTONE_WALL = ITEMS.register("cobbled_soul_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_SOUL_SANDSTONE_WALL.get(), stones())),
	COBBLED_SOUL_SANDSTONE_GATE = ITEMS.register("cobbled_soul_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_SOUL_SANDSTONE_GATE.get(), stones())),

	// Polished Soul Sandstone
	POLISHED_SOUL_SANDSTONE = ITEMS.register("polished_soul_sandstone", () ->
            new BlockItem(CPlusBlocks.POLISHED_SOUL_SANDSTONE.get(), stones())),
	POLISHED_SOUL_SANDSTONE_SLAB = ITEMS.register("polished_soul_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_SOUL_SANDSTONE_SLAB.get(), stones())),
	POLISHED_SOUL_SANDSTONE_STAIRS = ITEMS.register("polished_soul_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_SOUL_SANDSTONE_STAIRS.get(), stones())),
	POLISHED_SOUL_SANDSTONE_WALL = ITEMS.register("polished_soul_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_SOUL_SANDSTONE_WALL.get(), stones())),
	POLISHED_SOUL_SANDSTONE_GATE = ITEMS.register("polished_soul_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_SOUL_SANDSTONE_GATE.get(), stones())),

	// Smooth Soul Sandstone
	SMOOTH_SOUL_SANDSTONE = ITEMS.register("smooth_soul_sandstone", () ->
            new BlockItem(CPlusBlocks.SMOOTH_SOUL_SANDSTONE.get(), stones())),
	SMOOTH_SOUL_SANDSTONE_SLAB = ITEMS.register("smooth_soul_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_SOUL_SANDSTONE_SLAB.get(), stones())),
	SMOOTH_SOUL_SANDSTONE_STAIRS = ITEMS.register("smooth_soul_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS.get(), stones())),
	SMOOTH_SOUL_SANDSTONE_WALL = ITEMS.register("smooth_soul_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_SOUL_SANDSTONE_WALL.get(), stones())),
	SMOOTH_SOUL_SANDSTONE_GATE = ITEMS.register("smooth_soul_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_SOUL_SANDSTONE_GATE.get(), stones())),

	// Soul Sandstone Bricks
	SOUL_SANDSTONE_BRICKS = ITEMS.register("soul_sandstone_bricks", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_BRICKS.get(), stones())),
	SOUL_SANDSTONE_BRICK_SLAB = ITEMS.register("soul_sandstone_brick_slab", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_BRICK_SLAB.get(), stones())),
	SOUL_SANDSTONE_BRICK_STAIRS = ITEMS.register("soul_sandstone_brick_stairs", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_BRICK_STAIRS.get(), stones())),
	SOUL_SANDSTONE_BRICK_WALL = ITEMS.register("soul_sandstone_brick_wall", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_BRICK_WALL.get(), stones())),
	SOUL_SANDSTONE_BRICK_GATE = ITEMS.register("soul_sandstone_brick_gate", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_BRICK_GATE.get(), stones())),

	// Cut Soul Sandstone
	CUT_SOUL_SANDSTONE = ITEMS.register("cut_soul_sandstone", () ->
            new BlockItem(CPlusBlocks.CUT_SOUL_SANDSTONE.get(), stones())),
	CUT_SOUL_SANDSTONE_SLAB = ITEMS.register("cut_soul_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.CUT_SOUL_SANDSTONE_SLAB.get(), stones())),
	CUT_SOUL_SANDSTONE_STAIRS = ITEMS.register("cut_soul_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_SOUL_SANDSTONE_STAIRS.get(), stones())),
	CUT_SOUL_SANDSTONE_WALL = ITEMS.register("cut_soul_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.CUT_SOUL_SANDSTONE_WALL.get(), stones())),
	CUT_SOUL_SANDSTONE_GATE = ITEMS.register("cut_soul_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.CUT_SOUL_SANDSTONE_GATE.get(), stones())),

	// Soul Sandstone Tiles
	SOUL_SANDSTONE_TILES = ITEMS.register("soul_sandstone_tiles", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_TILES.get(), stones())),
	SOUL_SANDSTONE_TILE_SLAB = ITEMS.register("soul_sandstone_tile_slab", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_TILE_SLAB.get(), stones())),
	SOUL_SANDSTONE_TILE_STAIRS = ITEMS.register("soul_sandstone_tile_stairs", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_TILE_STAIRS.get(), stones())),
	SOUL_SANDSTONE_TILE_WALL = ITEMS.register("soul_sandstone_tile_wall", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_TILE_WALL.get(), stones())),
	SOUL_SANDSTONE_TILE_GATE = ITEMS.register("soul_sandstone_tile_gate", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_TILE_GATE.get(), stones())),

	// Soul Sandstone Pillar
	SOUL_SANDSTONE_PILLAR = ITEMS.register("soul_sandstone_pillar", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_PILLAR.get(), stones())),
	SOUL_SANDSTONE_CORNER_PILLAR = ITEMS.register("soul_sandstone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_CORNER_PILLAR.get(), stones())),

	// Chiseled Soul Sandstone
	CHISELED_SOUL_SANDSTONE = ITEMS.register("chiseled_soul_sandstone", () ->
            new BlockItem(CPlusBlocks.CHISELED_SOUL_SANDSTONE.get(), stones())),

	// Caved Soul Sandstone
	CARVED_SOUL_SANDSTONE = ITEMS.register("carved_soul_sandstone", () ->
            new BlockItem(CPlusBlocks.CARVED_SOUL_SANDSTONE.get(), stones())),


// QUARTZ

	// Base
	QUARTZ_WALL = ITEMS.register("quartz_wall", () ->
            new BlockItem(CPlusBlocks.QUARTZ_WALL.get(), misc())),
	QUARTZ_GATE = ITEMS.register("quartz_gate", () ->
            new BlockItem(CPlusBlocks.QUARTZ_GATE.get(), misc())),

	// Polished Quartz
	POLISHED_QUARTZ = ITEMS.register("polished_quartz", () ->
            new BlockItem(CPlusBlocks.POLISHED_QUARTZ.get(), misc())),
	POLISHED_QUARTZ_SLAB = ITEMS.register("polished_quartz_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_QUARTZ_SLAB.get(), misc())),
	POLISHED_QUARTZ_STAIRS = ITEMS.register("polished_quartz_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_QUARTZ_STAIRS.get(), misc())),
	POLISHED_QUARTZ_WALL = ITEMS.register("polished_quartz_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_QUARTZ_WALL.get(), misc())),
	POLISHED_QUARTZ_GATE = ITEMS.register("polished_quartz_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_QUARTZ_GATE.get(), misc())),

	// Smooth Quartz
	SMOOTH_QUARTZ_WALL = ITEMS.register("smooth_quartz_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_QUARTZ_WALL.get(), misc())),
	SMOOTH_QUARTZ_GATE = ITEMS.register("smooth_quartz_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_QUARTZ_GATE.get(), misc())),

	// Quartz Bricks
	QUARTZ_BRICK_SLAB = ITEMS.register("quartz_brick_slab", () ->
            new BlockItem(CPlusBlocks.QUARTZ_BRICK_SLAB.get(), misc())),
	QUARTZ_BRICK_STAIRS = ITEMS.register("quartz_brick_stairs", () ->
            new BlockItem(CPlusBlocks.QUARTZ_BRICK_STAIRS.get(), misc())),
	QUARTZ_BRICK_WALL = ITEMS.register("quartz_brick_wall", () ->
            new BlockItem(CPlusBlocks.QUARTZ_BRICK_WALL.get(), misc())),
	QUARTZ_BRICK_GATE = ITEMS.register("quartz_brick_gate", () ->
            new BlockItem(CPlusBlocks.QUARTZ_BRICK_GATE.get(), misc())),

	// Cut Quartz
	CUT_QUARTZ = ITEMS.register("cut_quartz", () ->
            new BlockItem(CPlusBlocks.CUT_QUARTZ.get(), misc())),
	CUT_QUARTZ_SLAB = ITEMS.register("cut_quartz_slab", () ->
            new BlockItem(CPlusBlocks.CUT_QUARTZ_SLAB.get(), misc())),
	CUT_QUARTZ_STAIRS = ITEMS.register("cut_quartz_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_QUARTZ_STAIRS.get(), misc())),
	CUT_QUARTZ_WALL = ITEMS.register("cut_quartz_wall", () ->
            new BlockItem(CPlusBlocks.CUT_QUARTZ_WALL.get(), misc())),
	CUT_QUARTZ_GATE = ITEMS.register("cut_quartz_gate", () ->
            new BlockItem(CPlusBlocks.CUT_QUARTZ_GATE.get(), misc())),

	// Quartz Tiles
	QUARTZ_TILES = ITEMS.register("quartz_tiles", () ->
            new BlockItem(CPlusBlocks.QUARTZ_TILES.get(), misc())),
	QUARTZ_TILE_SLAB = ITEMS.register("quartz_tile_slab", () ->
            new BlockItem(CPlusBlocks.QUARTZ_TILE_SLAB.get(), misc())),
	QUARTZ_TILE_STAIRS = ITEMS.register("quartz_tile_stairs", () ->
            new BlockItem(CPlusBlocks.QUARTZ_TILE_STAIRS.get(), misc())),
	QUARTZ_TILE_WALL = ITEMS.register("quartz_tile_wall", () ->
            new BlockItem(CPlusBlocks.QUARTZ_TILE_WALL.get(), misc())),
	QUARTZ_TILE_GATE = ITEMS.register("quartz_tile_gate", () ->
            new BlockItem(CPlusBlocks.QUARTZ_TILE_GATE.get(), misc())),

	// Quartz Pillar
	QUARTZ_CORNER_PILLAR = ITEMS.register("quartz_corner_pillar", () ->
            new BlockItem(CPlusBlocks.QUARTZ_CORNER_PILLAR.get(), misc())),

	// Carved Quartz
	CARVED_QUARTZ = ITEMS.register("carved_quartz", () ->
            new BlockItem(CPlusBlocks.CARVED_QUARTZ.get(), misc())),


// NETHERRACK

	// Base

	// Cobbled Netherrack

	// Polished Netherrack

	// Smooth Netherrack

	// Netherrack Bricks

	// Cracked Netherrack Bricks
	CRACKED_NETHER_BRICK_SLAB = ITEMS.register("cracked_nether_brick_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_SLAB.get(), misc())),
	CRACKED_NETHER_BRICK_STAIRS = ITEMS.register("cracked_nether_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_STAIRS.get(), misc())),
	CRACKED_NETHER_BRICK_WALL = ITEMS.register("cracked_nether_brick_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_WALL.get(), misc())),
	CRACKED_NETHER_BRICK_FENCE_GATE = ITEMS.register("cracked_nether_brick_fence_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_FENCE_GATE.get(), misc())),

	// Cut Netherrack

	// Netherrack Tiles

	// Netherrack Pillar
	NETHER_BRICK_PILLAR = ITEMS.register("nether_brick_pillar", () ->
            new BlockItem(CPlusBlocks.NETHER_BRICK_PILLAR.get(), misc())),

	// Chiseled Netherrack
	CHISELED_NETHER_BRICKS = ITEMS.register("chiseled_nether_bricks", () ->
            new BlockItem(CPlusBlocks.CHISELED_NETHER_BRICKS.get(), misc())),


// CRIMSON WART

	// Base

	// Polished Crimson Wart

	// Smooth Crimson Wart

	// Crimson Wart Bricks
	RED_NETHER_BRICK_FENCE_GATE = ITEMS.register("red_nether_brick_fence_gate", () ->
            new BlockItem(CPlusBlocks.RED_NETHER_BRICK_FENCE_GATE.get(), misc())),

	// Cut Crimson Wart

	// Crimson Wart Tiles

	// Crimson Wart Pillar
	RED_NETHER_BRICK_PILLAR = ITEMS.register("red_nether_brick_pillar", () ->
            new BlockItem(CPlusBlocks.RED_NETHER_BRICK_PILLAR.get(), misc())),

	// Chiseled Crimson Wart
	CHISELED_RED_NETHER_BRICKS = ITEMS.register("chiseled_red_nether_bricks", () ->
            new BlockItem(CPlusBlocks.CHISELED_RED_NETHER_BRICKS.get(), misc())),

	// Carved Crimson Wart
	CARVED_RED_NETHER_BRICKS = ITEMS.register("carved_red_nether_bricks", () ->
            new BlockItem(CPlusBlocks.CARVED_RED_NETHER_BRICKS.get(), misc())),


// WARPED WART

	// Base

	// Polished Warped Wart

	// Smooth Warped Wart

	// Warped Wart Bricks
	BLUE_NETHER_BRICKS = ITEMS.register("blue_nether_bricks", () ->
            new BlockItem(CPlusBlocks.BLUE_NETHER_BRICKS.get(), misc())),
	BLUE_NETHER_BRICK_SLAB = ITEMS.register("blue_nether_brick_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_NETHER_BRICK_SLAB.get(), misc())),
	BLUE_NETHER_BRICK_STAIRS = ITEMS.register("blue_nether_brick_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_NETHER_BRICK_STAIRS.get(), misc())),
	BLUE_NETHER_BRICK_WALL = ITEMS.register("blue_nether_brick_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_NETHER_BRICK_WALL.get(), misc())),
	BLUE_NETHER_BRICK_FENCE_GATE = ITEMS.register("blue_nether_brick_fence_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_NETHER_BRICK_FENCE_GATE.get(), misc())),

	// Cracked Warped Wart Bricks
	CRACKED_BLUE_NETHER_BRICKS = ITEMS.register("cracked_blue_nether_bricks", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLUE_NETHER_BRICKS.get(), misc())),
	CRACKED_BLUE_NETHER_BRICK_SLAB = ITEMS.register("cracked_blue_nether_brick_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB.get(), misc())),
	CRACKED_BLUE_NETHER_BRICK_STAIRS = ITEMS.register("cracked_blue_nether_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS.get(), misc())),
	CRACKED_BLUE_NETHER_BRICK_WALL = ITEMS.register("cracked_blue_nether_brick_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_WALL.get(), misc())),
	CRACKED_BLUE_NETHER_BRICK_FENCE_GATE = ITEMS.register("cracked_blue_nether_brick_fence_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE.get(), misc())),

	// Cut Warped Wart

	// Warped Wart Tiles

	// Warped Wart Pillar
	BLUE_NETHER_BRICK_PILLAR = ITEMS.register("blue_nether_brick_pillar", () ->
            new BlockItem(CPlusBlocks.BLUE_NETHER_BRICK_PILLAR.get(), misc())),

	// Chiseled Warped Wart
	CHISELED_BLUE_NETHER_BRICKS = ITEMS.register("chiseled_blue_nether_bricks", () ->
            new BlockItem(CPlusBlocks.CHISELED_BLUE_NETHER_BRICKS.get(), misc())),

	// Carved Warted Wart
	CARVED_BLUE_NETHER_BRICKS = ITEMS.register("carved_blue_nether_bricks", () ->
            new BlockItem(CPlusBlocks.CARVED_BLUE_NETHER_BRICKS.get(), misc())),


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
	PRISMARINE_GATE = ITEMS.register("prismarine_gate", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_GATE.get(), misc())),

	// Polished Prismarine
	POLISHED_PRISMARINE = ITEMS.register("polished_prismarine", () ->
            new BlockItem(CPlusBlocks.POLISHED_PRISMARINE.get(), misc())),
	POLISHED_PRISMARINE_SLAB = ITEMS.register("polished_prismarine_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_PRISMARINE_SLAB.get(), misc())),
	POLISHED_PRISMARINE_STAIRS = ITEMS.register("polished_prismarine_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_PRISMARINE_STAIRS.get(), misc())),
	POLISHED_PRISMARINE_WALL = ITEMS.register("polished_prismarine_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_PRISMARINE_WALL.get(), misc())),
	POLISHED_PRISMARINE_GATE = ITEMS.register("polished_prismarine_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_PRISMARINE_GATE.get(), misc())),

	// Smooth Prismarine
	SMOOTH_PRISMARINE = ITEMS.register("smooth_prismarine", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PRISMARINE.get(), misc())),
	SMOOTH_PRISMARINE_SLAB = ITEMS.register("smooth_prismarine_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PRISMARINE_SLAB.get(), misc())),
	SMOOTH_PRISMARINE_STAIRS = ITEMS.register("smooth_prismarine_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PRISMARINE_STAIRS.get(), misc())),
	SMOOTH_PRISMARINE_WALL = ITEMS.register("smooth_prismarine_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PRISMARINE_WALL.get(), misc())),
	SMOOTH_PRISMARINE_GATE = ITEMS.register("smooth_prismarine_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PRISMARINE_GATE.get(), misc())),

	// Prismarine Bricks
	PRISMARINE_BRICK_WALL = ITEMS.register("prismarine_brick_wall", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_BRICK_WALL.get(), misc())),
	PRISMARINE_BRICK_GATE = ITEMS.register("prismarine_brick_gate", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_BRICK_GATE.get(), misc())),

	// Cut Prismarine
	CUT_PRISMARINE = ITEMS.register("cut_prismarine", () ->
            new BlockItem(CPlusBlocks.CUT_PRISMARINE.get(), misc())),
	CUT_PRISMARINE_SLAB = ITEMS.register("cut_prismarine_slab", () ->
            new BlockItem(CPlusBlocks.CUT_PRISMARINE_SLAB.get(), misc())),
	CUT_PRISMARINE_STAIRS = ITEMS.register("cut_prismarine_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_PRISMARINE_STAIRS.get(), misc())),
	CUT_PRISMARINE_WALL = ITEMS.register("cut_prismarine_wall", () ->
            new BlockItem(CPlusBlocks.CUT_PRISMARINE_WALL.get(), misc())),
	CUT_PRISMARINE_GATE = ITEMS.register("cut_prismarine_gate", () ->
            new BlockItem(CPlusBlocks.CUT_PRISMARINE_GATE.get(), misc())),

	// Prismarine Tiles
	PRISMARINE_TILES = ITEMS.register("prismarine_tiles", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_TILES.get(), misc())),
	PRISMARINE_TILE_SLAB = ITEMS.register("prismarine_tile_slab", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_TILE_SLAB.get(), misc())),
	PRISMARINE_TILE_STAIRS = ITEMS.register("prismarine_tile_stairs", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_TILE_STAIRS.get(), misc())),
	PRISMARINE_TILE_WALL = ITEMS.register("prismarine_tile_wall", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_TILE_WALL.get(), misc())),
	PRISMARINE_TILE_GATE = ITEMS.register("prismarine_tile_gate", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_TILE_GATE.get(), misc())),

	// Prismarine Pillar
	PRISMARINE_PILLAR = ITEMS.register("prismarine_pillar", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_PILLAR.get(), misc())),
	PRISMARINE_CORNER_PILLAR = ITEMS.register("prismarine_corner_pillar", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_CORNER_PILLAR.get(), misc())),

	// Chiseled Prismarine
	CHISELED_PRISMARINE = ITEMS.register("chiseled_prismarine", () ->
            new BlockItem(CPlusBlocks.CHISELED_PRISMARINE.get(), misc())),

	// Carved Prismarine
	CARVED_PRISMARINE = ITEMS.register("carved_prismarine", () ->
            new BlockItem(CPlusBlocks.CARVED_PRISMARINE.get(), misc())),


// DARK PRISMARINE

	// Base
	DARK_PRISMARINE_WALL = ITEMS.register("dark_prismarine_wall", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_WALL.get(), misc())),
	DARK_PRISMARINE_GATE = ITEMS.register("dark_prismarine_gate", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_GATE.get(), misc())),

	// Polished Dark Prismarine
	POLISHED_DARK_PRISMARINE = ITEMS.register("polished_dark_prismarine", () ->
            new BlockItem(CPlusBlocks.POLISHED_DARK_PRISMARINE.get(), misc())),
	POLISHED_DARK_PRISMARINE_SLAB = ITEMS.register("polished_dark_prismarine_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_DARK_PRISMARINE_SLAB.get(), misc())),
	POLISHED_DARK_PRISMARINE_STAIRS = ITEMS.register("polished_dark_prismarine_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_DARK_PRISMARINE_STAIRS.get(), misc())),
	POLISHED_DARK_PRISMARINE_WALL = ITEMS.register("polished_dark_prismarine_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_DARK_PRISMARINE_WALL.get(), misc())),
	POLISHED_DARK_PRISMARINE_GATE = ITEMS.register("polished_dark_prismarine_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_DARK_PRISMARINE_GATE.get(), misc())),

	// Smooth Dark Prismarine
	SMOOTH_DARK_PRISMARINE = ITEMS.register("smooth_dark_prismarine", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DARK_PRISMARINE.get(), misc())),
	SMOOTH_DARK_PRISMARINE_SLAB = ITEMS.register("smooth_dark_prismarine_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DARK_PRISMARINE_SLAB.get(), misc())),
	SMOOTH_DARK_PRISMARINE_STAIRS = ITEMS.register("smooth_dark_prismarine_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DARK_PRISMARINE_STAIRS.get(), misc())),
	SMOOTH_DARK_PRISMARINE_WALL = ITEMS.register("smooth_dark_prismarine_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DARK_PRISMARINE_WALL.get(), misc())),
	SMOOTH_DARK_PRISMARINE_GATE = ITEMS.register("smooth_dark_prismarine_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DARK_PRISMARINE_GATE.get(), misc())),

	// Dark Prismarine Bricks
	DARK_PRISMARINE_BRICKS = ITEMS.register("dark_prismarine_bricks", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_BRICKS.get(), misc())),
	DARK_PRISMARINE_BRICK_SLAB = ITEMS.register("dark_prismarine_brick_slab", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_BRICK_SLAB.get(), misc())),
	DARK_PRISMARINE_BRICK_STAIRS = ITEMS.register("dark_prismarine_brick_stairs", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_BRICK_STAIRS.get(), misc())),
	DARK_PRISMARINE_BRICK_WALL = ITEMS.register("dark_prismarine_brick_wall", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_BRICK_WALL.get(), misc())),
	DARK_PRISMARINE_BRICK_GATE = ITEMS.register("dark_prismarine_brick_gate", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_BRICK_GATE.get(), misc())),

	// Cut Dark Prismarine
	CUT_DARK_PRISMARINE = ITEMS.register("cut_dark_prismarine", () ->
            new BlockItem(CPlusBlocks.CUT_DARK_PRISMARINE.get(), misc())),
	CUT_DARK_PRISMARINE_SLAB = ITEMS.register("cut_dark_prismarine_slab", () ->
            new BlockItem(CPlusBlocks.CUT_DARK_PRISMARINE_SLAB.get(), misc())),
	CUT_DARK_PRISMARINE_STAIRS = ITEMS.register("cut_dark_prismarine_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_DARK_PRISMARINE_STAIRS.get(), misc())),
	CUT_DARK_PRISMARINE_WALL = ITEMS.register("cut_dark_prismarine_wall", () ->
            new BlockItem(CPlusBlocks.CUT_DARK_PRISMARINE_WALL.get(), misc())),
	CUT_DARK_PRISMARINE_GATE = ITEMS.register("cut_dark_prismarine_gate", () ->
            new BlockItem(CPlusBlocks.CUT_DARK_PRISMARINE_GATE.get(), misc())),

	// Dark Prismarine Tiles
	DARK_PRISMARINE_TILES = ITEMS.register("dark_prismarine_tiles", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_TILES.get(), misc())),
	DARK_PRISMARINE_TILE_SLAB = ITEMS.register("dark_prismarine_tile_slab", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_TILE_SLAB.get(), misc())),
	DARK_PRISMARINE_TILE_STAIRS = ITEMS.register("dark_prismarine_tile_stairs", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_TILE_STAIRS.get(), misc())),
	DARK_PRISMARINE_TILE_WALL = ITEMS.register("dark_prismarine_tile_wall", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_TILE_WALL.get(), misc())),
	DARK_PRISMARINE_TILE_GATE = ITEMS.register("dark_prismarine_tile_gate", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_TILE_GATE.get(), misc())),

	// Dark Prismarine Pillar
	DARK_PRISMARINE_PILLAR = ITEMS.register("dark_prismarine_pillar", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_PILLAR.get(), misc())),
	DARK_PRISMARINE_CORNER_PILLAR = ITEMS.register("dark_prismarine_corner_pillar", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_CORNER_PILLAR.get(), misc())),

	// Chiseled Dark Prismarine
	CHISELED_DARK_PRISMARINE = ITEMS.register("chiseled_dark_prismarine", () ->
            new BlockItem(CPlusBlocks.CHISELED_DARK_PRISMARINE.get(), misc())),

	// Carved Dark Prismarine
	CARVED_DARK_PRISMARINE = ITEMS.register("carved_dark_prismarine", () ->
            new BlockItem(CPlusBlocks.CARVED_DARK_PRISMARINE.get(), misc())),


// PURPUR

	// Base
	PURPUR_BLOCK = ITEMS.register("purpur_block", () ->
            new BlockItem(CPlusBlocks.PURPUR_BLOCK.get(), misc())),
	PURPUR_SLAB = ITEMS.register("purpur_slab", () ->
            new BlockItem(CPlusBlocks.PURPUR_SLAB.get(), misc())),
	PURPUR_STAIRS = ITEMS.register("purpur_stairs", () ->
            new BlockItem(CPlusBlocks.PURPUR_STAIRS.get(), misc())),
	PURPUR_WALL = ITEMS.register("purpur_wall", () ->
            new BlockItem(CPlusBlocks.PURPUR_WALL.get(), misc())),
	PURPUR_GATE = ITEMS.register("purpur_gate", () ->
            new BlockItem(CPlusBlocks.PURPUR_GATE.get(), misc())),

	// Polished Purpur
	POLISHED_PURPUR = ITEMS.register("polished_purpur", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPUR.get(), misc())),
	POLISHED_PURPUR_SLAB = ITEMS.register("polished_purpur_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPUR_SLAB.get(), misc())),
	POLISHED_PURPUR_STAIRS = ITEMS.register("polished_purpur_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPUR_STAIRS.get(), misc())),
	POLISHED_PURPUR_WALL = ITEMS.register("polished_purpur_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPUR_WALL.get(), misc())),
	POLISHED_PURPUR_GATE = ITEMS.register("polished_purpur_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPUR_GATE.get(), misc())),

	// Smooth Purpur
	SMOOTH_PURPUR = ITEMS.register("smooth_purpur", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPUR.get(), misc())),
	SMOOTH_PURPUR_SLAB = ITEMS.register("smooth_purpur_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPUR_SLAB.get(), misc())),
	SMOOTH_PURPUR_STAIRS = ITEMS.register("smooth_purpur_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPUR_STAIRS.get(), misc())),
	SMOOTH_PURPUR_WALL = ITEMS.register("smooth_purpur_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPUR_WALL.get(), misc())),
	SMOOTH_PURPUR_GATE = ITEMS.register("smooth_purpur_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPUR_GATE.get(), misc())),

	// Purpur Bricks
	PURPUR_BRICKS = ITEMS.register("purpur_bricks", () ->
            new BlockItem(CPlusBlocks.PURPUR_BRICKS.get(), misc())),
	PURPUR_BRICK_SLAB = ITEMS.register("purpur_brick_slab", () ->
            new BlockItem(CPlusBlocks.PURPUR_BRICK_SLAB.get(), misc())),
	PURPUR_BRICK_STAIRS = ITEMS.register("purpur_brick_stairs", () ->
            new BlockItem(CPlusBlocks.PURPUR_BRICK_STAIRS.get(), misc())),
	PURPUR_BRICK_WALL = ITEMS.register("purpur_brick_wall", () ->
            new BlockItem(CPlusBlocks.PURPUR_BRICK_WALL.get(), misc())),
	PURPUR_BRICK_GATE = ITEMS.register("purpur_brick_gate", () ->
            new BlockItem(CPlusBlocks.PURPUR_BRICK_GATE.get(), misc())),

	// Cracked Purpur Bricks
	CRACKED_PURPUR_BRICKS = ITEMS.register("cracked_purpur_bricks", () ->
            new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICKS.get(), misc())),
	CRACKED_PURPUR_BRICK_SLAB = ITEMS.register("cracked_purpur_brick_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_SLAB.get(), misc())),
	CRACKED_PURPUR_BRICK_STAIRS = ITEMS.register("cracked_purpur_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_STAIRS.get(), misc())),
	CRACKED_PURPUR_BRICK_WALL = ITEMS.register("cracked_purpur_brick_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_WALL.get(), misc())),
	CRACKED_PURPUR_BRICK_GATE = ITEMS.register("cracked_purpur_brick_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_GATE.get(), misc())),

	// Cut Purpur
	CUT_PURPUR = ITEMS.register("cut_purpur", () ->
            new BlockItem(CPlusBlocks.CUT_PURPUR.get(), misc())),
	CUT_PURPUR_SLAB = ITEMS.register("cut_purpur_slab", () ->
            new BlockItem(CPlusBlocks.CUT_PURPUR_SLAB.get(), misc())),
	CUT_PURPUR_STAIRS = ITEMS.register("cut_purpur_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_PURPUR_STAIRS.get(), misc())),
	CUT_PURPUR_WALL = ITEMS.register("cut_purpur_wall", () ->
            new BlockItem(CPlusBlocks.CUT_PURPUR_WALL.get(), misc())),
	CUT_PURPUR_GATE = ITEMS.register("cut_purpur_gate", () ->
            new BlockItem(CPlusBlocks.CUT_PURPUR_GATE.get(), misc())),

	// Purpur Tiles
	PURPUR_TILE_WALL = ITEMS.register("purpur_tile_wall", () ->
            new BlockItem(CPlusBlocks.PURPUR_TILE_WALL.get(), misc())),
	PURPUR_TILE_GATE = ITEMS.register("purpur_tile_gate", () ->
            new BlockItem(CPlusBlocks.PURPUR_TILE_GATE.get(), misc())),

	// Purpur Pillar
	PURPUR_CORNER_PILLAR = ITEMS.register("purpur_corner_pillar", () ->
            new BlockItem(CPlusBlocks.PURPUR_CORNER_PILLAR.get(), misc())),

	// Chiseled Purpur
	CHISELED_PURPUR = ITEMS.register("chiseled_purpur", () ->
            new BlockItem(CPlusBlocks.CHISELED_PURPUR.get(), misc())),

	// Carved Purpur
	CARVED_PURPUR = ITEMS.register("carved_purpur", () ->
            new BlockItem(CPlusBlocks.CARVED_PURPUR.get(), misc())),


// END STONE

	// Base
	END_STONE_SLAB = ITEMS.register("end_stone_slab", () ->
            new BlockItem(CPlusBlocks.END_STONE_SLAB.get(), stones())),
	END_STONE_STAIRS = ITEMS.register("end_stone_stairs", () ->
            new BlockItem(CPlusBlocks.END_STONE_STAIRS.get(), stones())),
	END_STONE_WALL = ITEMS.register("end_stone_wall", () ->
            new BlockItem(CPlusBlocks.END_STONE_WALL.get(), stones())),
	END_STONE_GATE = ITEMS.register("end_stone_gate", () ->
            new BlockItem(CPlusBlocks.END_STONE_GATE.get(), stones())),

	// Cobbled End Stone
	COBBLED_END_STONE = ITEMS.register("cobbled_end_stone", () ->
            new BlockItem(CPlusBlocks.COBBLED_END_STONE.get(), stones())),
	COBBLED_END_STONE_SLAB = ITEMS.register("cobbled_end_stone_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_END_STONE_SLAB.get(), stones())),
	COBBLED_END_STONE_STAIRS = ITEMS.register("cobbled_end_stone_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_END_STONE_STAIRS.get(), stones())),
	COBBLED_END_STONE_WALL = ITEMS.register("cobbled_end_stone_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_END_STONE_WALL.get(), stones())),
	COBBLED_END_STONE_GATE = ITEMS.register("cobbled_end_stone_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_END_STONE_GATE.get(), stones())),

	// Polished End Stone
	POLISHED_END_STONE = ITEMS.register("polished_end_stone", () ->
            new BlockItem(CPlusBlocks.POLISHED_END_STONE.get(), stones())),
	POLISHED_END_STONE_SLAB = ITEMS.register("polished_end_stone_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_END_STONE_SLAB.get(), stones())),
	POLISHED_END_STONE_STAIRS = ITEMS.register("polished_end_stone_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_END_STONE_STAIRS.get(), stones())),
	POLISHED_END_STONE_WALL = ITEMS.register("polished_end_stone_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_END_STONE_WALL.get(), stones())),
	POLISHED_END_STONE_GATE = ITEMS.register("polished_end_stone_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_END_STONE_GATE.get(), stones())),

	// Smooth End Stone
	SMOOTH_END_STONE = ITEMS.register("smooth_end_stone", () ->
            new BlockItem(CPlusBlocks.SMOOTH_END_STONE.get(), stones())),
	SMOOTH_END_STONE_SLAB = ITEMS.register("smooth_end_stone_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_END_STONE_SLAB.get(), stones())),
	SMOOTH_END_STONE_STAIRS = ITEMS.register("smooth_end_stone_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_END_STONE_STAIRS.get(), stones())),
	SMOOTH_END_STONE_WALL = ITEMS.register("smooth_end_stone_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_END_STONE_WALL.get(), stones())),
	SMOOTH_END_STONE_GATE = ITEMS.register("smooth_end_stone_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_END_STONE_GATE.get(), stones())),

	// End Stone Bricks
	END_STONE_BRICK_GATE = ITEMS.register("end_stone_brick_gate", () ->
            new BlockItem(CPlusBlocks.END_STONE_BRICK_GATE.get(), stones())),

	// Cut End Stone
	CUT_END_STONE = ITEMS.register("cut_end_stone", () ->
            new BlockItem(CPlusBlocks.CUT_END_STONE.get(), stones())),
	CUT_END_STONE_SLAB = ITEMS.register("cut_end_stone_slab", () ->
            new BlockItem(CPlusBlocks.CUT_END_STONE_SLAB.get(), stones())),
	CUT_END_STONE_STAIRS = ITEMS.register("cut_end_stone_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_END_STONE_STAIRS.get(), stones())),
	CUT_END_STONE_WALL = ITEMS.register("cut_end_stone_wall", () ->
            new BlockItem(CPlusBlocks.CUT_END_STONE_WALL.get(), stones())),
	CUT_END_STONE_GATE = ITEMS.register("cut_end_stone_gate", () ->
            new BlockItem(CPlusBlocks.CUT_END_STONE_GATE.get(), stones())),

	// End Stone Tiles
	END_STONE_TILES = ITEMS.register("end_stone_tiles", () ->
            new BlockItem(CPlusBlocks.END_STONE_TILES.get(), stones())),
	END_STONE_TILE_SLAB = ITEMS.register("end_stone_tile_slab", () ->
            new BlockItem(CPlusBlocks.END_STONE_TILE_SLAB.get(), stones())),
	END_STONE_TILE_STAIRS = ITEMS.register("end_stone_tile_stairs", () ->
            new BlockItem(CPlusBlocks.END_STONE_TILE_STAIRS.get(), stones())),
	END_STONE_TILE_WALL = ITEMS.register("end_stone_tile_wall", () ->
            new BlockItem(CPlusBlocks.END_STONE_TILE_WALL.get(), stones())),
	END_STONE_TILE_GATE = ITEMS.register("end_stone_tile_gate", () ->
            new BlockItem(CPlusBlocks.END_STONE_TILE_GATE.get(), stones())),

	// End Stone Pillar
	END_STONE_PILLAR = ITEMS.register("end_stone_pillar", () ->
            new BlockItem(CPlusBlocks.END_STONE_PILLAR.get(), stones())),
	END_STONE_CORNER_PILLAR = ITEMS.register("end_stone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.END_STONE_CORNER_PILLAR.get(), stones())),

	// Chiseled End Stone
	CHISELED_END_STONE = ITEMS.register("chiseled_end_stone", () ->
            new BlockItem(CPlusBlocks.CHISELED_END_STONE.get(), stones())),

	// Carved End Stone
	CARVED_END_STONE = ITEMS.register("carved_end_stone", () ->
            new BlockItem(CPlusBlocks.CARVED_END_STONE.get(), stones())),


// OBSIDIAN

	// Base
	OBSIDIAN_SLAB = ITEMS.register("obsidian_slab", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_SLAB.get(), misc())),
	OBSIDIAN_STAIRS = ITEMS.register("obsidian_stairs", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_STAIRS.get(), misc())),
	OBSIDIAN_WALL = ITEMS.register("obsidian_wall", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_WALL.get(), misc())),
	OBSIDIAN_GATE = ITEMS.register("obsidian_gate", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_GATE.get(), misc())),

	// Crying Base
	CRYING_OBSIDIAN_SLAB = ITEMS.register("crying_obsidian_slab", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_SLAB.get(), misc())),
	CRYING_OBSIDIAN_STAIRS = ITEMS.register("crying_obsidian_stairs", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_STAIRS.get(), misc())),
	CRYING_OBSIDIAN_WALL = ITEMS.register("crying_obsidian_wall", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_WALL.get(), misc())),
	CRYING_OBSIDIAN_GATE = ITEMS.register("crying_obsidian_gate", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_GATE.get(), misc())),

	// Polished Obsidian
	POLISHED_OBSIDIAN = ITEMS.register("polished_obsidian", () ->
            new BlockItem(CPlusBlocks.POLISHED_OBSIDIAN.get(), misc())),
	POLISHED_OBSIDIAN_SLAB = ITEMS.register("polished_obsidian_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_OBSIDIAN_SLAB.get(), misc())),
	POLISHED_OBSIDIAN_STAIRS = ITEMS.register("polished_obsidian_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_OBSIDIAN_STAIRS.get(), misc())),
	POLISHED_OBSIDIAN_WALL = ITEMS.register("polished_obsidian_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_OBSIDIAN_WALL.get(), misc())),
	POLISHED_OBSIDIAN_GATE = ITEMS.register("polished_obsidian_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_OBSIDIAN_GATE.get(), misc())),

	// Polished Crying Obsidian
	POLISHED_CRYING_OBSIDIAN = ITEMS.register("polished_crying_obsidian", () ->
            new BlockItem(CPlusBlocks.POLISHED_CRYING_OBSIDIAN.get(), misc())),
	POLISHED_CRYING_OBSIDIAN_SLAB = ITEMS.register("polished_crying_obsidian_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_CRYING_OBSIDIAN_SLAB.get(), misc())),
	POLISHED_CRYING_OBSIDIAN_STAIRS = ITEMS.register("polished_crying_obsidian_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_CRYING_OBSIDIAN_STAIRS.get(), misc())),
	POLISHED_CRYING_OBSIDIAN_WALL = ITEMS.register("polished_crying_obsidian_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_CRYING_OBSIDIAN_WALL.get(), misc())),
	POLISHED_CRYING_OBSIDIAN_GATE = ITEMS.register("polished_crying_obsidian_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_CRYING_OBSIDIAN_GATE.get(), misc())),

	// Smooth Obsidian
	SMOOTH_OBSIDIAN = ITEMS.register("smooth_obsidian", () ->
            new BlockItem(CPlusBlocks.SMOOTH_OBSIDIAN.get(), misc())),
	SMOOTH_OBSIDIAN_SLAB = ITEMS.register("smooth_obsidian_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_OBSIDIAN_SLAB.get(), misc())),
	SMOOTH_OBSIDIAN_STAIRS = ITEMS.register("smooth_obsidian_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_OBSIDIAN_STAIRS.get(), misc())),
	SMOOTH_OBSIDIAN_WALL = ITEMS.register("smooth_obsidian_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_OBSIDIAN_WALL.get(), misc())),
	SMOOTH_OBSIDIAN_GATE = ITEMS.register("smooth_obsidian_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_OBSIDIAN_GATE.get(), misc())),

	// Smooth Crying Obsidian
	SMOOTH_CRYING_OBSIDIAN = ITEMS.register("smooth_crying_obsidian", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CRYING_OBSIDIAN.get(), misc())),
	SMOOTH_CRYING_OBSIDIAN_SLAB = ITEMS.register("smooth_crying_obsidian_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CRYING_OBSIDIAN_SLAB.get(), misc())),
	SMOOTH_CRYING_OBSIDIAN_STAIRS = ITEMS.register("smooth_crying_obsidian_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CRYING_OBSIDIAN_STAIRS.get(), misc())),
	SMOOTH_CRYING_OBSIDIAN_WALL = ITEMS.register("smooth_crying_obsidian_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CRYING_OBSIDIAN_WALL.get(), misc())),
	SMOOTH_CRYING_OBSIDIAN_GATE = ITEMS.register("smooth_crying_obsidian_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CRYING_OBSIDIAN_GATE.get(), misc())),

	// Obsidian Bricks
	OBSIDIAN_BRICKS = ITEMS.register("obsidian_bricks", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_BRICKS.get(), misc())),
	OBSIDIAN_BRICK_SLAB = ITEMS.register("obsidian_brick_slab", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_BRICK_SLAB.get(), misc())),
	OBSIDIAN_BRICK_STAIRS = ITEMS.register("obsidian_brick_stairs", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_BRICK_STAIRS.get(), misc())),
	OBSIDIAN_BRICK_WALL = ITEMS.register("obsidian_brick_wall", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_BRICK_WALL.get(), misc())),
	OBSIDIAN_BRICK_GATE = ITEMS.register("obsidian_brick_gate", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_BRICK_GATE.get(), misc())),

	// Crying Obsidian Bricks
	CRYING_OBSIDIAN_BRICKS = ITEMS.register("crying_obsidian_bricks", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_BRICKS.get(), misc())),
	CRYING_OBSIDIAN_BRICK_SLAB = ITEMS.register("crying_obsidian_brick_slab", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_BRICK_SLAB.get(), misc())),
	CRYING_OBSIDIAN_BRICK_STAIRS = ITEMS.register("crying_obsidian_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_BRICK_STAIRS.get(), misc())),
	CRYING_OBSIDIAN_BRICK_WALL = ITEMS.register("crying_obsidian_brick_wall", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_BRICK_WALL.get(), misc())),
	CRYING_OBSIDIAN_BRICK_GATE = ITEMS.register("crying_obsidian_brick_gate", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_BRICK_GATE.get(), misc())),

	// Cut Obsidian
	CUT_OBSIDIAN = ITEMS.register("cut_obsidian", () ->
            new BlockItem(CPlusBlocks.CUT_OBSIDIAN.get(), misc())),
	CUT_OBSIDIAN_SLAB = ITEMS.register("cut_obsidian_slab", () ->
            new BlockItem(CPlusBlocks.CUT_OBSIDIAN_SLAB.get(), misc())),
	CUT_OBSIDIAN_STAIRS = ITEMS.register("cut_obsidian_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_OBSIDIAN_STAIRS.get(), misc())),
	CUT_OBSIDIAN_WALL = ITEMS.register("cut_obsidian_wall", () ->
            new BlockItem(CPlusBlocks.CUT_OBSIDIAN_WALL.get(), misc())),
	CUT_OBSIDIAN_GATE = ITEMS.register("cut_obsidian_gate", () ->
            new BlockItem(CPlusBlocks.CUT_OBSIDIAN_GATE.get(), misc())),

	// Cut Crying Obsidian
	CUT_CRYING_OBSIDIAN = ITEMS.register("cut_crying_obsidian", () ->
            new BlockItem(CPlusBlocks.CUT_CRYING_OBSIDIAN.get(), misc())),
	CUT_CRYING_OBSIDIAN_SLAB = ITEMS.register("cut_crying_obsidian_slab", () ->
            new BlockItem(CPlusBlocks.CUT_CRYING_OBSIDIAN_SLAB.get(), misc())),
	CUT_CRYING_OBSIDIAN_STAIRS = ITEMS.register("cut_crying_obsidian_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_CRYING_OBSIDIAN_STAIRS.get(), misc())),
	CUT_CRYING_OBSIDIAN_WALL = ITEMS.register("cut_crying_obsidian_wall", () ->
            new BlockItem(CPlusBlocks.CUT_CRYING_OBSIDIAN_WALL.get(), misc())),
	CUT_CRYING_OBSIDIAN_GATE = ITEMS.register("cut_crying_obsidian_gate", () ->
            new BlockItem(CPlusBlocks.CUT_CRYING_OBSIDIAN_GATE.get(), misc())),

	// Obsidian Tiles
	OBSIDIAN_TILES = ITEMS.register("obsidian_tiles", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_TILES.get(), misc())),
	OBSIDIAN_TILE_SLAB = ITEMS.register("obsidian_tile_slab", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_TILE_SLAB.get(), misc())),
	OBSIDIAN_TILE_STAIRS = ITEMS.register("obsidian_tile_stairs", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_TILE_STAIRS.get(), misc())),
	OBSIDIAN_TILE_WALL = ITEMS.register("obsidian_tile_wall", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_TILE_WALL.get(), misc())),
	OBSIDIAN_TILE_GATE = ITEMS.register("obsidian_tile_gate", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_TILE_GATE.get(), misc())),

	// Crying Obsidian Tiles
	CRYING_OBSIDIAN_TILES = ITEMS.register("crying_obsidian_tiles", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_TILES.get(), misc())),
	CRYING_OBSIDIAN_TILE_SLAB = ITEMS.register("crying_obsidian_tile_slab", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_TILE_SLAB.get(), misc())),
	CRYING_OBSIDIAN_TILE_STAIRS = ITEMS.register("crying_obsidian_tile_stairs", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_TILE_STAIRS.get(), misc())),
	CRYING_OBSIDIAN_TILE_WALL = ITEMS.register("crying_obsidian_tile_wall", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_TILE_WALL.get(), misc())),
	CRYING_OBSIDIAN_TILE_GATE = ITEMS.register("crying_obsidian_tile_gate", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_TILE_GATE.get(), misc())),

	// Obsidian Pillar
	OBSIDIAN_PILLAR = ITEMS.register("obsidian_pillar", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_PILLAR.get(), misc())),
	OBSIDIAN_CORNER_PILLAR = ITEMS.register("obsidian_corner_pillar", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_CORNER_PILLAR.get(), misc())),

	// Crying Obsidian Pillar
	CRYING_OBSIDIAN_PILLAR = ITEMS.register("crying_obsidian_pillar", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_PILLAR.get(), misc())),
	CRYING_OBSIDIAN_CORNER_PILLAR = ITEMS.register("crying_obsidian_corner_pillar", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_CORNER_PILLAR.get(), misc())),

	// Chiseled Obsidian
	CHISELED_OBSIDIAN = ITEMS.register("chiseled_obsidian", () ->
            new BlockItem(CPlusBlocks.CHISELED_OBSIDIAN.get(), misc())),

	// Chiseled Crying Obsidian
	CHISELED_CRYING_OBSIDIAN = ITEMS.register("chiseled_crying_obsidian", () ->
            new BlockItem(CPlusBlocks.CHISELED_CRYING_OBSIDIAN.get(), misc())),

	// Carved Obsidian
	CARVED_OBSIDIAN = ITEMS.register("carved_obsidian", () ->
            new BlockItem(CPlusBlocks.CARVED_OBSIDIAN.get(), misc())),

	// Carved Crying Obsidian
	CARVED_CRYING_OBSIDIAN = ITEMS.register("carved_crying_obsidian", () ->
            new BlockItem(CPlusBlocks.CARVED_CRYING_OBSIDIAN.get(), misc())),


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
	TERRACOTTA_SLAB = ITEMS.register("terracotta_slab", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_SLAB.get(), dyeables())),
	TERRACOTTA_STAIRS = ITEMS.register("terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_STAIRS.get(), dyeables())),
	TERRACOTTA_WALL = ITEMS.register("terracotta_wall", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_WALL.get(), dyeables())),
	TERRACOTTA_GATE = ITEMS.register("terracotta_gate", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_GATE.get(), dyeables())),

	// Cobbled Terracotta
	COBBLED_TERRACOTTA = ITEMS.register("cobbled_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_TERRACOTTA.get(), dyeables())),
	COBBLED_TERRACOTTA_SLAB = ITEMS.register("cobbled_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_TERRACOTTA_SLAB.get(), dyeables())),
	COBBLED_TERRACOTTA_STAIRS = ITEMS.register("cobbled_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_TERRACOTTA_STAIRS.get(), dyeables())),
	COBBLED_TERRACOTTA_WALL = ITEMS.register("cobbled_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_TERRACOTTA_WALL.get(), dyeables())),
	COBBLED_TERRACOTTA_GATE = ITEMS.register("cobbled_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_TERRACOTTA_GATE.get(), dyeables())),

	// Polished Terracotta
	POLISHED_TERRACOTTA = ITEMS.register("polished_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_TERRACOTTA.get(), dyeables())),
	POLISHED_TERRACOTTA_SLAB = ITEMS.register("polished_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_TERRACOTTA_STAIRS = ITEMS.register("polished_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_TERRACOTTA_WALL = ITEMS.register("polished_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_TERRACOTTA_GATE = ITEMS.register("polished_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth Terracotta
	SMOOTH_TERRACOTTA = ITEMS.register("smooth_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TERRACOTTA.get(), dyeables())),
	SMOOTH_TERRACOTTA_SLAB = ITEMS.register("smooth_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TERRACOTTA_SLAB.get(), dyeables())),
	SMOOTH_TERRACOTTA_STAIRS = ITEMS.register("smooth_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TERRACOTTA_STAIRS.get(), dyeables())),
	SMOOTH_TERRACOTTA_WALL = ITEMS.register("smooth_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TERRACOTTA_WALL.get(), dyeables())),
	SMOOTH_TERRACOTTA_GATE = ITEMS.register("smooth_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TERRACOTTA_GATE.get(), dyeables())),

	// Terracotta Bricks
	BRICK_GATE = ITEMS.register("brick_gate", () ->
            new BlockItem(CPlusBlocks.BRICK_GATE.get(), dyeables())),

	// Cut Terracotta
	CUT_TERRACOTTA = ITEMS.register("cut_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_TERRACOTTA.get(), dyeables())),
	CUT_TERRACOTTA_SLAB = ITEMS.register("cut_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_TERRACOTTA_SLAB.get(), dyeables())),
	CUT_TERRACOTTA_STAIRS = ITEMS.register("cut_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_TERRACOTTA_STAIRS.get(), dyeables())),
	CUT_TERRACOTTA_WALL = ITEMS.register("cut_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_TERRACOTTA_WALL.get(), dyeables())),
	CUT_TERRACOTTA_GATE = ITEMS.register("cut_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_TERRACOTTA_GATE.get(), dyeables())),

	// Terracotta Tiles
	TERRACOTTA_TILES = ITEMS.register("terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_TILES.get(), dyeables())),
	TERRACOTTA_TILE_SLAB = ITEMS.register("terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_TILE_SLAB.get(), dyeables())),
	TERRACOTTA_TILE_STAIRS = ITEMS.register("terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_TILE_STAIRS.get(), dyeables())),
	TERRACOTTA_TILE_WALL = ITEMS.register("terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_TILE_WALL.get(), dyeables())),
	TERRACOTTA_TILE_GATE = ITEMS.register("terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_TILE_GATE.get(), dyeables())),

	// Terracotta Pillar
	TERRACOTTA_PILLAR = ITEMS.register("terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_PILLAR.get(), dyeables())),
	TERRACOTTA_CORNER_PILLAR = ITEMS.register("terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Terracotta
	CHISELED_TERRACOTTA = ITEMS.register("chiseled_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_TERRACOTTA.get(), dyeables())),

	// Carved Terracotta
	CARVED_TERRACOTTA = ITEMS.register("carved_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_TERRACOTTA.get(), dyeables())),


// RED TERRACOTTA

	// Base
	RED_TERRACOTTA_SLAB = ITEMS.register("red_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_SLAB.get(), dyeables())),
	RED_TERRACOTTA_STAIRS = ITEMS.register("red_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_STAIRS.get(), dyeables())),
	RED_TERRACOTTA_WALL = ITEMS.register("red_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_WALL.get(), dyeables())),
	RED_TERRACOTTA_GATE = ITEMS.register("red_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_GATE.get(), dyeables())),

	// Cobbled Red Terracotta
	COBBLED_RED_TERRACOTTA = ITEMS.register("cobbled_red_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_TERRACOTTA.get(), dyeables())),
	COBBLED_RED_TERRACOTTA_SLAB = ITEMS.register("cobbled_red_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_TERRACOTTA_SLAB.get(), dyeables())),
	COBBLED_RED_TERRACOTTA_STAIRS = ITEMS.register("cobbled_red_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_TERRACOTTA_STAIRS.get(), dyeables())),
	COBBLED_RED_TERRACOTTA_WALL = ITEMS.register("cobbled_red_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_TERRACOTTA_WALL.get(), dyeables())),
	COBBLED_RED_TERRACOTTA_GATE = ITEMS.register("cobbled_red_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_TERRACOTTA_GATE.get(), dyeables())),

	// Polished Red Terracotta
	POLISHED_RED_TERRACOTTA = ITEMS.register("polished_red_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_TERRACOTTA.get(), dyeables())),
	POLISHED_RED_TERRACOTTA_SLAB = ITEMS.register("polished_red_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_RED_TERRACOTTA_STAIRS = ITEMS.register("polished_red_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_RED_TERRACOTTA_WALL = ITEMS.register("polished_red_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_RED_TERRACOTTA_GATE = ITEMS.register("polished_red_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth Red Terracotta
	SMOOTH_RED_TERRACOTTA = ITEMS.register("smooth_red_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_TERRACOTTA.get(), dyeables())),
	SMOOTH_RED_TERRACOTTA_SLAB = ITEMS.register("smooth_red_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_TERRACOTTA_SLAB.get(), dyeables())),
	SMOOTH_RED_TERRACOTTA_STAIRS = ITEMS.register("smooth_red_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_TERRACOTTA_STAIRS.get(), dyeables())),
	SMOOTH_RED_TERRACOTTA_WALL = ITEMS.register("smooth_red_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_TERRACOTTA_WALL.get(), dyeables())),
	SMOOTH_RED_TERRACOTTA_GATE = ITEMS.register("smooth_red_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_TERRACOTTA_GATE.get(), dyeables())),

	// Red Terracotta Bricks
	RED_TERRACOTTA_BRICKS = ITEMS.register("red_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_BRICKS.get(), dyeables())),
	RED_TERRACOTTA_BRICK_SLAB = ITEMS.register("red_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_BRICK_SLAB.get(), dyeables())),
	RED_TERRACOTTA_BRICK_STAIRS = ITEMS.register("red_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_BRICK_STAIRS.get(), dyeables())),
	RED_TERRACOTTA_BRICK_WALL = ITEMS.register("red_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_BRICK_WALL.get(), dyeables())),
	RED_TERRACOTTA_BRICK_GATE = ITEMS.register("red_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_BRICK_GATE.get(), dyeables())),

	// Cut Red Terracotta
	CUT_RED_TERRACOTTA = ITEMS.register("cut_red_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_RED_TERRACOTTA.get(), dyeables())),
	CUT_RED_TERRACOTTA_SLAB = ITEMS.register("cut_red_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_RED_TERRACOTTA_SLAB.get(), dyeables())),
	CUT_RED_TERRACOTTA_STAIRS = ITEMS.register("cut_red_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_RED_TERRACOTTA_STAIRS.get(), dyeables())),
	CUT_RED_TERRACOTTA_WALL = ITEMS.register("cut_red_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_RED_TERRACOTTA_WALL.get(), dyeables())),
	CUT_RED_TERRACOTTA_GATE = ITEMS.register("cut_red_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_RED_TERRACOTTA_GATE.get(), dyeables())),

	// Red Terracotta Tiles
	RED_TERRACOTTA_TILES = ITEMS.register("red_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_TILES.get(), dyeables())),
	RED_TERRACOTTA_TILE_SLAB = ITEMS.register("red_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_TILE_SLAB.get(), dyeables())),
	RED_TERRACOTTA_TILE_STAIRS = ITEMS.register("red_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_TILE_STAIRS.get(), dyeables())),
	RED_TERRACOTTA_TILE_WALL = ITEMS.register("red_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_TILE_WALL.get(), dyeables())),
	RED_TERRACOTTA_TILE_GATE = ITEMS.register("red_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_TILE_GATE.get(), dyeables())),

	// Red Terracotta Pillar
	RED_TERRACOTTA_PILLAR = ITEMS.register("red_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_PILLAR.get(), dyeables())),
	RED_TERRACOTTA_CORNER_PILLAR = ITEMS.register("red_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Red Terracotta
	CHISELED_RED_TERRACOTTA = ITEMS.register("chiseled_red_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_RED_TERRACOTTA.get(), dyeables())),

	// Carved Red Terracotta
	CARVED_RED_TERRACOTTA = ITEMS.register("carved_red_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_RED_TERRACOTTA.get(), dyeables())),


// ORANGE TERRACOTTA

	// Base
	ORANGE_TERRACOTTA_SLAB = ITEMS.register("orange_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_SLAB.get(), dyeables())),
	ORANGE_TERRACOTTA_STAIRS = ITEMS.register("orange_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_STAIRS.get(), dyeables())),
	ORANGE_TERRACOTTA_WALL = ITEMS.register("orange_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_WALL.get(), dyeables())),
	ORANGE_TERRACOTTA_GATE = ITEMS.register("orange_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_GATE.get(), dyeables())),

	// Cobbled Orange Terracotta
	COBBLED_ORANGE_TERRACOTTA = ITEMS.register("cobbled_orange_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_ORANGE_TERRACOTTA.get(), dyeables())),
	COBBLED_ORANGE_TERRACOTTA_SLAB = ITEMS.register("cobbled_orange_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_ORANGE_TERRACOTTA_SLAB.get(), dyeables())),
	COBBLED_ORANGE_TERRACOTTA_STAIRS = ITEMS.register("cobbled_orange_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_ORANGE_TERRACOTTA_STAIRS.get(), dyeables())),
	COBBLED_ORANGE_TERRACOTTA_WALL = ITEMS.register("cobbled_orange_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_ORANGE_TERRACOTTA_WALL.get(), dyeables())),
	COBBLED_ORANGE_TERRACOTTA_GATE = ITEMS.register("cobbled_orange_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_ORANGE_TERRACOTTA_GATE.get(), dyeables())),

	// Polished Orange Terracotta
	POLISHED_ORANGE_TERRACOTTA = ITEMS.register("polished_orange_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_TERRACOTTA.get(), dyeables())),
	POLISHED_ORANGE_TERRACOTTA_SLAB = ITEMS.register("polished_orange_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_ORANGE_TERRACOTTA_STAIRS = ITEMS.register("polished_orange_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_ORANGE_TERRACOTTA_WALL = ITEMS.register("polished_orange_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_ORANGE_TERRACOTTA_GATE = ITEMS.register("polished_orange_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth Orange Terracotta
	SMOOTH_ORANGE_TERRACOTTA = ITEMS.register("smooth_orange_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_TERRACOTTA.get(), dyeables())),
	SMOOTH_ORANGE_TERRACOTTA_SLAB = ITEMS.register("smooth_orange_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_TERRACOTTA_SLAB.get(), dyeables())),
	SMOOTH_ORANGE_TERRACOTTA_STAIRS = ITEMS.register("smooth_orange_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_TERRACOTTA_STAIRS.get(), dyeables())),
	SMOOTH_ORANGE_TERRACOTTA_WALL = ITEMS.register("smooth_orange_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_TERRACOTTA_WALL.get(), dyeables())),
	SMOOTH_ORANGE_TERRACOTTA_GATE = ITEMS.register("smooth_orange_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_TERRACOTTA_GATE.get(), dyeables())),

	// Orange Terracotta Bricks
	ORANGE_TERRACOTTA_BRICKS = ITEMS.register("orange_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_BRICKS.get(), dyeables())),
	ORANGE_TERRACOTTA_BRICK_SLAB = ITEMS.register("orange_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_BRICK_SLAB.get(), dyeables())),
	ORANGE_TERRACOTTA_BRICK_STAIRS = ITEMS.register("orange_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS.get(), dyeables())),
	ORANGE_TERRACOTTA_BRICK_WALL = ITEMS.register("orange_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_BRICK_WALL.get(), dyeables())),
	ORANGE_TERRACOTTA_BRICK_GATE = ITEMS.register("orange_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_BRICK_GATE.get(), dyeables())),

	// Cut Orange Terracotta
	CUT_ORANGE_TERRACOTTA = ITEMS.register("cut_orange_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_TERRACOTTA.get(), dyeables())),
	CUT_ORANGE_TERRACOTTA_SLAB = ITEMS.register("cut_orange_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_TERRACOTTA_SLAB.get(), dyeables())),
	CUT_ORANGE_TERRACOTTA_STAIRS = ITEMS.register("cut_orange_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_TERRACOTTA_STAIRS.get(), dyeables())),
	CUT_ORANGE_TERRACOTTA_WALL = ITEMS.register("cut_orange_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_TERRACOTTA_WALL.get(), dyeables())),
	CUT_ORANGE_TERRACOTTA_GATE = ITEMS.register("cut_orange_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_TERRACOTTA_GATE.get(), dyeables())),

	// Orange Terracotta Tiles
	ORANGE_TERRACOTTA_TILES = ITEMS.register("orange_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_TILES.get(), dyeables())),
	ORANGE_TERRACOTTA_TILE_SLAB = ITEMS.register("orange_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_TILE_SLAB.get(), dyeables())),
	ORANGE_TERRACOTTA_TILE_STAIRS = ITEMS.register("orange_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_TILE_STAIRS.get(), dyeables())),
	ORANGE_TERRACOTTA_TILE_WALL = ITEMS.register("orange_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_TILE_WALL.get(), dyeables())),
	ORANGE_TERRACOTTA_TILE_GATE = ITEMS.register("orange_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_TILE_GATE.get(), dyeables())),

	// Orange Terracotta Pillar
	ORANGE_TERRACOTTA_PILLAR = ITEMS.register("orange_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_PILLAR.get(), dyeables())),
	ORANGE_TERRACOTTA_CORNER_PILLAR = ITEMS.register("orange_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Orange Terracotta
	CHISELED_ORANGE_TERRACOTTA = ITEMS.register("chiseled_orange_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_ORANGE_TERRACOTTA.get(), dyeables())),

	// Carved Orange Terracotta
	CARVED_ORANGE_TERRACOTTA = ITEMS.register("carved_orange_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_ORANGE_TERRACOTTA.get(), dyeables())),


// YELLOW TERRACOTTA

	// Base
	YELLOW_TERRACOTTA_SLAB = ITEMS.register("yellow_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_SLAB.get(), dyeables())),
	YELLOW_TERRACOTTA_STAIRS = ITEMS.register("yellow_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_STAIRS.get(), dyeables())),
	YELLOW_TERRACOTTA_WALL = ITEMS.register("yellow_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_WALL.get(), dyeables())),
	YELLOW_TERRACOTTA_GATE = ITEMS.register("yellow_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_GATE.get(), dyeables())),

	// Cobbled Yellow Terracotta
	COBBLED_YELLOW_TERRACOTTA = ITEMS.register("cobbled_yellow_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_YELLOW_TERRACOTTA.get(), dyeables())),
	COBBLED_YELLOW_TERRACOTTA_SLAB = ITEMS.register("cobbled_yellow_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_YELLOW_TERRACOTTA_SLAB.get(), dyeables())),
	COBBLED_YELLOW_TERRACOTTA_STAIRS = ITEMS.register("cobbled_yellow_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_YELLOW_TERRACOTTA_STAIRS.get(), dyeables())),
	COBBLED_YELLOW_TERRACOTTA_WALL = ITEMS.register("cobbled_yellow_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_YELLOW_TERRACOTTA_WALL.get(), dyeables())),
	COBBLED_YELLOW_TERRACOTTA_GATE = ITEMS.register("cobbled_yellow_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_YELLOW_TERRACOTTA_GATE.get(), dyeables())),

	// Polished Yellow Terracotta
	POLISHED_YELLOW_TERRACOTTA = ITEMS.register("polished_yellow_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_TERRACOTTA.get(), dyeables())),
	POLISHED_YELLOW_TERRACOTTA_SLAB = ITEMS.register("polished_yellow_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_YELLOW_TERRACOTTA_STAIRS = ITEMS.register("polished_yellow_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_YELLOW_TERRACOTTA_WALL = ITEMS.register("polished_yellow_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_YELLOW_TERRACOTTA_GATE = ITEMS.register("polished_yellow_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth Yellow Terracotta
	SMOOTH_YELLOW_TERRACOTTA = ITEMS.register("smooth_yellow_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_TERRACOTTA.get(), dyeables())),
	SMOOTH_YELLOW_TERRACOTTA_SLAB = ITEMS.register("smooth_yellow_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_TERRACOTTA_SLAB.get(), dyeables())),
	SMOOTH_YELLOW_TERRACOTTA_STAIRS = ITEMS.register("smooth_yellow_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_TERRACOTTA_STAIRS.get(), dyeables())),
	SMOOTH_YELLOW_TERRACOTTA_WALL = ITEMS.register("smooth_yellow_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_TERRACOTTA_WALL.get(), dyeables())),
	SMOOTH_YELLOW_TERRACOTTA_GATE = ITEMS.register("smooth_yellow_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_TERRACOTTA_GATE.get(), dyeables())),

	// Yellow Terracotta Bricks
	YELLOW_TERRACOTTA_BRICKS = ITEMS.register("yellow_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_BRICKS.get(), dyeables())),
	YELLOW_TERRACOTTA_BRICK_SLAB = ITEMS.register("yellow_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_BRICK_SLAB.get(), dyeables())),
	YELLOW_TERRACOTTA_BRICK_STAIRS = ITEMS.register("yellow_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS.get(), dyeables())),
	YELLOW_TERRACOTTA_BRICK_WALL = ITEMS.register("yellow_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_BRICK_WALL.get(), dyeables())),
	YELLOW_TERRACOTTA_BRICK_GATE = ITEMS.register("yellow_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_BRICK_GATE.get(), dyeables())),

	// Cut Yellow Terracotta
	CUT_YELLOW_TERRACOTTA = ITEMS.register("cut_yellow_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_TERRACOTTA.get(), dyeables())),
	CUT_YELLOW_TERRACOTTA_SLAB = ITEMS.register("cut_yellow_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_TERRACOTTA_SLAB.get(), dyeables())),
	CUT_YELLOW_TERRACOTTA_STAIRS = ITEMS.register("cut_yellow_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_TERRACOTTA_STAIRS.get(), dyeables())),
	CUT_YELLOW_TERRACOTTA_WALL = ITEMS.register("cut_yellow_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_TERRACOTTA_WALL.get(), dyeables())),
	CUT_YELLOW_TERRACOTTA_GATE = ITEMS.register("cut_yellow_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_TERRACOTTA_GATE.get(), dyeables())),

	// Yellow Terracotta Tiles
	YELLOW_TERRACOTTA_TILES = ITEMS.register("yellow_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_TILES.get(), dyeables())),
	YELLOW_TERRACOTTA_TILE_SLAB = ITEMS.register("yellow_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_TILE_SLAB.get(), dyeables())),
	YELLOW_TERRACOTTA_TILE_STAIRS = ITEMS.register("yellow_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_TILE_STAIRS.get(), dyeables())),
	YELLOW_TERRACOTTA_TILE_WALL = ITEMS.register("yellow_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_TILE_WALL.get(), dyeables())),
	YELLOW_TERRACOTTA_TILE_GATE = ITEMS.register("yellow_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_TILE_GATE.get(), dyeables())),

	// Yellow Terracotta Pillar
	YELLOW_TERRACOTTA_PILLAR = ITEMS.register("yellow_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_PILLAR.get(), dyeables())),
	YELLOW_TERRACOTTA_CORNER_PILLAR = ITEMS.register("yellow_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Yellow Terracotta
	CHISELED_YELLOW_TERRACOTTA = ITEMS.register("chiseled_yellow_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_YELLOW_TERRACOTTA.get(), dyeables())),

	// Carved Yellow Terracotta
	CARVED_YELLOW_TERRACOTTA = ITEMS.register("carved_yellow_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_YELLOW_TERRACOTTA.get(), dyeables())),


// LIME TERRACOTTA

	// Base
	LIME_TERRACOTTA_SLAB = ITEMS.register("lime_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_SLAB.get(), dyeables())),
	LIME_TERRACOTTA_STAIRS = ITEMS.register("lime_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_STAIRS.get(), dyeables())),
	LIME_TERRACOTTA_WALL = ITEMS.register("lime_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_WALL.get(), dyeables())),
	LIME_TERRACOTTA_GATE = ITEMS.register("lime_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_GATE.get(), dyeables())),

	// Cobbled Lime Terracotta
	COBBLED_LIME_TERRACOTTA = ITEMS.register("cobbled_lime_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIME_TERRACOTTA.get(), dyeables())),
	COBBLED_LIME_TERRACOTTA_SLAB = ITEMS.register("cobbled_lime_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIME_TERRACOTTA_SLAB.get(), dyeables())),
	COBBLED_LIME_TERRACOTTA_STAIRS = ITEMS.register("cobbled_lime_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIME_TERRACOTTA_STAIRS.get(), dyeables())),
	COBBLED_LIME_TERRACOTTA_WALL = ITEMS.register("cobbled_lime_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIME_TERRACOTTA_WALL.get(), dyeables())),
	COBBLED_LIME_TERRACOTTA_GATE = ITEMS.register("cobbled_lime_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIME_TERRACOTTA_GATE.get(), dyeables())),

	// Polished Lime Terracotta
	POLISHED_LIME_TERRACOTTA = ITEMS.register("polished_lime_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_TERRACOTTA.get(), dyeables())),
	POLISHED_LIME_TERRACOTTA_SLAB = ITEMS.register("polished_lime_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_LIME_TERRACOTTA_STAIRS = ITEMS.register("polished_lime_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_LIME_TERRACOTTA_WALL = ITEMS.register("polished_lime_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_LIME_TERRACOTTA_GATE = ITEMS.register("polished_lime_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth Lime Terracotta
	SMOOTH_LIME_TERRACOTTA = ITEMS.register("smooth_lime_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_TERRACOTTA.get(), dyeables())),
	SMOOTH_LIME_TERRACOTTA_SLAB = ITEMS.register("smooth_lime_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_TERRACOTTA_SLAB.get(), dyeables())),
	SMOOTH_LIME_TERRACOTTA_STAIRS = ITEMS.register("smooth_lime_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_TERRACOTTA_STAIRS.get(), dyeables())),
	SMOOTH_LIME_TERRACOTTA_WALL = ITEMS.register("smooth_lime_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_TERRACOTTA_WALL.get(), dyeables())),
	SMOOTH_LIME_TERRACOTTA_GATE = ITEMS.register("smooth_lime_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_TERRACOTTA_GATE.get(), dyeables())),

	// Lime Terracotta Bricks
	LIME_TERRACOTTA_BRICKS = ITEMS.register("lime_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_BRICKS.get(), dyeables())),
	LIME_TERRACOTTA_BRICK_SLAB = ITEMS.register("lime_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_BRICK_SLAB.get(), dyeables())),
	LIME_TERRACOTTA_BRICK_STAIRS = ITEMS.register("lime_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_BRICK_STAIRS.get(), dyeables())),
	LIME_TERRACOTTA_BRICK_WALL = ITEMS.register("lime_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_BRICK_WALL.get(), dyeables())),
	LIME_TERRACOTTA_BRICK_GATE = ITEMS.register("lime_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_BRICK_GATE.get(), dyeables())),

	// Cut Lime Terracotta
	CUT_LIME_TERRACOTTA = ITEMS.register("cut_lime_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_TERRACOTTA.get(), dyeables())),
	CUT_LIME_TERRACOTTA_SLAB = ITEMS.register("cut_lime_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_TERRACOTTA_SLAB.get(), dyeables())),
	CUT_LIME_TERRACOTTA_STAIRS = ITEMS.register("cut_lime_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_TERRACOTTA_STAIRS.get(), dyeables())),
	CUT_LIME_TERRACOTTA_WALL = ITEMS.register("cut_lime_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_TERRACOTTA_WALL.get(), dyeables())),
	CUT_LIME_TERRACOTTA_GATE = ITEMS.register("cut_lime_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_TERRACOTTA_GATE.get(), dyeables())),

	// Lime Terracotta Tiles
	LIME_TERRACOTTA_TILES = ITEMS.register("lime_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_TILES.get(), dyeables())),
	LIME_TERRACOTTA_TILE_SLAB = ITEMS.register("lime_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_TILE_SLAB.get(), dyeables())),
	LIME_TERRACOTTA_TILE_STAIRS = ITEMS.register("lime_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_TILE_STAIRS.get(), dyeables())),
	LIME_TERRACOTTA_TILE_WALL = ITEMS.register("lime_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_TILE_WALL.get(), dyeables())),
	LIME_TERRACOTTA_TILE_GATE = ITEMS.register("lime_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_TILE_GATE.get(), dyeables())),

	// Lime Terracotta Pillar
	LIME_TERRACOTTA_PILLAR = ITEMS.register("lime_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_PILLAR.get(), dyeables())),
	LIME_TERRACOTTA_CORNER_PILLAR = ITEMS.register("lime_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_CORNER_PILLAR.get(), dyeables())),

	// Chiseld Lime Terracotta
	CHISELED_LIME_TERRACOTTA = ITEMS.register("chiseled_lime_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_LIME_TERRACOTTA.get(), dyeables())),

	// Carved Lime Terracotta
	CARVED_LIME_TERRACOTTA = ITEMS.register("carved_lime_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_LIME_TERRACOTTA.get(), dyeables())),


// GREEN TERRACOTTA

	// Base
	GREEN_TERRACOTTA_SLAB = ITEMS.register("green_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_SLAB.get(), dyeables())),
	GREEN_TERRACOTTA_STAIRS = ITEMS.register("green_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_STAIRS.get(), dyeables())),
	GREEN_TERRACOTTA_WALL = ITEMS.register("green_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_WALL.get(), dyeables())),
	GREEN_TERRACOTTA_GATE = ITEMS.register("green_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_GATE.get(), dyeables())),

	// Cobbled Green Terracotta
	COBBLED_GREEN_TERRACOTTA = ITEMS.register("cobbled_green_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_GREEN_TERRACOTTA.get(), dyeables())),
	COBBLED_GREEN_TERRACOTTA_SLAB = ITEMS.register("cobbled_green_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_GREEN_TERRACOTTA_SLAB.get(), dyeables())),
	COBBLED_GREEN_TERRACOTTA_STAIRS = ITEMS.register("cobbled_green_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_GREEN_TERRACOTTA_STAIRS.get(), dyeables())),
	COBBLED_GREEN_TERRACOTTA_WALL = ITEMS.register("cobbled_green_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_GREEN_TERRACOTTA_WALL.get(), dyeables())),
	COBBLED_GREEN_TERRACOTTA_GATE = ITEMS.register("cobbled_green_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_GREEN_TERRACOTTA_GATE.get(), dyeables())),

	// Polished Green Terracotta
	POLISHED_GREEN_TERRACOTTA = ITEMS.register("polished_green_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_TERRACOTTA.get(), dyeables())),
	POLISHED_GREEN_TERRACOTTA_SLAB = ITEMS.register("polished_green_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_GREEN_TERRACOTTA_STAIRS = ITEMS.register("polished_green_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_GREEN_TERRACOTTA_WALL = ITEMS.register("polished_green_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_GREEN_TERRACOTTA_GATE = ITEMS.register("polished_green_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth Green Terracotta
	SMOOTH_GREEN_TERRACOTTA = ITEMS.register("smooth_green_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_TERRACOTTA.get(), dyeables())),
	SMOOTH_GREEN_TERRACOTTA_SLAB = ITEMS.register("smooth_green_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_TERRACOTTA_SLAB.get(), dyeables())),
	SMOOTH_GREEN_TERRACOTTA_STAIRS = ITEMS.register("smooth_green_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_TERRACOTTA_STAIRS.get(), dyeables())),
	SMOOTH_GREEN_TERRACOTTA_WALL = ITEMS.register("smooth_green_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_TERRACOTTA_WALL.get(), dyeables())),
	SMOOTH_GREEN_TERRACOTTA_GATE = ITEMS.register("smooth_green_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_TERRACOTTA_GATE.get(), dyeables())),

	// Green Terracotta Bricks
	GREEN_TERRACOTTA_BRICKS = ITEMS.register("green_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_BRICKS.get(), dyeables())),
	GREEN_TERRACOTTA_BRICK_SLAB = ITEMS.register("green_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_BRICK_SLAB.get(), dyeables())),
	GREEN_TERRACOTTA_BRICK_STAIRS = ITEMS.register("green_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_BRICK_STAIRS.get(), dyeables())),
	GREEN_TERRACOTTA_BRICK_WALL = ITEMS.register("green_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_BRICK_WALL.get(), dyeables())),
	GREEN_TERRACOTTA_BRICK_GATE = ITEMS.register("green_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_BRICK_GATE.get(), dyeables())),

	// Cut Green Terracotta
	CUT_GREEN_TERRACOTTA = ITEMS.register("cut_green_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_TERRACOTTA.get(), dyeables())),
	CUT_GREEN_TERRACOTTA_SLAB = ITEMS.register("cut_green_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_TERRACOTTA_SLAB.get(), dyeables())),
	CUT_GREEN_TERRACOTTA_STAIRS = ITEMS.register("cut_green_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_TERRACOTTA_STAIRS.get(), dyeables())),
	CUT_GREEN_TERRACOTTA_WALL = ITEMS.register("cut_green_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_TERRACOTTA_WALL.get(), dyeables())),
	CUT_GREEN_TERRACOTTA_GATE = ITEMS.register("cut_green_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_TERRACOTTA_GATE.get(), dyeables())),

	// Green Terracotta Tiles
	GREEN_TERRACOTTA_TILES = ITEMS.register("green_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_TILES.get(), dyeables())),
	GREEN_TERRACOTTA_TILE_SLAB = ITEMS.register("green_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_TILE_SLAB.get(), dyeables())),
	GREEN_TERRACOTTA_TILE_STAIRS = ITEMS.register("green_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_TILE_STAIRS.get(), dyeables())),
	GREEN_TERRACOTTA_TILE_WALL = ITEMS.register("green_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_TILE_WALL.get(), dyeables())),
	GREEN_TERRACOTTA_TILE_GATE = ITEMS.register("green_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_TILE_GATE.get(), dyeables())),

	// Green Terracotta Pillar
	GREEN_TERRACOTTA_PILLAR = ITEMS.register("green_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_PILLAR.get(), dyeables())),
	GREEN_TERRACOTTA_CORNER_PILLAR = ITEMS.register("green_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Green Terracotta
	CHISELED_GREEN_TERRACOTTA = ITEMS.register("chiseled_green_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_GREEN_TERRACOTTA.get(), dyeables())),

	// Carved Green Terracotta
	CARVED_GREEN_TERRACOTTA = ITEMS.register("carved_green_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_GREEN_TERRACOTTA.get(), dyeables())),


// BLUE TERRACOTTA

	// Base
	BLUE_TERRACOTTA_SLAB = ITEMS.register("blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_SLAB.get(), dyeables())),
	BLUE_TERRACOTTA_STAIRS = ITEMS.register("blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_STAIRS.get(), dyeables())),
	BLUE_TERRACOTTA_WALL = ITEMS.register("blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_WALL.get(), dyeables())),
	BLUE_TERRACOTTA_GATE = ITEMS.register("blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_GATE.get(), dyeables())),

	// Cobbled Blue Terracotta
	COBBLED_BLUE_TERRACOTTA = ITEMS.register("cobbled_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLUE_TERRACOTTA.get(), dyeables())),
	COBBLED_BLUE_TERRACOTTA_SLAB = ITEMS.register("cobbled_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLUE_TERRACOTTA_SLAB.get(), dyeables())),
	COBBLED_BLUE_TERRACOTTA_STAIRS = ITEMS.register("cobbled_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLUE_TERRACOTTA_STAIRS.get(), dyeables())),
	COBBLED_BLUE_TERRACOTTA_WALL = ITEMS.register("cobbled_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLUE_TERRACOTTA_WALL.get(), dyeables())),
	COBBLED_BLUE_TERRACOTTA_GATE = ITEMS.register("cobbled_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLUE_TERRACOTTA_GATE.get(), dyeables())),

	// Polished Blue Terracotta
	POLISHED_BLUE_TERRACOTTA = ITEMS.register("polished_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_TERRACOTTA.get(), dyeables())),
	POLISHED_BLUE_TERRACOTTA_SLAB = ITEMS.register("polished_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_BLUE_TERRACOTTA_STAIRS = ITEMS.register("polished_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_BLUE_TERRACOTTA_WALL = ITEMS.register("polished_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_BLUE_TERRACOTTA_GATE = ITEMS.register("polished_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth Blue Terracotta
	SMOOTH_BLUE_TERRACOTTA = ITEMS.register("smooth_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_TERRACOTTA.get(), dyeables())),
	SMOOTH_BLUE_TERRACOTTA_SLAB = ITEMS.register("smooth_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_TERRACOTTA_SLAB.get(), dyeables())),
	SMOOTH_BLUE_TERRACOTTA_STAIRS = ITEMS.register("smooth_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_TERRACOTTA_STAIRS.get(), dyeables())),
	SMOOTH_BLUE_TERRACOTTA_WALL = ITEMS.register("smooth_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_TERRACOTTA_WALL.get(), dyeables())),
	SMOOTH_BLUE_TERRACOTTA_GATE = ITEMS.register("smooth_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_TERRACOTTA_GATE.get(), dyeables())),

	// Blue Terracotta Bricks
	BLUE_TERRACOTTA_BRICKS = ITEMS.register("blue_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_BRICKS.get(), dyeables())),
	BLUE_TERRACOTTA_BRICK_SLAB = ITEMS.register("blue_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_BRICK_SLAB.get(), dyeables())),
	BLUE_TERRACOTTA_BRICK_STAIRS = ITEMS.register("blue_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_BRICK_STAIRS.get(), dyeables())),
	BLUE_TERRACOTTA_BRICK_WALL = ITEMS.register("blue_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_BRICK_WALL.get(), dyeables())),
	BLUE_TERRACOTTA_BRICK_GATE = ITEMS.register("blue_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_BRICK_GATE.get(), dyeables())),

	// Cut Blue Terracotta
	CUT_BLUE_TERRACOTTA = ITEMS.register("cut_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_TERRACOTTA.get(), dyeables())),
	CUT_BLUE_TERRACOTTA_SLAB = ITEMS.register("cut_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_TERRACOTTA_SLAB.get(), dyeables())),
	CUT_BLUE_TERRACOTTA_STAIRS = ITEMS.register("cut_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_TERRACOTTA_STAIRS.get(), dyeables())),
	CUT_BLUE_TERRACOTTA_WALL = ITEMS.register("cut_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_TERRACOTTA_WALL.get(), dyeables())),
	CUT_BLUE_TERRACOTTA_GATE = ITEMS.register("cut_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_TERRACOTTA_GATE.get(), dyeables())),

	// Blue Terracotta Tiles
	BLUE_TERRACOTTA_TILES = ITEMS.register("blue_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_TILES.get(), dyeables())),
	BLUE_TERRACOTTA_TILE_SLAB = ITEMS.register("blue_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_TILE_SLAB.get(), dyeables())),
	BLUE_TERRACOTTA_TILE_STAIRS = ITEMS.register("blue_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_TILE_STAIRS.get(), dyeables())),
	BLUE_TERRACOTTA_TILE_WALL = ITEMS.register("blue_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_TILE_WALL.get(), dyeables())),
	BLUE_TERRACOTTA_TILE_GATE = ITEMS.register("blue_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_TILE_GATE.get(), dyeables())),

	// Blue Terracotta Pillar
	BLUE_TERRACOTTA_PILLAR = ITEMS.register("blue_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_PILLAR.get(), dyeables())),
	BLUE_TERRACOTTA_CORNER_PILLAR = ITEMS.register("blue_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Blue Terracotta
	CHISELED_BLUE_TERRACOTTA = ITEMS.register("chiseled_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_BLUE_TERRACOTTA.get(), dyeables())),

	// Carved Blue Terracotta
	CARVED_BLUE_TERRACOTTA = ITEMS.register("carved_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_BLUE_TERRACOTTA.get(), dyeables())),


// CYAN TERRACOTTA

	// Base
	CYAN_TERRACOTTA_SLAB = ITEMS.register("cyan_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_SLAB.get(), dyeables())),
	CYAN_TERRACOTTA_STAIRS = ITEMS.register("cyan_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_STAIRS.get(), dyeables())),
	CYAN_TERRACOTTA_WALL = ITEMS.register("cyan_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_WALL.get(), dyeables())),
	CYAN_TERRACOTTA_GATE = ITEMS.register("cyan_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_GATE.get(), dyeables())),

	// Cobbled Cyan Terracotta
	COBBLED_CYAN_TERRACOTTA = ITEMS.register("cobbled_cyan_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_CYAN_TERRACOTTA.get(), dyeables())),
	COBBLED_CYAN_TERRACOTTA_SLAB = ITEMS.register("cobbled_cyan_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_CYAN_TERRACOTTA_SLAB.get(), dyeables())),
	COBBLED_CYAN_TERRACOTTA_STAIRS = ITEMS.register("cobbled_cyan_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_CYAN_TERRACOTTA_STAIRS.get(), dyeables())),
	COBBLED_CYAN_TERRACOTTA_WALL = ITEMS.register("cobbled_cyan_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_CYAN_TERRACOTTA_WALL.get(), dyeables())),
	COBBLED_CYAN_TERRACOTTA_GATE = ITEMS.register("cobbled_cyan_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_CYAN_TERRACOTTA_GATE.get(), dyeables())),

	// Polished Cyan Terracotta
	POLISHED_CYAN_TERRACOTTA = ITEMS.register("polished_cyan_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_TERRACOTTA.get(), dyeables())),
	POLISHED_CYAN_TERRACOTTA_SLAB = ITEMS.register("polished_cyan_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_CYAN_TERRACOTTA_STAIRS = ITEMS.register("polished_cyan_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_CYAN_TERRACOTTA_WALL = ITEMS.register("polished_cyan_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_CYAN_TERRACOTTA_GATE = ITEMS.register("polished_cyan_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth Cyan Terracotta
	SMOOTH_CYAN_TERRACOTTA = ITEMS.register("smooth_cyan_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_TERRACOTTA.get(), dyeables())),
	SMOOTH_CYAN_TERRACOTTA_SLAB = ITEMS.register("smooth_cyan_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_TERRACOTTA_SLAB.get(), dyeables())),
	SMOOTH_CYAN_TERRACOTTA_STAIRS = ITEMS.register("smooth_cyan_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_TERRACOTTA_STAIRS.get(), dyeables())),
	SMOOTH_CYAN_TERRACOTTA_WALL = ITEMS.register("smooth_cyan_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_TERRACOTTA_WALL.get(), dyeables())),
	SMOOTH_CYAN_TERRACOTTA_GATE = ITEMS.register("smooth_cyan_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_TERRACOTTA_GATE.get(), dyeables())),

	// Cyan Terracotta Bricks
	CYAN_TERRACOTTA_BRICKS = ITEMS.register("cyan_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_BRICKS.get(), dyeables())),
	CYAN_TERRACOTTA_BRICK_SLAB = ITEMS.register("cyan_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_BRICK_SLAB.get(), dyeables())),
	CYAN_TERRACOTTA_BRICK_STAIRS = ITEMS.register("cyan_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_BRICK_STAIRS.get(), dyeables())),
	CYAN_TERRACOTTA_BRICK_WALL = ITEMS.register("cyan_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_BRICK_WALL.get(), dyeables())),
	CYAN_TERRACOTTA_BRICK_GATE = ITEMS.register("cyan_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_BRICK_GATE.get(), dyeables())),

	// Cut Cyan Terracotta
	CUT_CYAN_TERRACOTTA = ITEMS.register("cut_cyan_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_TERRACOTTA.get(), dyeables())),
	CUT_CYAN_TERRACOTTA_SLAB = ITEMS.register("cut_cyan_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_TERRACOTTA_SLAB.get(), dyeables())),
	CUT_CYAN_TERRACOTTA_STAIRS = ITEMS.register("cut_cyan_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_TERRACOTTA_STAIRS.get(), dyeables())),
	CUT_CYAN_TERRACOTTA_WALL = ITEMS.register("cut_cyan_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_TERRACOTTA_WALL.get(), dyeables())),
	CUT_CYAN_TERRACOTTA_GATE = ITEMS.register("cut_cyan_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_TERRACOTTA_GATE.get(), dyeables())),

	// Cyan Terracotta Tiles
	CYAN_TERRACOTTA_TILES = ITEMS.register("cyan_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_TILES.get(), dyeables())),
	CYAN_TERRACOTTA_TILE_SLAB = ITEMS.register("cyan_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_TILE_SLAB.get(), dyeables())),
	CYAN_TERRACOTTA_TILE_STAIRS = ITEMS.register("cyan_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_TILE_STAIRS.get(), dyeables())),
	CYAN_TERRACOTTA_TILE_WALL = ITEMS.register("cyan_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_TILE_WALL.get(), dyeables())),
	CYAN_TERRACOTTA_TILE_GATE = ITEMS.register("cyan_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_TILE_GATE.get(), dyeables())),

	// Cyan Terracotta Pillar
	CYAN_TERRACOTTA_PILLAR = ITEMS.register("cyan_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_PILLAR.get(), dyeables())),
	CYAN_TERRACOTTA_CORNER_PILLAR = ITEMS.register("cyan_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Cyan Terracotta
	CHISELED_CYAN_TERRACOTTA = ITEMS.register("chiseled_cyan_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_CYAN_TERRACOTTA.get(), dyeables())),

	// Carved Cyan Terracotta
	CARVED_CYAN_TERRACOTTA = ITEMS.register("carved_cyan_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_CYAN_TERRACOTTA.get(), dyeables())),


// LIGHT BLUE TERRACOTTA

	// Base
	LIGHT_BLUE_TERRACOTTA_SLAB = ITEMS.register("light_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), dyeables())),
	LIGHT_BLUE_TERRACOTTA_STAIRS = ITEMS.register("light_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), dyeables())),
	LIGHT_BLUE_TERRACOTTA_WALL = ITEMS.register("light_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(), dyeables())),
	LIGHT_BLUE_TERRACOTTA_GATE = ITEMS.register("light_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_GATE.get(), dyeables())),

	// Cobbled Light Blue Terracotta
	COBBLED_LIGHT_BLUE_TERRACOTTA = ITEMS.register("cobbled_light_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_BLUE_TERRACOTTA.get(), dyeables())),
	COBBLED_LIGHT_BLUE_TERRACOTTA_SLAB = ITEMS.register("cobbled_light_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_BLUE_TERRACOTTA_SLAB.get(), dyeables())),
	COBBLED_LIGHT_BLUE_TERRACOTTA_STAIRS = ITEMS.register("cobbled_light_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_BLUE_TERRACOTTA_STAIRS.get(), dyeables())),
	COBBLED_LIGHT_BLUE_TERRACOTTA_WALL = ITEMS.register("cobbled_light_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_BLUE_TERRACOTTA_WALL.get(), dyeables())),
	COBBLED_LIGHT_BLUE_TERRACOTTA_GATE = ITEMS.register("cobbled_light_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_BLUE_TERRACOTTA_GATE.get(), dyeables())),

	// Polished Light Blue Terracotta
	POLISHED_LIGHT_BLUE_TERRACOTTA = ITEMS.register("polished_light_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA.get(), dyeables())),
	POLISHED_LIGHT_BLUE_TERRACOTTA_SLAB = ITEMS.register("polished_light_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_LIGHT_BLUE_TERRACOTTA_STAIRS = ITEMS.register("polished_light_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_LIGHT_BLUE_TERRACOTTA_WALL = ITEMS.register("polished_light_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_LIGHT_BLUE_TERRACOTTA_GATE = ITEMS.register("polished_light_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth Light Blue Terracotta
	SMOOTH_LIGHT_BLUE_TERRACOTTA = ITEMS.register("smooth_light_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA.get(), dyeables())),
	SMOOTH_LIGHT_BLUE_TERRACOTTA_SLAB = ITEMS.register("smooth_light_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_SLAB.get(), dyeables())),
	SMOOTH_LIGHT_BLUE_TERRACOTTA_STAIRS = ITEMS.register("smooth_light_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_STAIRS.get(), dyeables())),
	SMOOTH_LIGHT_BLUE_TERRACOTTA_WALL = ITEMS.register("smooth_light_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_WALL.get(), dyeables())),
	SMOOTH_LIGHT_BLUE_TERRACOTTA_GATE = ITEMS.register("smooth_light_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_GATE.get(), dyeables())),

	// Light Blue Terracotta Bricks
	LIGHT_BLUE_TERRACOTTA_BRICKS = ITEMS.register("light_blue_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get(), dyeables())),
	LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = ITEMS.register("light_blue_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB.get(), dyeables())),
	LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = ITEMS.register("light_blue_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS.get(), dyeables())),
	LIGHT_BLUE_TERRACOTTA_BRICK_WALL = ITEMS.register("light_blue_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL.get(), dyeables())),
	LIGHT_BLUE_TERRACOTTA_BRICK_GATE = ITEMS.register("light_blue_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_GATE.get(), dyeables())),

	// Cut Light Blue Terracotta
	CUT_LIGHT_BLUE_TERRACOTTA = ITEMS.register("cut_light_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_TERRACOTTA.get(), dyeables())),
	CUT_LIGHT_BLUE_TERRACOTTA_SLAB = ITEMS.register("cut_light_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_TERRACOTTA_SLAB.get(), dyeables())),
	CUT_LIGHT_BLUE_TERRACOTTA_STAIRS = ITEMS.register("cut_light_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_TERRACOTTA_STAIRS.get(), dyeables())),
	CUT_LIGHT_BLUE_TERRACOTTA_WALL = ITEMS.register("cut_light_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_TERRACOTTA_WALL.get(), dyeables())),
	CUT_LIGHT_BLUE_TERRACOTTA_GATE = ITEMS.register("cut_light_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_TERRACOTTA_GATE.get(), dyeables())),

	// Light Blue Terracotta Tiles
	LIGHT_BLUE_TERRACOTTA_TILES = ITEMS.register("light_blue_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_TILES.get(), dyeables())),
	LIGHT_BLUE_TERRACOTTA_TILE_SLAB = ITEMS.register("light_blue_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_TILE_SLAB.get(), dyeables())),
	LIGHT_BLUE_TERRACOTTA_TILE_STAIRS = ITEMS.register("light_blue_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_TILE_STAIRS.get(), dyeables())),
	LIGHT_BLUE_TERRACOTTA_TILE_WALL = ITEMS.register("light_blue_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_TILE_WALL.get(), dyeables())),
	LIGHT_BLUE_TERRACOTTA_TILE_GATE = ITEMS.register("light_blue_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_TILE_GATE.get(), dyeables())),

	// Light Blue Terracotta Pillar
	LIGHT_BLUE_TERRACOTTA_PILLAR = ITEMS.register("light_blue_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_PILLAR.get(), dyeables())),
	LIGHT_BLUE_TERRACOTTA_CORNER_PILLAR = ITEMS.register("light_blue_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Light Blue Terracotta
	CHISELED_LIGHT_BLUE_TERRACOTTA = ITEMS.register("chiseled_light_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_LIGHT_BLUE_TERRACOTTA.get(), dyeables())),

	// Carved Light Blue Terracotta
	CARVED_LIGHT_BLUE_TERRACOTTA = ITEMS.register("carved_light_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_LIGHT_BLUE_TERRACOTTA.get(), dyeables())),


// PURPLE TERRACOTTA

	// Base
	PURPLE_TERRACOTTA_SLAB = ITEMS.register("purple_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_SLAB.get(), dyeables())),
	PURPLE_TERRACOTTA_STAIRS = ITEMS.register("purple_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_STAIRS.get(), dyeables())),
	PURPLE_TERRACOTTA_WALL = ITEMS.register("purple_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_WALL.get(), dyeables())),
	PURPLE_TERRACOTTA_GATE = ITEMS.register("purple_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_GATE.get(), dyeables())),

	// Cobbled Purple Terracotta
	COBBLED_PURPLE_TERRACOTTA = ITEMS.register("cobbled_purple_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_PURPLE_TERRACOTTA.get(), dyeables())),
	COBBLED_PURPLE_TERRACOTTA_SLAB = ITEMS.register("cobbled_purple_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_PURPLE_TERRACOTTA_SLAB.get(), dyeables())),
	COBBLED_PURPLE_TERRACOTTA_STAIRS = ITEMS.register("cobbled_purple_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_PURPLE_TERRACOTTA_STAIRS.get(), dyeables())),
	COBBLED_PURPLE_TERRACOTTA_WALL = ITEMS.register("cobbled_purple_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_PURPLE_TERRACOTTA_WALL.get(), dyeables())),
	COBBLED_PURPLE_TERRACOTTA_GATE = ITEMS.register("cobbled_purple_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_PURPLE_TERRACOTTA_GATE.get(), dyeables())),

	// Polished Purple Terracotta
	POLISHED_PURPLE_TERRACOTTA = ITEMS.register("polished_purple_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_TERRACOTTA.get(), dyeables())),
	POLISHED_PURPLE_TERRACOTTA_SLAB = ITEMS.register("polished_purple_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_PURPLE_TERRACOTTA_STAIRS = ITEMS.register("polished_purple_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_PURPLE_TERRACOTTA_WALL = ITEMS.register("polished_purple_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_PURPLE_TERRACOTTA_GATE = ITEMS.register("polished_purple_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth Purple Terracotta
	SMOOTH_PURPLE_TERRACOTTA = ITEMS.register("smooth_purple_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_TERRACOTTA.get(), dyeables())),
	SMOOTH_PURPLE_TERRACOTTA_SLAB = ITEMS.register("smooth_purple_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_TERRACOTTA_SLAB.get(), dyeables())),
	SMOOTH_PURPLE_TERRACOTTA_STAIRS = ITEMS.register("smooth_purple_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_TERRACOTTA_STAIRS.get(), dyeables())),
	SMOOTH_PURPLE_TERRACOTTA_WALL = ITEMS.register("smooth_purple_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_TERRACOTTA_WALL.get(), dyeables())),
	SMOOTH_PURPLE_TERRACOTTA_GATE = ITEMS.register("smooth_purple_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_TERRACOTTA_GATE.get(), dyeables())),

	// Purple Terracotta Bricks
	PURPLE_TERRACOTTA_BRICKS = ITEMS.register("purple_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_BRICKS.get(), dyeables())),
	PURPLE_TERRACOTTA_BRICK_SLAB = ITEMS.register("purple_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_BRICK_SLAB.get(), dyeables())),
	PURPLE_TERRACOTTA_BRICK_STAIRS = ITEMS.register("purple_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS.get(), dyeables())),
	PURPLE_TERRACOTTA_BRICK_WALL = ITEMS.register("purple_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_BRICK_WALL.get(), dyeables())),
	PURPLE_TERRACOTTA_BRICK_GATE = ITEMS.register("purple_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_BRICK_GATE.get(), dyeables())),

	// Cut Purple Terracotta
	CUT_PURPLE_TERRACOTTA = ITEMS.register("cut_purple_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_TERRACOTTA.get(), dyeables())),
	CUT_PURPLE_TERRACOTTA_SLAB = ITEMS.register("cut_purple_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_TERRACOTTA_SLAB.get(), dyeables())),
	CUT_PURPLE_TERRACOTTA_STAIRS = ITEMS.register("cut_purple_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_TERRACOTTA_STAIRS.get(), dyeables())),
	CUT_PURPLE_TERRACOTTA_WALL = ITEMS.register("cut_purple_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_TERRACOTTA_WALL.get(), dyeables())),
	CUT_PURPLE_TERRACOTTA_GATE = ITEMS.register("cut_purple_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_TERRACOTTA_GATE.get(), dyeables())),

	// Purple Terracotta Tiles
	PURPLE_TERRACOTTA_TILES = ITEMS.register("purple_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_TILES.get(), dyeables())),
	PURPLE_TERRACOTTA_TILE_SLAB = ITEMS.register("purple_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_TILE_SLAB.get(), dyeables())),
	PURPLE_TERRACOTTA_TILE_STAIRS = ITEMS.register("purple_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_TILE_STAIRS.get(), dyeables())),
	PURPLE_TERRACOTTA_TILE_WALL = ITEMS.register("purple_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_TILE_WALL.get(), dyeables())),
	PURPLE_TERRACOTTA_TILE_GATE = ITEMS.register("purple_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_TILE_GATE.get(), dyeables())),

	// Purple Terracotta Pillar
	PURPLE_TERRACOTTA_PILLAR = ITEMS.register("purple_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_PILLAR.get(), dyeables())),
	PURPLE_TERRACOTTA_CORNER_PILLAR = ITEMS.register("purple_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Purple Terracotta
	CHISELED_PURPLE_TERRACOTTA = ITEMS.register("chiseled_purple_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_PURPLE_TERRACOTTA.get(), dyeables())),

	// Carved Purple Terracotta
	CARVED_PURPLE_TERRACOTTA = ITEMS.register("carved_purple_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_PURPLE_TERRACOTTA.get(), dyeables())),


// MAGENTA TERRACOTTA

	// Base
	MAGENTA_TERRACOTTA_SLAB = ITEMS.register("magenta_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_SLAB.get(), dyeables())),
	MAGENTA_TERRACOTTA_STAIRS = ITEMS.register("magenta_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), dyeables())),
	MAGENTA_TERRACOTTA_WALL = ITEMS.register("magenta_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_WALL.get(), dyeables())),
	MAGENTA_TERRACOTTA_GATE = ITEMS.register("magenta_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_GATE.get(), dyeables())),

	// Cobbled Magenta Terracotta
	COBBLED_MAGENTA_TERRACOTTA = ITEMS.register("cobbled_magenta_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_MAGENTA_TERRACOTTA.get(), dyeables())),
	COBBLED_MAGENTA_TERRACOTTA_SLAB = ITEMS.register("cobbled_magenta_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_MAGENTA_TERRACOTTA_SLAB.get(), dyeables())),
	COBBLED_MAGENTA_TERRACOTTA_STAIRS = ITEMS.register("cobbled_magenta_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_MAGENTA_TERRACOTTA_STAIRS.get(), dyeables())),
	COBBLED_MAGENTA_TERRACOTTA_WALL = ITEMS.register("cobbled_magenta_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_MAGENTA_TERRACOTTA_WALL.get(), dyeables())),
	COBBLED_MAGENTA_TERRACOTTA_GATE = ITEMS.register("cobbled_magenta_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_MAGENTA_TERRACOTTA_GATE.get(), dyeables())),

	// Polished Magenta Terracotta
	POLISHED_MAGENTA_TERRACOTTA = ITEMS.register("polished_magenta_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_TERRACOTTA.get(), dyeables())),
	POLISHED_MAGENTA_TERRACOTTA_SLAB = ITEMS.register("polished_magenta_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_MAGENTA_TERRACOTTA_STAIRS = ITEMS.register("polished_magenta_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_MAGENTA_TERRACOTTA_WALL = ITEMS.register("polished_magenta_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_MAGENTA_TERRACOTTA_GATE = ITEMS.register("polished_magenta_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth Magenta Terracotta
	SMOOTH_MAGENTA_TERRACOTTA = ITEMS.register("smooth_magenta_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_TERRACOTTA.get(), dyeables())),
	SMOOTH_MAGENTA_TERRACOTTA_SLAB = ITEMS.register("smooth_magenta_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_TERRACOTTA_SLAB.get(), dyeables())),
	SMOOTH_MAGENTA_TERRACOTTA_STAIRS = ITEMS.register("smooth_magenta_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_TERRACOTTA_STAIRS.get(), dyeables())),
	SMOOTH_MAGENTA_TERRACOTTA_WALL = ITEMS.register("smooth_magenta_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_TERRACOTTA_WALL.get(), dyeables())),
	SMOOTH_MAGENTA_TERRACOTTA_GATE = ITEMS.register("smooth_magenta_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_TERRACOTTA_GATE.get(), dyeables())),

	// Magenta Terracotta Bricks
	MAGENTA_TERRACOTTA_BRICKS = ITEMS.register("magenta_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_BRICKS.get(), dyeables())),
	MAGENTA_TERRACOTTA_BRICK_SLAB = ITEMS.register("magenta_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB.get(), dyeables())),
	MAGENTA_TERRACOTTA_BRICK_STAIRS = ITEMS.register("magenta_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS.get(), dyeables())),
	MAGENTA_TERRACOTTA_BRICK_WALL = ITEMS.register("magenta_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_BRICK_WALL.get(), dyeables())),
	MAGENTA_TERRACOTTA_BRICK_GATE = ITEMS.register("magenta_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_BRICK_GATE.get(), dyeables())),

	// Cut Magenta Terracotta
	CUT_MAGENTA_TERRACOTTA = ITEMS.register("cut_magenta_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_TERRACOTTA.get(), dyeables())),
	CUT_MAGENTA_TERRACOTTA_SLAB = ITEMS.register("cut_magenta_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_TERRACOTTA_SLAB.get(), dyeables())),
	CUT_MAGENTA_TERRACOTTA_STAIRS = ITEMS.register("cut_magenta_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_TERRACOTTA_STAIRS.get(), dyeables())),
	CUT_MAGENTA_TERRACOTTA_WALL = ITEMS.register("cut_magenta_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_TERRACOTTA_WALL.get(), dyeables())),
	CUT_MAGENTA_TERRACOTTA_GATE = ITEMS.register("cut_magenta_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_TERRACOTTA_GATE.get(), dyeables())),

	// Magenta Terracotta Tiles
	MAGENTA_TERRACOTTA_TILES = ITEMS.register("magenta_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_TILES.get(), dyeables())),
	MAGENTA_TERRACOTTA_TILE_SLAB = ITEMS.register("magenta_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_TILE_SLAB.get(), dyeables())),
	MAGENTA_TERRACOTTA_TILE_STAIRS = ITEMS.register("magenta_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_TILE_STAIRS.get(), dyeables())),
	MAGENTA_TERRACOTTA_TILE_WALL = ITEMS.register("magenta_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_TILE_WALL.get(), dyeables())),
	MAGENTA_TERRACOTTA_TILE_GATE = ITEMS.register("magenta_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_TILE_GATE.get(), dyeables())),

	// Magenta Terracotta Pillar
	MAGENTA_TERRACOTTA_PILLAR = ITEMS.register("magenta_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_PILLAR.get(), dyeables())),
	MAGENTA_TERRACOTTA_CORNER_PILLAR = ITEMS.register("magenta_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Magenta Terracotta
	CHISELED_MAGENTA_TERRACOTTA = ITEMS.register("chiseled_magenta_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_MAGENTA_TERRACOTTA.get(), dyeables())),

	// Carved Magenta Terracotta
	CARVED_MAGENTA_TERRACOTTA = ITEMS.register("carved_magenta_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_MAGENTA_TERRACOTTA.get(), dyeables())),


// PINK TERRACOTTA

	// Base
	PINK_TERRACOTTA_SLAB = ITEMS.register("pink_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_SLAB.get(), dyeables())),
	PINK_TERRACOTTA_STAIRS = ITEMS.register("pink_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_STAIRS.get(), dyeables())),
	PINK_TERRACOTTA_WALL = ITEMS.register("pink_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_WALL.get(), dyeables())),
	PINK_TERRACOTTA_GATE = ITEMS.register("pink_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_GATE.get(), dyeables())),

	// Cobbled Pink Terracotta
	COBBLED_PINK_TERRACOTTA = ITEMS.register("cobbled_pink_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_PINK_TERRACOTTA.get(), dyeables())),
	COBBLED_PINK_TERRACOTTA_SLAB = ITEMS.register("cobbled_pink_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_PINK_TERRACOTTA_SLAB.get(), dyeables())),
	COBBLED_PINK_TERRACOTTA_STAIRS = ITEMS.register("cobbled_pink_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_PINK_TERRACOTTA_STAIRS.get(), dyeables())),
	COBBLED_PINK_TERRACOTTA_WALL = ITEMS.register("cobbled_pink_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_PINK_TERRACOTTA_WALL.get(), dyeables())),
	COBBLED_PINK_TERRACOTTA_GATE = ITEMS.register("cobbled_pink_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_PINK_TERRACOTTA_GATE.get(), dyeables())),

	// Polished Pink Terracotta
	POLISHED_PINK_TERRACOTTA = ITEMS.register("polished_pink_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_TERRACOTTA.get(), dyeables())),
	POLISHED_PINK_TERRACOTTA_SLAB = ITEMS.register("polished_pink_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_PINK_TERRACOTTA_STAIRS = ITEMS.register("polished_pink_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_PINK_TERRACOTTA_WALL = ITEMS.register("polished_pink_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_PINK_TERRACOTTA_GATE = ITEMS.register("polished_pink_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth Pink Terracotta
	SMOOTH_PINK_TERRACOTTA = ITEMS.register("smooth_pink_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_TERRACOTTA.get(), dyeables())),
	SMOOTH_PINK_TERRACOTTA_SLAB = ITEMS.register("smooth_pink_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_TERRACOTTA_SLAB.get(), dyeables())),
	SMOOTH_PINK_TERRACOTTA_STAIRS = ITEMS.register("smooth_pink_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_TERRACOTTA_STAIRS.get(), dyeables())),
	SMOOTH_PINK_TERRACOTTA_WALL = ITEMS.register("smooth_pink_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_TERRACOTTA_WALL.get(), dyeables())),
	SMOOTH_PINK_TERRACOTTA_GATE = ITEMS.register("smooth_pink_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_TERRACOTTA_GATE.get(), dyeables())),

	// Pink Terracotta Bricks
	PINK_TERRACOTTA_BRICKS = ITEMS.register("pink_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_BRICKS.get(), dyeables())),
	PINK_TERRACOTTA_BRICK_SLAB = ITEMS.register("pink_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_BRICK_SLAB.get(), dyeables())),
	PINK_TERRACOTTA_BRICK_STAIRS = ITEMS.register("pink_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_BRICK_STAIRS.get(), dyeables())),
	PINK_TERRACOTTA_BRICK_WALL = ITEMS.register("pink_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_BRICK_WALL.get(), dyeables())),
	PINK_TERRACOTTA_BRICK_GATE = ITEMS.register("pink_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_BRICK_GATE.get(), dyeables())),

	// Cut Pink Terracotta
	CUT_PINK_TERRACOTTA = ITEMS.register("cut_pink_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_TERRACOTTA.get(), dyeables())),
	CUT_PINK_TERRACOTTA_SLAB = ITEMS.register("cut_pink_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_TERRACOTTA_SLAB.get(), dyeables())),
	CUT_PINK_TERRACOTTA_STAIRS = ITEMS.register("cut_pink_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_TERRACOTTA_STAIRS.get(), dyeables())),
	CUT_PINK_TERRACOTTA_WALL = ITEMS.register("cut_pink_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_TERRACOTTA_WALL.get(), dyeables())),
	CUT_PINK_TERRACOTTA_GATE = ITEMS.register("cut_pink_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_TERRACOTTA_GATE.get(), dyeables())),

	// Pink Terracotta Tiles
	PINK_TERRACOTTA_TILES = ITEMS.register("pink_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_TILES.get(), dyeables())),
	PINK_TERRACOTTA_TILE_SLAB = ITEMS.register("pink_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_TILE_SLAB.get(), dyeables())),
	PINK_TERRACOTTA_TILE_STAIRS = ITEMS.register("pink_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_TILE_STAIRS.get(), dyeables())),
	PINK_TERRACOTTA_TILE_WALL = ITEMS.register("pink_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_TILE_WALL.get(), dyeables())),
	PINK_TERRACOTTA_TILE_GATE = ITEMS.register("pink_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_TILE_GATE.get(), dyeables())),

	// Pink Terracotta Pillar
	PINK_TERRACOTTA_PILLAR = ITEMS.register("pink_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_PILLAR.get(), dyeables())),
	PINK_TERRACOTTA_CORNER_PILLAR = ITEMS.register("pink_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Pink Terracotta
	CHISELED_PINK_TERRACOTTA = ITEMS.register("chiseled_pink_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_PINK_TERRACOTTA.get(), dyeables())),

	// Carved Pink Terracotta
	CARVED_PINK_TERRACOTTA = ITEMS.register("carved_pink_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_PINK_TERRACOTTA.get(), dyeables())),


// WHITE TERRACOTTa

	// Base
	WHITE_TERRACOTTA_SLAB = ITEMS.register("white_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_SLAB.get(), dyeables())),
	WHITE_TERRACOTTA_STAIRS = ITEMS.register("white_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_STAIRS.get(), dyeables())),
	WHITE_TERRACOTTA_WALL = ITEMS.register("white_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_WALL.get(), dyeables())),
	WHITE_TERRACOTTA_GATE = ITEMS.register("white_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_GATE.get(), dyeables())),

	// Cobbled White Terracotta
	COBBLED_WHITE_TERRACOTTA = ITEMS.register("cobbled_white_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_WHITE_TERRACOTTA.get(), dyeables())),
	COBBLED_WHITE_TERRACOTTA_SLAB = ITEMS.register("cobbled_white_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_WHITE_TERRACOTTA_SLAB.get(), dyeables())),
	COBBLED_WHITE_TERRACOTTA_STAIRS = ITEMS.register("cobbled_white_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_WHITE_TERRACOTTA_STAIRS.get(), dyeables())),
	COBBLED_WHITE_TERRACOTTA_WALL = ITEMS.register("cobbled_white_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_WHITE_TERRACOTTA_WALL.get(), dyeables())),
	COBBLED_WHITE_TERRACOTTA_GATE = ITEMS.register("cobbled_white_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_WHITE_TERRACOTTA_GATE.get(), dyeables())),

	// Polished White Terracotta
	POLISHED_WHITE_TERRACOTTA = ITEMS.register("polished_white_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_TERRACOTTA.get(), dyeables())),
	POLISHED_WHITE_TERRACOTTA_SLAB = ITEMS.register("polished_white_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_WHITE_TERRACOTTA_STAIRS = ITEMS.register("polished_white_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_WHITE_TERRACOTTA_WALL = ITEMS.register("polished_white_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_WHITE_TERRACOTTA_GATE = ITEMS.register("polished_white_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth White Terracotta
	SMOOTH_WHITE_TERRACOTTA = ITEMS.register("smooth_white_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_TERRACOTTA.get(), dyeables())),
	SMOOTH_WHITE_TERRACOTTA_SLAB = ITEMS.register("smooth_white_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_TERRACOTTA_SLAB.get(), dyeables())),
	SMOOTH_WHITE_TERRACOTTA_STAIRS = ITEMS.register("smooth_white_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_TERRACOTTA_STAIRS.get(), dyeables())),
	SMOOTH_WHITE_TERRACOTTA_WALL = ITEMS.register("smooth_white_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_TERRACOTTA_WALL.get(), dyeables())),
	SMOOTH_WHITE_TERRACOTTA_GATE = ITEMS.register("smooth_white_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_TERRACOTTA_GATE.get(), dyeables())),

	// White Terracotta Bricks
	WHITE_TERRACOTTA_BRICKS = ITEMS.register("white_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_BRICKS.get(), dyeables())),
	WHITE_TERRACOTTA_BRICK_SLAB = ITEMS.register("white_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_BRICK_SLAB.get(), dyeables())),
	WHITE_TERRACOTTA_BRICK_STAIRS = ITEMS.register("white_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_BRICK_STAIRS.get(), dyeables())),
	WHITE_TERRACOTTA_BRICK_WALL = ITEMS.register("white_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_BRICK_WALL.get(), dyeables())),
	WHITE_TERRACOTTA_BRICK_GATE = ITEMS.register("white_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_BRICK_GATE.get(), dyeables())),

	// Cut White Terracotta
	CUT_WHITE_TERRACOTTA = ITEMS.register("cut_white_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_TERRACOTTA.get(), dyeables())),
	CUT_WHITE_TERRACOTTA_SLAB = ITEMS.register("cut_white_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_TERRACOTTA_SLAB.get(), dyeables())),
	CUT_WHITE_TERRACOTTA_STAIRS = ITEMS.register("cut_white_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_TERRACOTTA_STAIRS.get(), dyeables())),
	CUT_WHITE_TERRACOTTA_WALL = ITEMS.register("cut_white_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_TERRACOTTA_WALL.get(), dyeables())),
	CUT_WHITE_TERRACOTTA_GATE = ITEMS.register("cut_white_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_TERRACOTTA_GATE.get(), dyeables())),

	// White Terracotta Tiles
	WHITE_TERRACOTTA_TILES = ITEMS.register("white_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_TILES.get(), dyeables())),
	WHITE_TERRACOTTA_TILE_SLAB = ITEMS.register("white_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_TILE_SLAB.get(), dyeables())),
	WHITE_TERRACOTTA_TILE_STAIRS = ITEMS.register("white_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_TILE_STAIRS.get(), dyeables())),
	WHITE_TERRACOTTA_TILE_WALL = ITEMS.register("white_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_TILE_WALL.get(), dyeables())),
	WHITE_TERRACOTTA_TILE_GATE = ITEMS.register("white_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_TILE_GATE.get(), dyeables())),

	// White Terracotta Pillar
	WHITE_TERRACOTTA_PILLAR = ITEMS.register("white_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_PILLAR.get(), dyeables())),
	WHITE_TERRACOTTA_CORNER_PILLAR = ITEMS.register("white_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_CORNER_PILLAR.get(), dyeables())),

	// Chiseled White Terracotta
	CHISELED_WHITE_TERRACOTTA = ITEMS.register("chiseled_white_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_WHITE_TERRACOTTA.get(), dyeables())),

	// Carved White Terracotta
	CARVED_WHITE_TERRACOTTA = ITEMS.register("carved_white_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_WHITE_TERRACOTTA.get(), dyeables())),


// LIGHT GRAY TERRACOTTA

	// Base
	LIGHT_GRAY_TERRACOTTA_SLAB = ITEMS.register("light_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), dyeables())),
	LIGHT_GRAY_TERRACOTTA_STAIRS = ITEMS.register("light_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), dyeables())),
	LIGHT_GRAY_TERRACOTTA_WALL = ITEMS.register("light_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(), dyeables())),
	LIGHT_GRAY_TERRACOTTA_GATE = ITEMS.register("light_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_GATE.get(), dyeables())),

	// Cobbled Light Gray Terracotta
	COBBLED_LIGHT_GRAY_TERRACOTTA = ITEMS.register("cobbled_light_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_GRAY_TERRACOTTA.get(), dyeables())),
	COBBLED_LIGHT_GRAY_TERRACOTTA_SLAB = ITEMS.register("cobbled_light_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_GRAY_TERRACOTTA_SLAB.get(), dyeables())),
	COBBLED_LIGHT_GRAY_TERRACOTTA_STAIRS = ITEMS.register("cobbled_light_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_GRAY_TERRACOTTA_STAIRS.get(), dyeables())),
	COBBLED_LIGHT_GRAY_TERRACOTTA_WALL = ITEMS.register("cobbled_light_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_GRAY_TERRACOTTA_WALL.get(), dyeables())),
	COBBLED_LIGHT_GRAY_TERRACOTTA_GATE = ITEMS.register("cobbled_light_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_GRAY_TERRACOTTA_GATE.get(), dyeables())),

	// Polished Light Gray Terracotta
	POLISHED_LIGHT_GRAY_TERRACOTTA = ITEMS.register("polished_light_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA.get(), dyeables())),
	POLISHED_LIGHT_GRAY_TERRACOTTA_SLAB = ITEMS.register("polished_light_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_LIGHT_GRAY_TERRACOTTA_STAIRS = ITEMS.register("polished_light_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_LIGHT_GRAY_TERRACOTTA_WALL = ITEMS.register("polished_light_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_LIGHT_GRAY_TERRACOTTA_GATE = ITEMS.register("polished_light_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth Light Gray Terracotta
	SMOOTH_LIGHT_GRAY_TERRACOTTA = ITEMS.register("smooth_light_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA.get(), dyeables())),
	SMOOTH_LIGHT_GRAY_TERRACOTTA_SLAB = ITEMS.register("smooth_light_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_SLAB.get(), dyeables())),
	SMOOTH_LIGHT_GRAY_TERRACOTTA_STAIRS = ITEMS.register("smooth_light_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_STAIRS.get(), dyeables())),
	SMOOTH_LIGHT_GRAY_TERRACOTTA_WALL = ITEMS.register("smooth_light_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_WALL.get(), dyeables())),
	SMOOTH_LIGHT_GRAY_TERRACOTTA_GATE = ITEMS.register("smooth_light_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_GATE.get(), dyeables())),

	// Light Gray Terracotta Bricks
	LIGHT_GRAY_TERRACOTTA_BRICKS = ITEMS.register("light_gray_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get(), dyeables())),
	LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = ITEMS.register("light_gray_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB.get(), dyeables())),
	LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = ITEMS.register("light_gray_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS.get(), dyeables())),
	LIGHT_GRAY_TERRACOTTA_BRICK_WALL = ITEMS.register("light_gray_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL.get(), dyeables())),
	LIGHT_GRAY_TERRACOTTA_BRICK_GATE = ITEMS.register("light_gray_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_GATE.get(), dyeables())),

	// Cut Light Gray Terracotta
	CUT_LIGHT_GRAY_TERRACOTTA = ITEMS.register("cut_light_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_TERRACOTTA.get(), dyeables())),
	CUT_LIGHT_GRAY_TERRACOTTA_SLAB = ITEMS.register("cut_light_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_TERRACOTTA_SLAB.get(), dyeables())),
	CUT_LIGHT_GRAY_TERRACOTTA_STAIRS = ITEMS.register("cut_light_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_TERRACOTTA_STAIRS.get(), dyeables())),
	CUT_LIGHT_GRAY_TERRACOTTA_WALL = ITEMS.register("cut_light_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_TERRACOTTA_WALL.get(), dyeables())),
	CUT_LIGHT_GRAY_TERRACOTTA_GATE = ITEMS.register("cut_light_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_TERRACOTTA_GATE.get(), dyeables())),

	// Light Gray Terracotta Tiles
	LIGHT_GRAY_TERRACOTTA_TILES = ITEMS.register("light_gray_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_TILES.get(), dyeables())),
	LIGHT_GRAY_TERRACOTTA_TILE_SLAB = ITEMS.register("light_gray_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_TILE_SLAB.get(), dyeables())),
	LIGHT_GRAY_TERRACOTTA_TILE_STAIRS = ITEMS.register("light_gray_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_TILE_STAIRS.get(), dyeables())),
	LIGHT_GRAY_TERRACOTTA_TILE_WALL = ITEMS.register("light_gray_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_TILE_WALL.get(), dyeables())),
	LIGHT_GRAY_TERRACOTTA_TILE_GATE = ITEMS.register("light_gray_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_TILE_GATE.get(), dyeables())),

	// Light Gray Terracotta Pillar
	LIGHT_GRAY_TERRACOTTA_PILLAR = ITEMS.register("light_gray_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_PILLAR.get(), dyeables())),
	LIGHT_GRAY_TERRACOTTA_CORNER_PILLAR = ITEMS.register("light_gray_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Light Gray Terracotta
	CHISELED_LIGHT_GRAY_TERRACOTTA = ITEMS.register("chiseled_light_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_LIGHT_GRAY_TERRACOTTA.get(), dyeables())),

	// Carved Light Gray Terracotta
	CARVED_LIGHT_GRAY_TERRACOTTA = ITEMS.register("carved_light_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_LIGHT_GRAY_TERRACOTTA.get(), dyeables())),


// GRAY TERRACOTTA

	// Base
	GRAY_TERRACOTTA_SLAB = ITEMS.register("gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_SLAB.get(), dyeables())),
	GRAY_TERRACOTTA_STAIRS = ITEMS.register("gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_STAIRS.get(), dyeables())),
	GRAY_TERRACOTTA_WALL = ITEMS.register("gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_WALL.get(), dyeables())),
	GRAY_TERRACOTTA_GATE = ITEMS.register("gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_GATE.get(), dyeables())),

	// Cobbled Gray Terracotta
	COBBLED_GRAY_TERRACOTTA = ITEMS.register("cobbled_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRAY_TERRACOTTA.get(), dyeables())),
	COBBLED_GRAY_TERRACOTTA_SLAB = ITEMS.register("cobbled_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRAY_TERRACOTTA_SLAB.get(), dyeables())),
	COBBLED_GRAY_TERRACOTTA_STAIRS = ITEMS.register("cobbled_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRAY_TERRACOTTA_STAIRS.get(), dyeables())),
	COBBLED_GRAY_TERRACOTTA_WALL = ITEMS.register("cobbled_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRAY_TERRACOTTA_WALL.get(), dyeables())),
	COBBLED_GRAY_TERRACOTTA_GATE = ITEMS.register("cobbled_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRAY_TERRACOTTA_GATE.get(), dyeables())),

	// Polished Gray Terracotta
	POLISHED_GRAY_TERRACOTTA = ITEMS.register("polished_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_TERRACOTTA.get(), dyeables())),
	POLISHED_GRAY_TERRACOTTA_SLAB = ITEMS.register("polished_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_GRAY_TERRACOTTA_STAIRS = ITEMS.register("polished_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_GRAY_TERRACOTTA_WALL = ITEMS.register("polished_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_GRAY_TERRACOTTA_GATE = ITEMS.register("polished_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth Gray Terracotta
	SMOOTH_GRAY_TERRACOTTA = ITEMS.register("smooth_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_TERRACOTTA.get(), dyeables())),
	SMOOTH_GRAY_TERRACOTTA_SLAB = ITEMS.register("smooth_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_TERRACOTTA_SLAB.get(), dyeables())),
	SMOOTH_GRAY_TERRACOTTA_STAIRS = ITEMS.register("smooth_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_TERRACOTTA_STAIRS.get(), dyeables())),
	SMOOTH_GRAY_TERRACOTTA_WALL = ITEMS.register("smooth_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_TERRACOTTA_WALL.get(), dyeables())),
	SMOOTH_GRAY_TERRACOTTA_GATE = ITEMS.register("smooth_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_TERRACOTTA_GATE.get(), dyeables())),

	// Gray Terracotta Bricks
	GRAY_TERRACOTTA_BRICKS = ITEMS.register("gray_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_BRICKS.get(), dyeables())),
	GRAY_TERRACOTTA_BRICK_SLAB = ITEMS.register("gray_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_BRICK_SLAB.get(), dyeables())),
	GRAY_TERRACOTTA_BRICK_STAIRS = ITEMS.register("gray_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_BRICK_STAIRS.get(), dyeables())),
	GRAY_TERRACOTTA_BRICK_WALL = ITEMS.register("gray_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_BRICK_WALL.get(), dyeables())),
	GRAY_TERRACOTTA_BRICK_GATE = ITEMS.register("gray_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_BRICK_GATE.get(), dyeables())),

	// Cut Gray Terracotta
	CUT_GRAY_TERRACOTTA = ITEMS.register("cut_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_TERRACOTTA.get(), dyeables())),
	CUT_GRAY_TERRACOTTA_SLAB = ITEMS.register("cut_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_TERRACOTTA_SLAB.get(), dyeables())),
	CUT_GRAY_TERRACOTTA_STAIRS = ITEMS.register("cut_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_TERRACOTTA_STAIRS.get(), dyeables())),
	CUT_GRAY_TERRACOTTA_WALL = ITEMS.register("cut_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_TERRACOTTA_WALL.get(), dyeables())),
	CUT_GRAY_TERRACOTTA_GATE = ITEMS.register("cut_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_TERRACOTTA_GATE.get(), dyeables())),

	// Gray Terracotta Tiles
	GRAY_TERRACOTTA_TILES = ITEMS.register("gray_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_TILES.get(), dyeables())),
	GRAY_TERRACOTTA_TILE_SLAB = ITEMS.register("gray_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_TILE_SLAB.get(), dyeables())),
	GRAY_TERRACOTTA_TILE_STAIRS = ITEMS.register("gray_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_TILE_STAIRS.get(), dyeables())),
	GRAY_TERRACOTTA_TILE_WALL = ITEMS.register("gray_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_TILE_WALL.get(), dyeables())),
	GRAY_TERRACOTTA_TILE_GATE = ITEMS.register("gray_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_TILE_GATE.get(), dyeables())),

	// Gray Terracotta Pillar
	GRAY_TERRACOTTA_PILLAR = ITEMS.register("gray_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_PILLAR.get(), dyeables())),
	GRAY_TERRACOTTA_CORNER_PILLAR = ITEMS.register("gray_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Gray Terracotta
	CHISELED_GRAY_TERRACOTTA = ITEMS.register("chiseled_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_GRAY_TERRACOTTA.get(), dyeables())),

	// Carved  Gray Terracotta
	CARVED_GRAY_TERRACOTTA = ITEMS.register("carved_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_GRAY_TERRACOTTA.get(), dyeables())),


// BLACK TERRACOTTA

	// Base
	BLACK_TERRACOTTA_SLAB = ITEMS.register("black_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_SLAB.get(), dyeables())),
	BLACK_TERRACOTTA_STAIRS = ITEMS.register("black_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_STAIRS.get(), dyeables())),
	BLACK_TERRACOTTA_WALL = ITEMS.register("black_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_WALL.get(), dyeables())),
	BLACK_TERRACOTTA_GATE = ITEMS.register("black_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_GATE.get(), dyeables())),

	// Cobbled Black Terracotta
	COBBLED_BLACK_TERRACOTTA = ITEMS.register("cobbled_black_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACK_TERRACOTTA.get(), dyeables())),
	COBBLED_BLACK_TERRACOTTA_SLAB = ITEMS.register("cobbled_black_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACK_TERRACOTTA_SLAB.get(), dyeables())),
	COBBLED_BLACK_TERRACOTTA_STAIRS = ITEMS.register("cobbled_black_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACK_TERRACOTTA_STAIRS.get(), dyeables())),
	COBBLED_BLACK_TERRACOTTA_WALL = ITEMS.register("cobbled_black_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACK_TERRACOTTA_WALL.get(), dyeables())),
	COBBLED_BLACK_TERRACOTTA_GATE = ITEMS.register("cobbled_black_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACK_TERRACOTTA_GATE.get(), dyeables())),

	// Polished Black Terracotta
	POLISHED_BLACK_TERRACOTTA = ITEMS.register("polished_black_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_TERRACOTTA.get(), dyeables())),
	POLISHED_BLACK_TERRACOTTA_SLAB = ITEMS.register("polished_black_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_BLACK_TERRACOTTA_STAIRS = ITEMS.register("polished_black_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_BLACK_TERRACOTTA_WALL = ITEMS.register("polished_black_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_BLACK_TERRACOTTA_GATE = ITEMS.register("polished_black_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth Black Terracotta
	SMOOTH_BLACK_TERRACOTTA = ITEMS.register("smooth_black_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_TERRACOTTA.get(), dyeables())),
	SMOOTH_BLACK_TERRACOTTA_SLAB = ITEMS.register("smooth_black_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_TERRACOTTA_SLAB.get(), dyeables())),
	SMOOTH_BLACK_TERRACOTTA_STAIRS = ITEMS.register("smooth_black_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_TERRACOTTA_STAIRS.get(), dyeables())),
	SMOOTH_BLACK_TERRACOTTA_WALL = ITEMS.register("smooth_black_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_TERRACOTTA_WALL.get(), dyeables())),
	SMOOTH_BLACK_TERRACOTTA_GATE = ITEMS.register("smooth_black_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_TERRACOTTA_GATE.get(), dyeables())),

	// Black Terracotta Bricks
	BLACK_TERRACOTTA_BRICKS = ITEMS.register("black_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_BRICKS.get(), dyeables())),
	BLACK_TERRACOTTA_BRICK_SLAB = ITEMS.register("black_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_BRICK_SLAB.get(), dyeables())),
	BLACK_TERRACOTTA_BRICK_STAIRS = ITEMS.register("black_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_BRICK_STAIRS.get(), dyeables())),
	BLACK_TERRACOTTA_BRICK_WALL = ITEMS.register("black_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_BRICK_WALL.get(), dyeables())),
	BLACK_TERRACOTTA_BRICK_GATE = ITEMS.register("black_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_BRICK_GATE.get(), dyeables())),

	// Cut Black Terracotta
	CUT_BLACK_TERRACOTTA = ITEMS.register("cut_black_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_TERRACOTTA.get(), dyeables())),
	CUT_BLACK_TERRACOTTA_SLAB = ITEMS.register("cut_black_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_TERRACOTTA_SLAB.get(), dyeables())),
	CUT_BLACK_TERRACOTTA_STAIRS = ITEMS.register("cut_black_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_TERRACOTTA_STAIRS.get(), dyeables())),
	CUT_BLACK_TERRACOTTA_WALL = ITEMS.register("cut_black_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_TERRACOTTA_WALL.get(), dyeables())),
	CUT_BLACK_TERRACOTTA_GATE = ITEMS.register("cut_black_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_TERRACOTTA_GATE.get(), dyeables())),

	// Black Terracotta Tiles
	BLACK_TERRACOTTA_TILES = ITEMS.register("black_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_TILES.get(), dyeables())),
	BLACK_TERRACOTTA_TILE_SLAB = ITEMS.register("black_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_TILE_SLAB.get(), dyeables())),
	BLACK_TERRACOTTA_TILE_STAIRS = ITEMS.register("black_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_TILE_STAIRS.get(), dyeables())),
	BLACK_TERRACOTTA_TILE_WALL = ITEMS.register("black_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_TILE_WALL.get(), dyeables())),
	BLACK_TERRACOTTA_TILE_GATE = ITEMS.register("black_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_TILE_GATE.get(), dyeables())),

	// Black Terracotta Pillar
	BLACK_TERRACOTTA_PILLAR = ITEMS.register("black_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_PILLAR.get(), dyeables())),
	BLACK_TERRACOTTA_CORNER_PILLAR = ITEMS.register("black_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Black Terracotta
	CHISELED_BLACK_TERRACOTTA = ITEMS.register("chiseled_black_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_BLACK_TERRACOTTA.get(), dyeables())),

	// Carved Black Terracotta
	CARVED_BLACK_TERRACOTTA = ITEMS.register("carved_black_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_BLACK_TERRACOTTA.get(), dyeables())),

// BROWN TERRACOTTA

	// Base
	BROWN_TERRACOTTA_SLAB = ITEMS.register("brown_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_SLAB.get(), dyeables())),
	BROWN_TERRACOTTA_STAIRS = ITEMS.register("brown_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_STAIRS.get(), dyeables())),
	BROWN_TERRACOTTA_WALL = ITEMS.register("brown_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_WALL.get(), dyeables())),
	BROWN_TERRACOTTA_GATE = ITEMS.register("brown_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_GATE.get(), dyeables())),

	// Cobbled Brown Terracotta
	COBBLED_BROWN_TERRACOTTA = ITEMS.register("cobbled_brown_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_BROWN_TERRACOTTA.get(), dyeables())),
	COBBLED_BROWN_TERRACOTTA_SLAB = ITEMS.register("cobbled_brown_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_BROWN_TERRACOTTA_SLAB.get(), dyeables())),
	COBBLED_BROWN_TERRACOTTA_STAIRS = ITEMS.register("cobbled_brown_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_BROWN_TERRACOTTA_STAIRS.get(), dyeables())),
	COBBLED_BROWN_TERRACOTTA_WALL = ITEMS.register("cobbled_brown_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_BROWN_TERRACOTTA_WALL.get(), dyeables())),
	COBBLED_BROWN_TERRACOTTA_GATE = ITEMS.register("cobbled_brown_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_BROWN_TERRACOTTA_GATE.get(), dyeables())),

	// Polished Brown Terracotta
	POLISHED_BROWN_TERRACOTTA = ITEMS.register("polished_brown_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_TERRACOTTA.get(), dyeables())),
	POLISHED_BROWN_TERRACOTTA_SLAB = ITEMS.register("polished_brown_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_BROWN_TERRACOTTA_STAIRS = ITEMS.register("polished_brown_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_BROWN_TERRACOTTA_WALL = ITEMS.register("polished_brown_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_BROWN_TERRACOTTA_GATE = ITEMS.register("polished_brown_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth Brown Terracotta
	SMOOTH_BROWN_TERRACOTTA = ITEMS.register("smooth_brown_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_TERRACOTTA.get(), dyeables())),
	SMOOTH_BROWN_TERRACOTTA_SLAB = ITEMS.register("smooth_brown_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_TERRACOTTA_SLAB.get(), dyeables())),
	SMOOTH_BROWN_TERRACOTTA_STAIRS = ITEMS.register("smooth_brown_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_TERRACOTTA_STAIRS.get(), dyeables())),
	SMOOTH_BROWN_TERRACOTTA_WALL = ITEMS.register("smooth_brown_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_TERRACOTTA_WALL.get(), dyeables())),
	SMOOTH_BROWN_TERRACOTTA_GATE = ITEMS.register("smooth_brown_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_TERRACOTTA_GATE.get(), dyeables())),

	// Brown Terracotta Bricks
	BROWN_TERRACOTTA_BRICKS = ITEMS.register("brown_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_BRICKS.get(), dyeables())),
	BROWN_TERRACOTTA_BRICK_SLAB = ITEMS.register("brown_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_BRICK_SLAB.get(), dyeables())),
	BROWN_TERRACOTTA_BRICK_STAIRS = ITEMS.register("brown_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_BRICK_STAIRS.get(), dyeables())),
	BROWN_TERRACOTTA_BRICK_WALL = ITEMS.register("brown_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_BRICK_WALL.get(), dyeables())),
	BROWN_TERRACOTTA_BRICK_GATE = ITEMS.register("brown_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_BRICK_GATE.get(), dyeables())),

	// Cut Brown Terracotta
	CUT_BROWN_TERRACOTTA = ITEMS.register("cut_brown_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_TERRACOTTA.get(), dyeables())),
	CUT_BROWN_TERRACOTTA_SLAB = ITEMS.register("cut_brown_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_TERRACOTTA_SLAB.get(), dyeables())),
	CUT_BROWN_TERRACOTTA_STAIRS = ITEMS.register("cut_brown_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_TERRACOTTA_STAIRS.get(), dyeables())),
	CUT_BROWN_TERRACOTTA_WALL = ITEMS.register("cut_brown_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_TERRACOTTA_WALL.get(), dyeables())),
	CUT_BROWN_TERRACOTTA_GATE = ITEMS.register("cut_brown_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_TERRACOTTA_GATE.get(), dyeables())),

	// Brown Terracotta Tiles
	BROWN_TERRACOTTA_TILES = ITEMS.register("brown_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_TILES.get(), dyeables())),
	BROWN_TERRACOTTA_TILE_SLAB = ITEMS.register("brown_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_TILE_SLAB.get(), dyeables())),
	BROWN_TERRACOTTA_TILE_STAIRS = ITEMS.register("brown_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_TILE_STAIRS.get(), dyeables())),
	BROWN_TERRACOTTA_TILE_WALL = ITEMS.register("brown_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_TILE_WALL.get(), dyeables())),
	BROWN_TERRACOTTA_TILE_GATE = ITEMS.register("brown_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_TILE_GATE.get(), dyeables())),

	// Brown Terracotta Pillar
	BROWN_TERRACOTTA_PILLAR = ITEMS.register("brown_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_PILLAR.get(), dyeables())),
	BROWN_TERRACOTTA_CORNER_PILLAR = ITEMS.register("brown_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Brown Terracotta
	CHISELED_BROWN_TERRACOTTA = ITEMS.register("chiseled_brown_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_BROWN_TERRACOTTA.get(), dyeables())),

	// Carved Brown Terracotta
	CARVED_BROWN_TERRACOTTA = ITEMS.register("carved_brown_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_BROWN_TERRACOTTA.get(), dyeables())),


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
	POLISHED_RED_GLAZED_TERRACOTTA = ITEMS.register("polished_red_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA.get(), dyeables())),
	POLISHED_RED_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_red_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_RED_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_red_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_RED_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_red_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_RED_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_red_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA_GATE.get(), dyeables())),

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
	POLISHED_ORANGE_GLAZED_TERRACOTTA = ITEMS.register("polished_orange_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA.get(), dyeables())),
	POLISHED_ORANGE_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_orange_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_ORANGE_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_orange_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_ORANGE_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_orange_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_ORANGE_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_orange_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA_GATE.get(), dyeables())),

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
	POLISHED_YELLOW_GLAZED_TERRACOTTA = ITEMS.register("polished_yellow_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA.get(), dyeables())),
	POLISHED_YELLOW_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_yellow_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_YELLOW_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_yellow_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_YELLOW_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_yellow_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_YELLOW_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_yellow_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA_GATE.get(), dyeables())),

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
	POLISHED_LIME_GLAZED_TERRACOTTA = ITEMS.register("polished_lime_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA.get(), dyeables())),
	POLISHED_LIME_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_lime_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_LIME_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_lime_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_LIME_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_lime_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_LIME_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_lime_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA_GATE.get(), dyeables())),

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
	POLISHED_GREEN_GLAZED_TERRACOTTA = ITEMS.register("polished_green_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA.get(), dyeables())),
	POLISHED_GREEN_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_green_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_GREEN_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_green_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_GREEN_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_green_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_GREEN_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_green_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA_GATE.get(), dyeables())),

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
	POLISHED_BLUE_GLAZED_TERRACOTTA = ITEMS.register("polished_blue_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA.get(), dyeables())),
	POLISHED_BLUE_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_blue_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_BLUE_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_blue_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_BLUE_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_blue_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_BLUE_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_blue_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA_GATE.get(), dyeables())),

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
	POLISHED_CYAN_GLAZED_TERRACOTTA = ITEMS.register("polished_cyan_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA.get(), dyeables())),
	POLISHED_CYAN_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_cyan_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_CYAN_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_cyan_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_CYAN_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_cyan_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_CYAN_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_cyan_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA_GATE.get(), dyeables())),

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
	POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA = ITEMS.register("polished_light_blue_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA.get(), dyeables())),
	POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_light_blue_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_light_blue_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_light_blue_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_light_blue_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_GATE.get(), dyeables())),

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
	POLISHED_PURPLE_GLAZED_TERRACOTTA = ITEMS.register("polished_purple_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA.get(), dyeables())),
	POLISHED_PURPLE_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_purple_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_PURPLE_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_purple_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_PURPLE_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_purple_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_PURPLE_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_purple_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA_GATE.get(), dyeables())),

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
	POLISHED_MAGENTA_GLAZED_TERRACOTTA = ITEMS.register("polished_magenta_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA.get(), dyeables())),
	POLISHED_MAGENTA_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_magenta_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_MAGENTA_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_magenta_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_MAGENTA_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_magenta_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_MAGENTA_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_magenta_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA_GATE.get(), dyeables())),

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
	POLISHED_PINK_GLAZED_TERRACOTTA = ITEMS.register("polished_pink_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA.get(), dyeables())),
	POLISHED_PINK_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_pink_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_PINK_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_pink_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_PINK_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_pink_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_PINK_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_pink_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA_GATE.get(), dyeables())),

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
	POLISHED_WHITE_GLAZED_TERRACOTTA = ITEMS.register("polished_white_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA.get(), dyeables())),
	POLISHED_WHITE_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_white_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_WHITE_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_white_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_WHITE_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_white_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_WHITE_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_white_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA_GATE.get(), dyeables())),

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
	POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA = ITEMS.register("polished_light_gray_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA.get(), dyeables())),
	POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_light_gray_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_light_gray_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_light_gray_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_light_gray_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_GATE.get(), dyeables())),

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
	POLISHED_GRAY_GLAZED_TERRACOTTA = ITEMS.register("polished_gray_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA.get(), dyeables())),
	POLISHED_GRAY_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_gray_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_GRAY_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_gray_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_GRAY_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_gray_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_GRAY_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_gray_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA_GATE.get(), dyeables())),

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
	POLISHED_BLACK_GLAZED_TERRACOTTA = ITEMS.register("polished_black_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA.get(), dyeables())),
	POLISHED_BLACK_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_black_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_BLACK_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_black_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_BLACK_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_black_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_BLACK_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_black_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA_GATE.get(), dyeables())),

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
	POLISHED_BROWN_GLAZED_TERRACOTTA = ITEMS.register("polished_brown_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA.get(), dyeables())),
	POLISHED_BROWN_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_brown_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA_SLAB.get(), dyeables())),
	POLISHED_BROWN_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_brown_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA_STAIRS.get(), dyeables())),
	POLISHED_BROWN_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_brown_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA_WALL.get(), dyeables())),
	POLISHED_BROWN_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_brown_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA_GATE.get(), dyeables())),

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// RED CONCRETE

	// Base
	RED_CONCRETE_SLAB = ITEMS.register("red_concrete_slab", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_SLAB.get(), dyeables())),
	RED_CONCRETE_STAIRS = ITEMS.register("red_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_STAIRS.get(), dyeables())),
	RED_CONCRETE_WALL = ITEMS.register("red_concrete_wall", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_WALL.get(), dyeables())),
	RED_CONCRETE_GATE = ITEMS.register("red_concrete_gate", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_GATE.get(), dyeables())),

	// Polished Concrete
	POLISHED_RED_CONCRETE = ITEMS.register("polished_red_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_CONCRETE.get(), dyeables())),
	POLISHED_RED_CONCRETE_SLAB = ITEMS.register("polished_red_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_CONCRETE_SLAB.get(), dyeables())),
	POLISHED_RED_CONCRETE_STAIRS = ITEMS.register("polished_red_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_CONCRETE_STAIRS.get(), dyeables())),
	POLISHED_RED_CONCRETE_WALL = ITEMS.register("polished_red_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_CONCRETE_WALL.get(), dyeables())),
	POLISHED_RED_CONCRETE_GATE = ITEMS.register("polished_red_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_CONCRETE_GATE.get(), dyeables())),

	// Smooth Concrete
	SMOOTH_RED_CONCRETE = ITEMS.register("smooth_red_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_CONCRETE.get(), dyeables())),
	SMOOTH_RED_CONCRETE_SLAB = ITEMS.register("smooth_red_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_CONCRETE_SLAB.get(), dyeables())),
	SMOOTH_RED_CONCRETE_STAIRS = ITEMS.register("smooth_red_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_CONCRETE_STAIRS.get(), dyeables())),
	SMOOTH_RED_CONCRETE_WALL = ITEMS.register("smooth_red_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_CONCRETE_WALL.get(), dyeables())),
	SMOOTH_RED_CONCRETE_GATE = ITEMS.register("smooth_red_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_CONCRETE_GATE.get(), dyeables())),

	// Concrete Bricks
	RED_CONCRETE_BRICKS = ITEMS.register("red_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_BRICKS.get(), dyeables())),
	RED_CONCRETE_BRICK_SLAB = ITEMS.register("red_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_BRICK_SLAB.get(), dyeables())),
	RED_CONCRETE_BRICK_STAIRS = ITEMS.register("red_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_BRICK_STAIRS.get(), dyeables())),
	RED_CONCRETE_BRICK_WALL = ITEMS.register("red_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_BRICK_WALL.get(), dyeables())),
	RED_CONCRETE_BRICK_GATE = ITEMS.register("red_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_BRICK_GATE.get(), dyeables())),

	// Cut Concrete
	CUT_RED_CONCRETE = ITEMS.register("cut_red_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_RED_CONCRETE.get(), dyeables())),
	CUT_RED_CONCRETE_SLAB = ITEMS.register("cut_red_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_RED_CONCRETE_SLAB.get(), dyeables())),
	CUT_RED_CONCRETE_STAIRS = ITEMS.register("cut_red_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_RED_CONCRETE_STAIRS.get(), dyeables())),
	CUT_RED_CONCRETE_WALL = ITEMS.register("cut_red_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_RED_CONCRETE_WALL.get(), dyeables())),
	CUT_RED_CONCRETE_GATE = ITEMS.register("cut_red_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_RED_CONCRETE_GATE.get(), dyeables())),

	// Concrete Tiles
	RED_CONCRETE_TILES = ITEMS.register("red_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_TILES.get(), dyeables())),
	RED_CONCRETE_TILE_SLAB = ITEMS.register("red_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_TILE_SLAB.get(), dyeables())),
	RED_CONCRETE_TILE_STAIRS = ITEMS.register("red_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_TILE_STAIRS.get(), dyeables())),
	RED_CONCRETE_TILE_WALL = ITEMS.register("red_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_TILE_WALL.get(), dyeables())),
	RED_CONCRETE_TILE_GATE = ITEMS.register("red_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_TILE_GATE.get(), dyeables())),

	// Concrete Pillar
	RED_CONCRETE_PILLAR = ITEMS.register("red_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_PILLAR.get(), dyeables())),
	RED_CONCRETE_CORNER_PILLAR = ITEMS.register("red_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Concrete
	CHISELED_RED_CONCRETE = ITEMS.register("chiseled_red_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_RED_CONCRETE.get(), dyeables())),

	// Carved Concrete
	CARVED_RED_CONCRETE = ITEMS.register("carved_red_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_RED_CONCRETE.get(), dyeables())),


// ORANGE CONCRETE

	// Base
	ORANGE_CONCRETE_SLAB = ITEMS.register("orange_concrete_slab", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_SLAB.get(), dyeables())),
	ORANGE_CONCRETE_STAIRS = ITEMS.register("orange_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_STAIRS.get(), dyeables())),
	ORANGE_CONCRETE_WALL = ITEMS.register("orange_concrete_wall", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_WALL.get(), dyeables())),
	ORANGE_CONCRETE_GATE = ITEMS.register("orange_concrete_gate", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_GATE.get(), dyeables())),

	// Polished Concrete
	POLISHED_ORANGE_CONCRETE = ITEMS.register("polished_orange_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_CONCRETE.get(), dyeables())),
	POLISHED_ORANGE_CONCRETE_SLAB = ITEMS.register("polished_orange_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_CONCRETE_SLAB.get(), dyeables())),
	POLISHED_ORANGE_CONCRETE_STAIRS = ITEMS.register("polished_orange_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_CONCRETE_STAIRS.get(), dyeables())),
	POLISHED_ORANGE_CONCRETE_WALL = ITEMS.register("polished_orange_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_CONCRETE_WALL.get(), dyeables())),
	POLISHED_ORANGE_CONCRETE_GATE = ITEMS.register("polished_orange_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_CONCRETE_GATE.get(), dyeables())),

	// Smooth Concrete
	SMOOTH_ORANGE_CONCRETE = ITEMS.register("smooth_orange_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_CONCRETE.get(), dyeables())),
	SMOOTH_ORANGE_CONCRETE_SLAB = ITEMS.register("smooth_orange_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_CONCRETE_SLAB.get(), dyeables())),
	SMOOTH_ORANGE_CONCRETE_STAIRS = ITEMS.register("smooth_orange_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_CONCRETE_STAIRS.get(), dyeables())),
	SMOOTH_ORANGE_CONCRETE_WALL = ITEMS.register("smooth_orange_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_CONCRETE_WALL.get(), dyeables())),
	SMOOTH_ORANGE_CONCRETE_GATE = ITEMS.register("smooth_orange_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_CONCRETE_GATE.get(), dyeables())),

	// Concrete Bricks
	ORANGE_CONCRETE_BRICKS = ITEMS.register("orange_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_BRICKS.get(), dyeables())),
	ORANGE_CONCRETE_BRICK_SLAB = ITEMS.register("orange_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_BRICK_SLAB.get(), dyeables())),
	ORANGE_CONCRETE_BRICK_STAIRS = ITEMS.register("orange_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_BRICK_STAIRS.get(), dyeables())),
	ORANGE_CONCRETE_BRICK_WALL = ITEMS.register("orange_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_BRICK_WALL.get(), dyeables())),
	ORANGE_CONCRETE_BRICK_GATE = ITEMS.register("orange_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_BRICK_GATE.get(), dyeables())),

	// Cut Concrete
	CUT_ORANGE_CONCRETE = ITEMS.register("cut_orange_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_CONCRETE.get(), dyeables())),
	CUT_ORANGE_CONCRETE_SLAB = ITEMS.register("cut_orange_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_CONCRETE_SLAB.get(), dyeables())),
	CUT_ORANGE_CONCRETE_STAIRS = ITEMS.register("cut_orange_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_CONCRETE_STAIRS.get(), dyeables())),
	CUT_ORANGE_CONCRETE_WALL = ITEMS.register("cut_orange_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_CONCRETE_WALL.get(), dyeables())),
	CUT_ORANGE_CONCRETE_GATE = ITEMS.register("cut_orange_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_CONCRETE_GATE.get(), dyeables())),

	// Concrete Tiles
	ORANGE_CONCRETE_TILES = ITEMS.register("orange_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_TILES.get(), dyeables())),
	ORANGE_CONCRETE_TILE_SLAB = ITEMS.register("orange_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_TILE_SLAB.get(), dyeables())),
	ORANGE_CONCRETE_TILE_STAIRS = ITEMS.register("orange_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_TILE_STAIRS.get(), dyeables())),
	ORANGE_CONCRETE_TILE_WALL = ITEMS.register("orange_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_TILE_WALL.get(), dyeables())),
	ORANGE_CONCRETE_TILE_GATE = ITEMS.register("orange_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_TILE_GATE.get(), dyeables())),

	// Concrete Pillar
	ORANGE_CONCRETE_PILLAR = ITEMS.register("orange_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_PILLAR.get(), dyeables())),
	ORANGE_CONCRETE_CORNER_PILLAR = ITEMS.register("orange_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Concrete
	CHISELED_ORANGE_CONCRETE = ITEMS.register("chiseled_orange_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_ORANGE_CONCRETE.get(), dyeables())),

	// Carved Concrete
	CARVED_ORANGE_CONCRETE = ITEMS.register("carved_orange_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_ORANGE_CONCRETE.get(), dyeables())),


// YELLOW CONCRETE

	// Base
	YELLOW_CONCRETE_SLAB = ITEMS.register("yellow_concrete_slab", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_SLAB.get(), dyeables())),
	YELLOW_CONCRETE_STAIRS = ITEMS.register("yellow_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_STAIRS.get(), dyeables())),
	YELLOW_CONCRETE_WALL = ITEMS.register("yellow_concrete_wall", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_WALL.get(), dyeables())),
	YELLOW_CONCRETE_GATE = ITEMS.register("yellow_concrete_gate", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_GATE.get(), dyeables())),

	// Polished Concrete
	POLISHED_YELLOW_CONCRETE = ITEMS.register("polished_yellow_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_CONCRETE.get(), dyeables())),
	POLISHED_YELLOW_CONCRETE_SLAB = ITEMS.register("polished_yellow_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_CONCRETE_SLAB.get(), dyeables())),
	POLISHED_YELLOW_CONCRETE_STAIRS = ITEMS.register("polished_yellow_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_CONCRETE_STAIRS.get(), dyeables())),
	POLISHED_YELLOW_CONCRETE_WALL = ITEMS.register("polished_yellow_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_CONCRETE_WALL.get(), dyeables())),
	POLISHED_YELLOW_CONCRETE_GATE = ITEMS.register("polished_yellow_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_CONCRETE_GATE.get(), dyeables())),

	// Smooth Concrete
	SMOOTH_YELLOW_CONCRETE = ITEMS.register("smooth_yellow_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_CONCRETE.get(), dyeables())),
	SMOOTH_YELLOW_CONCRETE_SLAB = ITEMS.register("smooth_yellow_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_CONCRETE_SLAB.get(), dyeables())),
	SMOOTH_YELLOW_CONCRETE_STAIRS = ITEMS.register("smooth_yellow_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_CONCRETE_STAIRS.get(), dyeables())),
	SMOOTH_YELLOW_CONCRETE_WALL = ITEMS.register("smooth_yellow_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_CONCRETE_WALL.get(), dyeables())),
	SMOOTH_YELLOW_CONCRETE_GATE = ITEMS.register("smooth_yellow_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_CONCRETE_GATE.get(), dyeables())),

	// Concrete Bricks
	YELLOW_CONCRETE_BRICKS = ITEMS.register("yellow_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_BRICKS.get(), dyeables())),
	YELLOW_CONCRETE_BRICK_SLAB = ITEMS.register("yellow_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_BRICK_SLAB.get(), dyeables())),
	YELLOW_CONCRETE_BRICK_STAIRS = ITEMS.register("yellow_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_BRICK_STAIRS.get(), dyeables())),
	YELLOW_CONCRETE_BRICK_WALL = ITEMS.register("yellow_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_BRICK_WALL.get(), dyeables())),
	YELLOW_CONCRETE_BRICK_GATE = ITEMS.register("yellow_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_BRICK_GATE.get(), dyeables())),

	// Cut Concrete
	CUT_YELLOW_CONCRETE = ITEMS.register("cut_yellow_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_CONCRETE.get(), dyeables())),
	CUT_YELLOW_CONCRETE_SLAB = ITEMS.register("cut_yellow_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_CONCRETE_SLAB.get(), dyeables())),
	CUT_YELLOW_CONCRETE_STAIRS = ITEMS.register("cut_yellow_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_CONCRETE_STAIRS.get(), dyeables())),
	CUT_YELLOW_CONCRETE_WALL = ITEMS.register("cut_yellow_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_CONCRETE_WALL.get(), dyeables())),
	CUT_YELLOW_CONCRETE_GATE = ITEMS.register("cut_yellow_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_CONCRETE_GATE.get(), dyeables())),

	// Concrete Tiles
	YELLOW_CONCRETE_TILES = ITEMS.register("yellow_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_TILES.get(), dyeables())),
	YELLOW_CONCRETE_TILE_SLAB = ITEMS.register("yellow_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_TILE_SLAB.get(), dyeables())),
	YELLOW_CONCRETE_TILE_STAIRS = ITEMS.register("yellow_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_TILE_STAIRS.get(), dyeables())),
	YELLOW_CONCRETE_TILE_WALL = ITEMS.register("yellow_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_TILE_WALL.get(), dyeables())),
	YELLOW_CONCRETE_TILE_GATE = ITEMS.register("yellow_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_TILE_GATE.get(), dyeables())),

	// Concrete Pillar
	YELLOW_CONCRETE_PILLAR = ITEMS.register("yellow_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_PILLAR.get(), dyeables())),
	YELLOW_CONCRETE_CORNER_PILLAR = ITEMS.register("yellow_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Concrete
	CHISELED_YELLOW_CONCRETE = ITEMS.register("chiseled_yellow_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_YELLOW_CONCRETE.get(), dyeables())),

	// Carved Concrete
	CARVED_YELLOW_CONCRETE = ITEMS.register("carved_yellow_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_YELLOW_CONCRETE.get(), dyeables())),


// LIME CONCRETE

	// Base
	LIME_CONCRETE_SLAB = ITEMS.register("lime_concrete_slab", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_SLAB.get(), dyeables())),
	LIME_CONCRETE_STAIRS = ITEMS.register("lime_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_STAIRS.get(), dyeables())),
	LIME_CONCRETE_WALL = ITEMS.register("lime_concrete_wall", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_WALL.get(), dyeables())),
	LIME_CONCRETE_GATE = ITEMS.register("lime_concrete_gate", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_GATE.get(), dyeables())),

	// Polished Concrete
	POLISHED_LIME_CONCRETE = ITEMS.register("polished_lime_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_CONCRETE.get(), dyeables())),
	POLISHED_LIME_CONCRETE_SLAB = ITEMS.register("polished_lime_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_CONCRETE_SLAB.get(), dyeables())),
	POLISHED_LIME_CONCRETE_STAIRS = ITEMS.register("polished_lime_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_CONCRETE_STAIRS.get(), dyeables())),
	POLISHED_LIME_CONCRETE_WALL = ITEMS.register("polished_lime_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_CONCRETE_WALL.get(), dyeables())),
	POLISHED_LIME_CONCRETE_GATE = ITEMS.register("polished_lime_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_CONCRETE_GATE.get(), dyeables())),

	// Smooth Concrete
	SMOOTH_LIME_CONCRETE = ITEMS.register("smooth_lime_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_CONCRETE.get(), dyeables())),
	SMOOTH_LIME_CONCRETE_SLAB = ITEMS.register("smooth_lime_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_CONCRETE_SLAB.get(), dyeables())),
	SMOOTH_LIME_CONCRETE_STAIRS = ITEMS.register("smooth_lime_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_CONCRETE_STAIRS.get(), dyeables())),
	SMOOTH_LIME_CONCRETE_WALL = ITEMS.register("smooth_lime_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_CONCRETE_WALL.get(), dyeables())),
	SMOOTH_LIME_CONCRETE_GATE = ITEMS.register("smooth_lime_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_CONCRETE_GATE.get(), dyeables())),

	// Concrete Bricks
	LIME_CONCRETE_BRICKS = ITEMS.register("lime_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_BRICKS.get(), dyeables())),
	LIME_CONCRETE_BRICK_SLAB = ITEMS.register("lime_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_BRICK_SLAB.get(), dyeables())),
	LIME_CONCRETE_BRICK_STAIRS = ITEMS.register("lime_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_BRICK_STAIRS.get(), dyeables())),
	LIME_CONCRETE_BRICK_WALL = ITEMS.register("lime_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_BRICK_WALL.get(), dyeables())),
	LIME_CONCRETE_BRICK_GATE = ITEMS.register("lime_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_BRICK_GATE.get(), dyeables())),

	// Cut Concrete
	CUT_LIME_CONCRETE = ITEMS.register("cut_lime_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_CONCRETE.get(), dyeables())),
	CUT_LIME_CONCRETE_SLAB = ITEMS.register("cut_lime_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_CONCRETE_SLAB.get(), dyeables())),
	CUT_LIME_CONCRETE_STAIRS = ITEMS.register("cut_lime_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_CONCRETE_STAIRS.get(), dyeables())),
	CUT_LIME_CONCRETE_WALL = ITEMS.register("cut_lime_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_CONCRETE_WALL.get(), dyeables())),
	CUT_LIME_CONCRETE_GATE = ITEMS.register("cut_lime_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_CONCRETE_GATE.get(), dyeables())),

	// Concrete Tiles
	LIME_CONCRETE_TILES = ITEMS.register("lime_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_TILES.get(), dyeables())),
	LIME_CONCRETE_TILE_SLAB = ITEMS.register("lime_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_TILE_SLAB.get(), dyeables())),
	LIME_CONCRETE_TILE_STAIRS = ITEMS.register("lime_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_TILE_STAIRS.get(), dyeables())),
	LIME_CONCRETE_TILE_WALL = ITEMS.register("lime_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_TILE_WALL.get(), dyeables())),
	LIME_CONCRETE_TILE_GATE = ITEMS.register("lime_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_TILE_GATE.get(), dyeables())),

	// Concrete Pillar
	LIME_CONCRETE_PILLAR = ITEMS.register("lime_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_PILLAR.get(), dyeables())),
	LIME_CONCRETE_CORNER_PILLAR = ITEMS.register("lime_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Concrete
	CHISELED_LIME_CONCRETE = ITEMS.register("chiseled_lime_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_LIME_CONCRETE.get(), dyeables())),

	// Carved Concrete
	CARVED_LIME_CONCRETE = ITEMS.register("carved_lime_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_LIME_CONCRETE.get(), dyeables())),


// GREEN CONCRETE

	// Base
	GREEN_CONCRETE_SLAB = ITEMS.register("green_concrete_slab", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_SLAB.get(), dyeables())),
	GREEN_CONCRETE_STAIRS = ITEMS.register("green_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_STAIRS.get(), dyeables())),
	GREEN_CONCRETE_WALL = ITEMS.register("green_concrete_wall", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_WALL.get(), dyeables())),
	GREEN_CONCRETE_GATE = ITEMS.register("green_concrete_gate", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_GATE.get(), dyeables())),

	// Polished Concrete
	POLISHED_GREEN_CONCRETE = ITEMS.register("polished_green_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_CONCRETE.get(), dyeables())),
	POLISHED_GREEN_CONCRETE_SLAB = ITEMS.register("polished_green_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_CONCRETE_SLAB.get(), dyeables())),
	POLISHED_GREEN_CONCRETE_STAIRS = ITEMS.register("polished_green_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_CONCRETE_STAIRS.get(), dyeables())),
	POLISHED_GREEN_CONCRETE_WALL = ITEMS.register("polished_green_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_CONCRETE_WALL.get(), dyeables())),
	POLISHED_GREEN_CONCRETE_GATE = ITEMS.register("polished_green_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_CONCRETE_GATE.get(), dyeables())),

	// Smooth Concrete
	SMOOTH_GREEN_CONCRETE = ITEMS.register("smooth_green_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_CONCRETE.get(), dyeables())),
	SMOOTH_GREEN_CONCRETE_SLAB = ITEMS.register("smooth_green_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_CONCRETE_SLAB.get(), dyeables())),
	SMOOTH_GREEN_CONCRETE_STAIRS = ITEMS.register("smooth_green_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_CONCRETE_STAIRS.get(), dyeables())),
	SMOOTH_GREEN_CONCRETE_WALL = ITEMS.register("smooth_green_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_CONCRETE_WALL.get(), dyeables())),
	SMOOTH_GREEN_CONCRETE_GATE = ITEMS.register("smooth_green_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_CONCRETE_GATE.get(), dyeables())),

	// Concrete Bricks
	GREEN_CONCRETE_BRICKS = ITEMS.register("green_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_BRICKS.get(), dyeables())),
	GREEN_CONCRETE_BRICK_SLAB = ITEMS.register("green_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_BRICK_SLAB.get(), dyeables())),
	GREEN_CONCRETE_BRICK_STAIRS = ITEMS.register("green_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_BRICK_STAIRS.get(), dyeables())),
	GREEN_CONCRETE_BRICK_WALL = ITEMS.register("green_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_BRICK_WALL.get(), dyeables())),
	GREEN_CONCRETE_BRICK_GATE = ITEMS.register("green_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_BRICK_GATE.get(), dyeables())),

	// Cut Concrete
	CUT_GREEN_CONCRETE = ITEMS.register("cut_green_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_CONCRETE.get(), dyeables())),
	CUT_GREEN_CONCRETE_SLAB = ITEMS.register("cut_green_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_CONCRETE_SLAB.get(), dyeables())),
	CUT_GREEN_CONCRETE_STAIRS = ITEMS.register("cut_green_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_CONCRETE_STAIRS.get(), dyeables())),
	CUT_GREEN_CONCRETE_WALL = ITEMS.register("cut_green_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_CONCRETE_WALL.get(), dyeables())),
	CUT_GREEN_CONCRETE_GATE = ITEMS.register("cut_green_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_CONCRETE_GATE.get(), dyeables())),

	// Concrete Tiles
	GREEN_CONCRETE_TILES = ITEMS.register("green_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_TILES.get(), dyeables())),
	GREEN_CONCRETE_TILE_SLAB = ITEMS.register("green_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_TILE_SLAB.get(), dyeables())),
	GREEN_CONCRETE_TILE_STAIRS = ITEMS.register("green_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_TILE_STAIRS.get(), dyeables())),
	GREEN_CONCRETE_TILE_WALL = ITEMS.register("green_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_TILE_WALL.get(), dyeables())),
	GREEN_CONCRETE_TILE_GATE = ITEMS.register("green_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_TILE_GATE.get(), dyeables())),

	// Concrete Pillar
	GREEN_CONCRETE_PILLAR = ITEMS.register("green_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_PILLAR.get(), dyeables())),
	GREEN_CONCRETE_CORNER_PILLAR = ITEMS.register("green_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Concrete
	CHISELED_GREEN_CONCRETE = ITEMS.register("chiseled_green_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_GREEN_CONCRETE.get(), dyeables())),

	// Carved Concrete
	CARVED_GREEN_CONCRETE = ITEMS.register("carved_green_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_GREEN_CONCRETE.get(), dyeables())),


// BLUE CONCRETE

	// Base
	BLUE_CONCRETE_SLAB = ITEMS.register("blue_concrete_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_SLAB.get(), dyeables())),
	BLUE_CONCRETE_STAIRS = ITEMS.register("blue_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_STAIRS.get(), dyeables())),
	BLUE_CONCRETE_WALL = ITEMS.register("blue_concrete_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_WALL.get(), dyeables())),
	BLUE_CONCRETE_GATE = ITEMS.register("blue_concrete_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_GATE.get(), dyeables())),

	// Polished Concrete
	POLISHED_BLUE_CONCRETE = ITEMS.register("polished_blue_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_CONCRETE.get(), dyeables())),
	POLISHED_BLUE_CONCRETE_SLAB = ITEMS.register("polished_blue_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_CONCRETE_SLAB.get(), dyeables())),
	POLISHED_BLUE_CONCRETE_STAIRS = ITEMS.register("polished_blue_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_CONCRETE_STAIRS.get(), dyeables())),
	POLISHED_BLUE_CONCRETE_WALL = ITEMS.register("polished_blue_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_CONCRETE_WALL.get(), dyeables())),
	POLISHED_BLUE_CONCRETE_GATE = ITEMS.register("polished_blue_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_CONCRETE_GATE.get(), dyeables())),

	// Smooth Concrete
	SMOOTH_BLUE_CONCRETE = ITEMS.register("smooth_blue_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_CONCRETE.get(), dyeables())),
	SMOOTH_BLUE_CONCRETE_SLAB = ITEMS.register("smooth_blue_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_CONCRETE_SLAB.get(), dyeables())),
	SMOOTH_BLUE_CONCRETE_STAIRS = ITEMS.register("smooth_blue_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_CONCRETE_STAIRS.get(), dyeables())),
	SMOOTH_BLUE_CONCRETE_WALL = ITEMS.register("smooth_blue_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_CONCRETE_WALL.get(), dyeables())),
	SMOOTH_BLUE_CONCRETE_GATE = ITEMS.register("smooth_blue_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_CONCRETE_GATE.get(), dyeables())),

	// Concrete Bricks
	BLUE_CONCRETE_BRICKS = ITEMS.register("blue_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_BRICKS.get(), dyeables())),
	BLUE_CONCRETE_BRICK_SLAB = ITEMS.register("blue_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_BRICK_SLAB.get(), dyeables())),
	BLUE_CONCRETE_BRICK_STAIRS = ITEMS.register("blue_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_BRICK_STAIRS.get(), dyeables())),
	BLUE_CONCRETE_BRICK_WALL = ITEMS.register("blue_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_BRICK_WALL.get(), dyeables())),
	BLUE_CONCRETE_BRICK_GATE = ITEMS.register("blue_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_BRICK_GATE.get(), dyeables())),

	// Cut Concrete
	CUT_BLUE_CONCRETE = ITEMS.register("cut_blue_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_CONCRETE.get(), dyeables())),
	CUT_BLUE_CONCRETE_SLAB = ITEMS.register("cut_blue_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_CONCRETE_SLAB.get(), dyeables())),
	CUT_BLUE_CONCRETE_STAIRS = ITEMS.register("cut_blue_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_CONCRETE_STAIRS.get(), dyeables())),
	CUT_BLUE_CONCRETE_WALL = ITEMS.register("cut_blue_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_CONCRETE_WALL.get(), dyeables())),
	CUT_BLUE_CONCRETE_GATE = ITEMS.register("cut_blue_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_CONCRETE_GATE.get(), dyeables())),

	// Concrete Tiles
	BLUE_CONCRETE_TILES = ITEMS.register("blue_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_TILES.get(), dyeables())),
	BLUE_CONCRETE_TILE_SLAB = ITEMS.register("blue_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_TILE_SLAB.get(), dyeables())),
	BLUE_CONCRETE_TILE_STAIRS = ITEMS.register("blue_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_TILE_STAIRS.get(), dyeables())),
	BLUE_CONCRETE_TILE_WALL = ITEMS.register("blue_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_TILE_WALL.get(), dyeables())),
	BLUE_CONCRETE_TILE_GATE = ITEMS.register("blue_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_TILE_GATE.get(), dyeables())),

	// Concrete Pillar
	BLUE_CONCRETE_PILLAR = ITEMS.register("blue_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_PILLAR.get(), dyeables())),
	BLUE_CONCRETE_CORNER_PILLAR = ITEMS.register("blue_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Concrete
	CHISELED_BLUE_CONCRETE = ITEMS.register("chiseled_blue_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_BLUE_CONCRETE.get(), dyeables())),

	// Carved Concrete
	CARVED_BLUE_CONCRETE = ITEMS.register("carved_blue_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_BLUE_CONCRETE.get(), dyeables())),


// CYAN CONCRETE

	// Base
	CYAN_CONCRETE_SLAB = ITEMS.register("cyan_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_SLAB.get(), dyeables())),
	CYAN_CONCRETE_STAIRS = ITEMS.register("cyan_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_STAIRS.get(), dyeables())),
	CYAN_CONCRETE_WALL = ITEMS.register("cyan_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_WALL.get(), dyeables())),
	CYAN_CONCRETE_GATE = ITEMS.register("cyan_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_GATE.get(), dyeables())),

	// Polished Concrete
	POLISHED_CYAN_CONCRETE = ITEMS.register("polished_cyan_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_CONCRETE.get(), dyeables())),
	POLISHED_CYAN_CONCRETE_SLAB = ITEMS.register("polished_cyan_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_CONCRETE_SLAB.get(), dyeables())),
	POLISHED_CYAN_CONCRETE_STAIRS = ITEMS.register("polished_cyan_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_CONCRETE_STAIRS.get(), dyeables())),
	POLISHED_CYAN_CONCRETE_WALL = ITEMS.register("polished_cyan_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_CONCRETE_WALL.get(), dyeables())),
	POLISHED_CYAN_CONCRETE_GATE = ITEMS.register("polished_cyan_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_CONCRETE_GATE.get(), dyeables())),

	// Smooth Concrete
	SMOOTH_CYAN_CONCRETE = ITEMS.register("smooth_cyan_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_CONCRETE.get(), dyeables())),
	SMOOTH_CYAN_CONCRETE_SLAB = ITEMS.register("smooth_cyan_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_CONCRETE_SLAB.get(), dyeables())),
	SMOOTH_CYAN_CONCRETE_STAIRS = ITEMS.register("smooth_cyan_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_CONCRETE_STAIRS.get(), dyeables())),
	SMOOTH_CYAN_CONCRETE_WALL = ITEMS.register("smooth_cyan_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_CONCRETE_WALL.get(), dyeables())),
	SMOOTH_CYAN_CONCRETE_GATE = ITEMS.register("smooth_cyan_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_CONCRETE_GATE.get(), dyeables())),

	// Concrete Bricks
	CYAN_CONCRETE_BRICKS = ITEMS.register("cyan_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_BRICKS.get(), dyeables())),
	CYAN_CONCRETE_BRICK_SLAB = ITEMS.register("cyan_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_BRICK_SLAB.get(), dyeables())),
	CYAN_CONCRETE_BRICK_STAIRS = ITEMS.register("cyan_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_BRICK_STAIRS.get(), dyeables())),
	CYAN_CONCRETE_BRICK_WALL = ITEMS.register("cyan_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_BRICK_WALL.get(), dyeables())),
	CYAN_CONCRETE_BRICK_GATE = ITEMS.register("cyan_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_BRICK_GATE.get(), dyeables())),

	// Cut Concrete
	CUT_CYAN_CONCRETE = ITEMS.register("cut_cyan_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_CONCRETE.get(), dyeables())),
	CUT_CYAN_CONCRETE_SLAB = ITEMS.register("cut_cyan_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_CONCRETE_SLAB.get(), dyeables())),
	CUT_CYAN_CONCRETE_STAIRS = ITEMS.register("cut_cyan_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_CONCRETE_STAIRS.get(), dyeables())),
	CUT_CYAN_CONCRETE_WALL = ITEMS.register("cut_cyan_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_CONCRETE_WALL.get(), dyeables())),
	CUT_CYAN_CONCRETE_GATE = ITEMS.register("cut_cyan_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_CONCRETE_GATE.get(), dyeables())),

	// Concrete Tiles
	CYAN_CONCRETE_TILES = ITEMS.register("cyan_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_TILES.get(), dyeables())),
	CYAN_CONCRETE_TILE_SLAB = ITEMS.register("cyan_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_TILE_SLAB.get(), dyeables())),
	CYAN_CONCRETE_TILE_STAIRS = ITEMS.register("cyan_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_TILE_STAIRS.get(), dyeables())),
	CYAN_CONCRETE_TILE_WALL = ITEMS.register("cyan_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_TILE_WALL.get(), dyeables())),
	CYAN_CONCRETE_TILE_GATE = ITEMS.register("cyan_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_TILE_GATE.get(), dyeables())),

	// Concrete Pillar
	CYAN_CONCRETE_PILLAR = ITEMS.register("cyan_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_PILLAR.get(), dyeables())),
	CYAN_CONCRETE_CORNER_PILLAR = ITEMS.register("cyan_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Concrete
	CHISELED_CYAN_CONCRETE = ITEMS.register("chiseled_cyan_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_CYAN_CONCRETE.get(), dyeables())),

	// Carved Concrete
	CARVED_CYAN_CONCRETE = ITEMS.register("carved_cyan_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_CYAN_CONCRETE.get(), dyeables())),


// LIGHT BLUE CONCRETE

	// Base
	LIGHT_BLUE_CONCRETE_SLAB = ITEMS.register("light_blue_concrete_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), dyeables())),
	LIGHT_BLUE_CONCRETE_STAIRS = ITEMS.register("light_blue_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), dyeables())),
	LIGHT_BLUE_CONCRETE_WALL = ITEMS.register("light_blue_concrete_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), dyeables())),
	LIGHT_BLUE_CONCRETE_GATE = ITEMS.register("light_blue_concrete_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_GATE.get(), dyeables())),

	// Polished Concrete
	POLISHED_LIGHT_BLUE_CONCRETE = ITEMS.register("polished_light_blue_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_CONCRETE.get(), dyeables())),
	POLISHED_LIGHT_BLUE_CONCRETE_SLAB = ITEMS.register("polished_light_blue_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_CONCRETE_SLAB.get(), dyeables())),
	POLISHED_LIGHT_BLUE_CONCRETE_STAIRS = ITEMS.register("polished_light_blue_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_CONCRETE_STAIRS.get(), dyeables())),
	POLISHED_LIGHT_BLUE_CONCRETE_WALL = ITEMS.register("polished_light_blue_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_CONCRETE_WALL.get(), dyeables())),
	POLISHED_LIGHT_BLUE_CONCRETE_GATE = ITEMS.register("polished_light_blue_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_CONCRETE_GATE.get(), dyeables())),

	// Smooth Concrete
	SMOOTH_LIGHT_BLUE_CONCRETE = ITEMS.register("smooth_light_blue_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_CONCRETE.get(), dyeables())),
	SMOOTH_LIGHT_BLUE_CONCRETE_SLAB = ITEMS.register("smooth_light_blue_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_CONCRETE_SLAB.get(), dyeables())),
	SMOOTH_LIGHT_BLUE_CONCRETE_STAIRS = ITEMS.register("smooth_light_blue_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_CONCRETE_STAIRS.get(), dyeables())),
	SMOOTH_LIGHT_BLUE_CONCRETE_WALL = ITEMS.register("smooth_light_blue_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_CONCRETE_WALL.get(), dyeables())),
	SMOOTH_LIGHT_BLUE_CONCRETE_GATE = ITEMS.register("smooth_light_blue_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_CONCRETE_GATE.get(), dyeables())),

	// Concrete Bricks
	LIGHT_BLUE_CONCRETE_BRICKS = ITEMS.register("light_blue_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_BRICKS.get(), dyeables())),
	LIGHT_BLUE_CONCRETE_BRICK_SLAB = ITEMS.register("light_blue_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_BRICK_SLAB.get(), dyeables())),
	LIGHT_BLUE_CONCRETE_BRICK_STAIRS = ITEMS.register("light_blue_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_BRICK_STAIRS.get(), dyeables())),
	LIGHT_BLUE_CONCRETE_BRICK_WALL = ITEMS.register("light_blue_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_BRICK_WALL.get(), dyeables())),
	LIGHT_BLUE_CONCRETE_BRICK_GATE = ITEMS.register("light_blue_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_BRICK_GATE.get(), dyeables())),

	// Cut Concrete
	CUT_LIGHT_BLUE_CONCRETE = ITEMS.register("cut_light_blue_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_CONCRETE.get(), dyeables())),
	CUT_LIGHT_BLUE_CONCRETE_SLAB = ITEMS.register("cut_light_blue_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB.get(), dyeables())),
	CUT_LIGHT_BLUE_CONCRETE_STAIRS = ITEMS.register("cut_light_blue_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS.get(), dyeables())),
	CUT_LIGHT_BLUE_CONCRETE_WALL = ITEMS.register("cut_light_blue_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL.get(), dyeables())),
	CUT_LIGHT_BLUE_CONCRETE_GATE = ITEMS.register("cut_light_blue_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_CONCRETE_GATE.get(), dyeables())),

	// Concrete Tiles
	LIGHT_BLUE_CONCRETE_TILES = ITEMS.register("light_blue_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_TILES.get(), dyeables())),
	LIGHT_BLUE_CONCRETE_TILE_SLAB = ITEMS.register("light_blue_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_TILE_SLAB.get(), dyeables())),
	LIGHT_BLUE_CONCRETE_TILE_STAIRS = ITEMS.register("light_blue_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_TILE_STAIRS.get(), dyeables())),
	LIGHT_BLUE_CONCRETE_TILE_WALL = ITEMS.register("light_blue_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_TILE_WALL.get(), dyeables())),
	LIGHT_BLUE_CONCRETE_TILE_GATE = ITEMS.register("light_blue_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_TILE_GATE.get(), dyeables())),

	// Concrete Pillar
	LIGHT_BLUE_CONCRETE_PILLAR = ITEMS.register("light_blue_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_PILLAR.get(), dyeables())),
	LIGHT_BLUE_CONCRETE_CORNER_PILLAR = ITEMS.register("light_blue_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Concrete
	CHISELED_LIGHT_BLUE_CONCRETE = ITEMS.register("chiseled_light_blue_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_LIGHT_BLUE_CONCRETE.get(), dyeables())),

	// Carved Concrete
	CARVED_LIGHT_BLUE_CONCRETE = ITEMS.register("carved_light_blue_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_LIGHT_BLUE_CONCRETE.get(), dyeables())),


// PURPLE CONCRETE

	// Base
	PURPLE_CONCRETE_SLAB = ITEMS.register("purple_concrete_slab", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_SLAB.get(), dyeables())),
	PURPLE_CONCRETE_STAIRS = ITEMS.register("purple_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_STAIRS.get(), dyeables())),
	PURPLE_CONCRETE_WALL = ITEMS.register("purple_concrete_wall", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_WALL.get(), dyeables())),
	PURPLE_CONCRETE_GATE = ITEMS.register("purple_concrete_gate", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_GATE.get(), dyeables())),

	// Polished Concrete
	POLISHED_PURPLE_CONCRETE = ITEMS.register("polished_purple_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_CONCRETE.get(), dyeables())),
	POLISHED_PURPLE_CONCRETE_SLAB = ITEMS.register("polished_purple_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_CONCRETE_SLAB.get(), dyeables())),
	POLISHED_PURPLE_CONCRETE_STAIRS = ITEMS.register("polished_purple_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_CONCRETE_STAIRS.get(), dyeables())),
	POLISHED_PURPLE_CONCRETE_WALL = ITEMS.register("polished_purple_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_CONCRETE_WALL.get(), dyeables())),
	POLISHED_PURPLE_CONCRETE_GATE = ITEMS.register("polished_purple_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_CONCRETE_GATE.get(), dyeables())),

	// Smooth Concrete
	SMOOTH_PURPLE_CONCRETE = ITEMS.register("smooth_purple_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_CONCRETE.get(), dyeables())),
	SMOOTH_PURPLE_CONCRETE_SLAB = ITEMS.register("smooth_purple_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_CONCRETE_SLAB.get(), dyeables())),
	SMOOTH_PURPLE_CONCRETE_STAIRS = ITEMS.register("smooth_purple_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_CONCRETE_STAIRS.get(), dyeables())),
	SMOOTH_PURPLE_CONCRETE_WALL = ITEMS.register("smooth_purple_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_CONCRETE_WALL.get(), dyeables())),
	SMOOTH_PURPLE_CONCRETE_GATE = ITEMS.register("smooth_purple_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_CONCRETE_GATE.get(), dyeables())),

	// Concrete Bricks
	PURPLE_CONCRETE_BRICKS = ITEMS.register("purple_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_BRICKS.get(), dyeables())),
	PURPLE_CONCRETE_BRICK_SLAB = ITEMS.register("purple_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_BRICK_SLAB.get(), dyeables())),
	PURPLE_CONCRETE_BRICK_STAIRS = ITEMS.register("purple_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_BRICK_STAIRS.get(), dyeables())),
	PURPLE_CONCRETE_BRICK_WALL = ITEMS.register("purple_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_BRICK_WALL.get(), dyeables())),
	PURPLE_CONCRETE_BRICK_GATE = ITEMS.register("purple_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_BRICK_GATE.get(), dyeables())),

	// Cut Concrete
	CUT_PURPLE_CONCRETE = ITEMS.register("cut_purple_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_CONCRETE.get(), dyeables())),
	CUT_PURPLE_CONCRETE_SLAB = ITEMS.register("cut_purple_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_CONCRETE_SLAB.get(), dyeables())),
	CUT_PURPLE_CONCRETE_STAIRS = ITEMS.register("cut_purple_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_CONCRETE_STAIRS.get(), dyeables())),
	CUT_PURPLE_CONCRETE_WALL = ITEMS.register("cut_purple_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_CONCRETE_WALL.get(), dyeables())),
	CUT_PURPLE_CONCRETE_GATE = ITEMS.register("cut_purple_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_CONCRETE_GATE.get(), dyeables())),

	// Concrete Tiles
	PURPLE_CONCRETE_TILES = ITEMS.register("purple_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_TILES.get(), dyeables())),
	PURPLE_CONCRETE_TILE_SLAB = ITEMS.register("purple_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_TILE_SLAB.get(), dyeables())),
	PURPLE_CONCRETE_TILE_STAIRS = ITEMS.register("purple_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_TILE_STAIRS.get(), dyeables())),
	PURPLE_CONCRETE_TILE_WALL = ITEMS.register("purple_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_TILE_WALL.get(), dyeables())),
	PURPLE_CONCRETE_TILE_GATE = ITEMS.register("purple_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_TILE_GATE.get(), dyeables())),

	// Concrete Pillar
	PURPLE_CONCRETE_PILLAR = ITEMS.register("purple_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_PILLAR.get(), dyeables())),
	PURPLE_CONCRETE_CORNER_PILLAR = ITEMS.register("purple_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Concrete
	CHISELED_PURPLE_CONCRETE = ITEMS.register("chiseled_purple_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_PURPLE_CONCRETE.get(), dyeables())),

	// Carved Concrete
	CARVED_PURPLE_CONCRETE = ITEMS.register("carved_purple_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_PURPLE_CONCRETE.get(), dyeables())),


// MAGENTA CONCRETE

	// Base
	MAGENTA_CONCRETE_SLAB = ITEMS.register("magenta_concrete_slab", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_SLAB.get(), dyeables())),
	MAGENTA_CONCRETE_STAIRS = ITEMS.register("magenta_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_STAIRS.get(), dyeables())),
	MAGENTA_CONCRETE_WALL = ITEMS.register("magenta_concrete_wall", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_WALL.get(), dyeables())),
	MAGENTA_CONCRETE_GATE = ITEMS.register("magenta_concrete_gate", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_GATE.get(), dyeables())),

	// Polished Concrete
	POLISHED_MAGENTA_CONCRETE = ITEMS.register("polished_magenta_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_CONCRETE.get(), dyeables())),
	POLISHED_MAGENTA_CONCRETE_SLAB = ITEMS.register("polished_magenta_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_CONCRETE_SLAB.get(), dyeables())),
	POLISHED_MAGENTA_CONCRETE_STAIRS = ITEMS.register("polished_magenta_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_CONCRETE_STAIRS.get(), dyeables())),
	POLISHED_MAGENTA_CONCRETE_WALL = ITEMS.register("polished_magenta_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_CONCRETE_WALL.get(), dyeables())),
	POLISHED_MAGENTA_CONCRETE_GATE = ITEMS.register("polished_magenta_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_CONCRETE_GATE.get(), dyeables())),

	// Smooth Concrete
	SMOOTH_MAGENTA_CONCRETE = ITEMS.register("smooth_magenta_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_CONCRETE.get(), dyeables())),
	SMOOTH_MAGENTA_CONCRETE_SLAB = ITEMS.register("smooth_magenta_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_CONCRETE_SLAB.get(), dyeables())),
	SMOOTH_MAGENTA_CONCRETE_STAIRS = ITEMS.register("smooth_magenta_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_CONCRETE_STAIRS.get(), dyeables())),
	SMOOTH_MAGENTA_CONCRETE_WALL = ITEMS.register("smooth_magenta_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_CONCRETE_WALL.get(), dyeables())),
	SMOOTH_MAGENTA_CONCRETE_GATE = ITEMS.register("smooth_magenta_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_CONCRETE_GATE.get(), dyeables())),

	// Concrete Bricks
	MAGENTA_CONCRETE_BRICKS = ITEMS.register("magenta_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_BRICKS.get(), dyeables())),
	MAGENTA_CONCRETE_BRICK_SLAB = ITEMS.register("magenta_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_BRICK_SLAB.get(), dyeables())),
	MAGENTA_CONCRETE_BRICK_STAIRS = ITEMS.register("magenta_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_BRICK_STAIRS.get(), dyeables())),
	MAGENTA_CONCRETE_BRICK_WALL = ITEMS.register("magenta_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_BRICK_WALL.get(), dyeables())),
	MAGENTA_CONCRETE_BRICK_GATE = ITEMS.register("magenta_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_BRICK_GATE.get(), dyeables())),

	// Cut Concrete
	CUT_MAGENTA_CONCRETE = ITEMS.register("cut_magenta_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_CONCRETE.get(), dyeables())),
	CUT_MAGENTA_CONCRETE_SLAB = ITEMS.register("cut_magenta_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_CONCRETE_SLAB.get(), dyeables())),
	CUT_MAGENTA_CONCRETE_STAIRS = ITEMS.register("cut_magenta_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_CONCRETE_STAIRS.get(), dyeables())),
	CUT_MAGENTA_CONCRETE_WALL = ITEMS.register("cut_magenta_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_CONCRETE_WALL.get(), dyeables())),
	CUT_MAGENTA_CONCRETE_GATE = ITEMS.register("cut_magenta_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_CONCRETE_GATE.get(), dyeables())),

	// Concrete Tiles
	MAGENTA_CONCRETE_TILES = ITEMS.register("magenta_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_TILES.get(), dyeables())),
	MAGENTA_CONCRETE_TILE_SLAB = ITEMS.register("magenta_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_TILE_SLAB.get(), dyeables())),
	MAGENTA_CONCRETE_TILE_STAIRS = ITEMS.register("magenta_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_TILE_STAIRS.get(), dyeables())),
	MAGENTA_CONCRETE_TILE_WALL = ITEMS.register("magenta_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_TILE_WALL.get(), dyeables())),
	MAGENTA_CONCRETE_TILE_GATE = ITEMS.register("magenta_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_TILE_GATE.get(), dyeables())),

	// Concrete Pillar
	MAGENTA_CONCRETE_PILLAR = ITEMS.register("magenta_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_PILLAR.get(), dyeables())),
	MAGENTA_CONCRETE_CORNER_PILLAR = ITEMS.register("magenta_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Concrete
	CHISELED_MAGENTA_CONCRETE = ITEMS.register("chiseled_magenta_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_MAGENTA_CONCRETE.get(), dyeables())),

	// Carved Concrete
	CARVED_MAGENTA_CONCRETE = ITEMS.register("carved_magenta_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_MAGENTA_CONCRETE.get(), dyeables())),


// PINK CONCRETE

	// Base
	PINK_CONCRETE_SLAB = ITEMS.register("pink_concrete_slab", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_SLAB.get(), dyeables())),
	PINK_CONCRETE_STAIRS = ITEMS.register("pink_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_STAIRS.get(), dyeables())),
	PINK_CONCRETE_WALL = ITEMS.register("pink_concrete_wall", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_WALL.get(), dyeables())),
	PINK_CONCRETE_GATE = ITEMS.register("pink_concrete_gate", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_GATE.get(), dyeables())),

	// Polished Concrete
	POLISHED_PINK_CONCRETE = ITEMS.register("polished_pink_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_CONCRETE.get(), dyeables())),
	POLISHED_PINK_CONCRETE_SLAB = ITEMS.register("polished_pink_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_CONCRETE_SLAB.get(), dyeables())),
	POLISHED_PINK_CONCRETE_STAIRS = ITEMS.register("polished_pink_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_CONCRETE_STAIRS.get(), dyeables())),
	POLISHED_PINK_CONCRETE_WALL = ITEMS.register("polished_pink_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_CONCRETE_WALL.get(), dyeables())),
	POLISHED_PINK_CONCRETE_GATE = ITEMS.register("polished_pink_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_CONCRETE_GATE.get(), dyeables())),

	// Smooth Concrete
	SMOOTH_PINK_CONCRETE = ITEMS.register("smooth_pink_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_CONCRETE.get(), dyeables())),
	SMOOTH_PINK_CONCRETE_SLAB = ITEMS.register("smooth_pink_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_CONCRETE_SLAB.get(), dyeables())),
	SMOOTH_PINK_CONCRETE_STAIRS = ITEMS.register("smooth_pink_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_CONCRETE_STAIRS.get(), dyeables())),
	SMOOTH_PINK_CONCRETE_WALL = ITEMS.register("smooth_pink_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_CONCRETE_WALL.get(), dyeables())),
	SMOOTH_PINK_CONCRETE_GATE = ITEMS.register("smooth_pink_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_CONCRETE_GATE.get(), dyeables())),

	// Concrete Bricks
	PINK_CONCRETE_BRICKS = ITEMS.register("pink_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_BRICKS.get(), dyeables())),
	PINK_CONCRETE_BRICK_SLAB = ITEMS.register("pink_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_BRICK_SLAB.get(), dyeables())),
	PINK_CONCRETE_BRICK_STAIRS = ITEMS.register("pink_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_BRICK_STAIRS.get(), dyeables())),
	PINK_CONCRETE_BRICK_WALL = ITEMS.register("pink_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_BRICK_WALL.get(), dyeables())),
	PINK_CONCRETE_BRICK_GATE = ITEMS.register("pink_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_BRICK_GATE.get(), dyeables())),

	// Cut Concrete
	CUT_PINK_CONCRETE = ITEMS.register("cut_pink_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_CONCRETE.get(), dyeables())),
	CUT_PINK_CONCRETE_SLAB = ITEMS.register("cut_pink_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_CONCRETE_SLAB.get(), dyeables())),
	CUT_PINK_CONCRETE_STAIRS = ITEMS.register("cut_pink_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_CONCRETE_STAIRS.get(), dyeables())),
	CUT_PINK_CONCRETE_WALL = ITEMS.register("cut_pink_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_CONCRETE_WALL.get(), dyeables())),
	CUT_PINK_CONCRETE_GATE = ITEMS.register("cut_pink_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_CONCRETE_GATE.get(), dyeables())),

	// Concrete Tiles
	PINK_CONCRETE_TILES = ITEMS.register("pink_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_TILES.get(), dyeables())),
	PINK_CONCRETE_TILE_SLAB = ITEMS.register("pink_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_TILE_SLAB.get(), dyeables())),
	PINK_CONCRETE_TILE_STAIRS = ITEMS.register("pink_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_TILE_STAIRS.get(), dyeables())),
	PINK_CONCRETE_TILE_WALL = ITEMS.register("pink_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_TILE_WALL.get(), dyeables())),
	PINK_CONCRETE_TILE_GATE = ITEMS.register("pink_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_TILE_GATE.get(), dyeables())),

	// Concrete Pillar
	PINK_CONCRETE_PILLAR = ITEMS.register("pink_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_PILLAR.get(), dyeables())),
	PINK_CONCRETE_CORNER_PILLAR = ITEMS.register("pink_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Concrete
	CHISELED_PINK_CONCRETE = ITEMS.register("chiseled_pink_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_PINK_CONCRETE.get(), dyeables())),

	// Carved Concrete
	CARVED_PINK_CONCRETE = ITEMS.register("carved_pink_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_PINK_CONCRETE.get(), dyeables())),


// WHITE CONCRETE

	// Base
	WHITE_CONCRETE_SLAB = ITEMS.register("white_concrete_slab", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_SLAB.get(), dyeables())),
	WHITE_CONCRETE_STAIRS = ITEMS.register("white_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_STAIRS.get(), dyeables())),
	WHITE_CONCRETE_WALL = ITEMS.register("white_concrete_wall", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_WALL.get(), dyeables())),
	WHITE_CONCRETE_GATE = ITEMS.register("white_concrete_gate", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_GATE.get(), dyeables())),

	// Polished Concrete
	POLISHED_WHITE_CONCRETE = ITEMS.register("polished_white_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_CONCRETE.get(), dyeables())),
	POLISHED_WHITE_CONCRETE_SLAB = ITEMS.register("polished_white_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_CONCRETE_SLAB.get(), dyeables())),
	POLISHED_WHITE_CONCRETE_STAIRS = ITEMS.register("polished_white_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_CONCRETE_STAIRS.get(), dyeables())),
	POLISHED_WHITE_CONCRETE_WALL = ITEMS.register("polished_white_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_CONCRETE_WALL.get(), dyeables())),
	POLISHED_WHITE_CONCRETE_GATE = ITEMS.register("polished_white_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_CONCRETE_GATE.get(), dyeables())),

	// Smooth Concrete
	SMOOTH_WHITE_CONCRETE = ITEMS.register("smooth_white_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_CONCRETE.get(), dyeables())),
	SMOOTH_WHITE_CONCRETE_SLAB = ITEMS.register("smooth_white_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_CONCRETE_SLAB.get(), dyeables())),
	SMOOTH_WHITE_CONCRETE_STAIRS = ITEMS.register("smooth_white_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_CONCRETE_STAIRS.get(), dyeables())),
	SMOOTH_WHITE_CONCRETE_WALL = ITEMS.register("smooth_white_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_CONCRETE_WALL.get(), dyeables())),
	SMOOTH_WHITE_CONCRETE_GATE = ITEMS.register("smooth_white_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_CONCRETE_GATE.get(), dyeables())),

	// Concrete Bricks
	WHITE_CONCRETE_BRICKS = ITEMS.register("white_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_BRICKS.get(), dyeables())),
	WHITE_CONCRETE_BRICK_SLAB = ITEMS.register("white_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_BRICK_SLAB.get(), dyeables())),
	WHITE_CONCRETE_BRICK_STAIRS = ITEMS.register("white_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_BRICK_STAIRS.get(), dyeables())),
	WHITE_CONCRETE_BRICK_WALL = ITEMS.register("white_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_BRICK_WALL.get(), dyeables())),
	WHITE_CONCRETE_BRICK_GATE = ITEMS.register("white_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_BRICK_GATE.get(), dyeables())),

	// Cut Concrete
	CUT_WHITE_CONCRETE = ITEMS.register("cut_white_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_CONCRETE.get(), dyeables())),
	CUT_WHITE_CONCRETE_SLAB = ITEMS.register("cut_white_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_CONCRETE_SLAB.get(), dyeables())),
	CUT_WHITE_CONCRETE_STAIRS = ITEMS.register("cut_white_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_CONCRETE_STAIRS.get(), dyeables())),
	CUT_WHITE_CONCRETE_WALL = ITEMS.register("cut_white_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_CONCRETE_WALL.get(), dyeables())),
	CUT_WHITE_CONCRETE_GATE = ITEMS.register("cut_white_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_CONCRETE_GATE.get(), dyeables())),

	// Concrete Tiles
	WHITE_CONCRETE_TILES = ITEMS.register("white_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_TILES.get(), dyeables())),
	WHITE_CONCRETE_TILE_SLAB = ITEMS.register("white_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_TILE_SLAB.get(), dyeables())),
	WHITE_CONCRETE_TILE_STAIRS = ITEMS.register("white_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_TILE_STAIRS.get(), dyeables())),
	WHITE_CONCRETE_TILE_WALL = ITEMS.register("white_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_TILE_WALL.get(), dyeables())),
	WHITE_CONCRETE_TILE_GATE = ITEMS.register("white_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_TILE_GATE.get(), dyeables())),

	// Concrete Pillar
	WHITE_CONCRETE_PILLAR = ITEMS.register("white_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_PILLAR.get(), dyeables())),
	WHITE_CONCRETE_CORNER_PILLAR = ITEMS.register("white_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Concrete
	CHISELED_WHITE_CONCRETE = ITEMS.register("chiseled_white_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_WHITE_CONCRETE.get(), dyeables())),

	// Carved Concrete
	CARVED_WHITE_CONCRETE = ITEMS.register("carved_white_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_WHITE_CONCRETE.get(), dyeables())),


// LIGHT GRAY CONCRETE

	// Base
	LIGHT_GRAY_CONCRETE_SLAB = ITEMS.register("light_gray_concrete_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), dyeables())),
	LIGHT_GRAY_CONCRETE_STAIRS = ITEMS.register("light_gray_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), dyeables())),
	LIGHT_GRAY_CONCRETE_WALL = ITEMS.register("light_gray_concrete_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), dyeables())),
	LIGHT_GRAY_CONCRETE_GATE = ITEMS.register("light_gray_concrete_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_GATE.get(), dyeables())),

	// Polished Concrete
	POLISHED_LIGHT_GRAY_CONCRETE = ITEMS.register("polished_light_gray_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_CONCRETE.get(), dyeables())),
	POLISHED_LIGHT_GRAY_CONCRETE_SLAB = ITEMS.register("polished_light_gray_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_CONCRETE_SLAB.get(), dyeables())),
	POLISHED_LIGHT_GRAY_CONCRETE_STAIRS = ITEMS.register("polished_light_gray_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_CONCRETE_STAIRS.get(), dyeables())),
	POLISHED_LIGHT_GRAY_CONCRETE_WALL = ITEMS.register("polished_light_gray_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_CONCRETE_WALL.get(), dyeables())),
	POLISHED_LIGHT_GRAY_CONCRETE_GATE = ITEMS.register("polished_light_gray_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_CONCRETE_GATE.get(), dyeables())),

	// Smooth Concrete
	SMOOTH_LIGHT_GRAY_CONCRETE = ITEMS.register("smooth_light_gray_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_CONCRETE.get(), dyeables())),
	SMOOTH_LIGHT_GRAY_CONCRETE_SLAB = ITEMS.register("smooth_light_gray_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_CONCRETE_SLAB.get(), dyeables())),
	SMOOTH_LIGHT_GRAY_CONCRETE_STAIRS = ITEMS.register("smooth_light_gray_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_CONCRETE_STAIRS.get(), dyeables())),
	SMOOTH_LIGHT_GRAY_CONCRETE_WALL = ITEMS.register("smooth_light_gray_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_CONCRETE_WALL.get(), dyeables())),
	SMOOTH_LIGHT_GRAY_CONCRETE_GATE = ITEMS.register("smooth_light_gray_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_CONCRETE_GATE.get(), dyeables())),

	// Concrete Bricks
	LIGHT_GRAY_CONCRETE_BRICKS = ITEMS.register("light_gray_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_BRICKS.get(), dyeables())),
	LIGHT_GRAY_CONCRETE_BRICK_SLAB = ITEMS.register("light_gray_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_BRICK_SLAB.get(), dyeables())),
	LIGHT_GRAY_CONCRETE_BRICK_STAIRS = ITEMS.register("light_gray_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_BRICK_STAIRS.get(), dyeables())),
	LIGHT_GRAY_CONCRETE_BRICK_WALL = ITEMS.register("light_gray_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_BRICK_WALL.get(), dyeables())),
	LIGHT_GRAY_CONCRETE_BRICK_GATE = ITEMS.register("light_gray_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_BRICK_GATE.get(), dyeables())),

	// Cut Concrete
	CUT_LIGHT_GRAY_CONCRETE = ITEMS.register("cut_light_gray_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_CONCRETE.get(), dyeables())),
	CUT_LIGHT_GRAY_CONCRETE_SLAB = ITEMS.register("cut_light_gray_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB.get(), dyeables())),
	CUT_LIGHT_GRAY_CONCRETE_STAIRS = ITEMS.register("cut_light_gray_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS.get(), dyeables())),
	CUT_LIGHT_GRAY_CONCRETE_WALL = ITEMS.register("cut_light_gray_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL.get(), dyeables())),
	CUT_LIGHT_GRAY_CONCRETE_GATE = ITEMS.register("cut_light_gray_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_CONCRETE_GATE.get(), dyeables())),

	// Concrete Tiles
	LIGHT_GRAY_CONCRETE_TILES = ITEMS.register("light_gray_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_TILES.get(), dyeables())),
	LIGHT_GRAY_CONCRETE_TILE_SLAB = ITEMS.register("light_gray_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_TILE_SLAB.get(), dyeables())),
	LIGHT_GRAY_CONCRETE_TILE_STAIRS = ITEMS.register("light_gray_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_TILE_STAIRS.get(), dyeables())),
	LIGHT_GRAY_CONCRETE_TILE_WALL = ITEMS.register("light_gray_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_TILE_WALL.get(), dyeables())),
	LIGHT_GRAY_CONCRETE_TILE_GATE = ITEMS.register("light_gray_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_TILE_GATE.get(), dyeables())),

	// Concrete Pillar
	LIGHT_GRAY_CONCRETE_PILLAR = ITEMS.register("light_gray_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_PILLAR.get(), dyeables())),
	LIGHT_GRAY_CONCRETE_CORNER_PILLAR = ITEMS.register("light_gray_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Concrete
	CHISELED_LIGHT_GRAY_CONCRETE = ITEMS.register("chiseled_light_gray_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_LIGHT_GRAY_CONCRETE.get(), dyeables())),

	// Carved Concrete
	CARVED_LIGHT_GRAY_CONCRETE = ITEMS.register("carved_light_gray_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_LIGHT_GRAY_CONCRETE.get(), dyeables())),


// GRAY CONCRETE

	// Base
	GRAY_CONCRETE_SLAB = ITEMS.register("gray_concrete_slab", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_SLAB.get(), dyeables())),
	GRAY_CONCRETE_STAIRS = ITEMS.register("gray_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_STAIRS.get(), dyeables())),
	GRAY_CONCRETE_WALL = ITEMS.register("gray_concrete_wall", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_WALL.get(), dyeables())),
	GRAY_CONCRETE_GATE = ITEMS.register("gray_concrete_gate", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_GATE.get(), dyeables())),

	// Polished Concrete
	POLISHED_GRAY_CONCRETE = ITEMS.register("polished_gray_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_CONCRETE.get(), dyeables())),
	POLISHED_GRAY_CONCRETE_SLAB = ITEMS.register("polished_gray_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_CONCRETE_SLAB.get(), dyeables())),
	POLISHED_GRAY_CONCRETE_STAIRS = ITEMS.register("polished_gray_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_CONCRETE_STAIRS.get(), dyeables())),
	POLISHED_GRAY_CONCRETE_WALL = ITEMS.register("polished_gray_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_CONCRETE_WALL.get(), dyeables())),
	POLISHED_GRAY_CONCRETE_GATE = ITEMS.register("polished_gray_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_CONCRETE_GATE.get(), dyeables())),

	// Smooth Concrete
	SMOOTH_GRAY_CONCRETE = ITEMS.register("smooth_gray_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_CONCRETE.get(), dyeables())),
	SMOOTH_GRAY_CONCRETE_SLAB = ITEMS.register("smooth_gray_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_CONCRETE_SLAB.get(), dyeables())),
	SMOOTH_GRAY_CONCRETE_STAIRS = ITEMS.register("smooth_gray_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_CONCRETE_STAIRS.get(), dyeables())),
	SMOOTH_GRAY_CONCRETE_WALL = ITEMS.register("smooth_gray_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_CONCRETE_WALL.get(), dyeables())),
	SMOOTH_GRAY_CONCRETE_GATE = ITEMS.register("smooth_gray_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_CONCRETE_GATE.get(), dyeables())),

	// Concrete Bricks
	GRAY_CONCRETE_BRICKS = ITEMS.register("gray_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_BRICKS.get(), dyeables())),
	GRAY_CONCRETE_BRICK_SLAB = ITEMS.register("gray_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_BRICK_SLAB.get(), dyeables())),
	GRAY_CONCRETE_BRICK_STAIRS = ITEMS.register("gray_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_BRICK_STAIRS.get(), dyeables())),
	GRAY_CONCRETE_BRICK_WALL = ITEMS.register("gray_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_BRICK_WALL.get(), dyeables())),
	GRAY_CONCRETE_BRICK_GATE = ITEMS.register("gray_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_BRICK_GATE.get(), dyeables())),

	// Cut Concrete
	CUT_GRAY_CONCRETE = ITEMS.register("cut_gray_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_CONCRETE.get(), dyeables())),
	CUT_GRAY_CONCRETE_SLAB = ITEMS.register("cut_gray_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_CONCRETE_SLAB.get(), dyeables())),
	CUT_GRAY_CONCRETE_STAIRS = ITEMS.register("cut_gray_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_CONCRETE_STAIRS.get(), dyeables())),
	CUT_GRAY_CONCRETE_WALL = ITEMS.register("cut_gray_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_CONCRETE_WALL.get(), dyeables())),
	CUT_GRAY_CONCRETE_GATE = ITEMS.register("cut_gray_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_CONCRETE_GATE.get(), dyeables())),

	// Concrete Tiles
	GRAY_CONCRETE_TILES = ITEMS.register("gray_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_TILES.get(), dyeables())),
	GRAY_CONCRETE_TILE_SLAB = ITEMS.register("gray_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_TILE_SLAB.get(), dyeables())),
	GRAY_CONCRETE_TILE_STAIRS = ITEMS.register("gray_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_TILE_STAIRS.get(), dyeables())),
	GRAY_CONCRETE_TILE_WALL = ITEMS.register("gray_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_TILE_WALL.get(), dyeables())),
	GRAY_CONCRETE_TILE_GATE = ITEMS.register("gray_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_TILE_GATE.get(), dyeables())),

	// Concrete Pillar
	GRAY_CONCRETE_PILLAR = ITEMS.register("gray_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_PILLAR.get(), dyeables())),
	GRAY_CONCRETE_CORNER_PILLAR = ITEMS.register("gray_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Concrete
	CHISELED_GRAY_CONCRETE = ITEMS.register("chiseled_gray_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_GRAY_CONCRETE.get(), dyeables())),

	// Carved Concrete
	CARVED_GRAY_CONCRETE = ITEMS.register("carved_gray_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_GRAY_CONCRETE.get(), dyeables())),


// BLACK CONCRETE

	// Base
	BLACK_CONCRETE_SLAB = ITEMS.register("black_concrete_slab", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_SLAB.get(), dyeables())),
	BLACK_CONCRETE_STAIRS = ITEMS.register("black_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_STAIRS.get(), dyeables())),
	BLACK_CONCRETE_WALL = ITEMS.register("black_concrete_wall", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_WALL.get(), dyeables())),
	BLACK_CONCRETE_GATE = ITEMS.register("black_concrete_gate", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_GATE.get(), dyeables())),

	// Polished Concrete
	POLISHED_BLACK_CONCRETE = ITEMS.register("polished_black_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_CONCRETE.get(), dyeables())),
	POLISHED_BLACK_CONCRETE_SLAB = ITEMS.register("polished_black_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_CONCRETE_SLAB.get(), dyeables())),
	POLISHED_BLACK_CONCRETE_STAIRS = ITEMS.register("polished_black_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_CONCRETE_STAIRS.get(), dyeables())),
	POLISHED_BLACK_CONCRETE_WALL = ITEMS.register("polished_black_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_CONCRETE_WALL.get(), dyeables())),
	POLISHED_BLACK_CONCRETE_GATE = ITEMS.register("polished_black_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_CONCRETE_GATE.get(), dyeables())),

	// Smooth Concrete
	SMOOTH_BLACK_CONCRETE = ITEMS.register("smooth_black_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_CONCRETE.get(), dyeables())),
	SMOOTH_BLACK_CONCRETE_SLAB = ITEMS.register("smooth_black_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_CONCRETE_SLAB.get(), dyeables())),
	SMOOTH_BLACK_CONCRETE_STAIRS = ITEMS.register("smooth_black_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_CONCRETE_STAIRS.get(), dyeables())),
	SMOOTH_BLACK_CONCRETE_WALL = ITEMS.register("smooth_black_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_CONCRETE_WALL.get(), dyeables())),
	SMOOTH_BLACK_CONCRETE_GATE = ITEMS.register("smooth_black_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_CONCRETE_GATE.get(), dyeables())),

	// Concrete Bricks
	BLACK_CONCRETE_BRICKS = ITEMS.register("black_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_BRICKS.get(), dyeables())),
	BLACK_CONCRETE_BRICK_SLAB = ITEMS.register("black_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_BRICK_SLAB.get(), dyeables())),
	BLACK_CONCRETE_BRICK_STAIRS = ITEMS.register("black_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_BRICK_STAIRS.get(), dyeables())),
	BLACK_CONCRETE_BRICK_WALL = ITEMS.register("black_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_BRICK_WALL.get(), dyeables())),
	BLACK_CONCRETE_BRICK_GATE = ITEMS.register("black_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_BRICK_GATE.get(), dyeables())),

	// Cut Concrete
	CUT_BLACK_CONCRETE = ITEMS.register("cut_black_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_CONCRETE.get(), dyeables())),
	CUT_BLACK_CONCRETE_SLAB = ITEMS.register("cut_black_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_CONCRETE_SLAB.get(), dyeables())),
	CUT_BLACK_CONCRETE_STAIRS = ITEMS.register("cut_black_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_CONCRETE_STAIRS.get(), dyeables())),
	CUT_BLACK_CONCRETE_WALL = ITEMS.register("cut_black_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_CONCRETE_WALL.get(), dyeables())),
	CUT_BLACK_CONCRETE_GATE = ITEMS.register("cut_black_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_CONCRETE_GATE.get(), dyeables())),

	// Concrete Tiles
	BLACK_CONCRETE_TILES = ITEMS.register("black_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_TILES.get(), dyeables())),
	BLACK_CONCRETE_TILE_SLAB = ITEMS.register("black_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_TILE_SLAB.get(), dyeables())),
	BLACK_CONCRETE_TILE_STAIRS = ITEMS.register("black_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_TILE_STAIRS.get(), dyeables())),
	BLACK_CONCRETE_TILE_WALL = ITEMS.register("black_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_TILE_WALL.get(), dyeables())),
	BLACK_CONCRETE_TILE_GATE = ITEMS.register("black_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_TILE_GATE.get(), dyeables())),

	// Concrete Pillar
	BLACK_CONCRETE_PILLAR = ITEMS.register("black_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_PILLAR.get(), dyeables())),
	BLACK_CONCRETE_CORNER_PILLAR = ITEMS.register("black_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Concrete
	CHISELED_BLACK_CONCRETE = ITEMS.register("chiseled_black_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_BLACK_CONCRETE.get(), dyeables())),

	// Carved Concrete
	CARVED_BLACK_CONCRETE = ITEMS.register("carved_black_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_BLACK_CONCRETE.get(), dyeables())),


// BROWN CONCRETE

	// Base
	BROWN_CONCRETE_SLAB = ITEMS.register("brown_concrete_slab", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_SLAB.get(), dyeables())),
	BROWN_CONCRETE_STAIRS = ITEMS.register("brown_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_STAIRS.get(), dyeables())),
	BROWN_CONCRETE_WALL = ITEMS.register("brown_concrete_wall", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_WALL.get(), dyeables())),
	BROWN_CONCRETE_GATE = ITEMS.register("brown_concrete_gate", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_GATE.get(), dyeables())),

	// Polished Concrete
	POLISHED_BROWN_CONCRETE = ITEMS.register("polished_brown_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_CONCRETE.get(), dyeables())),
	POLISHED_BROWN_CONCRETE_SLAB = ITEMS.register("polished_brown_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_CONCRETE_SLAB.get(), dyeables())),
	POLISHED_BROWN_CONCRETE_STAIRS = ITEMS.register("polished_brown_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_CONCRETE_STAIRS.get(), dyeables())),
	POLISHED_BROWN_CONCRETE_WALL = ITEMS.register("polished_brown_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_CONCRETE_WALL.get(), dyeables())),
	POLISHED_BROWN_CONCRETE_GATE = ITEMS.register("polished_brown_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_CONCRETE_GATE.get(), dyeables())),

	// Smooth Concrete
	SMOOTH_BROWN_CONCRETE = ITEMS.register("smooth_brown_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_CONCRETE.get(), dyeables())),
	SMOOTH_BROWN_CONCRETE_SLAB = ITEMS.register("smooth_brown_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_CONCRETE_SLAB.get(), dyeables())),
	SMOOTH_BROWN_CONCRETE_STAIRS = ITEMS.register("smooth_brown_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_CONCRETE_STAIRS.get(), dyeables())),
	SMOOTH_BROWN_CONCRETE_WALL = ITEMS.register("smooth_brown_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_CONCRETE_WALL.get(), dyeables())),
	SMOOTH_BROWN_CONCRETE_GATE = ITEMS.register("smooth_brown_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_CONCRETE_GATE.get(), dyeables())),

	// Concrete Bricks
	BROWN_CONCRETE_BRICKS = ITEMS.register("brown_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_BRICKS.get(), dyeables())),
	BROWN_CONCRETE_BRICK_SLAB = ITEMS.register("brown_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_BRICK_SLAB.get(), dyeables())),
	BROWN_CONCRETE_BRICK_STAIRS = ITEMS.register("brown_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_BRICK_STAIRS.get(), dyeables())),
	BROWN_CONCRETE_BRICK_WALL = ITEMS.register("brown_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_BRICK_WALL.get(), dyeables())),
	BROWN_CONCRETE_BRICK_GATE = ITEMS.register("brown_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_BRICK_GATE.get(), dyeables())),

	// Cut Concrete
	CUT_BROWN_CONCRETE = ITEMS.register("cut_brown_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_CONCRETE.get(), dyeables())),
	CUT_BROWN_CONCRETE_SLAB = ITEMS.register("cut_brown_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_CONCRETE_SLAB.get(), dyeables())),
	CUT_BROWN_CONCRETE_STAIRS = ITEMS.register("cut_brown_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_CONCRETE_STAIRS.get(), dyeables())),
	CUT_BROWN_CONCRETE_WALL = ITEMS.register("cut_brown_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_CONCRETE_WALL.get(), dyeables())),
	CUT_BROWN_CONCRETE_GATE = ITEMS.register("cut_brown_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_CONCRETE_GATE.get(), dyeables())),

	// Concrete Tiles
	BROWN_CONCRETE_TILES = ITEMS.register("brown_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_TILES.get(), dyeables())),
	BROWN_CONCRETE_TILE_SLAB = ITEMS.register("brown_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_TILE_SLAB.get(), dyeables())),
	BROWN_CONCRETE_TILE_STAIRS = ITEMS.register("brown_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_TILE_STAIRS.get(), dyeables())),
	BROWN_CONCRETE_TILE_WALL = ITEMS.register("brown_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_TILE_WALL.get(), dyeables())),
	BROWN_CONCRETE_TILE_GATE = ITEMS.register("brown_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_TILE_GATE.get(), dyeables())),

	// Concrete Pillar
	BROWN_CONCRETE_PILLAR = ITEMS.register("brown_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_PILLAR.get(), dyeables())),
	BROWN_CONCRETE_CORNER_PILLAR = ITEMS.register("brown_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_CORNER_PILLAR.get(), dyeables())),

	// Chiseled Concrete
	CHISELED_BROWN_CONCRETE = ITEMS.register("chiseled_brown_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_BROWN_CONCRETE.get(), dyeables())),

	// Carved Concrete
	CARVED_BROWN_CONCRETE = ITEMS.register("carved_brown_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_BROWN_CONCRETE.get(), dyeables())),


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
	RED_TINTED_GLASS = ITEMS.register("red_tinted_glass", () ->
            new BlockItem(RED_TINTED_GLASS_BLOCK.get(), dyeables())),

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
	ORANGE_TINTED_GLASS = ITEMS.register("orange_tinted_glass", () ->
            new BlockItem(ORANGE_TINTED_GLASS_BLOCK.get(), dyeables())),

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
	YELLOW_TINTED_GLASS = ITEMS.register("yellow_tinted_glass", () ->
            new BlockItem(YELLOW_TINTED_GLASS_BLOCK.get(), dyeables())),

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
	LIME_TINTED_GLASS = ITEMS.register("lime_tinted_glass", () ->
            new BlockItem(LIME_TINTED_GLASS_BLOCK.get(), dyeables())),

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
	GREEN_TINTED_GLASS = ITEMS.register("green_tinted_glass", () ->
            new BlockItem(GREEN_TINTED_GLASS_BLOCK.get(), dyeables())),

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
	BLUE_TINTED_GLASS = ITEMS.register("blue_tinted_glass", () ->
            new BlockItem(BLUE_TINTED_GLASS_BLOCK.get(), dyeables())),

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
	CYAN_TINTED_GLASS = ITEMS.register("cyan_tinted_glass", () ->
            new BlockItem(CYAN_TINTED_GLASS_BLOCK.get(), dyeables())),

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
	LIGHT_BLUE_TINTED_GLASS = ITEMS.register("light_blue_tinted_glass", () ->
            new BlockItem(LIGHT_BLUE_TINTED_GLASS_BLOCK.get(), dyeables())),

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
	PURPLE_TINTED_GLASS = ITEMS.register("purple_tinted_glass", () ->
            new BlockItem(PURPLE_TINTED_GLASS_BLOCK.get(), dyeables())),

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
	MAGENTA_TINTED_GLASS = ITEMS.register("magenta_tinted_glass", () ->
            new BlockItem(MAGENTA_TINTED_GLASS_BLOCK.get(), dyeables())),

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
	PINK_TINTED_GLASS = ITEMS.register("pink_tinted_glass", () ->
            new BlockItem(PINK_TINTED_GLASS_BLOCK.get(), dyeables())),

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
	WHITE_TINTED_GLASS = ITEMS.register("white_tinted_glass", () ->
            new BlockItem(WHITE_TINTED_GLASS_BLOCK.get(), dyeables())),

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
	LIGHT_GRAY_TINTED_GLASS = ITEMS.register("light_gray_tinted_glass", () ->
            new BlockItem(LIGHT_GRAY_TINTED_GLASS_BLOCK.get(), dyeables())),

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
	GRAY_TINTED_GLASS = ITEMS.register("gray_tinted_glass", () ->
            new BlockItem(GRAY_TINTED_GLASS_BLOCK.get(), dyeables())),

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
	BLACK_TINTED_GLASS = ITEMS.register("black_tinted_glass", () ->
            new BlockItem(BLACK_TINTED_GLASS_BLOCK.get(), dyeables())),

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
	BROWN_TINTED_GLASS = ITEMS.register("brown_tinted_glass", () ->
            new BlockItem(BROWN_TINTED_GLASS_BLOCK.get(), dyeables())),

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
	GLOWSTONE_SLAB = ITEMS.register("glowstone_slab", () ->
            new BlockItem(CPlusBlocks.GLOWSTONE_SLAB.get(), dyeables())),
	GLOWSTONE_STAIRS = ITEMS.register("glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.GLOWSTONE_STAIRS.get(), dyeables())),
	GLOWSTONE_WALL = ITEMS.register("glowstone_wall", () ->
            new BlockItem(CPlusBlocks.GLOWSTONE_WALL.get(), dyeables())),
	GLOWSTONE_GATE = ITEMS.register("glowstone_gate", () ->
            new BlockItem(CPlusBlocks.GLOWSTONE_GATE.get(), dyeables())),

	// Red
	RED_GLOWSTONE = ITEMS.register("red_glowstone", () ->
            new BlockItem(CPlusBlocks.RED_GLOWSTONE.get(), dyeables())),
	RED_GLOWSTONE_SLAB = ITEMS.register("red_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.RED_GLOWSTONE_SLAB.get(), dyeables())),
	RED_GLOWSTONE_STAIRS = ITEMS.register("red_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.RED_GLOWSTONE_STAIRS.get(), dyeables())),
	RED_GLOWSTONE_WALL = ITEMS.register("red_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.RED_GLOWSTONE_WALL.get(), dyeables())),
	RED_GLOWSTONE_GATE = ITEMS.register("red_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.RED_GLOWSTONE_GATE.get(), dyeables())),

	// Orange
	ORANGE_GLOWSTONE = ITEMS.register("orange_glowstone", () ->
            new BlockItem(CPlusBlocks.ORANGE_GLOWSTONE.get(), dyeables())),
	ORANGE_GLOWSTONE_SLAB = ITEMS.register("orange_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.ORANGE_GLOWSTONE_SLAB.get(), dyeables())),
	ORANGE_GLOWSTONE_STAIRS = ITEMS.register("orange_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.ORANGE_GLOWSTONE_STAIRS.get(), dyeables())),
	ORANGE_GLOWSTONE_WALL = ITEMS.register("orange_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.ORANGE_GLOWSTONE_WALL.get(), dyeables())),
	ORANGE_GLOWSTONE_GATE = ITEMS.register("orange_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.ORANGE_GLOWSTONE_GATE.get(), dyeables())),

	// Yellow
	YELLOW_GLOWSTONE = ITEMS.register("yellow_glowstone", () ->
            new BlockItem(CPlusBlocks.YELLOW_GLOWSTONE.get(), dyeables())),
	YELLOW_GLOWSTONE_SLAB = ITEMS.register("yellow_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.YELLOW_GLOWSTONE_SLAB.get(), dyeables())),
	YELLOW_GLOWSTONE_STAIRS = ITEMS.register("yellow_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.YELLOW_GLOWSTONE_STAIRS.get(), dyeables())),
	YELLOW_GLOWSTONE_WALL = ITEMS.register("yellow_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.YELLOW_GLOWSTONE_WALL.get(), dyeables())),
	YELLOW_GLOWSTONE_GATE = ITEMS.register("yellow_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.YELLOW_GLOWSTONE_GATE.get(), dyeables())),

	// Lime
	LIME_GLOWSTONE = ITEMS.register("lime_glowstone", () ->
            new BlockItem(CPlusBlocks.LIME_GLOWSTONE.get(), dyeables())),
	LIME_GLOWSTONE_SLAB = ITEMS.register("lime_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.LIME_GLOWSTONE_SLAB.get(), dyeables())),
	LIME_GLOWSTONE_STAIRS = ITEMS.register("lime_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.LIME_GLOWSTONE_STAIRS.get(), dyeables())),
	LIME_GLOWSTONE_WALL = ITEMS.register("lime_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.LIME_GLOWSTONE_WALL.get(), dyeables())),
	LIME_GLOWSTONE_GATE = ITEMS.register("lime_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.LIME_GLOWSTONE_GATE.get(), dyeables())),

	// Green
	GREEN_GLOWSTONE = ITEMS.register("green_glowstone", () ->
            new BlockItem(CPlusBlocks.GREEN_GLOWSTONE.get(), dyeables())),
	GREEN_GLOWSTONE_SLAB = ITEMS.register("green_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.GREEN_GLOWSTONE_SLAB.get(), dyeables())),
	GREEN_GLOWSTONE_STAIRS = ITEMS.register("green_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.GREEN_GLOWSTONE_STAIRS.get(), dyeables())),
	GREEN_GLOWSTONE_WALL = ITEMS.register("green_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.GREEN_GLOWSTONE_WALL.get(), dyeables())),
	GREEN_GLOWSTONE_GATE = ITEMS.register("green_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.GREEN_GLOWSTONE_GATE.get(), dyeables())),

	// Blue
	BLUE_GLOWSTONE = ITEMS.register("blue_glowstone", () ->
            new BlockItem(CPlusBlocks.BLUE_GLOWSTONE.get(), dyeables())),
	BLUE_GLOWSTONE_SLAB = ITEMS.register("blue_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_GLOWSTONE_SLAB.get(), dyeables())),
	BLUE_GLOWSTONE_STAIRS = ITEMS.register("blue_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_GLOWSTONE_STAIRS.get(), dyeables())),
	BLUE_GLOWSTONE_WALL = ITEMS.register("blue_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_GLOWSTONE_WALL.get(), dyeables())),
	BLUE_GLOWSTONE_GATE = ITEMS.register("blue_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_GLOWSTONE_GATE.get(), dyeables())),

	// Cyan
	CYAN_GLOWSTONE = ITEMS.register("cyan_glowstone", () ->
            new BlockItem(CPlusBlocks.CYAN_GLOWSTONE.get(), dyeables())),
	CYAN_GLOWSTONE_SLAB = ITEMS.register("cyan_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.CYAN_GLOWSTONE_SLAB.get(), dyeables())),
	CYAN_GLOWSTONE_STAIRS = ITEMS.register("cyan_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.CYAN_GLOWSTONE_STAIRS.get(), dyeables())),
	CYAN_GLOWSTONE_WALL = ITEMS.register("cyan_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.CYAN_GLOWSTONE_WALL.get(), dyeables())),
	CYAN_GLOWSTONE_GATE = ITEMS.register("cyan_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.CYAN_GLOWSTONE_GATE.get(), dyeables())),

	// Light Blue
	LIGHT_BLUE_GLOWSTONE = ITEMS.register("light_blue_glowstone", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_GLOWSTONE.get(), dyeables())),
	LIGHT_BLUE_GLOWSTONE_SLAB = ITEMS.register("light_blue_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_GLOWSTONE_SLAB.get(), dyeables())),
	LIGHT_BLUE_GLOWSTONE_STAIRS = ITEMS.register("light_blue_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_GLOWSTONE_STAIRS.get(), dyeables())),
	LIGHT_BLUE_GLOWSTONE_WALL = ITEMS.register("light_blue_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_GLOWSTONE_WALL.get(), dyeables())),
	LIGHT_BLUE_GLOWSTONE_GATE = ITEMS.register("light_blue_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_GLOWSTONE_GATE.get(), dyeables())),

	// Purple
	PURPLE_GLOWSTONE = ITEMS.register("purple_glowstone", () ->
            new BlockItem(CPlusBlocks.PURPLE_GLOWSTONE.get(), dyeables())),
	PURPLE_GLOWSTONE_SLAB = ITEMS.register("purple_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.PURPLE_GLOWSTONE_SLAB.get(), dyeables())),
	PURPLE_GLOWSTONE_STAIRS = ITEMS.register("purple_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.PURPLE_GLOWSTONE_STAIRS.get(), dyeables())),
	PURPLE_GLOWSTONE_WALL = ITEMS.register("purple_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.PURPLE_GLOWSTONE_WALL.get(), dyeables())),
	PURPLE_GLOWSTONE_GATE = ITEMS.register("purple_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.PURPLE_GLOWSTONE_GATE.get(), dyeables())),

	// Magenta
	MAGENTA_GLOWSTONE = ITEMS.register("magenta_glowstone", () ->
            new BlockItem(CPlusBlocks.MAGENTA_GLOWSTONE.get(), dyeables())),
	MAGENTA_GLOWSTONE_SLAB = ITEMS.register("magenta_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.MAGENTA_GLOWSTONE_SLAB.get(), dyeables())),
	MAGENTA_GLOWSTONE_STAIRS = ITEMS.register("magenta_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.MAGENTA_GLOWSTONE_STAIRS.get(), dyeables())),
	MAGENTA_GLOWSTONE_WALL = ITEMS.register("magenta_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.MAGENTA_GLOWSTONE_WALL.get(), dyeables())),
	MAGENTA_GLOWSTONE_GATE = ITEMS.register("magenta_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.MAGENTA_GLOWSTONE_GATE.get(), dyeables())),

	// Pink
	PINK_GLOWSTONE = ITEMS.register("pink_glowstone", () ->
            new BlockItem(CPlusBlocks.PINK_GLOWSTONE.get(), dyeables())),
	PINK_GLOWSTONE_SLAB = ITEMS.register("pink_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.PINK_GLOWSTONE_SLAB.get(), dyeables())),
	PINK_GLOWSTONE_STAIRS = ITEMS.register("pink_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.PINK_GLOWSTONE_STAIRS.get(), dyeables())),
	PINK_GLOWSTONE_WALL = ITEMS.register("pink_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.PINK_GLOWSTONE_WALL.get(), dyeables())),
	PINK_GLOWSTONE_GATE = ITEMS.register("pink_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.PINK_GLOWSTONE_GATE.get(), dyeables())),

	// White
	WHITE_GLOWSTONE = ITEMS.register("white_glowstone", () ->
            new BlockItem(CPlusBlocks.WHITE_GLOWSTONE.get(), dyeables())),
	WHITE_GLOWSTONE_SLAB = ITEMS.register("white_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.WHITE_GLOWSTONE_SLAB.get(), dyeables())),
	WHITE_GLOWSTONE_STAIRS = ITEMS.register("white_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.WHITE_GLOWSTONE_STAIRS.get(), dyeables())),
	WHITE_GLOWSTONE_WALL = ITEMS.register("white_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.WHITE_GLOWSTONE_WALL.get(), dyeables())),
	WHITE_GLOWSTONE_GATE = ITEMS.register("white_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.WHITE_GLOWSTONE_GATE.get(), dyeables())),

	// Light Gray
	LIGHT_GRAY_GLOWSTONE = ITEMS.register("light_gray_glowstone", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_GLOWSTONE.get(), dyeables())),
	LIGHT_GRAY_GLOWSTONE_SLAB = ITEMS.register("light_gray_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_GLOWSTONE_SLAB.get(), dyeables())),
	LIGHT_GRAY_GLOWSTONE_STAIRS = ITEMS.register("light_gray_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_GLOWSTONE_STAIRS.get(), dyeables())),
	LIGHT_GRAY_GLOWSTONE_WALL = ITEMS.register("light_gray_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_GLOWSTONE_WALL.get(), dyeables())),
	LIGHT_GRAY_GLOWSTONE_GATE = ITEMS.register("light_gray_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_GLOWSTONE_GATE.get(), dyeables())),

	// Gary :snail:
	GRAY_GLOWSTONE = ITEMS.register("gray_glowstone", () ->
            new BlockItem(CPlusBlocks.GRAY_GLOWSTONE.get(), dyeables())),
	GRAY_GLOWSTONE_SLAB = ITEMS.register("gray_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.GRAY_GLOWSTONE_SLAB.get(), dyeables())),
	GRAY_GLOWSTONE_WALL = ITEMS.register("gray_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.GRAY_GLOWSTONE_WALL.get(), dyeables())),
	GRAY_GLOWSTONE_STAIRS = ITEMS.register("gray_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.GRAY_GLOWSTONE_STAIRS.get(), dyeables())),
	GRAY_GLOWSTONE_GATE = ITEMS.register("gray_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.GRAY_GLOWSTONE_GATE.get(), dyeables())),

	// Black
	BLACK_GLOWSTONE = ITEMS.register("black_glowstone", () ->
            new BlockItem(CPlusBlocks.BLACK_GLOWSTONE.get(), dyeables())),
	BLACK_GLOWSTONE_SLAB = ITEMS.register("black_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.BLACK_GLOWSTONE_SLAB.get(), dyeables())),
	BLACK_GLOWSTONE_STAIRS = ITEMS.register("black_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.BLACK_GLOWSTONE_STAIRS.get(), dyeables())),
	BLACK_GLOWSTONE_WALL = ITEMS.register("black_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.BLACK_GLOWSTONE_WALL.get(), dyeables())),
	BLACK_GLOWSTONE_GATE = ITEMS.register("black_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.BLACK_GLOWSTONE_GATE.get(), dyeables())),

	// Brown
	BROWN_GLOWSTONE = ITEMS.register("brown_glowstone", () ->
            new BlockItem(CPlusBlocks.BROWN_GLOWSTONE.get(), dyeables())),
	BROWN_GLOWSTONE_SLAB = ITEMS.register("brown_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.BROWN_GLOWSTONE_SLAB.get(), dyeables())),
	BROWN_GLOWSTONE_STAIRS = ITEMS.register("brown_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.BROWN_GLOWSTONE_STAIRS.get(), dyeables())),
	BROWN_GLOWSTONE_WALL = ITEMS.register("brown_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.BROWN_GLOWSTONE_WALL.get(), dyeables())),
	BROWN_GLOWSTONE_GATE = ITEMS.register("brown_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.BROWN_GLOWSTONE_GATE.get(), dyeables())),

	// Soul
	SOUL_GLOWSTONE = ITEMS.register("soul_glowstone", () ->
            new BlockItem(CPlusBlocks.SOUL_GLOWSTONE.get(), dyeables())),
	SOUL_GLOWSTONE_SLAB = ITEMS.register("soul_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_SLAB.get(), dyeables())),
	SOUL_GLOWSTONE_STAIRS = ITEMS.register("soul_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_STAIRS.get(), dyeables())),
	SOUL_GLOWSTONE_WALL = ITEMS.register("soul_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_WALL.get(), dyeables())),
	SOUL_GLOWSTONE_GATE = ITEMS.register("soul_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_GATE.get(), dyeables())),


// ICE

	// Red
    RED_ICE = ITEMS.register("red_ice", () ->
            new BlockItem(CPlusBlocks.RED_ICE.get(), dyeables())),
	RED_ICE_SLAB = ITEMS.register("red_ice_slab", () ->
            new BlockItem(CPlusBlocks.RED_ICE_SLAB.get(), dyeables())),
	RED_ICE_STAIRS = ITEMS.register("red_ice_stairs", () ->
            new BlockItem(CPlusBlocks.RED_ICE_STAIRS.get(), dyeables())),
	RED_ICE_WALL = ITEMS.register("red_ice_wall", () ->
            new BlockItem(CPlusBlocks.RED_ICE_WALL.get(), dyeables())),
	RED_ICE_GATE = ITEMS.register("red_ice_gate", () ->
            new BlockItem(CPlusBlocks.RED_ICE_GATE.get(), dyeables())),

	// Orange
	ORANGE_ICE = ITEMS.register("orange_ice", () ->
            new BlockItem(CPlusBlocks.ORANGE_ICE.get(), dyeables())),
	ORANGE_ICE_SLAB = ITEMS.register("orange_ice_slab", () ->
            new BlockItem(CPlusBlocks.ORANGE_ICE_SLAB.get(), dyeables())),
	ORANGE_ICE_STAIRS = ITEMS.register("orange_ice_stairs", () ->
            new BlockItem(CPlusBlocks.ORANGE_ICE_STAIRS.get(), dyeables())),
	ORANGE_ICE_WALL = ITEMS.register("orange_ice_wall", () ->
            new BlockItem(CPlusBlocks.ORANGE_ICE_WALL.get(), dyeables())),
	ORANGE_ICE_GATE = ITEMS.register("orange_ice_gate", () ->
            new BlockItem(CPlusBlocks.ORANGE_ICE_GATE.get(), dyeables())),

	// Yellow
	YELLOW_ICE = ITEMS.register("yellow_ice", () ->
            new BlockItem(CPlusBlocks.YELLOW_ICE.get(), dyeables())),
	YELLOW_ICE_SLAB = ITEMS.register("yellow_ice_slab", () ->
            new BlockItem(CPlusBlocks.YELLOW_ICE_SLAB.get(), dyeables())),
	YELLOW_ICE_STAIRS = ITEMS.register("yellow_ice_stairs", () ->
            new BlockItem(CPlusBlocks.YELLOW_ICE_STAIRS.get(), dyeables())),
	YELLOW_ICE_WALL = ITEMS.register("yellow_ice_wall", () ->
            new BlockItem(CPlusBlocks.YELLOW_ICE_WALL.get(), dyeables())),
	YELLOW_ICE_GATE = ITEMS.register("yellow_ice_gate", () ->
            new BlockItem(CPlusBlocks.YELLOW_ICE_GATE.get(), dyeables())),

	// Lime
	LIME_ICE = ITEMS.register("lime_ice", () ->
            new BlockItem(CPlusBlocks.LIME_ICE.get(), dyeables())),
	LIME_ICE_SLAB = ITEMS.register("lime_ice_slab", () ->
            new BlockItem(CPlusBlocks.LIME_ICE_SLAB.get(), dyeables())),
	LIME_ICE_STAIRS = ITEMS.register("lime_ice_stairs", () ->
            new BlockItem(CPlusBlocks.LIME_ICE_STAIRS.get(), dyeables())),
	LIME_ICE_WALL = ITEMS.register("lime_ice_wall", () ->
            new BlockItem(CPlusBlocks.LIME_ICE_WALL.get(), dyeables())),
	LIME_ICE_GATE = ITEMS.register("lime_ice_gate", () ->
            new BlockItem(CPlusBlocks.LIME_ICE_GATE.get(), dyeables())),

	// Green
	GREEN_ICE = ITEMS.register("green_ice", () ->
            new BlockItem(CPlusBlocks.GREEN_ICE.get(), dyeables())),
	GREEN_ICE_SLAB = ITEMS.register("green_ice_slab", () ->
            new BlockItem(CPlusBlocks.GREEN_ICE_SLAB.get(), dyeables())),
	GREEN_ICE_STAIRS = ITEMS.register("green_ice_stairs", () ->
            new BlockItem(CPlusBlocks.GREEN_ICE_STAIRS.get(), dyeables())),
	GREEN_ICE_WALL = ITEMS.register("green_ice_wall", () ->
            new BlockItem(CPlusBlocks.GREEN_ICE_WALL.get(), dyeables())),
	GREEN_ICE_GATE = ITEMS.register("green_ice_gate", () ->
            new BlockItem(CPlusBlocks.GREEN_ICE_GATE.get(), dyeables())),

	// Blue
	BLUE_ICE_SLAB = ITEMS.register("blue_ice_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_ICE_SLAB.get(), dyeables())),
	BLUE_ICE_STAIRS = ITEMS.register("blue_ice_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_ICE_STAIRS.get(), dyeables())),
	BLUE_ICE_WALL = ITEMS.register("blue_ice_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_ICE_WALL.get(), dyeables())),
	BLUE_ICE_GATE = ITEMS.register("blue_ice_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_ICE_GATE.get(), dyeables())),

	// Cyan
	CYAN_ICE = ITEMS.register("cyan_ice", () ->
            new BlockItem(CPlusBlocks.CYAN_ICE.get(), dyeables())),
	CYAN_ICE_SLAB = ITEMS.register("cyan_ice_slab", () ->
            new BlockItem(CPlusBlocks.CYAN_ICE_SLAB.get(), dyeables())),
	CYAN_ICE_STAIRS = ITEMS.register("cyan_ice_stairs", () ->
            new BlockItem(CPlusBlocks.CYAN_ICE_STAIRS.get(), dyeables())),
	CYAN_ICE_WALL = ITEMS.register("cyan_ice_wall", () ->
            new BlockItem(CPlusBlocks.CYAN_ICE_WALL.get(), dyeables())),
	CYAN_ICE_GATE = ITEMS.register("cyan_ice_gate", () ->
            new BlockItem(CPlusBlocks.CYAN_ICE_GATE.get(), dyeables())),

	// Light Blue
	LIGHT_BLUE_ICE = ITEMS.register("light_blue_ice", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE.get(), dyeables())),
	LIGHT_BLUE_ICE_SLAB = ITEMS.register("light_blue_ice_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE_SLAB.get(), dyeables())),
	LIGHT_BLUE_ICE_STAIRS = ITEMS.register("light_blue_ice_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE_STAIRS.get(), dyeables())),
	LIGHT_BLUE_ICE_WALL = ITEMS.register("light_blue_ice_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE_WALL.get(), dyeables())),
	LIGHT_BLUE_ICE_GATE = ITEMS.register("light_blue_ice_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE_GATE.get(), dyeables())),

	// Purple
	PURPLE_ICE = ITEMS.register("purple_ice", () ->
            new BlockItem(CPlusBlocks.PURPLE_ICE.get(), dyeables())),
	PURPLE_ICE_SLAB = ITEMS.register("purple_ice_slab", () ->
            new BlockItem(CPlusBlocks.PURPLE_ICE_SLAB.get(), dyeables())),
	PURPLE_ICE_STAIRS = ITEMS.register("purple_ice_stairs", () ->
            new BlockItem(CPlusBlocks.PURPLE_ICE_STAIRS.get(), dyeables())),
	PURPLE_ICE_WALL = ITEMS.register("purple_ice_wall", () ->
            new BlockItem(CPlusBlocks.PURPLE_ICE_WALL.get(), dyeables())),
	PURPLE_ICE_GATE = ITEMS.register("purple_ice_gate", () ->
            new BlockItem(CPlusBlocks.PURPLE_ICE_GATE.get(), dyeables())),

	// Magenta
	MAGENTA_ICE = ITEMS.register("magenta_ice", () ->
            new BlockItem(CPlusBlocks.MAGENTA_ICE.get(), dyeables())),
	MAGENTA_ICE_SLAB = ITEMS.register("magenta_ice_slab", () ->
            new BlockItem(CPlusBlocks.MAGENTA_ICE_SLAB.get(), dyeables())),
	MAGENTA_ICE_STAIRS = ITEMS.register("magenta_ice_stairs", () ->
            new BlockItem(CPlusBlocks.MAGENTA_ICE_STAIRS.get(), dyeables())),
	MAGENTA_ICE_WALL = ITEMS.register("magenta_ice_wall", () ->
            new BlockItem(CPlusBlocks.MAGENTA_ICE_WALL.get(), dyeables())),
	MAGENTA_ICE_GATE = ITEMS.register("magenta_ice_gate", () ->
            new BlockItem(CPlusBlocks.MAGENTA_ICE_GATE.get(), dyeables())),

	// Pink
	PINK_ICE = ITEMS.register("pink_ice", () ->
            new BlockItem(CPlusBlocks.PINK_ICE.get(), dyeables())),
	PINK_ICE_SLAB = ITEMS.register("pink_ice_slab", () ->
            new BlockItem(CPlusBlocks.PINK_ICE_SLAB.get(), dyeables())),
	PINK_ICE_STAIRS = ITEMS.register("pink_ice_stairs", () ->
            new BlockItem(CPlusBlocks.PINK_ICE_STAIRS.get(), dyeables())),
	PINK_ICE_WALL = ITEMS.register("pink_ice_wall", () ->
            new BlockItem(CPlusBlocks.PINK_ICE_WALL.get(), dyeables())),
	PINK_ICE_GATE = ITEMS.register("pink_ice_gate", () ->
            new BlockItem(CPlusBlocks.PINK_ICE_GATE.get(), dyeables())),

	// White
	WHITE_ICE = ITEMS.register("white_ice", () ->
            new BlockItem(CPlusBlocks.WHITE_ICE.get(), dyeables())),
	WHITE_ICE_SLAB = ITEMS.register("white_ice_slab", () ->
            new BlockItem(CPlusBlocks.WHITE_ICE_SLAB.get(), dyeables())),
	WHITE_ICE_STAIRS = ITEMS.register("white_ice_stairs", () ->
            new BlockItem(CPlusBlocks.WHITE_ICE_STAIRS.get(), dyeables())),
	WHITE_ICE_WALL = ITEMS.register("white_ice_wall", () ->
            new BlockItem(CPlusBlocks.WHITE_ICE_WALL.get(), dyeables())),
	WHITE_ICE_GATE = ITEMS.register("white_ice_gate", () ->
            new BlockItem(CPlusBlocks.WHITE_ICE_GATE.get(), dyeables())),

	// Light Gray
	LIGHT_GRAY_ICE = ITEMS.register("light_gray_ice", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE.get(), dyeables())),
	LIGHT_GRAY_ICE_SLAB = ITEMS.register("light_gray_ice_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE_SLAB.get(), dyeables())),
	LIGHT_GRAY_ICE_STAIRS = ITEMS.register("light_gray_ice_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE_STAIRS.get(), dyeables())),
	LIGHT_GRAY_ICE_WALL = ITEMS.register("light_gray_ice_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE_WALL.get(), dyeables())),
	LIGHT_GRAY_ICE_GATE = ITEMS.register("light_gray_ice_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE_GATE.get(), dyeables())),

	// Gray
	GRAY_ICE = ITEMS.register("gray_ice", () ->
            new BlockItem(CPlusBlocks.GRAY_ICE.get(), dyeables())),
	GRAY_ICE_SLAB = ITEMS.register("gray_ice_slab", () ->
            new BlockItem(CPlusBlocks.GRAY_ICE_SLAB.get(), dyeables())),
	GRAY_ICE_STAIRS = ITEMS.register("gray_ice_stairs", () ->
            new BlockItem(CPlusBlocks.GRAY_ICE_STAIRS.get(), dyeables())),
	GRAY_ICE_WALL = ITEMS.register("gray_ice_wall", () ->
            new BlockItem(CPlusBlocks.GRAY_ICE_WALL.get(), dyeables())),
	GRAY_ICE_GATE = ITEMS.register("gray_ice_gate", () ->
            new BlockItem(CPlusBlocks.GRAY_ICE_GATE.get(), dyeables())),

	// Black
	BLACK_ICE = ITEMS.register("black_ice", () ->
            new BlockItem(CPlusBlocks.BLACK_ICE.get(), dyeables())),
	BLACK_ICE_SLAB = ITEMS.register("black_ice_slab", () ->
            new BlockItem(CPlusBlocks.BLACK_ICE_SLAB.get(), dyeables())),
	BLACK_ICE_STAIRS = ITEMS.register("black_ice_stairs", () ->
            new BlockItem(CPlusBlocks.BLACK_ICE_STAIRS.get(), dyeables())),
	BLACK_ICE_WALL = ITEMS.register("black_ice_wall", () ->
            new BlockItem(CPlusBlocks.BLACK_ICE_WALL.get(), dyeables())),
	BLACK_ICE_GATE = ITEMS.register("black_ice_gate", () ->
            new BlockItem(CPlusBlocks.BLACK_ICE_GATE.get(), dyeables())),

	// Brown
	BROWN_ICE = ITEMS.register("brown_ice", () ->
            new BlockItem(CPlusBlocks.BROWN_ICE.get(), dyeables())),
	BROWN_ICE_SLAB = ITEMS.register("brown_ice_slab", () ->
            new BlockItem(CPlusBlocks.BROWN_ICE_SLAB.get(), dyeables())),
	BROWN_ICE_STAIRS = ITEMS.register("brown_ice_stairs", () ->
            new BlockItem(CPlusBlocks.BROWN_ICE_STAIRS.get(), dyeables())),
	BROWN_ICE_WALL = ITEMS.register("brown_ice_wall", () ->
            new BlockItem(CPlusBlocks.BROWN_ICE_WALL.get(), dyeables())),
	BROWN_ICE_GATE = ITEMS.register("brown_ice_gate", () ->
            new BlockItem(CPlusBlocks.BROWN_ICE_GATE.get(), dyeables())),

	// Soul
	SOUL_ICE = ITEMS.register("soul_ice", () ->
            new BlockItem(CPlusBlocks.SOUL_ICE.get(), dyeables())),
    SOUL_ICE_SLAB = ITEMS.register("soul_ice_slab", () ->
            new BlockItem(CPlusBlocks.SOUL_ICE_SLAB.get(), dyeables())),
    SOUL_ICE_STAIRS = ITEMS.register("soul_ice_stairs", () ->
            new BlockItem(CPlusBlocks.SOUL_ICE_STAIRS.get(), dyeables())),
    SOUL_ICE_WALL = ITEMS.register("soul_ice_wall", () ->
            new BlockItem(CPlusBlocks.SOUL_ICE_WALL.get(), dyeables())),
    SOUL_ICE_GATE = ITEMS.register("soul_ice_gate", () ->
            new BlockItem(CPlusBlocks.SOUL_ICE_GATE.get(), dyeables())),


// ORGANICS

    // Dirt
    DIRT_SLAB = ITEMS.register("dirt_slab", () ->
            new BlockItem(CPlusBlocks.DIRT_SLAB.get(), misc())),
    DIRT_STAIRS = ITEMS.register("dirt_stairs", () ->
            new BlockItem(CPlusBlocks.DIRT_STAIRS.get(), misc())),
    DIRT_WALL = ITEMS.register("dirt_wall", () ->
            new BlockItem(CPlusBlocks.DIRT_WALL.get(), misc())),

    // Grass
    GRASS_SLAB = ITEMS.register("grass_slab", () ->
            new BlockItem(CPlusBlocks.GRASS_SLAB.get(), misc())),
    GRASS_STAIRS = ITEMS.register("grass_stairs", () ->
            new BlockItem(CPlusBlocks.GRASS_STAIRS.get(), misc())),
    GRASS_WALL = ITEMS.register("grass_wall", () ->
            new BlockItem(CPlusBlocks.GRASS_WALL.get(), misc())),

    // Mycelium
    MYCELIUM_SLAB = ITEMS.register("mycelium_slab", () ->
            new BlockItem(CPlusBlocks.MYCELIUM_SLAB.get(), misc())),
    MYCELIUM_STAIRS = ITEMS.register("mycelium_stairs", () ->
            new BlockItem(CPlusBlocks.MYCELIUM_STAIRS.get(), misc())),
    MYCELIUM_WALL = ITEMS.register("mycelium_wall", () ->
            new BlockItem(CPlusBlocks.MYCELIUM_WALL.get(), misc())),


// MISC

    JACK_O_SOUL = ITEMS.register("jack_o_soul", () ->
            new BlockItem(CPlusBlocks.JACK_O_SOUL.get(), misc())),
    PINEAPPLE = ITEMS.register("pineapple", () ->
            new BlockItem(CPlusBlocks.PINEAPPLE.get(), misc())),
    KFP_BLOCK = ITEMS.register("kfp_block", () ->
            new BlockItem(CPlusBlocks.KFP_BLOCK.get(), new Item.Settings())),
    NETHERITE_STAIRS = ITEMS.register("netherite_stairs", () ->
            new BlockItem(CPlusBlocks.NETHERITE_STAIRS.get(), new Item.Settings())),
    SUSPICIOUS_SLAB = ITEMS.register("suspicious_slab", () ->
            new BlockItem(CPlusBlocks.SUSPICIOUS_SLAB.get(), new Item.Settings())),
    JET = ITEMS.register("jet", () ->
            new BlockItem(CPlusBlocks.JET.get(), new Item.Settings())),
	NUBERT = ITEMS.register("nubert", () ->
            new BlockItem(CPlusBlocks.NUBERT.get(), new Item.Settings().fireproof().rarity(Rarity.EPIC))),
	WIGGED_NUBERT = ITEMS.register("wigged_nubert", () ->
            new BlockItem(CPlusBlocks.WIGGED_NUBERT.get(), new Item.Settings().fireproof().rarity(Rarity.EPIC))),


// ITEMS

	// Random
	WARPED_WART = ITEMS.register("warped_wart", () ->
            new AliasedBlockItem(CPlusBlocks.WARPED_WART.get(), new Item.Settings().group(ItemGroup.MISC))),
	COPPER_NUGGET = ITEMS.register("copper_nugget", () ->
            new Item(new Item.Settings().group(ItemGroup.MISC))),
	NETHERITE_HORSE_ARMOR = ITEMS.register("netherite_horse_armor", () ->
            new NetheriteHorseArmorItem(15, "netherite", new Item.Settings().maxCount(1).fireproof().group(ItemGroup.MISC))),
	NUBERT_MINECART = ITEMS.register("nubert_minecart", () ->
            new NubertMinecartItem(new Item.Settings().maxCount(1), false)),
	WIGGED_NUBERT_MINECART = ITEMS.register("wigged_nubert_minecart", () ->
			new NubertMinecartItem(new Item.Settings().maxCount(1), true)),
	
	// turtle
	TURTLE_CHESTPLATE = ITEMS.register("turtle_chestplate", () ->
            new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT))),
	TURTLE_LEGGINGS = ITEMS.register("turtle_leggings", () ->
            new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT))),
	TURTLE_BOOTS = ITEMS.register("turtle_boots", () ->
            new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT))),

	// Bundles
	RED_BUNDLE = ITEMS.register("red_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1))),
	ORANGE_BUNDLE = ITEMS.register("orange_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1))),
	YELLOW_BUNDLE = ITEMS.register("yellow_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1))),
	LIME_BUNDLE = ITEMS.register("lime_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1))),
	GREEN_BUNDLE = ITEMS.register("green_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1))),
	BLUE_BUNDLE = ITEMS.register("blue_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1))),
	CYAN_BUNDLE = ITEMS.register("cyan_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1))),
	LIGHT_BLUE_BUNDLE = ITEMS.register("light_blue_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1))),
	PURPLE_BUNDLE = ITEMS.register("purple_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1))),
	MAGENTA_BUNDLE = ITEMS.register("magenta_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1))),
	PINK_BUNDLE = ITEMS.register("pink_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1))),
	WHITE_BUNDLE = ITEMS.register("white_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1))),
	LIGHT_GRAY_BUNDLE = ITEMS.register("light_gray_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1))),
	GRAY_BUNDLE = ITEMS.register("gray_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1))),
	BROWN_BUNDLE = ITEMS.register("brown_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1))),
	BLACK_BUNDLE = ITEMS.register("black_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1))),


// Deprecated Blocks

    CARVED_STONE_BRICKS = ITEMS.register("carved_stone_bricks", () ->
            new RedirectedBlockItem(CPlusBlocks.CARVED_STONE.get(), new Item.Settings(), CPlusBlocks.CARVED_STONE_BRICKS.get())),
    STONE_BRICK_PILLAR = ITEMS.register("stone_brick_pillar", () ->
            new RedirectedBlockItem(CPlusBlocks.STONE_PILLAR.get(), new Item.Settings(), CPlusBlocks.STONE_BRICK_PILLAR.get())),
    MOSSY_STONE_BRICK_PILLAR = ITEMS.register("mossy_stone_brick_pillar", () ->
            new RedirectedBlockItem(CPlusBlocks.MOSSY_STONE_PILLAR.get(), new Item.Settings(), CPlusBlocks.MOSSY_STONE_BRICK_PILLAR.get())),
    CRACKED_STONE_BRICK_PILLAR = ITEMS.register("cracked_stone_brick_pillar", () ->
            new RedirectedBlockItem(CPlusBlocks.CRACKED_STONE_PILLAR.get(), new Item.Settings(), CPlusBlocks.CRACKED_STONE_BRICK_PILLAR.get())),
    CRACKED_CHISELED_STONE_BRICKS = ITEMS.register("cracked_chiseled_stone_bricks", () ->
            new RedirectedBlockItem(CPlusBlocks.CRACKED_CHISELED_STONE.get(), new Item.Settings(), CPlusBlocks.CRACKED_CHISELED_STONE.get())),
    MOSSY_CHISELED_STONE_BRICKS = ITEMS.register("mossy_chiseled_stone_bricks", () ->
            new RedirectedBlockItem(CPlusBlocks.MOSSY_CHISELED_STONE.get(), new Item.Settings(), CPlusBlocks.MOSSY_CHISELED_STONE_BRICKS.get())),
    BLACKSTONE_BRICK_PILLAR = ITEMS.register("blackstone_brick_pillar", () ->
            new RedirectedBlockItem(CPlusBlocks.BLACKSTONE_PILLAR.get(), new Item.Settings(), CPlusBlocks.BLACKSTONE_BRICK_PILLAR.get())),
    CRACKED_BLACKSTONE_BRICK_PILLAR = ITEMS.register("cracked_blackstone_brick_pillar", () ->
            new RedirectedBlockItem(CPlusBlocks.CRACKED_BLACKSTONE_PILLAR.get(), new Item.Settings(), CPlusBlocks.CRACKED_BLACKSTONE_BRICK_PILLAR.get())),
    MOSSY_BLACKSTONE_BRICK_PILLAR = ITEMS.register("mossy_blackstone_brick_pillar", () ->
            new RedirectedBlockItem(CPlusBlocks.MOSSY_BLACKSTONE_PILLAR.get(), new Item.Settings(), CPlusBlocks.MOSSY_BLACKSTONE_BRICK_PILLAR.get())),
    CHISELED_BRICKS = ITEMS.register("chiseled_bricks", () ->
            new RedirectedBlockItem(CPlusBlocks.CHISELED_TERRACOTTA.get(), new Item.Settings(), CPlusBlocks.CHISELED_BRICKS.get())),
    BRICK_PILLAR = ITEMS.register("brick_pillar", () ->
            new RedirectedBlockItem(CPlusBlocks.TERRACOTTA_PILLAR.get(), new Item.Settings(), CPlusBlocks.BRICK_PILLAR.get())),
    CARVED_BRICKS = ITEMS.register("carved_bricks", () ->
            new RedirectedBlockItem(CPlusBlocks.CARVED_TERRACOTTA.get(), new Item.Settings(), CPlusBlocks.CARVED_BRICKS.get())),
    SMOOTH_PURPUR_BLOCK = ITEMS.register("smooth_purpur_block", () ->
            new RedirectedBlockItem(CPlusBlocks.SMOOTH_PURPUR.get(), new Item.Settings(), CPlusBlocks.SMOOTH_PURPUR_BLOCK.get())),
    POLISHED_PURPUR_BLOCK = ITEMS.register("polished_purpur_block", () ->
            new RedirectedBlockItem(CPlusBlocks.POLISHED_PURPUR.get(), new Item.Settings(), CPlusBlocks.POLISHED_PURPUR_BLOCK.get())),
    CHISELED_PURPUR_BLOCK = ITEMS.register("chiseled_purpur_block", () ->
            new RedirectedBlockItem(CPlusBlocks.CHISELED_PURPUR.get(), new Item.Settings(), CPlusBlocks.CHISELED_PURPUR_BLOCK.get())),
    END_STONE_BRICK_PILLAR = ITEMS.register("end_stone_brick_pillar", () ->
            new RedirectedBlockItem(CPlusBlocks.END_STONE_PILLAR.get(), new Item.Settings(), CPlusBlocks.END_STONE_BRICK_PILLAR.get()));

    public static void init() {
    	ITEMS.register();
	}
}
package io.github.consistencyplus.consistency_plus.registry;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registries;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.items.NetheriteHorseArmorItem;
import io.github.consistencyplus.consistency_plus.items.RedirectedBlockItem;
import io.github.consistencyplus.consistency_plus.utils.IdHandler;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class CPlusItems {
	/*
	templates:
	block item: public static final RegistrySupplier<Item> SMOOTH_STONE_WALL = ITEMS.register("smooth_stone_wall", () ->
            new BlockItem(CPlusCPlusBlocks.SMOOTH_STONE_WALL.get(), CPlusCPlusItemGroups.consistencyPlusStoneItemSettings()));
	 */

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(IdHandler.ID, Registry.ITEM_KEY);



	// STONE
	// Base
	public static final RegistrySupplier<Item> STONE_WALL = ITEMS.register("stone_wall", () ->
            new BlockItem(CPlusBlocks.STONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> STONE_GATE = ITEMS.register("stone_gate", () ->
            new BlockItem(CPlusBlocks.STONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobblestone
	public static final RegistrySupplier<Item> COBBLESTONE_GATE = ITEMS.register("cobblestone_gate", () ->
            new BlockItem(CPlusBlocks.COBBLESTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Cobblestone
	public static final RegistrySupplier<Item> MOSSY_COBBLESTONE_GATE = ITEMS.register("mossy_cobblestone_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_COBBLESTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Stone
	public static final RegistrySupplier<Item> POLISHED_STONE = ITEMS.register("polished_stone", () ->
            new BlockItem(CPlusBlocks.POLISHED_STONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_STONE_WALL = ITEMS.register("polished_stone_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_STONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_STONE_STAIRS = ITEMS.register("polished_stone_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_STONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_STONE_SLAB = ITEMS.register("polished_stone_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_STONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_STONE_GATE = ITEMS.register("polished_stone_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_STONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Stone
	public static final RegistrySupplier<Item> SMOOTH_STONE_WALL = ITEMS.register("smooth_stone_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_STONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_STONE_STAIRS = ITEMS.register("smooth_stone_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_STONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_STONE_GATE = ITEMS.register("smooth_stone_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_STONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Stone Bricks
	public static final RegistrySupplier<Item> STONE_BRICK_GATE = ITEMS.register("stone_brick_gate", () ->
            new BlockItem(CPlusBlocks.STONE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Stone Bricks
	public static final RegistrySupplier<Item> MOSSY_STONE_BRICK_GATE = ITEMS.register("mossy_stone_brick_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_STONE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Stone Bricks
	public static final RegistrySupplier<Item> CRACKED_STONE_BRICK_SLAB = ITEMS.register("cracked_stone_brick_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_STONE_BRICK_STAIRS = ITEMS.register("cracked_stone_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_STONE_BRICK_WALL = ITEMS.register("cracked_stone_brick_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_STONE_BRICK_GATE = ITEMS.register("cracked_stone_brick_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_STONE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Stone
	public static final RegistrySupplier<Item> CUT_STONE = ITEMS.register("cut_stone", () ->
            new BlockItem(CPlusBlocks.CUT_STONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_STONE_SLAB = ITEMS.register("cut_stone_slab", () ->
            new BlockItem(CPlusBlocks.CUT_STONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_STONE_STAIRS = ITEMS.register("cut_stone_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_STONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_STONE_WALL = ITEMS.register("cut_stone_wall", () ->
            new BlockItem(CPlusBlocks.CUT_STONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_STONE_GATE = ITEMS.register("cut_stone_gate", () ->
            new BlockItem(CPlusBlocks.CUT_STONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Stone Tiles
	public static final RegistrySupplier<Item> STONE_TILES = ITEMS.register("stone_tiles", () ->
            new BlockItem(CPlusBlocks.STONE_TILES.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> STONE_TILE_SLAB = ITEMS.register("stone_tile_slab", () ->
            new BlockItem(CPlusBlocks.STONE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> STONE_TILE_STAIRS = ITEMS.register("stone_tile_stairs", () ->
            new BlockItem(CPlusBlocks.STONE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> STONE_TILE_WALL = ITEMS.register("stone_tile_wall", () ->
            new BlockItem(CPlusBlocks.STONE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> STONE_TILE_GATE = ITEMS.register("stone_tile_gate", () ->
            new BlockItem(CPlusBlocks.STONE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Stone Pillar
	// The block that started it all
	public static final RegistrySupplier<Item> STONE_PILLAR = ITEMS.register("stone_pillar", () ->
            new BlockItem(CPlusBlocks.STONE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> STONE_CORNER_PILLAR = ITEMS.register("stone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.STONE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Stone Pillar
	public static final RegistrySupplier<Item> MOSSY_STONE_PILLAR = ITEMS.register("mossy_stone_pillar", () ->
            new BlockItem(CPlusBlocks.MOSSY_STONE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_STONE_CORNER_PILLAR = ITEMS.register("mossy_stone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.MOSSY_STONE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Stone Pillar
	public static final RegistrySupplier<Item> CRACKED_STONE_PILLAR = ITEMS.register("cracked_stone_pillar", () ->
            new BlockItem(CPlusBlocks.CRACKED_STONE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_STONE_CORNER_PILLAR = ITEMS.register("cracked_stone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.CRACKED_STONE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Chiseled Stone
	public static final RegistrySupplier<Item> MOSSY_CHISELED_STONE = ITEMS.register("mossy_chiseled_stone", () ->
            new BlockItem(CPlusBlocks.MOSSY_CHISELED_STONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Chiseled Stone
	public static final RegistrySupplier<Item> CRACKED_CHISELED_STONE = ITEMS.register("cracked_chiseled_stone", () ->
            new BlockItem(CPlusBlocks.CRACKED_CHISELED_STONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved Stone
	public static final RegistrySupplier<Item> CARVED_STONE = ITEMS.register("carved_stone", () ->
            new BlockItem(CPlusBlocks.CARVED_STONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));


// ANDESITE

	// Base
	public static final RegistrySupplier<Item> ANDESITE_GATE = ITEMS.register("andesite_gate", () ->
            new BlockItem(CPlusBlocks.ANDESITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Base
	public static final RegistrySupplier<Item> MOSSY_ANDESITE = ITEMS.register("mossy_andesite", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_ANDESITE_SLAB = ITEMS.register("mossy_andesite_slab", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_ANDESITE_STAIRS = ITEMS.register("mossy_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_ANDESITE_WALL = ITEMS.register("mossy_andesite_wall", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_ANDESITE_GATE = ITEMS.register("mossy_andesite_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Andesite
	public static final RegistrySupplier<Item> COBBLED_ANDESITE = ITEMS.register("cobbled_andesite", () ->
            new BlockItem(CPlusBlocks.COBBLED_ANDESITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_ANDESITE_SLAB = ITEMS.register("cobbled_andesite_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_ANDESITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_ANDESITE_STAIRS = ITEMS.register("cobbled_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_ANDESITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_ANDESITE_WALL = ITEMS.register("cobbled_andesite_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_ANDESITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_ANDESITE_GATE = ITEMS.register("cobbled_andesite_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_ANDESITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Andesite
	public static final RegistrySupplier<Item> POLISHED_ANDESITE_WALL = ITEMS.register("polished_andesite_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_ANDESITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_ANDESITE_GATE = ITEMS.register("polished_andesite_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_ANDESITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Polished Andesite
	public static final RegistrySupplier<Item> MOSSY_POLISHED_ANDESITE = ITEMS.register("mossy_polished_andesite", () ->
            new BlockItem(CPlusBlocks.MOSSY_POLISHED_ANDESITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_POLISHED_ANDESITE_SLAB = ITEMS.register("mossy_polished_andesite_slab", () ->
            new BlockItem(CPlusBlocks.MOSSY_POLISHED_ANDESITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_POLISHED_ANDESITE_STAIRS = ITEMS.register("mossy_polished_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.MOSSY_POLISHED_ANDESITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_POLISHED_ANDESITE_WALL = ITEMS.register("mossy_polished_andesite_wall", () ->
            new BlockItem(CPlusBlocks.MOSSY_POLISHED_ANDESITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_POLISHED_ANDESITE_GATE = ITEMS.register("mossy_polished_andesite_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_POLISHED_ANDESITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Polished Andesite
	public static final RegistrySupplier<Item> CRACKED_POLISHED_ANDESITE = ITEMS.register("cracked_polished_andesite", () ->
            new BlockItem(CPlusBlocks.CRACKED_POLISHED_ANDESITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_POLISHED_ANDESITE_SLAB = ITEMS.register("cracked_polished_andesite_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_POLISHED_ANDESITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_POLISHED_ANDESITE_STAIRS = ITEMS.register("cracked_polished_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_POLISHED_ANDESITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_POLISHED_ANDESITE_WALL = ITEMS.register("cracked_polished_andesite_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_POLISHED_ANDESITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_POLISHED_ANDESITE_GATE = ITEMS.register("cracked_polished_andesite_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_POLISHED_ANDESITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Andesite
	public static final RegistrySupplier<Item> SMOOTH_ANDESITE = ITEMS.register("smooth_andesite", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ANDESITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_ANDESITE_SLAB = ITEMS.register("smooth_andesite_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ANDESITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_ANDESITE_STAIRS = ITEMS.register("smooth_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ANDESITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_ANDESITE_WALL = ITEMS.register("smooth_andesite_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ANDESITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_ANDESITE_GATE = ITEMS.register("smooth_andesite_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ANDESITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Smooth Andesite
	public static final RegistrySupplier<Item> MOSSY_SMOOTH_ANDESITE = ITEMS.register("mossy_smooth_andesite", () ->
            new BlockItem(CPlusBlocks.MOSSY_SMOOTH_ANDESITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_SMOOTH_ANDESITE_SLAB = ITEMS.register("mossy_smooth_andesite_slab", () ->
            new BlockItem(CPlusBlocks.MOSSY_SMOOTH_ANDESITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_SMOOTH_ANDESITE_STAIRS = ITEMS.register("mossy_smooth_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.MOSSY_SMOOTH_ANDESITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_SMOOTH_ANDESITE_WALL = ITEMS.register("mossy_smooth_andesite_wall", () ->
            new BlockItem(CPlusBlocks.MOSSY_SMOOTH_ANDESITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_SMOOTH_ANDESITE_GATE = ITEMS.register("mossy_smooth_andesite_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_SMOOTH_ANDESITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Smooth Andesite
	public static final RegistrySupplier<Item> CRACKED_SMOOTH_ANDESITE = ITEMS.register("cracked_smooth_andesite", () ->
            new BlockItem(CPlusBlocks.CRACKED_SMOOTH_ANDESITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_SMOOTH_ANDESITE_SLAB = ITEMS.register("cracked_smooth_andesite_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_SMOOTH_ANDESITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_SMOOTH_ANDESITE_STAIRS = ITEMS.register("cracked_smooth_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_SMOOTH_ANDESITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_SMOOTH_ANDESITE_WALL = ITEMS.register("cracked_smooth_andesite_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_SMOOTH_ANDESITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_SMOOTH_ANDESITE_GATE = ITEMS.register("cracked_smooth_andesite_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_SMOOTH_ANDESITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Andesite Bricks
	public static final RegistrySupplier<Item> ANDESITE_BRICKS = ITEMS.register("andesite_bricks", () ->
            new BlockItem(CPlusBlocks.ANDESITE_BRICKS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> ANDESITE_BRICK_SLAB = ITEMS.register("andesite_brick_slab", () ->
            new BlockItem(CPlusBlocks.ANDESITE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> ANDESITE_BRICK_STAIRS = ITEMS.register("andesite_brick_stairs", () ->
            new BlockItem(CPlusBlocks.ANDESITE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> ANDESITE_BRICK_WALL = ITEMS.register("andesite_brick_wall", () ->
            new BlockItem(CPlusBlocks.ANDESITE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> ANDESITE_BRICK_GATE = ITEMS.register("andesite_brick_gate", () ->
            new BlockItem(CPlusBlocks.ANDESITE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Andesite Bricks
	public static final RegistrySupplier<Item> MOSSY_ANDESITE_BRICKS = ITEMS.register("mossy_andesite_bricks", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_BRICKS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_ANDESITE_BRICK_SLAB = ITEMS.register("mossy_andesite_brick_slab", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_ANDESITE_BRICK_STAIRS = ITEMS.register("mossy_andesite_brick_stairs", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_ANDESITE_BRICK_WALL = ITEMS.register("mossy_andesite_brick_wall", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_ANDESITE_BRICK_GATE = ITEMS.register("mossy_andesite_brick_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Andesite Bricks
	public static final RegistrySupplier<Item> CRACKED_ANDESITE_BRICKS = ITEMS.register("cracked_andesite_bricks", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_BRICKS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_ANDESITE_BRICK_SLAB = ITEMS.register("cracked_andesite_brick_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_ANDESITE_BRICK_STAIRS = ITEMS.register("cracked_andesite_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_ANDESITE_BRICK_WALL = ITEMS.register("cracked_andesite_brick_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_ANDESITE_BRICK_GATE = ITEMS.register("cracked_andesite_brick_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Andesite
	public static final RegistrySupplier<Item> CUT_ANDESITE = ITEMS.register("cut_andesite", () ->
            new BlockItem(CPlusBlocks.CUT_ANDESITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_ANDESITE_SLAB = ITEMS.register("cut_andesite_slab", () ->
            new BlockItem(CPlusBlocks.CUT_ANDESITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_ANDESITE_STAIRS = ITEMS.register("cut_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_ANDESITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_ANDESITE_WALL = ITEMS.register("cut_andesite_wall", () ->
            new BlockItem(CPlusBlocks.CUT_ANDESITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_ANDESITE_GATE = ITEMS.register("cut_andesite_gate", () ->
            new BlockItem(CPlusBlocks.CUT_ANDESITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Cut Andesite
	public static final RegistrySupplier<Item> MOSSY_CUT_ANDESITE = ITEMS.register("mossy_cut_andesite", () ->
            new BlockItem(CPlusBlocks.MOSSY_CUT_ANDESITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_CUT_ANDESITE_SLAB = ITEMS.register("mossy_cut_andesite_slab", () ->
            new BlockItem(CPlusBlocks.MOSSY_CUT_ANDESITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_CUT_ANDESITE_STAIRS = ITEMS.register("mossy_cut_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.MOSSY_CUT_ANDESITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_CUT_ANDESITE_WALL = ITEMS.register("mossy_cut_andesite_wall", () ->
            new BlockItem(CPlusBlocks.MOSSY_CUT_ANDESITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_CUT_ANDESITE_GATE = ITEMS.register("mossy_cut_andesite_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_CUT_ANDESITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Cut Andesite
	public static final RegistrySupplier<Item> CRACKED_CUT_ANDESITE = ITEMS.register("cracked_cut_andesite", () ->
            new BlockItem(CPlusBlocks.CRACKED_CUT_ANDESITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_CUT_ANDESITE_SLAB = ITEMS.register("cracked_cut_andesite_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_CUT_ANDESITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_CUT_ANDESITE_STAIRS = ITEMS.register("cracked_cut_andesite_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_CUT_ANDESITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_CUT_ANDESITE_WALL = ITEMS.register("cracked_cut_andesite_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_CUT_ANDESITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_CUT_ANDESITE_GATE = ITEMS.register("cracked_cut_andesite_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_CUT_ANDESITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Andesite Tiles
	public static final RegistrySupplier<Item> ANDESITE_TILES = ITEMS.register("andesite_tiles", () ->
            new BlockItem(CPlusBlocks.ANDESITE_TILES.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> ANDESITE_TILE_SLAB = ITEMS.register("andesite_tile_slab", () ->
            new BlockItem(CPlusBlocks.ANDESITE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> ANDESITE_TILE_STAIRS = ITEMS.register("andesite_tile_stairs", () ->
            new BlockItem(CPlusBlocks.ANDESITE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> ANDESITE_TILE_WALL = ITEMS.register("andesite_tile_wall", () ->
            new BlockItem(CPlusBlocks.ANDESITE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> ANDESITE_TILE_GATE = ITEMS.register("andesite_tile_gate", () ->
            new BlockItem(CPlusBlocks.ANDESITE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Andesite Tiles
	public static final RegistrySupplier<Item> MOSSY_ANDESITE_TILES = ITEMS.register("mossy_andesite_tiles", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_TILES.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_ANDESITE_TILE_SLAB = ITEMS.register("mossy_andesite_tile_slab", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_ANDESITE_TILE_STAIRS = ITEMS.register("mossy_andesite_tile_stairs", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_ANDESITE_TILE_WALL = ITEMS.register("mossy_andesite_tile_wall", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_ANDESITE_TILE_GATE = ITEMS.register("mossy_andesite_tile_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Andesite Tiles
	public static final RegistrySupplier<Item> CRACKED_ANDESITE_TILES = ITEMS.register("cracked_andesite_tiles", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_TILES.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_ANDESITE_TILE_SLAB = ITEMS.register("cracked_andesite_tile_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_ANDESITE_TILE_STAIRS = ITEMS.register("cracked_andesite_tile_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_ANDESITE_TILE_WALL = ITEMS.register("cracked_andesite_tile_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_ANDESITE_TILE_GATE = ITEMS.register("cracked_andesite_tile_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Andesite Pillar
	public static final RegistrySupplier<Item> ANDESITE_PILLAR = ITEMS.register("andesite_pillar", () ->
            new BlockItem(CPlusBlocks.ANDESITE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> ANDESITE_CORNER_PILLAR = ITEMS.register("andesite_corner_pillar", () ->
            new BlockItem(CPlusBlocks.ANDESITE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Andesite Pillar
	public static final RegistrySupplier<Item> MOSSY_ANDESITE_PILLAR = ITEMS.register("mossy_andesite_pillar", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_ANDESITE_CORNER_PILLAR = ITEMS.register("mossy_andesite_corner_pillar", () ->
            new BlockItem(CPlusBlocks.MOSSY_ANDESITE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Andesite Pillar
	public static final RegistrySupplier<Item> CRACKED_ANDESITE_PILLAR = ITEMS.register("cracked_andesite_pillar", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_ANDESITE_CORNER_PILLAR = ITEMS.register("cracked_andesite_corner_pillar", () ->
            new BlockItem(CPlusBlocks.CRACKED_ANDESITE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled andesite
	public static final RegistrySupplier<Item> CHISELED_ANDESITE = ITEMS.register("chiseled_andesite", () ->
            new BlockItem(CPlusBlocks.CHISELED_ANDESITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Chiseled Andesite
	public static final RegistrySupplier<Item> MOSSY_CHISELED_ANDESITE = ITEMS.register("mossy_chiseled_andesite", () ->
            new BlockItem(CPlusBlocks.MOSSY_CHISELED_ANDESITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Chiseled Andesite
	public static final RegistrySupplier<Item> CRACKED_CHISELED_ANDESITE = ITEMS.register("cracked_chiseled_andesite", () ->
            new BlockItem(CPlusBlocks.CRACKED_CHISELED_ANDESITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved Andesite
	public static final RegistrySupplier<Item> CARVED_ANDESITE = ITEMS.register("carved_andesite", () ->
            new BlockItem(CPlusBlocks.CARVED_ANDESITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Carved Andesite
	public static final RegistrySupplier<Item> MOSSY_CARVED_ANDESITE = ITEMS.register("mossy_carved_andesite", () ->
            new BlockItem(CPlusBlocks.MOSSY_CARVED_ANDESITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Carved Andesite
	public static final RegistrySupplier<Item> CRACKED_CARVED_ANDESITE = ITEMS.register("cracked_carved_andesite", () ->
            new BlockItem(CPlusBlocks.CRACKED_CARVED_ANDESITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));


// DIORITE

	// Base
	public static final RegistrySupplier<Item> DIORITE_GATE = ITEMS.register("diorite_gate", () ->
            new BlockItem(CPlusBlocks.DIORITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Diorite
	public static final RegistrySupplier<Item> COBBLED_DIORITE = ITEMS.register("cobbled_diorite", () ->
            new BlockItem(CPlusBlocks.COBBLED_DIORITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_DIORITE_SLAB = ITEMS.register("cobbled_diorite_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_DIORITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_DIORITE_STAIRS = ITEMS.register("cobbled_diorite_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_DIORITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_DIORITE_WALL = ITEMS.register("cobbled_diorite_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_DIORITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_DIORITE_GATE = ITEMS.register("cobbled_diorite_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_DIORITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Diorite
	public static final RegistrySupplier<Item> POLISHED_DIORITE_WALL = ITEMS.register("polished_diorite_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_DIORITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_DIORITE_GATE = ITEMS.register("polished_diorite_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_DIORITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Diorite
	public static final RegistrySupplier<Item> SMOOTH_DIORITE = ITEMS.register("smooth_diorite", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DIORITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_DIORITE_SLAB = ITEMS.register("smooth_diorite_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DIORITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_DIORITE_STAIRS = ITEMS.register("smooth_diorite_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DIORITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_DIORITE_WALL = ITEMS.register("smooth_diorite_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DIORITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_DIORITE_GATE = ITEMS.register("smooth_diorite_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DIORITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Diorite Bricks
	public static final RegistrySupplier<Item> DIORITE_BRICKS = ITEMS.register("diorite_bricks", () ->
            new BlockItem(CPlusBlocks.DIORITE_BRICKS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DIORITE_BRICK_SLAB = ITEMS.register("diorite_brick_slab", () ->
            new BlockItem(CPlusBlocks.DIORITE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DIORITE_BRICK_STAIRS = ITEMS.register("diorite_brick_stairs", () ->
            new BlockItem(CPlusBlocks.DIORITE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DIORITE_BRICK_WALL = ITEMS.register("diorite_brick_wall", () ->
            new BlockItem(CPlusBlocks.DIORITE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DIORITE_BRICK_GATE = ITEMS.register("diorite_brick_gate", () ->
            new BlockItem(CPlusBlocks.DIORITE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Diorite
	public static final RegistrySupplier<Item> CUT_DIORITE = ITEMS.register("cut_diorite", () ->
            new BlockItem(CPlusBlocks.CUT_DIORITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_DIORITE_SLAB = ITEMS.register("cut_diorite_slab", () ->
            new BlockItem(CPlusBlocks.CUT_DIORITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_DIORITE_STAIRS = ITEMS.register("cut_diorite_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_DIORITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_DIORITE_WALL = ITEMS.register("cut_diorite_wall", () ->
            new BlockItem(CPlusBlocks.CUT_DIORITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_DIORITE_GATE = ITEMS.register("cut_diorite_gate", () ->
            new BlockItem(CPlusBlocks.CUT_DIORITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Diorite Tiles
	public static final RegistrySupplier<Item> DIORITE_TILES = ITEMS.register("diorite_tiles", () ->
            new BlockItem(CPlusBlocks.DIORITE_TILES.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DIORITE_TILE_SLAB = ITEMS.register("diorite_tile_slab", () ->
            new BlockItem(CPlusBlocks.DIORITE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DIORITE_TILE_STAIRS = ITEMS.register("diorite_tile_stairs", () ->
            new BlockItem(CPlusBlocks.DIORITE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DIORITE_TILE_WALL = ITEMS.register("diorite_tile_wall", () ->
            new BlockItem(CPlusBlocks.DIORITE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DIORITE_TILE_GATE = ITEMS.register("diorite_tile_gate", () ->
            new BlockItem(CPlusBlocks.DIORITE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Diorite Pillar
	public static final RegistrySupplier<Item> DIORITE_PILLAR = ITEMS.register("diorite_pillar", () ->
            new BlockItem(CPlusBlocks.DIORITE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DIORITE_CORNER_PILLAR = ITEMS.register("diorite_corner_pillar", () ->
            new BlockItem(CPlusBlocks.DIORITE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Diorite
	public static final RegistrySupplier<Item> CHISELED_DIORITE = ITEMS.register("chiseled_diorite", () ->
            new BlockItem(CPlusBlocks.CHISELED_DIORITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved Diorite
	public static final RegistrySupplier<Item> CARVED_DIORITE = ITEMS.register("carved_diorite", () ->
            new BlockItem(CPlusBlocks.CARVED_DIORITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));


// GRANITE

	// Base
	public static final RegistrySupplier<Item> GRANITE_GATE = ITEMS.register("granite_gate", () ->
            new BlockItem(CPlusBlocks.GRANITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Granite
	public static final RegistrySupplier<Item> COBBLED_GRANITE = ITEMS.register("cobbled_granite", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRANITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_GRANITE_SLAB = ITEMS.register("cobbled_granite_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRANITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_GRANITE_STAIRS = ITEMS.register("cobbled_granite_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRANITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_GRANITE_WALL = ITEMS.register("cobbled_granite_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRANITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_GRANITE_GATE = ITEMS.register("cobbled_granite_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRANITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Granite
	public static final RegistrySupplier<Item> POLISHED_GRANITE_WALL = ITEMS.register("polished_granite_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRANITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GRANITE_GATE = ITEMS.register("polished_granite_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRANITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Granite
	public static final RegistrySupplier<Item> SMOOTH_GRANITE = ITEMS.register("smooth_granite", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRANITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GRANITE_SLAB = ITEMS.register("smooth_granite_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRANITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GRANITE_STAIRS = ITEMS.register("smooth_granite_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRANITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GRANITE_WALL = ITEMS.register("smooth_granite_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRANITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GRANITE_GATE = ITEMS.register("smooth_granite_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRANITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Granite Bricks
	public static final RegistrySupplier<Item> GRANITE_BRICKS = ITEMS.register("granite_bricks", () ->
            new BlockItem(CPlusBlocks.GRANITE_BRICKS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> GRANITE_BRICK_SLAB = ITEMS.register("granite_brick_slab", () ->
            new BlockItem(CPlusBlocks.GRANITE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> GRANITE_BRICK_STAIRS = ITEMS.register("granite_brick_stairs", () ->
            new BlockItem(CPlusBlocks.GRANITE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> GRANITE_BRICK_WALL = ITEMS.register("granite_brick_wall", () ->
            new BlockItem(CPlusBlocks.GRANITE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> GRANITE_BRICK_GATE = ITEMS.register("granite_brick_gate", () ->
            new BlockItem(CPlusBlocks.GRANITE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Granite
	public static final RegistrySupplier<Item> CUT_GRANITE = ITEMS.register("cut_granite", () ->
            new BlockItem(CPlusBlocks.CUT_GRANITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_GRANITE_SLAB = ITEMS.register("cut_granite_slab", () ->
            new BlockItem(CPlusBlocks.CUT_GRANITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_GRANITE_STAIRS = ITEMS.register("cut_granite_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_GRANITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_GRANITE_WALL = ITEMS.register("cut_granite_wall", () ->
            new BlockItem(CPlusBlocks.CUT_GRANITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_GRANITE_GATE = ITEMS.register("cut_granite_gate", () ->
            new BlockItem(CPlusBlocks.CUT_GRANITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Granite Tiles
	public static final RegistrySupplier<Item> GRANITE_TILES = ITEMS.register("granite_tiles", () ->
            new BlockItem(CPlusBlocks.GRANITE_TILES.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> GRANITE_TILE_SLAB = ITEMS.register("granite_tile_slab", () ->
            new BlockItem(CPlusBlocks.GRANITE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> GRANITE_TILE_STAIRS = ITEMS.register("granite_tile_stairs", () ->
            new BlockItem(CPlusBlocks.GRANITE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> GRANITE_TILE_WALL = ITEMS.register("granite_tile_wall", () ->
            new BlockItem(CPlusBlocks.GRANITE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> GRANITE_TILE_GATE = ITEMS.register("granite_tile_gate", () ->
            new BlockItem(CPlusBlocks.GRANITE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Granite Pillar
	public static final RegistrySupplier<Item> GRANITE_PILLAR = ITEMS.register("granite_pillar", () ->
            new BlockItem(CPlusBlocks.GRANITE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> GRANITE_CORNER_PILLAR = ITEMS.register("granite_corner_pillar", () ->
            new BlockItem(CPlusBlocks.GRANITE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Granite
	public static final RegistrySupplier<Item> CHISELED_GRANITE = ITEMS.register("chiseled_granite", () ->
            new BlockItem(CPlusBlocks.CHISELED_GRANITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved Granite
	public static final RegistrySupplier<Item> CARVED_GRANITE = ITEMS.register("carved_granite", () ->
            new BlockItem(CPlusBlocks.CARVED_GRANITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));


// CALCITE

	// Base
	public static final RegistrySupplier<Item> CALCITE_SLAB = ITEMS.register("calcite_slab", () ->
            new BlockItem(CPlusBlocks.CALCITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CALCITE_STAIRS = ITEMS.register("calcite_stairs", () ->
            new BlockItem(CPlusBlocks.CALCITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CALCITE_WALL = ITEMS.register("calcite_wall", () ->
            new BlockItem(CPlusBlocks.CALCITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CALCITE_GATE = ITEMS.register("calcite_gate", () ->
            new BlockItem(CPlusBlocks.CALCITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Calcite
	public static final RegistrySupplier<Item> COBBLED_CALCITE = ITEMS.register("cobbled_calcite", () ->
            new BlockItem(CPlusBlocks.COBBLED_CALCITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_CALCITE_SLAB = ITEMS.register("cobbled_calcite_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_CALCITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_CALCITE_STAIRS = ITEMS.register("cobbled_calcite_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_CALCITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_CALCITE_WALL = ITEMS.register("cobbled_calcite_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_CALCITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_CALCITE_GATE = ITEMS.register("cobbled_calcite_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_CALCITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Calcite
	public static final RegistrySupplier<Item> POLISHED_CALCITE = ITEMS.register("polished_calcite", () ->
            new BlockItem(CPlusBlocks.POLISHED_CALCITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CALCITE_SLAB = ITEMS.register("polished_calcite_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_CALCITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CALCITE_STAIRS = ITEMS.register("polished_calcite_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_CALCITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CALCITE_WALL = ITEMS.register("polished_calcite_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_CALCITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CALCITE_GATE = ITEMS.register("polished_calcite_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_CALCITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Calcite
	public static final RegistrySupplier<Item> SMOOTH_CALCITE = ITEMS.register("smooth_calcite", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CALCITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_CALCITE_SLAB = ITEMS.register("smooth_calcite_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CALCITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_CALCITE_STAIRS = ITEMS.register("smooth_calcite_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CALCITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_CALCITE_WALL = ITEMS.register("smooth_calcite_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CALCITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_CALCITE_GATE = ITEMS.register("smooth_calcite_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CALCITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Calcite Bricks
	public static final RegistrySupplier<Item> CALCITE_BRICKS = ITEMS.register("calcite_bricks", () ->
            new BlockItem(CPlusBlocks.CALCITE_BRICKS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CALCITE_BRICK_SLAB = ITEMS.register("calcite_brick_slab", () ->
            new BlockItem(CPlusBlocks.CALCITE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CALCITE_BRICk_STAIRS = ITEMS.register("calcite_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CALCITE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CALCITE_BRICK_WALL = ITEMS.register("calcite_brick_wall", () ->
            new BlockItem(CPlusBlocks.CALCITE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CALCITE_BRICK_GATE = ITEMS.register("calcite_brick_gate", () ->
            new BlockItem(CPlusBlocks.CALCITE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Calcite
	public static final RegistrySupplier<Item> CUT_CALCITE = ITEMS.register("cut_calcite", () ->
            new BlockItem(CPlusBlocks.CUT_CALCITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_CALCITE_SLAB = ITEMS.register("cut_calcite_slab", () ->
            new BlockItem(CPlusBlocks.CUT_CALCITE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_CALCITE_STAIRS = ITEMS.register("cut_calcite_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_CALCITE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_CALCITE_WALL = ITEMS.register("cut_calcite_wall", () ->
            new BlockItem(CPlusBlocks.CUT_CALCITE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_CALCITE_GATE = ITEMS.register("cut_calcite_gate", () ->
            new BlockItem(CPlusBlocks.CUT_CALCITE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Calcite Tiles
	public static final RegistrySupplier<Item> CALCITE_TILES = ITEMS.register("calcite_tiles", () ->
            new BlockItem(CPlusBlocks.CALCITE_TILES.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CALCITE_TILE_SLAB = ITEMS.register("calcite_tile_slab", () ->
            new BlockItem(CPlusBlocks.CALCITE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CALCITE_TILE_STAIRS = ITEMS.register("calcite_tile_stairs", () ->
            new BlockItem(CPlusBlocks.CALCITE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CALCITE_TILE_WALL = ITEMS.register("calcite_tile_wall", () ->
            new BlockItem(CPlusBlocks.CALCITE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CALCITE_TILE_GATE = ITEMS.register("calcite_tile_gate", () ->
            new BlockItem(CPlusBlocks.CALCITE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Calcite Pillar
	public static final RegistrySupplier<Item> CALCITE_PILLAR = ITEMS.register("calcite_pillar", () ->
            new BlockItem(CPlusBlocks.CALCITE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CALCITE_CORNER_PILLAR = ITEMS.register("calcite_corner_pillar", () ->
            new BlockItem(CPlusBlocks.CALCITE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Calcite
	public static final RegistrySupplier<Item> CHISELED_CALCITE = ITEMS.register("chiseled_calcite", () ->
            new BlockItem(CPlusBlocks.CHISELED_CALCITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved Calcite
	public static final RegistrySupplier<Item> CARVED_CALCITE = ITEMS.register("carved_calcite", () ->
            new BlockItem(CPlusBlocks.CARVED_CALCITE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));


// DRIPSTONE

	// Base
	public static final RegistrySupplier<Item> DRIPSTONE_SLAB = ITEMS.register("dripstone_slab", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DRIPSTONE_STAIRS = ITEMS.register("dripstone_stairs", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DRIPSTONE_WALL = ITEMS.register("dripstone_wall", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DRIPSTONE_GATE = ITEMS.register("dripstone_gate", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Dripstone
	public static final RegistrySupplier<Item> COBBLED_DRIPSTONE = ITEMS.register("cobbled_dripstone", () ->
            new BlockItem(CPlusBlocks.COBBLED_DRIPSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_DRIPSTONE_SLAB = ITEMS.register("cobbled_dripstone_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_DRIPSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_DRIPSTONE_STAIRS = ITEMS.register("cobbled_dripstone_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_DRIPSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_DRIPSTONE_WALL = ITEMS.register("cobbled_dripstone_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_DRIPSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_DRIPSTONE_GATE = ITEMS.register("cobbled_dripstone_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_DRIPSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Dripstone
	public static final RegistrySupplier<Item> POLISHED_DRIPSTONE = ITEMS.register("polished_dripstone", () ->
            new BlockItem(CPlusBlocks.POLISHED_DRIPSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_DRIPSTONE_SLAB = ITEMS.register("polished_dripstone_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_DRIPSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_DRIPSTONE_STAIRS = ITEMS.register("polished_dripstone_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_DRIPSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_DRIPSTONE_WALL = ITEMS.register("polished_dripstone_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_DRIPSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_DRIPSTONE_GATE = ITEMS.register("polished_dripstone_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_DRIPSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Dripstone
	public static final RegistrySupplier<Item> SMOOTH_DRIPSTONE = ITEMS.register("smooth_dripstone", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DRIPSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_DRIPSTONE_SLAB = ITEMS.register("smooth_dripstone_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DRIPSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_DRIPSTONE_STAIRS = ITEMS.register("smooth_dripstone_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DRIPSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_DRIPSTONE_WALL = ITEMS.register("smooth_dripstone_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DRIPSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_DRIPSTONE_GATE = ITEMS.register("smooth_dripstone_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DRIPSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Dripstone Bricks
	public static final RegistrySupplier<Item> DRIPSTONE_BRICKS = ITEMS.register("dripstone_bricks", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_BRICKS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DRIPSTONE_BRICK_SLAB = ITEMS.register("dripstone_brick_slab", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DRIPSTONE_BRICK_STAIRS = ITEMS.register("dripstone_brick_stairs", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DRIPSTONE_BRICK_WALL = ITEMS.register("dripstone_brick_wall", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DRIPSTONE_BRICK_GATE = ITEMS.register("dripstone_brick_gate", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Dripstone
	public static final RegistrySupplier<Item> CUT_DRIPSTONE = ITEMS.register("cut_dripstone", () ->
            new BlockItem(CPlusBlocks.CUT_DRIPSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_DRIPSTONE_SLAB = ITEMS.register("cut_dripstone_slab", () ->
            new BlockItem(CPlusBlocks.CUT_DRIPSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_DRIPSTONE_STAIRS = ITEMS.register("cut_dripstone_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_DRIPSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_DRIPSTONE_WALL = ITEMS.register("cut_dripstone_wall", () ->
            new BlockItem(CPlusBlocks.CUT_DRIPSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_DRIPSTONE_GATE = ITEMS.register("cut_dripstone_gate", () ->
            new BlockItem(CPlusBlocks.CUT_DRIPSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Dripstone Tiles
	public static final RegistrySupplier<Item> DRIPSTONE_TILES = ITEMS.register("dripstone_tiles", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_TILES.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DRIPSTONE_TILE_SLAB = ITEMS.register("dripstone_tile_slab", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DRIPSTONE_TILE_STAIRS = ITEMS.register("dripstone_tile_stairs", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DRIPSTONE_TILE_WALL = ITEMS.register("dripstone_tile_wall", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DRIPSTONE_TILE_GATE = ITEMS.register("dripstone_tile_gate", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Dripstone Pillar
	public static final RegistrySupplier<Item> DRIPSTONE_PILLAR = ITEMS.register("dripstone_pillar", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DRIPSTONE_CORNER_PILLAR = ITEMS.register("dripstone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.DRIPSTONE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Dripstone
	public static final RegistrySupplier<Item> CHISELED_DRIPSTONE = ITEMS.register("chiseled_dripstone", () ->
            new BlockItem(CPlusBlocks.CHISELED_DRIPSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved Dripstone
	public static final RegistrySupplier<Item> CARVED_DRIPSTONE = ITEMS.register("carved_dripstone", () ->
            new BlockItem(CPlusBlocks.CARVED_DRIPSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));


// TUFF

	// Base
	public static final RegistrySupplier<Item> TUFF_SLAB = ITEMS.register("tuff_slab", () ->
            new BlockItem(CPlusBlocks.TUFF_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> TUFF_STAIRS = ITEMS.register("tuff_stairs", () ->
            new BlockItem(CPlusBlocks.TUFF_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> TUFF_WALL = ITEMS.register("tuff_wall", () ->
            new BlockItem(CPlusBlocks.TUFF_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> TUFF_GATE = ITEMS.register("tuff_gate", () ->
            new BlockItem(CPlusBlocks.TUFF_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Tuff
	public static final RegistrySupplier<Item> COBBLED_TUFF = ITEMS.register("cobbled_tuff", () ->
            new BlockItem(CPlusBlocks.COBBLED_TUFF.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_TUFF_SLAB = ITEMS.register("cobbled_tuff_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_TUFF_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_TUFF_STAIRS = ITEMS.register("cobbled_tuff_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_TUFF_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_TUFF_WALL = ITEMS.register("cobbled_tuff_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_TUFF_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_TUFF_GATE = ITEMS.register("cobbled_tuff_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_TUFF_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Tuff
	public static final RegistrySupplier<Item> POLISHED_TUFF = ITEMS.register("polished_tuff", () ->
            new BlockItem(CPlusBlocks.POLISHED_TUFF.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_TUFF_SLAB = ITEMS.register("polished_tuff_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_TUFF_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_TUFF_STAIRS = ITEMS.register("polished_tuff_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_TUFF_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_TUFF_WALL = ITEMS.register("polished_tuff_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_TUFF_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_TUFF_GATE = ITEMS.register("polished_tuff_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_TUFF_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Tuff
	public static final RegistrySupplier<Item> SMOOTH_TUFF = ITEMS.register("smooth_tuff", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TUFF.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_TUFF_SLAB = ITEMS.register("smooth_tuff_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TUFF_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_TUFF_STAIRS = ITEMS.register("smooth_tuff_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TUFF_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_TUFF_WALL = ITEMS.register("smooth_tuff_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TUFF_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_TUFF_GATE = ITEMS.register("smooth_tuff_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TUFF_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Tuff Bricks
	public static final RegistrySupplier<Item> TUFF_BRICKS = ITEMS.register("tuff_bricks", () ->
            new BlockItem(CPlusBlocks.TUFF_BRICKS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> TUFF_BRICK_SLAB = ITEMS.register("tuff_brick_slab", () ->
            new BlockItem(CPlusBlocks.TUFF_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> TUFF_BRICk_STAIRS = ITEMS.register("tuff_brick_stairs", () ->
            new BlockItem(CPlusBlocks.TUFF_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> TUFF_BRICK_WALL = ITEMS.register("tuff_brick_wall", () ->
            new BlockItem(CPlusBlocks.TUFF_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> TUFF_BRICK_GATE = ITEMS.register("tuff_brick_gate", () ->
            new BlockItem(CPlusBlocks.TUFF_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Tuff
	public static final RegistrySupplier<Item> CUT_TUFF = ITEMS.register("cut_tuff", () ->
            new BlockItem(CPlusBlocks.CUT_TUFF.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_TUFF_SLAB = ITEMS.register("cut_tuff_slab", () ->
            new BlockItem(CPlusBlocks.CUT_TUFF_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_TUFF_STAIRS = ITEMS.register("cut_tuff_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_TUFF_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_TUFF_WALL = ITEMS.register("cut_tuff_wall", () ->
            new BlockItem(CPlusBlocks.CUT_TUFF_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_TUFF_GATE = ITEMS.register("cut_tuff_gate", () ->
            new BlockItem(CPlusBlocks.CUT_TUFF_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Tuff Tiles
	public static final RegistrySupplier<Item> TUFF_TILES = ITEMS.register("tuff_tiles", () ->
            new BlockItem(CPlusBlocks.TUFF_TILES.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> TUFF_TILE_SLAB = ITEMS.register("tuff_tile_slab", () ->
            new BlockItem(CPlusBlocks.TUFF_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> TUFF_TILE_STAIRS = ITEMS.register("tuff_tile_stairs", () ->
            new BlockItem(CPlusBlocks.TUFF_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> TUFF_TILE_WALL = ITEMS.register("tuff_tile_wall", () ->
            new BlockItem(CPlusBlocks.TUFF_TILE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> TUFF_TILE_GATE = ITEMS.register("tuff_tile_gate", () ->
            new BlockItem(CPlusBlocks.TUFF_TILE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Tuff Pillar
	public static final RegistrySupplier<Item> TUFF_PILLAR = ITEMS.register("tuff_pillar", () ->
            new BlockItem(CPlusBlocks.TUFF_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> TUFF_CORNER_PILLAR = ITEMS.register("tuff_corner_pillar", () ->
            new BlockItem(CPlusBlocks.TUFF_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Tuff
	public static final RegistrySupplier<Item> CHISELED_TUFF = ITEMS.register("chiseled_tuff", () ->
            new BlockItem(CPlusBlocks.CHISELED_TUFF.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved Tuff
	public static final RegistrySupplier<Item> CARVED_TUFF = ITEMS.register("carved_tuff", () ->
            new BlockItem(CPlusBlocks.CARVED_TUFF.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));


// DEEPSLATE

	// Base
	public static final RegistrySupplier<Item> DEEPSLATE_SLAB = ITEMS.register("deepslate_slab", () ->
            new BlockItem(CPlusBlocks.DEEPSLATE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DEEPSLATE_STAIRS = ITEMS.register("deepslate_stairs", () ->
            new BlockItem(CPlusBlocks.DEEPSLATE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DEEPSLATE_WALL = ITEMS.register("deepslate_wall", () ->
            new BlockItem(CPlusBlocks.DEEPSLATE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DEEPSLATE_GATE = ITEMS.register("deepslate_gate", () ->
            new BlockItem(CPlusBlocks.DEEPSLATE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Deepslate
	public static final RegistrySupplier<Item> COBBLED_DEEPSLATE_GATE = ITEMS.register("cobbled_deepslate_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_DEEPSLATE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Deepslate
	public static final RegistrySupplier<Item> POLISHED_DEEPSLATE_GATE = ITEMS.register("polished_deepslate_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_DEEPSLATE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Deepslate
	public static final RegistrySupplier<Item> SMOOTH_DEEPSLATE = ITEMS.register("smooth_deepslate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DEEPSLATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_DEEPSLATE_SLAB = ITEMS.register("smooth_deepslate_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DEEPSLATE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_DEEPSLATE_STAIRS = ITEMS.register("smooth_deepslate_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DEEPSLATE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_DEEPSLATE_WALL = ITEMS.register("smooth_deepslate_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DEEPSLATE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_DEEPSLATE_GATE = ITEMS.register("smooth_deepslate_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DEEPSLATE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Deepslate Bricks
	public static final RegistrySupplier<Item> DEEPSLATE_BRICK_GATE = ITEMS.register("deepslate_brick_gate", () ->
            new BlockItem(CPlusBlocks.DEEPSLATE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Deepslate Bricks
	public static final RegistrySupplier<Item> CRACKED_DEEPSLATE_BRICK_SLAB = ITEMS.register("cracked_deepslate_brick_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_DEEPSLATE_BRICK_STAIRS = ITEMS.register("cracked_deepslate_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_DEEPSLATE_BRICK_WALL = ITEMS.register("cracked_deepslate_brick_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_DEEPSLATE_BRICK_GATE = ITEMS.register("cracked_deepslate_brick_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Deepslate
	public static final RegistrySupplier<Item> CUT_DEEPSLATE = ITEMS.register("cut_deepslate", () ->
            new BlockItem(CPlusBlocks.CUT_DEEPSLATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_DEEPSLATE_SLAB = ITEMS.register("cut_deepslate_slab", () ->
            new BlockItem(CPlusBlocks.CUT_DEEPSLATE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_DEEPSLATE_STAIRS = ITEMS.register("cut_deepslate_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_DEEPSLATE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_DEEPSLATE_WALL = ITEMS.register("cut_deepslate_wall", () ->
            new BlockItem(CPlusBlocks.CUT_DEEPSLATE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_DEEPSLATE_GATE = ITEMS.register("cut_deepslate_gate", () ->
            new BlockItem(CPlusBlocks.CUT_DEEPSLATE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Deepslate Tiles
	public static final RegistrySupplier<Item> DEEPSLATE_TILE_GATE = ITEMS.register("deepslate_tile_gate", () ->
            new BlockItem(CPlusBlocks.DEEPSLATE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Deepslate Tiles
	public static final RegistrySupplier<Item> CRACKED_DEEPSLATE_TILE_SLAB = ITEMS.register("cracked_deepslate_tile_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_DEEPSLATE_TILE_STAIRS = ITEMS.register("cracked_deepslate_tile_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_DEEPSLATE_TILE_WALL = ITEMS.register("cracked_deepslate_tile_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_DEEPSLATE_TILE_GATE = ITEMS.register("cracked_deepslate_tile_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_DEEPSLATE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Deepslate Pillar
	public static final RegistrySupplier<Item> DEEPSLATE_PILLAR = ITEMS.register("deepslate_pillar", () ->
            new BlockItem(CPlusBlocks.DEEPSLATE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> DEEPSLATE_CORNER_PILLAR = ITEMS.register("deepslate_corner_pillar", () ->
            new BlockItem(CPlusBlocks.DEEPSLATE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved Deepslate
	public static final RegistrySupplier<Item> CARVED_DEEPSLATE = ITEMS.register("carved_deepslate", () ->
            new BlockItem(CPlusBlocks.CARVED_DEEPSLATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));


// BLACKSTONE

	// Base
	public static final RegistrySupplier<Item> BLACKSTONE_GATE = ITEMS.register("blackstone_gate", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Blackstone
	public static final RegistrySupplier<Item> COBBLED_BLACKSTONE = ITEMS.register("cobbled_blackstone", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACKSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_BLACKSTONE_SLAB = ITEMS.register("cobbled_blackstone_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACKSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_BLACKSTONE_STAIRS = ITEMS.register("cobbled_blackstone_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACKSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_BLACKSTONE_WALL = ITEMS.register("cobbled_blackstone_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACKSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_BLACKSTONE_GATE = ITEMS.register("cobbled_blackstone_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACKSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Blackstone
	public static final RegistrySupplier<Item> POLISHED_BLACKSTONE_GATE = ITEMS.register("polished_blackstone_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACKSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Blackstone
	public static final RegistrySupplier<Item> SMOOTH_BLACKSTONE = ITEMS.register("smooth_blackstone", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACKSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLACKSTONE_SLAB = ITEMS.register("smooth_blackstone_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACKSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLACKSTONE_STAIRS = ITEMS.register("smooth_blackstone_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACKSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLACKSTONE_WALL = ITEMS.register("smooth_blackstone_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACKSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLACKSTONE_GATE = ITEMS.register("smooth_blackstone_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACKSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Blackstone Bricks
	public static final RegistrySupplier<Item> BLACKSTONE_BRICK_GATE = ITEMS.register("blackstone_brick_gate", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Blackstone Bricks
	public static final RegistrySupplier<Item> MOSSY_BLACKSTONE_BRICKS = ITEMS.register("mossy_blackstone_bricks", () ->
            new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICKS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_BLACKSTONE_BRICK_SLAB = ITEMS.register("mossy_blackstone_brick_slab", () ->
            new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_BLACKSTONE_BRICK_STAIRS = ITEMS.register("mossy_blackstone_brick_stairs", () ->
            new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_BLACKSTONE_BRICK_WALL = ITEMS.register("mossy_blackstone_brick_wall", () ->
            new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_BLACKSTONE_BRICK_GATE = ITEMS.register("mossy_blackstone_brick_gate", () ->
            new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Blackstone Bricks
	public static final RegistrySupplier<Item> CRACKED_BLACKSTONE_BRICK_SLAB = ITEMS.register("cracked_blackstone_brick_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_BLACKSTONE_BRICK_STAIRS = ITEMS.register("cracked_blackstone_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_BLACKSTONE_BRICK_WALL = ITEMS.register("cracked_blackstone_brick_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_BLACKSTONE_BRICK_GATE = ITEMS.register("cracked_blackstone_brick_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Blackstone
	public static final RegistrySupplier<Item> CUT_BLACKSTONE = ITEMS.register("cut_blackstone", () ->
            new BlockItem(CPlusBlocks.CUT_BLACKSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLACKSTONE_SLAB = ITEMS.register("cut_blackstone_slab", () ->
            new BlockItem(CPlusBlocks.CUT_BLACKSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLACKSTONE_STAIRS = ITEMS.register("cut_blackstone_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_BLACKSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLACKSTONE_WALL = ITEMS.register("cut_blackstone_wall", () ->
            new BlockItem(CPlusBlocks.CUT_BLACKSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLACKSTONE_GATE = ITEMS.register("cut_blackstone_gate", () ->
            new BlockItem(CPlusBlocks.CUT_BLACKSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Blackstone Tiles
	public static final RegistrySupplier<Item> BLACKSTONE_TILES = ITEMS.register("blackstone_tiles", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_TILES.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> BLACKSTONE_TILE_SLAB = ITEMS.register("blackstone_tile_slab", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> BLACKSTONE_TILE_STAIRS = ITEMS.register("blackstone_tile_stairs", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> BLACKSTONE_TILE_WALL = ITEMS.register("blackstone_tile_wall", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> BLACKSTONE_TILE_GATE = ITEMS.register("blackstone_tile_gate", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Blackstone Pillar
	public static final RegistrySupplier<Item> BLACKSTONE_PILLAR = ITEMS.register("blackstone_pillar", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> BLACKSTONE_CORNER_PILLAR = ITEMS.register("blackstone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.BLACKSTONE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Blackstone Pillar
	public static final RegistrySupplier<Item> MOSSY_BLACKSTONE_PILLAR = ITEMS.register("mossy_blackstone_pillar", () ->
            new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> MOSSY_BLACKSTONE_CORNER_PILLAR = ITEMS.register("mossy_blackstone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.MOSSY_BLACKSTONE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Blackstone Pillar
	public static final RegistrySupplier<Item> CRACKED_BLACKSTONE_PILLAR = ITEMS.register("cracked_blackstone_pillar", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_BLACKSTONE_CORNER_PILLAR = ITEMS.register("cracked_blackstone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLACKSTONE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Blackstone
	public static final RegistrySupplier<Item> CHISELED_BLACKSTONE = ITEMS.register("chiseled_blackstone", () ->
            new BlockItem(CPlusBlocks.CHISELED_BLACKSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Chiseled Blackstone
	public static final RegistrySupplier<Item> MOSSY_CHISELED_BLACKSTONE = ITEMS.register("mossy_chiseled_blackstone", () ->
            new BlockItem(CPlusBlocks.MOSSY_CHISELED_BLACKSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Chiseled Blackstone
	public static final RegistrySupplier<Item> CRACKED_CHISELED_BLACKSTONE = ITEMS.register("cracked_chiseled_blackstone", () ->
            new BlockItem(CPlusBlocks.CRACKED_CHISELED_BLACKSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Mossy Carved Blackstone
	public static final RegistrySupplier<Item> MOSSY_CARVED_BLACKSTONE = ITEMS.register("mossy_carved_blackstone", () ->
            new BlockItem(CPlusBlocks.MOSSY_CARVED_BLACKSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cracked Carved Blackstone
	public static final RegistrySupplier<Item> CRACKED_CARVED_BLACKSTONE = ITEMS.register("cracked_carved_blackstone", () ->
            new BlockItem(CPlusBlocks.CRACKED_CARVED_BLACKSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));


// SANDSTONE

	// Base
	public static final RegistrySupplier<Item> SANDSTONE_GATE = ITEMS.register("sandstone_gate", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Sandstone
	public static final RegistrySupplier<Item> COBBLED_SANDSTONE = ITEMS.register("cobbled_sandstone", () ->
            new BlockItem(CPlusBlocks.COBBLED_SANDSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_SANDSTONE_SLAB = ITEMS.register("cobbled_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_SANDSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_SANDSTONE_STAIRS = ITEMS.register("cobbled_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_SANDSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_SANDSTONE_WALL = ITEMS.register("cobbled_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_SANDSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_SANDSTONE_GATE = ITEMS.register("cobbled_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_SANDSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Sandstone
	public static final RegistrySupplier<Item> POLISHED_SANDSTONE = ITEMS.register("polished_sandstone", () ->
            new BlockItem(CPlusBlocks.POLISHED_SANDSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_SANDSTONE_SLAB = ITEMS.register("polished_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_SANDSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_SANDSTONE_STAIRS = ITEMS.register("polished_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_SANDSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_SANDSTONE_WALL = ITEMS.register("polished_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_SANDSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_SANDSTONE_GATE = ITEMS.register("polished_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_SANDSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Sandstone
	public static final RegistrySupplier<Item> SMOOTH_SANDSTONE_WALL = ITEMS.register("smooth_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_SANDSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_SANDSTONE_GATE = ITEMS.register("smooth_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_SANDSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Sandstone Bricks
	public static final RegistrySupplier<Item> SANDSTONE_BRICKS = ITEMS.register("sandstone_bricks", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_BRICKS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SANDSTONE_BRICK_SLAB = ITEMS.register("sandstone_brick_slab", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SANDSTONE_BRICK_STAIRS = ITEMS.register("sandstone_brick_stairs", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SANDSTONE_BRICK_WALL = ITEMS.register("sandstone_brick_wall", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SANDSTONE_BRICK_GATE = ITEMS.register("sandstone_brick_gate", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Sandstone
	public static final RegistrySupplier<Item> CUT_SANDSTONE_STAIRS = ITEMS.register("cut_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_SANDSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_SANDSTONE_WALL = ITEMS.register("cut_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.CUT_SANDSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_SANDSTONE_GATE = ITEMS.register("cut_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.CUT_SANDSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Sandstone Tiles
	public static final RegistrySupplier<Item> SANDSTONE_TILES = ITEMS.register("sandstone_tiles", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_TILES.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SANDSTONE_TILE_SLAB = ITEMS.register("sandstone_tile_slab", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SANDSTONE_TILE_STAIRS = ITEMS.register("sandstone_tile_stairs", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SANDSTONE_TILE_WALL = ITEMS.register("sandstone_tile_wall", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SANDSTONE_TILE_GATE = ITEMS.register("sandstone_tile_gate", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Sandstone Pillar
	public static final RegistrySupplier<Item> SANDSTONE_PILLAR = ITEMS.register("sandstone_pillar", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SANDSTONE_CORNER_PILLAR = ITEMS.register("sandstone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.SANDSTONE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Sandstone
	public static final RegistrySupplier<Item> CHISELED_SANDSTONE = ITEMS.register("chiseled_sandstone", () ->
            new BlockItem(CPlusBlocks.CHISELED_SANDSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));


// RED SANDSTONE

	// Base
	public static final RegistrySupplier<Item> RED_SANDSTONE_GATE = ITEMS.register("red_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Red Sandstone
	public static final RegistrySupplier<Item> COBBLED_RED_SANDSTONE = ITEMS.register("cobbled_red_sandstone", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_SANDSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_RED_SANDSTONE_SLAB = ITEMS.register("cobbled_red_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_SANDSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_RED_SANDSTONE_STAIRS = ITEMS.register("cobbled_red_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_SANDSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_RED_SANDSTONE_WALL = ITEMS.register("cobbled_red_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_SANDSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_RED_SANDSTONE_GATE = ITEMS.register("cobbled_red_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_SANDSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Red Sandstone
	public static final RegistrySupplier<Item> POLISHED_RED_SANDSTONE = ITEMS.register("polished_red_sandstone", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_SANDSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_RED_SANDSTONE_SLAB = ITEMS.register("polished_red_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_SANDSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_RED_SANDSTONE_STAIRS = ITEMS.register("polished_red_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_SANDSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_RED_SANDSTONE_WALL = ITEMS.register("polished_red_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_SANDSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_RED_SANDSTONE_GATE = ITEMS.register("polished_red_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_SANDSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Red Sandstone
	public static final RegistrySupplier<Item> SMOOTH_RED_SANDSTONE_WALL = ITEMS.register("smooth_red_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_SANDSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_RED_SANDSTONE_GATE = ITEMS.register("smooth_red_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_SANDSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Red Sandstone Bricks
	public static final RegistrySupplier<Item> RED_SANDSTONE_BRICKS = ITEMS.register("red_sandstone_bricks", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_BRICKS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> RED_SANDSTONE_BRICK_SLAB = ITEMS.register("red_sandstone_brick_slab", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> RED_SANDSTONE_BRICK_STAIRS = ITEMS.register("red_sandstone_brick_stairs", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> RED_SANDSTONE_BRICK_WALL = ITEMS.register("red_sandstone_brick_wall", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> RED_SANDSTONE_BRICK_GATE = ITEMS.register("red_sandstone_brick_gate", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Red Sandstone
	public static final RegistrySupplier<Item> CUT_RED_SANDSTONE_STAIRS = ITEMS.register("cut_red_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_RED_SANDSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_RED_SANDSTONE_WALL = ITEMS.register("cut_red_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.CUT_RED_SANDSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_RED_SANDSTONE_GATE = ITEMS.register("cut_red_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.CUT_RED_SANDSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Red Sandstone Tiles
	public static final RegistrySupplier<Item> RED_SANDSTONE_TILES = ITEMS.register("red_sandstone_tiles", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_TILES.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> RED_SANDSTONE_TILE_SLAB = ITEMS.register("red_sandstone_tile_slab", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> RED_SANDSTONE_TILE_STAIRS = ITEMS.register("red_sandstone_tile_stairs", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> RED_SANDSTONE_TILE_WALL = ITEMS.register("red_sandstone_tile_wall", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> RED_SANDSTONE_TILE_GATE = ITEMS.register("red_sandstone_tile_gate", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Red Sandstone Pillar
	public static final RegistrySupplier<Item> RED_SANDSTONE_PILLAR = ITEMS.register("red_sandstone_pillar", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> RED_SANDSTONE_CORNER_PILLAR = ITEMS.register("red_sandstone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.RED_SANDSTONE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Red Sandstone
	public static final RegistrySupplier<Item> CHISELED_RED_SANDSTONE = ITEMS.register("chiseled_red_sandstone", () ->
            new BlockItem(CPlusBlocks.CHISELED_RED_SANDSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));


// SOUL SANDSTONE

	// Base
	public static final RegistrySupplier<Item> SOUL_SANDSTONE = ITEMS.register("soul_sandstone", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SOUL_SANDSTONE_SLAB = ITEMS.register("soul_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SOUL_SANDSTONE_STAIRS = ITEMS.register("soul_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SOUL_SANDSTONE_WALL = ITEMS.register("soul_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SOUL_SANDSTONE_GATE = ITEMS.register("soul_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled Soul Sandstone
	public static final RegistrySupplier<Item> COBBLED_SOUL_SANDSTONE = ITEMS.register("cobbled_soul_sandstone", () ->
            new BlockItem(CPlusBlocks.COBBLED_SOUL_SANDSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_SOUL_SANDSTONE_SLAB = ITEMS.register("cobbled_soul_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_SOUL_SANDSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_SOUL_SANDSTONE_STAIRS = ITEMS.register("cobbled_soul_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_SOUL_SANDSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_SOUL_SANDSTONE_WALL = ITEMS.register("cobbled_soul_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_SOUL_SANDSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_SOUL_SANDSTONE_GATE = ITEMS.register("cobbled_soul_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_SOUL_SANDSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished Soul Sandstone
	public static final RegistrySupplier<Item> POLISHED_SOUL_SANDSTONE = ITEMS.register("polished_soul_sandstone", () ->
            new BlockItem(CPlusBlocks.POLISHED_SOUL_SANDSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_SOUL_SANDSTONE_SLAB = ITEMS.register("polished_soul_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_SOUL_SANDSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_SOUL_SANDSTONE_STAIRS = ITEMS.register("polished_soul_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_SOUL_SANDSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_SOUL_SANDSTONE_WALL = ITEMS.register("polished_soul_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_SOUL_SANDSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_SOUL_SANDSTONE_GATE = ITEMS.register("polished_soul_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_SOUL_SANDSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth Soul Sandstone
	public static final RegistrySupplier<Item> SMOOTH_SOUL_SANDSTONE = ITEMS.register("smooth_soul_sandstone", () ->
            new BlockItem(CPlusBlocks.SMOOTH_SOUL_SANDSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_SOUL_SANDSTONE_SLAB = ITEMS.register("smooth_soul_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_SOUL_SANDSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_SOUL_SANDSTONE_STAIRS = ITEMS.register("smooth_soul_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_SOUL_SANDSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_SOUL_SANDSTONE_WALL = ITEMS.register("smooth_soul_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_SOUL_SANDSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_SOUL_SANDSTONE_GATE = ITEMS.register("smooth_soul_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_SOUL_SANDSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Soul Sandstone Bricks
	public static final RegistrySupplier<Item> SOUL_SANDSTONE_BRICKS = ITEMS.register("soul_sandstone_bricks", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_BRICKS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SOUL_SANDSTONE_BRICK_SLAB = ITEMS.register("soul_sandstone_brick_slab", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SOUL_SANDSTONE_BRICK_STAIRS = ITEMS.register("soul_sandstone_brick_stairs", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SOUL_SANDSTONE_BRICK_WALL = ITEMS.register("soul_sandstone_brick_wall", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SOUL_SANDSTONE_BRICK_GATE = ITEMS.register("soul_sandstone_brick_gate", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut Soul Sandstone
	public static final RegistrySupplier<Item> CUT_SOUL_SANDSTONE = ITEMS.register("cut_soul_sandstone", () ->
            new BlockItem(CPlusBlocks.CUT_SOUL_SANDSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_SOUL_SANDSTONE_SLAB = ITEMS.register("cut_soul_sandstone_slab", () ->
            new BlockItem(CPlusBlocks.CUT_SOUL_SANDSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_SOUL_SANDSTONE_STAIRS = ITEMS.register("cut_soul_sandstone_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_SOUL_SANDSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_SOUL_SANDSTONE_WALL = ITEMS.register("cut_soul_sandstone_wall", () ->
            new BlockItem(CPlusBlocks.CUT_SOUL_SANDSTONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_SOUL_SANDSTONE_GATE = ITEMS.register("cut_soul_sandstone_gate", () ->
            new BlockItem(CPlusBlocks.CUT_SOUL_SANDSTONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Soul Sandstone Tiles
	public static final RegistrySupplier<Item> SOUL_SANDSTONE_TILES = ITEMS.register("soul_sandstone_tiles", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_TILES.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SOUL_SANDSTONE_TILE_SLAB = ITEMS.register("soul_sandstone_tile_slab", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SOUL_SANDSTONE_TILE_STAIRS = ITEMS.register("soul_sandstone_tile_stairs", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SOUL_SANDSTONE_TILE_WALL = ITEMS.register("soul_sandstone_tile_wall", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SOUL_SANDSTONE_TILE_GATE = ITEMS.register("soul_sandstone_tile_gate", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Soul Sandstone Pillar
	public static final RegistrySupplier<Item> SOUL_SANDSTONE_PILLAR = ITEMS.register("soul_sandstone_pillar", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SOUL_SANDSTONE_CORNER_PILLAR = ITEMS.register("soul_sandstone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.SOUL_SANDSTONE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled Soul Sandstone
	public static final RegistrySupplier<Item> CHISELED_SOUL_SANDSTONE = ITEMS.register("chiseled_soul_sandstone", () ->
            new BlockItem(CPlusBlocks.CHISELED_SOUL_SANDSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Caved Soul Sandstone
	public static final RegistrySupplier<Item> CARVED_SOUL_SANDSTONE = ITEMS.register("carved_soul_sandstone", () ->
            new BlockItem(CPlusBlocks.CARVED_SOUL_SANDSTONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));


// QUARTZ

	// Base
	public static final RegistrySupplier<Item> QUARTZ_WALL = ITEMS.register("quartz_wall", () ->
            new BlockItem(CPlusBlocks.QUARTZ_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> QUARTZ_GATE = ITEMS.register("quartz_gate", () ->
            new BlockItem(CPlusBlocks.QUARTZ_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Polished Quartz
	public static final RegistrySupplier<Item> POLISHED_QUARTZ = ITEMS.register("polished_quartz", () ->
            new BlockItem(CPlusBlocks.POLISHED_QUARTZ.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_QUARTZ_SLAB = ITEMS.register("polished_quartz_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_QUARTZ_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_QUARTZ_STAIRS = ITEMS.register("polished_quartz_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_QUARTZ_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_QUARTZ_WALL = ITEMS.register("polished_quartz_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_QUARTZ_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_QUARTZ_GATE = ITEMS.register("polished_quartz_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_QUARTZ_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Smooth Quartz
	public static final RegistrySupplier<Item> SMOOTH_QUARTZ_WALL = ITEMS.register("smooth_quartz_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_QUARTZ_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_QUARTZ_GATE = ITEMS.register("smooth_quartz_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_QUARTZ_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Quartz Bricks
	public static final RegistrySupplier<Item> QUARTZ_BRICK_SLAB = ITEMS.register("quartz_brick_slab", () ->
            new BlockItem(CPlusBlocks.QUARTZ_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> QUARTZ_BRICK_STAIRS = ITEMS.register("quartz_brick_stairs", () ->
            new BlockItem(CPlusBlocks.QUARTZ_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> QUARTZ_BRICK_WALL = ITEMS.register("quartz_brick_wall", () ->
            new BlockItem(CPlusBlocks.QUARTZ_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> QUARTZ_BRICK_GATE = ITEMS.register("quartz_brick_gate", () ->
            new BlockItem(CPlusBlocks.QUARTZ_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Quartz
	public static final RegistrySupplier<Item> CUT_QUARTZ = ITEMS.register("cut_quartz", () ->
            new BlockItem(CPlusBlocks.CUT_QUARTZ.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_QUARTZ_SLAB = ITEMS.register("cut_quartz_slab", () ->
            new BlockItem(CPlusBlocks.CUT_QUARTZ_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_QUARTZ_STAIRS = ITEMS.register("cut_quartz_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_QUARTZ_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_QUARTZ_WALL = ITEMS.register("cut_quartz_wall", () ->
            new BlockItem(CPlusBlocks.CUT_QUARTZ_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_QUARTZ_GATE = ITEMS.register("cut_quartz_gate", () ->
            new BlockItem(CPlusBlocks.CUT_QUARTZ_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Quartz Tiles
	public static final RegistrySupplier<Item> QUARTZ_TILES = ITEMS.register("quartz_tiles", () ->
            new BlockItem(CPlusBlocks.QUARTZ_TILES.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> QUARTZ_TILE_SLAB = ITEMS.register("quartz_tile_slab", () ->
            new BlockItem(CPlusBlocks.QUARTZ_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> QUARTZ_TILE_STAIRS = ITEMS.register("quartz_tile_stairs", () ->
            new BlockItem(CPlusBlocks.QUARTZ_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> QUARTZ_TILE_WALL = ITEMS.register("quartz_tile_wall", () ->
            new BlockItem(CPlusBlocks.QUARTZ_TILE_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> QUARTZ_TILE_GATE = ITEMS.register("quartz_tile_gate", () ->
            new BlockItem(CPlusBlocks.QUARTZ_TILE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Quartz Pillar
	public static final RegistrySupplier<Item> QUARTZ_CORNER_PILLAR = ITEMS.register("quartz_corner_pillar", () ->
            new BlockItem(CPlusBlocks.QUARTZ_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Carved Quartz
	public static final RegistrySupplier<Item> CARVED_QUARTZ = ITEMS.register("carved_quartz", () ->
            new BlockItem(CPlusBlocks.CARVED_QUARTZ.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));


// NETHERRACK

	// Base

	// Cobbled Netherrack

	// Polished Netherrack

	// Smooth Netherrack

	// Netherrack Bricks

	// Cracked Netherrack Bricks
	public static final RegistrySupplier<Item> CRACKED_NETHER_BRICK_SLAB = ITEMS.register("cracked_nether_brick_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_NETHER_BRICK_STAIRS = ITEMS.register("cracked_nether_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_NETHER_BRICK_WALL = ITEMS.register("cracked_nether_brick_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_NETHER_BRICK_FENCE_GATE = ITEMS.register("cracked_nether_brick_fence_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_NETHER_BRICK_FENCE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Netherrack

	// Netherrack Tiles

	// Netherrack Pillar
	public static final RegistrySupplier<Item> NETHER_BRICK_PILLAR = ITEMS.register("nether_brick_pillar", () ->
            new BlockItem(CPlusBlocks.NETHER_BRICK_PILLAR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Chiseled Netherrack
	public static final RegistrySupplier<Item> CHISELED_NETHER_BRICKS = ITEMS.register("chiseled_nether_bricks", () ->
            new BlockItem(CPlusBlocks.CHISELED_NETHER_BRICKS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));


// CRIMSON WART

	// Base

	// Polished Crimson Wart

	// Smooth Crimson Wart

	// Crimson Wart Bricks
	public static final RegistrySupplier<Item> RED_NETHER_BRICK_FENCE_GATE = ITEMS.register("red_nether_brick_fence_gate", () ->
            new BlockItem(CPlusBlocks.RED_NETHER_BRICK_FENCE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Crimson Wart

	// Crimson Wart Tiles

	// Crimson Wart Pillar
	public static final RegistrySupplier<Item> RED_NETHER_BRICK_PILLAR = ITEMS.register("red_nether_brick_pillar", () ->
            new BlockItem(CPlusBlocks.RED_NETHER_BRICK_PILLAR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Chiseled Crimson Wart
	public static final RegistrySupplier<Item> CHISELED_RED_NETHER_BRICKS = ITEMS.register("chiseled_red_nether_bricks", () ->
            new BlockItem(CPlusBlocks.CHISELED_RED_NETHER_BRICKS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Carved Crimson Wart
	public static final RegistrySupplier<Item> CARVED_RED_NETHER_BRICKS = ITEMS.register("carved_red_nether_bricks", () ->
            new BlockItem(CPlusBlocks.CARVED_RED_NETHER_BRICKS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));


// WARPED WART

	// Base

	// Polished Warped Wart

	// Smooth Warped Wart

	// Warped Wart Bricks
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICKS = ITEMS.register("blue_nether_bricks", () ->
            new BlockItem(CPlusBlocks.BLUE_NETHER_BRICKS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICK_SLAB = ITEMS.register("blue_nether_brick_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_NETHER_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICK_STAIRS = ITEMS.register("blue_nether_brick_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_NETHER_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICK_WALL = ITEMS.register("blue_nether_brick_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_NETHER_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICK_FENCE_GATE = ITEMS.register("blue_nether_brick_fence_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_NETHER_BRICK_FENCE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cracked Warped Wart Bricks
	public static final RegistrySupplier<Item> CRACKED_BLUE_NETHER_BRICKS = ITEMS.register("cracked_blue_nether_bricks", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLUE_NETHER_BRICKS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_BLUE_NETHER_BRICK_SLAB = ITEMS.register("cracked_blue_nether_brick_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_BLUE_NETHER_BRICK_STAIRS = ITEMS.register("cracked_blue_nether_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_BLUE_NETHER_BRICK_WALL = ITEMS.register("cracked_blue_nether_brick_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_BLUE_NETHER_BRICK_FENCE_GATE = ITEMS.register("cracked_blue_nether_brick_fence_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Warped Wart

	// Warped Wart Tiles

	// Warped Wart Pillar
	public static final RegistrySupplier<Item> BLUE_NETHER_BRICK_PILLAR = ITEMS.register("blue_nether_brick_pillar", () ->
            new BlockItem(CPlusBlocks.BLUE_NETHER_BRICK_PILLAR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Chiseled Warped Wart
	public static final RegistrySupplier<Item> CHISELED_BLUE_NETHER_BRICKS = ITEMS.register("chiseled_blue_nether_bricks", () ->
            new BlockItem(CPlusBlocks.CHISELED_BLUE_NETHER_BRICKS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Carved Warted Wart
	public static final RegistrySupplier<Item> CARVED_BLUE_NETHER_BRICKS = ITEMS.register("carved_blue_nether_bricks", () ->
            new BlockItem(CPlusBlocks.CARVED_BLUE_NETHER_BRICKS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));


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
	public static final RegistrySupplier<Item> PRISMARINE_GATE = ITEMS.register("prismarine_gate", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Polished Prismarine
	public static final RegistrySupplier<Item> POLISHED_PRISMARINE = ITEMS.register("polished_prismarine", () ->
            new BlockItem(CPlusBlocks.POLISHED_PRISMARINE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PRISMARINE_SLAB = ITEMS.register("polished_prismarine_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_PRISMARINE_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PRISMARINE_STAIRS = ITEMS.register("polished_prismarine_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_PRISMARINE_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PRISMARINE_WALL = ITEMS.register("polished_prismarine_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_PRISMARINE_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PRISMARINE_GATE = ITEMS.register("polished_prismarine_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_PRISMARINE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Smooth Prismarine
	public static final RegistrySupplier<Item> SMOOTH_PRISMARINE = ITEMS.register("smooth_prismarine", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PRISMARINE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PRISMARINE_SLAB = ITEMS.register("smooth_prismarine_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PRISMARINE_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PRISMARINE_STAIRS = ITEMS.register("smooth_prismarine_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PRISMARINE_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PRISMARINE_WALL = ITEMS.register("smooth_prismarine_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PRISMARINE_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PRISMARINE_GATE = ITEMS.register("smooth_prismarine_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PRISMARINE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Prismarine Bricks
	public static final RegistrySupplier<Item> PRISMARINE_BRICK_WALL = ITEMS.register("prismarine_brick_wall", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> PRISMARINE_BRICK_GATE = ITEMS.register("prismarine_brick_gate", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Prismarine
	public static final RegistrySupplier<Item> CUT_PRISMARINE = ITEMS.register("cut_prismarine", () ->
            new BlockItem(CPlusBlocks.CUT_PRISMARINE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_PRISMARINE_SLAB = ITEMS.register("cut_prismarine_slab", () ->
            new BlockItem(CPlusBlocks.CUT_PRISMARINE_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_PRISMARINE_STAIRS = ITEMS.register("cut_prismarine_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_PRISMARINE_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_PRISMARINE_WALL = ITEMS.register("cut_prismarine_wall", () ->
            new BlockItem(CPlusBlocks.CUT_PRISMARINE_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_PRISMARINE_GATE = ITEMS.register("cut_prismarine_gate", () ->
            new BlockItem(CPlusBlocks.CUT_PRISMARINE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Prismarine Tiles
	public static final RegistrySupplier<Item> PRISMARINE_TILES = ITEMS.register("prismarine_tiles", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_TILES.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> PRISMARINE_TILE_SLAB = ITEMS.register("prismarine_tile_slab", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> PRISMARINE_TILE_STAIRS = ITEMS.register("prismarine_tile_stairs", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> PRISMARINE_TILE_WALL = ITEMS.register("prismarine_tile_wall", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> PRISMARINE_TILE_GATE = ITEMS.register("prismarine_tile_gate", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Prismarine Pillar
	public static final RegistrySupplier<Item> PRISMARINE_PILLAR = ITEMS.register("prismarine_pillar", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_PILLAR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> PRISMARINE_CORNER_PILLAR = ITEMS.register("prismarine_corner_pillar", () ->
            new BlockItem(CPlusBlocks.PRISMARINE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Chiseled Prismarine
	public static final RegistrySupplier<Item> CHISELED_PRISMARINE = ITEMS.register("chiseled_prismarine", () ->
            new BlockItem(CPlusBlocks.CHISELED_PRISMARINE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Carved Prismarine
	public static final RegistrySupplier<Item> CARVED_PRISMARINE = ITEMS.register("carved_prismarine", () ->
            new BlockItem(CPlusBlocks.CARVED_PRISMARINE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));


// DARK PRISMARINE

	// Base
	public static final RegistrySupplier<Item> DARK_PRISMARINE_WALL = ITEMS.register("dark_prismarine_wall", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> DARK_PRISMARINE_GATE = ITEMS.register("dark_prismarine_gate", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Polished Dark Prismarine
	public static final RegistrySupplier<Item> POLISHED_DARK_PRISMARINE = ITEMS.register("polished_dark_prismarine", () ->
            new BlockItem(CPlusBlocks.POLISHED_DARK_PRISMARINE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_DARK_PRISMARINE_SLAB = ITEMS.register("polished_dark_prismarine_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_DARK_PRISMARINE_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_DARK_PRISMARINE_STAIRS = ITEMS.register("polished_dark_prismarine_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_DARK_PRISMARINE_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_DARK_PRISMARINE_WALL = ITEMS.register("polished_dark_prismarine_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_DARK_PRISMARINE_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_DARK_PRISMARINE_GATE = ITEMS.register("polished_dark_prismarine_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_DARK_PRISMARINE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Smooth Dark Prismarine
	public static final RegistrySupplier<Item> SMOOTH_DARK_PRISMARINE = ITEMS.register("smooth_dark_prismarine", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DARK_PRISMARINE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_DARK_PRISMARINE_SLAB = ITEMS.register("smooth_dark_prismarine_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DARK_PRISMARINE_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_DARK_PRISMARINE_STAIRS = ITEMS.register("smooth_dark_prismarine_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DARK_PRISMARINE_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_DARK_PRISMARINE_WALL = ITEMS.register("smooth_dark_prismarine_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DARK_PRISMARINE_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_DARK_PRISMARINE_GATE = ITEMS.register("smooth_dark_prismarine_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_DARK_PRISMARINE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Dark Prismarine Bricks
	public static final RegistrySupplier<Item> DARK_PRISMARINE_BRICKS = ITEMS.register("dark_prismarine_bricks", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_BRICKS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> DARK_PRISMARINE_BRICK_SLAB = ITEMS.register("dark_prismarine_brick_slab", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> DARK_PRISMARINE_BRICK_STAIRS = ITEMS.register("dark_prismarine_brick_stairs", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> DARK_PRISMARINE_BRICK_WALL = ITEMS.register("dark_prismarine_brick_wall", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> DARK_PRISMARINE_BRICK_GATE = ITEMS.register("dark_prismarine_brick_gate", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Dark Prismarine
	public static final RegistrySupplier<Item> CUT_DARK_PRISMARINE = ITEMS.register("cut_dark_prismarine", () ->
            new BlockItem(CPlusBlocks.CUT_DARK_PRISMARINE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_DARK_PRISMARINE_SLAB = ITEMS.register("cut_dark_prismarine_slab", () ->
            new BlockItem(CPlusBlocks.CUT_DARK_PRISMARINE_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_DARK_PRISMARINE_STAIRS = ITEMS.register("cut_dark_prismarine_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_DARK_PRISMARINE_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_DARK_PRISMARINE_WALL = ITEMS.register("cut_dark_prismarine_wall", () ->
            new BlockItem(CPlusBlocks.CUT_DARK_PRISMARINE_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_DARK_PRISMARINE_GATE = ITEMS.register("cut_dark_prismarine_gate", () ->
            new BlockItem(CPlusBlocks.CUT_DARK_PRISMARINE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Dark Prismarine Tiles
	public static final RegistrySupplier<Item> DARK_PRISMARINE_TILES = ITEMS.register("dark_prismarine_tiles", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_TILES.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> DARK_PRISMARINE_TILE_SLAB = ITEMS.register("dark_prismarine_tile_slab", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> DARK_PRISMARINE_TILE_STAIRS = ITEMS.register("dark_prismarine_tile_stairs", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> DARK_PRISMARINE_TILE_WALL = ITEMS.register("dark_prismarine_tile_wall", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> DARK_PRISMARINE_TILE_GATE = ITEMS.register("dark_prismarine_tile_gate", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Dark Prismarine Pillar
	public static final RegistrySupplier<Item> DARK_PRISMARINE_PILLAR = ITEMS.register("dark_prismarine_pillar", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_PILLAR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> DARK_PRISMARINE_CORNER_PILLAR = ITEMS.register("dark_prismarine_corner_pillar", () ->
            new BlockItem(CPlusBlocks.DARK_PRISMARINE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Chiseled Dark Prismarine
	public static final RegistrySupplier<Item> CHISELED_DARK_PRISMARINE = ITEMS.register("chiseled_dark_prismarine", () ->
            new BlockItem(CPlusBlocks.CHISELED_DARK_PRISMARINE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Carved Dark Prismarine
	public static final RegistrySupplier<Item> CARVED_DARK_PRISMARINE = ITEMS.register("carved_dark_prismarine", () ->
            new BlockItem(CPlusBlocks.CARVED_DARK_PRISMARINE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));


// PURPUR

	// Base
	public static final RegistrySupplier<Item> PURPUR_BLOCK = ITEMS.register("purpur_block", () ->
            new BlockItem(CPlusBlocks.PURPUR_BLOCK.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> PURPUR_SLAB = ITEMS.register("purpur_slab", () ->
            new BlockItem(CPlusBlocks.PURPUR_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> PURPUR_STAIRS = ITEMS.register("purpur_stairs", () ->
            new BlockItem(CPlusBlocks.PURPUR_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> PURPUR_WALL = ITEMS.register("purpur_wall", () ->
            new BlockItem(CPlusBlocks.PURPUR_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> PURPUR_GATE = ITEMS.register("purpur_gate", () ->
            new BlockItem(CPlusBlocks.PURPUR_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Polished Purpur
	public static final RegistrySupplier<Item> POLISHED_PURPUR = ITEMS.register("polished_purpur", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPUR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PURPUR_SLAB = ITEMS.register("polished_purpur_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPUR_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PURPUR_STAIRS = ITEMS.register("polished_purpur_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPUR_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PURPUR_WALL = ITEMS.register("polished_purpur_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPUR_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PURPUR_GATE = ITEMS.register("polished_purpur_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPUR_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Smooth Purpur
	public static final RegistrySupplier<Item> SMOOTH_PURPUR = ITEMS.register("smooth_purpur", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPUR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PURPUR_SLAB = ITEMS.register("smooth_purpur_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPUR_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PURPUR_STAIRS = ITEMS.register("smooth_purpur_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPUR_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PURPUR_WALL = ITEMS.register("smooth_purpur_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPUR_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PURPUR_GATE = ITEMS.register("smooth_purpur_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPUR_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Purpur Bricks
	public static final RegistrySupplier<Item> PURPUR_BRICKS = ITEMS.register("purpur_bricks", () ->
            new BlockItem(CPlusBlocks.PURPUR_BRICKS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> PURPUR_BRICK_SLAB = ITEMS.register("purpur_brick_slab", () ->
            new BlockItem(CPlusBlocks.PURPUR_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> PURPUR_BRICK_STAIRS = ITEMS.register("purpur_brick_stairs", () ->
            new BlockItem(CPlusBlocks.PURPUR_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> PURPUR_BRICK_WALL = ITEMS.register("purpur_brick_wall", () ->
            new BlockItem(CPlusBlocks.PURPUR_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> PURPUR_BRICK_GATE = ITEMS.register("purpur_brick_gate", () ->
            new BlockItem(CPlusBlocks.PURPUR_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cracked Purpur Bricks
	public static final RegistrySupplier<Item> CRACKED_PURPUR_BRICKS = ITEMS.register("cracked_purpur_bricks", () ->
            new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICKS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_PURPUR_BRICK_SLAB = ITEMS.register("cracked_purpur_brick_slab", () ->
            new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_PURPUR_BRICK_STAIRS = ITEMS.register("cracked_purpur_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_PURPUR_BRICK_WALL = ITEMS.register("cracked_purpur_brick_wall", () ->
            new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRACKED_PURPUR_BRICK_GATE = ITEMS.register("cracked_purpur_brick_gate", () ->
            new BlockItem(CPlusBlocks.CRACKED_PURPUR_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Purpur
	public static final RegistrySupplier<Item> CUT_PURPUR = ITEMS.register("cut_purpur", () ->
            new BlockItem(CPlusBlocks.CUT_PURPUR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_PURPUR_SLAB = ITEMS.register("cut_purpur_slab", () ->
            new BlockItem(CPlusBlocks.CUT_PURPUR_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_PURPUR_STAIRS = ITEMS.register("cut_purpur_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_PURPUR_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_PURPUR_WALL = ITEMS.register("cut_purpur_wall", () ->
            new BlockItem(CPlusBlocks.CUT_PURPUR_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_PURPUR_GATE = ITEMS.register("cut_purpur_gate", () ->
            new BlockItem(CPlusBlocks.CUT_PURPUR_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Purpur Tiles
	public static final RegistrySupplier<Item> PURPUR_TILE_WALL = ITEMS.register("purpur_tile_wall", () ->
            new BlockItem(CPlusBlocks.PURPUR_TILE_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> PURPUR_TILE_GATE = ITEMS.register("purpur_tile_gate", () ->
            new BlockItem(CPlusBlocks.PURPUR_TILE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Purpur Pillar
	public static final RegistrySupplier<Item> PURPUR_CORNER_PILLAR = ITEMS.register("purpur_corner_pillar", () ->
            new BlockItem(CPlusBlocks.PURPUR_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Chiseled Purpur
	public static final RegistrySupplier<Item> CHISELED_PURPUR = ITEMS.register("chiseled_purpur", () ->
            new BlockItem(CPlusBlocks.CHISELED_PURPUR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Carved Purpur
	public static final RegistrySupplier<Item> CARVED_PURPUR = ITEMS.register("carved_purpur", () ->
            new BlockItem(CPlusBlocks.CARVED_PURPUR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));


// END STONE

	// Base
	public static final RegistrySupplier<Item> END_STONE_SLAB = ITEMS.register("end_stone_slab", () ->
            new BlockItem(CPlusBlocks.END_STONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> END_STONE_STAIRS = ITEMS.register("end_stone_stairs", () ->
            new BlockItem(CPlusBlocks.END_STONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> END_STONE_WALL = ITEMS.register("end_stone_wall", () ->
            new BlockItem(CPlusBlocks.END_STONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> END_STONE_GATE = ITEMS.register("end_stone_gate", () ->
            new BlockItem(CPlusBlocks.END_STONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cobbled End Stone
	public static final RegistrySupplier<Item> COBBLED_END_STONE = ITEMS.register("cobbled_end_stone", () ->
            new BlockItem(CPlusBlocks.COBBLED_END_STONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_END_STONE_SLAB = ITEMS.register("cobbled_end_stone_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_END_STONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_END_STONE_STAIRS = ITEMS.register("cobbled_end_stone_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_END_STONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_END_STONE_WALL = ITEMS.register("cobbled_end_stone_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_END_STONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_END_STONE_GATE = ITEMS.register("cobbled_end_stone_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_END_STONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Polished End Stone
	public static final RegistrySupplier<Item> POLISHED_END_STONE = ITEMS.register("polished_end_stone", () ->
            new BlockItem(CPlusBlocks.POLISHED_END_STONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_END_STONE_SLAB = ITEMS.register("polished_end_stone_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_END_STONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_END_STONE_STAIRS = ITEMS.register("polished_end_stone_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_END_STONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_END_STONE_WALL = ITEMS.register("polished_end_stone_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_END_STONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_END_STONE_GATE = ITEMS.register("polished_end_stone_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_END_STONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Smooth End Stone
	public static final RegistrySupplier<Item> SMOOTH_END_STONE = ITEMS.register("smooth_end_stone", () ->
            new BlockItem(CPlusBlocks.SMOOTH_END_STONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_END_STONE_SLAB = ITEMS.register("smooth_end_stone_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_END_STONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_END_STONE_STAIRS = ITEMS.register("smooth_end_stone_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_END_STONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_END_STONE_WALL = ITEMS.register("smooth_end_stone_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_END_STONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_END_STONE_GATE = ITEMS.register("smooth_end_stone_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_END_STONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// End Stone Bricks
	public static final RegistrySupplier<Item> END_STONE_BRICK_GATE = ITEMS.register("end_stone_brick_gate", () ->
            new BlockItem(CPlusBlocks.END_STONE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Cut End Stone
	public static final RegistrySupplier<Item> CUT_END_STONE = ITEMS.register("cut_end_stone", () ->
            new BlockItem(CPlusBlocks.CUT_END_STONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_END_STONE_SLAB = ITEMS.register("cut_end_stone_slab", () ->
            new BlockItem(CPlusBlocks.CUT_END_STONE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_END_STONE_STAIRS = ITEMS.register("cut_end_stone_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_END_STONE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_END_STONE_WALL = ITEMS.register("cut_end_stone_wall", () ->
            new BlockItem(CPlusBlocks.CUT_END_STONE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> CUT_END_STONE_GATE = ITEMS.register("cut_end_stone_gate", () ->
            new BlockItem(CPlusBlocks.CUT_END_STONE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// End Stone Tiles
	public static final RegistrySupplier<Item> END_STONE_TILES = ITEMS.register("end_stone_tiles", () ->
            new BlockItem(CPlusBlocks.END_STONE_TILES.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> END_STONE_TILE_SLAB = ITEMS.register("end_stone_tile_slab", () ->
            new BlockItem(CPlusBlocks.END_STONE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> END_STONE_TILE_STAIRS = ITEMS.register("end_stone_tile_stairs", () ->
            new BlockItem(CPlusBlocks.END_STONE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> END_STONE_TILE_WALL = ITEMS.register("end_stone_tile_wall", () ->
            new BlockItem(CPlusBlocks.END_STONE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> END_STONE_TILE_GATE = ITEMS.register("end_stone_tile_gate", () ->
            new BlockItem(CPlusBlocks.END_STONE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// End Stone Pillar
	public static final RegistrySupplier<Item> END_STONE_PILLAR = ITEMS.register("end_stone_pillar", () ->
            new BlockItem(CPlusBlocks.END_STONE_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
	public static final RegistrySupplier<Item> END_STONE_CORNER_PILLAR = ITEMS.register("end_stone_corner_pillar", () ->
            new BlockItem(CPlusBlocks.END_STONE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Chiseled End Stone
	public static final RegistrySupplier<Item> CHISELED_END_STONE = ITEMS.register("chiseled_end_stone", () ->
            new BlockItem(CPlusBlocks.CHISELED_END_STONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));

	// Carved End Stone
	public static final RegistrySupplier<Item> CARVED_END_STONE = ITEMS.register("carved_end_stone", () ->
            new BlockItem(CPlusBlocks.CARVED_END_STONE.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));


// OBSIDIAN

	// Base
	public static final RegistrySupplier<Item> OBSIDIAN_SLAB = ITEMS.register("obsidian_slab", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> OBSIDIAN_STAIRS = ITEMS.register("obsidian_stairs", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> OBSIDIAN_WALL = ITEMS.register("obsidian_wall", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> OBSIDIAN_GATE = ITEMS.register("obsidian_gate", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Crying Base
	public static final RegistrySupplier<Item> CRYING_OBSIDIAN_SLAB = ITEMS.register("crying_obsidian_slab", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRYING_OBSIDIAN_STAIRS = ITEMS.register("crying_obsidian_stairs", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRYING_OBSIDIAN_WALL = ITEMS.register("crying_obsidian_wall", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRYING_OBSIDIAN_GATE = ITEMS.register("crying_obsidian_gate", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Polished Obsidian
	public static final RegistrySupplier<Item> POLISHED_OBSIDIAN = ITEMS.register("polished_obsidian", () ->
            new BlockItem(CPlusBlocks.POLISHED_OBSIDIAN.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_OBSIDIAN_SLAB = ITEMS.register("polished_obsidian_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_OBSIDIAN_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_OBSIDIAN_STAIRS = ITEMS.register("polished_obsidian_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_OBSIDIAN_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_OBSIDIAN_WALL = ITEMS.register("polished_obsidian_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_OBSIDIAN_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_OBSIDIAN_GATE = ITEMS.register("polished_obsidian_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_OBSIDIAN_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Polished Crying Obsidian
	public static final RegistrySupplier<Item> POLISHED_CRYING_OBSIDIAN = ITEMS.register("polished_crying_obsidian", () ->
            new BlockItem(CPlusBlocks.POLISHED_CRYING_OBSIDIAN.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CRYING_OBSIDIAN_SLAB = ITEMS.register("polished_crying_obsidian_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_CRYING_OBSIDIAN_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CRYING_OBSIDIAN_STAIRS = ITEMS.register("polished_crying_obsidian_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_CRYING_OBSIDIAN_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CRYING_OBSIDIAN_WALL = ITEMS.register("polished_crying_obsidian_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_CRYING_OBSIDIAN_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CRYING_OBSIDIAN_GATE = ITEMS.register("polished_crying_obsidian_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_CRYING_OBSIDIAN_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Smooth Obsidian
	public static final RegistrySupplier<Item> SMOOTH_OBSIDIAN = ITEMS.register("smooth_obsidian", () ->
            new BlockItem(CPlusBlocks.SMOOTH_OBSIDIAN.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_OBSIDIAN_SLAB = ITEMS.register("smooth_obsidian_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_OBSIDIAN_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_OBSIDIAN_STAIRS = ITEMS.register("smooth_obsidian_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_OBSIDIAN_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_OBSIDIAN_WALL = ITEMS.register("smooth_obsidian_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_OBSIDIAN_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_OBSIDIAN_GATE = ITEMS.register("smooth_obsidian_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_OBSIDIAN_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Smooth Crying Obsidian
	public static final RegistrySupplier<Item> SMOOTH_CRYING_OBSIDIAN = ITEMS.register("smooth_crying_obsidian", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CRYING_OBSIDIAN.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_CRYING_OBSIDIAN_SLAB = ITEMS.register("smooth_crying_obsidian_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CRYING_OBSIDIAN_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_CRYING_OBSIDIAN_STAIRS = ITEMS.register("smooth_crying_obsidian_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CRYING_OBSIDIAN_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_CRYING_OBSIDIAN_WALL = ITEMS.register("smooth_crying_obsidian_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CRYING_OBSIDIAN_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_CRYING_OBSIDIAN_GATE = ITEMS.register("smooth_crying_obsidian_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CRYING_OBSIDIAN_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Obsidian Bricks
	public static final RegistrySupplier<Item> OBSIDIAN_BRICKS = ITEMS.register("obsidian_bricks", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_BRICKS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> OBSIDIAN_BRICK_SLAB = ITEMS.register("obsidian_brick_slab", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> OBSIDIAN_BRICK_STAIRS = ITEMS.register("obsidian_brick_stairs", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> OBSIDIAN_BRICK_WALL = ITEMS.register("obsidian_brick_wall", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> OBSIDIAN_BRICK_GATE = ITEMS.register("obsidian_brick_gate", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Crying Obsidian Bricks
	public static final RegistrySupplier<Item> CRYING_OBSIDIAN_BRICKS = ITEMS.register("crying_obsidian_bricks", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_BRICKS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRYING_OBSIDIAN_BRICK_SLAB = ITEMS.register("crying_obsidian_brick_slab", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRYING_OBSIDIAN_BRICK_STAIRS = ITEMS.register("crying_obsidian_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRYING_OBSIDIAN_BRICK_WALL = ITEMS.register("crying_obsidian_brick_wall", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRYING_OBSIDIAN_BRICK_GATE = ITEMS.register("crying_obsidian_brick_gate", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Obsidian
	public static final RegistrySupplier<Item> CUT_OBSIDIAN = ITEMS.register("cut_obsidian", () ->
            new BlockItem(CPlusBlocks.CUT_OBSIDIAN.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_OBSIDIAN_SLAB = ITEMS.register("cut_obsidian_slab", () ->
            new BlockItem(CPlusBlocks.CUT_OBSIDIAN_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_OBSIDIAN_STAIRS = ITEMS.register("cut_obsidian_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_OBSIDIAN_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_OBSIDIAN_WALL = ITEMS.register("cut_obsidian_wall", () ->
            new BlockItem(CPlusBlocks.CUT_OBSIDIAN_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_OBSIDIAN_GATE = ITEMS.register("cut_obsidian_gate", () ->
            new BlockItem(CPlusBlocks.CUT_OBSIDIAN_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Cut Crying Obsidian
	public static final RegistrySupplier<Item> CUT_CRYING_OBSIDIAN = ITEMS.register("cut_crying_obsidian", () ->
            new BlockItem(CPlusBlocks.CUT_CRYING_OBSIDIAN.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_CRYING_OBSIDIAN_SLAB = ITEMS.register("cut_crying_obsidian_slab", () ->
            new BlockItem(CPlusBlocks.CUT_CRYING_OBSIDIAN_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_CRYING_OBSIDIAN_STAIRS = ITEMS.register("cut_crying_obsidian_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_CRYING_OBSIDIAN_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_CRYING_OBSIDIAN_WALL = ITEMS.register("cut_crying_obsidian_wall", () ->
            new BlockItem(CPlusBlocks.CUT_CRYING_OBSIDIAN_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CUT_CRYING_OBSIDIAN_GATE = ITEMS.register("cut_crying_obsidian_gate", () ->
            new BlockItem(CPlusBlocks.CUT_CRYING_OBSIDIAN_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Obsidian Tiles
	public static final RegistrySupplier<Item> OBSIDIAN_TILES = ITEMS.register("obsidian_tiles", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_TILES.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> OBSIDIAN_TILE_SLAB = ITEMS.register("obsidian_tile_slab", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> OBSIDIAN_TILE_STAIRS = ITEMS.register("obsidian_tile_stairs", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> OBSIDIAN_TILE_WALL = ITEMS.register("obsidian_tile_wall", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_TILE_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> OBSIDIAN_TILE_GATE = ITEMS.register("obsidian_tile_gate", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_TILE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Crying Obsidian Tiles
	public static final RegistrySupplier<Item> CRYING_OBSIDIAN_TILES = ITEMS.register("crying_obsidian_tiles", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_TILES.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRYING_OBSIDIAN_TILE_SLAB = ITEMS.register("crying_obsidian_tile_slab", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRYING_OBSIDIAN_TILE_STAIRS = ITEMS.register("crying_obsidian_tile_stairs", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRYING_OBSIDIAN_TILE_WALL = ITEMS.register("crying_obsidian_tile_wall", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_TILE_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRYING_OBSIDIAN_TILE_GATE = ITEMS.register("crying_obsidian_tile_gate", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_TILE_GATE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Obsidian Pillar
	public static final RegistrySupplier<Item> OBSIDIAN_PILLAR = ITEMS.register("obsidian_pillar", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_PILLAR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> OBSIDIAN_CORNER_PILLAR = ITEMS.register("obsidian_corner_pillar", () ->
            new BlockItem(CPlusBlocks.OBSIDIAN_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Crying Obsidian Pillar
	public static final RegistrySupplier<Item> CRYING_OBSIDIAN_PILLAR = ITEMS.register("crying_obsidian_pillar", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_PILLAR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
	public static final RegistrySupplier<Item> CRYING_OBSIDIAN_CORNER_PILLAR = ITEMS.register("crying_obsidian_corner_pillar", () ->
            new BlockItem(CPlusBlocks.CRYING_OBSIDIAN_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Chiseled Obsidian
	public static final RegistrySupplier<Item> CHISELED_OBSIDIAN = ITEMS.register("chiseled_obsidian", () ->
            new BlockItem(CPlusBlocks.CHISELED_OBSIDIAN.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Chiseled Crying Obsidian
	public static final RegistrySupplier<Item> CHISELED_CRYING_OBSIDIAN = ITEMS.register("chiseled_crying_obsidian", () ->
            new BlockItem(CPlusBlocks.CHISELED_CRYING_OBSIDIAN.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Carved Obsidian
	public static final RegistrySupplier<Item> CARVED_OBSIDIAN = ITEMS.register("carved_obsidian", () ->
            new BlockItem(CPlusBlocks.CARVED_OBSIDIAN.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

	// Carved Crying Obsidian
	public static final RegistrySupplier<Item> CARVED_CRYING_OBSIDIAN = ITEMS.register("carved_crying_obsidian", () ->
            new BlockItem(CPlusBlocks.CARVED_CRYING_OBSIDIAN.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));


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
	public static final RegistrySupplier<Item> TERRACOTTA_SLAB = ITEMS.register("terracotta_slab", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> TERRACOTTA_STAIRS = ITEMS.register("terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> TERRACOTTA_WALL = ITEMS.register("terracotta_wall", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> TERRACOTTA_GATE = ITEMS.register("terracotta_gate", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Terracotta
	public static final RegistrySupplier<Item> COBBLED_TERRACOTTA = ITEMS.register("cobbled_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_TERRACOTTA_SLAB = ITEMS.register("cobbled_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_TERRACOTTA_STAIRS = ITEMS.register("cobbled_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_TERRACOTTA_WALL = ITEMS.register("cobbled_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_TERRACOTTA_GATE = ITEMS.register("cobbled_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Terracotta
	public static final RegistrySupplier<Item> POLISHED_TERRACOTTA = ITEMS.register("polished_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_TERRACOTTA_SLAB = ITEMS.register("polished_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_TERRACOTTA_STAIRS = ITEMS.register("polished_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_TERRACOTTA_WALL = ITEMS.register("polished_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_TERRACOTTA_GATE = ITEMS.register("polished_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Terracotta
	public static final RegistrySupplier<Item> SMOOTH_TERRACOTTA = ITEMS.register("smooth_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_TERRACOTTA_SLAB = ITEMS.register("smooth_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_TERRACOTTA_STAIRS = ITEMS.register("smooth_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_TERRACOTTA_WALL = ITEMS.register("smooth_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_TERRACOTTA_GATE = ITEMS.register("smooth_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Terracotta Bricks
	public static final RegistrySupplier<Item> BRICK_GATE = ITEMS.register("brick_gate", () ->
            new BlockItem(CPlusBlocks.BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Terracotta
	public static final RegistrySupplier<Item> CUT_TERRACOTTA = ITEMS.register("cut_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_TERRACOTTA_SLAB = ITEMS.register("cut_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_TERRACOTTA_STAIRS = ITEMS.register("cut_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_TERRACOTTA_WALL = ITEMS.register("cut_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_TERRACOTTA_GATE = ITEMS.register("cut_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Terracotta Tiles
	public static final RegistrySupplier<Item> TERRACOTTA_TILES = ITEMS.register("terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> TERRACOTTA_TILE_SLAB = ITEMS.register("terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> TERRACOTTA_TILE_STAIRS = ITEMS.register("terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> TERRACOTTA_TILE_WALL = ITEMS.register("terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> TERRACOTTA_TILE_GATE = ITEMS.register("terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Terracotta Pillar
	public static final RegistrySupplier<Item> TERRACOTTA_PILLAR = ITEMS.register("terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> TERRACOTTA_CORNER_PILLAR = ITEMS.register("terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.TERRACOTTA_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Terracotta
	public static final RegistrySupplier<Item> CHISELED_TERRACOTTA = ITEMS.register("chiseled_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Terracotta
	public static final RegistrySupplier<Item> CARVED_TERRACOTTA = ITEMS.register("carved_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// RED TERRACOTTA

	// Base
	public static final RegistrySupplier<Item> RED_TERRACOTTA_SLAB = ITEMS.register("red_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_TERRACOTTA_STAIRS = ITEMS.register("red_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_TERRACOTTA_WALL = ITEMS.register("red_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_TERRACOTTA_GATE = ITEMS.register("red_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Red Terracotta
	public static final RegistrySupplier<Item> COBBLED_RED_TERRACOTTA = ITEMS.register("cobbled_red_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_RED_TERRACOTTA_SLAB = ITEMS.register("cobbled_red_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_RED_TERRACOTTA_STAIRS = ITEMS.register("cobbled_red_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_RED_TERRACOTTA_WALL = ITEMS.register("cobbled_red_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_RED_TERRACOTTA_GATE = ITEMS.register("cobbled_red_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_RED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Red Terracotta
	public static final RegistrySupplier<Item> POLISHED_RED_TERRACOTTA = ITEMS.register("polished_red_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_RED_TERRACOTTA_SLAB = ITEMS.register("polished_red_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_RED_TERRACOTTA_STAIRS = ITEMS.register("polished_red_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_RED_TERRACOTTA_WALL = ITEMS.register("polished_red_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_RED_TERRACOTTA_GATE = ITEMS.register("polished_red_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Red Terracotta
	public static final RegistrySupplier<Item> SMOOTH_RED_TERRACOTTA = ITEMS.register("smooth_red_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_RED_TERRACOTTA_SLAB = ITEMS.register("smooth_red_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_RED_TERRACOTTA_STAIRS = ITEMS.register("smooth_red_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_RED_TERRACOTTA_WALL = ITEMS.register("smooth_red_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_RED_TERRACOTTA_GATE = ITEMS.register("smooth_red_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Red Terracotta Bricks
	public static final RegistrySupplier<Item> RED_TERRACOTTA_BRICKS = ITEMS.register("red_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_TERRACOTTA_BRICK_SLAB = ITEMS.register("red_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_TERRACOTTA_BRICK_STAIRS = ITEMS.register("red_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_TERRACOTTA_BRICK_WALL = ITEMS.register("red_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_TERRACOTTA_BRICK_GATE = ITEMS.register("red_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Red Terracotta
	public static final RegistrySupplier<Item> CUT_RED_TERRACOTTA = ITEMS.register("cut_red_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_RED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_RED_TERRACOTTA_SLAB = ITEMS.register("cut_red_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_RED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_RED_TERRACOTTA_STAIRS = ITEMS.register("cut_red_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_RED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_RED_TERRACOTTA_WALL = ITEMS.register("cut_red_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_RED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_RED_TERRACOTTA_GATE = ITEMS.register("cut_red_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_RED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Red Terracotta Tiles
	public static final RegistrySupplier<Item> RED_TERRACOTTA_TILES = ITEMS.register("red_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_TERRACOTTA_TILE_SLAB = ITEMS.register("red_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_TERRACOTTA_TILE_STAIRS = ITEMS.register("red_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_TERRACOTTA_TILE_WALL = ITEMS.register("red_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_TERRACOTTA_TILE_GATE = ITEMS.register("red_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Red Terracotta Pillar
	public static final RegistrySupplier<Item> RED_TERRACOTTA_PILLAR = ITEMS.register("red_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_TERRACOTTA_CORNER_PILLAR = ITEMS.register("red_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.RED_TERRACOTTA_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Red Terracotta
	public static final RegistrySupplier<Item> CHISELED_RED_TERRACOTTA = ITEMS.register("chiseled_red_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_RED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Red Terracotta
	public static final RegistrySupplier<Item> CARVED_RED_TERRACOTTA = ITEMS.register("carved_red_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_RED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// ORANGE TERRACOTTA

	// Base
	public static final RegistrySupplier<Item> ORANGE_TERRACOTTA_SLAB = ITEMS.register("orange_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_TERRACOTTA_STAIRS = ITEMS.register("orange_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_TERRACOTTA_WALL = ITEMS.register("orange_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_TERRACOTTA_GATE = ITEMS.register("orange_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Orange Terracotta
	public static final RegistrySupplier<Item> COBBLED_ORANGE_TERRACOTTA = ITEMS.register("cobbled_orange_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_ORANGE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_ORANGE_TERRACOTTA_SLAB = ITEMS.register("cobbled_orange_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_ORANGE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_ORANGE_TERRACOTTA_STAIRS = ITEMS.register("cobbled_orange_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_ORANGE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_ORANGE_TERRACOTTA_WALL = ITEMS.register("cobbled_orange_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_ORANGE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_ORANGE_TERRACOTTA_GATE = ITEMS.register("cobbled_orange_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_ORANGE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Orange Terracotta
	public static final RegistrySupplier<Item> POLISHED_ORANGE_TERRACOTTA = ITEMS.register("polished_orange_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_ORANGE_TERRACOTTA_SLAB = ITEMS.register("polished_orange_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_ORANGE_TERRACOTTA_STAIRS = ITEMS.register("polished_orange_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_ORANGE_TERRACOTTA_WALL = ITEMS.register("polished_orange_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_ORANGE_TERRACOTTA_GATE = ITEMS.register("polished_orange_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Orange Terracotta
	public static final RegistrySupplier<Item> SMOOTH_ORANGE_TERRACOTTA = ITEMS.register("smooth_orange_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_ORANGE_TERRACOTTA_SLAB = ITEMS.register("smooth_orange_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_ORANGE_TERRACOTTA_STAIRS = ITEMS.register("smooth_orange_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_ORANGE_TERRACOTTA_WALL = ITEMS.register("smooth_orange_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_ORANGE_TERRACOTTA_GATE = ITEMS.register("smooth_orange_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Orange Terracotta Bricks
	public static final RegistrySupplier<Item> ORANGE_TERRACOTTA_BRICKS = ITEMS.register("orange_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_TERRACOTTA_BRICK_SLAB = ITEMS.register("orange_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_TERRACOTTA_BRICK_STAIRS = ITEMS.register("orange_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_TERRACOTTA_BRICK_WALL = ITEMS.register("orange_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_TERRACOTTA_BRICK_GATE = ITEMS.register("orange_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Orange Terracotta
	public static final RegistrySupplier<Item> CUT_ORANGE_TERRACOTTA = ITEMS.register("cut_orange_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_ORANGE_TERRACOTTA_SLAB = ITEMS.register("cut_orange_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_ORANGE_TERRACOTTA_STAIRS = ITEMS.register("cut_orange_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_ORANGE_TERRACOTTA_WALL = ITEMS.register("cut_orange_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_ORANGE_TERRACOTTA_GATE = ITEMS.register("cut_orange_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Orange Terracotta Tiles
	public static final RegistrySupplier<Item> ORANGE_TERRACOTTA_TILES = ITEMS.register("orange_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_TERRACOTTA_TILE_SLAB = ITEMS.register("orange_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_TERRACOTTA_TILE_STAIRS = ITEMS.register("orange_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_TERRACOTTA_TILE_WALL = ITEMS.register("orange_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_TERRACOTTA_TILE_GATE = ITEMS.register("orange_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Orange Terracotta Pillar
	public static final RegistrySupplier<Item> ORANGE_TERRACOTTA_PILLAR = ITEMS.register("orange_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_TERRACOTTA_CORNER_PILLAR = ITEMS.register("orange_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.ORANGE_TERRACOTTA_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Orange Terracotta
	public static final RegistrySupplier<Item> CHISELED_ORANGE_TERRACOTTA = ITEMS.register("chiseled_orange_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_ORANGE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Orange Terracotta
	public static final RegistrySupplier<Item> CARVED_ORANGE_TERRACOTTA = ITEMS.register("carved_orange_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_ORANGE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// YELLOW TERRACOTTA

	// Base
	public static final RegistrySupplier<Item> YELLOW_TERRACOTTA_SLAB = ITEMS.register("yellow_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_TERRACOTTA_STAIRS = ITEMS.register("yellow_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_TERRACOTTA_WALL = ITEMS.register("yellow_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_TERRACOTTA_GATE = ITEMS.register("yellow_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Yellow Terracotta
	public static final RegistrySupplier<Item> COBBLED_YELLOW_TERRACOTTA = ITEMS.register("cobbled_yellow_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_YELLOW_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_YELLOW_TERRACOTTA_SLAB = ITEMS.register("cobbled_yellow_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_YELLOW_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_YELLOW_TERRACOTTA_STAIRS = ITEMS.register("cobbled_yellow_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_YELLOW_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_YELLOW_TERRACOTTA_WALL = ITEMS.register("cobbled_yellow_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_YELLOW_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_YELLOW_TERRACOTTA_GATE = ITEMS.register("cobbled_yellow_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_YELLOW_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Yellow Terracotta
	public static final RegistrySupplier<Item> POLISHED_YELLOW_TERRACOTTA = ITEMS.register("polished_yellow_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_YELLOW_TERRACOTTA_SLAB = ITEMS.register("polished_yellow_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_YELLOW_TERRACOTTA_STAIRS = ITEMS.register("polished_yellow_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_YELLOW_TERRACOTTA_WALL = ITEMS.register("polished_yellow_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_YELLOW_TERRACOTTA_GATE = ITEMS.register("polished_yellow_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Yellow Terracotta
	public static final RegistrySupplier<Item> SMOOTH_YELLOW_TERRACOTTA = ITEMS.register("smooth_yellow_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_YELLOW_TERRACOTTA_SLAB = ITEMS.register("smooth_yellow_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_YELLOW_TERRACOTTA_STAIRS = ITEMS.register("smooth_yellow_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_YELLOW_TERRACOTTA_WALL = ITEMS.register("smooth_yellow_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_YELLOW_TERRACOTTA_GATE = ITEMS.register("smooth_yellow_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Yellow Terracotta Bricks
	public static final RegistrySupplier<Item> YELLOW_TERRACOTTA_BRICKS = ITEMS.register("yellow_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_TERRACOTTA_BRICK_SLAB = ITEMS.register("yellow_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_TERRACOTTA_BRICK_STAIRS = ITEMS.register("yellow_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_TERRACOTTA_BRICK_WALL = ITEMS.register("yellow_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_TERRACOTTA_BRICK_GATE = ITEMS.register("yellow_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Yellow Terracotta
	public static final RegistrySupplier<Item> CUT_YELLOW_TERRACOTTA = ITEMS.register("cut_yellow_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_YELLOW_TERRACOTTA_SLAB = ITEMS.register("cut_yellow_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_YELLOW_TERRACOTTA_STAIRS = ITEMS.register("cut_yellow_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_YELLOW_TERRACOTTA_WALL = ITEMS.register("cut_yellow_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_YELLOW_TERRACOTTA_GATE = ITEMS.register("cut_yellow_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Yellow Terracotta Tiles
	public static final RegistrySupplier<Item> YELLOW_TERRACOTTA_TILES = ITEMS.register("yellow_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_TERRACOTTA_TILE_SLAB = ITEMS.register("yellow_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_TERRACOTTA_TILE_STAIRS = ITEMS.register("yellow_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_TERRACOTTA_TILE_WALL = ITEMS.register("yellow_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_TERRACOTTA_TILE_GATE = ITEMS.register("yellow_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Yellow Terracotta Pillar
	public static final RegistrySupplier<Item> YELLOW_TERRACOTTA_PILLAR = ITEMS.register("yellow_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_TERRACOTTA_CORNER_PILLAR = ITEMS.register("yellow_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.YELLOW_TERRACOTTA_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Yellow Terracotta
	public static final RegistrySupplier<Item> CHISELED_YELLOW_TERRACOTTA = ITEMS.register("chiseled_yellow_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_YELLOW_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Yellow Terracotta
	public static final RegistrySupplier<Item> CARVED_YELLOW_TERRACOTTA = ITEMS.register("carved_yellow_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_YELLOW_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// LIME TERRACOTTA

	// Base
	public static final RegistrySupplier<Item> LIME_TERRACOTTA_SLAB = ITEMS.register("lime_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_TERRACOTTA_STAIRS = ITEMS.register("lime_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_TERRACOTTA_WALL = ITEMS.register("lime_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_TERRACOTTA_GATE = ITEMS.register("lime_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Lime Terracotta
	public static final RegistrySupplier<Item> COBBLED_LIME_TERRACOTTA = ITEMS.register("cobbled_lime_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIME_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_LIME_TERRACOTTA_SLAB = ITEMS.register("cobbled_lime_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIME_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_LIME_TERRACOTTA_STAIRS = ITEMS.register("cobbled_lime_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIME_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_LIME_TERRACOTTA_WALL = ITEMS.register("cobbled_lime_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIME_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_LIME_TERRACOTTA_GATE = ITEMS.register("cobbled_lime_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIME_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Lime Terracotta
	public static final RegistrySupplier<Item> POLISHED_LIME_TERRACOTTA = ITEMS.register("polished_lime_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIME_TERRACOTTA_SLAB = ITEMS.register("polished_lime_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIME_TERRACOTTA_STAIRS = ITEMS.register("polished_lime_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIME_TERRACOTTA_WALL = ITEMS.register("polished_lime_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIME_TERRACOTTA_GATE = ITEMS.register("polished_lime_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Lime Terracotta
	public static final RegistrySupplier<Item> SMOOTH_LIME_TERRACOTTA = ITEMS.register("smooth_lime_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIME_TERRACOTTA_SLAB = ITEMS.register("smooth_lime_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIME_TERRACOTTA_STAIRS = ITEMS.register("smooth_lime_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIME_TERRACOTTA_WALL = ITEMS.register("smooth_lime_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIME_TERRACOTTA_GATE = ITEMS.register("smooth_lime_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Lime Terracotta Bricks
	public static final RegistrySupplier<Item> LIME_TERRACOTTA_BRICKS = ITEMS.register("lime_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_TERRACOTTA_BRICK_SLAB = ITEMS.register("lime_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_TERRACOTTA_BRICK_STAIRS = ITEMS.register("lime_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_TERRACOTTA_BRICK_WALL = ITEMS.register("lime_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_TERRACOTTA_BRICK_GATE = ITEMS.register("lime_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Lime Terracotta
	public static final RegistrySupplier<Item> CUT_LIME_TERRACOTTA = ITEMS.register("cut_lime_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIME_TERRACOTTA_SLAB = ITEMS.register("cut_lime_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIME_TERRACOTTA_STAIRS = ITEMS.register("cut_lime_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIME_TERRACOTTA_WALL = ITEMS.register("cut_lime_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIME_TERRACOTTA_GATE = ITEMS.register("cut_lime_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Lime Terracotta Tiles
	public static final RegistrySupplier<Item> LIME_TERRACOTTA_TILES = ITEMS.register("lime_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_TERRACOTTA_TILE_SLAB = ITEMS.register("lime_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_TERRACOTTA_TILE_STAIRS = ITEMS.register("lime_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_TERRACOTTA_TILE_WALL = ITEMS.register("lime_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_TERRACOTTA_TILE_GATE = ITEMS.register("lime_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Lime Terracotta Pillar
	public static final RegistrySupplier<Item> LIME_TERRACOTTA_PILLAR = ITEMS.register("lime_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_TERRACOTTA_CORNER_PILLAR = ITEMS.register("lime_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.LIME_TERRACOTTA_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseld Lime Terracotta
	public static final RegistrySupplier<Item> CHISELED_LIME_TERRACOTTA = ITEMS.register("chiseled_lime_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_LIME_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Lime Terracotta
	public static final RegistrySupplier<Item> CARVED_LIME_TERRACOTTA = ITEMS.register("carved_lime_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_LIME_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// GREEN TERRACOTTA

	// Base
	public static final RegistrySupplier<Item> GREEN_TERRACOTTA_SLAB = ITEMS.register("green_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_TERRACOTTA_STAIRS = ITEMS.register("green_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_TERRACOTTA_WALL = ITEMS.register("green_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_TERRACOTTA_GATE = ITEMS.register("green_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Green Terracotta
	public static final RegistrySupplier<Item> COBBLED_GREEN_TERRACOTTA = ITEMS.register("cobbled_green_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_GREEN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_GREEN_TERRACOTTA_SLAB = ITEMS.register("cobbled_green_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_GREEN_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_GREEN_TERRACOTTA_STAIRS = ITEMS.register("cobbled_green_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_GREEN_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_GREEN_TERRACOTTA_WALL = ITEMS.register("cobbled_green_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_GREEN_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_GREEN_TERRACOTTA_GATE = ITEMS.register("cobbled_green_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_GREEN_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Green Terracotta
	public static final RegistrySupplier<Item> POLISHED_GREEN_TERRACOTTA = ITEMS.register("polished_green_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GREEN_TERRACOTTA_SLAB = ITEMS.register("polished_green_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GREEN_TERRACOTTA_STAIRS = ITEMS.register("polished_green_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GREEN_TERRACOTTA_WALL = ITEMS.register("polished_green_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GREEN_TERRACOTTA_GATE = ITEMS.register("polished_green_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Green Terracotta
	public static final RegistrySupplier<Item> SMOOTH_GREEN_TERRACOTTA = ITEMS.register("smooth_green_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GREEN_TERRACOTTA_SLAB = ITEMS.register("smooth_green_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GREEN_TERRACOTTA_STAIRS = ITEMS.register("smooth_green_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GREEN_TERRACOTTA_WALL = ITEMS.register("smooth_green_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GREEN_TERRACOTTA_GATE = ITEMS.register("smooth_green_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Green Terracotta Bricks
	public static final RegistrySupplier<Item> GREEN_TERRACOTTA_BRICKS = ITEMS.register("green_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_TERRACOTTA_BRICK_SLAB = ITEMS.register("green_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_TERRACOTTA_BRICK_STAIRS = ITEMS.register("green_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_TERRACOTTA_BRICK_WALL = ITEMS.register("green_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_TERRACOTTA_BRICK_GATE = ITEMS.register("green_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Green Terracotta
	public static final RegistrySupplier<Item> CUT_GREEN_TERRACOTTA = ITEMS.register("cut_green_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_GREEN_TERRACOTTA_SLAB = ITEMS.register("cut_green_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_GREEN_TERRACOTTA_STAIRS = ITEMS.register("cut_green_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_GREEN_TERRACOTTA_WALL = ITEMS.register("cut_green_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_GREEN_TERRACOTTA_GATE = ITEMS.register("cut_green_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Green Terracotta Tiles
	public static final RegistrySupplier<Item> GREEN_TERRACOTTA_TILES = ITEMS.register("green_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_TERRACOTTA_TILE_SLAB = ITEMS.register("green_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_TERRACOTTA_TILE_STAIRS = ITEMS.register("green_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_TERRACOTTA_TILE_WALL = ITEMS.register("green_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_TERRACOTTA_TILE_GATE = ITEMS.register("green_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Green Terracotta Pillar
	public static final RegistrySupplier<Item> GREEN_TERRACOTTA_PILLAR = ITEMS.register("green_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_TERRACOTTA_CORNER_PILLAR = ITEMS.register("green_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.GREEN_TERRACOTTA_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Green Terracotta
	public static final RegistrySupplier<Item> CHISELED_GREEN_TERRACOTTA = ITEMS.register("chiseled_green_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_GREEN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Green Terracotta
	public static final RegistrySupplier<Item> CARVED_GREEN_TERRACOTTA = ITEMS.register("carved_green_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_GREEN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// BLUE TERRACOTTA

	// Base
	public static final RegistrySupplier<Item> BLUE_TERRACOTTA_SLAB = ITEMS.register("blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_TERRACOTTA_STAIRS = ITEMS.register("blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_TERRACOTTA_WALL = ITEMS.register("blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_TERRACOTTA_GATE = ITEMS.register("blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Blue Terracotta
	public static final RegistrySupplier<Item> COBBLED_BLUE_TERRACOTTA = ITEMS.register("cobbled_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLUE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_BLUE_TERRACOTTA_SLAB = ITEMS.register("cobbled_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLUE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_BLUE_TERRACOTTA_STAIRS = ITEMS.register("cobbled_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLUE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_BLUE_TERRACOTTA_WALL = ITEMS.register("cobbled_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLUE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_BLUE_TERRACOTTA_GATE = ITEMS.register("cobbled_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLUE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Blue Terracotta
	public static final RegistrySupplier<Item> POLISHED_BLUE_TERRACOTTA = ITEMS.register("polished_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLUE_TERRACOTTA_SLAB = ITEMS.register("polished_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLUE_TERRACOTTA_STAIRS = ITEMS.register("polished_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLUE_TERRACOTTA_WALL = ITEMS.register("polished_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLUE_TERRACOTTA_GATE = ITEMS.register("polished_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Blue Terracotta
	public static final RegistrySupplier<Item> SMOOTH_BLUE_TERRACOTTA = ITEMS.register("smooth_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLUE_TERRACOTTA_SLAB = ITEMS.register("smooth_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLUE_TERRACOTTA_STAIRS = ITEMS.register("smooth_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLUE_TERRACOTTA_WALL = ITEMS.register("smooth_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLUE_TERRACOTTA_GATE = ITEMS.register("smooth_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Blue Terracotta Bricks
	public static final RegistrySupplier<Item> BLUE_TERRACOTTA_BRICKS = ITEMS.register("blue_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_TERRACOTTA_BRICK_SLAB = ITEMS.register("blue_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_TERRACOTTA_BRICK_STAIRS = ITEMS.register("blue_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_TERRACOTTA_BRICK_WALL = ITEMS.register("blue_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_TERRACOTTA_BRICK_GATE = ITEMS.register("blue_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Blue Terracotta
	public static final RegistrySupplier<Item> CUT_BLUE_TERRACOTTA = ITEMS.register("cut_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLUE_TERRACOTTA_SLAB = ITEMS.register("cut_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLUE_TERRACOTTA_STAIRS = ITEMS.register("cut_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLUE_TERRACOTTA_WALL = ITEMS.register("cut_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLUE_TERRACOTTA_GATE = ITEMS.register("cut_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Blue Terracotta Tiles
	public static final RegistrySupplier<Item> BLUE_TERRACOTTA_TILES = ITEMS.register("blue_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_TERRACOTTA_TILE_SLAB = ITEMS.register("blue_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_TERRACOTTA_TILE_STAIRS = ITEMS.register("blue_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_TERRACOTTA_TILE_WALL = ITEMS.register("blue_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_TERRACOTTA_TILE_GATE = ITEMS.register("blue_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Blue Terracotta Pillar
	public static final RegistrySupplier<Item> BLUE_TERRACOTTA_PILLAR = ITEMS.register("blue_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_TERRACOTTA_CORNER_PILLAR = ITEMS.register("blue_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.BLUE_TERRACOTTA_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Blue Terracotta
	public static final RegistrySupplier<Item> CHISELED_BLUE_TERRACOTTA = ITEMS.register("chiseled_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_BLUE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Blue Terracotta
	public static final RegistrySupplier<Item> CARVED_BLUE_TERRACOTTA = ITEMS.register("carved_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_BLUE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// CYAN TERRACOTTA

	// Base
	public static final RegistrySupplier<Item> CYAN_TERRACOTTA_SLAB = ITEMS.register("cyan_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_TERRACOTTA_STAIRS = ITEMS.register("cyan_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_TERRACOTTA_WALL = ITEMS.register("cyan_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_TERRACOTTA_GATE = ITEMS.register("cyan_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Cyan Terracotta
	public static final RegistrySupplier<Item> COBBLED_CYAN_TERRACOTTA = ITEMS.register("cobbled_cyan_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_CYAN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_CYAN_TERRACOTTA_SLAB = ITEMS.register("cobbled_cyan_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_CYAN_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_CYAN_TERRACOTTA_STAIRS = ITEMS.register("cobbled_cyan_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_CYAN_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_CYAN_TERRACOTTA_WALL = ITEMS.register("cobbled_cyan_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_CYAN_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_CYAN_TERRACOTTA_GATE = ITEMS.register("cobbled_cyan_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_CYAN_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Cyan Terracotta
	public static final RegistrySupplier<Item> POLISHED_CYAN_TERRACOTTA = ITEMS.register("polished_cyan_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CYAN_TERRACOTTA_SLAB = ITEMS.register("polished_cyan_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CYAN_TERRACOTTA_STAIRS = ITEMS.register("polished_cyan_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CYAN_TERRACOTTA_WALL = ITEMS.register("polished_cyan_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CYAN_TERRACOTTA_GATE = ITEMS.register("polished_cyan_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Cyan Terracotta
	public static final RegistrySupplier<Item> SMOOTH_CYAN_TERRACOTTA = ITEMS.register("smooth_cyan_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_CYAN_TERRACOTTA_SLAB = ITEMS.register("smooth_cyan_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_CYAN_TERRACOTTA_STAIRS = ITEMS.register("smooth_cyan_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_CYAN_TERRACOTTA_WALL = ITEMS.register("smooth_cyan_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_CYAN_TERRACOTTA_GATE = ITEMS.register("smooth_cyan_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cyan Terracotta Bricks
	public static final RegistrySupplier<Item> CYAN_TERRACOTTA_BRICKS = ITEMS.register("cyan_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_TERRACOTTA_BRICK_SLAB = ITEMS.register("cyan_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_TERRACOTTA_BRICK_STAIRS = ITEMS.register("cyan_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_TERRACOTTA_BRICK_WALL = ITEMS.register("cyan_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_TERRACOTTA_BRICK_GATE = ITEMS.register("cyan_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Cyan Terracotta
	public static final RegistrySupplier<Item> CUT_CYAN_TERRACOTTA = ITEMS.register("cut_cyan_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_CYAN_TERRACOTTA_SLAB = ITEMS.register("cut_cyan_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_CYAN_TERRACOTTA_STAIRS = ITEMS.register("cut_cyan_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_CYAN_TERRACOTTA_WALL = ITEMS.register("cut_cyan_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_CYAN_TERRACOTTA_GATE = ITEMS.register("cut_cyan_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cyan Terracotta Tiles
	public static final RegistrySupplier<Item> CYAN_TERRACOTTA_TILES = ITEMS.register("cyan_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_TERRACOTTA_TILE_SLAB = ITEMS.register("cyan_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_TERRACOTTA_TILE_STAIRS = ITEMS.register("cyan_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_TERRACOTTA_TILE_WALL = ITEMS.register("cyan_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_TERRACOTTA_TILE_GATE = ITEMS.register("cyan_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cyan Terracotta Pillar
	public static final RegistrySupplier<Item> CYAN_TERRACOTTA_PILLAR = ITEMS.register("cyan_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_TERRACOTTA_CORNER_PILLAR = ITEMS.register("cyan_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.CYAN_TERRACOTTA_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Cyan Terracotta
	public static final RegistrySupplier<Item> CHISELED_CYAN_TERRACOTTA = ITEMS.register("chiseled_cyan_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_CYAN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Cyan Terracotta
	public static final RegistrySupplier<Item> CARVED_CYAN_TERRACOTTA = ITEMS.register("carved_cyan_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_CYAN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// LIGHT BLUE TERRACOTTA

	// Base
	public static final RegistrySupplier<Item> LIGHT_BLUE_TERRACOTTA_SLAB = ITEMS.register("light_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_TERRACOTTA_STAIRS = ITEMS.register("light_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_TERRACOTTA_WALL = ITEMS.register("light_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_TERRACOTTA_GATE = ITEMS.register("light_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Light Blue Terracotta
	public static final RegistrySupplier<Item> COBBLED_LIGHT_BLUE_TERRACOTTA = ITEMS.register("cobbled_light_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_BLUE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_LIGHT_BLUE_TERRACOTTA_SLAB = ITEMS.register("cobbled_light_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_BLUE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_LIGHT_BLUE_TERRACOTTA_STAIRS = ITEMS.register("cobbled_light_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_BLUE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_LIGHT_BLUE_TERRACOTTA_WALL = ITEMS.register("cobbled_light_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_BLUE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_LIGHT_BLUE_TERRACOTTA_GATE = ITEMS.register("cobbled_light_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_BLUE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Light Blue Terracotta
	public static final RegistrySupplier<Item> POLISHED_LIGHT_BLUE_TERRACOTTA = ITEMS.register("polished_light_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_BLUE_TERRACOTTA_SLAB = ITEMS.register("polished_light_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_BLUE_TERRACOTTA_STAIRS = ITEMS.register("polished_light_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_BLUE_TERRACOTTA_WALL = ITEMS.register("polished_light_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_BLUE_TERRACOTTA_GATE = ITEMS.register("polished_light_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Light Blue Terracotta
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_BLUE_TERRACOTTA = ITEMS.register("smooth_light_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_BLUE_TERRACOTTA_SLAB = ITEMS.register("smooth_light_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_BLUE_TERRACOTTA_STAIRS = ITEMS.register("smooth_light_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_BLUE_TERRACOTTA_WALL = ITEMS.register("smooth_light_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_BLUE_TERRACOTTA_GATE = ITEMS.register("smooth_light_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Blue Terracotta Bricks
	public static final RegistrySupplier<Item> LIGHT_BLUE_TERRACOTTA_BRICKS = ITEMS.register("light_blue_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = ITEMS.register("light_blue_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = ITEMS.register("light_blue_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_TERRACOTTA_BRICK_WALL = ITEMS.register("light_blue_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_TERRACOTTA_BRICK_GATE = ITEMS.register("light_blue_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Light Blue Terracotta
	public static final RegistrySupplier<Item> CUT_LIGHT_BLUE_TERRACOTTA = ITEMS.register("cut_light_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIGHT_BLUE_TERRACOTTA_SLAB = ITEMS.register("cut_light_blue_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIGHT_BLUE_TERRACOTTA_STAIRS = ITEMS.register("cut_light_blue_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIGHT_BLUE_TERRACOTTA_WALL = ITEMS.register("cut_light_blue_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIGHT_BLUE_TERRACOTTA_GATE = ITEMS.register("cut_light_blue_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Blue Terracotta Tiles
	public static final RegistrySupplier<Item> LIGHT_BLUE_TERRACOTTA_TILES = ITEMS.register("light_blue_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_TERRACOTTA_TILE_SLAB = ITEMS.register("light_blue_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_TERRACOTTA_TILE_STAIRS = ITEMS.register("light_blue_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_TERRACOTTA_TILE_WALL = ITEMS.register("light_blue_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_TERRACOTTA_TILE_GATE = ITEMS.register("light_blue_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Blue Terracotta Pillar
	public static final RegistrySupplier<Item> LIGHT_BLUE_TERRACOTTA_PILLAR = ITEMS.register("light_blue_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_TERRACOTTA_CORNER_PILLAR = ITEMS.register("light_blue_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TERRACOTTA_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Light Blue Terracotta
	public static final RegistrySupplier<Item> CHISELED_LIGHT_BLUE_TERRACOTTA = ITEMS.register("chiseled_light_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_LIGHT_BLUE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Light Blue Terracotta
	public static final RegistrySupplier<Item> CARVED_LIGHT_BLUE_TERRACOTTA = ITEMS.register("carved_light_blue_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_LIGHT_BLUE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// PURPLE TERRACOTTA

	// Base
	public static final RegistrySupplier<Item> PURPLE_TERRACOTTA_SLAB = ITEMS.register("purple_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_TERRACOTTA_STAIRS = ITEMS.register("purple_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_TERRACOTTA_WALL = ITEMS.register("purple_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_TERRACOTTA_GATE = ITEMS.register("purple_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Purple Terracotta
	public static final RegistrySupplier<Item> COBBLED_PURPLE_TERRACOTTA = ITEMS.register("cobbled_purple_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_PURPLE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_PURPLE_TERRACOTTA_SLAB = ITEMS.register("cobbled_purple_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_PURPLE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_PURPLE_TERRACOTTA_STAIRS = ITEMS.register("cobbled_purple_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_PURPLE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_PURPLE_TERRACOTTA_WALL = ITEMS.register("cobbled_purple_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_PURPLE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_PURPLE_TERRACOTTA_GATE = ITEMS.register("cobbled_purple_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_PURPLE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Purple Terracotta
	public static final RegistrySupplier<Item> POLISHED_PURPLE_TERRACOTTA = ITEMS.register("polished_purple_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PURPLE_TERRACOTTA_SLAB = ITEMS.register("polished_purple_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PURPLE_TERRACOTTA_STAIRS = ITEMS.register("polished_purple_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PURPLE_TERRACOTTA_WALL = ITEMS.register("polished_purple_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PURPLE_TERRACOTTA_GATE = ITEMS.register("polished_purple_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Purple Terracotta
	public static final RegistrySupplier<Item> SMOOTH_PURPLE_TERRACOTTA = ITEMS.register("smooth_purple_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PURPLE_TERRACOTTA_SLAB = ITEMS.register("smooth_purple_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PURPLE_TERRACOTTA_STAIRS = ITEMS.register("smooth_purple_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PURPLE_TERRACOTTA_WALL = ITEMS.register("smooth_purple_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PURPLE_TERRACOTTA_GATE = ITEMS.register("smooth_purple_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Purple Terracotta Bricks
	public static final RegistrySupplier<Item> PURPLE_TERRACOTTA_BRICKS = ITEMS.register("purple_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_TERRACOTTA_BRICK_SLAB = ITEMS.register("purple_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_TERRACOTTA_BRICK_STAIRS = ITEMS.register("purple_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_TERRACOTTA_BRICK_WALL = ITEMS.register("purple_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_TERRACOTTA_BRICK_GATE = ITEMS.register("purple_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Purple Terracotta
	public static final RegistrySupplier<Item> CUT_PURPLE_TERRACOTTA = ITEMS.register("cut_purple_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_PURPLE_TERRACOTTA_SLAB = ITEMS.register("cut_purple_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_PURPLE_TERRACOTTA_STAIRS = ITEMS.register("cut_purple_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_PURPLE_TERRACOTTA_WALL = ITEMS.register("cut_purple_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_PURPLE_TERRACOTTA_GATE = ITEMS.register("cut_purple_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Purple Terracotta Tiles
	public static final RegistrySupplier<Item> PURPLE_TERRACOTTA_TILES = ITEMS.register("purple_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_TERRACOTTA_TILE_SLAB = ITEMS.register("purple_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_TERRACOTTA_TILE_STAIRS = ITEMS.register("purple_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_TERRACOTTA_TILE_WALL = ITEMS.register("purple_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_TERRACOTTA_TILE_GATE = ITEMS.register("purple_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Purple Terracotta Pillar
	public static final RegistrySupplier<Item> PURPLE_TERRACOTTA_PILLAR = ITEMS.register("purple_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_TERRACOTTA_CORNER_PILLAR = ITEMS.register("purple_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.PURPLE_TERRACOTTA_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Purple Terracotta
	public static final RegistrySupplier<Item> CHISELED_PURPLE_TERRACOTTA = ITEMS.register("chiseled_purple_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_PURPLE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Purple Terracotta
	public static final RegistrySupplier<Item> CARVED_PURPLE_TERRACOTTA = ITEMS.register("carved_purple_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_PURPLE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// MAGENTA TERRACOTTA

	// Base
	public static final RegistrySupplier<Item> MAGENTA_TERRACOTTA_SLAB = ITEMS.register("magenta_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_TERRACOTTA_STAIRS = ITEMS.register("magenta_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_TERRACOTTA_WALL = ITEMS.register("magenta_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_TERRACOTTA_GATE = ITEMS.register("magenta_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Magenta Terracotta
	public static final RegistrySupplier<Item> COBBLED_MAGENTA_TERRACOTTA = ITEMS.register("cobbled_magenta_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_MAGENTA_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_MAGENTA_TERRACOTTA_SLAB = ITEMS.register("cobbled_magenta_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_MAGENTA_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_MAGENTA_TERRACOTTA_STAIRS = ITEMS.register("cobbled_magenta_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_MAGENTA_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_MAGENTA_TERRACOTTA_WALL = ITEMS.register("cobbled_magenta_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_MAGENTA_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_MAGENTA_TERRACOTTA_GATE = ITEMS.register("cobbled_magenta_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_MAGENTA_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Magenta Terracotta
	public static final RegistrySupplier<Item> POLISHED_MAGENTA_TERRACOTTA = ITEMS.register("polished_magenta_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_MAGENTA_TERRACOTTA_SLAB = ITEMS.register("polished_magenta_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_MAGENTA_TERRACOTTA_STAIRS = ITEMS.register("polished_magenta_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_MAGENTA_TERRACOTTA_WALL = ITEMS.register("polished_magenta_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_MAGENTA_TERRACOTTA_GATE = ITEMS.register("polished_magenta_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Magenta Terracotta
	public static final RegistrySupplier<Item> SMOOTH_MAGENTA_TERRACOTTA = ITEMS.register("smooth_magenta_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_MAGENTA_TERRACOTTA_SLAB = ITEMS.register("smooth_magenta_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_MAGENTA_TERRACOTTA_STAIRS = ITEMS.register("smooth_magenta_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_MAGENTA_TERRACOTTA_WALL = ITEMS.register("smooth_magenta_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_MAGENTA_TERRACOTTA_GATE = ITEMS.register("smooth_magenta_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Magenta Terracotta Bricks
	public static final RegistrySupplier<Item> MAGENTA_TERRACOTTA_BRICKS = ITEMS.register("magenta_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_TERRACOTTA_BRICK_SLAB = ITEMS.register("magenta_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_TERRACOTTA_BRICK_STAIRS = ITEMS.register("magenta_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_TERRACOTTA_BRICK_WALL = ITEMS.register("magenta_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_TERRACOTTA_BRICK_GATE = ITEMS.register("magenta_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Magenta Terracotta
	public static final RegistrySupplier<Item> CUT_MAGENTA_TERRACOTTA = ITEMS.register("cut_magenta_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_MAGENTA_TERRACOTTA_SLAB = ITEMS.register("cut_magenta_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_MAGENTA_TERRACOTTA_STAIRS = ITEMS.register("cut_magenta_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_MAGENTA_TERRACOTTA_WALL = ITEMS.register("cut_magenta_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_MAGENTA_TERRACOTTA_GATE = ITEMS.register("cut_magenta_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Magenta Terracotta Tiles
	public static final RegistrySupplier<Item> MAGENTA_TERRACOTTA_TILES = ITEMS.register("magenta_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_TERRACOTTA_TILE_SLAB = ITEMS.register("magenta_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_TERRACOTTA_TILE_STAIRS = ITEMS.register("magenta_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_TERRACOTTA_TILE_WALL = ITEMS.register("magenta_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_TERRACOTTA_TILE_GATE = ITEMS.register("magenta_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Magenta Terracotta Pillar
	public static final RegistrySupplier<Item> MAGENTA_TERRACOTTA_PILLAR = ITEMS.register("magenta_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_TERRACOTTA_CORNER_PILLAR = ITEMS.register("magenta_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TERRACOTTA_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Magenta Terracotta
	public static final RegistrySupplier<Item> CHISELED_MAGENTA_TERRACOTTA = ITEMS.register("chiseled_magenta_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_MAGENTA_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Magenta Terracotta
	public static final RegistrySupplier<Item> CARVED_MAGENTA_TERRACOTTA = ITEMS.register("carved_magenta_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_MAGENTA_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// PINK TERRACOTTA

	// Base
	public static final RegistrySupplier<Item> PINK_TERRACOTTA_SLAB = ITEMS.register("pink_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_TERRACOTTA_STAIRS = ITEMS.register("pink_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_TERRACOTTA_WALL = ITEMS.register("pink_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_TERRACOTTA_GATE = ITEMS.register("pink_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Pink Terracotta
	public static final RegistrySupplier<Item> COBBLED_PINK_TERRACOTTA = ITEMS.register("cobbled_pink_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_PINK_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_PINK_TERRACOTTA_SLAB = ITEMS.register("cobbled_pink_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_PINK_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_PINK_TERRACOTTA_STAIRS = ITEMS.register("cobbled_pink_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_PINK_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_PINK_TERRACOTTA_WALL = ITEMS.register("cobbled_pink_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_PINK_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_PINK_TERRACOTTA_GATE = ITEMS.register("cobbled_pink_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_PINK_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Pink Terracotta
	public static final RegistrySupplier<Item> POLISHED_PINK_TERRACOTTA = ITEMS.register("polished_pink_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PINK_TERRACOTTA_SLAB = ITEMS.register("polished_pink_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PINK_TERRACOTTA_STAIRS = ITEMS.register("polished_pink_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PINK_TERRACOTTA_WALL = ITEMS.register("polished_pink_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PINK_TERRACOTTA_GATE = ITEMS.register("polished_pink_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Pink Terracotta
	public static final RegistrySupplier<Item> SMOOTH_PINK_TERRACOTTA = ITEMS.register("smooth_pink_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PINK_TERRACOTTA_SLAB = ITEMS.register("smooth_pink_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PINK_TERRACOTTA_STAIRS = ITEMS.register("smooth_pink_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PINK_TERRACOTTA_WALL = ITEMS.register("smooth_pink_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PINK_TERRACOTTA_GATE = ITEMS.register("smooth_pink_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Pink Terracotta Bricks
	public static final RegistrySupplier<Item> PINK_TERRACOTTA_BRICKS = ITEMS.register("pink_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_TERRACOTTA_BRICK_SLAB = ITEMS.register("pink_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_TERRACOTTA_BRICK_STAIRS = ITEMS.register("pink_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_TERRACOTTA_BRICK_WALL = ITEMS.register("pink_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_TERRACOTTA_BRICK_GATE = ITEMS.register("pink_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Pink Terracotta
	public static final RegistrySupplier<Item> CUT_PINK_TERRACOTTA = ITEMS.register("cut_pink_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_PINK_TERRACOTTA_SLAB = ITEMS.register("cut_pink_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_PINK_TERRACOTTA_STAIRS = ITEMS.register("cut_pink_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_PINK_TERRACOTTA_WALL = ITEMS.register("cut_pink_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_PINK_TERRACOTTA_GATE = ITEMS.register("cut_pink_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Pink Terracotta Tiles
	public static final RegistrySupplier<Item> PINK_TERRACOTTA_TILES = ITEMS.register("pink_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_TERRACOTTA_TILE_SLAB = ITEMS.register("pink_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_TERRACOTTA_TILE_STAIRS = ITEMS.register("pink_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_TERRACOTTA_TILE_WALL = ITEMS.register("pink_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_TERRACOTTA_TILE_GATE = ITEMS.register("pink_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Pink Terracotta Pillar
	public static final RegistrySupplier<Item> PINK_TERRACOTTA_PILLAR = ITEMS.register("pink_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_TERRACOTTA_CORNER_PILLAR = ITEMS.register("pink_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.PINK_TERRACOTTA_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Pink Terracotta
	public static final RegistrySupplier<Item> CHISELED_PINK_TERRACOTTA = ITEMS.register("chiseled_pink_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_PINK_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Pink Terracotta
	public static final RegistrySupplier<Item> CARVED_PINK_TERRACOTTA = ITEMS.register("carved_pink_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_PINK_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// WHITE TERRACOTTa

	// Base
	public static final RegistrySupplier<Item> WHITE_TERRACOTTA_SLAB = ITEMS.register("white_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_TERRACOTTA_STAIRS = ITEMS.register("white_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_TERRACOTTA_WALL = ITEMS.register("white_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_TERRACOTTA_GATE = ITEMS.register("white_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled White Terracotta
	public static final RegistrySupplier<Item> COBBLED_WHITE_TERRACOTTA = ITEMS.register("cobbled_white_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_WHITE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_WHITE_TERRACOTTA_SLAB = ITEMS.register("cobbled_white_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_WHITE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_WHITE_TERRACOTTA_STAIRS = ITEMS.register("cobbled_white_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_WHITE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_WHITE_TERRACOTTA_WALL = ITEMS.register("cobbled_white_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_WHITE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_WHITE_TERRACOTTA_GATE = ITEMS.register("cobbled_white_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_WHITE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished White Terracotta
	public static final RegistrySupplier<Item> POLISHED_WHITE_TERRACOTTA = ITEMS.register("polished_white_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_WHITE_TERRACOTTA_SLAB = ITEMS.register("polished_white_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_WHITE_TERRACOTTA_STAIRS = ITEMS.register("polished_white_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_WHITE_TERRACOTTA_WALL = ITEMS.register("polished_white_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_WHITE_TERRACOTTA_GATE = ITEMS.register("polished_white_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth White Terracotta
	public static final RegistrySupplier<Item> SMOOTH_WHITE_TERRACOTTA = ITEMS.register("smooth_white_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_WHITE_TERRACOTTA_SLAB = ITEMS.register("smooth_white_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_WHITE_TERRACOTTA_STAIRS = ITEMS.register("smooth_white_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_WHITE_TERRACOTTA_WALL = ITEMS.register("smooth_white_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_WHITE_TERRACOTTA_GATE = ITEMS.register("smooth_white_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// White Terracotta Bricks
	public static final RegistrySupplier<Item> WHITE_TERRACOTTA_BRICKS = ITEMS.register("white_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_TERRACOTTA_BRICK_SLAB = ITEMS.register("white_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_TERRACOTTA_BRICK_STAIRS = ITEMS.register("white_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_TERRACOTTA_BRICK_WALL = ITEMS.register("white_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_TERRACOTTA_BRICK_GATE = ITEMS.register("white_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut White Terracotta
	public static final RegistrySupplier<Item> CUT_WHITE_TERRACOTTA = ITEMS.register("cut_white_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_WHITE_TERRACOTTA_SLAB = ITEMS.register("cut_white_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_WHITE_TERRACOTTA_STAIRS = ITEMS.register("cut_white_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_WHITE_TERRACOTTA_WALL = ITEMS.register("cut_white_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_WHITE_TERRACOTTA_GATE = ITEMS.register("cut_white_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// White Terracotta Tiles
	public static final RegistrySupplier<Item> WHITE_TERRACOTTA_TILES = ITEMS.register("white_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_TERRACOTTA_TILE_SLAB = ITEMS.register("white_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_TERRACOTTA_TILE_STAIRS = ITEMS.register("white_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_TERRACOTTA_TILE_WALL = ITEMS.register("white_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_TERRACOTTA_TILE_GATE = ITEMS.register("white_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// White Terracotta Pillar
	public static final RegistrySupplier<Item> WHITE_TERRACOTTA_PILLAR = ITEMS.register("white_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_TERRACOTTA_CORNER_PILLAR = ITEMS.register("white_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.WHITE_TERRACOTTA_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled White Terracotta
	public static final RegistrySupplier<Item> CHISELED_WHITE_TERRACOTTA = ITEMS.register("chiseled_white_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_WHITE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved White Terracotta
	public static final RegistrySupplier<Item> CARVED_WHITE_TERRACOTTA = ITEMS.register("carved_white_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_WHITE_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// LIGHT GRAY TERRACOTTA

	// Base
	public static final RegistrySupplier<Item> LIGHT_GRAY_TERRACOTTA_SLAB = ITEMS.register("light_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_TERRACOTTA_STAIRS = ITEMS.register("light_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_TERRACOTTA_WALL = ITEMS.register("light_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_TERRACOTTA_GATE = ITEMS.register("light_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Light Gray Terracotta
	public static final RegistrySupplier<Item> COBBLED_LIGHT_GRAY_TERRACOTTA = ITEMS.register("cobbled_light_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_GRAY_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_LIGHT_GRAY_TERRACOTTA_SLAB = ITEMS.register("cobbled_light_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_GRAY_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_LIGHT_GRAY_TERRACOTTA_STAIRS = ITEMS.register("cobbled_light_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_GRAY_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_LIGHT_GRAY_TERRACOTTA_WALL = ITEMS.register("cobbled_light_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_GRAY_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_LIGHT_GRAY_TERRACOTTA_GATE = ITEMS.register("cobbled_light_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_LIGHT_GRAY_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Light Gray Terracotta
	public static final RegistrySupplier<Item> POLISHED_LIGHT_GRAY_TERRACOTTA = ITEMS.register("polished_light_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_GRAY_TERRACOTTA_SLAB = ITEMS.register("polished_light_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_GRAY_TERRACOTTA_STAIRS = ITEMS.register("polished_light_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_GRAY_TERRACOTTA_WALL = ITEMS.register("polished_light_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_GRAY_TERRACOTTA_GATE = ITEMS.register("polished_light_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Light Gray Terracotta
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_GRAY_TERRACOTTA = ITEMS.register("smooth_light_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_GRAY_TERRACOTTA_SLAB = ITEMS.register("smooth_light_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_GRAY_TERRACOTTA_STAIRS = ITEMS.register("smooth_light_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_GRAY_TERRACOTTA_WALL = ITEMS.register("smooth_light_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_GRAY_TERRACOTTA_GATE = ITEMS.register("smooth_light_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Gray Terracotta Bricks
	public static final RegistrySupplier<Item> LIGHT_GRAY_TERRACOTTA_BRICKS = ITEMS.register("light_gray_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = ITEMS.register("light_gray_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = ITEMS.register("light_gray_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_TERRACOTTA_BRICK_WALL = ITEMS.register("light_gray_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_TERRACOTTA_BRICK_GATE = ITEMS.register("light_gray_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Light Gray Terracotta
	public static final RegistrySupplier<Item> CUT_LIGHT_GRAY_TERRACOTTA = ITEMS.register("cut_light_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIGHT_GRAY_TERRACOTTA_SLAB = ITEMS.register("cut_light_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIGHT_GRAY_TERRACOTTA_STAIRS = ITEMS.register("cut_light_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIGHT_GRAY_TERRACOTTA_WALL = ITEMS.register("cut_light_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIGHT_GRAY_TERRACOTTA_GATE = ITEMS.register("cut_light_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Gray Terracotta Tiles
	public static final RegistrySupplier<Item> LIGHT_GRAY_TERRACOTTA_TILES = ITEMS.register("light_gray_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_TERRACOTTA_TILE_SLAB = ITEMS.register("light_gray_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_TERRACOTTA_TILE_STAIRS = ITEMS.register("light_gray_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_TERRACOTTA_TILE_WALL = ITEMS.register("light_gray_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_TERRACOTTA_TILE_GATE = ITEMS.register("light_gray_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Gray Terracotta Pillar
	public static final RegistrySupplier<Item> LIGHT_GRAY_TERRACOTTA_PILLAR = ITEMS.register("light_gray_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_TERRACOTTA_CORNER_PILLAR = ITEMS.register("light_gray_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TERRACOTTA_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Light Gray Terracotta
	public static final RegistrySupplier<Item> CHISELED_LIGHT_GRAY_TERRACOTTA = ITEMS.register("chiseled_light_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_LIGHT_GRAY_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Light Gray Terracotta
	public static final RegistrySupplier<Item> CARVED_LIGHT_GRAY_TERRACOTTA = ITEMS.register("carved_light_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_LIGHT_GRAY_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// GRAY TERRACOTTA

	// Base
	public static final RegistrySupplier<Item> GRAY_TERRACOTTA_SLAB = ITEMS.register("gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_TERRACOTTA_STAIRS = ITEMS.register("gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_TERRACOTTA_WALL = ITEMS.register("gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_TERRACOTTA_GATE = ITEMS.register("gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Gray Terracotta
	public static final RegistrySupplier<Item> COBBLED_GRAY_TERRACOTTA = ITEMS.register("cobbled_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRAY_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_GRAY_TERRACOTTA_SLAB = ITEMS.register("cobbled_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRAY_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_GRAY_TERRACOTTA_STAIRS = ITEMS.register("cobbled_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRAY_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_GRAY_TERRACOTTA_WALL = ITEMS.register("cobbled_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRAY_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_GRAY_TERRACOTTA_GATE = ITEMS.register("cobbled_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_GRAY_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Gray Terracotta
	public static final RegistrySupplier<Item> POLISHED_GRAY_TERRACOTTA = ITEMS.register("polished_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GRAY_TERRACOTTA_SLAB = ITEMS.register("polished_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GRAY_TERRACOTTA_STAIRS = ITEMS.register("polished_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GRAY_TERRACOTTA_WALL = ITEMS.register("polished_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GRAY_TERRACOTTA_GATE = ITEMS.register("polished_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Gray Terracotta
	public static final RegistrySupplier<Item> SMOOTH_GRAY_TERRACOTTA = ITEMS.register("smooth_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GRAY_TERRACOTTA_SLAB = ITEMS.register("smooth_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GRAY_TERRACOTTA_STAIRS = ITEMS.register("smooth_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GRAY_TERRACOTTA_WALL = ITEMS.register("smooth_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GRAY_TERRACOTTA_GATE = ITEMS.register("smooth_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Gray Terracotta Bricks
	public static final RegistrySupplier<Item> GRAY_TERRACOTTA_BRICKS = ITEMS.register("gray_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_TERRACOTTA_BRICK_SLAB = ITEMS.register("gray_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_TERRACOTTA_BRICK_STAIRS = ITEMS.register("gray_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_TERRACOTTA_BRICK_WALL = ITEMS.register("gray_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_TERRACOTTA_BRICK_GATE = ITEMS.register("gray_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Gray Terracotta
	public static final RegistrySupplier<Item> CUT_GRAY_TERRACOTTA = ITEMS.register("cut_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_GRAY_TERRACOTTA_SLAB = ITEMS.register("cut_gray_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_GRAY_TERRACOTTA_STAIRS = ITEMS.register("cut_gray_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_GRAY_TERRACOTTA_WALL = ITEMS.register("cut_gray_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_GRAY_TERRACOTTA_GATE = ITEMS.register("cut_gray_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Gray Terracotta Tiles
	public static final RegistrySupplier<Item> GRAY_TERRACOTTA_TILES = ITEMS.register("gray_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_TERRACOTTA_TILE_SLAB = ITEMS.register("gray_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_TERRACOTTA_TILE_STAIRS = ITEMS.register("gray_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_TERRACOTTA_TILE_WALL = ITEMS.register("gray_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_TERRACOTTA_TILE_GATE = ITEMS.register("gray_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Gray Terracotta Pillar
	public static final RegistrySupplier<Item> GRAY_TERRACOTTA_PILLAR = ITEMS.register("gray_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_TERRACOTTA_CORNER_PILLAR = ITEMS.register("gray_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.GRAY_TERRACOTTA_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Gray Terracotta
	public static final RegistrySupplier<Item> CHISELED_GRAY_TERRACOTTA = ITEMS.register("chiseled_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_GRAY_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved  Gray Terracotta
	public static final RegistrySupplier<Item> CARVED_GRAY_TERRACOTTA = ITEMS.register("carved_gray_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_GRAY_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// BLACK TERRACOTTA

	// Base
	public static final RegistrySupplier<Item> BLACK_TERRACOTTA_SLAB = ITEMS.register("black_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_TERRACOTTA_STAIRS = ITEMS.register("black_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_TERRACOTTA_WALL = ITEMS.register("black_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_TERRACOTTA_GATE = ITEMS.register("black_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Black Terracotta
	public static final RegistrySupplier<Item> COBBLED_BLACK_TERRACOTTA = ITEMS.register("cobbled_black_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACK_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_BLACK_TERRACOTTA_SLAB = ITEMS.register("cobbled_black_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACK_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_BLACK_TERRACOTTA_STAIRS = ITEMS.register("cobbled_black_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACK_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_BLACK_TERRACOTTA_WALL = ITEMS.register("cobbled_black_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACK_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_BLACK_TERRACOTTA_GATE = ITEMS.register("cobbled_black_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_BLACK_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Black Terracotta
	public static final RegistrySupplier<Item> POLISHED_BLACK_TERRACOTTA = ITEMS.register("polished_black_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLACK_TERRACOTTA_SLAB = ITEMS.register("polished_black_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLACK_TERRACOTTA_STAIRS = ITEMS.register("polished_black_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLACK_TERRACOTTA_WALL = ITEMS.register("polished_black_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLACK_TERRACOTTA_GATE = ITEMS.register("polished_black_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Black Terracotta
	public static final RegistrySupplier<Item> SMOOTH_BLACK_TERRACOTTA = ITEMS.register("smooth_black_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLACK_TERRACOTTA_SLAB = ITEMS.register("smooth_black_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLACK_TERRACOTTA_STAIRS = ITEMS.register("smooth_black_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLACK_TERRACOTTA_WALL = ITEMS.register("smooth_black_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLACK_TERRACOTTA_GATE = ITEMS.register("smooth_black_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Black Terracotta Bricks
	public static final RegistrySupplier<Item> BLACK_TERRACOTTA_BRICKS = ITEMS.register("black_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_TERRACOTTA_BRICK_SLAB = ITEMS.register("black_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_TERRACOTTA_BRICK_STAIRS = ITEMS.register("black_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_TERRACOTTA_BRICK_WALL = ITEMS.register("black_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_TERRACOTTA_BRICK_GATE = ITEMS.register("black_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Black Terracotta
	public static final RegistrySupplier<Item> CUT_BLACK_TERRACOTTA = ITEMS.register("cut_black_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLACK_TERRACOTTA_SLAB = ITEMS.register("cut_black_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLACK_TERRACOTTA_STAIRS = ITEMS.register("cut_black_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLACK_TERRACOTTA_WALL = ITEMS.register("cut_black_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLACK_TERRACOTTA_GATE = ITEMS.register("cut_black_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Black Terracotta Tiles
	public static final RegistrySupplier<Item> BLACK_TERRACOTTA_TILES = ITEMS.register("black_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_TERRACOTTA_TILE_SLAB = ITEMS.register("black_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_TERRACOTTA_TILE_STAIRS = ITEMS.register("black_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_TERRACOTTA_TILE_WALL = ITEMS.register("black_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_TERRACOTTA_TILE_GATE = ITEMS.register("black_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Black Terracotta Pillar
	public static final RegistrySupplier<Item> BLACK_TERRACOTTA_PILLAR = ITEMS.register("black_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_TERRACOTTA_CORNER_PILLAR = ITEMS.register("black_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.BLACK_TERRACOTTA_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Black Terracotta
	public static final RegistrySupplier<Item> CHISELED_BLACK_TERRACOTTA = ITEMS.register("chiseled_black_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_BLACK_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Black Terracotta
	public static final RegistrySupplier<Item> CARVED_BLACK_TERRACOTTA = ITEMS.register("carved_black_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_BLACK_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

// BROWN TERRACOTTA

	// Base
	public static final RegistrySupplier<Item> BROWN_TERRACOTTA_SLAB = ITEMS.register("brown_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_TERRACOTTA_STAIRS = ITEMS.register("brown_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_TERRACOTTA_WALL = ITEMS.register("brown_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_TERRACOTTA_GATE = ITEMS.register("brown_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cobbled Brown Terracotta
	public static final RegistrySupplier<Item> COBBLED_BROWN_TERRACOTTA = ITEMS.register("cobbled_brown_terracotta", () ->
            new BlockItem(CPlusBlocks.COBBLED_BROWN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_BROWN_TERRACOTTA_SLAB = ITEMS.register("cobbled_brown_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.COBBLED_BROWN_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_BROWN_TERRACOTTA_STAIRS = ITEMS.register("cobbled_brown_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.COBBLED_BROWN_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_BROWN_TERRACOTTA_WALL = ITEMS.register("cobbled_brown_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.COBBLED_BROWN_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> COBBLED_BROWN_TERRACOTTA_GATE = ITEMS.register("cobbled_brown_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.COBBLED_BROWN_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Brown Terracotta
	public static final RegistrySupplier<Item> POLISHED_BROWN_TERRACOTTA = ITEMS.register("polished_brown_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BROWN_TERRACOTTA_SLAB = ITEMS.register("polished_brown_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BROWN_TERRACOTTA_STAIRS = ITEMS.register("polished_brown_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BROWN_TERRACOTTA_WALL = ITEMS.register("polished_brown_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BROWN_TERRACOTTA_GATE = ITEMS.register("polished_brown_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Brown Terracotta
	public static final RegistrySupplier<Item> SMOOTH_BROWN_TERRACOTTA = ITEMS.register("smooth_brown_terracotta", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BROWN_TERRACOTTA_SLAB = ITEMS.register("smooth_brown_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BROWN_TERRACOTTA_STAIRS = ITEMS.register("smooth_brown_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BROWN_TERRACOTTA_WALL = ITEMS.register("smooth_brown_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BROWN_TERRACOTTA_GATE = ITEMS.register("smooth_brown_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Brown Terracotta Bricks
	public static final RegistrySupplier<Item> BROWN_TERRACOTTA_BRICKS = ITEMS.register("brown_terracotta_bricks", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_TERRACOTTA_BRICK_SLAB = ITEMS.register("brown_terracotta_brick_slab", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_TERRACOTTA_BRICK_STAIRS = ITEMS.register("brown_terracotta_brick_stairs", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_TERRACOTTA_BRICK_WALL = ITEMS.register("brown_terracotta_brick_wall", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_TERRACOTTA_BRICK_GATE = ITEMS.register("brown_terracotta_brick_gate", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Brown Terracotta
	public static final RegistrySupplier<Item> CUT_BROWN_TERRACOTTA = ITEMS.register("cut_brown_terracotta", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BROWN_TERRACOTTA_SLAB = ITEMS.register("cut_brown_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BROWN_TERRACOTTA_STAIRS = ITEMS.register("cut_brown_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BROWN_TERRACOTTA_WALL = ITEMS.register("cut_brown_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BROWN_TERRACOTTA_GATE = ITEMS.register("cut_brown_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Brown Terracotta Tiles
	public static final RegistrySupplier<Item> BROWN_TERRACOTTA_TILES = ITEMS.register("brown_terracotta_tiles", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_TERRACOTTA_TILE_SLAB = ITEMS.register("brown_terracotta_tile_slab", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_TERRACOTTA_TILE_STAIRS = ITEMS.register("brown_terracotta_tile_stairs", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_TERRACOTTA_TILE_WALL = ITEMS.register("brown_terracotta_tile_wall", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_TERRACOTTA_TILE_GATE = ITEMS.register("brown_terracotta_tile_gate", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Brown Terracotta Pillar
	public static final RegistrySupplier<Item> BROWN_TERRACOTTA_PILLAR = ITEMS.register("brown_terracotta_pillar", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_TERRACOTTA_CORNER_PILLAR = ITEMS.register("brown_terracotta_corner_pillar", () ->
            new BlockItem(CPlusBlocks.BROWN_TERRACOTTA_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Brown Terracotta
	public static final RegistrySupplier<Item> CHISELED_BROWN_TERRACOTTA = ITEMS.register("chiseled_brown_terracotta", () ->
            new BlockItem(CPlusBlocks.CHISELED_BROWN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Brown Terracotta
	public static final RegistrySupplier<Item> CARVED_BROWN_TERRACOTTA = ITEMS.register("carved_brown_terracotta", () ->
            new BlockItem(CPlusBlocks.CARVED_BROWN_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


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
	public static final RegistrySupplier<Item> POLISHED_RED_GLAZED_TERRACOTTA = ITEMS.register("polished_red_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_RED_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_red_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_RED_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_red_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_RED_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_red_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_RED_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_red_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_GLAZED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> POLISHED_ORANGE_GLAZED_TERRACOTTA = ITEMS.register("polished_orange_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_ORANGE_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_orange_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_ORANGE_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_orange_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_ORANGE_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_orange_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_ORANGE_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_orange_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_GLAZED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> POLISHED_YELLOW_GLAZED_TERRACOTTA = ITEMS.register("polished_yellow_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_YELLOW_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_yellow_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_YELLOW_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_yellow_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_YELLOW_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_yellow_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_YELLOW_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_yellow_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_GLAZED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> POLISHED_LIME_GLAZED_TERRACOTTA = ITEMS.register("polished_lime_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIME_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_lime_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIME_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_lime_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIME_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_lime_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIME_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_lime_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_GLAZED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> POLISHED_GREEN_GLAZED_TERRACOTTA = ITEMS.register("polished_green_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GREEN_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_green_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GREEN_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_green_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GREEN_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_green_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GREEN_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_green_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_GLAZED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> POLISHED_BLUE_GLAZED_TERRACOTTA = ITEMS.register("polished_blue_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLUE_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_blue_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLUE_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_blue_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLUE_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_blue_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLUE_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_blue_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_GLAZED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> POLISHED_CYAN_GLAZED_TERRACOTTA = ITEMS.register("polished_cyan_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CYAN_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_cyan_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CYAN_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_cyan_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CYAN_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_cyan_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CYAN_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_cyan_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_GLAZED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA = ITEMS.register("polished_light_blue_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_light_blue_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_light_blue_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_light_blue_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_light_blue_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> POLISHED_PURPLE_GLAZED_TERRACOTTA = ITEMS.register("polished_purple_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PURPLE_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_purple_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PURPLE_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_purple_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PURPLE_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_purple_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PURPLE_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_purple_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_GLAZED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> POLISHED_MAGENTA_GLAZED_TERRACOTTA = ITEMS.register("polished_magenta_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_MAGENTA_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_magenta_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_MAGENTA_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_magenta_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_MAGENTA_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_magenta_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_MAGENTA_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_magenta_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_GLAZED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> POLISHED_PINK_GLAZED_TERRACOTTA = ITEMS.register("polished_pink_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PINK_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_pink_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PINK_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_pink_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PINK_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_pink_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PINK_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_pink_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_GLAZED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> POLISHED_WHITE_GLAZED_TERRACOTTA = ITEMS.register("polished_white_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_WHITE_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_white_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_WHITE_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_white_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_WHITE_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_white_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_WHITE_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_white_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_GLAZED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA = ITEMS.register("polished_light_gray_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_light_gray_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_light_gray_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_light_gray_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_light_gray_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> POLISHED_GRAY_GLAZED_TERRACOTTA = ITEMS.register("polished_gray_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GRAY_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_gray_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GRAY_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_gray_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GRAY_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_gray_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GRAY_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_gray_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_GLAZED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> POLISHED_BLACK_GLAZED_TERRACOTTA = ITEMS.register("polished_black_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLACK_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_black_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLACK_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_black_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLACK_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_black_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLACK_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_black_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_GLAZED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> POLISHED_BROWN_GLAZED_TERRACOTTA = ITEMS.register("polished_brown_glazed_terracotta", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BROWN_GLAZED_TERRACOTTA_SLAB = ITEMS.register("polished_brown_glazed_terracotta_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BROWN_GLAZED_TERRACOTTA_STAIRS = ITEMS.register("polished_brown_glazed_terracotta_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BROWN_GLAZED_TERRACOTTA_WALL = ITEMS.register("polished_brown_glazed_terracotta_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BROWN_GLAZED_TERRACOTTA_GATE = ITEMS.register("polished_brown_glazed_terracotta_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_GLAZED_TERRACOTTA_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Glazed Terracotta

	// Glazed Terracotta Bricks

	// Cut Glazed Terracotta

	// Glazed Terracotta Tiles

	// Glazed Terracotta Pillar

	// Chiseled Glazed Terracotta

	// Carved Glazed Terracotta


// RED CONCRETE

	// Base
	public static final RegistrySupplier<Item> RED_CONCRETE_SLAB = ITEMS.register("red_concrete_slab", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_CONCRETE_STAIRS = ITEMS.register("red_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_CONCRETE_WALL = ITEMS.register("red_concrete_wall", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_CONCRETE_GATE = ITEMS.register("red_concrete_gate", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final RegistrySupplier<Item> POLISHED_RED_CONCRETE = ITEMS.register("polished_red_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_RED_CONCRETE_SLAB = ITEMS.register("polished_red_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_RED_CONCRETE_STAIRS = ITEMS.register("polished_red_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_RED_CONCRETE_WALL = ITEMS.register("polished_red_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_RED_CONCRETE_GATE = ITEMS.register("polished_red_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_RED_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final RegistrySupplier<Item> SMOOTH_RED_CONCRETE = ITEMS.register("smooth_red_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_RED_CONCRETE_SLAB = ITEMS.register("smooth_red_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_RED_CONCRETE_STAIRS = ITEMS.register("smooth_red_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_RED_CONCRETE_WALL = ITEMS.register("smooth_red_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_RED_CONCRETE_GATE = ITEMS.register("smooth_red_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_RED_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final RegistrySupplier<Item> RED_CONCRETE_BRICKS = ITEMS.register("red_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_CONCRETE_BRICK_SLAB = ITEMS.register("red_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_CONCRETE_BRICK_STAIRS = ITEMS.register("red_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_CONCRETE_BRICK_WALL = ITEMS.register("red_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_CONCRETE_BRICK_GATE = ITEMS.register("red_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final RegistrySupplier<Item> CUT_RED_CONCRETE = ITEMS.register("cut_red_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_RED_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_RED_CONCRETE_SLAB = ITEMS.register("cut_red_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_RED_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_RED_CONCRETE_STAIRS = ITEMS.register("cut_red_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_RED_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_RED_CONCRETE_WALL = ITEMS.register("cut_red_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_RED_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_RED_CONCRETE_GATE = ITEMS.register("cut_red_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_RED_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final RegistrySupplier<Item> RED_CONCRETE_TILES = ITEMS.register("red_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_CONCRETE_TILE_SLAB = ITEMS.register("red_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_CONCRETE_TILE_STAIRS = ITEMS.register("red_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_CONCRETE_TILE_WALL = ITEMS.register("red_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_CONCRETE_TILE_GATE = ITEMS.register("red_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final RegistrySupplier<Item> RED_CONCRETE_PILLAR = ITEMS.register("red_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_CONCRETE_CORNER_PILLAR = ITEMS.register("red_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.RED_CONCRETE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final RegistrySupplier<Item> CHISELED_RED_CONCRETE = ITEMS.register("chiseled_red_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_RED_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final RegistrySupplier<Item> CARVED_RED_CONCRETE = ITEMS.register("carved_red_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_RED_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// ORANGE CONCRETE

	// Base
	public static final RegistrySupplier<Item> ORANGE_CONCRETE_SLAB = ITEMS.register("orange_concrete_slab", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_CONCRETE_STAIRS = ITEMS.register("orange_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_CONCRETE_WALL = ITEMS.register("orange_concrete_wall", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_CONCRETE_GATE = ITEMS.register("orange_concrete_gate", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final RegistrySupplier<Item> POLISHED_ORANGE_CONCRETE = ITEMS.register("polished_orange_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_ORANGE_CONCRETE_SLAB = ITEMS.register("polished_orange_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_ORANGE_CONCRETE_STAIRS = ITEMS.register("polished_orange_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_ORANGE_CONCRETE_WALL = ITEMS.register("polished_orange_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_ORANGE_CONCRETE_GATE = ITEMS.register("polished_orange_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_ORANGE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final RegistrySupplier<Item> SMOOTH_ORANGE_CONCRETE = ITEMS.register("smooth_orange_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_ORANGE_CONCRETE_SLAB = ITEMS.register("smooth_orange_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_ORANGE_CONCRETE_STAIRS = ITEMS.register("smooth_orange_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_ORANGE_CONCRETE_WALL = ITEMS.register("smooth_orange_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_ORANGE_CONCRETE_GATE = ITEMS.register("smooth_orange_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_ORANGE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final RegistrySupplier<Item> ORANGE_CONCRETE_BRICKS = ITEMS.register("orange_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_CONCRETE_BRICK_SLAB = ITEMS.register("orange_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_CONCRETE_BRICK_STAIRS = ITEMS.register("orange_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_CONCRETE_BRICK_WALL = ITEMS.register("orange_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_CONCRETE_BRICK_GATE = ITEMS.register("orange_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final RegistrySupplier<Item> CUT_ORANGE_CONCRETE = ITEMS.register("cut_orange_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_ORANGE_CONCRETE_SLAB = ITEMS.register("cut_orange_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_ORANGE_CONCRETE_STAIRS = ITEMS.register("cut_orange_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_ORANGE_CONCRETE_WALL = ITEMS.register("cut_orange_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_ORANGE_CONCRETE_GATE = ITEMS.register("cut_orange_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_ORANGE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final RegistrySupplier<Item> ORANGE_CONCRETE_TILES = ITEMS.register("orange_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_CONCRETE_TILE_SLAB = ITEMS.register("orange_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_CONCRETE_TILE_STAIRS = ITEMS.register("orange_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_CONCRETE_TILE_WALL = ITEMS.register("orange_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_CONCRETE_TILE_GATE = ITEMS.register("orange_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final RegistrySupplier<Item> ORANGE_CONCRETE_PILLAR = ITEMS.register("orange_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_CONCRETE_CORNER_PILLAR = ITEMS.register("orange_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.ORANGE_CONCRETE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final RegistrySupplier<Item> CHISELED_ORANGE_CONCRETE = ITEMS.register("chiseled_orange_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_ORANGE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final RegistrySupplier<Item> CARVED_ORANGE_CONCRETE = ITEMS.register("carved_orange_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_ORANGE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// YELLOW CONCRETE

	// Base
	public static final RegistrySupplier<Item> YELLOW_CONCRETE_SLAB = ITEMS.register("yellow_concrete_slab", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_CONCRETE_STAIRS = ITEMS.register("yellow_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_CONCRETE_WALL = ITEMS.register("yellow_concrete_wall", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_CONCRETE_GATE = ITEMS.register("yellow_concrete_gate", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final RegistrySupplier<Item> POLISHED_YELLOW_CONCRETE = ITEMS.register("polished_yellow_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_YELLOW_CONCRETE_SLAB = ITEMS.register("polished_yellow_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_YELLOW_CONCRETE_STAIRS = ITEMS.register("polished_yellow_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_YELLOW_CONCRETE_WALL = ITEMS.register("polished_yellow_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_YELLOW_CONCRETE_GATE = ITEMS.register("polished_yellow_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_YELLOW_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final RegistrySupplier<Item> SMOOTH_YELLOW_CONCRETE = ITEMS.register("smooth_yellow_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_YELLOW_CONCRETE_SLAB = ITEMS.register("smooth_yellow_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_YELLOW_CONCRETE_STAIRS = ITEMS.register("smooth_yellow_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_YELLOW_CONCRETE_WALL = ITEMS.register("smooth_yellow_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_YELLOW_CONCRETE_GATE = ITEMS.register("smooth_yellow_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_YELLOW_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final RegistrySupplier<Item> YELLOW_CONCRETE_BRICKS = ITEMS.register("yellow_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_CONCRETE_BRICK_SLAB = ITEMS.register("yellow_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_CONCRETE_BRICK_STAIRS = ITEMS.register("yellow_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_CONCRETE_BRICK_WALL = ITEMS.register("yellow_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_CONCRETE_BRICK_GATE = ITEMS.register("yellow_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final RegistrySupplier<Item> CUT_YELLOW_CONCRETE = ITEMS.register("cut_yellow_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_YELLOW_CONCRETE_SLAB = ITEMS.register("cut_yellow_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_YELLOW_CONCRETE_STAIRS = ITEMS.register("cut_yellow_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_YELLOW_CONCRETE_WALL = ITEMS.register("cut_yellow_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_YELLOW_CONCRETE_GATE = ITEMS.register("cut_yellow_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_YELLOW_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final RegistrySupplier<Item> YELLOW_CONCRETE_TILES = ITEMS.register("yellow_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_CONCRETE_TILE_SLAB = ITEMS.register("yellow_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_CONCRETE_TILE_STAIRS = ITEMS.register("yellow_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_CONCRETE_TILE_WALL = ITEMS.register("yellow_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_CONCRETE_TILE_GATE = ITEMS.register("yellow_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final RegistrySupplier<Item> YELLOW_CONCRETE_PILLAR = ITEMS.register("yellow_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_CONCRETE_CORNER_PILLAR = ITEMS.register("yellow_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.YELLOW_CONCRETE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final RegistrySupplier<Item> CHISELED_YELLOW_CONCRETE = ITEMS.register("chiseled_yellow_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_YELLOW_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final RegistrySupplier<Item> CARVED_YELLOW_CONCRETE = ITEMS.register("carved_yellow_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_YELLOW_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// LIME CONCRETE

	// Base
	public static final RegistrySupplier<Item> LIME_CONCRETE_SLAB = ITEMS.register("lime_concrete_slab", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_CONCRETE_STAIRS = ITEMS.register("lime_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_CONCRETE_WALL = ITEMS.register("lime_concrete_wall", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_CONCRETE_GATE = ITEMS.register("lime_concrete_gate", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final RegistrySupplier<Item> POLISHED_LIME_CONCRETE = ITEMS.register("polished_lime_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIME_CONCRETE_SLAB = ITEMS.register("polished_lime_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIME_CONCRETE_STAIRS = ITEMS.register("polished_lime_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIME_CONCRETE_WALL = ITEMS.register("polished_lime_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIME_CONCRETE_GATE = ITEMS.register("polished_lime_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIME_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final RegistrySupplier<Item> SMOOTH_LIME_CONCRETE = ITEMS.register("smooth_lime_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIME_CONCRETE_SLAB = ITEMS.register("smooth_lime_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIME_CONCRETE_STAIRS = ITEMS.register("smooth_lime_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIME_CONCRETE_WALL = ITEMS.register("smooth_lime_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIME_CONCRETE_GATE = ITEMS.register("smooth_lime_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIME_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final RegistrySupplier<Item> LIME_CONCRETE_BRICKS = ITEMS.register("lime_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_CONCRETE_BRICK_SLAB = ITEMS.register("lime_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_CONCRETE_BRICK_STAIRS = ITEMS.register("lime_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_CONCRETE_BRICK_WALL = ITEMS.register("lime_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_CONCRETE_BRICK_GATE = ITEMS.register("lime_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final RegistrySupplier<Item> CUT_LIME_CONCRETE = ITEMS.register("cut_lime_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIME_CONCRETE_SLAB = ITEMS.register("cut_lime_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIME_CONCRETE_STAIRS = ITEMS.register("cut_lime_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIME_CONCRETE_WALL = ITEMS.register("cut_lime_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIME_CONCRETE_GATE = ITEMS.register("cut_lime_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_LIME_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final RegistrySupplier<Item> LIME_CONCRETE_TILES = ITEMS.register("lime_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_CONCRETE_TILE_SLAB = ITEMS.register("lime_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_CONCRETE_TILE_STAIRS = ITEMS.register("lime_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_CONCRETE_TILE_WALL = ITEMS.register("lime_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_CONCRETE_TILE_GATE = ITEMS.register("lime_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final RegistrySupplier<Item> LIME_CONCRETE_PILLAR = ITEMS.register("lime_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_CONCRETE_CORNER_PILLAR = ITEMS.register("lime_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.LIME_CONCRETE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final RegistrySupplier<Item> CHISELED_LIME_CONCRETE = ITEMS.register("chiseled_lime_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_LIME_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final RegistrySupplier<Item> CARVED_LIME_CONCRETE = ITEMS.register("carved_lime_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_LIME_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// GREEN CONCRETE

	// Base
	public static final RegistrySupplier<Item> GREEN_CONCRETE_SLAB = ITEMS.register("green_concrete_slab", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_CONCRETE_STAIRS = ITEMS.register("green_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_CONCRETE_WALL = ITEMS.register("green_concrete_wall", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_CONCRETE_GATE = ITEMS.register("green_concrete_gate", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final RegistrySupplier<Item> POLISHED_GREEN_CONCRETE = ITEMS.register("polished_green_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GREEN_CONCRETE_SLAB = ITEMS.register("polished_green_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GREEN_CONCRETE_STAIRS = ITEMS.register("polished_green_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GREEN_CONCRETE_WALL = ITEMS.register("polished_green_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GREEN_CONCRETE_GATE = ITEMS.register("polished_green_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_GREEN_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final RegistrySupplier<Item> SMOOTH_GREEN_CONCRETE = ITEMS.register("smooth_green_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GREEN_CONCRETE_SLAB = ITEMS.register("smooth_green_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GREEN_CONCRETE_STAIRS = ITEMS.register("smooth_green_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GREEN_CONCRETE_WALL = ITEMS.register("smooth_green_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GREEN_CONCRETE_GATE = ITEMS.register("smooth_green_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GREEN_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final RegistrySupplier<Item> GREEN_CONCRETE_BRICKS = ITEMS.register("green_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_CONCRETE_BRICK_SLAB = ITEMS.register("green_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_CONCRETE_BRICK_STAIRS = ITEMS.register("green_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_CONCRETE_BRICK_WALL = ITEMS.register("green_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_CONCRETE_BRICK_GATE = ITEMS.register("green_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final RegistrySupplier<Item> CUT_GREEN_CONCRETE = ITEMS.register("cut_green_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_GREEN_CONCRETE_SLAB = ITEMS.register("cut_green_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_GREEN_CONCRETE_STAIRS = ITEMS.register("cut_green_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_GREEN_CONCRETE_WALL = ITEMS.register("cut_green_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_GREEN_CONCRETE_GATE = ITEMS.register("cut_green_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_GREEN_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final RegistrySupplier<Item> GREEN_CONCRETE_TILES = ITEMS.register("green_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_CONCRETE_TILE_SLAB = ITEMS.register("green_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_CONCRETE_TILE_STAIRS = ITEMS.register("green_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_CONCRETE_TILE_WALL = ITEMS.register("green_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_CONCRETE_TILE_GATE = ITEMS.register("green_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final RegistrySupplier<Item> GREEN_CONCRETE_PILLAR = ITEMS.register("green_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_CONCRETE_CORNER_PILLAR = ITEMS.register("green_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.GREEN_CONCRETE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final RegistrySupplier<Item> CHISELED_GREEN_CONCRETE = ITEMS.register("chiseled_green_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_GREEN_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final RegistrySupplier<Item> CARVED_GREEN_CONCRETE = ITEMS.register("carved_green_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_GREEN_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// BLUE CONCRETE

	// Base
	public static final RegistrySupplier<Item> BLUE_CONCRETE_SLAB = ITEMS.register("blue_concrete_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_CONCRETE_STAIRS = ITEMS.register("blue_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_CONCRETE_WALL = ITEMS.register("blue_concrete_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_CONCRETE_GATE = ITEMS.register("blue_concrete_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final RegistrySupplier<Item> POLISHED_BLUE_CONCRETE = ITEMS.register("polished_blue_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLUE_CONCRETE_SLAB = ITEMS.register("polished_blue_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLUE_CONCRETE_STAIRS = ITEMS.register("polished_blue_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLUE_CONCRETE_WALL = ITEMS.register("polished_blue_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLUE_CONCRETE_GATE = ITEMS.register("polished_blue_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLUE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final RegistrySupplier<Item> SMOOTH_BLUE_CONCRETE = ITEMS.register("smooth_blue_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLUE_CONCRETE_SLAB = ITEMS.register("smooth_blue_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLUE_CONCRETE_STAIRS = ITEMS.register("smooth_blue_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLUE_CONCRETE_WALL = ITEMS.register("smooth_blue_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLUE_CONCRETE_GATE = ITEMS.register("smooth_blue_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLUE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final RegistrySupplier<Item> BLUE_CONCRETE_BRICKS = ITEMS.register("blue_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_CONCRETE_BRICK_SLAB = ITEMS.register("blue_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_CONCRETE_BRICK_STAIRS = ITEMS.register("blue_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_CONCRETE_BRICK_WALL = ITEMS.register("blue_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_CONCRETE_BRICK_GATE = ITEMS.register("blue_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final RegistrySupplier<Item> CUT_BLUE_CONCRETE = ITEMS.register("cut_blue_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLUE_CONCRETE_SLAB = ITEMS.register("cut_blue_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLUE_CONCRETE_STAIRS = ITEMS.register("cut_blue_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLUE_CONCRETE_WALL = ITEMS.register("cut_blue_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLUE_CONCRETE_GATE = ITEMS.register("cut_blue_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_BLUE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final RegistrySupplier<Item> BLUE_CONCRETE_TILES = ITEMS.register("blue_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_CONCRETE_TILE_SLAB = ITEMS.register("blue_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_CONCRETE_TILE_STAIRS = ITEMS.register("blue_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_CONCRETE_TILE_WALL = ITEMS.register("blue_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_CONCRETE_TILE_GATE = ITEMS.register("blue_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final RegistrySupplier<Item> BLUE_CONCRETE_PILLAR = ITEMS.register("blue_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_CONCRETE_CORNER_PILLAR = ITEMS.register("blue_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.BLUE_CONCRETE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final RegistrySupplier<Item> CHISELED_BLUE_CONCRETE = ITEMS.register("chiseled_blue_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_BLUE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final RegistrySupplier<Item> CARVED_BLUE_CONCRETE = ITEMS.register("carved_blue_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_BLUE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// CYAN CONCRETE

	// Base
	public static final RegistrySupplier<Item> CYAN_CONCRETE_SLAB = ITEMS.register("cyan_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_CONCRETE_STAIRS = ITEMS.register("cyan_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_CONCRETE_WALL = ITEMS.register("cyan_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_CONCRETE_GATE = ITEMS.register("cyan_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final RegistrySupplier<Item> POLISHED_CYAN_CONCRETE = ITEMS.register("polished_cyan_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CYAN_CONCRETE_SLAB = ITEMS.register("polished_cyan_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CYAN_CONCRETE_STAIRS = ITEMS.register("polished_cyan_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CYAN_CONCRETE_WALL = ITEMS.register("polished_cyan_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_CYAN_CONCRETE_GATE = ITEMS.register("polished_cyan_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_CYAN_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final RegistrySupplier<Item> SMOOTH_CYAN_CONCRETE = ITEMS.register("smooth_cyan_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_CYAN_CONCRETE_SLAB = ITEMS.register("smooth_cyan_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_CYAN_CONCRETE_STAIRS = ITEMS.register("smooth_cyan_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_CYAN_CONCRETE_WALL = ITEMS.register("smooth_cyan_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_CYAN_CONCRETE_GATE = ITEMS.register("smooth_cyan_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_CYAN_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final RegistrySupplier<Item> CYAN_CONCRETE_BRICKS = ITEMS.register("cyan_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_CONCRETE_BRICK_SLAB = ITEMS.register("cyan_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_CONCRETE_BRICK_STAIRS = ITEMS.register("cyan_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_CONCRETE_BRICK_WALL = ITEMS.register("cyan_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_CONCRETE_BRICK_GATE = ITEMS.register("cyan_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final RegistrySupplier<Item> CUT_CYAN_CONCRETE = ITEMS.register("cut_cyan_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_CYAN_CONCRETE_SLAB = ITEMS.register("cut_cyan_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_CYAN_CONCRETE_STAIRS = ITEMS.register("cut_cyan_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_CYAN_CONCRETE_WALL = ITEMS.register("cut_cyan_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_CYAN_CONCRETE_GATE = ITEMS.register("cut_cyan_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_CYAN_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final RegistrySupplier<Item> CYAN_CONCRETE_TILES = ITEMS.register("cyan_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_CONCRETE_TILE_SLAB = ITEMS.register("cyan_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_CONCRETE_TILE_STAIRS = ITEMS.register("cyan_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_CONCRETE_TILE_WALL = ITEMS.register("cyan_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_CONCRETE_TILE_GATE = ITEMS.register("cyan_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final RegistrySupplier<Item> CYAN_CONCRETE_PILLAR = ITEMS.register("cyan_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_CONCRETE_CORNER_PILLAR = ITEMS.register("cyan_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.CYAN_CONCRETE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final RegistrySupplier<Item> CHISELED_CYAN_CONCRETE = ITEMS.register("chiseled_cyan_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_CYAN_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final RegistrySupplier<Item> CARVED_CYAN_CONCRETE = ITEMS.register("carved_cyan_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_CYAN_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// LIGHT BLUE CONCRETE

	// Base
	public static final RegistrySupplier<Item> LIGHT_BLUE_CONCRETE_SLAB = ITEMS.register("light_blue_concrete_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_CONCRETE_STAIRS = ITEMS.register("light_blue_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_CONCRETE_WALL = ITEMS.register("light_blue_concrete_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_CONCRETE_GATE = ITEMS.register("light_blue_concrete_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final RegistrySupplier<Item> POLISHED_LIGHT_BLUE_CONCRETE = ITEMS.register("polished_light_blue_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_BLUE_CONCRETE_SLAB = ITEMS.register("polished_light_blue_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_BLUE_CONCRETE_STAIRS = ITEMS.register("polished_light_blue_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_BLUE_CONCRETE_WALL = ITEMS.register("polished_light_blue_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_BLUE_CONCRETE_GATE = ITEMS.register("polished_light_blue_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_BLUE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_BLUE_CONCRETE = ITEMS.register("smooth_light_blue_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_BLUE_CONCRETE_SLAB = ITEMS.register("smooth_light_blue_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_BLUE_CONCRETE_STAIRS = ITEMS.register("smooth_light_blue_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_BLUE_CONCRETE_WALL = ITEMS.register("smooth_light_blue_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_BLUE_CONCRETE_GATE = ITEMS.register("smooth_light_blue_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_BLUE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final RegistrySupplier<Item> LIGHT_BLUE_CONCRETE_BRICKS = ITEMS.register("light_blue_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_CONCRETE_BRICK_SLAB = ITEMS.register("light_blue_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_CONCRETE_BRICK_STAIRS = ITEMS.register("light_blue_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_CONCRETE_BRICK_WALL = ITEMS.register("light_blue_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_CONCRETE_BRICK_GATE = ITEMS.register("light_blue_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final RegistrySupplier<Item> CUT_LIGHT_BLUE_CONCRETE = ITEMS.register("cut_light_blue_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIGHT_BLUE_CONCRETE_SLAB = ITEMS.register("cut_light_blue_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIGHT_BLUE_CONCRETE_STAIRS = ITEMS.register("cut_light_blue_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIGHT_BLUE_CONCRETE_WALL = ITEMS.register("cut_light_blue_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIGHT_BLUE_CONCRETE_GATE = ITEMS.register("cut_light_blue_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_BLUE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final RegistrySupplier<Item> LIGHT_BLUE_CONCRETE_TILES = ITEMS.register("light_blue_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_CONCRETE_TILE_SLAB = ITEMS.register("light_blue_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_CONCRETE_TILE_STAIRS = ITEMS.register("light_blue_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_CONCRETE_TILE_WALL = ITEMS.register("light_blue_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_CONCRETE_TILE_GATE = ITEMS.register("light_blue_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final RegistrySupplier<Item> LIGHT_BLUE_CONCRETE_PILLAR = ITEMS.register("light_blue_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_CONCRETE_CORNER_PILLAR = ITEMS.register("light_blue_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_CONCRETE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final RegistrySupplier<Item> CHISELED_LIGHT_BLUE_CONCRETE = ITEMS.register("chiseled_light_blue_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_LIGHT_BLUE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final RegistrySupplier<Item> CARVED_LIGHT_BLUE_CONCRETE = ITEMS.register("carved_light_blue_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_LIGHT_BLUE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// PURPLE CONCRETE

	// Base
	public static final RegistrySupplier<Item> PURPLE_CONCRETE_SLAB = ITEMS.register("purple_concrete_slab", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_CONCRETE_STAIRS = ITEMS.register("purple_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_CONCRETE_WALL = ITEMS.register("purple_concrete_wall", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_CONCRETE_GATE = ITEMS.register("purple_concrete_gate", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final RegistrySupplier<Item> POLISHED_PURPLE_CONCRETE = ITEMS.register("polished_purple_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PURPLE_CONCRETE_SLAB = ITEMS.register("polished_purple_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PURPLE_CONCRETE_STAIRS = ITEMS.register("polished_purple_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PURPLE_CONCRETE_WALL = ITEMS.register("polished_purple_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PURPLE_CONCRETE_GATE = ITEMS.register("polished_purple_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_PURPLE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final RegistrySupplier<Item> SMOOTH_PURPLE_CONCRETE = ITEMS.register("smooth_purple_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PURPLE_CONCRETE_SLAB = ITEMS.register("smooth_purple_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PURPLE_CONCRETE_STAIRS = ITEMS.register("smooth_purple_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PURPLE_CONCRETE_WALL = ITEMS.register("smooth_purple_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PURPLE_CONCRETE_GATE = ITEMS.register("smooth_purple_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PURPLE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final RegistrySupplier<Item> PURPLE_CONCRETE_BRICKS = ITEMS.register("purple_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_CONCRETE_BRICK_SLAB = ITEMS.register("purple_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_CONCRETE_BRICK_STAIRS = ITEMS.register("purple_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_CONCRETE_BRICK_WALL = ITEMS.register("purple_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_CONCRETE_BRICK_GATE = ITEMS.register("purple_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final RegistrySupplier<Item> CUT_PURPLE_CONCRETE = ITEMS.register("cut_purple_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_PURPLE_CONCRETE_SLAB = ITEMS.register("cut_purple_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_PURPLE_CONCRETE_STAIRS = ITEMS.register("cut_purple_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_PURPLE_CONCRETE_WALL = ITEMS.register("cut_purple_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_PURPLE_CONCRETE_GATE = ITEMS.register("cut_purple_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_PURPLE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final RegistrySupplier<Item> PURPLE_CONCRETE_TILES = ITEMS.register("purple_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_CONCRETE_TILE_SLAB = ITEMS.register("purple_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_CONCRETE_TILE_STAIRS = ITEMS.register("purple_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_CONCRETE_TILE_WALL = ITEMS.register("purple_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_CONCRETE_TILE_GATE = ITEMS.register("purple_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final RegistrySupplier<Item> PURPLE_CONCRETE_PILLAR = ITEMS.register("purple_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_CONCRETE_CORNER_PILLAR = ITEMS.register("purple_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.PURPLE_CONCRETE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final RegistrySupplier<Item> CHISELED_PURPLE_CONCRETE = ITEMS.register("chiseled_purple_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_PURPLE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final RegistrySupplier<Item> CARVED_PURPLE_CONCRETE = ITEMS.register("carved_purple_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_PURPLE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// MAGENTA CONCRETE

	// Base
	public static final RegistrySupplier<Item> MAGENTA_CONCRETE_SLAB = ITEMS.register("magenta_concrete_slab", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_CONCRETE_STAIRS = ITEMS.register("magenta_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_CONCRETE_WALL = ITEMS.register("magenta_concrete_wall", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_CONCRETE_GATE = ITEMS.register("magenta_concrete_gate", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final RegistrySupplier<Item> POLISHED_MAGENTA_CONCRETE = ITEMS.register("polished_magenta_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_MAGENTA_CONCRETE_SLAB = ITEMS.register("polished_magenta_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_MAGENTA_CONCRETE_STAIRS = ITEMS.register("polished_magenta_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_MAGENTA_CONCRETE_WALL = ITEMS.register("polished_magenta_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_MAGENTA_CONCRETE_GATE = ITEMS.register("polished_magenta_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_MAGENTA_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final RegistrySupplier<Item> SMOOTH_MAGENTA_CONCRETE = ITEMS.register("smooth_magenta_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_MAGENTA_CONCRETE_SLAB = ITEMS.register("smooth_magenta_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_MAGENTA_CONCRETE_STAIRS = ITEMS.register("smooth_magenta_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_MAGENTA_CONCRETE_WALL = ITEMS.register("smooth_magenta_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_MAGENTA_CONCRETE_GATE = ITEMS.register("smooth_magenta_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_MAGENTA_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final RegistrySupplier<Item> MAGENTA_CONCRETE_BRICKS = ITEMS.register("magenta_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_CONCRETE_BRICK_SLAB = ITEMS.register("magenta_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_CONCRETE_BRICK_STAIRS = ITEMS.register("magenta_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_CONCRETE_BRICK_WALL = ITEMS.register("magenta_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_CONCRETE_BRICK_GATE = ITEMS.register("magenta_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final RegistrySupplier<Item> CUT_MAGENTA_CONCRETE = ITEMS.register("cut_magenta_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_MAGENTA_CONCRETE_SLAB = ITEMS.register("cut_magenta_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_MAGENTA_CONCRETE_STAIRS = ITEMS.register("cut_magenta_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_MAGENTA_CONCRETE_WALL = ITEMS.register("cut_magenta_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_MAGENTA_CONCRETE_GATE = ITEMS.register("cut_magenta_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_MAGENTA_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final RegistrySupplier<Item> MAGENTA_CONCRETE_TILES = ITEMS.register("magenta_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_CONCRETE_TILE_SLAB = ITEMS.register("magenta_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_CONCRETE_TILE_STAIRS = ITEMS.register("magenta_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_CONCRETE_TILE_WALL = ITEMS.register("magenta_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_CONCRETE_TILE_GATE = ITEMS.register("magenta_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final RegistrySupplier<Item> MAGENTA_CONCRETE_PILLAR = ITEMS.register("magenta_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_CONCRETE_CORNER_PILLAR = ITEMS.register("magenta_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.MAGENTA_CONCRETE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final RegistrySupplier<Item> CHISELED_MAGENTA_CONCRETE = ITEMS.register("chiseled_magenta_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_MAGENTA_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final RegistrySupplier<Item> CARVED_MAGENTA_CONCRETE = ITEMS.register("carved_magenta_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_MAGENTA_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// PINK CONCRETE

	// Base
	public static final RegistrySupplier<Item> PINK_CONCRETE_SLAB = ITEMS.register("pink_concrete_slab", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_CONCRETE_STAIRS = ITEMS.register("pink_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_CONCRETE_WALL = ITEMS.register("pink_concrete_wall", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_CONCRETE_GATE = ITEMS.register("pink_concrete_gate", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final RegistrySupplier<Item> POLISHED_PINK_CONCRETE = ITEMS.register("polished_pink_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PINK_CONCRETE_SLAB = ITEMS.register("polished_pink_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PINK_CONCRETE_STAIRS = ITEMS.register("polished_pink_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PINK_CONCRETE_WALL = ITEMS.register("polished_pink_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_PINK_CONCRETE_GATE = ITEMS.register("polished_pink_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_PINK_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final RegistrySupplier<Item> SMOOTH_PINK_CONCRETE = ITEMS.register("smooth_pink_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PINK_CONCRETE_SLAB = ITEMS.register("smooth_pink_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PINK_CONCRETE_STAIRS = ITEMS.register("smooth_pink_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PINK_CONCRETE_WALL = ITEMS.register("smooth_pink_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_PINK_CONCRETE_GATE = ITEMS.register("smooth_pink_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_PINK_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final RegistrySupplier<Item> PINK_CONCRETE_BRICKS = ITEMS.register("pink_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_CONCRETE_BRICK_SLAB = ITEMS.register("pink_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_CONCRETE_BRICK_STAIRS = ITEMS.register("pink_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_CONCRETE_BRICK_WALL = ITEMS.register("pink_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_CONCRETE_BRICK_GATE = ITEMS.register("pink_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final RegistrySupplier<Item> CUT_PINK_CONCRETE = ITEMS.register("cut_pink_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_PINK_CONCRETE_SLAB = ITEMS.register("cut_pink_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_PINK_CONCRETE_STAIRS = ITEMS.register("cut_pink_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_PINK_CONCRETE_WALL = ITEMS.register("cut_pink_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_PINK_CONCRETE_GATE = ITEMS.register("cut_pink_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_PINK_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final RegistrySupplier<Item> PINK_CONCRETE_TILES = ITEMS.register("pink_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_CONCRETE_TILE_SLAB = ITEMS.register("pink_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_CONCRETE_TILE_STAIRS = ITEMS.register("pink_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_CONCRETE_TILE_WALL = ITEMS.register("pink_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_CONCRETE_TILE_GATE = ITEMS.register("pink_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final RegistrySupplier<Item> PINK_CONCRETE_PILLAR = ITEMS.register("pink_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_CONCRETE_CORNER_PILLAR = ITEMS.register("pink_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.PINK_CONCRETE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final RegistrySupplier<Item> CHISELED_PINK_CONCRETE = ITEMS.register("chiseled_pink_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_PINK_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final RegistrySupplier<Item> CARVED_PINK_CONCRETE = ITEMS.register("carved_pink_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_PINK_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// WHITE CONCRETE

	// Base
	public static final RegistrySupplier<Item> WHITE_CONCRETE_SLAB = ITEMS.register("white_concrete_slab", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_CONCRETE_STAIRS = ITEMS.register("white_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_CONCRETE_WALL = ITEMS.register("white_concrete_wall", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_CONCRETE_GATE = ITEMS.register("white_concrete_gate", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final RegistrySupplier<Item> POLISHED_WHITE_CONCRETE = ITEMS.register("polished_white_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_WHITE_CONCRETE_SLAB = ITEMS.register("polished_white_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_WHITE_CONCRETE_STAIRS = ITEMS.register("polished_white_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_WHITE_CONCRETE_WALL = ITEMS.register("polished_white_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_WHITE_CONCRETE_GATE = ITEMS.register("polished_white_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_WHITE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final RegistrySupplier<Item> SMOOTH_WHITE_CONCRETE = ITEMS.register("smooth_white_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_WHITE_CONCRETE_SLAB = ITEMS.register("smooth_white_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_WHITE_CONCRETE_STAIRS = ITEMS.register("smooth_white_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_WHITE_CONCRETE_WALL = ITEMS.register("smooth_white_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_WHITE_CONCRETE_GATE = ITEMS.register("smooth_white_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_WHITE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final RegistrySupplier<Item> WHITE_CONCRETE_BRICKS = ITEMS.register("white_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_CONCRETE_BRICK_SLAB = ITEMS.register("white_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_CONCRETE_BRICK_STAIRS = ITEMS.register("white_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_CONCRETE_BRICK_WALL = ITEMS.register("white_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_CONCRETE_BRICK_GATE = ITEMS.register("white_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final RegistrySupplier<Item> CUT_WHITE_CONCRETE = ITEMS.register("cut_white_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_WHITE_CONCRETE_SLAB = ITEMS.register("cut_white_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_WHITE_CONCRETE_STAIRS = ITEMS.register("cut_white_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_WHITE_CONCRETE_WALL = ITEMS.register("cut_white_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_WHITE_CONCRETE_GATE = ITEMS.register("cut_white_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_WHITE_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final RegistrySupplier<Item> WHITE_CONCRETE_TILES = ITEMS.register("white_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_CONCRETE_TILE_SLAB = ITEMS.register("white_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_CONCRETE_TILE_STAIRS = ITEMS.register("white_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_CONCRETE_TILE_WALL = ITEMS.register("white_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_CONCRETE_TILE_GATE = ITEMS.register("white_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final RegistrySupplier<Item> WHITE_CONCRETE_PILLAR = ITEMS.register("white_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_CONCRETE_CORNER_PILLAR = ITEMS.register("white_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.WHITE_CONCRETE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final RegistrySupplier<Item> CHISELED_WHITE_CONCRETE = ITEMS.register("chiseled_white_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_WHITE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final RegistrySupplier<Item> CARVED_WHITE_CONCRETE = ITEMS.register("carved_white_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_WHITE_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// LIGHT GRAY CONCRETE

	// Base
	public static final RegistrySupplier<Item> LIGHT_GRAY_CONCRETE_SLAB = ITEMS.register("light_gray_concrete_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_CONCRETE_STAIRS = ITEMS.register("light_gray_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_CONCRETE_WALL = ITEMS.register("light_gray_concrete_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_CONCRETE_GATE = ITEMS.register("light_gray_concrete_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final RegistrySupplier<Item> POLISHED_LIGHT_GRAY_CONCRETE = ITEMS.register("polished_light_gray_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_GRAY_CONCRETE_SLAB = ITEMS.register("polished_light_gray_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_GRAY_CONCRETE_STAIRS = ITEMS.register("polished_light_gray_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_GRAY_CONCRETE_WALL = ITEMS.register("polished_light_gray_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_LIGHT_GRAY_CONCRETE_GATE = ITEMS.register("polished_light_gray_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_LIGHT_GRAY_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_GRAY_CONCRETE = ITEMS.register("smooth_light_gray_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_GRAY_CONCRETE_SLAB = ITEMS.register("smooth_light_gray_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_GRAY_CONCRETE_STAIRS = ITEMS.register("smooth_light_gray_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_GRAY_CONCRETE_WALL = ITEMS.register("smooth_light_gray_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_LIGHT_GRAY_CONCRETE_GATE = ITEMS.register("smooth_light_gray_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_LIGHT_GRAY_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final RegistrySupplier<Item> LIGHT_GRAY_CONCRETE_BRICKS = ITEMS.register("light_gray_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_CONCRETE_BRICK_SLAB = ITEMS.register("light_gray_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_CONCRETE_BRICK_STAIRS = ITEMS.register("light_gray_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_CONCRETE_BRICK_WALL = ITEMS.register("light_gray_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_CONCRETE_BRICK_GATE = ITEMS.register("light_gray_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final RegistrySupplier<Item> CUT_LIGHT_GRAY_CONCRETE = ITEMS.register("cut_light_gray_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIGHT_GRAY_CONCRETE_SLAB = ITEMS.register("cut_light_gray_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIGHT_GRAY_CONCRETE_STAIRS = ITEMS.register("cut_light_gray_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIGHT_GRAY_CONCRETE_WALL = ITEMS.register("cut_light_gray_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_LIGHT_GRAY_CONCRETE_GATE = ITEMS.register("cut_light_gray_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_LIGHT_GRAY_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final RegistrySupplier<Item> LIGHT_GRAY_CONCRETE_TILES = ITEMS.register("light_gray_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_CONCRETE_TILE_SLAB = ITEMS.register("light_gray_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_CONCRETE_TILE_STAIRS = ITEMS.register("light_gray_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_CONCRETE_TILE_WALL = ITEMS.register("light_gray_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_CONCRETE_TILE_GATE = ITEMS.register("light_gray_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final RegistrySupplier<Item> LIGHT_GRAY_CONCRETE_PILLAR = ITEMS.register("light_gray_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_CONCRETE_CORNER_PILLAR = ITEMS.register("light_gray_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_CONCRETE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final RegistrySupplier<Item> CHISELED_LIGHT_GRAY_CONCRETE = ITEMS.register("chiseled_light_gray_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_LIGHT_GRAY_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final RegistrySupplier<Item> CARVED_LIGHT_GRAY_CONCRETE = ITEMS.register("carved_light_gray_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_LIGHT_GRAY_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// GRAY CONCRETE

	// Base
	public static final RegistrySupplier<Item> GRAY_CONCRETE_SLAB = ITEMS.register("gray_concrete_slab", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_CONCRETE_STAIRS = ITEMS.register("gray_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_CONCRETE_WALL = ITEMS.register("gray_concrete_wall", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_CONCRETE_GATE = ITEMS.register("gray_concrete_gate", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final RegistrySupplier<Item> POLISHED_GRAY_CONCRETE = ITEMS.register("polished_gray_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GRAY_CONCRETE_SLAB = ITEMS.register("polished_gray_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GRAY_CONCRETE_STAIRS = ITEMS.register("polished_gray_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GRAY_CONCRETE_WALL = ITEMS.register("polished_gray_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_GRAY_CONCRETE_GATE = ITEMS.register("polished_gray_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_GRAY_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final RegistrySupplier<Item> SMOOTH_GRAY_CONCRETE = ITEMS.register("smooth_gray_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GRAY_CONCRETE_SLAB = ITEMS.register("smooth_gray_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GRAY_CONCRETE_STAIRS = ITEMS.register("smooth_gray_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GRAY_CONCRETE_WALL = ITEMS.register("smooth_gray_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_GRAY_CONCRETE_GATE = ITEMS.register("smooth_gray_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_GRAY_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final RegistrySupplier<Item> GRAY_CONCRETE_BRICKS = ITEMS.register("gray_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_CONCRETE_BRICK_SLAB = ITEMS.register("gray_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_CONCRETE_BRICK_STAIRS = ITEMS.register("gray_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_CONCRETE_BRICK_WALL = ITEMS.register("gray_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_CONCRETE_BRICK_GATE = ITEMS.register("gray_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final RegistrySupplier<Item> CUT_GRAY_CONCRETE = ITEMS.register("cut_gray_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_GRAY_CONCRETE_SLAB = ITEMS.register("cut_gray_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_GRAY_CONCRETE_STAIRS = ITEMS.register("cut_gray_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_GRAY_CONCRETE_WALL = ITEMS.register("cut_gray_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_GRAY_CONCRETE_GATE = ITEMS.register("cut_gray_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_GRAY_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final RegistrySupplier<Item> GRAY_CONCRETE_TILES = ITEMS.register("gray_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_CONCRETE_TILE_SLAB = ITEMS.register("gray_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_CONCRETE_TILE_STAIRS = ITEMS.register("gray_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_CONCRETE_TILE_WALL = ITEMS.register("gray_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_CONCRETE_TILE_GATE = ITEMS.register("gray_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final RegistrySupplier<Item> GRAY_CONCRETE_PILLAR = ITEMS.register("gray_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_CONCRETE_CORNER_PILLAR = ITEMS.register("gray_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.GRAY_CONCRETE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final RegistrySupplier<Item> CHISELED_GRAY_CONCRETE = ITEMS.register("chiseled_gray_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_GRAY_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final RegistrySupplier<Item> CARVED_GRAY_CONCRETE = ITEMS.register("carved_gray_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_GRAY_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// BLACK CONCRETE

	// Base
	public static final RegistrySupplier<Item> BLACK_CONCRETE_SLAB = ITEMS.register("black_concrete_slab", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_CONCRETE_STAIRS = ITEMS.register("black_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_CONCRETE_WALL = ITEMS.register("black_concrete_wall", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_CONCRETE_GATE = ITEMS.register("black_concrete_gate", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final RegistrySupplier<Item> POLISHED_BLACK_CONCRETE = ITEMS.register("polished_black_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLACK_CONCRETE_SLAB = ITEMS.register("polished_black_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLACK_CONCRETE_STAIRS = ITEMS.register("polished_black_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLACK_CONCRETE_WALL = ITEMS.register("polished_black_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BLACK_CONCRETE_GATE = ITEMS.register("polished_black_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BLACK_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final RegistrySupplier<Item> SMOOTH_BLACK_CONCRETE = ITEMS.register("smooth_black_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLACK_CONCRETE_SLAB = ITEMS.register("smooth_black_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLACK_CONCRETE_STAIRS = ITEMS.register("smooth_black_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLACK_CONCRETE_WALL = ITEMS.register("smooth_black_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BLACK_CONCRETE_GATE = ITEMS.register("smooth_black_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BLACK_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final RegistrySupplier<Item> BLACK_CONCRETE_BRICKS = ITEMS.register("black_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_CONCRETE_BRICK_SLAB = ITEMS.register("black_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_CONCRETE_BRICK_STAIRS = ITEMS.register("black_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_CONCRETE_BRICK_WALL = ITEMS.register("black_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_CONCRETE_BRICK_GATE = ITEMS.register("black_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final RegistrySupplier<Item> CUT_BLACK_CONCRETE = ITEMS.register("cut_black_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLACK_CONCRETE_SLAB = ITEMS.register("cut_black_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLACK_CONCRETE_STAIRS = ITEMS.register("cut_black_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLACK_CONCRETE_WALL = ITEMS.register("cut_black_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BLACK_CONCRETE_GATE = ITEMS.register("cut_black_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_BLACK_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final RegistrySupplier<Item> BLACK_CONCRETE_TILES = ITEMS.register("black_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_CONCRETE_TILE_SLAB = ITEMS.register("black_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_CONCRETE_TILE_STAIRS = ITEMS.register("black_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_CONCRETE_TILE_WALL = ITEMS.register("black_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_CONCRETE_TILE_GATE = ITEMS.register("black_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final RegistrySupplier<Item> BLACK_CONCRETE_PILLAR = ITEMS.register("black_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_CONCRETE_CORNER_PILLAR = ITEMS.register("black_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.BLACK_CONCRETE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final RegistrySupplier<Item> CHISELED_BLACK_CONCRETE = ITEMS.register("chiseled_black_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_BLACK_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final RegistrySupplier<Item> CARVED_BLACK_CONCRETE = ITEMS.register("carved_black_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_BLACK_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// BROWN CONCRETE

	// Base
	public static final RegistrySupplier<Item> BROWN_CONCRETE_SLAB = ITEMS.register("brown_concrete_slab", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_CONCRETE_STAIRS = ITEMS.register("brown_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_CONCRETE_WALL = ITEMS.register("brown_concrete_wall", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_CONCRETE_GATE = ITEMS.register("brown_concrete_gate", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Polished Concrete
	public static final RegistrySupplier<Item> POLISHED_BROWN_CONCRETE = ITEMS.register("polished_brown_concrete", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BROWN_CONCRETE_SLAB = ITEMS.register("polished_brown_concrete_slab", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BROWN_CONCRETE_STAIRS = ITEMS.register("polished_brown_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BROWN_CONCRETE_WALL = ITEMS.register("polished_brown_concrete_wall", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> POLISHED_BROWN_CONCRETE_GATE = ITEMS.register("polished_brown_concrete_gate", () ->
            new BlockItem(CPlusBlocks.POLISHED_BROWN_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Smooth Concrete
	public static final RegistrySupplier<Item> SMOOTH_BROWN_CONCRETE = ITEMS.register("smooth_brown_concrete", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BROWN_CONCRETE_SLAB = ITEMS.register("smooth_brown_concrete_slab", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BROWN_CONCRETE_STAIRS = ITEMS.register("smooth_brown_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BROWN_CONCRETE_WALL = ITEMS.register("smooth_brown_concrete_wall", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SMOOTH_BROWN_CONCRETE_GATE = ITEMS.register("smooth_brown_concrete_gate", () ->
            new BlockItem(CPlusBlocks.SMOOTH_BROWN_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Bricks
	public static final RegistrySupplier<Item> BROWN_CONCRETE_BRICKS = ITEMS.register("brown_concrete_bricks", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_BRICKS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_CONCRETE_BRICK_SLAB = ITEMS.register("brown_concrete_brick_slab", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_BRICK_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_CONCRETE_BRICK_STAIRS = ITEMS.register("brown_concrete_brick_stairs", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_BRICK_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_CONCRETE_BRICK_WALL = ITEMS.register("brown_concrete_brick_wall", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_BRICK_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_CONCRETE_BRICK_GATE = ITEMS.register("brown_concrete_brick_gate", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_BRICK_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cut Concrete
	public static final RegistrySupplier<Item> CUT_BROWN_CONCRETE = ITEMS.register("cut_brown_concrete", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BROWN_CONCRETE_SLAB = ITEMS.register("cut_brown_concrete_slab", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_CONCRETE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BROWN_CONCRETE_STAIRS = ITEMS.register("cut_brown_concrete_stairs", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_CONCRETE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BROWN_CONCRETE_WALL = ITEMS.register("cut_brown_concrete_wall", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_CONCRETE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CUT_BROWN_CONCRETE_GATE = ITEMS.register("cut_brown_concrete_gate", () ->
            new BlockItem(CPlusBlocks.CUT_BROWN_CONCRETE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Tiles
	public static final RegistrySupplier<Item> BROWN_CONCRETE_TILES = ITEMS.register("brown_concrete_tiles", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_TILES.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_CONCRETE_TILE_SLAB = ITEMS.register("brown_concrete_tile_slab", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_TILE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_CONCRETE_TILE_STAIRS = ITEMS.register("brown_concrete_tile_stairs", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_TILE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_CONCRETE_TILE_WALL = ITEMS.register("brown_concrete_tile_wall", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_TILE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_CONCRETE_TILE_GATE = ITEMS.register("brown_concrete_tile_gate", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_TILE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Concrete Pillar
	public static final RegistrySupplier<Item> BROWN_CONCRETE_PILLAR = ITEMS.register("brown_concrete_pillar", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_CONCRETE_CORNER_PILLAR = ITEMS.register("brown_concrete_corner_pillar", () ->
            new BlockItem(CPlusBlocks.BROWN_CONCRETE_CORNER_PILLAR.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Chiseled Concrete
	public static final RegistrySupplier<Item> CHISELED_BROWN_CONCRETE = ITEMS.register("chiseled_brown_concrete", () ->
            new BlockItem(CPlusBlocks.CHISELED_BROWN_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Carved Concrete
	public static final RegistrySupplier<Item> CARVED_BROWN_CONCRETE = ITEMS.register("carved_brown_concrete", () ->
            new BlockItem(CPlusBlocks.CARVED_BROWN_CONCRETE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


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
	public static final RegistrySupplier<Item> RED_TINTED_GLASS = ITEMS.register("red_tinted_glass", () ->
            new BlockItem(CPlusBlocks.RED_TINTED_GLASS_BLOCK.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> ORANGE_TINTED_GLASS = ITEMS.register("orange_tinted_glass", () ->
            new BlockItem(CPlusBlocks.ORANGE_TINTED_GLASS_BLOCK.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> YELLOW_TINTED_GLASS = ITEMS.register("yellow_tinted_glass", () ->
            new BlockItem(CPlusBlocks.YELLOW_TINTED_GLASS_BLOCK.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> LIME_TINTED_GLASS = ITEMS.register("lime_tinted_glass", () ->
            new BlockItem(CPlusBlocks.LIME_TINTED_GLASS_BLOCK.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> GREEN_TINTED_GLASS = ITEMS.register("green_tinted_glass", () ->
            new BlockItem(CPlusBlocks.GREEN_TINTED_GLASS_BLOCK.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> BLUE_TINTED_GLASS = ITEMS.register("blue_tinted_glass", () ->
            new BlockItem(CPlusBlocks.BLUE_TINTED_GLASS_BLOCK.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> CYAN_TINTED_GLASS = ITEMS.register("cyan_tinted_glass", () ->
            new BlockItem(CPlusBlocks.CYAN_TINTED_GLASS_BLOCK.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> LIGHT_BLUE_TINTED_GLASS = ITEMS.register("light_blue_tinted_glass", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_TINTED_GLASS_BLOCK.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> PURPLE_TINTED_GLASS = ITEMS.register("purple_tinted_glass", () ->
            new BlockItem(CPlusBlocks.PURPLE_TINTED_GLASS_BLOCK.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> MAGENTA_TINTED_GLASS = ITEMS.register("magenta_tinted_glass", () ->
            new BlockItem(CPlusBlocks.MAGENTA_TINTED_GLASS_BLOCK.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> PINK_TINTED_GLASS = ITEMS.register("pink_tinted_glass", () ->
            new BlockItem(CPlusBlocks.PINK_TINTED_GLASS_BLOCK.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> WHITE_TINTED_GLASS = ITEMS.register("white_tinted_glass", () ->
            new BlockItem(CPlusBlocks.WHITE_TINTED_GLASS_BLOCK.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> LIGHT_GRAY_TINTED_GLASS = ITEMS.register("light_gray_tinted_glass", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_TINTED_GLASS_BLOCK.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> GRAY_TINTED_GLASS = ITEMS.register("gray_tinted_glass", () ->
            new BlockItem(CPlusBlocks.GRAY_TINTED_GLASS_BLOCK.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> BLACK_TINTED_GLASS = ITEMS.register("black_tinted_glass", () ->
            new BlockItem(CPlusBlocks.BLACK_TINTED_GLASS_BLOCK.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> BROWN_TINTED_GLASS = ITEMS.register("brown_tinted_glass", () ->
            new BlockItem(CPlusBlocks.BROWN_TINTED_GLASS_BLOCK.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

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
	public static final RegistrySupplier<Item> GLOWSTONE_SLAB = ITEMS.register("glowstone_slab", () ->
            new BlockItem(CPlusBlocks.GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GLOWSTONE_STAIRS = ITEMS.register("glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GLOWSTONE_WALL = ITEMS.register("glowstone_wall", () ->
            new BlockItem(CPlusBlocks.GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GLOWSTONE_GATE = ITEMS.register("glowstone_gate", () ->
            new BlockItem(CPlusBlocks.GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Red
	public static final RegistrySupplier<Item> RED_GLOWSTONE = ITEMS.register("red_glowstone", () ->
            new BlockItem(CPlusBlocks.RED_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_GLOWSTONE_SLAB = ITEMS.register("red_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.RED_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_GLOWSTONE_STAIRS = ITEMS.register("red_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.RED_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_GLOWSTONE_WALL = ITEMS.register("red_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.RED_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_GLOWSTONE_GATE = ITEMS.register("red_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.RED_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Orange
	public static final RegistrySupplier<Item> ORANGE_GLOWSTONE = ITEMS.register("orange_glowstone", () ->
            new BlockItem(CPlusBlocks.ORANGE_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_GLOWSTONE_SLAB = ITEMS.register("orange_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.ORANGE_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_GLOWSTONE_STAIRS = ITEMS.register("orange_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.ORANGE_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_GLOWSTONE_WALL = ITEMS.register("orange_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.ORANGE_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_GLOWSTONE_GATE = ITEMS.register("orange_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.ORANGE_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Yellow
	public static final RegistrySupplier<Item> YELLOW_GLOWSTONE = ITEMS.register("yellow_glowstone", () ->
            new BlockItem(CPlusBlocks.YELLOW_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_GLOWSTONE_SLAB = ITEMS.register("yellow_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.YELLOW_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_GLOWSTONE_STAIRS = ITEMS.register("yellow_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.YELLOW_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_GLOWSTONE_WALL = ITEMS.register("yellow_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.YELLOW_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_GLOWSTONE_GATE = ITEMS.register("yellow_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.YELLOW_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Lime
	public static final RegistrySupplier<Item> LIME_GLOWSTONE = ITEMS.register("lime_glowstone", () ->
            new BlockItem(CPlusBlocks.LIME_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_GLOWSTONE_SLAB = ITEMS.register("lime_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.LIME_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_GLOWSTONE_STAIRS = ITEMS.register("lime_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.LIME_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_GLOWSTONE_WALL = ITEMS.register("lime_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.LIME_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_GLOWSTONE_GATE = ITEMS.register("lime_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.LIME_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Green
	public static final RegistrySupplier<Item> GREEN_GLOWSTONE = ITEMS.register("green_glowstone", () ->
            new BlockItem(CPlusBlocks.GREEN_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_GLOWSTONE_SLAB = ITEMS.register("green_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.GREEN_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_GLOWSTONE_STAIRS = ITEMS.register("green_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.GREEN_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_GLOWSTONE_WALL = ITEMS.register("green_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.GREEN_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_GLOWSTONE_GATE = ITEMS.register("green_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.GREEN_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Blue
	public static final RegistrySupplier<Item> BLUE_GLOWSTONE = ITEMS.register("blue_glowstone", () ->
            new BlockItem(CPlusBlocks.BLUE_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_GLOWSTONE_SLAB = ITEMS.register("blue_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_GLOWSTONE_STAIRS = ITEMS.register("blue_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_GLOWSTONE_WALL = ITEMS.register("blue_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_GLOWSTONE_GATE = ITEMS.register("blue_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cyan
	public static final RegistrySupplier<Item> CYAN_GLOWSTONE = ITEMS.register("cyan_glowstone", () ->
            new BlockItem(CPlusBlocks.CYAN_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_GLOWSTONE_SLAB = ITEMS.register("cyan_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.CYAN_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_GLOWSTONE_STAIRS = ITEMS.register("cyan_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.CYAN_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_GLOWSTONE_WALL = ITEMS.register("cyan_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.CYAN_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_GLOWSTONE_GATE = ITEMS.register("cyan_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.CYAN_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Blue
	public static final RegistrySupplier<Item> LIGHT_BLUE_GLOWSTONE = ITEMS.register("light_blue_glowstone", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_GLOWSTONE_SLAB = ITEMS.register("light_blue_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_GLOWSTONE_STAIRS = ITEMS.register("light_blue_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_GLOWSTONE_WALL = ITEMS.register("light_blue_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_GLOWSTONE_GATE = ITEMS.register("light_blue_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Purple
	public static final RegistrySupplier<Item> PURPLE_GLOWSTONE = ITEMS.register("purple_glowstone", () ->
            new BlockItem(CPlusBlocks.PURPLE_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_GLOWSTONE_SLAB = ITEMS.register("purple_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.PURPLE_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_GLOWSTONE_STAIRS = ITEMS.register("purple_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.PURPLE_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_GLOWSTONE_WALL = ITEMS.register("purple_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.PURPLE_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_GLOWSTONE_GATE = ITEMS.register("purple_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.PURPLE_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Magenta
	public static final RegistrySupplier<Item> MAGENTA_GLOWSTONE = ITEMS.register("magenta_glowstone", () ->
            new BlockItem(CPlusBlocks.MAGENTA_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_GLOWSTONE_SLAB = ITEMS.register("magenta_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.MAGENTA_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_GLOWSTONE_STAIRS = ITEMS.register("magenta_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.MAGENTA_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_GLOWSTONE_WALL = ITEMS.register("magenta_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.MAGENTA_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_GLOWSTONE_GATE = ITEMS.register("magenta_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.MAGENTA_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Pink
	public static final RegistrySupplier<Item> PINK_GLOWSTONE = ITEMS.register("pink_glowstone", () ->
            new BlockItem(CPlusBlocks.PINK_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_GLOWSTONE_SLAB = ITEMS.register("pink_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.PINK_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_GLOWSTONE_STAIRS = ITEMS.register("pink_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.PINK_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_GLOWSTONE_WALL = ITEMS.register("pink_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.PINK_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_GLOWSTONE_GATE = ITEMS.register("pink_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.PINK_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// White
	public static final RegistrySupplier<Item> WHITE_GLOWSTONE = ITEMS.register("white_glowstone", () ->
            new BlockItem(CPlusBlocks.WHITE_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_GLOWSTONE_SLAB = ITEMS.register("white_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.WHITE_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_GLOWSTONE_STAIRS = ITEMS.register("white_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.WHITE_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_GLOWSTONE_WALL = ITEMS.register("white_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.WHITE_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_GLOWSTONE_GATE = ITEMS.register("white_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.WHITE_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Gray
	public static final RegistrySupplier<Item> LIGHT_GRAY_GLOWSTONE = ITEMS.register("light_gray_glowstone", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_GLOWSTONE_SLAB = ITEMS.register("light_gray_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_GLOWSTONE_STAIRS = ITEMS.register("light_gray_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_GLOWSTONE_WALL = ITEMS.register("light_gray_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_GLOWSTONE_GATE = ITEMS.register("light_gray_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Gary :snail:
	public static final RegistrySupplier<Item> GRAY_GLOWSTONE = ITEMS.register("gray_glowstone", () ->
            new BlockItem(CPlusBlocks.GRAY_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_GLOWSTONE_SLAB = ITEMS.register("gray_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.GRAY_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_GLOWSTONE_WALL = ITEMS.register("gray_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.GRAY_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_GLOWSTONE_STAIRS = ITEMS.register("gray_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.GRAY_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_GLOWSTONE_GATE = ITEMS.register("gray_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.GRAY_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Black
	public static final RegistrySupplier<Item> BLACK_GLOWSTONE = ITEMS.register("black_glowstone", () ->
            new BlockItem(CPlusBlocks.BLACK_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_GLOWSTONE_SLAB = ITEMS.register("black_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.BLACK_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_GLOWSTONE_STAIRS = ITEMS.register("black_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.BLACK_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_GLOWSTONE_WALL = ITEMS.register("black_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.BLACK_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_GLOWSTONE_GATE = ITEMS.register("black_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.BLACK_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Brown
	public static final RegistrySupplier<Item> BROWN_GLOWSTONE = ITEMS.register("brown_glowstone", () ->
            new BlockItem(CPlusBlocks.BROWN_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_GLOWSTONE_SLAB = ITEMS.register("brown_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.BROWN_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_GLOWSTONE_STAIRS = ITEMS.register("brown_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.BROWN_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_GLOWSTONE_WALL = ITEMS.register("brown_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.BROWN_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_GLOWSTONE_GATE = ITEMS.register("brown_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.BROWN_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Soul
	public static final RegistrySupplier<Item> SOUL_GLOWSTONE = ITEMS.register("soul_glowstone", () ->
            new BlockItem(CPlusBlocks.SOUL_GLOWSTONE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SOUL_GLOWSTONE_SLAB = ITEMS.register("soul_glowstone_slab", () ->
            new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SOUL_GLOWSTONE_STAIRS = ITEMS.register("soul_glowstone_stairs", () ->
            new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SOUL_GLOWSTONE_WALL = ITEMS.register("soul_glowstone_wall", () ->
            new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> SOUL_GLOWSTONE_GATE = ITEMS.register("soul_glowstone_gate", () ->
            new BlockItem(CPlusBlocks.SOUL_GLOWSTONE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// ICE

	// Red
    public static final RegistrySupplier<Item> RED_ICE = ITEMS.register("red_ice", () ->
            new BlockItem(CPlusBlocks.RED_ICE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_ICE_SLAB = ITEMS.register("red_ice_slab", () ->
            new BlockItem(CPlusBlocks.RED_ICE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_ICE_STAIRS = ITEMS.register("red_ice_stairs", () ->
            new BlockItem(CPlusBlocks.RED_ICE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_ICE_WALL = ITEMS.register("red_ice_wall", () ->
            new BlockItem(CPlusBlocks.RED_ICE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> RED_ICE_GATE = ITEMS.register("red_ice_gate", () ->
            new BlockItem(CPlusBlocks.RED_ICE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Orange
	public static final RegistrySupplier<Item> ORANGE_ICE = ITEMS.register("orange_ice", () ->
            new BlockItem(CPlusBlocks.ORANGE_ICE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_ICE_SLAB = ITEMS.register("orange_ice_slab", () ->
            new BlockItem(CPlusBlocks.ORANGE_ICE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_ICE_STAIRS = ITEMS.register("orange_ice_stairs", () ->
            new BlockItem(CPlusBlocks.ORANGE_ICE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_ICE_WALL = ITEMS.register("orange_ice_wall", () ->
            new BlockItem(CPlusBlocks.ORANGE_ICE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> ORANGE_ICE_GATE = ITEMS.register("orange_ice_gate", () ->
            new BlockItem(CPlusBlocks.ORANGE_ICE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Yellow
	public static final RegistrySupplier<Item> YELLOW_ICE = ITEMS.register("yellow_ice", () ->
            new BlockItem(CPlusBlocks.YELLOW_ICE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_ICE_SLAB = ITEMS.register("yellow_ice_slab", () ->
            new BlockItem(CPlusBlocks.YELLOW_ICE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_ICE_STAIRS = ITEMS.register("yellow_ice_stairs", () ->
            new BlockItem(CPlusBlocks.YELLOW_ICE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_ICE_WALL = ITEMS.register("yellow_ice_wall", () ->
            new BlockItem(CPlusBlocks.YELLOW_ICE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> YELLOW_ICE_GATE = ITEMS.register("yellow_ice_gate", () ->
            new BlockItem(CPlusBlocks.YELLOW_ICE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Lime
	public static final RegistrySupplier<Item> LIME_ICE = ITEMS.register("lime_ice", () ->
            new BlockItem(CPlusBlocks.LIME_ICE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_ICE_SLAB = ITEMS.register("lime_ice_slab", () ->
            new BlockItem(CPlusBlocks.LIME_ICE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_ICE_STAIRS = ITEMS.register("lime_ice_stairs", () ->
            new BlockItem(CPlusBlocks.LIME_ICE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_ICE_WALL = ITEMS.register("lime_ice_wall", () ->
            new BlockItem(CPlusBlocks.LIME_ICE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIME_ICE_GATE = ITEMS.register("lime_ice_gate", () ->
            new BlockItem(CPlusBlocks.LIME_ICE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Green
	public static final RegistrySupplier<Item> GREEN_ICE = ITEMS.register("green_ice", () ->
            new BlockItem(CPlusBlocks.GREEN_ICE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_ICE_SLAB = ITEMS.register("green_ice_slab", () ->
            new BlockItem(CPlusBlocks.GREEN_ICE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_ICE_STAIRS = ITEMS.register("green_ice_stairs", () ->
            new BlockItem(CPlusBlocks.GREEN_ICE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_ICE_WALL = ITEMS.register("green_ice_wall", () ->
            new BlockItem(CPlusBlocks.GREEN_ICE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GREEN_ICE_GATE = ITEMS.register("green_ice_gate", () ->
            new BlockItem(CPlusBlocks.GREEN_ICE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Blue
	public static final RegistrySupplier<Item> BLUE_ICE_SLAB = ITEMS.register("blue_ice_slab", () ->
            new BlockItem(CPlusBlocks.BLUE_ICE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_ICE_STAIRS = ITEMS.register("blue_ice_stairs", () ->
            new BlockItem(CPlusBlocks.BLUE_ICE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_ICE_WALL = ITEMS.register("blue_ice_wall", () ->
            new BlockItem(CPlusBlocks.BLUE_ICE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLUE_ICE_GATE = ITEMS.register("blue_ice_gate", () ->
            new BlockItem(CPlusBlocks.BLUE_ICE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Cyan
	public static final RegistrySupplier<Item> CYAN_ICE = ITEMS.register("cyan_ice", () ->
            new BlockItem(CPlusBlocks.CYAN_ICE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_ICE_SLAB = ITEMS.register("cyan_ice_slab", () ->
            new BlockItem(CPlusBlocks.CYAN_ICE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_ICE_STAIRS = ITEMS.register("cyan_ice_stairs", () ->
            new BlockItem(CPlusBlocks.CYAN_ICE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_ICE_WALL = ITEMS.register("cyan_ice_wall", () ->
            new BlockItem(CPlusBlocks.CYAN_ICE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> CYAN_ICE_GATE = ITEMS.register("cyan_ice_gate", () ->
            new BlockItem(CPlusBlocks.CYAN_ICE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Blue
	public static final RegistrySupplier<Item> LIGHT_BLUE_ICE = ITEMS.register("light_blue_ice", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_ICE_SLAB = ITEMS.register("light_blue_ice_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_ICE_STAIRS = ITEMS.register("light_blue_ice_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_ICE_WALL = ITEMS.register("light_blue_ice_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_BLUE_ICE_GATE = ITEMS.register("light_blue_ice_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_BLUE_ICE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Purple
	public static final RegistrySupplier<Item> PURPLE_ICE = ITEMS.register("purple_ice", () ->
            new BlockItem(CPlusBlocks.PURPLE_ICE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_ICE_SLAB = ITEMS.register("purple_ice_slab", () ->
            new BlockItem(CPlusBlocks.PURPLE_ICE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_ICE_STAIRS = ITEMS.register("purple_ice_stairs", () ->
            new BlockItem(CPlusBlocks.PURPLE_ICE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_ICE_WALL = ITEMS.register("purple_ice_wall", () ->
            new BlockItem(CPlusBlocks.PURPLE_ICE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PURPLE_ICE_GATE = ITEMS.register("purple_ice_gate", () ->
            new BlockItem(CPlusBlocks.PURPLE_ICE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Magenta
	public static final RegistrySupplier<Item> MAGENTA_ICE = ITEMS.register("magenta_ice", () ->
            new BlockItem(CPlusBlocks.MAGENTA_ICE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_ICE_SLAB = ITEMS.register("magenta_ice_slab", () ->
            new BlockItem(CPlusBlocks.MAGENTA_ICE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_ICE_STAIRS = ITEMS.register("magenta_ice_stairs", () ->
            new BlockItem(CPlusBlocks.MAGENTA_ICE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_ICE_WALL = ITEMS.register("magenta_ice_wall", () ->
            new BlockItem(CPlusBlocks.MAGENTA_ICE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> MAGENTA_ICE_GATE = ITEMS.register("magenta_ice_gate", () ->
            new BlockItem(CPlusBlocks.MAGENTA_ICE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Pink
	public static final RegistrySupplier<Item> PINK_ICE = ITEMS.register("pink_ice", () ->
            new BlockItem(CPlusBlocks.PINK_ICE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_ICE_SLAB = ITEMS.register("pink_ice_slab", () ->
            new BlockItem(CPlusBlocks.PINK_ICE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_ICE_STAIRS = ITEMS.register("pink_ice_stairs", () ->
            new BlockItem(CPlusBlocks.PINK_ICE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_ICE_WALL = ITEMS.register("pink_ice_wall", () ->
            new BlockItem(CPlusBlocks.PINK_ICE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> PINK_ICE_GATE = ITEMS.register("pink_ice_gate", () ->
            new BlockItem(CPlusBlocks.PINK_ICE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// White
	public static final RegistrySupplier<Item> WHITE_ICE = ITEMS.register("white_ice", () ->
            new BlockItem(CPlusBlocks.WHITE_ICE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_ICE_SLAB = ITEMS.register("white_ice_slab", () ->
            new BlockItem(CPlusBlocks.WHITE_ICE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_ICE_STAIRS = ITEMS.register("white_ice_stairs", () ->
            new BlockItem(CPlusBlocks.WHITE_ICE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_ICE_WALL = ITEMS.register("white_ice_wall", () ->
            new BlockItem(CPlusBlocks.WHITE_ICE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> WHITE_ICE_GATE = ITEMS.register("white_ice_gate", () ->
            new BlockItem(CPlusBlocks.WHITE_ICE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Light Gray
	public static final RegistrySupplier<Item> LIGHT_GRAY_ICE = ITEMS.register("light_gray_ice", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_ICE_SLAB = ITEMS.register("light_gray_ice_slab", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_ICE_STAIRS = ITEMS.register("light_gray_ice_stairs", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_ICE_WALL = ITEMS.register("light_gray_ice_wall", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> LIGHT_GRAY_ICE_GATE = ITEMS.register("light_gray_ice_gate", () ->
            new BlockItem(CPlusBlocks.LIGHT_GRAY_ICE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Gray
	public static final RegistrySupplier<Item> GRAY_ICE = ITEMS.register("gray_ice", () ->
            new BlockItem(CPlusBlocks.GRAY_ICE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_ICE_SLAB = ITEMS.register("gray_ice_slab", () ->
            new BlockItem(CPlusBlocks.GRAY_ICE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_ICE_STAIRS = ITEMS.register("gray_ice_stairs", () ->
            new BlockItem(CPlusBlocks.GRAY_ICE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_ICE_WALL = ITEMS.register("gray_ice_wall", () ->
            new BlockItem(CPlusBlocks.GRAY_ICE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> GRAY_ICE_GATE = ITEMS.register("gray_ice_gate", () ->
            new BlockItem(CPlusBlocks.GRAY_ICE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Black
	public static final RegistrySupplier<Item> BLACK_ICE = ITEMS.register("black_ice", () ->
            new BlockItem(CPlusBlocks.BLACK_ICE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_ICE_SLAB = ITEMS.register("black_ice_slab", () ->
            new BlockItem(CPlusBlocks.BLACK_ICE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_ICE_STAIRS = ITEMS.register("black_ice_stairs", () ->
            new BlockItem(CPlusBlocks.BLACK_ICE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_ICE_WALL = ITEMS.register("black_ice_wall", () ->
            new BlockItem(CPlusBlocks.BLACK_ICE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BLACK_ICE_GATE = ITEMS.register("black_ice_gate", () ->
            new BlockItem(CPlusBlocks.BLACK_ICE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Brown
	public static final RegistrySupplier<Item> BROWN_ICE = ITEMS.register("brown_ice", () ->
            new BlockItem(CPlusBlocks.BROWN_ICE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_ICE_SLAB = ITEMS.register("brown_ice_slab", () ->
            new BlockItem(CPlusBlocks.BROWN_ICE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_ICE_STAIRS = ITEMS.register("brown_ice_stairs", () ->
            new BlockItem(CPlusBlocks.BROWN_ICE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_ICE_WALL = ITEMS.register("brown_ice_wall", () ->
            new BlockItem(CPlusBlocks.BROWN_ICE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
	public static final RegistrySupplier<Item> BROWN_ICE_GATE = ITEMS.register("brown_ice_gate", () ->
            new BlockItem(CPlusBlocks.BROWN_ICE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));

	// Soul
	public static final RegistrySupplier<Item> SOUL_ICE = ITEMS.register("soul_ice", () ->
            new BlockItem(CPlusBlocks.SOUL_ICE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
    public static final RegistrySupplier<Item> SOUL_ICE_SLAB = ITEMS.register("soul_ice_slab", () ->
            new BlockItem(CPlusBlocks.SOUL_ICE_SLAB.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
    public static final RegistrySupplier<Item> SOUL_ICE_STAIRS = ITEMS.register("soul_ice_stairs", () ->
            new BlockItem(CPlusBlocks.SOUL_ICE_STAIRS.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
    public static final RegistrySupplier<Item> SOUL_ICE_WALL = ITEMS.register("soul_ice_wall", () ->
            new BlockItem(CPlusBlocks.SOUL_ICE_WALL.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
    public static final RegistrySupplier<Item> SOUL_ICE_GATE = ITEMS.register("soul_ice_gate", () ->
            new BlockItem(CPlusBlocks.SOUL_ICE_GATE.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));


// ORGANICS

    // Dirt
    public static final RegistrySupplier<Item> DIRT_SLAB = ITEMS.register("dirt_slab", () ->
            new BlockItem(CPlusBlocks.DIRT_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
    public static final RegistrySupplier<Item> DIRT_STAIRS = ITEMS.register("dirt_stairs", () ->
            new BlockItem(CPlusBlocks.DIRT_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
    public static final RegistrySupplier<Item> DIRT_WALL = ITEMS.register("dirt_wall", () ->
            new BlockItem(CPlusBlocks.DIRT_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

    // Grass
    public static final RegistrySupplier<Item> GRASS_SLAB = ITEMS.register("grass_slab", () ->
            new BlockItem(CPlusBlocks.GRASS_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
    public static final RegistrySupplier<Item> GRASS_STAIRS = ITEMS.register("grass_stairs", () ->
            new BlockItem(CPlusBlocks.GRASS_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
    public static final RegistrySupplier<Item> GRASS_WALL = ITEMS.register("grass_wall", () ->
            new BlockItem(CPlusBlocks.GRASS_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));

    // Mycelium
    public static final RegistrySupplier<Item> MYCELIUM_SLAB = ITEMS.register("mycelium_slab", () ->
            new BlockItem(CPlusBlocks.MYCELIUM_SLAB.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
    public static final RegistrySupplier<Item> MYCELIUM_STAIRS = ITEMS.register("mycelium_stairs", () ->
            new BlockItem(CPlusBlocks.MYCELIUM_STAIRS.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
    public static final RegistrySupplier<Item> MYCELIUM_WALL = ITEMS.register("mycelium_wall", () ->
            new BlockItem(CPlusBlocks.MYCELIUM_WALL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));


// MISC

    public static final RegistrySupplier<Item> JACK_O_SOUL = ITEMS.register("jack_o_soul", () ->
            new BlockItem(CPlusBlocks.JACK_O_SOUL.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
    public static final RegistrySupplier<Item> PINEAPPLE = ITEMS.register("pineapple", () ->
            new BlockItem(CPlusBlocks.PINEAPPLE.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
    public static final RegistrySupplier<Item> KFP_BLOCK = ITEMS.register("kfp_block", () ->
            new BlockItem(CPlusBlocks.KFP_BLOCK.get(), new Item.Settings()));
    public static final RegistrySupplier<Item> NETHERITE_STAIRS = ITEMS.register("netherite_stairs", () ->
            new BlockItem(CPlusBlocks.NETHERITE_STAIRS.get(), new Item.Settings()));
    public static final RegistrySupplier<Item> SUSPICIOUS_SLAB = ITEMS.register("suspicious_slab", () ->
            new BlockItem(CPlusBlocks.SUSPICIOUS_SLAB.get(), new Item.Settings()));
    public static final RegistrySupplier<Item> JET = ITEMS.register("jet", () ->
            new BlockItem(CPlusBlocks.JET.get(), new Item.Settings()));
	public static final RegistrySupplier<Item> NUBERT = ITEMS.register("nubert", () ->
            new BlockItem(CPlusBlocks.NUBERT.get(), new Item.Settings().fireproof().rarity(Rarity.EPIC)));
	public static final RegistrySupplier<Item> WIGGED_NUBERT = ITEMS.register("wigged_nubert", () ->
            new BlockItem(CPlusBlocks.WIGGED_NUBERT.get(), new Item.Settings().fireproof().rarity(Rarity.EPIC)));


// ITEMS

	// Random
	public static final RegistrySupplier<Item> WARPED_WART = ITEMS.register("warped_wart", () ->
            new AliasedBlockItem(CPlusBlocks.WARPED_WART.get(), new Item.Settings().group(ItemGroup.MISC)));
	public static final RegistrySupplier<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () ->
            new Item(new Item.Settings().group(ItemGroup.MISC)));
	public static final RegistrySupplier<Item> NETHERITE_HORSE_ARMOR = ITEMS.register("netherite_horse_armor", () ->
            new NetheriteHorseArmorItem(15, "netherite", new Item.Settings().maxCount(1).fireproof().group(ItemGroup.MISC)));

	// 🐢
	public static final RegistrySupplier<Item> TURTLE_CHESTPLATE = ITEMS.register("turtle_chestplate", () ->
            new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
	public static final RegistrySupplier<Item> TURTLE_LEGGINGS = ITEMS.register("turtle_leggings", () ->
            new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
	public static final RegistrySupplier<Item> TURTLE_BOOTS = ITEMS.register("turtle_boots", () ->
            new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));

	// Bundles
	public static final RegistrySupplier<Item> RED_BUNDLE = ITEMS.register("red_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1)));
	public static final RegistrySupplier<Item> ORANGE_BUNDLE = ITEMS.register("orange_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1)));
	public static final RegistrySupplier<Item> YELLOW_BUNDLE = ITEMS.register("yellow_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1)));
	public static final RegistrySupplier<Item> LIME_BUNDLE = ITEMS.register("lime_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1)));
	public static final RegistrySupplier<Item> GREEN_BUNDLE = ITEMS.register("green_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1)));
	public static final RegistrySupplier<Item> BLUE_BUNDLE = ITEMS.register("blue_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1)));
	public static final RegistrySupplier<Item> CYAN_BUNDLE = ITEMS.register("cyan_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1)));
	public static final RegistrySupplier<Item> LIGHT_BLUE_BUNDLE = ITEMS.register("light_blue_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1)));
	public static final RegistrySupplier<Item> PURPLE_BUNDLE = ITEMS.register("purple_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1)));
	public static final RegistrySupplier<Item> MAGENTA_BUNDLE = ITEMS.register("magenta_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1)));
	public static final RegistrySupplier<Item> PINK_BUNDLE = ITEMS.register("pink_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1)));
	public static final RegistrySupplier<Item> WHITE_BUNDLE = ITEMS.register("white_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1)));
	public static final RegistrySupplier<Item> LIGHT_GRAY_BUNDLE = ITEMS.register("light_gray_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1)));
	public static final RegistrySupplier<Item> GRAY_BUNDLE = ITEMS.register("gray_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1)));
	public static final RegistrySupplier<Item> BROWN_BUNDLE = ITEMS.register("brown_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1)));
	public static final RegistrySupplier<Item> BLACK_BUNDLE = ITEMS.register("black_dyed_bundle", () ->
            new BundleItem(new Item.Settings().maxCount(1)));


// Deprecated Blocks

    public static final RegistrySupplier<Item> CARVED_STONE_BRICKS = ITEMS.register("carved_stone_bricks", () ->
            new RedirectedBlockItem(CPlusBlocks.CARVED_STONE.get(), new Item.Settings(), CPlusBlocks.CARVED_STONE_BRICKS.get()));
    public static final RegistrySupplier<Item> STONE_BRICK_PILLAR = ITEMS.register("stone_brick_pillar", () ->
            new RedirectedBlockItem(CPlusBlocks.STONE_PILLAR.get(), new Item.Settings(), CPlusBlocks.STONE_BRICK_PILLAR.get()));
    public static final RegistrySupplier<Item> MOSSY_STONE_BRICK_PILLAR = ITEMS.register("mossy_stone_brick_pillar", () ->
            new RedirectedBlockItem(CPlusBlocks.MOSSY_STONE_PILLAR.get(), new Item.Settings(), CPlusBlocks.MOSSY_STONE_BRICK_PILLAR.get()));
    public static final RegistrySupplier<Item> CRACKED_STONE_BRICK_PILLAR = ITEMS.register("cracked_stone_brick_pillar", () ->
            new RedirectedBlockItem(CPlusBlocks.CRACKED_STONE_PILLAR.get(), new Item.Settings(), CPlusBlocks.CRACKED_STONE_BRICK_PILLAR.get()));
    public static final RegistrySupplier<Item> CRACKED_CHISELED_STONE_BRICKS = ITEMS.register("cracked_chiseled_stone_bricks", () ->
            new RedirectedBlockItem(CPlusBlocks.CRACKED_CHISELED_STONE.get(), new Item.Settings(), CPlusBlocks.CRACKED_CHISELED_STONE.get()));
    public static final RegistrySupplier<Item> MOSSY_CHISELED_STONE_BRICKS = ITEMS.register("mossy_chiseled_stone_bricks", () ->
            new RedirectedBlockItem(CPlusBlocks.MOSSY_CHISELED_STONE.get(), new Item.Settings(), CPlusBlocks.MOSSY_CHISELED_STONE_BRICKS.get()));
    public static final RegistrySupplier<Item> BLACKSTONE_BRICK_PILLAR = ITEMS.register("blackstone_brick_pillar", () ->
            new RedirectedBlockItem(CPlusBlocks.BLACKSTONE_PILLAR.get(), new Item.Settings(), CPlusBlocks.BLACKSTONE_BRICK_PILLAR.get()));
    public static final RegistrySupplier<Item> CRACKED_BLACKSTONE_BRICK_PILLAR = ITEMS.register("cracked_blackstone_brick_pillar", () ->
            new RedirectedBlockItem(CPlusBlocks.CRACKED_BLACKSTONE_PILLAR.get(), new Item.Settings(), CPlusBlocks.CRACKED_BLACKSTONE_BRICK_PILLAR.get()));
    public static final RegistrySupplier<Item> MOSSY_BLACKSTONE_BRICK_PILLAR = ITEMS.register("mossy_blackstone_brick_pillar", () ->
            new RedirectedBlockItem(CPlusBlocks.MOSSY_BLACKSTONE_PILLAR.get(), new Item.Settings(), CPlusBlocks.MOSSY_BLACKSTONE_BRICK_PILLAR.get()));
    public static final RegistrySupplier<Item> CHISELED_BRICKS = ITEMS.register("chiseled_bricks", () ->
            new RedirectedBlockItem(CPlusBlocks.CHISELED_TERRACOTTA.get(), new Item.Settings(), CPlusBlocks.CHISELED_BRICKS.get()));
    public static final RegistrySupplier<Item> BRICK_PILLAR = ITEMS.register("brick_pillar", () ->
            new RedirectedBlockItem(CPlusBlocks.TERRACOTTA_PILLAR.get(), new Item.Settings(), CPlusBlocks.BRICK_PILLAR.get()));
    public static final RegistrySupplier<Item> CARVED_BRICKS = ITEMS.register("carved_bricks", () ->
            new RedirectedBlockItem(CPlusBlocks.CARVED_TERRACOTTA.get(), new Item.Settings(), CPlusBlocks.CARVED_BRICKS.get()));
    public static final RegistrySupplier<Item> SMOOTH_PURPUR_BLOCK = ITEMS.register("smooth_purpur_block", () ->
            new RedirectedBlockItem(CPlusBlocks.SMOOTH_PURPUR.get(), new Item.Settings(), CPlusBlocks.SMOOTH_PURPUR_BLOCK.get()));
    public static final RegistrySupplier<Item> POLISHED_PURPUR_BLOCK = ITEMS.register("polished_purpur_block", () ->
            new RedirectedBlockItem(CPlusBlocks.POLISHED_PURPUR.get(), new Item.Settings(), CPlusBlocks.POLISHED_PURPUR_BLOCK.get()));
    public static final RegistrySupplier<Item> CHISELED_PURPUR_BLOCK = ITEMS.register("chiseled_purpur_block", () ->
            new RedirectedBlockItem(CPlusBlocks.CHISELED_PURPUR.get(), new Item.Settings(), CPlusBlocks.CHISELED_PURPUR_BLOCK.get()));
    public static final RegistrySupplier<Item> END_STONE_BRICK_PILLAR = ITEMS.register("end_stone_brick_pillar", () ->
            new RedirectedBlockItem(CPlusBlocks.END_STONE_PILLAR.get(), new Item.Settings(), CPlusBlocks.END_STONE_BRICK_PILLAR.get()));

    public static void init() {
    	ITEMS.register();
	}
}
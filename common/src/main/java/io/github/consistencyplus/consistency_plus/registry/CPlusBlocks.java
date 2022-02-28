package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.hooks.tags.TagHooks;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertBlock;
import io.github.consistencyplus.consistency_plus.blocks.WarpedNetherWartPlantBlock;
import io.github.consistencyplus.consistency_plus.blocks.dirt.DirtSlabBlock;
import io.github.consistencyplus.consistency_plus.blocks.dirt.DirtStairsBlock;
import io.github.consistencyplus.consistency_plus.blocks.dirt.DirtWallBlock;
import io.github.consistencyplus.consistency_plus.blocks.grass.GrassSlabBlock;
import io.github.consistencyplus.consistency_plus.blocks.grass.GrassStairsBlock;
import io.github.consistencyplus.consistency_plus.blocks.grass.GrassWallBlock;
import io.github.consistencyplus.consistency_plus.blocks.mycelium.MyceliumSlabBlock;
import io.github.consistencyplus.consistency_plus.blocks.mycelium.MyceliumStairsBlock;
import io.github.consistencyplus.consistency_plus.blocks.mycelium.MyceliumWallBlock;
import io.github.consistencyplus.consistency_plus.blocks.nubert.WiggedNubertBlock;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusCarvedPumpkinBlock;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusFenceGateBlock;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusStairBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

import java.util.Locale;

import static net.minecraft.block.Blocks.*;
import static net.minecraft.block.piston.PistonBehavior.BLOCK;

public class CPlusBlocks {
	public static final Tag.Identified<Block> VALID_PORTAL_BLOCKS = TagHooks.optionalBlock(ConsistencyPlusMain.id("valid_portal_blocks"));
	public static final Tag.Identified<Block> VALID_CONDUIT_BLOCKS = TagHooks.optionalBlock(ConsistencyPlusMain.id("valid_conduit_blocks"));

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ConsistencyPlusMain.ID, Registry.BLOCK_KEY);

	public static final Block MOSSY_COBBLESTONE_GATE = register("mossy_cobblestone_gate", new CPlusFenceGateBlock(Block.Settings.copy(MOSSY_COBBLESTONE)));

	// Cracked
	public static final Block CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab", new SlabBlock(Block.Settings.copy(CRACKED_STONE_BRICKS)));
	public static final Block CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", new CPlusStairBlock(CRACKED_STONE_BRICKS.getDefaultState(), Block.Settings.copy(CRACKED_STONE_BRICKS)));
	public static final Block CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", new WallBlock(Block.Settings.copy(CRACKED_STONE_BRICKS)));
	public static final Block CRACKED_STONE_BRICK_GATE = register("cracked_stone_brick_gate", new CPlusFenceGateBlock(Block.Settings.copy(CRACKED_STONE_BRICKS)));

	// Mossy
	public static final Block MOSSY_STONE_BRICK_GATE = register("mossy_stone_brick_gate", new CPlusFenceGateBlock(Block.Settings.copy(MOSSY_STONE_BRICKS)));

	// Pillar and Chiseled
	public static final Block CRACKED_STONE_PILLAR = register("cracked_stone_pillar", new PillarBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final Block MOSSY_STONE_PILLAR = register("mossy_stone_pillar", new PillarBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final Block CRACKED_STONE_CORNER_PILLAR = register("cracked_stone_corner_pillar", new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final Block MOSSY_STONE_CORNER_PILLAR = register("mossy_stone_corner_pillar", new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final Block CRACKED_CHISELED_STONE = register("cracked_chiseled_stone", new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final Block MOSSY_CHISELED_STONE = register("mossy_chiseled_stone", new Block(Block.Settings.copy(STONE_BRICKS)));

	//Cracked
	public static final Block CRACKED_BLACKSTONE_BRICK_SLAB = register("cracked_blackstone_brick_slab", new SlabBlock(Block.Settings.copy(CRACKED_POLISHED_BLACKSTONE_BRICKS)));
	public static final Block CRACKED_BLACKSTONE_BRICK_STAIRS = register("cracked_blackstone_brick_stairs", new CPlusStairBlock(CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), Block.Settings.copy(CRACKED_STONE_BRICKS)));
	public static final Block CRACKED_BLACKSTONE_BRICK_WALL = register("cracked_blackstone_brick_wall", new WallBlock(Block.Settings.copy(CRACKED_POLISHED_BLACKSTONE_BRICKS)));
	public static final Block CRACKED_BLACKSTONE_BRICK_GATE = register("cracked_blackstone_brick_gate", new CPlusFenceGateBlock(Block.Settings.copy(CRACKED_POLISHED_BLACKSTONE_BRICKS)));

	//Mossy
	public static final Block MOSSY_BLACKSTONE_BRICKS = register("mossy_blackstone_bricks", new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final Block MOSSY_BLACKSTONE_BRICK_SLAB = register("mossy_blackstone_brick_slab", new SlabBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final Block MOSSY_BLACKSTONE_BRICK_STAIRS = register("mossy_blackstone_brick_stairs", new CPlusStairBlock(POLISHED_BLACKSTONE_BRICKS.getDefaultState(), Block.Settings.copy(STONE_BRICKS)));
	public static final Block MOSSY_BLACKSTONE_BRICK_WALL = register("mossy_blackstone_brick_wall", new WallBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final Block MOSSY_BLACKSTONE_BRICK_GATE = register("mossy_blackstone_brick_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));

	//Pillars and Chiseled
	public static final Block MOSSY_BLACKSTONE_PILLAR = register("mossy_blackstone_pillar", new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final Block CRACKED_BLACKSTONE_PILLAR = register("cracked_blackstone_pillar", new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final Block MOSSY_BLACKSTONE_CORNER_PILLAR = register("mossy_blackstone_corner_pillar", new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final Block CRACKED_BLACKSTONE_CORNER_PILLAR = register("cracked_blackstone_corner_pillar", new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final Block MOSSY_CHISELED_BLACKSTONE = register("mossy_chiseled_blackstone", new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final Block CRACKED_CHISELED_BLACKSTONE = register("cracked_chiseled_blackstone", new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final Block MOSSY_CARVED_BLACKSTONE = register("mossy_carved_blackstone", new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final Block CRACKED_CARVED_BLACKSTONE = register("cracked_carved_blackstone", new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));

	//Andesite
	// Mossy
	public static final Block MOSSY_ANDESITE = register("mossy_andesite", new Block(Block.Settings.copy(ANDESITE)));
	public static final Block MOSSY_ANDESITE_SLAB = register("mossy_andesite_slab", new SlabBlock(Block.Settings.copy(ANDESITE)));
	public static final Block MOSSY_ANDESITE_STAIRS = register("mossy_andesite_stairs", new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE)));
	public static final Block MOSSY_ANDESITE_WALL = register("mossy_andesite_wall", new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final Block MOSSY_ANDESITE_GATE = register("mossy_andesite_gate", new CPlusFenceGateBlock(Block.Settings.copy(ANDESITE)));

	//Polished

	//Cracked Polished
	public static final Block CRACKED_POLISHED_ANDESITE = register("cracked_polished_andesite", new Block(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_POLISHED_ANDESITE_SLAB = register("cracked_polished_andesite_slab", new SlabBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_POLISHED_ANDESITE_STAIRS = register("cracked_polished_andesite_stairs", new CPlusStairBlock(POLISHED_ANDESITE.getDefaultState(), Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_POLISHED_ANDESITE_WALL = register("cracked_polished_andesite_wall", new WallBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_POLISHED_ANDESITE_GATE = register("cracked_polished_andesite_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_ANDESITE)));

	//Mossy Polished
	public static final Block MOSSY_POLISHED_ANDESITE = register("mossy_polished_andesite", new Block(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_POLISHED_ANDESITE_SLAB = register("mossy_polished_andesite_slab", new SlabBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_POLISHED_ANDESITE_STAIRS = register("mossy_polished_andesite_stairs", new CPlusStairBlock(POLISHED_ANDESITE.getDefaultState(), Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_POLISHED_ANDESITE_WALL = register("mossy_polished_andesite_wall", new WallBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_POLISHED_ANDESITE_GATE = register("mossy_polished_andesite_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_ANDESITE)));

	//Smooth

	//Cracked Smooth
	public static final Block CRACKED_SMOOTH_ANDESITE = register("cracked_smooth_andesite", new Block(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_SMOOTH_ANDESITE_SLAB = register("cracked_smooth_andesite_slab", new SlabBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_SMOOTH_ANDESITE_STAIRS = register("cracked_smooth_andesite_stairs", new CPlusStairBlock(POLISHED_ANDESITE.getDefaultState(), Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_SMOOTH_ANDESITE_WALL = register("cracked_smooth_andesite_wall", new WallBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_SMOOTH_ANDESITE_GATE = register("cracked_smooth_andesite_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_ANDESITE)));

	//Mossy Smooth
	public static final Block MOSSY_SMOOTH_ANDESITE = register("mossy_smooth_andesite", new Block(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_SMOOTH_ANDESITE_SLAB = register("mossy_smooth_andesite_slab", new SlabBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_SMOOTH_ANDESITE_STAIRS = register("mossy_smooth_andesite_stairs", new CPlusStairBlock(POLISHED_ANDESITE.getDefaultState(), Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_SMOOTH_ANDESITE_WALL = register("mossy_smooth_andesite_wall", new WallBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_SMOOTH_ANDESITE_GATE = register("mossy_smooth_andesite_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_ANDESITE)));

	//Cut

	//Cracked Cut
	public static final Block CRACKED_CUT_ANDESITE = register("cracked_cut_andesite", new Block(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_CUT_ANDESITE_SLAB = register("cracked_cut_andesite_slab", new SlabBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_CUT_ANDESITE_STAIRS = register("cracked_cut_andesite_stairs", new CPlusStairBlock(POLISHED_ANDESITE.getDefaultState(), Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_CUT_ANDESITE_WALL = register("cracked_cut_andesite_wall", new WallBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_CUT_ANDESITE_GATE = register("cracked_cut_andesite_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_ANDESITE)));

	//Mossy Cut
	public static final Block MOSSY_CUT_ANDESITE = register("mossy_cut_andesite", new Block(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_CUT_ANDESITE_SLAB = register("mossy_cut_andesite_slab", new SlabBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_CUT_ANDESITE_STAIRS = register("mossy_cut_andesite_stairs", new CPlusStairBlock(POLISHED_ANDESITE.getDefaultState(), Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_CUT_ANDESITE_WALL = register("mossy_cut_andesite_wall", new WallBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_CUT_ANDESITE_GATE = register("mossy_cut_andesite_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	

	//Cracked Bricks
	public static final Block CRACKED_ANDESITE_TILES = register("cracked_andesite_tiles", new Block(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_ANDESITE_TILE_SLAB = register("cracked_andesite_tile_slab", new SlabBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_ANDESITE_TILE_STAIRS = register("cracked_andesite_tile_stairs", new CPlusStairBlock(POLISHED_ANDESITE.getDefaultState(), Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_ANDESITE_TILE_WALL = register("cracked_andesite_tile_wall", new WallBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_ANDESITE_TILE_GATE = register("cracked_andesite_tile_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_ANDESITE)));

	//Mossy Bricks
	public static final Block MOSSY_ANDESITE_TILES = register("mossy_andesite_tiles", new Block(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_ANDESITE_TILE_SLAB = register("mossy_andesite_tile_slab", new SlabBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_ANDESITE_TILE_STAIRS = register("mossy_andesite_tile_stairs", new CPlusStairBlock(POLISHED_ANDESITE.getDefaultState(), Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_ANDESITE_TILE_WALL = register("mossy_andesite_tile_wall", new WallBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_ANDESITE_TILE_GATE = register("mossy_andesite_tile_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	

	//Cracked Bricks
	public static final Block CRACKED_ANDESITE_BRICKS = register("cracked_andesite_bricks", new Block(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_ANDESITE_BRICK_SLAB = register("cracked_andesite_brick_slab", new SlabBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_ANDESITE_BRICK_STAIRS = register("cracked_andesite_brick_stairs", new CPlusStairBlock(POLISHED_ANDESITE.getDefaultState(), Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_ANDESITE_BRICK_WALL = register("cracked_andesite_brick_wall", new WallBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_ANDESITE_BRICK_GATE = register("cracked_andesite_brick_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_ANDESITE)));

	//Mossy Bricks
	public static final Block MOSSY_ANDESITE_BRICKS = register("mossy_andesite_bricks", new Block(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_ANDESITE_BRICK_SLAB = register("mossy_andesite_brick_slab", new SlabBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_ANDESITE_BRICK_STAIRS = register("mossy_andesite_brick_stairs", new CPlusStairBlock(POLISHED_ANDESITE.getDefaultState(), Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_ANDESITE_BRICK_WALL = register("mossy_andesite_brick_wall", new WallBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_ANDESITE_BRICK_GATE = register("mossy_andesite_brick_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_ANDESITE)));

	//Pillars and Chiseled
	public static final Block CRACKED_ANDESITE_PILLAR = register("cracked_andesite_pillar", new PillarBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_ANDESITE_PILLAR = register("mossy_andesite_pillar", new PillarBlock(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_ANDESITE_CORNER_PILLAR = register("cracked_andesite_corner_pillar", new Block(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_ANDESITE_CORNER_PILLAR = register("mossy_andesite_corner_pillar", new Block(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_CHISELED_ANDESITE = register("cracked_chiseled_andesite", new Block(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_CHISELED_ANDESITE = register("mossy_chiseled_andesite", new Block(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block CRACKED_CARVED_ANDESITE = register("cracked_carved_andesite", new Block(Block.Settings.copy(POLISHED_ANDESITE)));
	public static final Block MOSSY_CARVED_ANDESITE = register("mossy_carved_andesite", new Block(Block.Settings.copy(POLISHED_ANDESITE)));

	//Nether Bricks
	//Cracked Bricks
	public static final Block CRACKED_NETHER_BRICK_SLAB = register("cracked_nether_brick_slab", new SlabBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final Block CRACKED_NETHER_BRICK_STAIRS = register("cracked_nether_brick_stairs", new CPlusStairBlock(NETHER_BRICKS.getDefaultState(), Block.Settings.copy(NETHER_BRICKS)));
	public static final Block CRACKED_NETHER_BRICK_WALL = register("cracked_nether_brick_wall", new WallBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final Block CRACKED_NETHER_BRICK_FENCE_GATE = register("cracked_nether_brick_fence_gate", new CPlusFenceGateBlock(Block.Settings.copy(NETHER_BRICKS)));

	//Blue Nether Bricks
	public static final Block CRACKED_PURPUR_BRICKS = register("cracked_purpur_bricks", new Block(Block.Settings.copy(PURPUR_PILLAR)));
	public static final Block CRACKED_PURPUR_BRICK_SLAB = register("cracked_purpur_brick_slab", new SlabBlock(Block.Settings.copy(PURPUR_BLOCK)));
	public static final Block CRACKED_PURPUR_BRICK_STAIRS = register("cracked_purpur_brick_stairs", new CPlusStairBlock(PURPUR_BLOCK.getDefaultState(), Block.Settings.copy(PURPUR_BLOCK)));
	public static final Block CRACKED_PURPUR_BRICK_WALL = register("cracked_purpur_brick_wall", new WallBlock(Block.Settings.copy(PURPUR_BLOCK)));
	public static final Block CRACKED_PURPUR_BRICK_GATE = register("cracked_purpur_brick_gate", new CPlusFenceGateBlock(Block.Settings.copy(PURPUR_BLOCK)));

	public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = register("cracked_deepslate_brick_slab", new SlabBlock(Block.Settings.copy(DEEPSLATE)));
	public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = register("cracked_deepslate_brick_stairs", new CPlusStairBlock(DEEPSLATE.getDefaultState(), Block.Settings.copy(DEEPSLATE)));
	public static final Block CRACKED_DEEPSLATE_BRICK_WALL = register("cracked_deepslate_brick_wall", new WallBlock(Block.Settings.copy(DEEPSLATE)));
	public static final Block CRACKED_DEEPSLATE_BRICK_GATE = register("cracked_deepslate_brick_gate", new CPlusFenceGateBlock(Block.Settings.copy(DEEPSLATE)));

	public static final Block CRACKED_DEEPSLATE_TILE_SLAB = register("cracked_deepslate_tile_slab", new SlabBlock(Block.Settings.copy(DEEPSLATE)));
	public static final Block CRACKED_DEEPSLATE_TILE_STAIRS = register("cracked_deepslate_tile_stairs", new CPlusStairBlock(DEEPSLATE.getDefaultState(), Block.Settings.copy(DEEPSLATE)));
	public static final Block CRACKED_DEEPSLATE_TILE_WALL = register("cracked_deepslate_tile_wall", new WallBlock(Block.Settings.copy(DEEPSLATE)));
	public static final Block CRACKED_DEEPSLATE_TILE_GATE = register("cracked_deepslate_tile_gate", new CPlusFenceGateBlock(Block.Settings.copy(DEEPSLATE)));
	//Glazed Terracotta

	//Polished
	public static final Block POLISHED_RED_GLAZED_TERRACOTTA = register("polished_red_glazed_terracotta", new Block(CPlusSharedBlockSettings.glazedTerracotta(MapColor.RED)));
	public static final Block POLISHED_ORANGE_GLAZED_TERRACOTTA = register("polished_orange_glazed_terracotta", new Block(CPlusSharedBlockSettings.glazedTerracotta(MapColor.ORANGE)));
	public static final Block POLISHED_YELLOW_GLAZED_TERRACOTTA = register("polished_yellow_glazed_terracotta", new Block(CPlusSharedBlockSettings.glazedTerracotta(MapColor.YELLOW)));
	public static final Block POLISHED_LIME_GLAZED_TERRACOTTA = register("polished_lime_glazed_terracotta", new Block(CPlusSharedBlockSettings.glazedTerracotta(MapColor.LIME)));
	public static final Block POLISHED_GREEN_GLAZED_TERRACOTTA = register("polished_green_glazed_terracotta", new Block(CPlusSharedBlockSettings.glazedTerracotta(MapColor.GREEN)));
	public static final Block POLISHED_BLUE_GLAZED_TERRACOTTA = register("polished_blue_glazed_terracotta", new Block(CPlusSharedBlockSettings.glazedTerracotta(MapColor.BLUE)));
	public static final Block POLISHED_CYAN_GLAZED_TERRACOTTA = register("polished_cyan_glazed_terracotta", new Block(CPlusSharedBlockSettings.glazedTerracotta(MapColor.CYAN)));
	public static final Block POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA = register("polished_light_blue_glazed_terracotta", new Block(CPlusSharedBlockSettings.glazedTerracotta(MapColor.LIGHT_BLUE)));
	public static final Block POLISHED_PURPLE_GLAZED_TERRACOTTA = register("polished_purple_glazed_terracotta", new Block(CPlusSharedBlockSettings.glazedTerracotta(MapColor.PURPLE)));
	public static final Block POLISHED_MAGENTA_GLAZED_TERRACOTTA = register("polished_magenta_glazed_terracotta", new Block(CPlusSharedBlockSettings.glazedTerracotta(MapColor.MAGENTA)));
	public static final Block POLISHED_PINK_GLAZED_TERRACOTTA = register("polished_pink_glazed_terracotta", new Block(CPlusSharedBlockSettings.glazedTerracotta(MapColor.PINK)));
	public static final Block POLISHED_WHITE_GLAZED_TERRACOTTA = register("polished_white_glazed_terracotta", new Block(CPlusSharedBlockSettings.glazedTerracotta(MapColor.WHITE)));
	public static final Block POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA = register("polished_light_gray_glazed_terracotta", new Block(CPlusSharedBlockSettings.glazedTerracotta(MapColor.LIGHT_GRAY)));
	public static final Block POLISHED_GRAY_GLAZED_TERRACOTTA = register("polished_gray_glazed_terracotta", new Block(CPlusSharedBlockSettings.glazedTerracotta(MapColor.GRAY)));
	public static final Block POLISHED_BLACK_GLAZED_TERRACOTTA = register("polished_black_glazed_terracotta", new Block(CPlusSharedBlockSettings.glazedTerracotta(MapColor.BLACK)));
	public static final Block POLISHED_BROWN_GLAZED_TERRACOTTA = register("polished_brown_glazed_terracotta", new Block(CPlusSharedBlockSettings.glazedTerracotta(MapColor.BROWN)));
	// Slab
	public static final Block POLISHED_RED_GLAZED_TERRACOTTA_SLAB = register("polished_red_glazed_terracotta_slab", new SlabBlock(Block.Settings.copy(POLISHED_RED_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_ORANGE_GLAZED_TERRACOTTA_SLAB = register("polished_orange_glazed_terracotta_slab", new SlabBlock(Block.Settings.copy(POLISHED_ORANGE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_YELLOW_GLAZED_TERRACOTTA_SLAB = register("polished_yellow_glazed_terracotta_slab", new SlabBlock(Block.Settings.copy(POLISHED_YELLOW_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_LIME_GLAZED_TERRACOTTA_SLAB = register("polished_lime_glazed_terracotta_slab", new SlabBlock(Block.Settings.copy(POLISHED_LIME_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_GREEN_GLAZED_TERRACOTTA_SLAB = register("polished_green_glazed_terracotta_slab", new SlabBlock(Block.Settings.copy(POLISHED_GREEN_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_BLUE_GLAZED_TERRACOTTA_SLAB = register("polished_blue_glazed_terracotta_slab", new SlabBlock(Block.Settings.copy(POLISHED_BLUE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_CYAN_GLAZED_TERRACOTTA_SLAB = register("polished_cyan_glazed_terracotta_slab", new SlabBlock(Block.Settings.copy(POLISHED_CYAN_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = register("polished_light_blue_glazed_terracotta_slab", new SlabBlock(Block.Settings.copy(POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_PURPLE_GLAZED_TERRACOTTA_SLAB = register("polished_purple_glazed_terracotta_slab", new SlabBlock(Block.Settings.copy(POLISHED_PURPLE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_MAGENTA_GLAZED_TERRACOTTA_SLAB = register("polished_magenta_glazed_terracotta_slab", new SlabBlock(Block.Settings.copy(POLISHED_MAGENTA_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_PINK_GLAZED_TERRACOTTA_SLAB = register("polished_pink_glazed_terracotta_slab", new SlabBlock(Block.Settings.copy(POLISHED_PINK_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_WHITE_GLAZED_TERRACOTTA_SLAB = register("polished_white_glazed_terracotta_slab", new SlabBlock(Block.Settings.copy(POLISHED_WHITE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = register("polished_light_gray_glazed_terracotta_slab", new SlabBlock(Block.Settings.copy(POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_GRAY_GLAZED_TERRACOTTA_SLAB = register("polished_gray_glazed_terracotta_slab", new SlabBlock(Block.Settings.copy(POLISHED_GRAY_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_BLACK_GLAZED_TERRACOTTA_SLAB = register("polished_black_glazed_terracotta_slab", new SlabBlock(Block.Settings.copy(POLISHED_BLACK_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_BROWN_GLAZED_TERRACOTTA_SLAB = register("polished_brown_glazed_terracotta_slab", new SlabBlock(Block.Settings.copy(POLISHED_BROWN_GLAZED_TERRACOTTA)));
	// Stairs
	public static final Block POLISHED_RED_GLAZED_TERRACOTTA_STAIRS = register("polished_red_glazed_terracotta_stairs", new CPlusStairBlock(RED_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(POLISHED_RED_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_ORANGE_GLAZED_TERRACOTTA_STAIRS = register("polished_orange_glazed_terracotta_stairs", new CPlusStairBlock(ORANGE_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(POLISHED_ORANGE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_YELLOW_GLAZED_TERRACOTTA_STAIRS = register("polished_yellow_glazed_terracotta_stairs", new CPlusStairBlock(YELLOW_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(POLISHED_YELLOW_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_LIME_GLAZED_TERRACOTTA_STAIRS = register("polished_lime_glazed_terracotta_stairs", new CPlusStairBlock(LIME_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(POLISHED_LIME_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_GREEN_GLAZED_TERRACOTTA_STAIRS = register("polished_green_glazed_terracotta_stairs", new CPlusStairBlock(GREEN_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(POLISHED_GREEN_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_BLUE_GLAZED_TERRACOTTA_STAIRS = register("polished_blue_glazed_terracotta_stairs", new CPlusStairBlock(BLUE_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(POLISHED_BLUE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_CYAN_GLAZED_TERRACOTTA_STAIRS = register("polished_cyan_glazed_terracotta_stairs", new CPlusStairBlock(CYAN_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(POLISHED_CYAN_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = register("polished_light_blue_glazed_terracotta_stairs", new CPlusStairBlock(LIGHT_BLUE_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_PURPLE_GLAZED_TERRACOTTA_STAIRS = register("polished_purple_glazed_terracotta_stairs", new CPlusStairBlock(PURPLE_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(POLISHED_PURPLE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_MAGENTA_GLAZED_TERRACOTTA_STAIRS = register("polished_magenta_glazed_terracotta_stairs", new CPlusStairBlock(MAGENTA_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(POLISHED_MAGENTA_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_PINK_GLAZED_TERRACOTTA_STAIRS = register("polished_pink_glazed_terracotta_stairs", new CPlusStairBlock(PINK_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(POLISHED_PINK_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_WHITE_GLAZED_TERRACOTTA_STAIRS = register("polished_white_glazed_terracotta_stairs", new CPlusStairBlock(WHITE_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(POLISHED_WHITE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = register("polished_light_gray_glazed_terracotta_stairs", new CPlusStairBlock(LIGHT_GRAY_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_GRAY_GLAZED_TERRACOTTA_STAIRS = register("polished_gray_glazed_terracotta_stairs", new CPlusStairBlock(GRAY_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(POLISHED_GRAY_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_BLACK_GLAZED_TERRACOTTA_STAIRS = register("polished_black_glazed_terracotta_stairs", new CPlusStairBlock(BLACK_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(POLISHED_BLACK_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_BROWN_GLAZED_TERRACOTTA_STAIRS = register("polished_brown_glazed_terracotta_stairs", new CPlusStairBlock(BROWN_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(POLISHED_BROWN_GLAZED_TERRACOTTA)));
	// Wall
	public static final Block POLISHED_RED_GLAZED_TERRACOTTA_WALL = register("polished_red_glazed_terracotta_wall", new WallBlock(Block.Settings.copy(POLISHED_RED_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_ORANGE_GLAZED_TERRACOTTA_WALL = register("polished_orange_glazed_terracotta_wall", new WallBlock(Block.Settings.copy(POLISHED_ORANGE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_YELLOW_GLAZED_TERRACOTTA_WALL = register("polished_yellow_glazed_terracotta_wall", new WallBlock(Block.Settings.copy(POLISHED_YELLOW_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_LIME_GLAZED_TERRACOTTA_WALL = register("polished_lime_glazed_terracotta_wall", new WallBlock(Block.Settings.copy(POLISHED_LIME_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_GREEN_GLAZED_TERRACOTTA_WALL = register("polished_green_glazed_terracotta_wall", new WallBlock(Block.Settings.copy(POLISHED_GREEN_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_BLUE_GLAZED_TERRACOTTA_WALL = register("polished_blue_glazed_terracotta_wall", new WallBlock(Block.Settings.copy(POLISHED_BLUE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_CYAN_GLAZED_TERRACOTTA_WALL = register("polished_cyan_glazed_terracotta_wall", new WallBlock(Block.Settings.copy(POLISHED_CYAN_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = register("polished_light_blue_glazed_terracotta_wall", new WallBlock(Block.Settings.copy(POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_PURPLE_GLAZED_TERRACOTTA_WALL = register("polished_purple_glazed_terracotta_wall", new WallBlock(Block.Settings.copy(POLISHED_PURPLE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_MAGENTA_GLAZED_TERRACOTTA_WALL = register("polished_magenta_glazed_terracotta_wall", new WallBlock(Block.Settings.copy(POLISHED_MAGENTA_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_PINK_GLAZED_TERRACOTTA_WALL = register("polished_pink_glazed_terracotta_wall", new WallBlock(Block.Settings.copy(POLISHED_PINK_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_WHITE_GLAZED_TERRACOTTA_WALL = register("polished_white_glazed_terracotta_wall", new WallBlock(Block.Settings.copy(POLISHED_WHITE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = register("polished_light_gray_glazed_terracotta_wall", new WallBlock(Block.Settings.copy(POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_GRAY_GLAZED_TERRACOTTA_WALL = register("polished_gray_glazed_terracotta_wall", new WallBlock(Block.Settings.copy(POLISHED_GRAY_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_BLACK_GLAZED_TERRACOTTA_WALL = register("polished_black_glazed_terracotta_wall", new WallBlock(Block.Settings.copy(POLISHED_BLACK_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_BROWN_GLAZED_TERRACOTTA_WALL = register("polished_brown_glazed_terracotta_wall", new WallBlock(Block.Settings.copy(POLISHED_BROWN_GLAZED_TERRACOTTA)));
	// Gates
	public static final Block POLISHED_RED_GLAZED_TERRACOTTA_GATE = register("polished_red_glazed_terracotta_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_RED_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_ORANGE_GLAZED_TERRACOTTA_GATE = register("polished_orange_glazed_terracotta_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_ORANGE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_YELLOW_GLAZED_TERRACOTTA_GATE = register("polished_yellow_glazed_terracotta_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_YELLOW_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_LIME_GLAZED_TERRACOTTA_GATE = register("polished_lime_glazed_terracotta_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_LIME_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_GREEN_GLAZED_TERRACOTTA_GATE = register("polished_green_glazed_terracotta_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_GREEN_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_BLUE_GLAZED_TERRACOTTA_GATE = register("polished_blue_glazed_terracotta_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_BLUE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_CYAN_GLAZED_TERRACOTTA_GATE = register("polished_cyan_glazed_terracotta_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_CYAN_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_GATE = register("polished_light_blue_glazed_terracotta_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_PURPLE_GLAZED_TERRACOTTA_GATE = register("polished_purple_glazed_terracotta_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_PURPLE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_MAGENTA_GLAZED_TERRACOTTA_GATE = register("polished_magenta_glazed_terracotta_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_MAGENTA_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_PINK_GLAZED_TERRACOTTA_GATE = register("polished_pink_glazed_terracotta_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_PINK_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_WHITE_GLAZED_TERRACOTTA_GATE = register("polished_white_glazed_terracotta_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_WHITE_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_GATE = register("polished_light_gray_glazed_terracotta_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_GRAY_GLAZED_TERRACOTTA_GATE = register("polished_gray_glazed_terracotta_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_GRAY_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_BLACK_GLAZED_TERRACOTTA_GATE = register("polished_black_glazed_terracotta_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_BLACK_GLAZED_TERRACOTTA)));
	public static final Block POLISHED_BROWN_GLAZED_TERRACOTTA_GATE = register("polished_brown_glazed_terracotta_gate", new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_BROWN_GLAZED_TERRACOTTA)));

// Any sane shit ends here.  Hello to any folks crazy enough to be here, and enjoy your stay in last-minute-addition hell
// Who wrote this, who wrote this, who? Cause its true, but it certainly wasn't me.

	// Ice
	public static final Block RED_ICE = register("red_ice", new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.RED).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final Block ORANGE_ICE = register("orange_ice", new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.ORANGE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final Block YELLOW_ICE = register("yellow_ice", new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.YELLOW).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final Block LIME_ICE = register("lime_ice", new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.LIME).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final Block GREEN_ICE = register("green_ice", new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.GREEN).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final Block CYAN_ICE = register("cyan_ice", new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.CYAN).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final Block LIGHT_BLUE_ICE = register("light_blue_ice", new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.LIGHT_BLUE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final Block PURPLE_ICE = register("purple_ice", new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.PURPLE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final Block MAGENTA_ICE = register("magenta_ice", new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.MAGENTA).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final Block PINK_ICE = register("pink_ice", new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.PINK).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final Block WHITE_ICE = register("white_ice", new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.WHITE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final Block LIGHT_GRAY_ICE = register("light_gray_ice", new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.LIGHT_GRAY).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final Block GRAY_ICE = register("gray_ice", new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.GRAY).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final Block BLACK_ICE = register("black_ice", new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.BLACK).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final Block BROWN_ICE = register("brown_ice", new Block(Block.Settings.of(Material.DENSE_ICE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	//Haha brr go brrr
	public static final Block SOUL_ICE = register("soul_ice", new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.LIGHT_BLUE).strength(3.0F).slipperiness(1.1f).sounds(BlockSoundGroup.GLASS)));

	// Ice Slab
	public static final Block RED_ICE_SLAB = register("red_ice_slab", new SlabBlock(Block.Settings.copy(RED_ICE)));
	public static final Block ORANGE_ICE_SLAB = register("orange_ice_slab", new SlabBlock(Block.Settings.copy(ORANGE_ICE)));
	public static final Block YELLOW_ICE_SLAB = register("yellow_ice_slab", new SlabBlock(Block.Settings.copy(YELLOW_ICE)));
	public static final Block LIME_ICE_SLAB = register("lime_ice_slab", new SlabBlock(Block.Settings.copy(LIME_ICE)));
	public static final Block GREEN_ICE_SLAB = register("green_ice_slab", new SlabBlock(Block.Settings.copy(GREEN_ICE)));
	public static final Block BLUE_ICE_SLAB = register("blue_ice_slab", new SlabBlock(Block.Settings.copy(BLUE_ICE)));
	public static final Block CYAN_ICE_SLAB = register("cyan_ice_slab", new SlabBlock(Block.Settings.copy(CYAN_ICE)));
	public static final Block LIGHT_BLUE_ICE_SLAB = register("light_blue_ice_slab", new SlabBlock(Block.Settings.copy(LIGHT_BLUE_ICE)));
	public static final Block PURPLE_ICE_SLAB = register("purple_ice_slab", new SlabBlock(Block.Settings.copy(PURPLE_ICE)));
	public static final Block MAGENTA_ICE_SLAB = register("magenta_ice_slab", new SlabBlock(Block.Settings.copy(MAGENTA_ICE)));
	public static final Block PINK_ICE_SLAB = register("pink_ice_slab", new SlabBlock(Block.Settings.copy(PINK_ICE)));
	public static final Block WHITE_ICE_SLAB = register("white_ice_slab", new SlabBlock(Block.Settings.copy(WHITE_ICE)));
	public static final Block LIGHT_GRAY_ICE_SLAB = register("light_gray_ice_slab", new SlabBlock(Block.Settings.copy(LIGHT_GRAY_ICE)));
	public static final Block GRAY_ICE_SLAB = register("gray_ice_slab", new SlabBlock(Block.Settings.copy(GRAY_ICE)));
	public static final Block BLACK_ICE_SLAB = register("black_ice_slab", new SlabBlock(Block.Settings.copy(BLACK_ICE)));
	public static final Block BROWN_ICE_SLAB = register("brown_ice_slab", new SlabBlock(Block.Settings.copy(BROWN_ICE)));
	public static final Block SOUL_ICE_SLAB = register("soul_ice_slab", new SlabBlock(Block.Settings.copy(SOUL_ICE)));

	// Ice Stairs
	public static final Block RED_ICE_STAIRS = register("red_ice_stairs", new CPlusStairBlock(RED_ICE.getDefaultState(), Block.Settings.copy(RED_ICE)));
	public static final Block ORANGE_ICE_STAIRS = register("orange_ice_stairs", new CPlusStairBlock(ORANGE_ICE.getDefaultState(), Block.Settings.copy(ORANGE_ICE)));
	public static final Block YELLOW_ICE_STAIRS = register("yellow_ice_stairs", new CPlusStairBlock(YELLOW_ICE.getDefaultState(), Block.Settings.copy(YELLOW_ICE)));
	public static final Block LIME_ICE_STAIRS = register("lime_ice_stairs", new CPlusStairBlock(LIME_ICE.getDefaultState(), Block.Settings.copy(LIME_ICE)));
	public static final Block GREEN_ICE_STAIRS = register("green_ice_stairs", new CPlusStairBlock(GREEN_ICE.getDefaultState(), Block.Settings.copy(GREEN_ICE)));
	public static final Block BLUE_ICE_STAIRS = register("blue_ice_stairs", new CPlusStairBlock(BLUE_ICE.getDefaultState(), Block.Settings.copy(BLUE_ICE)));
	public static final Block CYAN_ICE_STAIRS = register("cyan_ice_stairs", new CPlusStairBlock(CYAN_ICE.getDefaultState(), Block.Settings.copy(CYAN_ICE)));
	public static final Block LIGHT_BLUE_ICE_STAIRS = register("light_blue_ice_stairs", new CPlusStairBlock(LIGHT_BLUE_ICE.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_ICE)));
	public static final Block PURPLE_ICE_STAIRS = register("purple_ice_stairs", new CPlusStairBlock(PURPLE_ICE.getDefaultState(), Block.Settings.copy(PURPLE_ICE)));
	public static final Block MAGENTA_ICE_STAIRS = register("magenta_ice_stairs", new CPlusStairBlock(MAGENTA_ICE.getDefaultState(), Block.Settings.copy(MAGENTA_ICE)));
	public static final Block PINK_ICE_STAIRS = register("pink_ice_stairs", new CPlusStairBlock(PINK_ICE.getDefaultState(), Block.Settings.copy(PINK_ICE)));
	public static final Block WHITE_ICE_STAIRS = register("white_ice_stairs", new CPlusStairBlock(WHITE_ICE.getDefaultState(), Block.Settings.copy(WHITE_ICE)));
	public static final Block LIGHT_GRAY_ICE_STAIRS = register("light_gray_ice_stairs", new CPlusStairBlock(LIGHT_GRAY_ICE.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_ICE)));
	public static final Block GRAY_ICE_STAIRS = register("gray_ice_stairs", new CPlusStairBlock(GRAY_ICE.getDefaultState(), Block.Settings.copy(GRAY_ICE)));
	public static final Block BLACK_ICE_STAIRS = register("black_ice_stairs", new CPlusStairBlock(BLACK_ICE.getDefaultState(), Block.Settings.copy(BLACK_ICE)));
	public static final Block BROWN_ICE_STAIRS = register("brown_ice_stairs", new CPlusStairBlock(BROWN_ICE.getDefaultState(), Block.Settings.copy(BROWN_ICE)));
	public static final Block SOUL_ICE_STAIRS = register("soul_ice_stairs", new CPlusStairBlock(SOUL_ICE.getDefaultState(), Block.Settings.copy(SOUL_ICE)));

	// Ice Wall
	public static final Block RED_ICE_WALL = register("red_ice_wall", new WallBlock(Block.Settings.copy(RED_ICE)));
	public static final Block ORANGE_ICE_WALL = register("orange_ice_wall", new WallBlock(Block.Settings.copy(ORANGE_ICE)));
	public static final Block YELLOW_ICE_WALL = register("yellow_ice_wall", new WallBlock(Block.Settings.copy(YELLOW_ICE)));
	public static final Block LIME_ICE_WALL = register("lime_ice_wall", new WallBlock(Block.Settings.copy(LIME_ICE)));
	public static final Block GREEN_ICE_WALL = register("green_ice_wall", new WallBlock(Block.Settings.copy(GREEN_ICE)));
	public static final Block BLUE_ICE_WALL = register("blue_ice_wall", new WallBlock(Block.Settings.copy(BLUE_ICE)));
	public static final Block CYAN_ICE_WALL = register("cyan_ice_wall", new WallBlock(Block.Settings.copy(CYAN_ICE)));
	public static final Block LIGHT_BLUE_ICE_WALL = register("light_blue_ice_wall", new WallBlock(Block.Settings.copy(LIGHT_BLUE_ICE)));
	public static final Block PURPLE_ICE_WALL = register("purple_ice_wall", new WallBlock(Block.Settings.copy(PURPLE_ICE)));
	public static final Block MAGENTA_ICE_WALL = register("magenta_ice_wall", new WallBlock(Block.Settings.copy(MAGENTA_ICE)));
	public static final Block PINK_ICE_WALL = register("pink_ice_wall", new WallBlock(Block.Settings.copy(PINK_ICE)));
	public static final Block WHITE_ICE_WALL = register("white_ice_wall", new WallBlock(Block.Settings.copy(WHITE_ICE)));
	public static final Block LIGHT_GRAY_ICE_WALL = register("light_gray_ice_wall", new WallBlock(Block.Settings.copy(LIGHT_GRAY_ICE)));
	public static final Block GRAY_ICE_WALL = register("gray_ice_wall", new WallBlock(Block.Settings.copy(GRAY_ICE)));
	public static final Block BLACK_ICE_WALL = register("black_ice_wall", new WallBlock(Block.Settings.copy(BLACK_ICE)));
	public static final Block BROWN_ICE_WALL = register("brown_ice_wall", new WallBlock(Block.Settings.copy(BROWN_ICE)));
	public static final Block SOUL_ICE_WALL = register("soul_ice_wall", new WallBlock(Block.Settings.copy(SOUL_ICE)));

	// Ice Gate
	public static final Block RED_ICE_GATE = register("red_ice_gate", new CPlusFenceGateBlock(Block.Settings.copy(RED_ICE)));
	public static final Block ORANGE_ICE_GATE = register("orange_ice_gate", new CPlusFenceGateBlock(Block.Settings.copy(ORANGE_ICE)));
	public static final Block YELLOW_ICE_GATE = register("yellow_ice_gate", new CPlusFenceGateBlock(Block.Settings.copy(YELLOW_ICE)));
	public static final Block LIME_ICE_GATE = register("lime_ice_gate", new CPlusFenceGateBlock(Block.Settings.copy(LIME_ICE)));
	public static final Block GREEN_ICE_GATE = register("green_ice_gate", new CPlusFenceGateBlock(Block.Settings.copy(GREEN_ICE)));
	public static final Block BLUE_ICE_GATE = register("blue_ice_gate", new CPlusFenceGateBlock(Block.Settings.copy(BLUE_ICE)));
	public static final Block CYAN_ICE_GATE = register("cyan_ice_gate", new CPlusFenceGateBlock(Block.Settings.copy(CYAN_ICE)));
	public static final Block LIGHT_BLUE_ICE_GATE = register("light_blue_ice_gate", new CPlusFenceGateBlock(Block.Settings.copy(LIGHT_BLUE_ICE)));
	public static final Block PURPLE_ICE_GATE = register("purple_ice_gate", new CPlusFenceGateBlock(Block.Settings.copy(PURPLE_ICE)));
	public static final Block MAGENTA_ICE_GATE = register("magenta_ice_gate", new CPlusFenceGateBlock(Block.Settings.copy(MAGENTA_ICE)));
	public static final Block PINK_ICE_GATE = register("pink_ice_gate", new CPlusFenceGateBlock(Block.Settings.copy(PINK_ICE)));
	public static final Block WHITE_ICE_GATE = register("white_ice_gate", new CPlusFenceGateBlock(Block.Settings.copy(WHITE_ICE)));
	public static final Block LIGHT_GRAY_ICE_GATE = register("light_gray_ice_gate", new CPlusFenceGateBlock(Block.Settings.copy(LIGHT_GRAY_ICE)));
	public static final Block GRAY_ICE_GATE = register("gray_ice_gate", new CPlusFenceGateBlock(Block.Settings.copy(GRAY_ICE)));
	public static final Block BLACK_ICE_GATE = register("black_ice_gate", new CPlusFenceGateBlock(Block.Settings.copy(BLACK_ICE)));
	public static final Block BROWN_ICE_GATE = register("brown_ice_gate", new CPlusFenceGateBlock(Block.Settings.copy(BROWN_ICE)));
	public static final Block SOUL_ICE_GATE = register("soul_ice_gate", new CPlusFenceGateBlock(Block.Settings.copy(SOUL_ICE)));


	//Glowstone
	public static final Block SOUL_GLOWSTONE = register("soul_glowstone", new Block(Block.Settings.of(Material.GLASS, MapColor.LIGHT_BLUE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance((state) -> 10).nonOpaque()));
	public static final Block SOUL_GLOWSTONE_SLAB = register("soul_glowstone_slab", new SlabBlock(Block.Settings.copy(SOUL_GLOWSTONE)));
	public static final Block SOUL_GLOWSTONE_STAIRS = register("soul_glowstone_stairs", new CPlusStairBlock(SOUL_GLOWSTONE.getDefaultState(), Block.Settings.copy(SOUL_GLOWSTONE)));
	public static final Block SOUL_GLOWSTONE_WALL = register("soul_glowstone_wall", new WallBlock(Block.Settings.copy(SOUL_GLOWSTONE)));
	public static final Block SOUL_GLOWSTONE_GATE = register("soul_glowstone_gate", new CPlusFenceGateBlock(Block.Settings.copy(SOUL_GLOWSTONE)));

	// Dirt
	public static final Block DIRT_SLAB = register("dirt_slab", new DirtSlabBlock(Block.Settings.copy(DIRT)));
	public static final Block DIRT_STAIRS = register("dirt_stairs", new DirtStairsBlock(DIRT.getDefaultState(), Block.Settings.copy(DIRT)));
	public static final Block DIRT_WALL = register("dirt_wall", new DirtWallBlock(Block.Settings.copy(DIRT)));

	// Grass
	public static final Block GRASS_SLAB = register("grass_slab", new GrassSlabBlock(Block.Settings.copy(GRASS_BLOCK)));
	public static final Block GRASS_STAIRS = register("grass_stairs", new GrassStairsBlock(GRASS_BLOCK.getDefaultState(), Block.Settings.copy(GRASS_BLOCK)));
	public static final Block GRASS_WALL = register("grass_wall", new GrassWallBlock(Block.Settings.copy(GRASS_BLOCK)));

	// Mycelium
	public static final Block MYCELIUM_SLAB = register("mycelium_slab", new MyceliumSlabBlock(Block.Settings.copy(MYCELIUM)));
	public static final Block MYCELIUM_STAIRS = register("mycelium_stairs", new MyceliumStairsBlock(MYCELIUM.getDefaultState(), Block.Settings.copy(MYCELIUM)));
	public static final Block MYCELIUM_WALL = register("mycelium_wall", new MyceliumWallBlock(Block.Settings.copy(MYCELIUM)));

	// Miscellaneous
	// public static final Block JACK_O_RED = register("jack_o_red", new RedstonePumpkinBlock(Block.Settings.of(Material.GOURD, MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD).luminance(13)));
	public static final Block JACK_O_SOUL = register("jack_o_soul", new CPlusCarvedPumpkinBlock(Block.Settings.of(Material.GOURD, MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD).luminance((state) ->10)));
	public static final Block WARPED_WART = register("warped_wart", new WarpedNetherWartPlantBlock(Block.Settings.of(Material.PLANT, MapColor.BLUE).noCollision().ticksRandomly().sounds(BlockSoundGroup.NETHER_WART).nonOpaque()));
	public static final Block KFP_BLOCK = register("kfp_block", new Block(CPlusSharedBlockSettings.concrete().mapColor(MapColor.ORANGE)));
	//	public static final Block CHARCOAL_BLOCK = register("charcoal_block", new Block(Block.Settings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(5.0F, 6.0F)));
	public static final Block PINEAPPLE = register("pineapple", new CPlusCarvedPumpkinBlock(Block.Settings.of(Material.GOURD, MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD)));
	public static final Block NETHERITE_STAIRS = register("netherite_stairs", new CPlusStairBlock(NETHERITE_BLOCK.getDefaultState(), Block.Settings.copy(NETHERITE_BLOCK)));
	public static final Block SUSPICIOUS_SLAB = register("suspicious_slab", new SlabBlock(Block.Settings.copy(CLAY)));
	public static final Block JET = register("jet", new Block(Block.Settings.copy(BEDROCK)));
	public static final Block NUBERT = register("nubert", new NubertBlock());
	public static final Block WIGGED_NUBERT = register("wigged_nubert", new WiggedNubertBlock());
//  public static final Block SIUOLS_SANITY = register("is_a_crab", new Block(Block.Settings.copy(HELP_ME)));
	//  You are having funny fun because your playing a Siuolplexplex contributed mod

	// Deprecated Blocks
	public static final Block STONE_BRICK_PILLAR = register("stone_brick_pillar", new PillarBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final Block CRACKED_STONE_BRICK_PILLAR = register("cracked_stone_brick_pillar", new PillarBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final Block MOSSY_STONE_BRICK_PILLAR = register("mossy_stone_brick_pillar", new PillarBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final Block CARVED_STONE_BRICKS = register("carved_stone_bricks", new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final Block CRACKED_CHISELED_STONE_BRICKS = register("cracked_chiseled_stone_bricks", new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final Block MOSSY_CHISELED_STONE_BRICKS = register("mossy_chiseled_stone_bricks", new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final Block MOSSY_BLACKSTONE_BRICK_PILLAR = register("mossy_blackstone_brick_pillar", new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final Block CRACKED_BLACKSTONE_BRICK_PILLAR = register("cracked_blackstone_brick_pillar", new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final Block BLACKSTONE_BRICK_PILLAR = register("blackstone_brick_pillar", new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final Block CHISELED_BRICKS = register("chiseled_bricks", new Block(Block.Settings.copy(BRICKS)));
	public static final Block BRICK_PILLAR = register("brick_pillar", new PillarBlock(Block.Settings.copy(BRICKS)));
	public static final Block CARVED_BRICKS = register("carved_bricks", new Block(Block.Settings.copy(BRICKS)));
	public static final Block END_STONE_BRICK_PILLAR = register("end_stone_brick_pillar", new PillarBlock(Block.Settings.copy(END_STONE_BRICKS)));
	public static final Block SMOOTH_PURPUR_BLOCK = register("smooth_purpur_block", new Block(Block.Settings.copy(PURPUR_BLOCK)));
	public static final Block POLISHED_PURPUR_BLOCK = register("polished_purpur_block", new Block(Block.Settings.copy(PURPUR_BLOCK)));
	public static final Block CHISELED_PURPUR_BLOCK = register("chiseled_purpur_block", new Block(Block.Settings.copy(PURPUR_BLOCK)));
	public static final Block BLUE_NETHER_BRICKS = register("blue_nether_bricks", new Block(Block.Settings.copy(NETHER_BRICKS)));
	public static final Block BLUE_NETHER_BRICK_SLAB = register("blue_nether_brick_slab", new SlabBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final Block BLUE_NETHER_BRICK_STAIRS = register("blue_nether_brick_stairs", new CPlusStairBlock(NETHER_BRICKS.getDefaultState(), Block.Settings.copy(NETHER_BRICKS)));
	public static final Block BLUE_NETHER_BRICK_WALL = register("blue_nether_brick_wall", new WallBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final Block BLUE_NETHER_BRICK_FENCE_GATE = register("blue_nether_brick_fence_gate", new CPlusFenceGateBlock(Block.Settings.copy(BLUE_NETHER_BRICKS)));
	public static final Block CRACKED_BLUE_NETHER_BRICKS = register("cracked_blue_nether_bricks", new Block(Block.Settings.copy(CRACKED_NETHER_BRICKS)));
	public static final Block CRACKED_BLUE_NETHER_BRICK_SLAB = register("cracked_blue_nether_brick_slab", new SlabBlock(Block.Settings.copy(CRACKED_NETHER_BRICKS)));
	public static final Block CRACKED_BLUE_NETHER_BRICK_STAIRS = register("cracked_blue_nether_brick_stairs", new CPlusStairBlock(CRACKED_NETHER_BRICKS.getDefaultState(), Block.Settings.copy(NETHER_BRICKS)));
	public static final Block CRACKED_BLUE_NETHER_BRICK_WALL = register("cracked_blue_nether_brick_wall", new WallBlock(Block.Settings.copy(CRACKED_NETHER_BRICKS)));
	public static final Block CRACKED_BLUE_NETHER_BRICK_FENCE_GATE = register("cracked_blue_nether_brick_fence_gate", new CPlusFenceGateBlock(Block.Settings.copy(CRACKED_BLUE_NETHER_BRICKS)));
	public static final Block CHISELED_BLUE_NETHER_BRICKS = register("chiseled_blue_nether_bricks", new Block(Block.Settings.copy(BLUE_NETHER_BRICKS)));
	public static final Block BLUE_NETHER_BRICK_PILLAR = register("blue_nether_brick_pillar", new PillarBlock(Block.Settings.copy(BLUE_NETHER_BRICKS)));
	public static final Block CARVED_BLUE_NETHER_BRICKS = register("carved_blue_nether_bricks", new Block(Block.Settings.copy(BLUE_NETHER_BRICKS)));
	public static final Block CHISELED_NETHER_BRICKS = register("chiseled_nether_bricks", new Block(Block.Settings.copy(NETHER_BRICKS)));
	public static final Block NETHER_BRICK_PILLAR = register("nether_brick_pillar", new PillarBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final Block RED_NETHER_BRICK_FENCE_GATE = register("red_nether_brick_fence_gate", new CPlusFenceGateBlock(Block.Settings.copy(RED_NETHER_BRICKS)));
	public static final Block CHISELED_RED_NETHER_BRICKS = register("chiseled_red_nether_bricks", new Block(Block.Settings.copy(RED_NETHER_BRICKS)));
	public static final Block RED_NETHER_BRICK_PILLAR = register("red_nether_brick_pillar", new PillarBlock(Block.Settings.copy(RED_NETHER_BRICKS)));
	public static final Block CARVED_RED_NETHER_BRICKS = register("carved_red_nether_bricks", new Block(Block.Settings.copy(RED_NETHER_BRICKS)));


	// Siuol's selection regex syntax machine (?=")(.*)(?<=____")
	// Per Thing regex selection machine (?=")(.*)(____.*)(?<=")
	
	private static Block register(String name, Block block) {
		RegistrySupplier<Block> blockSupplied = BLOCKS.register(name, () -> block);
		return block;
	}

	public static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos, EntityType<?> entityType) {
		return false;
	}

	public static void init() {
		if (ConsistencyPlusMain.DEVENV) ConsistencyPlusMain.LOGGER.info("CPlusBlocks - initialization point");
	}
	
	public static void register() {
		BLOCKS.register();
	}
	
	public static boolean isValidPortalBlock(BlockState state) {
		if (VALID_PORTAL_BLOCKS.contains(state.getBlock())) {
			if (state.contains(SlabBlock.TYPE)) {
				return state.get(SlabBlock.TYPE) == SlabType.DOUBLE;
			}
			return true;
		}
		return false;
	}
	
	public static boolean isValidConduitBlock(BlockState state) {
		return VALID_CONDUIT_BLOCKS.contains(state.getBlock());
	}
}
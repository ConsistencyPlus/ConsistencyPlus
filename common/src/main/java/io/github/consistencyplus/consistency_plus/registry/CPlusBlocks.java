package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
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
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertBlock;
import io.github.consistencyplus.consistency_plus.blocks.nubert.WiggedNubertBlock;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusCarvedPumpkinBlock;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusStairBlock;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

import static net.minecraft.block.Blocks.*;

public class CPlusBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ConsistencyPlusMain.ID, Registry.BLOCK_KEY);
	
	public static final RegistrySupplier<Block>
			
			//Stone
	
	STONE_WALL = BLOCKS.register("stone_wall", () ->
			new WallBlock(Block.Settings.copy(STONE))),
	STONE_GATE = BLOCKS.register("stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(STONE))),

	COBBLESTONE_GATE = BLOCKS.register("cobblestone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(COBBLESTONE))),
	MOSSY_COBBLESTONE_GATE = BLOCKS.register("mossy_cobblestone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MOSSY_COBBLESTONE))),
	//Smooth
	SMOOTH_STONE_STAIRS = BLOCKS.register("smooth_stone_stairs", () ->
			new CPlusStairBlock(SMOOTH_STONE.getDefaultState(), Block.Settings.copy(STONE))),
	SMOOTH_STONE_WALL = BLOCKS.register("smooth_stone_wall", () ->
			new WallBlock(Block.Settings.copy(STONE))),
	SMOOTH_STONE_GATE = BLOCKS.register("smooth_stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(STONE))),

	//Polished
	POLISHED_STONE = BLOCKS.register("polished_stone", () ->
			new Block(Block.Settings.copy(STONE_BRICKS))),
	POLISHED_STONE_SLAB = BLOCKS.register("polished_stone_slab", () ->
			new SlabBlock(Block.Settings.copy(STONE_BRICKS))),
	POLISHED_STONE_STAIRS = BLOCKS.register("polished_stone_stairs", () ->
			new CPlusStairBlock(STONE_BRICKS.getDefaultState(), Block.Settings.copy(STONE_BRICKS))),
	POLISHED_STONE_WALL = BLOCKS.register("polished_stone_wall", () ->
			new WallBlock(Block.Settings.copy(STONE_BRICKS))),
	POLISHED_STONE_GATE = BLOCKS.register("polished_stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(STONE))),

	//Cut
	CUT_STONE = BLOCKS.register("cut_stone", () ->
			new Block(Block.Settings.copy(STONE_BRICKS))),
	CUT_STONE_SLAB = BLOCKS.register("cut_stone_slab", () ->
			new SlabBlock(Block.Settings.copy(STONE_BRICKS))),
	CUT_STONE_STAIRS = BLOCKS.register("cut_stone_stairs", () ->
			new CPlusStairBlock(STONE_BRICKS.getDefaultState(), Block.Settings.copy(STONE_BRICKS))),
	CUT_STONE_WALL = BLOCKS.register("cut_stone_wall", () ->
			new WallBlock(Block.Settings.copy(STONE_BRICKS))),
	CUT_STONE_GATE = BLOCKS.register("cut_stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(STONE_BRICKS))),

	STONE_TILES = BLOCKS.register("stone_tiles", () ->
			new Block(Block.Settings.copy(STONE))),
	STONE_TILE_SLAB = BLOCKS.register("stone_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(STONE))),
	STONE_TILE_STAIRS = BLOCKS.register("stone_tile_stairs", () ->
			new CPlusStairBlock(STONE_TILES.get().getDefaultState(), Block.Settings.copy(STONE))),
	STONE_TILE_WALL = BLOCKS.register("stone_tile_wall", () ->
			new WallBlock(Block.Settings.copy(STONE))),
	STONE_TILE_GATE = BLOCKS.register("stone_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(STONE))),

	// Bricks
	STONE_BRICK_GATE = BLOCKS.register("stone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(STONE_BRICKS))),

	// Cracked
	CRACKED_STONE_BRICK_SLAB = BLOCKS.register("cracked_stone_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(CRACKED_STONE_BRICKS))),
	CRACKED_STONE_BRICK_STAIRS = BLOCKS.register("cracked_stone_brick_stairs", () ->
			new CPlusStairBlock(CRACKED_STONE_BRICKS.getDefaultState(), Block.Settings.copy(CRACKED_STONE_BRICKS))),
	CRACKED_STONE_BRICK_WALL = BLOCKS.register("cracked_stone_brick_wall", () ->
			new WallBlock(Block.Settings.copy(CRACKED_STONE_BRICKS))),
	CRACKED_STONE_BRICK_GATE = BLOCKS.register("cracked_stone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CRACKED_STONE_BRICKS))),

	// Mossy
	MOSSY_STONE_BRICK_GATE = BLOCKS.register("mossy_stone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MOSSY_STONE_BRICKS))),

	// Pillar and Chiseled
	STONE_PILLAR = BLOCKS.register("stone_pillar", () ->
			new PillarBlock(Block.Settings.copy(STONE_BRICKS))),
	CRACKED_STONE_PILLAR = BLOCKS.register("cracked_stone_pillar", () ->
			new PillarBlock(Block.Settings.copy(STONE_BRICKS))),
	MOSSY_STONE_PILLAR = BLOCKS.register("mossy_stone_pillar", () ->
			new PillarBlock(Block.Settings.copy(STONE_BRICKS))),
	STONE_CORNER_PILLAR = BLOCKS.register("stone_corner_pillar", () ->
			new Block(Block.Settings.copy(STONE_BRICKS))),
	CRACKED_STONE_CORNER_PILLAR = BLOCKS.register("cracked_stone_corner_pillar", () ->
			new Block(Block.Settings.copy(STONE_BRICKS))),
	MOSSY_STONE_CORNER_PILLAR = BLOCKS.register("mossy_stone_corner_pillar", () ->
			new Block(Block.Settings.copy(STONE_BRICKS))),
	CRACKED_CHISELED_STONE = BLOCKS.register("cracked_chiseled_stone", () ->
			new Block(Block.Settings.copy(STONE_BRICKS))),
	MOSSY_CHISELED_STONE = BLOCKS.register("mossy_chiseled_stone", () ->
			new Block(Block.Settings.copy(STONE_BRICKS))),
	CARVED_STONE = BLOCKS.register("carved_stone", () ->
			new Block(Block.Settings.copy(STONE_BRICKS))),

	//Blackstone
	COBBLED_BLACKSTONE = BLOCKS.register("cobbled_blackstone", () ->
			new Block(Block.Settings.copy(BLACKSTONE))),
	COBBLED_BLACKSTONE_SLAB = BLOCKS.register("cobbled_blackstone_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACKSTONE))),
	COBBLED_BLACKSTONE_STAIRS = BLOCKS.register("cobbled_blackstone_stairs", () ->
			new CPlusStairBlock(BLACKSTONE.getDefaultState(), Block.Settings.copy(BLACKSTONE))),
	COBBLED_BLACKSTONE_WALL = BLOCKS.register("cobbled_blackstone_wall", () ->
			new WallBlock(Block.Settings.copy(BLACKSTONE))),
	COBBLED_BLACKSTONE_GATE = BLOCKS.register("cobbled_blackstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACKSTONE))),

	BLACKSTONE_GATE = BLOCKS.register("blackstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACKSTONE))),
	BLACKSTONE_BRICK_GATE = BLOCKS.register("blackstone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	POLISHED_BLACKSTONE_GATE = BLOCKS.register("polished_blackstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACKSTONE))),

	//Smooth
	SMOOTH_BLACKSTONE = BLOCKS.register("smooth_blackstone", () ->
			new Block(Block.Settings.copy(BLACKSTONE))),
	SMOOTH_BLACKSTONE_SLAB = BLOCKS.register("smooth_blackstone_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACKSTONE))),
	SMOOTH_BLACKSTONE_STAIRS = BLOCKS.register("smooth_blackstone_stairs", () ->
			new CPlusStairBlock(BLACKSTONE.getDefaultState(), Block.Settings.copy(BLACKSTONE))),
	SMOOTH_BLACKSTONE_WALL = BLOCKS.register("smooth_blackstone_wall", () ->
			new WallBlock(Block.Settings.copy(BLACKSTONE))),
	SMOOTH_BLACKSTONE_GATE = BLOCKS.register("smooth_blackstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACKSTONE))),

	//Cut
	CUT_BLACKSTONE = BLOCKS.register("cut_blackstone", () ->
			new Block(Block.Settings.copy(BLACKSTONE))),
	CUT_BLACKSTONE_SLAB = BLOCKS.register("cut_blackstone_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACKSTONE))),
	CUT_BLACKSTONE_STAIRS = BLOCKS.register("cut_blackstone_stairs", () ->
			new CPlusStairBlock(BLACKSTONE.getDefaultState(), Block.Settings.copy(BLACKSTONE))),
	CUT_BLACKSTONE_WALL = BLOCKS.register("cut_blackstone_wall", () ->
			new WallBlock(Block.Settings.copy(BLACKSTONE))),
	CUT_BLACKSTONE_GATE = BLOCKS.register("cut_blackstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACKSTONE))),

	BLACKSTONE_TILES = BLOCKS.register("blackstone_tiles", () ->
			new Block(Block.Settings.copy(BLACKSTONE))),
	BLACKSTONE_TILE_SLAB = BLOCKS.register("blackstone_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACKSTONE))),
	BLACKSTONE_TILE_STAIRS = BLOCKS.register("blackstone_tile_stairs", () ->
			new CPlusStairBlock(BLACKSTONE_TILES.get().getDefaultState(), Block.Settings.copy(BLACKSTONE))),
	BLACKSTONE_TILE_WALL = BLOCKS.register("blackstone_tile_wall", () ->
			new WallBlock(Block.Settings.copy(BLACKSTONE))),
	BLACKSTONE_TILE_GATE = BLOCKS.register("blackstone_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACKSTONE))),

	//Cracked
	CRACKED_BLACKSTONE_BRICK_SLAB = BLOCKS.register("cracked_blackstone_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	CRACKED_BLACKSTONE_BRICK_STAIRS = BLOCKS.register("cracked_blackstone_brick_stairs", () ->
			new CPlusStairBlock(CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), Block.Settings.copy(CRACKED_STONE_BRICKS))),
	CRACKED_BLACKSTONE_BRICK_WALL = BLOCKS.register("cracked_blackstone_brick_wall", () ->
			new WallBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	CRACKED_BLACKSTONE_BRICK_GATE = BLOCKS.register("cracked_blackstone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),

	//Mossy
	MOSSY_BLACKSTONE_BRICKS = BLOCKS.register("mossy_blackstone_bricks", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	MOSSY_BLACKSTONE_BRICK_SLAB = BLOCKS.register("mossy_blackstone_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	MOSSY_BLACKSTONE_BRICK_STAIRS = BLOCKS.register("mossy_blackstone_brick_stairs", () ->
			new CPlusStairBlock(POLISHED_BLACKSTONE_BRICKS.getDefaultState(), Block.Settings.copy(STONE_BRICKS))),
	MOSSY_BLACKSTONE_BRICK_WALL = BLOCKS.register("mossy_blackstone_brick_wall", () ->
			new WallBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	MOSSY_BLACKSTONE_BRICK_GATE = BLOCKS.register("mossy_blackstone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),

	//Pillars and Chiseled
	MOSSY_BLACKSTONE_PILLAR = BLOCKS.register("mossy_blackstone_pillar", () ->
			new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	CRACKED_BLACKSTONE_PILLAR = BLOCKS.register("cracked_blackstone_pillar", () ->
			new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	BLACKSTONE_PILLAR = BLOCKS.register("blackstone_pillar", () ->
			new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	MOSSY_BLACKSTONE_CORNER_PILLAR = BLOCKS.register("mossy_blackstone_corner_pillar", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	CRACKED_BLACKSTONE_CORNER_PILLAR = BLOCKS.register("cracked_blackstone_corner_pillar", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	BLACKSTONE_CORNER_PILLAR = BLOCKS.register("blackstone_corner_pillar", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	CHISELED_BLACKSTONE = BLOCKS.register("chiseled_blackstone", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	MOSSY_CHISELED_BLACKSTONE = BLOCKS.register("mossy_chiseled_blackstone", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	CRACKED_CHISELED_BLACKSTONE = BLOCKS.register("cracked_chiseled_blackstone", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	MOSSY_CARVED_BLACKSTONE = BLOCKS.register("mossy_carved_blackstone", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	CRACKED_CARVED_BLACKSTONE = BLOCKS.register("cracked_carved_blackstone", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),

	//Sandstone
	COBBLED_SANDSTONE = BLOCKS.register("cobbled_sandstone", () ->
			new Block(Block.Settings.copy(SANDSTONE))),
	COBBLED_SANDSTONE_SLAB = BLOCKS.register("cobbled_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(SANDSTONE))),
	COBBLED_SANDSTONE_STAIRS = BLOCKS.register("cobbled_sandstone_stairs", () ->
			new CPlusStairBlock(SANDSTONE.getDefaultState(), Block.Settings.copy(SANDSTONE))),
	COBBLED_SANDSTONE_WALL = BLOCKS.register("cobbled_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SANDSTONE))),
	COBBLED_SANDSTONE_GATE = BLOCKS.register("cobbled_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SANDSTONE))),

	SANDSTONE_GATE = BLOCKS.register("sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SANDSTONE))),

	//Smooth
	SMOOTH_SANDSTONE_WALL = BLOCKS.register("smooth_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SANDSTONE))),
	SMOOTH_SANDSTONE_GATE = BLOCKS.register("smooth_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SANDSTONE))),

	//Cut
	CUT_SANDSTONE_STAIRS = BLOCKS.register("cut_sandstone_stairs", () ->
			new CPlusStairBlock(CUT_SANDSTONE.getDefaultState(), Block.Settings.copy(SANDSTONE))),
	CUT_SANDSTONE_WALL = BLOCKS.register("cut_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SANDSTONE))),
	CUT_SANDSTONE_GATE = BLOCKS.register("cut_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SANDSTONE))),

	//Polished
	POLISHED_SANDSTONE = BLOCKS.register("polished_sandstone", () ->
			new Block(Block.Settings.copy(SANDSTONE))),
	POLISHED_SANDSTONE_SLAB = BLOCKS.register("polished_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(SANDSTONE))),
	POLISHED_SANDSTONE_STAIRS = BLOCKS.register("polished_sandstone_stairs", () ->
			new CPlusStairBlock(SANDSTONE.getDefaultState(), Block.Settings.copy(SANDSTONE))),
	POLISHED_SANDSTONE_WALL = BLOCKS.register("polished_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SANDSTONE))),
	POLISHED_SANDSTONE_GATE = BLOCKS.register("polished_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SANDSTONE))),

	//Bricks
	SANDSTONE_BRICKS = BLOCKS.register("sandstone_bricks", () ->
			new Block(Block.Settings.copy(SANDSTONE))),
	SANDSTONE_BRICK_SLAB = BLOCKS.register("sandstone_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(SANDSTONE))),
	SANDSTONE_BRICK_STAIRS = BLOCKS.register("sandstone_brick_stairs", () ->
			new CPlusStairBlock(SANDSTONE.getDefaultState(), Block.Settings.copy(SANDSTONE))),
	SANDSTONE_BRICK_WALL = BLOCKS.register("sandstone_brick_wall", () ->
			new WallBlock(Block.Settings.copy(SANDSTONE))),
	SANDSTONE_BRICK_GATE = BLOCKS.register("sandstone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SANDSTONE))),

	SANDSTONE_TILES = BLOCKS.register("sandstone_tiles", () ->
			new Block(Block.Settings.copy(SANDSTONE))),
	SANDSTONE_TILE_SLAB = BLOCKS.register("sandstone_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(SANDSTONE))),
	SANDSTONE_TILE_STAIRS = BLOCKS.register("sandstone_tile_stairs", () ->
			new CPlusStairBlock(SANDSTONE_TILES.get().getDefaultState(), Block.Settings.copy(SANDSTONE))),
	SANDSTONE_TILE_WALL = BLOCKS.register("sandstone_tile_wall", () ->
			new WallBlock(Block.Settings.copy(SANDSTONE))),
	SANDSTONE_TILE_GATE = BLOCKS.register("sandstone_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SANDSTONE))),

	//Pillars and Chiseled
	CHISELED_SANDSTONE = BLOCKS.register("chiseled_sandstone", () ->
			new Block(Block.Settings.copy(SANDSTONE))),
	SANDSTONE_PILLAR = BLOCKS.register("sandstone_pillar", () ->
			new PillarBlock(Block.Settings.copy(SANDSTONE))),
	SANDSTONE_CORNER_PILLAR = BLOCKS.register("sandstone_corner_pillar", () ->
			new Block(Block.Settings.copy(SANDSTONE))),

	//Red Sandstone
	COBBLED_RED_SANDSTONE = BLOCKS.register("cobbled_red_sandstone", () ->
			new Block(Block.Settings.copy(RED_SANDSTONE))),
	COBBLED_RED_SANDSTONE_SLAB = BLOCKS.register("cobbled_red_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_SANDSTONE))),
	COBBLED_RED_SANDSTONE_STAIRS = BLOCKS.register("cobbled_red_sandstone_stairs", () ->
			new CPlusStairBlock(RED_SANDSTONE.getDefaultState(), Block.Settings.copy(RED_SANDSTONE))),
	COBBLED_RED_SANDSTONE_WALL = BLOCKS.register("cobbled_red_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(RED_SANDSTONE))),
	COBBLED_RED_SANDSTONE_GATE = BLOCKS.register("cobbled_red_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_SANDSTONE))),

	RED_SANDSTONE_GATE = BLOCKS.register("red_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_SANDSTONE))),

	//Smooth
	SMOOTH_RED_SANDSTONE_WALL = BLOCKS.register("smooth_red_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(RED_SANDSTONE))),
	SMOOTH_RED_SANDSTONE_GATE = BLOCKS.register("smooth_red_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_SANDSTONE))),

	//Cut
	CUT_RED_SANDSTONE_STAIRS = BLOCKS.register("cut_red_sandstone_stairs", () ->
			new CPlusStairBlock(CUT_SANDSTONE.getDefaultState(), Block.Settings.copy(SANDSTONE))),
	CUT_RED_SANDSTONE_WALL = BLOCKS.register("cut_red_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SANDSTONE))),
	CUT_RED_SANDSTONE_GATE = BLOCKS.register("cut_red_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_SANDSTONE))),

	//Polished
	POLISHED_RED_SANDSTONE = BLOCKS.register("polished_red_sandstone", () ->
			new Block(Block.Settings.copy(RED_SANDSTONE))),
	POLISHED_RED_SANDSTONE_SLAB = BLOCKS.register("polished_red_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_SANDSTONE))),
	POLISHED_RED_SANDSTONE_STAIRS = BLOCKS.register("polished_red_sandstone_stairs", () ->
			new CPlusStairBlock(RED_SANDSTONE.getDefaultState(), Block.Settings.copy(SANDSTONE))),
	POLISHED_RED_SANDSTONE_WALL = BLOCKS.register("polished_red_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(RED_SANDSTONE))),
	POLISHED_RED_SANDSTONE_GATE = BLOCKS.register("polished_red_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_SANDSTONE))),

	//Bricks
	RED_SANDSTONE_BRICKS = BLOCKS.register("red_sandstone_bricks", () ->
			new Block(Block.Settings.copy(RED_SANDSTONE))),
	RED_SANDSTONE_BRICK_SLAB = BLOCKS.register("red_sandstone_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_SANDSTONE))),
	RED_SANDSTONE_BRICK_STAIRS = BLOCKS.register("red_sandstone_brick_stairs", () ->
			new CPlusStairBlock(RED_SANDSTONE.getDefaultState(), Block.Settings.copy(SANDSTONE))),
	RED_SANDSTONE_BRICK_WALL = BLOCKS.register("red_sandstone_brick_wall", () ->
			new WallBlock(Block.Settings.copy(RED_SANDSTONE))),
	RED_SANDSTONE_BRICK_GATE = BLOCKS.register("red_sandstone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_SANDSTONE))),

	RED_SANDSTONE_TILES = BLOCKS.register("red_sandstone_tiles", () ->
			new Block(Block.Settings.copy(RED_SANDSTONE))),
	RED_SANDSTONE_TILE_SLAB = BLOCKS.register("red_sandstone_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_SANDSTONE))),
	RED_SANDSTONE_TILE_STAIRS = BLOCKS.register("red_sandstone_tile_stairs", () ->
			new CPlusStairBlock(RED_SANDSTONE_TILES.get().getDefaultState(), Block.Settings.copy(RED_SANDSTONE))),
	RED_SANDSTONE_TILE_WALL = BLOCKS.register("red_sandstone_tile_wall", () ->
			new WallBlock(Block.Settings.copy(RED_SANDSTONE))),
	RED_SANDSTONE_TILE_GATE = BLOCKS.register("red_sandstone_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_SANDSTONE))),

	//Pillars and Chiseled
	CHISELED_RED_SANDSTONE = BLOCKS.register("chiseled_red_sandstone", () ->
			new Block(Block.Settings.copy(RED_SANDSTONE))),
	RED_SANDSTONE_PILLAR = BLOCKS.register("red_sandstone_pillar", () ->
			new PillarBlock(Block.Settings.copy(RED_SANDSTONE))),
	RED_SANDSTONE_CORNER_PILLAR = BLOCKS.register("red_sandstone_corner_pillar", () ->
			new Block(Block.Settings.copy(RED_SANDSTONE))),

	//Quartz
	QUARTZ_WALL = BLOCKS.register("quartz_wall", () ->
			new WallBlock(Block.Settings.copy(QUARTZ_BLOCK))),
	QUARTZ_GATE = BLOCKS.register("quartz_gate", () ->
			new FenceGateBlock(Block.Settings.copy(QUARTZ_BLOCK))),

	//Smooth
	SMOOTH_QUARTZ_WALL = BLOCKS.register("smooth_quartz_wall", () ->
			new WallBlock(Block.Settings.copy(QUARTZ_BLOCK))),
	SMOOTH_QUARTZ_GATE = BLOCKS.register("smooth_quartz_gate", () ->
			new FenceGateBlock(Block.Settings.copy(QUARTZ_BLOCK))),

	//Cut
	CUT_QUARTZ = BLOCKS.register("cut_quartz", () ->
			new Block(Block.Settings.copy(QUARTZ_BLOCK))),
	CUT_QUARTZ_SLAB = BLOCKS.register("cut_quartz_slab", () ->
			new SlabBlock(Block.Settings.copy(QUARTZ_BLOCK))),
	CUT_QUARTZ_STAIRS = BLOCKS.register("cut_quartz_stairs", () ->
			new CPlusStairBlock(QUARTZ_BLOCK.getDefaultState(), Block.Settings.copy(QUARTZ_BLOCK))),
	CUT_QUARTZ_WALL = BLOCKS.register("cut_quartz_wall", () ->
			new WallBlock(Block.Settings.copy(QUARTZ_BLOCK))),
	CUT_QUARTZ_GATE = BLOCKS.register("cut_quartz_gate", () ->
			new FenceGateBlock(Block.Settings.copy(QUARTZ_BLOCK))),

	//Tiles
	QUARTZ_TILES = BLOCKS.register("quartz_tiles", () ->
			new Block(Block.Settings.copy(QUARTZ_BLOCK))),
	QUARTZ_TILE_SLAB = BLOCKS.register("quartz_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(QUARTZ_BLOCK))),
	QUARTZ_TILE_STAIRS = BLOCKS.register("quartz_tile_stairs", () ->
			new CPlusStairBlock(QUARTZ_BLOCK.getDefaultState(), Block.Settings.copy(QUARTZ_BLOCK))),
	QUARTZ_TILE_WALL = BLOCKS.register("quartz_tile_wall", () ->
			new WallBlock(Block.Settings.copy(QUARTZ_BLOCK))),
	QUARTZ_TILE_GATE = BLOCKS.register("quartz_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(QUARTZ_BLOCK))),

	//Polished
	POLISHED_QUARTZ = BLOCKS.register("polished_quartz", () ->
			new Block(Block.Settings.copy(QUARTZ_BLOCK))),
	POLISHED_QUARTZ_SLAB = BLOCKS.register("polished_quartz_slab", () ->
			new SlabBlock(Block.Settings.copy(QUARTZ_BLOCK))),
	POLISHED_QUARTZ_STAIRS = BLOCKS.register("polished_quartz_stairs", () ->
			new CPlusStairBlock(QUARTZ_BLOCK.getDefaultState(), Block.Settings.copy(QUARTZ_BLOCK))),
	POLISHED_QUARTZ_WALL = BLOCKS.register("polished_quartz_wall", () ->
			new WallBlock(Block.Settings.copy(QUARTZ_BLOCK))),
	POLISHED_QUARTZ_GATE = BLOCKS.register("polished_quartz_gate", () ->
			new FenceGateBlock(Block.Settings.copy(QUARTZ_BLOCK))),

	//Bricks
	QUARTZ_BRICK_SLAB = BLOCKS.register("quartz_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(QUARTZ_BLOCK))),
	QUARTZ_BRICK_STAIRS = BLOCKS.register("quartz_brick_stairs", () ->
			new CPlusStairBlock(QUARTZ_BLOCK.getDefaultState(), Block.Settings.copy(QUARTZ_BLOCK))),
	QUARTZ_BRICK_WALL = BLOCKS.register("quartz_brick_wall", () ->
			new WallBlock(Block.Settings.copy(QUARTZ_BLOCK))),
	QUARTZ_BRICK_GATE = BLOCKS.register("quartz_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(QUARTZ_BLOCK))),

	CARVED_QUARTZ = BLOCKS.register("carved_quartz", () ->
			new Block(Block.Settings.copy(QUARTZ_BLOCK))),
	QUARTZ_CORNER_PILLAR = BLOCKS.register("quartz_corner_pillar", () ->
			new Block(Block.Settings.copy(QUARTZ_BLOCK))),

	//Andesite
	ANDESITE_GATE = BLOCKS.register("andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),

	// Mossy
	MOSSY_ANDESITE = BLOCKS.register("mossy_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	MOSSY_ANDESITE_SLAB = BLOCKS.register("mossy_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE))),
	MOSSY_ANDESITE_STAIRS = BLOCKS.register("mossy_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE))),
	MOSSY_ANDESITE_WALL = BLOCKS.register("mossy_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE))),
	MOSSY_ANDESITE_GATE = BLOCKS.register("mossy_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),

	COBBLED_ANDESITE = BLOCKS.register("cobbled_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	COBBLED_ANDESITE_SLAB = BLOCKS.register("cobbled_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE))),
	COBBLED_ANDESITE_STAIRS = BLOCKS.register("cobbled_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE))),
	COBBLED_ANDESITE_WALL = BLOCKS.register("cobbled_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE))),
	COBBLED_ANDESITE_GATE = BLOCKS.register("cobbled_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),

	//Polished
	POLISHED_ANDESITE_WALL = BLOCKS.register("polished_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE))),
	POLISHED_ANDESITE_GATE = BLOCKS.register("polished_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),

	//Cracked Polished
	CRACKED_POLISHED_ANDESITE = BLOCKS.register("cracked_polished_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	CRACKED_POLISHED_ANDESITE_SLAB = BLOCKS.register("cracked_polished_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE))),
	CRACKED_POLISHED_ANDESITE_STAIRS = BLOCKS.register("cracked_polished_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE))),
	CRACKED_POLISHED_ANDESITE_WALL = BLOCKS.register("cracked_polished_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE))),
	CRACKED_POLISHED_ANDESITE_GATE = BLOCKS.register("cracked_polished_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),

	//Mossy Polished
	MOSSY_POLISHED_ANDESITE = BLOCKS.register("mossy_polished_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	MOSSY_POLISHED_ANDESITE_SLAB = BLOCKS.register("mossy_polished_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE))),
	MOSSY_POLISHED_ANDESITE_STAIRS = BLOCKS.register("mossy_polished_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE))),
	MOSSY_POLISHED_ANDESITE_WALL = BLOCKS.register("mossy_polished_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE))),
	MOSSY_POLISHED_ANDESITE_GATE = BLOCKS.register("mossy_polished_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),

	//Smooth
	SMOOTH_ANDESITE = BLOCKS.register("smooth_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	SMOOTH_ANDESITE_SLAB = BLOCKS.register("smooth_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE))),
	SMOOTH_ANDESITE_STAIRS = BLOCKS.register("smooth_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE))),
	SMOOTH_ANDESITE_WALL = BLOCKS.register("smooth_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE))),
	SMOOTH_ANDESITE_GATE = BLOCKS.register("smooth_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),

	//Cracked Smooth
	CRACKED_SMOOTH_ANDESITE = BLOCKS.register("cracked_smooth_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	CRACKED_SMOOTH_ANDESITE_SLAB = BLOCKS.register("cracked_smooth_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE))),
	CRACKED_SMOOTH_ANDESITE_STAIRS = BLOCKS.register("cracked_smooth_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE))),
	CRACKED_SMOOTH_ANDESITE_WALL = BLOCKS.register("cracked_smooth_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE))),
	CRACKED_SMOOTH_ANDESITE_GATE = BLOCKS.register("cracked_smooth_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),

	//Mossy Smooth
	MOSSY_SMOOTH_ANDESITE = BLOCKS.register("mossy_smooth_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	MOSSY_SMOOTH_ANDESITE_SLAB = BLOCKS.register("mossy_smooth_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE))),
	MOSSY_SMOOTH_ANDESITE_STAIRS = BLOCKS.register("mossy_smooth_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE))),
	MOSSY_SMOOTH_ANDESITE_WALL = BLOCKS.register("mossy_smooth_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE))),
	MOSSY_SMOOTH_ANDESITE_GATE = BLOCKS.register("mossy_smooth_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),

	//Cut
	CUT_ANDESITE = BLOCKS.register("cut_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	CUT_ANDESITE_SLAB = BLOCKS.register("cut_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE))),
	CUT_ANDESITE_STAIRS = BLOCKS.register("cut_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(QUARTZ_BLOCK))),
	CUT_ANDESITE_WALL = BLOCKS.register("cut_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE))),
	CUT_ANDESITE_GATE = BLOCKS.register("cut_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),

	//Cracked Cut
	CRACKED_CUT_ANDESITE = BLOCKS.register("cracked_cut_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	CRACKED_CUT_ANDESITE_SLAB = BLOCKS.register("cracked_cut_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE))),
	CRACKED_CUT_ANDESITE_STAIRS = BLOCKS.register("cracked_cut_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE))),
	CRACKED_CUT_ANDESITE_WALL = BLOCKS.register("cracked_cut_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE))),
	CRACKED_CUT_ANDESITE_GATE = BLOCKS.register("cracked_cut_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),

	//Mossy Cut
	MOSSY_CUT_ANDESITE = BLOCKS.register("mossy_cut_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	MOSSY_CUT_ANDESITE_SLAB = BLOCKS.register("mossy_cut_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE))),
	MOSSY_CUT_ANDESITE_STAIRS = BLOCKS.register("mossy_cut_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE))),
	MOSSY_CUT_ANDESITE_WALL = BLOCKS.register("mossy_cut_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE))),
	MOSSY_CUT_ANDESITE_GATE = BLOCKS.register("mossy_cut_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),

	ANDESITE_TILES = BLOCKS.register("andesite_tiles", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	ANDESITE_TILE_SLAB = BLOCKS.register("andesite_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE))),
	ANDESITE_TILE_STAIRS = BLOCKS.register("andesite_tile_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE))),
	ANDESITE_TILE_WALL = BLOCKS.register("andesite_tile_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE))),
	ANDESITE_TILE_GATE = BLOCKS.register("andesite_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),

	//Cracked Bricks
	CRACKED_ANDESITE_TILES = BLOCKS.register("cracked_andesite_tiles", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	CRACKED_ANDESITE_TILE_SLAB = BLOCKS.register("cracked_andesite_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE))),
	CRACKED_ANDESITE_TILE_STAIRS = BLOCKS.register("cracked_andesite_tile_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE))),
	CRACKED_ANDESITE_TILE_WALL = BLOCKS.register("cracked_andesite_tile_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE))),
	CRACKED_ANDESITE_TILE_GATE = BLOCKS.register("cracked_andesite_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),

	//Mossy Bricks
	MOSSY_ANDESITE_TILES = BLOCKS.register("mossy_andesite_tiles", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	MOSSY_ANDESITE_TILE_SLAB = BLOCKS.register("mossy_andesite_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE))),
	MOSSY_ANDESITE_TILE_STAIRS = BLOCKS.register("mossy_andesite_tile_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE))),
	MOSSY_ANDESITE_TILE_WALL = BLOCKS.register("mossy_andesite_tile_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE))),
	MOSSY_ANDESITE_TILE_GATE = BLOCKS.register("mossy_andesite_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),


	ANDESITE_BRICKS = BLOCKS.register("andesite_bricks", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	ANDESITE_BRICK_SLAB = BLOCKS.register("andesite_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE))),
	ANDESITE_BRICK_STAIRS = BLOCKS.register("andesite_brick_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE))),
	ANDESITE_BRICK_WALL = BLOCKS.register("andesite_brick_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE))),
	ANDESITE_BRICK_GATE = BLOCKS.register("andesite_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),

	//Cracked Bricks
	CRACKED_ANDESITE_BRICKS = BLOCKS.register("cracked_andesite_bricks", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	CRACKED_ANDESITE_BRICK_SLAB = BLOCKS.register("cracked_andesite_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE))),
	CRACKED_ANDESITE_BRICK_STAIRS = BLOCKS.register("cracked_andesite_brick_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE))),
	CRACKED_ANDESITE_BRICK_WALL = BLOCKS.register("cracked_andesite_brick_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE))),
	CRACKED_ANDESITE_BRICK_GATE = BLOCKS.register("cracked_andesite_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),

	//Mossy Bricks
	MOSSY_ANDESITE_BRICKS = BLOCKS.register("mossy_andesite_bricks", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	MOSSY_ANDESITE_BRICK_SLAB = BLOCKS.register("mossy_andesite_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE))),
	MOSSY_ANDESITE_BRICK_STAIRS = BLOCKS.register("mossy_andesite_brick_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE))),
	MOSSY_ANDESITE_BRICK_WALL = BLOCKS.register("mossy_andesite_brick_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE))),
	MOSSY_ANDESITE_BRICK_GATE = BLOCKS.register("mossy_andesite_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE))),

	//Pillars and Chiseled
	ANDESITE_PILLAR = BLOCKS.register("andesite_pillar", () ->
			new PillarBlock(Block.Settings.copy(ANDESITE))),
	CRACKED_ANDESITE_PILLAR = BLOCKS.register("cracked_andesite_pillar", () ->
			new PillarBlock(Block.Settings.copy(ANDESITE))),
	MOSSY_ANDESITE_PILLAR = BLOCKS.register("mossy_andesite_pillar", () ->
			new PillarBlock(Block.Settings.copy(ANDESITE))),
	ANDESITE_CORNER_PILLAR = BLOCKS.register("andesite_corner_pillar", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	CRACKED_ANDESITE_CORNER_PILLAR = BLOCKS.register("cracked_andesite_corner_pillar", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	MOSSY_ANDESITE_CORNER_PILLAR = BLOCKS.register("mossy_andesite_corner_pillar", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	CHISELED_ANDESITE = BLOCKS.register("chiseled_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	CRACKED_CHISELED_ANDESITE = BLOCKS.register("cracked_chiseled_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	MOSSY_CHISELED_ANDESITE = BLOCKS.register("mossy_chiseled_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	CARVED_ANDESITE = BLOCKS.register("carved_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	CRACKED_CARVED_ANDESITE = BLOCKS.register("cracked_carved_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE))),
	MOSSY_CARVED_ANDESITE = BLOCKS.register("mossy_carved_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE))),

	//Diorite
	DIORITE_GATE = BLOCKS.register("diorite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DIORITE))),

	COBBLED_DIORITE = BLOCKS.register("cobbled_diorite", () ->
			new Block(Block.Settings.copy(DIORITE))),
	COBBLED_DIORITE_SLAB = BLOCKS.register("cobbled_diorite_slab", () ->
			new SlabBlock(Block.Settings.copy(DIORITE))),
	COBBLED_DIORITE_STAIRS = BLOCKS.register("cobbled_diorite_stairs", () ->
			new CPlusStairBlock(DIORITE.getDefaultState(), Block.Settings.copy(DIORITE))),
	COBBLED_DIORITE_WALL = BLOCKS.register("cobbled_diorite_wall", () ->
			new WallBlock(Block.Settings.copy(DIORITE))),
	COBBLED_DIORITE_GATE = BLOCKS.register("cobbled_diorite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DIORITE))),

	//Polished
	POLISHED_DIORITE_WALL = BLOCKS.register("polished_diorite_wall", () ->
			new WallBlock(Block.Settings.copy(DIORITE))),
	POLISHED_DIORITE_GATE = BLOCKS.register("polished_diorite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DIORITE))),

	//Smooth
	SMOOTH_DIORITE = BLOCKS.register("smooth_diorite", () ->
			new Block(Block.Settings.copy(DIORITE))),
	SMOOTH_DIORITE_SLAB = BLOCKS.register("smooth_diorite_slab", () ->
			new SlabBlock(Block.Settings.copy(DIORITE))),
	SMOOTH_DIORITE_STAIRS = BLOCKS.register("smooth_diorite_stairs", () ->
			new CPlusStairBlock(DIORITE.getDefaultState(), Block.Settings.copy(DIORITE))),
	SMOOTH_DIORITE_WALL = BLOCKS.register("smooth_diorite_wall", () ->
			new WallBlock(Block.Settings.copy(DIORITE))),
	SMOOTH_DIORITE_GATE = BLOCKS.register("smooth_diorite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DIORITE))),

	//Cut
	CUT_DIORITE = BLOCKS.register("cut_diorite", () ->
			new Block(Block.Settings.copy(DIORITE))),
	CUT_DIORITE_SLAB = BLOCKS.register("cut_diorite_slab", () ->
			new SlabBlock(Block.Settings.copy(DIORITE))),
	CUT_DIORITE_STAIRS = BLOCKS.register("cut_diorite_stairs", () ->
			new CPlusStairBlock(DIORITE.getDefaultState(), Block.Settings.copy(DIORITE))),
	CUT_DIORITE_WALL = BLOCKS.register("cut_diorite_wall", () ->
			new WallBlock(Block.Settings.copy(DIORITE))),
	CUT_DIORITE_GATE = BLOCKS.register("cut_diorite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DIORITE))),

	DIORITE_TILES = BLOCKS.register("diorite_tiles", () ->
			new Block(Block.Settings.copy(DIORITE))),
	DIORITE_TILE_SLAB = BLOCKS.register("diorite_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(DIORITE))),
	DIORITE_TILE_STAIRS = BLOCKS.register("diorite_tile_stairs", () ->
			new CPlusStairBlock(DIORITE_TILES.get().getDefaultState(), Block.Settings.copy(DIORITE))),
	DIORITE_TILE_WALL = BLOCKS.register("diorite_tile_wall", () ->
			new WallBlock(Block.Settings.copy(DIORITE))),
	DIORITE_TILE_GATE = BLOCKS.register("diorite_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DIORITE))),

	//Bricks
	DIORITE_BRICKS = BLOCKS.register("diorite_bricks", () ->
			new Block(Block.Settings.copy(DIORITE))),
	DIORITE_BRICK_SLAB = BLOCKS.register("diorite_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(DIORITE))),
	DIORITE_BRICK_STAIRS = BLOCKS.register("diorite_brick_stairs", () ->
			new CPlusStairBlock(DIORITE.getDefaultState(), Block.Settings.copy(DIORITE))),
	DIORITE_BRICK_WALL = BLOCKS.register("diorite_brick_wall", () ->
			new WallBlock(Block.Settings.copy(DIORITE))),
	DIORITE_BRICK_GATE = BLOCKS.register("diorite_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DIORITE))),

	//Pillars and Chiseled
	DIORITE_PILLAR = BLOCKS.register("diorite_pillar", () ->
			new PillarBlock(Block.Settings.copy(DIORITE))),
	DIORITE_CORNER_PILLAR = BLOCKS.register("diorite_corner_pillar", () ->
			new Block(Block.Settings.copy(DIORITE))),
	CHISELED_DIORITE = BLOCKS.register("chiseled_diorite", () ->
			new Block(Block.Settings.copy(DIORITE))),
	CARVED_DIORITE = BLOCKS.register("carved_diorite", () ->
			new Block(Block.Settings.copy(DIORITE))),

	//Granite
	GRANITE_GATE = BLOCKS.register("granite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRANITE))),

	COBBLED_GRANITE = BLOCKS.register("cobbled_granite", () ->
			new Block(Block.Settings.copy(GRANITE))),
	COBBLED_GRANITE_SLAB = BLOCKS.register("cobbled_granite_slab", () ->
			new SlabBlock(Block.Settings.copy(GRANITE))),
	COBBLED_GRANITE_STAIRS = BLOCKS.register("cobbled_granite_stairs", () ->
			new CPlusStairBlock(GRANITE.getDefaultState(), Block.Settings.copy(GRANITE))),
	COBBLED_GRANITE_WALL = BLOCKS.register("cobbled_granite_wall", () ->
			new WallBlock(Block.Settings.copy(GRANITE))),
	COBBLED_GRANITE_GATE = BLOCKS.register("cobbled_granite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRANITE))),

	//Polished
	POLISHED_GRANITE_WALL = BLOCKS.register("polished_granite_wall", () ->
			new WallBlock(Block.Settings.copy(GRANITE))),
	POLISHED_GRANITE_GATE = BLOCKS.register("polished_granite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRANITE))),

	//Smooth
	SMOOTH_GRANITE = BLOCKS.register("smooth_granite", () ->
			new Block(Block.Settings.copy(GRANITE))),
	SMOOTH_GRANITE_SLAB = BLOCKS.register("smooth_granite_slab", () ->
			new SlabBlock(Block.Settings.copy(GRANITE))),
	SMOOTH_GRANITE_STAIRS = BLOCKS.register("smooth_granite_stairs", () ->
			new CPlusStairBlock(GRANITE.getDefaultState(), Block.Settings.copy(GRANITE))),
	SMOOTH_GRANITE_WALL = BLOCKS.register("smooth_granite_wall", () ->
			new WallBlock(Block.Settings.copy(GRANITE))),
	SMOOTH_GRANITE_GATE = BLOCKS.register("smooth_granite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRANITE))),

	//Cut
	CUT_GRANITE = BLOCKS.register("cut_granite", () ->
			new Block(Block.Settings.copy(GRANITE))),
	CUT_GRANITE_SLAB = BLOCKS.register("cut_granite_slab", () ->
			new SlabBlock(Block.Settings.copy(GRANITE))),
	CUT_GRANITE_STAIRS = BLOCKS.register("cut_granite_stairs", () ->
			new CPlusStairBlock(POLISHED_GRANITE.getDefaultState(), Block.Settings.copy(QUARTZ_BLOCK))),
	CUT_GRANITE_WALL = BLOCKS.register("cut_granite_wall", () ->
			new WallBlock(Block.Settings.copy(GRANITE))),
	CUT_GRANITE_GATE = BLOCKS.register("cut_granite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRANITE))),

	//Tiles
	GRANITE_TILES = BLOCKS.register("granite_tiles", () ->
			new Block(Block.Settings.copy(GRANITE))),
	GRANITE_TILE_SLAB = BLOCKS.register("granite_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(GRANITE))),
	GRANITE_TILE_STAIRS = BLOCKS.register("granite_tile_stairs", () ->
			new CPlusStairBlock(GRANITE_TILES.get().getDefaultState(), Block.Settings.copy(GRANITE))),
	GRANITE_TILE_WALL = BLOCKS.register("granite_tile_wall", () ->
			new WallBlock(Block.Settings.copy(GRANITE))),
	GRANITE_TILE_GATE = BLOCKS.register("granite_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRANITE))),

	//Bricks
	GRANITE_BRICKS = BLOCKS.register("granite_bricks", () ->
			new Block(Block.Settings.copy(GRANITE))),
	GRANITE_BRICK_SLAB = BLOCKS.register("granite_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(GRANITE))),
	GRANITE_BRICK_STAIRS = BLOCKS.register("granite_brick_stairs", () ->
			new CPlusStairBlock(GRANITE.getDefaultState(), Block.Settings.copy(GRANITE))),
	GRANITE_BRICK_WALL = BLOCKS.register("granite_brick_wall", () ->
			new WallBlock(Block.Settings.copy(GRANITE))),
	GRANITE_BRICK_GATE = BLOCKS.register("granite_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRANITE))),

	//Pillars and Chiseled
	GRANITE_PILLAR = BLOCKS.register("granite_pillar", () ->
			new PillarBlock(Block.Settings.copy(GRANITE))),
	GRANITE_CORNER_PILLAR = BLOCKS.register("granite_corner_pillar", () ->
			new Block(Block.Settings.copy(GRANITE))),
	CHISELED_GRANITE = BLOCKS.register("chiseled_granite", () ->
			new Block(Block.Settings.copy(GRANITE))),
	CARVED_GRANITE = BLOCKS.register("carved_granite", () ->
			new Block(Block.Settings.copy(GRANITE))),


	//Bricks
	BRICK_GATE = BLOCKS.register("brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BRICKS))),


	//Nether Bricks
//Nether Bricks will have a rework eventually, none of this is final
	//Cracked Bricks
	CRACKED_NETHER_BRICK_SLAB = BLOCKS.register("cracked_nether_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(NETHER_BRICKS))),
	CRACKED_NETHER_BRICK_STAIRS = BLOCKS.register("cracked_nether_brick_stairs", () ->
			new CPlusStairBlock(NETHER_BRICKS.getDefaultState(), Block.Settings.copy(NETHER_BRICKS))),
	CRACKED_NETHER_BRICK_WALL = BLOCKS.register("cracked_nether_brick_wall", () ->
			new WallBlock(Block.Settings.copy(NETHER_BRICKS))),
	CRACKED_NETHER_BRICK_FENCE_GATE = BLOCKS.register("cracked_nether_brick_fence_gate", () ->
			new FenceGateBlock(Block.Settings.copy(NETHER_BRICKS))),

	//Pillars and Chiseled
	CHISELED_NETHER_BRICKS = BLOCKS.register("chiseled_nether_bricks", () ->
			new Block(Block.Settings.copy(NETHER_BRICKS))),
	NETHER_BRICK_PILLAR = BLOCKS.register("nether_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(NETHER_BRICKS))),

	//Red Nether Bricks
	RED_NETHER_BRICK_FENCE_GATE = BLOCKS.register("red_nether_brick_fence_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_NETHER_BRICKS))),

	//Pillars and Chiseled
	CHISELED_RED_NETHER_BRICKS = BLOCKS.register("chiseled_red_nether_bricks", () ->
			new Block(Block.Settings.copy(RED_NETHER_BRICKS))),
	RED_NETHER_BRICK_PILLAR = BLOCKS.register("red_nether_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(RED_NETHER_BRICKS))),
	CARVED_RED_NETHER_BRICKS = BLOCKS.register("carved_red_nether_bricks", () ->
			new Block(Block.Settings.copy(RED_NETHER_BRICKS))),


	//Blue Nether Bricks
//Blue Nether Bricks will have a rework eventually, none of this is final
	//Bricks
	BLUE_NETHER_BRICKS = BLOCKS.register("blue_nether_bricks", () ->
			new Block(Block.Settings.copy(NETHER_BRICKS))),
	BLUE_NETHER_BRICK_SLAB = BLOCKS.register("blue_nether_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(NETHER_BRICKS))),
	BLUE_NETHER_BRICK_STAIRS = BLOCKS.register("blue_nether_brick_stairs", () ->
			new CPlusStairBlock(NETHER_BRICKS.getDefaultState(), Block.Settings.copy(NETHER_BRICKS))),
	BLUE_NETHER_BRICK_WALL = BLOCKS.register("blue_nether_brick_wall", () ->
			new WallBlock(Block.Settings.copy(NETHER_BRICKS))),
	BLUE_NETHER_BRICK_FENCE_GATE = BLOCKS.register("blue_nether_brick_fence_gate", () ->
			new FenceGateBlock(Block.Settings.copy(NETHER_BRICKS))),

	//Cracked Bricks
	CRACKED_BLUE_NETHER_BRICKS = BLOCKS.register("cracked_blue_nether_bricks", () ->
			new Block(Block.Settings.copy(CRACKED_NETHER_BRICKS))),
	CRACKED_BLUE_NETHER_BRICK_SLAB = BLOCKS.register("cracked_blue_nether_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(CRACKED_NETHER_BRICKS))),
	CRACKED_BLUE_NETHER_BRICK_STAIRS = BLOCKS.register("cracked_blue_nether_brick_stairs", () ->
			new CPlusStairBlock(CRACKED_NETHER_BRICKS.getDefaultState(), Block.Settings.copy(NETHER_BRICKS))),
	CRACKED_BLUE_NETHER_BRICK_WALL = BLOCKS.register("cracked_blue_nether_brick_wall", () ->
			new WallBlock(Block.Settings.copy(CRACKED_NETHER_BRICKS))),
	CRACKED_BLUE_NETHER_BRICK_FENCE_GATE = BLOCKS.register("cracked_blue_nether_brick_fence_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CRACKED_NETHER_BRICKS))),

	//Pillars and Chiseled
	CHISELED_BLUE_NETHER_BRICKS = BLOCKS.register("chiseled_blue_nether_bricks", () ->
			new Block(Block.Settings.copy(NETHER_BRICKS))),
	BLUE_NETHER_BRICK_PILLAR = BLOCKS.register("blue_nether_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(NETHER_BRICKS))),
	CARVED_BLUE_NETHER_BRICKS = BLOCKS.register("carved_blue_nether_bricks", () ->
			new Block(Block.Settings.copy(NETHER_BRICKS))),

	//Prismarine
	PRISMARINE_GATE = BLOCKS.register("prismarine_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PRISMARINE))),

	//Polished
	POLISHED_PRISMARINE = BLOCKS.register("polished_prismarine", () ->
			new Block(Block.Settings.copy(PRISMARINE))),
	POLISHED_PRISMARINE_SLAB = BLOCKS.register("polished_prismarine_slab", () ->
			new SlabBlock(Block.Settings.copy(PRISMARINE))),
	POLISHED_PRISMARINE_STAIRS = BLOCKS.register("polished_prismarine_stairs", () ->
			new CPlusStairBlock(PRISMARINE.getDefaultState(), Block.Settings.copy(PRISMARINE))),
	POLISHED_PRISMARINE_WALL = BLOCKS.register("polished_prismarine_wall", () ->
			new WallBlock(Block.Settings.copy(PRISMARINE))),
	POLISHED_PRISMARINE_GATE = BLOCKS.register("polished_prismarine_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PRISMARINE))),

	//Smooth
	SMOOTH_PRISMARINE = BLOCKS.register("smooth_prismarine", () ->
			new Block(Block.Settings.copy(PRISMARINE))),
	SMOOTH_PRISMARINE_SLAB = BLOCKS.register("smooth_prismarine_slab", () ->
			new SlabBlock(Block.Settings.copy(PRISMARINE))),
	SMOOTH_PRISMARINE_STAIRS = BLOCKS.register("smooth_prismarine_stairs", () ->
			new CPlusStairBlock(PRISMARINE.getDefaultState(), Block.Settings.copy(PRISMARINE))),
	SMOOTH_PRISMARINE_WALL = BLOCKS.register("smooth_prismarine_wall", () ->
			new WallBlock(Block.Settings.copy(PRISMARINE))),
	SMOOTH_PRISMARINE_GATE = BLOCKS.register("smooth_prismarine_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PRISMARINE))),

	//Cut
	CUT_PRISMARINE = BLOCKS.register("cut_prismarine", () ->
			new Block(Block.Settings.copy(PRISMARINE))),
	CUT_PRISMARINE_SLAB = BLOCKS.register("cut_prismarine_slab", () ->
			new SlabBlock(Block.Settings.copy(PRISMARINE))),
	CUT_PRISMARINE_STAIRS = BLOCKS.register("cut_prismarine_stairs", () ->
			new CPlusStairBlock(PRISMARINE.getDefaultState(), Block.Settings.copy(PRISMARINE))),
	CUT_PRISMARINE_WALL = BLOCKS.register("cut_prismarine_wall", () ->
			new WallBlock(Block.Settings.copy(PRISMARINE))),
	CUT_PRISMARINE_GATE = BLOCKS.register("cut_prismarine_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PRISMARINE))),

	//Tiles
	PRISMARINE_TILES = BLOCKS.register("prismarine_tiles", () ->
			new Block(Block.Settings.copy(PRISMARINE))),
	PRISMARINE_TILE_SLAB = BLOCKS.register("prismarine_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(PRISMARINE))),
	PRISMARINE_TILE_STAIRS = BLOCKS.register("prismarine_tile_stairs", () ->
			new CPlusStairBlock(PRISMARINE_TILES.get().getDefaultState(), Block.Settings.copy(PRISMARINE))),
	PRISMARINE_TILE_WALL = BLOCKS.register("prismarine_tile_wall", () ->
			new WallBlock(Block.Settings.copy(PRISMARINE))),
	PRISMARINE_TILE_GATE = BLOCKS.register("prismarine_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PRISMARINE))),

	//Bricks
	PRISMARINE_BRICK_WALL = BLOCKS.register("prismarine_brick_wall", () ->
			new WallBlock(Block.Settings.copy(PRISMARINE))),
	PRISMARINE_BRICK_GATE = BLOCKS.register("prismarine_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PRISMARINE))),

	//Pillar and Chiseled
	CHISELED_PRISMARINE = BLOCKS.register("chiseled_prismarine", () ->
			new Block(Block.Settings.copy(PRISMARINE_BRICKS))),
	PRISMARINE_PILLAR = BLOCKS.register("prismarine_pillar", () ->
			new PillarBlock(Block.Settings.copy(PRISMARINE_BRICKS))),
	PRISMARINE_CORNER_PILLAR = BLOCKS.register("prismarine_corner_pillar", () ->
			new Block(Block.Settings.copy(PRISMARINE_BRICKS))),
	CARVED_PRISMARINE = BLOCKS.register("carved_prismarine", () ->
			new Block(Block.Settings.copy(PRISMARINE_BRICKS))),


	//Dark Prismarine
	DARK_PRISMARINE_WALL = BLOCKS.register("dark_prismarine_wall", () ->
			new WallBlock(Block.Settings.copy(DARK_PRISMARINE))),
	DARK_PRISMARINE_GATE = BLOCKS.register("dark_prismarine_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DARK_PRISMARINE))),

	//Polished
	POLISHED_DARK_PRISMARINE = BLOCKS.register("polished_dark_prismarine", () ->
			new Block(Block.Settings.copy(DARK_PRISMARINE))),
	POLISHED_DARK_PRISMARINE_SLAB = BLOCKS.register("polished_dark_prismarine_slab", () ->
			new SlabBlock(Block.Settings.copy(DARK_PRISMARINE))),
	POLISHED_DARK_PRISMARINE_STAIRS = BLOCKS.register("polished_dark_prismarine_stairs", () ->
			new CPlusStairBlock(DARK_PRISMARINE.getDefaultState(), Block.Settings.copy(DARK_PRISMARINE))),
	POLISHED_DARK_PRISMARINE_WALL = BLOCKS.register("polished_dark_prismarine_wall", () ->
			new WallBlock(Block.Settings.copy(DARK_PRISMARINE))),
	POLISHED_DARK_PRISMARINE_GATE = BLOCKS.register("polished_dark_prismarine_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DARK_PRISMARINE))),

	//Smooth
	SMOOTH_DARK_PRISMARINE = BLOCKS.register("smooth_dark_prismarine", () ->
			new Block(Block.Settings.copy(DARK_PRISMARINE))),
	SMOOTH_DARK_PRISMARINE_SLAB = BLOCKS.register("smooth_dark_prismarine_slab", () ->
			new SlabBlock(Block.Settings.copy(DARK_PRISMARINE))),
	SMOOTH_DARK_PRISMARINE_STAIRS = BLOCKS.register("smooth_dark_prismarine_stairs", () ->
			new CPlusStairBlock(DARK_PRISMARINE.getDefaultState(), Block.Settings.copy(DARK_PRISMARINE))),
	SMOOTH_DARK_PRISMARINE_WALL = BLOCKS.register("smooth_dark_prismarine_wall", () ->
			new WallBlock(Block.Settings.copy(DARK_PRISMARINE))),
	SMOOTH_DARK_PRISMARINE_GATE = BLOCKS.register("smooth_dark_prismarine_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DARK_PRISMARINE))),

	//Cut
	CUT_DARK_PRISMARINE = BLOCKS.register("cut_dark_prismarine", () ->
			new Block(Block.Settings.copy(DARK_PRISMARINE))),
	CUT_DARK_PRISMARINE_SLAB = BLOCKS.register("cut_dark_prismarine_slab", () ->
			new SlabBlock(Block.Settings.copy(DARK_PRISMARINE))),
	CUT_DARK_PRISMARINE_STAIRS = BLOCKS.register("cut_dark_prismarine_stairs", () ->
			new CPlusStairBlock(DARK_PRISMARINE.getDefaultState(), Block.Settings.copy(DARK_PRISMARINE))),
	CUT_DARK_PRISMARINE_WALL = BLOCKS.register("cut_dark_prismarine_wall", () ->
			new WallBlock(Block.Settings.copy(DARK_PRISMARINE))),
	CUT_DARK_PRISMARINE_GATE = BLOCKS.register("cut_dark_prismarine_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DARK_PRISMARINE))),

	//Tiles
	DARK_PRISMARINE_TILES = BLOCKS.register("dark_prismarine_tiles", () ->
			new Block(Block.Settings.copy(DARK_PRISMARINE))),
	DARK_PRISMARINE_TILE_SLAB = BLOCKS.register("dark_prismarine_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(DARK_PRISMARINE))),
	DARK_PRISMARINE_TILE_STAIRS = BLOCKS.register("dark_prismarine_tile_stairs", () ->
			new CPlusStairBlock(DARK_PRISMARINE.getDefaultState(), Block.Settings.copy(DARK_PRISMARINE))),
	DARK_PRISMARINE_TILE_WALL = BLOCKS.register("dark_prismarine_tile_wall", () ->
			new WallBlock(Block.Settings.copy(DARK_PRISMARINE))),
	DARK_PRISMARINE_TILE_GATE = BLOCKS.register("dark_prismarine_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DARK_PRISMARINE))),

	//Bricks
	DARK_PRISMARINE_BRICKS = BLOCKS.register("dark_prismarine_bricks", () ->
			new Block(Block.Settings.copy(DARK_PRISMARINE))),
	DARK_PRISMARINE_BRICK_SLAB = BLOCKS.register("dark_prismarine_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(DARK_PRISMARINE))),
	DARK_PRISMARINE_BRICK_STAIRS = BLOCKS.register("dark_prismarine_brick_stairs", () ->
			new CPlusStairBlock(DARK_PRISMARINE.getDefaultState(), Block.Settings.copy(DARK_PRISMARINE))),
	DARK_PRISMARINE_BRICK_WALL = BLOCKS.register("dark_prismarine_brick_wall", () ->
			new WallBlock(Block.Settings.copy(DARK_PRISMARINE))),
	DARK_PRISMARINE_BRICK_GATE = BLOCKS.register("dark_prismarine_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DARK_PRISMARINE))),

	//Pillar and Chiseled
	CHISELED_DARK_PRISMARINE = BLOCKS.register("chiseled_dark_prismarine", () ->
			new Block(Block.Settings.copy(DARK_PRISMARINE))),
	DARK_PRISMARINE_PILLAR = BLOCKS.register("dark_prismarine_pillar", () ->
			new PillarBlock(Block.Settings.copy(DARK_PRISMARINE))),
	DARK_PRISMARINE_CORNER_PILLAR = BLOCKS.register("dark_prismarine_corner_pillar", () ->
			new Block(Block.Settings.copy(DARK_PRISMARINE))),
	CARVED_DARK_PRISMARINE = BLOCKS.register("carved_dark_prismarine", () ->
			new Block(Block.Settings.copy(DARK_PRISMARINE))),


//Purpur

	PURPUR_BLOCK = BLOCKS.register("purpur_block", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR))),
	PURPUR_SLAB = BLOCKS.register("purpur_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPUR_PILLAR))),
	PURPUR_STAIRS = BLOCKS.register("purpur_stairs", () ->
			new CPlusStairBlock(PURPUR_PILLAR.getDefaultState(), Block.Settings.copy(PURPUR_PILLAR))),
	PURPUR_WALL = BLOCKS.register("purpur_wall", () ->
			new WallBlock(Block.Settings.copy(PURPUR_PILLAR))),
	PURPUR_GATE = BLOCKS.register("purpur_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPUR_PILLAR))),

	//Smooth
	SMOOTH_PURPUR = BLOCKS.register("smooth_purpur", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR))),
	SMOOTH_PURPUR_SLAB = BLOCKS.register("smooth_purpur_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPUR_PILLAR))),
	SMOOTH_PURPUR_STAIRS = BLOCKS.register("smooth_purpur_stairs", () ->
			new CPlusStairBlock(PURPUR_PILLAR.getDefaultState(), Block.Settings.copy(PURPUR_PILLAR))),
	SMOOTH_PURPUR_WALL = BLOCKS.register("smooth_purpur_wall", () ->
			new WallBlock(Block.Settings.copy(PURPUR_PILLAR))),
	SMOOTH_PURPUR_GATE = BLOCKS.register("smooth_purpur_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPUR_PILLAR))),

	//Polished
	POLISHED_PURPUR = BLOCKS.register("polished_purpur", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR))),
	POLISHED_PURPUR_GATE = BLOCKS.register("polished_purpur_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPUR_PILLAR))),
	POLISHED_PURPUR_SLAB = BLOCKS.register("polished_purpur_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPUR_PILLAR))),
	POLISHED_PURPUR_STAIRS = BLOCKS.register("polished_purpur_stairs", () ->
			new CPlusStairBlock(PURPUR_PILLAR.getDefaultState(), Block.Settings.copy(PURPUR_PILLAR))),
	POLISHED_PURPUR_WALL = BLOCKS.register("polished_purpur_wall", () ->
			new WallBlock(Block.Settings.copy(PURPUR_PILLAR))),
	//Cut
	CUT_PURPUR = BLOCKS.register("cut_purpur", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR))),
	CUT_PURPUR_STAIRS = BLOCKS.register("cut_purpur_stairs", () ->
			new CPlusStairBlock(PURPUR_PILLAR.getDefaultState(), Block.Settings.copy(PURPUR_PILLAR))),
	CUT_PURPUR_SLAB = BLOCKS.register("cut_purpur_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPUR_PILLAR))),
	CUT_PURPUR_WALL = BLOCKS.register("cut_purpur_wall", () ->
			new WallBlock(Block.Settings.copy(PURPUR_PILLAR))),
	CUT_PURPUR_GATE = BLOCKS.register("cut_purpur_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPUR_PILLAR))),

	PURPUR_TILE_WALL = BLOCKS.register("purpur_tile_wall", () ->
			new WallBlock(Block.Settings.copy(Blocks.PURPUR_BLOCK))),
	PURPUR_TILE_GATE = BLOCKS.register("purpur_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(Blocks.PURPUR_BLOCK))),

	//Bricks
	PURPUR_BRICKS = BLOCKS.register("purpur_bricks", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR))),
	PURPUR_BRICK_SLAB = BLOCKS.register("purpur_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPUR_PILLAR))),
	PURPUR_BRICK_STAIRS = BLOCKS.register("purpur_brick_stairs", () ->
			new CPlusStairBlock(PURPUR_PILLAR.getDefaultState(), Block.Settings.copy(PURPUR_PILLAR))),
	PURPUR_BRICK_WALL = BLOCKS.register("purpur_brick_wall", () ->
			new WallBlock(Block.Settings.copy(PURPUR_PILLAR))),
	PURPUR_BRICK_GATE = BLOCKS.register("purpur_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPUR_PILLAR))),

	//Cracked Bricks
	CRACKED_PURPUR_BRICKS = BLOCKS.register("cracked_purpur_bricks", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR))),
	CRACKED_PURPUR_BRICK_SLAB = BLOCKS.register("cracked_purpur_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPUR_PILLAR))),
	CRACKED_PURPUR_BRICK_STAIRS = BLOCKS.register("cracked_purpur_brick_stairs", () ->
			new CPlusStairBlock(PURPUR_PILLAR.getDefaultState(), Block.Settings.copy(PURPUR_PILLAR))),
	CRACKED_PURPUR_BRICK_WALL = BLOCKS.register("cracked_purpur_brick_wall", () ->
			new WallBlock(Block.Settings.copy(PURPUR_PILLAR))),
	CRACKED_PURPUR_BRICK_GATE = BLOCKS.register("cracked_purpur_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPUR_PILLAR))),

	//Pillars and Chiseled
	CHISELED_PURPUR = BLOCKS.register("chiseled_purpur", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR))),
	CARVED_PURPUR = BLOCKS.register("carved_purpur", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR))),


	//End Stone
	END_STONE_BRICK_GATE = BLOCKS.register("end_stone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(END_STONE_BRICKS))),

	COBBLED_END_STONE = BLOCKS.register("cobbled_end_stone", () ->
			new Block(Block.Settings.copy(END_STONE))),
	COBBLED_END_STONE_SLAB = BLOCKS.register("cobbled_end_stone_slab", () ->
			new SlabBlock(Block.Settings.copy(END_STONE))),
	COBBLED_END_STONE_STAIRS = BLOCKS.register("cobbled_end_stone_stairs", () ->
			new CPlusStairBlock(END_STONE.getDefaultState(), Block.Settings.copy(END_STONE))),
	COBBLED_END_STONE_WALL = BLOCKS.register("cobbled_end_stone_wall", () ->
			new WallBlock(Block.Settings.copy(END_STONE))),
	COBBLED_END_STONE_GATE = BLOCKS.register("cobbled_end_stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(END_STONE))),

	//Block
	END_STONE_SLAB = BLOCKS.register("end_stone_slab", () ->
			new SlabBlock(Block.Settings.copy(END_STONE))),
	END_STONE_STAIRS = BLOCKS.register("end_stone_stairs", () ->
			new CPlusStairBlock(END_STONE.getDefaultState(), Block.Settings.copy(END_STONE))),
	END_STONE_WALL = BLOCKS.register("end_stone_wall", () ->
			new WallBlock(Block.Settings.copy(END_STONE))),
	END_STONE_GATE = BLOCKS.register("end_stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(END_STONE))),

	//Smooth
	SMOOTH_END_STONE = BLOCKS.register("smooth_end_stone", () ->
			new Block(Block.Settings.copy(END_STONE))),
	SMOOTH_END_STONE_SLAB = BLOCKS.register("smooth_end_stone_slab", () ->
			new SlabBlock(Block.Settings.copy(END_STONE))),
	SMOOTH_END_STONE_STAIRS = BLOCKS.register("smooth_end_stone_stairs", () ->
			new CPlusStairBlock(END_STONE.getDefaultState(), Block.Settings.copy(END_STONE))),
	SMOOTH_END_STONE_WALL = BLOCKS.register("smooth_end_stone_wall", () ->
			new WallBlock(Block.Settings.copy(END_STONE))),
	SMOOTH_END_STONE_GATE = BLOCKS.register("smooth_end_stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(END_STONE))),

	//Polished
	POLISHED_END_STONE = BLOCKS.register("polished_end_stone", () ->
			new Block(Block.Settings.copy(END_STONE))),
	POLISHED_END_STONE_SLAB = BLOCKS.register("polished_end_stone_slab", () ->
			new SlabBlock(Block.Settings.copy(END_STONE))),
	POLISHED_END_STONE_STAIRS = BLOCKS.register("polished_end_stone_stairs", () ->
			new CPlusStairBlock(END_STONE.getDefaultState(), Block.Settings.copy(END_STONE))),
	POLISHED_END_STONE_WALL = BLOCKS.register("polished_end_stone_wall", () ->
			new WallBlock(Block.Settings.copy(END_STONE))),
	POLISHED_END_STONE_GATE = BLOCKS.register("polished_end_stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(END_STONE))),

	//Cut
	CUT_END_STONE = BLOCKS.register("cut_end_stone", () ->
			new Block(Block.Settings.copy(END_STONE))),
	CUT_END_STONE_SLAB = BLOCKS.register("cut_end_stone_slab", () ->
			new SlabBlock(Block.Settings.copy(END_STONE))),
	CUT_END_STONE_STAIRS = BLOCKS.register("cut_end_stone_stairs", () ->
			new CPlusStairBlock(END_STONE.getDefaultState(), Block.Settings.copy(END_STONE))),
	CUT_END_STONE_WALL = BLOCKS.register("cut_end_stone_wall", () ->
			new WallBlock(Block.Settings.copy(END_STONE))),
	CUT_END_STONE_GATE = BLOCKS.register("cut_end_stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(END_STONE))),

	//Tiles
	END_STONE_TILES = BLOCKS.register("end_stone_tiles", () ->
			new Block(Block.Settings.copy(END_STONE))),
	END_STONE_TILE_SLAB = BLOCKS.register("end_stone_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(END_STONE))),
	END_STONE_TILE_STAIRS = BLOCKS.register("end_stone_tile_stairs", () ->
			new CPlusStairBlock(END_STONE.getDefaultState(), Block.Settings.copy(END_STONE))),
	END_STONE_TILE_WALL = BLOCKS.register("end_stone_tile_wall", () ->
			new WallBlock(Block.Settings.copy(END_STONE))),
	END_STONE_TILE_GATE = BLOCKS.register("end_stone_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(END_STONE))),

	//Pillars and Chiseled
	CHISELED_END_STONE = BLOCKS.register("chiseled_end_stone", () ->
			new Block(Block.Settings.copy(END_STONE))),
	END_STONE_PILLAR = BLOCKS.register("end_stone_pillar", () ->
			new PillarBlock(Block.Settings.copy(END_STONE_BRICKS))),
	END_STONE_CORNER_PILLAR = BLOCKS.register("end_stone_corner_pillar", () ->
			new Block(Block.Settings.copy(END_STONE_BRICKS))),
	CARVED_END_STONE = BLOCKS.register("carved_end_stone", () ->
			new Block(Block.Settings.copy(END_STONE))),


	//Soul Sandstone
	SOUL_SANDSTONE = BLOCKS.register("soul_sandstone", () ->
			new Block(Block.Settings.of(Material.STONE).strength(0.8F))),
	SOUL_SANDSTONE_SLAB = BLOCKS.register("soul_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	SOUL_SANDSTONE_STAIRS = BLOCKS.register("soul_sandstone_stairs", () ->
			new CPlusStairBlock(SANDSTONE.getDefaultState(), Block.Settings.copy(SOUL_SANDSTONE.get()))),
	SOUL_SANDSTONE_WALL = BLOCKS.register("soul_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	SOUL_SANDSTONE_GATE = BLOCKS.register("soul_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),

	COBBLED_SOUL_SANDSTONE = BLOCKS.register("cobbled_soul_sandstone", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	COBBLED_SOUL_SANDSTONE_SLAB = BLOCKS.register("cobbled_soul_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	COBBLED_SOUL_SANDSTONE_STAIRS = BLOCKS.register("cobbled_soul_sandstone_stairs", () ->
			new CPlusStairBlock(SANDSTONE.getDefaultState(), Block.Settings.copy(SOUL_SANDSTONE.get()))),
	COBBLED_SOUL_SANDSTONE_WALL = BLOCKS.register("cobbled_soul_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	COBBLED_SOUL_SANDSTONE_GATE = BLOCKS.register("cobbled_soul_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),

	// Smooth
	SMOOTH_SOUL_SANDSTONE = BLOCKS.register("smooth_soul_sandstone", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	SMOOTH_SOUL_SANDSTONE_SLAB = BLOCKS.register("smooth_soul_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	SMOOTH_SOUL_SANDSTONE_STAIRS = BLOCKS.register("smooth_soul_sandstone_stairs", () ->
			new CPlusStairBlock(SMOOTH_SANDSTONE.getDefaultState(), Block.Settings.copy(SOUL_SANDSTONE.get()))),
	SMOOTH_SOUL_SANDSTONE_WALL = BLOCKS.register("smooth_soul_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	SMOOTH_SOUL_SANDSTONE_GATE = BLOCKS.register("smooth_soul_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),

	// Polished
	POLISHED_SOUL_SANDSTONE = BLOCKS.register("polished_soul_sandstone", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	POLISHED_SOUL_SANDSTONE_SLAB = BLOCKS.register("polished_soul_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	POLISHED_SOUL_SANDSTONE_STAIRS = BLOCKS.register("polished_soul_sandstone_stairs", () ->
			new CPlusStairBlock(SANDSTONE.getDefaultState(), Block.Settings.copy(SOUL_SANDSTONE.get()))),
	POLISHED_SOUL_SANDSTONE_WALL = BLOCKS.register("polished_soul_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	POLISHED_SOUL_SANDSTONE_GATE = BLOCKS.register("polished_soul_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),

	// Bricks
	SOUL_SANDSTONE_BRICKS = BLOCKS.register("soul_sandstone_bricks", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	SOUL_SANDSTONE_BRICK_SLAB = BLOCKS.register("soul_sandstone_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	SOUL_SANDSTONE_BRICK_STAIRS = BLOCKS.register("soul_sandstone_brick_stairs", () ->
			new CPlusStairBlock(SANDSTONE.getDefaultState(), Block.Settings.copy(SOUL_SANDSTONE.get()))),
	SOUL_SANDSTONE_BRICK_WALL = BLOCKS.register("soul_sandstone_brick_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	SOUL_SANDSTONE_BRICK_GATE = BLOCKS.register("soul_sandstone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),

	// Cut
	CUT_SOUL_SANDSTONE = BLOCKS.register("cut_soul_sandstone", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	CUT_SOUL_SANDSTONE_SLAB = BLOCKS.register("cut_soul_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	CUT_SOUL_SANDSTONE_STAIRS = BLOCKS.register("cut_soul_sandstone_stairs", () ->
			new CPlusStairBlock(CUT_SANDSTONE.getDefaultState(), Block.Settings.copy(SOUL_SANDSTONE.get()))),
	CUT_SOUL_SANDSTONE_WALL = BLOCKS.register("cut_soul_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	CUT_SOUL_SANDSTONE_GATE = BLOCKS.register("cut_soul_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),

	//Tiles
	SOUL_SANDSTONE_TILES = BLOCKS.register("soul_sandstone_tiles", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	SOUL_SANDSTONE_TILE_STAIRS = BLOCKS.register("soul_sandstone_tile_stairs", () ->
			new CPlusStairBlock(SOUL_SANDSTONE_TILES.get().getDefaultState(), Block.Settings.copy(SOUL_SANDSTONE.get()))),
	SOUL_SANDSTONE_TILE_SLAB = BLOCKS.register("soul_sandstone_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	SOUL_SANDSTONE_TILE_WALL = BLOCKS.register("soul_sandstone_tile_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	SOUL_SANDSTONE_TILE_GATE = BLOCKS.register("soul_sandstone_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),

	CARVED_SOUL_SANDSTONE = BLOCKS.register("carved_soul_sandstone", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	CHISELED_SOUL_SANDSTONE = BLOCKS.register("chiseled_soul_sandstone", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	SOUL_SANDSTONE_PILLAR = BLOCKS.register("soul_sandstone_pillar", () ->
			new PillarBlock(Block.Settings.copy(SOUL_SANDSTONE.get()))),
	SOUL_SANDSTONE_CORNER_PILLAR = BLOCKS.register("soul_sandstone_corner_pillar", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get()))),

	//Obsidian
	OBSIDIAN_SLAB = BLOCKS.register("obsidian_slab", () ->
			new SlabBlock(Block.Settings.copy(OBSIDIAN).nonOpaque())),
	OBSIDIAN_STAIRS = BLOCKS.register("obsidian_stairs", () ->
			new CPlusStairBlock(OBSIDIAN.getDefaultState(), Block.Settings.copy(OBSIDIAN).nonOpaque())),
	OBSIDIAN_WALL = BLOCKS.register("obsidian_wall", () ->
			new WallBlock(Block.Settings.copy(OBSIDIAN))),
	OBSIDIAN_GATE = BLOCKS.register("obsidian_gate", () ->
			new FenceGateBlock(Block.Settings.copy(OBSIDIAN))),

	CRYING_OBSIDIAN_SLAB = BLOCKS.register("crying_obsidian_slab", () ->
			new SlabBlock(Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque())),
	CRYING_OBSIDIAN_STAIRS = BLOCKS.register("crying_obsidian_stairs", () ->
			new CPlusStairBlock(CRYING_OBSIDIAN.getDefaultState(), Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque())),
	CRYING_OBSIDIAN_WALL = BLOCKS.register("crying_obsidian_wall", () ->
			new WallBlock(Block.Settings.copy(CRYING_OBSIDIAN))),
	CRYING_OBSIDIAN_GATE = BLOCKS.register("crying_obsidian_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CRYING_OBSIDIAN))),

	SMOOTH_OBSIDIAN = BLOCKS.register("smooth_obsidian", () ->
			new Block(Block.Settings.copy(OBSIDIAN))),
	SMOOTH_OBSIDIAN_SLAB = BLOCKS.register("smooth_obsidian_slab", () ->
			new SlabBlock(Block.Settings.copy(OBSIDIAN).nonOpaque())),
	SMOOTH_OBSIDIAN_STAIRS = BLOCKS.register("smooth_obsidian_stairs", () ->
			new CPlusStairBlock(OBSIDIAN.getDefaultState(), Block.Settings.copy(OBSIDIAN).nonOpaque())),
	SMOOTH_OBSIDIAN_WALL = BLOCKS.register("smooth_obsidian_wall", () ->
			new WallBlock(Block.Settings.copy(OBSIDIAN))),
	SMOOTH_OBSIDIAN_GATE = BLOCKS.register("smooth_obsidian_gate", () ->
			new FenceGateBlock(Block.Settings.copy(OBSIDIAN))),

	SMOOTH_CRYING_OBSIDIAN = BLOCKS.register("smooth_crying_obsidian", () ->
			new CryingObsidianBlock(Block.Settings.copy(CRYING_OBSIDIAN))),
	SMOOTH_CRYING_OBSIDIAN_SLAB = BLOCKS.register("smooth_crying_obsidian_slab", () ->
			new SlabBlock(Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque())),
	SMOOTH_CRYING_OBSIDIAN_STAIRS = BLOCKS.register("smooth_crying_obsidian_stairs", () ->
			new CPlusStairBlock(CRYING_OBSIDIAN.getDefaultState(), Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque())),
	SMOOTH_CRYING_OBSIDIAN_WALL = BLOCKS.register("smooth_crying_obsidian_wall", () ->
			new WallBlock(Block.Settings.copy(CRYING_OBSIDIAN))),
	SMOOTH_CRYING_OBSIDIAN_GATE = BLOCKS.register("smooth_crying_obsidian_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CRYING_OBSIDIAN))),

	POLISHED_OBSIDIAN = BLOCKS.register("polished_obsidian", () ->
			new Block(Block.Settings.copy(OBSIDIAN))),
	POLISHED_OBSIDIAN_SLAB = BLOCKS.register("polished_obsidian_slab", () ->
			new SlabBlock(Block.Settings.copy(OBSIDIAN).nonOpaque())),
	POLISHED_OBSIDIAN_STAIRS = BLOCKS.register("polished_obsidian_stairs", () ->
			new CPlusStairBlock(OBSIDIAN.getDefaultState(), Block.Settings.copy(OBSIDIAN).nonOpaque())),
	POLISHED_OBSIDIAN_WALL = BLOCKS.register("polished_obsidian_wall", () ->
			new WallBlock(Block.Settings.copy(OBSIDIAN))),
	POLISHED_OBSIDIAN_GATE = BLOCKS.register("polished_obsidian_gate", () ->
			new FenceGateBlock(Block.Settings.copy(OBSIDIAN))),

	POLISHED_CRYING_OBSIDIAN = BLOCKS.register("polished_crying_obsidian", () ->
			new CryingObsidianBlock(Block.Settings.copy(CRYING_OBSIDIAN))),
	POLISHED_CRYING_OBSIDIAN_SLAB = BLOCKS.register("polished_crying_obsidian_slab", () ->
			new SlabBlock(Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque())),
	POLISHED_CRYING_OBSIDIAN_STAIRS = BLOCKS.register("polished_crying_obsidian_stairs", () ->
			new CPlusStairBlock(CRYING_OBSIDIAN.getDefaultState(), Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque())),
	POLISHED_CRYING_OBSIDIAN_WALL = BLOCKS.register("polished_crying_obsidian_wall", () ->
			new WallBlock(Block.Settings.copy(CRYING_OBSIDIAN))),
	POLISHED_CRYING_OBSIDIAN_GATE = BLOCKS.register("polished_crying_obsidian_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CRYING_OBSIDIAN))),

	OBSIDIAN_BRICKS = BLOCKS.register("obsidian_bricks", () ->
			new Block(Block.Settings.copy(OBSIDIAN))),
	OBSIDIAN_BRICK_SLAB = BLOCKS.register("obsidian_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(OBSIDIAN).nonOpaque())),
	OBSIDIAN_BRICK_STAIRS = BLOCKS.register("obsidian_brick_stairs", () ->
			new CPlusStairBlock(OBSIDIAN.getDefaultState(), Block.Settings.copy(OBSIDIAN).nonOpaque())),
	OBSIDIAN_BRICK_WALL = BLOCKS.register("obsidian_brick_wall", () ->
			new WallBlock(Block.Settings.copy(OBSIDIAN))),
	OBSIDIAN_BRICK_GATE = BLOCKS.register("obsidian_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(OBSIDIAN))),

	CRYING_OBSIDIAN_BRICKS = BLOCKS.register("crying_obsidian_bricks", () ->
			new CryingObsidianBlock(Block.Settings.copy(CRYING_OBSIDIAN))),
	CRYING_OBSIDIAN_BRICK_SLAB = BLOCKS.register("crying_obsidian_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque())),
	CRYING_OBSIDIAN_BRICK_STAIRS = BLOCKS.register("crying_obsidian_brick_stairs", () ->
			new CPlusStairBlock(CRYING_OBSIDIAN.getDefaultState(), Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque())),
	CRYING_OBSIDIAN_BRICK_WALL = BLOCKS.register("crying_obsidian_brick_wall", () ->
			new WallBlock(Block.Settings.copy(CRYING_OBSIDIAN))),
	CRYING_OBSIDIAN_BRICK_GATE = BLOCKS.register("crying_obsidian_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CRYING_OBSIDIAN))),

	CUT_OBSIDIAN = BLOCKS.register("cut_obsidian", () ->
			new Block(Block.Settings.copy(OBSIDIAN))),
	CUT_OBSIDIAN_SLAB = BLOCKS.register("cut_obsidian_slab", () ->
			new SlabBlock(Block.Settings.copy(OBSIDIAN).nonOpaque())),
	CUT_OBSIDIAN_STAIRS = BLOCKS.register("cut_obsidian_stairs", () ->
			new CPlusStairBlock(OBSIDIAN.getDefaultState(), Block.Settings.copy(OBSIDIAN).nonOpaque())),
	CUT_OBSIDIAN_WALL = BLOCKS.register("cut_obsidian_wall", () ->
			new WallBlock(Block.Settings.copy(OBSIDIAN))),
	CUT_OBSIDIAN_GATE = BLOCKS.register("cut_obsidian_gate", () ->
			new FenceGateBlock(Block.Settings.copy(OBSIDIAN))),

	CUT_CRYING_OBSIDIAN = BLOCKS.register("cut_crying_obsidian", () ->
			new CryingObsidianBlock(Block.Settings.copy(CRYING_OBSIDIAN))),
	CUT_CRYING_OBSIDIAN_SLAB = BLOCKS.register("cut_crying_obsidian_slab", () ->
			new SlabBlock(Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque())),
	CUT_CRYING_OBSIDIAN_STAIRS = BLOCKS.register("cut_crying_obsidian_stairs", () ->
			new CPlusStairBlock(CRYING_OBSIDIAN.getDefaultState(), Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque())),
	CUT_CRYING_OBSIDIAN_WALL = BLOCKS.register("cut_crying_obsidian_wall", () ->
			new WallBlock(Block.Settings.copy(CRYING_OBSIDIAN))),
	CUT_CRYING_OBSIDIAN_GATE = BLOCKS.register("cut_crying_obsidian_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CRYING_OBSIDIAN))),

	OBSIDIAN_TILES = BLOCKS.register("obsidian_tiles", () ->
			new Block(Block.Settings.copy(OBSIDIAN))),
	OBSIDIAN_TILE_SLAB = BLOCKS.register("obsidian_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(OBSIDIAN).nonOpaque())),
	OBSIDIAN_TILE_STAIRS = BLOCKS.register("obsidian_tile_stairs", () ->
			new CPlusStairBlock(OBSIDIAN_TILES.get().getDefaultState(), Block.Settings.copy(OBSIDIAN).nonOpaque())),
	OBSIDIAN_TILE_WALL = BLOCKS.register("obsidian_tile_wall", () ->
			new WallBlock(Block.Settings.copy(OBSIDIAN))),
	OBSIDIAN_TILE_GATE = BLOCKS.register("obsidian_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(OBSIDIAN))),

	CRYING_OBSIDIAN_TILES = BLOCKS.register("crying_obsidian_tiles", () ->
			new CryingObsidianBlock(Block.Settings.copy(CRYING_OBSIDIAN))),
	CRYING_OBSIDIAN_TILE_SLAB = BLOCKS.register("crying_obsidian_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque())),
	CRYING_OBSIDIAN_TILE_STAIRS = BLOCKS.register("crying_obsidian_tile_stairs", () ->
			new CPlusStairBlock(CRYING_OBSIDIAN_TILES.get().getDefaultState(), Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque())),
	CRYING_OBSIDIAN_TILE_WALL = BLOCKS.register("crying_obsidian_tile_wall", () ->
			new WallBlock(Block.Settings.copy(CRYING_OBSIDIAN))),
	CRYING_OBSIDIAN_TILE_GATE = BLOCKS.register("crying_obsidian_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CRYING_OBSIDIAN))),

	OBSIDIAN_PILLAR = BLOCKS.register("obsidian_pillar", () ->
			new PillarBlock(Block.Settings.copy(OBSIDIAN))),
	OBSIDIAN_CORNER_PILLAR = BLOCKS.register("obsidian_corner_pillar", () ->
			new Block(Block.Settings.copy(OBSIDIAN))),
	CHISELED_OBSIDIAN = BLOCKS.register("chiseled_obsidian", () ->
			new Block(Block.Settings.copy(OBSIDIAN))),
	CARVED_OBSIDIAN = BLOCKS.register("carved_obsidian", () ->
			new Block(Block.Settings.copy(OBSIDIAN))),

	CRYING_OBSIDIAN_PILLAR = BLOCKS.register("crying_obsidian_pillar", () ->
			new PillarBlock(Block.Settings.copy(CRYING_OBSIDIAN))),
	CRYING_OBSIDIAN_CORNER_PILLAR = BLOCKS.register("crying_obsidian_corner_pillar", () ->
			new Block(Block.Settings.copy(CRYING_OBSIDIAN))),
	CHISELED_CRYING_OBSIDIAN = BLOCKS.register("chiseled_crying_obsidian", () ->
			new Block(Block.Settings.copy(CRYING_OBSIDIAN))),
	CARVED_CRYING_OBSIDIAN = BLOCKS.register("carved_crying_obsidian", () ->
			new Block(Block.Settings.copy(CRYING_OBSIDIAN))),

//Calcite

	CALCITE_SLAB = BLOCKS.register("calcite_slab", () ->
			new SlabBlock(Block.Settings.copy(CALCITE))),
	CALCITE_STAIRS = BLOCKS.register("calcite_stairs", () ->
			new CPlusStairBlock(CALCITE.getDefaultState(), Block.Settings.copy(CALCITE))),
	CALCITE_WALL = BLOCKS.register("calcite_wall", () ->
			new WallBlock(Block.Settings.copy(CALCITE))),
	CALCITE_GATE = BLOCKS.register("calcite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CALCITE))),

	COBBLED_CALCITE = BLOCKS.register("cobbled_calcite", () ->
			new Block(Block.Settings.copy(CALCITE))),
	COBBLED_CALCITE_SLAB = BLOCKS.register("cobbled_calcite_slab", () ->
			new SlabBlock(Block.Settings.copy(CALCITE))),
	COBBLED_CALCITE_STAIRS = BLOCKS.register("cobbled_calcite_stairs", () ->
			new CPlusStairBlock(CALCITE.getDefaultState(), Block.Settings.copy(CALCITE))),
	COBBLED_CALCITE_WALL = BLOCKS.register("cobbled_calcite_wall", () ->
			new WallBlock(Block.Settings.copy(CALCITE))),
	COBBLED_CALCITE_GATE = BLOCKS.register("cobbled_calcite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CALCITE))),

	//Smooth
	SMOOTH_CALCITE = BLOCKS.register("smooth_calcite", () ->
			new Block(Block.Settings.copy(CALCITE))),
	SMOOTH_CALCITE_SLAB = BLOCKS.register("smooth_calcite_slab", () ->
			new SlabBlock(Block.Settings.copy(CALCITE))),
	SMOOTH_CALCITE_STAIRS = BLOCKS.register("smooth_calcite_stairs", () ->
			new CPlusStairBlock(CALCITE.getDefaultState(), Block.Settings.copy(CALCITE))),
	SMOOTH_CALCITE_WALL = BLOCKS.register("smooth_calcite_wall", () ->
			new WallBlock(Block.Settings.copy(CALCITE))),
	SMOOTH_CALCITE_GATE = BLOCKS.register("smooth_calcite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CALCITE))),

	//Polished
	POLISHED_CALCITE = BLOCKS.register("polished_calcite", () ->
			new Block(Block.Settings.copy(CALCITE))),
	POLISHED_CALCITE_SLAB = BLOCKS.register("polished_calcite_slab", () ->
			new SlabBlock(Block.Settings.copy(CALCITE))),
	POLISHED_CALCITE_STAIRS = BLOCKS.register("polished_calcite_stairs", () ->
			new CPlusStairBlock(CALCITE.getDefaultState(), Block.Settings.copy(CALCITE))),
	POLISHED_CALCITE_WALL = BLOCKS.register("polished_calcite_wall", () ->
			new WallBlock(Block.Settings.copy(CALCITE))),
	POLISHED_CALCITE_GATE = BLOCKS.register("polished_calcite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CALCITE))),

	//Cut
	CUT_CALCITE = BLOCKS.register("cut_calcite", () ->
			new Block(Block.Settings.copy(CALCITE))),
	CUT_CALCITE_SLAB = BLOCKS.register("cut_calcite_slab", () ->
			new SlabBlock(Block.Settings.copy(CALCITE))),
	CUT_CALCITE_STAIRS = BLOCKS.register("cut_calcite_stairs", () ->
			new CPlusStairBlock(CALCITE.getDefaultState(), Block.Settings.copy(CALCITE))),
	CUT_CALCITE_WALL = BLOCKS.register("cut_calcite_wall", () ->
			new WallBlock(Block.Settings.copy(CALCITE))),
	CUT_CALCITE_GATE = BLOCKS.register("cut_calcite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CALCITE))),

	CALCITE_TILES = BLOCKS.register("calcite_tiles", () ->
			new Block(Block.Settings.copy(CALCITE))),
	CALCITE_TILE_SLAB = BLOCKS.register("calcite_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(CALCITE))),
	CALCITE_TILE_STAIRS = BLOCKS.register("calcite_tile_stairs", () ->
			new CPlusStairBlock(CALCITE.getDefaultState(), Block.Settings.copy(CALCITE))),
	CALCITE_TILE_WALL = BLOCKS.register("calcite_tile_wall", () ->
			new WallBlock(Block.Settings.copy(CALCITE))),
	CALCITE_TILE_GATE = BLOCKS.register("calcite_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CALCITE))),

	//Bricks
	CALCITE_BRICKS = BLOCKS.register("calcite_bricks", () ->
			new Block(Block.Settings.copy(CALCITE))),
	CALCITE_BRICK_SLAB = BLOCKS.register("calcite_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(CALCITE))),
	CALCITE_BRICK_STAIRS = BLOCKS.register("calcite_brick_stairs", () ->
			new CPlusStairBlock(CALCITE.getDefaultState(), Block.Settings.copy(CALCITE))),
	CALCITE_BRICK_WALL = BLOCKS.register("calcite_brick_wall", () ->
			new WallBlock(Block.Settings.copy(CALCITE))),
	CALCITE_BRICK_GATE = BLOCKS.register("calcite_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CALCITE))),

	//Pillars and Chiseled
	CALCITE_PILLAR = BLOCKS.register("calcite_pillar", () ->
			new PillarBlock(Block.Settings.copy(CALCITE))),
	CALCITE_CORNER_PILLAR = BLOCKS.register("calcite_corner_pillar", () ->
			new Block(Block.Settings.copy(CALCITE))),
	CHISELED_CALCITE = BLOCKS.register("chiseled_calcite", () ->
			new Block(Block.Settings.copy(CALCITE))),
	CARVED_CALCITE = BLOCKS.register("carved_calcite", () ->
			new Block(Block.Settings.copy(CALCITE))),

//Dripstone

	DRIPSTONE_SLAB = BLOCKS.register("dripstone_slab", () ->
			new SlabBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),
	DRIPSTONE_STAIRS = BLOCKS.register("dripstone_stairs", () ->
			new CPlusStairBlock(DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(DRIPSTONE_BLOCK))),
	DRIPSTONE_WALL = BLOCKS.register("dripstone_wall", () ->
			new WallBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),
	DRIPSTONE_GATE = BLOCKS.register("dripstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),

	COBBLED_DRIPSTONE = BLOCKS.register("cobbled_dripstone", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK))),
	COBBLED_DRIPSTONE_SLAB = BLOCKS.register("cobbled_dripstone_slab", () ->
			new SlabBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),
	COBBLED_DRIPSTONE_STAIRS = BLOCKS.register("cobbled_dripstone_stairs", () ->
			new CPlusStairBlock(DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(DRIPSTONE_BLOCK))),
	COBBLED_DRIPSTONE_WALL = BLOCKS.register("cobbled_dripstone_wall", () ->
			new WallBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),
	COBBLED_DRIPSTONE_GATE = BLOCKS.register("cobbled_dripstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),

	//Smooth
	SMOOTH_DRIPSTONE = BLOCKS.register("smooth_dripstone", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK))),
	SMOOTH_DRIPSTONE_SLAB = BLOCKS.register("smooth_dripstone_slab", () ->
			new SlabBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),
	SMOOTH_DRIPSTONE_STAIRS = BLOCKS.register("smooth_dripstone_stairs", () ->
			new CPlusStairBlock(DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(DRIPSTONE_BLOCK))),
	SMOOTH_DRIPSTONE_WALL = BLOCKS.register("smooth_dripstone_wall", () ->
			new WallBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),
	SMOOTH_DRIPSTONE_GATE = BLOCKS.register("smooth_dripstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),

	//Polished
	POLISHED_DRIPSTONE = BLOCKS.register("polished_dripstone", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK))),
	POLISHED_DRIPSTONE_SLAB = BLOCKS.register("polished_dripstone_slab", () ->
			new SlabBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),
	POLISHED_DRIPSTONE_STAIRS = BLOCKS.register("polished_dripstone_stairs", () ->
			new CPlusStairBlock(DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(DRIPSTONE_BLOCK))),
	POLISHED_DRIPSTONE_WALL = BLOCKS.register("polished_dripstone_wall", () ->
			new WallBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),
	POLISHED_DRIPSTONE_GATE = BLOCKS.register("polished_dripstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),

	//Cut
	CUT_DRIPSTONE = BLOCKS.register("cut_dripstone", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK))),
	CUT_DRIPSTONE_SLAB = BLOCKS.register("cut_dripstone_slab", () ->
			new SlabBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),
	CUT_DRIPSTONE_STAIRS = BLOCKS.register("cut_dripstone_stairs", () ->
			new CPlusStairBlock(DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(DRIPSTONE_BLOCK))),
	CUT_DRIPSTONE_WALL = BLOCKS.register("cut_dripstone_wall", () ->
			new WallBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),
	CUT_DRIPSTONE_GATE = BLOCKS.register("cut_dripstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),

	DRIPSTONE_TILES = BLOCKS.register("dripstone_tiles", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK))),
	DRIPSTONE_TILE_SLAB = BLOCKS.register("dripstone_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),
	DRIPSTONE_TILE_STAIRS = BLOCKS.register("dripstone_tile_stairs", () ->
			new CPlusStairBlock(DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(DRIPSTONE_BLOCK))),
	DRIPSTONE_TILE_WALL = BLOCKS.register("dripstone_tile_wall", () ->
			new WallBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),
	DRIPSTONE_TILE_GATE = BLOCKS.register("dripstone_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),

	//Bricks
	DRIPSTONE_BRICKS = BLOCKS.register("dripstone_bricks", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK))),
	DRIPSTONE_BRICK_SLAB = BLOCKS.register("dripstone_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),
	DRIPSTONE_BRICK_STAIRS = BLOCKS.register("dripstone_brick_stairs", () ->
			new CPlusStairBlock(DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(DRIPSTONE_BLOCK))),
	DRIPSTONE_BRICK_WALL = BLOCKS.register("dripstone_brick_wall", () ->
			new WallBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),
	DRIPSTONE_BRICK_GATE = BLOCKS.register("dripstone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),

	//Pillars and Chiseled
	DRIPSTONE_PILLAR = BLOCKS.register("dripstone_pillar", () ->
			new PillarBlock(Block.Settings.copy(DRIPSTONE_BLOCK))),
	DRIPSTONE_CORNER_PILLAR = BLOCKS.register("dripstone_corner_pillar", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK))),
	CHISELED_DRIPSTONE = BLOCKS.register("chiseled_dripstone", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK))),
	CARVED_DRIPSTONE = BLOCKS.register("carved_dripstone", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK))),

//Tuff

	TUFF_SLAB = BLOCKS.register("tuff_slab", () ->
			new SlabBlock(Block.Settings.copy(TUFF))),
	TUFF_STAIRS = BLOCKS.register("tuff_stairs", () ->
			new CPlusStairBlock(TUFF.getDefaultState(), Block.Settings.copy(TUFF))),
	TUFF_WALL = BLOCKS.register("tuff_wall", () ->
			new WallBlock(Block.Settings.copy(TUFF))),
	TUFF_GATE = BLOCKS.register("tuff_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TUFF))),

	COBBLED_TUFF = BLOCKS.register("cobbled_tuff", () ->
			new Block(Block.Settings.copy(TUFF))),
	COBBLED_TUFF_SLAB = BLOCKS.register("cobbled_tuff_slab", () ->
			new SlabBlock(Block.Settings.copy(TUFF))),
	COBBLED_TUFF_STAIRS = BLOCKS.register("cobbled_tuff_stairs", () ->
			new CPlusStairBlock(TUFF.getDefaultState(), Block.Settings.copy(TUFF))),
	COBBLED_TUFF_WALL = BLOCKS.register("cobbled_tuff_wall", () ->
			new WallBlock(Block.Settings.copy(TUFF))),
	COBBLED_TUFF_GATE = BLOCKS.register("cobbled_tuff_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TUFF))),

	//Smooth
	SMOOTH_TUFF = BLOCKS.register("smooth_tuff", () ->
			new Block(Block.Settings.copy(TUFF))),
	SMOOTH_TUFF_SLAB = BLOCKS.register("smooth_tuff_slab", () ->
			new SlabBlock(Block.Settings.copy(TUFF))),
	SMOOTH_TUFF_STAIRS = BLOCKS.register("smooth_tuff_stairs", () ->
			new CPlusStairBlock(TUFF.getDefaultState(), Block.Settings.copy(TUFF))),
	SMOOTH_TUFF_WALL = BLOCKS.register("smooth_tuff_wall", () ->
			new WallBlock(Block.Settings.copy(TUFF))),
	SMOOTH_TUFF_GATE = BLOCKS.register("smooth_tuff_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TUFF))),

	//Polished
	POLISHED_TUFF = BLOCKS.register("polished_tuff", () ->
			new Block(Block.Settings.copy(TUFF))),
	POLISHED_TUFF_SLAB = BLOCKS.register("polished_tuff_slab", () ->
			new SlabBlock(Block.Settings.copy(TUFF))),
	POLISHED_TUFF_STAIRS = BLOCKS.register("polished_tuff_stairs", () ->
			new CPlusStairBlock(TUFF.getDefaultState(), Block.Settings.copy(TUFF))),
	POLISHED_TUFF_WALL = BLOCKS.register("polished_tuff_wall", () ->
			new WallBlock(Block.Settings.copy(TUFF))),
	POLISHED_TUFF_GATE = BLOCKS.register("polished_tuff_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TUFF))),

	//Cut
	CUT_TUFF = BLOCKS.register("cut_tuff", () ->
			new Block(Block.Settings.copy(TUFF))),
	CUT_TUFF_SLAB = BLOCKS.register("cut_tuff_slab", () ->
			new SlabBlock(Block.Settings.copy(TUFF))),
	CUT_TUFF_STAIRS = BLOCKS.register("cut_tuff_stairs", () ->
			new CPlusStairBlock(TUFF.getDefaultState(), Block.Settings.copy(TUFF))),
	CUT_TUFF_WALL = BLOCKS.register("cut_tuff_wall", () ->
			new WallBlock(Block.Settings.copy(TUFF))),
	CUT_TUFF_GATE = BLOCKS.register("cut_tuff_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TUFF))),

	TUFF_TILES = BLOCKS.register("tuff_tiles", () ->
			new Block(Block.Settings.copy(TUFF))),
	TUFF_TILE_SLAB = BLOCKS.register("tuff_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(TUFF))),
	TUFF_TILE_STAIRS = BLOCKS.register("tuff_tile_stairs", () ->
			new CPlusStairBlock(TUFF.getDefaultState(), Block.Settings.copy(TUFF))),
	TUFF_TILE_WALL = BLOCKS.register("tuff_tile_wall", () ->
			new WallBlock(Block.Settings.copy(TUFF))),
	TUFF_TILE_GATE = BLOCKS.register("tuff_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TUFF))),

	//Bricks
	TUFF_BRICKS = BLOCKS.register("tuff_bricks", () ->
			new Block(Block.Settings.copy(TUFF))),
	TUFF_BRICK_SLAB = BLOCKS.register("tuff_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(TUFF))),
	TUFF_BRICK_STAIRS = BLOCKS.register("tuff_brick_stairs", () ->
			new CPlusStairBlock(TUFF.getDefaultState(), Block.Settings.copy(TUFF))),
	TUFF_BRICK_WALL = BLOCKS.register("tuff_brick_wall", () ->
			new WallBlock(Block.Settings.copy(TUFF))),
	TUFF_BRICK_GATE = BLOCKS.register("tuff_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TUFF))),

	//Pillars and Chiseled
	TUFF_PILLAR = BLOCKS.register("tuff_pillar", () ->
			new PillarBlock(Block.Settings.copy(TUFF))),
	TUFF_CORNER_PILLAR = BLOCKS.register("tuff_corner_pillar", () ->
			new Block(Block.Settings.copy(TUFF))),
	CHISELED_TUFF = BLOCKS.register("chiseled_tuff", () ->
			new Block(Block.Settings.copy(TUFF))),
	CARVED_TUFF = BLOCKS.register("carved_tuff", () ->
			new Block(Block.Settings.copy(TUFF))),

	//Deepslate
	COBBLED_DEEPSLATE_GATE = BLOCKS.register("cobbled_deepslate_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE))),

	DEEPSLATE_SLAB = BLOCKS.register("deepslate_slab", () ->
			new SlabBlock(Block.Settings.copy(DEEPSLATE))),
	DEEPSLATE_STAIRS = BLOCKS.register("deepslate_stairs", () ->
			new CPlusStairBlock(DEEPSLATE.getDefaultState(), Block.Settings.copy(DEEPSLATE))),
	DEEPSLATE_WALL = BLOCKS.register("deepslate_wall", () ->
			new WallBlock(Block.Settings.copy(DEEPSLATE))),
	DEEPSLATE_GATE = BLOCKS.register("deepslate_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE))),

	//Smooth
	SMOOTH_DEEPSLATE = BLOCKS.register("smooth_deepslate", () ->
			new Block(Block.Settings.copy(DEEPSLATE))),
	SMOOTH_DEEPSLATE_SLAB = BLOCKS.register("smooth_deepslate_slab", () ->
			new SlabBlock(Block.Settings.copy(DEEPSLATE))),
	SMOOTH_DEEPSLATE_STAIRS = BLOCKS.register("smooth_deepslate_stairs", () ->
			new CPlusStairBlock(DEEPSLATE.getDefaultState(), Block.Settings.copy(DEEPSLATE))),
	SMOOTH_DEEPSLATE_WALL = BLOCKS.register("smooth_deepslate_wall", () ->
			new WallBlock(Block.Settings.copy(DEEPSLATE))),
	SMOOTH_DEEPSLATE_GATE = BLOCKS.register("smooth_deepslate_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE))),

	//Polished
	POLISHED_DEEPSLATE_GATE = BLOCKS.register("polished_deepslate_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE))),

	//Cut
	CUT_DEEPSLATE = BLOCKS.register("cut_deepslate", () ->
			new Block(Block.Settings.copy(DEEPSLATE))),
	CUT_DEEPSLATE_SLAB = BLOCKS.register("cut_deepslate_slab", () ->
			new SlabBlock(Block.Settings.copy(DEEPSLATE))),
	CUT_DEEPSLATE_STAIRS = BLOCKS.register("cut_deepslate_stairs", () ->
			new CPlusStairBlock(DEEPSLATE.getDefaultState(), Block.Settings.copy(DEEPSLATE))),
	CUT_DEEPSLATE_WALL = BLOCKS.register("cut_deepslate_wall", () ->
			new WallBlock(Block.Settings.copy(DEEPSLATE))),
	CUT_DEEPSLATE_GATE = BLOCKS.register("cut_deepslate_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE))),

	//Bricks
	DEEPSLATE_BRICK_GATE = BLOCKS.register("deepslate_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE_BRICKS))),

	DEEPSLATE_TILE_GATE = BLOCKS.register("deepslate_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE_TILES))),

	CRACKED_DEEPSLATE_BRICK_SLAB = BLOCKS.register("cracked_deepslate_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(DEEPSLATE))),
	CRACKED_DEEPSLATE_BRICK_STAIRS = BLOCKS.register("cracked_deepslate_brick_stairs", () ->
			new CPlusStairBlock(DEEPSLATE.getDefaultState(), Block.Settings.copy(DEEPSLATE))),
	CRACKED_DEEPSLATE_BRICK_WALL = BLOCKS.register("cracked_deepslate_brick_wall", () ->
			new WallBlock(Block.Settings.copy(DEEPSLATE))),
	CRACKED_DEEPSLATE_BRICK_GATE = BLOCKS.register("cracked_deepslate_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE))),

	CRACKED_DEEPSLATE_TILE_SLAB = BLOCKS.register("cracked_deepslate_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(DEEPSLATE))),
	CRACKED_DEEPSLATE_TILE_STAIRS = BLOCKS.register("cracked_deepslate_tile_stairs", () ->
			new CPlusStairBlock(DEEPSLATE.getDefaultState(), Block.Settings.copy(DEEPSLATE))),
	CRACKED_DEEPSLATE_TILE_WALL = BLOCKS.register("cracked_deepslate_tile_wall", () ->
			new WallBlock(Block.Settings.copy(DEEPSLATE))),
	CRACKED_DEEPSLATE_TILE_GATE = BLOCKS.register("cracked_deepslate_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE))),

	//Pillars and Chiseled
	DEEPSLATE_PILLAR = BLOCKS.register("deepslate_pillar", () ->
			new PillarBlock(Block.Settings.copy(DEEPSLATE))),
	DEEPSLATE_CORNER_PILLAR = BLOCKS.register("deepslate_corner_pillar", () ->
			new Block(Block.Settings.copy(DEEPSLATE))),
	CARVED_DEEPSLATE = BLOCKS.register("carved_deepslate", () ->
			new Block(Block.Settings.copy(DEEPSLATE))),


	// Terracotta
	// Terracotta Slab
	RED_TERRACOTTA_SLAB = BLOCKS.register("red_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_TERRACOTTA))),
	ORANGE_TERRACOTTA_SLAB = BLOCKS.register("orange_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	YELLOW_TERRACOTTA_SLAB = BLOCKS.register("yellow_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	LIME_TERRACOTTA_SLAB = BLOCKS.register("lime_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	GREEN_TERRACOTTA_SLAB = BLOCKS.register("green_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	BLUE_TERRACOTTA_SLAB = BLOCKS.register("blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	CYAN_TERRACOTTA_SLAB = BLOCKS.register("cyan_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	LIGHT_BLUE_TERRACOTTA_SLAB = BLOCKS.register("light_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	PURPLE_TERRACOTTA_SLAB = BLOCKS.register("purple_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	MAGENTA_TERRACOTTA_SLAB = BLOCKS.register("magenta_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	PINK_TERRACOTTA_SLAB = BLOCKS.register("pink_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	WHITE_TERRACOTTA_SLAB = BLOCKS.register("white_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	LIGHT_GRAY_TERRACOTTA_SLAB = BLOCKS.register("light_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	GRAY_TERRACOTTA_SLAB = BLOCKS.register("gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	BLACK_TERRACOTTA_SLAB = BLOCKS.register("black_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	BROWN_TERRACOTTA_SLAB = BLOCKS.register("brown_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	TERRACOTTA_SLAB = BLOCKS.register("terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(TERRACOTTA))),

	// Terracotta Stairs
	RED_TERRACOTTA_STAIRS = BLOCKS.register("red_terracotta_stairs", () ->
			new CPlusStairBlock(RED_TERRACOTTA.getDefaultState(), Block.Settings.copy(RED_TERRACOTTA))),
	ORANGE_TERRACOTTA_STAIRS = BLOCKS.register("orange_terracotta_stairs", () ->
			new CPlusStairBlock(ORANGE_TERRACOTTA.getDefaultState(), Block.Settings.copy(ORANGE_TERRACOTTA))),
	YELLOW_TERRACOTTA_STAIRS = BLOCKS.register("yellow_terracotta_stairs", () ->
			new CPlusStairBlock(YELLOW_TERRACOTTA.getDefaultState(), Block.Settings.copy(YELLOW_TERRACOTTA))),
	LIME_TERRACOTTA_STAIRS = BLOCKS.register("lime_terracotta_stairs", () ->
			new CPlusStairBlock(LIME_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIME_TERRACOTTA))),
	GREEN_TERRACOTTA_STAIRS = BLOCKS.register("green_terracotta_stairs", () ->
			new CPlusStairBlock(GREEN_TERRACOTTA.getDefaultState(), Block.Settings.copy(GREEN_TERRACOTTA))),
	BLUE_TERRACOTTA_STAIRS = BLOCKS.register("blue_terracotta_stairs", () ->
			new CPlusStairBlock(BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLUE_TERRACOTTA))),
	CYAN_TERRACOTTA_STAIRS = BLOCKS.register("cyan_terracotta_stairs", () ->
			new CPlusStairBlock(CYAN_TERRACOTTA.getDefaultState(), Block.Settings.copy(CYAN_TERRACOTTA))),
	LIGHT_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("light_blue_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	PURPLE_TERRACOTTA_STAIRS = BLOCKS.register("purple_terracotta_stairs", () ->
			new CPlusStairBlock(PURPLE_TERRACOTTA.getDefaultState(), Block.Settings.copy(PURPLE_TERRACOTTA))),
	MAGENTA_TERRACOTTA_STAIRS = BLOCKS.register("magenta_terracotta_stairs", () ->
			new CPlusStairBlock(MAGENTA_TERRACOTTA.getDefaultState(), Block.Settings.copy(MAGENTA_TERRACOTTA))),
	PINK_TERRACOTTA_STAIRS = BLOCKS.register("pink_terracotta_stairs", () ->
			new CPlusStairBlock(PINK_TERRACOTTA.getDefaultState(), Block.Settings.copy(PINK_TERRACOTTA))),
	WHITE_TERRACOTTA_STAIRS = BLOCKS.register("white_terracotta_stairs", () ->
			new CPlusStairBlock(WHITE_TERRACOTTA.getDefaultState(), Block.Settings.copy(WHITE_TERRACOTTA))),
	LIGHT_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("light_gray_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	GRAY_TERRACOTTA_STAIRS = BLOCKS.register("gray_terracotta_stairs", () ->
			new CPlusStairBlock(GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(GRAY_TERRACOTTA))),
	BLACK_TERRACOTTA_STAIRS = BLOCKS.register("black_terracotta_stairs", () ->
			new CPlusStairBlock(BLACK_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLACK_TERRACOTTA))),
	BROWN_TERRACOTTA_STAIRS = BLOCKS.register("brown_terracotta_stairs", () ->
			new CPlusStairBlock(BROWN_TERRACOTTA.getDefaultState(), Block.Settings.copy(BROWN_TERRACOTTA))),
	TERRACOTTA_STAIRS = BLOCKS.register("terracotta_stairs", () ->
			new CPlusStairBlock(TERRACOTTA.getDefaultState(), Block.Settings.copy(TERRACOTTA))),

	// Terracotta Wall
	RED_TERRACOTTA_WALL = BLOCKS.register("red_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(RED_TERRACOTTA))),
	ORANGE_TERRACOTTA_WALL = BLOCKS.register("orange_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	YELLOW_TERRACOTTA_WALL = BLOCKS.register("yellow_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	LIME_TERRACOTTA_WALL = BLOCKS.register("lime_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	GREEN_TERRACOTTA_WALL = BLOCKS.register("green_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	BLUE_TERRACOTTA_WALL = BLOCKS.register("blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	CYAN_TERRACOTTA_WALL = BLOCKS.register("cyan_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	LIGHT_BLUE_TERRACOTTA_WALL = BLOCKS.register("light_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	PURPLE_TERRACOTTA_WALL = BLOCKS.register("purple_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	MAGENTA_TERRACOTTA_WALL = BLOCKS.register("magenta_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	PINK_TERRACOTTA_WALL = BLOCKS.register("pink_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	WHITE_TERRACOTTA_WALL = BLOCKS.register("white_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	LIGHT_GRAY_TERRACOTTA_WALL = BLOCKS.register("light_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	GRAY_TERRACOTTA_WALL = BLOCKS.register("gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	BLACK_TERRACOTTA_WALL = BLOCKS.register("black_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	BROWN_TERRACOTTA_WALL = BLOCKS.register("brown_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	TERRACOTTA_WALL = BLOCKS.register("terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(TERRACOTTA))),

	// Terracotta Gates
	RED_TERRACOTTA_GATE = BLOCKS.register("red_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_TERRACOTTA))),
	ORANGE_TERRACOTTA_GATE = BLOCKS.register("orange_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	YELLOW_TERRACOTTA_GATE = BLOCKS.register("yellow_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	LIME_TERRACOTTA_GATE = BLOCKS.register("lime_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	GREEN_TERRACOTTA_GATE = BLOCKS.register("green_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	BLUE_TERRACOTTA_GATE = BLOCKS.register("blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	CYAN_TERRACOTTA_GATE = BLOCKS.register("cyan_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	LIGHT_BLUE_TERRACOTTA_GATE = BLOCKS.register("light_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	PURPLE_TERRACOTTA_GATE = BLOCKS.register("purple_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	MAGENTA_TERRACOTTA_GATE = BLOCKS.register("magenta_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	PINK_TERRACOTTA_GATE = BLOCKS.register("pink_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	WHITE_TERRACOTTA_GATE = BLOCKS.register("white_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	LIGHT_GRAY_TERRACOTTA_GATE = BLOCKS.register("light_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	GRAY_TERRACOTTA_GATE = BLOCKS.register("gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	BLACK_TERRACOTTA_GATE = BLOCKS.register("black_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	BROWN_TERRACOTTA_GATE = BLOCKS.register("brown_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	TERRACOTTA_GATE = BLOCKS.register("terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TERRACOTTA))),

	COBBLED_RED_TERRACOTTA = BLOCKS.register("cobbled_red_terracotta", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA))),
	COBBLED_ORANGE_TERRACOTTA = BLOCKS.register("cobbled_orange_terracotta", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA))),
	COBBLED_YELLOW_TERRACOTTA = BLOCKS.register("cobbled_yellow_terracotta", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA))),
	COBBLED_LIME_TERRACOTTA = BLOCKS.register("cobbled_lime_terracotta", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA))),
	COBBLED_GREEN_TERRACOTTA = BLOCKS.register("cobbled_green_terracotta", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA))),
	COBBLED_BLUE_TERRACOTTA = BLOCKS.register("cobbled_blue_terracotta", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA))),
	COBBLED_CYAN_TERRACOTTA = BLOCKS.register("cobbled_cyan_terracotta", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA))),
	COBBLED_LIGHT_BLUE_TERRACOTTA = BLOCKS.register("cobbled_light_blue_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	COBBLED_PURPLE_TERRACOTTA = BLOCKS.register("cobbled_purple_terracotta", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA))),
	COBBLED_MAGENTA_TERRACOTTA = BLOCKS.register("cobbled_magenta_terracotta", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	COBBLED_PINK_TERRACOTTA = BLOCKS.register("cobbled_pink_terracotta", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA))),
	COBBLED_WHITE_TERRACOTTA = BLOCKS.register("cobbled_white_terracotta", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA))),
	COBBLED_LIGHT_GRAY_TERRACOTTA = BLOCKS.register("cobbled_light_gray_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	COBBLED_GRAY_TERRACOTTA = BLOCKS.register("cobbled_gray_terracotta", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA))),
	COBBLED_BLACK_TERRACOTTA = BLOCKS.register("cobbled_black_terracotta", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA))),
	COBBLED_BROWN_TERRACOTTA = BLOCKS.register("cobbled_brown_terracotta", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA))),
	COBBLED_TERRACOTTA = BLOCKS.register("cobbled_terracotta", () ->
			new Block(Block.Settings.copy(TERRACOTTA))),

	// Terracotta Slab
	COBBLED_RED_TERRACOTTA_SLAB = BLOCKS.register("cobbled_red_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_TERRACOTTA))),
	COBBLED_ORANGE_TERRACOTTA_SLAB = BLOCKS.register("cobbled_orange_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	COBBLED_YELLOW_TERRACOTTA_SLAB = BLOCKS.register("cobbled_yellow_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	COBBLED_LIME_TERRACOTTA_SLAB = BLOCKS.register("cobbled_lime_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	COBBLED_GREEN_TERRACOTTA_SLAB = BLOCKS.register("cobbled_green_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	COBBLED_BLUE_TERRACOTTA_SLAB = BLOCKS.register("cobbled_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	COBBLED_CYAN_TERRACOTTA_SLAB = BLOCKS.register("cobbled_cyan_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	COBBLED_LIGHT_BLUE_TERRACOTTA_SLAB = BLOCKS.register("cobbled_light_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	COBBLED_PURPLE_TERRACOTTA_SLAB = BLOCKS.register("cobbled_purple_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	COBBLED_MAGENTA_TERRACOTTA_SLAB = BLOCKS.register("cobbled_magenta_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	COBBLED_PINK_TERRACOTTA_SLAB = BLOCKS.register("cobbled_pink_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	COBBLED_WHITE_TERRACOTTA_SLAB = BLOCKS.register("cobbled_white_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	COBBLED_LIGHT_GRAY_TERRACOTTA_SLAB = BLOCKS.register("cobbled_light_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	COBBLED_GRAY_TERRACOTTA_SLAB = BLOCKS.register("cobbled_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	COBBLED_BLACK_TERRACOTTA_SLAB = BLOCKS.register("cobbled_black_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	COBBLED_BROWN_TERRACOTTA_SLAB = BLOCKS.register("cobbled_brown_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	COBBLED_TERRACOTTA_SLAB = BLOCKS.register("cobbled_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(TERRACOTTA))),

	// Terracotta Stairs
	COBBLED_RED_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_red_terracotta_stairs", () ->
			new CPlusStairBlock(RED_TERRACOTTA.getDefaultState(), Block.Settings.copy(RED_TERRACOTTA))),
	COBBLED_ORANGE_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_orange_terracotta_stairs", () ->
			new CPlusStairBlock(ORANGE_TERRACOTTA.getDefaultState(), Block.Settings.copy(ORANGE_TERRACOTTA))),
	COBBLED_YELLOW_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_yellow_terracotta_stairs", () ->
			new CPlusStairBlock(YELLOW_TERRACOTTA.getDefaultState(), Block.Settings.copy(YELLOW_TERRACOTTA))),
	COBBLED_LIME_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_lime_terracotta_stairs", () ->
			new CPlusStairBlock(LIME_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIME_TERRACOTTA))),
	COBBLED_GREEN_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_green_terracotta_stairs", () ->
			new CPlusStairBlock(GREEN_TERRACOTTA.getDefaultState(), Block.Settings.copy(GREEN_TERRACOTTA))),
	COBBLED_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_blue_terracotta_stairs", () ->
			new CPlusStairBlock(BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLUE_TERRACOTTA))),
	COBBLED_CYAN_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_cyan_terracotta_stairs", () ->
			new CPlusStairBlock(CYAN_TERRACOTTA.getDefaultState(), Block.Settings.copy(CYAN_TERRACOTTA))),
	COBBLED_LIGHT_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_light_blue_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	COBBLED_PURPLE_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_purple_terracotta_stairs", () ->
			new CPlusStairBlock(PURPLE_TERRACOTTA.getDefaultState(), Block.Settings.copy(PURPLE_TERRACOTTA))),
	COBBLED_MAGENTA_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_magenta_terracotta_stairs", () ->
			new CPlusStairBlock(MAGENTA_TERRACOTTA.getDefaultState(), Block.Settings.copy(MAGENTA_TERRACOTTA))),
	COBBLED_PINK_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_pink_terracotta_stairs", () ->
			new CPlusStairBlock(PINK_TERRACOTTA.getDefaultState(), Block.Settings.copy(PINK_TERRACOTTA))),
	COBBLED_WHITE_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_white_terracotta_stairs", () ->
			new CPlusStairBlock(WHITE_TERRACOTTA.getDefaultState(), Block.Settings.copy(WHITE_TERRACOTTA))),
	COBBLED_LIGHT_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_light_gray_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	COBBLED_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_gray_terracotta_stairs", () ->
			new CPlusStairBlock(GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(GRAY_TERRACOTTA))),
	COBBLED_BLACK_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_black_terracotta_stairs", () ->
			new CPlusStairBlock(BLACK_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLACK_TERRACOTTA))),
	COBBLED_BROWN_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_brown_terracotta_stairs", () ->
			new CPlusStairBlock(BROWN_TERRACOTTA.getDefaultState(), Block.Settings.copy(BROWN_TERRACOTTA))),
	COBBLED_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_terracotta_stairs", () ->
			new CPlusStairBlock(TERRACOTTA.getDefaultState(), Block.Settings.copy(TERRACOTTA))),

	// Terracotta Wall
	COBBLED_RED_TERRACOTTA_WALL = BLOCKS.register("cobbled_red_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(RED_TERRACOTTA))),
	COBBLED_ORANGE_TERRACOTTA_WALL = BLOCKS.register("cobbled_orange_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	COBBLED_YELLOW_TERRACOTTA_WALL = BLOCKS.register("cobbled_yellow_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	COBBLED_LIME_TERRACOTTA_WALL = BLOCKS.register("cobbled_lime_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	COBBLED_GREEN_TERRACOTTA_WALL = BLOCKS.register("cobbled_green_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	COBBLED_BLUE_TERRACOTTA_WALL = BLOCKS.register("cobbled_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	COBBLED_CYAN_TERRACOTTA_WALL = BLOCKS.register("cobbled_cyan_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	COBBLED_LIGHT_BLUE_TERRACOTTA_WALL = BLOCKS.register("cobbled_light_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	COBBLED_PURPLE_TERRACOTTA_WALL = BLOCKS.register("cobbled_purple_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	COBBLED_MAGENTA_TERRACOTTA_WALL = BLOCKS.register("cobbled_magenta_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	COBBLED_PINK_TERRACOTTA_WALL = BLOCKS.register("cobbled_pink_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	COBBLED_WHITE_TERRACOTTA_WALL = BLOCKS.register("cobbled_white_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	COBBLED_LIGHT_GRAY_TERRACOTTA_WALL = BLOCKS.register("cobbled_light_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	COBBLED_GRAY_TERRACOTTA_WALL = BLOCKS.register("cobbled_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	COBBLED_BLACK_TERRACOTTA_WALL = BLOCKS.register("cobbled_black_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	COBBLED_BROWN_TERRACOTTA_WALL = BLOCKS.register("cobbled_brown_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	COBBLED_TERRACOTTA_WALL = BLOCKS.register("cobbled_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(TERRACOTTA))),

	// Terracotta Gates
	COBBLED_RED_TERRACOTTA_GATE = BLOCKS.register("cobbled_red_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_TERRACOTTA))),
	COBBLED_ORANGE_TERRACOTTA_GATE = BLOCKS.register("cobbled_orange_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	COBBLED_YELLOW_TERRACOTTA_GATE = BLOCKS.register("cobbled_yellow_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	COBBLED_LIME_TERRACOTTA_GATE = BLOCKS.register("cobbled_lime_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	COBBLED_GREEN_TERRACOTTA_GATE = BLOCKS.register("cobbled_green_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	COBBLED_BLUE_TERRACOTTA_GATE = BLOCKS.register("cobbled_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	COBBLED_CYAN_TERRACOTTA_GATE = BLOCKS.register("cobbled_cyan_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	COBBLED_LIGHT_BLUE_TERRACOTTA_GATE = BLOCKS.register("cobbled_light_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	COBBLED_PURPLE_TERRACOTTA_GATE = BLOCKS.register("cobbled_purple_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	COBBLED_MAGENTA_TERRACOTTA_GATE = BLOCKS.register("cobbled_magenta_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	COBBLED_PINK_TERRACOTTA_GATE = BLOCKS.register("cobbled_pink_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	COBBLED_WHITE_TERRACOTTA_GATE = BLOCKS.register("cobbled_white_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	COBBLED_LIGHT_GRAY_TERRACOTTA_GATE = BLOCKS.register("cobbled_light_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	COBBLED_GRAY_TERRACOTTA_GATE = BLOCKS.register("cobbled_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	COBBLED_BLACK_TERRACOTTA_GATE = BLOCKS.register("cobbled_black_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	COBBLED_BROWN_TERRACOTTA_GATE = BLOCKS.register("cobbled_brown_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	COBBLED_TERRACOTTA_GATE = BLOCKS.register("cobbled_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TERRACOTTA))),

	SMOOTH_RED_TERRACOTTA = BLOCKS.register("smooth_red_terracotta", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA))),
	SMOOTH_ORANGE_TERRACOTTA = BLOCKS.register("smooth_orange_terracotta", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA))),
	SMOOTH_YELLOW_TERRACOTTA = BLOCKS.register("smooth_yellow_terracotta", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA))),
	SMOOTH_LIME_TERRACOTTA = BLOCKS.register("smooth_lime_terracotta", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA))),
	SMOOTH_GREEN_TERRACOTTA = BLOCKS.register("smooth_green_terracotta", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA))),
	SMOOTH_BLUE_TERRACOTTA = BLOCKS.register("smooth_blue_terracotta", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA))),
	SMOOTH_CYAN_TERRACOTTA = BLOCKS.register("smooth_cyan_terracotta", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA))),
	SMOOTH_LIGHT_BLUE_TERRACOTTA = BLOCKS.register("smooth_light_blue_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	SMOOTH_PURPLE_TERRACOTTA = BLOCKS.register("smooth_purple_terracotta", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA))),
	SMOOTH_MAGENTA_TERRACOTTA = BLOCKS.register("smooth_magenta_terracotta", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	SMOOTH_PINK_TERRACOTTA = BLOCKS.register("smooth_pink_terracotta", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA))),
	SMOOTH_WHITE_TERRACOTTA = BLOCKS.register("smooth_white_terracotta", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA))),
	SMOOTH_LIGHT_GRAY_TERRACOTTA = BLOCKS.register("smooth_light_gray_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	SMOOTH_GRAY_TERRACOTTA = BLOCKS.register("smooth_gray_terracotta", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA))),
	SMOOTH_BLACK_TERRACOTTA = BLOCKS.register("smooth_black_terracotta", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA))),
	SMOOTH_BROWN_TERRACOTTA = BLOCKS.register("smooth_brown_terracotta", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA))),
	SMOOTH_TERRACOTTA = BLOCKS.register("smooth_terracotta", () ->
			new Block(Block.Settings.copy(TERRACOTTA))),

	SMOOTH_RED_TERRACOTTA_SLAB = BLOCKS.register("smooth_red_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_TERRACOTTA))),
	SMOOTH_ORANGE_TERRACOTTA_SLAB = BLOCKS.register("smooth_orange_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	SMOOTH_YELLOW_TERRACOTTA_SLAB = BLOCKS.register("smooth_yellow_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	SMOOTH_LIME_TERRACOTTA_SLAB = BLOCKS.register("smooth_lime_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	SMOOTH_GREEN_TERRACOTTA_SLAB = BLOCKS.register("smooth_green_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	SMOOTH_BLUE_TERRACOTTA_SLAB = BLOCKS.register("smooth_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	SMOOTH_CYAN_TERRACOTTA_SLAB = BLOCKS.register("smooth_cyan_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	SMOOTH_LIGHT_BLUE_TERRACOTTA_SLAB = BLOCKS.register("smooth_light_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	SMOOTH_PURPLE_TERRACOTTA_SLAB = BLOCKS.register("smooth_purple_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	SMOOTH_MAGENTA_TERRACOTTA_SLAB = BLOCKS.register("smooth_magenta_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	SMOOTH_PINK_TERRACOTTA_SLAB = BLOCKS.register("smooth_pink_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	SMOOTH_WHITE_TERRACOTTA_SLAB = BLOCKS.register("smooth_white_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	SMOOTH_LIGHT_GRAY_TERRACOTTA_SLAB = BLOCKS.register("smooth_light_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	SMOOTH_GRAY_TERRACOTTA_SLAB = BLOCKS.register("smooth_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	SMOOTH_BLACK_TERRACOTTA_SLAB = BLOCKS.register("smooth_black_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	SMOOTH_BROWN_TERRACOTTA_SLAB = BLOCKS.register("smooth_brown_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	SMOOTH_TERRACOTTA_SLAB = BLOCKS.register("smooth_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(TERRACOTTA))),

	// Terracotta Stairs
	SMOOTH_RED_TERRACOTTA_STAIRS = BLOCKS.register("smooth_red_terracotta_stairs", () ->
			new CPlusStairBlock(RED_TERRACOTTA.getDefaultState(), Block.Settings.copy(RED_TERRACOTTA))),
	SMOOTH_ORANGE_TERRACOTTA_STAIRS = BLOCKS.register("smooth_orange_terracotta_stairs", () ->
			new CPlusStairBlock(ORANGE_TERRACOTTA.getDefaultState(), Block.Settings.copy(ORANGE_TERRACOTTA))),
	SMOOTH_YELLOW_TERRACOTTA_STAIRS = BLOCKS.register("smooth_yellow_terracotta_stairs", () ->
			new CPlusStairBlock(YELLOW_TERRACOTTA.getDefaultState(), Block.Settings.copy(YELLOW_TERRACOTTA))),
	SMOOTH_LIME_TERRACOTTA_STAIRS = BLOCKS.register("smooth_lime_terracotta_stairs", () ->
			new CPlusStairBlock(LIME_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIME_TERRACOTTA))),
	SMOOTH_GREEN_TERRACOTTA_STAIRS = BLOCKS.register("smooth_green_terracotta_stairs", () ->
			new CPlusStairBlock(GREEN_TERRACOTTA.getDefaultState(), Block.Settings.copy(GREEN_TERRACOTTA))),
	SMOOTH_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("smooth_blue_terracotta_stairs", () ->
			new CPlusStairBlock(BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLUE_TERRACOTTA))),
	SMOOTH_CYAN_TERRACOTTA_STAIRS = BLOCKS.register("smooth_cyan_terracotta_stairs", () ->
			new CPlusStairBlock(CYAN_TERRACOTTA.getDefaultState(), Block.Settings.copy(CYAN_TERRACOTTA))),
	SMOOTH_LIGHT_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("smooth_light_blue_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	SMOOTH_PURPLE_TERRACOTTA_STAIRS = BLOCKS.register("smooth_purple_terracotta_stairs", () ->
			new CPlusStairBlock(PURPLE_TERRACOTTA.getDefaultState(), Block.Settings.copy(PURPLE_TERRACOTTA))),
	SMOOTH_MAGENTA_TERRACOTTA_STAIRS = BLOCKS.register("smooth_magenta_terracotta_stairs", () ->
			new CPlusStairBlock(MAGENTA_TERRACOTTA.getDefaultState(), Block.Settings.copy(MAGENTA_TERRACOTTA))),
	SMOOTH_PINK_TERRACOTTA_STAIRS = BLOCKS.register("smooth_pink_terracotta_stairs", () ->
			new CPlusStairBlock(PINK_TERRACOTTA.getDefaultState(), Block.Settings.copy(PINK_TERRACOTTA))),
	SMOOTH_WHITE_TERRACOTTA_STAIRS = BLOCKS.register("smooth_white_terracotta_stairs", () ->
			new CPlusStairBlock(WHITE_TERRACOTTA.getDefaultState(), Block.Settings.copy(WHITE_TERRACOTTA))),
	SMOOTH_LIGHT_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("smooth_light_gray_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	SMOOTH_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("smooth_gray_terracotta_stairs", () ->
			new CPlusStairBlock(GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(GRAY_TERRACOTTA))),
	SMOOTH_BLACK_TERRACOTTA_STAIRS = BLOCKS.register("smooth_black_terracotta_stairs", () ->
			new CPlusStairBlock(BLACK_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLACK_TERRACOTTA))),
	SMOOTH_BROWN_TERRACOTTA_STAIRS = BLOCKS.register("smooth_brown_terracotta_stairs", () ->
			new CPlusStairBlock(BROWN_TERRACOTTA.getDefaultState(), Block.Settings.copy(BROWN_TERRACOTTA))),
	SMOOTH_TERRACOTTA_STAIRS = BLOCKS.register("smooth_terracotta_stairs", () ->
			new CPlusStairBlock(TERRACOTTA.getDefaultState(), Block.Settings.copy(TERRACOTTA))),

	// Terracotta Wall
	SMOOTH_RED_TERRACOTTA_WALL = BLOCKS.register("smooth_red_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(RED_TERRACOTTA))),
	SMOOTH_ORANGE_TERRACOTTA_WALL = BLOCKS.register("smooth_orange_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	SMOOTH_YELLOW_TERRACOTTA_WALL = BLOCKS.register("smooth_yellow_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	SMOOTH_LIME_TERRACOTTA_WALL = BLOCKS.register("smooth_lime_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	SMOOTH_GREEN_TERRACOTTA_WALL = BLOCKS.register("smooth_green_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	SMOOTH_BLUE_TERRACOTTA_WALL = BLOCKS.register("smooth_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	SMOOTH_CYAN_TERRACOTTA_WALL = BLOCKS.register("smooth_cyan_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	SMOOTH_LIGHT_BLUE_TERRACOTTA_WALL = BLOCKS.register("smooth_light_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	SMOOTH_PURPLE_TERRACOTTA_WALL = BLOCKS.register("smooth_purple_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	SMOOTH_MAGENTA_TERRACOTTA_WALL = BLOCKS.register("smooth_magenta_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	SMOOTH_PINK_TERRACOTTA_WALL = BLOCKS.register("smooth_pink_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	SMOOTH_WHITE_TERRACOTTA_WALL = BLOCKS.register("smooth_white_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	SMOOTH_LIGHT_GRAY_TERRACOTTA_WALL = BLOCKS.register("smooth_light_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	SMOOTH_GRAY_TERRACOTTA_WALL = BLOCKS.register("smooth_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	SMOOTH_BLACK_TERRACOTTA_WALL = BLOCKS.register("smooth_black_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	SMOOTH_BROWN_TERRACOTTA_WALL = BLOCKS.register("smooth_brown_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	SMOOTH_TERRACOTTA_WALL = BLOCKS.register("smooth_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(TERRACOTTA))),

	// Terracotta Gates
	SMOOTH_RED_TERRACOTTA_GATE = BLOCKS.register("smooth_red_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_TERRACOTTA))),
	SMOOTH_ORANGE_TERRACOTTA_GATE = BLOCKS.register("smooth_orange_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	SMOOTH_YELLOW_TERRACOTTA_GATE = BLOCKS.register("smooth_yellow_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	SMOOTH_LIME_TERRACOTTA_GATE = BLOCKS.register("smooth_lime_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	SMOOTH_GREEN_TERRACOTTA_GATE = BLOCKS.register("smooth_green_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	SMOOTH_BLUE_TERRACOTTA_GATE = BLOCKS.register("smooth_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	SMOOTH_CYAN_TERRACOTTA_GATE = BLOCKS.register("smooth_cyan_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	SMOOTH_LIGHT_BLUE_TERRACOTTA_GATE = BLOCKS.register("smooth_light_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	SMOOTH_PURPLE_TERRACOTTA_GATE = BLOCKS.register("smooth_purple_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	SMOOTH_MAGENTA_TERRACOTTA_GATE = BLOCKS.register("smooth_magenta_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	SMOOTH_PINK_TERRACOTTA_GATE = BLOCKS.register("smooth_pink_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	SMOOTH_WHITE_TERRACOTTA_GATE = BLOCKS.register("smooth_white_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	SMOOTH_LIGHT_GRAY_TERRACOTTA_GATE = BLOCKS.register("smooth_light_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	SMOOTH_GRAY_TERRACOTTA_GATE = BLOCKS.register("smooth_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	SMOOTH_BLACK_TERRACOTTA_GATE = BLOCKS.register("smooth_black_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	SMOOTH_BROWN_TERRACOTTA_GATE = BLOCKS.register("smooth_brown_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	SMOOTH_TERRACOTTA_GATE = BLOCKS.register("smooth_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TERRACOTTA))),

	POLISHED_RED_TERRACOTTA = BLOCKS.register("polished_red_terracotta", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA))),
	POLISHED_ORANGE_TERRACOTTA = BLOCKS.register("polished_orange_terracotta", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA))),
	POLISHED_YELLOW_TERRACOTTA = BLOCKS.register("polished_yellow_terracotta", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA))),
	POLISHED_LIME_TERRACOTTA = BLOCKS.register("polished_lime_terracotta", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA))),
	POLISHED_GREEN_TERRACOTTA = BLOCKS.register("polished_green_terracotta", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA))),
	POLISHED_BLUE_TERRACOTTA = BLOCKS.register("polished_blue_terracotta", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA))),
	POLISHED_CYAN_TERRACOTTA = BLOCKS.register("polished_cyan_terracotta", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA))),
	POLISHED_LIGHT_BLUE_TERRACOTTA = BLOCKS.register("polished_light_blue_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	POLISHED_PURPLE_TERRACOTTA = BLOCKS.register("polished_purple_terracotta", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA))),
	POLISHED_MAGENTA_TERRACOTTA = BLOCKS.register("polished_magenta_terracotta", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	POLISHED_PINK_TERRACOTTA = BLOCKS.register("polished_pink_terracotta", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA))),
	POLISHED_WHITE_TERRACOTTA = BLOCKS.register("polished_white_terracotta", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA))),
	POLISHED_LIGHT_GRAY_TERRACOTTA = BLOCKS.register("polished_light_gray_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	POLISHED_GRAY_TERRACOTTA = BLOCKS.register("polished_gray_terracotta", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA))),
	POLISHED_BLACK_TERRACOTTA = BLOCKS.register("polished_black_terracotta", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA))),
	POLISHED_BROWN_TERRACOTTA = BLOCKS.register("polished_brown_terracotta", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA))),
	POLISHED_TERRACOTTA = BLOCKS.register("polished_terracotta", () ->
			new Block(Block.Settings.copy(TERRACOTTA))),

	POLISHED_RED_TERRACOTTA_SLAB = BLOCKS.register("polished_red_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_TERRACOTTA))),
	POLISHED_ORANGE_TERRACOTTA_SLAB = BLOCKS.register("polished_orange_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	POLISHED_YELLOW_TERRACOTTA_SLAB = BLOCKS.register("polished_yellow_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	POLISHED_LIME_TERRACOTTA_SLAB = BLOCKS.register("polished_lime_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	POLISHED_GREEN_TERRACOTTA_SLAB = BLOCKS.register("polished_green_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	POLISHED_BLUE_TERRACOTTA_SLAB = BLOCKS.register("polished_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	POLISHED_CYAN_TERRACOTTA_SLAB = BLOCKS.register("polished_cyan_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	POLISHED_LIGHT_BLUE_TERRACOTTA_SLAB = BLOCKS.register("polished_light_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	POLISHED_PURPLE_TERRACOTTA_SLAB = BLOCKS.register("polished_purple_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	POLISHED_MAGENTA_TERRACOTTA_SLAB = BLOCKS.register("polished_magenta_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	POLISHED_PINK_TERRACOTTA_SLAB = BLOCKS.register("polished_pink_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	POLISHED_WHITE_TERRACOTTA_SLAB = BLOCKS.register("polished_white_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	POLISHED_LIGHT_GRAY_TERRACOTTA_SLAB = BLOCKS.register("polished_light_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	POLISHED_GRAY_TERRACOTTA_SLAB = BLOCKS.register("polished_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	POLISHED_BLACK_TERRACOTTA_SLAB = BLOCKS.register("polished_black_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	POLISHED_BROWN_TERRACOTTA_SLAB = BLOCKS.register("polished_brown_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	POLISHED_TERRACOTTA_SLAB = BLOCKS.register("polished_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(TERRACOTTA))),

	// Terracotta Stairs
	POLISHED_RED_TERRACOTTA_STAIRS = BLOCKS.register("polished_red_terracotta_stairs", () ->
			new CPlusStairBlock(RED_TERRACOTTA.getDefaultState(), Block.Settings.copy(RED_TERRACOTTA))),
	POLISHED_ORANGE_TERRACOTTA_STAIRS = BLOCKS.register("polished_orange_terracotta_stairs", () ->
			new CPlusStairBlock(ORANGE_TERRACOTTA.getDefaultState(), Block.Settings.copy(ORANGE_TERRACOTTA))),
	POLISHED_YELLOW_TERRACOTTA_STAIRS = BLOCKS.register("polished_yellow_terracotta_stairs", () ->
			new CPlusStairBlock(YELLOW_TERRACOTTA.getDefaultState(), Block.Settings.copy(YELLOW_TERRACOTTA))),
	POLISHED_LIME_TERRACOTTA_STAIRS = BLOCKS.register("polished_lime_terracotta_stairs", () ->
			new CPlusStairBlock(LIME_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIME_TERRACOTTA))),
	POLISHED_GREEN_TERRACOTTA_STAIRS = BLOCKS.register("polished_green_terracotta_stairs", () ->
			new CPlusStairBlock(GREEN_TERRACOTTA.getDefaultState(), Block.Settings.copy(GREEN_TERRACOTTA))),
	POLISHED_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("polished_blue_terracotta_stairs", () ->
			new CPlusStairBlock(BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLUE_TERRACOTTA))),
	POLISHED_CYAN_TERRACOTTA_STAIRS = BLOCKS.register("polished_cyan_terracotta_stairs", () ->
			new CPlusStairBlock(CYAN_TERRACOTTA.getDefaultState(), Block.Settings.copy(CYAN_TERRACOTTA))),
	POLISHED_LIGHT_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("polished_light_blue_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	POLISHED_PURPLE_TERRACOTTA_STAIRS = BLOCKS.register("polished_purple_terracotta_stairs", () ->
			new CPlusStairBlock(PURPLE_TERRACOTTA.getDefaultState(), Block.Settings.copy(PURPLE_TERRACOTTA))),
	POLISHED_MAGENTA_TERRACOTTA_STAIRS = BLOCKS.register("polished_magenta_terracotta_stairs", () ->
			new CPlusStairBlock(MAGENTA_TERRACOTTA.getDefaultState(), Block.Settings.copy(MAGENTA_TERRACOTTA))),
	POLISHED_PINK_TERRACOTTA_STAIRS = BLOCKS.register("polished_pink_terracotta_stairs", () ->
			new CPlusStairBlock(PINK_TERRACOTTA.getDefaultState(), Block.Settings.copy(PINK_TERRACOTTA))),
	POLISHED_WHITE_TERRACOTTA_STAIRS = BLOCKS.register("polished_white_terracotta_stairs", () ->
			new CPlusStairBlock(WHITE_TERRACOTTA.getDefaultState(), Block.Settings.copy(WHITE_TERRACOTTA))),
	POLISHED_LIGHT_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("polished_light_gray_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	POLISHED_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("polished_gray_terracotta_stairs", () ->
			new CPlusStairBlock(GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(GRAY_TERRACOTTA))),
	POLISHED_BLACK_TERRACOTTA_STAIRS = BLOCKS.register("polished_black_terracotta_stairs", () ->
			new CPlusStairBlock(BLACK_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLACK_TERRACOTTA))),
	POLISHED_BROWN_TERRACOTTA_STAIRS = BLOCKS.register("polished_brown_terracotta_stairs", () ->
			new CPlusStairBlock(BROWN_TERRACOTTA.getDefaultState(), Block.Settings.copy(BROWN_TERRACOTTA))),
	POLISHED_TERRACOTTA_STAIRS = BLOCKS.register("polished_terracotta_stairs", () ->
			new CPlusStairBlock(TERRACOTTA.getDefaultState(), Block.Settings.copy(TERRACOTTA))),

	// Terracotta Wall
	POLISHED_RED_TERRACOTTA_WALL = BLOCKS.register("polished_red_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(RED_TERRACOTTA))),
	POLISHED_ORANGE_TERRACOTTA_WALL = BLOCKS.register("polished_orange_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	POLISHED_YELLOW_TERRACOTTA_WALL = BLOCKS.register("polished_yellow_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	POLISHED_LIME_TERRACOTTA_WALL = BLOCKS.register("polished_lime_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	POLISHED_GREEN_TERRACOTTA_WALL = BLOCKS.register("polished_green_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	POLISHED_BLUE_TERRACOTTA_WALL = BLOCKS.register("polished_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	POLISHED_CYAN_TERRACOTTA_WALL = BLOCKS.register("polished_cyan_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	POLISHED_LIGHT_BLUE_TERRACOTTA_WALL = BLOCKS.register("polished_light_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	POLISHED_PURPLE_TERRACOTTA_WALL = BLOCKS.register("polished_purple_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	POLISHED_MAGENTA_TERRACOTTA_WALL = BLOCKS.register("polished_magenta_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	POLISHED_PINK_TERRACOTTA_WALL = BLOCKS.register("polished_pink_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	POLISHED_WHITE_TERRACOTTA_WALL = BLOCKS.register("polished_white_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	POLISHED_LIGHT_GRAY_TERRACOTTA_WALL = BLOCKS.register("polished_light_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	POLISHED_GRAY_TERRACOTTA_WALL = BLOCKS.register("polished_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	POLISHED_BLACK_TERRACOTTA_WALL = BLOCKS.register("polished_black_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	POLISHED_BROWN_TERRACOTTA_WALL = BLOCKS.register("polished_brown_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	POLISHED_TERRACOTTA_WALL = BLOCKS.register("polished_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(TERRACOTTA))),

	// Terracotta Gates
	POLISHED_RED_TERRACOTTA_GATE = BLOCKS.register("polished_red_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_TERRACOTTA))),
	POLISHED_ORANGE_TERRACOTTA_GATE = BLOCKS.register("polished_orange_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	POLISHED_YELLOW_TERRACOTTA_GATE = BLOCKS.register("polished_yellow_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	POLISHED_LIME_TERRACOTTA_GATE = BLOCKS.register("polished_lime_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	POLISHED_GREEN_TERRACOTTA_GATE = BLOCKS.register("polished_green_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	POLISHED_BLUE_TERRACOTTA_GATE = BLOCKS.register("polished_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	POLISHED_CYAN_TERRACOTTA_GATE = BLOCKS.register("polished_cyan_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	POLISHED_LIGHT_BLUE_TERRACOTTA_GATE = BLOCKS.register("polished_light_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	POLISHED_PURPLE_TERRACOTTA_GATE = BLOCKS.register("polished_purple_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	POLISHED_MAGENTA_TERRACOTTA_GATE = BLOCKS.register("polished_magenta_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	POLISHED_PINK_TERRACOTTA_GATE = BLOCKS.register("polished_pink_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	POLISHED_WHITE_TERRACOTTA_GATE = BLOCKS.register("polished_white_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	POLISHED_LIGHT_GRAY_TERRACOTTA_GATE = BLOCKS.register("polished_light_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	POLISHED_GRAY_TERRACOTTA_GATE = BLOCKS.register("polished_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	POLISHED_BLACK_TERRACOTTA_GATE = BLOCKS.register("polished_black_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	POLISHED_BROWN_TERRACOTTA_GATE = BLOCKS.register("polished_brown_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	POLISHED_TERRACOTTA_GATE = BLOCKS.register("polished_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TERRACOTTA))),

	CUT_RED_TERRACOTTA = BLOCKS.register("cut_red_terracotta", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA))),
	CUT_ORANGE_TERRACOTTA = BLOCKS.register("cut_orange_terracotta", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA))),
	CUT_YELLOW_TERRACOTTA = BLOCKS.register("cut_yellow_terracotta", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA))),
	CUT_LIME_TERRACOTTA = BLOCKS.register("cut_lime_terracotta", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA))),
	CUT_GREEN_TERRACOTTA = BLOCKS.register("cut_green_terracotta", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA))),
	CUT_BLUE_TERRACOTTA = BLOCKS.register("cut_blue_terracotta", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA))),
	CUT_CYAN_TERRACOTTA = BLOCKS.register("cut_cyan_terracotta", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA))),
	CUT_LIGHT_BLUE_TERRACOTTA = BLOCKS.register("cut_light_blue_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	CUT_PURPLE_TERRACOTTA = BLOCKS.register("cut_purple_terracotta", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA))),
	CUT_MAGENTA_TERRACOTTA = BLOCKS.register("cut_magenta_terracotta", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	CUT_PINK_TERRACOTTA = BLOCKS.register("cut_pink_terracotta", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA))),
	CUT_WHITE_TERRACOTTA = BLOCKS.register("cut_white_terracotta", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA))),
	CUT_LIGHT_GRAY_TERRACOTTA = BLOCKS.register("cut_light_gray_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	CUT_GRAY_TERRACOTTA = BLOCKS.register("cut_gray_terracotta", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA))),
	CUT_BLACK_TERRACOTTA = BLOCKS.register("cut_black_terracotta", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA))),
	CUT_BROWN_TERRACOTTA = BLOCKS.register("cut_brown_terracotta", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA))),
	CUT_TERRACOTTA = BLOCKS.register("cut_terracotta", () ->
			new Block(Block.Settings.copy(TERRACOTTA))),

	CUT_RED_TERRACOTTA_SLAB = BLOCKS.register("cut_red_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_TERRACOTTA))),
	CUT_ORANGE_TERRACOTTA_SLAB = BLOCKS.register("cut_orange_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	CUT_YELLOW_TERRACOTTA_SLAB = BLOCKS.register("cut_yellow_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	CUT_LIME_TERRACOTTA_SLAB = BLOCKS.register("cut_lime_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	CUT_GREEN_TERRACOTTA_SLAB = BLOCKS.register("cut_green_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	CUT_BLUE_TERRACOTTA_SLAB = BLOCKS.register("cut_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	CUT_CYAN_TERRACOTTA_SLAB = BLOCKS.register("cut_cyan_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	CUT_LIGHT_BLUE_TERRACOTTA_SLAB = BLOCKS.register("cut_light_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	CUT_PURPLE_TERRACOTTA_SLAB = BLOCKS.register("cut_purple_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	CUT_MAGENTA_TERRACOTTA_SLAB = BLOCKS.register("cut_magenta_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	CUT_PINK_TERRACOTTA_SLAB = BLOCKS.register("cut_pink_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	CUT_WHITE_TERRACOTTA_SLAB = BLOCKS.register("cut_white_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	CUT_LIGHT_GRAY_TERRACOTTA_SLAB = BLOCKS.register("cut_light_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	CUT_GRAY_TERRACOTTA_SLAB = BLOCKS.register("cut_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	CUT_BLACK_TERRACOTTA_SLAB = BLOCKS.register("cut_black_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	CUT_BROWN_TERRACOTTA_SLAB = BLOCKS.register("cut_brown_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	CUT_TERRACOTTA_SLAB = BLOCKS.register("cut_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(TERRACOTTA))),

	// Terracotta Stairs
	CUT_RED_TERRACOTTA_STAIRS = BLOCKS.register("cut_red_terracotta_stairs", () ->
			new CPlusStairBlock(RED_TERRACOTTA.getDefaultState(), Block.Settings.copy(RED_TERRACOTTA))),
	CUT_ORANGE_TERRACOTTA_STAIRS = BLOCKS.register("cut_orange_terracotta_stairs", () ->
			new CPlusStairBlock(ORANGE_TERRACOTTA.getDefaultState(), Block.Settings.copy(ORANGE_TERRACOTTA))),
	CUT_YELLOW_TERRACOTTA_STAIRS = BLOCKS.register("cut_yellow_terracotta_stairs", () ->
			new CPlusStairBlock(YELLOW_TERRACOTTA.getDefaultState(), Block.Settings.copy(YELLOW_TERRACOTTA))),
	CUT_LIME_TERRACOTTA_STAIRS = BLOCKS.register("cut_lime_terracotta_stairs", () ->
			new CPlusStairBlock(LIME_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIME_TERRACOTTA))),
	CUT_GREEN_TERRACOTTA_STAIRS = BLOCKS.register("cut_green_terracotta_stairs", () ->
			new CPlusStairBlock(GREEN_TERRACOTTA.getDefaultState(), Block.Settings.copy(GREEN_TERRACOTTA))),
	CUT_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("cut_blue_terracotta_stairs", () ->
			new CPlusStairBlock(BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLUE_TERRACOTTA))),
	CUT_CYAN_TERRACOTTA_STAIRS = BLOCKS.register("cut_cyan_terracotta_stairs", () ->
			new CPlusStairBlock(CYAN_TERRACOTTA.getDefaultState(), Block.Settings.copy(CYAN_TERRACOTTA))),
	CUT_LIGHT_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("cut_light_blue_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	CUT_PURPLE_TERRACOTTA_STAIRS = BLOCKS.register("cut_purple_terracotta_stairs", () ->
			new CPlusStairBlock(PURPLE_TERRACOTTA.getDefaultState(), Block.Settings.copy(PURPLE_TERRACOTTA))),
	CUT_MAGENTA_TERRACOTTA_STAIRS = BLOCKS.register("cut_magenta_terracotta_stairs", () ->
			new CPlusStairBlock(MAGENTA_TERRACOTTA.getDefaultState(), Block.Settings.copy(MAGENTA_TERRACOTTA))),
	CUT_PINK_TERRACOTTA_STAIRS = BLOCKS.register("cut_pink_terracotta_stairs", () ->
			new CPlusStairBlock(PINK_TERRACOTTA.getDefaultState(), Block.Settings.copy(PINK_TERRACOTTA))),
	CUT_WHITE_TERRACOTTA_STAIRS = BLOCKS.register("cut_white_terracotta_stairs", () ->
			new CPlusStairBlock(WHITE_TERRACOTTA.getDefaultState(), Block.Settings.copy(WHITE_TERRACOTTA))),
	CUT_LIGHT_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("cut_light_gray_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	CUT_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("cut_gray_terracotta_stairs", () ->
			new CPlusStairBlock(GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(GRAY_TERRACOTTA))),
	CUT_BLACK_TERRACOTTA_STAIRS = BLOCKS.register("cut_black_terracotta_stairs", () ->
			new CPlusStairBlock(BLACK_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLACK_TERRACOTTA))),
	CUT_BROWN_TERRACOTTA_STAIRS = BLOCKS.register("cut_brown_terracotta_stairs", () ->
			new CPlusStairBlock(BROWN_TERRACOTTA.getDefaultState(), Block.Settings.copy(BROWN_TERRACOTTA))),
	CUT_TERRACOTTA_STAIRS = BLOCKS.register("cut_terracotta_stairs", () ->
			new CPlusStairBlock(TERRACOTTA.getDefaultState(), Block.Settings.copy(TERRACOTTA))),

	// Terracotta Wall
	CUT_RED_TERRACOTTA_WALL = BLOCKS.register("cut_red_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(RED_TERRACOTTA))),
	CUT_ORANGE_TERRACOTTA_WALL = BLOCKS.register("cut_orange_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	CUT_YELLOW_TERRACOTTA_WALL = BLOCKS.register("cut_yellow_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	CUT_LIME_TERRACOTTA_WALL = BLOCKS.register("cut_lime_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	CUT_GREEN_TERRACOTTA_WALL = BLOCKS.register("cut_green_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	CUT_BLUE_TERRACOTTA_WALL = BLOCKS.register("cut_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	CUT_CYAN_TERRACOTTA_WALL = BLOCKS.register("cut_cyan_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	CUT_LIGHT_BLUE_TERRACOTTA_WALL = BLOCKS.register("cut_light_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	CUT_PURPLE_TERRACOTTA_WALL = BLOCKS.register("cut_purple_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	CUT_MAGENTA_TERRACOTTA_WALL = BLOCKS.register("cut_magenta_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	CUT_PINK_TERRACOTTA_WALL = BLOCKS.register("cut_pink_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	CUT_WHITE_TERRACOTTA_WALL = BLOCKS.register("cut_white_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	CUT_LIGHT_GRAY_TERRACOTTA_WALL = BLOCKS.register("cut_light_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	CUT_GRAY_TERRACOTTA_WALL = BLOCKS.register("cut_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	CUT_BLACK_TERRACOTTA_WALL = BLOCKS.register("cut_black_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	CUT_BROWN_TERRACOTTA_WALL = BLOCKS.register("cut_brown_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	CUT_TERRACOTTA_WALL = BLOCKS.register("cut_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(TERRACOTTA))),

	// Terracotta Gates
	CUT_RED_TERRACOTTA_GATE = BLOCKS.register("cut_red_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_TERRACOTTA))),
	CUT_ORANGE_TERRACOTTA_GATE = BLOCKS.register("cut_orange_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	CUT_YELLOW_TERRACOTTA_GATE = BLOCKS.register("cut_yellow_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	CUT_LIME_TERRACOTTA_GATE = BLOCKS.register("cut_lime_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	CUT_GREEN_TERRACOTTA_GATE = BLOCKS.register("cut_green_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	CUT_BLUE_TERRACOTTA_GATE = BLOCKS.register("cut_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	CUT_CYAN_TERRACOTTA_GATE = BLOCKS.register("cut_cyan_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	CUT_LIGHT_BLUE_TERRACOTTA_GATE = BLOCKS.register("cut_light_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	CUT_PURPLE_TERRACOTTA_GATE = BLOCKS.register("cut_purple_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	CUT_MAGENTA_TERRACOTTA_GATE = BLOCKS.register("cut_magenta_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	CUT_PINK_TERRACOTTA_GATE = BLOCKS.register("cut_pink_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	CUT_WHITE_TERRACOTTA_GATE = BLOCKS.register("cut_white_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	CUT_LIGHT_GRAY_TERRACOTTA_GATE = BLOCKS.register("cut_light_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	CUT_GRAY_TERRACOTTA_GATE = BLOCKS.register("cut_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	CUT_BLACK_TERRACOTTA_GATE = BLOCKS.register("cut_black_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	CUT_BROWN_TERRACOTTA_GATE = BLOCKS.register("cut_brown_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	CUT_TERRACOTTA_GATE = BLOCKS.register("cut_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TERRACOTTA))),

	RED_TERRACOTTA_BRICKS = BLOCKS.register("red_terracotta_bricks", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA))),
	ORANGE_TERRACOTTA_BRICKS = BLOCKS.register("orange_terracotta_bricks", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA))),
	YELLOW_TERRACOTTA_BRICKS = BLOCKS.register("yellow_terracotta_bricks", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA))),
	LIME_TERRACOTTA_BRICKS = BLOCKS.register("lime_terracotta_bricks", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA))),
	GREEN_TERRACOTTA_BRICKS = BLOCKS.register("green_terracotta_bricks", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA))),
	BLUE_TERRACOTTA_BRICKS = BLOCKS.register("blue_terracotta_bricks", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA))),
	CYAN_TERRACOTTA_BRICKS = BLOCKS.register("cyan_terracotta_bricks", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA))),
	LIGHT_BLUE_TERRACOTTA_BRICKS = BLOCKS.register("light_blue_terracotta_bricks", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	PURPLE_TERRACOTTA_BRICKS = BLOCKS.register("purple_terracotta_bricks", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA))),
	MAGENTA_TERRACOTTA_BRICKS = BLOCKS.register("magenta_terracotta_bricks", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	PINK_TERRACOTTA_BRICKS = BLOCKS.register("pink_terracotta_bricks", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA))),
	WHITE_TERRACOTTA_BRICKS = BLOCKS.register("white_terracotta_bricks", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA))),
	LIGHT_GRAY_TERRACOTTA_BRICKS = BLOCKS.register("light_gray_terracotta_bricks", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	GRAY_TERRACOTTA_BRICKS = BLOCKS.register("gray_terracotta_bricks", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA))),
	BLACK_TERRACOTTA_BRICKS = BLOCKS.register("black_terracotta_bricks", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA))),
	BROWN_TERRACOTTA_BRICKS = BLOCKS.register("brown_terracotta_bricks", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA))),

	RED_TERRACOTTA_BRICK_SLAB = BLOCKS.register("red_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_TERRACOTTA))),
	ORANGE_TERRACOTTA_BRICK_SLAB = BLOCKS.register("orange_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	YELLOW_TERRACOTTA_BRICK_SLAB = BLOCKS.register("yellow_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	LIME_TERRACOTTA_BRICK_SLAB = BLOCKS.register("lime_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	GREEN_TERRACOTTA_BRICK_SLAB = BLOCKS.register("green_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	BLUE_TERRACOTTA_BRICK_SLAB = BLOCKS.register("blue_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	CYAN_TERRACOTTA_BRICK_SLAB = BLOCKS.register("cyan_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = BLOCKS.register("light_blue_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	PURPLE_TERRACOTTA_BRICK_SLAB = BLOCKS.register("purple_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	MAGENTA_TERRACOTTA_BRICK_SLAB = BLOCKS.register("magenta_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	PINK_TERRACOTTA_BRICK_SLAB = BLOCKS.register("pink_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	WHITE_TERRACOTTA_BRICK_SLAB = BLOCKS.register("white_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = BLOCKS.register("light_gray_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	GRAY_TERRACOTTA_BRICK_SLAB = BLOCKS.register("gray_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	BLACK_TERRACOTTA_BRICK_SLAB = BLOCKS.register("black_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	BROWN_TERRACOTTA_BRICK_SLAB = BLOCKS.register("brown_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_TERRACOTTA))),

	// Terracotta Stairs
	RED_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("red_terracotta_brick_stairs", () ->
			new CPlusStairBlock(RED_TERRACOTTA.getDefaultState(), Block.Settings.copy(RED_TERRACOTTA))),
	ORANGE_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("orange_terracotta_brick_stairs", () ->
			new CPlusStairBlock(ORANGE_TERRACOTTA.getDefaultState(), Block.Settings.copy(ORANGE_TERRACOTTA))),
	YELLOW_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("yellow_terracotta_brick_stairs", () ->
			new CPlusStairBlock(YELLOW_TERRACOTTA.getDefaultState(), Block.Settings.copy(YELLOW_TERRACOTTA))),
	LIME_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("lime_terracotta_brick_stairs", () ->
			new CPlusStairBlock(LIME_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIME_TERRACOTTA))),
	GREEN_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("green_terracotta_brick_stairs", () ->
			new CPlusStairBlock(GREEN_TERRACOTTA.getDefaultState(), Block.Settings.copy(GREEN_TERRACOTTA))),
	BLUE_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("blue_terracotta_brick_stairs", () ->
			new CPlusStairBlock(BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLUE_TERRACOTTA))),
	CYAN_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("cyan_terracotta_brick_stairs", () ->
			new CPlusStairBlock(CYAN_TERRACOTTA.getDefaultState(), Block.Settings.copy(CYAN_TERRACOTTA))),
	LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("light_blue_terracotta_brick_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	PURPLE_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("purple_terracotta_brick_stairs", () ->
			new CPlusStairBlock(PURPLE_TERRACOTTA.getDefaultState(), Block.Settings.copy(PURPLE_TERRACOTTA))),
	MAGENTA_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("magenta_terracotta_brick_stairs", () ->
			new CPlusStairBlock(MAGENTA_TERRACOTTA.getDefaultState(), Block.Settings.copy(MAGENTA_TERRACOTTA))),
	PINK_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("pink_terracotta_brick_stairs", () ->
			new CPlusStairBlock(PINK_TERRACOTTA.getDefaultState(), Block.Settings.copy(PINK_TERRACOTTA))),
	WHITE_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("white_terracotta_brick_stairs", () ->
			new CPlusStairBlock(WHITE_TERRACOTTA.getDefaultState(), Block.Settings.copy(WHITE_TERRACOTTA))),
	LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("light_gray_terracotta_brick_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	GRAY_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("gray_terracotta_brick_stairs", () ->
			new CPlusStairBlock(GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(GRAY_TERRACOTTA))),
	BLACK_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("black_terracotta_brick_stairs", () ->
			new CPlusStairBlock(BLACK_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLACK_TERRACOTTA))),
	BROWN_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("brown_terracotta_brick_stairs", () ->
			new CPlusStairBlock(BROWN_TERRACOTTA.getDefaultState(), Block.Settings.copy(BROWN_TERRACOTTA))),
	// Terracotta Wall
	RED_TERRACOTTA_BRICK_WALL = BLOCKS.register("red_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(RED_TERRACOTTA))),
	ORANGE_TERRACOTTA_BRICK_WALL = BLOCKS.register("orange_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	YELLOW_TERRACOTTA_BRICK_WALL = BLOCKS.register("yellow_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	LIME_TERRACOTTA_BRICK_WALL = BLOCKS.register("lime_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	GREEN_TERRACOTTA_BRICK_WALL = BLOCKS.register("green_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	BLUE_TERRACOTTA_BRICK_WALL = BLOCKS.register("blue_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	CYAN_TERRACOTTA_BRICK_WALL = BLOCKS.register("cyan_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	LIGHT_BLUE_TERRACOTTA_BRICK_WALL = BLOCKS.register("light_blue_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	PURPLE_TERRACOTTA_BRICK_WALL = BLOCKS.register("purple_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	MAGENTA_TERRACOTTA_BRICK_WALL = BLOCKS.register("magenta_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	PINK_TERRACOTTA_BRICK_WALL = BLOCKS.register("pink_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	WHITE_TERRACOTTA_BRICK_WALL = BLOCKS.register("white_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	LIGHT_GRAY_TERRACOTTA_BRICK_WALL = BLOCKS.register("light_gray_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	GRAY_TERRACOTTA_BRICK_WALL = BLOCKS.register("gray_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	BLACK_TERRACOTTA_BRICK_WALL = BLOCKS.register("black_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	BROWN_TERRACOTTA_BRICK_WALL = BLOCKS.register("brown_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_TERRACOTTA))),

	// Terracotta Gates
	RED_TERRACOTTA_BRICK_GATE = BLOCKS.register("red_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_TERRACOTTA))),
	ORANGE_TERRACOTTA_BRICK_GATE = BLOCKS.register("orange_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	YELLOW_TERRACOTTA_BRICK_GATE = BLOCKS.register("yellow_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	LIME_TERRACOTTA_BRICK_GATE = BLOCKS.register("lime_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	GREEN_TERRACOTTA_BRICK_GATE = BLOCKS.register("green_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	BLUE_TERRACOTTA_BRICK_GATE = BLOCKS.register("blue_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	CYAN_TERRACOTTA_BRICK_GATE = BLOCKS.register("cyan_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	LIGHT_BLUE_TERRACOTTA_BRICK_GATE = BLOCKS.register("light_blue_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	PURPLE_TERRACOTTA_BRICK_GATE = BLOCKS.register("purple_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	MAGENTA_TERRACOTTA_BRICK_GATE = BLOCKS.register("magenta_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	PINK_TERRACOTTA_BRICK_GATE = BLOCKS.register("pink_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	WHITE_TERRACOTTA_BRICK_GATE = BLOCKS.register("white_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	LIGHT_GRAY_TERRACOTTA_BRICK_GATE = BLOCKS.register("light_gray_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	GRAY_TERRACOTTA_BRICK_GATE = BLOCKS.register("gray_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	BLACK_TERRACOTTA_BRICK_GATE = BLOCKS.register("black_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	BROWN_TERRACOTTA_BRICK_GATE = BLOCKS.register("brown_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_TERRACOTTA))),

	RED_TERRACOTTA_TILES = BLOCKS.register("red_terracotta_tiles", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA))),
	ORANGE_TERRACOTTA_TILES = BLOCKS.register("orange_terracotta_tiles", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA))),
	YELLOW_TERRACOTTA_TILES = BLOCKS.register("yellow_terracotta_tiles", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA))),
	LIME_TERRACOTTA_TILES = BLOCKS.register("lime_terracotta_tiles", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA))),
	GREEN_TERRACOTTA_TILES = BLOCKS.register("green_terracotta_tiles", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA))),
	BLUE_TERRACOTTA_TILES = BLOCKS.register("blue_terracotta_tiles", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA))),
	CYAN_TERRACOTTA_TILES = BLOCKS.register("cyan_terracotta_tiles", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA))),
	LIGHT_BLUE_TERRACOTTA_TILES = BLOCKS.register("light_blue_terracotta_tiles", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	PURPLE_TERRACOTTA_TILES = BLOCKS.register("purple_terracotta_tiles", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA))),
	MAGENTA_TERRACOTTA_TILES = BLOCKS.register("magenta_terracotta_tiles", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	PINK_TERRACOTTA_TILES = BLOCKS.register("pink_terracotta_tiles", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA))),
	WHITE_TERRACOTTA_TILES = BLOCKS.register("white_terracotta_tiles", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA))),
	LIGHT_GRAY_TERRACOTTA_TILES = BLOCKS.register("light_gray_terracotta_tiles", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	GRAY_TERRACOTTA_TILES = BLOCKS.register("gray_terracotta_tiles", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA))),
	BLACK_TERRACOTTA_TILES = BLOCKS.register("black_terracotta_tiles", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA))),
	BROWN_TERRACOTTA_TILES = BLOCKS.register("brown_terracotta_tiles", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA))),
	TERRACOTTA_TILES = BLOCKS.register("terracotta_tiles", () ->
			new Block(Block.Settings.copy(TERRACOTTA))),

	RED_TERRACOTTA_TILE_SLAB = BLOCKS.register("red_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_TERRACOTTA))),
	ORANGE_TERRACOTTA_TILE_SLAB = BLOCKS.register("orange_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	YELLOW_TERRACOTTA_TILE_SLAB = BLOCKS.register("yellow_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	LIME_TERRACOTTA_TILE_SLAB = BLOCKS.register("lime_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	GREEN_TERRACOTTA_TILE_SLAB = BLOCKS.register("green_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	BLUE_TERRACOTTA_TILE_SLAB = BLOCKS.register("blue_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	CYAN_TERRACOTTA_TILE_SLAB = BLOCKS.register("cyan_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	LIGHT_BLUE_TERRACOTTA_TILE_SLAB = BLOCKS.register("light_blue_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	PURPLE_TERRACOTTA_TILE_SLAB = BLOCKS.register("purple_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	MAGENTA_TERRACOTTA_TILE_SLAB = BLOCKS.register("magenta_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	PINK_TERRACOTTA_TILE_SLAB = BLOCKS.register("pink_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	WHITE_TERRACOTTA_TILE_SLAB = BLOCKS.register("white_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	LIGHT_GRAY_TERRACOTTA_TILE_SLAB = BLOCKS.register("light_gray_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	GRAY_TERRACOTTA_TILE_SLAB = BLOCKS.register("gray_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	BLACK_TERRACOTTA_TILE_SLAB = BLOCKS.register("black_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	BROWN_TERRACOTTA_TILE_SLAB = BLOCKS.register("brown_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	TERRACOTTA_TILE_SLAB = BLOCKS.register("terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(TERRACOTTA))),

	// Terracotta Stairs
	RED_TERRACOTTA_TILE_STAIRS = BLOCKS.register("red_terracotta_tile_stairs", () ->
			new CPlusStairBlock(RED_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(RED_TERRACOTTA))),
	ORANGE_TERRACOTTA_TILE_STAIRS = BLOCKS.register("orange_terracotta_tile_stairs", () ->
			new CPlusStairBlock(ORANGE_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(ORANGE_TERRACOTTA))),
	YELLOW_TERRACOTTA_TILE_STAIRS = BLOCKS.register("yellow_terracotta_tile_stairs", () ->
			new CPlusStairBlock(YELLOW_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(YELLOW_TERRACOTTA))),
	LIME_TERRACOTTA_TILE_STAIRS = BLOCKS.register("lime_terracotta_tile_stairs", () ->
			new CPlusStairBlock(LIME_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(LIME_TERRACOTTA))),
	GREEN_TERRACOTTA_TILE_STAIRS = BLOCKS.register("green_terracotta_tile_stairs", () ->
			new CPlusStairBlock(GREEN_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(GREEN_TERRACOTTA))),
	BLUE_TERRACOTTA_TILE_STAIRS = BLOCKS.register("blue_terracotta_tile_stairs", () ->
			new CPlusStairBlock(BLUE_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(BLUE_TERRACOTTA))),
	CYAN_TERRACOTTA_TILE_STAIRS = BLOCKS.register("cyan_terracotta_tile_stairs", () ->
			new CPlusStairBlock(CYAN_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(CYAN_TERRACOTTA))),
	LIGHT_BLUE_TERRACOTTA_TILE_STAIRS = BLOCKS.register("light_blue_terracotta_tile_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	PURPLE_TERRACOTTA_TILE_STAIRS = BLOCKS.register("purple_terracotta_tile_stairs", () ->
			new CPlusStairBlock(PURPLE_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(PURPLE_TERRACOTTA))),
	MAGENTA_TERRACOTTA_TILE_STAIRS = BLOCKS.register("magenta_terracotta_tile_stairs", () ->
			new CPlusStairBlock(MAGENTA_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(MAGENTA_TERRACOTTA))),
	PINK_TERRACOTTA_TILE_STAIRS = BLOCKS.register("pink_terracotta_tile_stairs", () ->
			new CPlusStairBlock(PINK_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(PINK_TERRACOTTA))),
	WHITE_TERRACOTTA_TILE_STAIRS = BLOCKS.register("white_terracotta_tile_stairs", () ->
			new CPlusStairBlock(WHITE_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(WHITE_TERRACOTTA))),
	LIGHT_GRAY_TERRACOTTA_TILE_STAIRS = BLOCKS.register("light_gray_terracotta_tile_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	GRAY_TERRACOTTA_TILE_STAIRS = BLOCKS.register("gray_terracotta_tile_stairs", () ->
			new CPlusStairBlock(GRAY_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(GRAY_TERRACOTTA))),
	BLACK_TERRACOTTA_TILE_STAIRS = BLOCKS.register("black_terracotta_tile_stairs", () ->
			new CPlusStairBlock(BLACK_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(BLACK_TERRACOTTA))),
	BROWN_TERRACOTTA_TILE_STAIRS = BLOCKS.register("brown_terracotta_tile_stairs", () ->
			new CPlusStairBlock(BROWN_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(BROWN_TERRACOTTA))),
	TERRACOTTA_TILE_STAIRS = BLOCKS.register("terracotta_tile_stairs", () ->
			new CPlusStairBlock(TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(TERRACOTTA))),

	// Terracotta Wall
	RED_TERRACOTTA_TILE_WALL = BLOCKS.register("red_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(RED_TERRACOTTA))),
	ORANGE_TERRACOTTA_TILE_WALL = BLOCKS.register("orange_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	YELLOW_TERRACOTTA_TILE_WALL = BLOCKS.register("yellow_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	LIME_TERRACOTTA_TILE_WALL = BLOCKS.register("lime_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	GREEN_TERRACOTTA_TILE_WALL = BLOCKS.register("green_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	BLUE_TERRACOTTA_TILE_WALL = BLOCKS.register("blue_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	CYAN_TERRACOTTA_TILE_WALL = BLOCKS.register("cyan_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	LIGHT_BLUE_TERRACOTTA_TILE_WALL = BLOCKS.register("light_blue_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	PURPLE_TERRACOTTA_TILE_WALL = BLOCKS.register("purple_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	MAGENTA_TERRACOTTA_TILE_WALL = BLOCKS.register("magenta_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	PINK_TERRACOTTA_TILE_WALL = BLOCKS.register("pink_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	WHITE_TERRACOTTA_TILE_WALL = BLOCKS.register("white_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	LIGHT_GRAY_TERRACOTTA_TILE_WALL = BLOCKS.register("light_gray_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	GRAY_TERRACOTTA_TILE_WALL = BLOCKS.register("gray_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	BLACK_TERRACOTTA_TILE_WALL = BLOCKS.register("black_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	BROWN_TERRACOTTA_TILE_WALL = BLOCKS.register("brown_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	TERRACOTTA_TILE_WALL = BLOCKS.register("terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(TERRACOTTA))),

	// Terracotta Gates
	RED_TERRACOTTA_TILE_GATE = BLOCKS.register("red_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_TERRACOTTA))),
	ORANGE_TERRACOTTA_TILE_GATE = BLOCKS.register("orange_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	YELLOW_TERRACOTTA_TILE_GATE = BLOCKS.register("yellow_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	LIME_TERRACOTTA_TILE_GATE = BLOCKS.register("lime_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	GREEN_TERRACOTTA_TILE_GATE = BLOCKS.register("green_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	BLUE_TERRACOTTA_TILE_GATE = BLOCKS.register("blue_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	CYAN_TERRACOTTA_TILE_GATE = BLOCKS.register("cyan_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	LIGHT_BLUE_TERRACOTTA_TILE_GATE = BLOCKS.register("light_blue_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	PURPLE_TERRACOTTA_TILE_GATE = BLOCKS.register("purple_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	MAGENTA_TERRACOTTA_TILE_GATE = BLOCKS.register("magenta_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	PINK_TERRACOTTA_TILE_GATE = BLOCKS.register("pink_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	WHITE_TERRACOTTA_TILE_GATE = BLOCKS.register("white_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	LIGHT_GRAY_TERRACOTTA_TILE_GATE = BLOCKS.register("light_gray_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	GRAY_TERRACOTTA_TILE_GATE = BLOCKS.register("gray_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	BLACK_TERRACOTTA_TILE_GATE = BLOCKS.register("black_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	BROWN_TERRACOTTA_TILE_GATE = BLOCKS.register("brown_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	TERRACOTTA_TILE_GATE = BLOCKS.register("terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TERRACOTTA))),

	RED_TERRACOTTA_PILLAR = BLOCKS.register("red_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(RED_TERRACOTTA))),
	ORANGE_TERRACOTTA_PILLAR = BLOCKS.register("orange_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(ORANGE_TERRACOTTA))),
	YELLOW_TERRACOTTA_PILLAR = BLOCKS.register("yellow_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(YELLOW_TERRACOTTA))),
	LIME_TERRACOTTA_PILLAR = BLOCKS.register("lime_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(LIME_TERRACOTTA))),
	GREEN_TERRACOTTA_PILLAR = BLOCKS.register("green_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(GREEN_TERRACOTTA))),
	BLUE_TERRACOTTA_PILLAR = BLOCKS.register("blue_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(BLUE_TERRACOTTA))),
	CYAN_TERRACOTTA_PILLAR = BLOCKS.register("cyan_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(CYAN_TERRACOTTA))),
	LIGHT_BLUE_TERRACOTTA_PILLAR = BLOCKS.register("light_blue_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	PURPLE_TERRACOTTA_PILLAR = BLOCKS.register("purple_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(PURPLE_TERRACOTTA))),
	MAGENTA_TERRACOTTA_PILLAR = BLOCKS.register("magenta_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	PINK_TERRACOTTA_PILLAR = BLOCKS.register("pink_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(PINK_TERRACOTTA))),
	WHITE_TERRACOTTA_PILLAR = BLOCKS.register("white_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(WHITE_TERRACOTTA))),
	LIGHT_GRAY_TERRACOTTA_PILLAR = BLOCKS.register("light_gray_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	GRAY_TERRACOTTA_PILLAR = BLOCKS.register("gray_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(GRAY_TERRACOTTA))),
	BLACK_TERRACOTTA_PILLAR = BLOCKS.register("black_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(BLACK_TERRACOTTA))),
	BROWN_TERRACOTTA_PILLAR = BLOCKS.register("brown_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(BROWN_TERRACOTTA))),
	TERRACOTTA_PILLAR = BLOCKS.register("terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(TERRACOTTA))),

	RED_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("red_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA))),
	ORANGE_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("orange_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA))),
	YELLOW_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("yellow_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA))),
	LIME_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("lime_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA))),
	GREEN_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("green_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA))),
	BLUE_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("blue_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA))),
	CYAN_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("cyan_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA))),
	LIGHT_BLUE_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("light_blue_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	PURPLE_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("purple_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA))),
	MAGENTA_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("magenta_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	PINK_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("pink_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA))),
	WHITE_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("white_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA))),
	LIGHT_GRAY_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("light_gray_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	GRAY_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("gray_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA))),
	BLACK_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("black_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA))),
	BROWN_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("brown_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA))),
	TERRACOTTA_CORNER_PILLAR = BLOCKS.register("terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(TERRACOTTA))),


	CHISELED_RED_TERRACOTTA = BLOCKS.register("chiseled_red_terracotta", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA))),
	CHISELED_ORANGE_TERRACOTTA = BLOCKS.register("chiseled_orange_terracotta", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA))),
	CHISELED_YELLOW_TERRACOTTA = BLOCKS.register("chiseled_yellow_terracotta", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA))),
	CHISELED_LIME_TERRACOTTA = BLOCKS.register("chiseled_lime_terracotta", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA))),
	CHISELED_GREEN_TERRACOTTA = BLOCKS.register("chiseled_green_terracotta", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA))),
	CHISELED_BLUE_TERRACOTTA = BLOCKS.register("chiseled_blue_terracotta", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA))),
	CHISELED_CYAN_TERRACOTTA = BLOCKS.register("chiseled_cyan_terracotta", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA))),
	CHISELED_LIGHT_BLUE_TERRACOTTA = BLOCKS.register("chiseled_light_blue_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	CHISELED_PURPLE_TERRACOTTA = BLOCKS.register("chiseled_purple_terracotta", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA))),
	CHISELED_MAGENTA_TERRACOTTA = BLOCKS.register("chiseled_magenta_terracotta", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	CHISELED_PINK_TERRACOTTA = BLOCKS.register("chiseled_pink_terracotta", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA))),
	CHISELED_WHITE_TERRACOTTA = BLOCKS.register("chiseled_white_terracotta", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA))),
	CHISELED_LIGHT_GRAY_TERRACOTTA = BLOCKS.register("chiseled_light_gray_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	CHISELED_GRAY_TERRACOTTA = BLOCKS.register("chiseled_gray_terracotta", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA))),
	CHISELED_BLACK_TERRACOTTA = BLOCKS.register("chiseled_black_terracotta", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA))),
	CHISELED_BROWN_TERRACOTTA = BLOCKS.register("chiseled_brown_terracotta", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA))),
	CHISELED_TERRACOTTA = BLOCKS.register("chiseled_terracotta", () ->
			new Block(Block.Settings.copy(TERRACOTTA))),

	CARVED_RED_TERRACOTTA = BLOCKS.register("carved_red_terracotta", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA))),
	CARVED_ORANGE_TERRACOTTA = BLOCKS.register("carved_orange_terracotta", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA))),
	CARVED_YELLOW_TERRACOTTA = BLOCKS.register("carved_yellow_terracotta", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA))),
	CARVED_LIME_TERRACOTTA = BLOCKS.register("carved_lime_terracotta", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA))),
	CARVED_GREEN_TERRACOTTA = BLOCKS.register("carved_green_terracotta", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA))),
	CARVED_BLUE_TERRACOTTA = BLOCKS.register("carved_blue_terracotta", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA))),
	CARVED_CYAN_TERRACOTTA = BLOCKS.register("carved_cyan_terracotta", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA))),
	CARVED_LIGHT_BLUE_TERRACOTTA = BLOCKS.register("carved_light_blue_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA))),
	CARVED_PURPLE_TERRACOTTA = BLOCKS.register("carved_purple_terracotta", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA))),
	CARVED_MAGENTA_TERRACOTTA = BLOCKS.register("carved_magenta_terracotta", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA))),
	CARVED_PINK_TERRACOTTA = BLOCKS.register("carved_pink_terracotta", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA))),
	CARVED_WHITE_TERRACOTTA = BLOCKS.register("carved_white_terracotta", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA))),
	CARVED_LIGHT_GRAY_TERRACOTTA = BLOCKS.register("carved_light_gray_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA))),
	CARVED_GRAY_TERRACOTTA = BLOCKS.register("carved_gray_terracotta", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA))),
	CARVED_BLACK_TERRACOTTA = BLOCKS.register("carved_black_terracotta", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA))),
	CARVED_BROWN_TERRACOTTA = BLOCKS.register("carved_brown_terracotta", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA))),
	CARVED_TERRACOTTA = BLOCKS.register("carved_terracotta", () ->
			new Block(Block.Settings.copy(TERRACOTTA))),

	//Glazed Terracotta

	//Polished
	POLISHED_RED_GLAZED_TERRACOTTA = BLOCKS.register("polished_red_glazed_terracotta", () ->
			new Block(Block.Settings.copy(RED_GLAZED_TERRACOTTA))),
	POLISHED_ORANGE_GLAZED_TERRACOTTA = BLOCKS.register("polished_orange_glazed_terracotta", () ->
			new Block(Block.Settings.copy(ORANGE_GLAZED_TERRACOTTA))),
	POLISHED_YELLOW_GLAZED_TERRACOTTA = BLOCKS.register("polished_yellow_glazed_terracotta", () ->
			new Block(Block.Settings.copy(YELLOW_GLAZED_TERRACOTTA))),
	POLISHED_LIME_GLAZED_TERRACOTTA = BLOCKS.register("polished_lime_glazed_terracotta", () ->
			new Block(Block.Settings.copy(LIME_GLAZED_TERRACOTTA))),
	POLISHED_GREEN_GLAZED_TERRACOTTA = BLOCKS.register("polished_green_glazed_terracotta", () ->
			new Block(Block.Settings.copy(GREEN_GLAZED_TERRACOTTA))),
	POLISHED_BLUE_GLAZED_TERRACOTTA = BLOCKS.register("polished_blue_glazed_terracotta", () ->
			new Block(Block.Settings.copy(BLUE_GLAZED_TERRACOTTA))),
	POLISHED_CYAN_GLAZED_TERRACOTTA = BLOCKS.register("polished_cyan_glazed_terracotta", () ->
			new Block(Block.Settings.copy(CYAN_GLAZED_TERRACOTTA))),
	POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA = BLOCKS.register("polished_light_blue_glazed_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_GLAZED_TERRACOTTA))),
	POLISHED_PURPLE_GLAZED_TERRACOTTA = BLOCKS.register("polished_purple_glazed_terracotta", () ->
			new Block(Block.Settings.copy(PURPLE_GLAZED_TERRACOTTA))),
	POLISHED_MAGENTA_GLAZED_TERRACOTTA = BLOCKS.register("polished_magenta_glazed_terracotta", () ->
			new Block(Block.Settings.copy(MAGENTA_GLAZED_TERRACOTTA))),
	POLISHED_PINK_GLAZED_TERRACOTTA = BLOCKS.register("polished_pink_glazed_terracotta", () ->
			new Block(Block.Settings.copy(PINK_GLAZED_TERRACOTTA))),
	POLISHED_WHITE_GLAZED_TERRACOTTA = BLOCKS.register("polished_white_glazed_terracotta", () ->
			new Block(Block.Settings.copy(WHITE_GLAZED_TERRACOTTA))),
	POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA = BLOCKS.register("polished_light_gray_glazed_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_GLAZED_TERRACOTTA))),
	POLISHED_GRAY_GLAZED_TERRACOTTA = BLOCKS.register("polished_gray_glazed_terracotta", () ->
			new Block(Block.Settings.copy(GRAY_GLAZED_TERRACOTTA))),
	POLISHED_BLACK_GLAZED_TERRACOTTA = BLOCKS.register("polished_black_glazed_terracotta", () ->
			new Block(Block.Settings.copy(BLACK_GLAZED_TERRACOTTA))),
	POLISHED_BROWN_GLAZED_TERRACOTTA = BLOCKS.register("polished_brown_glazed_terracotta", () ->
			new Block(Block.Settings.copy(BROWN_GLAZED_TERRACOTTA))),
	// Slab
	POLISHED_RED_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_red_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_GLAZED_TERRACOTTA))),
	POLISHED_ORANGE_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_orange_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_GLAZED_TERRACOTTA))),
	POLISHED_YELLOW_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_yellow_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_GLAZED_TERRACOTTA))),
	POLISHED_LIME_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_lime_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_GLAZED_TERRACOTTA))),
	POLISHED_GREEN_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_green_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_GLAZED_TERRACOTTA))),
	POLISHED_BLUE_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_blue_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_GLAZED_TERRACOTTA))),
	POLISHED_CYAN_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_cyan_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_GLAZED_TERRACOTTA))),
	POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_light_blue_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_GLAZED_TERRACOTTA))),
	POLISHED_PURPLE_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_purple_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_GLAZED_TERRACOTTA))),
	POLISHED_MAGENTA_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_magenta_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_GLAZED_TERRACOTTA))),
	POLISHED_PINK_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_pink_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_GLAZED_TERRACOTTA))),
	POLISHED_WHITE_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_white_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_GLAZED_TERRACOTTA))),
	POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_light_gray_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_GLAZED_TERRACOTTA))),
	POLISHED_GRAY_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_gray_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_GLAZED_TERRACOTTA))),
	POLISHED_BLACK_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_black_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_GLAZED_TERRACOTTA))),
	POLISHED_BROWN_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_brown_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_GLAZED_TERRACOTTA))),
	// Stairs
	POLISHED_RED_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_red_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(RED_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(RED_GLAZED_TERRACOTTA))),
	POLISHED_ORANGE_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_orange_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(ORANGE_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(ORANGE_GLAZED_TERRACOTTA))),
	POLISHED_YELLOW_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_yellow_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(YELLOW_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(YELLOW_GLAZED_TERRACOTTA))),
	POLISHED_LIME_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_lime_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(LIME_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIME_GLAZED_TERRACOTTA))),
	POLISHED_GREEN_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_green_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(GREEN_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(GREEN_GLAZED_TERRACOTTA))),
	POLISHED_BLUE_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_blue_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(BLUE_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLUE_GLAZED_TERRACOTTA))),
	POLISHED_CYAN_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_cyan_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(CYAN_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(CYAN_GLAZED_TERRACOTTA))),
	POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_light_blue_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_GLAZED_TERRACOTTA))),
	POLISHED_PURPLE_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_purple_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(PURPLE_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(PURPLE_GLAZED_TERRACOTTA))),
	POLISHED_MAGENTA_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_magenta_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(MAGENTA_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(MAGENTA_GLAZED_TERRACOTTA))),
	POLISHED_PINK_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_pink_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(PINK_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(PINK_GLAZED_TERRACOTTA))),
	POLISHED_WHITE_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_white_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(WHITE_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(WHITE_GLAZED_TERRACOTTA))),
	POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_light_gray_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_GLAZED_TERRACOTTA))),
	POLISHED_GRAY_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_gray_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(GRAY_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(GRAY_GLAZED_TERRACOTTA))),
	POLISHED_BLACK_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_black_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(BLACK_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLACK_GLAZED_TERRACOTTA))),
	POLISHED_BROWN_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_brown_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(BROWN_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(BROWN_GLAZED_TERRACOTTA))),
	// Wall
	POLISHED_RED_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_red_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(RED_GLAZED_TERRACOTTA))),
	POLISHED_ORANGE_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_orange_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_GLAZED_TERRACOTTA))),
	POLISHED_YELLOW_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_yellow_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_GLAZED_TERRACOTTA))),
	POLISHED_LIME_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_lime_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_GLAZED_TERRACOTTA))),
	POLISHED_GREEN_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_green_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_GLAZED_TERRACOTTA))),
	POLISHED_BLUE_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_blue_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_GLAZED_TERRACOTTA))),
	POLISHED_CYAN_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_cyan_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_GLAZED_TERRACOTTA))),
	POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_light_blue_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_GLAZED_TERRACOTTA))),
	POLISHED_PURPLE_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_purple_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_GLAZED_TERRACOTTA))),
	POLISHED_MAGENTA_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_magenta_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_GLAZED_TERRACOTTA))),
	POLISHED_PINK_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_pink_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_GLAZED_TERRACOTTA))),
	POLISHED_WHITE_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_white_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_GLAZED_TERRACOTTA))),
	POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_light_gray_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_GLAZED_TERRACOTTA))),
	POLISHED_GRAY_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_gray_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_GLAZED_TERRACOTTA))),
	POLISHED_BLACK_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_black_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_GLAZED_TERRACOTTA))),
	POLISHED_BROWN_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_brown_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_GLAZED_TERRACOTTA))),
	// Gates
	POLISHED_RED_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_red_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_GLAZED_TERRACOTTA))),
	POLISHED_ORANGE_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_orange_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_GLAZED_TERRACOTTA))),
	POLISHED_YELLOW_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_yellow_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_GLAZED_TERRACOTTA))),
	POLISHED_LIME_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_lime_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_GLAZED_TERRACOTTA))),
	POLISHED_GREEN_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_green_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_GLAZED_TERRACOTTA))),
	POLISHED_BLUE_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_blue_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_GLAZED_TERRACOTTA))),
	POLISHED_CYAN_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_cyan_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_GLAZED_TERRACOTTA))),
	POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_light_blue_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_GLAZED_TERRACOTTA))),
	POLISHED_PURPLE_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_purple_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_GLAZED_TERRACOTTA))),
	POLISHED_MAGENTA_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_magenta_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_GLAZED_TERRACOTTA))),
	POLISHED_PINK_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_pink_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_GLAZED_TERRACOTTA))),
	POLISHED_WHITE_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_white_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_GLAZED_TERRACOTTA))),
	POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_light_gray_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_GLAZED_TERRACOTTA))),
	POLISHED_GRAY_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_gray_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_GLAZED_TERRACOTTA))),
	POLISHED_BLACK_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_black_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_GLAZED_TERRACOTTA))),
	POLISHED_BROWN_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_brown_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_GLAZED_TERRACOTTA))),

	// Concrete
	RED_CONCRETE_SLAB = BLOCKS.register("red_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_CONCRETE))),
	ORANGE_CONCRETE_SLAB = BLOCKS.register("orange_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	YELLOW_CONCRETE_SLAB = BLOCKS.register("yellow_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	LIME_CONCRETE_SLAB = BLOCKS.register("lime_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_CONCRETE))),
	GREEN_CONCRETE_SLAB = BLOCKS.register("green_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_CONCRETE))),
	BLUE_CONCRETE_SLAB = BLOCKS.register("blue_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_CONCRETE))),
	CYAN_CONCRETE_SLAB = BLOCKS.register("cyan_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_CONCRETE))),
	LIGHT_BLUE_CONCRETE_SLAB = BLOCKS.register("light_blue_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	PURPLE_CONCRETE_SLAB = BLOCKS.register("purple_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	MAGENTA_CONCRETE_SLAB = BLOCKS.register("magenta_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	PINK_CONCRETE_SLAB = BLOCKS.register("pink_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_CONCRETE))),
	WHITE_CONCRETE_SLAB = BLOCKS.register("white_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_CONCRETE))),
	LIGHT_GRAY_CONCRETE_SLAB = BLOCKS.register("light_gray_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	GRAY_CONCRETE_SLAB = BLOCKS.register("gray_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_CONCRETE))),
	BLACK_CONCRETE_SLAB = BLOCKS.register("black_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_CONCRETE))),
	BROWN_CONCRETE_SLAB = BLOCKS.register("brown_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_CONCRETE))),

	// Concrete Stairs
	RED_CONCRETE_STAIRS = BLOCKS.register("red_concrete_stairs", () ->
			new CPlusStairBlock(RED_CONCRETE.getDefaultState(), Block.Settings.copy(RED_CONCRETE))),
	ORANGE_CONCRETE_STAIRS = BLOCKS.register("orange_concrete_stairs", () ->
			new CPlusStairBlock(ORANGE_CONCRETE.getDefaultState(), Block.Settings.copy(ORANGE_CONCRETE))),
	YELLOW_CONCRETE_STAIRS = BLOCKS.register("yellow_concrete_stairs", () ->
			new CPlusStairBlock(YELLOW_CONCRETE.getDefaultState(), Block.Settings.copy(YELLOW_CONCRETE))),
	LIME_CONCRETE_STAIRS = BLOCKS.register("lime_concrete_stairs", () ->
			new CPlusStairBlock(LIME_CONCRETE.getDefaultState(), Block.Settings.copy(LIME_CONCRETE))),
	GREEN_CONCRETE_STAIRS = BLOCKS.register("green_concrete_stairs", () ->
			new CPlusStairBlock(GREEN_CONCRETE.getDefaultState(), Block.Settings.copy(GREEN_CONCRETE))),
	BLUE_CONCRETE_STAIRS = BLOCKS.register("blue_concrete_stairs", () ->
			new CPlusStairBlock(BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(BLUE_CONCRETE))),
	CYAN_CONCRETE_STAIRS = BLOCKS.register("cyan_concrete_stairs", () ->
			new CPlusStairBlock(CYAN_CONCRETE.getDefaultState(), Block.Settings.copy(CYAN_CONCRETE))),
	LIGHT_BLUE_CONCRETE_STAIRS = BLOCKS.register("light_blue_concrete_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	PURPLE_CONCRETE_STAIRS = BLOCKS.register("purple_concrete_stairs", () ->
			new CPlusStairBlock(PURPLE_CONCRETE.getDefaultState(), Block.Settings.copy(PURPLE_CONCRETE))),
	MAGENTA_CONCRETE_STAIRS = BLOCKS.register("magenta_concrete_stairs", () ->
			new CPlusStairBlock(MAGENTA_CONCRETE.getDefaultState(), Block.Settings.copy(MAGENTA_CONCRETE))),
	PINK_CONCRETE_STAIRS = BLOCKS.register("pink_concrete_stairs", () ->
			new CPlusStairBlock(PINK_CONCRETE.getDefaultState(), Block.Settings.copy(PINK_CONCRETE))),
	WHITE_CONCRETE_STAIRS = BLOCKS.register("white_concrete_stairs", () ->
			new CPlusStairBlock(WHITE_CONCRETE.getDefaultState(), Block.Settings.copy(WHITE_CONCRETE))),
	LIGHT_GRAY_CONCRETE_STAIRS = BLOCKS.register("light_gray_concrete_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	GRAY_CONCRETE_STAIRS = BLOCKS.register("gray_concrete_stairs", () ->
			new CPlusStairBlock(GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(GRAY_CONCRETE))),
	BLACK_CONCRETE_STAIRS = BLOCKS.register("black_concrete_stairs", () ->
			new CPlusStairBlock(BLACK_CONCRETE.getDefaultState(), Block.Settings.copy(BLACK_CONCRETE))),
	BROWN_CONCRETE_STAIRS = BLOCKS.register("brown_concrete_stairs", () ->
			new CPlusStairBlock(BROWN_CONCRETE.getDefaultState(), Block.Settings.copy(BROWN_CONCRETE))),

	// Terracotta Wall
	RED_CONCRETE_WALL = BLOCKS.register("red_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(RED_CONCRETE))),
	ORANGE_CONCRETE_WALL = BLOCKS.register("orange_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	YELLOW_CONCRETE_WALL = BLOCKS.register("yellow_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	LIME_CONCRETE_WALL = BLOCKS.register("lime_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_CONCRETE))),
	GREEN_CONCRETE_WALL = BLOCKS.register("green_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_CONCRETE))),
	BLUE_CONCRETE_WALL = BLOCKS.register("blue_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_CONCRETE))),
	CYAN_CONCRETE_WALL = BLOCKS.register("cyan_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_CONCRETE))),
	LIGHT_BLUE_CONCRETE_WALL = BLOCKS.register("light_blue_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	PURPLE_CONCRETE_WALL = BLOCKS.register("purple_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	MAGENTA_CONCRETE_WALL = BLOCKS.register("magenta_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	PINK_CONCRETE_WALL = BLOCKS.register("pink_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_CONCRETE))),
	WHITE_CONCRETE_WALL = BLOCKS.register("white_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_CONCRETE))),
	LIGHT_GRAY_CONCRETE_WALL = BLOCKS.register("light_gray_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	GRAY_CONCRETE_WALL = BLOCKS.register("gray_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_CONCRETE))),
	BLACK_CONCRETE_WALL = BLOCKS.register("black_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_CONCRETE))),
	BROWN_CONCRETE_WALL = BLOCKS.register("brown_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_CONCRETE))),

	// Terracotta Gates
	RED_CONCRETE_GATE = BLOCKS.register("red_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_CONCRETE))),
	ORANGE_CONCRETE_GATE = BLOCKS.register("orange_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	YELLOW_CONCRETE_GATE = BLOCKS.register("yellow_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	LIME_CONCRETE_GATE = BLOCKS.register("lime_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_CONCRETE))),
	GREEN_CONCRETE_GATE = BLOCKS.register("green_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_CONCRETE))),
	BLUE_CONCRETE_GATE = BLOCKS.register("blue_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_CONCRETE))),
	CYAN_CONCRETE_GATE = BLOCKS.register("cyan_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_CONCRETE))),
	LIGHT_BLUE_CONCRETE_GATE = BLOCKS.register("light_blue_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	PURPLE_CONCRETE_GATE = BLOCKS.register("purple_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	MAGENTA_CONCRETE_GATE = BLOCKS.register("magenta_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	PINK_CONCRETE_GATE = BLOCKS.register("pink_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_CONCRETE))),
	WHITE_CONCRETE_GATE = BLOCKS.register("white_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_CONCRETE))),
	LIGHT_GRAY_CONCRETE_GATE = BLOCKS.register("light_gray_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	GRAY_CONCRETE_GATE = BLOCKS.register("gray_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_CONCRETE))),
	BLACK_CONCRETE_GATE = BLOCKS.register("black_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_CONCRETE))),
	BROWN_CONCRETE_GATE = BLOCKS.register("brown_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_CONCRETE))),

	SMOOTH_RED_CONCRETE = BLOCKS.register("smooth_red_concrete", () ->
			new Block(Block.Settings.copy(RED_CONCRETE))),
	SMOOTH_ORANGE_CONCRETE = BLOCKS.register("smooth_orange_concrete", () ->
			new Block(Block.Settings.copy(ORANGE_CONCRETE))),
	SMOOTH_YELLOW_CONCRETE = BLOCKS.register("smooth_yellow_concrete", () ->
			new Block(Block.Settings.copy(YELLOW_CONCRETE))),
	SMOOTH_LIME_CONCRETE = BLOCKS.register("smooth_lime_concrete", () ->
			new Block(Block.Settings.copy(LIME_CONCRETE))),
	SMOOTH_GREEN_CONCRETE = BLOCKS.register("smooth_green_concrete", () ->
			new Block(Block.Settings.copy(GREEN_CONCRETE))),
	SMOOTH_BLUE_CONCRETE = BLOCKS.register("smooth_blue_concrete", () ->
			new Block(Block.Settings.copy(BLUE_CONCRETE))),
	SMOOTH_CYAN_CONCRETE = BLOCKS.register("smooth_cyan_concrete", () ->
			new Block(Block.Settings.copy(CYAN_CONCRETE))),
	SMOOTH_LIGHT_BLUE_CONCRETE = BLOCKS.register("smooth_light_blue_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	SMOOTH_PURPLE_CONCRETE = BLOCKS.register("smooth_purple_concrete", () ->
			new Block(Block.Settings.copy(PURPLE_CONCRETE))),
	SMOOTH_MAGENTA_CONCRETE = BLOCKS.register("smooth_magenta_concrete", () ->
			new Block(Block.Settings.copy(MAGENTA_CONCRETE))),
	SMOOTH_PINK_CONCRETE = BLOCKS.register("smooth_pink_concrete", () ->
			new Block(Block.Settings.copy(PINK_CONCRETE))),
	SMOOTH_WHITE_CONCRETE = BLOCKS.register("smooth_white_concrete", () ->
			new Block(Block.Settings.copy(WHITE_CONCRETE))),
	SMOOTH_LIGHT_GRAY_CONCRETE = BLOCKS.register("smooth_light_gray_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	SMOOTH_GRAY_CONCRETE = BLOCKS.register("smooth_gray_concrete", () ->
			new Block(Block.Settings.copy(GRAY_CONCRETE))),
	SMOOTH_BLACK_CONCRETE = BLOCKS.register("smooth_black_concrete", () ->
			new Block(Block.Settings.copy(BLACK_CONCRETE))),
	SMOOTH_BROWN_CONCRETE = BLOCKS.register("smooth_brown_concrete", () ->
			new Block(Block.Settings.copy(BROWN_CONCRETE))),

	SMOOTH_RED_CONCRETE_SLAB = BLOCKS.register("smooth_red_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_CONCRETE))),
	SMOOTH_ORANGE_CONCRETE_SLAB = BLOCKS.register("smooth_orange_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	SMOOTH_YELLOW_CONCRETE_SLAB = BLOCKS.register("smooth_yellow_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	SMOOTH_LIME_CONCRETE_SLAB = BLOCKS.register("smooth_lime_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_CONCRETE))),
	SMOOTH_GREEN_CONCRETE_SLAB = BLOCKS.register("smooth_green_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_CONCRETE))),
	SMOOTH_BLUE_CONCRETE_SLAB = BLOCKS.register("smooth_blue_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_CONCRETE))),
	SMOOTH_CYAN_CONCRETE_SLAB = BLOCKS.register("smooth_cyan_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_CONCRETE))),
	SMOOTH_LIGHT_BLUE_CONCRETE_SLAB = BLOCKS.register("smooth_light_blue_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	SMOOTH_PURPLE_CONCRETE_SLAB = BLOCKS.register("smooth_purple_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	SMOOTH_MAGENTA_CONCRETE_SLAB = BLOCKS.register("smooth_magenta_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	SMOOTH_PINK_CONCRETE_SLAB = BLOCKS.register("smooth_pink_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_CONCRETE))),
	SMOOTH_WHITE_CONCRETE_SLAB = BLOCKS.register("smooth_white_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_CONCRETE))),
	SMOOTH_LIGHT_GRAY_CONCRETE_SLAB = BLOCKS.register("smooth_light_gray_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	SMOOTH_GRAY_CONCRETE_SLAB = BLOCKS.register("smooth_gray_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_CONCRETE))),
	SMOOTH_BLACK_CONCRETE_SLAB = BLOCKS.register("smooth_black_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_CONCRETE))),
	SMOOTH_BROWN_CONCRETE_SLAB = BLOCKS.register("smooth_brown_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_CONCRETE))),

	// Terracotta Stairs
	SMOOTH_RED_CONCRETE_STAIRS = BLOCKS.register("smooth_red_concrete_stairs", () ->
			new CPlusStairBlock(RED_CONCRETE.getDefaultState(), Block.Settings.copy(RED_CONCRETE))),
	SMOOTH_ORANGE_CONCRETE_STAIRS = BLOCKS.register("smooth_orange_concrete_stairs", () ->
			new CPlusStairBlock(ORANGE_CONCRETE.getDefaultState(), Block.Settings.copy(ORANGE_CONCRETE))),
	SMOOTH_YELLOW_CONCRETE_STAIRS = BLOCKS.register("smooth_yellow_concrete_stairs", () ->
			new CPlusStairBlock(YELLOW_CONCRETE.getDefaultState(), Block.Settings.copy(YELLOW_CONCRETE))),
	SMOOTH_LIME_CONCRETE_STAIRS = BLOCKS.register("smooth_lime_concrete_stairs", () ->
			new CPlusStairBlock(LIME_CONCRETE.getDefaultState(), Block.Settings.copy(LIME_CONCRETE))),
	SMOOTH_GREEN_CONCRETE_STAIRS = BLOCKS.register("smooth_green_concrete_stairs", () ->
			new CPlusStairBlock(GREEN_CONCRETE.getDefaultState(), Block.Settings.copy(GREEN_CONCRETE))),
	SMOOTH_BLUE_CONCRETE_STAIRS = BLOCKS.register("smooth_blue_concrete_stairs", () ->
			new CPlusStairBlock(BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(BLUE_CONCRETE))),
	SMOOTH_CYAN_CONCRETE_STAIRS = BLOCKS.register("smooth_cyan_concrete_stairs", () ->
			new CPlusStairBlock(CYAN_CONCRETE.getDefaultState(), Block.Settings.copy(CYAN_CONCRETE))),
	SMOOTH_LIGHT_BLUE_CONCRETE_STAIRS = BLOCKS.register("smooth_light_blue_concrete_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	SMOOTH_PURPLE_CONCRETE_STAIRS = BLOCKS.register("smooth_purple_concrete_stairs", () ->
			new CPlusStairBlock(PURPLE_CONCRETE.getDefaultState(), Block.Settings.copy(PURPLE_CONCRETE))),
	SMOOTH_MAGENTA_CONCRETE_STAIRS = BLOCKS.register("smooth_magenta_concrete_stairs", () ->
			new CPlusStairBlock(MAGENTA_CONCRETE.getDefaultState(), Block.Settings.copy(MAGENTA_CONCRETE))),
	SMOOTH_PINK_CONCRETE_STAIRS = BLOCKS.register("smooth_pink_concrete_stairs", () ->
			new CPlusStairBlock(PINK_CONCRETE.getDefaultState(), Block.Settings.copy(PINK_CONCRETE))),
	SMOOTH_WHITE_CONCRETE_STAIRS = BLOCKS.register("smooth_white_concrete_stairs", () ->
			new CPlusStairBlock(WHITE_CONCRETE.getDefaultState(), Block.Settings.copy(WHITE_CONCRETE))),
	SMOOTH_LIGHT_GRAY_CONCRETE_STAIRS = BLOCKS.register("smooth_light_gray_concrete_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	SMOOTH_GRAY_CONCRETE_STAIRS = BLOCKS.register("smooth_gray_concrete_stairs", () ->
			new CPlusStairBlock(GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(GRAY_CONCRETE))),
	SMOOTH_BLACK_CONCRETE_STAIRS = BLOCKS.register("smooth_black_concrete_stairs", () ->
			new CPlusStairBlock(BLACK_CONCRETE.getDefaultState(), Block.Settings.copy(BLACK_CONCRETE))),
	SMOOTH_BROWN_CONCRETE_STAIRS = BLOCKS.register("smooth_brown_concrete_stairs", () ->
			new CPlusStairBlock(BROWN_CONCRETE.getDefaultState(), Block.Settings.copy(BROWN_CONCRETE))),

	// Terracotta Wall
	SMOOTH_RED_CONCRETE_WALL = BLOCKS.register("smooth_red_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(RED_CONCRETE))),
	SMOOTH_ORANGE_CONCRETE_WALL = BLOCKS.register("smooth_orange_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	SMOOTH_YELLOW_CONCRETE_WALL = BLOCKS.register("smooth_yellow_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	SMOOTH_LIME_CONCRETE_WALL = BLOCKS.register("smooth_lime_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_CONCRETE))),
	SMOOTH_GREEN_CONCRETE_WALL = BLOCKS.register("smooth_green_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_CONCRETE))),
	SMOOTH_BLUE_CONCRETE_WALL = BLOCKS.register("smooth_blue_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_CONCRETE))),
	SMOOTH_CYAN_CONCRETE_WALL = BLOCKS.register("smooth_cyan_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_CONCRETE))),
	SMOOTH_LIGHT_BLUE_CONCRETE_WALL = BLOCKS.register("smooth_light_blue_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	SMOOTH_PURPLE_CONCRETE_WALL = BLOCKS.register("smooth_purple_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	SMOOTH_MAGENTA_CONCRETE_WALL = BLOCKS.register("smooth_magenta_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	SMOOTH_PINK_CONCRETE_WALL = BLOCKS.register("smooth_pink_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_CONCRETE))),
	SMOOTH_WHITE_CONCRETE_WALL = BLOCKS.register("smooth_white_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_CONCRETE))),
	SMOOTH_LIGHT_GRAY_CONCRETE_WALL = BLOCKS.register("smooth_light_gray_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	SMOOTH_GRAY_CONCRETE_WALL = BLOCKS.register("smooth_gray_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_CONCRETE))),
	SMOOTH_BLACK_CONCRETE_WALL = BLOCKS.register("smooth_black_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_CONCRETE))),
	SMOOTH_BROWN_CONCRETE_WALL = BLOCKS.register("smooth_brown_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_CONCRETE))),

	// Terracotta Gates
	SMOOTH_RED_CONCRETE_GATE = BLOCKS.register("smooth_red_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_CONCRETE))),
	SMOOTH_ORANGE_CONCRETE_GATE = BLOCKS.register("smooth_orange_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	SMOOTH_YELLOW_CONCRETE_GATE = BLOCKS.register("smooth_yellow_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	SMOOTH_LIME_CONCRETE_GATE = BLOCKS.register("smooth_lime_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_CONCRETE))),
	SMOOTH_GREEN_CONCRETE_GATE = BLOCKS.register("smooth_green_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_CONCRETE))),
	SMOOTH_BLUE_CONCRETE_GATE = BLOCKS.register("smooth_blue_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_CONCRETE))),
	SMOOTH_CYAN_CONCRETE_GATE = BLOCKS.register("smooth_cyan_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_CONCRETE))),
	SMOOTH_LIGHT_BLUE_CONCRETE_GATE = BLOCKS.register("smooth_light_blue_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	SMOOTH_PURPLE_CONCRETE_GATE = BLOCKS.register("smooth_purple_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	SMOOTH_MAGENTA_CONCRETE_GATE = BLOCKS.register("smooth_magenta_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	SMOOTH_PINK_CONCRETE_GATE = BLOCKS.register("smooth_pink_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_CONCRETE))),
	SMOOTH_WHITE_CONCRETE_GATE = BLOCKS.register("smooth_white_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_CONCRETE))),
	SMOOTH_LIGHT_GRAY_CONCRETE_GATE = BLOCKS.register("smooth_light_gray_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	SMOOTH_GRAY_CONCRETE_GATE = BLOCKS.register("smooth_gray_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_CONCRETE))),
	SMOOTH_BLACK_CONCRETE_GATE = BLOCKS.register("smooth_black_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_CONCRETE))),
	SMOOTH_BROWN_CONCRETE_GATE = BLOCKS.register("smooth_brown_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_CONCRETE))),

	POLISHED_RED_CONCRETE = BLOCKS.register("polished_red_concrete", () ->
			new Block(Block.Settings.copy(RED_CONCRETE))),
	POLISHED_ORANGE_CONCRETE = BLOCKS.register("polished_orange_concrete", () ->
			new Block(Block.Settings.copy(ORANGE_CONCRETE))),
	POLISHED_YELLOW_CONCRETE = BLOCKS.register("polished_yellow_concrete", () ->
			new Block(Block.Settings.copy(YELLOW_CONCRETE))),
	POLISHED_LIME_CONCRETE = BLOCKS.register("polished_lime_concrete", () ->
			new Block(Block.Settings.copy(LIME_CONCRETE))),
	POLISHED_GREEN_CONCRETE = BLOCKS.register("polished_green_concrete", () ->
			new Block(Block.Settings.copy(GREEN_CONCRETE))),
	POLISHED_BLUE_CONCRETE = BLOCKS.register("polished_blue_concrete", () ->
			new Block(Block.Settings.copy(BLUE_CONCRETE))),
	POLISHED_CYAN_CONCRETE = BLOCKS.register("polished_cyan_concrete", () ->
			new Block(Block.Settings.copy(CYAN_CONCRETE))),
	POLISHED_LIGHT_BLUE_CONCRETE = BLOCKS.register("polished_light_blue_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	POLISHED_PURPLE_CONCRETE = BLOCKS.register("polished_purple_concrete", () ->
			new Block(Block.Settings.copy(PURPLE_CONCRETE))),
	POLISHED_MAGENTA_CONCRETE = BLOCKS.register("polished_magenta_concrete", () ->
			new Block(Block.Settings.copy(MAGENTA_CONCRETE))),
	POLISHED_PINK_CONCRETE = BLOCKS.register("polished_pink_concrete", () ->
			new Block(Block.Settings.copy(PINK_CONCRETE))),
	POLISHED_WHITE_CONCRETE = BLOCKS.register("polished_white_concrete", () ->
			new Block(Block.Settings.copy(WHITE_CONCRETE))),
	POLISHED_LIGHT_GRAY_CONCRETE = BLOCKS.register("polished_light_gray_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	POLISHED_GRAY_CONCRETE = BLOCKS.register("polished_gray_concrete", () ->
			new Block(Block.Settings.copy(GRAY_CONCRETE))),
	POLISHED_BLACK_CONCRETE = BLOCKS.register("polished_black_concrete", () ->
			new Block(Block.Settings.copy(BLACK_CONCRETE))),
	POLISHED_BROWN_CONCRETE = BLOCKS.register("polished_brown_concrete", () ->
			new Block(Block.Settings.copy(BROWN_CONCRETE))),

	POLISHED_RED_CONCRETE_SLAB = BLOCKS.register("polished_red_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_CONCRETE))),
	POLISHED_ORANGE_CONCRETE_SLAB = BLOCKS.register("polished_orange_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	POLISHED_YELLOW_CONCRETE_SLAB = BLOCKS.register("polished_yellow_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	POLISHED_LIME_CONCRETE_SLAB = BLOCKS.register("polished_lime_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_CONCRETE))),
	POLISHED_GREEN_CONCRETE_SLAB = BLOCKS.register("polished_green_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_CONCRETE))),
	POLISHED_BLUE_CONCRETE_SLAB = BLOCKS.register("polished_blue_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_CONCRETE))),
	POLISHED_CYAN_CONCRETE_SLAB = BLOCKS.register("polished_cyan_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_CONCRETE))),
	POLISHED_LIGHT_BLUE_CONCRETE_SLAB = BLOCKS.register("polished_light_blue_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	POLISHED_PURPLE_CONCRETE_SLAB = BLOCKS.register("polished_purple_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	POLISHED_MAGENTA_CONCRETE_SLAB = BLOCKS.register("polished_magenta_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	POLISHED_PINK_CONCRETE_SLAB = BLOCKS.register("polished_pink_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_CONCRETE))),
	POLISHED_WHITE_CONCRETE_SLAB = BLOCKS.register("polished_white_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_CONCRETE))),
	POLISHED_LIGHT_GRAY_CONCRETE_SLAB = BLOCKS.register("polished_light_gray_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	POLISHED_GRAY_CONCRETE_SLAB = BLOCKS.register("polished_gray_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_CONCRETE))),
	POLISHED_BLACK_CONCRETE_SLAB = BLOCKS.register("polished_black_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_CONCRETE))),
	POLISHED_BROWN_CONCRETE_SLAB = BLOCKS.register("polished_brown_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_CONCRETE))),

	// Terracotta Stairs
	POLISHED_RED_CONCRETE_STAIRS = BLOCKS.register("polished_red_concrete_stairs", () ->
			new CPlusStairBlock(RED_CONCRETE.getDefaultState(), Block.Settings.copy(RED_CONCRETE))),
	POLISHED_ORANGE_CONCRETE_STAIRS = BLOCKS.register("polished_orange_concrete_stairs", () ->
			new CPlusStairBlock(ORANGE_CONCRETE.getDefaultState(), Block.Settings.copy(ORANGE_CONCRETE))),
	POLISHED_YELLOW_CONCRETE_STAIRS = BLOCKS.register("polished_yellow_concrete_stairs", () ->
			new CPlusStairBlock(YELLOW_CONCRETE.getDefaultState(), Block.Settings.copy(YELLOW_CONCRETE))),
	POLISHED_LIME_CONCRETE_STAIRS = BLOCKS.register("polished_lime_concrete_stairs", () ->
			new CPlusStairBlock(LIME_CONCRETE.getDefaultState(), Block.Settings.copy(LIME_CONCRETE))),
	POLISHED_GREEN_CONCRETE_STAIRS = BLOCKS.register("polished_green_concrete_stairs", () ->
			new CPlusStairBlock(GREEN_CONCRETE.getDefaultState(), Block.Settings.copy(GREEN_CONCRETE))),
	POLISHED_BLUE_CONCRETE_STAIRS = BLOCKS.register("polished_blue_concrete_stairs", () ->
			new CPlusStairBlock(BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(BLUE_CONCRETE))),
	POLISHED_CYAN_CONCRETE_STAIRS = BLOCKS.register("polished_cyan_concrete_stairs", () ->
			new CPlusStairBlock(CYAN_CONCRETE.getDefaultState(), Block.Settings.copy(CYAN_CONCRETE))),
	POLISHED_LIGHT_BLUE_CONCRETE_STAIRS = BLOCKS.register("polished_light_blue_concrete_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	POLISHED_PURPLE_CONCRETE_STAIRS = BLOCKS.register("polished_purple_concrete_stairs", () ->
			new CPlusStairBlock(PURPLE_CONCRETE.getDefaultState(), Block.Settings.copy(PURPLE_CONCRETE))),
	POLISHED_MAGENTA_CONCRETE_STAIRS = BLOCKS.register("polished_magenta_concrete_stairs", () ->
			new CPlusStairBlock(MAGENTA_CONCRETE.getDefaultState(), Block.Settings.copy(MAGENTA_CONCRETE))),
	POLISHED_PINK_CONCRETE_STAIRS = BLOCKS.register("polished_pink_concrete_stairs", () ->
			new CPlusStairBlock(PINK_CONCRETE.getDefaultState(), Block.Settings.copy(PINK_CONCRETE))),
	POLISHED_WHITE_CONCRETE_STAIRS = BLOCKS.register("polished_white_concrete_stairs", () ->
			new CPlusStairBlock(WHITE_CONCRETE.getDefaultState(), Block.Settings.copy(WHITE_CONCRETE))),
	POLISHED_LIGHT_GRAY_CONCRETE_STAIRS = BLOCKS.register("polished_light_gray_concrete_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	POLISHED_GRAY_CONCRETE_STAIRS = BLOCKS.register("polished_gray_concrete_stairs", () ->
			new CPlusStairBlock(GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(GRAY_CONCRETE))),
	POLISHED_BLACK_CONCRETE_STAIRS = BLOCKS.register("polished_black_concrete_stairs", () ->
			new CPlusStairBlock(BLACK_CONCRETE.getDefaultState(), Block.Settings.copy(BLACK_CONCRETE))),
	POLISHED_BROWN_CONCRETE_STAIRS = BLOCKS.register("polished_brown_concrete_stairs", () ->
			new CPlusStairBlock(BROWN_CONCRETE.getDefaultState(), Block.Settings.copy(BROWN_CONCRETE))),

	// Terracotta Wall
	POLISHED_RED_CONCRETE_WALL = BLOCKS.register("polished_red_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(RED_CONCRETE))),
	POLISHED_ORANGE_CONCRETE_WALL = BLOCKS.register("polished_orange_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	POLISHED_YELLOW_CONCRETE_WALL = BLOCKS.register("polished_yellow_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	POLISHED_LIME_CONCRETE_WALL = BLOCKS.register("polished_lime_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_CONCRETE))),
	POLISHED_GREEN_CONCRETE_WALL = BLOCKS.register("polished_green_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_CONCRETE))),
	POLISHED_BLUE_CONCRETE_WALL = BLOCKS.register("polished_blue_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_CONCRETE))),
	POLISHED_CYAN_CONCRETE_WALL = BLOCKS.register("polished_cyan_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_CONCRETE))),
	POLISHED_LIGHT_BLUE_CONCRETE_WALL = BLOCKS.register("polished_light_blue_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	POLISHED_PURPLE_CONCRETE_WALL = BLOCKS.register("polished_purple_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	POLISHED_MAGENTA_CONCRETE_WALL = BLOCKS.register("polished_magenta_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	POLISHED_PINK_CONCRETE_WALL = BLOCKS.register("polished_pink_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_CONCRETE))),
	POLISHED_WHITE_CONCRETE_WALL = BLOCKS.register("polished_white_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_CONCRETE))),
	POLISHED_LIGHT_GRAY_CONCRETE_WALL = BLOCKS.register("polished_light_gray_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	POLISHED_GRAY_CONCRETE_WALL = BLOCKS.register("polished_gray_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_CONCRETE))),
	POLISHED_BLACK_CONCRETE_WALL = BLOCKS.register("polished_black_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_CONCRETE))),
	POLISHED_BROWN_CONCRETE_WALL = BLOCKS.register("polished_brown_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_CONCRETE))),

	// Terracotta Gates
	POLISHED_RED_CONCRETE_GATE = BLOCKS.register("polished_red_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_CONCRETE))),
	POLISHED_ORANGE_CONCRETE_GATE = BLOCKS.register("polished_orange_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	POLISHED_YELLOW_CONCRETE_GATE = BLOCKS.register("polished_yellow_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	POLISHED_LIME_CONCRETE_GATE = BLOCKS.register("polished_lime_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_CONCRETE))),
	POLISHED_GREEN_CONCRETE_GATE = BLOCKS.register("polished_green_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_CONCRETE))),
	POLISHED_BLUE_CONCRETE_GATE = BLOCKS.register("polished_blue_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_CONCRETE))),
	POLISHED_CYAN_CONCRETE_GATE = BLOCKS.register("polished_cyan_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_CONCRETE))),
	POLISHED_LIGHT_BLUE_CONCRETE_GATE = BLOCKS.register("polished_light_blue_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	POLISHED_PURPLE_CONCRETE_GATE = BLOCKS.register("polished_purple_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	POLISHED_MAGENTA_CONCRETE_GATE = BLOCKS.register("polished_magenta_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	POLISHED_PINK_CONCRETE_GATE = BLOCKS.register("polished_pink_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_CONCRETE))),
	POLISHED_WHITE_CONCRETE_GATE = BLOCKS.register("polished_white_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_CONCRETE))),
	POLISHED_LIGHT_GRAY_CONCRETE_GATE = BLOCKS.register("polished_light_gray_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	POLISHED_GRAY_CONCRETE_GATE = BLOCKS.register("polished_gray_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_CONCRETE))),
	POLISHED_BLACK_CONCRETE_GATE = BLOCKS.register("polished_black_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_CONCRETE))),
	POLISHED_BROWN_CONCRETE_GATE = BLOCKS.register("polished_brown_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_CONCRETE))),

	CUT_RED_CONCRETE = BLOCKS.register("cut_red_concrete", () ->
			new Block(Block.Settings.copy(RED_CONCRETE))),
	CUT_ORANGE_CONCRETE = BLOCKS.register("cut_orange_concrete", () ->
			new Block(Block.Settings.copy(ORANGE_CONCRETE))),
	CUT_YELLOW_CONCRETE = BLOCKS.register("cut_yellow_concrete", () ->
			new Block(Block.Settings.copy(YELLOW_CONCRETE))),
	CUT_LIME_CONCRETE = BLOCKS.register("cut_lime_concrete", () ->
			new Block(Block.Settings.copy(LIME_CONCRETE))),
	CUT_GREEN_CONCRETE = BLOCKS.register("cut_green_concrete", () ->
			new Block(Block.Settings.copy(GREEN_CONCRETE))),
	CUT_BLUE_CONCRETE = BLOCKS.register("cut_blue_concrete", () ->
			new Block(Block.Settings.copy(BLUE_CONCRETE))),
	CUT_CYAN_CONCRETE = BLOCKS.register("cut_cyan_concrete", () ->
			new Block(Block.Settings.copy(CYAN_CONCRETE))),
	CUT_LIGHT_BLUE_CONCRETE = BLOCKS.register("cut_light_blue_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	CUT_PURPLE_CONCRETE = BLOCKS.register("cut_purple_concrete", () ->
			new Block(Block.Settings.copy(PURPLE_CONCRETE))),
	CUT_MAGENTA_CONCRETE = BLOCKS.register("cut_magenta_concrete", () ->
			new Block(Block.Settings.copy(MAGENTA_CONCRETE))),
	CUT_PINK_CONCRETE = BLOCKS.register("cut_pink_concrete", () ->
			new Block(Block.Settings.copy(PINK_CONCRETE))),
	CUT_WHITE_CONCRETE = BLOCKS.register("cut_white_concrete", () ->
			new Block(Block.Settings.copy(WHITE_CONCRETE))),
	CUT_LIGHT_GRAY_CONCRETE = BLOCKS.register("cut_light_gray_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	CUT_GRAY_CONCRETE = BLOCKS.register("cut_gray_concrete", () ->
			new Block(Block.Settings.copy(GRAY_CONCRETE))),
	CUT_BLACK_CONCRETE = BLOCKS.register("cut_black_concrete", () ->
			new Block(Block.Settings.copy(BLACK_CONCRETE))),
	CUT_BROWN_CONCRETE = BLOCKS.register("cut_brown_concrete", () ->
			new Block(Block.Settings.copy(BROWN_CONCRETE))),

	CUT_RED_CONCRETE_SLAB = BLOCKS.register("cut_red_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_CONCRETE))),
	CUT_ORANGE_CONCRETE_SLAB = BLOCKS.register("cut_orange_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	CUT_YELLOW_CONCRETE_SLAB = BLOCKS.register("cut_yellow_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	CUT_LIME_CONCRETE_SLAB = BLOCKS.register("cut_lime_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_CONCRETE))),
	CUT_GREEN_CONCRETE_SLAB = BLOCKS.register("cut_green_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_CONCRETE))),
	CUT_BLUE_CONCRETE_SLAB = BLOCKS.register("cut_blue_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_CONCRETE))),
	CUT_CYAN_CONCRETE_SLAB = BLOCKS.register("cut_cyan_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_CONCRETE))),
	CUT_LIGHT_BLUE_CONCRETE_SLAB = BLOCKS.register("cut_light_blue_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	CUT_PURPLE_CONCRETE_SLAB = BLOCKS.register("cut_purple_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	CUT_MAGENTA_CONCRETE_SLAB = BLOCKS.register("cut_magenta_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	CUT_PINK_CONCRETE_SLAB = BLOCKS.register("cut_pink_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_CONCRETE))),
	CUT_WHITE_CONCRETE_SLAB = BLOCKS.register("cut_white_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_CONCRETE))),
	CUT_LIGHT_GRAY_CONCRETE_SLAB = BLOCKS.register("cut_light_gray_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	CUT_GRAY_CONCRETE_SLAB = BLOCKS.register("cut_gray_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_CONCRETE))),
	CUT_BLACK_CONCRETE_SLAB = BLOCKS.register("cut_black_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_CONCRETE))),
	CUT_BROWN_CONCRETE_SLAB = BLOCKS.register("cut_brown_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_CONCRETE))),

	// Terracotta Stairs
	CUT_RED_CONCRETE_STAIRS = BLOCKS.register("cut_red_concrete_stairs", () ->
			new CPlusStairBlock(RED_CONCRETE.getDefaultState(), Block.Settings.copy(RED_CONCRETE))),
	CUT_ORANGE_CONCRETE_STAIRS = BLOCKS.register("cut_orange_concrete_stairs", () ->
			new CPlusStairBlock(ORANGE_CONCRETE.getDefaultState(), Block.Settings.copy(ORANGE_CONCRETE))),
	CUT_YELLOW_CONCRETE_STAIRS = BLOCKS.register("cut_yellow_concrete_stairs", () ->
			new CPlusStairBlock(YELLOW_CONCRETE.getDefaultState(), Block.Settings.copy(YELLOW_CONCRETE))),
	CUT_LIME_CONCRETE_STAIRS = BLOCKS.register("cut_lime_concrete_stairs", () ->
			new CPlusStairBlock(LIME_CONCRETE.getDefaultState(), Block.Settings.copy(LIME_CONCRETE))),
	CUT_GREEN_CONCRETE_STAIRS = BLOCKS.register("cut_green_concrete_stairs", () ->
			new CPlusStairBlock(GREEN_CONCRETE.getDefaultState(), Block.Settings.copy(GREEN_CONCRETE))),
	CUT_BLUE_CONCRETE_STAIRS = BLOCKS.register("cut_blue_concrete_stairs", () ->
			new CPlusStairBlock(BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(BLUE_CONCRETE))),
	CUT_CYAN_CONCRETE_STAIRS = BLOCKS.register("cut_cyan_concrete_stairs", () ->
			new CPlusStairBlock(CYAN_CONCRETE.getDefaultState(), Block.Settings.copy(CYAN_CONCRETE))),
	CUT_LIGHT_BLUE_CONCRETE_STAIRS = BLOCKS.register("cut_light_blue_concrete_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	CUT_PURPLE_CONCRETE_STAIRS = BLOCKS.register("cut_purple_concrete_stairs", () ->
			new CPlusStairBlock(PURPLE_CONCRETE.getDefaultState(), Block.Settings.copy(PURPLE_CONCRETE))),
	CUT_MAGENTA_CONCRETE_STAIRS = BLOCKS.register("cut_magenta_concrete_stairs", () ->
			new CPlusStairBlock(MAGENTA_CONCRETE.getDefaultState(), Block.Settings.copy(MAGENTA_CONCRETE))),
	CUT_PINK_CONCRETE_STAIRS = BLOCKS.register("cut_pink_concrete_stairs", () ->
			new CPlusStairBlock(PINK_CONCRETE.getDefaultState(), Block.Settings.copy(PINK_CONCRETE))),
	CUT_WHITE_CONCRETE_STAIRS = BLOCKS.register("cut_white_concrete_stairs", () ->
			new CPlusStairBlock(WHITE_CONCRETE.getDefaultState(), Block.Settings.copy(WHITE_CONCRETE))),
	CUT_LIGHT_GRAY_CONCRETE_STAIRS = BLOCKS.register("cut_light_gray_concrete_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	CUT_GRAY_CONCRETE_STAIRS = BLOCKS.register("cut_gray_concrete_stairs", () ->
			new CPlusStairBlock(GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(GRAY_CONCRETE))),
	CUT_BLACK_CONCRETE_STAIRS = BLOCKS.register("cut_black_concrete_stairs", () ->
			new CPlusStairBlock(BLACK_CONCRETE.getDefaultState(), Block.Settings.copy(BLACK_CONCRETE))),
	CUT_BROWN_CONCRETE_STAIRS = BLOCKS.register("cut_brown_concrete_stairs", () ->
			new CPlusStairBlock(BROWN_CONCRETE.getDefaultState(), Block.Settings.copy(BROWN_CONCRETE))),


	// Terracotta Wall
	CUT_RED_CONCRETE_WALL = BLOCKS.register("cut_red_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(RED_CONCRETE))),
	CUT_ORANGE_CONCRETE_WALL = BLOCKS.register("cut_orange_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	CUT_YELLOW_CONCRETE_WALL = BLOCKS.register("cut_yellow_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	CUT_LIME_CONCRETE_WALL = BLOCKS.register("cut_lime_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_CONCRETE))),
	CUT_GREEN_CONCRETE_WALL = BLOCKS.register("cut_green_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_CONCRETE))),
	CUT_BLUE_CONCRETE_WALL = BLOCKS.register("cut_blue_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_CONCRETE))),
	CUT_CYAN_CONCRETE_WALL = BLOCKS.register("cut_cyan_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_CONCRETE))),
	CUT_LIGHT_BLUE_CONCRETE_WALL = BLOCKS.register("cut_light_blue_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	CUT_PURPLE_CONCRETE_WALL = BLOCKS.register("cut_purple_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	CUT_MAGENTA_CONCRETE_WALL = BLOCKS.register("cut_magenta_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	CUT_PINK_CONCRETE_WALL = BLOCKS.register("cut_pink_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_CONCRETE))),
	CUT_WHITE_CONCRETE_WALL = BLOCKS.register("cut_white_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_CONCRETE))),
	CUT_LIGHT_GRAY_CONCRETE_WALL = BLOCKS.register("cut_light_gray_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	CUT_GRAY_CONCRETE_WALL = BLOCKS.register("cut_gray_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_CONCRETE))),
	CUT_BLACK_CONCRETE_WALL = BLOCKS.register("cut_black_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_CONCRETE))),
	CUT_BROWN_CONCRETE_WALL = BLOCKS.register("cut_brown_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_CONCRETE))),

	// Terracotta Gates
	CUT_RED_CONCRETE_GATE = BLOCKS.register("cut_red_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_CONCRETE))),
	CUT_ORANGE_CONCRETE_GATE = BLOCKS.register("cut_orange_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	CUT_YELLOW_CONCRETE_GATE = BLOCKS.register("cut_yellow_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	CUT_LIME_CONCRETE_GATE = BLOCKS.register("cut_lime_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_CONCRETE))),
	CUT_GREEN_CONCRETE_GATE = BLOCKS.register("cut_green_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_CONCRETE))),
	CUT_BLUE_CONCRETE_GATE = BLOCKS.register("cut_blue_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_CONCRETE))),
	CUT_CYAN_CONCRETE_GATE = BLOCKS.register("cut_cyan_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_CONCRETE))),
	CUT_LIGHT_BLUE_CONCRETE_GATE = BLOCKS.register("cut_light_blue_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	CUT_PURPLE_CONCRETE_GATE = BLOCKS.register("cut_purple_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	CUT_MAGENTA_CONCRETE_GATE = BLOCKS.register("cut_magenta_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	CUT_PINK_CONCRETE_GATE = BLOCKS.register("cut_pink_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_CONCRETE))),
	CUT_WHITE_CONCRETE_GATE = BLOCKS.register("cut_white_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_CONCRETE))),
	CUT_LIGHT_GRAY_CONCRETE_GATE = BLOCKS.register("cut_light_gray_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	CUT_GRAY_CONCRETE_GATE = BLOCKS.register("cut_gray_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_CONCRETE))),
	CUT_BLACK_CONCRETE_GATE = BLOCKS.register("cut_black_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_CONCRETE))),
	CUT_BROWN_CONCRETE_GATE = BLOCKS.register("cut_brown_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_CONCRETE))),

	RED_CONCRETE_BRICKS = BLOCKS.register("red_concrete_bricks", () ->
			new Block(Block.Settings.copy(RED_CONCRETE))),
	ORANGE_CONCRETE_BRICKS = BLOCKS.register("orange_concrete_bricks", () ->
			new Block(Block.Settings.copy(ORANGE_CONCRETE))),
	YELLOW_CONCRETE_BRICKS = BLOCKS.register("yellow_concrete_bricks", () ->
			new Block(Block.Settings.copy(YELLOW_CONCRETE))),
	LIME_CONCRETE_BRICKS = BLOCKS.register("lime_concrete_bricks", () ->
			new Block(Block.Settings.copy(LIME_CONCRETE))),
	GREEN_CONCRETE_BRICKS = BLOCKS.register("green_concrete_bricks", () ->
			new Block(Block.Settings.copy(GREEN_CONCRETE))),
	BLUE_CONCRETE_BRICKS = BLOCKS.register("blue_concrete_bricks", () ->
			new Block(Block.Settings.copy(BLUE_CONCRETE))),
	CYAN_CONCRETE_BRICKS = BLOCKS.register("cyan_concrete_bricks", () ->
			new Block(Block.Settings.copy(CYAN_CONCRETE))),
	LIGHT_BLUE_CONCRETE_BRICKS = BLOCKS.register("light_blue_concrete_bricks", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	PURPLE_CONCRETE_BRICKS = BLOCKS.register("purple_concrete_bricks", () ->
			new Block(Block.Settings.copy(PURPLE_CONCRETE))),
	MAGENTA_CONCRETE_BRICKS = BLOCKS.register("magenta_concrete_bricks", () ->
			new Block(Block.Settings.copy(MAGENTA_CONCRETE))),
	PINK_CONCRETE_BRICKS = BLOCKS.register("pink_concrete_bricks", () ->
			new Block(Block.Settings.copy(PINK_CONCRETE))),
	WHITE_CONCRETE_BRICKS = BLOCKS.register("white_concrete_bricks", () ->
			new Block(Block.Settings.copy(WHITE_CONCRETE))),
	LIGHT_GRAY_CONCRETE_BRICKS = BLOCKS.register("light_gray_concrete_bricks", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	GRAY_CONCRETE_BRICKS = BLOCKS.register("gray_concrete_bricks", () ->
			new Block(Block.Settings.copy(GRAY_CONCRETE))),
	BLACK_CONCRETE_BRICKS = BLOCKS.register("black_concrete_bricks", () ->
			new Block(Block.Settings.copy(BLACK_CONCRETE))),
	BROWN_CONCRETE_BRICKS = BLOCKS.register("brown_concrete_bricks", () ->
			new Block(Block.Settings.copy(BROWN_CONCRETE))),

	RED_CONCRETE_BRICK_SLAB = BLOCKS.register("red_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_CONCRETE))),
	ORANGE_CONCRETE_BRICK_SLAB = BLOCKS.register("orange_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	YELLOW_CONCRETE_BRICK_SLAB = BLOCKS.register("yellow_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	LIME_CONCRETE_BRICK_SLAB = BLOCKS.register("lime_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_CONCRETE))),
	GREEN_CONCRETE_BRICK_SLAB = BLOCKS.register("green_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_CONCRETE))),
	BLUE_CONCRETE_BRICK_SLAB = BLOCKS.register("blue_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_CONCRETE))),
	CYAN_CONCRETE_BRICK_SLAB = BLOCKS.register("cyan_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_CONCRETE))),
	LIGHT_BLUE_CONCRETE_BRICK_SLAB = BLOCKS.register("light_blue_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	PURPLE_CONCRETE_BRICK_SLAB = BLOCKS.register("purple_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	MAGENTA_CONCRETE_BRICK_SLAB = BLOCKS.register("magenta_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	PINK_CONCRETE_BRICK_SLAB = BLOCKS.register("pink_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_CONCRETE))),
	WHITE_CONCRETE_BRICK_SLAB = BLOCKS.register("white_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_CONCRETE))),
	LIGHT_GRAY_CONCRETE_BRICK_SLAB = BLOCKS.register("light_gray_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	GRAY_CONCRETE_BRICK_SLAB = BLOCKS.register("gray_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_CONCRETE))),
	BLACK_CONCRETE_BRICK_SLAB = BLOCKS.register("black_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_CONCRETE))),
	BROWN_CONCRETE_BRICK_SLAB = BLOCKS.register("brown_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_CONCRETE))),


	// Terracotta Stairs
	RED_CONCRETE_BRICK_STAIRS = BLOCKS.register("red_concrete_brick_stairs", () ->
			new CPlusStairBlock(RED_CONCRETE.getDefaultState(), Block.Settings.copy(RED_CONCRETE))),
	ORANGE_CONCRETE_BRICK_STAIRS = BLOCKS.register("orange_concrete_brick_stairs", () ->
			new CPlusStairBlock(ORANGE_CONCRETE.getDefaultState(), Block.Settings.copy(ORANGE_CONCRETE))),
	YELLOW_CONCRETE_BRICK_STAIRS = BLOCKS.register("yellow_concrete_brick_stairs", () ->
			new CPlusStairBlock(YELLOW_CONCRETE.getDefaultState(), Block.Settings.copy(YELLOW_CONCRETE))),
	LIME_CONCRETE_BRICK_STAIRS = BLOCKS.register("lime_concrete_brick_stairs", () ->
			new CPlusStairBlock(LIME_CONCRETE.getDefaultState(), Block.Settings.copy(LIME_CONCRETE))),
	GREEN_CONCRETE_BRICK_STAIRS = BLOCKS.register("green_concrete_brick_stairs", () ->
			new CPlusStairBlock(GREEN_CONCRETE.getDefaultState(), Block.Settings.copy(GREEN_CONCRETE))),
	BLUE_CONCRETE_BRICK_STAIRS = BLOCKS.register("blue_concrete_brick_stairs", () ->
			new CPlusStairBlock(BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(BLUE_CONCRETE))),
	CYAN_CONCRETE_BRICK_STAIRS = BLOCKS.register("cyan_concrete_brick_stairs", () ->
			new CPlusStairBlock(CYAN_CONCRETE.getDefaultState(), Block.Settings.copy(CYAN_CONCRETE))),
	LIGHT_BLUE_CONCRETE_BRICK_STAIRS = BLOCKS.register("light_blue_concrete_brick_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	PURPLE_CONCRETE_BRICK_STAIRS = BLOCKS.register("purple_concrete_brick_stairs", () ->
			new CPlusStairBlock(PURPLE_CONCRETE.getDefaultState(), Block.Settings.copy(PURPLE_CONCRETE))),
	MAGENTA_CONCRETE_BRICK_STAIRS = BLOCKS.register("magenta_concrete_brick_stairs", () ->
			new CPlusStairBlock(MAGENTA_CONCRETE.getDefaultState(), Block.Settings.copy(MAGENTA_CONCRETE))),
	PINK_CONCRETE_BRICK_STAIRS = BLOCKS.register("pink_concrete_brick_stairs", () ->
			new CPlusStairBlock(PINK_CONCRETE.getDefaultState(), Block.Settings.copy(PINK_CONCRETE))),
	WHITE_CONCRETE_BRICK_STAIRS = BLOCKS.register("white_concrete_brick_stairs", () ->
			new CPlusStairBlock(WHITE_CONCRETE.getDefaultState(), Block.Settings.copy(WHITE_CONCRETE))),
	LIGHT_GRAY_CONCRETE_BRICK_STAIRS = BLOCKS.register("light_gray_concrete_brick_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	GRAY_CONCRETE_BRICK_STAIRS = BLOCKS.register("gray_concrete_brick_stairs", () ->
			new CPlusStairBlock(GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(GRAY_CONCRETE))),
	BLACK_CONCRETE_BRICK_STAIRS = BLOCKS.register("black_concrete_brick_stairs", () ->
			new CPlusStairBlock(BLACK_CONCRETE.getDefaultState(), Block.Settings.copy(BLACK_CONCRETE))),
	BROWN_CONCRETE_BRICK_STAIRS = BLOCKS.register("brown_concrete_brick_stairs", () ->
			new CPlusStairBlock(BROWN_CONCRETE.getDefaultState(), Block.Settings.copy(BROWN_CONCRETE))),

	// Terracotta Wall
	RED_CONCRETE_BRICK_WALL = BLOCKS.register("red_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(RED_CONCRETE))),
	ORANGE_CONCRETE_BRICK_WALL = BLOCKS.register("orange_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	YELLOW_CONCRETE_BRICK_WALL = BLOCKS.register("yellow_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	LIME_CONCRETE_BRICK_WALL = BLOCKS.register("lime_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_CONCRETE))),
	GREEN_CONCRETE_BRICK_WALL = BLOCKS.register("green_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_CONCRETE))),
	BLUE_CONCRETE_BRICK_WALL = BLOCKS.register("blue_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_CONCRETE))),
	CYAN_CONCRETE_BRICK_WALL = BLOCKS.register("cyan_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_CONCRETE))),
	LIGHT_BLUE_CONCRETE_BRICK_WALL = BLOCKS.register("light_blue_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	PURPLE_CONCRETE_BRICK_WALL = BLOCKS.register("purple_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	MAGENTA_CONCRETE_BRICK_WALL = BLOCKS.register("magenta_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	PINK_CONCRETE_BRICK_WALL = BLOCKS.register("pink_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_CONCRETE))),
	WHITE_CONCRETE_BRICK_WALL = BLOCKS.register("white_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_CONCRETE))),
	LIGHT_GRAY_CONCRETE_BRICK_WALL = BLOCKS.register("light_gray_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	GRAY_CONCRETE_BRICK_WALL = BLOCKS.register("gray_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_CONCRETE))),
	BLACK_CONCRETE_BRICK_WALL = BLOCKS.register("black_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_CONCRETE))),
	BROWN_CONCRETE_BRICK_WALL = BLOCKS.register("brown_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_CONCRETE))),

	// Terracotta Gates
	RED_CONCRETE_BRICK_GATE = BLOCKS.register("red_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_CONCRETE))),
	ORANGE_CONCRETE_BRICK_GATE = BLOCKS.register("orange_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	YELLOW_CONCRETE_BRICK_GATE = BLOCKS.register("yellow_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	LIME_CONCRETE_BRICK_GATE = BLOCKS.register("lime_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_CONCRETE))),
	GREEN_CONCRETE_BRICK_GATE = BLOCKS.register("green_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_CONCRETE))),
	BLUE_CONCRETE_BRICK_GATE = BLOCKS.register("blue_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_CONCRETE))),
	CYAN_CONCRETE_BRICK_GATE = BLOCKS.register("cyan_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_CONCRETE))),
	LIGHT_BLUE_CONCRETE_BRICK_GATE = BLOCKS.register("light_blue_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	PURPLE_CONCRETE_BRICK_GATE = BLOCKS.register("purple_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	MAGENTA_CONCRETE_BRICK_GATE = BLOCKS.register("magenta_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	PINK_CONCRETE_BRICK_GATE = BLOCKS.register("pink_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_CONCRETE))),
	WHITE_CONCRETE_BRICK_GATE = BLOCKS.register("white_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_CONCRETE))),
	LIGHT_GRAY_CONCRETE_BRICK_GATE = BLOCKS.register("light_gray_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	GRAY_CONCRETE_BRICK_GATE = BLOCKS.register("gray_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_CONCRETE))),
	BLACK_CONCRETE_BRICK_GATE = BLOCKS.register("black_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_CONCRETE))),
	BROWN_CONCRETE_BRICK_GATE = BLOCKS.register("brown_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_CONCRETE))),

	RED_CONCRETE_TILES = BLOCKS.register("red_concrete_tiles", () ->
			new Block(Block.Settings.copy(RED_CONCRETE))),
	ORANGE_CONCRETE_TILES = BLOCKS.register("orange_concrete_tiles", () ->
			new Block(Block.Settings.copy(ORANGE_CONCRETE))),
	YELLOW_CONCRETE_TILES = BLOCKS.register("yellow_concrete_tiles", () ->
			new Block(Block.Settings.copy(YELLOW_CONCRETE))),
	LIME_CONCRETE_TILES = BLOCKS.register("lime_concrete_tiles", () ->
			new Block(Block.Settings.copy(LIME_CONCRETE))),
	GREEN_CONCRETE_TILES = BLOCKS.register("green_concrete_tiles", () ->
			new Block(Block.Settings.copy(GREEN_CONCRETE))),
	BLUE_CONCRETE_TILES = BLOCKS.register("blue_concrete_tiles", () ->
			new Block(Block.Settings.copy(BLUE_CONCRETE))),
	CYAN_CONCRETE_TILES = BLOCKS.register("cyan_concrete_tiles", () ->
			new Block(Block.Settings.copy(CYAN_CONCRETE))),
	LIGHT_BLUE_CONCRETE_TILES = BLOCKS.register("light_blue_concrete_tiles", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	PURPLE_CONCRETE_TILES = BLOCKS.register("purple_concrete_tiles", () ->
			new Block(Block.Settings.copy(PURPLE_CONCRETE))),
	MAGENTA_CONCRETE_TILES = BLOCKS.register("magenta_concrete_tiles", () ->
			new Block(Block.Settings.copy(MAGENTA_CONCRETE))),
	PINK_CONCRETE_TILES = BLOCKS.register("pink_concrete_tiles", () ->
			new Block(Block.Settings.copy(PINK_CONCRETE))),
	WHITE_CONCRETE_TILES = BLOCKS.register("white_concrete_tiles", () ->
			new Block(Block.Settings.copy(WHITE_CONCRETE))),
	LIGHT_GRAY_CONCRETE_TILES = BLOCKS.register("light_gray_concrete_tiles", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	GRAY_CONCRETE_TILES = BLOCKS.register("gray_concrete_tiles", () ->
			new Block(Block.Settings.copy(GRAY_CONCRETE))),
	BLACK_CONCRETE_TILES = BLOCKS.register("black_concrete_tiles", () ->
			new Block(Block.Settings.copy(BLACK_CONCRETE))),
	BROWN_CONCRETE_TILES = BLOCKS.register("brown_concrete_tiles", () ->
			new Block(Block.Settings.copy(BROWN_CONCRETE))),

	RED_CONCRETE_TILE_SLAB = BLOCKS.register("red_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_CONCRETE))),
	ORANGE_CONCRETE_TILE_SLAB = BLOCKS.register("orange_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	YELLOW_CONCRETE_TILE_SLAB = BLOCKS.register("yellow_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	LIME_CONCRETE_TILE_SLAB = BLOCKS.register("lime_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_CONCRETE))),
	GREEN_CONCRETE_TILE_SLAB = BLOCKS.register("green_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_CONCRETE))),
	BLUE_CONCRETE_TILE_SLAB = BLOCKS.register("blue_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_CONCRETE))),
	CYAN_CONCRETE_TILE_SLAB = BLOCKS.register("cyan_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_CONCRETE))),
	LIGHT_BLUE_CONCRETE_TILE_SLAB = BLOCKS.register("light_blue_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	PURPLE_CONCRETE_TILE_SLAB = BLOCKS.register("purple_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	MAGENTA_CONCRETE_TILE_SLAB = BLOCKS.register("magenta_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	PINK_CONCRETE_TILE_SLAB = BLOCKS.register("pink_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_CONCRETE))),
	WHITE_CONCRETE_TILE_SLAB = BLOCKS.register("white_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_CONCRETE))),
	LIGHT_GRAY_CONCRETE_TILE_SLAB = BLOCKS.register("light_gray_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	GRAY_CONCRETE_TILE_SLAB = BLOCKS.register("gray_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_CONCRETE))),
	BLACK_CONCRETE_TILE_SLAB = BLOCKS.register("black_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_CONCRETE))),
	BROWN_CONCRETE_TILE_SLAB = BLOCKS.register("brown_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_CONCRETE))),

	// Terracotta Stairs
	RED_CONCRETE_TILE_STAIRS = BLOCKS.register("red_concrete_tile_stairs", () ->
			new CPlusStairBlock(RED_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(RED_CONCRETE))),
	ORANGE_CONCRETE_TILE_STAIRS = BLOCKS.register("orange_concrete_tile_stairs", () ->
			new CPlusStairBlock(ORANGE_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(ORANGE_CONCRETE))),
	YELLOW_CONCRETE_TILE_STAIRS = BLOCKS.register("yellow_concrete_tile_stairs", () ->
			new CPlusStairBlock(YELLOW_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(YELLOW_CONCRETE))),
	LIME_CONCRETE_TILE_STAIRS = BLOCKS.register("lime_concrete_tile_stairs", () ->
			new CPlusStairBlock(LIME_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(LIME_CONCRETE))),
	GREEN_CONCRETE_TILE_STAIRS = BLOCKS.register("green_concrete_tile_stairs", () ->
			new CPlusStairBlock(GREEN_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(GREEN_CONCRETE))),
	BLUE_CONCRETE_TILE_STAIRS = BLOCKS.register("blue_concrete_tile_stairs", () ->
			new CPlusStairBlock(BLUE_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(BLUE_CONCRETE))),
	CYAN_CONCRETE_TILE_STAIRS = BLOCKS.register("cyan_concrete_tile_stairs", () ->
			new CPlusStairBlock(CYAN_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(CYAN_CONCRETE))),
	LIGHT_BLUE_CONCRETE_TILE_STAIRS = BLOCKS.register("light_blue_concrete_tile_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	PURPLE_CONCRETE_TILE_STAIRS = BLOCKS.register("purple_concrete_tile_stairs", () ->
			new CPlusStairBlock(PURPLE_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(PURPLE_CONCRETE))),
	MAGENTA_CONCRETE_TILE_STAIRS = BLOCKS.register("magenta_concrete_tile_stairs", () ->
			new CPlusStairBlock(MAGENTA_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(MAGENTA_CONCRETE))),
	PINK_CONCRETE_TILE_STAIRS = BLOCKS.register("pink_concrete_tile_stairs", () ->
			new CPlusStairBlock(PINK_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(PINK_CONCRETE))),
	WHITE_CONCRETE_TILE_STAIRS = BLOCKS.register("white_concrete_tile_stairs", () ->
			new CPlusStairBlock(WHITE_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(WHITE_CONCRETE))),
	LIGHT_GRAY_CONCRETE_TILE_STAIRS = BLOCKS.register("light_gray_concrete_tile_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	GRAY_CONCRETE_TILE_STAIRS = BLOCKS.register("gray_concrete_tile_stairs", () ->
			new CPlusStairBlock(GRAY_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(GRAY_CONCRETE))),
	BLACK_CONCRETE_TILE_STAIRS = BLOCKS.register("black_concrete_tile_stairs", () ->
			new CPlusStairBlock(BLACK_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(BLACK_CONCRETE))),
	BROWN_CONCRETE_TILE_STAIRS = BLOCKS.register("brown_concrete_tile_stairs", () ->
			new CPlusStairBlock(BROWN_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(BROWN_CONCRETE))),

	// Terracotta Wall
	RED_CONCRETE_TILE_WALL = BLOCKS.register("red_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(RED_CONCRETE))),
	ORANGE_CONCRETE_TILE_WALL = BLOCKS.register("orange_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	YELLOW_CONCRETE_TILE_WALL = BLOCKS.register("yellow_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	LIME_CONCRETE_TILE_WALL = BLOCKS.register("lime_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_CONCRETE))),
	GREEN_CONCRETE_TILE_WALL = BLOCKS.register("green_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_CONCRETE))),
	BLUE_CONCRETE_TILE_WALL = BLOCKS.register("blue_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_CONCRETE))),
	CYAN_CONCRETE_TILE_WALL = BLOCKS.register("cyan_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_CONCRETE))),
	LIGHT_BLUE_CONCRETE_TILE_WALL = BLOCKS.register("light_blue_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	PURPLE_CONCRETE_TILE_WALL = BLOCKS.register("purple_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	MAGENTA_CONCRETE_TILE_WALL = BLOCKS.register("magenta_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	PINK_CONCRETE_TILE_WALL = BLOCKS.register("pink_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_CONCRETE))),
	WHITE_CONCRETE_TILE_WALL = BLOCKS.register("white_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_CONCRETE))),
	LIGHT_GRAY_CONCRETE_TILE_WALL = BLOCKS.register("light_gray_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	GRAY_CONCRETE_TILE_WALL = BLOCKS.register("gray_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_CONCRETE))),
	BLACK_CONCRETE_TILE_WALL = BLOCKS.register("black_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_CONCRETE))),
	BROWN_CONCRETE_TILE_WALL = BLOCKS.register("brown_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_CONCRETE))),

	// Terracotta Gates
	RED_CONCRETE_TILE_GATE = BLOCKS.register("red_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_CONCRETE))),
	ORANGE_CONCRETE_TILE_GATE = BLOCKS.register("orange_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	YELLOW_CONCRETE_TILE_GATE = BLOCKS.register("yellow_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	LIME_CONCRETE_TILE_GATE = BLOCKS.register("lime_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_CONCRETE))),
	GREEN_CONCRETE_TILE_GATE = BLOCKS.register("green_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_CONCRETE))),
	BLUE_CONCRETE_TILE_GATE = BLOCKS.register("blue_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_CONCRETE))),
	CYAN_CONCRETE_TILE_GATE = BLOCKS.register("cyan_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_CONCRETE))),
	LIGHT_BLUE_CONCRETE_TILE_GATE = BLOCKS.register("light_blue_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	PURPLE_CONCRETE_TILE_GATE = BLOCKS.register("purple_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	MAGENTA_CONCRETE_TILE_GATE = BLOCKS.register("magenta_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	PINK_CONCRETE_TILE_GATE = BLOCKS.register("pink_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_CONCRETE))),
	WHITE_CONCRETE_TILE_GATE = BLOCKS.register("white_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_CONCRETE))),
	LIGHT_GRAY_CONCRETE_TILE_GATE = BLOCKS.register("light_gray_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	GRAY_CONCRETE_TILE_GATE = BLOCKS.register("gray_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_CONCRETE))),
	BLACK_CONCRETE_TILE_GATE = BLOCKS.register("black_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_CONCRETE))),
	BROWN_CONCRETE_TILE_GATE = BLOCKS.register("brown_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_CONCRETE))),

	RED_CONCRETE_PILLAR = BLOCKS.register("red_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(RED_CONCRETE))),
	ORANGE_CONCRETE_PILLAR = BLOCKS.register("orange_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(ORANGE_CONCRETE))),
	YELLOW_CONCRETE_PILLAR = BLOCKS.register("yellow_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(YELLOW_CONCRETE))),
	LIME_CONCRETE_PILLAR = BLOCKS.register("lime_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(LIME_CONCRETE))),
	GREEN_CONCRETE_PILLAR = BLOCKS.register("green_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(GREEN_CONCRETE))),
	BLUE_CONCRETE_PILLAR = BLOCKS.register("blue_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(BLUE_CONCRETE))),
	CYAN_CONCRETE_PILLAR = BLOCKS.register("cyan_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(CYAN_CONCRETE))),
	LIGHT_BLUE_CONCRETE_PILLAR = BLOCKS.register("light_blue_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	PURPLE_CONCRETE_PILLAR = BLOCKS.register("purple_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(PURPLE_CONCRETE))),
	MAGENTA_CONCRETE_PILLAR = BLOCKS.register("magenta_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(MAGENTA_CONCRETE))),
	PINK_CONCRETE_PILLAR = BLOCKS.register("pink_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(PINK_CONCRETE))),
	WHITE_CONCRETE_PILLAR = BLOCKS.register("white_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(WHITE_CONCRETE))),
	LIGHT_GRAY_CONCRETE_PILLAR = BLOCKS.register("light_gray_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	GRAY_CONCRETE_PILLAR = BLOCKS.register("gray_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(GRAY_CONCRETE))),
	BLACK_CONCRETE_PILLAR = BLOCKS.register("black_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(BLACK_CONCRETE))),
	BROWN_CONCRETE_PILLAR = BLOCKS.register("brown_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(BROWN_CONCRETE))),

	RED_CONCRETE_CORNER_PILLAR = BLOCKS.register("red_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(RED_CONCRETE))),
	ORANGE_CONCRETE_CORNER_PILLAR = BLOCKS.register("orange_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(ORANGE_CONCRETE))),
	YELLOW_CONCRETE_CORNER_PILLAR = BLOCKS.register("yellow_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(YELLOW_CONCRETE))),
	LIME_CONCRETE_CORNER_PILLAR = BLOCKS.register("lime_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(LIME_CONCRETE))),
	GREEN_CONCRETE_CORNER_PILLAR = BLOCKS.register("green_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(GREEN_CONCRETE))),
	BLUE_CONCRETE_CORNER_PILLAR = BLOCKS.register("blue_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(BLUE_CONCRETE))),
	CYAN_CONCRETE_CORNER_PILLAR = BLOCKS.register("cyan_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(CYAN_CONCRETE))),
	LIGHT_BLUE_CONCRETE_CORNER_PILLAR = BLOCKS.register("light_blue_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	PURPLE_CONCRETE_CORNER_PILLAR = BLOCKS.register("purple_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(PURPLE_CONCRETE))),
	MAGENTA_CONCRETE_CORNER_PILLAR = BLOCKS.register("magenta_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(MAGENTA_CONCRETE))),
	PINK_CONCRETE_CORNER_PILLAR = BLOCKS.register("pink_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(PINK_CONCRETE))),
	WHITE_CONCRETE_CORNER_PILLAR = BLOCKS.register("white_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(WHITE_CONCRETE))),
	LIGHT_GRAY_CONCRETE_CORNER_PILLAR = BLOCKS.register("light_gray_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	GRAY_CONCRETE_CORNER_PILLAR = BLOCKS.register("gray_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(GRAY_CONCRETE))),
	BLACK_CONCRETE_CORNER_PILLAR = BLOCKS.register("black_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(BLACK_CONCRETE))),
	BROWN_CONCRETE_CORNER_PILLAR = BLOCKS.register("brown_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(BROWN_CONCRETE))),

	CHISELED_RED_CONCRETE = BLOCKS.register("chiseled_red_concrete", () ->
			new Block(Block.Settings.copy(RED_CONCRETE))),
	CHISELED_ORANGE_CONCRETE = BLOCKS.register("chiseled_orange_concrete", () ->
			new Block(Block.Settings.copy(ORANGE_CONCRETE))),
	CHISELED_YELLOW_CONCRETE = BLOCKS.register("chiseled_yellow_concrete", () ->
			new Block(Block.Settings.copy(YELLOW_CONCRETE))),
	CHISELED_LIME_CONCRETE = BLOCKS.register("chiseled_lime_concrete", () ->
			new Block(Block.Settings.copy(LIME_CONCRETE))),
	CHISELED_GREEN_CONCRETE = BLOCKS.register("chiseled_green_concrete", () ->
			new Block(Block.Settings.copy(GREEN_CONCRETE))),
	CHISELED_BLUE_CONCRETE = BLOCKS.register("chiseled_blue_concrete", () ->
			new Block(Block.Settings.copy(BLUE_CONCRETE))),
	CHISELED_CYAN_CONCRETE = BLOCKS.register("chiseled_cyan_concrete", () ->
			new Block(Block.Settings.copy(CYAN_CONCRETE))),
	CHISELED_LIGHT_BLUE_CONCRETE = BLOCKS.register("chiseled_light_blue_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	CHISELED_PURPLE_CONCRETE = BLOCKS.register("chiseled_purple_concrete", () ->
			new Block(Block.Settings.copy(PURPLE_CONCRETE))),
	CHISELED_MAGENTA_CONCRETE = BLOCKS.register("chiseled_magenta_concrete", () ->
			new Block(Block.Settings.copy(MAGENTA_CONCRETE))),
	CHISELED_PINK_CONCRETE = BLOCKS.register("chiseled_pink_concrete", () ->
			new Block(Block.Settings.copy(PINK_CONCRETE))),
	CHISELED_WHITE_CONCRETE = BLOCKS.register("chiseled_white_concrete", () ->
			new Block(Block.Settings.copy(WHITE_CONCRETE))),
	CHISELED_LIGHT_GRAY_CONCRETE = BLOCKS.register("chiseled_light_gray_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	CHISELED_GRAY_CONCRETE = BLOCKS.register("chiseled_gray_concrete", () ->
			new Block(Block.Settings.copy(GRAY_CONCRETE))),
	CHISELED_BLACK_CONCRETE = BLOCKS.register("chiseled_black_concrete", () ->
			new Block(Block.Settings.copy(BLACK_CONCRETE))),
	CHISELED_BROWN_CONCRETE = BLOCKS.register("chiseled_brown_concrete", () ->
			new Block(Block.Settings.copy(BROWN_CONCRETE))),

	CARVED_RED_CONCRETE = BLOCKS.register("carved_red_concrete", () ->
			new Block(Block.Settings.copy(RED_CONCRETE))),
	CARVED_ORANGE_CONCRETE = BLOCKS.register("carved_orange_concrete", () ->
			new Block(Block.Settings.copy(ORANGE_CONCRETE))),
	CARVED_YELLOW_CONCRETE = BLOCKS.register("carved_yellow_concrete", () ->
			new Block(Block.Settings.copy(YELLOW_CONCRETE))),
	CARVED_LIME_CONCRETE = BLOCKS.register("carved_lime_concrete", () ->
			new Block(Block.Settings.copy(LIME_CONCRETE))),
	CARVED_GREEN_CONCRETE = BLOCKS.register("carved_green_concrete", () ->
			new Block(Block.Settings.copy(GREEN_CONCRETE))),
	CARVED_BLUE_CONCRETE = BLOCKS.register("carved_blue_concrete", () ->
			new Block(Block.Settings.copy(BLUE_CONCRETE))),
	CARVED_CYAN_CONCRETE = BLOCKS.register("carved_cyan_concrete", () ->
			new Block(Block.Settings.copy(CYAN_CONCRETE))),
	CARVED_LIGHT_BLUE_CONCRETE = BLOCKS.register("carved_light_blue_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_CONCRETE))),
	CARVED_PURPLE_CONCRETE = BLOCKS.register("carved_purple_concrete", () ->
			new Block(Block.Settings.copy(PURPLE_CONCRETE))),
	CARVED_MAGENTA_CONCRETE = BLOCKS.register("carved_magenta_concrete", () ->
			new Block(Block.Settings.copy(MAGENTA_CONCRETE))),
	CARVED_PINK_CONCRETE = BLOCKS.register("carved_pink_concrete", () ->
			new Block(Block.Settings.copy(PINK_CONCRETE))),
	CARVED_WHITE_CONCRETE = BLOCKS.register("carved_white_concrete", () ->
			new Block(Block.Settings.copy(WHITE_CONCRETE))),
	CARVED_LIGHT_GRAY_CONCRETE = BLOCKS.register("carved_light_gray_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_CONCRETE))),
	CARVED_GRAY_CONCRETE = BLOCKS.register("carved_gray_concrete", () ->
			new Block(Block.Settings.copy(GRAY_CONCRETE))),
	CARVED_BLACK_CONCRETE = BLOCKS.register("carved_black_concrete", () ->
			new Block(Block.Settings.copy(BLACK_CONCRETE))),
	CARVED_BROWN_CONCRETE = BLOCKS.register("carved_brown_concrete", () ->
			new Block(Block.Settings.copy(BROWN_CONCRETE))),

// Any sane shit ends here.  Hello to any folks crazy enough to be here, and enjoy your stay in last-minute-addition hell
// Who wrote this, who wrote this, who? Cause its true, but it certainly wasn't me.

	// Ice
	RED_ICE = BLOCKS.register("red_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.RED).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS))),
	ORANGE_ICE = BLOCKS.register("orange_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.ORANGE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS))),
	YELLOW_ICE = BLOCKS.register("yellow_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.YELLOW).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS))),
	LIME_ICE = BLOCKS.register("lime_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.LIME).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS))),
	GREEN_ICE = BLOCKS.register("green_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.GREEN).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS))),
	CYAN_ICE = BLOCKS.register("cyan_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.CYAN).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS))),
	LIGHT_BLUE_ICE = BLOCKS.register("light_blue_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.LIGHT_BLUE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS))),
	PURPLE_ICE = BLOCKS.register("purple_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.PURPLE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS))),
	MAGENTA_ICE = BLOCKS.register("magenta_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.MAGENTA).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS))),
	PINK_ICE = BLOCKS.register("pink_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.PINK).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS))),
	WHITE_ICE = BLOCKS.register("white_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.WHITE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS))),
	LIGHT_GRAY_ICE = BLOCKS.register("light_gray_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.LIGHT_GRAY).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS))),
	GRAY_ICE = BLOCKS.register("gray_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.GRAY).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS))),
	BLACK_ICE = BLOCKS.register("black_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.BLACK).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS))),
	BROWN_ICE = BLOCKS.register("brown_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS))),
	//Haha brr go brrr
	SOUL_ICE = BLOCKS.register("soul_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.LIGHT_BLUE).strength(3.0F).slipperiness(1.1f).sounds(BlockSoundGroup.GLASS))),

	// Ice Slab
	RED_ICE_SLAB = BLOCKS.register("red_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_ICE.get()))),
	ORANGE_ICE_SLAB = BLOCKS.register("orange_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_ICE.get()))),
	YELLOW_ICE_SLAB = BLOCKS.register("yellow_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_ICE.get()))),
	LIME_ICE_SLAB = BLOCKS.register("lime_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_ICE.get()))),
	GREEN_ICE_SLAB = BLOCKS.register("green_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_ICE.get()))),
	BLUE_ICE_SLAB = BLOCKS.register("blue_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_ICE))),
	CYAN_ICE_SLAB = BLOCKS.register("cyan_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_ICE.get()))),
	LIGHT_BLUE_ICE_SLAB = BLOCKS.register("light_blue_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_ICE.get()))),
	PURPLE_ICE_SLAB = BLOCKS.register("purple_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_ICE.get()))),
	MAGENTA_ICE_SLAB = BLOCKS.register("magenta_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_ICE.get()))),
	PINK_ICE_SLAB = BLOCKS.register("pink_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_ICE.get()))),
	WHITE_ICE_SLAB = BLOCKS.register("white_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_ICE.get()))),
	LIGHT_GRAY_ICE_SLAB = BLOCKS.register("light_gray_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_ICE.get()))),
	GRAY_ICE_SLAB = BLOCKS.register("gray_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_ICE.get()))),
	BLACK_ICE_SLAB = BLOCKS.register("black_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_ICE.get()))),
	BROWN_ICE_SLAB = BLOCKS.register("brown_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_ICE.get()))),
	SOUL_ICE_SLAB = BLOCKS.register("soul_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_ICE.get()))),

	// Ice Stairs
	RED_ICE_STAIRS = BLOCKS.register("red_ice_stairs", () ->
			new CPlusStairBlock(RED_ICE.get().getDefaultState(), Block.Settings.copy(RED_ICE.get()))),
	ORANGE_ICE_STAIRS = BLOCKS.register("orange_ice_stairs", () ->
			new CPlusStairBlock(ORANGE_ICE.get().getDefaultState(), Block.Settings.copy(ORANGE_ICE.get()))),
	YELLOW_ICE_STAIRS = BLOCKS.register("yellow_ice_stairs", () ->
			new CPlusStairBlock(YELLOW_ICE.get().getDefaultState(), Block.Settings.copy(YELLOW_ICE.get()))),
	LIME_ICE_STAIRS = BLOCKS.register("lime_ice_stairs", () ->
			new CPlusStairBlock(LIME_ICE.get().getDefaultState(), Block.Settings.copy(LIME_ICE.get()))),
	GREEN_ICE_STAIRS = BLOCKS.register("green_ice_stairs", () ->
			new CPlusStairBlock(GREEN_ICE.get().getDefaultState(), Block.Settings.copy(GREEN_ICE.get()))),
	BLUE_ICE_STAIRS = BLOCKS.register("blue_ice_stairs", () ->
			new CPlusStairBlock(BLUE_ICE.getDefaultState(), Block.Settings.copy(BLUE_ICE))),
	CYAN_ICE_STAIRS = BLOCKS.register("cyan_ice_stairs", () ->
			new CPlusStairBlock(CYAN_ICE.get().getDefaultState(), Block.Settings.copy(CYAN_ICE.get()))),
	LIGHT_BLUE_ICE_STAIRS = BLOCKS.register("light_blue_ice_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_ICE.get().getDefaultState(), Block.Settings.copy(LIGHT_BLUE_ICE.get()))),
	PURPLE_ICE_STAIRS = BLOCKS.register("purple_ice_stairs", () ->
			new CPlusStairBlock(PURPLE_ICE.get().getDefaultState(), Block.Settings.copy(PURPLE_ICE.get()))),
	MAGENTA_ICE_STAIRS = BLOCKS.register("magenta_ice_stairs", () ->
			new CPlusStairBlock(MAGENTA_ICE.get().getDefaultState(), Block.Settings.copy(MAGENTA_ICE.get()))),
	PINK_ICE_STAIRS = BLOCKS.register("pink_ice_stairs", () ->
			new CPlusStairBlock(PINK_ICE.get().getDefaultState(), Block.Settings.copy(PINK_ICE.get()))),
	WHITE_ICE_STAIRS = BLOCKS.register("white_ice_stairs", () ->
			new CPlusStairBlock(WHITE_ICE.get().getDefaultState(), Block.Settings.copy(WHITE_ICE.get()))),
	LIGHT_GRAY_ICE_STAIRS = BLOCKS.register("light_gray_ice_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_ICE.get().getDefaultState(), Block.Settings.copy(LIGHT_GRAY_ICE.get()))),
	GRAY_ICE_STAIRS = BLOCKS.register("gray_ice_stairs", () ->
			new CPlusStairBlock(GRAY_ICE.get().getDefaultState(), Block.Settings.copy(GRAY_ICE.get()))),
	BLACK_ICE_STAIRS = BLOCKS.register("black_ice_stairs", () ->
			new CPlusStairBlock(BLACK_ICE.get().getDefaultState(), Block.Settings.copy(BLACK_ICE.get()))),
	BROWN_ICE_STAIRS = BLOCKS.register("brown_ice_stairs", () ->
			new CPlusStairBlock(BROWN_ICE.get().getDefaultState(), Block.Settings.copy(BROWN_ICE.get()))),
	SOUL_ICE_STAIRS = BLOCKS.register("soul_ice_stairs", () ->
			new CPlusStairBlock(SOUL_ICE.get().getDefaultState(), Block.Settings.copy(SOUL_ICE.get()))),

	// Ice Wall
	RED_ICE_WALL = BLOCKS.register("red_ice_wall", () ->
			new WallBlock(Block.Settings.copy(RED_ICE.get()))),
	ORANGE_ICE_WALL = BLOCKS.register("orange_ice_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_ICE.get()))),
	YELLOW_ICE_WALL = BLOCKS.register("yellow_ice_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_ICE.get()))),
	LIME_ICE_WALL = BLOCKS.register("lime_ice_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_ICE.get()))),
	GREEN_ICE_WALL = BLOCKS.register("green_ice_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_ICE.get()))),
	BLUE_ICE_WALL = BLOCKS.register("blue_ice_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_ICE))),
	CYAN_ICE_WALL = BLOCKS.register("cyan_ice_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_ICE.get()))),
	LIGHT_BLUE_ICE_WALL = BLOCKS.register("light_blue_ice_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_ICE.get()))),
	PURPLE_ICE_WALL = BLOCKS.register("purple_ice_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_ICE.get()))),
	MAGENTA_ICE_WALL = BLOCKS.register("magenta_ice_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_ICE.get()))),
	PINK_ICE_WALL = BLOCKS.register("pink_ice_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_ICE.get()))),
	WHITE_ICE_WALL = BLOCKS.register("white_ice_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_ICE.get()))),
	LIGHT_GRAY_ICE_WALL = BLOCKS.register("light_gray_ice_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_ICE.get()))),
	GRAY_ICE_WALL = BLOCKS.register("gray_ice_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_ICE.get()))),
	BLACK_ICE_WALL = BLOCKS.register("black_ice_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_ICE.get()))),
	BROWN_ICE_WALL = BLOCKS.register("brown_ice_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_ICE.get()))),
	SOUL_ICE_WALL = BLOCKS.register("soul_ice_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_ICE.get()))),

	// Ice Gate
	RED_ICE_GATE = BLOCKS.register("red_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_ICE.get()))),
	ORANGE_ICE_GATE = BLOCKS.register("orange_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_ICE.get()))),
	YELLOW_ICE_GATE = BLOCKS.register("yellow_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_ICE.get()))),
	LIME_ICE_GATE = BLOCKS.register("lime_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_ICE.get()))),
	GREEN_ICE_GATE = BLOCKS.register("green_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_ICE.get()))),
	BLUE_ICE_GATE = BLOCKS.register("blue_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_ICE))),
	CYAN_ICE_GATE = BLOCKS.register("cyan_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_ICE.get()))),
	LIGHT_BLUE_ICE_GATE = BLOCKS.register("light_blue_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_ICE.get()))),
	PURPLE_ICE_GATE = BLOCKS.register("purple_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_ICE.get()))),
	MAGENTA_ICE_GATE = BLOCKS.register("magenta_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_ICE.get()))),
	PINK_ICE_GATE = BLOCKS.register("pink_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_ICE.get()))),
	WHITE_ICE_GATE = BLOCKS.register("white_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_ICE.get()))),
	LIGHT_GRAY_ICE_GATE = BLOCKS.register("light_gray_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_ICE.get()))),
	GRAY_ICE_GATE = BLOCKS.register("gray_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_ICE.get()))),
	BLACK_ICE_GATE = BLOCKS.register("black_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_ICE.get()))),
	BROWN_ICE_GATE = BLOCKS.register("brown_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_ICE.get()))),
	SOUL_ICE_GATE = BLOCKS.register("soul_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_ICE.get()))),


	//Glowstone
	RED_GLOWSTONE = BLOCKS.register("red_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.RED).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance((state) -> 15).nonOpaque())),
	ORANGE_GLOWSTONE = BLOCKS.register("orange_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.YELLOW).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance((state) -> 15).nonOpaque())),
	YELLOW_GLOWSTONE = BLOCKS.register("yellow_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.ORANGE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance((state) -> 15).nonOpaque())),
	LIME_GLOWSTONE = BLOCKS.register("lime_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.LIME).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque())),
	GREEN_GLOWSTONE = BLOCKS.register("green_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.GREEN).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque())),
	BLUE_GLOWSTONE = BLOCKS.register("blue_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.BLUE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque())),
	CYAN_GLOWSTONE = BLOCKS.register("cyan_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.CYAN).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque())),
	LIGHT_BLUE_GLOWSTONE = BLOCKS.register("light_blue_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.LIGHT_BLUE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque())),
	PURPLE_GLOWSTONE = BLOCKS.register("purple_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.PURPLE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque())),
	MAGENTA_GLOWSTONE = BLOCKS.register("magenta_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.MAGENTA).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque())),
	PINK_GLOWSTONE = BLOCKS.register("pink_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.PINK).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque())),
	WHITE_GLOWSTONE = BLOCKS.register("white_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.WHITE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque())),
	LIGHT_GRAY_GLOWSTONE = BLOCKS.register("light_gray_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.LIGHT_GRAY).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque())),
	GRAY_GLOWSTONE = BLOCKS.register("gray_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.GRAY).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque())),
	BLACK_GLOWSTONE = BLOCKS.register("black_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque())),
	BROWN_GLOWSTONE = BLOCKS.register("brown_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque())),
	SOUL_GLOWSTONE = BLOCKS.register("soul_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.LIGHT_BLUE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance((state) -> 10).nonOpaque())),

	// Glowstone Slab
	RED_GLOWSTONE_SLAB = BLOCKS.register("red_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_GLOWSTONE.get()))),
	ORANGE_GLOWSTONE_SLAB = BLOCKS.register("orange_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_GLOWSTONE.get()))),
	YELLOW_GLOWSTONE_SLAB = BLOCKS.register("yellow_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_GLOWSTONE.get()))),
	LIME_GLOWSTONE_SLAB = BLOCKS.register("lime_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_GLOWSTONE.get()))),
	GREEN_GLOWSTONE_SLAB = BLOCKS.register("green_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_GLOWSTONE.get()))),
	BLUE_GLOWSTONE_SLAB = BLOCKS.register("blue_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_GLOWSTONE.get()))),
	CYAN_GLOWSTONE_SLAB = BLOCKS.register("cyan_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_GLOWSTONE.get()))),
	LIGHT_BLUE_GLOWSTONE_SLAB = BLOCKS.register("light_blue_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_GLOWSTONE.get()))),
	PURPLE_GLOWSTONE_SLAB = BLOCKS.register("purple_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_GLOWSTONE.get()))),
	MAGENTA_GLOWSTONE_SLAB = BLOCKS.register("magenta_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_GLOWSTONE.get()))),
	PINK_GLOWSTONE_SLAB = BLOCKS.register("pink_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_GLOWSTONE.get()))),
	WHITE_GLOWSTONE_SLAB = BLOCKS.register("white_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_GLOWSTONE.get()))),
	LIGHT_GRAY_GLOWSTONE_SLAB = BLOCKS.register("light_gray_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_GLOWSTONE.get()))),
	GRAY_GLOWSTONE_SLAB = BLOCKS.register("gray_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_GLOWSTONE.get()))),
	BLACK_GLOWSTONE_SLAB = BLOCKS.register("black_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_GLOWSTONE.get()))),
	BROWN_GLOWSTONE_SLAB = BLOCKS.register("brown_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_GLOWSTONE.get()))),
	SOUL_GLOWSTONE_SLAB = BLOCKS.register("soul_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_GLOWSTONE.get()))),
	GLOWSTONE_SLAB = BLOCKS.register("glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(GLOWSTONE).nonOpaque())),

	// Glowstone Stairs
	RED_GLOWSTONE_STAIRS = BLOCKS.register("red_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(RED_GLOWSTONE.get()))),
	ORANGE_GLOWSTONE_STAIRS = BLOCKS.register("orange_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(ORANGE_GLOWSTONE.get()))),
	YELLOW_GLOWSTONE_STAIRS = BLOCKS.register("yellow_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(YELLOW_GLOWSTONE.get()))),
	LIME_GLOWSTONE_STAIRS = BLOCKS.register("lime_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(LIME_GLOWSTONE.get()))),
	GREEN_GLOWSTONE_STAIRS = BLOCKS.register("green_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(GREEN_GLOWSTONE.get()))),
	BLUE_GLOWSTONE_STAIRS = BLOCKS.register("blue_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(BLUE_GLOWSTONE.get()))),
	CYAN_GLOWSTONE_STAIRS = BLOCKS.register("cyan_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(CYAN_GLOWSTONE.get()))),
	LIGHT_BLUE_GLOWSTONE_STAIRS = BLOCKS.register("light_blue_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_GLOWSTONE.get()))),
	PURPLE_GLOWSTONE_STAIRS = BLOCKS.register("purple_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(PURPLE_GLOWSTONE.get()))),
	MAGENTA_GLOWSTONE_STAIRS = BLOCKS.register("magenta_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(MAGENTA_GLOWSTONE.get()))),
	PINK_GLOWSTONE_STAIRS = BLOCKS.register("pink_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(PINK_GLOWSTONE.get()))),
	WHITE_GLOWSTONE_STAIRS = BLOCKS.register("white_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(WHITE_GLOWSTONE.get()))),
	LIGHT_GRAY_GLOWSTONE_STAIRS = BLOCKS.register("light_gray_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_GLOWSTONE.get()))),
	GRAY_GLOWSTONE_STAIRS = BLOCKS.register("gray_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(GRAY_GLOWSTONE.get()))),
	BLACK_GLOWSTONE_STAIRS = BLOCKS.register("black_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(BLACK_GLOWSTONE.get()))),
	BROWN_GLOWSTONE_STAIRS = BLOCKS.register("brown_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(BROWN_GLOWSTONE.get()))),
	SOUL_GLOWSTONE_STAIRS = BLOCKS.register("soul_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(SOUL_GLOWSTONE.get()))),
	GLOWSTONE_STAIRS = BLOCKS.register("glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(GLOWSTONE).nonOpaque())),

	// Glowstone Wall
	RED_GLOWSTONE_WALL = BLOCKS.register("red_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(RED_GLOWSTONE.get()))),
	ORANGE_GLOWSTONE_WALL = BLOCKS.register("orange_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_GLOWSTONE.get()))),
	YELLOW_GLOWSTONE_WALL = BLOCKS.register("yellow_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_GLOWSTONE.get()))),
	LIME_GLOWSTONE_WALL = BLOCKS.register("lime_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_GLOWSTONE.get()))),
	GREEN_GLOWSTONE_WALL = BLOCKS.register("green_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_GLOWSTONE.get()))),
	BLUE_GLOWSTONE_WALL = BLOCKS.register("blue_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_GLOWSTONE.get()))),
	CYAN_GLOWSTONE_WALL = BLOCKS.register("cyan_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_GLOWSTONE.get()))),
	LIGHT_BLUE_GLOWSTONE_WALL = BLOCKS.register("light_blue_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_GLOWSTONE.get()))),
	PURPLE_GLOWSTONE_WALL = BLOCKS.register("purple_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_GLOWSTONE.get()))),
	MAGENTA_GLOWSTONE_WALL = BLOCKS.register("magenta_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_GLOWSTONE.get()))),
	PINK_GLOWSTONE_WALL = BLOCKS.register("pink_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_GLOWSTONE.get()))),
	WHITE_GLOWSTONE_WALL = BLOCKS.register("white_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_GLOWSTONE.get()))),
	LIGHT_GRAY_GLOWSTONE_WALL = BLOCKS.register("light_gray_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_GLOWSTONE.get()))),
	GRAY_GLOWSTONE_WALL = BLOCKS.register("gray_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_GLOWSTONE.get()))),
	BLACK_GLOWSTONE_WALL = BLOCKS.register("black_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_GLOWSTONE.get()))),
	BROWN_GLOWSTONE_WALL = BLOCKS.register("brown_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_GLOWSTONE.get()))),
	SOUL_GLOWSTONE_WALL = BLOCKS.register("soul_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_GLOWSTONE.get()))),
	GLOWSTONE_WALL = BLOCKS.register("glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(GLOWSTONE).nonOpaque())),

	// Glowstone Gate
	RED_GLOWSTONE_GATE = BLOCKS.register("red_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_GLOWSTONE.get()))),
	ORANGE_GLOWSTONE_GATE = BLOCKS.register("orange_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_GLOWSTONE.get()))),
	YELLOW_GLOWSTONE_GATE = BLOCKS.register("yellow_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_GLOWSTONE.get()))),
	LIME_GLOWSTONE_GATE = BLOCKS.register("lime_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_GLOWSTONE.get()))),
	GREEN_GLOWSTONE_GATE = BLOCKS.register("green_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_GLOWSTONE.get()))),
	BLUE_GLOWSTONE_GATE = BLOCKS.register("blue_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_GLOWSTONE.get()))),
	CYAN_GLOWSTONE_GATE = BLOCKS.register("cyan_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_GLOWSTONE.get()))),
	LIGHT_BLUE_GLOWSTONE_GATE = BLOCKS.register("light_blue_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_GLOWSTONE.get()))),
	PURPLE_GLOWSTONE_GATE = BLOCKS.register("purple_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_GLOWSTONE.get()))),
	MAGENTA_GLOWSTONE_GATE = BLOCKS.register("magenta_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_GLOWSTONE.get()))),
	PINK_GLOWSTONE_GATE = BLOCKS.register("pink_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_GLOWSTONE.get()))),
	WHITE_GLOWSTONE_GATE = BLOCKS.register("white_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_GLOWSTONE.get()))),
	LIGHT_GRAY_GLOWSTONE_GATE = BLOCKS.register("light_gray_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_GLOWSTONE.get()))),
	GRAY_GLOWSTONE_GATE = BLOCKS.register("gray_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_GLOWSTONE.get()))),
	BLACK_GLOWSTONE_GATE = BLOCKS.register("black_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_GLOWSTONE.get()))),
	BROWN_GLOWSTONE_GATE = BLOCKS.register("brown_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_GLOWSTONE.get()))),
	SOUL_GLOWSTONE_GATE = BLOCKS.register("soul_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_GLOWSTONE.get()))),
	GLOWSTONE_GATE = BLOCKS.register("glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GLOWSTONE).nonOpaque())),

	//Glass stuff will be here eventually.  Until then, here's a random face from the win + . menu
	// (¬‿¬)

	// Tinted Glass
	RED_TINTED_GLASS_BLOCK = BLOCKS.register("red_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque())),
	ORANGE_TINTED_GLASS_BLOCK = BLOCKS.register("orange_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque())),
	YELLOW_TINTED_GLASS_BLOCK = BLOCKS.register("yellow_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque())),
	LIME_TINTED_GLASS_BLOCK = BLOCKS.register("lime_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque())),
	GREEN_TINTED_GLASS_BLOCK = BLOCKS.register("green_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque())),
	BLUE_TINTED_GLASS_BLOCK = BLOCKS.register("blue_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque())),
	LIGHT_BLUE_TINTED_GLASS_BLOCK = BLOCKS.register("light_blue_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque())),
	CYAN_TINTED_GLASS_BLOCK = BLOCKS.register("cyan_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque())),
	PURPLE_TINTED_GLASS_BLOCK = BLOCKS.register("purple_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque())),
	PINK_TINTED_GLASS_BLOCK = BLOCKS.register("pink_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque())),
	BROWN_TINTED_GLASS_BLOCK = BLOCKS.register("brown_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque())),
	GRAY_TINTED_GLASS_BLOCK = BLOCKS.register("gray_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque())),
	LIGHT_GRAY_TINTED_GLASS_BLOCK = BLOCKS.register("light_gray_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque())),
	WHITE_TINTED_GLASS_BLOCK = BLOCKS.register("white_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque())),
	MAGENTA_TINTED_GLASS_BLOCK = BLOCKS.register("magenta_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque())),
	BLACK_TINTED_GLASS_BLOCK = BLOCKS.register("black_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque())),

	// Dirt
	DIRT_SLAB = BLOCKS.register("dirt_slab", () ->
			new DirtSlabBlock(Block.Settings.copy(DIRT))),
	DIRT_STAIRS = BLOCKS.register("dirt_stairs", () ->
			new DirtStairsBlock(DIRT.getDefaultState(), Block.Settings.copy(DIRT))),
	DIRT_WALL = BLOCKS.register("dirt_wall", () ->
			new DirtWallBlock(Block.Settings.copy(DIRT))),

	// Grass
	GRASS_SLAB = BLOCKS.register("grass_slab", () ->
			new GrassSlabBlock(Block.Settings.copy(GRASS_BLOCK))),
	GRASS_STAIRS = BLOCKS.register("grass_stairs", () ->
			new GrassStairsBlock(GRASS_BLOCK.getDefaultState(), Block.Settings.copy(GRASS_BLOCK))),
	GRASS_WALL = BLOCKS.register("grass_wall", () ->
			new GrassWallBlock(Block.Settings.copy(GRASS_BLOCK))),

	// Mycelium
	MYCELIUM_SLAB = BLOCKS.register("mycelium_slab", () ->
			new MyceliumSlabBlock(Block.Settings.copy(MYCELIUM))),
	MYCELIUM_STAIRS = BLOCKS.register("mycelium_stairs", () ->
			new MyceliumStairsBlock(MYCELIUM.getDefaultState(), Block.Settings.copy(MYCELIUM))),
	MYCELIUM_WALL = BLOCKS.register("mycelium_wall", () ->
			new MyceliumWallBlock(Block.Settings.copy(MYCELIUM))),

	// Logs and Wood Stairs/Slabs
	// Follows Log Stair, Log Slab, Wood Stair, Wood Slab format
	OAK_LOG_STAIRS = BLOCKS.register("oak_log_stairs", () ->
			new CPlusStairBlock(OAK_STAIRS.getDefaultState(), Block.Settings.copy(OAK_STAIRS))),
	OAK_LOG_SLAB = BLOCKS.register("oak_log_slab", () ->
			new SlabBlock(Block.Settings.copy(OAK_STAIRS))),
	OAK_WOOD_STAIRS = BLOCKS.register("oak_wood_stairs", () ->
			new CPlusStairBlock(OAK_STAIRS.getDefaultState(), Block.Settings.copy(OAK_STAIRS))),
	OAK_WOOD_SLAB = BLOCKS.register("oak_wood_slab", () ->
			new SlabBlock(Block.Settings.copy(OAK_STAIRS))),
	DARK_OAK_LOG_STAIRS = BLOCKS.register("dark_oak_log_stairs", () ->
			new CPlusStairBlock(DARK_OAK_STAIRS.getDefaultState(), Block.Settings.copy(DARK_OAK_STAIRS))),
	DARK_OAK_LOG_SLAB = BLOCKS.register("dark_oak_log_slab", () ->
			new SlabBlock(Block.Settings.copy(DARK_OAK_STAIRS))),
	DARK_OAK_WOOD_STAIRS = BLOCKS.register("dark_oak_wood_stairs", () ->
			new CPlusStairBlock(DARK_OAK_STAIRS.getDefaultState(), Block.Settings.copy(DARK_OAK_STAIRS))),
	DARK_OAK_WOOD_SLAB = BLOCKS.register("dark_oak_wood_slab", () ->
			new SlabBlock(Block.Settings.copy(DARK_OAK_STAIRS))),
	ACACIA_LOG_STAIRS = BLOCKS.register("acacia_log_stairs", () ->
			new CPlusStairBlock(ACACIA_STAIRS.getDefaultState(), Block.Settings.copy(ACACIA_STAIRS))),
	ACACIA_LOG_SLAB = BLOCKS.register("acacia_log_slab", () ->
			new SlabBlock(Block.Settings.copy(ACACIA_STAIRS))),
	ACACIA_WOOD_STAIRS = BLOCKS.register("acacia_wood_stairs", () ->
			new CPlusStairBlock(ACACIA_STAIRS.getDefaultState(), Block.Settings.copy(ACACIA_STAIRS))),
	ACACIA_WOOD_SLAB = BLOCKS.register("acacia_wood_slab", () ->
			new SlabBlock(Block.Settings.copy(ACACIA_STAIRS))),
	BIRCH_LOG_STAIRS = BLOCKS.register("birch_log_stairs", () ->
			new CPlusStairBlock(BIRCH_STAIRS.getDefaultState(), Block.Settings.copy(BIRCH_STAIRS))),
	BIRCH_LOG_SLAB = BLOCKS.register("birch_log_slab", () ->
			new SlabBlock(Block.Settings.copy(BIRCH_STAIRS))),
	BIRCH_WOOD_STAIRS = BLOCKS.register("birch_wood_stairs", () ->
			new CPlusStairBlock(BIRCH_STAIRS.getDefaultState(), Block.Settings.copy(BIRCH_STAIRS))),
	BIRCH_WOOD_SLAB = BLOCKS.register("birch_wood_slab", () ->
			new SlabBlock(Block.Settings.copy(BIRCH_STAIRS))),
	JUNGLE_LOG_STAIRS = BLOCKS.register("jungle_log_stairs", () ->
			new CPlusStairBlock(JUNGLE_STAIRS.getDefaultState(), Block.Settings.copy(JUNGLE_STAIRS))),
	JUNGLE_LOG_SLAB = BLOCKS.register("jungle_log_slab", () ->
			new SlabBlock(Block.Settings.copy(JUNGLE_STAIRS))),
	JUNGLE_WOOD_STAIRS = BLOCKS.register("jungle_wood_stairs", () ->
			new CPlusStairBlock(JUNGLE_STAIRS.getDefaultState(), Block.Settings.copy(JUNGLE_STAIRS))),
	JUNGLE_WOOD_SLAB = BLOCKS.register("jungle_wood_slab", () ->
			new SlabBlock(Block.Settings.copy(JUNGLE_STAIRS))),
	SPRUCE_LOG_STAIRS = BLOCKS.register("spruce_log_stairs", () ->
			new CPlusStairBlock(SPRUCE_STAIRS.getDefaultState(), Block.Settings.copy(SPRUCE_STAIRS))),
	SPRUCE_LOG_SLAB = BLOCKS.register("spruce_log_slab", () ->
			new SlabBlock(Block.Settings.copy(SPRUCE_STAIRS))),
	SPRUCE_WOOD_STAIRS = BLOCKS.register("spruce_wood_stairs", () ->
			new CPlusStairBlock(SPRUCE_STAIRS.getDefaultState(), Block.Settings.copy(SPRUCE_STAIRS))),
	SPRUCE_WOOD_SLAB = BLOCKS.register("spruce_wood_slab", () ->
			new SlabBlock(Block.Settings.copy(SPRUCE_STAIRS))),
	CRIMSON_STEM_STAIRS = BLOCKS.register("crimson_stem_stairs", () ->
			new CPlusStairBlock(CRIMSON_STAIRS.getDefaultState(), Block.Settings.copy(CRIMSON_STAIRS))),
	CRIMSON_STEM_SLAB = BLOCKS.register("crimson_stem_slab", () ->
			new SlabBlock(Block.Settings.copy(CRIMSON_STAIRS))),
	CRIMSON_HYPHAE_STAIRS = BLOCKS.register("crimson_hyphae_stairs", () ->
			new CPlusStairBlock(CRIMSON_STAIRS.getDefaultState(), Block.Settings.copy(CRIMSON_STAIRS))),
	CRIMSON_HYPHAE_SLAB = BLOCKS.register("crimson_hyphae_slab", () ->
			new SlabBlock(Block.Settings.copy(CRIMSON_STAIRS))),
	WARPED_STEM_STAIRS = BLOCKS.register("warped_stem_stairs", () ->
			new CPlusStairBlock(WARPED_STAIRS.getDefaultState(), Block.Settings.copy(WARPED_STAIRS))),
	WARPED_STEM_SLAB = BLOCKS.register("warped_stem_slab", () ->
			new SlabBlock(Block.Settings.copy(WARPED_STAIRS))),
	WARPED_HYPHAE_STAIRS = BLOCKS.register("warped_hyphae_stairs", () ->
			new CPlusStairBlock(WARPED_STAIRS.getDefaultState(), Block.Settings.copy(WARPED_STAIRS))),
	WARPED_HYPHAE_SLAB = BLOCKS.register("warped_hyphae_slab", () ->
			new SlabBlock(Block.Settings.copy(WARPED_STAIRS))),

	// Stripped Logs and Wood Stairs/Slabs
	// Follows Log Stair, Log Slab, Wood Stair, Wood Slab format
	STRIPPED_OAK_LOG_STAIRS = BLOCKS.register("stripped_oak_log_stairs", () ->
			new CPlusStairBlock(OAK_STAIRS.getDefaultState(), Block.Settings.copy(OAK_STAIRS))),
	STRIPPED_OAK_LOG_SLAB = BLOCKS.register("stripped_oak_log_slab", () ->
			new SlabBlock(Block.Settings.copy(OAK_STAIRS))),
	STRIPPED_OAK_WOOD_STAIRS = BLOCKS.register("stripped_oak_wood_stairs", () ->
			new CPlusStairBlock(OAK_STAIRS.getDefaultState(), Block.Settings.copy(OAK_STAIRS))),
	STRIPPED_OAK_WOOD_SLAB = BLOCKS.register("stripped_oak_wood_slab", () ->
			new SlabBlock(Block.Settings.copy(OAK_STAIRS))),
	STRIPPED_DARK_OAK_LOG_STAIRS = BLOCKS.register("stripped_dark_oak_log_stairs", () ->
			new CPlusStairBlock(DARK_OAK_STAIRS.getDefaultState(), Block.Settings.copy(DARK_OAK_STAIRS))),
	STRIPPED_DARK_OAK_LOG_SLAB = BLOCKS.register("stripped_dark_oak_log_slab", () ->
			new SlabBlock(Block.Settings.copy(DARK_OAK_STAIRS))),
	STRIPPED_DARK_OAK_WOOD_STAIRS = BLOCKS.register("stripped_dark_oak_wood_stairs", () ->
			new CPlusStairBlock(DARK_OAK_STAIRS.getDefaultState(), Block.Settings.copy(DARK_OAK_STAIRS))),
	STRIPPED_DARK_OAK_WOOD_SLAB = BLOCKS.register("stripped_dark_oak_wood_slab", () ->
			new SlabBlock(Block.Settings.copy(DARK_OAK_STAIRS))),
	STRIPPED_ACACIA_LOG_STAIRS = BLOCKS.register("stripped_acacia_log_stairs", () ->
			new CPlusStairBlock(ACACIA_STAIRS.getDefaultState(), Block.Settings.copy(ACACIA_STAIRS))),
	STRIPPED_ACACIA_LOG_SLAB = BLOCKS.register("stripped_acacia_log_slab", () ->
			new SlabBlock(Block.Settings.copy(ACACIA_STAIRS))),
	STRIPPED_ACACIA_WOOD_STAIRS = BLOCKS.register("stripped_acacia_wood_stairs", () ->
			new CPlusStairBlock(ACACIA_STAIRS.getDefaultState(), Block.Settings.copy(ACACIA_STAIRS))),
	STRIPPED_ACACIA_WOOD_SLAB = BLOCKS.register("stripped_acacia_wood_slab", () ->
			new SlabBlock(Block.Settings.copy(ACACIA_STAIRS))),
	STRIPPED_BIRCH_LOG_STAIRS = BLOCKS.register("stripped_birch_log_stairs", () ->
			new CPlusStairBlock(BIRCH_STAIRS.getDefaultState(), Block.Settings.copy(BIRCH_STAIRS))),
	STRIPPED_BIRCH_LOG_SLAB = BLOCKS.register("stripped_birch_log_slab", () ->
			new SlabBlock(Block.Settings.copy(BIRCH_STAIRS))),
	STRIPPED_BIRCH_WOOD_STAIRS = BLOCKS.register("stripped_birch_wood_stairs", () ->
			new CPlusStairBlock(BIRCH_STAIRS.getDefaultState(), Block.Settings.copy(BIRCH_STAIRS))),
	STRIPPED_BIRCH_WOOD_SLAB = BLOCKS.register("stripped_birch_wood_slab", () ->
			new SlabBlock(Block.Settings.copy(BIRCH_STAIRS))),
	STRIPPED_JUNGLE_LOG_STAIRS = BLOCKS.register("stripped_jungle_log_stairs", () ->
			new CPlusStairBlock(JUNGLE_STAIRS.getDefaultState(), Block.Settings.copy(JUNGLE_STAIRS))),
	STRIPPED_JUNGLE_LOG_SLAB = BLOCKS.register("stripped_jungle_log_slab", () ->
			new SlabBlock(Block.Settings.copy(JUNGLE_STAIRS))),
	STRIPPED_JUNGLE_WOOD_STAIRS = BLOCKS.register("stripped_jungle_wood_stairs", () ->
			new CPlusStairBlock(JUNGLE_STAIRS.getDefaultState(), Block.Settings.copy(JUNGLE_STAIRS))),
	STRIPPED_JUNGLE_WOOD_SLAB = BLOCKS.register("stripped_jungle_wood_slab", () ->
			new SlabBlock(Block.Settings.copy(JUNGLE_STAIRS))),
	STRIPPED_SPRUCE_LOG_STAIRS = BLOCKS.register("stripped_spruce_log_stairs", () ->
			new CPlusStairBlock(SPRUCE_STAIRS.getDefaultState(), Block.Settings.copy(SPRUCE_STAIRS))),
	STRIPPED_SPRUCE_LOG_SLAB = BLOCKS.register("stripped_spruce_log_slab", () ->
			new SlabBlock(Block.Settings.copy(SPRUCE_STAIRS))),
	STRIPPED_SPRUCE_WOOD_STAIRS = BLOCKS.register("stripped_spruce_wood_stairs", () ->
			new CPlusStairBlock(SPRUCE_STAIRS.getDefaultState(), Block.Settings.copy(SPRUCE_STAIRS))),
	STRIPPED_SPRUCE_WOOD_SLAB = BLOCKS.register("stripped_spruce_wood_slab", () ->
			new SlabBlock(Block.Settings.copy(SPRUCE_STAIRS))),
	STRIPPED_CRIMSON_STEM_STAIRS = BLOCKS.register("stripped_crimson_stem_stairs", () ->
			new CPlusStairBlock(CRIMSON_STAIRS.getDefaultState(), Block.Settings.copy(CRIMSON_STAIRS))),
	STRIPPED_CRIMSON_STEM_SLAB = BLOCKS.register("stripped_crimson_stem_slab", () ->
			new SlabBlock(Block.Settings.copy(CRIMSON_STAIRS))),
	STRIPPED_CRIMSON_HYPHAE_STAIRS = BLOCKS.register("stripped_crimson_hyphae_stairs", () ->
			new CPlusStairBlock(CRIMSON_STAIRS.getDefaultState(), Block.Settings.copy(CRIMSON_STAIRS))),
	STRIPPED_CRIMSON_HYPHAE_SLAB = BLOCKS.register("stripped_crimson_hyphae_slab", () ->
			new SlabBlock(Block.Settings.copy(CRIMSON_STAIRS))),
	STRIPPED_WARPED_STEM_STAIRS = BLOCKS.register("stripped_warped_stem_stairs", () ->
			new CPlusStairBlock(WARPED_STAIRS.getDefaultState(), Block.Settings.copy(WARPED_STAIRS))),
	STRIPPED_WARPED_STEM_SLAB = BLOCKS.register("stripped_warped_stem_slab", () ->
			new SlabBlock(Block.Settings.copy(WARPED_STAIRS))),
	STRIPPED_WARPED_HYPHAE_STAIRS = BLOCKS.register("stripped_warped_hyphae_stairs", () ->
			new CPlusStairBlock(WARPED_STAIRS.getDefaultState(), Block.Settings.copy(WARPED_STAIRS))),
	STRIPPED_WARPED_HYPHAE_SLAB = BLOCKS.register("stripped_warped_hyphae_slab", () ->
			new SlabBlock(Block.Settings.copy(WARPED_STAIRS))),

	// Miscellaneous
	// JACK_O_RED = BLOCKS.register("jack_o_red", () -> new RedstonePumpkinBlock(Block.Settings.of(Material.GOURD, MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD)13))),
	JACK_O_SOUL = BLOCKS.register("jack_o_soul", () ->
			new CPlusCarvedPumpkinBlock(Block.Settings.of(Material.GOURD, MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD).luminance((state) -> 10))),
	WARPED_WART = BLOCKS.register("warped_wart", () ->
			new WarpedNetherWartPlantBlock(Block.Settings.of(Material.PLANT, MapColor.BLUE).noCollision().ticksRandomly().sounds(BlockSoundGroup.NETHER_WART).nonOpaque())),
	KFP_BLOCK = BLOCKS.register("kfp_block", () ->
			new Block(Block.Settings.copy(CARVED_ORANGE_CONCRETE.get()))),
//	CHARCOAL_BLOCK = BLOCKS.register("charcoal_block", () -> new Block(Block.Settings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(5.0F, 6.0F))),
	PINEAPPLE = BLOCKS.register("pineapple", () ->
			new CPlusCarvedPumpkinBlock(Block.Settings.of(Material.GOURD, MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD))),
	NETHERITE_STAIRS = BLOCKS.register("netherite_stairs", () ->
			new CPlusStairBlock(NETHERITE_BLOCK.getDefaultState(), Block.Settings.copy(NETHERITE_BLOCK))),
	SUSPICIOUS_SLAB = BLOCKS.register("suspicious_slab", () ->
			new SlabBlock(Block.Settings.copy(CLAY))),
	JET = BLOCKS.register("jet", () ->
			new Block(Block.Settings.copy(BEDROCK))),
	NUBERT = BLOCKS.register("nubert",
			NubertBlock::new),
	WIGGED_NUBERT = BLOCKS.register("wigged_nubert",
			WiggedNubertBlock::new),
//  SIUOLS_SANITY = BLOCKS.register("is_a_crab", () -> new Block(Block.Settings.copy(HELP_ME))),
	//  You are having funny fun because your playing a Siuolplexplex contributed mod

	// Deprecated Blocks
	STONE_BRICK_PILLAR = BLOCKS.register("stone_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(STONE_BRICKS))),
	CRACKED_STONE_BRICK_PILLAR = BLOCKS.register("cracked_stone_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(STONE_BRICKS))),
	MOSSY_STONE_BRICK_PILLAR = BLOCKS.register("mossy_stone_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(STONE_BRICKS))),
	CARVED_STONE_BRICKS = BLOCKS.register("carved_stone_bricks", () ->
			new Block(Block.Settings.copy(STONE_BRICKS))),
	CRACKED_CHISELED_STONE_BRICKS = BLOCKS.register("cracked_chiseled_stone_bricks", () ->
			new Block(Block.Settings.copy(STONE_BRICKS))),
	MOSSY_CHISELED_STONE_BRICKS = BLOCKS.register("mossy_chiseled_stone_bricks", () ->
			new Block(Block.Settings.copy(STONE_BRICKS))),

	MOSSY_BLACKSTONE_BRICK_PILLAR = BLOCKS.register("mossy_blackstone_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	CRACKED_BLACKSTONE_BRICK_PILLAR = BLOCKS.register("cracked_blackstone_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),
	BLACKSTONE_BRICK_PILLAR = BLOCKS.register("blackstone_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS))),

	CHISELED_BRICKS = BLOCKS.register("chiseled_bricks", () ->
			new Block(Block.Settings.copy(BRICKS))),
	BRICK_PILLAR = BLOCKS.register("brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(BRICKS))),
	CARVED_BRICKS = BLOCKS.register("carved_bricks", () ->
			new Block(Block.Settings.copy(BRICKS))),

	END_STONE_BRICK_PILLAR = BLOCKS.register("end_stone_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(END_STONE_BRICKS))),

	SMOOTH_PURPUR_BLOCK = BLOCKS.register("smooth_purpur_block", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR))),
	POLISHED_PURPUR_BLOCK = BLOCKS.register("polished_purpur_block", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR))),
	CHISELED_PURPUR_BLOCK = BLOCKS.register("chiseled_purpur_block", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR))),
	PURPUR_CORNER_PILLAR = BLOCKS.register("purpur_corner_pillar", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR)))
			
			;

	// Siuol's selection regex syntax machine (?=")(.*)(?<=____")
	// Per Thing regex selection machine (?=")(.*)(____.*)(?<=")
	
	public static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos, EntityType<?> entityType) {
		return false;
	}

	public static void init() {
		BLOCKS.register();
	}
}
package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
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
import io.github.consistencyplus.consistency_plus.core.CPlusCarvedPumpkinBlock;
import io.github.consistencyplus.consistency_plus.core.CPlusStairBlock;
import io.github.consistencyplus.consistency_plus.utils.IdHandler;
import net.minecraft.block.*;
import net.minecraft.entity.EntityType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

import static net.minecraft.block.Blocks.*;

public class CPlusBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(IdHandler.ID, Registry.BLOCK_KEY);

	//Stone

	public static final RegistrySupplier<Block> STONE_WALL = BLOCKS.register("stone_wall", () ->
			new WallBlock(Block.Settings.copy(STONE)));
	public static final RegistrySupplier<Block> STONE_GATE = BLOCKS.register("stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(STONE)));

	public static final RegistrySupplier<Block> COBBLESTONE_GATE = BLOCKS.register("cobblestone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(COBBLESTONE)));
	public static final RegistrySupplier<Block> MOSSY_COBBLESTONE_GATE = BLOCKS.register("mossy_cobblestone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MOSSY_COBBLESTONE)));
	//Smooth
	public static final RegistrySupplier<Block> SMOOTH_STONE_STAIRS = BLOCKS.register("smooth_stone_stairs", () ->
			new CPlusStairBlock(SMOOTH_STONE.getDefaultState(), Block.Settings.copy(STONE)));
	public static final RegistrySupplier<Block> SMOOTH_STONE_WALL = BLOCKS.register("smooth_stone_wall", () ->
			new WallBlock(Block.Settings.copy(STONE)));
	public static final RegistrySupplier<Block> SMOOTH_STONE_GATE = BLOCKS.register("smooth_stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(STONE)));

	//Polished
	public static final RegistrySupplier<Block> POLISHED_STONE = BLOCKS.register("polished_stone", () ->
			new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> POLISHED_STONE_SLAB = BLOCKS.register("polished_stone_slab", () ->
			new SlabBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> POLISHED_STONE_STAIRS = BLOCKS.register("polished_stone_stairs", () ->
			new CPlusStairBlock(STONE_BRICKS.getDefaultState(), Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> POLISHED_STONE_WALL = BLOCKS.register("polished_stone_wall", () ->
			new WallBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> POLISHED_STONE_GATE = BLOCKS.register("polished_stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(STONE)));

	//Cut
	public static final RegistrySupplier<Block> CUT_STONE = BLOCKS.register("cut_stone", () ->
			new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> CUT_STONE_SLAB = BLOCKS.register("cut_stone_slab", () ->
			new SlabBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> CUT_STONE_STAIRS = BLOCKS.register("cut_stone_stairs", () ->
			new CPlusStairBlock(STONE_BRICKS.getDefaultState(), Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> CUT_STONE_WALL = BLOCKS.register("cut_stone_wall", () ->
			new WallBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> CUT_STONE_GATE = BLOCKS.register("cut_stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(STONE_BRICKS)));

	public static final RegistrySupplier<Block> STONE_TILES = BLOCKS.register("stone_tiles", () ->
			new Block(Block.Settings.copy(STONE)));
	public static final RegistrySupplier<Block> STONE_TILE_SLAB = BLOCKS.register("stone_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(STONE)));
	public static final RegistrySupplier<Block> STONE_TILE_STAIRS = BLOCKS.register("stone_tile_stairs", () ->
			new CPlusStairBlock(STONE_TILES.get().getDefaultState(), Block.Settings.copy(STONE)));
	public static final RegistrySupplier<Block> STONE_TILE_WALL = BLOCKS.register("stone_tile_wall", () ->
			new WallBlock(Block.Settings.copy(STONE)));
	public static final RegistrySupplier<Block> STONE_TILE_GATE = BLOCKS.register("stone_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(STONE)));

	// Bricks
	public static final RegistrySupplier<Block> STONE_BRICK_GATE = BLOCKS.register("stone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(STONE_BRICKS)));

	// Cracked
	public static final RegistrySupplier<Block> CRACKED_STONE_BRICK_SLAB = BLOCKS.register("cracked_stone_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(CRACKED_STONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_STONE_BRICK_STAIRS = BLOCKS.register("cracked_stone_brick_stairs", () ->
			new CPlusStairBlock(CRACKED_STONE_BRICKS.getDefaultState(), Block.Settings.copy(CRACKED_STONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_STONE_BRICK_WALL = BLOCKS.register("cracked_stone_brick_wall", () ->
			new WallBlock(Block.Settings.copy(CRACKED_STONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_STONE_BRICK_GATE = BLOCKS.register("cracked_stone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CRACKED_STONE_BRICKS)));

	// Mossy
	public static final RegistrySupplier<Block> MOSSY_STONE_BRICK_GATE = BLOCKS.register("mossy_stone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MOSSY_STONE_BRICKS)));

	// Pillar and Chiseled
	public static final RegistrySupplier<Block> STONE_PILLAR = BLOCKS.register("stone_pillar", () ->
			new PillarBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_STONE_PILLAR = BLOCKS.register("cracked_stone_pillar", () ->
			new PillarBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_STONE_PILLAR = BLOCKS.register("mossy_stone_pillar", () ->
			new PillarBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> STONE_CORNER_PILLAR = BLOCKS.register("stone_corner_pillar", () ->
			new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_STONE_CORNER_PILLAR = BLOCKS.register("cracked_stone_corner_pillar", () ->
			new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_STONE_CORNER_PILLAR = BLOCKS.register("mossy_stone_corner_pillar", () ->
			new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_CHISELED_STONE = BLOCKS.register("cracked_chiseled_stone", () ->
			new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_CHISELED_STONE = BLOCKS.register("mossy_chiseled_stone", () ->
			new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> CARVED_STONE = BLOCKS.register("carved_stone", () ->
			new Block(Block.Settings.copy(STONE_BRICKS)));

	//Blackstone
	public static final RegistrySupplier<Block> COBBLED_BLACKSTONE = BLOCKS.register("cobbled_blackstone", () ->
			new Block(Block.Settings.copy(BLACKSTONE)));
	public static final RegistrySupplier<Block> COBBLED_BLACKSTONE_SLAB = BLOCKS.register("cobbled_blackstone_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACKSTONE)));
	public static final RegistrySupplier<Block> COBBLED_BLACKSTONE_STAIRS = BLOCKS.register("cobbled_blackstone_stairs", () ->
			new CPlusStairBlock(BLACKSTONE.getDefaultState(), Block.Settings.copy(BLACKSTONE)));
	public static final RegistrySupplier<Block> COBBLED_BLACKSTONE_WALL = BLOCKS.register("cobbled_blackstone_wall", () ->
			new WallBlock(Block.Settings.copy(BLACKSTONE)));
	public static final RegistrySupplier<Block> COBBLED_BLACKSTONE_GATE = BLOCKS.register("cobbled_blackstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACKSTONE)));

	public static final RegistrySupplier<Block> BLACKSTONE_GATE = BLOCKS.register("blackstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACKSTONE)));
	public static final RegistrySupplier<Block> BLACKSTONE_BRICK_GATE = BLOCKS.register("blackstone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> POLISHED_BLACKSTONE_GATE = BLOCKS.register("polished_blackstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACKSTONE)));

	//Smooth
	public static final RegistrySupplier<Block> SMOOTH_BLACKSTONE = BLOCKS.register("smooth_blackstone", () ->
			new Block(Block.Settings.copy(BLACKSTONE)));
	public static final RegistrySupplier<Block> SMOOTH_BLACKSTONE_SLAB = BLOCKS.register("smooth_blackstone_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACKSTONE)));
	public static final RegistrySupplier<Block> SMOOTH_BLACKSTONE_STAIRS = BLOCKS.register("smooth_blackstone_stairs", () ->
			new CPlusStairBlock(BLACKSTONE.getDefaultState(), Block.Settings.copy(BLACKSTONE)));
	public static final RegistrySupplier<Block> SMOOTH_BLACKSTONE_WALL = BLOCKS.register("smooth_blackstone_wall", () ->
			new WallBlock(Block.Settings.copy(BLACKSTONE)));
	public static final RegistrySupplier<Block> SMOOTH_BLACKSTONE_GATE = BLOCKS.register("smooth_blackstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACKSTONE)));

	//Cut
	public static final RegistrySupplier<Block> CUT_BLACKSTONE = BLOCKS.register("cut_blackstone", () ->
			new Block(Block.Settings.copy(BLACKSTONE)));
	public static final RegistrySupplier<Block> CUT_BLACKSTONE_SLAB = BLOCKS.register("cut_blackstone_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACKSTONE)));
	public static final RegistrySupplier<Block> CUT_BLACKSTONE_STAIRS = BLOCKS.register("cut_blackstone_stairs", () ->
			new CPlusStairBlock(BLACKSTONE.getDefaultState(), Block.Settings.copy(BLACKSTONE)));
	public static final RegistrySupplier<Block> CUT_BLACKSTONE_WALL = BLOCKS.register("cut_blackstone_wall", () ->
			new WallBlock(Block.Settings.copy(BLACKSTONE)));
	public static final RegistrySupplier<Block> CUT_BLACKSTONE_GATE = BLOCKS.register("cut_blackstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACKSTONE)));

	public static final RegistrySupplier<Block> BLACKSTONE_TILES = BLOCKS.register("blackstone_tiles", () ->
			new Block(Block.Settings.copy(BLACKSTONE)));
	public static final RegistrySupplier<Block> BLACKSTONE_TILE_SLAB = BLOCKS.register("blackstone_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACKSTONE)));
	public static final RegistrySupplier<Block> BLACKSTONE_TILE_STAIRS = BLOCKS.register("blackstone_tile_stairs", () ->
			new CPlusStairBlock(BLACKSTONE_TILES.get().getDefaultState(), Block.Settings.copy(BLACKSTONE)));
	public static final RegistrySupplier<Block> BLACKSTONE_TILE_WALL = BLOCKS.register("blackstone_tile_wall", () ->
			new WallBlock(Block.Settings.copy(BLACKSTONE)));
	public static final RegistrySupplier<Block> BLACKSTONE_TILE_GATE = BLOCKS.register("blackstone_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACKSTONE)));

	//Cracked
	public static final RegistrySupplier<Block> CRACKED_BLACKSTONE_BRICK_SLAB = BLOCKS.register("cracked_blackstone_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLACKSTONE_BRICK_STAIRS = BLOCKS.register("cracked_blackstone_brick_stairs", () ->
			new CPlusStairBlock(CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), Block.Settings.copy(CRACKED_STONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLACKSTONE_BRICK_WALL = BLOCKS.register("cracked_blackstone_brick_wall", () ->
			new WallBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLACKSTONE_BRICK_GATE = BLOCKS.register("cracked_blackstone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));

	//Mossy
	public static final RegistrySupplier<Block> MOSSY_BLACKSTONE_BRICKS = BLOCKS.register("mossy_blackstone_bricks", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_BLACKSTONE_BRICK_SLAB = BLOCKS.register("mossy_blackstone_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_BLACKSTONE_BRICK_STAIRS = BLOCKS.register("mossy_blackstone_brick_stairs", () ->
			new CPlusStairBlock(POLISHED_BLACKSTONE_BRICKS.getDefaultState(), Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_BLACKSTONE_BRICK_WALL = BLOCKS.register("mossy_blackstone_brick_wall", () ->
			new WallBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_BLACKSTONE_BRICK_GATE = BLOCKS.register("mossy_blackstone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));

	//Pillars and Chiseled
	public static final RegistrySupplier<Block> MOSSY_BLACKSTONE_PILLAR = BLOCKS.register("mossy_blackstone_pillar", () ->
			new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLACKSTONE_PILLAR = BLOCKS.register("cracked_blackstone_pillar", () ->
			new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> BLACKSTONE_PILLAR = BLOCKS.register("blackstone_pillar", () ->
			new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_BLACKSTONE_CORNER_PILLAR = BLOCKS.register("mossy_blackstone_corner_pillar", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLACKSTONE_CORNER_PILLAR = BLOCKS.register("cracked_blackstone_corner_pillar", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> BLACKSTONE_CORNER_PILLAR = BLOCKS.register("blackstone_corner_pillar", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> CHISELED_BLACKSTONE = BLOCKS.register("chiseled_blackstone", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_CHISELED_BLACKSTONE = BLOCKS.register("mossy_chiseled_blackstone", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_CHISELED_BLACKSTONE = BLOCKS.register("cracked_chiseled_blackstone", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_CARVED_BLACKSTONE = BLOCKS.register("mossy_carved_blackstone", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_CARVED_BLACKSTONE = BLOCKS.register("cracked_carved_blackstone", () ->
			new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));

	//Sandstone
	public static final RegistrySupplier<Block> COBBLED_SANDSTONE = BLOCKS.register("cobbled_sandstone", () ->
			new Block(Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> COBBLED_SANDSTONE_SLAB = BLOCKS.register("cobbled_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> COBBLED_SANDSTONE_STAIRS = BLOCKS.register("cobbled_sandstone_stairs", () ->
			new CPlusStairBlock(SANDSTONE.getDefaultState(), Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> COBBLED_SANDSTONE_WALL = BLOCKS.register("cobbled_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> COBBLED_SANDSTONE_GATE = BLOCKS.register("cobbled_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SANDSTONE)));

	public static final RegistrySupplier<Block> SANDSTONE_GATE = BLOCKS.register("sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SANDSTONE)));

	//Smooth
	public static final RegistrySupplier<Block> SMOOTH_SANDSTONE_WALL = BLOCKS.register("smooth_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> SMOOTH_SANDSTONE_GATE = BLOCKS.register("smooth_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SANDSTONE)));

	//Cut
	public static final RegistrySupplier<Block> CUT_SANDSTONE_STAIRS = BLOCKS.register("cut_sandstone_stairs", () ->
			new CPlusStairBlock(CUT_SANDSTONE.getDefaultState(), Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> CUT_SANDSTONE_WALL = BLOCKS.register("cut_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> CUT_SANDSTONE_GATE = BLOCKS.register("cut_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SANDSTONE)));

	//Polished
	public static final RegistrySupplier<Block> POLISHED_SANDSTONE = BLOCKS.register("polished_sandstone", () ->
			new Block(Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> POLISHED_SANDSTONE_SLAB = BLOCKS.register("polished_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> POLISHED_SANDSTONE_STAIRS = BLOCKS.register("polished_sandstone_stairs", () ->
			new CPlusStairBlock(SANDSTONE.getDefaultState(), Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> POLISHED_SANDSTONE_WALL = BLOCKS.register("polished_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> POLISHED_SANDSTONE_GATE = BLOCKS.register("polished_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SANDSTONE)));

	//Bricks
	public static final RegistrySupplier<Block> SANDSTONE_BRICKS = BLOCKS.register("sandstone_bricks", () ->
			new Block(Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> SANDSTONE_BRICK_SLAB = BLOCKS.register("sandstone_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> SANDSTONE_BRICK_STAIRS = BLOCKS.register("sandstone_brick_stairs", () ->
			new CPlusStairBlock(SANDSTONE.getDefaultState(), Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> SANDSTONE_BRICK_WALL = BLOCKS.register("sandstone_brick_wall", () ->
			new WallBlock(Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> SANDSTONE_BRICK_GATE = BLOCKS.register("sandstone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SANDSTONE)));

	public static final RegistrySupplier<Block> SANDSTONE_TILES = BLOCKS.register("sandstone_tiles", () ->
			new Block(Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> SANDSTONE_TILE_SLAB = BLOCKS.register("sandstone_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> SANDSTONE_TILE_STAIRS = BLOCKS.register("sandstone_tile_stairs", () ->
			new CPlusStairBlock(SANDSTONE_TILES.get().getDefaultState(), Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> SANDSTONE_TILE_WALL = BLOCKS.register("sandstone_tile_wall", () ->
			new WallBlock(Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> SANDSTONE_TILE_GATE = BLOCKS.register("sandstone_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SANDSTONE)));

	//Pillars and Chiseled
	public static final RegistrySupplier<Block> CHISELED_SANDSTONE = BLOCKS.register("chiseled_sandstone", () ->
			new Block(Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> SANDSTONE_PILLAR = BLOCKS.register("sandstone_pillar", () ->
			new PillarBlock(Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> SANDSTONE_CORNER_PILLAR = BLOCKS.register("sandstone_corner_pillar", () ->
			new Block(Block.Settings.copy(SANDSTONE)));

	//Red Sandstone
	public static final RegistrySupplier<Block> COBBLED_RED_SANDSTONE = BLOCKS.register("cobbled_red_sandstone", () ->
			new Block(Block.Settings.copy(RED_SANDSTONE)));
	public static final RegistrySupplier<Block> COBBLED_RED_SANDSTONE_SLAB = BLOCKS.register("cobbled_red_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_SANDSTONE)));
	public static final RegistrySupplier<Block> COBBLED_RED_SANDSTONE_STAIRS = BLOCKS.register("cobbled_red_sandstone_stairs", () ->
			new CPlusStairBlock(RED_SANDSTONE.getDefaultState(), Block.Settings.copy(RED_SANDSTONE)));
	public static final RegistrySupplier<Block> COBBLED_RED_SANDSTONE_WALL = BLOCKS.register("cobbled_red_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(RED_SANDSTONE)));
	public static final RegistrySupplier<Block> COBBLED_RED_SANDSTONE_GATE = BLOCKS.register("cobbled_red_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_SANDSTONE)));

	public static final RegistrySupplier<Block> RED_SANDSTONE_GATE = BLOCKS.register("red_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_SANDSTONE)));

	//Smooth
	public static final RegistrySupplier<Block> SMOOTH_RED_SANDSTONE_WALL = BLOCKS.register("smooth_red_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(RED_SANDSTONE)));
	public static final RegistrySupplier<Block> SMOOTH_RED_SANDSTONE_GATE = BLOCKS.register("smooth_red_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_SANDSTONE)));

	//Cut
	public static final RegistrySupplier<Block> CUT_RED_SANDSTONE_STAIRS = BLOCKS.register("cut_red_sandstone_stairs", () ->
			new CPlusStairBlock(CUT_SANDSTONE.getDefaultState(), Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> CUT_RED_SANDSTONE_WALL = BLOCKS.register("cut_red_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> CUT_RED_SANDSTONE_GATE = BLOCKS.register("cut_red_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_SANDSTONE)));

	//Polished
	public static final RegistrySupplier<Block> POLISHED_RED_SANDSTONE = BLOCKS.register("polished_red_sandstone", () ->
			new Block(Block.Settings.copy(RED_SANDSTONE)));
	public static final RegistrySupplier<Block> POLISHED_RED_SANDSTONE_SLAB = BLOCKS.register("polished_red_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_SANDSTONE)));
	public static final RegistrySupplier<Block> POLISHED_RED_SANDSTONE_STAIRS = BLOCKS.register("polished_red_sandstone_stairs", () ->
			new CPlusStairBlock(RED_SANDSTONE.getDefaultState(), Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> POLISHED_RED_SANDSTONE_WALL = BLOCKS.register("polished_red_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(RED_SANDSTONE)));
	public static final RegistrySupplier<Block> POLISHED_RED_SANDSTONE_GATE = BLOCKS.register("polished_red_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_SANDSTONE)));

	//Bricks
	public static final RegistrySupplier<Block> RED_SANDSTONE_BRICKS = BLOCKS.register("red_sandstone_bricks", () ->
			new Block(Block.Settings.copy(RED_SANDSTONE)));
	public static final RegistrySupplier<Block> RED_SANDSTONE_BRICK_SLAB = BLOCKS.register("red_sandstone_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_SANDSTONE)));
	public static final RegistrySupplier<Block> RED_SANDSTONE_BRICK_STAIRS = BLOCKS.register("red_sandstone_brick_stairs", () ->
			new CPlusStairBlock(RED_SANDSTONE.getDefaultState(), Block.Settings.copy(SANDSTONE)));
	public static final RegistrySupplier<Block> RED_SANDSTONE_BRICK_WALL = BLOCKS.register("red_sandstone_brick_wall", () ->
			new WallBlock(Block.Settings.copy(RED_SANDSTONE)));
	public static final RegistrySupplier<Block> RED_SANDSTONE_BRICK_GATE = BLOCKS.register("red_sandstone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_SANDSTONE)));

	public static final RegistrySupplier<Block> RED_SANDSTONE_TILES = BLOCKS.register("red_sandstone_tiles", () ->
			new Block(Block.Settings.copy(RED_SANDSTONE)));
	public static final RegistrySupplier<Block> RED_SANDSTONE_TILE_SLAB = BLOCKS.register("red_sandstone_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_SANDSTONE)));
	public static final RegistrySupplier<Block> RED_SANDSTONE_TILE_STAIRS = BLOCKS.register("red_sandstone_tile_stairs", () ->
			new CPlusStairBlock(RED_SANDSTONE_TILES.get().getDefaultState(), Block.Settings.copy(RED_SANDSTONE)));
	public static final RegistrySupplier<Block> RED_SANDSTONE_TILE_WALL = BLOCKS.register("red_sandstone_tile_wall", () ->
			new WallBlock(Block.Settings.copy(RED_SANDSTONE)));
	public static final RegistrySupplier<Block> RED_SANDSTONE_TILE_GATE = BLOCKS.register("red_sandstone_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_SANDSTONE)));

	//Pillars and Chiseled
	public static final RegistrySupplier<Block> CHISELED_RED_SANDSTONE = BLOCKS.register("chiseled_red_sandstone", () ->
			new Block(Block.Settings.copy(RED_SANDSTONE)));
	public static final RegistrySupplier<Block> RED_SANDSTONE_PILLAR = BLOCKS.register("red_sandstone_pillar", () ->
			new PillarBlock(Block.Settings.copy(RED_SANDSTONE)));
	public static final RegistrySupplier<Block> RED_SANDSTONE_CORNER_PILLAR = BLOCKS.register("red_sandstone_corner_pillar", () ->
			new Block(Block.Settings.copy(RED_SANDSTONE)));

	//Quartz
	public static final RegistrySupplier<Block> QUARTZ_WALL = BLOCKS.register("quartz_wall", () ->
			new WallBlock(Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> QUARTZ_GATE = BLOCKS.register("quartz_gate", () ->
			new FenceGateBlock(Block.Settings.copy(QUARTZ_BLOCK)));

	//Smooth
	public static final RegistrySupplier<Block> SMOOTH_QUARTZ_WALL = BLOCKS.register("smooth_quartz_wall", () ->
			new WallBlock(Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> SMOOTH_QUARTZ_GATE = BLOCKS.register("smooth_quartz_gate", () ->
			new FenceGateBlock(Block.Settings.copy(QUARTZ_BLOCK)));

	//Cut
	public static final RegistrySupplier<Block> CUT_QUARTZ = BLOCKS.register("cut_quartz", () ->
			new Block(Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> CUT_QUARTZ_SLAB = BLOCKS.register("cut_quartz_slab", () ->
			new SlabBlock(Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> CUT_QUARTZ_STAIRS = BLOCKS.register("cut_quartz_stairs", () ->
			new CPlusStairBlock(QUARTZ_BLOCK.getDefaultState(), Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> CUT_QUARTZ_WALL = BLOCKS.register("cut_quartz_wall", () ->
			new WallBlock(Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> CUT_QUARTZ_GATE = BLOCKS.register("cut_quartz_gate", () ->
			new FenceGateBlock(Block.Settings.copy(QUARTZ_BLOCK)));

	//Tiles
	public static final RegistrySupplier<Block> QUARTZ_TILES = BLOCKS.register("quartz_tiles", () ->
			new Block(Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> QUARTZ_TILE_SLAB = BLOCKS.register("quartz_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> QUARTZ_TILE_STAIRS = BLOCKS.register("quartz_tile_stairs", () ->
			new CPlusStairBlock(QUARTZ_BLOCK.getDefaultState(), Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> QUARTZ_TILE_WALL = BLOCKS.register("quartz_tile_wall", () ->
			new WallBlock(Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> QUARTZ_TILE_GATE = BLOCKS.register("quartz_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(QUARTZ_BLOCK)));

	//Polished
	public static final RegistrySupplier<Block> POLISHED_QUARTZ = BLOCKS.register("polished_quartz", () ->
			new Block(Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> POLISHED_QUARTZ_SLAB = BLOCKS.register("polished_quartz_slab", () ->
			new SlabBlock(Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> POLISHED_QUARTZ_STAIRS = BLOCKS.register("polished_quartz_stairs", () ->
			new CPlusStairBlock(QUARTZ_BLOCK.getDefaultState(), Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> POLISHED_QUARTZ_WALL = BLOCKS.register("polished_quartz_wall", () ->
			new WallBlock(Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> POLISHED_QUARTZ_GATE = BLOCKS.register("polished_quartz_gate", () ->
			new FenceGateBlock(Block.Settings.copy(QUARTZ_BLOCK)));

	//Bricks
	public static final RegistrySupplier<Block> QUARTZ_BRICK_SLAB = BLOCKS.register("quartz_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> QUARTZ_BRICK_STAIRS = BLOCKS.register("quartz_brick_stairs", () ->
			new CPlusStairBlock(QUARTZ_BLOCK.getDefaultState(), Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> QUARTZ_BRICK_WALL = BLOCKS.register("quartz_brick_wall", () ->
			new WallBlock(Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> QUARTZ_BRICK_GATE = BLOCKS.register("quartz_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(QUARTZ_BLOCK)));

	public static final RegistrySupplier<Block> CARVED_QUARTZ = BLOCKS.register("carved_quartz", () ->
			new Block(Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> QUARTZ_CORNER_PILLAR = BLOCKS.register("quartz_corner_pillar", () ->
			new Block(Block.Settings.copy(QUARTZ_BLOCK)));

	//Andesite
	public static final RegistrySupplier<Block> ANDESITE_GATE = BLOCKS.register("andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));

	// Mossy
	public static final RegistrySupplier<Block> MOSSY_ANDESITE = BLOCKS.register("mossy_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_ANDESITE_SLAB = BLOCKS.register("mossy_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_ANDESITE_STAIRS = BLOCKS.register("mossy_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_ANDESITE_WALL = BLOCKS.register("mossy_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_ANDESITE_GATE = BLOCKS.register("mossy_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));

	public static final RegistrySupplier<Block> COBBLED_ANDESITE = BLOCKS.register("cobbled_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> COBBLED_ANDESITE_SLAB = BLOCKS.register("cobbled_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> COBBLED_ANDESITE_STAIRS = BLOCKS.register("cobbled_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> COBBLED_ANDESITE_WALL = BLOCKS.register("cobbled_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> COBBLED_ANDESITE_GATE = BLOCKS.register("cobbled_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));

	//Polished
	public static final RegistrySupplier<Block> POLISHED_ANDESITE_WALL = BLOCKS.register("polished_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> POLISHED_ANDESITE_GATE = BLOCKS.register("polished_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));

	//Cracked Polished
	public static final RegistrySupplier<Block> CRACKED_POLISHED_ANDESITE = BLOCKS.register("cracked_polished_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_POLISHED_ANDESITE_SLAB = BLOCKS.register("cracked_polished_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_POLISHED_ANDESITE_STAIRS = BLOCKS.register("cracked_polished_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_POLISHED_ANDESITE_WALL = BLOCKS.register("cracked_polished_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_POLISHED_ANDESITE_GATE = BLOCKS.register("cracked_polished_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));

	//Mossy Polished
	public static final RegistrySupplier<Block> MOSSY_POLISHED_ANDESITE = BLOCKS.register("mossy_polished_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_POLISHED_ANDESITE_SLAB = BLOCKS.register("mossy_polished_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_POLISHED_ANDESITE_STAIRS = BLOCKS.register("mossy_polished_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_POLISHED_ANDESITE_WALL = BLOCKS.register("mossy_polished_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_POLISHED_ANDESITE_GATE = BLOCKS.register("mossy_polished_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));

	//Smooth
	public static final RegistrySupplier<Block> SMOOTH_ANDESITE = BLOCKS.register("smooth_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> SMOOTH_ANDESITE_SLAB = BLOCKS.register("smooth_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> SMOOTH_ANDESITE_STAIRS = BLOCKS.register("smooth_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> SMOOTH_ANDESITE_WALL = BLOCKS.register("smooth_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> SMOOTH_ANDESITE_GATE = BLOCKS.register("smooth_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));

	//Cracked Smooth
	public static final RegistrySupplier<Block> CRACKED_SMOOTH_ANDESITE = BLOCKS.register("cracked_smooth_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_SMOOTH_ANDESITE_SLAB = BLOCKS.register("cracked_smooth_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_SMOOTH_ANDESITE_STAIRS = BLOCKS.register("cracked_smooth_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_SMOOTH_ANDESITE_WALL = BLOCKS.register("cracked_smooth_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_SMOOTH_ANDESITE_GATE = BLOCKS.register("cracked_smooth_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));

	//Mossy Smooth
	public static final RegistrySupplier<Block> MOSSY_SMOOTH_ANDESITE = BLOCKS.register("mossy_smooth_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_SMOOTH_ANDESITE_SLAB = BLOCKS.register("mossy_smooth_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_SMOOTH_ANDESITE_STAIRS = BLOCKS.register("mossy_smooth_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_SMOOTH_ANDESITE_WALL = BLOCKS.register("mossy_smooth_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_SMOOTH_ANDESITE_GATE = BLOCKS.register("mossy_smooth_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));

	//Cut
	public static final RegistrySupplier<Block> CUT_ANDESITE = BLOCKS.register("cut_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CUT_ANDESITE_SLAB = BLOCKS.register("cut_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CUT_ANDESITE_STAIRS = BLOCKS.register("cut_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> CUT_ANDESITE_WALL = BLOCKS.register("cut_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CUT_ANDESITE_GATE = BLOCKS.register("cut_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));

	//Cracked Cut
	public static final RegistrySupplier<Block> CRACKED_CUT_ANDESITE = BLOCKS.register("cracked_cut_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_CUT_ANDESITE_SLAB = BLOCKS.register("cracked_cut_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_CUT_ANDESITE_STAIRS = BLOCKS.register("cracked_cut_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_CUT_ANDESITE_WALL = BLOCKS.register("cracked_cut_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_CUT_ANDESITE_GATE = BLOCKS.register("cracked_cut_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));

	//Mossy Cut
	public static final RegistrySupplier<Block> MOSSY_CUT_ANDESITE = BLOCKS.register("mossy_cut_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_CUT_ANDESITE_SLAB = BLOCKS.register("mossy_cut_andesite_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_CUT_ANDESITE_STAIRS = BLOCKS.register("mossy_cut_andesite_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_CUT_ANDESITE_WALL = BLOCKS.register("mossy_cut_andesite_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_CUT_ANDESITE_GATE = BLOCKS.register("mossy_cut_andesite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));

	public static final RegistrySupplier<Block> ANDESITE_TILES = BLOCKS.register("andesite_tiles", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> ANDESITE_TILE_SLAB = BLOCKS.register("andesite_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> ANDESITE_TILE_STAIRS = BLOCKS.register("andesite_tile_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> ANDESITE_TILE_WALL = BLOCKS.register("andesite_tile_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> ANDESITE_TILE_GATE = BLOCKS.register("andesite_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));

	//Cracked Bricks
	public static final RegistrySupplier<Block> CRACKED_ANDESITE_TILES = BLOCKS.register("cracked_andesite_tiles", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_ANDESITE_TILE_SLAB = BLOCKS.register("cracked_andesite_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_ANDESITE_TILE_STAIRS = BLOCKS.register("cracked_andesite_tile_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_ANDESITE_TILE_WALL = BLOCKS.register("cracked_andesite_tile_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_ANDESITE_TILE_GATE = BLOCKS.register("cracked_andesite_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));

	//Mossy Bricks
	public static final RegistrySupplier<Block> MOSSY_ANDESITE_TILES = BLOCKS.register("mossy_andesite_tiles", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_ANDESITE_TILE_SLAB = BLOCKS.register("mossy_andesite_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_ANDESITE_TILE_STAIRS = BLOCKS.register("mossy_andesite_tile_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_ANDESITE_TILE_WALL = BLOCKS.register("mossy_andesite_tile_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_ANDESITE_TILE_GATE = BLOCKS.register("mossy_andesite_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));


	public static final RegistrySupplier<Block> ANDESITE_BRICKS = BLOCKS.register("andesite_bricks", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> ANDESITE_BRICK_SLAB = BLOCKS.register("andesite_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> ANDESITE_BRICK_STAIRS = BLOCKS.register("andesite_brick_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> ANDESITE_BRICK_WALL = BLOCKS.register("andesite_brick_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> ANDESITE_BRICK_GATE = BLOCKS.register("andesite_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));

	//Cracked Bricks
	public static final RegistrySupplier<Block> CRACKED_ANDESITE_BRICKS = BLOCKS.register("cracked_andesite_bricks", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_ANDESITE_BRICK_SLAB = BLOCKS.register("cracked_andesite_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_ANDESITE_BRICK_STAIRS = BLOCKS.register("cracked_andesite_brick_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_ANDESITE_BRICK_WALL = BLOCKS.register("cracked_andesite_brick_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_ANDESITE_BRICK_GATE = BLOCKS.register("cracked_andesite_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));

	//Mossy Bricks
	public static final RegistrySupplier<Block> MOSSY_ANDESITE_BRICKS = BLOCKS.register("mossy_andesite_bricks", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_ANDESITE_BRICK_SLAB = BLOCKS.register("mossy_andesite_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_ANDESITE_BRICK_STAIRS = BLOCKS.register("mossy_andesite_brick_stairs", () ->
			new CPlusStairBlock(ANDESITE.getDefaultState(), Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_ANDESITE_BRICK_WALL = BLOCKS.register("mossy_andesite_brick_wall", () ->
			new WallBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_ANDESITE_BRICK_GATE = BLOCKS.register("mossy_andesite_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ANDESITE)));

	//Pillars and Chiseled
	public static final RegistrySupplier<Block> ANDESITE_PILLAR = BLOCKS.register("andesite_pillar", () ->
			new PillarBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_ANDESITE_PILLAR = BLOCKS.register("cracked_andesite_pillar", () ->
			new PillarBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_ANDESITE_PILLAR = BLOCKS.register("mossy_andesite_pillar", () ->
			new PillarBlock(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> ANDESITE_CORNER_PILLAR = BLOCKS.register("andesite_corner_pillar", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_ANDESITE_CORNER_PILLAR = BLOCKS.register("cracked_andesite_corner_pillar", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_ANDESITE_CORNER_PILLAR = BLOCKS.register("mossy_andesite_corner_pillar", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CHISELED_ANDESITE = BLOCKS.register("chiseled_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_CHISELED_ANDESITE = BLOCKS.register("cracked_chiseled_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_CHISELED_ANDESITE = BLOCKS.register("mossy_chiseled_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CARVED_ANDESITE = BLOCKS.register("carved_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> CRACKED_CARVED_ANDESITE = BLOCKS.register("cracked_carved_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE)));
	public static final RegistrySupplier<Block> MOSSY_CARVED_ANDESITE = BLOCKS.register("mossy_carved_andesite", () ->
			new Block(Block.Settings.copy(ANDESITE)));

	//Diorite
	public static final RegistrySupplier<Block> DIORITE_GATE = BLOCKS.register("diorite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DIORITE)));

	public static final RegistrySupplier<Block> COBBLED_DIORITE = BLOCKS.register("cobbled_diorite", () ->
			new Block(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> COBBLED_DIORITE_SLAB = BLOCKS.register("cobbled_diorite_slab", () ->
			new SlabBlock(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> COBBLED_DIORITE_STAIRS = BLOCKS.register("cobbled_diorite_stairs", () ->
			new CPlusStairBlock(DIORITE.getDefaultState(), Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> COBBLED_DIORITE_WALL = BLOCKS.register("cobbled_diorite_wall", () ->
			new WallBlock(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> COBBLED_DIORITE_GATE = BLOCKS.register("cobbled_diorite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DIORITE)));

	//Polished
	public static final RegistrySupplier<Block> POLISHED_DIORITE_WALL = BLOCKS.register("polished_diorite_wall", () ->
			new WallBlock(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> POLISHED_DIORITE_GATE = BLOCKS.register("polished_diorite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DIORITE)));

	//Smooth
	public static final RegistrySupplier<Block> SMOOTH_DIORITE = BLOCKS.register("smooth_diorite", () ->
			new Block(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> SMOOTH_DIORITE_SLAB = BLOCKS.register("smooth_diorite_slab", () ->
			new SlabBlock(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> SMOOTH_DIORITE_STAIRS = BLOCKS.register("smooth_diorite_stairs", () ->
			new CPlusStairBlock(DIORITE.getDefaultState(), Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> SMOOTH_DIORITE_WALL = BLOCKS.register("smooth_diorite_wall", () ->
			new WallBlock(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> SMOOTH_DIORITE_GATE = BLOCKS.register("smooth_diorite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DIORITE)));

	//Cut
	public static final RegistrySupplier<Block> CUT_DIORITE = BLOCKS.register("cut_diorite", () ->
			new Block(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> CUT_DIORITE_SLAB = BLOCKS.register("cut_diorite_slab", () ->
			new SlabBlock(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> CUT_DIORITE_STAIRS = BLOCKS.register("cut_diorite_stairs", () ->
			new CPlusStairBlock(DIORITE.getDefaultState(), Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> CUT_DIORITE_WALL = BLOCKS.register("cut_diorite_wall", () ->
			new WallBlock(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> CUT_DIORITE_GATE = BLOCKS.register("cut_diorite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DIORITE)));

	public static final RegistrySupplier<Block> DIORITE_TILES = BLOCKS.register("diorite_tiles", () ->
			new Block(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> DIORITE_TILE_SLAB = BLOCKS.register("diorite_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> DIORITE_TILE_STAIRS = BLOCKS.register("diorite_tile_stairs", () ->
			new CPlusStairBlock(DIORITE_TILES.get().getDefaultState(), Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> DIORITE_TILE_WALL = BLOCKS.register("diorite_tile_wall", () ->
			new WallBlock(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> DIORITE_TILE_GATE = BLOCKS.register("diorite_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DIORITE)));

	//Bricks
	public static final RegistrySupplier<Block> DIORITE_BRICKS = BLOCKS.register("diorite_bricks", () ->
			new Block(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> DIORITE_BRICK_SLAB = BLOCKS.register("diorite_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> DIORITE_BRICK_STAIRS = BLOCKS.register("diorite_brick_stairs", () ->
			new CPlusStairBlock(DIORITE.getDefaultState(), Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> DIORITE_BRICK_WALL = BLOCKS.register("diorite_brick_wall", () ->
			new WallBlock(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> DIORITE_BRICK_GATE = BLOCKS.register("diorite_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DIORITE)));

	//Pillars and Chiseled
	public static final RegistrySupplier<Block> DIORITE_PILLAR = BLOCKS.register("diorite_pillar", () ->
			new PillarBlock(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> DIORITE_CORNER_PILLAR = BLOCKS.register("diorite_corner_pillar", () ->
			new Block(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> CHISELED_DIORITE = BLOCKS.register("chiseled_diorite", () ->
			new Block(Block.Settings.copy(DIORITE)));
	public static final RegistrySupplier<Block> CARVED_DIORITE = BLOCKS.register("carved_diorite", () ->
			new Block(Block.Settings.copy(DIORITE)));

	//Granite
	public static final RegistrySupplier<Block> GRANITE_GATE = BLOCKS.register("granite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRANITE)));

	public static final RegistrySupplier<Block> COBBLED_GRANITE = BLOCKS.register("cobbled_granite", () ->
			new Block(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> COBBLED_GRANITE_SLAB = BLOCKS.register("cobbled_granite_slab", () ->
			new SlabBlock(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> COBBLED_GRANITE_STAIRS = BLOCKS.register("cobbled_granite_stairs", () ->
			new CPlusStairBlock(GRANITE.getDefaultState(), Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> COBBLED_GRANITE_WALL = BLOCKS.register("cobbled_granite_wall", () ->
			new WallBlock(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> COBBLED_GRANITE_GATE = BLOCKS.register("cobbled_granite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRANITE)));

	//Polished
	public static final RegistrySupplier<Block> POLISHED_GRANITE_WALL = BLOCKS.register("polished_granite_wall", () ->
			new WallBlock(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> POLISHED_GRANITE_GATE = BLOCKS.register("polished_granite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRANITE)));

	//Smooth
	public static final RegistrySupplier<Block> SMOOTH_GRANITE = BLOCKS.register("smooth_granite", () ->
			new Block(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> SMOOTH_GRANITE_SLAB = BLOCKS.register("smooth_granite_slab", () ->
			new SlabBlock(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> SMOOTH_GRANITE_STAIRS = BLOCKS.register("smooth_granite_stairs", () ->
			new CPlusStairBlock(GRANITE.getDefaultState(), Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> SMOOTH_GRANITE_WALL = BLOCKS.register("smooth_granite_wall", () ->
			new WallBlock(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> SMOOTH_GRANITE_GATE = BLOCKS.register("smooth_granite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRANITE)));

	//Cut
	public static final RegistrySupplier<Block> CUT_GRANITE = BLOCKS.register("cut_granite", () ->
			new Block(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> CUT_GRANITE_SLAB = BLOCKS.register("cut_granite_slab", () ->
			new SlabBlock(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> CUT_GRANITE_STAIRS = BLOCKS.register("cut_granite_stairs", () ->
			new CPlusStairBlock(POLISHED_GRANITE.getDefaultState(), Block.Settings.copy(QUARTZ_BLOCK)));
	public static final RegistrySupplier<Block> CUT_GRANITE_WALL = BLOCKS.register("cut_granite_wall", () ->
			new WallBlock(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> CUT_GRANITE_GATE = BLOCKS.register("cut_granite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRANITE)));

	//Tiles
	public static final RegistrySupplier<Block> GRANITE_TILES = BLOCKS.register("granite_tiles", () ->
			new Block(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> GRANITE_TILE_SLAB = BLOCKS.register("granite_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> GRANITE_TILE_STAIRS = BLOCKS.register("granite_tile_stairs", () ->
			new CPlusStairBlock(GRANITE_TILES.get().getDefaultState(), Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> GRANITE_TILE_WALL = BLOCKS.register("granite_tile_wall", () ->
			new WallBlock(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> GRANITE_TILE_GATE = BLOCKS.register("granite_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRANITE)));

	//Bricks
	public static final RegistrySupplier<Block> GRANITE_BRICKS = BLOCKS.register("granite_bricks", () ->
			new Block(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> GRANITE_BRICK_SLAB = BLOCKS.register("granite_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> GRANITE_BRICK_STAIRS = BLOCKS.register("granite_brick_stairs", () ->
			new CPlusStairBlock(GRANITE.getDefaultState(), Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> GRANITE_BRICK_WALL = BLOCKS.register("granite_brick_wall", () ->
			new WallBlock(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> GRANITE_BRICK_GATE = BLOCKS.register("granite_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRANITE)));

	//Pillars and Chiseled
	public static final RegistrySupplier<Block> GRANITE_PILLAR = BLOCKS.register("granite_pillar", () ->
			new PillarBlock(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> GRANITE_CORNER_PILLAR = BLOCKS.register("granite_corner_pillar", () ->
			new Block(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> CHISELED_GRANITE = BLOCKS.register("chiseled_granite", () ->
			new Block(Block.Settings.copy(GRANITE)));
	public static final RegistrySupplier<Block> CARVED_GRANITE = BLOCKS.register("carved_granite", () ->
			new Block(Block.Settings.copy(GRANITE)));


	//Bricks
	public static final RegistrySupplier<Block> BRICK_GATE = BLOCKS.register("brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BRICKS)));


	//Nether Bricks
//Nether Bricks will have a rework eventually, none of this is final
	//Cracked Bricks
	public static final RegistrySupplier<Block> CRACKED_NETHER_BRICK_SLAB = BLOCKS.register("cracked_nether_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_NETHER_BRICK_STAIRS = BLOCKS.register("cracked_nether_brick_stairs", () ->
			new CPlusStairBlock(NETHER_BRICKS.getDefaultState(), Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_NETHER_BRICK_WALL = BLOCKS.register("cracked_nether_brick_wall", () ->
			new WallBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_NETHER_BRICK_FENCE_GATE = BLOCKS.register("cracked_nether_brick_fence_gate", () ->
			new FenceGateBlock(Block.Settings.copy(NETHER_BRICKS)));

	//Pillars and Chiseled
	public static final RegistrySupplier<Block> CHISELED_NETHER_BRICKS = BLOCKS.register("chiseled_nether_bricks", () ->
			new Block(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> NETHER_BRICK_PILLAR = BLOCKS.register("nether_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(NETHER_BRICKS)));

	//Red Nether Bricks
	public static final RegistrySupplier<Block> RED_NETHER_BRICK_FENCE_GATE = BLOCKS.register("red_nether_brick_fence_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_NETHER_BRICKS)));

	//Pillars and Chiseled
	public static final RegistrySupplier<Block> CHISELED_RED_NETHER_BRICKS = BLOCKS.register("chiseled_red_nether_bricks", () ->
			new Block(Block.Settings.copy(RED_NETHER_BRICKS)));
	public static final RegistrySupplier<Block> RED_NETHER_BRICK_PILLAR = BLOCKS.register("red_nether_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(RED_NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CARVED_RED_NETHER_BRICKS = BLOCKS.register("carved_red_nether_bricks", () ->
			new Block(Block.Settings.copy(RED_NETHER_BRICKS)));


	//Blue Nether Bricks
//Blue Nether Bricks will have a rework eventually, none of this is final
	//Bricks
	public static final RegistrySupplier<Block> BLUE_NETHER_BRICKS = BLOCKS.register("blue_nether_bricks", () ->
			new Block(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> BLUE_NETHER_BRICK_SLAB = BLOCKS.register("blue_nether_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> BLUE_NETHER_BRICK_STAIRS = BLOCKS.register("blue_nether_brick_stairs", () ->
			new CPlusStairBlock(NETHER_BRICKS.getDefaultState(), Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> BLUE_NETHER_BRICK_WALL = BLOCKS.register("blue_nether_brick_wall", () ->
			new WallBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> BLUE_NETHER_BRICK_FENCE_GATE = BLOCKS.register("blue_nether_brick_fence_gate", () ->
			new FenceGateBlock(Block.Settings.copy(NETHER_BRICKS)));

	//Cracked Bricks
	public static final RegistrySupplier<Block> CRACKED_BLUE_NETHER_BRICKS = BLOCKS.register("cracked_blue_nether_bricks", () ->
			new Block(Block.Settings.copy(CRACKED_NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLUE_NETHER_BRICK_SLAB = BLOCKS.register("cracked_blue_nether_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(CRACKED_NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLUE_NETHER_BRICK_STAIRS = BLOCKS.register("cracked_blue_nether_brick_stairs", () ->
			new CPlusStairBlock(CRACKED_NETHER_BRICKS.getDefaultState(), Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLUE_NETHER_BRICK_WALL = BLOCKS.register("cracked_blue_nether_brick_wall", () ->
			new WallBlock(Block.Settings.copy(CRACKED_NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLUE_NETHER_BRICK_FENCE_GATE = BLOCKS.register("cracked_blue_nether_brick_fence_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CRACKED_NETHER_BRICKS)));

	//Pillars and Chiseled
	public static final RegistrySupplier<Block> CHISELED_BLUE_NETHER_BRICKS = BLOCKS.register("chiseled_blue_nether_bricks", () ->
			new Block(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> BLUE_NETHER_BRICK_PILLAR = BLOCKS.register("blue_nether_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CARVED_BLUE_NETHER_BRICKS = BLOCKS.register("carved_blue_nether_bricks", () ->
			new Block(Block.Settings.copy(NETHER_BRICKS)));

	//Prismarine
	public static final RegistrySupplier<Block> PRISMARINE_GATE = BLOCKS.register("prismarine_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PRISMARINE)));

	//Polished
	public static final RegistrySupplier<Block> POLISHED_PRISMARINE = BLOCKS.register("polished_prismarine", () ->
			new Block(Block.Settings.copy(PRISMARINE)));
	public static final RegistrySupplier<Block> POLISHED_PRISMARINE_SLAB = BLOCKS.register("polished_prismarine_slab", () ->
			new SlabBlock(Block.Settings.copy(PRISMARINE)));
	public static final RegistrySupplier<Block> POLISHED_PRISMARINE_STAIRS = BLOCKS.register("polished_prismarine_stairs", () ->
			new CPlusStairBlock(PRISMARINE.getDefaultState(), Block.Settings.copy(PRISMARINE)));
	public static final RegistrySupplier<Block> POLISHED_PRISMARINE_WALL = BLOCKS.register("polished_prismarine_wall", () ->
			new WallBlock(Block.Settings.copy(PRISMARINE)));
	public static final RegistrySupplier<Block> POLISHED_PRISMARINE_GATE = BLOCKS.register("polished_prismarine_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PRISMARINE)));

	//Smooth
	public static final RegistrySupplier<Block> SMOOTH_PRISMARINE = BLOCKS.register("smooth_prismarine", () ->
			new Block(Block.Settings.copy(PRISMARINE)));
	public static final RegistrySupplier<Block> SMOOTH_PRISMARINE_SLAB = BLOCKS.register("smooth_prismarine_slab", () ->
			new SlabBlock(Block.Settings.copy(PRISMARINE)));
	public static final RegistrySupplier<Block> SMOOTH_PRISMARINE_STAIRS = BLOCKS.register("smooth_prismarine_stairs", () ->
			new CPlusStairBlock(PRISMARINE.getDefaultState(), Block.Settings.copy(PRISMARINE)));
	public static final RegistrySupplier<Block> SMOOTH_PRISMARINE_WALL = BLOCKS.register("smooth_prismarine_wall", () ->
			new WallBlock(Block.Settings.copy(PRISMARINE)));
	public static final RegistrySupplier<Block> SMOOTH_PRISMARINE_GATE = BLOCKS.register("smooth_prismarine_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PRISMARINE)));

	//Cut
	public static final RegistrySupplier<Block> CUT_PRISMARINE = BLOCKS.register("cut_prismarine", () ->
			new Block(Block.Settings.copy(PRISMARINE)));
	public static final RegistrySupplier<Block> CUT_PRISMARINE_SLAB = BLOCKS.register("cut_prismarine_slab", () ->
			new SlabBlock(Block.Settings.copy(PRISMARINE)));
	public static final RegistrySupplier<Block> CUT_PRISMARINE_STAIRS = BLOCKS.register("cut_prismarine_stairs", () ->
			new CPlusStairBlock(PRISMARINE.getDefaultState(), Block.Settings.copy(PRISMARINE)));
	public static final RegistrySupplier<Block> CUT_PRISMARINE_WALL = BLOCKS.register("cut_prismarine_wall", () ->
			new WallBlock(Block.Settings.copy(PRISMARINE)));
	public static final RegistrySupplier<Block> CUT_PRISMARINE_GATE = BLOCKS.register("cut_prismarine_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PRISMARINE)));

	//Tiles
	public static final RegistrySupplier<Block> PRISMARINE_TILES = BLOCKS.register("prismarine_tiles", () ->
			new Block(Block.Settings.copy(PRISMARINE)));
	public static final RegistrySupplier<Block> PRISMARINE_TILE_SLAB = BLOCKS.register("prismarine_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(PRISMARINE)));
	public static final RegistrySupplier<Block> PRISMARINE_TILE_STAIRS = BLOCKS.register("prismarine_tile_stairs", () ->
			new CPlusStairBlock(PRISMARINE_TILES.get().getDefaultState(), Block.Settings.copy(PRISMARINE)));
	public static final RegistrySupplier<Block> PRISMARINE_TILE_WALL = BLOCKS.register("prismarine_tile_wall", () ->
			new WallBlock(Block.Settings.copy(PRISMARINE)));
	public static final RegistrySupplier<Block> PRISMARINE_TILE_GATE = BLOCKS.register("prismarine_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PRISMARINE)));

	//Bricks
	public static final RegistrySupplier<Block> PRISMARINE_BRICK_WALL = BLOCKS.register("prismarine_brick_wall", () ->
			new WallBlock(Block.Settings.copy(PRISMARINE)));
	public static final RegistrySupplier<Block> PRISMARINE_BRICK_GATE = BLOCKS.register("prismarine_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PRISMARINE)));

	//Pillar and Chiseled
	public static final RegistrySupplier<Block> CHISELED_PRISMARINE = BLOCKS.register("chiseled_prismarine", () ->
			new Block(Block.Settings.copy(PRISMARINE_BRICKS)));
	public static final RegistrySupplier<Block> PRISMARINE_PILLAR = BLOCKS.register("prismarine_pillar", () ->
			new PillarBlock(Block.Settings.copy(PRISMARINE_BRICKS)));
	public static final RegistrySupplier<Block> PRISMARINE_CORNER_PILLAR = BLOCKS.register("prismarine_corner_pillar", () ->
			new Block(Block.Settings.copy(PRISMARINE_BRICKS)));
	public static final RegistrySupplier<Block> CARVED_PRISMARINE = BLOCKS.register("carved_prismarine", () ->
			new Block(Block.Settings.copy(PRISMARINE_BRICKS)));


	//Dark Prismarine
	public static final RegistrySupplier<Block> DARK_PRISMARINE_WALL = BLOCKS.register("dark_prismarine_wall", () ->
			new WallBlock(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> DARK_PRISMARINE_GATE = BLOCKS.register("dark_prismarine_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DARK_PRISMARINE)));

	//Polished
	public static final RegistrySupplier<Block> POLISHED_DARK_PRISMARINE = BLOCKS.register("polished_dark_prismarine", () ->
			new Block(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> POLISHED_DARK_PRISMARINE_SLAB = BLOCKS.register("polished_dark_prismarine_slab", () ->
			new SlabBlock(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> POLISHED_DARK_PRISMARINE_STAIRS = BLOCKS.register("polished_dark_prismarine_stairs", () ->
			new CPlusStairBlock(DARK_PRISMARINE.getDefaultState(), Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> POLISHED_DARK_PRISMARINE_WALL = BLOCKS.register("polished_dark_prismarine_wall", () ->
			new WallBlock(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> POLISHED_DARK_PRISMARINE_GATE = BLOCKS.register("polished_dark_prismarine_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DARK_PRISMARINE)));

	//Smooth
	public static final RegistrySupplier<Block> SMOOTH_DARK_PRISMARINE = BLOCKS.register("smooth_dark_prismarine", () ->
			new Block(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> SMOOTH_DARK_PRISMARINE_SLAB = BLOCKS.register("smooth_dark_prismarine_slab", () ->
			new SlabBlock(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> SMOOTH_DARK_PRISMARINE_STAIRS = BLOCKS.register("smooth_dark_prismarine_stairs", () ->
			new CPlusStairBlock(DARK_PRISMARINE.getDefaultState(), Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> SMOOTH_DARK_PRISMARINE_WALL = BLOCKS.register("smooth_dark_prismarine_wall", () ->
			new WallBlock(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> SMOOTH_DARK_PRISMARINE_GATE = BLOCKS.register("smooth_dark_prismarine_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DARK_PRISMARINE)));

	//Cut
	public static final RegistrySupplier<Block> CUT_DARK_PRISMARINE = BLOCKS.register("cut_dark_prismarine", () ->
			new Block(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> CUT_DARK_PRISMARINE_SLAB = BLOCKS.register("cut_dark_prismarine_slab", () ->
			new SlabBlock(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> CUT_DARK_PRISMARINE_STAIRS = BLOCKS.register("cut_dark_prismarine_stairs", () ->
			new CPlusStairBlock(DARK_PRISMARINE.getDefaultState(), Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> CUT_DARK_PRISMARINE_WALL = BLOCKS.register("cut_dark_prismarine_wall", () ->
			new WallBlock(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> CUT_DARK_PRISMARINE_GATE = BLOCKS.register("cut_dark_prismarine_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DARK_PRISMARINE)));

	//Tiles
	public static final RegistrySupplier<Block> DARK_PRISMARINE_TILES = BLOCKS.register("dark_prismarine_tiles", () ->
			new Block(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> DARK_PRISMARINE_TILE_SLAB = BLOCKS.register("dark_prismarine_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> DARK_PRISMARINE_TILE_STAIRS = BLOCKS.register("dark_prismarine_tile_stairs", () ->
			new CPlusStairBlock(DARK_PRISMARINE.getDefaultState(), Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> DARK_PRISMARINE_TILE_WALL = BLOCKS.register("dark_prismarine_tile_wall", () ->
			new WallBlock(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> DARK_PRISMARINE_TILE_GATE = BLOCKS.register("dark_prismarine_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DARK_PRISMARINE)));

	//Bricks
	public static final RegistrySupplier<Block> DARK_PRISMARINE_BRICKS = BLOCKS.register("dark_prismarine_bricks", () ->
			new Block(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> DARK_PRISMARINE_BRICK_SLAB = BLOCKS.register("dark_prismarine_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> DARK_PRISMARINE_BRICK_STAIRS = BLOCKS.register("dark_prismarine_brick_stairs", () ->
			new CPlusStairBlock(DARK_PRISMARINE.getDefaultState(), Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> DARK_PRISMARINE_BRICK_WALL = BLOCKS.register("dark_prismarine_brick_wall", () ->
			new WallBlock(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> DARK_PRISMARINE_BRICK_GATE = BLOCKS.register("dark_prismarine_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DARK_PRISMARINE)));

	//Pillar and Chiseled
	public static final RegistrySupplier<Block> CHISELED_DARK_PRISMARINE = BLOCKS.register("chiseled_dark_prismarine", () ->
			new Block(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> DARK_PRISMARINE_PILLAR = BLOCKS.register("dark_prismarine_pillar", () ->
			new PillarBlock(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> DARK_PRISMARINE_CORNER_PILLAR = BLOCKS.register("dark_prismarine_corner_pillar", () ->
			new Block(Block.Settings.copy(DARK_PRISMARINE)));
	public static final RegistrySupplier<Block> CARVED_DARK_PRISMARINE = BLOCKS.register("carved_dark_prismarine", () ->
			new Block(Block.Settings.copy(DARK_PRISMARINE)));


//Purpur

	public static final RegistrySupplier<Block> PURPUR_BLOCK = BLOCKS.register("purpur_block", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> PURPUR_SLAB = BLOCKS.register("purpur_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> PURPUR_STAIRS = BLOCKS.register("purpur_stairs", () ->
			new CPlusStairBlock(PURPUR_PILLAR.getDefaultState(), Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> PURPUR_WALL = BLOCKS.register("purpur_wall", () ->
			new WallBlock(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> PURPUR_GATE = BLOCKS.register("purpur_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPUR_PILLAR)));

	//Smooth
	public static final RegistrySupplier<Block> SMOOTH_PURPUR = BLOCKS.register("smooth_purpur", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> SMOOTH_PURPUR_SLAB = BLOCKS.register("smooth_purpur_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> SMOOTH_PURPUR_STAIRS = BLOCKS.register("smooth_purpur_stairs", () ->
			new CPlusStairBlock(PURPUR_PILLAR.getDefaultState(), Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> SMOOTH_PURPUR_WALL = BLOCKS.register("smooth_purpur_wall", () ->
			new WallBlock(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> SMOOTH_PURPUR_GATE = BLOCKS.register("smooth_purpur_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPUR_PILLAR)));

	//Polished
	public static final RegistrySupplier<Block> POLISHED_PURPUR = BLOCKS.register("polished_purpur", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> POLISHED_PURPUR_GATE = BLOCKS.register("polished_purpur_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> POLISHED_PURPUR_SLAB = BLOCKS.register("polished_purpur_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> POLISHED_PURPUR_STAIRS = BLOCKS.register("polished_purpur_stairs", () ->
			new CPlusStairBlock(PURPUR_PILLAR.getDefaultState(), Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> POLISHED_PURPUR_WALL = BLOCKS.register("polished_purpur_wall", () ->
			new WallBlock(Block.Settings.copy(PURPUR_PILLAR)));
	//Cut
	public static final RegistrySupplier<Block> CUT_PURPUR = BLOCKS.register("cut_purpur", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> CUT_PURPUR_STAIRS = BLOCKS.register("cut_purpur_stairs", () ->
			new CPlusStairBlock(PURPUR_PILLAR.getDefaultState(), Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> CUT_PURPUR_SLAB = BLOCKS.register("cut_purpur_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> CUT_PURPUR_WALL = BLOCKS.register("cut_purpur_wall", () ->
			new WallBlock(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> CUT_PURPUR_GATE = BLOCKS.register("cut_purpur_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPUR_PILLAR)));

	public static final RegistrySupplier<Block> PURPUR_TILE_WALL = BLOCKS.register("purpur_tile_wall", () ->
			new WallBlock(Block.Settings.copy(Blocks.PURPUR_BLOCK)));
	public static final RegistrySupplier<Block> PURPUR_TILE_GATE = BLOCKS.register("purpur_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(Blocks.PURPUR_BLOCK)));

	//Bricks
	public static final RegistrySupplier<Block> PURPUR_BRICKS = BLOCKS.register("purpur_bricks", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> PURPUR_BRICK_SLAB = BLOCKS.register("purpur_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> PURPUR_BRICK_STAIRS = BLOCKS.register("purpur_brick_stairs", () ->
			new CPlusStairBlock(PURPUR_PILLAR.getDefaultState(), Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> PURPUR_BRICK_WALL = BLOCKS.register("purpur_brick_wall", () ->
			new WallBlock(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> PURPUR_BRICK_GATE = BLOCKS.register("purpur_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPUR_PILLAR)));

	//Cracked Bricks
	public static final RegistrySupplier<Block> CRACKED_PURPUR_BRICKS = BLOCKS.register("cracked_purpur_bricks", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> CRACKED_PURPUR_BRICK_SLAB = BLOCKS.register("cracked_purpur_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> CRACKED_PURPUR_BRICK_STAIRS = BLOCKS.register("cracked_purpur_brick_stairs", () ->
			new CPlusStairBlock(PURPUR_PILLAR.getDefaultState(), Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> CRACKED_PURPUR_BRICK_WALL = BLOCKS.register("cracked_purpur_brick_wall", () ->
			new WallBlock(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> CRACKED_PURPUR_BRICK_GATE = BLOCKS.register("cracked_purpur_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPUR_PILLAR)));

	//Pillars and Chiseled
	public static final RegistrySupplier<Block> CHISELED_PURPUR = BLOCKS.register("chiseled_purpur", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> CARVED_PURPUR = BLOCKS.register("carved_purpur", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR)));


	//End Stone
	public static final RegistrySupplier<Block> END_STONE_BRICK_GATE = BLOCKS.register("end_stone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(END_STONE_BRICKS)));

	public static final RegistrySupplier<Block> COBBLED_END_STONE = BLOCKS.register("cobbled_end_stone", () ->
			new Block(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> COBBLED_END_STONE_SLAB = BLOCKS.register("cobbled_end_stone_slab", () ->
			new SlabBlock(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> COBBLED_END_STONE_STAIRS = BLOCKS.register("cobbled_end_stone_stairs", () ->
			new CPlusStairBlock(END_STONE.getDefaultState(), Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> COBBLED_END_STONE_WALL = BLOCKS.register("cobbled_end_stone_wall", () ->
			new WallBlock(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> COBBLED_END_STONE_GATE = BLOCKS.register("cobbled_end_stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(END_STONE)));

	//Block
	public static final RegistrySupplier<Block> END_STONE_SLAB = BLOCKS.register("end_stone_slab", () ->
			new SlabBlock(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> END_STONE_STAIRS = BLOCKS.register("end_stone_stairs", () ->
			new CPlusStairBlock(END_STONE.getDefaultState(), Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> END_STONE_WALL = BLOCKS.register("end_stone_wall", () ->
			new WallBlock(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> END_STONE_GATE = BLOCKS.register("end_stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(END_STONE)));

	//Smooth
	public static final RegistrySupplier<Block> SMOOTH_END_STONE = BLOCKS.register("smooth_end_stone", () ->
			new Block(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> SMOOTH_END_STONE_SLAB = BLOCKS.register("smooth_end_stone_slab", () ->
			new SlabBlock(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> SMOOTH_END_STONE_STAIRS = BLOCKS.register("smooth_end_stone_stairs", () ->
			new CPlusStairBlock(END_STONE.getDefaultState(), Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> SMOOTH_END_STONE_WALL = BLOCKS.register("smooth_end_stone_wall", () ->
			new WallBlock(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> SMOOTH_END_STONE_GATE = BLOCKS.register("smooth_end_stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(END_STONE)));

	//Polished
	public static final RegistrySupplier<Block> POLISHED_END_STONE = BLOCKS.register("polished_end_stone", () ->
			new Block(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> POLISHED_END_STONE_SLAB = BLOCKS.register("polished_end_stone_slab", () ->
			new SlabBlock(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> POLISHED_END_STONE_STAIRS = BLOCKS.register("polished_end_stone_stairs", () ->
			new CPlusStairBlock(END_STONE.getDefaultState(), Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> POLISHED_END_STONE_WALL = BLOCKS.register("polished_end_stone_wall", () ->
			new WallBlock(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> POLISHED_END_STONE_GATE = BLOCKS.register("polished_end_stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(END_STONE)));

	//Cut
	public static final RegistrySupplier<Block> CUT_END_STONE = BLOCKS.register("cut_end_stone", () ->
			new Block(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> CUT_END_STONE_SLAB = BLOCKS.register("cut_end_stone_slab", () ->
			new SlabBlock(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> CUT_END_STONE_STAIRS = BLOCKS.register("cut_end_stone_stairs", () ->
			new CPlusStairBlock(END_STONE.getDefaultState(), Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> CUT_END_STONE_WALL = BLOCKS.register("cut_end_stone_wall", () ->
			new WallBlock(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> CUT_END_STONE_GATE = BLOCKS.register("cut_end_stone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(END_STONE)));

	//Tiles
	public static final RegistrySupplier<Block> END_STONE_TILES = BLOCKS.register("end_stone_tiles", () ->
			new Block(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> END_STONE_TILE_SLAB = BLOCKS.register("end_stone_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> END_STONE_TILE_STAIRS = BLOCKS.register("end_stone_tile_stairs", () ->
			new CPlusStairBlock(END_STONE.getDefaultState(), Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> END_STONE_TILE_WALL = BLOCKS.register("end_stone_tile_wall", () ->
			new WallBlock(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> END_STONE_TILE_GATE = BLOCKS.register("end_stone_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(END_STONE)));

	//Pillars and Chiseled
	public static final RegistrySupplier<Block> CHISELED_END_STONE = BLOCKS.register("chiseled_end_stone", () ->
			new Block(Block.Settings.copy(END_STONE)));
	public static final RegistrySupplier<Block> END_STONE_PILLAR = BLOCKS.register("end_stone_pillar", () ->
			new PillarBlock(Block.Settings.copy(END_STONE_BRICKS)));
	public static final RegistrySupplier<Block> END_STONE_CORNER_PILLAR = BLOCKS.register("end_stone_corner_pillar", () ->
			new Block(Block.Settings.copy(END_STONE_BRICKS)));
	public static final RegistrySupplier<Block> CARVED_END_STONE = BLOCKS.register("carved_end_stone", () ->
			new Block(Block.Settings.copy(END_STONE)));


	//Soul Sandstone
	public static final RegistrySupplier<Block> SOUL_SANDSTONE = BLOCKS.register("soul_sandstone", () ->
			new Block(Block.Settings.of(Material.STONE).strength(0.8F)));
	public static final RegistrySupplier<Block> SOUL_SANDSTONE_SLAB = BLOCKS.register("soul_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> SOUL_SANDSTONE_STAIRS = BLOCKS.register("soul_sandstone_stairs", () ->
			new CPlusStairBlock(SANDSTONE.getDefaultState(), Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> SOUL_SANDSTONE_WALL = BLOCKS.register("soul_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> SOUL_SANDSTONE_GATE = BLOCKS.register("soul_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));

	public static final RegistrySupplier<Block> COBBLED_SOUL_SANDSTONE = BLOCKS.register("cobbled_soul_sandstone", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> COBBLED_SOUL_SANDSTONE_SLAB = BLOCKS.register("cobbled_soul_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> COBBLED_SOUL_SANDSTONE_STAIRS = BLOCKS.register("cobbled_soul_sandstone_stairs", () ->
			new CPlusStairBlock(SANDSTONE.getDefaultState(), Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> COBBLED_SOUL_SANDSTONE_WALL = BLOCKS.register("cobbled_soul_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> COBBLED_SOUL_SANDSTONE_GATE = BLOCKS.register("cobbled_soul_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));

	// Smooth
	public static final RegistrySupplier<Block> SMOOTH_SOUL_SANDSTONE = BLOCKS.register("smooth_soul_sandstone", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> SMOOTH_SOUL_SANDSTONE_SLAB = BLOCKS.register("smooth_soul_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> SMOOTH_SOUL_SANDSTONE_STAIRS = BLOCKS.register("smooth_soul_sandstone_stairs", () ->
			new CPlusStairBlock(SMOOTH_SANDSTONE.getDefaultState(), Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> SMOOTH_SOUL_SANDSTONE_WALL = BLOCKS.register("smooth_soul_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> SMOOTH_SOUL_SANDSTONE_GATE = BLOCKS.register("smooth_soul_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));

	// Polished
	public static final RegistrySupplier<Block> POLISHED_SOUL_SANDSTONE = BLOCKS.register("polished_soul_sandstone", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> POLISHED_SOUL_SANDSTONE_SLAB = BLOCKS.register("polished_soul_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> POLISHED_SOUL_SANDSTONE_STAIRS = BLOCKS.register("polished_soul_sandstone_stairs", () ->
			new CPlusStairBlock(SANDSTONE.getDefaultState(), Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> POLISHED_SOUL_SANDSTONE_WALL = BLOCKS.register("polished_soul_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> POLISHED_SOUL_SANDSTONE_GATE = BLOCKS.register("polished_soul_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));

	// Bricks
	public static final RegistrySupplier<Block> SOUL_SANDSTONE_BRICKS = BLOCKS.register("soul_sandstone_bricks", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> SOUL_SANDSTONE_BRICK_SLAB = BLOCKS.register("soul_sandstone_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> SOUL_SANDSTONE_BRICK_STAIRS = BLOCKS.register("soul_sandstone_brick_stairs", () ->
			new CPlusStairBlock(SANDSTONE.getDefaultState(), Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> SOUL_SANDSTONE_BRICK_WALL = BLOCKS.register("soul_sandstone_brick_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> SOUL_SANDSTONE_BRICK_GATE = BLOCKS.register("soul_sandstone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));

	// Cut
	public static final RegistrySupplier<Block> CUT_SOUL_SANDSTONE = BLOCKS.register("cut_soul_sandstone", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> CUT_SOUL_SANDSTONE_SLAB = BLOCKS.register("cut_soul_sandstone_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> CUT_SOUL_SANDSTONE_STAIRS = BLOCKS.register("cut_soul_sandstone_stairs", () ->
			new CPlusStairBlock(CUT_SANDSTONE.getDefaultState(), Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> CUT_SOUL_SANDSTONE_WALL = BLOCKS.register("cut_soul_sandstone_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> CUT_SOUL_SANDSTONE_GATE = BLOCKS.register("cut_soul_sandstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));

	//Tiles
	public static final RegistrySupplier<Block> SOUL_SANDSTONE_TILES = BLOCKS.register("soul_sandstone_tiles", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> SOUL_SANDSTONE_TILE_STAIRS = BLOCKS.register("soul_sandstone_tile_stairs", () ->
			new CPlusStairBlock(SOUL_SANDSTONE_TILES.get().getDefaultState(), Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> SOUL_SANDSTONE_TILE_SLAB = BLOCKS.register("soul_sandstone_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> SOUL_SANDSTONE_TILE_WALL = BLOCKS.register("soul_sandstone_tile_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> SOUL_SANDSTONE_TILE_GATE = BLOCKS.register("soul_sandstone_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));

	public static final RegistrySupplier<Block> CARVED_SOUL_SANDSTONE = BLOCKS.register("carved_soul_sandstone", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> CHISELED_SOUL_SANDSTONE = BLOCKS.register("chiseled_soul_sandstone", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> SOUL_SANDSTONE_PILLAR = BLOCKS.register("soul_sandstone_pillar", () ->
			new PillarBlock(Block.Settings.copy(SOUL_SANDSTONE.get())));
	public static final RegistrySupplier<Block> SOUL_SANDSTONE_CORNER_PILLAR = BLOCKS.register("soul_sandstone_corner_pillar", () ->
			new Block(Block.Settings.copy(SOUL_SANDSTONE.get())));

	//Obsidian
	public static final RegistrySupplier<Block> OBSIDIAN_SLAB = BLOCKS.register("obsidian_slab", () ->
			new SlabBlock(Block.Settings.copy(OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> OBSIDIAN_STAIRS = BLOCKS.register("obsidian_stairs", () ->
			new CPlusStairBlock(OBSIDIAN.getDefaultState(), Block.Settings.copy(OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> OBSIDIAN_WALL = BLOCKS.register("obsidian_wall", () ->
			new WallBlock(Block.Settings.copy(OBSIDIAN)));
	public static final RegistrySupplier<Block> OBSIDIAN_GATE = BLOCKS.register("obsidian_gate", () ->
			new FenceGateBlock(Block.Settings.copy(OBSIDIAN)));

	public static final RegistrySupplier<Block> CRYING_OBSIDIAN_SLAB = BLOCKS.register("crying_obsidian_slab", () ->
			new SlabBlock(Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> CRYING_OBSIDIAN_STAIRS = BLOCKS.register("crying_obsidian_stairs", () ->
			new CPlusStairBlock(CRYING_OBSIDIAN.getDefaultState(), Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> CRYING_OBSIDIAN_WALL = BLOCKS.register("crying_obsidian_wall", () ->
			new WallBlock(Block.Settings.copy(CRYING_OBSIDIAN)));
	public static final RegistrySupplier<Block> CRYING_OBSIDIAN_GATE = BLOCKS.register("crying_obsidian_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CRYING_OBSIDIAN)));

	public static final RegistrySupplier<Block> SMOOTH_OBSIDIAN = BLOCKS.register("smooth_obsidian", () ->
			new Block(Block.Settings.copy(OBSIDIAN)));
	public static final RegistrySupplier<Block> SMOOTH_OBSIDIAN_SLAB = BLOCKS.register("smooth_obsidian_slab", () ->
			new SlabBlock(Block.Settings.copy(OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> SMOOTH_OBSIDIAN_STAIRS = BLOCKS.register("smooth_obsidian_stairs", () ->
			new CPlusStairBlock(OBSIDIAN.getDefaultState(), Block.Settings.copy(OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> SMOOTH_OBSIDIAN_WALL = BLOCKS.register("smooth_obsidian_wall", () ->
			new WallBlock(Block.Settings.copy(OBSIDIAN)));
	public static final RegistrySupplier<Block> SMOOTH_OBSIDIAN_GATE = BLOCKS.register("smooth_obsidian_gate", () ->
			new FenceGateBlock(Block.Settings.copy(OBSIDIAN)));

	public static final RegistrySupplier<Block> SMOOTH_CRYING_OBSIDIAN = BLOCKS.register("smooth_crying_obsidian", () ->
			new CryingObsidianBlock(Block.Settings.copy(CRYING_OBSIDIAN)));
	public static final RegistrySupplier<Block> SMOOTH_CRYING_OBSIDIAN_SLAB = BLOCKS.register("smooth_crying_obsidian_slab", () ->
			new SlabBlock(Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> SMOOTH_CRYING_OBSIDIAN_STAIRS = BLOCKS.register("smooth_crying_obsidian_stairs", () ->
			new CPlusStairBlock(CRYING_OBSIDIAN.getDefaultState(), Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> SMOOTH_CRYING_OBSIDIAN_WALL = BLOCKS.register("smooth_crying_obsidian_wall", () ->
			new WallBlock(Block.Settings.copy(CRYING_OBSIDIAN)));
	public static final RegistrySupplier<Block> SMOOTH_CRYING_OBSIDIAN_GATE = BLOCKS.register("smooth_crying_obsidian_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CRYING_OBSIDIAN)));

	public static final RegistrySupplier<Block> POLISHED_OBSIDIAN = BLOCKS.register("polished_obsidian", () ->
			new Block(Block.Settings.copy(OBSIDIAN)));
	public static final RegistrySupplier<Block> POLISHED_OBSIDIAN_SLAB = BLOCKS.register("polished_obsidian_slab", () ->
			new SlabBlock(Block.Settings.copy(OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> POLISHED_OBSIDIAN_STAIRS = BLOCKS.register("polished_obsidian_stairs", () ->
			new CPlusStairBlock(OBSIDIAN.getDefaultState(), Block.Settings.copy(OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> POLISHED_OBSIDIAN_WALL = BLOCKS.register("polished_obsidian_wall", () ->
			new WallBlock(Block.Settings.copy(OBSIDIAN)));
	public static final RegistrySupplier<Block> POLISHED_OBSIDIAN_GATE = BLOCKS.register("polished_obsidian_gate", () ->
			new FenceGateBlock(Block.Settings.copy(OBSIDIAN)));

	public static final RegistrySupplier<Block> POLISHED_CRYING_OBSIDIAN = BLOCKS.register("polished_crying_obsidian", () ->
			new CryingObsidianBlock(Block.Settings.copy(CRYING_OBSIDIAN)));
	public static final RegistrySupplier<Block> POLISHED_CRYING_OBSIDIAN_SLAB = BLOCKS.register("polished_crying_obsidian_slab", () ->
			new SlabBlock(Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> POLISHED_CRYING_OBSIDIAN_STAIRS = BLOCKS.register("polished_crying_obsidian_stairs", () ->
			new CPlusStairBlock(CRYING_OBSIDIAN.getDefaultState(), Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> POLISHED_CRYING_OBSIDIAN_WALL = BLOCKS.register("polished_crying_obsidian_wall", () ->
			new WallBlock(Block.Settings.copy(CRYING_OBSIDIAN)));
	public static final RegistrySupplier<Block> POLISHED_CRYING_OBSIDIAN_GATE = BLOCKS.register("polished_crying_obsidian_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CRYING_OBSIDIAN)));

	public static final RegistrySupplier<Block> OBSIDIAN_BRICKS = BLOCKS.register("obsidian_bricks", () ->
			new Block(Block.Settings.copy(OBSIDIAN)));
	public static final RegistrySupplier<Block> OBSIDIAN_BRICK_SLAB = BLOCKS.register("obsidian_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> OBSIDIAN_BRICK_STAIRS = BLOCKS.register("obsidian_brick_stairs", () ->
			new CPlusStairBlock(OBSIDIAN.getDefaultState(), Block.Settings.copy(OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> OBSIDIAN_BRICK_WALL = BLOCKS.register("obsidian_brick_wall", () ->
			new WallBlock(Block.Settings.copy(OBSIDIAN)));
	public static final RegistrySupplier<Block> OBSIDIAN_BRICK_GATE = BLOCKS.register("obsidian_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(OBSIDIAN)));

	public static final RegistrySupplier<Block> CRYING_OBSIDIAN_BRICKS = BLOCKS.register("crying_obsidian_bricks", () ->
			new CryingObsidianBlock(Block.Settings.copy(CRYING_OBSIDIAN)));
	public static final RegistrySupplier<Block> CRYING_OBSIDIAN_BRICK_SLAB = BLOCKS.register("crying_obsidian_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> CRYING_OBSIDIAN_BRICK_STAIRS = BLOCKS.register("crying_obsidian_brick_stairs", () ->
			new CPlusStairBlock(CRYING_OBSIDIAN.getDefaultState(), Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> CRYING_OBSIDIAN_BRICK_WALL = BLOCKS.register("crying_obsidian_brick_wall", () ->
			new WallBlock(Block.Settings.copy(CRYING_OBSIDIAN)));
	public static final RegistrySupplier<Block> CRYING_OBSIDIAN_BRICK_GATE = BLOCKS.register("crying_obsidian_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CRYING_OBSIDIAN)));

	public static final RegistrySupplier<Block> CUT_OBSIDIAN = BLOCKS.register("cut_obsidian", () ->
			new Block(Block.Settings.copy(OBSIDIAN)));
	public static final RegistrySupplier<Block> CUT_OBSIDIAN_SLAB = BLOCKS.register("cut_obsidian_slab", () ->
			new SlabBlock(Block.Settings.copy(OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> CUT_OBSIDIAN_STAIRS = BLOCKS.register("cut_obsidian_stairs", () ->
			new CPlusStairBlock(OBSIDIAN.getDefaultState(), Block.Settings.copy(OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> CUT_OBSIDIAN_WALL = BLOCKS.register("cut_obsidian_wall", () ->
			new WallBlock(Block.Settings.copy(OBSIDIAN)));
	public static final RegistrySupplier<Block> CUT_OBSIDIAN_GATE = BLOCKS.register("cut_obsidian_gate", () ->
			new FenceGateBlock(Block.Settings.copy(OBSIDIAN)));

	public static final RegistrySupplier<Block> CUT_CRYING_OBSIDIAN = BLOCKS.register("cut_crying_obsidian", () ->
			new CryingObsidianBlock(Block.Settings.copy(CRYING_OBSIDIAN)));
	public static final RegistrySupplier<Block> CUT_CRYING_OBSIDIAN_SLAB = BLOCKS.register("cut_crying_obsidian_slab", () ->
			new SlabBlock(Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> CUT_CRYING_OBSIDIAN_STAIRS = BLOCKS.register("cut_crying_obsidian_stairs", () ->
			new CPlusStairBlock(CRYING_OBSIDIAN.getDefaultState(), Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> CUT_CRYING_OBSIDIAN_WALL = BLOCKS.register("cut_crying_obsidian_wall", () ->
			new WallBlock(Block.Settings.copy(CRYING_OBSIDIAN)));
	public static final RegistrySupplier<Block> CUT_CRYING_OBSIDIAN_GATE = BLOCKS.register("cut_crying_obsidian_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CRYING_OBSIDIAN)));

	public static final RegistrySupplier<Block> OBSIDIAN_TILES = BLOCKS.register("obsidian_tiles", () ->
			new Block(Block.Settings.copy(OBSIDIAN)));
	public static final RegistrySupplier<Block> OBSIDIAN_TILE_SLAB = BLOCKS.register("obsidian_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> OBSIDIAN_TILE_STAIRS = BLOCKS.register("obsidian_tile_stairs", () ->
			new CPlusStairBlock(OBSIDIAN_TILES.get().getDefaultState(), Block.Settings.copy(OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> OBSIDIAN_TILE_WALL = BLOCKS.register("obsidian_tile_wall", () ->
			new WallBlock(Block.Settings.copy(OBSIDIAN)));
	public static final RegistrySupplier<Block> OBSIDIAN_TILE_GATE = BLOCKS.register("obsidian_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(OBSIDIAN)));

	public static final RegistrySupplier<Block> CRYING_OBSIDIAN_TILES = BLOCKS.register("crying_obsidian_tiles", () ->
			new CryingObsidianBlock(Block.Settings.copy(CRYING_OBSIDIAN)));
	public static final RegistrySupplier<Block> CRYING_OBSIDIAN_TILE_SLAB = BLOCKS.register("crying_obsidian_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> CRYING_OBSIDIAN_TILE_STAIRS = BLOCKS.register("crying_obsidian_tile_stairs", () ->
			new CPlusStairBlock(CRYING_OBSIDIAN_TILES.get().getDefaultState(), Block.Settings.copy(CRYING_OBSIDIAN).nonOpaque()));
	public static final RegistrySupplier<Block> CRYING_OBSIDIAN_TILE_WALL = BLOCKS.register("crying_obsidian_tile_wall", () ->
			new WallBlock(Block.Settings.copy(CRYING_OBSIDIAN)));
	public static final RegistrySupplier<Block> CRYING_OBSIDIAN_TILE_GATE = BLOCKS.register("crying_obsidian_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CRYING_OBSIDIAN)));

	public static final RegistrySupplier<Block> OBSIDIAN_PILLAR = BLOCKS.register("obsidian_pillar", () ->
			new PillarBlock(Block.Settings.copy(OBSIDIAN)));
	public static final RegistrySupplier<Block> OBSIDIAN_CORNER_PILLAR = BLOCKS.register("obsidian_corner_pillar", () ->
			new Block(Block.Settings.copy(OBSIDIAN)));
	public static final RegistrySupplier<Block> CHISELED_OBSIDIAN = BLOCKS.register("chiseled_obsidian", () ->
			new Block(Block.Settings.copy(OBSIDIAN)));
	public static final RegistrySupplier<Block> CARVED_OBSIDIAN = BLOCKS.register("carved_obsidian", () ->
			new Block(Block.Settings.copy(OBSIDIAN)));

	public static final RegistrySupplier<Block> CRYING_OBSIDIAN_PILLAR = BLOCKS.register("crying_obsidian_pillar", () ->
			new PillarBlock(Block.Settings.copy(CRYING_OBSIDIAN)));
	public static final RegistrySupplier<Block> CRYING_OBSIDIAN_CORNER_PILLAR = BLOCKS.register("crying_obsidian_corner_pillar", () ->
			new Block(Block.Settings.copy(CRYING_OBSIDIAN)));
	public static final RegistrySupplier<Block> CHISELED_CRYING_OBSIDIAN = BLOCKS.register("chiseled_crying_obsidian", () ->
			new Block(Block.Settings.copy(CRYING_OBSIDIAN)));
	public static final RegistrySupplier<Block> CARVED_CRYING_OBSIDIAN = BLOCKS.register("carved_crying_obsidian", () ->
			new Block(Block.Settings.copy(CRYING_OBSIDIAN)));

//Calcite

	public static final RegistrySupplier<Block> CALCITE_SLAB = BLOCKS.register("calcite_slab", () ->
			new SlabBlock(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CALCITE_STAIRS = BLOCKS.register("calcite_stairs", () ->
			new CPlusStairBlock(CALCITE.getDefaultState(), Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CALCITE_WALL = BLOCKS.register("calcite_wall", () ->
			new WallBlock(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CALCITE_GATE = BLOCKS.register("calcite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CALCITE)));

	public static final RegistrySupplier<Block> COBBLED_CALCITE = BLOCKS.register("cobbled_calcite", () ->
			new Block(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> COBBLED_CALCITE_SLAB = BLOCKS.register("cobbled_calcite_slab", () ->
			new SlabBlock(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> COBBLED_CALCITE_STAIRS = BLOCKS.register("cobbled_calcite_stairs", () ->
			new CPlusStairBlock(CALCITE.getDefaultState(), Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> COBBLED_CALCITE_WALL = BLOCKS.register("cobbled_calcite_wall", () ->
			new WallBlock(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> COBBLED_CALCITE_GATE = BLOCKS.register("cobbled_calcite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CALCITE)));

	//Smooth
	public static final RegistrySupplier<Block> SMOOTH_CALCITE = BLOCKS.register("smooth_calcite", () ->
			new Block(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> SMOOTH_CALCITE_SLAB = BLOCKS.register("smooth_calcite_slab", () ->
			new SlabBlock(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> SMOOTH_CALCITE_STAIRS = BLOCKS.register("smooth_calcite_stairs", () ->
			new CPlusStairBlock(CALCITE.getDefaultState(), Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> SMOOTH_CALCITE_WALL = BLOCKS.register("smooth_calcite_wall", () ->
			new WallBlock(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> SMOOTH_CALCITE_GATE = BLOCKS.register("smooth_calcite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CALCITE)));

	//Polished
	public static final RegistrySupplier<Block> POLISHED_CALCITE = BLOCKS.register("polished_calcite", () ->
			new Block(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> POLISHED_CALCITE_SLAB = BLOCKS.register("polished_calcite_slab", () ->
			new SlabBlock(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> POLISHED_CALCITE_STAIRS = BLOCKS.register("polished_calcite_stairs", () ->
			new CPlusStairBlock(CALCITE.getDefaultState(), Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> POLISHED_CALCITE_WALL = BLOCKS.register("polished_calcite_wall", () ->
			new WallBlock(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> POLISHED_CALCITE_GATE = BLOCKS.register("polished_calcite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CALCITE)));

	//Cut
	public static final RegistrySupplier<Block> CUT_CALCITE = BLOCKS.register("cut_calcite", () ->
			new Block(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CUT_CALCITE_SLAB = BLOCKS.register("cut_calcite_slab", () ->
			new SlabBlock(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CUT_CALCITE_STAIRS = BLOCKS.register("cut_calcite_stairs", () ->
			new CPlusStairBlock(CALCITE.getDefaultState(), Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CUT_CALCITE_WALL = BLOCKS.register("cut_calcite_wall", () ->
			new WallBlock(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CUT_CALCITE_GATE = BLOCKS.register("cut_calcite_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CALCITE)));

	public static final RegistrySupplier<Block> CALCITE_TILES = BLOCKS.register("calcite_tiles", () ->
			new Block(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CALCITE_TILE_SLAB = BLOCKS.register("calcite_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CALCITE_TILE_STAIRS = BLOCKS.register("calcite_tile_stairs", () ->
			new CPlusStairBlock(CALCITE.getDefaultState(), Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CALCITE_TILE_WALL = BLOCKS.register("calcite_tile_wall", () ->
			new WallBlock(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CALCITE_TILE_GATE = BLOCKS.register("calcite_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CALCITE)));

	//Bricks
	public static final RegistrySupplier<Block> CALCITE_BRICKS = BLOCKS.register("calcite_bricks", () ->
			new Block(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CALCITE_BRICK_SLAB = BLOCKS.register("calcite_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CALCITE_BRICK_STAIRS = BLOCKS.register("calcite_brick_stairs", () ->
			new CPlusStairBlock(CALCITE.getDefaultState(), Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CALCITE_BRICK_WALL = BLOCKS.register("calcite_brick_wall", () ->
			new WallBlock(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CALCITE_BRICK_GATE = BLOCKS.register("calcite_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CALCITE)));

	//Pillars and Chiseled
	public static final RegistrySupplier<Block> CALCITE_PILLAR = BLOCKS.register("calcite_pillar", () ->
			new PillarBlock(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CALCITE_CORNER_PILLAR = BLOCKS.register("calcite_corner_pillar", () ->
			new Block(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CHISELED_CALCITE = BLOCKS.register("chiseled_calcite", () ->
			new Block(Block.Settings.copy(CALCITE)));
	public static final RegistrySupplier<Block> CARVED_CALCITE = BLOCKS.register("carved_calcite", () ->
			new Block(Block.Settings.copy(CALCITE)));

//Dripstone

	public static final RegistrySupplier<Block> DRIPSTONE_SLAB = BLOCKS.register("dripstone_slab", () ->
			new SlabBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> DRIPSTONE_STAIRS = BLOCKS.register("dripstone_stairs", () ->
			new CPlusStairBlock(DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> DRIPSTONE_WALL = BLOCKS.register("dripstone_wall", () ->
			new WallBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> DRIPSTONE_GATE = BLOCKS.register("dripstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));

	public static final RegistrySupplier<Block> COBBLED_DRIPSTONE = BLOCKS.register("cobbled_dripstone", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> COBBLED_DRIPSTONE_SLAB = BLOCKS.register("cobbled_dripstone_slab", () ->
			new SlabBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> COBBLED_DRIPSTONE_STAIRS = BLOCKS.register("cobbled_dripstone_stairs", () ->
			new CPlusStairBlock(DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> COBBLED_DRIPSTONE_WALL = BLOCKS.register("cobbled_dripstone_wall", () ->
			new WallBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> COBBLED_DRIPSTONE_GATE = BLOCKS.register("cobbled_dripstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));

	//Smooth
	public static final RegistrySupplier<Block> SMOOTH_DRIPSTONE = BLOCKS.register("smooth_dripstone", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> SMOOTH_DRIPSTONE_SLAB = BLOCKS.register("smooth_dripstone_slab", () ->
			new SlabBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> SMOOTH_DRIPSTONE_STAIRS = BLOCKS.register("smooth_dripstone_stairs", () ->
			new CPlusStairBlock(DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> SMOOTH_DRIPSTONE_WALL = BLOCKS.register("smooth_dripstone_wall", () ->
			new WallBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> SMOOTH_DRIPSTONE_GATE = BLOCKS.register("smooth_dripstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));

	//Polished
	public static final RegistrySupplier<Block> POLISHED_DRIPSTONE = BLOCKS.register("polished_dripstone", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> POLISHED_DRIPSTONE_SLAB = BLOCKS.register("polished_dripstone_slab", () ->
			new SlabBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> POLISHED_DRIPSTONE_STAIRS = BLOCKS.register("polished_dripstone_stairs", () ->
			new CPlusStairBlock(DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> POLISHED_DRIPSTONE_WALL = BLOCKS.register("polished_dripstone_wall", () ->
			new WallBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> POLISHED_DRIPSTONE_GATE = BLOCKS.register("polished_dripstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));

	//Cut
	public static final RegistrySupplier<Block> CUT_DRIPSTONE = BLOCKS.register("cut_dripstone", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> CUT_DRIPSTONE_SLAB = BLOCKS.register("cut_dripstone_slab", () ->
			new SlabBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> CUT_DRIPSTONE_STAIRS = BLOCKS.register("cut_dripstone_stairs", () ->
			new CPlusStairBlock(DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> CUT_DRIPSTONE_WALL = BLOCKS.register("cut_dripstone_wall", () ->
			new WallBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> CUT_DRIPSTONE_GATE = BLOCKS.register("cut_dripstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));

	public static final RegistrySupplier<Block> DRIPSTONE_TILES = BLOCKS.register("dripstone_tiles", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> DRIPSTONE_TILE_SLAB = BLOCKS.register("dripstone_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> DRIPSTONE_TILE_STAIRS = BLOCKS.register("dripstone_tile_stairs", () ->
			new CPlusStairBlock(DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> DRIPSTONE_TILE_WALL = BLOCKS.register("dripstone_tile_wall", () ->
			new WallBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> DRIPSTONE_TILE_GATE = BLOCKS.register("dripstone_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));

	//Bricks
	public static final RegistrySupplier<Block> DRIPSTONE_BRICKS = BLOCKS.register("dripstone_bricks", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> DRIPSTONE_BRICK_SLAB = BLOCKS.register("dripstone_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> DRIPSTONE_BRICK_STAIRS = BLOCKS.register("dripstone_brick_stairs", () ->
			new CPlusStairBlock(DRIPSTONE_BLOCK.getDefaultState(), Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> DRIPSTONE_BRICK_WALL = BLOCKS.register("dripstone_brick_wall", () ->
			new WallBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> DRIPSTONE_BRICK_GATE = BLOCKS.register("dripstone_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));

	//Pillars and Chiseled
	public static final RegistrySupplier<Block> DRIPSTONE_PILLAR = BLOCKS.register("dripstone_pillar", () ->
			new PillarBlock(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> DRIPSTONE_CORNER_PILLAR = BLOCKS.register("dripstone_corner_pillar", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> CHISELED_DRIPSTONE = BLOCKS.register("chiseled_dripstone", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK)));
	public static final RegistrySupplier<Block> CARVED_DRIPSTONE = BLOCKS.register("carved_dripstone", () ->
			new Block(Block.Settings.copy(DRIPSTONE_BLOCK)));

//Tuff

	public static final RegistrySupplier<Block> TUFF_SLAB = BLOCKS.register("tuff_slab", () ->
			new SlabBlock(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> TUFF_STAIRS = BLOCKS.register("tuff_stairs", () ->
			new CPlusStairBlock(TUFF.getDefaultState(), Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> TUFF_WALL = BLOCKS.register("tuff_wall", () ->
			new WallBlock(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> TUFF_GATE = BLOCKS.register("tuff_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TUFF)));

	public static final RegistrySupplier<Block> COBBLED_TUFF = BLOCKS.register("cobbled_tuff", () ->
			new Block(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> COBBLED_TUFF_SLAB = BLOCKS.register("cobbled_tuff_slab", () ->
			new SlabBlock(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> COBBLED_TUFF_STAIRS = BLOCKS.register("cobbled_tuff_stairs", () ->
			new CPlusStairBlock(TUFF.getDefaultState(), Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> COBBLED_TUFF_WALL = BLOCKS.register("cobbled_tuff_wall", () ->
			new WallBlock(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> COBBLED_TUFF_GATE = BLOCKS.register("cobbled_tuff_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TUFF)));

	//Smooth
	public static final RegistrySupplier<Block> SMOOTH_TUFF = BLOCKS.register("smooth_tuff", () ->
			new Block(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> SMOOTH_TUFF_SLAB = BLOCKS.register("smooth_tuff_slab", () ->
			new SlabBlock(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> SMOOTH_TUFF_STAIRS = BLOCKS.register("smooth_tuff_stairs", () ->
			new CPlusStairBlock(TUFF.getDefaultState(), Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> SMOOTH_TUFF_WALL = BLOCKS.register("smooth_tuff_wall", () ->
			new WallBlock(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> SMOOTH_TUFF_GATE = BLOCKS.register("smooth_tuff_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TUFF)));

	//Polished
	public static final RegistrySupplier<Block> POLISHED_TUFF = BLOCKS.register("polished_tuff", () ->
			new Block(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> POLISHED_TUFF_SLAB = BLOCKS.register("polished_tuff_slab", () ->
			new SlabBlock(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> POLISHED_TUFF_STAIRS = BLOCKS.register("polished_tuff_stairs", () ->
			new CPlusStairBlock(TUFF.getDefaultState(), Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> POLISHED_TUFF_WALL = BLOCKS.register("polished_tuff_wall", () ->
			new WallBlock(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> POLISHED_TUFF_GATE = BLOCKS.register("polished_tuff_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TUFF)));

	//Cut
	public static final RegistrySupplier<Block> CUT_TUFF = BLOCKS.register("cut_tuff", () ->
			new Block(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> CUT_TUFF_SLAB = BLOCKS.register("cut_tuff_slab", () ->
			new SlabBlock(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> CUT_TUFF_STAIRS = BLOCKS.register("cut_tuff_stairs", () ->
			new CPlusStairBlock(TUFF.getDefaultState(), Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> CUT_TUFF_WALL = BLOCKS.register("cut_tuff_wall", () ->
			new WallBlock(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> CUT_TUFF_GATE = BLOCKS.register("cut_tuff_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TUFF)));

	public static final RegistrySupplier<Block> TUFF_TILES = BLOCKS.register("tuff_tiles", () ->
			new Block(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> TUFF_TILE_SLAB = BLOCKS.register("tuff_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> TUFF_TILE_STAIRS = BLOCKS.register("tuff_tile_stairs", () ->
			new CPlusStairBlock(TUFF.getDefaultState(), Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> TUFF_TILE_WALL = BLOCKS.register("tuff_tile_wall", () ->
			new WallBlock(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> TUFF_TILE_GATE = BLOCKS.register("tuff_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TUFF)));

	//Bricks
	public static final RegistrySupplier<Block> TUFF_BRICKS = BLOCKS.register("tuff_bricks", () ->
			new Block(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> TUFF_BRICK_SLAB = BLOCKS.register("tuff_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> TUFF_BRICK_STAIRS = BLOCKS.register("tuff_brick_stairs", () ->
			new CPlusStairBlock(TUFF.getDefaultState(), Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> TUFF_BRICK_WALL = BLOCKS.register("tuff_brick_wall", () ->
			new WallBlock(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> TUFF_BRICK_GATE = BLOCKS.register("tuff_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TUFF)));

	//Pillars and Chiseled
	public static final RegistrySupplier<Block> TUFF_PILLAR = BLOCKS.register("tuff_pillar", () ->
			new PillarBlock(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> TUFF_CORNER_PILLAR = BLOCKS.register("tuff_corner_pillar", () ->
			new Block(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> CHISELED_TUFF = BLOCKS.register("chiseled_tuff", () ->
			new Block(Block.Settings.copy(TUFF)));
	public static final RegistrySupplier<Block> CARVED_TUFF = BLOCKS.register("carved_tuff", () ->
			new Block(Block.Settings.copy(TUFF)));

	//Deepslate
	public static final RegistrySupplier<Block> COBBLED_DEEPSLATE_GATE = BLOCKS.register("cobbled_deepslate_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE)));

	public static final RegistrySupplier<Block> DEEPSLATE_SLAB = BLOCKS.register("deepslate_slab", () ->
			new SlabBlock(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> DEEPSLATE_STAIRS = BLOCKS.register("deepslate_stairs", () ->
			new CPlusStairBlock(DEEPSLATE.getDefaultState(), Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> DEEPSLATE_WALL = BLOCKS.register("deepslate_wall", () ->
			new WallBlock(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> DEEPSLATE_GATE = BLOCKS.register("deepslate_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE)));

	//Smooth
	public static final RegistrySupplier<Block> SMOOTH_DEEPSLATE = BLOCKS.register("smooth_deepslate", () ->
			new Block(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> SMOOTH_DEEPSLATE_SLAB = BLOCKS.register("smooth_deepslate_slab", () ->
			new SlabBlock(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> SMOOTH_DEEPSLATE_STAIRS = BLOCKS.register("smooth_deepslate_stairs", () ->
			new CPlusStairBlock(DEEPSLATE.getDefaultState(), Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> SMOOTH_DEEPSLATE_WALL = BLOCKS.register("smooth_deepslate_wall", () ->
			new WallBlock(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> SMOOTH_DEEPSLATE_GATE = BLOCKS.register("smooth_deepslate_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE)));

	//Polished
	public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_GATE = BLOCKS.register("polished_deepslate_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE)));

	//Cut
	public static final RegistrySupplier<Block> CUT_DEEPSLATE = BLOCKS.register("cut_deepslate", () ->
			new Block(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> CUT_DEEPSLATE_SLAB = BLOCKS.register("cut_deepslate_slab", () ->
			new SlabBlock(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> CUT_DEEPSLATE_STAIRS = BLOCKS.register("cut_deepslate_stairs", () ->
			new CPlusStairBlock(DEEPSLATE.getDefaultState(), Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> CUT_DEEPSLATE_WALL = BLOCKS.register("cut_deepslate_wall", () ->
			new WallBlock(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> CUT_DEEPSLATE_GATE = BLOCKS.register("cut_deepslate_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE)));

	//Bricks
	public static final RegistrySupplier<Block> DEEPSLATE_BRICK_GATE = BLOCKS.register("deepslate_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE_BRICKS)));

	public static final RegistrySupplier<Block> DEEPSLATE_TILE_GATE = BLOCKS.register("deepslate_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE_TILES)));

	public static final RegistrySupplier<Block> CRACKED_DEEPSLATE_BRICK_SLAB = BLOCKS.register("cracked_deepslate_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> CRACKED_DEEPSLATE_BRICK_STAIRS = BLOCKS.register("cracked_deepslate_brick_stairs", () ->
			new CPlusStairBlock(DEEPSLATE.getDefaultState(), Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> CRACKED_DEEPSLATE_BRICK_WALL = BLOCKS.register("cracked_deepslate_brick_wall", () ->
			new WallBlock(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> CRACKED_DEEPSLATE_BRICK_GATE = BLOCKS.register("cracked_deepslate_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE)));

	public static final RegistrySupplier<Block> CRACKED_DEEPSLATE_TILE_SLAB = BLOCKS.register("cracked_deepslate_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> CRACKED_DEEPSLATE_TILE_STAIRS = BLOCKS.register("cracked_deepslate_tile_stairs", () ->
			new CPlusStairBlock(DEEPSLATE.getDefaultState(), Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> CRACKED_DEEPSLATE_TILE_WALL = BLOCKS.register("cracked_deepslate_tile_wall", () ->
			new WallBlock(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> CRACKED_DEEPSLATE_TILE_GATE = BLOCKS.register("cracked_deepslate_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(DEEPSLATE)));

	//Pillars and Chiseled
	public static final RegistrySupplier<Block> DEEPSLATE_PILLAR = BLOCKS.register("deepslate_pillar", () ->
			new PillarBlock(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> DEEPSLATE_CORNER_PILLAR = BLOCKS.register("deepslate_corner_pillar", () ->
			new Block(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> CARVED_DEEPSLATE = BLOCKS.register("carved_deepslate", () ->
			new Block(Block.Settings.copy(DEEPSLATE)));


	// Terracotta
	// Terracotta Slab
	public static final RegistrySupplier<Block> RED_TERRACOTTA_SLAB = BLOCKS.register("red_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_SLAB = BLOCKS.register("orange_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> YELLOW_TERRACOTTA_SLAB = BLOCKS.register("yellow_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIME_TERRACOTTA_SLAB = BLOCKS.register("lime_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> GREEN_TERRACOTTA_SLAB = BLOCKS.register("green_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLUE_TERRACOTTA_SLAB = BLOCKS.register("blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CYAN_TERRACOTTA_SLAB = BLOCKS.register("cyan_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_TERRACOTTA_SLAB = BLOCKS.register("light_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> PURPLE_TERRACOTTA_SLAB = BLOCKS.register("purple_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> MAGENTA_TERRACOTTA_SLAB = BLOCKS.register("magenta_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> PINK_TERRACOTTA_SLAB = BLOCKS.register("pink_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> WHITE_TERRACOTTA_SLAB = BLOCKS.register("white_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_TERRACOTTA_SLAB = BLOCKS.register("light_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> GRAY_TERRACOTTA_SLAB = BLOCKS.register("gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLACK_TERRACOTTA_SLAB = BLOCKS.register("black_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> BROWN_TERRACOTTA_SLAB = BLOCKS.register("brown_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> TERRACOTTA_SLAB = BLOCKS.register("terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(TERRACOTTA)));

	// Terracotta Stairs
	public static final RegistrySupplier<Block> RED_TERRACOTTA_STAIRS = BLOCKS.register("red_terracotta_stairs", () ->
			new CPlusStairBlock(RED_TERRACOTTA.getDefaultState(), Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_STAIRS = BLOCKS.register("orange_terracotta_stairs", () ->
			new CPlusStairBlock(ORANGE_TERRACOTTA.getDefaultState(), Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> YELLOW_TERRACOTTA_STAIRS = BLOCKS.register("yellow_terracotta_stairs", () ->
			new CPlusStairBlock(YELLOW_TERRACOTTA.getDefaultState(), Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIME_TERRACOTTA_STAIRS = BLOCKS.register("lime_terracotta_stairs", () ->
			new CPlusStairBlock(LIME_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> GREEN_TERRACOTTA_STAIRS = BLOCKS.register("green_terracotta_stairs", () ->
			new CPlusStairBlock(GREEN_TERRACOTTA.getDefaultState(), Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLUE_TERRACOTTA_STAIRS = BLOCKS.register("blue_terracotta_stairs", () ->
			new CPlusStairBlock(BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CYAN_TERRACOTTA_STAIRS = BLOCKS.register("cyan_terracotta_stairs", () ->
			new CPlusStairBlock(CYAN_TERRACOTTA.getDefaultState(), Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("light_blue_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> PURPLE_TERRACOTTA_STAIRS = BLOCKS.register("purple_terracotta_stairs", () ->
			new CPlusStairBlock(PURPLE_TERRACOTTA.getDefaultState(), Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> MAGENTA_TERRACOTTA_STAIRS = BLOCKS.register("magenta_terracotta_stairs", () ->
			new CPlusStairBlock(MAGENTA_TERRACOTTA.getDefaultState(), Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> PINK_TERRACOTTA_STAIRS = BLOCKS.register("pink_terracotta_stairs", () ->
			new CPlusStairBlock(PINK_TERRACOTTA.getDefaultState(), Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> WHITE_TERRACOTTA_STAIRS = BLOCKS.register("white_terracotta_stairs", () ->
			new CPlusStairBlock(WHITE_TERRACOTTA.getDefaultState(), Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("light_gray_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> GRAY_TERRACOTTA_STAIRS = BLOCKS.register("gray_terracotta_stairs", () ->
			new CPlusStairBlock(GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLACK_TERRACOTTA_STAIRS = BLOCKS.register("black_terracotta_stairs", () ->
			new CPlusStairBlock(BLACK_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> BROWN_TERRACOTTA_STAIRS = BLOCKS.register("brown_terracotta_stairs", () ->
			new CPlusStairBlock(BROWN_TERRACOTTA.getDefaultState(), Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> TERRACOTTA_STAIRS = BLOCKS.register("terracotta_stairs", () ->
			new CPlusStairBlock(TERRACOTTA.getDefaultState(), Block.Settings.copy(TERRACOTTA)));

	// Terracotta Wall
	public static final RegistrySupplier<Block> RED_TERRACOTTA_WALL = BLOCKS.register("red_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_WALL = BLOCKS.register("orange_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> YELLOW_TERRACOTTA_WALL = BLOCKS.register("yellow_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIME_TERRACOTTA_WALL = BLOCKS.register("lime_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> GREEN_TERRACOTTA_WALL = BLOCKS.register("green_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLUE_TERRACOTTA_WALL = BLOCKS.register("blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CYAN_TERRACOTTA_WALL = BLOCKS.register("cyan_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_TERRACOTTA_WALL = BLOCKS.register("light_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> PURPLE_TERRACOTTA_WALL = BLOCKS.register("purple_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> MAGENTA_TERRACOTTA_WALL = BLOCKS.register("magenta_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> PINK_TERRACOTTA_WALL = BLOCKS.register("pink_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> WHITE_TERRACOTTA_WALL = BLOCKS.register("white_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_TERRACOTTA_WALL = BLOCKS.register("light_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> GRAY_TERRACOTTA_WALL = BLOCKS.register("gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLACK_TERRACOTTA_WALL = BLOCKS.register("black_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> BROWN_TERRACOTTA_WALL = BLOCKS.register("brown_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> TERRACOTTA_WALL = BLOCKS.register("terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(TERRACOTTA)));

	// Terracotta Gates
	public static final RegistrySupplier<Block> RED_TERRACOTTA_GATE = BLOCKS.register("red_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_GATE = BLOCKS.register("orange_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> YELLOW_TERRACOTTA_GATE = BLOCKS.register("yellow_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIME_TERRACOTTA_GATE = BLOCKS.register("lime_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> GREEN_TERRACOTTA_GATE = BLOCKS.register("green_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLUE_TERRACOTTA_GATE = BLOCKS.register("blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CYAN_TERRACOTTA_GATE = BLOCKS.register("cyan_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_TERRACOTTA_GATE = BLOCKS.register("light_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> PURPLE_TERRACOTTA_GATE = BLOCKS.register("purple_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> MAGENTA_TERRACOTTA_GATE = BLOCKS.register("magenta_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> PINK_TERRACOTTA_GATE = BLOCKS.register("pink_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> WHITE_TERRACOTTA_GATE = BLOCKS.register("white_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_TERRACOTTA_GATE = BLOCKS.register("light_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> GRAY_TERRACOTTA_GATE = BLOCKS.register("gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLACK_TERRACOTTA_GATE = BLOCKS.register("black_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> BROWN_TERRACOTTA_GATE = BLOCKS.register("brown_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> TERRACOTTA_GATE = BLOCKS.register("terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TERRACOTTA)));

	public static final RegistrySupplier<Block> COBBLED_RED_TERRACOTTA = BLOCKS.register("cobbled_red_terracotta", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_ORANGE_TERRACOTTA = BLOCKS.register("cobbled_orange_terracotta", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_YELLOW_TERRACOTTA = BLOCKS.register("cobbled_yellow_terracotta", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_LIME_TERRACOTTA = BLOCKS.register("cobbled_lime_terracotta", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_GREEN_TERRACOTTA = BLOCKS.register("cobbled_green_terracotta", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_BLUE_TERRACOTTA = BLOCKS.register("cobbled_blue_terracotta", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_CYAN_TERRACOTTA = BLOCKS.register("cobbled_cyan_terracotta", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_LIGHT_BLUE_TERRACOTTA = BLOCKS.register("cobbled_light_blue_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_PURPLE_TERRACOTTA = BLOCKS.register("cobbled_purple_terracotta", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_MAGENTA_TERRACOTTA = BLOCKS.register("cobbled_magenta_terracotta", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_PINK_TERRACOTTA = BLOCKS.register("cobbled_pink_terracotta", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_WHITE_TERRACOTTA = BLOCKS.register("cobbled_white_terracotta", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_LIGHT_GRAY_TERRACOTTA = BLOCKS.register("cobbled_light_gray_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_GRAY_TERRACOTTA = BLOCKS.register("cobbled_gray_terracotta", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_BLACK_TERRACOTTA = BLOCKS.register("cobbled_black_terracotta", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_BROWN_TERRACOTTA = BLOCKS.register("cobbled_brown_terracotta", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_TERRACOTTA = BLOCKS.register("cobbled_terracotta", () ->
			new Block(Block.Settings.copy(TERRACOTTA)));

	// Terracotta Slab
	public static final RegistrySupplier<Block> COBBLED_RED_TERRACOTTA_SLAB = BLOCKS.register("cobbled_red_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_ORANGE_TERRACOTTA_SLAB = BLOCKS.register("cobbled_orange_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_YELLOW_TERRACOTTA_SLAB = BLOCKS.register("cobbled_yellow_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_LIME_TERRACOTTA_SLAB = BLOCKS.register("cobbled_lime_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_GREEN_TERRACOTTA_SLAB = BLOCKS.register("cobbled_green_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_BLUE_TERRACOTTA_SLAB = BLOCKS.register("cobbled_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_CYAN_TERRACOTTA_SLAB = BLOCKS.register("cobbled_cyan_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_LIGHT_BLUE_TERRACOTTA_SLAB = BLOCKS.register("cobbled_light_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_PURPLE_TERRACOTTA_SLAB = BLOCKS.register("cobbled_purple_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_MAGENTA_TERRACOTTA_SLAB = BLOCKS.register("cobbled_magenta_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_PINK_TERRACOTTA_SLAB = BLOCKS.register("cobbled_pink_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_WHITE_TERRACOTTA_SLAB = BLOCKS.register("cobbled_white_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_LIGHT_GRAY_TERRACOTTA_SLAB = BLOCKS.register("cobbled_light_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_GRAY_TERRACOTTA_SLAB = BLOCKS.register("cobbled_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_BLACK_TERRACOTTA_SLAB = BLOCKS.register("cobbled_black_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_BROWN_TERRACOTTA_SLAB = BLOCKS.register("cobbled_brown_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_TERRACOTTA_SLAB = BLOCKS.register("cobbled_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(TERRACOTTA)));

	// Terracotta Stairs
	public static final RegistrySupplier<Block> COBBLED_RED_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_red_terracotta_stairs", () ->
			new CPlusStairBlock(RED_TERRACOTTA.getDefaultState(), Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_ORANGE_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_orange_terracotta_stairs", () ->
			new CPlusStairBlock(ORANGE_TERRACOTTA.getDefaultState(), Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_YELLOW_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_yellow_terracotta_stairs", () ->
			new CPlusStairBlock(YELLOW_TERRACOTTA.getDefaultState(), Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_LIME_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_lime_terracotta_stairs", () ->
			new CPlusStairBlock(LIME_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_GREEN_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_green_terracotta_stairs", () ->
			new CPlusStairBlock(GREEN_TERRACOTTA.getDefaultState(), Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_blue_terracotta_stairs", () ->
			new CPlusStairBlock(BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_CYAN_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_cyan_terracotta_stairs", () ->
			new CPlusStairBlock(CYAN_TERRACOTTA.getDefaultState(), Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_LIGHT_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_light_blue_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_PURPLE_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_purple_terracotta_stairs", () ->
			new CPlusStairBlock(PURPLE_TERRACOTTA.getDefaultState(), Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_MAGENTA_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_magenta_terracotta_stairs", () ->
			new CPlusStairBlock(MAGENTA_TERRACOTTA.getDefaultState(), Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_PINK_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_pink_terracotta_stairs", () ->
			new CPlusStairBlock(PINK_TERRACOTTA.getDefaultState(), Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_WHITE_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_white_terracotta_stairs", () ->
			new CPlusStairBlock(WHITE_TERRACOTTA.getDefaultState(), Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_LIGHT_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_light_gray_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_gray_terracotta_stairs", () ->
			new CPlusStairBlock(GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_BLACK_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_black_terracotta_stairs", () ->
			new CPlusStairBlock(BLACK_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_BROWN_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_brown_terracotta_stairs", () ->
			new CPlusStairBlock(BROWN_TERRACOTTA.getDefaultState(), Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_TERRACOTTA_STAIRS = BLOCKS.register("cobbled_terracotta_stairs", () ->
			new CPlusStairBlock(TERRACOTTA.getDefaultState(), Block.Settings.copy(TERRACOTTA)));

	// Terracotta Wall
	public static final RegistrySupplier<Block> COBBLED_RED_TERRACOTTA_WALL = BLOCKS.register("cobbled_red_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_ORANGE_TERRACOTTA_WALL = BLOCKS.register("cobbled_orange_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_YELLOW_TERRACOTTA_WALL = BLOCKS.register("cobbled_yellow_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_LIME_TERRACOTTA_WALL = BLOCKS.register("cobbled_lime_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_GREEN_TERRACOTTA_WALL = BLOCKS.register("cobbled_green_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_BLUE_TERRACOTTA_WALL = BLOCKS.register("cobbled_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_CYAN_TERRACOTTA_WALL = BLOCKS.register("cobbled_cyan_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_LIGHT_BLUE_TERRACOTTA_WALL = BLOCKS.register("cobbled_light_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_PURPLE_TERRACOTTA_WALL = BLOCKS.register("cobbled_purple_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_MAGENTA_TERRACOTTA_WALL = BLOCKS.register("cobbled_magenta_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_PINK_TERRACOTTA_WALL = BLOCKS.register("cobbled_pink_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_WHITE_TERRACOTTA_WALL = BLOCKS.register("cobbled_white_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_LIGHT_GRAY_TERRACOTTA_WALL = BLOCKS.register("cobbled_light_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_GRAY_TERRACOTTA_WALL = BLOCKS.register("cobbled_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_BLACK_TERRACOTTA_WALL = BLOCKS.register("cobbled_black_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_BROWN_TERRACOTTA_WALL = BLOCKS.register("cobbled_brown_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_TERRACOTTA_WALL = BLOCKS.register("cobbled_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(TERRACOTTA)));

	// Terracotta Gates
	public static final RegistrySupplier<Block> COBBLED_RED_TERRACOTTA_GATE = BLOCKS.register("cobbled_red_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_ORANGE_TERRACOTTA_GATE = BLOCKS.register("cobbled_orange_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_YELLOW_TERRACOTTA_GATE = BLOCKS.register("cobbled_yellow_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_LIME_TERRACOTTA_GATE = BLOCKS.register("cobbled_lime_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_GREEN_TERRACOTTA_GATE = BLOCKS.register("cobbled_green_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_BLUE_TERRACOTTA_GATE = BLOCKS.register("cobbled_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_CYAN_TERRACOTTA_GATE = BLOCKS.register("cobbled_cyan_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_LIGHT_BLUE_TERRACOTTA_GATE = BLOCKS.register("cobbled_light_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_PURPLE_TERRACOTTA_GATE = BLOCKS.register("cobbled_purple_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_MAGENTA_TERRACOTTA_GATE = BLOCKS.register("cobbled_magenta_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_PINK_TERRACOTTA_GATE = BLOCKS.register("cobbled_pink_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_WHITE_TERRACOTTA_GATE = BLOCKS.register("cobbled_white_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_LIGHT_GRAY_TERRACOTTA_GATE = BLOCKS.register("cobbled_light_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_GRAY_TERRACOTTA_GATE = BLOCKS.register("cobbled_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_BLACK_TERRACOTTA_GATE = BLOCKS.register("cobbled_black_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_BROWN_TERRACOTTA_GATE = BLOCKS.register("cobbled_brown_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> COBBLED_TERRACOTTA_GATE = BLOCKS.register("cobbled_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TERRACOTTA)));

	public static final RegistrySupplier<Block> SMOOTH_RED_TERRACOTTA = BLOCKS.register("smooth_red_terracotta", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_ORANGE_TERRACOTTA = BLOCKS.register("smooth_orange_terracotta", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_YELLOW_TERRACOTTA = BLOCKS.register("smooth_yellow_terracotta", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_LIME_TERRACOTTA = BLOCKS.register("smooth_lime_terracotta", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_GREEN_TERRACOTTA = BLOCKS.register("smooth_green_terracotta", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_BLUE_TERRACOTTA = BLOCKS.register("smooth_blue_terracotta", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_CYAN_TERRACOTTA = BLOCKS.register("smooth_cyan_terracotta", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_BLUE_TERRACOTTA = BLOCKS.register("smooth_light_blue_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_PURPLE_TERRACOTTA = BLOCKS.register("smooth_purple_terracotta", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_MAGENTA_TERRACOTTA = BLOCKS.register("smooth_magenta_terracotta", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_PINK_TERRACOTTA = BLOCKS.register("smooth_pink_terracotta", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_WHITE_TERRACOTTA = BLOCKS.register("smooth_white_terracotta", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_GRAY_TERRACOTTA = BLOCKS.register("smooth_light_gray_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_GRAY_TERRACOTTA = BLOCKS.register("smooth_gray_terracotta", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_BLACK_TERRACOTTA = BLOCKS.register("smooth_black_terracotta", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_BROWN_TERRACOTTA = BLOCKS.register("smooth_brown_terracotta", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_TERRACOTTA = BLOCKS.register("smooth_terracotta", () ->
			new Block(Block.Settings.copy(TERRACOTTA)));

	public static final RegistrySupplier<Block> SMOOTH_RED_TERRACOTTA_SLAB = BLOCKS.register("smooth_red_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_ORANGE_TERRACOTTA_SLAB = BLOCKS.register("smooth_orange_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_YELLOW_TERRACOTTA_SLAB = BLOCKS.register("smooth_yellow_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_LIME_TERRACOTTA_SLAB = BLOCKS.register("smooth_lime_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_GREEN_TERRACOTTA_SLAB = BLOCKS.register("smooth_green_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_BLUE_TERRACOTTA_SLAB = BLOCKS.register("smooth_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_CYAN_TERRACOTTA_SLAB = BLOCKS.register("smooth_cyan_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_BLUE_TERRACOTTA_SLAB = BLOCKS.register("smooth_light_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_PURPLE_TERRACOTTA_SLAB = BLOCKS.register("smooth_purple_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_MAGENTA_TERRACOTTA_SLAB = BLOCKS.register("smooth_magenta_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_PINK_TERRACOTTA_SLAB = BLOCKS.register("smooth_pink_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_WHITE_TERRACOTTA_SLAB = BLOCKS.register("smooth_white_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_GRAY_TERRACOTTA_SLAB = BLOCKS.register("smooth_light_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_GRAY_TERRACOTTA_SLAB = BLOCKS.register("smooth_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_BLACK_TERRACOTTA_SLAB = BLOCKS.register("smooth_black_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_BROWN_TERRACOTTA_SLAB = BLOCKS.register("smooth_brown_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_TERRACOTTA_SLAB = BLOCKS.register("smooth_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(TERRACOTTA)));

	// Terracotta Stairs
	public static final RegistrySupplier<Block> SMOOTH_RED_TERRACOTTA_STAIRS = BLOCKS.register("smooth_red_terracotta_stairs", () ->
			new CPlusStairBlock(RED_TERRACOTTA.getDefaultState(), Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_ORANGE_TERRACOTTA_STAIRS = BLOCKS.register("smooth_orange_terracotta_stairs", () ->
			new CPlusStairBlock(ORANGE_TERRACOTTA.getDefaultState(), Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_YELLOW_TERRACOTTA_STAIRS = BLOCKS.register("smooth_yellow_terracotta_stairs", () ->
			new CPlusStairBlock(YELLOW_TERRACOTTA.getDefaultState(), Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_LIME_TERRACOTTA_STAIRS = BLOCKS.register("smooth_lime_terracotta_stairs", () ->
			new CPlusStairBlock(LIME_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_GREEN_TERRACOTTA_STAIRS = BLOCKS.register("smooth_green_terracotta_stairs", () ->
			new CPlusStairBlock(GREEN_TERRACOTTA.getDefaultState(), Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("smooth_blue_terracotta_stairs", () ->
			new CPlusStairBlock(BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_CYAN_TERRACOTTA_STAIRS = BLOCKS.register("smooth_cyan_terracotta_stairs", () ->
			new CPlusStairBlock(CYAN_TERRACOTTA.getDefaultState(), Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("smooth_light_blue_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_PURPLE_TERRACOTTA_STAIRS = BLOCKS.register("smooth_purple_terracotta_stairs", () ->
			new CPlusStairBlock(PURPLE_TERRACOTTA.getDefaultState(), Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_MAGENTA_TERRACOTTA_STAIRS = BLOCKS.register("smooth_magenta_terracotta_stairs", () ->
			new CPlusStairBlock(MAGENTA_TERRACOTTA.getDefaultState(), Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_PINK_TERRACOTTA_STAIRS = BLOCKS.register("smooth_pink_terracotta_stairs", () ->
			new CPlusStairBlock(PINK_TERRACOTTA.getDefaultState(), Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_WHITE_TERRACOTTA_STAIRS = BLOCKS.register("smooth_white_terracotta_stairs", () ->
			new CPlusStairBlock(WHITE_TERRACOTTA.getDefaultState(), Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("smooth_light_gray_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("smooth_gray_terracotta_stairs", () ->
			new CPlusStairBlock(GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_BLACK_TERRACOTTA_STAIRS = BLOCKS.register("smooth_black_terracotta_stairs", () ->
			new CPlusStairBlock(BLACK_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_BROWN_TERRACOTTA_STAIRS = BLOCKS.register("smooth_brown_terracotta_stairs", () ->
			new CPlusStairBlock(BROWN_TERRACOTTA.getDefaultState(), Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_TERRACOTTA_STAIRS = BLOCKS.register("smooth_terracotta_stairs", () ->
			new CPlusStairBlock(TERRACOTTA.getDefaultState(), Block.Settings.copy(TERRACOTTA)));

	// Terracotta Wall
	public static final RegistrySupplier<Block> SMOOTH_RED_TERRACOTTA_WALL = BLOCKS.register("smooth_red_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_ORANGE_TERRACOTTA_WALL = BLOCKS.register("smooth_orange_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_YELLOW_TERRACOTTA_WALL = BLOCKS.register("smooth_yellow_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_LIME_TERRACOTTA_WALL = BLOCKS.register("smooth_lime_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_GREEN_TERRACOTTA_WALL = BLOCKS.register("smooth_green_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_BLUE_TERRACOTTA_WALL = BLOCKS.register("smooth_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_CYAN_TERRACOTTA_WALL = BLOCKS.register("smooth_cyan_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_BLUE_TERRACOTTA_WALL = BLOCKS.register("smooth_light_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_PURPLE_TERRACOTTA_WALL = BLOCKS.register("smooth_purple_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_MAGENTA_TERRACOTTA_WALL = BLOCKS.register("smooth_magenta_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_PINK_TERRACOTTA_WALL = BLOCKS.register("smooth_pink_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_WHITE_TERRACOTTA_WALL = BLOCKS.register("smooth_white_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_GRAY_TERRACOTTA_WALL = BLOCKS.register("smooth_light_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_GRAY_TERRACOTTA_WALL = BLOCKS.register("smooth_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_BLACK_TERRACOTTA_WALL = BLOCKS.register("smooth_black_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_BROWN_TERRACOTTA_WALL = BLOCKS.register("smooth_brown_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_TERRACOTTA_WALL = BLOCKS.register("smooth_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(TERRACOTTA)));

	// Terracotta Gates
	public static final RegistrySupplier<Block> SMOOTH_RED_TERRACOTTA_GATE = BLOCKS.register("smooth_red_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_ORANGE_TERRACOTTA_GATE = BLOCKS.register("smooth_orange_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_YELLOW_TERRACOTTA_GATE = BLOCKS.register("smooth_yellow_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_LIME_TERRACOTTA_GATE = BLOCKS.register("smooth_lime_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_GREEN_TERRACOTTA_GATE = BLOCKS.register("smooth_green_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_BLUE_TERRACOTTA_GATE = BLOCKS.register("smooth_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_CYAN_TERRACOTTA_GATE = BLOCKS.register("smooth_cyan_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_BLUE_TERRACOTTA_GATE = BLOCKS.register("smooth_light_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_PURPLE_TERRACOTTA_GATE = BLOCKS.register("smooth_purple_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_MAGENTA_TERRACOTTA_GATE = BLOCKS.register("smooth_magenta_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_PINK_TERRACOTTA_GATE = BLOCKS.register("smooth_pink_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_WHITE_TERRACOTTA_GATE = BLOCKS.register("smooth_white_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_GRAY_TERRACOTTA_GATE = BLOCKS.register("smooth_light_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_GRAY_TERRACOTTA_GATE = BLOCKS.register("smooth_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_BLACK_TERRACOTTA_GATE = BLOCKS.register("smooth_black_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_BROWN_TERRACOTTA_GATE = BLOCKS.register("smooth_brown_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> SMOOTH_TERRACOTTA_GATE = BLOCKS.register("smooth_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TERRACOTTA)));

	public static final RegistrySupplier<Block> POLISHED_RED_TERRACOTTA = BLOCKS.register("polished_red_terracotta", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_ORANGE_TERRACOTTA = BLOCKS.register("polished_orange_terracotta", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_YELLOW_TERRACOTTA = BLOCKS.register("polished_yellow_terracotta", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIME_TERRACOTTA = BLOCKS.register("polished_lime_terracotta", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GREEN_TERRACOTTA = BLOCKS.register("polished_green_terracotta", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLUE_TERRACOTTA = BLOCKS.register("polished_blue_terracotta", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_CYAN_TERRACOTTA = BLOCKS.register("polished_cyan_terracotta", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_BLUE_TERRACOTTA = BLOCKS.register("polished_light_blue_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PURPLE_TERRACOTTA = BLOCKS.register("polished_purple_terracotta", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_MAGENTA_TERRACOTTA = BLOCKS.register("polished_magenta_terracotta", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PINK_TERRACOTTA = BLOCKS.register("polished_pink_terracotta", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_WHITE_TERRACOTTA = BLOCKS.register("polished_white_terracotta", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_GRAY_TERRACOTTA = BLOCKS.register("polished_light_gray_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GRAY_TERRACOTTA = BLOCKS.register("polished_gray_terracotta", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLACK_TERRACOTTA = BLOCKS.register("polished_black_terracotta", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BROWN_TERRACOTTA = BLOCKS.register("polished_brown_terracotta", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_TERRACOTTA = BLOCKS.register("polished_terracotta", () ->
			new Block(Block.Settings.copy(TERRACOTTA)));

	public static final RegistrySupplier<Block> POLISHED_RED_TERRACOTTA_SLAB = BLOCKS.register("polished_red_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_ORANGE_TERRACOTTA_SLAB = BLOCKS.register("polished_orange_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_YELLOW_TERRACOTTA_SLAB = BLOCKS.register("polished_yellow_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIME_TERRACOTTA_SLAB = BLOCKS.register("polished_lime_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GREEN_TERRACOTTA_SLAB = BLOCKS.register("polished_green_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLUE_TERRACOTTA_SLAB = BLOCKS.register("polished_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_CYAN_TERRACOTTA_SLAB = BLOCKS.register("polished_cyan_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_BLUE_TERRACOTTA_SLAB = BLOCKS.register("polished_light_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PURPLE_TERRACOTTA_SLAB = BLOCKS.register("polished_purple_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_MAGENTA_TERRACOTTA_SLAB = BLOCKS.register("polished_magenta_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PINK_TERRACOTTA_SLAB = BLOCKS.register("polished_pink_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_WHITE_TERRACOTTA_SLAB = BLOCKS.register("polished_white_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_GRAY_TERRACOTTA_SLAB = BLOCKS.register("polished_light_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GRAY_TERRACOTTA_SLAB = BLOCKS.register("polished_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLACK_TERRACOTTA_SLAB = BLOCKS.register("polished_black_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BROWN_TERRACOTTA_SLAB = BLOCKS.register("polished_brown_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_TERRACOTTA_SLAB = BLOCKS.register("polished_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(TERRACOTTA)));

	// Terracotta Stairs
	public static final RegistrySupplier<Block> POLISHED_RED_TERRACOTTA_STAIRS = BLOCKS.register("polished_red_terracotta_stairs", () ->
			new CPlusStairBlock(RED_TERRACOTTA.getDefaultState(), Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_ORANGE_TERRACOTTA_STAIRS = BLOCKS.register("polished_orange_terracotta_stairs", () ->
			new CPlusStairBlock(ORANGE_TERRACOTTA.getDefaultState(), Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_YELLOW_TERRACOTTA_STAIRS = BLOCKS.register("polished_yellow_terracotta_stairs", () ->
			new CPlusStairBlock(YELLOW_TERRACOTTA.getDefaultState(), Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIME_TERRACOTTA_STAIRS = BLOCKS.register("polished_lime_terracotta_stairs", () ->
			new CPlusStairBlock(LIME_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GREEN_TERRACOTTA_STAIRS = BLOCKS.register("polished_green_terracotta_stairs", () ->
			new CPlusStairBlock(GREEN_TERRACOTTA.getDefaultState(), Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("polished_blue_terracotta_stairs", () ->
			new CPlusStairBlock(BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_CYAN_TERRACOTTA_STAIRS = BLOCKS.register("polished_cyan_terracotta_stairs", () ->
			new CPlusStairBlock(CYAN_TERRACOTTA.getDefaultState(), Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("polished_light_blue_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PURPLE_TERRACOTTA_STAIRS = BLOCKS.register("polished_purple_terracotta_stairs", () ->
			new CPlusStairBlock(PURPLE_TERRACOTTA.getDefaultState(), Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_MAGENTA_TERRACOTTA_STAIRS = BLOCKS.register("polished_magenta_terracotta_stairs", () ->
			new CPlusStairBlock(MAGENTA_TERRACOTTA.getDefaultState(), Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PINK_TERRACOTTA_STAIRS = BLOCKS.register("polished_pink_terracotta_stairs", () ->
			new CPlusStairBlock(PINK_TERRACOTTA.getDefaultState(), Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_WHITE_TERRACOTTA_STAIRS = BLOCKS.register("polished_white_terracotta_stairs", () ->
			new CPlusStairBlock(WHITE_TERRACOTTA.getDefaultState(), Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("polished_light_gray_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("polished_gray_terracotta_stairs", () ->
			new CPlusStairBlock(GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLACK_TERRACOTTA_STAIRS = BLOCKS.register("polished_black_terracotta_stairs", () ->
			new CPlusStairBlock(BLACK_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BROWN_TERRACOTTA_STAIRS = BLOCKS.register("polished_brown_terracotta_stairs", () ->
			new CPlusStairBlock(BROWN_TERRACOTTA.getDefaultState(), Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_TERRACOTTA_STAIRS = BLOCKS.register("polished_terracotta_stairs", () ->
			new CPlusStairBlock(TERRACOTTA.getDefaultState(), Block.Settings.copy(TERRACOTTA)));

	// Terracotta Wall
	public static final RegistrySupplier<Block> POLISHED_RED_TERRACOTTA_WALL = BLOCKS.register("polished_red_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_ORANGE_TERRACOTTA_WALL = BLOCKS.register("polished_orange_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_YELLOW_TERRACOTTA_WALL = BLOCKS.register("polished_yellow_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIME_TERRACOTTA_WALL = BLOCKS.register("polished_lime_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GREEN_TERRACOTTA_WALL = BLOCKS.register("polished_green_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLUE_TERRACOTTA_WALL = BLOCKS.register("polished_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_CYAN_TERRACOTTA_WALL = BLOCKS.register("polished_cyan_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_BLUE_TERRACOTTA_WALL = BLOCKS.register("polished_light_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PURPLE_TERRACOTTA_WALL = BLOCKS.register("polished_purple_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_MAGENTA_TERRACOTTA_WALL = BLOCKS.register("polished_magenta_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PINK_TERRACOTTA_WALL = BLOCKS.register("polished_pink_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_WHITE_TERRACOTTA_WALL = BLOCKS.register("polished_white_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_GRAY_TERRACOTTA_WALL = BLOCKS.register("polished_light_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GRAY_TERRACOTTA_WALL = BLOCKS.register("polished_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLACK_TERRACOTTA_WALL = BLOCKS.register("polished_black_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BROWN_TERRACOTTA_WALL = BLOCKS.register("polished_brown_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_TERRACOTTA_WALL = BLOCKS.register("polished_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(TERRACOTTA)));

	// Terracotta Gates
	public static final RegistrySupplier<Block> POLISHED_RED_TERRACOTTA_GATE = BLOCKS.register("polished_red_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_ORANGE_TERRACOTTA_GATE = BLOCKS.register("polished_orange_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_YELLOW_TERRACOTTA_GATE = BLOCKS.register("polished_yellow_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIME_TERRACOTTA_GATE = BLOCKS.register("polished_lime_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GREEN_TERRACOTTA_GATE = BLOCKS.register("polished_green_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLUE_TERRACOTTA_GATE = BLOCKS.register("polished_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_CYAN_TERRACOTTA_GATE = BLOCKS.register("polished_cyan_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_BLUE_TERRACOTTA_GATE = BLOCKS.register("polished_light_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PURPLE_TERRACOTTA_GATE = BLOCKS.register("polished_purple_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_MAGENTA_TERRACOTTA_GATE = BLOCKS.register("polished_magenta_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PINK_TERRACOTTA_GATE = BLOCKS.register("polished_pink_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_WHITE_TERRACOTTA_GATE = BLOCKS.register("polished_white_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_GRAY_TERRACOTTA_GATE = BLOCKS.register("polished_light_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GRAY_TERRACOTTA_GATE = BLOCKS.register("polished_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLACK_TERRACOTTA_GATE = BLOCKS.register("polished_black_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BROWN_TERRACOTTA_GATE = BLOCKS.register("polished_brown_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_TERRACOTTA_GATE = BLOCKS.register("polished_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TERRACOTTA)));

	public static final RegistrySupplier<Block> CUT_RED_TERRACOTTA = BLOCKS.register("cut_red_terracotta", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_ORANGE_TERRACOTTA = BLOCKS.register("cut_orange_terracotta", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_YELLOW_TERRACOTTA = BLOCKS.register("cut_yellow_terracotta", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_LIME_TERRACOTTA = BLOCKS.register("cut_lime_terracotta", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_GREEN_TERRACOTTA = BLOCKS.register("cut_green_terracotta", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_BLUE_TERRACOTTA = BLOCKS.register("cut_blue_terracotta", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_CYAN_TERRACOTTA = BLOCKS.register("cut_cyan_terracotta", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_LIGHT_BLUE_TERRACOTTA = BLOCKS.register("cut_light_blue_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_PURPLE_TERRACOTTA = BLOCKS.register("cut_purple_terracotta", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_MAGENTA_TERRACOTTA = BLOCKS.register("cut_magenta_terracotta", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_PINK_TERRACOTTA = BLOCKS.register("cut_pink_terracotta", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_WHITE_TERRACOTTA = BLOCKS.register("cut_white_terracotta", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_LIGHT_GRAY_TERRACOTTA = BLOCKS.register("cut_light_gray_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_GRAY_TERRACOTTA = BLOCKS.register("cut_gray_terracotta", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_BLACK_TERRACOTTA = BLOCKS.register("cut_black_terracotta", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_BROWN_TERRACOTTA = BLOCKS.register("cut_brown_terracotta", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_TERRACOTTA = BLOCKS.register("cut_terracotta", () ->
			new Block(Block.Settings.copy(TERRACOTTA)));

	public static final RegistrySupplier<Block> CUT_RED_TERRACOTTA_SLAB = BLOCKS.register("cut_red_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_ORANGE_TERRACOTTA_SLAB = BLOCKS.register("cut_orange_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_YELLOW_TERRACOTTA_SLAB = BLOCKS.register("cut_yellow_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_LIME_TERRACOTTA_SLAB = BLOCKS.register("cut_lime_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_GREEN_TERRACOTTA_SLAB = BLOCKS.register("cut_green_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_BLUE_TERRACOTTA_SLAB = BLOCKS.register("cut_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_CYAN_TERRACOTTA_SLAB = BLOCKS.register("cut_cyan_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_LIGHT_BLUE_TERRACOTTA_SLAB = BLOCKS.register("cut_light_blue_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_PURPLE_TERRACOTTA_SLAB = BLOCKS.register("cut_purple_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_MAGENTA_TERRACOTTA_SLAB = BLOCKS.register("cut_magenta_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_PINK_TERRACOTTA_SLAB = BLOCKS.register("cut_pink_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_WHITE_TERRACOTTA_SLAB = BLOCKS.register("cut_white_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_LIGHT_GRAY_TERRACOTTA_SLAB = BLOCKS.register("cut_light_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_GRAY_TERRACOTTA_SLAB = BLOCKS.register("cut_gray_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_BLACK_TERRACOTTA_SLAB = BLOCKS.register("cut_black_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_BROWN_TERRACOTTA_SLAB = BLOCKS.register("cut_brown_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_TERRACOTTA_SLAB = BLOCKS.register("cut_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(TERRACOTTA)));

	// Terracotta Stairs
	public static final RegistrySupplier<Block> CUT_RED_TERRACOTTA_STAIRS = BLOCKS.register("cut_red_terracotta_stairs", () ->
			new CPlusStairBlock(RED_TERRACOTTA.getDefaultState(), Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_ORANGE_TERRACOTTA_STAIRS = BLOCKS.register("cut_orange_terracotta_stairs", () ->
			new CPlusStairBlock(ORANGE_TERRACOTTA.getDefaultState(), Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_YELLOW_TERRACOTTA_STAIRS = BLOCKS.register("cut_yellow_terracotta_stairs", () ->
			new CPlusStairBlock(YELLOW_TERRACOTTA.getDefaultState(), Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_LIME_TERRACOTTA_STAIRS = BLOCKS.register("cut_lime_terracotta_stairs", () ->
			new CPlusStairBlock(LIME_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_GREEN_TERRACOTTA_STAIRS = BLOCKS.register("cut_green_terracotta_stairs", () ->
			new CPlusStairBlock(GREEN_TERRACOTTA.getDefaultState(), Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("cut_blue_terracotta_stairs", () ->
			new CPlusStairBlock(BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_CYAN_TERRACOTTA_STAIRS = BLOCKS.register("cut_cyan_terracotta_stairs", () ->
			new CPlusStairBlock(CYAN_TERRACOTTA.getDefaultState(), Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_LIGHT_BLUE_TERRACOTTA_STAIRS = BLOCKS.register("cut_light_blue_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_PURPLE_TERRACOTTA_STAIRS = BLOCKS.register("cut_purple_terracotta_stairs", () ->
			new CPlusStairBlock(PURPLE_TERRACOTTA.getDefaultState(), Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_MAGENTA_TERRACOTTA_STAIRS = BLOCKS.register("cut_magenta_terracotta_stairs", () ->
			new CPlusStairBlock(MAGENTA_TERRACOTTA.getDefaultState(), Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_PINK_TERRACOTTA_STAIRS = BLOCKS.register("cut_pink_terracotta_stairs", () ->
			new CPlusStairBlock(PINK_TERRACOTTA.getDefaultState(), Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_WHITE_TERRACOTTA_STAIRS = BLOCKS.register("cut_white_terracotta_stairs", () ->
			new CPlusStairBlock(WHITE_TERRACOTTA.getDefaultState(), Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_LIGHT_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("cut_light_gray_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_GRAY_TERRACOTTA_STAIRS = BLOCKS.register("cut_gray_terracotta_stairs", () ->
			new CPlusStairBlock(GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_BLACK_TERRACOTTA_STAIRS = BLOCKS.register("cut_black_terracotta_stairs", () ->
			new CPlusStairBlock(BLACK_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_BROWN_TERRACOTTA_STAIRS = BLOCKS.register("cut_brown_terracotta_stairs", () ->
			new CPlusStairBlock(BROWN_TERRACOTTA.getDefaultState(), Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_TERRACOTTA_STAIRS = BLOCKS.register("cut_terracotta_stairs", () ->
			new CPlusStairBlock(TERRACOTTA.getDefaultState(), Block.Settings.copy(TERRACOTTA)));

	// Terracotta Wall
	public static final RegistrySupplier<Block> CUT_RED_TERRACOTTA_WALL = BLOCKS.register("cut_red_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_ORANGE_TERRACOTTA_WALL = BLOCKS.register("cut_orange_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_YELLOW_TERRACOTTA_WALL = BLOCKS.register("cut_yellow_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_LIME_TERRACOTTA_WALL = BLOCKS.register("cut_lime_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_GREEN_TERRACOTTA_WALL = BLOCKS.register("cut_green_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_BLUE_TERRACOTTA_WALL = BLOCKS.register("cut_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_CYAN_TERRACOTTA_WALL = BLOCKS.register("cut_cyan_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_LIGHT_BLUE_TERRACOTTA_WALL = BLOCKS.register("cut_light_blue_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_PURPLE_TERRACOTTA_WALL = BLOCKS.register("cut_purple_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_MAGENTA_TERRACOTTA_WALL = BLOCKS.register("cut_magenta_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_PINK_TERRACOTTA_WALL = BLOCKS.register("cut_pink_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_WHITE_TERRACOTTA_WALL = BLOCKS.register("cut_white_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_LIGHT_GRAY_TERRACOTTA_WALL = BLOCKS.register("cut_light_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_GRAY_TERRACOTTA_WALL = BLOCKS.register("cut_gray_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_BLACK_TERRACOTTA_WALL = BLOCKS.register("cut_black_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_BROWN_TERRACOTTA_WALL = BLOCKS.register("cut_brown_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_TERRACOTTA_WALL = BLOCKS.register("cut_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(TERRACOTTA)));

	// Terracotta Gates
	public static final RegistrySupplier<Block> CUT_RED_TERRACOTTA_GATE = BLOCKS.register("cut_red_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_ORANGE_TERRACOTTA_GATE = BLOCKS.register("cut_orange_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_YELLOW_TERRACOTTA_GATE = BLOCKS.register("cut_yellow_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_LIME_TERRACOTTA_GATE = BLOCKS.register("cut_lime_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_GREEN_TERRACOTTA_GATE = BLOCKS.register("cut_green_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_BLUE_TERRACOTTA_GATE = BLOCKS.register("cut_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_CYAN_TERRACOTTA_GATE = BLOCKS.register("cut_cyan_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_LIGHT_BLUE_TERRACOTTA_GATE = BLOCKS.register("cut_light_blue_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_PURPLE_TERRACOTTA_GATE = BLOCKS.register("cut_purple_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_MAGENTA_TERRACOTTA_GATE = BLOCKS.register("cut_magenta_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_PINK_TERRACOTTA_GATE = BLOCKS.register("cut_pink_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_WHITE_TERRACOTTA_GATE = BLOCKS.register("cut_white_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_LIGHT_GRAY_TERRACOTTA_GATE = BLOCKS.register("cut_light_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_GRAY_TERRACOTTA_GATE = BLOCKS.register("cut_gray_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_BLACK_TERRACOTTA_GATE = BLOCKS.register("cut_black_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_BROWN_TERRACOTTA_GATE = BLOCKS.register("cut_brown_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CUT_TERRACOTTA_GATE = BLOCKS.register("cut_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TERRACOTTA)));

	public static final RegistrySupplier<Block> RED_TERRACOTTA_BRICKS = BLOCKS.register("red_terracotta_bricks", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_BRICKS = BLOCKS.register("orange_terracotta_bricks", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> YELLOW_TERRACOTTA_BRICKS = BLOCKS.register("yellow_terracotta_bricks", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIME_TERRACOTTA_BRICKS = BLOCKS.register("lime_terracotta_bricks", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> GREEN_TERRACOTTA_BRICKS = BLOCKS.register("green_terracotta_bricks", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLUE_TERRACOTTA_BRICKS = BLOCKS.register("blue_terracotta_bricks", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CYAN_TERRACOTTA_BRICKS = BLOCKS.register("cyan_terracotta_bricks", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_TERRACOTTA_BRICKS = BLOCKS.register("light_blue_terracotta_bricks", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> PURPLE_TERRACOTTA_BRICKS = BLOCKS.register("purple_terracotta_bricks", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> MAGENTA_TERRACOTTA_BRICKS = BLOCKS.register("magenta_terracotta_bricks", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> PINK_TERRACOTTA_BRICKS = BLOCKS.register("pink_terracotta_bricks", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> WHITE_TERRACOTTA_BRICKS = BLOCKS.register("white_terracotta_bricks", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_TERRACOTTA_BRICKS = BLOCKS.register("light_gray_terracotta_bricks", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> GRAY_TERRACOTTA_BRICKS = BLOCKS.register("gray_terracotta_bricks", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLACK_TERRACOTTA_BRICKS = BLOCKS.register("black_terracotta_bricks", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> BROWN_TERRACOTTA_BRICKS = BLOCKS.register("brown_terracotta_bricks", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA)));

	public static final RegistrySupplier<Block> RED_TERRACOTTA_BRICK_SLAB = BLOCKS.register("red_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_BRICK_SLAB = BLOCKS.register("orange_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> YELLOW_TERRACOTTA_BRICK_SLAB = BLOCKS.register("yellow_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIME_TERRACOTTA_BRICK_SLAB = BLOCKS.register("lime_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> GREEN_TERRACOTTA_BRICK_SLAB = BLOCKS.register("green_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLUE_TERRACOTTA_BRICK_SLAB = BLOCKS.register("blue_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CYAN_TERRACOTTA_BRICK_SLAB = BLOCKS.register("cyan_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = BLOCKS.register("light_blue_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> PURPLE_TERRACOTTA_BRICK_SLAB = BLOCKS.register("purple_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> MAGENTA_TERRACOTTA_BRICK_SLAB = BLOCKS.register("magenta_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> PINK_TERRACOTTA_BRICK_SLAB = BLOCKS.register("pink_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> WHITE_TERRACOTTA_BRICK_SLAB = BLOCKS.register("white_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = BLOCKS.register("light_gray_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> GRAY_TERRACOTTA_BRICK_SLAB = BLOCKS.register("gray_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLACK_TERRACOTTA_BRICK_SLAB = BLOCKS.register("black_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> BROWN_TERRACOTTA_BRICK_SLAB = BLOCKS.register("brown_terracotta_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_TERRACOTTA)));

	// Terracotta Stairs
	public static final RegistrySupplier<Block> RED_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("red_terracotta_brick_stairs", () ->
			new CPlusStairBlock(RED_TERRACOTTA.getDefaultState(), Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("orange_terracotta_brick_stairs", () ->
			new CPlusStairBlock(ORANGE_TERRACOTTA.getDefaultState(), Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> YELLOW_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("yellow_terracotta_brick_stairs", () ->
			new CPlusStairBlock(YELLOW_TERRACOTTA.getDefaultState(), Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIME_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("lime_terracotta_brick_stairs", () ->
			new CPlusStairBlock(LIME_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> GREEN_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("green_terracotta_brick_stairs", () ->
			new CPlusStairBlock(GREEN_TERRACOTTA.getDefaultState(), Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLUE_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("blue_terracotta_brick_stairs", () ->
			new CPlusStairBlock(BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CYAN_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("cyan_terracotta_brick_stairs", () ->
			new CPlusStairBlock(CYAN_TERRACOTTA.getDefaultState(), Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("light_blue_terracotta_brick_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> PURPLE_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("purple_terracotta_brick_stairs", () ->
			new CPlusStairBlock(PURPLE_TERRACOTTA.getDefaultState(), Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> MAGENTA_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("magenta_terracotta_brick_stairs", () ->
			new CPlusStairBlock(MAGENTA_TERRACOTTA.getDefaultState(), Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> PINK_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("pink_terracotta_brick_stairs", () ->
			new CPlusStairBlock(PINK_TERRACOTTA.getDefaultState(), Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> WHITE_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("white_terracotta_brick_stairs", () ->
			new CPlusStairBlock(WHITE_TERRACOTTA.getDefaultState(), Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("light_gray_terracotta_brick_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> GRAY_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("gray_terracotta_brick_stairs", () ->
			new CPlusStairBlock(GRAY_TERRACOTTA.getDefaultState(), Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLACK_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("black_terracotta_brick_stairs", () ->
			new CPlusStairBlock(BLACK_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> BROWN_TERRACOTTA_BRICK_STAIRS = BLOCKS.register("brown_terracotta_brick_stairs", () ->
			new CPlusStairBlock(BROWN_TERRACOTTA.getDefaultState(), Block.Settings.copy(BROWN_TERRACOTTA)));
	// Terracotta Wall
	public static final RegistrySupplier<Block> RED_TERRACOTTA_BRICK_WALL = BLOCKS.register("red_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_BRICK_WALL = BLOCKS.register("orange_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> YELLOW_TERRACOTTA_BRICK_WALL = BLOCKS.register("yellow_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIME_TERRACOTTA_BRICK_WALL = BLOCKS.register("lime_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> GREEN_TERRACOTTA_BRICK_WALL = BLOCKS.register("green_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLUE_TERRACOTTA_BRICK_WALL = BLOCKS.register("blue_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CYAN_TERRACOTTA_BRICK_WALL = BLOCKS.register("cyan_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_TERRACOTTA_BRICK_WALL = BLOCKS.register("light_blue_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> PURPLE_TERRACOTTA_BRICK_WALL = BLOCKS.register("purple_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> MAGENTA_TERRACOTTA_BRICK_WALL = BLOCKS.register("magenta_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> PINK_TERRACOTTA_BRICK_WALL = BLOCKS.register("pink_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> WHITE_TERRACOTTA_BRICK_WALL = BLOCKS.register("white_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_TERRACOTTA_BRICK_WALL = BLOCKS.register("light_gray_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> GRAY_TERRACOTTA_BRICK_WALL = BLOCKS.register("gray_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLACK_TERRACOTTA_BRICK_WALL = BLOCKS.register("black_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> BROWN_TERRACOTTA_BRICK_WALL = BLOCKS.register("brown_terracotta_brick_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_TERRACOTTA)));

	// Terracotta Gates
	public static final RegistrySupplier<Block> RED_TERRACOTTA_BRICK_GATE = BLOCKS.register("red_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_BRICK_GATE = BLOCKS.register("orange_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> YELLOW_TERRACOTTA_BRICK_GATE = BLOCKS.register("yellow_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIME_TERRACOTTA_BRICK_GATE = BLOCKS.register("lime_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> GREEN_TERRACOTTA_BRICK_GATE = BLOCKS.register("green_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLUE_TERRACOTTA_BRICK_GATE = BLOCKS.register("blue_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CYAN_TERRACOTTA_BRICK_GATE = BLOCKS.register("cyan_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_TERRACOTTA_BRICK_GATE = BLOCKS.register("light_blue_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> PURPLE_TERRACOTTA_BRICK_GATE = BLOCKS.register("purple_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> MAGENTA_TERRACOTTA_BRICK_GATE = BLOCKS.register("magenta_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> PINK_TERRACOTTA_BRICK_GATE = BLOCKS.register("pink_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> WHITE_TERRACOTTA_BRICK_GATE = BLOCKS.register("white_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_TERRACOTTA_BRICK_GATE = BLOCKS.register("light_gray_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> GRAY_TERRACOTTA_BRICK_GATE = BLOCKS.register("gray_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLACK_TERRACOTTA_BRICK_GATE = BLOCKS.register("black_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> BROWN_TERRACOTTA_BRICK_GATE = BLOCKS.register("brown_terracotta_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_TERRACOTTA)));

	public static final RegistrySupplier<Block> RED_TERRACOTTA_TILES = BLOCKS.register("red_terracotta_tiles", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_TILES = BLOCKS.register("orange_terracotta_tiles", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> YELLOW_TERRACOTTA_TILES = BLOCKS.register("yellow_terracotta_tiles", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIME_TERRACOTTA_TILES = BLOCKS.register("lime_terracotta_tiles", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> GREEN_TERRACOTTA_TILES = BLOCKS.register("green_terracotta_tiles", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLUE_TERRACOTTA_TILES = BLOCKS.register("blue_terracotta_tiles", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CYAN_TERRACOTTA_TILES = BLOCKS.register("cyan_terracotta_tiles", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_TERRACOTTA_TILES = BLOCKS.register("light_blue_terracotta_tiles", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> PURPLE_TERRACOTTA_TILES = BLOCKS.register("purple_terracotta_tiles", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> MAGENTA_TERRACOTTA_TILES = BLOCKS.register("magenta_terracotta_tiles", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> PINK_TERRACOTTA_TILES = BLOCKS.register("pink_terracotta_tiles", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> WHITE_TERRACOTTA_TILES = BLOCKS.register("white_terracotta_tiles", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_TERRACOTTA_TILES = BLOCKS.register("light_gray_terracotta_tiles", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> GRAY_TERRACOTTA_TILES = BLOCKS.register("gray_terracotta_tiles", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLACK_TERRACOTTA_TILES = BLOCKS.register("black_terracotta_tiles", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> BROWN_TERRACOTTA_TILES = BLOCKS.register("brown_terracotta_tiles", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> TERRACOTTA_TILES = BLOCKS.register("terracotta_tiles", () ->
			new Block(Block.Settings.copy(TERRACOTTA)));

	public static final RegistrySupplier<Block> RED_TERRACOTTA_TILE_SLAB = BLOCKS.register("red_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_TILE_SLAB = BLOCKS.register("orange_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> YELLOW_TERRACOTTA_TILE_SLAB = BLOCKS.register("yellow_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIME_TERRACOTTA_TILE_SLAB = BLOCKS.register("lime_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> GREEN_TERRACOTTA_TILE_SLAB = BLOCKS.register("green_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLUE_TERRACOTTA_TILE_SLAB = BLOCKS.register("blue_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CYAN_TERRACOTTA_TILE_SLAB = BLOCKS.register("cyan_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_TERRACOTTA_TILE_SLAB = BLOCKS.register("light_blue_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> PURPLE_TERRACOTTA_TILE_SLAB = BLOCKS.register("purple_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> MAGENTA_TERRACOTTA_TILE_SLAB = BLOCKS.register("magenta_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> PINK_TERRACOTTA_TILE_SLAB = BLOCKS.register("pink_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> WHITE_TERRACOTTA_TILE_SLAB = BLOCKS.register("white_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_TERRACOTTA_TILE_SLAB = BLOCKS.register("light_gray_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> GRAY_TERRACOTTA_TILE_SLAB = BLOCKS.register("gray_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLACK_TERRACOTTA_TILE_SLAB = BLOCKS.register("black_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> BROWN_TERRACOTTA_TILE_SLAB = BLOCKS.register("brown_terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> TERRACOTTA_TILE_SLAB = BLOCKS.register("terracotta_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(TERRACOTTA)));

	// Terracotta Stairs
	public static final RegistrySupplier<Block> RED_TERRACOTTA_TILE_STAIRS = BLOCKS.register("red_terracotta_tile_stairs", () ->
			new CPlusStairBlock(RED_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_TILE_STAIRS = BLOCKS.register("orange_terracotta_tile_stairs", () ->
			new CPlusStairBlock(ORANGE_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> YELLOW_TERRACOTTA_TILE_STAIRS = BLOCKS.register("yellow_terracotta_tile_stairs", () ->
			new CPlusStairBlock(YELLOW_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIME_TERRACOTTA_TILE_STAIRS = BLOCKS.register("lime_terracotta_tile_stairs", () ->
			new CPlusStairBlock(LIME_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> GREEN_TERRACOTTA_TILE_STAIRS = BLOCKS.register("green_terracotta_tile_stairs", () ->
			new CPlusStairBlock(GREEN_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLUE_TERRACOTTA_TILE_STAIRS = BLOCKS.register("blue_terracotta_tile_stairs", () ->
			new CPlusStairBlock(BLUE_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CYAN_TERRACOTTA_TILE_STAIRS = BLOCKS.register("cyan_terracotta_tile_stairs", () ->
			new CPlusStairBlock(CYAN_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_TERRACOTTA_TILE_STAIRS = BLOCKS.register("light_blue_terracotta_tile_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> PURPLE_TERRACOTTA_TILE_STAIRS = BLOCKS.register("purple_terracotta_tile_stairs", () ->
			new CPlusStairBlock(PURPLE_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> MAGENTA_TERRACOTTA_TILE_STAIRS = BLOCKS.register("magenta_terracotta_tile_stairs", () ->
			new CPlusStairBlock(MAGENTA_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> PINK_TERRACOTTA_TILE_STAIRS = BLOCKS.register("pink_terracotta_tile_stairs", () ->
			new CPlusStairBlock(PINK_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> WHITE_TERRACOTTA_TILE_STAIRS = BLOCKS.register("white_terracotta_tile_stairs", () ->
			new CPlusStairBlock(WHITE_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_TERRACOTTA_TILE_STAIRS = BLOCKS.register("light_gray_terracotta_tile_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> GRAY_TERRACOTTA_TILE_STAIRS = BLOCKS.register("gray_terracotta_tile_stairs", () ->
			new CPlusStairBlock(GRAY_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLACK_TERRACOTTA_TILE_STAIRS = BLOCKS.register("black_terracotta_tile_stairs", () ->
			new CPlusStairBlock(BLACK_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> BROWN_TERRACOTTA_TILE_STAIRS = BLOCKS.register("brown_terracotta_tile_stairs", () ->
			new CPlusStairBlock(BROWN_TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> TERRACOTTA_TILE_STAIRS = BLOCKS.register("terracotta_tile_stairs", () ->
			new CPlusStairBlock(TERRACOTTA_TILES.get().getDefaultState(), Block.Settings.copy(TERRACOTTA)));

	// Terracotta Wall
	public static final RegistrySupplier<Block> RED_TERRACOTTA_TILE_WALL = BLOCKS.register("red_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_TILE_WALL = BLOCKS.register("orange_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> YELLOW_TERRACOTTA_TILE_WALL = BLOCKS.register("yellow_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIME_TERRACOTTA_TILE_WALL = BLOCKS.register("lime_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> GREEN_TERRACOTTA_TILE_WALL = BLOCKS.register("green_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLUE_TERRACOTTA_TILE_WALL = BLOCKS.register("blue_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CYAN_TERRACOTTA_TILE_WALL = BLOCKS.register("cyan_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_TERRACOTTA_TILE_WALL = BLOCKS.register("light_blue_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> PURPLE_TERRACOTTA_TILE_WALL = BLOCKS.register("purple_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> MAGENTA_TERRACOTTA_TILE_WALL = BLOCKS.register("magenta_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> PINK_TERRACOTTA_TILE_WALL = BLOCKS.register("pink_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> WHITE_TERRACOTTA_TILE_WALL = BLOCKS.register("white_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_TERRACOTTA_TILE_WALL = BLOCKS.register("light_gray_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> GRAY_TERRACOTTA_TILE_WALL = BLOCKS.register("gray_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLACK_TERRACOTTA_TILE_WALL = BLOCKS.register("black_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> BROWN_TERRACOTTA_TILE_WALL = BLOCKS.register("brown_terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> TERRACOTTA_TILE_WALL = BLOCKS.register("terracotta_tile_wall", () ->
			new WallBlock(Block.Settings.copy(TERRACOTTA)));

	// Terracotta Gates
	public static final RegistrySupplier<Block> RED_TERRACOTTA_TILE_GATE = BLOCKS.register("red_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_TILE_GATE = BLOCKS.register("orange_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> YELLOW_TERRACOTTA_TILE_GATE = BLOCKS.register("yellow_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIME_TERRACOTTA_TILE_GATE = BLOCKS.register("lime_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> GREEN_TERRACOTTA_TILE_GATE = BLOCKS.register("green_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLUE_TERRACOTTA_TILE_GATE = BLOCKS.register("blue_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CYAN_TERRACOTTA_TILE_GATE = BLOCKS.register("cyan_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_TERRACOTTA_TILE_GATE = BLOCKS.register("light_blue_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> PURPLE_TERRACOTTA_TILE_GATE = BLOCKS.register("purple_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> MAGENTA_TERRACOTTA_TILE_GATE = BLOCKS.register("magenta_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> PINK_TERRACOTTA_TILE_GATE = BLOCKS.register("pink_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> WHITE_TERRACOTTA_TILE_GATE = BLOCKS.register("white_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_TERRACOTTA_TILE_GATE = BLOCKS.register("light_gray_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> GRAY_TERRACOTTA_TILE_GATE = BLOCKS.register("gray_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLACK_TERRACOTTA_TILE_GATE = BLOCKS.register("black_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> BROWN_TERRACOTTA_TILE_GATE = BLOCKS.register("brown_terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> TERRACOTTA_TILE_GATE = BLOCKS.register("terracotta_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(TERRACOTTA)));

	public static final RegistrySupplier<Block> RED_TERRACOTTA_PILLAR = BLOCKS.register("red_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_PILLAR = BLOCKS.register("orange_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> YELLOW_TERRACOTTA_PILLAR = BLOCKS.register("yellow_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIME_TERRACOTTA_PILLAR = BLOCKS.register("lime_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> GREEN_TERRACOTTA_PILLAR = BLOCKS.register("green_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLUE_TERRACOTTA_PILLAR = BLOCKS.register("blue_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CYAN_TERRACOTTA_PILLAR = BLOCKS.register("cyan_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_TERRACOTTA_PILLAR = BLOCKS.register("light_blue_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> PURPLE_TERRACOTTA_PILLAR = BLOCKS.register("purple_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> MAGENTA_TERRACOTTA_PILLAR = BLOCKS.register("magenta_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> PINK_TERRACOTTA_PILLAR = BLOCKS.register("pink_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> WHITE_TERRACOTTA_PILLAR = BLOCKS.register("white_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_TERRACOTTA_PILLAR = BLOCKS.register("light_gray_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> GRAY_TERRACOTTA_PILLAR = BLOCKS.register("gray_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLACK_TERRACOTTA_PILLAR = BLOCKS.register("black_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> BROWN_TERRACOTTA_PILLAR = BLOCKS.register("brown_terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> TERRACOTTA_PILLAR = BLOCKS.register("terracotta_pillar", () ->
			new PillarBlock(Block.Settings.copy(TERRACOTTA)));

	public static final RegistrySupplier<Block> RED_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("red_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("orange_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> YELLOW_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("yellow_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIME_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("lime_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> GREEN_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("green_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLUE_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("blue_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CYAN_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("cyan_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("light_blue_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> PURPLE_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("purple_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> MAGENTA_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("magenta_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> PINK_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("pink_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> WHITE_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("white_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("light_gray_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> GRAY_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("gray_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> BLACK_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("black_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> BROWN_TERRACOTTA_CORNER_PILLAR = BLOCKS.register("brown_terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> TERRACOTTA_CORNER_PILLAR = BLOCKS.register("terracotta_corner_pillar", () ->
			new Block(Block.Settings.copy(TERRACOTTA)));


	public static final RegistrySupplier<Block> CHISELED_RED_TERRACOTTA = BLOCKS.register("chiseled_red_terracotta", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> CHISELED_ORANGE_TERRACOTTA = BLOCKS.register("chiseled_orange_terracotta", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CHISELED_YELLOW_TERRACOTTA = BLOCKS.register("chiseled_yellow_terracotta", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> CHISELED_LIME_TERRACOTTA = BLOCKS.register("chiseled_lime_terracotta", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> CHISELED_GREEN_TERRACOTTA = BLOCKS.register("chiseled_green_terracotta", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CHISELED_BLUE_TERRACOTTA = BLOCKS.register("chiseled_blue_terracotta", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CHISELED_CYAN_TERRACOTTA = BLOCKS.register("chiseled_cyan_terracotta", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CHISELED_LIGHT_BLUE_TERRACOTTA = BLOCKS.register("chiseled_light_blue_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CHISELED_PURPLE_TERRACOTTA = BLOCKS.register("chiseled_purple_terracotta", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CHISELED_MAGENTA_TERRACOTTA = BLOCKS.register("chiseled_magenta_terracotta", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> CHISELED_PINK_TERRACOTTA = BLOCKS.register("chiseled_pink_terracotta", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> CHISELED_WHITE_TERRACOTTA = BLOCKS.register("chiseled_white_terracotta", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CHISELED_LIGHT_GRAY_TERRACOTTA = BLOCKS.register("chiseled_light_gray_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> CHISELED_GRAY_TERRACOTTA = BLOCKS.register("chiseled_gray_terracotta", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> CHISELED_BLACK_TERRACOTTA = BLOCKS.register("chiseled_black_terracotta", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> CHISELED_BROWN_TERRACOTTA = BLOCKS.register("chiseled_brown_terracotta", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CHISELED_TERRACOTTA = BLOCKS.register("chiseled_terracotta", () ->
			new Block(Block.Settings.copy(TERRACOTTA)));

	public static final RegistrySupplier<Block> CARVED_RED_TERRACOTTA = BLOCKS.register("carved_red_terracotta", () ->
			new Block(Block.Settings.copy(RED_TERRACOTTA)));
	public static final RegistrySupplier<Block> CARVED_ORANGE_TERRACOTTA = BLOCKS.register("carved_orange_terracotta", () ->
			new Block(Block.Settings.copy(ORANGE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CARVED_YELLOW_TERRACOTTA = BLOCKS.register("carved_yellow_terracotta", () ->
			new Block(Block.Settings.copy(YELLOW_TERRACOTTA)));
	public static final RegistrySupplier<Block> CARVED_LIME_TERRACOTTA = BLOCKS.register("carved_lime_terracotta", () ->
			new Block(Block.Settings.copy(LIME_TERRACOTTA)));
	public static final RegistrySupplier<Block> CARVED_GREEN_TERRACOTTA = BLOCKS.register("carved_green_terracotta", () ->
			new Block(Block.Settings.copy(GREEN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CARVED_BLUE_TERRACOTTA = BLOCKS.register("carved_blue_terracotta", () ->
			new Block(Block.Settings.copy(BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CARVED_CYAN_TERRACOTTA = BLOCKS.register("carved_cyan_terracotta", () ->
			new Block(Block.Settings.copy(CYAN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CARVED_LIGHT_BLUE_TERRACOTTA = BLOCKS.register("carved_light_blue_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CARVED_PURPLE_TERRACOTTA = BLOCKS.register("carved_purple_terracotta", () ->
			new Block(Block.Settings.copy(PURPLE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CARVED_MAGENTA_TERRACOTTA = BLOCKS.register("carved_magenta_terracotta", () ->
			new Block(Block.Settings.copy(MAGENTA_TERRACOTTA)));
	public static final RegistrySupplier<Block> CARVED_PINK_TERRACOTTA = BLOCKS.register("carved_pink_terracotta", () ->
			new Block(Block.Settings.copy(PINK_TERRACOTTA)));
	public static final RegistrySupplier<Block> CARVED_WHITE_TERRACOTTA = BLOCKS.register("carved_white_terracotta", () ->
			new Block(Block.Settings.copy(WHITE_TERRACOTTA)));
	public static final RegistrySupplier<Block> CARVED_LIGHT_GRAY_TERRACOTTA = BLOCKS.register("carved_light_gray_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> CARVED_GRAY_TERRACOTTA = BLOCKS.register("carved_gray_terracotta", () ->
			new Block(Block.Settings.copy(GRAY_TERRACOTTA)));
	public static final RegistrySupplier<Block> CARVED_BLACK_TERRACOTTA = BLOCKS.register("carved_black_terracotta", () ->
			new Block(Block.Settings.copy(BLACK_TERRACOTTA)));
	public static final RegistrySupplier<Block> CARVED_BROWN_TERRACOTTA = BLOCKS.register("carved_brown_terracotta", () ->
			new Block(Block.Settings.copy(BROWN_TERRACOTTA)));
	public static final RegistrySupplier<Block> CARVED_TERRACOTTA = BLOCKS.register("carved_terracotta", () ->
			new Block(Block.Settings.copy(TERRACOTTA)));

	//Glazed Terracotta

	//Polished
	public static final RegistrySupplier<Block> POLISHED_RED_GLAZED_TERRACOTTA = BLOCKS.register("polished_red_glazed_terracotta", () ->
			new Block(Block.Settings.copy(RED_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_ORANGE_GLAZED_TERRACOTTA = BLOCKS.register("polished_orange_glazed_terracotta", () ->
			new Block(Block.Settings.copy(ORANGE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_YELLOW_GLAZED_TERRACOTTA = BLOCKS.register("polished_yellow_glazed_terracotta", () ->
			new Block(Block.Settings.copy(YELLOW_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIME_GLAZED_TERRACOTTA = BLOCKS.register("polished_lime_glazed_terracotta", () ->
			new Block(Block.Settings.copy(LIME_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GREEN_GLAZED_TERRACOTTA = BLOCKS.register("polished_green_glazed_terracotta", () ->
			new Block(Block.Settings.copy(GREEN_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLUE_GLAZED_TERRACOTTA = BLOCKS.register("polished_blue_glazed_terracotta", () ->
			new Block(Block.Settings.copy(BLUE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_CYAN_GLAZED_TERRACOTTA = BLOCKS.register("polished_cyan_glazed_terracotta", () ->
			new Block(Block.Settings.copy(CYAN_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA = BLOCKS.register("polished_light_blue_glazed_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PURPLE_GLAZED_TERRACOTTA = BLOCKS.register("polished_purple_glazed_terracotta", () ->
			new Block(Block.Settings.copy(PURPLE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_MAGENTA_GLAZED_TERRACOTTA = BLOCKS.register("polished_magenta_glazed_terracotta", () ->
			new Block(Block.Settings.copy(MAGENTA_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PINK_GLAZED_TERRACOTTA = BLOCKS.register("polished_pink_glazed_terracotta", () ->
			new Block(Block.Settings.copy(PINK_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_WHITE_GLAZED_TERRACOTTA = BLOCKS.register("polished_white_glazed_terracotta", () ->
			new Block(Block.Settings.copy(WHITE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA = BLOCKS.register("polished_light_gray_glazed_terracotta", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GRAY_GLAZED_TERRACOTTA = BLOCKS.register("polished_gray_glazed_terracotta", () ->
			new Block(Block.Settings.copy(GRAY_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLACK_GLAZED_TERRACOTTA = BLOCKS.register("polished_black_glazed_terracotta", () ->
			new Block(Block.Settings.copy(BLACK_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BROWN_GLAZED_TERRACOTTA = BLOCKS.register("polished_brown_glazed_terracotta", () ->
			new Block(Block.Settings.copy(BROWN_GLAZED_TERRACOTTA)));
	// Slab
	public static final RegistrySupplier<Block> POLISHED_RED_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_red_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_ORANGE_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_orange_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_YELLOW_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_yellow_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIME_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_lime_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GREEN_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_green_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLUE_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_blue_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_CYAN_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_cyan_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_light_blue_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PURPLE_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_purple_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_MAGENTA_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_magenta_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PINK_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_pink_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_WHITE_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_white_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_light_gray_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GRAY_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_gray_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLACK_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_black_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BROWN_GLAZED_TERRACOTTA_SLAB = BLOCKS.register("polished_brown_glazed_terracotta_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_GLAZED_TERRACOTTA)));
	// Stairs
	public static final RegistrySupplier<Block> POLISHED_RED_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_red_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(RED_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(RED_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_ORANGE_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_orange_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(ORANGE_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(ORANGE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_YELLOW_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_yellow_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(YELLOW_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(YELLOW_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIME_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_lime_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(LIME_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIME_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GREEN_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_green_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(GREEN_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(GREEN_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLUE_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_blue_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(BLUE_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLUE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_CYAN_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_cyan_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(CYAN_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(CYAN_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_light_blue_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PURPLE_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_purple_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(PURPLE_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(PURPLE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_MAGENTA_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_magenta_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(MAGENTA_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(MAGENTA_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PINK_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_pink_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(PINK_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(PINK_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_WHITE_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_white_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(WHITE_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(WHITE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_light_gray_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GRAY_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_gray_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(GRAY_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(GRAY_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLACK_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_black_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(BLACK_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(BLACK_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BROWN_GLAZED_TERRACOTTA_STAIRS = BLOCKS.register("polished_brown_glazed_terracotta_stairs", () ->
			new CPlusStairBlock(BROWN_GLAZED_TERRACOTTA.getDefaultState(), Block.Settings.copy(BROWN_GLAZED_TERRACOTTA)));
	// Wall
	public static final RegistrySupplier<Block> POLISHED_RED_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_red_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(RED_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_ORANGE_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_orange_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_YELLOW_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_yellow_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIME_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_lime_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GREEN_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_green_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLUE_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_blue_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_CYAN_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_cyan_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_light_blue_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PURPLE_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_purple_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_MAGENTA_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_magenta_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PINK_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_pink_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_WHITE_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_white_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_light_gray_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GRAY_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_gray_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLACK_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_black_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BROWN_GLAZED_TERRACOTTA_WALL = BLOCKS.register("polished_brown_glazed_terracotta_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_GLAZED_TERRACOTTA)));
	// Gates
	public static final RegistrySupplier<Block> POLISHED_RED_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_red_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_ORANGE_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_orange_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_YELLOW_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_yellow_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIME_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_lime_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GREEN_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_green_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLUE_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_blue_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_CYAN_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_cyan_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_BLUE_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_light_blue_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PURPLE_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_purple_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_MAGENTA_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_magenta_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_PINK_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_pink_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_WHITE_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_white_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_GRAY_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_light_gray_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_GRAY_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_gray_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BLACK_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_black_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_GLAZED_TERRACOTTA)));
	public static final RegistrySupplier<Block> POLISHED_BROWN_GLAZED_TERRACOTTA_GATE = BLOCKS.register("polished_brown_glazed_terracotta_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_GLAZED_TERRACOTTA)));

	// Concrete
	public static final RegistrySupplier<Block> RED_CONCRETE_SLAB = BLOCKS.register("red_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> ORANGE_CONCRETE_SLAB = BLOCKS.register("orange_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> YELLOW_CONCRETE_SLAB = BLOCKS.register("yellow_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> LIME_CONCRETE_SLAB = BLOCKS.register("lime_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> GREEN_CONCRETE_SLAB = BLOCKS.register("green_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> BLUE_CONCRETE_SLAB = BLOCKS.register("blue_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CYAN_CONCRETE_SLAB = BLOCKS.register("cyan_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_SLAB = BLOCKS.register("light_blue_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> PURPLE_CONCRETE_SLAB = BLOCKS.register("purple_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> MAGENTA_CONCRETE_SLAB = BLOCKS.register("magenta_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> PINK_CONCRETE_SLAB = BLOCKS.register("pink_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> WHITE_CONCRETE_SLAB = BLOCKS.register("white_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_SLAB = BLOCKS.register("light_gray_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> GRAY_CONCRETE_SLAB = BLOCKS.register("gray_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> BLACK_CONCRETE_SLAB = BLOCKS.register("black_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> BROWN_CONCRETE_SLAB = BLOCKS.register("brown_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_CONCRETE)));

	// Concrete Stairs
	public static final RegistrySupplier<Block> RED_CONCRETE_STAIRS = BLOCKS.register("red_concrete_stairs", () ->
			new CPlusStairBlock(RED_CONCRETE.getDefaultState(), Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> ORANGE_CONCRETE_STAIRS = BLOCKS.register("orange_concrete_stairs", () ->
			new CPlusStairBlock(ORANGE_CONCRETE.getDefaultState(), Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> YELLOW_CONCRETE_STAIRS = BLOCKS.register("yellow_concrete_stairs", () ->
			new CPlusStairBlock(YELLOW_CONCRETE.getDefaultState(), Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> LIME_CONCRETE_STAIRS = BLOCKS.register("lime_concrete_stairs", () ->
			new CPlusStairBlock(LIME_CONCRETE.getDefaultState(), Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> GREEN_CONCRETE_STAIRS = BLOCKS.register("green_concrete_stairs", () ->
			new CPlusStairBlock(GREEN_CONCRETE.getDefaultState(), Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> BLUE_CONCRETE_STAIRS = BLOCKS.register("blue_concrete_stairs", () ->
			new CPlusStairBlock(BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CYAN_CONCRETE_STAIRS = BLOCKS.register("cyan_concrete_stairs", () ->
			new CPlusStairBlock(CYAN_CONCRETE.getDefaultState(), Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_STAIRS = BLOCKS.register("light_blue_concrete_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> PURPLE_CONCRETE_STAIRS = BLOCKS.register("purple_concrete_stairs", () ->
			new CPlusStairBlock(PURPLE_CONCRETE.getDefaultState(), Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> MAGENTA_CONCRETE_STAIRS = BLOCKS.register("magenta_concrete_stairs", () ->
			new CPlusStairBlock(MAGENTA_CONCRETE.getDefaultState(), Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> PINK_CONCRETE_STAIRS = BLOCKS.register("pink_concrete_stairs", () ->
			new CPlusStairBlock(PINK_CONCRETE.getDefaultState(), Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> WHITE_CONCRETE_STAIRS = BLOCKS.register("white_concrete_stairs", () ->
			new CPlusStairBlock(WHITE_CONCRETE.getDefaultState(), Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_STAIRS = BLOCKS.register("light_gray_concrete_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> GRAY_CONCRETE_STAIRS = BLOCKS.register("gray_concrete_stairs", () ->
			new CPlusStairBlock(GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> BLACK_CONCRETE_STAIRS = BLOCKS.register("black_concrete_stairs", () ->
			new CPlusStairBlock(BLACK_CONCRETE.getDefaultState(), Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> BROWN_CONCRETE_STAIRS = BLOCKS.register("brown_concrete_stairs", () ->
			new CPlusStairBlock(BROWN_CONCRETE.getDefaultState(), Block.Settings.copy(BROWN_CONCRETE)));

	// Terracotta Wall
	public static final RegistrySupplier<Block> RED_CONCRETE_WALL = BLOCKS.register("red_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> ORANGE_CONCRETE_WALL = BLOCKS.register("orange_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> YELLOW_CONCRETE_WALL = BLOCKS.register("yellow_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> LIME_CONCRETE_WALL = BLOCKS.register("lime_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> GREEN_CONCRETE_WALL = BLOCKS.register("green_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> BLUE_CONCRETE_WALL = BLOCKS.register("blue_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CYAN_CONCRETE_WALL = BLOCKS.register("cyan_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_WALL = BLOCKS.register("light_blue_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> PURPLE_CONCRETE_WALL = BLOCKS.register("purple_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> MAGENTA_CONCRETE_WALL = BLOCKS.register("magenta_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> PINK_CONCRETE_WALL = BLOCKS.register("pink_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> WHITE_CONCRETE_WALL = BLOCKS.register("white_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_WALL = BLOCKS.register("light_gray_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> GRAY_CONCRETE_WALL = BLOCKS.register("gray_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> BLACK_CONCRETE_WALL = BLOCKS.register("black_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> BROWN_CONCRETE_WALL = BLOCKS.register("brown_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_CONCRETE)));

	// Terracotta Gates
	public static final RegistrySupplier<Block> RED_CONCRETE_GATE = BLOCKS.register("red_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> ORANGE_CONCRETE_GATE = BLOCKS.register("orange_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> YELLOW_CONCRETE_GATE = BLOCKS.register("yellow_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> LIME_CONCRETE_GATE = BLOCKS.register("lime_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> GREEN_CONCRETE_GATE = BLOCKS.register("green_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> BLUE_CONCRETE_GATE = BLOCKS.register("blue_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CYAN_CONCRETE_GATE = BLOCKS.register("cyan_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_GATE = BLOCKS.register("light_blue_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> PURPLE_CONCRETE_GATE = BLOCKS.register("purple_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> MAGENTA_CONCRETE_GATE = BLOCKS.register("magenta_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> PINK_CONCRETE_GATE = BLOCKS.register("pink_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> WHITE_CONCRETE_GATE = BLOCKS.register("white_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_GATE = BLOCKS.register("light_gray_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> GRAY_CONCRETE_GATE = BLOCKS.register("gray_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> BLACK_CONCRETE_GATE = BLOCKS.register("black_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> BROWN_CONCRETE_GATE = BLOCKS.register("brown_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_CONCRETE)));

	public static final RegistrySupplier<Block> SMOOTH_RED_CONCRETE = BLOCKS.register("smooth_red_concrete", () ->
			new Block(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_ORANGE_CONCRETE = BLOCKS.register("smooth_orange_concrete", () ->
			new Block(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_YELLOW_CONCRETE = BLOCKS.register("smooth_yellow_concrete", () ->
			new Block(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_LIME_CONCRETE = BLOCKS.register("smooth_lime_concrete", () ->
			new Block(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_GREEN_CONCRETE = BLOCKS.register("smooth_green_concrete", () ->
			new Block(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_BLUE_CONCRETE = BLOCKS.register("smooth_blue_concrete", () ->
			new Block(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_CYAN_CONCRETE = BLOCKS.register("smooth_cyan_concrete", () ->
			new Block(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_BLUE_CONCRETE = BLOCKS.register("smooth_light_blue_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_PURPLE_CONCRETE = BLOCKS.register("smooth_purple_concrete", () ->
			new Block(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_MAGENTA_CONCRETE = BLOCKS.register("smooth_magenta_concrete", () ->
			new Block(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_PINK_CONCRETE = BLOCKS.register("smooth_pink_concrete", () ->
			new Block(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_WHITE_CONCRETE = BLOCKS.register("smooth_white_concrete", () ->
			new Block(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_GRAY_CONCRETE = BLOCKS.register("smooth_light_gray_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_GRAY_CONCRETE = BLOCKS.register("smooth_gray_concrete", () ->
			new Block(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_BLACK_CONCRETE = BLOCKS.register("smooth_black_concrete", () ->
			new Block(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_BROWN_CONCRETE = BLOCKS.register("smooth_brown_concrete", () ->
			new Block(Block.Settings.copy(BROWN_CONCRETE)));

	public static final RegistrySupplier<Block> SMOOTH_RED_CONCRETE_SLAB = BLOCKS.register("smooth_red_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_ORANGE_CONCRETE_SLAB = BLOCKS.register("smooth_orange_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_YELLOW_CONCRETE_SLAB = BLOCKS.register("smooth_yellow_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_LIME_CONCRETE_SLAB = BLOCKS.register("smooth_lime_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_GREEN_CONCRETE_SLAB = BLOCKS.register("smooth_green_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_BLUE_CONCRETE_SLAB = BLOCKS.register("smooth_blue_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_CYAN_CONCRETE_SLAB = BLOCKS.register("smooth_cyan_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_BLUE_CONCRETE_SLAB = BLOCKS.register("smooth_light_blue_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_PURPLE_CONCRETE_SLAB = BLOCKS.register("smooth_purple_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_MAGENTA_CONCRETE_SLAB = BLOCKS.register("smooth_magenta_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_PINK_CONCRETE_SLAB = BLOCKS.register("smooth_pink_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_WHITE_CONCRETE_SLAB = BLOCKS.register("smooth_white_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_GRAY_CONCRETE_SLAB = BLOCKS.register("smooth_light_gray_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_GRAY_CONCRETE_SLAB = BLOCKS.register("smooth_gray_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_BLACK_CONCRETE_SLAB = BLOCKS.register("smooth_black_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_BROWN_CONCRETE_SLAB = BLOCKS.register("smooth_brown_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_CONCRETE)));

	// Terracotta Stairs
	public static final RegistrySupplier<Block> SMOOTH_RED_CONCRETE_STAIRS = BLOCKS.register("smooth_red_concrete_stairs", () ->
			new CPlusStairBlock(RED_CONCRETE.getDefaultState(), Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_ORANGE_CONCRETE_STAIRS = BLOCKS.register("smooth_orange_concrete_stairs", () ->
			new CPlusStairBlock(ORANGE_CONCRETE.getDefaultState(), Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_YELLOW_CONCRETE_STAIRS = BLOCKS.register("smooth_yellow_concrete_stairs", () ->
			new CPlusStairBlock(YELLOW_CONCRETE.getDefaultState(), Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_LIME_CONCRETE_STAIRS = BLOCKS.register("smooth_lime_concrete_stairs", () ->
			new CPlusStairBlock(LIME_CONCRETE.getDefaultState(), Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_GREEN_CONCRETE_STAIRS = BLOCKS.register("smooth_green_concrete_stairs", () ->
			new CPlusStairBlock(GREEN_CONCRETE.getDefaultState(), Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_BLUE_CONCRETE_STAIRS = BLOCKS.register("smooth_blue_concrete_stairs", () ->
			new CPlusStairBlock(BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_CYAN_CONCRETE_STAIRS = BLOCKS.register("smooth_cyan_concrete_stairs", () ->
			new CPlusStairBlock(CYAN_CONCRETE.getDefaultState(), Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_BLUE_CONCRETE_STAIRS = BLOCKS.register("smooth_light_blue_concrete_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_PURPLE_CONCRETE_STAIRS = BLOCKS.register("smooth_purple_concrete_stairs", () ->
			new CPlusStairBlock(PURPLE_CONCRETE.getDefaultState(), Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_MAGENTA_CONCRETE_STAIRS = BLOCKS.register("smooth_magenta_concrete_stairs", () ->
			new CPlusStairBlock(MAGENTA_CONCRETE.getDefaultState(), Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_PINK_CONCRETE_STAIRS = BLOCKS.register("smooth_pink_concrete_stairs", () ->
			new CPlusStairBlock(PINK_CONCRETE.getDefaultState(), Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_WHITE_CONCRETE_STAIRS = BLOCKS.register("smooth_white_concrete_stairs", () ->
			new CPlusStairBlock(WHITE_CONCRETE.getDefaultState(), Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_GRAY_CONCRETE_STAIRS = BLOCKS.register("smooth_light_gray_concrete_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_GRAY_CONCRETE_STAIRS = BLOCKS.register("smooth_gray_concrete_stairs", () ->
			new CPlusStairBlock(GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_BLACK_CONCRETE_STAIRS = BLOCKS.register("smooth_black_concrete_stairs", () ->
			new CPlusStairBlock(BLACK_CONCRETE.getDefaultState(), Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_BROWN_CONCRETE_STAIRS = BLOCKS.register("smooth_brown_concrete_stairs", () ->
			new CPlusStairBlock(BROWN_CONCRETE.getDefaultState(), Block.Settings.copy(BROWN_CONCRETE)));

	// Terracotta Wall
	public static final RegistrySupplier<Block> SMOOTH_RED_CONCRETE_WALL = BLOCKS.register("smooth_red_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_ORANGE_CONCRETE_WALL = BLOCKS.register("smooth_orange_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_YELLOW_CONCRETE_WALL = BLOCKS.register("smooth_yellow_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_LIME_CONCRETE_WALL = BLOCKS.register("smooth_lime_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_GREEN_CONCRETE_WALL = BLOCKS.register("smooth_green_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_BLUE_CONCRETE_WALL = BLOCKS.register("smooth_blue_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_CYAN_CONCRETE_WALL = BLOCKS.register("smooth_cyan_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_BLUE_CONCRETE_WALL = BLOCKS.register("smooth_light_blue_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_PURPLE_CONCRETE_WALL = BLOCKS.register("smooth_purple_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_MAGENTA_CONCRETE_WALL = BLOCKS.register("smooth_magenta_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_PINK_CONCRETE_WALL = BLOCKS.register("smooth_pink_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_WHITE_CONCRETE_WALL = BLOCKS.register("smooth_white_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_GRAY_CONCRETE_WALL = BLOCKS.register("smooth_light_gray_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_GRAY_CONCRETE_WALL = BLOCKS.register("smooth_gray_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_BLACK_CONCRETE_WALL = BLOCKS.register("smooth_black_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_BROWN_CONCRETE_WALL = BLOCKS.register("smooth_brown_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_CONCRETE)));

	// Terracotta Gates
	public static final RegistrySupplier<Block> SMOOTH_RED_CONCRETE_GATE = BLOCKS.register("smooth_red_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_ORANGE_CONCRETE_GATE = BLOCKS.register("smooth_orange_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_YELLOW_CONCRETE_GATE = BLOCKS.register("smooth_yellow_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_LIME_CONCRETE_GATE = BLOCKS.register("smooth_lime_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_GREEN_CONCRETE_GATE = BLOCKS.register("smooth_green_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_BLUE_CONCRETE_GATE = BLOCKS.register("smooth_blue_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_CYAN_CONCRETE_GATE = BLOCKS.register("smooth_cyan_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_BLUE_CONCRETE_GATE = BLOCKS.register("smooth_light_blue_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_PURPLE_CONCRETE_GATE = BLOCKS.register("smooth_purple_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_MAGENTA_CONCRETE_GATE = BLOCKS.register("smooth_magenta_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_PINK_CONCRETE_GATE = BLOCKS.register("smooth_pink_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_WHITE_CONCRETE_GATE = BLOCKS.register("smooth_white_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_LIGHT_GRAY_CONCRETE_GATE = BLOCKS.register("smooth_light_gray_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_GRAY_CONCRETE_GATE = BLOCKS.register("smooth_gray_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_BLACK_CONCRETE_GATE = BLOCKS.register("smooth_black_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> SMOOTH_BROWN_CONCRETE_GATE = BLOCKS.register("smooth_brown_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_CONCRETE)));

	public static final RegistrySupplier<Block> POLISHED_RED_CONCRETE = BLOCKS.register("polished_red_concrete", () ->
			new Block(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_ORANGE_CONCRETE = BLOCKS.register("polished_orange_concrete", () ->
			new Block(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_YELLOW_CONCRETE = BLOCKS.register("polished_yellow_concrete", () ->
			new Block(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_LIME_CONCRETE = BLOCKS.register("polished_lime_concrete", () ->
			new Block(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_GREEN_CONCRETE = BLOCKS.register("polished_green_concrete", () ->
			new Block(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_BLUE_CONCRETE = BLOCKS.register("polished_blue_concrete", () ->
			new Block(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_CYAN_CONCRETE = BLOCKS.register("polished_cyan_concrete", () ->
			new Block(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_BLUE_CONCRETE = BLOCKS.register("polished_light_blue_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_PURPLE_CONCRETE = BLOCKS.register("polished_purple_concrete", () ->
			new Block(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_MAGENTA_CONCRETE = BLOCKS.register("polished_magenta_concrete", () ->
			new Block(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_PINK_CONCRETE = BLOCKS.register("polished_pink_concrete", () ->
			new Block(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_WHITE_CONCRETE = BLOCKS.register("polished_white_concrete", () ->
			new Block(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_GRAY_CONCRETE = BLOCKS.register("polished_light_gray_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_GRAY_CONCRETE = BLOCKS.register("polished_gray_concrete", () ->
			new Block(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_BLACK_CONCRETE = BLOCKS.register("polished_black_concrete", () ->
			new Block(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_BROWN_CONCRETE = BLOCKS.register("polished_brown_concrete", () ->
			new Block(Block.Settings.copy(BROWN_CONCRETE)));

	public static final RegistrySupplier<Block> POLISHED_RED_CONCRETE_SLAB = BLOCKS.register("polished_red_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_ORANGE_CONCRETE_SLAB = BLOCKS.register("polished_orange_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_YELLOW_CONCRETE_SLAB = BLOCKS.register("polished_yellow_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_LIME_CONCRETE_SLAB = BLOCKS.register("polished_lime_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_GREEN_CONCRETE_SLAB = BLOCKS.register("polished_green_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_BLUE_CONCRETE_SLAB = BLOCKS.register("polished_blue_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_CYAN_CONCRETE_SLAB = BLOCKS.register("polished_cyan_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_BLUE_CONCRETE_SLAB = BLOCKS.register("polished_light_blue_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_PURPLE_CONCRETE_SLAB = BLOCKS.register("polished_purple_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_MAGENTA_CONCRETE_SLAB = BLOCKS.register("polished_magenta_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_PINK_CONCRETE_SLAB = BLOCKS.register("polished_pink_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_WHITE_CONCRETE_SLAB = BLOCKS.register("polished_white_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_GRAY_CONCRETE_SLAB = BLOCKS.register("polished_light_gray_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_GRAY_CONCRETE_SLAB = BLOCKS.register("polished_gray_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_BLACK_CONCRETE_SLAB = BLOCKS.register("polished_black_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_BROWN_CONCRETE_SLAB = BLOCKS.register("polished_brown_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_CONCRETE)));

	// Terracotta Stairs
	public static final RegistrySupplier<Block> POLISHED_RED_CONCRETE_STAIRS = BLOCKS.register("polished_red_concrete_stairs", () ->
			new CPlusStairBlock(RED_CONCRETE.getDefaultState(), Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_ORANGE_CONCRETE_STAIRS = BLOCKS.register("polished_orange_concrete_stairs", () ->
			new CPlusStairBlock(ORANGE_CONCRETE.getDefaultState(), Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_YELLOW_CONCRETE_STAIRS = BLOCKS.register("polished_yellow_concrete_stairs", () ->
			new CPlusStairBlock(YELLOW_CONCRETE.getDefaultState(), Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_LIME_CONCRETE_STAIRS = BLOCKS.register("polished_lime_concrete_stairs", () ->
			new CPlusStairBlock(LIME_CONCRETE.getDefaultState(), Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_GREEN_CONCRETE_STAIRS = BLOCKS.register("polished_green_concrete_stairs", () ->
			new CPlusStairBlock(GREEN_CONCRETE.getDefaultState(), Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_BLUE_CONCRETE_STAIRS = BLOCKS.register("polished_blue_concrete_stairs", () ->
			new CPlusStairBlock(BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_CYAN_CONCRETE_STAIRS = BLOCKS.register("polished_cyan_concrete_stairs", () ->
			new CPlusStairBlock(CYAN_CONCRETE.getDefaultState(), Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_BLUE_CONCRETE_STAIRS = BLOCKS.register("polished_light_blue_concrete_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_PURPLE_CONCRETE_STAIRS = BLOCKS.register("polished_purple_concrete_stairs", () ->
			new CPlusStairBlock(PURPLE_CONCRETE.getDefaultState(), Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_MAGENTA_CONCRETE_STAIRS = BLOCKS.register("polished_magenta_concrete_stairs", () ->
			new CPlusStairBlock(MAGENTA_CONCRETE.getDefaultState(), Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_PINK_CONCRETE_STAIRS = BLOCKS.register("polished_pink_concrete_stairs", () ->
			new CPlusStairBlock(PINK_CONCRETE.getDefaultState(), Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_WHITE_CONCRETE_STAIRS = BLOCKS.register("polished_white_concrete_stairs", () ->
			new CPlusStairBlock(WHITE_CONCRETE.getDefaultState(), Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_GRAY_CONCRETE_STAIRS = BLOCKS.register("polished_light_gray_concrete_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_GRAY_CONCRETE_STAIRS = BLOCKS.register("polished_gray_concrete_stairs", () ->
			new CPlusStairBlock(GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_BLACK_CONCRETE_STAIRS = BLOCKS.register("polished_black_concrete_stairs", () ->
			new CPlusStairBlock(BLACK_CONCRETE.getDefaultState(), Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_BROWN_CONCRETE_STAIRS = BLOCKS.register("polished_brown_concrete_stairs", () ->
			new CPlusStairBlock(BROWN_CONCRETE.getDefaultState(), Block.Settings.copy(BROWN_CONCRETE)));

	// Terracotta Wall
	public static final RegistrySupplier<Block> POLISHED_RED_CONCRETE_WALL = BLOCKS.register("polished_red_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_ORANGE_CONCRETE_WALL = BLOCKS.register("polished_orange_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_YELLOW_CONCRETE_WALL = BLOCKS.register("polished_yellow_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_LIME_CONCRETE_WALL = BLOCKS.register("polished_lime_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_GREEN_CONCRETE_WALL = BLOCKS.register("polished_green_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_BLUE_CONCRETE_WALL = BLOCKS.register("polished_blue_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_CYAN_CONCRETE_WALL = BLOCKS.register("polished_cyan_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_BLUE_CONCRETE_WALL = BLOCKS.register("polished_light_blue_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_PURPLE_CONCRETE_WALL = BLOCKS.register("polished_purple_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_MAGENTA_CONCRETE_WALL = BLOCKS.register("polished_magenta_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_PINK_CONCRETE_WALL = BLOCKS.register("polished_pink_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_WHITE_CONCRETE_WALL = BLOCKS.register("polished_white_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_GRAY_CONCRETE_WALL = BLOCKS.register("polished_light_gray_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_GRAY_CONCRETE_WALL = BLOCKS.register("polished_gray_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_BLACK_CONCRETE_WALL = BLOCKS.register("polished_black_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_BROWN_CONCRETE_WALL = BLOCKS.register("polished_brown_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_CONCRETE)));

	// Terracotta Gates
	public static final RegistrySupplier<Block> POLISHED_RED_CONCRETE_GATE = BLOCKS.register("polished_red_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_ORANGE_CONCRETE_GATE = BLOCKS.register("polished_orange_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_YELLOW_CONCRETE_GATE = BLOCKS.register("polished_yellow_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_LIME_CONCRETE_GATE = BLOCKS.register("polished_lime_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_GREEN_CONCRETE_GATE = BLOCKS.register("polished_green_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_BLUE_CONCRETE_GATE = BLOCKS.register("polished_blue_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_CYAN_CONCRETE_GATE = BLOCKS.register("polished_cyan_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_BLUE_CONCRETE_GATE = BLOCKS.register("polished_light_blue_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_PURPLE_CONCRETE_GATE = BLOCKS.register("polished_purple_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_MAGENTA_CONCRETE_GATE = BLOCKS.register("polished_magenta_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_PINK_CONCRETE_GATE = BLOCKS.register("polished_pink_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_WHITE_CONCRETE_GATE = BLOCKS.register("polished_white_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_LIGHT_GRAY_CONCRETE_GATE = BLOCKS.register("polished_light_gray_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_GRAY_CONCRETE_GATE = BLOCKS.register("polished_gray_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_BLACK_CONCRETE_GATE = BLOCKS.register("polished_black_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> POLISHED_BROWN_CONCRETE_GATE = BLOCKS.register("polished_brown_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_CONCRETE)));

	public static final RegistrySupplier<Block> CUT_RED_CONCRETE = BLOCKS.register("cut_red_concrete", () ->
			new Block(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_ORANGE_CONCRETE = BLOCKS.register("cut_orange_concrete", () ->
			new Block(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_YELLOW_CONCRETE = BLOCKS.register("cut_yellow_concrete", () ->
			new Block(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_LIME_CONCRETE = BLOCKS.register("cut_lime_concrete", () ->
			new Block(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_GREEN_CONCRETE = BLOCKS.register("cut_green_concrete", () ->
			new Block(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_BLUE_CONCRETE = BLOCKS.register("cut_blue_concrete", () ->
			new Block(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_CYAN_CONCRETE = BLOCKS.register("cut_cyan_concrete", () ->
			new Block(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_LIGHT_BLUE_CONCRETE = BLOCKS.register("cut_light_blue_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_PURPLE_CONCRETE = BLOCKS.register("cut_purple_concrete", () ->
			new Block(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_MAGENTA_CONCRETE = BLOCKS.register("cut_magenta_concrete", () ->
			new Block(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_PINK_CONCRETE = BLOCKS.register("cut_pink_concrete", () ->
			new Block(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_WHITE_CONCRETE = BLOCKS.register("cut_white_concrete", () ->
			new Block(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_LIGHT_GRAY_CONCRETE = BLOCKS.register("cut_light_gray_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_GRAY_CONCRETE = BLOCKS.register("cut_gray_concrete", () ->
			new Block(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_BLACK_CONCRETE = BLOCKS.register("cut_black_concrete", () ->
			new Block(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_BROWN_CONCRETE = BLOCKS.register("cut_brown_concrete", () ->
			new Block(Block.Settings.copy(BROWN_CONCRETE)));

	public static final RegistrySupplier<Block> CUT_RED_CONCRETE_SLAB = BLOCKS.register("cut_red_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_ORANGE_CONCRETE_SLAB = BLOCKS.register("cut_orange_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_YELLOW_CONCRETE_SLAB = BLOCKS.register("cut_yellow_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_LIME_CONCRETE_SLAB = BLOCKS.register("cut_lime_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_GREEN_CONCRETE_SLAB = BLOCKS.register("cut_green_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_BLUE_CONCRETE_SLAB = BLOCKS.register("cut_blue_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_CYAN_CONCRETE_SLAB = BLOCKS.register("cut_cyan_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_LIGHT_BLUE_CONCRETE_SLAB = BLOCKS.register("cut_light_blue_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_PURPLE_CONCRETE_SLAB = BLOCKS.register("cut_purple_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_MAGENTA_CONCRETE_SLAB = BLOCKS.register("cut_magenta_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_PINK_CONCRETE_SLAB = BLOCKS.register("cut_pink_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_WHITE_CONCRETE_SLAB = BLOCKS.register("cut_white_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_LIGHT_GRAY_CONCRETE_SLAB = BLOCKS.register("cut_light_gray_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_GRAY_CONCRETE_SLAB = BLOCKS.register("cut_gray_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_BLACK_CONCRETE_SLAB = BLOCKS.register("cut_black_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_BROWN_CONCRETE_SLAB = BLOCKS.register("cut_brown_concrete_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_CONCRETE)));

	// Terracotta Stairs
	public static final RegistrySupplier<Block> CUT_RED_CONCRETE_STAIRS = BLOCKS.register("cut_red_concrete_stairs", () ->
			new CPlusStairBlock(RED_CONCRETE.getDefaultState(), Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_ORANGE_CONCRETE_STAIRS = BLOCKS.register("cut_orange_concrete_stairs", () ->
			new CPlusStairBlock(ORANGE_CONCRETE.getDefaultState(), Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_YELLOW_CONCRETE_STAIRS = BLOCKS.register("cut_yellow_concrete_stairs", () ->
			new CPlusStairBlock(YELLOW_CONCRETE.getDefaultState(), Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_LIME_CONCRETE_STAIRS = BLOCKS.register("cut_lime_concrete_stairs", () ->
			new CPlusStairBlock(LIME_CONCRETE.getDefaultState(), Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_GREEN_CONCRETE_STAIRS = BLOCKS.register("cut_green_concrete_stairs", () ->
			new CPlusStairBlock(GREEN_CONCRETE.getDefaultState(), Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_BLUE_CONCRETE_STAIRS = BLOCKS.register("cut_blue_concrete_stairs", () ->
			new CPlusStairBlock(BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_CYAN_CONCRETE_STAIRS = BLOCKS.register("cut_cyan_concrete_stairs", () ->
			new CPlusStairBlock(CYAN_CONCRETE.getDefaultState(), Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_LIGHT_BLUE_CONCRETE_STAIRS = BLOCKS.register("cut_light_blue_concrete_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_PURPLE_CONCRETE_STAIRS = BLOCKS.register("cut_purple_concrete_stairs", () ->
			new CPlusStairBlock(PURPLE_CONCRETE.getDefaultState(), Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_MAGENTA_CONCRETE_STAIRS = BLOCKS.register("cut_magenta_concrete_stairs", () ->
			new CPlusStairBlock(MAGENTA_CONCRETE.getDefaultState(), Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_PINK_CONCRETE_STAIRS = BLOCKS.register("cut_pink_concrete_stairs", () ->
			new CPlusStairBlock(PINK_CONCRETE.getDefaultState(), Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_WHITE_CONCRETE_STAIRS = BLOCKS.register("cut_white_concrete_stairs", () ->
			new CPlusStairBlock(WHITE_CONCRETE.getDefaultState(), Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_LIGHT_GRAY_CONCRETE_STAIRS = BLOCKS.register("cut_light_gray_concrete_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_GRAY_CONCRETE_STAIRS = BLOCKS.register("cut_gray_concrete_stairs", () ->
			new CPlusStairBlock(GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_BLACK_CONCRETE_STAIRS = BLOCKS.register("cut_black_concrete_stairs", () ->
			new CPlusStairBlock(BLACK_CONCRETE.getDefaultState(), Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_BROWN_CONCRETE_STAIRS = BLOCKS.register("cut_brown_concrete_stairs", () ->
			new CPlusStairBlock(BROWN_CONCRETE.getDefaultState(), Block.Settings.copy(BROWN_CONCRETE)));


	// Terracotta Wall
	public static final RegistrySupplier<Block> CUT_RED_CONCRETE_WALL = BLOCKS.register("cut_red_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_ORANGE_CONCRETE_WALL = BLOCKS.register("cut_orange_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_YELLOW_CONCRETE_WALL = BLOCKS.register("cut_yellow_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_LIME_CONCRETE_WALL = BLOCKS.register("cut_lime_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_GREEN_CONCRETE_WALL = BLOCKS.register("cut_green_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_BLUE_CONCRETE_WALL = BLOCKS.register("cut_blue_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_CYAN_CONCRETE_WALL = BLOCKS.register("cut_cyan_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_LIGHT_BLUE_CONCRETE_WALL = BLOCKS.register("cut_light_blue_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_PURPLE_CONCRETE_WALL = BLOCKS.register("cut_purple_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_MAGENTA_CONCRETE_WALL = BLOCKS.register("cut_magenta_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_PINK_CONCRETE_WALL = BLOCKS.register("cut_pink_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_WHITE_CONCRETE_WALL = BLOCKS.register("cut_white_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_LIGHT_GRAY_CONCRETE_WALL = BLOCKS.register("cut_light_gray_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_GRAY_CONCRETE_WALL = BLOCKS.register("cut_gray_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_BLACK_CONCRETE_WALL = BLOCKS.register("cut_black_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_BROWN_CONCRETE_WALL = BLOCKS.register("cut_brown_concrete_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_CONCRETE)));

	// Terracotta Gates
	public static final RegistrySupplier<Block> CUT_RED_CONCRETE_GATE = BLOCKS.register("cut_red_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_ORANGE_CONCRETE_GATE = BLOCKS.register("cut_orange_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_YELLOW_CONCRETE_GATE = BLOCKS.register("cut_yellow_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_LIME_CONCRETE_GATE = BLOCKS.register("cut_lime_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_GREEN_CONCRETE_GATE = BLOCKS.register("cut_green_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_BLUE_CONCRETE_GATE = BLOCKS.register("cut_blue_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_CYAN_CONCRETE_GATE = BLOCKS.register("cut_cyan_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_LIGHT_BLUE_CONCRETE_GATE = BLOCKS.register("cut_light_blue_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_PURPLE_CONCRETE_GATE = BLOCKS.register("cut_purple_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_MAGENTA_CONCRETE_GATE = BLOCKS.register("cut_magenta_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_PINK_CONCRETE_GATE = BLOCKS.register("cut_pink_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_WHITE_CONCRETE_GATE = BLOCKS.register("cut_white_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_LIGHT_GRAY_CONCRETE_GATE = BLOCKS.register("cut_light_gray_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_GRAY_CONCRETE_GATE = BLOCKS.register("cut_gray_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_BLACK_CONCRETE_GATE = BLOCKS.register("cut_black_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> CUT_BROWN_CONCRETE_GATE = BLOCKS.register("cut_brown_concrete_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_CONCRETE)));

	public static final RegistrySupplier<Block> RED_CONCRETE_BRICKS = BLOCKS.register("red_concrete_bricks", () ->
			new Block(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> ORANGE_CONCRETE_BRICKS = BLOCKS.register("orange_concrete_bricks", () ->
			new Block(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> YELLOW_CONCRETE_BRICKS = BLOCKS.register("yellow_concrete_bricks", () ->
			new Block(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> LIME_CONCRETE_BRICKS = BLOCKS.register("lime_concrete_bricks", () ->
			new Block(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> GREEN_CONCRETE_BRICKS = BLOCKS.register("green_concrete_bricks", () ->
			new Block(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> BLUE_CONCRETE_BRICKS = BLOCKS.register("blue_concrete_bricks", () ->
			new Block(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CYAN_CONCRETE_BRICKS = BLOCKS.register("cyan_concrete_bricks", () ->
			new Block(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_BRICKS = BLOCKS.register("light_blue_concrete_bricks", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> PURPLE_CONCRETE_BRICKS = BLOCKS.register("purple_concrete_bricks", () ->
			new Block(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> MAGENTA_CONCRETE_BRICKS = BLOCKS.register("magenta_concrete_bricks", () ->
			new Block(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> PINK_CONCRETE_BRICKS = BLOCKS.register("pink_concrete_bricks", () ->
			new Block(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> WHITE_CONCRETE_BRICKS = BLOCKS.register("white_concrete_bricks", () ->
			new Block(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_BRICKS = BLOCKS.register("light_gray_concrete_bricks", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> GRAY_CONCRETE_BRICKS = BLOCKS.register("gray_concrete_bricks", () ->
			new Block(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> BLACK_CONCRETE_BRICKS = BLOCKS.register("black_concrete_bricks", () ->
			new Block(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> BROWN_CONCRETE_BRICKS = BLOCKS.register("brown_concrete_bricks", () ->
			new Block(Block.Settings.copy(BROWN_CONCRETE)));

	public static final RegistrySupplier<Block> RED_CONCRETE_BRICK_SLAB = BLOCKS.register("red_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> ORANGE_CONCRETE_BRICK_SLAB = BLOCKS.register("orange_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> YELLOW_CONCRETE_BRICK_SLAB = BLOCKS.register("yellow_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> LIME_CONCRETE_BRICK_SLAB = BLOCKS.register("lime_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> GREEN_CONCRETE_BRICK_SLAB = BLOCKS.register("green_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> BLUE_CONCRETE_BRICK_SLAB = BLOCKS.register("blue_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CYAN_CONCRETE_BRICK_SLAB = BLOCKS.register("cyan_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_BRICK_SLAB = BLOCKS.register("light_blue_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> PURPLE_CONCRETE_BRICK_SLAB = BLOCKS.register("purple_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> MAGENTA_CONCRETE_BRICK_SLAB = BLOCKS.register("magenta_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> PINK_CONCRETE_BRICK_SLAB = BLOCKS.register("pink_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> WHITE_CONCRETE_BRICK_SLAB = BLOCKS.register("white_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_BRICK_SLAB = BLOCKS.register("light_gray_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> GRAY_CONCRETE_BRICK_SLAB = BLOCKS.register("gray_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> BLACK_CONCRETE_BRICK_SLAB = BLOCKS.register("black_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> BROWN_CONCRETE_BRICK_SLAB = BLOCKS.register("brown_concrete_brick_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_CONCRETE)));


	// Terracotta Stairs
	public static final RegistrySupplier<Block> RED_CONCRETE_BRICK_STAIRS = BLOCKS.register("red_concrete_brick_stairs", () ->
			new CPlusStairBlock(RED_CONCRETE.getDefaultState(), Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> ORANGE_CONCRETE_BRICK_STAIRS = BLOCKS.register("orange_concrete_brick_stairs", () ->
			new CPlusStairBlock(ORANGE_CONCRETE.getDefaultState(), Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> YELLOW_CONCRETE_BRICK_STAIRS = BLOCKS.register("yellow_concrete_brick_stairs", () ->
			new CPlusStairBlock(YELLOW_CONCRETE.getDefaultState(), Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> LIME_CONCRETE_BRICK_STAIRS = BLOCKS.register("lime_concrete_brick_stairs", () ->
			new CPlusStairBlock(LIME_CONCRETE.getDefaultState(), Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> GREEN_CONCRETE_BRICK_STAIRS = BLOCKS.register("green_concrete_brick_stairs", () ->
			new CPlusStairBlock(GREEN_CONCRETE.getDefaultState(), Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> BLUE_CONCRETE_BRICK_STAIRS = BLOCKS.register("blue_concrete_brick_stairs", () ->
			new CPlusStairBlock(BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CYAN_CONCRETE_BRICK_STAIRS = BLOCKS.register("cyan_concrete_brick_stairs", () ->
			new CPlusStairBlock(CYAN_CONCRETE.getDefaultState(), Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_BRICK_STAIRS = BLOCKS.register("light_blue_concrete_brick_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> PURPLE_CONCRETE_BRICK_STAIRS = BLOCKS.register("purple_concrete_brick_stairs", () ->
			new CPlusStairBlock(PURPLE_CONCRETE.getDefaultState(), Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> MAGENTA_CONCRETE_BRICK_STAIRS = BLOCKS.register("magenta_concrete_brick_stairs", () ->
			new CPlusStairBlock(MAGENTA_CONCRETE.getDefaultState(), Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> PINK_CONCRETE_BRICK_STAIRS = BLOCKS.register("pink_concrete_brick_stairs", () ->
			new CPlusStairBlock(PINK_CONCRETE.getDefaultState(), Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> WHITE_CONCRETE_BRICK_STAIRS = BLOCKS.register("white_concrete_brick_stairs", () ->
			new CPlusStairBlock(WHITE_CONCRETE.getDefaultState(), Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_BRICK_STAIRS = BLOCKS.register("light_gray_concrete_brick_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> GRAY_CONCRETE_BRICK_STAIRS = BLOCKS.register("gray_concrete_brick_stairs", () ->
			new CPlusStairBlock(GRAY_CONCRETE.getDefaultState(), Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> BLACK_CONCRETE_BRICK_STAIRS = BLOCKS.register("black_concrete_brick_stairs", () ->
			new CPlusStairBlock(BLACK_CONCRETE.getDefaultState(), Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> BROWN_CONCRETE_BRICK_STAIRS = BLOCKS.register("brown_concrete_brick_stairs", () ->
			new CPlusStairBlock(BROWN_CONCRETE.getDefaultState(), Block.Settings.copy(BROWN_CONCRETE)));

	// Terracotta Wall
	public static final RegistrySupplier<Block> RED_CONCRETE_BRICK_WALL = BLOCKS.register("red_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> ORANGE_CONCRETE_BRICK_WALL = BLOCKS.register("orange_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> YELLOW_CONCRETE_BRICK_WALL = BLOCKS.register("yellow_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> LIME_CONCRETE_BRICK_WALL = BLOCKS.register("lime_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> GREEN_CONCRETE_BRICK_WALL = BLOCKS.register("green_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> BLUE_CONCRETE_BRICK_WALL = BLOCKS.register("blue_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CYAN_CONCRETE_BRICK_WALL = BLOCKS.register("cyan_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_BRICK_WALL = BLOCKS.register("light_blue_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> PURPLE_CONCRETE_BRICK_WALL = BLOCKS.register("purple_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> MAGENTA_CONCRETE_BRICK_WALL = BLOCKS.register("magenta_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> PINK_CONCRETE_BRICK_WALL = BLOCKS.register("pink_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> WHITE_CONCRETE_BRICK_WALL = BLOCKS.register("white_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_BRICK_WALL = BLOCKS.register("light_gray_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> GRAY_CONCRETE_BRICK_WALL = BLOCKS.register("gray_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> BLACK_CONCRETE_BRICK_WALL = BLOCKS.register("black_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> BROWN_CONCRETE_BRICK_WALL = BLOCKS.register("brown_concrete_brick_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_CONCRETE)));

	// Terracotta Gates
	public static final RegistrySupplier<Block> RED_CONCRETE_BRICK_GATE = BLOCKS.register("red_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> ORANGE_CONCRETE_BRICK_GATE = BLOCKS.register("orange_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> YELLOW_CONCRETE_BRICK_GATE = BLOCKS.register("yellow_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> LIME_CONCRETE_BRICK_GATE = BLOCKS.register("lime_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> GREEN_CONCRETE_BRICK_GATE = BLOCKS.register("green_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> BLUE_CONCRETE_BRICK_GATE = BLOCKS.register("blue_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CYAN_CONCRETE_BRICK_GATE = BLOCKS.register("cyan_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_BRICK_GATE = BLOCKS.register("light_blue_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> PURPLE_CONCRETE_BRICK_GATE = BLOCKS.register("purple_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> MAGENTA_CONCRETE_BRICK_GATE = BLOCKS.register("magenta_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> PINK_CONCRETE_BRICK_GATE = BLOCKS.register("pink_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> WHITE_CONCRETE_BRICK_GATE = BLOCKS.register("white_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_BRICK_GATE = BLOCKS.register("light_gray_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> GRAY_CONCRETE_BRICK_GATE = BLOCKS.register("gray_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> BLACK_CONCRETE_BRICK_GATE = BLOCKS.register("black_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> BROWN_CONCRETE_BRICK_GATE = BLOCKS.register("brown_concrete_brick_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_CONCRETE)));

	public static final RegistrySupplier<Block> RED_CONCRETE_TILES = BLOCKS.register("red_concrete_tiles", () ->
			new Block(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> ORANGE_CONCRETE_TILES = BLOCKS.register("orange_concrete_tiles", () ->
			new Block(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> YELLOW_CONCRETE_TILES = BLOCKS.register("yellow_concrete_tiles", () ->
			new Block(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> LIME_CONCRETE_TILES = BLOCKS.register("lime_concrete_tiles", () ->
			new Block(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> GREEN_CONCRETE_TILES = BLOCKS.register("green_concrete_tiles", () ->
			new Block(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> BLUE_CONCRETE_TILES = BLOCKS.register("blue_concrete_tiles", () ->
			new Block(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CYAN_CONCRETE_TILES = BLOCKS.register("cyan_concrete_tiles", () ->
			new Block(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_TILES = BLOCKS.register("light_blue_concrete_tiles", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> PURPLE_CONCRETE_TILES = BLOCKS.register("purple_concrete_tiles", () ->
			new Block(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> MAGENTA_CONCRETE_TILES = BLOCKS.register("magenta_concrete_tiles", () ->
			new Block(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> PINK_CONCRETE_TILES = BLOCKS.register("pink_concrete_tiles", () ->
			new Block(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> WHITE_CONCRETE_TILES = BLOCKS.register("white_concrete_tiles", () ->
			new Block(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_TILES = BLOCKS.register("light_gray_concrete_tiles", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> GRAY_CONCRETE_TILES = BLOCKS.register("gray_concrete_tiles", () ->
			new Block(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> BLACK_CONCRETE_TILES = BLOCKS.register("black_concrete_tiles", () ->
			new Block(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> BROWN_CONCRETE_TILES = BLOCKS.register("brown_concrete_tiles", () ->
			new Block(Block.Settings.copy(BROWN_CONCRETE)));

	public static final RegistrySupplier<Block> RED_CONCRETE_TILE_SLAB = BLOCKS.register("red_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> ORANGE_CONCRETE_TILE_SLAB = BLOCKS.register("orange_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> YELLOW_CONCRETE_TILE_SLAB = BLOCKS.register("yellow_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> LIME_CONCRETE_TILE_SLAB = BLOCKS.register("lime_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> GREEN_CONCRETE_TILE_SLAB = BLOCKS.register("green_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> BLUE_CONCRETE_TILE_SLAB = BLOCKS.register("blue_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CYAN_CONCRETE_TILE_SLAB = BLOCKS.register("cyan_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_TILE_SLAB = BLOCKS.register("light_blue_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> PURPLE_CONCRETE_TILE_SLAB = BLOCKS.register("purple_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> MAGENTA_CONCRETE_TILE_SLAB = BLOCKS.register("magenta_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> PINK_CONCRETE_TILE_SLAB = BLOCKS.register("pink_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> WHITE_CONCRETE_TILE_SLAB = BLOCKS.register("white_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_TILE_SLAB = BLOCKS.register("light_gray_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> GRAY_CONCRETE_TILE_SLAB = BLOCKS.register("gray_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> BLACK_CONCRETE_TILE_SLAB = BLOCKS.register("black_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> BROWN_CONCRETE_TILE_SLAB = BLOCKS.register("brown_concrete_tile_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_CONCRETE)));

	// Terracotta Stairs
	public static final RegistrySupplier<Block> RED_CONCRETE_TILE_STAIRS = BLOCKS.register("red_concrete_tile_stairs", () ->
			new CPlusStairBlock(RED_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> ORANGE_CONCRETE_TILE_STAIRS = BLOCKS.register("orange_concrete_tile_stairs", () ->
			new CPlusStairBlock(ORANGE_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> YELLOW_CONCRETE_TILE_STAIRS = BLOCKS.register("yellow_concrete_tile_stairs", () ->
			new CPlusStairBlock(YELLOW_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> LIME_CONCRETE_TILE_STAIRS = BLOCKS.register("lime_concrete_tile_stairs", () ->
			new CPlusStairBlock(LIME_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> GREEN_CONCRETE_TILE_STAIRS = BLOCKS.register("green_concrete_tile_stairs", () ->
			new CPlusStairBlock(GREEN_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> BLUE_CONCRETE_TILE_STAIRS = BLOCKS.register("blue_concrete_tile_stairs", () ->
			new CPlusStairBlock(BLUE_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CYAN_CONCRETE_TILE_STAIRS = BLOCKS.register("cyan_concrete_tile_stairs", () ->
			new CPlusStairBlock(CYAN_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_TILE_STAIRS = BLOCKS.register("light_blue_concrete_tile_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> PURPLE_CONCRETE_TILE_STAIRS = BLOCKS.register("purple_concrete_tile_stairs", () ->
			new CPlusStairBlock(PURPLE_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> MAGENTA_CONCRETE_TILE_STAIRS = BLOCKS.register("magenta_concrete_tile_stairs", () ->
			new CPlusStairBlock(MAGENTA_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> PINK_CONCRETE_TILE_STAIRS = BLOCKS.register("pink_concrete_tile_stairs", () ->
			new CPlusStairBlock(PINK_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> WHITE_CONCRETE_TILE_STAIRS = BLOCKS.register("white_concrete_tile_stairs", () ->
			new CPlusStairBlock(WHITE_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_TILE_STAIRS = BLOCKS.register("light_gray_concrete_tile_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> GRAY_CONCRETE_TILE_STAIRS = BLOCKS.register("gray_concrete_tile_stairs", () ->
			new CPlusStairBlock(GRAY_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> BLACK_CONCRETE_TILE_STAIRS = BLOCKS.register("black_concrete_tile_stairs", () ->
			new CPlusStairBlock(BLACK_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> BROWN_CONCRETE_TILE_STAIRS = BLOCKS.register("brown_concrete_tile_stairs", () ->
			new CPlusStairBlock(BROWN_CONCRETE_TILES.get().getDefaultState(), Block.Settings.copy(BROWN_CONCRETE)));

	// Terracotta Wall
	public static final RegistrySupplier<Block> RED_CONCRETE_TILE_WALL = BLOCKS.register("red_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> ORANGE_CONCRETE_TILE_WALL = BLOCKS.register("orange_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> YELLOW_CONCRETE_TILE_WALL = BLOCKS.register("yellow_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> LIME_CONCRETE_TILE_WALL = BLOCKS.register("lime_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> GREEN_CONCRETE_TILE_WALL = BLOCKS.register("green_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> BLUE_CONCRETE_TILE_WALL = BLOCKS.register("blue_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CYAN_CONCRETE_TILE_WALL = BLOCKS.register("cyan_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_TILE_WALL = BLOCKS.register("light_blue_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> PURPLE_CONCRETE_TILE_WALL = BLOCKS.register("purple_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> MAGENTA_CONCRETE_TILE_WALL = BLOCKS.register("magenta_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> PINK_CONCRETE_TILE_WALL = BLOCKS.register("pink_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> WHITE_CONCRETE_TILE_WALL = BLOCKS.register("white_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_TILE_WALL = BLOCKS.register("light_gray_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> GRAY_CONCRETE_TILE_WALL = BLOCKS.register("gray_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> BLACK_CONCRETE_TILE_WALL = BLOCKS.register("black_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> BROWN_CONCRETE_TILE_WALL = BLOCKS.register("brown_concrete_tile_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_CONCRETE)));

	// Terracotta Gates
	public static final RegistrySupplier<Block> RED_CONCRETE_TILE_GATE = BLOCKS.register("red_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> ORANGE_CONCRETE_TILE_GATE = BLOCKS.register("orange_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> YELLOW_CONCRETE_TILE_GATE = BLOCKS.register("yellow_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> LIME_CONCRETE_TILE_GATE = BLOCKS.register("lime_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> GREEN_CONCRETE_TILE_GATE = BLOCKS.register("green_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> BLUE_CONCRETE_TILE_GATE = BLOCKS.register("blue_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CYAN_CONCRETE_TILE_GATE = BLOCKS.register("cyan_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_TILE_GATE = BLOCKS.register("light_blue_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> PURPLE_CONCRETE_TILE_GATE = BLOCKS.register("purple_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> MAGENTA_CONCRETE_TILE_GATE = BLOCKS.register("magenta_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> PINK_CONCRETE_TILE_GATE = BLOCKS.register("pink_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> WHITE_CONCRETE_TILE_GATE = BLOCKS.register("white_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_TILE_GATE = BLOCKS.register("light_gray_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> GRAY_CONCRETE_TILE_GATE = BLOCKS.register("gray_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> BLACK_CONCRETE_TILE_GATE = BLOCKS.register("black_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> BROWN_CONCRETE_TILE_GATE = BLOCKS.register("brown_concrete_tile_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_CONCRETE)));

	public static final RegistrySupplier<Block> RED_CONCRETE_PILLAR = BLOCKS.register("red_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> ORANGE_CONCRETE_PILLAR = BLOCKS.register("orange_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> YELLOW_CONCRETE_PILLAR = BLOCKS.register("yellow_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> LIME_CONCRETE_PILLAR = BLOCKS.register("lime_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> GREEN_CONCRETE_PILLAR = BLOCKS.register("green_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> BLUE_CONCRETE_PILLAR = BLOCKS.register("blue_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CYAN_CONCRETE_PILLAR = BLOCKS.register("cyan_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_PILLAR = BLOCKS.register("light_blue_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> PURPLE_CONCRETE_PILLAR = BLOCKS.register("purple_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> MAGENTA_CONCRETE_PILLAR = BLOCKS.register("magenta_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> PINK_CONCRETE_PILLAR = BLOCKS.register("pink_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> WHITE_CONCRETE_PILLAR = BLOCKS.register("white_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_PILLAR = BLOCKS.register("light_gray_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> GRAY_CONCRETE_PILLAR = BLOCKS.register("gray_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> BLACK_CONCRETE_PILLAR = BLOCKS.register("black_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> BROWN_CONCRETE_PILLAR = BLOCKS.register("brown_concrete_pillar", () ->
			new PillarBlock(Block.Settings.copy(BROWN_CONCRETE)));

	public static final RegistrySupplier<Block> RED_CONCRETE_CORNER_PILLAR = BLOCKS.register("red_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> ORANGE_CONCRETE_CORNER_PILLAR = BLOCKS.register("orange_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> YELLOW_CONCRETE_CORNER_PILLAR = BLOCKS.register("yellow_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> LIME_CONCRETE_CORNER_PILLAR = BLOCKS.register("lime_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> GREEN_CONCRETE_CORNER_PILLAR = BLOCKS.register("green_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> BLUE_CONCRETE_CORNER_PILLAR = BLOCKS.register("blue_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CYAN_CONCRETE_CORNER_PILLAR = BLOCKS.register("cyan_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_CORNER_PILLAR = BLOCKS.register("light_blue_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> PURPLE_CONCRETE_CORNER_PILLAR = BLOCKS.register("purple_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> MAGENTA_CONCRETE_CORNER_PILLAR = BLOCKS.register("magenta_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> PINK_CONCRETE_CORNER_PILLAR = BLOCKS.register("pink_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> WHITE_CONCRETE_CORNER_PILLAR = BLOCKS.register("white_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_CORNER_PILLAR = BLOCKS.register("light_gray_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> GRAY_CONCRETE_CORNER_PILLAR = BLOCKS.register("gray_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> BLACK_CONCRETE_CORNER_PILLAR = BLOCKS.register("black_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> BROWN_CONCRETE_CORNER_PILLAR = BLOCKS.register("brown_concrete_corner_pillar", () ->
			new Block(Block.Settings.copy(BROWN_CONCRETE)));

	public static final RegistrySupplier<Block> CHISELED_RED_CONCRETE = BLOCKS.register("chiseled_red_concrete", () ->
			new Block(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> CHISELED_ORANGE_CONCRETE = BLOCKS.register("chiseled_orange_concrete", () ->
			new Block(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> CHISELED_YELLOW_CONCRETE = BLOCKS.register("chiseled_yellow_concrete", () ->
			new Block(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> CHISELED_LIME_CONCRETE = BLOCKS.register("chiseled_lime_concrete", () ->
			new Block(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> CHISELED_GREEN_CONCRETE = BLOCKS.register("chiseled_green_concrete", () ->
			new Block(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> CHISELED_BLUE_CONCRETE = BLOCKS.register("chiseled_blue_concrete", () ->
			new Block(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CHISELED_CYAN_CONCRETE = BLOCKS.register("chiseled_cyan_concrete", () ->
			new Block(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> CHISELED_LIGHT_BLUE_CONCRETE = BLOCKS.register("chiseled_light_blue_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CHISELED_PURPLE_CONCRETE = BLOCKS.register("chiseled_purple_concrete", () ->
			new Block(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> CHISELED_MAGENTA_CONCRETE = BLOCKS.register("chiseled_magenta_concrete", () ->
			new Block(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> CHISELED_PINK_CONCRETE = BLOCKS.register("chiseled_pink_concrete", () ->
			new Block(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> CHISELED_WHITE_CONCRETE = BLOCKS.register("chiseled_white_concrete", () ->
			new Block(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> CHISELED_LIGHT_GRAY_CONCRETE = BLOCKS.register("chiseled_light_gray_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> CHISELED_GRAY_CONCRETE = BLOCKS.register("chiseled_gray_concrete", () ->
			new Block(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> CHISELED_BLACK_CONCRETE = BLOCKS.register("chiseled_black_concrete", () ->
			new Block(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> CHISELED_BROWN_CONCRETE = BLOCKS.register("chiseled_brown_concrete", () ->
			new Block(Block.Settings.copy(BROWN_CONCRETE)));

	public static final RegistrySupplier<Block> CARVED_RED_CONCRETE = BLOCKS.register("carved_red_concrete", () ->
			new Block(Block.Settings.copy(RED_CONCRETE)));
	public static final RegistrySupplier<Block> CARVED_ORANGE_CONCRETE = BLOCKS.register("carved_orange_concrete", () ->
			new Block(Block.Settings.copy(ORANGE_CONCRETE)));
	public static final RegistrySupplier<Block> CARVED_YELLOW_CONCRETE = BLOCKS.register("carved_yellow_concrete", () ->
			new Block(Block.Settings.copy(YELLOW_CONCRETE)));
	public static final RegistrySupplier<Block> CARVED_LIME_CONCRETE = BLOCKS.register("carved_lime_concrete", () ->
			new Block(Block.Settings.copy(LIME_CONCRETE)));
	public static final RegistrySupplier<Block> CARVED_GREEN_CONCRETE = BLOCKS.register("carved_green_concrete", () ->
			new Block(Block.Settings.copy(GREEN_CONCRETE)));
	public static final RegistrySupplier<Block> CARVED_BLUE_CONCRETE = BLOCKS.register("carved_blue_concrete", () ->
			new Block(Block.Settings.copy(BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CARVED_CYAN_CONCRETE = BLOCKS.register("carved_cyan_concrete", () ->
			new Block(Block.Settings.copy(CYAN_CONCRETE)));
	public static final RegistrySupplier<Block> CARVED_LIGHT_BLUE_CONCRETE = BLOCKS.register("carved_light_blue_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_BLUE_CONCRETE)));
	public static final RegistrySupplier<Block> CARVED_PURPLE_CONCRETE = BLOCKS.register("carved_purple_concrete", () ->
			new Block(Block.Settings.copy(PURPLE_CONCRETE)));
	public static final RegistrySupplier<Block> CARVED_MAGENTA_CONCRETE = BLOCKS.register("carved_magenta_concrete", () ->
			new Block(Block.Settings.copy(MAGENTA_CONCRETE)));
	public static final RegistrySupplier<Block> CARVED_PINK_CONCRETE = BLOCKS.register("carved_pink_concrete", () ->
			new Block(Block.Settings.copy(PINK_CONCRETE)));
	public static final RegistrySupplier<Block> CARVED_WHITE_CONCRETE = BLOCKS.register("carved_white_concrete", () ->
			new Block(Block.Settings.copy(WHITE_CONCRETE)));
	public static final RegistrySupplier<Block> CARVED_LIGHT_GRAY_CONCRETE = BLOCKS.register("carved_light_gray_concrete", () ->
			new Block(Block.Settings.copy(LIGHT_GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> CARVED_GRAY_CONCRETE = BLOCKS.register("carved_gray_concrete", () ->
			new Block(Block.Settings.copy(GRAY_CONCRETE)));
	public static final RegistrySupplier<Block> CARVED_BLACK_CONCRETE = BLOCKS.register("carved_black_concrete", () ->
			new Block(Block.Settings.copy(BLACK_CONCRETE)));
	public static final RegistrySupplier<Block> CARVED_BROWN_CONCRETE = BLOCKS.register("carved_brown_concrete", () ->
			new Block(Block.Settings.copy(BROWN_CONCRETE)));

// Any sane shit ends here.  Hello to any folks crazy enough to be here, and enjoy your stay in last-minute-addition hell
// Who wrote this, who wrote this, who? Cause its true, but it certainly wasn't me.

	// Ice
	public static final RegistrySupplier<Block> RED_ICE = BLOCKS.register("red_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.RED).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final RegistrySupplier<Block> ORANGE_ICE = BLOCKS.register("orange_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.ORANGE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final RegistrySupplier<Block> YELLOW_ICE = BLOCKS.register("yellow_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.YELLOW).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final RegistrySupplier<Block> LIME_ICE = BLOCKS.register("lime_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.LIME).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final RegistrySupplier<Block> GREEN_ICE = BLOCKS.register("green_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.GREEN).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final RegistrySupplier<Block> CYAN_ICE = BLOCKS.register("cyan_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.CYAN).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final RegistrySupplier<Block> LIGHT_BLUE_ICE = BLOCKS.register("light_blue_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.LIGHT_BLUE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final RegistrySupplier<Block> PURPLE_ICE = BLOCKS.register("purple_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.PURPLE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final RegistrySupplier<Block> MAGENTA_ICE = BLOCKS.register("magenta_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.MAGENTA).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final RegistrySupplier<Block> PINK_ICE = BLOCKS.register("pink_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.PINK).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final RegistrySupplier<Block> WHITE_ICE = BLOCKS.register("white_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.WHITE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final RegistrySupplier<Block> LIGHT_GRAY_ICE = BLOCKS.register("light_gray_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.LIGHT_GRAY).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final RegistrySupplier<Block> GRAY_ICE = BLOCKS.register("gray_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.GRAY).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final RegistrySupplier<Block> BLACK_ICE = BLOCKS.register("black_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.BLACK).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	public static final RegistrySupplier<Block> BROWN_ICE = BLOCKS.register("brown_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
	//Haha brr go brrr
	public static final RegistrySupplier<Block> SOUL_ICE = BLOCKS.register("soul_ice", () ->
			new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.LIGHT_BLUE).strength(3.0F).slipperiness(1.1f).sounds(BlockSoundGroup.GLASS)));

	// Ice Slab
	public static final RegistrySupplier<Block> RED_ICE_SLAB = BLOCKS.register("red_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_ICE.get())));
	public static final RegistrySupplier<Block> ORANGE_ICE_SLAB = BLOCKS.register("orange_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_ICE.get())));
	public static final RegistrySupplier<Block> YELLOW_ICE_SLAB = BLOCKS.register("yellow_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_ICE.get())));
	public static final RegistrySupplier<Block> LIME_ICE_SLAB = BLOCKS.register("lime_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_ICE.get())));
	public static final RegistrySupplier<Block> GREEN_ICE_SLAB = BLOCKS.register("green_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_ICE.get())));
	public static final RegistrySupplier<Block> BLUE_ICE_SLAB = BLOCKS.register("blue_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_ICE)));
	public static final RegistrySupplier<Block> CYAN_ICE_SLAB = BLOCKS.register("cyan_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_ICE.get())));
	public static final RegistrySupplier<Block> LIGHT_BLUE_ICE_SLAB = BLOCKS.register("light_blue_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_ICE.get())));
	public static final RegistrySupplier<Block> PURPLE_ICE_SLAB = BLOCKS.register("purple_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_ICE.get())));
	public static final RegistrySupplier<Block> MAGENTA_ICE_SLAB = BLOCKS.register("magenta_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_ICE.get())));
	public static final RegistrySupplier<Block> PINK_ICE_SLAB = BLOCKS.register("pink_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_ICE.get())));
	public static final RegistrySupplier<Block> WHITE_ICE_SLAB = BLOCKS.register("white_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_ICE.get())));
	public static final RegistrySupplier<Block> LIGHT_GRAY_ICE_SLAB = BLOCKS.register("light_gray_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_ICE.get())));
	public static final RegistrySupplier<Block> GRAY_ICE_SLAB = BLOCKS.register("gray_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_ICE.get())));
	public static final RegistrySupplier<Block> BLACK_ICE_SLAB = BLOCKS.register("black_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_ICE.get())));
	public static final RegistrySupplier<Block> BROWN_ICE_SLAB = BLOCKS.register("brown_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_ICE.get())));
	public static final RegistrySupplier<Block> SOUL_ICE_SLAB = BLOCKS.register("soul_ice_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_ICE.get())));

	// Ice Stairs
	public static final RegistrySupplier<Block> RED_ICE_STAIRS = BLOCKS.register("red_ice_stairs", () ->
			new CPlusStairBlock(RED_ICE.get().getDefaultState(), Block.Settings.copy(RED_ICE.get())));
	public static final RegistrySupplier<Block> ORANGE_ICE_STAIRS = BLOCKS.register("orange_ice_stairs", () ->
			new CPlusStairBlock(ORANGE_ICE.get().getDefaultState(), Block.Settings.copy(ORANGE_ICE.get())));
	public static final RegistrySupplier<Block> YELLOW_ICE_STAIRS = BLOCKS.register("yellow_ice_stairs", () ->
			new CPlusStairBlock(YELLOW_ICE.get().getDefaultState(), Block.Settings.copy(YELLOW_ICE.get())));
	public static final RegistrySupplier<Block> LIME_ICE_STAIRS = BLOCKS.register("lime_ice_stairs", () ->
			new CPlusStairBlock(LIME_ICE.get().getDefaultState(), Block.Settings.copy(LIME_ICE.get())));
	public static final RegistrySupplier<Block> GREEN_ICE_STAIRS = BLOCKS.register("green_ice_stairs", () ->
			new CPlusStairBlock(GREEN_ICE.get().getDefaultState(), Block.Settings.copy(GREEN_ICE.get())));
	public static final RegistrySupplier<Block> BLUE_ICE_STAIRS = BLOCKS.register("blue_ice_stairs", () ->
			new CPlusStairBlock(BLUE_ICE.getDefaultState(), Block.Settings.copy(BLUE_ICE)));
	public static final RegistrySupplier<Block> CYAN_ICE_STAIRS = BLOCKS.register("cyan_ice_stairs", () ->
			new CPlusStairBlock(CYAN_ICE.get().getDefaultState(), Block.Settings.copy(CYAN_ICE.get())));
	public static final RegistrySupplier<Block> LIGHT_BLUE_ICE_STAIRS = BLOCKS.register("light_blue_ice_stairs", () ->
			new CPlusStairBlock(LIGHT_BLUE_ICE.get().getDefaultState(), Block.Settings.copy(LIGHT_BLUE_ICE.get())));
	public static final RegistrySupplier<Block> PURPLE_ICE_STAIRS = BLOCKS.register("purple_ice_stairs", () ->
			new CPlusStairBlock(PURPLE_ICE.get().getDefaultState(), Block.Settings.copy(PURPLE_ICE.get())));
	public static final RegistrySupplier<Block> MAGENTA_ICE_STAIRS = BLOCKS.register("magenta_ice_stairs", () ->
			new CPlusStairBlock(MAGENTA_ICE.get().getDefaultState(), Block.Settings.copy(MAGENTA_ICE.get())));
	public static final RegistrySupplier<Block> PINK_ICE_STAIRS = BLOCKS.register("pink_ice_stairs", () ->
			new CPlusStairBlock(PINK_ICE.get().getDefaultState(), Block.Settings.copy(PINK_ICE.get())));
	public static final RegistrySupplier<Block> WHITE_ICE_STAIRS = BLOCKS.register("white_ice_stairs", () ->
			new CPlusStairBlock(WHITE_ICE.get().getDefaultState(), Block.Settings.copy(WHITE_ICE.get())));
	public static final RegistrySupplier<Block> LIGHT_GRAY_ICE_STAIRS = BLOCKS.register("light_gray_ice_stairs", () ->
			new CPlusStairBlock(LIGHT_GRAY_ICE.get().getDefaultState(), Block.Settings.copy(LIGHT_GRAY_ICE.get())));
	public static final RegistrySupplier<Block> GRAY_ICE_STAIRS = BLOCKS.register("gray_ice_stairs", () ->
			new CPlusStairBlock(GRAY_ICE.get().getDefaultState(), Block.Settings.copy(GRAY_ICE.get())));
	public static final RegistrySupplier<Block> BLACK_ICE_STAIRS = BLOCKS.register("black_ice_stairs", () ->
			new CPlusStairBlock(BLACK_ICE.get().getDefaultState(), Block.Settings.copy(BLACK_ICE.get())));
	public static final RegistrySupplier<Block> BROWN_ICE_STAIRS = BLOCKS.register("brown_ice_stairs", () ->
			new CPlusStairBlock(BROWN_ICE.get().getDefaultState(), Block.Settings.copy(BROWN_ICE.get())));
	public static final RegistrySupplier<Block> SOUL_ICE_STAIRS = BLOCKS.register("soul_ice_stairs", () ->
			new CPlusStairBlock(SOUL_ICE.get().getDefaultState(), Block.Settings.copy(SOUL_ICE.get())));

	// Ice Wall
	public static final RegistrySupplier<Block> RED_ICE_WALL = BLOCKS.register("red_ice_wall", () ->
			new WallBlock(Block.Settings.copy(RED_ICE.get())));
	public static final RegistrySupplier<Block> ORANGE_ICE_WALL = BLOCKS.register("orange_ice_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_ICE.get())));
	public static final RegistrySupplier<Block> YELLOW_ICE_WALL = BLOCKS.register("yellow_ice_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_ICE.get())));
	public static final RegistrySupplier<Block> LIME_ICE_WALL = BLOCKS.register("lime_ice_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_ICE.get())));
	public static final RegistrySupplier<Block> GREEN_ICE_WALL = BLOCKS.register("green_ice_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_ICE.get())));
	public static final RegistrySupplier<Block> BLUE_ICE_WALL = BLOCKS.register("blue_ice_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_ICE)));
	public static final RegistrySupplier<Block> CYAN_ICE_WALL = BLOCKS.register("cyan_ice_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_ICE.get())));
	public static final RegistrySupplier<Block> LIGHT_BLUE_ICE_WALL = BLOCKS.register("light_blue_ice_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_ICE.get())));
	public static final RegistrySupplier<Block> PURPLE_ICE_WALL = BLOCKS.register("purple_ice_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_ICE.get())));
	public static final RegistrySupplier<Block> MAGENTA_ICE_WALL = BLOCKS.register("magenta_ice_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_ICE.get())));
	public static final RegistrySupplier<Block> PINK_ICE_WALL = BLOCKS.register("pink_ice_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_ICE.get())));
	public static final RegistrySupplier<Block> WHITE_ICE_WALL = BLOCKS.register("white_ice_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_ICE.get())));
	public static final RegistrySupplier<Block> LIGHT_GRAY_ICE_WALL = BLOCKS.register("light_gray_ice_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_ICE.get())));
	public static final RegistrySupplier<Block> GRAY_ICE_WALL = BLOCKS.register("gray_ice_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_ICE.get())));
	public static final RegistrySupplier<Block> BLACK_ICE_WALL = BLOCKS.register("black_ice_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_ICE.get())));
	public static final RegistrySupplier<Block> BROWN_ICE_WALL = BLOCKS.register("brown_ice_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_ICE.get())));
	public static final RegistrySupplier<Block> SOUL_ICE_WALL = BLOCKS.register("soul_ice_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_ICE.get())));

	// Ice Gate
	public static final RegistrySupplier<Block> RED_ICE_GATE = BLOCKS.register("red_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_ICE.get())));
	public static final RegistrySupplier<Block> ORANGE_ICE_GATE = BLOCKS.register("orange_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_ICE.get())));
	public static final RegistrySupplier<Block> YELLOW_ICE_GATE = BLOCKS.register("yellow_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_ICE.get())));
	public static final RegistrySupplier<Block> LIME_ICE_GATE = BLOCKS.register("lime_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_ICE.get())));
	public static final RegistrySupplier<Block> GREEN_ICE_GATE = BLOCKS.register("green_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_ICE.get())));
	public static final RegistrySupplier<Block> BLUE_ICE_GATE = BLOCKS.register("blue_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_ICE)));
	public static final RegistrySupplier<Block> CYAN_ICE_GATE = BLOCKS.register("cyan_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_ICE.get())));
	public static final RegistrySupplier<Block> LIGHT_BLUE_ICE_GATE = BLOCKS.register("light_blue_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_ICE.get())));
	public static final RegistrySupplier<Block> PURPLE_ICE_GATE = BLOCKS.register("purple_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_ICE.get())));
	public static final RegistrySupplier<Block> MAGENTA_ICE_GATE = BLOCKS.register("magenta_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_ICE.get())));
	public static final RegistrySupplier<Block> PINK_ICE_GATE = BLOCKS.register("pink_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_ICE.get())));
	public static final RegistrySupplier<Block> WHITE_ICE_GATE = BLOCKS.register("white_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_ICE.get())));
	public static final RegistrySupplier<Block> LIGHT_GRAY_ICE_GATE = BLOCKS.register("light_gray_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_ICE.get())));
	public static final RegistrySupplier<Block> GRAY_ICE_GATE = BLOCKS.register("gray_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_ICE.get())));
	public static final RegistrySupplier<Block> BLACK_ICE_GATE = BLOCKS.register("black_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_ICE.get())));
	public static final RegistrySupplier<Block> BROWN_ICE_GATE = BLOCKS.register("brown_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_ICE.get())));
	public static final RegistrySupplier<Block> SOUL_ICE_GATE = BLOCKS.register("soul_ice_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_ICE.get())));


	//Glowstone
	public static final RegistrySupplier<Block> RED_GLOWSTONE = BLOCKS.register("red_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.RED).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance((state) -> 15).nonOpaque()));
	public static final RegistrySupplier<Block> ORANGE_GLOWSTONE = BLOCKS.register("orange_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.YELLOW).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance((state) -> 15).nonOpaque()));
	public static final RegistrySupplier<Block> YELLOW_GLOWSTONE = BLOCKS.register("yellow_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.ORANGE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance((state) -> 15).nonOpaque()));
	public static final RegistrySupplier<Block> LIME_GLOWSTONE = BLOCKS.register("lime_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.LIME).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque()));
	public static final RegistrySupplier<Block> GREEN_GLOWSTONE = BLOCKS.register("green_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.GREEN).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque()));
	public static final RegistrySupplier<Block> BLUE_GLOWSTONE = BLOCKS.register("blue_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.BLUE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque()));
	public static final RegistrySupplier<Block> CYAN_GLOWSTONE = BLOCKS.register("cyan_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.CYAN).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque()));
	public static final RegistrySupplier<Block> LIGHT_BLUE_GLOWSTONE = BLOCKS.register("light_blue_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.LIGHT_BLUE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque()));
	public static final RegistrySupplier<Block> PURPLE_GLOWSTONE = BLOCKS.register("purple_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.PURPLE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque()));
	public static final RegistrySupplier<Block> MAGENTA_GLOWSTONE = BLOCKS.register("magenta_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.MAGENTA).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque()));
	public static final RegistrySupplier<Block> PINK_GLOWSTONE = BLOCKS.register("pink_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.PINK).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque()));
	public static final RegistrySupplier<Block> WHITE_GLOWSTONE = BLOCKS.register("white_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.WHITE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque()));
	public static final RegistrySupplier<Block> LIGHT_GRAY_GLOWSTONE = BLOCKS.register("light_gray_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.LIGHT_GRAY).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque()));
	public static final RegistrySupplier<Block> GRAY_GLOWSTONE = BLOCKS.register("gray_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.GRAY).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque()));
	public static final RegistrySupplier<Block> BLACK_GLOWSTONE = BLOCKS.register("black_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque()));
	public static final RegistrySupplier<Block> BROWN_GLOWSTONE = BLOCKS.register("brown_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(((state) -> 15)).nonOpaque()));
	public static final RegistrySupplier<Block> SOUL_GLOWSTONE = BLOCKS.register("soul_glowstone", () ->
			new Block(Block.Settings.of(Material.GLASS, MapColor.LIGHT_BLUE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance((state) -> 10).nonOpaque()));

	// Glowstone Slab
	public static final RegistrySupplier<Block> RED_GLOWSTONE_SLAB = BLOCKS.register("red_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(RED_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> ORANGE_GLOWSTONE_SLAB = BLOCKS.register("orange_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(ORANGE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> YELLOW_GLOWSTONE_SLAB = BLOCKS.register("yellow_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(YELLOW_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> LIME_GLOWSTONE_SLAB = BLOCKS.register("lime_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(LIME_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> GREEN_GLOWSTONE_SLAB = BLOCKS.register("green_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(GREEN_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> BLUE_GLOWSTONE_SLAB = BLOCKS.register("blue_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(BLUE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> CYAN_GLOWSTONE_SLAB = BLOCKS.register("cyan_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(CYAN_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> LIGHT_BLUE_GLOWSTONE_SLAB = BLOCKS.register("light_blue_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_BLUE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> PURPLE_GLOWSTONE_SLAB = BLOCKS.register("purple_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(PURPLE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> MAGENTA_GLOWSTONE_SLAB = BLOCKS.register("magenta_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(MAGENTA_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> PINK_GLOWSTONE_SLAB = BLOCKS.register("pink_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(PINK_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> WHITE_GLOWSTONE_SLAB = BLOCKS.register("white_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(WHITE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> LIGHT_GRAY_GLOWSTONE_SLAB = BLOCKS.register("light_gray_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(LIGHT_GRAY_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> GRAY_GLOWSTONE_SLAB = BLOCKS.register("gray_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(GRAY_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> BLACK_GLOWSTONE_SLAB = BLOCKS.register("black_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(BLACK_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> BROWN_GLOWSTONE_SLAB = BLOCKS.register("brown_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(BROWN_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> SOUL_GLOWSTONE_SLAB = BLOCKS.register("soul_glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(SOUL_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> GLOWSTONE_SLAB = BLOCKS.register("glowstone_slab", () ->
			new SlabBlock(Block.Settings.copy(GLOWSTONE).nonOpaque()));

	// Glowstone Stairs
	public static final RegistrySupplier<Block> RED_GLOWSTONE_STAIRS = BLOCKS.register("red_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(RED_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> ORANGE_GLOWSTONE_STAIRS = BLOCKS.register("orange_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(ORANGE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> YELLOW_GLOWSTONE_STAIRS = BLOCKS.register("yellow_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(YELLOW_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> LIME_GLOWSTONE_STAIRS = BLOCKS.register("lime_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(LIME_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> GREEN_GLOWSTONE_STAIRS = BLOCKS.register("green_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(GREEN_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> BLUE_GLOWSTONE_STAIRS = BLOCKS.register("blue_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(BLUE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> CYAN_GLOWSTONE_STAIRS = BLOCKS.register("cyan_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(CYAN_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> LIGHT_BLUE_GLOWSTONE_STAIRS = BLOCKS.register("light_blue_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(LIGHT_BLUE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> PURPLE_GLOWSTONE_STAIRS = BLOCKS.register("purple_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(PURPLE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> MAGENTA_GLOWSTONE_STAIRS = BLOCKS.register("magenta_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(MAGENTA_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> PINK_GLOWSTONE_STAIRS = BLOCKS.register("pink_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(PINK_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> WHITE_GLOWSTONE_STAIRS = BLOCKS.register("white_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(WHITE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> LIGHT_GRAY_GLOWSTONE_STAIRS = BLOCKS.register("light_gray_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(LIGHT_GRAY_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> GRAY_GLOWSTONE_STAIRS = BLOCKS.register("gray_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(GRAY_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> BLACK_GLOWSTONE_STAIRS = BLOCKS.register("black_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(BLACK_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> BROWN_GLOWSTONE_STAIRS = BLOCKS.register("brown_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(BROWN_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> SOUL_GLOWSTONE_STAIRS = BLOCKS.register("soul_glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(SOUL_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> GLOWSTONE_STAIRS = BLOCKS.register("glowstone_stairs", () ->
			new CPlusStairBlock(GLOWSTONE.getDefaultState(), Block.Settings.copy(GLOWSTONE).nonOpaque()));

	// Glowstone Wall
	public static final RegistrySupplier<Block> RED_GLOWSTONE_WALL = BLOCKS.register("red_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(RED_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> ORANGE_GLOWSTONE_WALL = BLOCKS.register("orange_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(ORANGE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> YELLOW_GLOWSTONE_WALL = BLOCKS.register("yellow_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(YELLOW_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> LIME_GLOWSTONE_WALL = BLOCKS.register("lime_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(LIME_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> GREEN_GLOWSTONE_WALL = BLOCKS.register("green_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(GREEN_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> BLUE_GLOWSTONE_WALL = BLOCKS.register("blue_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(BLUE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> CYAN_GLOWSTONE_WALL = BLOCKS.register("cyan_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(CYAN_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> LIGHT_BLUE_GLOWSTONE_WALL = BLOCKS.register("light_blue_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_BLUE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> PURPLE_GLOWSTONE_WALL = BLOCKS.register("purple_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(PURPLE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> MAGENTA_GLOWSTONE_WALL = BLOCKS.register("magenta_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(MAGENTA_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> PINK_GLOWSTONE_WALL = BLOCKS.register("pink_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(PINK_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> WHITE_GLOWSTONE_WALL = BLOCKS.register("white_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(WHITE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> LIGHT_GRAY_GLOWSTONE_WALL = BLOCKS.register("light_gray_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(LIGHT_GRAY_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> GRAY_GLOWSTONE_WALL = BLOCKS.register("gray_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(GRAY_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> BLACK_GLOWSTONE_WALL = BLOCKS.register("black_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(BLACK_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> BROWN_GLOWSTONE_WALL = BLOCKS.register("brown_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(BROWN_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> SOUL_GLOWSTONE_WALL = BLOCKS.register("soul_glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(SOUL_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> GLOWSTONE_WALL = BLOCKS.register("glowstone_wall", () ->
			new WallBlock(Block.Settings.copy(GLOWSTONE).nonOpaque()));

	// Glowstone Gate
	public static final RegistrySupplier<Block> RED_GLOWSTONE_GATE = BLOCKS.register("red_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(RED_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> ORANGE_GLOWSTONE_GATE = BLOCKS.register("orange_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(ORANGE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> YELLOW_GLOWSTONE_GATE = BLOCKS.register("yellow_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(YELLOW_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> LIME_GLOWSTONE_GATE = BLOCKS.register("lime_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIME_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> GREEN_GLOWSTONE_GATE = BLOCKS.register("green_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GREEN_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> BLUE_GLOWSTONE_GATE = BLOCKS.register("blue_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLUE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> CYAN_GLOWSTONE_GATE = BLOCKS.register("cyan_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(CYAN_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> LIGHT_BLUE_GLOWSTONE_GATE = BLOCKS.register("light_blue_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_BLUE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> PURPLE_GLOWSTONE_GATE = BLOCKS.register("purple_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PURPLE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> MAGENTA_GLOWSTONE_GATE = BLOCKS.register("magenta_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(MAGENTA_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> PINK_GLOWSTONE_GATE = BLOCKS.register("pink_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(PINK_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> WHITE_GLOWSTONE_GATE = BLOCKS.register("white_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(WHITE_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> LIGHT_GRAY_GLOWSTONE_GATE = BLOCKS.register("light_gray_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(LIGHT_GRAY_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> GRAY_GLOWSTONE_GATE = BLOCKS.register("gray_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GRAY_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> BLACK_GLOWSTONE_GATE = BLOCKS.register("black_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BLACK_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> BROWN_GLOWSTONE_GATE = BLOCKS.register("brown_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(BROWN_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> SOUL_GLOWSTONE_GATE = BLOCKS.register("soul_glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(SOUL_GLOWSTONE.get())));;
	public static final RegistrySupplier<Block> GLOWSTONE_GATE = BLOCKS.register("glowstone_gate", () ->
			new FenceGateBlock(Block.Settings.copy(GLOWSTONE).nonOpaque()));

	//Glass stuff will be here eventually.  Until then, here's a random face from the win + . menu
	// (¬‿¬)

	// Tinted Glass
	public static final RegistrySupplier<Block> RED_TINTED_GLASS_BLOCK = BLOCKS.register("red_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque()));
	public static final RegistrySupplier<Block> ORANGE_TINTED_GLASS_BLOCK = BLOCKS.register("orange_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque()));
	public static final RegistrySupplier<Block> YELLOW_TINTED_GLASS_BLOCK = BLOCKS.register("yellow_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque()));
	public static final RegistrySupplier<Block> LIME_TINTED_GLASS_BLOCK = BLOCKS.register("lime_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque()));
	public static final RegistrySupplier<Block> GREEN_TINTED_GLASS_BLOCK = BLOCKS.register("green_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque()));
	public static final RegistrySupplier<Block> BLUE_TINTED_GLASS_BLOCK = BLOCKS.register("blue_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque()));
	public static final RegistrySupplier<Block> LIGHT_BLUE_TINTED_GLASS_BLOCK = BLOCKS.register("light_blue_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque()));
	public static final RegistrySupplier<Block> CYAN_TINTED_GLASS_BLOCK = BLOCKS.register("cyan_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque()));
	public static final RegistrySupplier<Block> PURPLE_TINTED_GLASS_BLOCK = BLOCKS.register("purple_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque()));
	public static final RegistrySupplier<Block> PINK_TINTED_GLASS_BLOCK = BLOCKS.register("pink_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque()));
	public static final RegistrySupplier<Block> BROWN_TINTED_GLASS_BLOCK = BLOCKS.register("brown_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque()));
	public static final RegistrySupplier<Block> GRAY_TINTED_GLASS_BLOCK = BLOCKS.register("gray_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque()));
	public static final RegistrySupplier<Block> LIGHT_GRAY_TINTED_GLASS_BLOCK = BLOCKS.register("light_gray_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque()));
	public static final RegistrySupplier<Block> WHITE_TINTED_GLASS_BLOCK = BLOCKS.register("white_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque()));
	public static final RegistrySupplier<Block> MAGENTA_TINTED_GLASS_BLOCK = BLOCKS.register("magenta_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque()));
	public static final RegistrySupplier<Block> BLACK_TINTED_GLASS_BLOCK = BLOCKS.register("black_tinted_glass", () ->
			new TintedGlassBlock(Block.Settings.copy(TINTED_GLASS).sounds(BlockSoundGroup.GLASS).allowsSpawning(CPlusBlocks::never).nonOpaque()));

	// Dirt
	public static final RegistrySupplier<Block> DIRT_SLAB = BLOCKS.register("dirt_slab", () ->
			new DirtSlabBlock(Block.Settings.copy(DIRT)));
	public static final RegistrySupplier<Block> DIRT_STAIRS = BLOCKS.register("dirt_stairs", () ->
			new DirtStairsBlock(DIRT.getDefaultState(), Block.Settings.copy(DIRT)));
	public static final RegistrySupplier<Block> DIRT_WALL = BLOCKS.register("dirt_wall", () ->
			new DirtWallBlock(Block.Settings.copy(DIRT)));

	// Grass
	public static final RegistrySupplier<Block> GRASS_SLAB = BLOCKS.register("grass_slab", () ->
			new GrassSlabBlock(Block.Settings.copy(GRASS_BLOCK)));
	public static final RegistrySupplier<Block> GRASS_STAIRS = BLOCKS.register("grass_stairs", () ->
			new GrassStairsBlock(GRASS_BLOCK.getDefaultState(), Block.Settings.copy(GRASS_BLOCK)));
	public static final RegistrySupplier<Block> GRASS_WALL = BLOCKS.register("grass_wall", () ->
			new GrassWallBlock(Block.Settings.copy(GRASS_BLOCK)));

	// Mycelium
	public static final RegistrySupplier<Block> MYCELIUM_SLAB = BLOCKS.register("mycelium_slab", () ->
			new MyceliumSlabBlock(Block.Settings.copy(MYCELIUM)));
	public static final RegistrySupplier<Block> MYCELIUM_STAIRS = BLOCKS.register("mycelium_stairs", () ->
			new MyceliumStairsBlock(MYCELIUM.getDefaultState(), Block.Settings.copy(MYCELIUM)));
	public static final RegistrySupplier<Block> MYCELIUM_WALL = BLOCKS.register("mycelium_wall", () ->
			new MyceliumWallBlock(Block.Settings.copy(MYCELIUM)));

	// Miscellaneous
	// public static final RegistrySupplier<Block> JACK_O_RED = BLOCKS.register("jack_o_red", () -> new RedstonePumpkinBlock(Block.Settings.of(Material.GOURD, MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD)13)));
	public static final RegistrySupplier<Block> JACK_O_SOUL = BLOCKS.register("jack_o_soul", () ->
			new CPlusCarvedPumpkinBlock(Block.Settings.of(Material.GOURD, MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD).luminance((state) -> 10)));
	public static final RegistrySupplier<Block> WARPED_WART = BLOCKS.register("warped_wart", () ->
			new WarpedNetherWartPlantBlock(Block.Settings.of(Material.PLANT, MapColor.BLUE).noCollision().ticksRandomly().sounds(BlockSoundGroup.NETHER_WART).nonOpaque()));
	public static final RegistrySupplier<Block> KFP_BLOCK = BLOCKS.register("kfp_block", () ->
			new Block(Block.Settings.copy(CARVED_ORANGE_CONCRETE.get())));
//	public static final RegistrySupplier<Block> CHARCOAL_BLOCK = BLOCKS.register("charcoal_block", () -> new Block(Block.Settings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(5.0F, 6.0F)));
	public static final RegistrySupplier<Block> PINEAPPLE = BLOCKS.register("pineapple", () ->
			new CPlusCarvedPumpkinBlock(Block.Settings.of(Material.GOURD, MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD)));
	public static final RegistrySupplier<Block> NETHERITE_STAIRS = BLOCKS.register("netherite_stairs", () ->
			new CPlusStairBlock(NETHERITE_BLOCK.getDefaultState(), Block.Settings.copy(NETHERITE_BLOCK)));
	public static final RegistrySupplier<Block> SUSPICIOUS_SLAB = BLOCKS.register("suspicious_slab", () ->
			new SlabBlock(Block.Settings.copy(CLAY)));
	public static final RegistrySupplier<Block> JET = BLOCKS.register("jet", () ->
			new Block(Block.Settings.copy(BEDROCK)));
	public static final RegistrySupplier<Block> NUBERT = BLOCKS.register("nubert", () ->
			new NubertBlock());
	public static final RegistrySupplier<Block> WIGGED_NUBERT = BLOCKS.register("wigged_nubert", () ->
			new WiggedNubertBlock());
//  public static final RegistrySupplier<Block> SIUOLS_SANITY = BLOCKS.register("is_a_crab", () -> new Block(Block.Settings.copy(HELP_ME)));
	//  You are having funny fun because your playing a Siuolplexplex contributed mod

	// Deprecated Blocks
	public static final RegistrySupplier<Block> STONE_BRICK_PILLAR = BLOCKS.register("stone_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_STONE_BRICK_PILLAR = BLOCKS.register("cracked_stone_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_STONE_BRICK_PILLAR = BLOCKS.register("mossy_stone_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> CARVED_STONE_BRICKS = BLOCKS.register("carved_stone_bricks", () ->
			new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_CHISELED_STONE_BRICKS = BLOCKS.register("cracked_chiseled_stone_bricks", () ->
			new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_CHISELED_STONE_BRICKS = BLOCKS.register("mossy_chiseled_stone_bricks", () ->
			new Block(Block.Settings.copy(STONE_BRICKS)));

	public static final RegistrySupplier<Block> MOSSY_BLACKSTONE_BRICK_PILLAR = BLOCKS.register("mossy_blackstone_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLACKSTONE_BRICK_PILLAR = BLOCKS.register("cracked_blackstone_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> BLACKSTONE_BRICK_PILLAR = BLOCKS.register("blackstone_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));

	public static final RegistrySupplier<Block> CHISELED_BRICKS = BLOCKS.register("chiseled_bricks", () ->
			new Block(Block.Settings.copy(BRICKS)));
	public static final RegistrySupplier<Block> BRICK_PILLAR = BLOCKS.register("brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(BRICKS)));
	public static final RegistrySupplier<Block> CARVED_BRICKS = BLOCKS.register("carved_bricks", () ->
			new Block(Block.Settings.copy(BRICKS)));

	public static final RegistrySupplier<Block> END_STONE_BRICK_PILLAR = BLOCKS.register("end_stone_brick_pillar", () ->
			new PillarBlock(Block.Settings.copy(END_STONE_BRICKS)));

	public static final RegistrySupplier<Block> SMOOTH_PURPUR_BLOCK = BLOCKS.register("smooth_purpur_block", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> POLISHED_PURPUR_BLOCK = BLOCKS.register("polished_purpur_block", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> CHISELED_PURPUR_BLOCK = BLOCKS.register("chiseled_purpur_block", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> PURPUR_CORNER_PILLAR = BLOCKS.register("purpur_corner_pillar", () ->
			new Block(Block.Settings.copy(PURPUR_PILLAR)));



	// Siuol's selection regex syntax machine (?=")(.*)(?<=____")
	// Per Thing regex selection machine (?=")(.*)(____.*)(?<=")
// new FenceGateBlock


	public static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos, EntityType<?> entityType) {
		return false;
	}

	public static void init() {
		BLOCKS.register();
	}
}
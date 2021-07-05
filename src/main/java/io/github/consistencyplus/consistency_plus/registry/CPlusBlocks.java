package io.github.consistencyplus.consistency_plus.registry;

import io.github.consistencyplus.consistency_plus.core.BaseConsistencyCarvedPumpkinBlock;
import io.github.consistencyplus.consistency_plus.core.BaseConsistencyStairBlock;
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
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricMaterialBuilder;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.minecraft.block.Blocks.*;
import static net.minecraft.block.piston.PistonBehavior.BLOCK;

public class CPlusBlocks {

    /*
    templates
    block:  public static final Block POLISHED_STONE = register("polished_stone", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
    slab:   public static final Block POLISHED_STONE_SLAB  = register("polished_stone_slab", new SlabBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    stairs: public static final Block POLISHED_STONE_STAIRS = register("polished_stone_stairs", new BaseConsistencyStairBlock(STONE_BRICKS.getDefaultState(),FabricBlockSettings.copy(STONE_BRICKS)));
    pillar: public static final Block STONE_BRICK_PILLAR = register("stone_brick_pillar", new PillarBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    wall:   public static final Block STONE_WALL = register("stone_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    fence: public static final Block FORMAT_FENCE = register("format_fence", new FenceBlock(FabricBlockSettings.of(Material.STONE)));
    gate: public static final Block FORMAT_FENCE_GATE = register("format_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE)));

    public static final Block _GATE = register("_gate", new FenceGateBlock(FabricBlockSettings.copy()));
    public static final Block CUT__GATE = register("cut__gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_)));
    public static final Block _BRICK_GATE = register("_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(_BRICKS)));
    public static final Block POLISHED__GATE = register("polished__gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_)));
    public static final Block SMOOTH__GATE = register("smooth__gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_)));
     */

//Stone

    public static final Block STONE_WALL = register("stone_wall", new WallBlock(FabricBlockSettings.copy(STONE)));
    public static final Block STONE_GATE = register("stone_gate", new FenceGateBlock(FabricBlockSettings.copy(STONE)));
    public static final Block COBBLESTONE_GATE = register("cobblestone_gate", new FenceGateBlock(FabricBlockSettings.copy(COBBLESTONE)));
    public static final Block MOSSY_COBBLESTONE_GATE = register("mossy_cobblestone_gate", new FenceGateBlock(FabricBlockSettings.copy(MOSSY_COBBLESTONE)));
    //Smooth
    public static final Block SMOOTH_STONE_STAIRS = register("smooth_stone_stairs", new BaseConsistencyStairBlock(SMOOTH_STONE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_WALL = register("smooth_stone_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_STONE)));
    public static final Block SMOOTH_STONE_GATE = register("smooth_stone_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_STONE)));

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Polished
    public static final Block POLISHED_STONE = register("polished_stone", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block POLISHED_STONE_SLAB = register("polished_stone_slab", new SlabBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block POLISHED_STONE_STAIRS = register("polished_stone_stairs", new BaseConsistencyStairBlock(STONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block POLISHED_STONE_WALL = register("polished_stone_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block POLISHED_STONE_GATE = register("polished_stone_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_STONE)));

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cut
    public static final Block CUT_STONE = register("cut_stone", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block CUT_STONE_SLAB = register("cut_stone_slab", new SlabBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block CUT_STONE_STAIRS = register("cut_stone_stairs", new BaseConsistencyStairBlock(STONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block CUT_STONE_WALL = register("cut_stone_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block CUT_STONE_GATE = register("cut_stone_gate", new FenceGateBlock(FabricBlockSettings.copy(STONE_BRICKS)));

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    // Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    public static final Block STONE_TILES = register("stone_tiles", new Block(FabricBlockSettings.copy(STONE)));
    public static final Block STONE_TILE_SLAB = register("stone_tile_slab", new SlabBlock(FabricBlockSettings.copy(STONE)));
    public static final Block STONE_TILE_STAIRS = register("stone_tile_stairs", new BaseConsistencyStairBlock(STONE_TILES.getDefaultState(), FabricBlockSettings.copy(STONE)));
    public static final Block STONE_TILE_WALL = register("stone_tile_wall", new WallBlock(FabricBlockSettings.copy(STONE)));
    public static final Block STONE_TILE_GATE = register("stone_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(STONE)));

    //Cracked Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    // Mossy Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    // Bricks
    public static final Block STONE_BRICK_GATE = register("stone_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(STONE_BRICKS)));

    // Cracked
    public static final Block CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab", new SlabBlock(FabricBlockSettings.copy(CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", new BaseConsistencyStairBlock(CRACKED_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", new WallBlock(FabricBlockSettings.copy(CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICK_GATE = register("cracked_stone_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(CRACKED_STONE_BRICKS)));

    // Mossy
    public static final Block MOSSY_STONE_BRICK_GATE = register("mossy_stone_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(MOSSY_STONE_BRICKS)));

    // Pillar and Chiseled
    public static final Block STONE_BRICK_PILLAR = register("stone_brick_pillar", new PillarBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICK_PILLAR = register("cracked_stone_brick_pillar", new PillarBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block MOSSY_STONE_BRICK_PILLAR = register("mossy_stone_brick_pillar", new PillarBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block CRACKED_CHISELED_STONE_BRICKS = register("cracked_chiseled_stone_bricks", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block MOSSY_CHISELED_STONE_BRICKS = register("mossy_chiseled_stone_bricks", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    public static final Block CARVED_STONE_BRICKS = register("carved_stone_bricks", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
    //cracked carved
    //mossy carved

//Blackstone

    public static final Block BLACKSTONE_GATE = register("blackstone_gate", new FenceGateBlock(FabricBlockSettings.copy(BLACKSTONE)));
    public static final Block BLACKSTONE_BRICK_GATE = register("blackstone_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));
    public static final Block POLISHED_BLACKSTONE_GATE = register("polished_blackstone_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_BLACKSTONE)));

    //Smooth
    public static final Block SMOOTH_BLACKSTONE = register("smooth_blackstone", new Block(FabricBlockSettings.copy(BLACKSTONE)));
    public static final Block SMOOTH_BLACKSTONE_SLAB = register("smooth_blackstone_slab", new SlabBlock(FabricBlockSettings.copy(BLACKSTONE)));
    public static final Block SMOOTH_BLACKSTONE_STAIRS = register("smooth_blackstone_stairs", new BaseConsistencyStairBlock(BLACKSTONE.getDefaultState(), FabricBlockSettings.copy(BLACKSTONE)));
    public static final Block SMOOTH_BLACKSTONE_WALL = register("smooth_blackstone_wall", new WallBlock(FabricBlockSettings.copy(BLACKSTONE)));
    public static final Block SMOOTH_BLACKSTONE_GATE = register("smooth_blackstone_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_BLACKSTONE)));

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cut
    public static final Block CUT_BLACKSTONE = register("cut_blackstone", new Block(FabricBlockSettings.copy(BLACKSTONE)));
    public static final Block CUT_BLACKSTONE_SLAB = register("cut_blackstone_slab", new SlabBlock(FabricBlockSettings.copy(BLACKSTONE)));
    public static final Block CUT_BLACKSTONE_STAIRS = register("cut_blackstone_stairs", new BaseConsistencyStairBlock(BLACKSTONE.getDefaultState(), FabricBlockSettings.copy(BLACKSTONE)));
    public static final Block CUT_BLACKSTONE_WALL = register("cut_blackstone_wall", new WallBlock(FabricBlockSettings.copy(BLACKSTONE)));
    public static final Block CUT_BLACKSTONE_GATE = register("cut_blackstone_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_BLACKSTONE)));

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    public static final Block BLACKSTONE_TILES = register("blackstone_tiles", new Block(FabricBlockSettings.copy(BLACKSTONE)));
    public static final Block BLACKSTONE_TILE_SLAB = register("blackstone_tile_slab", new SlabBlock(FabricBlockSettings.copy(BLACKSTONE)));
    public static final Block BLACKSTONE_TILE_STAIRS = register("blackstone_tile_stairs", new BaseConsistencyStairBlock(BLACKSTONE_TILES.getDefaultState(), FabricBlockSettings.copy(BLACKSTONE)));
    public static final Block BLACKSTONE_TILE_WALL = register("blackstone_tile_wall", new WallBlock(FabricBlockSettings.copy(BLACKSTONE)));
    public static final Block BLACKSTONE_TILE_GATE = register("blackstone_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(BLACKSTONE)));

    //Cracked Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Tiles
    //block
    //slab
    //stairs
    //wall
    //gate


    //Cracked
    public static final Block CRACKED_BLACKSTONE_BRICK_SLAB = register("cracked_blackstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_BLACKSTONE_BRICK_STAIRS = register("cracked_blackstone_brick_stairs", new BaseConsistencyStairBlock(CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(CRACKED_STONE_BRICKS)));
    public static final Block CRACKED_BLACKSTONE_BRICK_WALL = register("cracked_blackstone_brick_wall", new WallBlock(FabricBlockSettings.copy(CRACKED_POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_BLACKSTONE_BRICK_GATE = register("cracked_blackstone_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(CRACKED_POLISHED_BLACKSTONE_BRICKS)));

    //Mossy
    public static final Block MOSSY_BLACKSTONE_BRICKS = register("mossy_blackstone_bricks", new Block(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));
    public static final Block MOSSY_BLACKSTONE_BRICK_SLAB = register("mossy_blackstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));
    public static final Block MOSSY_BLACKSTONE_BRICK_STAIRS = register("mossy_blackstone_brick_stairs", new BaseConsistencyStairBlock(POLISHED_BLACKSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block MOSSY_BLACKSTONE_BRICK_WALL = register("mossy_blackstone_brick_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));
    public static final Block MOSSY_BLACKSTONE_BRICK_GATE = register("mossy_blackstone_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));

    //Pillars and Chiseled
    public static final Block MOSSY_BLACKSTONE_BRICK_PILLAR = register("mossy_blackstone_brick_pillar", new PillarBlock(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_BLACKSTONE_BRICK_PILLAR = register("cracked_blackstone_brick_pillar", new PillarBlock(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));
    public static final Block BLACKSTONE_BRICK_PILLAR = register("blackstone_brick_pillar", new PillarBlock(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CHISELED_BLACKSTONE = register("chiseled_blackstone", new Block(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));
    public static final Block MOSSY_CHISELED_BLACKSTONE = register("mossy_chiseled_blackstone", new Block(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_CHISELED_BLACKSTONE = register("cracked_chiseled_blackstone", new Block(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    public static final Block MOSSY_CARVED_BLACKSTONE = register("mossy_carved_blackstone", new Block(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));
    public static final Block CRACKED_CARVED_BLACKSTONE = register("cracked_carved_blackstone", new Block(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));


//Sandstone
    public static final Block SANDSTONE_GATE = register("sandstone_gate", new FenceGateBlock(FabricBlockSettings.copy(SANDSTONE)));

    //Smooth
    public static final Block SMOOTH_SANDSTONE_WALL = register("smooth_sandstone_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_SANDSTONE)));
    public static final Block SMOOTH_SANDSTONE_GATE = register("smooth_sandstone_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_SANDSTONE)));

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cut
    public static final Block CUT_SANDSTONE_STAIRS = register("cut_sandstone_stairs", new BaseConsistencyStairBlock(CUT_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(CUT_SANDSTONE)));
    public static final Block CUT_SANDSTONE_WALL = register("cut_sandstone_wall", new WallBlock(FabricBlockSettings.copy(CUT_SANDSTONE)));
    public static final Block CUT_SANDSTONE_GATE = register("cut_sandstone_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_SANDSTONE)));

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cracked Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Polished
    public static final Block POLISHED_SANDSTONE = register("polished_sandstone", new Block(FabricBlockSettings.copy(SANDSTONE)));
    public static final Block POLISHED_SANDSTONE_SLAB = register("polished_sandstone_slab", new SlabBlock(FabricBlockSettings.copy(SANDSTONE)));
    public static final Block POLISHED_SANDSTONE_STAIRS = register("polished_sandstone_stairs", new BaseConsistencyStairBlock(SANDSTONE.getDefaultState(), FabricBlockSettings.copy(SANDSTONE)));
    public static final Block POLISHED_SANDSTONE_WALL = register("polished_sandstone_wall", new WallBlock(FabricBlockSettings.copy(SANDSTONE)));
    public static final Block POLISHED_SANDSTONE_GATE = register("polished_sandstone_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_SANDSTONE)));

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Bricks
    public static final Block SANDSTONE_BRICKS = register("sandstone_bricks", new Block(FabricBlockSettings.copy(SANDSTONE)));
    public static final Block SANDSTONE_BRICK_SLAB = register("sandstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(SANDSTONE)));
    public static final Block SANDSTONE_BRICK_STAIRS = register("sandstone_brick_stairs", new BaseConsistencyStairBlock(SANDSTONE.getDefaultState(), FabricBlockSettings.copy(SANDSTONE)));
    public static final Block SANDSTONE_BRICK_WALL = register("sandstone_brick_wall", new WallBlock(FabricBlockSettings.copy(SANDSTONE)));
    public static final Block SANDSTONE_BRICK_GATE = register("sandstone_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(SANDSTONE_BRICKS)));

    //Cracked Bricks
    //cracked_sandstone_bricks
    //cracked_sandstone_brick_slab
    //cracked_sandstone_brick_stairs
    //cracked_sandstone_brick_wall
    //gate

    //Mossy Bricks
    //mossy_sandstone_bricks
    //mossy_sandstone_brick_slab
    //mossy_sandstone_brick_stairs
    //mossy_sandstone_brick_wall
    //gate

    public static final Block SANDSTONE_TILES = register("sandstone_tiles", new Block(FabricBlockSettings.copy(SANDSTONE)));
    public static final Block SANDSTONE_TILE_SLAB = register("sandstone_tile_slab", new SlabBlock(FabricBlockSettings.copy(SANDSTONE)));
    public static final Block SANDSTONE_TILE_STAIRS = register("sandstone_tile_stairs", new BaseConsistencyStairBlock(SANDSTONE_TILES.getDefaultState(), FabricBlockSettings.copy(SANDSTONE)));
    public static final Block SANDSTONE_TILE_WALL = register("sandstone_tile_wall", new WallBlock(FabricBlockSettings.copy(SANDSTONE)));
    public static final Block SANDSTONE_TILE_GATE = register("sandstone_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(SANDSTONE)));

    //Pillars and Chiseled
    public static final Block CHISELED_SANDSTONE = register("chiseled_sandstone", new Block(FabricBlockSettings.copy(SANDSTONE)));
    //cracked_chiseled_sandstone_bricks
    //mossy_chiseled_sandstone_bricks
    public static final Block SANDSTONE_PILLAR = register("sandstone_pillar", new PillarBlock(FabricBlockSettings.copy(SANDSTONE)));
    //cracked_sandstone_brick_pillar
    //mossy_sandstone_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    //cracked carved
    //mossy carved


//Red Sandstone
    public static final Block RED_SANDSTONE_GATE = register("red_sandstone_gate", new FenceGateBlock(FabricBlockSettings.copy(RED_SANDSTONE)));

    //Smooth
    public static final Block SMOOTH_RED_SANDSTONE_WALL = register("smooth_red_sandstone_wall", new WallBlock(FabricBlockSettings.copy(RED_SANDSTONE)));
    public static final Block SMOOTH_RED_SANDSTONE_GATE = register("smooth_red_sandstone_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_RED_SANDSTONE)));

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cut
    public static final Block CUT_RED_SANDSTONE_STAIRS = register("cut_red_sandstone_stairs", new BaseConsistencyStairBlock(CUT_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(CUT_SANDSTONE)));
    public static final Block CUT_RED_SANDSTONE_WALL = register("cut_red_sandstone_wall", new WallBlock(FabricBlockSettings.copy(CUT_SANDSTONE)));
    public static final Block CUT_RED_SANDSTONE_GATE = register("cut_red_sandstone_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_RED_SANDSTONE)));

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cracked Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Polished
    public static final Block POLISHED_RED_SANDSTONE = register("polished_red_sandstone", new Block(FabricBlockSettings.copy(RED_SANDSTONE)));
    public static final Block POLISHED_RED_SANDSTONE_SLAB = register("polished_red_sandstone_slab", new SlabBlock(FabricBlockSettings.copy(RED_SANDSTONE)));
    public static final Block POLISHED_RED_SANDSTONE_STAIRS = register("polished_red_sandstone_stairs", new BaseConsistencyStairBlock(RED_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(SANDSTONE)));
    public static final Block POLISHED_RED_SANDSTONE_WALL = register("polished_red_sandstone_wall", new WallBlock(FabricBlockSettings.copy(RED_SANDSTONE)));
    public static final Block POLISHED_RED_SANDSTONE_GATE = register("polished_red_sandstone_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_RED_SANDSTONE)));

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Bricks
    public static final Block RED_SANDSTONE_BRICKS = register("red_sandstone_bricks", new Block(FabricBlockSettings.copy(RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_BRICK_SLAB = register("red_sandstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_BRICK_STAIRS = register("red_sandstone_brick_stairs", new BaseConsistencyStairBlock(RED_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(SANDSTONE)));
    public static final Block RED_SANDSTONE_BRICK_WALL = register("red_sandstone_brick_wall", new WallBlock(FabricBlockSettings.copy(RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_BRICK_GATE = register("red_sandstone_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(RED_SANDSTONE_BRICKS)));

    //Cracked Bricks
    //cracked_red_sandstone_bricks
    //cracked_red_sandstone_brick_slab
    //cracked_red_sandstone_brick_stairs
    //cracked_red_sandstone_brick_pillar
    //gate

    //Mossy Bricks
    //mossy_red_sandstone_bricks
    //mossy_red_sandstone_brick_slab
    //mossy_red_sandstone_brick_stairs
    //mossy_red_sandstone_brick_wall
    //gate

    public static final Block RED_SANDSTONE_TILES = register("red_sandstone_tiles", new Block(FabricBlockSettings.copy(RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_TILE_SLAB = register("red_sandstone_tile_slab", new SlabBlock(FabricBlockSettings.copy(RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_TILE_STAIRS = register("red_sandstone_tile_stairs", new BaseConsistencyStairBlock(RED_SANDSTONE_TILES.getDefaultState(), FabricBlockSettings.copy(RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_TILE_WALL = register("red_sandstone_tile_wall", new WallBlock(FabricBlockSettings.copy(RED_SANDSTONE)));
    public static final Block RED_SANDSTONE_TILE_GATE = register("red_sandstone_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(RED_SANDSTONE)));



    //Pillars and Chiseled
    public static final Block CHISELED_RED_SANDSTONE = register("chiseled_red_sandstone", new Block(FabricBlockSettings.copy(RED_SANDSTONE)));
    //cracked_chiseled_red_sandstone_bricks
    //mossy_chiseled_red_sandstone_bricks
    public static final Block RED_SANDSTONE_PILLAR = register("red_sandstone_pillar", new PillarBlock(FabricBlockSettings.copy(RED_SANDSTONE)));
    //cracked_red_sandstone_brick_pillar
    //mossy_red_sandstone_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    //cracked carved
    //mossy carved

//Quartz

    public static final Block QUARTZ_WALL = register("quartz_wall", new WallBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));
    public static final Block QUARTZ_GATE = register("quartz_gate", new FenceGateBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));

    //Smooth
    public static final Block SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall", new WallBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));
    public static final Block SMOOTH_QUARTZ_GATE = register("smooth_quartz_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_QUARTZ)));

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cut
    public static final Block CUT_QUARTZ = register("cut_quartz", new Block(FabricBlockSettings.copy(QUARTZ_BLOCK)));
    public static final Block CUT_QUARTZ_SLAB = register("cut_quartz_slab", new SlabBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));
    public static final Block CUT_QUARTZ_STAIRS = register("cut_quartz_stairs", new BaseConsistencyStairBlock(QUARTZ_BLOCK.getDefaultState(), FabricBlockSettings.copy(QUARTZ_BLOCK)));
    public static final Block CUT_QUARTZ_WALL = register("cut_quartz_wall", new WallBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));
    public static final Block CUT_QUARTZ_GATE = register("cut_quartz_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_QUARTZ)));

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Tiles
    public static final Block QUARTZ_TILES = register("quartz_tiles", new Block(FabricBlockSettings.copy(QUARTZ_BLOCK)));
    public static final Block QUARTZ_TILE_SLAB = register("quartz_tile_slab", new SlabBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));
    public static final Block QUARTZ_TILE_STAIRS = register("quartz_tile_stairs", new BaseConsistencyStairBlock(QUARTZ_TILES.getDefaultState(), FabricBlockSettings.copy(QUARTZ_BLOCK)));
    public static final Block QUARTZ_TILE_WALL = register("quartz_tile_wall", new WallBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));
    public static final Block QUARTZ_TILE_GATE = register("quartz_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));

    //Cracked Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Polished
    public static final Block POLISHED_QUARTZ = register("polished_quartz", new Block(FabricBlockSettings.copy(QUARTZ_BLOCK)));
    public static final Block POLISHED_QUARTZ_SLAB = register("polished_quartz_slab", new SlabBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));
    public static final Block POLISHED_QUARTZ_STAIRS = register("polished_quartz_stairs", new BaseConsistencyStairBlock(QUARTZ_BLOCK.getDefaultState(), FabricBlockSettings.copy(QUARTZ_BLOCK)));
    public static final Block POLISHED_QUARTZ_WALL = register("polished_quartz_wall", new WallBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));
    public static final Block POLISHED_QUARTZ_GATE = register("polished_quartz_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_QUARTZ)));

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Bricks
    public static final Block QUARTZ_BRICK_SLAB = register("quartz_brick_slab", new SlabBlock(FabricBlockSettings.copy(QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs", new BaseConsistencyStairBlock(QUARTZ_BRICKS.getDefaultState(), FabricBlockSettings.copy(QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICK_WALL = register("quartz_brick_wall", new WallBlock(FabricBlockSettings.copy(QUARTZ_BRICKS)));
    public static final Block QUARTZ_BRICK_GATE = register("quartz_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(QUARTZ_BRICKS)));

    //Cracked Bricks
    //cracked_quartz_bricks
    //cracked_quartz_brick_slab
    //cracked_quartz_brick_stairs
    //cracked_quartz_brick_wall
    //gate

    //Mossy Bricks
    //mossy_quartz_bricks
    //mossy_quartz_brick_slab
    //mossy_quartz_brick_stairs
    //mossy_quartz_brick_wall
    //gate

    //Pillar and Chiseled
    //cracked_chiseled_quartz_bricks
    //mossy_chiseled_quartz_bricks
    //cracked_quartz_pillar
    //mossy_quartz_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    public static final Block CARVED_QUARTZ = register("carved_quartz", new Block(FabricBlockSettings.copy(QUARTZ_BLOCK)));
    //cracked carved
    //mossy carved

//Andesite
    public static final Block ANDESITE_GATE = register("andesite_gate", new FenceGateBlock(FabricBlockSettings.copy(ANDESITE)));

    // Mossy
    public static final Block MOSSY_ANDESITE = register("mossy_andesite", new Block(FabricBlockSettings.copy(ANDESITE)));
    public static final Block MOSSY_ANDESITE_SLAB = register("mossy_andesite_slab", new SlabBlock(FabricBlockSettings.copy(ANDESITE)));
    public static final Block MOSSY_ANDESITE_STAIRS = register("mossy_andesite_stairs", new BaseConsistencyStairBlock(ANDESITE.getDefaultState(), FabricBlockSettings.copy(ANDESITE)));
    public static final Block MOSSY_ANDESITE_WALL = register("mossy_andesite_wall", new WallBlock(FabricBlockSettings.copy(ANDESITE)));
    public static final Block MOSSY_ANDESITE_GATE = register("mossy_andesite_gate", new FenceGateBlock(FabricBlockSettings.copy(ANDESITE)));

    //Polished
    public static final Block POLISHED_ANDESITE_WALL = register("polished_andesite_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block POLISHED_ANDESITE_GATE = register("polished_andesite_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));

    //Cracked Polished
    public static final Block CRACKED_POLISHED_ANDESITE = register("cracked_polished_andesite", new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_POLISHED_ANDESITE_SLAB = register("cracked_polished_andesite_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_POLISHED_ANDESITE_STAIRS = register("cracked_polished_andesite_stairs", new BaseConsistencyStairBlock(POLISHED_ANDESITE.getDefaultState(), FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_POLISHED_ANDESITE_WALL = register("cracked_polished_andesite_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_POLISHED_ANDESITE_GATE = register("cracked_polished_andesite_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));

    //Mossy Polished
    public static final Block MOSSY_POLISHED_ANDESITE = register("mossy_polished_andesite", new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_POLISHED_ANDESITE_SLAB = register("mossy_polished_andesite_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_POLISHED_ANDESITE_STAIRS = register("mossy_polished_andesite_stairs", new BaseConsistencyStairBlock(POLISHED_ANDESITE.getDefaultState(), FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_POLISHED_ANDESITE_WALL = register("mossy_polished_andesite_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_POLISHED_ANDESITE_GATE = register("mossy_polished_andesite_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));

    //Smooth
    public static final Block SMOOTH_ANDESITE = register("smooth_andesite", new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block SMOOTH_ANDESITE_SLAB = register("smooth_andesite_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block SMOOTH_ANDESITE_STAIRS = register("smooth_andesite_stairs", new BaseConsistencyStairBlock(POLISHED_ANDESITE.getDefaultState(), FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block SMOOTH_ANDESITE_WALL = register("smooth_andesite_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block SMOOTH_ANDESITE_GATE = register("smooth_andesite_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_ANDESITE)));

    //Cracked Smooth
    public static final Block CRACKED_SMOOTH_ANDESITE = register("cracked_smooth_andesite", new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_SMOOTH_ANDESITE_SLAB = register("cracked_smooth_andesite_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_SMOOTH_ANDESITE_STAIRS = register("cracked_smooth_andesite_stairs", new BaseConsistencyStairBlock(POLISHED_ANDESITE.getDefaultState(), FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_SMOOTH_ANDESITE_WALL = register("cracked_smooth_andesite_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_SMOOTH_ANDESITE_GATE = register("cracked_smooth_andesite_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));

    //Mossy Smooth
    public static final Block MOSSY_SMOOTH_ANDESITE = register("mossy_smooth_andesite", new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_SMOOTH_ANDESITE_SLAB = register("mossy_smooth_andesite_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_SMOOTH_ANDESITE_STAIRS = register("mossy_smooth_andesite_stairs", new BaseConsistencyStairBlock(POLISHED_ANDESITE.getDefaultState(), FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_SMOOTH_ANDESITE_WALL = register("mossy_smooth_andesite_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_SMOOTH_ANDESITE_GATE = register("mossy_smooth_andesite_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));

    //Cut
    public static final Block CUT_ANDESITE = register("cut_andesite", new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CUT_ANDESITE_SLAB = register("cut_andesite_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CUT_ANDESITE_STAIRS = register("cut_andesite_stairs", new BaseConsistencyStairBlock(POLISHED_ANDESITE.getDefaultState(), FabricBlockSettings.copy(QUARTZ_BLOCK)));
    public static final Block CUT_ANDESITE_WALL = register("cut_andesite_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CUT_ANDESITE_GATE = register("cut_andesite_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_ANDESITE)));

    //Cracked Cut
    public static final Block CRACKED_CUT_ANDESITE = register("cracked_cut_andesite", new Block(FabricBlockSettings.copy(CUT_ANDESITE)));
    public static final Block CRACKED_CUT_ANDESITE_SLAB = register("cracked_cut_andesite_slab", new SlabBlock(FabricBlockSettings.copy(CUT_ANDESITE)));
    public static final Block CRACKED_CUT_ANDESITE_STAIRS = register("cracked_cut_andesite_stairs", new BaseConsistencyStairBlock(CUT_ANDESITE.getDefaultState(), FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_CUT_ANDESITE_WALL = register("cracked_cut_andesite_wall", new WallBlock(FabricBlockSettings.copy(CUT_ANDESITE)));
    public static final Block CRACKED_CUT_ANDESITE_GATE = register("cracked_cut_andesite_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_ANDESITE)));

    //Mossy Cut
    public static final Block MOSSY_CUT_ANDESITE = register("mossy_cut_andesite", new Block(FabricBlockSettings.copy(CUT_ANDESITE)));
    public static final Block MOSSY_CUT_ANDESITE_SLAB = register("mossy_cut_andesite_slab", new SlabBlock(FabricBlockSettings.copy(CUT_ANDESITE)));
    public static final Block MOSSY_CUT_ANDESITE_STAIRS = register("mossy_cut_andesite_stairs", new BaseConsistencyStairBlock(CUT_ANDESITE.getDefaultState(), FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_CUT_ANDESITE_WALL = register("mossy_cut_andesite_wall", new WallBlock(FabricBlockSettings.copy(CUT_ANDESITE)));
    public static final Block MOSSY_CUT_ANDESITE_GATE = register("mossy_cut_andesite_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_ANDESITE)));

    public static final Block ANDESITE_TILES = register("andesite_tiles", new Block(FabricBlockSettings.copy(ANDESITE)));
    public static final Block ANDESITE_TILE_SLAB = register("andesite_tile_slab", new SlabBlock(FabricBlockSettings.copy(ANDESITE)));
    public static final Block ANDESITE_TILE_STAIRS = register("andesite_tile_stairs", new BaseConsistencyStairBlock(ANDESITE.getDefaultState(), FabricBlockSettings.copy(ANDESITE)));
    public static final Block ANDESITE_TILE_WALL = register("andesite_tile_wall", new WallBlock(FabricBlockSettings.copy(ANDESITE)));
    public static final Block ANDESITE_TILE_GATE = register("andesite_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(ANDESITE_TILES)));

    //Cracked Bricks
    public static final Block CRACKED_ANDESITE_TILES = register("cracked_andesite_tiles", new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_ANDESITE_TILE_SLAB = register("cracked_andesite_tile_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_ANDESITE_TILE_STAIRS = register("cracked_andesite_tile_stairs", new BaseConsistencyStairBlock(POLISHED_ANDESITE.getDefaultState(), FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_ANDESITE_TILE_WALL = register("cracked_andesite_tile_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_ANDESITE_TILE_GATE = register("cracked_andesite_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(ANDESITE_TILES)));

    //Mossy Bricks
    public static final Block MOSSY_ANDESITE_TILES = register("mossy_andesite_tiles", new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_ANDESITE_TILE_SLAB = register("mossy_andesite_tile_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_ANDESITE_TILE_STAIRS = register("mossy_andesite_tile_stairs", new BaseConsistencyStairBlock(POLISHED_ANDESITE.getDefaultState(), FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_ANDESITE_TILE_WALL = register("mossy_andesite_tile_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_ANDESITE_TILE_GATE = register("mossy_andesite_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(ANDESITE_TILES)));


    public static final Block ANDESITE_BRICKS = register("andesite_bricks", new Block(FabricBlockSettings.copy(ANDESITE)));
    public static final Block ANDESITE_BRICK_SLAB = register("andesite_brick_slab", new SlabBlock(FabricBlockSettings.copy(ANDESITE)));
    public static final Block ANDESITE_BRICK_STAIRS = register("andesite_brick_stairs", new BaseConsistencyStairBlock(ANDESITE.getDefaultState(), FabricBlockSettings.copy(ANDESITE)));
    public static final Block ANDESITE_BRICK_WALL = register("andesite_brick_wall", new WallBlock(FabricBlockSettings.copy(ANDESITE)));
    public static final Block ANDESITE_BRICK_GATE = register("andesite_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(ANDESITE_BRICKS)));

    //Cracked Bricks
    public static final Block CRACKED_ANDESITE_BRICKS = register("cracked_andesite_bricks", new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_ANDESITE_BRICK_SLAB = register("cracked_andesite_brick_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_ANDESITE_BRICK_STAIRS = register("cracked_andesite_brick_stairs", new BaseConsistencyStairBlock(POLISHED_ANDESITE.getDefaultState(), FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_ANDESITE_BRICK_WALL = register("cracked_andesite_brick_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_ANDESITE_BRICK_GATE = register("cracked_andesite_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(ANDESITE_BRICKS)));

    //Mossy Bricks
    public static final Block MOSSY_ANDESITE_BRICKS = register("mossy_andesite_bricks", new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_ANDESITE_BRICK_SLAB = register("mossy_andesite_brick_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_ANDESITE_BRICK_STAIRS = register("mossy_andesite_brick_stairs", new BaseConsistencyStairBlock(POLISHED_ANDESITE.getDefaultState(), FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_ANDESITE_BRICK_WALL = register("mossy_andesite_brick_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_ANDESITE_BRICK_GATE = register("mossy_andesite_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(ANDESITE_BRICKS)));

    //Pillars and Chiseled
    public static final Block ANDESITE_PILLAR = register("andesite_pillar", new PillarBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_ANDESITE_PILLAR = register("cracked_andesite_pillar", new PillarBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_ANDESITE_PILLAR = register("mossy_andesite_pillar", new PillarBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CHISELED_ANDESITE = register("chiseled_andesite", new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_CHISELED_ANDESITE = register("cracked_chiseled_andesite", new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_CHISELED_ANDESITE = register("mossy_chiseled_andesite", new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    public static final Block CARVED_ANDESITE = register("carved_andesite", new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block CRACKED_CARVED_ANDESITE = register("cracked_carved_andesite", new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));
    public static final Block MOSSY_CARVED_ANDESITE = register("mossy_carved_andesite", new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));

//Diorite
    public static final Block DIORITE_GATE = register("diorite_gate", new FenceGateBlock(FabricBlockSettings.copy(DIORITE)));

    //Polished
    public static final Block POLISHED_DIORITE_WALL = register("polished_diorite_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_DIORITE)));
    public static final Block POLISHED_DIORITE_GATE = register("polished_diorite_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_DIORITE)));

    //Smooth
    public static final Block SMOOTH_DIORITE = register("smooth_diorite", new Block(FabricBlockSettings.copy(DIORITE)));
    public static final Block SMOOTH_DIORITE_SLAB = register("smooth_diorite_slab", new SlabBlock(FabricBlockSettings.copy(DIORITE)));
    public static final Block SMOOTH_DIORITE_STAIRS = register("smooth_diorite_stairs", new BaseConsistencyStairBlock(DIORITE.getDefaultState(), FabricBlockSettings.copy(DIORITE)));
    public static final Block SMOOTH_DIORITE_WALL = register("smooth_diorite_wall", new WallBlock(FabricBlockSettings.copy(DIORITE)));
    public static final Block SMOOTH_DIORITE_GATE = register("smooth_diorite_gate", new FenceGateBlock(FabricBlockSettings.copy(DIORITE)));

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cut
    public static final Block CUT_DIORITE = register("cut_diorite", new Block(FabricBlockSettings.copy(DIORITE)));
    public static final Block CUT_DIORITE_SLAB = register("cut_diorite_slab", new SlabBlock(FabricBlockSettings.copy(DIORITE)));
    public static final Block CUT_DIORITE_STAIRS = register("cut_diorite_stairs", new BaseConsistencyStairBlock(DIORITE.getDefaultState(), FabricBlockSettings.copy(DIORITE)));
    public static final Block CUT_DIORITE_WALL = register("cut_diorite_wall", new WallBlock(FabricBlockSettings.copy(DIORITE)));
    public static final Block CUT_DIORITE_GATE = register("cut_diorite_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_DIORITE)));

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    public static final Block DIORITE_TILES = register("diorite_tiles", new Block(FabricBlockSettings.copy(DIORITE)));
    public static final Block DIORITE_TILE_SLAB = register("diorite_tile_slab", new SlabBlock(FabricBlockSettings.copy(DIORITE)));
    public static final Block DIORITE_TILE_STAIRS = register("diorite_tile_stairs", new BaseConsistencyStairBlock(DIORITE_TILES.getDefaultState(), FabricBlockSettings.copy(DIORITE)));
    public static final Block DIORITE_TILE_WALL = register("diorite_tile_wall", new WallBlock(FabricBlockSettings.copy(DIORITE)));
    public static final Block DIORITE_TILE_GATE = register("diorite_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(DIORITE)));

    //Cracked Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Bricks
    public static final Block DIORITE_BRICKS = register("diorite_bricks", new Block(FabricBlockSettings.copy(DIORITE)));
    public static final Block DIORITE_BRICK_SLAB = register("diorite_brick_slab", new SlabBlock(FabricBlockSettings.copy(DIORITE)));
    public static final Block DIORITE_BRICK_STAIRS = register("diorite_brick_stairs", new BaseConsistencyStairBlock(DIORITE.getDefaultState(), FabricBlockSettings.copy(DIORITE)));
    public static final Block DIORITE_BRICK_WALL = register("diorite_brick_wall", new WallBlock(FabricBlockSettings.copy(DIORITE)));
    public static final Block DIORITE_BRICK_GATE = register("diorite_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(DIORITE_BRICKS)));

    //Cracked Bricks
    //cracked_diorite_bricks
    //cracked_diorite_brick_slab
    //cracked_diorite_brick_stairs
    //cracked_diorite_brick_wall
    //gate

    //Mossy Bricks
    //mossy_diorite_bricks
    //mossy_diorite_brick_slab
    //mossy_diorite_brick_stairs
    //mossy_diorite_brick_wall
    //gate

    //Pillars and Chiseled
    public static final Block DIORITE_PILLAR = register("diorite_pillar", new PillarBlock(FabricBlockSettings.copy(POLISHED_DIORITE)));
    //cracked_diorite_pillar
    //mossy_diorite_pillar
    public static final Block CHISELED_DIORITE = register("chiseled_diorite", new Block(FabricBlockSettings.copy(POLISHED_DIORITE)));
    //cracked_chiseled_diorite_bricks
    //mossy_chiseled_diorite_bricks
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    public static final Block CARVED_DIORITE = register("carved_diorite", new Block(FabricBlockSettings.copy(POLISHED_DIORITE)));
    //cracked carved
    //mossy carved


//Granite
    public static final Block GRANITE_GATE = register("granite_gate", new FenceGateBlock(FabricBlockSettings.copy(GRANITE)));

    //Polished
    public static final Block POLISHED_GRANITE_WALL = register("polished_granite_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_GRANITE)));
    public static final Block POLISHED_GRANITE_GATE = register("polished_granite_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_GRANITE)));

    //Smooth
    public static final Block SMOOTH_GRANITE = register("smooth_granite", new Block(FabricBlockSettings.copy(GRANITE)));
    public static final Block SMOOTH_GRANITE_SLAB = register("smooth_granite_slab", new SlabBlock(FabricBlockSettings.copy(GRANITE)));
    public static final Block SMOOTH_GRANITE_STAIRS = register("smooth_granite_stairs", new BaseConsistencyStairBlock(GRANITE.getDefaultState(), FabricBlockSettings.copy(GRANITE)));
    public static final Block SMOOTH_GRANITE_WALL = register("smooth_granite_wall", new WallBlock(FabricBlockSettings.copy(GRANITE)));
    public static final Block SMOOTH_GRANITE_GATE = register("smooth_granite_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_GRANITE)));

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cut
    public static final Block CUT_GRANITE = register("cut_granite", new Block(FabricBlockSettings.copy(POLISHED_GRANITE)));
    public static final Block CUT_GRANITE_SLAB = register("cut_granite_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_GRANITE)));
    public static final Block CUT_GRANITE_STAIRS = register("cut_granite_stairs", new BaseConsistencyStairBlock(POLISHED_GRANITE.getDefaultState(), FabricBlockSettings.copy(QUARTZ_BLOCK)));
    public static final Block CUT_GRANITE_WALL = register("cut_granite_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_GRANITE)));
    public static final Block CUT_GRANITE_GATE = register("cut_granite_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_GRANITE)));

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Tiles
    public static final Block GRANITE_TILES = register("granite_tiles", new Block(FabricBlockSettings.copy(GRANITE)));
    public static final Block GRANITE_TILE_SLAB = register("granite_tile_slab", new SlabBlock(FabricBlockSettings.copy(GRANITE)));
    public static final Block GRANITE_TILE_STAIRS = register("granite_tile_stairs", new BaseConsistencyStairBlock(GRANITE_TILES.getDefaultState(), FabricBlockSettings.copy(GRANITE)));
    public static final Block GRANITE_TILE_WALL = register("granite_tile_wall", new WallBlock(FabricBlockSettings.copy(GRANITE)));
    public static final Block GRANITE_TILE_GATE = register("granite_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(GRANITE)));

    //Cracked Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Bricks
    public static final Block GRANITE_BRICKS = register("granite_bricks", new Block(FabricBlockSettings.copy(GRANITE)));
    public static final Block GRANITE_BRICK_SLAB = register("granite_brick_slab", new SlabBlock(FabricBlockSettings.copy(GRANITE)));
    public static final Block GRANITE_BRICK_STAIRS = register("granite_brick_stairs", new BaseConsistencyStairBlock(GRANITE.getDefaultState(), FabricBlockSettings.copy(GRANITE)));
    public static final Block GRANITE_BRICK_WALL = register("granite_brick_wall", new WallBlock(FabricBlockSettings.copy(GRANITE)));
    public static final Block GRANITE_BRICK_GATE = register("granite_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(GRANITE_BRICKS)));

    //Cracked Bricks
    //cracked_granite_bricks
    //cracked_granite_brick_slab
    //cracked_granite_brick_stairs
    //cracked_granite_brick_wall
    //gate

    //Mossy Bricks
    //mossy_granite_bricks
    //mossy_granite_brick_slab
    //mossy_granite_brick_stairs
    //mossy_granite_brick_wall
    //gate

    //Pillars and Chiseled
    public static final Block GRANITE_PILLAR = register("granite_pillar", new PillarBlock(FabricBlockSettings.copy(POLISHED_GRANITE)));
    //cracked_granite_pillar
    //mossy_granite_pillar
    public static final Block CHISELED_GRANITE = register("chiseled_granite", new Block(FabricBlockSettings.copy(POLISHED_GRANITE)));
    //cracked_chiseled_granite_bricks
    //mossy_chiseled_granite_bricks
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    public static final Block CARVED_GRANITE = register("carved_granite", new Block(FabricBlockSettings.copy(POLISHED_GRANITE)));
    //cracked carved
    //mossy carved

//Clay
//Clay will have a rework eventually, none of this is final
    public static final Block CLAY_SLAB = register("clay_slab", new SlabBlock(FabricBlockSettings.copy(CLAY)));
    public static final Block CLAY_STAIRS = register("clay_stairs", new BaseConsistencyStairBlock(CLAY.getDefaultState(), FabricBlockSettings.copy(CLAY)));
    public static final Block CLAY_WALL = register("clay_wall", new WallBlock(FabricBlockSettings.copy(CLAY)));


    //Cracked Polished
    //block
    //slab
    //stairs
    //wall

    //Mossy Polished
    //block
    //slab
    //stairs
    //wall


    //Bricks
    public static final Block BRICK_GATE = register("brick_gate", new FenceGateBlock(FabricBlockSettings.copy(BRICKS)));

    //Cracked Bricks
    //cracked_bricks
    //cracked_brick_slab
    //cracked_brick_stairs
    //cracked_brick_wall
    //gate

    //Mossy Bricks
    //mossy_bricks
    //mossy_brick_slab
    //mossy_brick_stairs
    //mossy_brick_wall
    //gate

    //Pillars and Chiseled
    public static final Block CHISELED_BRICKS = register("chiseled_bricks", new Block(FabricBlockSettings.copy(BRICKS)));
    //mossy_chiseled_bricks
    //cracked_chiseled_bricks
    public static final Block BRICK_PILLAR = register("brick_pillar", new PillarBlock(FabricBlockSettings.copy(BRICKS)));
    //mossy_brick_pillar
    //cracked_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    public static final Block CARVED_BRICKS = register("carved_bricks", new Block(FabricBlockSettings.copy(BRICKS)));
    //cracked carved
    //mossy carved


//Nether Bricks
//Nether Bricks will have a rework eventually, none of this is final
    //Cracked Bricks
    public static final Block CRACKED_NETHER_BRICK_SLAB = register("cracked_nether_brick_slab", new SlabBlock(FabricBlockSettings.copy(NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_STAIRS = register("cracked_nether_brick_stairs", new BaseConsistencyStairBlock(NETHER_BRICKS.getDefaultState(), FabricBlockSettings.copy(NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_WALL = register("cracked_nether_brick_wall", new WallBlock(FabricBlockSettings.copy(NETHER_BRICKS)));
    public static final Block CRACKED_NETHER_BRICK_FENCE_GATE = register("cracked_nether_brick_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(NETHER_BRICKS)));

    //Mossy Bricks
    //mossy_nether_bricks
    //mossy_nether_brick_slab
    //mossy_nether_brick_stairs
    //mossy_nether_brick_wall
    //gate

    //Pillars and Chiseled
    public static final Block CHISELED_NETHER_BRICKS = register("chiseled_nether_bricks", new Block(FabricBlockSettings.copy(NETHER_BRICKS)));
    //mossy_chiseled_nether_bricks
    //cracked_chiseled_nether_bricks
    public static final Block NETHER_BRICK_PILLAR = register("nether_brick_pillar", new PillarBlock(FabricBlockSettings.copy(NETHER_BRICKS)));
    //mossy_nether_brick_pillar
    //cracked_nether_brick_pillar

    //Red Nether Bricks
    public static final Block RED_NETHER_BRICK_FENCE_GATE = register("red_nether_brick_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(RED_NETHER_BRICKS)));

    //Cracked Bricks
    //cracked_red_nether_bricks
    //cracked_red_nether_brick_slab
    //cracked_red_nether_brick_stairs
    //cracked_red_nether_brick_wall
    //gate

    //Mossy Bricks
    //mossy_red_nether_bricks
    //mossy_red_nether_brick_slab
    //mossy_red_nether_brick_stairs
    //mossy_red_nether_brick_wall
    //gate

    //Pillars and Chiseled
    public static final Block CHISELED_RED_NETHER_BRICKS = register("chiseled_red_nether_bricks", new Block(FabricBlockSettings.copy(RED_NETHER_BRICKS)));
    //mossy_chiseled_red_nether_bricks
    //cracked_chiseled_red_nether_bricks
    public static final Block RED_NETHER_BRICK_PILLAR = register("red_nether_brick_pillar", new PillarBlock(FabricBlockSettings.copy(RED_NETHER_BRICKS)));
    //mossy_red_nether_brick_pillar
    //cracked_red_nether_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    public static final Block CARVED_RED_NETHER_BRICKS = register("carved_red_nether_bricks", new Block(FabricBlockSettings.copy(RED_NETHER_BRICKS)));
    //cracked carved
    //mossy carved


//Blue Nether Bricks
//Blue Nether Bricks will have a rework eventually, none of this is final
    //Bricks
    public static final Block BLUE_NETHER_BRICKS = register("blue_nether_bricks", new Block(FabricBlockSettings.copy(NETHER_BRICKS)));
    public static final Block BLUE_NETHER_BRICK_SLAB = register("blue_nether_brick_slab", new SlabBlock(FabricBlockSettings.copy(NETHER_BRICKS)));
    public static final Block BLUE_NETHER_BRICK_STAIRS = register("blue_nether_brick_stairs", new BaseConsistencyStairBlock(NETHER_BRICKS.getDefaultState(), FabricBlockSettings.copy(NETHER_BRICKS)));
    public static final Block BLUE_NETHER_BRICK_WALL = register("blue_nether_brick_wall", new WallBlock(FabricBlockSettings.copy(NETHER_BRICKS)));
    public static final Block BLUE_NETHER_BRICK_FENCE_GATE = register("blue_nether_brick_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(BLUE_NETHER_BRICKS)));

    //Cracked Bricks
    public static final Block CRACKED_BLUE_NETHER_BRICKS = register("cracked_blue_nether_bricks", new Block(FabricBlockSettings.copy(CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_BLUE_NETHER_BRICK_SLAB = register("cracked_blue_nether_brick_slab", new SlabBlock(FabricBlockSettings.copy(CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_BLUE_NETHER_BRICK_STAIRS = register("cracked_blue_nether_brick_stairs", new BaseConsistencyStairBlock(CRACKED_NETHER_BRICKS.getDefaultState(), FabricBlockSettings.copy(NETHER_BRICKS)));
    public static final Block CRACKED_BLUE_NETHER_BRICK_WALL = register("cracked_blue_nether_brick_wall", new WallBlock(FabricBlockSettings.copy(CRACKED_NETHER_BRICKS)));
    public static final Block CRACKED_BLUE_NETHER_BRICK_FENCE_GATE = register("cracked_blue_nether_brick_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(CRACKED_BLUE_NETHER_BRICKS)));

    //Mossy Bricks
    //mossy_blue_nether_bricks
    //mossy_blue_nether_brick_slab
    //mossy_blue_nether_brick_stairs
    //mossy_blue_nether_brick_wall
    //gate

    //Pillars and Chiseled
    public static final Block CHISELED_BLUE_NETHER_BRICKS = register("chiseled_blue_nether_bricks", new Block(FabricBlockSettings.copy(BLUE_NETHER_BRICKS)));
    //mossy_chiseled_blue_nether_bricks
    //cracked_chiseled_blue_nether_bricks
    public static final Block BLUE_NETHER_BRICK_PILLAR = register("blue_nether_brick_pillar", new PillarBlock(FabricBlockSettings.copy(BLUE_NETHER_BRICKS)));
    //mossy_blue_nether_brick_pillar
    //cracked_blue_nether_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    public static final Block CARVED_BLUE_NETHER_BRICKS = register("carved_blue_nether_bricks", new Block(FabricBlockSettings.copy(BLUE_NETHER_BRICKS)));
    //cracked carved
    //mossy carved


//Prismarine
    public static final Block PRISMARINE_GATE = register("prismarine_gate", new FenceGateBlock(FabricBlockSettings.copy(PRISMARINE)));

    //Polished
    public static final Block POLISHED_PRISMARINE = register("polished_prismarine", new Block(FabricBlockSettings.copy(PRISMARINE)));
    public static final Block POLISHED_PRISMARINE_SLAB = register("polished_prismarine_slab", new SlabBlock(FabricBlockSettings.copy(PRISMARINE)));
    public static final Block POLISHED_PRISMARINE_STAIRS = register("polished_prismarine_stairs", new BaseConsistencyStairBlock(POLISHED_PRISMARINE.getDefaultState(), FabricBlockSettings.copy(PRISMARINE)));
    public static final Block POLISHED_PRISMARINE_WALL = register("polished_prismarine_wall", new WallBlock(FabricBlockSettings.copy(PRISMARINE)));
    public static final Block POLISHED_PRISMARINE_GATE = register("polished_prismarine_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_PRISMARINE)));

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Smooth
    public static final Block SMOOTH_PRISMARINE = register("smooth_prismarine", new Block(FabricBlockSettings.copy(PRISMARINE)));
    public static final Block SMOOTH_PRISMARINE_SLAB = register("smooth_prismarine_slab", new SlabBlock(FabricBlockSettings.copy(PRISMARINE)));
    public static final Block SMOOTH_PRISMARINE_STAIRS = register("smooth_prismarine_stairs", new BaseConsistencyStairBlock(SMOOTH_PRISMARINE.getDefaultState(), FabricBlockSettings.copy(PRISMARINE)));
    public static final Block SMOOTH_PRISMARINE_WALL = register("smooth_prismarine_wall", new WallBlock(FabricBlockSettings.copy(PRISMARINE)));
    public static final Block SMOOTH_PRISMARINE_GATE = register("smooth_prismarine_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_PRISMARINE)));

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cut
        public static final Block CUT_PRISMARINE = register("cut_prismarine", new Block(FabricBlockSettings.copy(PRISMARINE)));
        public static final Block CUT_PRISMARINE_SLAB = register("cut_prismarine_slab", new SlabBlock(FabricBlockSettings.copy(PRISMARINE)));
        public static final Block CUT_PRISMARINE_STAIRS = register("cut_prismarine_stairs", new BaseConsistencyStairBlock(CUT_PRISMARINE.getDefaultState(), FabricBlockSettings.copy(PRISMARINE)));
        public static final Block CUT_PRISMARINE_WALL = register("cut_prismarine_wall", new WallBlock(FabricBlockSettings.copy(PRISMARINE)));
        public static final Block CUT_PRISMARINE_GATE = register("cut_prismarine_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_PRISMARINE)));

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Tiles
    public static final Block PRISMARINE_TILES = register("prismarine_tiles", new Block(FabricBlockSettings.copy(PRISMARINE)));
    public static final Block PRISMARINE_TILE_SLAB = register("prismarine_tile_slab", new SlabBlock(FabricBlockSettings.copy(PRISMARINE)));
    public static final Block PRISMARINE_TILE_STAIRS = register("prismarine_tile_stairs", new BaseConsistencyStairBlock(PRISMARINE_TILES.getDefaultState(), FabricBlockSettings.copy(PRISMARINE)));
    public static final Block PRISMARINE_TILE_WALL = register("prismarine_tile_wall", new WallBlock(FabricBlockSettings.copy(PRISMARINE)));
    public static final Block PRISMARINE_TILE_GATE = register("prismarine_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(PRISMARINE)));

    //Cracked Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Tiles
    //block
    //slab
    //stairs
    //wall
    //gate


    //Bricks
    public static final Block PRISMARINE_BRICK_WALL = register("prismarine_brick_wall", new WallBlock(FabricBlockSettings.copy(PRISMARINE_BRICKS)));
    public static final Block PRISMARINE_BRICK_GATE = register("prismarine_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(PRISMARINE_BRICKS)));

    //Cracked Bricks
    //cracked_prismarine_bricks
    //cracked_prismarine_brick_slab
    //cracked_prismarine_brick_stairs
    //cracked_prismarine_brick_wall
    //gate

    //Mossy Bricks
    //mossy_prismarine_bricks
    //mossy_prismarine_brick_slab
    //mossy_prismarine_brick_stairs
    //mossy_prismarine_brick_wall
    //gate

    //Pillar and Chiseled
    public static final Block CHISELED_PRISMARINE = register("chiseled_prismarine", new Block(FabricBlockSettings.copy(PRISMARINE_BRICKS)));
    //mossy_chiseled_prismarine
    //cracked_chiseled_prismarine
    public static final Block PRISMARINE_PILLAR = register("prismarine_pillar", new PillarBlock(FabricBlockSettings.copy(PRISMARINE_BRICKS)));
    //mossy_prismarine_pillar
    //cracked_prismarine_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    public static final Block CARVED_PRISMARINE = register("carved_prismarine", new Block(FabricBlockSettings.copy(PRISMARINE_BRICKS)));
    //cracked carved
    //mossy carved


//Dark Prismarine
    public static final Block DARK_PRISMARINE_WALL = register("dark_prismarine_wall", new WallBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_GATE = register("dark_prismarine_gate", new FenceGateBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));

    //Polished
    public static final Block POLISHED_DARK_PRISMARINE = register("polished_dark_prismarine", new Block(FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block POLISHED_DARK_PRISMARINE_SLAB = register("polished_dark_prismarine_slab", new SlabBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block POLISHED_DARK_PRISMARINE_STAIRS = register("polished_dark_prismarine_stairs", new BaseConsistencyStairBlock(DARK_PRISMARINE.getDefaultState(), FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block POLISHED_DARK_PRISMARINE_WALL = register("polished_dark_prismarine_wall", new WallBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block POLISHED_DARK_PRISMARINE_GATE = register("polished_dark_prismarine_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_DARK_PRISMARINE)));

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Smooth
    public static final Block SMOOTH_DARK_PRISMARINE = register("smooth_dark_prismarine", new Block(FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block SMOOTH_DARK_PRISMARINE_SLAB = register("smooth_dark_prismarine_slab", new SlabBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block SMOOTH_DARK_PRISMARINE_STAIRS = register("smooth_dark_prismarine_stairs", new BaseConsistencyStairBlock(SMOOTH_DARK_PRISMARINE.getDefaultState(), FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block SMOOTH_DARK_PRISMARINE_WALL = register("smooth_dark_prismarine_wall", new WallBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block SMOOTH_DARK_PRISMARINE_GATE = register("smooth_dark_prismarine_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_DARK_PRISMARINE)));

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cut
    public static final Block CUT_DARK_PRISMARINE = register("cut_dark_prismarine", new Block(FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block CUT_DARK_PRISMARINE_SLAB = register("cut_dark_prismarine_slab", new SlabBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block CUT_DARK_PRISMARINE_STAIRS = register("cut_dark_prismarine_stairs", new BaseConsistencyStairBlock(DARK_PRISMARINE.getDefaultState(), FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block CUT_DARK_PRISMARINE_WALL = register("cut_dark_prismarine_wall", new WallBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block CUT_DARK_PRISMARINE_GATE = register("cut_dark_prismarine_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_DARK_PRISMARINE)));

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Tiles
    public static final Block DARK_PRISMARINE_TILES = register("dark_prismarine_tiles", new Block(FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_TILE_SLAB = register("dark_prismarine_tile_slab", new SlabBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_TILE_STAIRS = register("dark_prismarine_tile_stairs", new BaseConsistencyStairBlock(DARK_PRISMARINE_TILES.getDefaultState(), FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_TILE_WALL = register("dark_prismarine_tile_wall", new WallBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_TILE_GATE = register("dark_prismarine_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));

    //Cracked Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Bricks
    public static final Block DARK_PRISMARINE_BRICKS = register("dark_prismarine_bricks", new Block(FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_BRICK_SLAB = register("dark_prismarine_brick_slab", new SlabBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_BRICK_STAIRS = register("dark_prismarine_brick_stairs", new BaseConsistencyStairBlock(DARK_PRISMARINE.getDefaultState(), FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_BRICK_WALL = register("dark_prismarine_brick_wall", new WallBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));
    public static final Block DARK_PRISMARINE_BRICK_GATE = register("dark_prismarine_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(DARK_PRISMARINE_BRICKS)));

    //Cracked Bricks
    //cracked_dark_prismarine_bricks
    //cracked_dark_prismarine_brick_slab
    //cracked_dark_prismarine_brick_stairs
    //cracked_dark_prismarine_brick_wall
    //gate

    //Mossy Bricks
    //mossy_dark_prismarine_bricks
    //mossy_dark_prismarine_brick_slab
    //mossy_dark_prismarine_brick_stairs
    //mossy_dark_prismarine_brick_wall
    //gate

    //Pillar and Chiseled
    public static final Block CHISELED_DARK_PRISMARINE = register("chiseled_dark_prismarine", new Block(FabricBlockSettings.copy(DARK_PRISMARINE)));
    //mossy_chiseled_dark_prismarine
    //cracked_chiseled_dark_prismarine
    public static final Block DARK_PRISMARINE_PILLAR = register("dark_prismarine_pillar", new PillarBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));
    //mossy_dark_prismarine_pillar
    //cracked_dark_prismarine_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    public static final Block CARVED_DARK_PRISMARINE = register("carved_dark_prismarine", new Block(FabricBlockSettings.copy(DARK_PRISMARINE)));
    //cracked carved
    //mossy carved


//Purpur

    public static final Block PURPUR_BLOCK = register("purpur_block", new Block(FabricBlockSettings.copy(PURPUR_PILLAR)));
    public static final Block PURPUR_SLAB = register("purpur_slab", new SlabBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block PURPUR_STAIRS = register("purpur_stairs", new BaseConsistencyStairBlock(PURPUR_BLOCK.getDefaultState(), FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block PURPUR_WALL = register("purpur_wall", new WallBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block PURPUR_GATE = register("purpur_gate", new FenceGateBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));

    //Smooth
    public static final Block SMOOTH_PURPUR_BLOCK = register("smooth_purpur_block", new Block(FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block SMOOTH_PURPUR_SLAB = register("smooth_purpur_slab", new SlabBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block SMOOTH_PURPUR_STAIRS = register("smooth_purpur_stairs", new BaseConsistencyStairBlock(PURPUR_BLOCK.getDefaultState(), FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block SMOOTH_PURPUR_WALL = register("smooth_purpur_wall", new WallBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block SMOOTH_PURPUR_GATE = register("smooth_purpur_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_PURPUR_BLOCK)));

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Polished
    public static final Block POLISHED_PURPUR_BLOCK = register("polished_purpur_block", new Block(FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block POLISHED_PURPUR_SLAB = register("polished_purpur_slab", new SlabBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block POLISHED_PURPUR_STAIRS = register("polished_purpur_stairs", new BaseConsistencyStairBlock(PURPUR_BLOCK.getDefaultState(), FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block POLISHED_PURPUR_WALL = register("polished_purpur_wall", new WallBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block POLISHED_PURPUR_GATE = register("polished_purpur_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_PURPUR_BLOCK)));

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cut
    public static final Block CUT_PURPUR = register("cut_purpur", new Block(FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block CUT_PURPUR_SLAB = register("cut_purpur_slab", new SlabBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block CUT_PURPUR_STAIRS = register("cut_purpur_stairs", new BaseConsistencyStairBlock(CUT_PURPUR.getDefaultState(), FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block CUT_PURPUR_WALL = register("cut_purpur_wall", new WallBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.PURPUR_BLOCK)));
    public static final Block CUT_PURPUR_GATE = register("cut_purpur_gate", new FenceGateBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.PURPUR_BLOCK)));

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    public static final Block PURPUR_TILE_WALL = register("purpur_tile_wall", new WallBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.PURPUR_BLOCK)));
    public static final Block PURPUR_TILE_GATE = register("purpur_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(net.minecraft.block.Blocks.PURPUR_BLOCK)));

    //Cracked Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Bricks
    public static final Block PURPUR_BRICKS = register("purpur_bricks", new Block(FabricBlockSettings.copy(PURPUR_PILLAR)));
    public static final Block PURPUR_BRICK_SLAB = register("purpur_brick_slab", new SlabBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block PURPUR_BRICK_STAIRS = register("purpur_brick_stairs", new BaseConsistencyStairBlock(PURPUR_BLOCK.getDefaultState(), FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block PURPUR_BRICK_WALL = register("purpur_brick_wall", new WallBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block PURPUR_BRICK_GATE = register("purpur_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(PURPUR_BRICKS)));

    //Cracked Bricks
    public static final Block CRACKED_PURPUR_BRICKS = register("cracked_purpur_bricks", new Block(FabricBlockSettings.copy(PURPUR_PILLAR)));
    public static final Block CRACKED_PURPUR_BRICK_SLAB = register("cracked_purpur_brick_slab", new SlabBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block CRACKED_PURPUR_BRICK_STAIRS = register("cracked_purpur_brick_stairs", new BaseConsistencyStairBlock(PURPUR_BLOCK.getDefaultState(), FabricBlockSettings.copy(PURPUR_BLOCK)));
    public static final Block CRACKED_PURPUR_BRICK_WALL = register("cracked_purpur_brick_wall", new WallBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
    //gate

    //Mossy Bricks
    //mossy_purpur_bricks
    //mossy_purpur_brick_slab
    //mossy_purpur_brick_stairs
    //mossy_purpur_brick_wall
    //gate

    //Pillars and Chiseled
    public static final Block CHISELED_PURPUR_BLOCK = register("chiseled_purpur_block", new Block(FabricBlockSettings.copy(PURPUR_BLOCK)));
    //mossy_chiseled_purpur
    //cracked_chiseled_purpur
    //mossy_purpur_pillar
    //cracked_purpur_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    public static final Block CARVED_PURPUR = register("carved_purpur", new Block(FabricBlockSettings.copy(PURPUR_BLOCK)));
    //cracked carved
    //mossy carved


//End Stone
    public static final Block END_STONE_BRICK_GATE = register("end_stone_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(END_STONE_BRICKS)));

    //Block
    public static final Block END_STONE_SLAB = register("end_stone_slab", new SlabBlock(FabricBlockSettings.copy(END_STONE)));
    public static final Block END_STONE_STAIRS = register("end_stone_stairs", new BaseConsistencyStairBlock(END_STONE.getDefaultState(), FabricBlockSettings.copy(END_STONE)));
    public static final Block END_STONE_WALL = register("end_stone_wall", new WallBlock(FabricBlockSettings.copy(END_STONE)));
    public static final Block END_STONE_GATE = register("end_stone_gate", new FenceGateBlock(FabricBlockSettings.copy(END_STONE)));

    //Smooth
    public static final Block SMOOTH_END_STONE = register("smooth_end_stone", new Block(FabricBlockSettings.copy(END_STONE)));
    public static final Block SMOOTH_END_STONE_SLAB = register("smooth_end_stone_slab", new SlabBlock(FabricBlockSettings.copy(END_STONE)));
    public static final Block SMOOTH_END_STONE_STAIRS = register("smooth_end_stone_stairs", new BaseConsistencyStairBlock(END_STONE.getDefaultState(), FabricBlockSettings.copy(END_STONE)));
    public static final Block SMOOTH_END_STONE_WALL = register("smooth_end_stone_wall", new WallBlock(FabricBlockSettings.copy(END_STONE)));
    public static final Block SMOOTH_END_STONE_GATE = register("smooth_end_stone_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_END_STONE)));

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Polished
    public static final Block POLISHED_END_STONE = register("polished_end_stone", new Block(FabricBlockSettings.copy(END_STONE)));
    public static final Block POLISHED_END_STONE_SLAB = register("polished_end_stone_slab", new SlabBlock(FabricBlockSettings.copy(END_STONE)));
    public static final Block POLISHED_END_STONE_STAIRS = register("polished_end_stone_stairs", new BaseConsistencyStairBlock(END_STONE.getDefaultState(), FabricBlockSettings.copy(END_STONE)));
    public static final Block POLISHED_END_STONE_WALL = register("polished_end_stone_wall", new WallBlock(FabricBlockSettings.copy(END_STONE)));
    public static final Block POLISHED_END_STONE_GATE = register("polished_end_stone_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_END_STONE)));

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cut
    public static final Block CUT_END_STONE = register("cut_end_stone", new Block(FabricBlockSettings.copy(END_STONE)));
    public static final Block CUT_END_STONE_SLAB = register("cut_end_stone_slab", new SlabBlock(FabricBlockSettings.copy(END_STONE)));
    public static final Block CUT_END_STONE_STAIRS = register("cut_end_stone_stairs", new BaseConsistencyStairBlock(END_STONE.getDefaultState(), FabricBlockSettings.copy(END_STONE)));
    public static final Block CUT_END_STONE_WALL = register("cut_end_stone_wall", new WallBlock(FabricBlockSettings.copy(END_STONE)));
    public static final Block CUT_END_STONE_GATE = register("cut_end_stone_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_END_STONE)));

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Tiles
    public static final Block END_STONE_TILES = register("end_stone_tiles", new Block(FabricBlockSettings.copy(END_STONE)));
    public static final Block END_STONE_TILE_SLAB = register("end_stone_tile_slab", new SlabBlock(FabricBlockSettings.copy(END_STONE)));
    public static final Block END_STONE_TILE_STAIRS = register("end_stone_tile_stairs", new BaseConsistencyStairBlock(END_STONE_TILES.getDefaultState(), FabricBlockSettings.copy(END_STONE)));
    public static final Block END_STONE_TILE_WALL = register("end_stone_tile_wall", new WallBlock(FabricBlockSettings.copy(END_STONE)));
    public static final Block END_STONE_TILE_GATE = register("end_stone_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(END_STONE)));

    //Cracked Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cracked Bricks
    //cracked_end_stone_bricks
    //cracked_end_stone_brick_slab
    //cracked_end_stone_brick_stairs
    //cracked_end_stone_brick_wall
    //gate

    //Mossy Bricks
    //mossy_end_stone_bricks
    //mossy_end_stone_brick_slab
    //mossy_end_stone_brick_stairs
    //mossy_end_stone_brick_wall
    //gate

    //Pillars and Chiseled
    public static final Block CHISELED_END_STONE = register("chiseled_end_stone", new Block(FabricBlockSettings.copy(END_STONE)));
    //mossy_chiseled_end_stone_bricks
    //cracked_chiseled_end_stone_bricks
    public static final Block END_STONE_BRICK_PILLAR = register("end_stone_brick_pillar", new PillarBlock(FabricBlockSettings.copy(END_STONE_BRICKS)));
    //mossy_end_stone_brick_pillar
    //cracked_end_stone_brick_pillar
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    public static final Block CARVED_END_STONE = register("carved_end_stone", new Block(FabricBlockSettings.copy(END_STONE_BRICKS)));
    //cracked carved
    //mossy carved


//Soul Sandstone
    public static final Block SOUL_SANDSTONE = register("soul_sandstone", new Block(FabricBlockSettings.of(Material.STONE).strength(0.8F)));
    public static final Block SOUL_SANDSTONE_SLAB = register("soul_sandstone_slab", new SlabBlock(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block SOUL_SANDSTONE_STAIRS = register("soul_sandstone_stairs", new BaseConsistencyStairBlock(SOUL_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block SOUL_SANDSTONE_WALL = register("soul_sandstone_wall", new WallBlock(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block SOUL_SANDSTONE_GATE = register("soul_sandstone_gate", new FenceGateBlock(FabricBlockSettings.copy(SOUL_SANDSTONE)));

    // Smooth
    public static final Block SMOOTH_SOUL_SANDSTONE = register("smooth_soul_sandstone", new Block(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block SMOOTH_SOUL_SANDSTONE_SLAB = register("smooth_soul_sandstone_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_SOUL_SANDSTONE)));
    public static final Block SMOOTH_SOUL_SANDSTONE_STAIRS = register("smooth_soul_sandstone_stairs", new BaseConsistencyStairBlock(SMOOTH_SOUL_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_SOUL_SANDSTONE)));
    public static final Block SMOOTH_SOUL_SANDSTONE_WALL = register("smooth_soul_sandstone_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_SOUL_SANDSTONE)));
    public static final Block SMOOTH_SOUL_SANDSTONE_GATE = register("smooth_soul_sandstone_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_SOUL_SANDSTONE)));

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    // Polished
    public static final Block POLISHED_SOUL_SANDSTONE = register("polished_soul_sandstone", new Block(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block POLISHED_SOUL_SANDSTONE_SLAB = register("polished_soul_sandstone_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_SOUL_SANDSTONE)));
    public static final Block POLISHED_SOUL_SANDSTONE_STAIRS = register("polished_soul_sandstone_stairs", new BaseConsistencyStairBlock(POLISHED_SOUL_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(POLISHED_SOUL_SANDSTONE)));
    public static final Block POLISHED_SOUL_SANDSTONE_WALL = register("polished_soul_sandstone_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_SOUL_SANDSTONE)));
    public static final Block POLISHED_SOUL_SANDSTONE_GATE = register("polished_soul_sandstone_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_SOUL_SANDSTONE)));

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    // Bricks
    public static final Block SOUL_SANDSTONE_BRICKS = register("soul_sandstone_bricks", new Block(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block SOUL_SANDSTONE_BRICK_SLAB = register("soul_sandstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(SOUL_SANDSTONE_BRICKS)));
    public static final Block SOUL_SANDSTONE_BRICK_STAIRS = register("soul_sandstone_brick_stairs", new BaseConsistencyStairBlock(SOUL_SANDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(SOUL_SANDSTONE_BRICKS)));
    public static final Block SOUL_SANDSTONE_BRICK_WALL = register("soul_sandstone_brick_wall", new WallBlock(FabricBlockSettings.copy(SOUL_SANDSTONE_BRICKS)));
    public static final Block SOUL_SANDSTONE_BRICK_GATE = register("soul_sandstone_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(SOUL_SANDSTONE_BRICKS)));

    //Cracked Bricks
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Bricks
    //block
    //slab
    //stairs
    //wall
    //gate

    // Cut
    public static final Block CUT_SOUL_SANDSTONE = register("cut_soul_sandstone", new Block(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block CUT_SOUL_SANDSTONE_SLAB = register("cut_soul_sandstone_slab", new SlabBlock(FabricBlockSettings.copy(CUT_SOUL_SANDSTONE)));
    public static final Block CUT_SOUL_SANDSTONE_STAIRS = register("cut_soul_sandstone_stairs", new BaseConsistencyStairBlock(CUT_SOUL_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(CUT_SOUL_SANDSTONE)));
    public static final Block CUT_SOUL_SANDSTONE_WALL = register("cut_soul_sandstone_wall", new WallBlock(FabricBlockSettings.copy(CUT_SOUL_SANDSTONE)));
    public static final Block CUT_SOUL_SANDSTONE_GATE = register("cut_soul_sandstone_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_SOUL_SANDSTONE)));

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Tiles
    public static final Block SOUL_SANDSTONE_TILES = register("soul_sandstone_tiles", new Block(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block SOUL_SANDSTONE_TILE_SLAB = register("soul_sandstone_tile_slab", new SlabBlock(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block SOUL_SANDSTONE_TILE_STAIRS = register("soul_sandstone_tile_stairs", new BaseConsistencyStairBlock(SOUL_SANDSTONE_TILES.getDefaultState(), FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block SOUL_SANDSTONE_TILE_WALL = register("soul_sandstone_tile_wall", new WallBlock(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block SOUL_SANDSTONE_TILE_GATE = register("soul_sandstone_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(SOUL_SANDSTONE)));

    //Cracked Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Tiles
    //block
    //slab
    //stairs
    //wall
    //gate


    public static final Block CARVED_SOUL_SANDSTONE = register("carved_soul_sandstone", new Block(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    //mossy carved
    //cracked carved
    public static final Block CHISELED_SOUL_SANDSTONE = register("chiseled_soul_sandstone", new Block(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    //mossy chiseled
    //cracked chiseled
    public static final Block SOUL_SANDSTONE_PILLAR = register("soul_sandstone_pillar", new PillarBlock(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    //mossy pillar
    //cracked pillar
    //corner pillar
    //mossy corner pillar
    //cracked corner pillar


    //Obsidian
    public static final Block OBSIDIAN_SLAB = register("obsidian_slab", new SlabBlock(FabricBlockSettings.of((new FabricMaterialBuilder(MapColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(50.0F, 1200.0F)));
    public static final Block OBSIDIAN_STAIRS = register("obsidian_stairs", new BaseConsistencyStairBlock(OBSIDIAN.getDefaultState(), FabricBlockSettings.of((new FabricMaterialBuilder(MapColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(50.0F, 1200.0F)));
    public static final Block OBSIDIAN_WALL = register("obsidian_wall", new WallBlock(FabricBlockSettings.of((new FabricMaterialBuilder(MapColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(50.0F, 1200.0F)));
    public static final Block OBSIDIAN_GATE = register("obsidian_gate", new FenceGateBlock(FabricBlockSettings.of((new FabricMaterialBuilder(MapColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(50.0F, 1200.0F)));

    public static final Block CRYING_OBSIDIAN_SLAB = register("crying_obsidian_slab", new SlabBlock(FabricBlockSettings.of((new FabricMaterialBuilder(MapColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(50.0F, 1200.0F).luminance(10)));
    public static final Block CRYING_OBSIDIAN_STAIRS = register("crying_obsidian_stairs", new BaseConsistencyStairBlock(CRYING_OBSIDIAN.getDefaultState(), FabricBlockSettings.of((new FabricMaterialBuilder(MapColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(50.0F, 1200.0F).luminance(10)));
    public static final Block CRYING_OBSIDIAN_WALL = register("crying_obsidian_wall", new WallBlock(FabricBlockSettings.of((new FabricMaterialBuilder(MapColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(50.0F, 1200.0F).luminance(10)));
    public static final Block CRYING_OBSIDIAN_GATE = register("crying_obsidian_gate", new FenceGateBlock(FabricBlockSettings.of((new FabricMaterialBuilder(MapColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(50.0F, 1200.0F).luminance(10)));

    public static final Block SMOOTH_OBSIDIAN = register("smooth_obsidian", new Block(FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block SMOOTH_OBSIDIAN_SLAB = register("smooth_obsidian_slab", new SlabBlock(FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block SMOOTH_OBSIDIAN_STAIRS = register("smooth_obsidian_stairs", new BaseConsistencyStairBlock(SMOOTH_OBSIDIAN.getDefaultState(),FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block SMOOTH_OBSIDIAN_WALL = register("smooth_obsidian_wall", new WallBlock(FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block SMOOTH_OBSIDIAN_GATE = register("smooth_obsidian_gate", new FenceGateBlock(FabricBlockSettings.copy(OBSIDIAN)));

    public static final Block SMOOTH_CRYING_OBSIDIAN = register("smooth_crying_obsidian", new CryingObsidianBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block SMOOTH_CRYING_OBSIDIAN_SLAB = register("smooth_crying_obsidian_slab", new SlabBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block SMOOTH_CRYING_OBSIDIAN_STAIRS = register("smooth_crying_obsidian_stairs", new BaseConsistencyStairBlock(SMOOTH_CRYING_OBSIDIAN.getDefaultState(),FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block SMOOTH_CRYING_OBSIDIAN_WALL = register("smooth_crying_obsidian_wall", new WallBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block SMOOTH_CRYING_OBSIDIAN_GATE = register("smooth_crying_obsidian_gate", new FenceGateBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));

    //mossy smooth
    //slab
    //stairs
    //wall
    //gate

    //slab
    //stairs
    //wall
    //gate

    //cracked smooth
    //slab
    //stairs
    //wall
    //gate

    //slab
    //stairs
    //wall
    //gate

    public static final Block POLISHED_OBSIDIAN = register("polished_obsidian", new Block(FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block POLISHED_OBSIDIAN_SLAB = register("polished_obsidian_slab", new SlabBlock(FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block POLISHED_OBSIDIAN_STAIRS = register("polished_obsidian_stairs", new BaseConsistencyStairBlock(POLISHED_OBSIDIAN.getDefaultState(),FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block POLISHED_OBSIDIAN_WALL = register("polished_obsidian_wall", new WallBlock(FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block POLISHED_OBSIDIAN_GATE = register("polished_obsidian_gate", new FenceGateBlock(FabricBlockSettings.copy(OBSIDIAN)));

    public static final Block POLISHED_CRYING_OBSIDIAN = register("polished_crying_obsidian", new CryingObsidianBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block POLISHED_CRYING_OBSIDIAN_SLAB = register("polished_crying_obsidian_slab", new SlabBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block POLISHED_CRYING_OBSIDIAN_STAIRS = register("polished_crying_obsidian_stairs", new BaseConsistencyStairBlock(POLISHED_CRYING_OBSIDIAN.getDefaultState(),FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block POLISHED_CRYING_OBSIDIAN_WALL = register("polished_crying_obsidian_wall", new WallBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block POLISHED_CRYING_OBSIDIAN_GATE = register("polished_crying_obsidian_gate", new FenceGateBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));

    //mossy polished
    //slab
    //stairs
    //wall
    //gate

    //slab
    //stairs
    //wall
    //gate

    //cracked polished
    //slab
    //stairs
    //wall
    //gate

    //slab
    //stairs
    //wall
    //gate

    public static final Block OBSIDIAN_BRICKS = register("obsidian_bricks", new Block(FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block OBSIDIAN_BRICK_SLAB = register("obsidian_brick_slab", new SlabBlock(FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block OBSIDIAN_BRICK_STAIRS = register("obsidian_brick_stairs", new BaseConsistencyStairBlock(OBSIDIAN_BRICKS.getDefaultState(),FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block OBSIDIAN_BRICK_WALL = register("obsidian_brick_wall", new WallBlock(FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block OBSIDIAN_BRICK_GATE = register("obsidian_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(OBSIDIAN)));

    public static final Block CRYING_OBSIDIAN_BRICKS = register("crying_obsidian_bricks", new CryingObsidianBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block CRYING_OBSIDIAN_BRICK_SLAB = register("crying_obsidian_brick_slab", new SlabBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block CRYING_OBSIDIAN_BRICK_STAIRS = register("crying_obsidian_brick_stairs", new BaseConsistencyStairBlock(CRYING_OBSIDIAN_BRICKS.getDefaultState(),FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block CRYING_OBSIDIAN_BRICK_WALL = register("crying_obsidian_brick_wall", new WallBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block CRYING_OBSIDIAN_BRICK_GATE = register("crying_obsidian_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));

    //mossy bricks
    //slab
    //stairs
    //wall
    //gate

    //slab
    //stairs
    //wall
    //gate

    //cracked bricks
    //slab
    //stairs
    //wall
    //gate

    //slab
    //stairs
    //wall
    //gate

    public static final Block CUT_OBSIDIAN = register("cut_obsidian", new Block(FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block CUT_OBSIDIAN_SLAB = register("cut_obsidian_slab", new SlabBlock(FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block CUT_OBSIDIAN_STAIRS = register("cut_obsidian_stairs", new BaseConsistencyStairBlock(CUT_OBSIDIAN.getDefaultState(),FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block CUT_OBSIDIAN_WALL = register("cut_obsidian_wall", new WallBlock(FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block CUT_OBSIDIAN_GATE = register("cut_obsidian_gate", new FenceGateBlock(FabricBlockSettings.copy(OBSIDIAN)));

    public static final Block CUT_CRYING_OBSIDIAN = register("cut_crying_obsidian", new CryingObsidianBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block CUT_CRYING_OBSIDIAN_SLAB = register("cut_crying_obsidian_slab", new SlabBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block CUT_CRYING_OBSIDIAN_STAIRS = register("cut_crying_obsidian_stairs", new BaseConsistencyStairBlock(CUT_CRYING_OBSIDIAN.getDefaultState(),FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block CUT_CRYING_OBSIDIAN_WALL = register("cut_crying_obsidian_wall", new WallBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block CUT_CRYING_OBSIDIAN_GATE = register("cut_crying_obsidian_gate", new FenceGateBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));

    //mossy cut
    //slab
    //stairs
    //wall
    //gate

    //slab
    //stairs
    //wall
    //gate

    //cracked cut
    //slab
    //stairs
    //wall
    //gate

    //slab
    //stairs
    //wall
    //gate

    public static final Block OBSIDIAN_TILES = register("obsidian_tiles", new Block(FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block OBSIDIAN_TILE_SLAB = register("obsidian_tile_slab", new SlabBlock(FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block OBSIDIAN_TILE_STAIRS = register("obsidian_tile_stairs", new BaseConsistencyStairBlock(OBSIDIAN_TILES.getDefaultState(),FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block OBSIDIAN_TILE_WALL = register("obsidian_tile_wall", new WallBlock(FabricBlockSettings.copy(OBSIDIAN)));
    public static final Block OBSIDIAN_TILE_GATE = register("obsidian_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(OBSIDIAN)));

    public static final Block CRYING_OBSIDIAN_TILES = register("crying_obsidian_tiles", new CryingObsidianBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block CRYING_OBSIDIAN_TILE_SLAB = register("crying_obsidian_tile_slab", new SlabBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block CRYING_OBSIDIAN_TILE_STAIRS = register("crying_obsidian_tile_stairs", new BaseConsistencyStairBlock(CRYING_OBSIDIAN_TILES.getDefaultState(),FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block CRYING_OBSIDIAN_TILE_WALL = register("crying_obsidian_tile_wall", new WallBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    public static final Block CRYING_OBSIDIAN_TILE_GATE = register("crying_obsidian_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));

    //mossy tiles
    //slab
    //stairs
    //wall
    //gate

    //slab
    //stairs
    //wall
    //gate

    //cracked tiles
    //slab
    //stairs
    //wall
    //gate

    //slab
    //stairs
    //wall
    //gate

    public static final Block OBSIDIAN_PILLAR = register("obsidian_pillar", new PillarBlock(FabricBlockSettings.copy(OBSIDIAN)));
    //mossy pillar
    //cracked pillar
    //corner pillar
    //mossy corner pillar
    //cracked corner pillar
    public static final Block CHISELED_OBSIDIAN = register("chiseled_obsidian", new Block(FabricBlockSettings.copy(OBSIDIAN)));
    //mossy chiseled
    //cracked chiseled
    public static final Block CARVED_OBSIDIAN = register("carved_obsidian", new Block(FabricBlockSettings.copy(OBSIDIAN)));
    //mossy carved
    //cracked carved

    public static final Block CRYING_OBSIDIAN_PILLAR = register("crying_obsidian_pillar", new PillarBlock(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    //mossy pillar
    //cracked pillar
    //corner pillar
    //mossy corner pillar
    //cracked corner pillar
    public static final Block CHISELED_CRYING_OBSIDIAN = register("chiseled_crying_obsidian", new Block(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    //mossy chiseled
    //cracked chiseled
    public static final Block CARVED_CRYING_OBSIDIAN = register("carved_crying_obsidian", new Block(FabricBlockSettings.copy(CRYING_OBSIDIAN)));
    //mossy carved
    //cracked carved

//Calcite

    public static final Block CALCITE_SLAB = register("calcite_slab", new SlabBlock(FabricBlockSettings.copy(CALCITE)));
    public static final Block CALCITE_STAIRS = register("calcite_stairs", new BaseConsistencyStairBlock(CALCITE.getDefaultState(), FabricBlockSettings.copy(CALCITE)));
    public static final Block CALCITE_WALL = register("calcite_wall", new WallBlock(FabricBlockSettings.copy(CALCITE)));
    public static final Block CALCITE_GATE = register("calcite_gate", new FenceGateBlock(FabricBlockSettings.copy(CALCITE)));

    //Cracked
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy
    //block
    //slab
    //stairs
    //wall
    //gate


    //Smooth
    public static final Block SMOOTH_CALCITE = register("smooth_calcite", new Block(FabricBlockSettings.copy(CALCITE)));
    public static final Block SMOOTH_CALCITE_SLAB = register("smooth_calcite_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_CALCITE)));
    public static final Block SMOOTH_CALCITE_STAIRS = register("smooth_calcite_stairs", new BaseConsistencyStairBlock(SMOOTH_CALCITE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_CALCITE)));
    public static final Block SMOOTH_CALCITE_WALL = register("smooth_calcite_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_CALCITE)));
    public static final Block SMOOTH_CALCITE_GATE = register("smooth_calcite_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_CALCITE)));

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Polished
    public static final Block POLISHED_CALCITE = register("polished_calcite", new Block(FabricBlockSettings.copy(CALCITE)));
    public static final Block POLISHED_CALCITE_SLAB = register("polished_calcite_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_CALCITE)));
    public static final Block POLISHED_CALCITE_STAIRS = register("polished_calcite_stairs", new BaseConsistencyStairBlock(POLISHED_CALCITE.getDefaultState(), FabricBlockSettings.copy(POLISHED_CALCITE)));
    public static final Block POLISHED_CALCITE_WALL = register("polished_calcite_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_CALCITE)));
    public static final Block POLISHED_CALCITE_GATE = register("polished_calcite_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_CALCITE)));

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cut
    public static final Block CUT_CALCITE = register("cut_calcite", new Block(FabricBlockSettings.copy(POLISHED_CALCITE)));
    public static final Block CUT_CALCITE_SLAB = register("cut_calcite_slab", new SlabBlock(FabricBlockSettings.copy(CUT_CALCITE)));
    public static final Block CUT_CALCITE_STAIRS = register("cut_calcite_stairs", new BaseConsistencyStairBlock(CUT_CALCITE.getDefaultState(), FabricBlockSettings.copy(CUT_CALCITE)));
    public static final Block CUT_CALCITE_WALL = register("cut_calcite_wall", new WallBlock(FabricBlockSettings.copy(CUT_CALCITE)));
    public static final Block CUT_CALCITE_GATE = register("cut_calcite_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_CALCITE)));

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    public static final Block CALCITE_TILES = register("calcite_tiles", new Block(FabricBlockSettings.copy(CALCITE)));
    public static final Block CALCITE_TILE_SLAB = register("calcite_tile_slab", new SlabBlock(FabricBlockSettings.copy(CALCITE)));
    public static final Block CALCITE_TILE_STAIRS = register("calcite_tile_stairs", new BaseConsistencyStairBlock(CALCITE.getDefaultState(), FabricBlockSettings.copy(CALCITE)));
    public static final Block CALCITE_TILE_WALL = register("calcite_tile_wall", new WallBlock(FabricBlockSettings.copy(CALCITE)));
    public static final Block CALCITE_TILE_GATE = register("calcite_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(CALCITE)));

    //Cracked Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Bricks
    public static final Block CALCITE_BRICKS = register("calcite_bricks", new Block(FabricBlockSettings.copy(CALCITE)));
    public static final Block CALCITE_BRICK_SLAB = register("calcite_brick_slab", new SlabBlock(FabricBlockSettings.copy(CALCITE)));
    public static final Block CALCITE_BRICK_STAIRS = register("calcite_brick_stairs", new BaseConsistencyStairBlock(CALCITE.getDefaultState(), FabricBlockSettings.copy(CALCITE)));
    public static final Block CALCITE_BRICK_WALL = register("calcite_brick_wall", new WallBlock(FabricBlockSettings.copy(CALCITE)));
    public static final Block CALCITE_BRICK_GATE = register("calcite_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(CALCITE_BRICKS)));

    //Cracked Bricks
    //cracked_calcite_bricks
    //cracked_calcite_brick_slab
    //cracked_calcite_brick_stairs
    //cracked_calcite_brick_wall
    //gate

    //Mossy Bricks
    //mossy_calcite_bricks
    //mossy_calcite_brick_slab
    //mossy_calcite_brick_stairs
    //mossy_calcite_brick_wall
    //gate

    //Pillars and Chiseled
    public static final Block CALCITE_PILLAR = register("calcite_pillar", new PillarBlock(FabricBlockSettings.copy(POLISHED_CALCITE)));
    //cracked_calcite_pillar
    //mossy_calcite_pillar
    public static final Block CHISELED_CALCITE = register("chiseled_calcite", new Block(FabricBlockSettings.copy(POLISHED_CALCITE)));
    //cracked_chiseled_calcite
    //mossy_chiseled_calcite
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    public static final Block CARVED_CALCITE = register("carved_calcite", new Block(FabricBlockSettings.copy(POLISHED_CALCITE)));
    //cracked carved
    //mossy carved

//Dripstone

    public static final Block DRIPSTONE_SLAB = register("dripstone_slab", new SlabBlock(FabricBlockSettings.copy(DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_STAIRS = register("dripstone_stairs", new BaseConsistencyStairBlock(DRIPSTONE_BLOCK.getDefaultState(), FabricBlockSettings.copy(DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_WALL = register("dripstone_wall", new WallBlock(FabricBlockSettings.copy(DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_GATE = register("dripstone_gate", new FenceGateBlock(FabricBlockSettings.copy(DRIPSTONE_BLOCK)));

    //Cracked
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy
    //block
    //slab
    //stairs
    //wall
    //gate


    //Smooth
    public static final Block SMOOTH_DRIPSTONE = register("smooth_dripstone", new Block(FabricBlockSettings.copy(DRIPSTONE_BLOCK)));
    public static final Block SMOOTH_DRIPSTONE_SLAB = register("smooth_dripstone_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_DRIPSTONE)));
    public static final Block SMOOTH_DRIPSTONE_STAIRS = register("smooth_dripstone_stairs", new BaseConsistencyStairBlock(SMOOTH_DRIPSTONE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_DRIPSTONE)));
    public static final Block SMOOTH_DRIPSTONE_WALL = register("smooth_dripstone_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_DRIPSTONE)));
    public static final Block SMOOTH_DRIPSTONE_GATE = register("smooth_dripstone_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_DRIPSTONE)));

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Polished
    public static final Block POLISHED_DRIPSTONE = register("polished_dripstone", new Block(FabricBlockSettings.copy(DRIPSTONE_BLOCK)));
    public static final Block POLISHED_DRIPSTONE_SLAB = register("polished_dripstone_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_DRIPSTONE)));
    public static final Block POLISHED_DRIPSTONE_STAIRS = register("polished_dripstone_stairs", new BaseConsistencyStairBlock(POLISHED_DRIPSTONE.getDefaultState(), FabricBlockSettings.copy(POLISHED_DRIPSTONE)));
    public static final Block POLISHED_DRIPSTONE_WALL = register("polished_dripstone_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_DRIPSTONE)));
    public static final Block POLISHED_DRIPSTONE_GATE = register("polished_dripstone_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_DRIPSTONE)));

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cut
    public static final Block CUT_DRIPSTONE = register("cut_dripstone", new Block(FabricBlockSettings.copy(POLISHED_DRIPSTONE)));
    public static final Block CUT_DRIPSTONE_SLAB = register("cut_dripstone_slab", new SlabBlock(FabricBlockSettings.copy(CUT_DRIPSTONE)));
    public static final Block CUT_DRIPSTONE_STAIRS = register("cut_dripstone_stairs", new BaseConsistencyStairBlock(CUT_DRIPSTONE.getDefaultState(), FabricBlockSettings.copy(CUT_DRIPSTONE)));
    public static final Block CUT_DRIPSTONE_WALL = register("cut_dripstone_wall", new WallBlock(FabricBlockSettings.copy(CUT_DRIPSTONE)));
    public static final Block CUT_DRIPSTONE_GATE = register("cut_dripstone_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_DRIPSTONE)));

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    public static final Block DRIPSTONE_TILES = register("dripstone_tiles", new Block(FabricBlockSettings.copy(DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_TILE_SLAB = register("dripstone_tile_slab", new SlabBlock(FabricBlockSettings.copy(DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_TILE_STAIRS = register("dripstone_tile_stairs", new BaseConsistencyStairBlock(DRIPSTONE_BLOCK.getDefaultState(), FabricBlockSettings.copy(DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_TILE_WALL = register("dripstone_tile_wall", new WallBlock(FabricBlockSettings.copy(DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_TILE_GATE = register("dripstone_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(DRIPSTONE_BLOCK)));

    //Cracked Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Bricks
    public static final Block DRIPSTONE_BRICKS = register("dripstone_bricks", new Block(FabricBlockSettings.copy(DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICK_SLAB = register("dripstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICK_STAIRS = register("dripstone_brick_stairs", new BaseConsistencyStairBlock(DRIPSTONE_BLOCK.getDefaultState(), FabricBlockSettings.copy(DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICK_WALL = register("dripstone_brick_wall", new WallBlock(FabricBlockSettings.copy(DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICK_GATE = register("dripstone_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(DRIPSTONE_BLOCK)));

    //Cracked Bricks
    //cracked_dripstone_bricks
    //cracked_dripstone_brick_slab
    //cracked_dripstone_brick_stairs
    //cracked_dripstone_brick_wall
    //gate

    //Mossy Bricks
    //mossy_dripstone_bricks
    //mossy_dripstone_brick_slab
    //mossy_dripstone_brick_stairs
    //mossy_dripstone_brick_wall
    //gate

    //Pillars and Chiseled
    public static final Block DRIPSTONE_PILLAR = register("dripstone_pillar", new PillarBlock(FabricBlockSettings.copy(POLISHED_DRIPSTONE)));
    //cracked_dripstone_pillar
    //mossy_dripstone_pillar
    public static final Block CHISELED_DRIPSTONE = register("chiseled_dripstone", new Block(FabricBlockSettings.copy(POLISHED_DRIPSTONE)));
    //cracked_chiseled_dripstone
    //mossy_chiseled_dripstone
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    public static final Block CARVED_DRIPSTONE = register("carved_dripstone", new Block(FabricBlockSettings.copy(POLISHED_DRIPSTONE)));
    //cracked carved
    //mossy carved



//Tuff

    public static final Block TUFF_SLAB = register("tuff_slab", new SlabBlock(FabricBlockSettings.copy(TUFF)));
    public static final Block TUFF_STAIRS = register("tuff_stairs", new BaseConsistencyStairBlock(TUFF.getDefaultState(), FabricBlockSettings.copy(TUFF)));
    public static final Block TUFF_WALL = register("tuff_wall", new WallBlock(FabricBlockSettings.copy(TUFF)));
    public static final Block TUFF_GATE = register("tuff_gate", new FenceGateBlock(FabricBlockSettings.copy(TUFF)));

    //Cracked
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy
    //block
    //slab
    //stairs
    //wall
    //gate


    //Smooth
    public static final Block SMOOTH_TUFF = register("smooth_tuff", new Block(FabricBlockSettings.copy(TUFF)));
    public static final Block SMOOTH_TUFF_SLAB = register("smooth_tuff_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_TUFF)));
    public static final Block SMOOTH_TUFF_STAIRS = register("smooth_tuff_stairs", new BaseConsistencyStairBlock(SMOOTH_TUFF.getDefaultState(), FabricBlockSettings.copy(SMOOTH_TUFF)));
    public static final Block SMOOTH_TUFF_WALL = register("smooth_tuff_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_TUFF)));
    public static final Block SMOOTH_TUFF_GATE = register("smooth_tuff_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_TUFF)));

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Polished
    public static final Block POLISHED_TUFF = register("polished_tuff", new Block(FabricBlockSettings.copy(TUFF)));
    public static final Block POLISHED_TUFF_SLAB = register("polished_tuff_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_TUFF)));
    public static final Block POLISHED_TUFF_STAIRS = register("polished_tuff_stairs", new BaseConsistencyStairBlock(POLISHED_TUFF.getDefaultState(), FabricBlockSettings.copy(POLISHED_TUFF)));
    public static final Block POLISHED_TUFF_WALL = register("polished_tuff_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_TUFF)));
    public static final Block POLISHED_TUFF_GATE = register("polished_tuff_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_TUFF)));

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cut
    public static final Block CUT_TUFF = register("cut_tuff", new Block(FabricBlockSettings.copy(POLISHED_TUFF)));
    public static final Block CUT_TUFF_SLAB = register("cut_tuff_slab", new SlabBlock(FabricBlockSettings.copy(CUT_TUFF)));
    public static final Block CUT_TUFF_STAIRS = register("cut_tuff_stairs", new BaseConsistencyStairBlock(CUT_TUFF.getDefaultState(), FabricBlockSettings.copy(CUT_TUFF)));
    public static final Block CUT_TUFF_WALL = register("cut_tuff_wall", new WallBlock(FabricBlockSettings.copy(CUT_TUFF)));
    public static final Block CUT_TUFF_GATE = register("cut_tuff_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_TUFF)));

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    public static final Block TUFF_TILES = register("tuff_tiles", new Block(FabricBlockSettings.copy(TUFF)));
    public static final Block TUFF_TILE_SLAB = register("tuff_tile_slab", new SlabBlock(FabricBlockSettings.copy(TUFF)));
    public static final Block TUFF_TILE_STAIRS = register("tuff_tile_stairs", new BaseConsistencyStairBlock(TUFF.getDefaultState(), FabricBlockSettings.copy(TUFF)));
    public static final Block TUFF_TILE_WALL = register("tuff_tile_wall", new WallBlock(FabricBlockSettings.copy(TUFF)));
    public static final Block TUFF_TILE_GATE = register("tuff_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(TUFF)));

    //Cracked Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Bricks
    public static final Block TUFF_BRICKS = register("tuff_bricks", new Block(FabricBlockSettings.copy(TUFF)));
    public static final Block TUFF_BRICK_SLAB = register("tuff_brick_slab", new SlabBlock(FabricBlockSettings.copy(TUFF)));
    public static final Block TUFF_BRICK_STAIRS = register("tuff_brick_stairs", new BaseConsistencyStairBlock(TUFF.getDefaultState(), FabricBlockSettings.copy(TUFF)));
    public static final Block TUFF_BRICK_WALL = register("tuff_brick_wall", new WallBlock(FabricBlockSettings.copy(TUFF)));
    public static final Block TUFF_BRICK_GATE = register("tuff_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(TUFF_BRICKS)));

    //Cracked Bricks
    //cracked_tuff_bricks
    //cracked_tuff_brick_slab
    //cracked_tuff_brick_stairs
    //cracked_tuff_brick_wall
    //gate

    //Mossy Bricks
    //mossy_tuff_bricks
    //mossy_tuff_brick_slab
    //mossy_tuff_brick_stairs
    //mossy_tuff_brick_wall
    //gate

    //Pillars and Chiseled
    public static final Block TUFF_PILLAR = register("tuff_pillar", new PillarBlock(FabricBlockSettings.copy(POLISHED_TUFF)));
    //cracked_tuff_pillar
    //mossy_tuff_pillar
    public static final Block CHISELED_TUFF = register("chiseled_tuff", new Block(FabricBlockSettings.copy(POLISHED_TUFF)));
    //cracked_chiseled_tuff
    //mossy_chiseled_tuff
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    public static final Block CARVED_TUFF = register("carved_tuff", new Block(FabricBlockSettings.copy(POLISHED_TUFF)));
    //cracked carved
    //mossy carved

    //Deepslate
    public static final Block DEEPSLATE_SLAB = register("deepslate_slab", new SlabBlock(FabricBlockSettings.copy(DEEPSLATE)));
    public static final Block DEEPSLATE_STAIRS = register("deepslate_stairs", new BaseConsistencyStairBlock(DEEPSLATE.getDefaultState(), FabricBlockSettings.copy(DEEPSLATE)));
    public static final Block DEEPSLATE_WALL = register("deepslate_wall", new WallBlock(FabricBlockSettings.copy(DEEPSLATE)));
    public static final Block DEEPSLATE_GATE = register("deepslate_gate", new FenceGateBlock(FabricBlockSettings.copy(DEEPSLATE)));

    //Cracked
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy
    //block
    //slab
    //stairs
    //wall
    //gate


    //Smooth
    public static final Block SMOOTH_DEEPSLATE = register("smooth_deepslate", new Block(FabricBlockSettings.copy(DEEPSLATE)));
    public static final Block SMOOTH_DEEPSLATE_SLAB = register("smooth_deepslate_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_DEEPSLATE)));
    public static final Block SMOOTH_DEEPSLATE_STAIRS = register("smooth_deepslate_stairs", new BaseConsistencyStairBlock(SMOOTH_DEEPSLATE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_DEEPSLATE)));
    public static final Block SMOOTH_DEEPSLATE_WALL = register("smooth_deepslate_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_DEEPSLATE)));
    public static final Block SMOOTH_DEEPSLATE_GATE = register("smooth_deepslate_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_DEEPSLATE)));

    //Cracked Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Smooth
    //block
    //slab
    //stairs
    //wall
    //gate

    //Polished
    public static final Block POLISHED_DEEPSLATE_GATE = register("polished_deepslate_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_DEEPSLATE)));

    //Cracked Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Polished
    //block
    //slab
    //stairs
    //wall
    //gate

    //Cut
    public static final Block CUT_DEEPSLATE = register("cut_deepslate", new Block(FabricBlockSettings.copy(POLISHED_DEEPSLATE)));
    public static final Block CUT_DEEPSLATE_SLAB = register("cut_deepslate_slab", new SlabBlock(FabricBlockSettings.copy(CUT_DEEPSLATE)));
    public static final Block CUT_DEEPSLATE_STAIRS = register("cut_deepslate_stairs", new BaseConsistencyStairBlock(CUT_DEEPSLATE.getDefaultState(), FabricBlockSettings.copy(CUT_DEEPSLATE)));
    public static final Block CUT_DEEPSLATE_WALL = register("cut_deepslate_wall", new WallBlock(FabricBlockSettings.copy(CUT_DEEPSLATE)));
    public static final Block CUT_DEEPSLATE_GATE = register("cut_deepslate_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_DEEPSLATE)));

    //Cracked Cut
    //block
    //slab
    //stairs
    //wall
    //gate

    //Mossy Cut
    //block
    //slab
    //stairs
    //wall
    //gate


    //Cracked Tiles
    //slab
    //stairs
    //wall
    //gate

    //Mossy Tiles
    //block
    //slab
    //stairs
    //wall
    //gate

    //Bricks
    public static final Block DEEPSLATE_BRICK_GATE = register("deepslate_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(DEEPSLATE_BRICKS)));

    //Cracked Bricks
    //cracked_deepslate_bricks
    //cracked_deepslate_brick_slab
    //cracked_deepslate_brick_stairs
    //cracked_deepslate_brick_wall
    //gate

    //Mossy Bricks
    //mossy_deepslate_bricks
    //mossy_deepslate_brick_slab
    //mossy_deepslate_brick_stairs
    //mossy_deepslate_brick_wall
    //gate

    //Pillars and Chiseled
    public static final Block DEEPSLATE_PILLAR = register("deepslate_pillar", new PillarBlock(FabricBlockSettings.copy(POLISHED_DEEPSLATE)));
    //cracked_deepslate_pillar
    //mossy_deepslate_pillar
    //cracked_chiseled_deepslate
    //mossy_chiseled_deepslate
    //corner pillar
    //cracked corner pillar
    //mossy corner pillar
    public static final Block CARVED_DEEPSLATE = register("carved_deepslate", new Block(FabricBlockSettings.copy(POLISHED_DEEPSLATE)));
    //cracked carved
    //mossy carved


/*Note about copper and other metals: Raw metal blocks will be used as the 'base' and will be converted into a new version of the mineral block for C+ purposes.
The Vanilla metal blocks will continue to work the same (aside from copper, which will have a replacement) and the Raw Metal block will be used as the starting block for the C+ variants.
This also means raw metal blocks will rust, so the vanilla textures will be slightly modified to reflect this.
                             |
  X X X                      |   X X _
  X X X -> Y                 |   X X _ -> Y x4
  X X X                      |   _ _ _
                             |
  X - Metal Ingot            |   X - Raw Metal Block
  Y - Metal Block (Vanilla)  |   Y - Decorative Metal Block (Consistency+)

ALL DECORATIVE METAL BLOCKS WILL HAVE A WEATHERING PROCESS
Decorative Copper -> Exposed Copper -> Weathered Copper -> Oxidized Copper (Teal)
Decorative Gold -> Exposed Gold -> Weathered Gold -> Corroded Gold (Deep Blue/Green)
Decorative Iron -> Exposed Iron -> Weathered Iron -> Rusted Iron (Brown/Red)

This allows for every metal to have a decoration-based variant for building like copper does, while not affecting the existing metal blocks.
~~this also allows us to add the decorative gold blocks from Minecraft Dungeons but that's totally not the reason for this to be like this~~
The gold and iron won't be in the code for now since they aren't a priority (since copper won't be either until we can figure out the rust) but once copper is in I'll add in the placeholders for them */

// "What" - Siuol

//Clean Decorative Copper
    //block
    //slab
    //stairs
    //wall
    //gate

    //smooth
    //slab
    //stairs
    //wall
    //gate

    //mossy smooth
    //slab
    //stairs
    //wall
    //gate

    //cracked smooth
    //slab
    //stairs
    //wall
    //gate

    //polished slab
    //polished stairs
    //polished wall
    //polished gate

    //mossy polished
    //slab
    //stairs
    //wall
    //gate

    //cracked polished
    //slab
    //stairs
    //wall
    //gate

    //bricks
    //slab
    //stairs
    //wall
    //gate

    //mossy bricks
    //slab
    //stairs
    //wall
    //gate

    //cracked bricks
    //slab
    //stairs
    //wall
    //gate

    //cut gate

    //mossy cut
    //slab
    //stairs
    //wall
    //gate

    //cracked cut
    //slab
    //stairs
    //wall
    //gate

    //tiles
    //slab
    //stairs
    //wall
    //gate

    //mossy tiles
    //slab
    //stairs
    //wall
    //gate

    //cracked tiles
    //slab
    //stairs
    //wall
    //gate

    //pillar
    //mossy pillar
    //cracked pillar
    //corner pillar
    //mossy corner pillar
    //cracked corner pillar
    //chiseled
    //mossy chiseled
    //cracked chiseled
    //carved
    //mossy carved
    //cracked carved

//Exposed Decorative Copper
    //block
    //slab
    //stairs
    //wall
    //gate

    //smooth
    //slab
    //stairs
    //wall
    //gate

    //mossy smooth
    //slab
    //stairs
    //wall
    //gate

    //cracked smooth
    //slab
    //stairs
    //wall
    //gate

    //polished slab
    //polished stairs
    //polished wall
    //polished gate

    //mossy polished
    //slab
    //stairs
    //wall
    //gate

    //cracked polished
    //slab
    //stairs
    //wall
    //gate

    //bricks
    //slab
    //stairs
    //wall
    //gate

    //mossy bricks
    //slab
    //stairs
    //wall
    //gate

    //cracked bricks
    //slab
    //stairs
    //wall
    //gate

    //cut gate

    //mossy cut
    //slab
    //stairs
    //wall
    //gate

    //cracked cut
    //slab
    //stairs
    //wall
    //gate

    //tiles
    //slab
    //stairs
    //wall
    //gate

    //mossy tiles
    //slab
    //stairs
    //wall
    //gate

    //cracked tiles
    //slab
    //stairs
    //wall
    //gate

    //pillar
    //mossy pillar
    //cracked pillar
    //corner pillar
    //mossy corner pillar
    //cracked corner pillar
    //chiseled
    //mossy chiseled
    //cracked chiseled
    //carved
    //mossy carved
    //cracked carved

//Weathered Decorative Copper
    //block
    //slab
    //stairs
    //wall
    //gate

    //smooth
    //slab
    //stairs
    //wall
    //gate

    //mossy smooth
    //slab
    //stairs
    //wall
    //gate

    //cracked smooth
    //slab
    //stairs
    //wall
    //gate

    //polished slab
    //polished stairs
    //polished wall
    //polished gate

    //mossy polished
    //slab
    //stairs
    //wall
    //gate

    //cracked polished
    //slab
    //stairs
    //wall
    //gate

    //bricks
    //slab
    //stairs
    //wall
    //gate

    //mossy bricks
    //slab
    //stairs
    //wall
    //gate

    //cracked bricks
    //slab
    //stairs
    //wall
    //gate

    //cut gate

    //mossy cut
    //slab
    //stairs
    //wall
    //gate

    //cracked cut
    //slab
    //stairs
    //wall
    //gate

    //tiles
    //slab
    //stairs
    //wall
    //gate

    //mossy tiles
    //slab
    //stairs
    //wall
    //gate

    //cracked tiles
    //slab
    //stairs
    //wall
    //gate

    //pillar
    //mossy pillar
    //cracked pillar
    //corner pillar
    //mossy corner pillar
    //cracked corner pillar
    //chiseled
    //mossy chiseled
    //cracked chiseled
    //carved
    //mossy carved
    //cracked carved

//Oxidized Decorative Copper
    //block
    //slab
    //stairs
    //wall
    //gate

    //smooth
    //slab
    //stairs
    //wall
    //gate

    //mossy smooth
    //slab
    //stairs
    //wall
    //gate

    //cracked smooth
    //slab
    //stairs
    //wall
    //gate

    //polished slab
    //polished stairs
    //polished wall
    //polished gate

    //mossy polished
    //slab
    //stairs
    //wall
    //gate

    //cracked polished
    //slab
    //stairs
    //wall
    //gate

    //bricks
    //slab
    //stairs
    //wall
    //gate

    //mossy bricks
    //slab
    //stairs
    //wall
    //gate

    //cracked bricks
    //slab
    //stairs
    //wall
    //gate

    //cut gate

    //mossy cut
    //slab
    //stairs
    //wall
    //gate

    //cracked cut
    //slab
    //stairs
    //wall
    //gate

    //tiles
    //slab
    //stairs
    //wall
    //gate

    //mossy tiles
    //slab
    //stairs
    //wall
    //gate

    //cracked tiles
    //slab
    //stairs
    //wall
    //gate

    //pillar
    //mossy pillar
    //cracked pillar
    //corner pillar
    //mossy corner pillar
    //cracked corner pillar
    //chiseled
    //mossy chiseled
    //cracked chiseled
    //carved
    //mossy carved
    //cracked carved

//Waxes Clean Decorative Copper
    //block
    //slab
    //stairs
    //wall
    //gate

    //smooth
    //slab
    //stairs
    //wall
    //gate

    //mossy smooth
    //slab
    //stairs
    //wall
    //gate

    //cracked smooth
    //slab
    //stairs
    //wall
    //gate

    //polished slab
    //polished stairs
    //polished wall
    //polished gate

    //mossy polished
    //slab
    //stairs
    //wall
    //gate

    //cracked polished
    //slab
    //stairs
    //wall
    //gate

    //bricks
    //slab
    //stairs
    //wall
    //gate

    //mossy bricks
    //slab
    //stairs
    //wall
    //gate

    //cracked bricks
    //slab
    //stairs
    //wall
    //gate

    //cut gate

    //mossy cut
    //slab
    //stairs
    //wall
    //gate

    //cracked cut
    //slab
    //stairs
    //wall
    //gate

    //tiles
    //slab
    //stairs
    //wall
    //gate

    //mossy tiles
    //slab
    //stairs
    //wall
    //gate

    //cracked tiles
    //slab
    //stairs
    //wall
    //gate

    //pillar
    //mossy pillar
    //cracked pillar
    //corner pillar
    //mossy corner pillar
    //cracked corner pillar
    //chiseled
    //mossy chiseled
    //cracked chiseled
    //carved
    //mossy carved
    //cracked carved

//Waxed Exposed Decorative Copper
    //block
    //slab
    //stairs
    //wall
    //gate

    //smooth
    //slab
    //stairs
    //wall
    //gate

    //mossy smooth
    //slab
    //stairs
    //wall
    //gate

    //cracked smooth
    //slab
    //stairs
    //wall
    //gate

    //polished slab
    //polished stairs
    //polished wall
    //polished gate

    //mossy polished
    //slab
    //stairs
    //wall
    //gate

    //cracked polished
    //slab
    //stairs
    //wall
    //gate

    //bricks
    //slab
    //stairs
    //wall
    //gate

    //mossy bricks
    //slab
    //stairs
    //wall
    //gate

    //cracked bricks
    //slab
    //stairs
    //wall
    //gate

    //cut gate

    //mossy cut
    //slab
    //stairs
    //wall
    //gate

    //cracked cut
    //slab
    //stairs
    //wall
    //gate

    //tiles
    //slab
    //stairs
    //wall
    //gate

    //mossy tiles
    //slab
    //stairs
    //wall
    //gate

    //cracked tiles
    //slab
    //stairs
    //wall
    //gate

    //pillar
    //mossy pillar
    //cracked pillar
    //corner pillar
    //mossy corner pillar
    //cracked corner pillar
    //chiseled
    //mossy chiseled
    //cracked chiseled
    //carved
    //mossy carved
    //cracked carved

//Waxed Weathered Decorative Copper
    //block
    //slab
    //stairs
    //wall
    //gate

    //smooth
    //slab
    //stairs
    //wall
    //gate

    //mossy smooth
    //slab
    //stairs
    //wall
    //gate

    //cracked smooth
    //slab
    //stairs
    //wall
    //gate

    //polished slab
    //polished stairs
    //polished wall
    //polished gate

    //mossy polished
    //slab
    //stairs
    //wall
    //gate

    //cracked polished
    //slab
    //stairs
    //wall
    //gate

    //bricks
    //slab
    //stairs
    //wall
    //gate

    //mossy bricks
    //slab
    //stairs
    //wall
    //gate

    //cracked bricks
    //slab
    //stairs
    //wall
    //gate

    //cut gate

    //mossy cut
    //slab
    //stairs
    //wall
    //gate

    //cracked cut
    //slab
    //stairs
    //wall
    //gate

    //tiles
    //slab
    //stairs
    //wall
    //gate

    //mossy tiles
    //slab
    //stairs
    //wall
    //gate

    //cracked tiles
    //slab
    //stairs
    //wall
    //gate

    //pillar
    //mossy pillar
    //cracked pillar
    //corner pillar
    //mossy corner pillar
    //cracked corner pillar
    //chiseled
    //mossy chiseled
    //cracked chiseled
    //carved
    //mossy carved
    //cracked carved

//Waxed Oxidized Decorative Copper
    //block
    //slab
    //stairs
    //wall
    //gate

    //smooth
    //slab
    //stairs
    //wall
    //gate

    //mossy smooth
    //slab
    //stairs
    //wall
    //gate

    //cracked smooth
    //slab
    //stairs
    //wall
    //gate

    //polished slab
    //polished stairs
    //polished wall
    //polished gate

    //mossy polished
    //slab
    //stairs
    //wall
    //gate

    //cracked polished
    //slab
    //stairs
    //wall
    //gate

    //bricks
    //slab
    //stairs
    //wall
    //gate

    //mossy bricks
    //slab
    //stairs
    //wall
    //gate

    //cracked bricks
    //slab
    //stairs
    //wall
    //gate

    //cut gate

    //mossy cut
    //slab
    //stairs
    //wall
    //gate

    //cracked cut
    //slab
    //stairs
    //wall
    //gate

    //tiles
    //slab
    //stairs
    //wall
    //gate

    //mossy tiles
    //slab
    //stairs
    //wall
    //gate

    //cracked tiles
    //slab
    //stairs
    //wall
    //gate

    //pillar
    //mossy pillar
    //cracked pillar
    //corner pillar
    //mossy corner pillar
    //cracked corner pillar
    //chiseled
    //mossy chiseled
    //cracked chiseled
    //carved
    //mossy carved
    //cracked carved



// Terracotta
    // Terracotta Slab
    public static final Block RED_TERRACOTTA_SLAB = register("red_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_SLAB = register("orange_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_SLAB = register("yellow_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_SLAB = register("lime_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_SLAB = register("green_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(GREEN_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_SLAB = register("blue_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(BLUE_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_SLAB = register("cyan_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = register("light_blue_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_SLAB = register("purple_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(PURPLE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_SLAB = register("magenta_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(MAGENTA_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_SLAB = register("pink_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(PINK_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_SLAB = register("white_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(WHITE_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = register("light_gray_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_SLAB = register("gray_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(GRAY_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_SLAB = register("black_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(BLACK_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_SLAB = register("brown_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(BROWN_TERRACOTTA)));
    public static final Block TERRACOTTA_SLAB = register("terracotta_slab", new SlabBlock(FabricBlockSettings.copy(TERRACOTTA)));

    // Terracotta Stairs
    public static final Block RED_TERRACOTTA_STAIRS = register("red_terracotta_stairs", new BaseConsistencyStairBlock(RED_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_STAIRS = register("orange_terracotta_stairs", new BaseConsistencyStairBlock(ORANGE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_STAIRS = register("yellow_terracotta_stairs", new BaseConsistencyStairBlock(YELLOW_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_STAIRS = register("lime_terracotta_stairs", new BaseConsistencyStairBlock(LIME_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_STAIRS = register("green_terracotta_stairs", new BaseConsistencyStairBlock(GREEN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(GREEN_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_STAIRS = register("blue_terracotta_stairs", new BaseConsistencyStairBlock(BLUE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(BLUE_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_STAIRS = register("cyan_terracotta_stairs", new BaseConsistencyStairBlock(CYAN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = register("light_blue_terracotta_stairs", new BaseConsistencyStairBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_STAIRS = register("purple_terracotta_stairs", new BaseConsistencyStairBlock(PURPLE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(PURPLE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_STAIRS = register("magenta_terracotta_stairs", new BaseConsistencyStairBlock(MAGENTA_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(MAGENTA_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_STAIRS = register("pink_terracotta_stairs", new BaseConsistencyStairBlock(PINK_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(PINK_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_STAIRS = register("white_terracotta_stairs", new BaseConsistencyStairBlock(WHITE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(WHITE_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = register("light_gray_terracotta_stairs", new BaseConsistencyStairBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_STAIRS = register("gray_terracotta_stairs", new BaseConsistencyStairBlock(GRAY_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(GRAY_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_STAIRS = register("black_terracotta_stairs", new BaseConsistencyStairBlock(BLACK_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(BLACK_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_STAIRS = register("brown_terracotta_stairs", new BaseConsistencyStairBlock(BROWN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(BROWN_TERRACOTTA)));
    public static final Block TERRACOTTA_STAIRS = register("terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA)));

    // Terracotta Wall
    public static final Block RED_TERRACOTTA_WALL = register("red_terracotta_wall", new WallBlock(FabricBlockSettings.copy(RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_WALL = register("orange_terracotta_wall", new WallBlock(FabricBlockSettings.copy(ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_WALL = register("yellow_terracotta_wall", new WallBlock(FabricBlockSettings.copy(YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_WALL = register("lime_terracotta_wall", new WallBlock(FabricBlockSettings.copy(LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_WALL = register("green_terracotta_wall", new WallBlock(FabricBlockSettings.copy(GREEN_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_WALL = register("blue_terracotta_wall", new WallBlock(FabricBlockSettings.copy(BLUE_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_WALL = register("cyan_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = register("light_blue_terracotta_wall", new WallBlock(FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_WALL = register("purple_terracotta_wall", new WallBlock(FabricBlockSettings.copy(PURPLE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_WALL = register("magenta_terracotta_wall", new WallBlock(FabricBlockSettings.copy(MAGENTA_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_WALL = register("pink_terracotta_wall", new WallBlock(FabricBlockSettings.copy(PINK_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_WALL = register("white_terracotta_wall", new WallBlock(FabricBlockSettings.copy(WHITE_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = register("light_gray_terracotta_wall", new WallBlock(FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_WALL = register("gray_terracotta_wall", new WallBlock(FabricBlockSettings.copy(GRAY_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_WALL = register("black_terracotta_wall", new WallBlock(FabricBlockSettings.copy(BLACK_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_WALL = register("brown_terracotta_wall", new WallBlock(FabricBlockSettings.copy(BROWN_TERRACOTTA)));
    public static final Block TERRACOTTA_WALL = register("terracotta_wall", new WallBlock(FabricBlockSettings.copy(TERRACOTTA)));

    // Terracotta Gates
    public static final Block RED_TERRACOTTA_GATE = register("red_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_GATE = register("orange_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_GATE = register("yellow_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_GATE = register("lime_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_GATE = register("green_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(GREEN_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_GATE = register("blue_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(BLUE_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_GATE = register("cyan_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_GATE = register("light_blue_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_GATE = register("purple_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(PURPLE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_GATE = register("magenta_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(MAGENTA_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_GATE = register("pink_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(PINK_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_GATE = register("white_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(WHITE_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_GATE = register("light_gray_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_GATE = register("gray_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(GRAY_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_GATE = register("black_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(BLACK_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_GATE = register("brown_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(BROWN_TERRACOTTA)));
    public static final Block TERRACOTTA_GATE = register("terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(TERRACOTTA)));

    public static final Block SMOOTH_RED_TERRACOTTA = register("smooth_red_terracotta", new Block(FabricBlockSettings.copy(RED_TERRACOTTA)));
    public static final Block SMOOTH_ORANGE_TERRACOTTA = register("smooth_orange_terracotta", new Block(FabricBlockSettings.copy(ORANGE_TERRACOTTA)));
    public static final Block SMOOTH_YELLOW_TERRACOTTA = register("smooth_yellow_terracotta", new Block(FabricBlockSettings.copy(YELLOW_TERRACOTTA)));
    public static final Block SMOOTH_LIME_TERRACOTTA = register("smooth_lime_terracotta", new Block(FabricBlockSettings.copy(LIME_TERRACOTTA)));
    public static final Block SMOOTH_GREEN_TERRACOTTA = register("smooth_green_terracotta", new Block(FabricBlockSettings.copy(GREEN_TERRACOTTA)));
    public static final Block SMOOTH_BLUE_TERRACOTTA = register("smooth_blue_terracotta", new Block(FabricBlockSettings.copy(BLUE_TERRACOTTA)));
    public static final Block SMOOTH_CYAN_TERRACOTTA = register("smooth_cyan_terracotta", new Block(FabricBlockSettings.copy(CYAN_TERRACOTTA)));
    public static final Block SMOOTH_LIGHT_BLUE_TERRACOTTA = register("smooth_light_blue_terracotta", new Block(FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA)));
    public static final Block SMOOTH_PURPLE_TERRACOTTA = register("smooth_purple_terracotta", new Block(FabricBlockSettings.copy(PURPLE_TERRACOTTA)));
    public static final Block SMOOTH_MAGENTA_TERRACOTTA = register("smooth_magenta_terracotta", new Block(FabricBlockSettings.copy(MAGENTA_TERRACOTTA)));
    public static final Block SMOOTH_PINK_TERRACOTTA = register("smooth_pink_terracotta", new Block(FabricBlockSettings.copy(PINK_TERRACOTTA)));
    public static final Block SMOOTH_WHITE_TERRACOTTA = register("smooth_white_terracotta", new Block(FabricBlockSettings.copy(WHITE_TERRACOTTA)));
    public static final Block SMOOTH_LIGHT_GRAY_TERRACOTTA = register("smooth_light_gray_terracotta", new Block(FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA)));
    public static final Block SMOOTH_GRAY_TERRACOTTA = register("smooth_gray_terracotta", new Block(FabricBlockSettings.copy(GRAY_TERRACOTTA)));
    public static final Block SMOOTH_BLACK_TERRACOTTA = register("smooth_black_terracotta", new Block(FabricBlockSettings.copy(BLACK_TERRACOTTA)));
    public static final Block SMOOTH_BROWN_TERRACOTTA = register("smooth_brown_terracotta", new Block(FabricBlockSettings.copy(BROWN_TERRACOTTA)));
    public static final Block SMOOTH_TERRACOTTA = register("smooth_terracotta", new Block(FabricBlockSettings.copy(TERRACOTTA)));

    public static final Block SMOOTH_RED_TERRACOTTA_SLAB = register("smooth_red_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_RED_TERRACOTTA)));
    public static final Block SMOOTH_ORANGE_TERRACOTTA_SLAB = register("smooth_orange_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_ORANGE_TERRACOTTA)));
    public static final Block SMOOTH_YELLOW_TERRACOTTA_SLAB = register("smooth_yellow_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_YELLOW_TERRACOTTA)));
    public static final Block SMOOTH_LIME_TERRACOTTA_SLAB = register("smooth_lime_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_LIME_TERRACOTTA)));
    public static final Block SMOOTH_GREEN_TERRACOTTA_SLAB = register("smooth_green_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_GREEN_TERRACOTTA)));
    public static final Block SMOOTH_BLUE_TERRACOTTA_SLAB = register("smooth_blue_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_BLUE_TERRACOTTA)));
    public static final Block SMOOTH_CYAN_TERRACOTTA_SLAB = register("smooth_cyan_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_CYAN_TERRACOTTA)));
    public static final Block SMOOTH_LIGHT_BLUE_TERRACOTTA_SLAB = register("smooth_light_blue_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_LIGHT_BLUE_TERRACOTTA)));
    public static final Block SMOOTH_PURPLE_TERRACOTTA_SLAB = register("smooth_purple_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_PURPLE_TERRACOTTA)));
    public static final Block SMOOTH_MAGENTA_TERRACOTTA_SLAB = register("smooth_magenta_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_MAGENTA_TERRACOTTA)));
    public static final Block SMOOTH_PINK_TERRACOTTA_SLAB = register("smooth_pink_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_PINK_TERRACOTTA)));
    public static final Block SMOOTH_WHITE_TERRACOTTA_SLAB = register("smooth_white_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_WHITE_TERRACOTTA)));
    public static final Block SMOOTH_LIGHT_GRAY_TERRACOTTA_SLAB = register("smooth_light_gray_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_LIGHT_GRAY_TERRACOTTA)));
    public static final Block SMOOTH_GRAY_TERRACOTTA_SLAB = register("smooth_gray_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_GRAY_TERRACOTTA)));
    public static final Block SMOOTH_BLACK_TERRACOTTA_SLAB = register("smooth_black_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_BLACK_TERRACOTTA)));
    public static final Block SMOOTH_BROWN_TERRACOTTA_SLAB = register("smooth_brown_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_BROWN_TERRACOTTA)));
    public static final Block SMOOTH_TERRACOTTA_SLAB = register("smooth_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_TERRACOTTA)));

    // Terracotta Stairs
    public static final Block SMOOTH_RED_TERRACOTTA_STAIRS = register("smooth_red_terracotta_stairs", new BaseConsistencyStairBlock(RED_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(SMOOTH_RED_TERRACOTTA)));
    public static final Block SMOOTH_ORANGE_TERRACOTTA_STAIRS = register("smooth_orange_terracotta_stairs", new BaseConsistencyStairBlock(ORANGE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(SMOOTH_ORANGE_TERRACOTTA)));
    public static final Block SMOOTH_YELLOW_TERRACOTTA_STAIRS = register("smooth_yellow_terracotta_stairs", new BaseConsistencyStairBlock(YELLOW_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(SMOOTH_YELLOW_TERRACOTTA)));
    public static final Block SMOOTH_LIME_TERRACOTTA_STAIRS = register("smooth_lime_terracotta_stairs", new BaseConsistencyStairBlock(LIME_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(SMOOTH_LIME_TERRACOTTA)));
    public static final Block SMOOTH_GREEN_TERRACOTTA_STAIRS = register("smooth_green_terracotta_stairs", new BaseConsistencyStairBlock(GREEN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(SMOOTH_GREEN_TERRACOTTA)));
    public static final Block SMOOTH_BLUE_TERRACOTTA_STAIRS = register("smooth_blue_terracotta_stairs", new BaseConsistencyStairBlock(BLUE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(SMOOTH_BLUE_TERRACOTTA)));
    public static final Block SMOOTH_CYAN_TERRACOTTA_STAIRS = register("smooth_cyan_terracotta_stairs", new BaseConsistencyStairBlock(CYAN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(SMOOTH_CYAN_TERRACOTTA)));
    public static final Block SMOOTH_LIGHT_BLUE_TERRACOTTA_STAIRS = register("smooth_light_blue_terracotta_stairs", new BaseConsistencyStairBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(SMOOTH_LIGHT_BLUE_TERRACOTTA)));
    public static final Block SMOOTH_PURPLE_TERRACOTTA_STAIRS = register("smooth_purple_terracotta_stairs", new BaseConsistencyStairBlock(PURPLE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(SMOOTH_PURPLE_TERRACOTTA)));
    public static final Block SMOOTH_MAGENTA_TERRACOTTA_STAIRS = register("smooth_magenta_terracotta_stairs", new BaseConsistencyStairBlock(MAGENTA_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(SMOOTH_MAGENTA_TERRACOTTA)));
    public static final Block SMOOTH_PINK_TERRACOTTA_STAIRS = register("smooth_pink_terracotta_stairs", new BaseConsistencyStairBlock(PINK_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(SMOOTH_PINK_TERRACOTTA)));
    public static final Block SMOOTH_WHITE_TERRACOTTA_STAIRS = register("smooth_white_terracotta_stairs", new BaseConsistencyStairBlock(WHITE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(SMOOTH_WHITE_TERRACOTTA)));
    public static final Block SMOOTH_LIGHT_GRAY_TERRACOTTA_STAIRS = register("smooth_light_gray_terracotta_stairs", new BaseConsistencyStairBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(SMOOTH_LIGHT_GRAY_TERRACOTTA)));
    public static final Block SMOOTH_GRAY_TERRACOTTA_STAIRS = register("smooth_gray_terracotta_stairs", new BaseConsistencyStairBlock(GRAY_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(SMOOTH_GRAY_TERRACOTTA)));
    public static final Block SMOOTH_BLACK_TERRACOTTA_STAIRS = register("smooth_black_terracotta_stairs", new BaseConsistencyStairBlock(BLACK_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(SMOOTH_BLACK_TERRACOTTA)));
    public static final Block SMOOTH_BROWN_TERRACOTTA_STAIRS = register("smooth_brown_terracotta_stairs", new BaseConsistencyStairBlock(BROWN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(SMOOTH_BROWN_TERRACOTTA)));
    public static final Block SMOOTH_TERRACOTTA_STAIRS = register("smooth_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(SMOOTH_TERRACOTTA)));

    // Terracotta Wall
    public static final Block SMOOTH_RED_TERRACOTTA_WALL = register("smooth_red_terracotta_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_RED_TERRACOTTA)));
    public static final Block SMOOTH_ORANGE_TERRACOTTA_WALL = register("smooth_orange_terracotta_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_ORANGE_TERRACOTTA)));
    public static final Block SMOOTH_YELLOW_TERRACOTTA_WALL = register("smooth_yellow_terracotta_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_YELLOW_TERRACOTTA)));
    public static final Block SMOOTH_LIME_TERRACOTTA_WALL = register("smooth_lime_terracotta_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_LIME_TERRACOTTA)));
    public static final Block SMOOTH_GREEN_TERRACOTTA_WALL = register("smooth_green_terracotta_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_GREEN_TERRACOTTA)));
    public static final Block SMOOTH_BLUE_TERRACOTTA_WALL = register("smooth_blue_terracotta_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_BLUE_TERRACOTTA)));
    public static final Block SMOOTH_CYAN_TERRACOTTA_WALL = register("smooth_cyan_terracotta_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_CYAN_TERRACOTTA)));
    public static final Block SMOOTH_LIGHT_BLUE_TERRACOTTA_WALL = register("smooth_light_blue_terracotta_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_LIGHT_BLUE_TERRACOTTA)));
    public static final Block SMOOTH_PURPLE_TERRACOTTA_WALL = register("smooth_purple_terracotta_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_PURPLE_TERRACOTTA)));
    public static final Block SMOOTH_MAGENTA_TERRACOTTA_WALL = register("smooth_magenta_terracotta_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_MAGENTA_TERRACOTTA)));
    public static final Block SMOOTH_PINK_TERRACOTTA_WALL = register("smooth_pink_terracotta_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_PINK_TERRACOTTA)));
    public static final Block SMOOTH_WHITE_TERRACOTTA_WALL = register("smooth_white_terracotta_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_WHITE_TERRACOTTA)));
    public static final Block SMOOTH_LIGHT_GRAY_TERRACOTTA_WALL = register("smooth_light_gray_terracotta_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_LIGHT_GRAY_TERRACOTTA)));
    public static final Block SMOOTH_GRAY_TERRACOTTA_WALL = register("smooth_gray_terracotta_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_GRAY_TERRACOTTA)));
    public static final Block SMOOTH_BLACK_TERRACOTTA_WALL = register("smooth_black_terracotta_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_BLACK_TERRACOTTA)));
    public static final Block SMOOTH_BROWN_TERRACOTTA_WALL = register("smooth_brown_terracotta_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_BROWN_TERRACOTTA)));
    public static final Block SMOOTH_TERRACOTTA_WALL = register("smooth_terracotta_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_TERRACOTTA)));

    // Terracotta Gates
    public static final Block SMOOTH_RED_TERRACOTTA_GATE = register("smooth_red_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_RED_TERRACOTTA)));
    public static final Block SMOOTH_ORANGE_TERRACOTTA_GATE = register("smooth_orange_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_ORANGE_TERRACOTTA)));
    public static final Block SMOOTH_YELLOW_TERRACOTTA_GATE = register("smooth_yellow_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_YELLOW_TERRACOTTA)));
    public static final Block SMOOTH_LIME_TERRACOTTA_GATE = register("smooth_lime_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_LIME_TERRACOTTA)));
    public static final Block SMOOTH_GREEN_TERRACOTTA_GATE = register("smooth_green_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_GREEN_TERRACOTTA)));
    public static final Block SMOOTH_BLUE_TERRACOTTA_GATE = register("smooth_blue_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_BLUE_TERRACOTTA)));
    public static final Block SMOOTH_CYAN_TERRACOTTA_GATE = register("smooth_cyan_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_CYAN_TERRACOTTA)));
    public static final Block SMOOTH_LIGHT_BLUE_TERRACOTTA_GATE = register("smooth_light_blue_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_LIGHT_BLUE_TERRACOTTA)));
    public static final Block SMOOTH_PURPLE_TERRACOTTA_GATE = register("smooth_purple_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_PURPLE_TERRACOTTA)));
    public static final Block SMOOTH_MAGENTA_TERRACOTTA_GATE = register("smooth_magenta_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_MAGENTA_TERRACOTTA)));
    public static final Block SMOOTH_PINK_TERRACOTTA_GATE = register("smooth_pink_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_PINK_TERRACOTTA)));
    public static final Block SMOOTH_WHITE_TERRACOTTA_GATE = register("smooth_white_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_WHITE_TERRACOTTA)));
    public static final Block SMOOTH_LIGHT_GRAY_TERRACOTTA_GATE = register("smooth_light_gray_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_LIGHT_GRAY_TERRACOTTA)));
    public static final Block SMOOTH_GRAY_TERRACOTTA_GATE = register("smooth_gray_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_GRAY_TERRACOTTA)));
    public static final Block SMOOTH_BLACK_TERRACOTTA_GATE = register("smooth_black_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_BLACK_TERRACOTTA)));
    public static final Block SMOOTH_BROWN_TERRACOTTA_GATE = register("smooth_brown_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_BROWN_TERRACOTTA)));
    public static final Block SMOOTH_TERRACOTTA_GATE = register("smooth_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_TERRACOTTA)));

    //mossy smooth
    //slab
    //stairs
    //wall
    //gate

    //cracked smooth
    //slab
    //stairs
    //wall
    //gate

    public static final Block POLISHED_RED_TERRACOTTA = register("polished_red_terracotta", new Block(FabricBlockSettings.copy(RED_TERRACOTTA)));
    public static final Block POLISHED_ORANGE_TERRACOTTA = register("polished_orange_terracotta", new Block(FabricBlockSettings.copy(ORANGE_TERRACOTTA)));
    public static final Block POLISHED_YELLOW_TERRACOTTA = register("polished_yellow_terracotta", new Block(FabricBlockSettings.copy(YELLOW_TERRACOTTA)));
    public static final Block POLISHED_LIME_TERRACOTTA = register("polished_lime_terracotta", new Block(FabricBlockSettings.copy(LIME_TERRACOTTA)));
    public static final Block POLISHED_GREEN_TERRACOTTA = register("polished_green_terracotta", new Block(FabricBlockSettings.copy(GREEN_TERRACOTTA)));
    public static final Block POLISHED_BLUE_TERRACOTTA = register("polished_blue_terracotta", new Block(FabricBlockSettings.copy(BLUE_TERRACOTTA)));
    public static final Block POLISHED_CYAN_TERRACOTTA = register("polished_cyan_terracotta", new Block(FabricBlockSettings.copy(CYAN_TERRACOTTA)));
    public static final Block POLISHED_LIGHT_BLUE_TERRACOTTA = register("polished_light_blue_terracotta", new Block(FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA)));
    public static final Block POLISHED_PURPLE_TERRACOTTA = register("polished_purple_terracotta", new Block(FabricBlockSettings.copy(PURPLE_TERRACOTTA)));
    public static final Block POLISHED_MAGENTA_TERRACOTTA = register("polished_magenta_terracotta", new Block(FabricBlockSettings.copy(MAGENTA_TERRACOTTA)));
    public static final Block POLISHED_PINK_TERRACOTTA = register("polished_pink_terracotta", new Block(FabricBlockSettings.copy(PINK_TERRACOTTA)));
    public static final Block POLISHED_WHITE_TERRACOTTA = register("polished_white_terracotta", new Block(FabricBlockSettings.copy(WHITE_TERRACOTTA)));
    public static final Block POLISHED_LIGHT_GRAY_TERRACOTTA = register("polished_light_gray_terracotta", new Block(FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA)));
    public static final Block POLISHED_GRAY_TERRACOTTA = register("polished_gray_terracotta", new Block(FabricBlockSettings.copy(GRAY_TERRACOTTA)));
    public static final Block POLISHED_BLACK_TERRACOTTA = register("polished_black_terracotta", new Block(FabricBlockSettings.copy(BLACK_TERRACOTTA)));
    public static final Block POLISHED_BROWN_TERRACOTTA = register("polished_brown_terracotta", new Block(FabricBlockSettings.copy(BROWN_TERRACOTTA)));
    public static final Block POLISHED_TERRACOTTA = register("polished_terracotta", new Block(FabricBlockSettings.copy(TERRACOTTA)));

    public static final Block POLISHED_RED_TERRACOTTA_SLAB = register("polished_red_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_RED_TERRACOTTA)));
    public static final Block POLISHED_ORANGE_TERRACOTTA_SLAB = register("polished_orange_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_ORANGE_TERRACOTTA)));
    public static final Block POLISHED_YELLOW_TERRACOTTA_SLAB = register("polished_yellow_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_YELLOW_TERRACOTTA)));
    public static final Block POLISHED_LIME_TERRACOTTA_SLAB = register("polished_lime_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_LIME_TERRACOTTA)));
    public static final Block POLISHED_GREEN_TERRACOTTA_SLAB = register("polished_green_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_GREEN_TERRACOTTA)));
    public static final Block POLISHED_BLUE_TERRACOTTA_SLAB = register("polished_blue_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_BLUE_TERRACOTTA)));
    public static final Block POLISHED_CYAN_TERRACOTTA_SLAB = register("polished_cyan_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_CYAN_TERRACOTTA)));
    public static final Block POLISHED_LIGHT_BLUE_TERRACOTTA_SLAB = register("polished_light_blue_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_LIGHT_BLUE_TERRACOTTA)));
    public static final Block POLISHED_PURPLE_TERRACOTTA_SLAB = register("polished_purple_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_PURPLE_TERRACOTTA)));
    public static final Block POLISHED_MAGENTA_TERRACOTTA_SLAB = register("polished_magenta_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_MAGENTA_TERRACOTTA)));
    public static final Block POLISHED_PINK_TERRACOTTA_SLAB = register("polished_pink_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_PINK_TERRACOTTA)));
    public static final Block POLISHED_WHITE_TERRACOTTA_SLAB = register("polished_white_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_WHITE_TERRACOTTA)));
    public static final Block POLISHED_LIGHT_GRAY_TERRACOTTA_SLAB = register("polished_light_gray_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_LIGHT_GRAY_TERRACOTTA)));
    public static final Block POLISHED_GRAY_TERRACOTTA_SLAB = register("polished_gray_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_GRAY_TERRACOTTA)));
    public static final Block POLISHED_BLACK_TERRACOTTA_SLAB = register("polished_black_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_BLACK_TERRACOTTA)));
    public static final Block POLISHED_BROWN_TERRACOTTA_SLAB = register("polished_brown_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_BROWN_TERRACOTTA)));
    public static final Block POLISHED_TERRACOTTA_SLAB = register("polished_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_TERRACOTTA)));

    // Terracotta Stairs
    public static final Block POLISHED_RED_TERRACOTTA_STAIRS = register("polished_red_terracotta_stairs", new BaseConsistencyStairBlock(RED_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(POLISHED_RED_TERRACOTTA)));
    public static final Block POLISHED_ORANGE_TERRACOTTA_STAIRS = register("polished_orange_terracotta_stairs", new BaseConsistencyStairBlock(ORANGE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(POLISHED_ORANGE_TERRACOTTA)));
    public static final Block POLISHED_YELLOW_TERRACOTTA_STAIRS = register("polished_yellow_terracotta_stairs", new BaseConsistencyStairBlock(YELLOW_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(POLISHED_YELLOW_TERRACOTTA)));
    public static final Block POLISHED_LIME_TERRACOTTA_STAIRS = register("polished_lime_terracotta_stairs", new BaseConsistencyStairBlock(LIME_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(POLISHED_LIME_TERRACOTTA)));
    public static final Block POLISHED_GREEN_TERRACOTTA_STAIRS = register("polished_green_terracotta_stairs", new BaseConsistencyStairBlock(GREEN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(POLISHED_GREEN_TERRACOTTA)));
    public static final Block POLISHED_BLUE_TERRACOTTA_STAIRS = register("polished_blue_terracotta_stairs", new BaseConsistencyStairBlock(BLUE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(POLISHED_BLUE_TERRACOTTA)));
    public static final Block POLISHED_CYAN_TERRACOTTA_STAIRS = register("polished_cyan_terracotta_stairs", new BaseConsistencyStairBlock(CYAN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(POLISHED_CYAN_TERRACOTTA)));
    public static final Block POLISHED_LIGHT_BLUE_TERRACOTTA_STAIRS = register("polished_light_blue_terracotta_stairs", new BaseConsistencyStairBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(POLISHED_LIGHT_BLUE_TERRACOTTA)));
    public static final Block POLISHED_PURPLE_TERRACOTTA_STAIRS = register("polished_purple_terracotta_stairs", new BaseConsistencyStairBlock(PURPLE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(POLISHED_PURPLE_TERRACOTTA)));
    public static final Block POLISHED_MAGENTA_TERRACOTTA_STAIRS = register("polished_magenta_terracotta_stairs", new BaseConsistencyStairBlock(MAGENTA_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(POLISHED_MAGENTA_TERRACOTTA)));
    public static final Block POLISHED_PINK_TERRACOTTA_STAIRS = register("polished_pink_terracotta_stairs", new BaseConsistencyStairBlock(PINK_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(POLISHED_PINK_TERRACOTTA)));
    public static final Block POLISHED_WHITE_TERRACOTTA_STAIRS = register("polished_white_terracotta_stairs", new BaseConsistencyStairBlock(WHITE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(POLISHED_WHITE_TERRACOTTA)));
    public static final Block POLISHED_LIGHT_GRAY_TERRACOTTA_STAIRS = register("polished_light_gray_terracotta_stairs", new BaseConsistencyStairBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(POLISHED_LIGHT_GRAY_TERRACOTTA)));
    public static final Block POLISHED_GRAY_TERRACOTTA_STAIRS = register("polished_gray_terracotta_stairs", new BaseConsistencyStairBlock(GRAY_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(POLISHED_GRAY_TERRACOTTA)));
    public static final Block POLISHED_BLACK_TERRACOTTA_STAIRS = register("polished_black_terracotta_stairs", new BaseConsistencyStairBlock(BLACK_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(POLISHED_BLACK_TERRACOTTA)));
    public static final Block POLISHED_BROWN_TERRACOTTA_STAIRS = register("polished_brown_terracotta_stairs", new BaseConsistencyStairBlock(BROWN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(POLISHED_BROWN_TERRACOTTA)));
    public static final Block POLISHED_TERRACOTTA_STAIRS = register("polished_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(POLISHED_TERRACOTTA)));

    // Terracotta Wall
    public static final Block POLISHED_RED_TERRACOTTA_WALL = register("polished_red_terracotta_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_RED_TERRACOTTA)));
    public static final Block POLISHED_ORANGE_TERRACOTTA_WALL = register("polished_orange_terracotta_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_ORANGE_TERRACOTTA)));
    public static final Block POLISHED_YELLOW_TERRACOTTA_WALL = register("polished_yellow_terracotta_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_YELLOW_TERRACOTTA)));
    public static final Block POLISHED_LIME_TERRACOTTA_WALL = register("polished_lime_terracotta_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_LIME_TERRACOTTA)));
    public static final Block POLISHED_GREEN_TERRACOTTA_WALL = register("polished_green_terracotta_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_GREEN_TERRACOTTA)));
    public static final Block POLISHED_BLUE_TERRACOTTA_WALL = register("polished_blue_terracotta_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_BLUE_TERRACOTTA)));
    public static final Block POLISHED_CYAN_TERRACOTTA_WALL = register("polished_cyan_terracotta_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_CYAN_TERRACOTTA)));
    public static final Block POLISHED_LIGHT_BLUE_TERRACOTTA_WALL = register("polished_light_blue_terracotta_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_LIGHT_BLUE_TERRACOTTA)));
    public static final Block POLISHED_PURPLE_TERRACOTTA_WALL = register("polished_purple_terracotta_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_PURPLE_TERRACOTTA)));
    public static final Block POLISHED_MAGENTA_TERRACOTTA_WALL = register("polished_magenta_terracotta_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_MAGENTA_TERRACOTTA)));
    public static final Block POLISHED_PINK_TERRACOTTA_WALL = register("polished_pink_terracotta_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_PINK_TERRACOTTA)));
    public static final Block POLISHED_WHITE_TERRACOTTA_WALL = register("polished_white_terracotta_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_WHITE_TERRACOTTA)));
    public static final Block POLISHED_LIGHT_GRAY_TERRACOTTA_WALL = register("polished_light_gray_terracotta_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_LIGHT_GRAY_TERRACOTTA)));
    public static final Block POLISHED_GRAY_TERRACOTTA_WALL = register("polished_gray_terracotta_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_GRAY_TERRACOTTA)));
    public static final Block POLISHED_BLACK_TERRACOTTA_WALL = register("polished_black_terracotta_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_BLACK_TERRACOTTA)));
    public static final Block POLISHED_BROWN_TERRACOTTA_WALL = register("polished_brown_terracotta_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_BROWN_TERRACOTTA)));
    public static final Block POLISHED_TERRACOTTA_WALL = register("polished_terracotta_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_TERRACOTTA)));

    // Terracotta Gates
    public static final Block POLISHED_RED_TERRACOTTA_GATE = register("polished_red_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_RED_TERRACOTTA)));
    public static final Block POLISHED_ORANGE_TERRACOTTA_GATE = register("polished_orange_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_ORANGE_TERRACOTTA)));
    public static final Block POLISHED_YELLOW_TERRACOTTA_GATE = register("polished_yellow_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_YELLOW_TERRACOTTA)));
    public static final Block POLISHED_LIME_TERRACOTTA_GATE = register("polished_lime_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_LIME_TERRACOTTA)));
    public static final Block POLISHED_GREEN_TERRACOTTA_GATE = register("polished_green_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_GREEN_TERRACOTTA)));
    public static final Block POLISHED_BLUE_TERRACOTTA_GATE = register("polished_blue_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_BLUE_TERRACOTTA)));
    public static final Block POLISHED_CYAN_TERRACOTTA_GATE = register("polished_cyan_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_CYAN_TERRACOTTA)));
    public static final Block POLISHED_LIGHT_BLUE_TERRACOTTA_GATE = register("polished_light_blue_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_LIGHT_BLUE_TERRACOTTA)));
    public static final Block POLISHED_PURPLE_TERRACOTTA_GATE = register("polished_purple_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_PURPLE_TERRACOTTA)));
    public static final Block POLISHED_MAGENTA_TERRACOTTA_GATE = register("polished_magenta_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_MAGENTA_TERRACOTTA)));
    public static final Block POLISHED_PINK_TERRACOTTA_GATE = register("polished_pink_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_PINK_TERRACOTTA)));
    public static final Block POLISHED_WHITE_TERRACOTTA_GATE = register("polished_white_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_WHITE_TERRACOTTA)));
    public static final Block POLISHED_LIGHT_GRAY_TERRACOTTA_GATE = register("polished_light_gray_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_LIGHT_GRAY_TERRACOTTA)));
    public static final Block POLISHED_GRAY_TERRACOTTA_GATE = register("polished_gray_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_GRAY_TERRACOTTA)));
    public static final Block POLISHED_BLACK_TERRACOTTA_GATE = register("polished_black_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_BLACK_TERRACOTTA)));
    public static final Block POLISHED_BROWN_TERRACOTTA_GATE = register("polished_brown_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_BROWN_TERRACOTTA)));
    public static final Block POLISHED_TERRACOTTA_GATE = register("polished_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_TERRACOTTA)));

    public static final Block CUT_RED_TERRACOTTA = register("cut_red_terracotta", new Block(FabricBlockSettings.copy(RED_TERRACOTTA)));
    public static final Block CUT_ORANGE_TERRACOTTA = register("cut_orange_terracotta", new Block(FabricBlockSettings.copy(ORANGE_TERRACOTTA)));
    public static final Block CUT_YELLOW_TERRACOTTA = register("cut_yellow_terracotta", new Block(FabricBlockSettings.copy(YELLOW_TERRACOTTA)));
    public static final Block CUT_LIME_TERRACOTTA = register("cut_lime_terracotta", new Block(FabricBlockSettings.copy(LIME_TERRACOTTA)));
    public static final Block CUT_GREEN_TERRACOTTA = register("cut_green_terracotta", new Block(FabricBlockSettings.copy(GREEN_TERRACOTTA)));
    public static final Block CUT_BLUE_TERRACOTTA = register("cut_blue_terracotta", new Block(FabricBlockSettings.copy(BLUE_TERRACOTTA)));
    public static final Block CUT_CYAN_TERRACOTTA = register("cut_cyan_terracotta", new Block(FabricBlockSettings.copy(CYAN_TERRACOTTA)));
    public static final Block CUT_LIGHT_BLUE_TERRACOTTA = register("cut_light_blue_terracotta", new Block(FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA)));
    public static final Block CUT_PURPLE_TERRACOTTA = register("cut_purple_terracotta", new Block(FabricBlockSettings.copy(PURPLE_TERRACOTTA)));
    public static final Block CUT_MAGENTA_TERRACOTTA = register("cut_magenta_terracotta", new Block(FabricBlockSettings.copy(MAGENTA_TERRACOTTA)));
    public static final Block CUT_PINK_TERRACOTTA = register("cut_pink_terracotta", new Block(FabricBlockSettings.copy(PINK_TERRACOTTA)));
    public static final Block CUT_WHITE_TERRACOTTA = register("cut_white_terracotta", new Block(FabricBlockSettings.copy(WHITE_TERRACOTTA)));
    public static final Block CUT_LIGHT_GRAY_TERRACOTTA = register("cut_light_gray_terracotta", new Block(FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA)));
    public static final Block CUT_GRAY_TERRACOTTA = register("cut_gray_terracotta", new Block(FabricBlockSettings.copy(GRAY_TERRACOTTA)));
    public static final Block CUT_BLACK_TERRACOTTA = register("cut_black_terracotta", new Block(FabricBlockSettings.copy(BLACK_TERRACOTTA)));
    public static final Block CUT_BROWN_TERRACOTTA = register("cut_brown_terracotta", new Block(FabricBlockSettings.copy(BROWN_TERRACOTTA)));
    public static final Block CUT_TERRACOTTA = register("cut_terracotta", new Block(FabricBlockSettings.copy(TERRACOTTA)));

    public static final Block CUT_RED_TERRACOTTA_SLAB = register("cut_red_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CUT_RED_TERRACOTTA)));
    public static final Block CUT_ORANGE_TERRACOTTA_SLAB = register("cut_orange_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CUT_ORANGE_TERRACOTTA)));
    public static final Block CUT_YELLOW_TERRACOTTA_SLAB = register("cut_yellow_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CUT_YELLOW_TERRACOTTA)));
    public static final Block CUT_LIME_TERRACOTTA_SLAB = register("cut_lime_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CUT_LIME_TERRACOTTA)));
    public static final Block CUT_GREEN_TERRACOTTA_SLAB = register("cut_green_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CUT_GREEN_TERRACOTTA)));
    public static final Block CUT_BLUE_TERRACOTTA_SLAB = register("cut_blue_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CUT_BLUE_TERRACOTTA)));
    public static final Block CUT_CYAN_TERRACOTTA_SLAB = register("cut_cyan_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CUT_CYAN_TERRACOTTA)));
    public static final Block CUT_LIGHT_BLUE_TERRACOTTA_SLAB = register("cut_light_blue_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CUT_LIGHT_BLUE_TERRACOTTA)));
    public static final Block CUT_PURPLE_TERRACOTTA_SLAB = register("cut_purple_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CUT_PURPLE_TERRACOTTA)));
    public static final Block CUT_MAGENTA_TERRACOTTA_SLAB = register("cut_magenta_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CUT_MAGENTA_TERRACOTTA)));
    public static final Block CUT_PINK_TERRACOTTA_SLAB = register("cut_pink_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CUT_PINK_TERRACOTTA)));
    public static final Block CUT_WHITE_TERRACOTTA_SLAB = register("cut_white_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CUT_WHITE_TERRACOTTA)));
    public static final Block CUT_LIGHT_GRAY_TERRACOTTA_SLAB = register("cut_light_gray_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CUT_LIGHT_GRAY_TERRACOTTA)));
    public static final Block CUT_GRAY_TERRACOTTA_SLAB = register("cut_gray_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CUT_GRAY_TERRACOTTA)));
    public static final Block CUT_BLACK_TERRACOTTA_SLAB = register("cut_black_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CUT_BLACK_TERRACOTTA)));
    public static final Block CUT_BROWN_TERRACOTTA_SLAB = register("cut_brown_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CUT_BROWN_TERRACOTTA)));
    public static final Block CUT_TERRACOTTA_SLAB = register("cut_terracotta_slab", new SlabBlock(FabricBlockSettings.copy(CUT_TERRACOTTA)));

    // Terracotta Stairs
    public static final Block CUT_RED_TERRACOTTA_STAIRS = register("cut_red_terracotta_stairs", new BaseConsistencyStairBlock(RED_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CUT_RED_TERRACOTTA)));
    public static final Block CUT_ORANGE_TERRACOTTA_STAIRS = register("cut_orange_terracotta_stairs", new BaseConsistencyStairBlock(ORANGE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CUT_ORANGE_TERRACOTTA)));
    public static final Block CUT_YELLOW_TERRACOTTA_STAIRS = register("cut_yellow_terracotta_stairs", new BaseConsistencyStairBlock(YELLOW_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CUT_YELLOW_TERRACOTTA)));
    public static final Block CUT_LIME_TERRACOTTA_STAIRS = register("cut_lime_terracotta_stairs", new BaseConsistencyStairBlock(LIME_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CUT_LIME_TERRACOTTA)));
    public static final Block CUT_GREEN_TERRACOTTA_STAIRS = register("cut_green_terracotta_stairs", new BaseConsistencyStairBlock(GREEN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CUT_GREEN_TERRACOTTA)));
    public static final Block CUT_BLUE_TERRACOTTA_STAIRS = register("cut_blue_terracotta_stairs", new BaseConsistencyStairBlock(BLUE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CUT_BLUE_TERRACOTTA)));
    public static final Block CUT_CYAN_TERRACOTTA_STAIRS = register("cut_cyan_terracotta_stairs", new BaseConsistencyStairBlock(CYAN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CUT_CYAN_TERRACOTTA)));
    public static final Block CUT_LIGHT_BLUE_TERRACOTTA_STAIRS = register("cut_light_blue_terracotta_stairs", new BaseConsistencyStairBlock(LIGHT_BLUE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CUT_LIGHT_BLUE_TERRACOTTA)));
    public static final Block CUT_PURPLE_TERRACOTTA_STAIRS = register("cut_purple_terracotta_stairs", new BaseConsistencyStairBlock(PURPLE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CUT_PURPLE_TERRACOTTA)));
    public static final Block CUT_MAGENTA_TERRACOTTA_STAIRS = register("cut_magenta_terracotta_stairs", new BaseConsistencyStairBlock(MAGENTA_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CUT_MAGENTA_TERRACOTTA)));
    public static final Block CUT_PINK_TERRACOTTA_STAIRS = register("cut_pink_terracotta_stairs", new BaseConsistencyStairBlock(PINK_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CUT_PINK_TERRACOTTA)));
    public static final Block CUT_WHITE_TERRACOTTA_STAIRS = register("cut_white_terracotta_stairs", new BaseConsistencyStairBlock(WHITE_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CUT_WHITE_TERRACOTTA)));
    public static final Block CUT_LIGHT_GRAY_TERRACOTTA_STAIRS = register("cut_light_gray_terracotta_stairs", new BaseConsistencyStairBlock(LIGHT_GRAY_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CUT_LIGHT_GRAY_TERRACOTTA)));
    public static final Block CUT_GRAY_TERRACOTTA_STAIRS = register("cut_gray_terracotta_stairs", new BaseConsistencyStairBlock(GRAY_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CUT_GRAY_TERRACOTTA)));
    public static final Block CUT_BLACK_TERRACOTTA_STAIRS = register("cut_black_terracotta_stairs", new BaseConsistencyStairBlock(BLACK_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CUT_BLACK_TERRACOTTA)));
    public static final Block CUT_BROWN_TERRACOTTA_STAIRS = register("cut_brown_terracotta_stairs", new BaseConsistencyStairBlock(BROWN_TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CUT_BROWN_TERRACOTTA)));
    public static final Block CUT_TERRACOTTA_STAIRS = register("cut_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(CUT_TERRACOTTA)));

    // Terracotta Wall
    public static final Block CUT_RED_TERRACOTTA_WALL = register("cut_red_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CUT_RED_TERRACOTTA)));
    public static final Block CUT_ORANGE_TERRACOTTA_WALL = register("cut_orange_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CUT_ORANGE_TERRACOTTA)));
    public static final Block CUT_YELLOW_TERRACOTTA_WALL = register("cut_yellow_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CUT_YELLOW_TERRACOTTA)));
    public static final Block CUT_LIME_TERRACOTTA_WALL = register("cut_lime_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CUT_LIME_TERRACOTTA)));
    public static final Block CUT_GREEN_TERRACOTTA_WALL = register("cut_green_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CUT_GREEN_TERRACOTTA)));
    public static final Block CUT_BLUE_TERRACOTTA_WALL = register("cut_blue_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CUT_BLUE_TERRACOTTA)));
    public static final Block CUT_CYAN_TERRACOTTA_WALL = register("cut_cyan_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CUT_CYAN_TERRACOTTA)));
    public static final Block CUT_LIGHT_BLUE_TERRACOTTA_WALL = register("cut_light_blue_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CUT_LIGHT_BLUE_TERRACOTTA)));
    public static final Block CUT_PURPLE_TERRACOTTA_WALL = register("cut_purple_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CUT_PURPLE_TERRACOTTA)));
    public static final Block CUT_MAGENTA_TERRACOTTA_WALL = register("cut_magenta_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CUT_MAGENTA_TERRACOTTA)));
    public static final Block CUT_PINK_TERRACOTTA_WALL = register("cut_pink_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CUT_PINK_TERRACOTTA)));
    public static final Block CUT_WHITE_TERRACOTTA_WALL = register("cut_white_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CUT_WHITE_TERRACOTTA)));
    public static final Block CUT_LIGHT_GRAY_TERRACOTTA_WALL = register("cut_light_gray_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CUT_LIGHT_GRAY_TERRACOTTA)));
    public static final Block CUT_GRAY_TERRACOTTA_WALL = register("cut_gray_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CUT_GRAY_TERRACOTTA)));
    public static final Block CUT_BLACK_TERRACOTTA_WALL = register("cut_black_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CUT_BLACK_TERRACOTTA)));
    public static final Block CUT_BROWN_TERRACOTTA_WALL = register("cut_brown_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CUT_BROWN_TERRACOTTA)));
    public static final Block CUT_TERRACOTTA_WALL = register("cut_terracotta_wall", new WallBlock(FabricBlockSettings.copy(CUT_TERRACOTTA)));

    // Terracotta Gates
    public static final Block CUT_RED_TERRACOTTA_GATE = register("cut_red_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_RED_TERRACOTTA)));
    public static final Block CUT_ORANGE_TERRACOTTA_GATE = register("cut_orange_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_ORANGE_TERRACOTTA)));
    public static final Block CUT_YELLOW_TERRACOTTA_GATE = register("cut_yellow_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_YELLOW_TERRACOTTA)));
    public static final Block CUT_LIME_TERRACOTTA_GATE = register("cut_lime_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_LIME_TERRACOTTA)));
    public static final Block CUT_GREEN_TERRACOTTA_GATE = register("cut_green_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_GREEN_TERRACOTTA)));
    public static final Block CUT_BLUE_TERRACOTTA_GATE = register("cut_blue_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_BLUE_TERRACOTTA)));
    public static final Block CUT_CYAN_TERRACOTTA_GATE = register("cut_cyan_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_CYAN_TERRACOTTA)));
    public static final Block CUT_LIGHT_BLUE_TERRACOTTA_GATE = register("cut_light_blue_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_LIGHT_BLUE_TERRACOTTA)));
    public static final Block CUT_PURPLE_TERRACOTTA_GATE = register("cut_purple_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_PURPLE_TERRACOTTA)));
    public static final Block CUT_MAGENTA_TERRACOTTA_GATE = register("cut_magenta_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_MAGENTA_TERRACOTTA)));
    public static final Block CUT_PINK_TERRACOTTA_GATE = register("cut_pink_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_PINK_TERRACOTTA)));
    public static final Block CUT_WHITE_TERRACOTTA_GATE = register("cut_white_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_WHITE_TERRACOTTA)));
    public static final Block CUT_LIGHT_GRAY_TERRACOTTA_GATE = register("cut_light_gray_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_LIGHT_GRAY_TERRACOTTA)));
    public static final Block CUT_GRAY_TERRACOTTA_GATE = register("cut_gray_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_GRAY_TERRACOTTA)));
    public static final Block CUT_BLACK_TERRACOTTA_GATE = register("cut_black_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_BLACK_TERRACOTTA)));
    public static final Block CUT_BROWN_TERRACOTTA_GATE = register("cut_brown_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_BROWN_TERRACOTTA)));
    public static final Block CUT_TERRACOTTA_GATE = register("cut_terracotta_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_TERRACOTTA)));

    //mossy polished
    //slab
    //stairs
    //wall
    //gate

    //cracked polished
    //slab
    //stairs
    //wall
    //gate

    public static final Block RED_TERRACOTTA_BRICKS = register("red_terracotta_bricks", new Block(FabricBlockSettings.copy(RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_BRICKS = register("orange_terracotta_bricks", new Block(FabricBlockSettings.copy(ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_BRICKS = register("yellow_terracotta_bricks", new Block(FabricBlockSettings.copy(YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_BRICKS = register("lime_terracotta_bricks", new Block(FabricBlockSettings.copy(LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_BRICKS = register("green_terracotta_bricks", new Block(FabricBlockSettings.copy(GREEN_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_BRICKS = register("blue_terracotta_bricks", new Block(FabricBlockSettings.copy(BLUE_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_BRICKS = register("cyan_terracotta_bricks", new Block(FabricBlockSettings.copy(CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS = register("light_blue_terracotta_bricks", new Block(FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_BRICKS = register("purple_terracotta_bricks", new Block(FabricBlockSettings.copy(PURPLE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_BRICKS = register("magenta_terracotta_bricks", new Block(FabricBlockSettings.copy(MAGENTA_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_BRICKS = register("pink_terracotta_bricks", new Block(FabricBlockSettings.copy(PINK_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_BRICKS = register("white_terracotta_bricks", new Block(FabricBlockSettings.copy(WHITE_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS = register("light_gray_terracotta_bricks", new Block(FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_BRICKS = register("gray_terracotta_bricks", new Block(FabricBlockSettings.copy(GRAY_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_BRICKS = register("black_terracotta_bricks", new Block(FabricBlockSettings.copy(BLACK_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_BRICKS = register("brown_terracotta_bricks", new Block(FabricBlockSettings.copy(BROWN_TERRACOTTA)));

    public static final Block RED_TERRACOTTA_BRICK_SLAB = register("red_terracotta_brick_slab", new SlabBlock(FabricBlockSettings.copy(RED_TERRACOTTA_BRICKS)));
    public static final Block ORANGE_TERRACOTTA_BRICK_SLAB = register("orange_terracotta_brick_slab", new SlabBlock(FabricBlockSettings.copy(ORANGE_TERRACOTTA_BRICKS)));
    public static final Block YELLOW_TERRACOTTA_BRICK_SLAB = register("yellow_terracotta_brick_slab", new SlabBlock(FabricBlockSettings.copy(YELLOW_TERRACOTTA_BRICKS)));
    public static final Block LIME_TERRACOTTA_BRICK_SLAB = register("lime_terracotta_brick_slab", new SlabBlock(FabricBlockSettings.copy(LIME_TERRACOTTA_BRICKS)));
    public static final Block GREEN_TERRACOTTA_BRICK_SLAB = register("green_terracotta_brick_slab", new SlabBlock(FabricBlockSettings.copy(GREEN_TERRACOTTA_BRICKS)));
    public static final Block BLUE_TERRACOTTA_BRICK_SLAB = register("blue_terracotta_brick_slab", new SlabBlock(FabricBlockSettings.copy(BLUE_TERRACOTTA_BRICKS)));
    public static final Block CYAN_TERRACOTTA_BRICK_SLAB = register("cyan_terracotta_brick_slab", new SlabBlock(FabricBlockSettings.copy(CYAN_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = register("light_blue_terracotta_brick_slab", new SlabBlock(FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA_BRICKS)));
    public static final Block PURPLE_TERRACOTTA_BRICK_SLAB = register("purple_terracotta_brick_slab", new SlabBlock(FabricBlockSettings.copy(PURPLE_TERRACOTTA_BRICKS)));
    public static final Block MAGENTA_TERRACOTTA_BRICK_SLAB = register("magenta_terracotta_brick_slab", new SlabBlock(FabricBlockSettings.copy(MAGENTA_TERRACOTTA_BRICKS)));
    public static final Block PINK_TERRACOTTA_BRICK_SLAB = register("pink_terracotta_brick_slab", new SlabBlock(FabricBlockSettings.copy(PINK_TERRACOTTA_BRICKS)));
    public static final Block WHITE_TERRACOTTA_BRICK_SLAB = register("white_terracotta_brick_slab", new SlabBlock(FabricBlockSettings.copy(WHITE_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = register("light_gray_terracotta_brick_slab", new SlabBlock(FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA_BRICKS)));
    public static final Block GRAY_TERRACOTTA_BRICK_SLAB = register("gray_terracotta_brick_slab", new SlabBlock(FabricBlockSettings.copy(GRAY_TERRACOTTA_BRICKS)));
    public static final Block BLACK_TERRACOTTA_BRICK_SLAB = register("black_terracotta_brick_slab", new SlabBlock(FabricBlockSettings.copy(BLACK_TERRACOTTA_BRICKS)));
    public static final Block BROWN_TERRACOTTA_BRICK_SLAB = register("brown_terracotta_brick_slab", new SlabBlock(FabricBlockSettings.copy(BROWN_TERRACOTTA_BRICKS)));

    // Terracotta Stairs
    public static final Block RED_TERRACOTTA_BRICK_STAIRS = register("red_terracotta_brick_stairs", new BaseConsistencyStairBlock(RED_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(RED_TERRACOTTA_BRICKS)));
    public static final Block ORANGE_TERRACOTTA_BRICK_STAIRS = register("orange_terracotta_brick_stairs", new BaseConsistencyStairBlock(ORANGE_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(ORANGE_TERRACOTTA_BRICKS)));
    public static final Block YELLOW_TERRACOTTA_BRICK_STAIRS = register("yellow_terracotta_brick_stairs", new BaseConsistencyStairBlock(YELLOW_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(YELLOW_TERRACOTTA_BRICKS)));
    public static final Block LIME_TERRACOTTA_BRICK_STAIRS = register("lime_terracotta_brick_stairs", new BaseConsistencyStairBlock(LIME_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(LIME_TERRACOTTA_BRICKS)));
    public static final Block GREEN_TERRACOTTA_BRICK_STAIRS = register("green_terracotta_brick_stairs", new BaseConsistencyStairBlock(GREEN_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(GREEN_TERRACOTTA_BRICKS)));
    public static final Block BLUE_TERRACOTTA_BRICK_STAIRS = register("blue_terracotta_brick_stairs", new BaseConsistencyStairBlock(BLUE_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BLUE_TERRACOTTA_BRICKS)));
    public static final Block CYAN_TERRACOTTA_BRICK_STAIRS = register("cyan_terracotta_brick_stairs", new BaseConsistencyStairBlock(CYAN_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(CYAN_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = register("light_blue_terracotta_brick_stairs", new BaseConsistencyStairBlock(LIGHT_BLUE_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA_BRICKS)));
    public static final Block PURPLE_TERRACOTTA_BRICK_STAIRS = register("purple_terracotta_brick_stairs", new BaseConsistencyStairBlock(PURPLE_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(PURPLE_TERRACOTTA_BRICKS)));
    public static final Block MAGENTA_TERRACOTTA_BRICK_STAIRS = register("magenta_terracotta_brick_stairs", new BaseConsistencyStairBlock(MAGENTA_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(MAGENTA_TERRACOTTA_BRICKS)));
    public static final Block PINK_TERRACOTTA_BRICK_STAIRS = register("pink_terracotta_brick_stairs", new BaseConsistencyStairBlock(PINK_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(PINK_TERRACOTTA_BRICKS)));
    public static final Block WHITE_TERRACOTTA_BRICK_STAIRS = register("white_terracotta_brick_stairs", new BaseConsistencyStairBlock(WHITE_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(WHITE_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = register("light_gray_terracotta_brick_stairs", new BaseConsistencyStairBlock(LIGHT_GRAY_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA_BRICKS)));
    public static final Block GRAY_TERRACOTTA_BRICK_STAIRS = register("gray_terracotta_brick_stairs", new BaseConsistencyStairBlock(GRAY_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(GRAY_TERRACOTTA_BRICKS)));
    public static final Block BLACK_TERRACOTTA_BRICK_STAIRS = register("black_terracotta_brick_stairs", new BaseConsistencyStairBlock(BLACK_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BLACK_TERRACOTTA_BRICKS)));
    public static final Block BROWN_TERRACOTTA_BRICK_STAIRS = register("brown_terracotta_brick_stairs", new BaseConsistencyStairBlock(BROWN_TERRACOTTA_BRICKS.getDefaultState(), FabricBlockSettings.copy(BROWN_TERRACOTTA_BRICKS)));
    // Terracotta Wall
    public static final Block RED_TERRACOTTA_BRICK_WALL = register("red_terracotta_brick_wall", new WallBlock(FabricBlockSettings.copy(RED_TERRACOTTA_BRICKS)));
    public static final Block ORANGE_TERRACOTTA_BRICK_WALL = register("orange_terracotta_brick_wall", new WallBlock(FabricBlockSettings.copy(ORANGE_TERRACOTTA_BRICKS)));
    public static final Block YELLOW_TERRACOTTA_BRICK_WALL = register("yellow_terracotta_brick_wall", new WallBlock(FabricBlockSettings.copy(YELLOW_TERRACOTTA_BRICKS)));
    public static final Block LIME_TERRACOTTA_BRICK_WALL = register("lime_terracotta_brick_wall", new WallBlock(FabricBlockSettings.copy(LIME_TERRACOTTA_BRICKS)));
    public static final Block GREEN_TERRACOTTA_BRICK_WALL = register("green_terracotta_brick_wall", new WallBlock(FabricBlockSettings.copy(GREEN_TERRACOTTA_BRICKS)));
    public static final Block BLUE_TERRACOTTA_BRICK_WALL = register("blue_terracotta_brick_wall", new WallBlock(FabricBlockSettings.copy(BLUE_TERRACOTTA_BRICKS)));
    public static final Block CYAN_TERRACOTTA_BRICK_WALL = register("cyan_terracotta_brick_wall", new WallBlock(FabricBlockSettings.copy(CYAN_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_WALL = register("light_blue_terracotta_brick_wall", new WallBlock(FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA_BRICKS)));
    public static final Block PURPLE_TERRACOTTA_BRICK_WALL = register("purple_terracotta_brick_wall", new WallBlock(FabricBlockSettings.copy(PURPLE_TERRACOTTA_BRICKS)));
    public static final Block MAGENTA_TERRACOTTA_BRICK_WALL = register("magenta_terracotta_brick_wall", new WallBlock(FabricBlockSettings.copy(MAGENTA_TERRACOTTA_BRICKS)));
    public static final Block PINK_TERRACOTTA_BRICK_WALL = register("pink_terracotta_brick_wall", new WallBlock(FabricBlockSettings.copy(PINK_TERRACOTTA_BRICKS)));
    public static final Block WHITE_TERRACOTTA_BRICK_WALL = register("white_terracotta_brick_wall", new WallBlock(FabricBlockSettings.copy(WHITE_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_WALL = register("light_gray_terracotta_brick_wall", new WallBlock(FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA_BRICKS)));
    public static final Block GRAY_TERRACOTTA_BRICK_WALL = register("gray_terracotta_brick_wall", new WallBlock(FabricBlockSettings.copy(GRAY_TERRACOTTA_BRICKS)));
    public static final Block BLACK_TERRACOTTA_BRICK_WALL = register("black_terracotta_brick_wall", new WallBlock(FabricBlockSettings.copy(BLACK_TERRACOTTA_BRICKS)));
    public static final Block BROWN_TERRACOTTA_BRICK_WALL = register("brown_terracotta_brick_wall", new WallBlock(FabricBlockSettings.copy(BROWN_TERRACOTTA_BRICKS)));

    // Terracotta Gates
    public static final Block RED_TERRACOTTA_BRICK_GATE = register("red_terracotta_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(RED_TERRACOTTA_BRICKS)));
    public static final Block ORANGE_TERRACOTTA_BRICK_GATE = register("orange_terracotta_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(ORANGE_TERRACOTTA_BRICKS)));
    public static final Block YELLOW_TERRACOTTA_BRICK_GATE = register("yellow_terracotta_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(YELLOW_TERRACOTTA_BRICKS)));
    public static final Block LIME_TERRACOTTA_BRICK_GATE = register("lime_terracotta_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(LIME_TERRACOTTA_BRICKS)));
    public static final Block GREEN_TERRACOTTA_BRICK_GATE = register("green_terracotta_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(GREEN_TERRACOTTA_BRICKS)));
    public static final Block BLUE_TERRACOTTA_BRICK_GATE = register("blue_terracotta_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(BLUE_TERRACOTTA_BRICKS)));
    public static final Block CYAN_TERRACOTTA_BRICK_GATE = register("cyan_terracotta_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(CYAN_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_GATE = register("light_blue_terracotta_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA_BRICKS)));
    public static final Block PURPLE_TERRACOTTA_BRICK_GATE = register("purple_terracotta_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(PURPLE_TERRACOTTA_BRICKS)));
    public static final Block MAGENTA_TERRACOTTA_BRICK_GATE = register("magenta_terracotta_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(MAGENTA_TERRACOTTA_BRICKS)));
    public static final Block PINK_TERRACOTTA_BRICK_GATE = register("pink_terracotta_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(PINK_TERRACOTTA_BRICKS)));
    public static final Block WHITE_TERRACOTTA_BRICK_GATE = register("white_terracotta_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(WHITE_TERRACOTTA_BRICKS)));
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_GATE = register("light_gray_terracotta_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA_BRICKS)));
    public static final Block GRAY_TERRACOTTA_BRICK_GATE = register("gray_terracotta_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(GRAY_TERRACOTTA_BRICKS)));
    public static final Block BLACK_TERRACOTTA_BRICK_GATE = register("black_terracotta_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(BLACK_TERRACOTTA_BRICKS)));
    public static final Block BROWN_TERRACOTTA_BRICK_GATE = register("brown_terracotta_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(BROWN_TERRACOTTA_BRICKS)));

    //mossy bricks
    //slab
    //stairs
    //wall
    //gate

    //cracked bricks
    //slab
    //stairs
    //wall
    //gate

    public static final Block RED_TERRACOTTA_TILES = register("red_terracotta_tiles", new Block(FabricBlockSettings.copy(RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_TILES = register("orange_terracotta_tiles", new Block(FabricBlockSettings.copy(ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_TILES = register("yellow_terracotta_tiles", new Block(FabricBlockSettings.copy(YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_TILES = register("lime_terracotta_tiles", new Block(FabricBlockSettings.copy(LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_TILES = register("green_terracotta_tiles", new Block(FabricBlockSettings.copy(GREEN_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_TILES = register("blue_terracotta_tiles", new Block(FabricBlockSettings.copy(BLUE_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_TILES = register("cyan_terracotta_tiles", new Block(FabricBlockSettings.copy(CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_TILES = register("light_blue_terracotta_tiles", new Block(FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_TILES = register("purple_terracotta_tiles", new Block(FabricBlockSettings.copy(PURPLE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_TILES = register("magenta_terracotta_tiles", new Block(FabricBlockSettings.copy(MAGENTA_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_TILES = register("pink_terracotta_tiles", new Block(FabricBlockSettings.copy(PINK_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_TILES = register("white_terracotta_tiles", new Block(FabricBlockSettings.copy(WHITE_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_TILES = register("light_gray_terracotta_tiles", new Block(FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_TILES = register("gray_terracotta_tiles", new Block(FabricBlockSettings.copy(GRAY_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_TILES = register("black_terracotta_tiles", new Block(FabricBlockSettings.copy(BLACK_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_TILES = register("brown_terracotta_tiles", new Block(FabricBlockSettings.copy(BROWN_TERRACOTTA)));
    public static final Block TERRACOTTA_TILES = register("terracotta_tiles", new Block(FabricBlockSettings.copy(TERRACOTTA)));

    public static final Block RED_TERRACOTTA_TILE_SLAB = register("red_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(RED_TERRACOTTA_TILES)));
    public static final Block ORANGE_TERRACOTTA_TILE_SLAB = register("orange_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(ORANGE_TERRACOTTA_TILES)));
    public static final Block YELLOW_TERRACOTTA_TILE_SLAB = register("yellow_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(YELLOW_TERRACOTTA_TILES)));
    public static final Block LIME_TERRACOTTA_TILE_SLAB = register("lime_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(LIME_TERRACOTTA_TILES)));
    public static final Block GREEN_TERRACOTTA_TILE_SLAB = register("green_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(GREEN_TERRACOTTA_TILES)));
    public static final Block BLUE_TERRACOTTA_TILE_SLAB = register("blue_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(BLUE_TERRACOTTA_TILES)));
    public static final Block CYAN_TERRACOTTA_TILE_SLAB = register("cyan_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(CYAN_TERRACOTTA_TILES)));
    public static final Block LIGHT_BLUE_TERRACOTTA_TILE_SLAB = register("light_blue_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA_TILES)));
    public static final Block PURPLE_TERRACOTTA_TILE_SLAB = register("purple_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(PURPLE_TERRACOTTA_TILES)));
    public static final Block MAGENTA_TERRACOTTA_TILE_SLAB = register("magenta_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(MAGENTA_TERRACOTTA_TILES)));
    public static final Block PINK_TERRACOTTA_TILE_SLAB = register("pink_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(PINK_TERRACOTTA_TILES)));
    public static final Block WHITE_TERRACOTTA_TILE_SLAB = register("white_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(WHITE_TERRACOTTA_TILES)));
    public static final Block LIGHT_GRAY_TERRACOTTA_TILE_SLAB = register("light_gray_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA_TILES)));
    public static final Block GRAY_TERRACOTTA_TILE_SLAB = register("gray_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(GRAY_TERRACOTTA_TILES)));
    public static final Block BLACK_TERRACOTTA_TILE_SLAB = register("black_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(BLACK_TERRACOTTA_TILES)));
    public static final Block BROWN_TERRACOTTA_TILE_SLAB = register("brown_terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(BROWN_TERRACOTTA_TILES)));
    public static final Block TERRACOTTA_TILE_SLAB = register("terracotta_tile_slab", new SlabBlock(FabricBlockSettings.copy(TERRACOTTA_TILES)));

    // Terracotta Stairs
    public static final Block RED_TERRACOTTA_TILE_STAIRS = register("red_terracotta_tile_stairs", new BaseConsistencyStairBlock(RED_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(RED_TERRACOTTA_TILES)));
    public static final Block ORANGE_TERRACOTTA_TILE_STAIRS = register("orange_terracotta_tile_stairs", new BaseConsistencyStairBlock(ORANGE_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(ORANGE_TERRACOTTA_TILES)));
    public static final Block YELLOW_TERRACOTTA_TILE_STAIRS = register("yellow_terracotta_tile_stairs", new BaseConsistencyStairBlock(YELLOW_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(YELLOW_TERRACOTTA_TILES)));
    public static final Block LIME_TERRACOTTA_TILE_STAIRS = register("lime_terracotta_tile_stairs", new BaseConsistencyStairBlock(LIME_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(LIME_TERRACOTTA_TILES)));
    public static final Block GREEN_TERRACOTTA_TILE_STAIRS = register("green_terracotta_tile_stairs", new BaseConsistencyStairBlock(GREEN_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(GREEN_TERRACOTTA_TILES)));
    public static final Block BLUE_TERRACOTTA_TILE_STAIRS = register("blue_terracotta_tile_stairs", new BaseConsistencyStairBlock(BLUE_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(BLUE_TERRACOTTA_TILES)));
    public static final Block CYAN_TERRACOTTA_TILE_STAIRS = register("cyan_terracotta_tile_stairs", new BaseConsistencyStairBlock(CYAN_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(CYAN_TERRACOTTA_TILES)));
    public static final Block LIGHT_BLUE_TERRACOTTA_TILE_STAIRS = register("light_blue_terracotta_tile_stairs", new BaseConsistencyStairBlock(LIGHT_BLUE_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA_TILES)));
    public static final Block PURPLE_TERRACOTTA_TILE_STAIRS = register("purple_terracotta_tile_stairs", new BaseConsistencyStairBlock(PURPLE_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(PURPLE_TERRACOTTA_TILES)));
    public static final Block MAGENTA_TERRACOTTA_TILE_STAIRS = register("magenta_terracotta_tile_stairs", new BaseConsistencyStairBlock(MAGENTA_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(MAGENTA_TERRACOTTA_TILES)));
    public static final Block PINK_TERRACOTTA_TILE_STAIRS = register("pink_terracotta_tile_stairs", new BaseConsistencyStairBlock(PINK_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(PINK_TERRACOTTA_TILES)));
    public static final Block WHITE_TERRACOTTA_TILE_STAIRS = register("white_terracotta_tile_stairs", new BaseConsistencyStairBlock(WHITE_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(WHITE_TERRACOTTA_TILES)));
    public static final Block LIGHT_GRAY_TERRACOTTA_TILE_STAIRS = register("light_gray_terracotta_tile_stairs", new BaseConsistencyStairBlock(LIGHT_GRAY_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA_TILES)));
    public static final Block GRAY_TERRACOTTA_TILE_STAIRS = register("gray_terracotta_tile_stairs", new BaseConsistencyStairBlock(GRAY_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(GRAY_TERRACOTTA_TILES)));
    public static final Block BLACK_TERRACOTTA_TILE_STAIRS = register("black_terracotta_tile_stairs", new BaseConsistencyStairBlock(BLACK_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(BLACK_TERRACOTTA_TILES)));
    public static final Block BROWN_TERRACOTTA_TILE_STAIRS = register("brown_terracotta_tile_stairs", new BaseConsistencyStairBlock(BROWN_TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(BROWN_TERRACOTTA_TILES)));
    public static final Block TERRACOTTA_TILE_STAIRS = register("terracotta_tile_stairs", new BaseConsistencyStairBlock(TERRACOTTA_TILES.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA_TILES)));

    // Terracotta Wall
    public static final Block RED_TERRACOTTA_TILE_WALL = register("red_terracotta_tile_wall", new WallBlock(FabricBlockSettings.copy(RED_TERRACOTTA_TILES)));
    public static final Block ORANGE_TERRACOTTA_TILE_WALL = register("orange_terracotta_tile_wall", new WallBlock(FabricBlockSettings.copy(ORANGE_TERRACOTTA_TILES)));
    public static final Block YELLOW_TERRACOTTA_TILE_WALL = register("yellow_terracotta_tile_wall", new WallBlock(FabricBlockSettings.copy(YELLOW_TERRACOTTA_TILES)));
    public static final Block LIME_TERRACOTTA_TILE_WALL = register("lime_terracotta_tile_wall", new WallBlock(FabricBlockSettings.copy(LIME_TERRACOTTA_TILES)));
    public static final Block GREEN_TERRACOTTA_TILE_WALL = register("green_terracotta_tile_wall", new WallBlock(FabricBlockSettings.copy(GREEN_TERRACOTTA_TILES)));
    public static final Block BLUE_TERRACOTTA_TILE_WALL = register("blue_terracotta_tile_wall", new WallBlock(FabricBlockSettings.copy(BLUE_TERRACOTTA_TILES)));
    public static final Block CYAN_TERRACOTTA_TILE_WALL = register("cyan_terracotta_tile_wall", new WallBlock(FabricBlockSettings.copy(CYAN_TERRACOTTA_TILES)));
    public static final Block LIGHT_BLUE_TERRACOTTA_TILE_WALL = register("light_blue_terracotta_tile_wall", new WallBlock(FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA_TILES)));
    public static final Block PURPLE_TERRACOTTA_TILE_WALL = register("purple_terracotta_tile_wall", new WallBlock(FabricBlockSettings.copy(PURPLE_TERRACOTTA_TILES)));
    public static final Block MAGENTA_TERRACOTTA_TILE_WALL = register("magenta_terracotta_tile_wall", new WallBlock(FabricBlockSettings.copy(MAGENTA_TERRACOTTA_TILES)));
    public static final Block PINK_TERRACOTTA_TILE_WALL = register("pink_terracotta_tile_wall", new WallBlock(FabricBlockSettings.copy(PINK_TERRACOTTA_TILES)));
    public static final Block WHITE_TERRACOTTA_TILE_WALL = register("white_terracotta_tile_wall", new WallBlock(FabricBlockSettings.copy(WHITE_TERRACOTTA_TILES)));
    public static final Block LIGHT_GRAY_TERRACOTTA_TILE_WALL = register("light_gray_terracotta_tile_wall", new WallBlock(FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA_TILES)));
    public static final Block GRAY_TERRACOTTA_TILE_WALL = register("gray_terracotta_tile_wall", new WallBlock(FabricBlockSettings.copy(GRAY_TERRACOTTA_TILES)));
    public static final Block BLACK_TERRACOTTA_TILE_WALL = register("black_terracotta_tile_wall", new WallBlock(FabricBlockSettings.copy(BLACK_TERRACOTTA_TILES)));
    public static final Block BROWN_TERRACOTTA_TILE_WALL = register("brown_terracotta_tile_wall", new WallBlock(FabricBlockSettings.copy(BROWN_TERRACOTTA_TILES)));
    public static final Block TERRACOTTA_TILE_WALL = register("terracotta_tile_wall", new WallBlock(FabricBlockSettings.copy(TERRACOTTA_TILES)));

    // Terracotta Gates
    public static final Block RED_TERRACOTTA_TILE_GATE = register("red_terracotta_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(RED_TERRACOTTA_TILES)));
    public static final Block ORANGE_TERRACOTTA_TILE_GATE = register("orange_terracotta_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(ORANGE_TERRACOTTA_TILES)));
    public static final Block YELLOW_TERRACOTTA_TILE_GATE = register("yellow_terracotta_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(YELLOW_TERRACOTTA_TILES)));
    public static final Block LIME_TERRACOTTA_TILE_GATE = register("lime_terracotta_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(LIME_TERRACOTTA_TILES)));
    public static final Block GREEN_TERRACOTTA_TILE_GATE = register("green_terracotta_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(GREEN_TERRACOTTA_TILES)));
    public static final Block BLUE_TERRACOTTA_TILE_GATE = register("blue_terracotta_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(BLUE_TERRACOTTA_TILES)));
    public static final Block CYAN_TERRACOTTA_TILE_GATE = register("cyan_terracotta_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(CYAN_TERRACOTTA_TILES)));
    public static final Block LIGHT_BLUE_TERRACOTTA_TILE_GATE = register("light_blue_terracotta_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA_TILES)));
    public static final Block PURPLE_TERRACOTTA_TILE_GATE = register("purple_terracotta_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(PURPLE_TERRACOTTA_TILES)));
    public static final Block MAGENTA_TERRACOTTA_TILE_GATE = register("magenta_terracotta_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(MAGENTA_TERRACOTTA_TILES)));
    public static final Block PINK_TERRACOTTA_TILE_GATE = register("pink_terracotta_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(PINK_TERRACOTTA_TILES)));
    public static final Block WHITE_TERRACOTTA_TILE_GATE = register("white_terracotta_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(WHITE_TERRACOTTA_TILES)));
    public static final Block LIGHT_GRAY_TERRACOTTA_TILE_GATE = register("light_gray_terracotta_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA_TILES)));
    public static final Block GRAY_TERRACOTTA_TILE_GATE = register("gray_terracotta_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(GRAY_TERRACOTTA_TILES)));
    public static final Block BLACK_TERRACOTTA_TILE_GATE = register("black_terracotta_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(BLACK_TERRACOTTA_TILES)));
    public static final Block BROWN_TERRACOTTA_TILE_GATE = register("brown_terracotta_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(BROWN_TERRACOTTA_TILES)));
    public static final Block TERRACOTTA_TILE_GATE = register("terracotta_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(TERRACOTTA_TILES)));

    //mossy tiles
    //slab
    //stairs
    //wall
    //gate

    //cracked tiles
    //slab
    //stairs
    //wall
    //gate

    public static final Block RED_TERRACOTTA_PILLAR = register("red_terracotta_pillar", new PillarBlock(FabricBlockSettings.copy(RED_TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_PILLAR = register("orange_terracotta_pillar", new PillarBlock(FabricBlockSettings.copy(ORANGE_TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_PILLAR = register("yellow_terracotta_pillar", new PillarBlock(FabricBlockSettings.copy(YELLOW_TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_PILLAR = register("lime_terracotta_pillar", new PillarBlock(FabricBlockSettings.copy(LIME_TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_PILLAR = register("green_terracotta_pillar", new PillarBlock(FabricBlockSettings.copy(GREEN_TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_PILLAR = register("blue_terracotta_pillar", new PillarBlock(FabricBlockSettings.copy(BLUE_TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_PILLAR = register("cyan_terracotta_pillar", new PillarBlock(FabricBlockSettings.copy(CYAN_TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_PILLAR = register("light_blue_terracotta_pillar", new PillarBlock(FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_PILLAR = register("purple_terracotta_pillar", new PillarBlock(FabricBlockSettings.copy(PURPLE_TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_PILLAR = register("magenta_terracotta_pillar", new PillarBlock(FabricBlockSettings.copy(MAGENTA_TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_PILLAR = register("pink_terracotta_pillar", new PillarBlock(FabricBlockSettings.copy(PINK_TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_PILLAR = register("white_terracotta_pillar", new PillarBlock(FabricBlockSettings.copy(WHITE_TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_PILLAR = register("light_gray_terracotta_pillar", new PillarBlock(FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_PILLAR = register("gray_terracotta_pillar", new PillarBlock(FabricBlockSettings.copy(GRAY_TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_PILLAR = register("black_terracotta_pillar", new PillarBlock(FabricBlockSettings.copy(BLACK_TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_PILLAR = register("brown_terracotta_pillar", new PillarBlock(FabricBlockSettings.copy(BROWN_TERRACOTTA)));
    public static final Block TERRACOTTA_PILLAR = register("terracotta_pillar", new PillarBlock(FabricBlockSettings.copy(TERRACOTTA)));

    //mossy pillar
    //cracked pillar
    //corner pillar
    //mossy corner pillar
    //cracked corner pillar
    public static final Block CHISELED_RED_TERRACOTTA = register("chiseled_red_terracotta", new Block(FabricBlockSettings.copy(RED_TERRACOTTA)));
    public static final Block CHISELED_ORANGE_TERRACOTTA = register("chiseled_orange_terracotta", new Block(FabricBlockSettings.copy(ORANGE_TERRACOTTA)));
    public static final Block CHISELED_YELLOW_TERRACOTTA = register("chiseled_yellow_terracotta", new Block(FabricBlockSettings.copy(YELLOW_TERRACOTTA)));
    public static final Block CHISELED_LIME_TERRACOTTA = register("chiseled_lime_terracotta", new Block(FabricBlockSettings.copy(LIME_TERRACOTTA)));
    public static final Block CHISELED_GREEN_TERRACOTTA = register("chiseled_green_terracotta", new Block(FabricBlockSettings.copy(GREEN_TERRACOTTA)));
    public static final Block CHISELED_BLUE_TERRACOTTA = register("chiseled_blue_terracotta", new Block(FabricBlockSettings.copy(BLUE_TERRACOTTA)));
    public static final Block CHISELED_CYAN_TERRACOTTA = register("chiseled_cyan_terracotta", new Block(FabricBlockSettings.copy(CYAN_TERRACOTTA)));
    public static final Block CHISELED_LIGHT_BLUE_TERRACOTTA = register("chiseled_light_blue_terracotta", new Block(FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA)));
    public static final Block CHISELED_PURPLE_TERRACOTTA = register("chiseled_purple_terracotta", new Block(FabricBlockSettings.copy(PURPLE_TERRACOTTA)));
    public static final Block CHISELED_MAGENTA_TERRACOTTA = register("chiseled_magenta_terracotta", new Block(FabricBlockSettings.copy(MAGENTA_TERRACOTTA)));
    public static final Block CHISELED_PINK_TERRACOTTA = register("chiseled_pink_terracotta", new Block(FabricBlockSettings.copy(PINK_TERRACOTTA)));
    public static final Block CHISELED_WHITE_TERRACOTTA = register("chiseled_white_terracotta", new Block(FabricBlockSettings.copy(WHITE_TERRACOTTA)));
    public static final Block CHISELED_LIGHT_GRAY_TERRACOTTA = register("chiseled_light_gray_terracotta", new Block(FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA)));
    public static final Block CHISELED_GRAY_TERRACOTTA = register("chiseled_gray_terracotta", new Block(FabricBlockSettings.copy(GRAY_TERRACOTTA)));
    public static final Block CHISELED_BLACK_TERRACOTTA = register("chiseled_black_terracotta", new Block(FabricBlockSettings.copy(BLACK_TERRACOTTA)));
    public static final Block CHISELED_BROWN_TERRACOTTA = register("chiseled_brown_terracotta", new Block(FabricBlockSettings.copy(BROWN_TERRACOTTA)));
    public static final Block CHISELED_TERRACOTTA = register("chiseled_terracotta", new Block(FabricBlockSettings.copy(TERRACOTTA)));
    //mossy chiseled
    //cracked chiseled
    public static final Block CARVED_RED_TERRACOTTA = register("carved_red_terracotta", new Block(FabricBlockSettings.copy(RED_TERRACOTTA)));
    public static final Block CARVED_ORANGE_TERRACOTTA = register("carved_orange_terracotta", new Block(FabricBlockSettings.copy(ORANGE_TERRACOTTA)));
    public static final Block CARVED_YELLOW_TERRACOTTA = register("carved_yellow_terracotta", new Block(FabricBlockSettings.copy(YELLOW_TERRACOTTA)));
    public static final Block CARVED_LIME_TERRACOTTA = register("carved_lime_terracotta", new Block(FabricBlockSettings.copy(LIME_TERRACOTTA)));
    public static final Block CARVED_GREEN_TERRACOTTA = register("carved_green_terracotta", new Block(FabricBlockSettings.copy(GREEN_TERRACOTTA)));
    public static final Block CARVED_BLUE_TERRACOTTA = register("carved_blue_terracotta", new Block(FabricBlockSettings.copy(BLUE_TERRACOTTA)));
    public static final Block CARVED_CYAN_TERRACOTTA = register("carved_cyan_terracotta", new Block(FabricBlockSettings.copy(CYAN_TERRACOTTA)));
    public static final Block CARVED_LIGHT_BLUE_TERRACOTTA = register("carved_light_blue_terracotta", new Block(FabricBlockSettings.copy(LIGHT_BLUE_TERRACOTTA)));
    public static final Block CARVED_PURPLE_TERRACOTTA = register("carved_purple_terracotta", new Block(FabricBlockSettings.copy(PURPLE_TERRACOTTA)));
    public static final Block CARVED_MAGENTA_TERRACOTTA = register("carved_magenta_terracotta", new Block(FabricBlockSettings.copy(MAGENTA_TERRACOTTA)));
    public static final Block CARVED_PINK_TERRACOTTA = register("carved_pink_terracotta", new Block(FabricBlockSettings.copy(PINK_TERRACOTTA)));
    public static final Block CARVED_WHITE_TERRACOTTA = register("carved_white_terracotta", new Block(FabricBlockSettings.copy(WHITE_TERRACOTTA)));
    public static final Block CARVED_LIGHT_GRAY_TERRACOTTA = register("carved_light_gray_terracotta", new Block(FabricBlockSettings.copy(LIGHT_GRAY_TERRACOTTA)));
    public static final Block CARVED_GRAY_TERRACOTTA = register("carved_gray_terracotta", new Block(FabricBlockSettings.copy(GRAY_TERRACOTTA)));
    public static final Block CARVED_BLACK_TERRACOTTA = register("carved_black_terracotta", new Block(FabricBlockSettings.copy(BLACK_TERRACOTTA)));
    public static final Block CARVED_BROWN_TERRACOTTA = register("carved_brown_terracotta", new Block(FabricBlockSettings.copy(BROWN_TERRACOTTA)));
    public static final Block CARVED_TERRACOTTA = register("carved_terracotta", new Block(FabricBlockSettings.copy(TERRACOTTA)));
    //mossy carved
    //cracked carved


// Concrete
    public static final Block RED_CONCRETE_SLAB = register("red_concrete_slab", new SlabBlock(FabricBlockSettings.copy(RED_CONCRETE)));
    public static final Block ORANGE_CONCRETE_SLAB = register("orange_concrete_slab", new SlabBlock(FabricBlockSettings.copy(ORANGE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab", new SlabBlock(FabricBlockSettings.copy(YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_SLAB = register("lime_concrete_slab", new SlabBlock(FabricBlockSettings.copy(LIME_CONCRETE)));
    public static final Block GREEN_CONCRETE_SLAB = register("green_concrete_slab", new SlabBlock(FabricBlockSettings.copy(GREEN_CONCRETE)));
    public static final Block BLUE_CONCRETE_SLAB = register("blue_concrete_slab", new SlabBlock(FabricBlockSettings.copy(BLUE_CONCRETE)));
    public static final Block CYAN_CONCRETE_SLAB = register("cyan_concrete_slab", new SlabBlock(FabricBlockSettings.copy(CYAN_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab", new SlabBlock(FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_SLAB = register("purple_concrete_slab", new SlabBlock(FabricBlockSettings.copy(PURPLE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab", new SlabBlock(FabricBlockSettings.copy(MAGENTA_CONCRETE)));
    public static final Block PINK_CONCRETE_SLAB = register("pink_concrete_slab", new SlabBlock(FabricBlockSettings.copy(PINK_CONCRETE)));
    public static final Block WHITE_CONCRETE_SLAB = register("white_concrete_slab", new SlabBlock(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab", new SlabBlock(FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_SLAB = register("gray_concrete_slab", new SlabBlock(FabricBlockSettings.copy(GRAY_CONCRETE)));
    public static final Block BLACK_CONCRETE_SLAB = register("black_concrete_slab", new SlabBlock(FabricBlockSettings.copy(BLACK_CONCRETE)));
    public static final Block BROWN_CONCRETE_SLAB = register("brown_concrete_slab", new SlabBlock(FabricBlockSettings.copy(BROWN_CONCRETE)));

    // Concrete Stairs
    public static final Block RED_CONCRETE_STAIRS = register("red_concrete_stairs", new BaseConsistencyStairBlock(RED_CONCRETE.getDefaultState(), FabricBlockSettings.copy(RED_CONCRETE)));
    public static final Block ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs", new BaseConsistencyStairBlock(ORANGE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(ORANGE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs", new BaseConsistencyStairBlock(YELLOW_CONCRETE.getDefaultState(), FabricBlockSettings.copy(YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_STAIRS = register("lime_concrete_stairs", new BaseConsistencyStairBlock(LIME_CONCRETE.getDefaultState(), FabricBlockSettings.copy(LIME_CONCRETE)));
    public static final Block GREEN_CONCRETE_STAIRS = register("green_concrete_stairs", new BaseConsistencyStairBlock(GREEN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(GREEN_CONCRETE)));
    public static final Block BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs", new BaseConsistencyStairBlock(BLUE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(BLUE_CONCRETE)));
    public static final Block CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs", new BaseConsistencyStairBlock(CYAN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(CYAN_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs", new BaseConsistencyStairBlock(LIGHT_BLUE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_STAIRS = register("purple_concrete_stairs", new BaseConsistencyStairBlock(PURPLE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(PURPLE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_STAIRS = register("magenta_concrete_stairs", new BaseConsistencyStairBlock(MAGENTA_CONCRETE.getDefaultState(), FabricBlockSettings.copy(MAGENTA_CONCRETE)));
    public static final Block PINK_CONCRETE_STAIRS = register("pink_concrete_stairs", new BaseConsistencyStairBlock(PINK_CONCRETE.getDefaultState(), FabricBlockSettings.copy(PINK_CONCRETE)));
    public static final Block WHITE_CONCRETE_STAIRS = register("white_concrete_stairs", new BaseConsistencyStairBlock(WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = register("light_gray_concrete_stairs", new BaseConsistencyStairBlock(LIGHT_GRAY_CONCRETE.getDefaultState(), FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_STAIRS = register("gray_concrete_stairs", new BaseConsistencyStairBlock(GRAY_CONCRETE.getDefaultState(), FabricBlockSettings.copy(GRAY_CONCRETE)));
    public static final Block BLACK_CONCRETE_STAIRS = register("black_concrete_stairs", new BaseConsistencyStairBlock(BLACK_CONCRETE.getDefaultState(), FabricBlockSettings.copy(BLACK_CONCRETE)));
    public static final Block BROWN_CONCRETE_STAIRS = register("brown_concrete_stairs", new BaseConsistencyStairBlock(BROWN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(BROWN_CONCRETE)));

    // Terracotta Wall
    public static final Block RED_CONCRETE_WALL = register("red_concrete_wall", new WallBlock(FabricBlockSettings.copy(RED_CONCRETE)));
    public static final Block ORANGE_CONCRETE_WALL = register("orange_concrete_wall", new WallBlock(FabricBlockSettings.copy(ORANGE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_WALL = register("yellow_concrete_wall", new WallBlock(FabricBlockSettings.copy(YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_WALL = register("lime_concrete_wall", new WallBlock(FabricBlockSettings.copy(LIME_CONCRETE)));
    public static final Block GREEN_CONCRETE_WALL = register("green_concrete_wall", new WallBlock(FabricBlockSettings.copy(GREEN_CONCRETE)));
    public static final Block BLUE_CONCRETE_WALL = register("blue_concrete_wall", new WallBlock(FabricBlockSettings.copy(BLUE_CONCRETE)));
    public static final Block CYAN_CONCRETE_WALL = register("cyan_concrete_wall", new WallBlock(FabricBlockSettings.copy(CYAN_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_WALL = register("light_blue_concrete_wall", new WallBlock(FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_WALL = register("purple_concrete_wall", new WallBlock(FabricBlockSettings.copy(PURPLE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_WALL = register("magenta_concrete_wall", new WallBlock(FabricBlockSettings.copy(MAGENTA_CONCRETE)));
    public static final Block PINK_CONCRETE_WALL = register("pink_concrete_wall", new WallBlock(FabricBlockSettings.copy(PINK_CONCRETE)));
    public static final Block WHITE_CONCRETE_WALL = register("white_concrete_wall", new WallBlock(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_WALL = register("light_gray_concrete_wall", new WallBlock(FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_WALL = register("gray_concrete_wall", new WallBlock(FabricBlockSettings.copy(GRAY_CONCRETE)));
    public static final Block BLACK_CONCRETE_WALL = register("black_concrete_wall", new WallBlock(FabricBlockSettings.copy(BLACK_CONCRETE)));
    public static final Block BROWN_CONCRETE_WALL = register("brown_concrete_wall", new WallBlock(FabricBlockSettings.copy(BROWN_CONCRETE)));

    // Terracotta Gates
    public static final Block RED_CONCRETE_GATE = register("red_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(RED_CONCRETE)));
    public static final Block ORANGE_CONCRETE_GATE = register("orange_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(ORANGE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_GATE = register("yellow_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_GATE = register("lime_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(LIME_CONCRETE)));
    public static final Block GREEN_CONCRETE_GATE = register("green_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(GREEN_CONCRETE)));
    public static final Block BLUE_CONCRETE_GATE = register("blue_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(BLUE_CONCRETE)));
    public static final Block CYAN_CONCRETE_GATE = register("cyan_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(CYAN_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_GATE = register("light_blue_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_GATE = register("purple_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(PURPLE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_GATE = register("magenta_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(MAGENTA_CONCRETE)));
    public static final Block PINK_CONCRETE_GATE = register("pink_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(PINK_CONCRETE)));
    public static final Block WHITE_CONCRETE_GATE = register("white_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_GATE = register("light_gray_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_GATE = register("gray_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(GRAY_CONCRETE)));
    public static final Block BLACK_CONCRETE_GATE = register("black_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(BLACK_CONCRETE)));
    public static final Block BROWN_CONCRETE_GATE = register("brown_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(BROWN_CONCRETE)));

    public static final Block SMOOTH_RED_CONCRETE = register("smooth_red_concrete", new Block(FabricBlockSettings.copy(RED_CONCRETE)));
    public static final Block SMOOTH_ORANGE_CONCRETE = register("smooth_orange_concrete", new Block(FabricBlockSettings.copy(ORANGE_CONCRETE)));
    public static final Block SMOOTH_YELLOW_CONCRETE = register("smooth_yellow_concrete", new Block(FabricBlockSettings.copy(YELLOW_CONCRETE)));
    public static final Block SMOOTH_LIME_CONCRETE = register("smooth_lime_concrete", new Block(FabricBlockSettings.copy(LIME_CONCRETE)));
    public static final Block SMOOTH_GREEN_CONCRETE = register("smooth_green_concrete", new Block(FabricBlockSettings.copy(GREEN_CONCRETE)));
    public static final Block SMOOTH_BLUE_CONCRETE = register("smooth_blue_concrete", new Block(FabricBlockSettings.copy(BLUE_CONCRETE)));
    public static final Block SMOOTH_CYAN_CONCRETE = register("smooth_cyan_concrete", new Block(FabricBlockSettings.copy(CYAN_CONCRETE)));
    public static final Block SMOOTH_LIGHT_BLUE_CONCRETE = register("smooth_light_blue_concrete", new Block(FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE)));
    public static final Block SMOOTH_PURPLE_CONCRETE = register("smooth_purple_concrete", new Block(FabricBlockSettings.copy(PURPLE_CONCRETE)));
    public static final Block SMOOTH_MAGENTA_CONCRETE = register("smooth_magenta_concrete", new Block(FabricBlockSettings.copy(MAGENTA_CONCRETE)));
    public static final Block SMOOTH_PINK_CONCRETE = register("smooth_pink_concrete", new Block(FabricBlockSettings.copy(PINK_CONCRETE)));
    public static final Block SMOOTH_WHITE_CONCRETE = register("smooth_white_concrete", new Block(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block SMOOTH_LIGHT_GRAY_CONCRETE = register("smooth_light_gray_concrete", new Block(FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE)));
    public static final Block SMOOTH_GRAY_CONCRETE = register("smooth_gray_concrete", new Block(FabricBlockSettings.copy(GRAY_CONCRETE)));
    public static final Block SMOOTH_BLACK_CONCRETE = register("smooth_black_concrete", new Block(FabricBlockSettings.copy(BLACK_CONCRETE)));
    public static final Block SMOOTH_BROWN_CONCRETE = register("smooth_brown_concrete", new Block(FabricBlockSettings.copy(BROWN_CONCRETE)));

    public static final Block SMOOTH_RED_CONCRETE_SLAB = register("smooth_red_concrete_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_RED_CONCRETE)));
    public static final Block SMOOTH_ORANGE_CONCRETE_SLAB = register("smooth_orange_concrete_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_ORANGE_CONCRETE)));
    public static final Block SMOOTH_YELLOW_CONCRETE_SLAB = register("smooth_yellow_concrete_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_YELLOW_CONCRETE)));
    public static final Block SMOOTH_LIME_CONCRETE_SLAB = register("smooth_lime_concrete_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_LIME_CONCRETE)));
    public static final Block SMOOTH_GREEN_CONCRETE_SLAB = register("smooth_green_concrete_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_GREEN_CONCRETE)));
    public static final Block SMOOTH_BLUE_CONCRETE_SLAB = register("smooth_blue_concrete_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_BLUE_CONCRETE)));
    public static final Block SMOOTH_CYAN_CONCRETE_SLAB = register("smooth_cyan_concrete_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_CYAN_CONCRETE)));
    public static final Block SMOOTH_LIGHT_BLUE_CONCRETE_SLAB = register("smooth_light_blue_concrete_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_LIGHT_BLUE_CONCRETE)));
    public static final Block SMOOTH_PURPLE_CONCRETE_SLAB = register("smooth_purple_concrete_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_PURPLE_CONCRETE)));
    public static final Block SMOOTH_MAGENTA_CONCRETE_SLAB = register("smooth_magenta_concrete_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_MAGENTA_CONCRETE)));
    public static final Block SMOOTH_PINK_CONCRETE_SLAB = register("smooth_pink_concrete_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_PINK_CONCRETE)));
    public static final Block SMOOTH_WHITE_CONCRETE_SLAB = register("smooth_white_concrete_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_WHITE_CONCRETE)));
    public static final Block SMOOTH_LIGHT_GRAY_CONCRETE_SLAB = register("smooth_light_gray_concrete_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_LIGHT_GRAY_CONCRETE)));
    public static final Block SMOOTH_GRAY_CONCRETE_SLAB = register("smooth_gray_concrete_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_GRAY_CONCRETE)));
    public static final Block SMOOTH_BLACK_CONCRETE_SLAB = register("smooth_black_concrete_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_BLACK_CONCRETE)));
    public static final Block SMOOTH_BROWN_CONCRETE_SLAB = register("smooth_brown_concrete_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_BROWN_CONCRETE)));

    // Terracotta Stairs
    public static final Block SMOOTH_RED_CONCRETE_STAIRS = register("smooth_red_concrete_stairs", new BaseConsistencyStairBlock(RED_CONCRETE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_RED_CONCRETE)));
    public static final Block SMOOTH_ORANGE_CONCRETE_STAIRS = register("smooth_orange_concrete_stairs", new BaseConsistencyStairBlock(ORANGE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_ORANGE_CONCRETE)));
    public static final Block SMOOTH_YELLOW_CONCRETE_STAIRS = register("smooth_yellow_concrete_stairs", new BaseConsistencyStairBlock(YELLOW_CONCRETE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_YELLOW_CONCRETE)));
    public static final Block SMOOTH_LIME_CONCRETE_STAIRS = register("smooth_lime_concrete_stairs", new BaseConsistencyStairBlock(LIME_CONCRETE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_LIME_CONCRETE)));
    public static final Block SMOOTH_GREEN_CONCRETE_STAIRS = register("smooth_green_concrete_stairs", new BaseConsistencyStairBlock(GREEN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_GREEN_CONCRETE)));
    public static final Block SMOOTH_BLUE_CONCRETE_STAIRS = register("smooth_blue_concrete_stairs", new BaseConsistencyStairBlock(BLUE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_BLUE_CONCRETE)));
    public static final Block SMOOTH_CYAN_CONCRETE_STAIRS = register("smooth_cyan_concrete_stairs", new BaseConsistencyStairBlock(CYAN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_CYAN_CONCRETE)));
    public static final Block SMOOTH_LIGHT_BLUE_CONCRETE_STAIRS = register("smooth_light_blue_concrete_stairs", new BaseConsistencyStairBlock(LIGHT_BLUE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_LIGHT_BLUE_CONCRETE)));
    public static final Block SMOOTH_PURPLE_CONCRETE_STAIRS = register("smooth_purple_concrete_stairs", new BaseConsistencyStairBlock(PURPLE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_PURPLE_CONCRETE)));
    public static final Block SMOOTH_MAGENTA_CONCRETE_STAIRS = register("smooth_magenta_concrete_stairs", new BaseConsistencyStairBlock(MAGENTA_CONCRETE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_MAGENTA_CONCRETE)));
    public static final Block SMOOTH_PINK_CONCRETE_STAIRS = register("smooth_pink_concrete_stairs", new BaseConsistencyStairBlock(PINK_CONCRETE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_PINK_CONCRETE)));
    public static final Block SMOOTH_WHITE_CONCRETE_STAIRS = register("smooth_white_concrete_stairs", new BaseConsistencyStairBlock(WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_WHITE_CONCRETE)));
    public static final Block SMOOTH_LIGHT_GRAY_CONCRETE_STAIRS = register("smooth_light_gray_concrete_stairs", new BaseConsistencyStairBlock(LIGHT_GRAY_CONCRETE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_LIGHT_GRAY_CONCRETE)));
    public static final Block SMOOTH_GRAY_CONCRETE_STAIRS = register("smooth_gray_concrete_stairs", new BaseConsistencyStairBlock(GRAY_CONCRETE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_GRAY_CONCRETE)));
    public static final Block SMOOTH_BLACK_CONCRETE_STAIRS = register("smooth_black_concrete_stairs", new BaseConsistencyStairBlock(BLACK_CONCRETE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_BLACK_CONCRETE)));
    public static final Block SMOOTH_BROWN_CONCRETE_STAIRS = register("smooth_brown_concrete_stairs", new BaseConsistencyStairBlock(BROWN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_BROWN_CONCRETE)));

    // Terracotta Wall
    public static final Block SMOOTH_RED_CONCRETE_WALL = register("smooth_red_concrete_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_RED_CONCRETE)));
    public static final Block SMOOTH_ORANGE_CONCRETE_WALL = register("smooth_orange_concrete_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_ORANGE_CONCRETE)));
    public static final Block SMOOTH_YELLOW_CONCRETE_WALL = register("smooth_yellow_concrete_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_YELLOW_CONCRETE)));
    public static final Block SMOOTH_LIME_CONCRETE_WALL = register("smooth_lime_concrete_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_LIME_CONCRETE)));
    public static final Block SMOOTH_GREEN_CONCRETE_WALL = register("smooth_green_concrete_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_GREEN_CONCRETE)));
    public static final Block SMOOTH_BLUE_CONCRETE_WALL = register("smooth_blue_concrete_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_BLUE_CONCRETE)));
    public static final Block SMOOTH_CYAN_CONCRETE_WALL = register("smooth_cyan_concrete_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_CYAN_CONCRETE)));
    public static final Block SMOOTH_LIGHT_BLUE_CONCRETE_WALL = register("smooth_light_blue_concrete_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_LIGHT_BLUE_CONCRETE)));
    public static final Block SMOOTH_PURPLE_CONCRETE_WALL = register("smooth_purple_concrete_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_PURPLE_CONCRETE)));
    public static final Block SMOOTH_MAGENTA_CONCRETE_WALL = register("smooth_magenta_concrete_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_MAGENTA_CONCRETE)));
    public static final Block SMOOTH_PINK_CONCRETE_WALL = register("smooth_pink_concrete_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_PINK_CONCRETE)));
    public static final Block SMOOTH_WHITE_CONCRETE_WALL = register("smooth_white_concrete_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_WHITE_CONCRETE)));
    public static final Block SMOOTH_LIGHT_GRAY_CONCRETE_WALL = register("smooth_light_gray_concrete_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_LIGHT_GRAY_CONCRETE)));
    public static final Block SMOOTH_GRAY_CONCRETE_WALL = register("smooth_gray_concrete_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_GRAY_CONCRETE)));
    public static final Block SMOOTH_BLACK_CONCRETE_WALL = register("smooth_black_concrete_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_BLACK_CONCRETE)));
    public static final Block SMOOTH_BROWN_CONCRETE_WALL = register("smooth_brown_concrete_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_BROWN_CONCRETE)));

    // Terracotta Gates
    public static final Block SMOOTH_RED_CONCRETE_GATE = register("smooth_red_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_RED_CONCRETE)));
    public static final Block SMOOTH_ORANGE_CONCRETE_GATE = register("smooth_orange_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_ORANGE_CONCRETE)));
    public static final Block SMOOTH_YELLOW_CONCRETE_GATE = register("smooth_yellow_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_YELLOW_CONCRETE)));
    public static final Block SMOOTH_LIME_CONCRETE_GATE = register("smooth_lime_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_LIME_CONCRETE)));
    public static final Block SMOOTH_GREEN_CONCRETE_GATE = register("smooth_green_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_GREEN_CONCRETE)));
    public static final Block SMOOTH_BLUE_CONCRETE_GATE = register("smooth_blue_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_BLUE_CONCRETE)));
    public static final Block SMOOTH_CYAN_CONCRETE_GATE = register("smooth_cyan_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_CYAN_CONCRETE)));
    public static final Block SMOOTH_LIGHT_BLUE_CONCRETE_GATE = register("smooth_light_blue_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_LIGHT_BLUE_CONCRETE)));
    public static final Block SMOOTH_PURPLE_CONCRETE_GATE = register("smooth_purple_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_PURPLE_CONCRETE)));
    public static final Block SMOOTH_MAGENTA_CONCRETE_GATE = register("smooth_magenta_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_MAGENTA_CONCRETE)));
    public static final Block SMOOTH_PINK_CONCRETE_GATE = register("smooth_pink_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_PINK_CONCRETE)));
    public static final Block SMOOTH_WHITE_CONCRETE_GATE = register("smooth_white_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_WHITE_CONCRETE)));
    public static final Block SMOOTH_LIGHT_GRAY_CONCRETE_GATE = register("smooth_light_gray_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_LIGHT_GRAY_CONCRETE)));
    public static final Block SMOOTH_GRAY_CONCRETE_GATE = register("smooth_gray_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_GRAY_CONCRETE)));
    public static final Block SMOOTH_BLACK_CONCRETE_GATE = register("smooth_black_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_BLACK_CONCRETE)));
    public static final Block SMOOTH_BROWN_CONCRETE_GATE = register("smooth_brown_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_BROWN_CONCRETE)));

    //mossy smooth
    //slab
    //stairs
    //wall
    //gate

    //cracked smooth
    //slab
    //stairs
    //wall
    //gate

    public static final Block POLISHED_RED_CONCRETE = register("polished_red_concrete", new Block(FabricBlockSettings.copy(RED_CONCRETE)));
    public static final Block POLISHED_ORANGE_CONCRETE = register("polished_orange_concrete", new Block(FabricBlockSettings.copy(ORANGE_CONCRETE)));
    public static final Block POLISHED_YELLOW_CONCRETE = register("polished_yellow_concrete", new Block(FabricBlockSettings.copy(YELLOW_CONCRETE)));
    public static final Block POLISHED_LIME_CONCRETE = register("polished_lime_concrete", new Block(FabricBlockSettings.copy(LIME_CONCRETE)));
    public static final Block POLISHED_GREEN_CONCRETE = register("polished_green_concrete", new Block(FabricBlockSettings.copy(GREEN_CONCRETE)));
    public static final Block POLISHED_BLUE_CONCRETE = register("polished_blue_concrete", new Block(FabricBlockSettings.copy(BLUE_CONCRETE)));
    public static final Block POLISHED_CYAN_CONCRETE = register("polished_cyan_concrete", new Block(FabricBlockSettings.copy(CYAN_CONCRETE)));
    public static final Block POLISHED_LIGHT_BLUE_CONCRETE = register("polished_light_blue_concrete", new Block(FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE)));
    public static final Block POLISHED_PURPLE_CONCRETE = register("polished_purple_concrete", new Block(FabricBlockSettings.copy(PURPLE_CONCRETE)));
    public static final Block POLISHED_MAGENTA_CONCRETE = register("polished_magenta_concrete", new Block(FabricBlockSettings.copy(MAGENTA_CONCRETE)));
    public static final Block POLISHED_PINK_CONCRETE = register("polished_pink_concrete", new Block(FabricBlockSettings.copy(PINK_CONCRETE)));
    public static final Block POLISHED_WHITE_CONCRETE = register("polished_white_concrete", new Block(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block POLISHED_LIGHT_GRAY_CONCRETE = register("polished_light_gray_concrete", new Block(FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE)));
    public static final Block POLISHED_GRAY_CONCRETE = register("polished_gray_concrete", new Block(FabricBlockSettings.copy(GRAY_CONCRETE)));
    public static final Block POLISHED_BLACK_CONCRETE = register("polished_black_concrete", new Block(FabricBlockSettings.copy(BLACK_CONCRETE)));
    public static final Block POLISHED_BROWN_CONCRETE = register("polished_brown_concrete", new Block(FabricBlockSettings.copy(BROWN_CONCRETE)));

    public static final Block POLISHED_RED_CONCRETE_SLAB = register("polished_red_concrete_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_RED_CONCRETE)));
    public static final Block POLISHED_ORANGE_CONCRETE_SLAB = register("polished_orange_concrete_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_ORANGE_CONCRETE)));
    public static final Block POLISHED_YELLOW_CONCRETE_SLAB = register("polished_yellow_concrete_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_YELLOW_CONCRETE)));
    public static final Block POLISHED_LIME_CONCRETE_SLAB = register("polished_lime_concrete_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_LIME_CONCRETE)));
    public static final Block POLISHED_GREEN_CONCRETE_SLAB = register("polished_green_concrete_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_GREEN_CONCRETE)));
    public static final Block POLISHED_BLUE_CONCRETE_SLAB = register("polished_blue_concrete_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_BLUE_CONCRETE)));
    public static final Block POLISHED_CYAN_CONCRETE_SLAB = register("polished_cyan_concrete_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_CYAN_CONCRETE)));
    public static final Block POLISHED_LIGHT_BLUE_CONCRETE_SLAB = register("polished_light_blue_concrete_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_LIGHT_BLUE_CONCRETE)));
    public static final Block POLISHED_PURPLE_CONCRETE_SLAB = register("polished_purple_concrete_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_PURPLE_CONCRETE)));
    public static final Block POLISHED_MAGENTA_CONCRETE_SLAB = register("polished_magenta_concrete_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_MAGENTA_CONCRETE)));
    public static final Block POLISHED_PINK_CONCRETE_SLAB = register("polished_pink_concrete_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_PINK_CONCRETE)));
    public static final Block POLISHED_WHITE_CONCRETE_SLAB = register("polished_white_concrete_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_WHITE_CONCRETE)));
    public static final Block POLISHED_LIGHT_GRAY_CONCRETE_SLAB = register("polished_light_gray_concrete_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_LIGHT_GRAY_CONCRETE)));
    public static final Block POLISHED_GRAY_CONCRETE_SLAB = register("polished_gray_concrete_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_GRAY_CONCRETE)));
    public static final Block POLISHED_BLACK_CONCRETE_SLAB = register("polished_black_concrete_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_BLACK_CONCRETE)));
    public static final Block POLISHED_BROWN_CONCRETE_SLAB = register("polished_brown_concrete_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_BROWN_CONCRETE)));

    // Terracotta Stairs
    public static final Block POLISHED_RED_CONCRETE_STAIRS = register("polished_red_concrete_stairs", new BaseConsistencyStairBlock(RED_CONCRETE.getDefaultState(), FabricBlockSettings.copy(POLISHED_RED_CONCRETE)));
    public static final Block POLISHED_ORANGE_CONCRETE_STAIRS = register("polished_orange_concrete_stairs", new BaseConsistencyStairBlock(ORANGE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(POLISHED_ORANGE_CONCRETE)));
    public static final Block POLISHED_YELLOW_CONCRETE_STAIRS = register("polished_yellow_concrete_stairs", new BaseConsistencyStairBlock(YELLOW_CONCRETE.getDefaultState(), FabricBlockSettings.copy(POLISHED_YELLOW_CONCRETE)));
    public static final Block POLISHED_LIME_CONCRETE_STAIRS = register("polished_lime_concrete_stairs", new BaseConsistencyStairBlock(LIME_CONCRETE.getDefaultState(), FabricBlockSettings.copy(POLISHED_LIME_CONCRETE)));
    public static final Block POLISHED_GREEN_CONCRETE_STAIRS = register("polished_green_concrete_stairs", new BaseConsistencyStairBlock(GREEN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(POLISHED_GREEN_CONCRETE)));
    public static final Block POLISHED_BLUE_CONCRETE_STAIRS = register("polished_blue_concrete_stairs", new BaseConsistencyStairBlock(BLUE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(POLISHED_BLUE_CONCRETE)));
    public static final Block POLISHED_CYAN_CONCRETE_STAIRS = register("polished_cyan_concrete_stairs", new BaseConsistencyStairBlock(CYAN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(POLISHED_CYAN_CONCRETE)));
    public static final Block POLISHED_LIGHT_BLUE_CONCRETE_STAIRS = register("polished_light_blue_concrete_stairs", new BaseConsistencyStairBlock(LIGHT_BLUE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(POLISHED_LIGHT_BLUE_CONCRETE)));
    public static final Block POLISHED_PURPLE_CONCRETE_STAIRS = register("polished_purple_concrete_stairs", new BaseConsistencyStairBlock(PURPLE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(POLISHED_PURPLE_CONCRETE)));
    public static final Block POLISHED_MAGENTA_CONCRETE_STAIRS = register("polished_magenta_concrete_stairs", new BaseConsistencyStairBlock(MAGENTA_CONCRETE.getDefaultState(), FabricBlockSettings.copy(POLISHED_MAGENTA_CONCRETE)));
    public static final Block POLISHED_PINK_CONCRETE_STAIRS = register("polished_pink_concrete_stairs", new BaseConsistencyStairBlock(PINK_CONCRETE.getDefaultState(), FabricBlockSettings.copy(POLISHED_PINK_CONCRETE)));
    public static final Block POLISHED_WHITE_CONCRETE_STAIRS = register("polished_white_concrete_stairs", new BaseConsistencyStairBlock(WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(POLISHED_WHITE_CONCRETE)));
    public static final Block POLISHED_LIGHT_GRAY_CONCRETE_STAIRS = register("polished_light_gray_concrete_stairs", new BaseConsistencyStairBlock(LIGHT_GRAY_CONCRETE.getDefaultState(), FabricBlockSettings.copy(POLISHED_LIGHT_GRAY_CONCRETE)));
    public static final Block POLISHED_GRAY_CONCRETE_STAIRS = register("polished_gray_concrete_stairs", new BaseConsistencyStairBlock(GRAY_CONCRETE.getDefaultState(), FabricBlockSettings.copy(POLISHED_GRAY_CONCRETE)));
    public static final Block POLISHED_BLACK_CONCRETE_STAIRS = register("polished_black_concrete_stairs", new BaseConsistencyStairBlock(BLACK_CONCRETE.getDefaultState(), FabricBlockSettings.copy(POLISHED_BLACK_CONCRETE)));
    public static final Block POLISHED_BROWN_CONCRETE_STAIRS = register("polished_brown_concrete_stairs", new BaseConsistencyStairBlock(BROWN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(POLISHED_BROWN_CONCRETE)));

    // Terracotta Wall
    public static final Block POLISHED_RED_CONCRETE_WALL = register("polished_red_concrete_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_RED_CONCRETE)));
    public static final Block POLISHED_ORANGE_CONCRETE_WALL = register("polished_orange_concrete_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_ORANGE_CONCRETE)));
    public static final Block POLISHED_YELLOW_CONCRETE_WALL = register("polished_yellow_concrete_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_YELLOW_CONCRETE)));
    public static final Block POLISHED_LIME_CONCRETE_WALL = register("polished_lime_concrete_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_LIME_CONCRETE)));
    public static final Block POLISHED_GREEN_CONCRETE_WALL = register("polished_green_concrete_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_GREEN_CONCRETE)));
    public static final Block POLISHED_BLUE_CONCRETE_WALL = register("polished_blue_concrete_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_BLUE_CONCRETE)));
    public static final Block POLISHED_CYAN_CONCRETE_WALL = register("polished_cyan_concrete_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_CYAN_CONCRETE)));
    public static final Block POLISHED_LIGHT_BLUE_CONCRETE_WALL = register("polished_light_blue_concrete_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_LIGHT_BLUE_CONCRETE)));
    public static final Block POLISHED_PURPLE_CONCRETE_WALL = register("polished_purple_concrete_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_PURPLE_CONCRETE)));
    public static final Block POLISHED_MAGENTA_CONCRETE_WALL = register("polished_magenta_concrete_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_MAGENTA_CONCRETE)));
    public static final Block POLISHED_PINK_CONCRETE_WALL = register("polished_pink_concrete_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_PINK_CONCRETE)));
    public static final Block POLISHED_WHITE_CONCRETE_WALL = register("polished_white_concrete_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_WHITE_CONCRETE)));
    public static final Block POLISHED_LIGHT_GRAY_CONCRETE_WALL = register("polished_light_gray_concrete_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_LIGHT_GRAY_CONCRETE)));
    public static final Block POLISHED_GRAY_CONCRETE_WALL = register("polished_gray_concrete_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_GRAY_CONCRETE)));
    public static final Block POLISHED_BLACK_CONCRETE_WALL = register("polished_black_concrete_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_BLACK_CONCRETE)));
    public static final Block POLISHED_BROWN_CONCRETE_WALL = register("polished_brown_concrete_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_BROWN_CONCRETE)));

    // Terracotta Gates
    public static final Block POLISHED_RED_CONCRETE_GATE = register("polished_red_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_RED_CONCRETE)));
    public static final Block POLISHED_ORANGE_CONCRETE_GATE = register("polished_orange_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_ORANGE_CONCRETE)));
    public static final Block POLISHED_YELLOW_CONCRETE_GATE = register("polished_yellow_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_YELLOW_CONCRETE)));
    public static final Block POLISHED_LIME_CONCRETE_GATE = register("polished_lime_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_LIME_CONCRETE)));
    public static final Block POLISHED_GREEN_CONCRETE_GATE = register("polished_green_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_GREEN_CONCRETE)));
    public static final Block POLISHED_BLUE_CONCRETE_GATE = register("polished_blue_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_BLUE_CONCRETE)));
    public static final Block POLISHED_CYAN_CONCRETE_GATE = register("polished_cyan_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_CYAN_CONCRETE)));
    public static final Block POLISHED_LIGHT_BLUE_CONCRETE_GATE = register("polished_light_blue_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_LIGHT_BLUE_CONCRETE)));
    public static final Block POLISHED_PURPLE_CONCRETE_GATE = register("polished_purple_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_PURPLE_CONCRETE)));
    public static final Block POLISHED_MAGENTA_CONCRETE_GATE = register("polished_magenta_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_MAGENTA_CONCRETE)));
    public static final Block POLISHED_PINK_CONCRETE_GATE = register("polished_pink_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_PINK_CONCRETE)));
    public static final Block POLISHED_WHITE_CONCRETE_GATE = register("polished_white_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_WHITE_CONCRETE)));
    public static final Block POLISHED_LIGHT_GRAY_CONCRETE_GATE = register("polished_light_gray_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_LIGHT_GRAY_CONCRETE)));
    public static final Block POLISHED_GRAY_CONCRETE_GATE = register("polished_gray_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_GRAY_CONCRETE)));
    public static final Block POLISHED_BLACK_CONCRETE_GATE = register("polished_black_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_BLACK_CONCRETE)));
    public static final Block POLISHED_BROWN_CONCRETE_GATE = register("polished_brown_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_BROWN_CONCRETE)));

    public static final Block CUT_RED_CONCRETE = register("cut_red_concrete", new Block(FabricBlockSettings.copy(RED_CONCRETE)));
    public static final Block CUT_ORANGE_CONCRETE = register("cut_orange_concrete", new Block(FabricBlockSettings.copy(ORANGE_CONCRETE)));
    public static final Block CUT_YELLOW_CONCRETE = register("cut_yellow_concrete", new Block(FabricBlockSettings.copy(YELLOW_CONCRETE)));
    public static final Block CUT_LIME_CONCRETE = register("cut_lime_concrete", new Block(FabricBlockSettings.copy(LIME_CONCRETE)));
    public static final Block CUT_GREEN_CONCRETE = register("cut_green_concrete", new Block(FabricBlockSettings.copy(GREEN_CONCRETE)));
    public static final Block CUT_BLUE_CONCRETE = register("cut_blue_concrete", new Block(FabricBlockSettings.copy(BLUE_CONCRETE)));
    public static final Block CUT_CYAN_CONCRETE = register("cut_cyan_concrete", new Block(FabricBlockSettings.copy(CYAN_CONCRETE)));
    public static final Block CUT_LIGHT_BLUE_CONCRETE = register("cut_light_blue_concrete", new Block(FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE)));
    public static final Block CUT_PURPLE_CONCRETE = register("cut_purple_concrete", new Block(FabricBlockSettings.copy(PURPLE_CONCRETE)));
    public static final Block CUT_MAGENTA_CONCRETE = register("cut_magenta_concrete", new Block(FabricBlockSettings.copy(MAGENTA_CONCRETE)));
    public static final Block CUT_PINK_CONCRETE = register("cut_pink_concrete", new Block(FabricBlockSettings.copy(PINK_CONCRETE)));
    public static final Block CUT_WHITE_CONCRETE = register("cut_white_concrete", new Block(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block CUT_LIGHT_GRAY_CONCRETE = register("cut_light_gray_concrete", new Block(FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE)));
    public static final Block CUT_GRAY_CONCRETE = register("cut_gray_concrete", new Block(FabricBlockSettings.copy(GRAY_CONCRETE)));
    public static final Block CUT_BLACK_CONCRETE = register("cut_black_concrete", new Block(FabricBlockSettings.copy(BLACK_CONCRETE)));
    public static final Block CUT_BROWN_CONCRETE = register("cut_brown_concrete", new Block(FabricBlockSettings.copy(BROWN_CONCRETE)));

    public static final Block CUT_RED_CONCRETE_SLAB = register("cut_red_concrete_slab", new SlabBlock(FabricBlockSettings.copy(CUT_RED_CONCRETE)));
    public static final Block CUT_ORANGE_CONCRETE_SLAB = register("cut_orange_concrete_slab", new SlabBlock(FabricBlockSettings.copy(CUT_ORANGE_CONCRETE)));
    public static final Block CUT_YELLOW_CONCRETE_SLAB = register("cut_yellow_concrete_slab", new SlabBlock(FabricBlockSettings.copy(CUT_YELLOW_CONCRETE)));
    public static final Block CUT_LIME_CONCRETE_SLAB = register("cut_lime_concrete_slab", new SlabBlock(FabricBlockSettings.copy(CUT_LIME_CONCRETE)));
    public static final Block CUT_GREEN_CONCRETE_SLAB = register("cut_green_concrete_slab", new SlabBlock(FabricBlockSettings.copy(CUT_GREEN_CONCRETE)));
    public static final Block CUT_BLUE_CONCRETE_SLAB = register("cut_blue_concrete_slab", new SlabBlock(FabricBlockSettings.copy(CUT_BLUE_CONCRETE)));
    public static final Block CUT_CYAN_CONCRETE_SLAB = register("cut_cyan_concrete_slab", new SlabBlock(FabricBlockSettings.copy(CUT_CYAN_CONCRETE)));
    public static final Block CUT_LIGHT_BLUE_CONCRETE_SLAB = register("cut_light_blue_concrete_slab", new SlabBlock(FabricBlockSettings.copy(CUT_LIGHT_BLUE_CONCRETE)));
    public static final Block CUT_PURPLE_CONCRETE_SLAB = register("cut_purple_concrete_slab", new SlabBlock(FabricBlockSettings.copy(CUT_PURPLE_CONCRETE)));
    public static final Block CUT_MAGENTA_CONCRETE_SLAB = register("cut_magenta_concrete_slab", new SlabBlock(FabricBlockSettings.copy(CUT_MAGENTA_CONCRETE)));
    public static final Block CUT_PINK_CONCRETE_SLAB = register("cut_pink_concrete_slab", new SlabBlock(FabricBlockSettings.copy(CUT_PINK_CONCRETE)));
    public static final Block CUT_WHITE_CONCRETE_SLAB = register("cut_white_concrete_slab", new SlabBlock(FabricBlockSettings.copy(CUT_WHITE_CONCRETE)));
    public static final Block CUT_LIGHT_GRAY_CONCRETE_SLAB = register("cut_light_gray_concrete_slab", new SlabBlock(FabricBlockSettings.copy(CUT_LIGHT_GRAY_CONCRETE)));
    public static final Block CUT_GRAY_CONCRETE_SLAB = register("cut_gray_concrete_slab", new SlabBlock(FabricBlockSettings.copy(CUT_GRAY_CONCRETE)));
    public static final Block CUT_BLACK_CONCRETE_SLAB = register("cut_black_concrete_slab", new SlabBlock(FabricBlockSettings.copy(CUT_BLACK_CONCRETE)));
    public static final Block CUT_BROWN_CONCRETE_SLAB = register("cut_brown_concrete_slab", new SlabBlock(FabricBlockSettings.copy(CUT_BROWN_CONCRETE)));

    // Terracotta Stairs
    public static final Block CUT_RED_CONCRETE_STAIRS = register("cut_red_concrete_stairs", new BaseConsistencyStairBlock(RED_CONCRETE.getDefaultState(), FabricBlockSettings.copy(CUT_RED_CONCRETE)));
    public static final Block CUT_ORANGE_CONCRETE_STAIRS = register("cut_orange_concrete_stairs", new BaseConsistencyStairBlock(ORANGE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(CUT_ORANGE_CONCRETE)));
    public static final Block CUT_YELLOW_CONCRETE_STAIRS = register("cut_yellow_concrete_stairs", new BaseConsistencyStairBlock(YELLOW_CONCRETE.getDefaultState(), FabricBlockSettings.copy(CUT_YELLOW_CONCRETE)));
    public static final Block CUT_LIME_CONCRETE_STAIRS = register("cut_lime_concrete_stairs", new BaseConsistencyStairBlock(LIME_CONCRETE.getDefaultState(), FabricBlockSettings.copy(CUT_LIME_CONCRETE)));
    public static final Block CUT_GREEN_CONCRETE_STAIRS = register("cut_green_concrete_stairs", new BaseConsistencyStairBlock(GREEN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(CUT_GREEN_CONCRETE)));
    public static final Block CUT_BLUE_CONCRETE_STAIRS = register("cut_blue_concrete_stairs", new BaseConsistencyStairBlock(BLUE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(CUT_BLUE_CONCRETE)));
    public static final Block CUT_CYAN_CONCRETE_STAIRS = register("cut_cyan_concrete_stairs", new BaseConsistencyStairBlock(CYAN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(CUT_CYAN_CONCRETE)));
    public static final Block CUT_LIGHT_BLUE_CONCRETE_STAIRS = register("cut_light_blue_concrete_stairs", new BaseConsistencyStairBlock(LIGHT_BLUE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(CUT_LIGHT_BLUE_CONCRETE)));
    public static final Block CUT_PURPLE_CONCRETE_STAIRS = register("cut_purple_concrete_stairs", new BaseConsistencyStairBlock(PURPLE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(CUT_PURPLE_CONCRETE)));
    public static final Block CUT_MAGENTA_CONCRETE_STAIRS = register("cut_magenta_concrete_stairs", new BaseConsistencyStairBlock(MAGENTA_CONCRETE.getDefaultState(), FabricBlockSettings.copy(CUT_MAGENTA_CONCRETE)));
    public static final Block CUT_PINK_CONCRETE_STAIRS = register("cut_pink_concrete_stairs", new BaseConsistencyStairBlock(PINK_CONCRETE.getDefaultState(), FabricBlockSettings.copy(CUT_PINK_CONCRETE)));
    public static final Block CUT_WHITE_CONCRETE_STAIRS = register("cut_white_concrete_stairs", new BaseConsistencyStairBlock(WHITE_CONCRETE.getDefaultState(), FabricBlockSettings.copy(CUT_WHITE_CONCRETE)));
    public static final Block CUT_LIGHT_GRAY_CONCRETE_STAIRS = register("cut_light_gray_concrete_stairs", new BaseConsistencyStairBlock(LIGHT_GRAY_CONCRETE.getDefaultState(), FabricBlockSettings.copy(CUT_LIGHT_GRAY_CONCRETE)));
    public static final Block CUT_GRAY_CONCRETE_STAIRS = register("cut_gray_concrete_stairs", new BaseConsistencyStairBlock(GRAY_CONCRETE.getDefaultState(), FabricBlockSettings.copy(CUT_GRAY_CONCRETE)));
    public static final Block CUT_BLACK_CONCRETE_STAIRS = register("cut_black_concrete_stairs", new BaseConsistencyStairBlock(BLACK_CONCRETE.getDefaultState(), FabricBlockSettings.copy(CUT_BLACK_CONCRETE)));
    public static final Block CUT_BROWN_CONCRETE_STAIRS = register("cut_brown_concrete_stairs", new BaseConsistencyStairBlock(BROWN_CONCRETE.getDefaultState(), FabricBlockSettings.copy(CUT_BROWN_CONCRETE)));


    // Terracotta Wall
    public static final Block CUT_RED_CONCRETE_WALL = register("cut_red_concrete_wall", new WallBlock(FabricBlockSettings.copy(CUT_RED_CONCRETE)));
    public static final Block CUT_ORANGE_CONCRETE_WALL = register("cut_orange_concrete_wall", new WallBlock(FabricBlockSettings.copy(CUT_ORANGE_CONCRETE)));
    public static final Block CUT_YELLOW_CONCRETE_WALL = register("cut_yellow_concrete_wall", new WallBlock(FabricBlockSettings.copy(CUT_YELLOW_CONCRETE)));
    public static final Block CUT_LIME_CONCRETE_WALL = register("cut_lime_concrete_wall", new WallBlock(FabricBlockSettings.copy(CUT_LIME_CONCRETE)));
    public static final Block CUT_GREEN_CONCRETE_WALL = register("cut_green_concrete_wall", new WallBlock(FabricBlockSettings.copy(CUT_GREEN_CONCRETE)));
    public static final Block CUT_BLUE_CONCRETE_WALL = register("cut_blue_concrete_wall", new WallBlock(FabricBlockSettings.copy(CUT_BLUE_CONCRETE)));
    public static final Block CUT_CYAN_CONCRETE_WALL = register("cut_cyan_concrete_wall", new WallBlock(FabricBlockSettings.copy(CUT_CYAN_CONCRETE)));
    public static final Block CUT_LIGHT_BLUE_CONCRETE_WALL = register("cut_light_blue_concrete_wall", new WallBlock(FabricBlockSettings.copy(CUT_LIGHT_BLUE_CONCRETE)));
    public static final Block CUT_PURPLE_CONCRETE_WALL = register("cut_purple_concrete_wall", new WallBlock(FabricBlockSettings.copy(CUT_PURPLE_CONCRETE)));
    public static final Block CUT_MAGENTA_CONCRETE_WALL = register("cut_magenta_concrete_wall", new WallBlock(FabricBlockSettings.copy(CUT_MAGENTA_CONCRETE)));
    public static final Block CUT_PINK_CONCRETE_WALL = register("cut_pink_concrete_wall", new WallBlock(FabricBlockSettings.copy(CUT_PINK_CONCRETE)));
    public static final Block CUT_WHITE_CONCRETE_WALL = register("cut_white_concrete_wall", new WallBlock(FabricBlockSettings.copy(CUT_WHITE_CONCRETE)));
    public static final Block CUT_LIGHT_GRAY_CONCRETE_WALL = register("cut_light_gray_concrete_wall", new WallBlock(FabricBlockSettings.copy(CUT_LIGHT_GRAY_CONCRETE)));
    public static final Block CUT_GRAY_CONCRETE_WALL = register("cut_gray_concrete_wall", new WallBlock(FabricBlockSettings.copy(CUT_GRAY_CONCRETE)));
    public static final Block CUT_BLACK_CONCRETE_WALL = register("cut_black_concrete_wall", new WallBlock(FabricBlockSettings.copy(CUT_BLACK_CONCRETE)));
    public static final Block CUT_BROWN_CONCRETE_WALL = register("cut_brown_concrete_wall", new WallBlock(FabricBlockSettings.copy(CUT_BROWN_CONCRETE)));

    // Terracotta Gates
    public static final Block CUT_RED_CONCRETE_GATE = register("cut_red_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_RED_CONCRETE)));
    public static final Block CUT_ORANGE_CONCRETE_GATE = register("cut_orange_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_ORANGE_CONCRETE)));
    public static final Block CUT_YELLOW_CONCRETE_GATE = register("cut_yellow_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_YELLOW_CONCRETE)));
    public static final Block CUT_LIME_CONCRETE_GATE = register("cut_lime_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_LIME_CONCRETE)));
    public static final Block CUT_GREEN_CONCRETE_GATE = register("cut_green_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_GREEN_CONCRETE)));
    public static final Block CUT_BLUE_CONCRETE_GATE = register("cut_blue_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_BLUE_CONCRETE)));
    public static final Block CUT_CYAN_CONCRETE_GATE = register("cut_cyan_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_CYAN_CONCRETE)));
    public static final Block CUT_LIGHT_BLUE_CONCRETE_GATE = register("cut_light_blue_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_LIGHT_BLUE_CONCRETE)));
    public static final Block CUT_PURPLE_CONCRETE_GATE = register("cut_purple_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_PURPLE_CONCRETE)));
    public static final Block CUT_MAGENTA_CONCRETE_GATE = register("cut_magenta_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_MAGENTA_CONCRETE)));
    public static final Block CUT_PINK_CONCRETE_GATE = register("cut_pink_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_PINK_CONCRETE)));
    public static final Block CUT_WHITE_CONCRETE_GATE = register("cut_white_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_WHITE_CONCRETE)));
    public static final Block CUT_LIGHT_GRAY_CONCRETE_GATE = register("cut_light_gray_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_LIGHT_GRAY_CONCRETE)));
    public static final Block CUT_GRAY_CONCRETE_GATE = register("cut_gray_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_GRAY_CONCRETE)));
    public static final Block CUT_BLACK_CONCRETE_GATE = register("cut_black_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_BLACK_CONCRETE)));
    public static final Block CUT_BROWN_CONCRETE_GATE = register("cut_brown_concrete_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_BROWN_CONCRETE)));

    //mossy polished
    //slab
    //stairs
    //wall
    //gate

    //cracked polished
    //slab
    //stairs
    //wall
    //gate

    public static final Block RED_CONCRETE_BRICKS = register("red_concrete_bricks", new Block(FabricBlockSettings.copy(RED_CONCRETE)));
    public static final Block ORANGE_CONCRETE_BRICKS = register("orange_concrete_bricks", new Block(FabricBlockSettings.copy(ORANGE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_BRICKS = register("yellow_concrete_bricks", new Block(FabricBlockSettings.copy(YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_BRICKS = register("lime_concrete_bricks", new Block(FabricBlockSettings.copy(LIME_CONCRETE)));
    public static final Block GREEN_CONCRETE_BRICKS = register("green_concrete_bricks", new Block(FabricBlockSettings.copy(GREEN_CONCRETE)));
    public static final Block BLUE_CONCRETE_BRICKS = register("blue_concrete_bricks", new Block(FabricBlockSettings.copy(BLUE_CONCRETE)));
    public static final Block CYAN_CONCRETE_BRICKS = register("cyan_concrete_bricks", new Block(FabricBlockSettings.copy(CYAN_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_BRICKS = register("light_blue_concrete_bricks", new Block(FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_BRICKS = register("purple_concrete_bricks", new Block(FabricBlockSettings.copy(PURPLE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_BRICKS = register("magenta_concrete_bricks", new Block(FabricBlockSettings.copy(MAGENTA_CONCRETE)));
    public static final Block PINK_CONCRETE_BRICKS = register("pink_concrete_bricks", new Block(FabricBlockSettings.copy(PINK_CONCRETE)));
    public static final Block WHITE_CONCRETE_BRICKS = register("white_concrete_bricks", new Block(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_BRICKS = register("light_gray_concrete_bricks", new Block(FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_BRICKS = register("gray_concrete_bricks", new Block(FabricBlockSettings.copy(GRAY_CONCRETE)));
    public static final Block BLACK_CONCRETE_BRICKS = register("black_concrete_bricks", new Block(FabricBlockSettings.copy(BLACK_CONCRETE)));
    public static final Block BROWN_CONCRETE_BRICKS = register("brown_concrete_bricks", new Block(FabricBlockSettings.copy(BROWN_CONCRETE)));

    public static final Block RED_CONCRETE_BRICK_SLAB = register("red_concrete_brick_slab", new SlabBlock(FabricBlockSettings.copy(RED_CONCRETE_BRICKS)));
    public static final Block ORANGE_CONCRETE_BRICK_SLAB = register("orange_concrete_brick_slab", new SlabBlock(FabricBlockSettings.copy(ORANGE_CONCRETE_BRICKS)));
    public static final Block YELLOW_CONCRETE_BRICK_SLAB = register("yellow_concrete_brick_slab", new SlabBlock(FabricBlockSettings.copy(YELLOW_CONCRETE_BRICKS)));
    public static final Block LIME_CONCRETE_BRICK_SLAB = register("lime_concrete_brick_slab", new SlabBlock(FabricBlockSettings.copy(LIME_CONCRETE_BRICKS)));
    public static final Block GREEN_CONCRETE_BRICK_SLAB = register("green_concrete_brick_slab", new SlabBlock(FabricBlockSettings.copy(GREEN_CONCRETE_BRICKS)));
    public static final Block BLUE_CONCRETE_BRICK_SLAB = register("blue_concrete_brick_slab", new SlabBlock(FabricBlockSettings.copy(BLUE_CONCRETE_BRICKS)));
    public static final Block CYAN_CONCRETE_BRICK_SLAB = register("cyan_concrete_brick_slab", new SlabBlock(FabricBlockSettings.copy(CYAN_CONCRETE_BRICKS)));
    public static final Block LIGHT_BLUE_CONCRETE_BRICK_SLAB = register("light_blue_concrete_brick_slab", new SlabBlock(FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE_BRICKS)));
    public static final Block PURPLE_CONCRETE_BRICK_SLAB = register("purple_concrete_brick_slab", new SlabBlock(FabricBlockSettings.copy(PURPLE_CONCRETE_BRICKS)));
    public static final Block MAGENTA_CONCRETE_BRICK_SLAB = register("magenta_concrete_brick_slab", new SlabBlock(FabricBlockSettings.copy(MAGENTA_CONCRETE_BRICKS)));
    public static final Block PINK_CONCRETE_BRICK_SLAB = register("pink_concrete_brick_slab", new SlabBlock(FabricBlockSettings.copy(PINK_CONCRETE_BRICKS)));
    public static final Block WHITE_CONCRETE_BRICK_SLAB = register("white_concrete_brick_slab", new SlabBlock(FabricBlockSettings.copy(WHITE_CONCRETE_BRICKS)));
    public static final Block LIGHT_GRAY_CONCRETE_BRICK_SLAB = register("light_gray_concrete_brick_slab", new SlabBlock(FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE_BRICKS)));
    public static final Block GRAY_CONCRETE_BRICK_SLAB = register("gray_concrete_brick_slab", new SlabBlock(FabricBlockSettings.copy(GRAY_CONCRETE_BRICKS)));
    public static final Block BLACK_CONCRETE_BRICK_SLAB = register("black_concrete_brick_slab", new SlabBlock(FabricBlockSettings.copy(BLACK_CONCRETE_BRICKS)));
    public static final Block BROWN_CONCRETE_BRICK_SLAB = register("brown_concrete_brick_slab", new SlabBlock(FabricBlockSettings.copy(BROWN_CONCRETE_BRICKS)));


    // Terracotta Stairs
    public static final Block RED_CONCRETE_BRICK_STAIRS = register("red_concrete_brick_stairs", new BaseConsistencyStairBlock(RED_CONCRETE_BRICKS.getDefaultState(), FabricBlockSettings.copy(RED_CONCRETE_BRICKS)));
    public static final Block ORANGE_CONCRETE_BRICK_STAIRS = register("orange_concrete_brick_stairs", new BaseConsistencyStairBlock(ORANGE_CONCRETE_BRICKS.getDefaultState(), FabricBlockSettings.copy(ORANGE_CONCRETE_BRICKS)));
    public static final Block YELLOW_CONCRETE_BRICK_STAIRS = register("yellow_concrete_brick_stairs", new BaseConsistencyStairBlock(YELLOW_CONCRETE_BRICKS.getDefaultState(), FabricBlockSettings.copy(YELLOW_CONCRETE_BRICKS)));
    public static final Block LIME_CONCRETE_BRICK_STAIRS = register("lime_concrete_brick_stairs", new BaseConsistencyStairBlock(LIME_CONCRETE_BRICKS.getDefaultState(), FabricBlockSettings.copy(LIME_CONCRETE_BRICKS)));
    public static final Block GREEN_CONCRETE_BRICK_STAIRS = register("green_concrete_brick_stairs", new BaseConsistencyStairBlock(GREEN_CONCRETE_BRICKS.getDefaultState(), FabricBlockSettings.copy(GREEN_CONCRETE_BRICKS)));
    public static final Block BLUE_CONCRETE_BRICK_STAIRS = register("blue_concrete_brick_stairs", new BaseConsistencyStairBlock(BLUE_CONCRETE_BRICKS.getDefaultState(), FabricBlockSettings.copy(BLUE_CONCRETE_BRICKS)));
    public static final Block CYAN_CONCRETE_BRICK_STAIRS = register("cyan_concrete_brick_stairs", new BaseConsistencyStairBlock(CYAN_CONCRETE_BRICKS.getDefaultState(), FabricBlockSettings.copy(CYAN_CONCRETE_BRICKS)));
    public static final Block LIGHT_BLUE_CONCRETE_BRICK_STAIRS = register("light_blue_concrete_brick_stairs", new BaseConsistencyStairBlock(LIGHT_BLUE_CONCRETE_BRICKS.getDefaultState(), FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE_BRICKS)));
    public static final Block PURPLE_CONCRETE_BRICK_STAIRS = register("purple_concrete_brick_stairs", new BaseConsistencyStairBlock(PURPLE_CONCRETE_BRICKS.getDefaultState(), FabricBlockSettings.copy(PURPLE_CONCRETE_BRICKS)));
    public static final Block MAGENTA_CONCRETE_BRICK_STAIRS = register("magenta_concrete_brick_stairs", new BaseConsistencyStairBlock(MAGENTA_CONCRETE_BRICKS.getDefaultState(), FabricBlockSettings.copy(MAGENTA_CONCRETE_BRICKS)));
    public static final Block PINK_CONCRETE_BRICK_STAIRS = register("pink_concrete_brick_stairs", new BaseConsistencyStairBlock(PINK_CONCRETE_BRICKS.getDefaultState(), FabricBlockSettings.copy(PINK_CONCRETE_BRICKS)));
    public static final Block WHITE_CONCRETE_BRICK_STAIRS = register("white_concrete_brick_stairs", new BaseConsistencyStairBlock(WHITE_CONCRETE_BRICKS.getDefaultState(), FabricBlockSettings.copy(WHITE_CONCRETE_BRICKS)));
    public static final Block LIGHT_GRAY_CONCRETE_BRICK_STAIRS = register("light_gray_concrete_brick_stairs", new BaseConsistencyStairBlock(LIGHT_GRAY_CONCRETE_BRICKS.getDefaultState(), FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE_BRICKS)));
    public static final Block GRAY_CONCRETE_BRICK_STAIRS = register("gray_concrete_brick_stairs", new BaseConsistencyStairBlock(GRAY_CONCRETE_BRICKS.getDefaultState(), FabricBlockSettings.copy(GRAY_CONCRETE_BRICKS)));
    public static final Block BLACK_CONCRETE_BRICK_STAIRS = register("black_concrete_brick_stairs", new BaseConsistencyStairBlock(BLACK_CONCRETE_BRICKS.getDefaultState(), FabricBlockSettings.copy(BLACK_CONCRETE_BRICKS)));
    public static final Block BROWN_CONCRETE_BRICK_STAIRS = register("brown_concrete_brick_stairs", new BaseConsistencyStairBlock(BROWN_CONCRETE_BRICKS.getDefaultState(), FabricBlockSettings.copy(BROWN_CONCRETE_BRICKS)));

    // Terracotta Wall
    public static final Block RED_CONCRETE_BRICK_WALL = register("red_concrete_brick_wall", new WallBlock(FabricBlockSettings.copy(RED_CONCRETE_BRICKS)));
    public static final Block ORANGE_CONCRETE_BRICK_WALL = register("orange_concrete_brick_wall", new WallBlock(FabricBlockSettings.copy(ORANGE_CONCRETE_BRICKS)));
    public static final Block YELLOW_CONCRETE_BRICK_WALL = register("yellow_concrete_brick_wall", new WallBlock(FabricBlockSettings.copy(YELLOW_CONCRETE_BRICKS)));
    public static final Block LIME_CONCRETE_BRICK_WALL = register("lime_concrete_brick_wall", new WallBlock(FabricBlockSettings.copy(LIME_CONCRETE_BRICKS)));
    public static final Block GREEN_CONCRETE_BRICK_WALL = register("green_concrete_brick_wall", new WallBlock(FabricBlockSettings.copy(GREEN_CONCRETE_BRICKS)));
    public static final Block BLUE_CONCRETE_BRICK_WALL = register("blue_concrete_brick_wall", new WallBlock(FabricBlockSettings.copy(BLUE_CONCRETE_BRICKS)));
    public static final Block CYAN_CONCRETE_BRICK_WALL = register("cyan_concrete_brick_wall", new WallBlock(FabricBlockSettings.copy(CYAN_CONCRETE_BRICKS)));
    public static final Block LIGHT_BLUE_CONCRETE_BRICK_WALL = register("light_blue_concrete_brick_wall", new WallBlock(FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE_BRICKS)));
    public static final Block PURPLE_CONCRETE_BRICK_WALL = register("purple_concrete_brick_wall", new WallBlock(FabricBlockSettings.copy(PURPLE_CONCRETE_BRICKS)));
    public static final Block MAGENTA_CONCRETE_BRICK_WALL = register("magenta_concrete_brick_wall", new WallBlock(FabricBlockSettings.copy(MAGENTA_CONCRETE_BRICKS)));
    public static final Block PINK_CONCRETE_BRICK_WALL = register("pink_concrete_brick_wall", new WallBlock(FabricBlockSettings.copy(PINK_CONCRETE_BRICKS)));
    public static final Block WHITE_CONCRETE_BRICK_WALL = register("white_concrete_brick_wall", new WallBlock(FabricBlockSettings.copy(WHITE_CONCRETE_BRICKS)));
    public static final Block LIGHT_GRAY_CONCRETE_BRICK_WALL = register("light_gray_concrete_brick_wall", new WallBlock(FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE_BRICKS)));
    public static final Block GRAY_CONCRETE_BRICK_WALL = register("gray_concrete_brick_wall", new WallBlock(FabricBlockSettings.copy(GRAY_CONCRETE_BRICKS)));
    public static final Block BLACK_CONCRETE_BRICK_WALL = register("black_concrete_brick_wall", new WallBlock(FabricBlockSettings.copy(BLACK_CONCRETE_BRICKS)));
    public static final Block BROWN_CONCRETE_BRICK_WALL = register("brown_concrete_brick_wall", new WallBlock(FabricBlockSettings.copy(BROWN_CONCRETE_BRICKS)));

    // Terracotta Gates
    public static final Block RED_CONCRETE_BRICK_GATE = register("red_concrete_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(RED_CONCRETE_BRICKS)));
    public static final Block ORANGE_CONCRETE_BRICK_GATE = register("orange_concrete_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(ORANGE_CONCRETE_BRICKS)));
    public static final Block YELLOW_CONCRETE_BRICK_GATE = register("yellow_concrete_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(YELLOW_CONCRETE_BRICKS)));
    public static final Block LIME_CONCRETE_BRICK_GATE = register("lime_concrete_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(LIME_CONCRETE_BRICKS)));
    public static final Block GREEN_CONCRETE_BRICK_GATE = register("green_concrete_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(GREEN_CONCRETE_BRICKS)));
    public static final Block BLUE_CONCRETE_BRICK_GATE = register("blue_concrete_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(BLUE_CONCRETE_BRICKS)));
    public static final Block CYAN_CONCRETE_BRICK_GATE = register("cyan_concrete_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(CYAN_CONCRETE_BRICKS)));
    public static final Block LIGHT_BLUE_CONCRETE_BRICK_GATE = register("light_blue_concrete_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE_BRICKS)));
    public static final Block PURPLE_CONCRETE_BRICK_GATE = register("purple_concrete_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(PURPLE_CONCRETE_BRICKS)));
    public static final Block MAGENTA_CONCRETE_BRICK_GATE = register("magenta_concrete_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(MAGENTA_CONCRETE_BRICKS)));
    public static final Block PINK_CONCRETE_BRICK_GATE = register("pink_concrete_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(PINK_CONCRETE_BRICKS)));
    public static final Block WHITE_CONCRETE_BRICK_GATE = register("white_concrete_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(WHITE_CONCRETE_BRICKS)));
    public static final Block LIGHT_GRAY_CONCRETE_BRICK_GATE = register("light_gray_concrete_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE_BRICKS)));
    public static final Block GRAY_CONCRETE_BRICK_GATE = register("gray_concrete_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(GRAY_CONCRETE_BRICKS)));
    public static final Block BLACK_CONCRETE_BRICK_GATE = register("black_concrete_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(BLACK_CONCRETE_BRICKS)));
    public static final Block BROWN_CONCRETE_BRICK_GATE = register("brown_concrete_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(BROWN_CONCRETE_BRICKS)));

    //mossy bricks
    //slab
    //stairs
    //wall
    //gate

    //cracked bricks
    //slab
    //stairs
    //wall
    //gate

    public static final Block RED_CONCRETE_TILES = register("red_concrete_tiles", new Block(FabricBlockSettings.copy(RED_CONCRETE)));
    public static final Block ORANGE_CONCRETE_TILES = register("orange_concrete_tiles", new Block(FabricBlockSettings.copy(ORANGE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_TILES = register("yellow_concrete_tiles", new Block(FabricBlockSettings.copy(YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_TILES = register("lime_concrete_tiles", new Block(FabricBlockSettings.copy(LIME_CONCRETE)));
    public static final Block GREEN_CONCRETE_TILES = register("green_concrete_tiles", new Block(FabricBlockSettings.copy(GREEN_CONCRETE)));
    public static final Block BLUE_CONCRETE_TILES = register("blue_concrete_tiles", new Block(FabricBlockSettings.copy(BLUE_CONCRETE)));
    public static final Block CYAN_CONCRETE_TILES = register("cyan_concrete_tiles", new Block(FabricBlockSettings.copy(CYAN_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_TILES = register("light_blue_concrete_tiles", new Block(FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_TILES = register("purple_concrete_tiles", new Block(FabricBlockSettings.copy(PURPLE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_TILES = register("magenta_concrete_tiles", new Block(FabricBlockSettings.copy(MAGENTA_CONCRETE)));
    public static final Block PINK_CONCRETE_TILES = register("pink_concrete_tiles", new Block(FabricBlockSettings.copy(PINK_CONCRETE)));
    public static final Block WHITE_CONCRETE_TILES = register("white_concrete_tiles", new Block(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_TILES = register("light_gray_concrete_tiles", new Block(FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_TILES = register("gray_concrete_tiles", new Block(FabricBlockSettings.copy(GRAY_CONCRETE)));
    public static final Block BLACK_CONCRETE_TILES = register("black_concrete_tiles", new Block(FabricBlockSettings.copy(BLACK_CONCRETE)));
    public static final Block BROWN_CONCRETE_TILES = register("brown_concrete_tiles", new Block(FabricBlockSettings.copy(BROWN_CONCRETE)));

    public static final Block RED_CONCRETE_TILE_SLAB = register("red_concrete_tile_slab", new SlabBlock(FabricBlockSettings.copy(RED_CONCRETE_TILES)));
    public static final Block ORANGE_CONCRETE_TILE_SLAB = register("orange_concrete_tile_slab", new SlabBlock(FabricBlockSettings.copy(ORANGE_CONCRETE_TILES)));
    public static final Block YELLOW_CONCRETE_TILE_SLAB = register("yellow_concrete_tile_slab", new SlabBlock(FabricBlockSettings.copy(YELLOW_CONCRETE_TILES)));
    public static final Block LIME_CONCRETE_TILE_SLAB = register("lime_concrete_tile_slab", new SlabBlock(FabricBlockSettings.copy(LIME_CONCRETE_TILES)));
    public static final Block GREEN_CONCRETE_TILE_SLAB = register("green_concrete_tile_slab", new SlabBlock(FabricBlockSettings.copy(GREEN_CONCRETE_TILES)));
    public static final Block BLUE_CONCRETE_TILE_SLAB = register("blue_concrete_tile_slab", new SlabBlock(FabricBlockSettings.copy(BLUE_CONCRETE_TILES)));
    public static final Block CYAN_CONCRETE_TILE_SLAB = register("cyan_concrete_tile_slab", new SlabBlock(FabricBlockSettings.copy(CYAN_CONCRETE_TILES)));
    public static final Block LIGHT_BLUE_CONCRETE_TILE_SLAB = register("light_blue_concrete_tile_slab", new SlabBlock(FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE_TILES)));
    public static final Block PURPLE_CONCRETE_TILE_SLAB = register("purple_concrete_tile_slab", new SlabBlock(FabricBlockSettings.copy(PURPLE_CONCRETE_TILES)));
    public static final Block MAGENTA_CONCRETE_TILE_SLAB = register("magenta_concrete_tile_slab", new SlabBlock(FabricBlockSettings.copy(MAGENTA_CONCRETE_TILES)));
    public static final Block PINK_CONCRETE_TILE_SLAB = register("pink_concrete_tile_slab", new SlabBlock(FabricBlockSettings.copy(PINK_CONCRETE_TILES)));
    public static final Block WHITE_CONCRETE_TILE_SLAB = register("white_concrete_tile_slab", new SlabBlock(FabricBlockSettings.copy(WHITE_CONCRETE_TILES)));
    public static final Block LIGHT_GRAY_CONCRETE_TILE_SLAB = register("light_gray_concrete_tile_slab", new SlabBlock(FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE_TILES)));
    public static final Block GRAY_CONCRETE_TILE_SLAB = register("gray_concrete_tile_slab", new SlabBlock(FabricBlockSettings.copy(GRAY_CONCRETE_TILES)));
    public static final Block BLACK_CONCRETE_TILE_SLAB = register("black_concrete_tile_slab", new SlabBlock(FabricBlockSettings.copy(BLACK_CONCRETE_TILES)));
    public static final Block BROWN_CONCRETE_TILE_SLAB = register("brown_concrete_tile_slab", new SlabBlock(FabricBlockSettings.copy(BROWN_CONCRETE_TILES)));

    // Terracotta Stairs
    public static final Block RED_CONCRETE_TILE_STAIRS = register("red_concrete_tile_stairs", new BaseConsistencyStairBlock(RED_CONCRETE_TILES.getDefaultState(), FabricBlockSettings.copy(RED_CONCRETE_TILES)));
    public static final Block ORANGE_CONCRETE_TILE_STAIRS = register("orange_concrete_tile_stairs", new BaseConsistencyStairBlock(ORANGE_CONCRETE_TILES.getDefaultState(), FabricBlockSettings.copy(ORANGE_CONCRETE_TILES)));
    public static final Block YELLOW_CONCRETE_TILE_STAIRS = register("yellow_concrete_tile_stairs", new BaseConsistencyStairBlock(YELLOW_CONCRETE_TILES.getDefaultState(), FabricBlockSettings.copy(YELLOW_CONCRETE_TILES)));
    public static final Block LIME_CONCRETE_TILE_STAIRS = register("lime_concrete_tile_stairs", new BaseConsistencyStairBlock(LIME_CONCRETE_TILES.getDefaultState(), FabricBlockSettings.copy(LIME_CONCRETE_TILES)));
    public static final Block GREEN_CONCRETE_TILE_STAIRS = register("green_concrete_tile_stairs", new BaseConsistencyStairBlock(GREEN_CONCRETE_TILES.getDefaultState(), FabricBlockSettings.copy(GREEN_CONCRETE_TILES)));
    public static final Block BLUE_CONCRETE_TILE_STAIRS = register("blue_concrete_tile_stairs", new BaseConsistencyStairBlock(BLUE_CONCRETE_TILES.getDefaultState(), FabricBlockSettings.copy(BLUE_CONCRETE_TILES)));
    public static final Block CYAN_CONCRETE_TILE_STAIRS = register("cyan_concrete_tile_stairs", new BaseConsistencyStairBlock(CYAN_CONCRETE_TILES.getDefaultState(), FabricBlockSettings.copy(CYAN_CONCRETE_TILES)));
    public static final Block LIGHT_BLUE_CONCRETE_TILE_STAIRS = register("light_blue_concrete_tile_stairs", new BaseConsistencyStairBlock(LIGHT_BLUE_CONCRETE_TILES.getDefaultState(), FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE_TILES)));
    public static final Block PURPLE_CONCRETE_TILE_STAIRS = register("purple_concrete_tile_stairs", new BaseConsistencyStairBlock(PURPLE_CONCRETE_TILES.getDefaultState(), FabricBlockSettings.copy(PURPLE_CONCRETE_TILES)));
    public static final Block MAGENTA_CONCRETE_TILE_STAIRS = register("magenta_concrete_tile_stairs", new BaseConsistencyStairBlock(MAGENTA_CONCRETE_TILES.getDefaultState(), FabricBlockSettings.copy(MAGENTA_CONCRETE_TILES)));
    public static final Block PINK_CONCRETE_TILE_STAIRS = register("pink_concrete_tile_stairs", new BaseConsistencyStairBlock(PINK_CONCRETE_TILES.getDefaultState(), FabricBlockSettings.copy(PINK_CONCRETE_TILES)));
    public static final Block WHITE_CONCRETE_TILE_STAIRS = register("white_concrete_tile_stairs", new BaseConsistencyStairBlock(WHITE_CONCRETE_TILES.getDefaultState(), FabricBlockSettings.copy(WHITE_CONCRETE_TILES)));
    public static final Block LIGHT_GRAY_CONCRETE_TILE_STAIRS = register("light_gray_concrete_tile_stairs", new BaseConsistencyStairBlock(LIGHT_GRAY_CONCRETE_TILES.getDefaultState(), FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE_TILES)));
    public static final Block GRAY_CONCRETE_TILE_STAIRS = register("gray_concrete_tile_stairs", new BaseConsistencyStairBlock(GRAY_CONCRETE_TILES.getDefaultState(), FabricBlockSettings.copy(GRAY_CONCRETE_TILES)));
    public static final Block BLACK_CONCRETE_TILE_STAIRS = register("black_concrete_tile_stairs", new BaseConsistencyStairBlock(BLACK_CONCRETE_TILES.getDefaultState(), FabricBlockSettings.copy(BLACK_CONCRETE_TILES)));
    public static final Block BROWN_CONCRETE_TILE_STAIRS = register("brown_concrete_tile_stairs", new BaseConsistencyStairBlock(BROWN_CONCRETE_TILES.getDefaultState(), FabricBlockSettings.copy(BROWN_CONCRETE_TILES)));

    // Terracotta Wall
    public static final Block RED_CONCRETE_TILE_WALL = register("red_concrete_tile_wall", new WallBlock(FabricBlockSettings.copy(RED_CONCRETE_TILES)));
    public static final Block ORANGE_CONCRETE_TILE_WALL = register("orange_concrete_tile_wall", new WallBlock(FabricBlockSettings.copy(ORANGE_CONCRETE_TILES)));
    public static final Block YELLOW_CONCRETE_TILE_WALL = register("yellow_concrete_tile_wall", new WallBlock(FabricBlockSettings.copy(YELLOW_CONCRETE_TILES)));
    public static final Block LIME_CONCRETE_TILE_WALL = register("lime_concrete_tile_wall", new WallBlock(FabricBlockSettings.copy(LIME_CONCRETE_TILES)));
    public static final Block GREEN_CONCRETE_TILE_WALL = register("green_concrete_tile_wall", new WallBlock(FabricBlockSettings.copy(GREEN_CONCRETE_TILES)));
    public static final Block BLUE_CONCRETE_TILE_WALL = register("blue_concrete_tile_wall", new WallBlock(FabricBlockSettings.copy(BLUE_CONCRETE_TILES)));
    public static final Block CYAN_CONCRETE_TILE_WALL = register("cyan_concrete_tile_wall", new WallBlock(FabricBlockSettings.copy(CYAN_CONCRETE_TILES)));
    public static final Block LIGHT_BLUE_CONCRETE_TILE_WALL = register("light_blue_concrete_tile_wall", new WallBlock(FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE_TILES)));
    public static final Block PURPLE_CONCRETE_TILE_WALL = register("purple_concrete_tile_wall", new WallBlock(FabricBlockSettings.copy(PURPLE_CONCRETE_TILES)));
    public static final Block MAGENTA_CONCRETE_TILE_WALL = register("magenta_concrete_tile_wall", new WallBlock(FabricBlockSettings.copy(MAGENTA_CONCRETE_TILES)));
    public static final Block PINK_CONCRETE_TILE_WALL = register("pink_concrete_tile_wall", new WallBlock(FabricBlockSettings.copy(PINK_CONCRETE_TILES)));
    public static final Block WHITE_CONCRETE_TILE_WALL = register("white_concrete_tile_wall", new WallBlock(FabricBlockSettings.copy(WHITE_CONCRETE_TILES)));
    public static final Block LIGHT_GRAY_CONCRETE_TILE_WALL = register("light_gray_concrete_tile_wall", new WallBlock(FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE_TILES)));
    public static final Block GRAY_CONCRETE_TILE_WALL = register("gray_concrete_tile_wall", new WallBlock(FabricBlockSettings.copy(GRAY_CONCRETE_TILES)));
    public static final Block BLACK_CONCRETE_TILE_WALL = register("black_concrete_tile_wall", new WallBlock(FabricBlockSettings.copy(BLACK_CONCRETE_TILES)));
    public static final Block BROWN_CONCRETE_TILE_WALL = register("brown_concrete_tile_wall", new WallBlock(FabricBlockSettings.copy(BROWN_CONCRETE_TILES)));

    // Terracotta Gates
    public static final Block RED_CONCRETE_TILE_GATE = register("red_concrete_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(RED_CONCRETE_TILES)));
    public static final Block ORANGE_CONCRETE_TILE_GATE = register("orange_concrete_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(ORANGE_CONCRETE_TILES)));
    public static final Block YELLOW_CONCRETE_TILE_GATE = register("yellow_concrete_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(YELLOW_CONCRETE_TILES)));
    public static final Block LIME_CONCRETE_TILE_GATE = register("lime_concrete_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(LIME_CONCRETE_TILES)));
    public static final Block GREEN_CONCRETE_TILE_GATE = register("green_concrete_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(GREEN_CONCRETE_TILES)));
    public static final Block BLUE_CONCRETE_TILE_GATE = register("blue_concrete_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(BLUE_CONCRETE_TILES)));
    public static final Block CYAN_CONCRETE_TILE_GATE = register("cyan_concrete_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(CYAN_CONCRETE_TILES)));
    public static final Block LIGHT_BLUE_CONCRETE_TILE_GATE = register("light_blue_concrete_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE_TILES)));
    public static final Block PURPLE_CONCRETE_TILE_GATE = register("purple_concrete_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(PURPLE_CONCRETE_TILES)));
    public static final Block MAGENTA_CONCRETE_TILE_GATE = register("magenta_concrete_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(MAGENTA_CONCRETE_TILES)));
    public static final Block PINK_CONCRETE_TILE_GATE = register("pink_concrete_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(PINK_CONCRETE_TILES)));
    public static final Block WHITE_CONCRETE_TILE_GATE = register("white_concrete_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(WHITE_CONCRETE_TILES)));
    public static final Block LIGHT_GRAY_CONCRETE_TILE_GATE = register("light_gray_concrete_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE_TILES)));
    public static final Block GRAY_CONCRETE_TILE_GATE = register("gray_concrete_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(GRAY_CONCRETE_TILES)));
    public static final Block BLACK_CONCRETE_TILE_GATE = register("black_concrete_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(BLACK_CONCRETE_TILES)));
    public static final Block BROWN_CONCRETE_TILE_GATE = register("brown_concrete_tile_gate", new FenceGateBlock(FabricBlockSettings.copy(BROWN_CONCRETE_TILES)));

    //mossy tiles
    //slab
    //stairs
    //wall
    //gate

    //cracked tiles
    //slab
    //stairs
    //wall
    //gate

    public static final Block RED_CONCRETE_PILLAR = register("red_concrete_pillar", new PillarBlock(FabricBlockSettings.copy(RED_CONCRETE)));
    public static final Block ORANGE_CONCRETE_PILLAR = register("orange_concrete_pillar", new PillarBlock(FabricBlockSettings.copy(ORANGE_CONCRETE)));
    public static final Block YELLOW_CONCRETE_PILLAR = register("yellow_concrete_pillar", new PillarBlock(FabricBlockSettings.copy(YELLOW_CONCRETE)));
    public static final Block LIME_CONCRETE_PILLAR = register("lime_concrete_pillar", new PillarBlock(FabricBlockSettings.copy(LIME_CONCRETE)));
    public static final Block GREEN_CONCRETE_PILLAR = register("green_concrete_pillar", new PillarBlock(FabricBlockSettings.copy(GREEN_CONCRETE)));
    public static final Block BLUE_CONCRETE_PILLAR = register("blue_concrete_pillar", new PillarBlock(FabricBlockSettings.copy(BLUE_CONCRETE)));
    public static final Block CYAN_CONCRETE_PILLAR = register("cyan_concrete_pillar", new PillarBlock(FabricBlockSettings.copy(CYAN_CONCRETE)));
    public static final Block LIGHT_BLUE_CONCRETE_PILLAR = register("light_blue_concrete_pillar", new PillarBlock(FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE)));
    public static final Block PURPLE_CONCRETE_PILLAR = register("purple_concrete_pillar", new PillarBlock(FabricBlockSettings.copy(PURPLE_CONCRETE)));
    public static final Block MAGENTA_CONCRETE_PILLAR = register("magenta_concrete_pillar", new PillarBlock(FabricBlockSettings.copy(MAGENTA_CONCRETE)));
    public static final Block PINK_CONCRETE_PILLAR = register("pink_concrete_pillar", new PillarBlock(FabricBlockSettings.copy(PINK_CONCRETE)));
    public static final Block WHITE_CONCRETE_PILLAR = register("white_concrete_pillar", new PillarBlock(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block LIGHT_GRAY_CONCRETE_PILLAR = register("light_gray_concrete_pillar", new PillarBlock(FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE)));
    public static final Block GRAY_CONCRETE_PILLAR = register("gray_concrete_pillar", new PillarBlock(FabricBlockSettings.copy(GRAY_CONCRETE)));
    public static final Block BLACK_CONCRETE_PILLAR = register("black_concrete_pillar", new PillarBlock(FabricBlockSettings.copy(BLACK_CONCRETE)));
    public static final Block BROWN_CONCRETE_PILLAR = register("brown_concrete_pillar", new PillarBlock(FabricBlockSettings.copy(BROWN_CONCRETE)));

    //mossy pillar
    //cracked pillar
    //corner pillar
    //mossy corner pillar
    //cracked corner pillar
    public static final Block CHISELED_RED_CONCRETE = register("chiseled_red_concrete", new Block(FabricBlockSettings.copy(RED_CONCRETE)));
    public static final Block CHISELED_ORANGE_CONCRETE = register("chiseled_orange_concrete", new Block(FabricBlockSettings.copy(ORANGE_CONCRETE)));
    public static final Block CHISELED_YELLOW_CONCRETE = register("chiseled_yellow_concrete", new Block(FabricBlockSettings.copy(YELLOW_CONCRETE)));
    public static final Block CHISELED_LIME_CONCRETE = register("chiseled_lime_concrete", new Block(FabricBlockSettings.copy(LIME_CONCRETE)));
    public static final Block CHISELED_GREEN_CONCRETE = register("chiseled_green_concrete", new Block(FabricBlockSettings.copy(GREEN_CONCRETE)));
    public static final Block CHISELED_BLUE_CONCRETE = register("chiseled_blue_concrete", new Block(FabricBlockSettings.copy(BLUE_CONCRETE)));
    public static final Block CHISELED_CYAN_CONCRETE = register("chiseled_cyan_concrete", new Block(FabricBlockSettings.copy(CYAN_CONCRETE)));
    public static final Block CHISELED_LIGHT_BLUE_CONCRETE = register("chiseled_light_blue_concrete", new Block(FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE)));
    public static final Block CHISELED_PURPLE_CONCRETE = register("chiseled_purple_concrete", new Block(FabricBlockSettings.copy(PURPLE_CONCRETE)));
    public static final Block CHISELED_MAGENTA_CONCRETE = register("chiseled_magenta_concrete", new Block(FabricBlockSettings.copy(MAGENTA_CONCRETE)));
    public static final Block CHISELED_PINK_CONCRETE = register("chiseled_pink_concrete", new Block(FabricBlockSettings.copy(PINK_CONCRETE)));
    public static final Block CHISELED_WHITE_CONCRETE = register("chiseled_white_concrete", new Block(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block CHISELED_LIGHT_GRAY_CONCRETE = register("chiseled_light_gray_concrete", new Block(FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE)));
    public static final Block CHISELED_GRAY_CONCRETE = register("chiseled_gray_concrete", new Block(FabricBlockSettings.copy(GRAY_CONCRETE)));
    public static final Block CHISELED_BLACK_CONCRETE = register("chiseled_black_concrete", new Block(FabricBlockSettings.copy(BLACK_CONCRETE)));
    public static final Block CHISELED_BROWN_CONCRETE = register("chiseled_brown_concrete", new Block(FabricBlockSettings.copy(BROWN_CONCRETE)));

    //mossy chiseled
    //cracked chiseled

    public static final Block CARVED_RED_CONCRETE = register("carved_red_concrete", new Block(FabricBlockSettings.copy(RED_CONCRETE)));
    public static final Block CARVED_ORANGE_CONCRETE = register("carved_orange_concrete", new Block(FabricBlockSettings.copy(ORANGE_CONCRETE)));
    public static final Block CARVED_YELLOW_CONCRETE = register("carved_yellow_concrete", new Block(FabricBlockSettings.copy(YELLOW_CONCRETE)));
    public static final Block CARVED_LIME_CONCRETE = register("carved_lime_concrete", new Block(FabricBlockSettings.copy(LIME_CONCRETE)));
    public static final Block CARVED_GREEN_CONCRETE = register("carved_green_concrete", new Block(FabricBlockSettings.copy(GREEN_CONCRETE)));
    public static final Block CARVED_BLUE_CONCRETE = register("carved_blue_concrete", new Block(FabricBlockSettings.copy(BLUE_CONCRETE)));
    public static final Block CARVED_CYAN_CONCRETE = register("carved_cyan_concrete", new Block(FabricBlockSettings.copy(CYAN_CONCRETE)));
    public static final Block CARVED_LIGHT_BLUE_CONCRETE = register("carved_light_blue_concrete", new Block(FabricBlockSettings.copy(LIGHT_BLUE_CONCRETE)));
    public static final Block CARVED_PURPLE_CONCRETE = register("carved_purple_concrete", new Block(FabricBlockSettings.copy(PURPLE_CONCRETE)));
    public static final Block CARVED_MAGENTA_CONCRETE = register("carved_magenta_concrete", new Block(FabricBlockSettings.copy(MAGENTA_CONCRETE)));
    public static final Block CARVED_PINK_CONCRETE = register("carved_pink_concrete", new Block(FabricBlockSettings.copy(PINK_CONCRETE)));
    public static final Block CARVED_WHITE_CONCRETE = register("carved_white_concrete", new Block(FabricBlockSettings.copy(WHITE_CONCRETE)));
    public static final Block CARVED_LIGHT_GRAY_CONCRETE = register("carved_light_gray_concrete", new Block(FabricBlockSettings.copy(LIGHT_GRAY_CONCRETE)));
    public static final Block CARVED_GRAY_CONCRETE = register("carved_gray_concrete", new Block(FabricBlockSettings.copy(GRAY_CONCRETE)));
    public static final Block CARVED_BLACK_CONCRETE = register("carved_black_concrete", new Block(FabricBlockSettings.copy(BLACK_CONCRETE)));
    public static final Block CARVED_BROWN_CONCRETE = register("carved_brown_concrete", new Block(FabricBlockSettings.copy(BROWN_CONCRETE)));
    //mossy carved
    //cracked carved

//Any sane shit ends here.  Hello to any folks crazy enough to be here, and enjoy your stay in last-minute-addition hell
// Who wrote this, who wrote this, who? Cause its true, but it certainly wasn't me.
    // Ice
    public static final Block RED_ICE = register("red_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.RED).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block ORANGE_ICE = register("orange_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.ORANGE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block YELLOW_ICE = register("yellow_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.YELLOW).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIME_ICE = register("lime_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.LIME).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block GREEN_ICE = register("green_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.GREEN).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block CYAN_ICE = register("cyan_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.CYAN).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_BLUE_ICE = register("light_blue_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.LIGHT_BLUE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block PURPLE_ICE = register("purple_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.PURPLE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block MAGENTA_ICE = register("magenta_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.MAGENTA).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block PINK_ICE = register("pink_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.PINK).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block WHITE_ICE = register("white_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.WHITE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_GRAY_ICE = register("light_gray_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.LIGHT_GRAY).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block GRAY_ICE = register("gray_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.GRAY).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block BLACK_ICE = register("black_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.BLACK).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block BROWN_ICE = register("brown_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    //Haha brr go brrr
    public static final Block SOUL_ICE = register("soul_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MapColor.LIGHT_BLUE).strength(3.0F).slipperiness(1.1f).sounds(BlockSoundGroup.GLASS)));

    // Ice Slab
    public static final Block RED_ICE_SLAB = register("red_ice_slab", new SlabBlock(FabricBlockSettings.copy(RED_ICE)));
    public static final Block ORANGE_ICE_SLAB = register("orange_ice_slab", new SlabBlock(FabricBlockSettings.copy(ORANGE_ICE)));
    public static final Block YELLOW_ICE_SLAB = register("yellow_ice_slab", new SlabBlock(FabricBlockSettings.copy(YELLOW_ICE)));
    public static final Block LIME_ICE_SLAB = register("lime_ice_slab", new SlabBlock(FabricBlockSettings.copy(LIME_ICE)));
    public static final Block GREEN_ICE_SLAB = register("green_ice_slab", new SlabBlock(FabricBlockSettings.copy(GREEN_ICE)));
    public static final Block BLUE_ICE_SLAB = register("blue_ice_slab", new SlabBlock(FabricBlockSettings.copy(BLUE_ICE)));
    public static final Block CYAN_ICE_SLAB = register("cyan_ice_slab", new SlabBlock(FabricBlockSettings.copy(CYAN_ICE)));
    public static final Block LIGHT_BLUE_ICE_SLAB = register("light_blue_ice_slab", new SlabBlock(FabricBlockSettings.copy(LIGHT_BLUE_ICE)));
    public static final Block PURPLE_ICE_SLAB = register("purple_ice_slab", new SlabBlock(FabricBlockSettings.copy(PURPLE_ICE)));
    public static final Block MAGENTA_ICE_SLAB = register("magenta_ice_slab", new SlabBlock(FabricBlockSettings.copy(MAGENTA_ICE)));
    public static final Block PINK_ICE_SLAB = register("pink_ice_slab", new SlabBlock(FabricBlockSettings.copy(PINK_ICE)));
    public static final Block WHITE_ICE_SLAB = register("white_ice_slab", new SlabBlock(FabricBlockSettings.copy(WHITE_ICE)));
    public static final Block LIGHT_GRAY_ICE_SLAB = register("light_gray_ice_slab", new SlabBlock(FabricBlockSettings.copy(LIGHT_GRAY_ICE)));
    public static final Block GRAY_ICE_SLAB = register("gray_ice_slab", new SlabBlock(FabricBlockSettings.copy(GRAY_ICE)));
    public static final Block BLACK_ICE_SLAB = register("black_ice_slab", new SlabBlock(FabricBlockSettings.copy(BLACK_ICE)));
    public static final Block BROWN_ICE_SLAB = register("brown_ice_slab", new SlabBlock(FabricBlockSettings.copy(BROWN_ICE)));
    public static final Block SOUL_ICE_SLAB = register("soul_ice_slab", new SlabBlock(FabricBlockSettings.copy(SOUL_ICE)));

    // Ice Stairs
    public static final Block RED_ICE_STAIRS = register("red_ice_stairs", new BaseConsistencyStairBlock(RED_ICE.getDefaultState(), FabricBlockSettings.copy(RED_ICE)));
    public static final Block ORANGE_ICE_STAIRS = register("orange_ice_stairs", new BaseConsistencyStairBlock(ORANGE_ICE.getDefaultState(), FabricBlockSettings.copy(ORANGE_ICE)));
    public static final Block YELLOW_ICE_STAIRS = register("yellow_ice_stairs", new BaseConsistencyStairBlock(YELLOW_ICE.getDefaultState(), FabricBlockSettings.copy(YELLOW_ICE)));
    public static final Block LIME_ICE_STAIRS = register("lime_ice_stairs", new BaseConsistencyStairBlock(LIME_ICE.getDefaultState(), FabricBlockSettings.copy(LIME_ICE)));
    public static final Block GREEN_ICE_STAIRS = register("green_ice_stairs", new BaseConsistencyStairBlock(GREEN_ICE.getDefaultState(), FabricBlockSettings.copy(GREEN_ICE)));
    public static final Block BLUE_ICE_STAIRS = register("blue_ice_stairs", new BaseConsistencyStairBlock(BLUE_ICE.getDefaultState(), FabricBlockSettings.copy(BLUE_ICE)));
    public static final Block CYAN_ICE_STAIRS = register("cyan_ice_stairs", new BaseConsistencyStairBlock(CYAN_ICE.getDefaultState(), FabricBlockSettings.copy(CYAN_ICE)));
    public static final Block LIGHT_BLUE_ICE_STAIRS = register("light_blue_ice_stairs", new BaseConsistencyStairBlock(LIGHT_BLUE_ICE.getDefaultState(), FabricBlockSettings.copy(LIGHT_BLUE_ICE)));
    public static final Block PURPLE_ICE_STAIRS = register("purple_ice_stairs", new BaseConsistencyStairBlock(PURPLE_ICE.getDefaultState(), FabricBlockSettings.copy(PURPLE_ICE)));
    public static final Block MAGENTA_ICE_STAIRS = register("magenta_ice_stairs", new BaseConsistencyStairBlock(MAGENTA_ICE.getDefaultState(), FabricBlockSettings.copy(MAGENTA_ICE)));
    public static final Block PINK_ICE_STAIRS = register("pink_ice_stairs", new BaseConsistencyStairBlock(PINK_ICE.getDefaultState(), FabricBlockSettings.copy(PINK_ICE)));
    public static final Block WHITE_ICE_STAIRS = register("white_ice_stairs", new BaseConsistencyStairBlock(WHITE_ICE.getDefaultState(), FabricBlockSettings.copy(WHITE_ICE)));
    public static final Block LIGHT_GRAY_ICE_STAIRS = register("light_gray_ice_stairs", new BaseConsistencyStairBlock(LIGHT_GRAY_ICE.getDefaultState(), FabricBlockSettings.copy(LIGHT_GRAY_ICE)));
    public static final Block GRAY_ICE_STAIRS = register("gray_ice_stairs", new BaseConsistencyStairBlock(GRAY_ICE.getDefaultState(), FabricBlockSettings.copy(GRAY_ICE)));
    public static final Block BLACK_ICE_STAIRS = register("black_ice_stairs", new BaseConsistencyStairBlock(BLACK_ICE.getDefaultState(), FabricBlockSettings.copy(BLACK_ICE)));
    public static final Block BROWN_ICE_STAIRS = register("brown_ice_stairs", new BaseConsistencyStairBlock(BROWN_ICE.getDefaultState(), FabricBlockSettings.copy(BROWN_ICE)));
    public static final Block SOUL_ICE_STAIRS = register("soul_ice_stairs", new BaseConsistencyStairBlock(SOUL_ICE.getDefaultState(), FabricBlockSettings.copy(SOUL_ICE)));

    // Ice Wall
    public static final Block RED_ICE_WALL = register("red_ice_wall", new WallBlock(FabricBlockSettings.copy(RED_ICE)));
    public static final Block ORANGE_ICE_WALL = register("orange_ice_wall", new WallBlock(FabricBlockSettings.copy(ORANGE_ICE)));
    public static final Block YELLOW_ICE_WALL = register("yellow_ice_wall", new WallBlock(FabricBlockSettings.copy(YELLOW_ICE)));
    public static final Block LIME_ICE_WALL = register("lime_ice_wall", new WallBlock(FabricBlockSettings.copy(LIME_ICE)));
    public static final Block GREEN_ICE_WALL = register("green_ice_wall", new WallBlock(FabricBlockSettings.copy(GREEN_ICE)));
    public static final Block BLUE_ICE_WALL = register("blue_ice_wall", new WallBlock(FabricBlockSettings.copy(BLUE_ICE)));
    public static final Block CYAN_ICE_WALL = register("cyan_ice_wall", new WallBlock(FabricBlockSettings.copy(CYAN_ICE)));
    public static final Block LIGHT_BLUE_ICE_WALL = register("light_blue_ice_wall", new WallBlock(FabricBlockSettings.copy(LIGHT_BLUE_ICE)));
    public static final Block PURPLE_ICE_WALL = register("purple_ice_wall", new WallBlock(FabricBlockSettings.copy(PURPLE_ICE)));
    public static final Block MAGENTA_ICE_WALL = register("magenta_ice_wall", new WallBlock(FabricBlockSettings.copy(MAGENTA_ICE)));
    public static final Block PINK_ICE_WALL = register("pink_ice_wall", new WallBlock(FabricBlockSettings.copy(PINK_ICE)));
    public static final Block WHITE_ICE_WALL = register("white_ice_wall", new WallBlock(FabricBlockSettings.copy(WHITE_ICE)));
    public static final Block LIGHT_GRAY_ICE_WALL = register("light_gray_ice_wall", new WallBlock(FabricBlockSettings.copy(LIGHT_GRAY_ICE)));
    public static final Block GRAY_ICE_WALL = register("gray_ice_wall", new WallBlock(FabricBlockSettings.copy(GRAY_ICE)));
    public static final Block BLACK_ICE_WALL = register("black_ice_wall", new WallBlock(FabricBlockSettings.copy(BLACK_ICE)));
    public static final Block BROWN_ICE_WALL = register("brown_ice_wall", new WallBlock(FabricBlockSettings.copy(BROWN_ICE)));
    public static final Block SOUL_ICE_WALL = register("soul_ice_wall", new WallBlock(FabricBlockSettings.copy(SOUL_ICE)));

    // Ice Gate
    public static final Block RED_ICE_GATE = register("red_ice_gate", new FenceGateBlock(FabricBlockSettings.copy(RED_ICE)));
    public static final Block ORANGE_ICE_GATE = register("orange_ice_gate", new FenceGateBlock(FabricBlockSettings.copy(ORANGE_ICE)));
    public static final Block YELLOW_ICE_GATE = register("yellow_ice_gate", new FenceGateBlock(FabricBlockSettings.copy(YELLOW_ICE)));
    public static final Block LIME_ICE_GATE = register("lime_ice_gate", new FenceGateBlock(FabricBlockSettings.copy(LIME_ICE)));
    public static final Block GREEN_ICE_GATE = register("green_ice_gate", new FenceGateBlock(FabricBlockSettings.copy(GREEN_ICE)));
    public static final Block BLUE_ICE_GATE = register("blue_ice_gate", new FenceGateBlock(FabricBlockSettings.copy(BLUE_ICE)));
    public static final Block CYAN_ICE_GATE = register("cyan_ice_gate", new FenceGateBlock(FabricBlockSettings.copy(CYAN_ICE)));
    public static final Block LIGHT_BLUE_ICE_GATE = register("light_blue_ice_gate", new FenceGateBlock(FabricBlockSettings.copy(LIGHT_BLUE_ICE)));
    public static final Block PURPLE_ICE_GATE = register("purple_ice_gate", new FenceGateBlock(FabricBlockSettings.copy(PURPLE_ICE)));
    public static final Block MAGENTA_ICE_GATE = register("magenta_ice_gate", new FenceGateBlock(FabricBlockSettings.copy(MAGENTA_ICE)));
    public static final Block PINK_ICE_GATE = register("pink_ice_gate", new FenceGateBlock(FabricBlockSettings.copy(PINK_ICE)));
    public static final Block WHITE_ICE_GATE = register("white_ice_gate", new FenceGateBlock(FabricBlockSettings.copy(WHITE_ICE)));
    public static final Block LIGHT_GRAY_ICE_GATE = register("light_gray_ice_gate", new FenceGateBlock(FabricBlockSettings.copy(LIGHT_GRAY_ICE)));
    public static final Block GRAY_ICE_GATE = register("gray_ice_gate", new FenceGateBlock(FabricBlockSettings.copy(GRAY_ICE)));
    public static final Block BLACK_ICE_GATE = register("black_ice_gate", new FenceGateBlock(FabricBlockSettings.copy(BLACK_ICE)));
    public static final Block BROWN_ICE_GATE = register("brown_ice_gate", new FenceGateBlock(FabricBlockSettings.copy(BROWN_ICE)));
    public static final Block SOUL_ICE_GATE = register("soul_ice_gate", new FenceGateBlock(FabricBlockSettings.copy(SOUL_ICE)));


    //Glowstone
    public static final Block RED_GLOWSTONE = register("red_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.RED).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block ORANGE_GLOWSTONE = register("orange_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.YELLOW).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block YELLOW_GLOWSTONE = register("yellow_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.ORANGE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block LIME_GLOWSTONE = register("lime_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.LIME).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block GREEN_GLOWSTONE = register("green_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.GREEN).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block BLUE_GLOWSTONE = register("blue_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.BLUE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block CYAN_GLOWSTONE = register("cyan_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.CYAN).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block LIGHT_BLUE_GLOWSTONE = register("light_blue_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.LIGHT_BLUE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block PURPLE_GLOWSTONE = register("purple_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.PURPLE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block MAGENTA_GLOWSTONE = register("magenta_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.MAGENTA).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block PINK_GLOWSTONE = register("pink_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.PINK).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block WHITE_GLOWSTONE = register("white_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.WHITE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block LIGHT_GRAY_GLOWSTONE = register("light_gray_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.LIGHT_GRAY).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block GRAY_GLOWSTONE = register("gray_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.GRAY).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block BLACK_GLOWSTONE = register("black_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block BROWN_GLOWSTONE = register("brown_glowstone", new Block(FabricBlockSettings.of(Material.GLASS).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block SOUL_GLOWSTONE = register("soul_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MapColor.LIGHT_BLUE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(10)));

    // Glowstone Slab
    public static final Block RED_GLOWSTONE_SLAB = register("red_glowstone_slab", new SlabBlock(FabricBlockSettings.copy(RED_GLOWSTONE)));
    public static final Block ORANGE_GLOWSTONE_SLAB = register("orange_glowstone_slab", new SlabBlock(FabricBlockSettings.copy(ORANGE_GLOWSTONE)));
    public static final Block YELLOW_GLOWSTONE_SLAB = register("yellow_glowstone_slab", new SlabBlock(FabricBlockSettings.copy(YELLOW_GLOWSTONE)));
    public static final Block LIME_GLOWSTONE_SLAB = register("lime_glowstone_slab", new SlabBlock(FabricBlockSettings.copy(LIME_GLOWSTONE)));
    public static final Block GREEN_GLOWSTONE_SLAB = register("green_glowstone_slab", new SlabBlock(FabricBlockSettings.copy(GREEN_GLOWSTONE)));
    public static final Block BLUE_GLOWSTONE_SLAB = register("blue_glowstone_slab", new SlabBlock(FabricBlockSettings.copy(BLUE_GLOWSTONE)));
    public static final Block CYAN_GLOWSTONE_SLAB = register("cyan_glowstone_slab", new SlabBlock(FabricBlockSettings.copy(CYAN_GLOWSTONE)));
    public static final Block LIGHT_BLUE_GLOWSTONE_SLAB = register("light_blue_glowstone_slab", new SlabBlock(FabricBlockSettings.copy(LIGHT_BLUE_GLOWSTONE)));
    public static final Block PURPLE_GLOWSTONE_SLAB = register("purple_glowstone_slab", new SlabBlock(FabricBlockSettings.copy(PURPLE_GLOWSTONE)));
    public static final Block MAGENTA_GLOWSTONE_SLAB = register("magenta_glowstone_slab", new SlabBlock(FabricBlockSettings.copy(MAGENTA_GLOWSTONE)));
    public static final Block PINK_GLOWSTONE_SLAB = register("pink_glowstone_slab", new SlabBlock(FabricBlockSettings.copy(PINK_GLOWSTONE)));
    public static final Block WHITE_GLOWSTONE_SLAB = register("white_glowstone_slab", new SlabBlock(FabricBlockSettings.copy(WHITE_GLOWSTONE)));
    public static final Block LIGHT_GRAY_GLOWSTONE_SLAB = register("light_gray_glowstone_slab", new SlabBlock(FabricBlockSettings.copy(LIGHT_GRAY_GLOWSTONE)));
    public static final Block GRAY_GLOWSTONE_SLAB = register("gray_glowstone_slab", new SlabBlock(FabricBlockSettings.copy(GRAY_GLOWSTONE)));
    public static final Block BLACK_GLOWSTONE_SLAB = register("black_glowstone_slab", new SlabBlock(FabricBlockSettings.copy(BLACK_GLOWSTONE)));
    public static final Block BROWN_GLOWSTONE_SLAB = register("brown_glowstone_slab", new SlabBlock(FabricBlockSettings.copy(BROWN_GLOWSTONE)));
    public static final Block SOUL_GLOWSTONE_SLAB = register("soul_glowstone_slab", new SlabBlock(FabricBlockSettings.copy(SOUL_GLOWSTONE)));
    public static final Block GLOWSTONE_SLAB = register("glowstone_slab", new SlabBlock(FabricBlockSettings.copy(GLOWSTONE)));

    // Glowstone Stairs
    public static final Block RED_GLOWSTONE_STAIRS = register("red_glowstone_stairs", new BaseConsistencyStairBlock(RED_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(RED_GLOWSTONE)));
    public static final Block ORANGE_GLOWSTONE_STAIRS = register("orange_glowstone_stairs", new BaseConsistencyStairBlock(ORANGE_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(ORANGE_GLOWSTONE)));
    public static final Block YELLOW_GLOWSTONE_STAIRS = register("yellow_glowstone_stairs", new BaseConsistencyStairBlock(YELLOW_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(YELLOW_GLOWSTONE)));
    public static final Block LIME_GLOWSTONE_STAIRS = register("lime_glowstone_stairs", new BaseConsistencyStairBlock(LIME_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(LIME_GLOWSTONE)));
    public static final Block GREEN_GLOWSTONE_STAIRS = register("green_glowstone_stairs", new BaseConsistencyStairBlock(GREEN_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(GREEN_GLOWSTONE)));
    public static final Block BLUE_GLOWSTONE_STAIRS = register("blue_glowstone_stairs", new BaseConsistencyStairBlock(BLUE_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(BLUE_GLOWSTONE)));
    public static final Block CYAN_GLOWSTONE_STAIRS = register("cyan_glowstone_stairs", new BaseConsistencyStairBlock(CYAN_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(CYAN_GLOWSTONE)));
    public static final Block LIGHT_BLUE_GLOWSTONE_STAIRS = register("light_blue_glowstone_stairs", new BaseConsistencyStairBlock(LIGHT_BLUE_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(LIGHT_BLUE_GLOWSTONE)));
    public static final Block PURPLE_GLOWSTONE_STAIRS = register("purple_glowstone_stairs", new BaseConsistencyStairBlock(PURPLE_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(PURPLE_GLOWSTONE)));
    public static final Block MAGENTA_GLOWSTONE_STAIRS = register("magenta_glowstone_stairs", new BaseConsistencyStairBlock(MAGENTA_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(MAGENTA_GLOWSTONE)));
    public static final Block PINK_GLOWSTONE_STAIRS = register("pink_glowstone_stairs", new BaseConsistencyStairBlock(PINK_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(PINK_GLOWSTONE)));
    public static final Block WHITE_GLOWSTONE_STAIRS = register("white_glowstone_stairs", new BaseConsistencyStairBlock(WHITE_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(WHITE_GLOWSTONE)));
    public static final Block LIGHT_GRAY_GLOWSTONE_STAIRS = register("light_gray_glowstone_stairs", new BaseConsistencyStairBlock(LIGHT_GRAY_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(LIGHT_GRAY_GLOWSTONE)));
    public static final Block GRAY_GLOWSTONE_STAIRS = register("gray_glowstone_stairs", new BaseConsistencyStairBlock(GRAY_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(GRAY_GLOWSTONE)));
    public static final Block BLACK_GLOWSTONE_STAIRS = register("black_glowstone_stairs", new BaseConsistencyStairBlock(BLACK_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(BLACK_GLOWSTONE)));
    public static final Block BROWN_GLOWSTONE_STAIRS = register("brown_glowstone_stairs", new BaseConsistencyStairBlock(BROWN_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(BROWN_GLOWSTONE)));
    public static final Block SOUL_GLOWSTONE_STAIRS = register("soul_glowstone_stairs", new BaseConsistencyStairBlock(SOUL_GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(SOUL_GLOWSTONE)));
    public static final Block GLOWSTONE_STAIRS = register("glowstone_stairs", new BaseConsistencyStairBlock(GLOWSTONE.getDefaultState(), FabricBlockSettings.copy(GLOWSTONE)));

    // Glowstone Wall
    public static final Block RED_GLOWSTONE_WALL = register("red_glowstone_wall", new WallBlock(FabricBlockSettings.copy(RED_GLOWSTONE)));
    public static final Block ORANGE_GLOWSTONE_WALL = register("orange_glowstone_wall", new WallBlock(FabricBlockSettings.copy(ORANGE_GLOWSTONE)));
    public static final Block YELLOW_GLOWSTONE_WALL = register("yellow_glowstone_wall", new WallBlock(FabricBlockSettings.copy(YELLOW_GLOWSTONE)));
    public static final Block LIME_GLOWSTONE_WALL = register("lime_glowstone_wall", new WallBlock(FabricBlockSettings.copy(LIME_GLOWSTONE)));
    public static final Block GREEN_GLOWSTONE_WALL = register("green_glowstone_wall", new WallBlock(FabricBlockSettings.copy(GREEN_GLOWSTONE)));
    public static final Block BLUE_GLOWSTONE_WALL = register("blue_glowstone_wall", new WallBlock(FabricBlockSettings.copy(BLUE_GLOWSTONE)));
    public static final Block CYAN_GLOWSTONE_WALL = register("cyan_glowstone_wall", new WallBlock(FabricBlockSettings.copy(CYAN_GLOWSTONE)));
    public static final Block LIGHT_BLUE_GLOWSTONE_WALL = register("light_blue_glowstone_wall", new WallBlock(FabricBlockSettings.copy(LIGHT_BLUE_GLOWSTONE)));
    public static final Block PURPLE_GLOWSTONE_WALL = register("purple_glowstone_wall", new WallBlock(FabricBlockSettings.copy(PURPLE_GLOWSTONE)));
    public static final Block MAGENTA_GLOWSTONE_WALL = register("magenta_glowstone_wall", new WallBlock(FabricBlockSettings.copy(MAGENTA_GLOWSTONE)));
    public static final Block PINK_GLOWSTONE_WALL = register("pink_glowstone_wall", new WallBlock(FabricBlockSettings.copy(PINK_GLOWSTONE)));
    public static final Block WHITE_GLOWSTONE_WALL = register("white_glowstone_wall", new WallBlock(FabricBlockSettings.copy(WHITE_GLOWSTONE)));
    public static final Block LIGHT_GRAY_GLOWSTONE_WALL = register("light_gray_glowstone_wall", new WallBlock(FabricBlockSettings.copy(LIGHT_GRAY_GLOWSTONE)));
    public static final Block GRAY_GLOWSTONE_WALL = register("gray_glowstone_wall", new WallBlock(FabricBlockSettings.copy(GRAY_GLOWSTONE)));
    public static final Block BLACK_GLOWSTONE_WALL = register("black_glowstone_wall", new WallBlock(FabricBlockSettings.copy(BLACK_GLOWSTONE)));
    public static final Block BROWN_GLOWSTONE_WALL = register("brown_glowstone_wall", new WallBlock(FabricBlockSettings.copy(BROWN_GLOWSTONE)));
    public static final Block SOUL_GLOWSTONE_WALL = register("soul_glowstone_wall", new WallBlock(FabricBlockSettings.copy(SOUL_GLOWSTONE)));
    public static final Block GLOWSTONE_WALL = register("glowstone_wall", new WallBlock(FabricBlockSettings.copy(GLOWSTONE)));

    // Glowstone Gate
    public static final Block RED_GLOWSTONE_GATE = register("red_glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(RED_GLOWSTONE)));
    public static final Block ORANGE_GLOWSTONE_GATE = register("orange_glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(ORANGE_GLOWSTONE)));
    public static final Block YELLOW_GLOWSTONE_GATE = register("yellow_glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(YELLOW_GLOWSTONE)));
    public static final Block LIME_GLOWSTONE_GATE = register("lime_glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(LIME_GLOWSTONE)));
    public static final Block GREEN_GLOWSTONE_GATE = register("green_glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(GREEN_GLOWSTONE)));
    public static final Block BLUE_GLOWSTONE_GATE = register("blue_glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(BLUE_GLOWSTONE)));
    public static final Block CYAN_GLOWSTONE_GATE = register("cyan_glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(CYAN_GLOWSTONE)));
    public static final Block LIGHT_BLUE_GLOWSTONE_GATE = register("light_blue_glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(LIGHT_BLUE_GLOWSTONE)));
    public static final Block PURPLE_GLOWSTONE_GATE = register("purple_glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(PURPLE_GLOWSTONE)));
    public static final Block MAGENTA_GLOWSTONE_GATE = register("magenta_glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(MAGENTA_GLOWSTONE)));
    public static final Block PINK_GLOWSTONE_GATE = register("pink_glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(PINK_GLOWSTONE)));
    public static final Block WHITE_GLOWSTONE_GATE = register("white_glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(WHITE_GLOWSTONE)));
    public static final Block LIGHT_GRAY_GLOWSTONE_GATE = register("light_gray_glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(LIGHT_GRAY_GLOWSTONE)));
    public static final Block GRAY_GLOWSTONE_GATE = register("gray_glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(GRAY_GLOWSTONE)));
    public static final Block BLACK_GLOWSTONE_GATE = register("black_glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(BLACK_GLOWSTONE)));
    public static final Block BROWN_GLOWSTONE_GATE = register("brown_glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(BROWN_GLOWSTONE)));
    public static final Block SOUL_GLOWSTONE_GATE = register("soul_glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(SOUL_GLOWSTONE)));
    public static final Block GLOWSTONE_GATE = register("glowstone_gate", new FenceGateBlock(FabricBlockSettings.copy(GLOWSTONE)));

    //Glass stairs/slabs/walls/gates will be here eventually.  Until then, here's a random face from the win + . menu
    // (¬‿¬)

    //Unlike Regular Glass, stained tinted glass actually gets a spot with placeholders.
    //red
    //orange
    //yellow
    //lime
    //green
    //blue
    //cyan
    //light blue
    //purple
    //magenta
    //pink
    //white
    //light gray
    //gray
    //black
    //brown

    // Dirt
    public static final Block DIRT_SLAB = register("dirt_slab", new DirtSlabBlock(FabricBlockSettings.copy(DIRT)));
    public static final Block DIRT_STAIRS = register("dirt_stairs", new DirtStairsBlock(DIRT.getDefaultState(), FabricBlockSettings.copy(DIRT)));
    public static final Block DIRT_WALL = register("dirt_wall", new DirtWallBlock(FabricBlockSettings.copy(DIRT)));

    // Grass
    public static final Block GRASS_SLAB = register("grass_slab", new GrassSlabBlock(FabricBlockSettings.copy(GRASS_BLOCK)));
    public static final Block GRASS_STAIRS = register("grass_stairs", new GrassStairsBlock(GRASS_BLOCK.getDefaultState(), FabricBlockSettings.copy(GRASS_BLOCK)));
    public static final Block GRASS_WALL = register("grass_wall", new GrassWallBlock(FabricBlockSettings.copy(GRASS_BLOCK)));

    // Mycelium
    public static final Block MYCELIUM_SLAB = register("mycelium_slab", new MyceliumSlabBlock(FabricBlockSettings.copy(MYCELIUM)));
    public static final Block MYCELIUM_STAIRS = register("mycelium_stairs", new MyceliumStairsBlock(MYCELIUM.getDefaultState(), FabricBlockSettings.copy(MYCELIUM)));
    public static final Block MYCELIUM_WALL = register("mycelium_wall", new MyceliumWallBlock(FabricBlockSettings.copy(MYCELIUM)));

    // Miscellaneous
    public static final Block JACK_O_SOUL = register("jack_o_soul", new BaseConsistencyCarvedPumpkinBlock(FabricBlockSettings.of(Material.GOURD, MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD).luminance(10)));
    public static final Block WARPED_WART = register("warped_wart", new WarpedNetherWartPlantBlock(FabricBlockSettings.of(Material.PLANT, MapColor.BLUE).noCollision().ticksRandomly().sounds(BlockSoundGroup.NETHER_WART).nonOpaque()));
    public static final Block NETHERITE_STAIRS = register("netherite_stairs", new BaseConsistencyStairBlock(NETHERITE_BLOCK.getDefaultState(), FabricBlockSettings.copy(NETHERITE_BLOCK)));
    public static final Block SUSPICIOUS_SLAB = register("suspicious_slab", new SlabBlock(FabricBlockSettings.copy(CLAY)));
//  public static final Block SIUOLS_SANITY = register("is_a_crab", new Block(FabricBlockSettings.copy(HELP_ME)));
    //  You are having funny fun because your playing a Siuolplexplex contributed mod

    private static Block register(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier("consistency_plus", name), block);
    }

    public static void init() {
    }
}

package io.github.consistencyplus.consistency_plus.registry;

import io.github.consistencyplus.consistency_plus.base.BaseConsistencyCarvedPumpkinBlock;
import io.github.consistencyplus.consistency_plus.base.BaseConsistencyStairBlock;
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

public class Blocks {

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

    //Block
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


    //Bricks
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
    public static final Block SMOOTH_DIORITE_STAIRS = register("smooth_diorite_stairs", new BaseConsistencyStairBlock(DIORITE.getDefaultState(), FabricBlockSettings.copy(GRANITE)));
    public static final Block SMOOTH_DIORITE_WALL = register("smooth_diorite_wall", new WallBlock(FabricBlockSettings.copy(DIORITE)));
    public static final Block SMOOTH_DIORITE_GATE = register("smooth_diorite_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_STONE)));

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
    public static final Block CLAY_SLAB = register("clay_slab", new SlabBlock(FabricBlockSettings.copy(CLAY)));
    public static final Block CLAY_STAIRS = register("clay_stairs", new BaseConsistencyStairBlock(CLAY.getDefaultState(), FabricBlockSettings.copy(CLAY)));
    public static final Block CLAY_WALL = register("clay_wall", new WallBlock(FabricBlockSettings.copy(CLAY)));

    public static final Block POLISHED_CLAY = register("polished_clay", new Block(FabricBlockSettings.copy(CLAY)));
    public static final Block POLISHED_CLAY_SLAB = register("polished_clay_slab", new SlabBlock(FabricBlockSettings.copy(CLAY)));
    public static final Block POLISHED_CLAY_STAIRS = register("polished_clay_stairs", new BaseConsistencyStairBlock(CLAY.getDefaultState(), FabricBlockSettings.copy(CLAY)));
    public static final Block POLISHED_CLAY_WALL = register("polished_clay_wall", new WallBlock(FabricBlockSettings.copy(CLAY)));

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

    public static final Block CUT_CLAY = register("cut_clay", new Block(FabricBlockSettings.copy(CLAY)));
    public static final Block CUT_CLAY_SLAB = register("cut_clay_slab", new SlabBlock(FabricBlockSettings.copy(CLAY)));
    public static final Block CUT_CLAY_STAIRS = register("cut_clay_stairs", new BaseConsistencyStairBlock(CLAY.getDefaultState(), FabricBlockSettings.copy(CLAY)));
    public static final Block CUT_CLAY_WALL = register("cut_clay_wall", new WallBlock(FabricBlockSettings.copy(CLAY)));

    public static final Block SMOOTH_CLAY = register("smooth_clay", new Block(FabricBlockSettings.copy(CLAY)));
    public static final Block SMOOTH_CLAY_SLAB = register("smooth_clay_slab", new SlabBlock(FabricBlockSettings.copy(CLAY)));
    public static final Block SMOOTH_CLAY_STAIRS = register("smooth_clay_stairs", new BaseConsistencyStairBlock(CLAY.getDefaultState(), FabricBlockSettings.copy(CLAY)));
    public static final Block SMOOTH_CLAY_WALL = register("smooth_clay_wall", new WallBlock(FabricBlockSettings.copy(CLAY)));

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

    //Block
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
    //Block
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

    // Block
    public static final Block SOUL_SANDSTONE = register("soul_sandstone", new Block(FabricBlockSettings.of(Material.STONE, MaterialColor.BROWN).strength(0.8F)));
    public static final Block SOUL_SANDSTONE_SLAB = register("soul_sandstone_slab", new SlabBlock(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block SOUL_SANDSTONE_STAIRS = register("soul_sandstone_stairs", new BaseConsistencyStairBlock(SOUL_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block SOUL_SANDSTONE_WALL = register("soul_sandstone_wall", new WallBlock(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block SOUL_SANDSTONE_GATE = register("soul_sandstone_gate", new FenceGateBlock(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block SOUL_SANDSTONE_PILLAR = register("soul_sandstone_pillar", new PillarBlock(FabricBlockSettings.copy(SOUL_SANDSTONE)));

    // Smooth
    public static final Block SMOOTH_SOUL_SANDSTONE = register("smooth_soul_sandstone", new Block(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block SMOOTH_SOUL_SANDSTONE_SLAB = register("smooth_soul_sandstone_slab", new SlabBlock(FabricBlockSettings.copy(SMOOTH_SOUL_SANDSTONE)));
    public static final Block SMOOTH_SOUL_SANDSTONE_STAIRS = register("smooth_soul_sandstone_stairs", new BaseConsistencyStairBlock(SMOOTH_SOUL_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(SMOOTH_SOUL_SANDSTONE)));
    public static final Block SMOOTH_SOUL_SANDSTONE_WALL = register("smooth_soul_sandstone_wall", new WallBlock(FabricBlockSettings.copy(SMOOTH_SOUL_SANDSTONE)));
    public static final Block SMOOTH_SOUL_SANDSTONE_GATE = register("smooth_soul_sandstone_gate", new FenceGateBlock(FabricBlockSettings.copy(SMOOTH_SOUL_SANDSTONE)));

    // Polished
    public static final Block POLISHED_SOUL_SANDSTONE = register("polished_soul_sandstone", new Block(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block POLISHED_SOUL_SANDSTONE_SLAB = register("polished_soul_sandstone_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_SOUL_SANDSTONE)));
    public static final Block POLISHED_SOUL_SANDSTONE_STAIRS = register("polished_soul_sandstone_stairs", new BaseConsistencyStairBlock(POLISHED_SOUL_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(POLISHED_SOUL_SANDSTONE)));
    public static final Block POLISHED_SOUL_SANDSTONE_WALL = register("polished_soul_sandstone_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_SOUL_SANDSTONE)));
    public static final Block POLISHED_SOUL_SANDSTONE_GATE = register("polished_soul_sandstone_gate", new FenceGateBlock(FabricBlockSettings.copy(POLISHED_SOUL_SANDSTONE)));

    // Bricks
    public static final Block SOUL_SANDSTONE_BRICKS = register("soul_sandstone_bricks", new Block(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block SOUL_SANDSTONE_BRICK_SLAB = register("soul_sandstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(SOUL_SANDSTONE_BRICKS)));
    public static final Block SOUL_SANDSTONE_BRICK_STAIRS = register("soul_sandstone_brick_stairs", new BaseConsistencyStairBlock(SOUL_SANDSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(SOUL_SANDSTONE_BRICKS)));
    public static final Block SOUL_SANDSTONE_BRICK_WALL = register("soul_sandstone_brick_wall", new WallBlock(FabricBlockSettings.copy(SOUL_SANDSTONE_BRICKS)));
    public static final Block SOUL_SANDSTONE_BRICK_GATE = register("soul_sandstone_brick_gate", new FenceGateBlock(FabricBlockSettings.copy(SOUL_SANDSTONE_BRICKS)));

    // Cut
    public static final Block CUT_SOUL_SANDSTONE = register("cut_soul_sandstone", new Block(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block CUT_SOUL_SANDSTONE_SLAB = register("cut_soul_sandstone_slab", new SlabBlock(FabricBlockSettings.copy(CUT_SOUL_SANDSTONE)));
    public static final Block CUT_SOUL_SANDSTONE_STAIRS = register("cut_soul_sandstone_stairs", new BaseConsistencyStairBlock(CUT_SOUL_SANDSTONE.getDefaultState(), FabricBlockSettings.copy(CUT_SOUL_SANDSTONE)));
    public static final Block CUT_SOUL_SANDSTONE_WALL = register("cut_soul_sandstone_wall", new WallBlock(FabricBlockSettings.copy(CUT_SOUL_SANDSTONE)));
    public static final Block CUT_SOUL_SANDSTONE_GATE = register("cut_soul_sandstone_gate", new FenceGateBlock(FabricBlockSettings.copy(CUT_SOUL_SANDSTONE)));

    public static final Block CARVED_SOUL_SANDSTONE = register("carved_soul_sandstone", new Block(FabricBlockSettings.copy(SOUL_SANDSTONE)));
    public static final Block CHISELED_SOUL_SANDSTONE = register("chiseled_soul_sandstone", new Block(FabricBlockSettings.copy(SOUL_SANDSTONE)));


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
    public static final Block RED_TERRACOTTA_STAIRS = register("red_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA)));
    public static final Block ORANGE_TERRACOTTA_STAIRS = register("orange_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA)));
    public static final Block YELLOW_TERRACOTTA_STAIRS = register("yellow_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA)));
    public static final Block LIME_TERRACOTTA_STAIRS = register("lime_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA)));
    public static final Block GREEN_TERRACOTTA_STAIRS = register("green_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA)));
    public static final Block BLUE_TERRACOTTA_STAIRS = register("blue_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA)));
    public static final Block CYAN_TERRACOTTA_STAIRS = register("cyan_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA)));
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = register("light_blue_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA)));
    public static final Block PURPLE_TERRACOTTA_STAIRS = register("purple_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA)));
    public static final Block MAGENTA_TERRACOTTA_STAIRS = register("magenta_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA)));
    public static final Block PINK_TERRACOTTA_STAIRS = register("pink_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA)));
    public static final Block WHITE_TERRACOTTA_STAIRS = register("white_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA)));
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = register("light_gray_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA)));
    public static final Block GRAY_TERRACOTTA_STAIRS = register("gray_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA)));
    public static final Block BLACK_TERRACOTTA_STAIRS = register("black_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA)));
    public static final Block BROWN_TERRACOTTA_STAIRS = register("brown_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(), FabricBlockSettings.copy(TERRACOTTA)));
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

    // Terracotta

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

// Concrete

    // Concrete Slab
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

    // Concrete Wall
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

    // Concrete Gate
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


    // Ice
    public static final Block RED_ICE = register("red_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.RED).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block ORANGE_ICE = register("orange_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.ORANGE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block YELLOW_ICE = register("yellow_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.YELLOW).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIME_ICE = register("lime_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.LIME).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block GREEN_ICE = register("green_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.GREEN).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block CYAN_ICE = register("cyan_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.CYAN).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_BLUE_ICE = register("light_blue_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.LIGHT_BLUE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block PURPLE_ICE = register("purple_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.PURPLE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block MAGENTA_ICE = register("magenta_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.MAGENTA).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block PINK_ICE = register("pink_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.PINK).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block WHITE_ICE = register("white_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.WHITE).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block LIGHT_GRAY_ICE = register("light_gray_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.LIGHT_GRAY).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block GRAY_ICE = register("gray_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.GRAY).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block BLACK_ICE = register("black_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.BLACK).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block BROWN_ICE = register("brown_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.BROWN).strength(2.0F).slipperiness(0.980f).sounds(BlockSoundGroup.GLASS)));
    public static final Block SOUL_ICE = register("soul_ice", new Block(FabricBlockSettings.of(Material.DENSE_ICE, MaterialColor.LIGHT_BLUE).strength(3.0F).slipperiness(1.1f).sounds(BlockSoundGroup.GLASS)));

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
    public static final Block RED_GLOWSTONE = register("red_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.RED).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block ORANGE_GLOWSTONE = register("orange_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.YELLOW).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block YELLOW_GLOWSTONE = register("yellow_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.ORANGE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block LIME_GLOWSTONE = register("lime_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.LIME).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block GREEN_GLOWSTONE = register("green_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.GREEN).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block BLUE_GLOWSTONE = register("blue_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.BLUE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block CYAN_GLOWSTONE = register("cyan_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.CYAN).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block LIGHT_BLUE_GLOWSTONE = register("light_blue_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.LIGHT_BLUE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block PURPLE_GLOWSTONE = register("purple_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.PURPLE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block MAGENTA_GLOWSTONE = register("magenta_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.MAGENTA).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block PINK_GLOWSTONE = register("pink_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.PINK).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block WHITE_GLOWSTONE = register("white_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.WHITE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block LIGHT_GRAY_GLOWSTONE = register("light_gray_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.LIGHT_GRAY).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block GRAY_GLOWSTONE = register("gray_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.GRAY).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block BLACK_GLOWSTONE = register("black_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.BLACK).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block BROWN_GLOWSTONE = register("brown_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.BROWN).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(15)));
    public static final Block SOUL_GLOWSTONE = register("soul_glowstone", new Block(FabricBlockSettings.of(Material.GLASS, MaterialColor.LIGHT_BLUE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance(10)));

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

    //Obsidian
    public static final Block OBSIDIAN_SLAB = register("obsidian_slab", new SlabBlock(FabricBlockSettings.of((new FabricMaterialBuilder(MaterialColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(50.0F, 1200.0F)));
    public static final Block OBSIDIAN_STAIRS = register("obsidian_stairs", new BaseConsistencyStairBlock(OBSIDIAN.getDefaultState(), FabricBlockSettings.of((new FabricMaterialBuilder(MaterialColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(50.0F, 1200.0F)));
    public static final Block OBSIDIAN_WALL = register("obsidian_wall", new WallBlock(FabricBlockSettings.of((new FabricMaterialBuilder(MaterialColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(50.0F, 1200.0F)));
    public static final Block OBSIDIAN_GATE = register("obsidian_gate", new FenceGateBlock(FabricBlockSettings.of((new FabricMaterialBuilder(MaterialColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(50.0F, 1200.0F)));

    public static final Block CRYING_OBSIDIAN_SLAB = register("crying_obsidian_slab", new SlabBlock(FabricBlockSettings.of((new FabricMaterialBuilder(MaterialColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(50.0F, 1200.0F).luminance(10)));
    public static final Block CRYING_OBSIDIAN_STAIRS = register("crying_obsidian_stairs", new BaseConsistencyStairBlock(CRYING_OBSIDIAN.getDefaultState(), FabricBlockSettings.of((new FabricMaterialBuilder(MaterialColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(50.0F, 1200.0F).luminance(10)));
    public static final Block CRYING_OBSIDIAN_WALL = register("crying_obsidian_wall", new WallBlock(FabricBlockSettings.of((new FabricMaterialBuilder(MaterialColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(50.0F, 1200.0F).luminance(10)));
    public static final Block CRYING_OBSIDIAN_GATE = register("crying_obsidian_gate", new FenceGateBlock(FabricBlockSettings.of((new FabricMaterialBuilder(MaterialColor.BLACK)).pistonBehavior(BLOCK).build()).requiresTool().breakByTool(FabricToolTags.PICKAXES, 3).strength(50.0F, 1200.0F).luminance(10)));

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
    public static final Block JACK_O_SOUL = register("jack_o_soul", new BaseConsistencyCarvedPumpkinBlock(FabricBlockSettings.of(Material.GOURD, MaterialColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD).luminance(10)));
    public static final Block WARPED_WART = register("warped_wart", new WarpedNetherWartPlantBlock(FabricBlockSettings.of(Material.PLANT, MaterialColor.BLUE).noCollision().ticksRandomly().sounds(BlockSoundGroup.NETHER_WART).nonOpaque()));
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

package net.consistencyteam.consistency_plus;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.block.enums.StairShape;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static net.minecraft.block.Blocks.*;

public class Blocks {

    /*
    templates
    block:  public static final Block POLISHED_STONE = register("polished_stone", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
    slab:   public static final Block POLISHED_STONE_SLAB  = register("polished_stone_slab", new SlabBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    stairs: public static final Block POLISHED_STONE_STAIRS = register("polished_stone_stairs", new BaseConsistencyStairBlock(STONE_BRICKS.getDefaultState(),FabricBlockSettings.copy(STONE_BRICKS)));
    pillar: public static final Block STONE_BRICK_PILLAR = register("stone_brick_pillar", new PillarBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    wall:   public static final Block STONE_WALL = register("stone_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));
     */

//Stone
    //Smooth
        public static final Block SMOOTH_STONE_STAIRS = register("smooth_stone_stairs", new BaseConsistencyStairBlock(STONE_BRICKS.getDefaultState(),FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block SMOOTH_STONE_WALL = register("smooth_stone_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block STONE_WALL = register("stone_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));

    //Cracked Smooth
        //block
        //slab
        //stairs
        //wall

    //Mossy Smooth
        //block
        //slab
        //stairs
        //wall

    //Polished
        public static final Block POLISHED_STONE = register("polished_stone", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block POLISHED_STONE_SLAB  = register("polished_stone_slab", new SlabBlock(FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block POLISHED_STONE_STAIRS = register("polished_stone_stairs", new BaseConsistencyStairBlock(STONE_BRICKS.getDefaultState(),FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block POLISHED_STONE_WALL = register("polished_stone_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));

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

    //Pillar and Chiseled
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

    //Cut
        public static final Block CUT_STONE = register("cut_stone", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block CUT_STONE_SLAB  = register("cut_stone_slab", new SlabBlock(FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block CUT_STONE_STAIRS = register("cut_stone_stairs", new BaseConsistencyStairBlock(STONE_BRICKS.getDefaultState(),FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block CUT_STONE_WALL = register("cut_stone_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));

    //Cracked Cut
        //block
        //slab
        //stairs
        //wall

    //Mossy Cut
        //block
        //slab
        //stairs
        //wall

    //Cracked
        public static final Block CRACKED_STONE_BRICK_SLAB  = register("cracked_stone_brick_slab", new SlabBlock(FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", new BaseConsistencyStairBlock(STONE_BRICKS.getDefaultState(),FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));


//Blackstone

    //Smooth
        public static final Block SMOOTH_BLACKSTONE = register("smooth_blackstone", new Block(FabricBlockSettings.copy(BLACKSTONE)));
        public static final Block SMOOTH_BLACKSTONE_SLAB = register("smooth_blackstone_slab", new SlabBlock(FabricBlockSettings.copy(BLACKSTONE)));
        public static final Block SMOOTH_BLACKSTONE_STAIRS = register("smooth_blackstone_stairs", new BaseConsistencyStairBlock(BLACKSTONE.getDefaultState(),FabricBlockSettings.copy(BLACKSTONE)));
        public static final Block SMOOTH_BLACKSTONE_WALL = register("smooth_blackstone_wall", new WallBlock(FabricBlockSettings.copy(BLACKSTONE)));

    //Cracked Smooth
        //block
        //slab
        //stairs
        //wall

    //Mossy Smooth
        //block
        //slab
        //stairs
        //wall

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

    //Cut
        public static final Block CUT_BLACKSTONE = register("cut_blackstone", new Block(FabricBlockSettings.copy(BLACKSTONE)));
        public static final Block CUT_BLACKSTONE_SLAB = register("cut_blackstone_slab", new SlabBlock(FabricBlockSettings.copy(BLACKSTONE)));
        public static final Block CUT_BLACKSTONE_STAIRS = register("cut_blackstone_stairs", new BaseConsistencyStairBlock(BLACKSTONE.getDefaultState(),FabricBlockSettings.copy(BLACKSTONE)));
        public static final Block CUT_BLACKSTONE_WALL = register("cut_blackstone_wall", new WallBlock(FabricBlockSettings.copy(BLACKSTONE)));

    //Cracked Cut
        //block
        //slab
        //stairs
        //wall

    //Mossy Cut
        //block
        //slab
        //stairs
        //wall

    //Cracked
        public static final Block CRACKED_BLACKSTONE_BRICK_SLAB  = register("cracked_blackstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));
        public static final Block CRACKED_BLACKSTONE_BRICK_STAIRS = register("cracked_blackstone_brick_stairs", new BaseConsistencyStairBlock(POLISHED_BLACKSTONE_BRICKS.getDefaultState(),FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block CRACKED_BLACKSTONE_BRICK_WALL = register("cracked_blackstone_brick_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));

    //Mossy
        public static final Block MOSSY_BLACKSTONE_BRICKS = register("mossy_blackstone_bricks", new Block(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));
        public static final Block MOSSY_BLACKSTONE_BRICK_SLAB  = register("mossy_blackstone_brick_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));
        public static final Block MOSSY_BLACKSTONE_BRICK_STAIRS = register("mossy_blackstone_brick_stairs", new BaseConsistencyStairBlock(POLISHED_BLACKSTONE_BRICKS.getDefaultState(),FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block MOSSY_BLACKSTONE_BRICK_WALL = register("mossy_blackstone_brick_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_BLACKSTONE_BRICKS)));

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

    //Smooth
        public static final Block SMOOTH_SANDSTONE_WALL = register("smooth_sandstone_wall", new WallBlock(FabricBlockSettings.copy(SANDSTONE)));

    //Cracked Smooth
        //block
        //slab
        //stairs
        //wall

    //Mossy Smooth
        //block
        //slab
        //stairs
        //wall

    //Cut
        //cut_sandstone_stairs
        //cut_sandstone_wall

    //Cracked Cut
        //block
        //slab
        //stairs
        //wall

    //Mossy Cut
        //block
        //slab
        //stairs
        //wall

    //Polished
        //polished_sandstone
        //polished_sandstone_slab
        //polished_sandstone_stairs
        //polished_sandstone_wall

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
        //sandstone_bricks
        //sandstone_brick_slab
        //sandstone_brick_stairs
        //sandstone_brick_wall

    //Cracked Bricks
        //cracked_sandstone_bricks
        //cracked_sandstone_brick_slab
        //cracked_sandstone_brick_stairs
        //cracked_sandstone_brick_pillar

    //Mossy Bricks
        //mossy_sandstone_bricks
        //mossy_sandstone_brick_slab
        //mossy_sandstone_brick_stairs
        //mossy_sandstone_brick_wall

    //Pillars and Chiseled
        //cracked_chiseled_sandstone_bricks
        //mossy_chiseled_sandstone_bricks
        //sandstone_brick_pillar
        //cracked_sandstone_brick_pillar
        //mossy_sandstone_brick_pillar
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        //chiseled
        //cracked carved
        //mossy carved


//Red Sandstone

    //Smooth
        public static final Block SMOOTH_RED_SANDSTONE_WALL = register("smooth_red_sandstone_wall", new WallBlock(FabricBlockSettings.copy(RED_SANDSTONE)));

    //Cracked Smooth
        //block
        //slab
        //stairs
        //wall

    //Mossy Smooth
        //block
        //slab
        //stairs
        //wall

    //Cut
        //cut_red_sandstone_stairs
        //cut_red_sandstone_wall

    //Cracked Cut
        //block
        //slab
        //stairs
        //wall

    //Mossy Cut
        //block
        //slab
        //stairs
        //wall

    //Polished
        //polished_red_sandstone
        //polished_red_sandstone_slab
        //polished_red_sandstone_stairs
        //polished_red_sandstone_wall

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
        //red_sandstone_bricks
        //red_sandstone_brick_slab
        //red_sandstone_brick_stairs
        //red_sandstone_brick_wall

    //Cracked Bricks
        //cracked_red_sandstone_bricks
        //cracked_red_sandstone_brick_slab
        //cracked_red_sandstone_brick_stairs
        //cracked_red_sandstone_brick_pillar

    //Mossy Bricks
        //mossy_red_sandstone_bricks
        //mossy_red_sandstone_brick_slab
        //mossy_red_sandstone_brick_stairs
        //mossy_red_sandstone_brick_wall

    //Pillars and Chiseled
        //cracked_chiseled_red_sandstone_bricks
        //mossy_chiseled_red_sandstone_bricks
        //red_sandstone_brick_pillar
        //cracked_red_sandstone_brick_pillar
        //mossy_red_sandstone_brick_pillar
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        //chiseled
        //cracked carved
        //mossy carved

//Quartz

    //Block
        public static final Block QUARTZ_WALL = register("quartz_wall", new WallBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));


    //Smooth
        public static final Block SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall", new WallBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));

    //Cracked Smooth
        //block
        //slab
        //stairs
        //wall

    //Mossy Smooth
        //block
        //slab
        //stairs
        //wall

    //Cut
        public static final Block CUT_QUARTZ = register("cut_quartz", new Block(FabricBlockSettings.copy(QUARTZ_BLOCK)));
        public static final Block CUT_QUARTZ_SLAB = register("cut_quartz_slab", new SlabBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));
        public static final Block CUT_QUARTZ_STAIRS = register("cut_quartz_stairs", new BaseConsistencyStairBlock(QUARTZ_BLOCK.getDefaultState(),FabricBlockSettings.copy(QUARTZ_BLOCK)));
        public static final Block CUT_QUARTZ_WALL = register("cut_quartz_wall", new WallBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));

    //Cracked Cut
        //block
        //slab
        //stairs
        //wall

    //Mossy Cut
        //block
        //slab
        //stairs
        //wall

    //Polished
        //polished_quartz
        //polished_quartz_slab
        //polished_quartz_stairs
        //polished_quartz_wall

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
        public static final Block QUARTZ_BRICK_SLAB = register("quartz_brick_slab", new SlabBlock(FabricBlockSettings.copy(QUARTZ_BRICKS)));
        public static final Block QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs", new BaseConsistencyStairBlock(QUARTZ_BRICKS.getDefaultState(),FabricBlockSettings.copy(QUARTZ_BRICKS)));
        public static final Block QUARTZ_BRICK_WALL = register("quartz_brick_wall", new WallBlock(FabricBlockSettings.copy(QUARTZ_BRICKS)));

    //Cracked Bricks
        //cracked_quartz_bricks
        //cracked_quartz_brick_slab
        //cracked_quartz_brick_stairs
        //cracked_quartz_brick_wall

    //Mossy Bricks
        //mossy_quartz_bricks
        //mossy_quartz_brick_slab
        //mossy_quartz_brick_stairs
        //mossy_quartz_brick_wall

    //Pillar and Chiseled
        //cracked_chiseled_quartz_bricks
        //mossy_chiseled_quartz_bricks
        //cracked_quartz_pillar
        //mossy_quartz_pillar
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        //carved
        //cracked carved
        //mossy carved


//Andesite

    //Polished
        public static final Block POLISHED_ANDESITE_WALL = register("polished_andesite_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));

    //Smooth
        public static final Block SMOOTH_ANDESITE = register("smooth_andesite", new Block(FabricBlockSettings.copy(POLISHED_ANDESITE)));
        public static final Block SMOOTH_ANDESITE_SLAB = register("smooth_andesite_slab", new SlabBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));
        public static final Block SMOOTH_ANDESITE_STAIRS = register("smooth_andesite_stairs", new BaseConsistencyStairBlock(POLISHED_ANDESITE.getDefaultState(),FabricBlockSettings.copy(POLISHED_ANDESITE)));
        public static final Block SMOOTH_ANDESITE_WALL = register("smooth_andesite_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_ANDESITE)));

    //Cracked Smooth
        //block
        //slab
        //stairs
        //wall

    //Mossy Smooth
        //block
        //slab
        //stairs
        //wall

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

    //Cut
        //cut_andesite
        //cut_andesite_slab
        //cut_andesite_stairs
        //cut_andesite_wall

    //Cracked Cut
        //block
        //slab
        //stairs
        //wall

    //Mossy Cut
        //block
        //slab
        //stairs
        //wall

    //Bricks
        public static final Block ANDESITE_BRICKS = register("andesite_bricks", new Block(FabricBlockSettings.copy(ANDESITE)));
        public static final Block ANDESITE_BRICK_SLAB = register("andesite_brick_slab", new SlabBlock(FabricBlockSettings.copy(ANDESITE)));
        public static final Block ANDESITE_BRICKS_STAIRS = register("andesite_brick_stairs", new BaseConsistencyStairBlock(ANDESITE.getDefaultState(),FabricBlockSettings.copy(ANDESITE)));
        public static final Block ANDESITE_BRICKS_WALL = register("andesite_brick_wall", new WallBlock(FabricBlockSettings.copy(ANDESITE)));


    //Cracked Bricks
        //cracked_andesite_bricks
        //cracked_andesite_brick_slab
        //cracked_andesite_brick_stairs
        //cracked_andesite_brick_wall

    //Mossy Bricks
        //mossy_andesite_bricks
        //mossy_andesite_brick_slab
        //mossy_andesite_brick_stairs
        //mossy_andesite_brick_wall

    //Pillars and Chiseled
        //andesite_pillar
        //cracked_andesite_pillar
        //mossy_andesite_pillar
        //chiseled_andesite_bricks
        //cracked_chiseled_andesite_bricks
        //mossy_chiseled_andesite_bricks
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        //carved
        //cracked carved
        //mossy carved

//Diorite

    //Polished
        public static final Block POLISHED_DIORITE_WALL = register("polished_diorite_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_DIORITE)));

    //Smooth
        //smooth_diorite
        //smooth_diorite_slab
        //smooth_diorite_stairs
        //smooth_diorite_wall

    //Cracked Smooth
        //block
        //slab
        //stairs
        //wall

    //Mossy Smooth
        //block
        //slab
        //stairs
        //wall

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

    //Cut
        public static final Block CUT_DIORITE = register("cut_diorite", new Block(FabricBlockSettings.copy(DIORITE)));
        public static final Block CUT_DIORITE_SLAB = register("cut_diorite_slab", new SlabBlock(FabricBlockSettings.copy(DIORITE)));
        public static final Block CUT_DIORITE_STAIRS = register("cut_diorite_stairs", new BaseConsistencyStairBlock(DIORITE.getDefaultState(),FabricBlockSettings.copy(DIORITE)));
        public static final Block CUT_DIORITE_WALL = register("cut_diorite_wall", new WallBlock(FabricBlockSettings.copy(DIORITE)));

    //Cracked Cut
        //block
        //slab
        //stairs
        //wall

    //Mossy Cut
        //block
        //slab
        //stairs
        //wall

    //Bricks
        //diorite_bricks
        //diorite_brick_slab
        //diorite_brick_stairs
        //diorite_brick_wall

    //Cracked Bricks
        //cracked_diorite_bricks
        //cracked_diorite_brick_slab
        //cracked_diorite_brick_stairs
        //cracked_diorite_brick_wall

    //Mossy Bricks
        //mossy_diorite_bricks
        //mossy_diorite_brick_slab
        //mossy_diorite_brick_stairs
        //mossy_diorite_brick_wall

    //Pillars and Chiseled
        //diorite_pillar
        //cracked_diorite_pillar
        //mossy_diorite_pillar
        //chiseled_diorite_bricks
        //cracked_chiseled_diorite_bricks
        //mossy_chiseled_diorite_bricks
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        //carved
        //cracked carved
        //mossy carved


//Granite

    //Polished
        public static final Block POLISHED_GRANITE_WALL = register("polished_granite_wall", new WallBlock(FabricBlockSettings.copy(POLISHED_GRANITE)));

    //Smooth
        public static final Block SMOOTH_GRANITE = register("smooth_granite", new Block(FabricBlockSettings.copy(GRANITE)));
        public static final Block SMOOTH_GRANITE_SLAB = register("smooth_granite_slab", new SlabBlock(FabricBlockSettings.copy(GRANITE)));
        public static final Block SMOOTH_GRANITE_STAIRS = register("smooth_granite_stairs", new BaseConsistencyStairBlock(GRANITE.getDefaultState(),FabricBlockSettings.copy(GRANITE)));
        public static final Block SMOOTH_GRANITE_WALL = register("smooth_granite_wall", new WallBlock(FabricBlockSettings.copy(GRANITE)));


    //Cracked Smooth
        //block
        //slab
        //stairs
        //wall

    //Mossy Smooth
        //block
        //slab
        //stairs
        //wall

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

    //Cut
        //cut_granite
        //cut_granite_slab
        //cut_granite_stairs
        //cut_granite_wall

    //Cracked Cut
        //block
        //slab
        //stairs
        //wall

    //Mossy Cut
        //block
        //slab
        //stairs
        //wall

    //Bricks
        //granite_bricks
        //granite_brick_slab
        //granite_brick_stairs
        //granite_brick_wall

    //Cracked Bricks
        //cracked_granite_bricks
        //cracked_granite_brick_slab
        //cracked_granite_brick_stairs
        //cracked_granite_brick_wall

    //Mossy Bricks
        //mossy_granite_bricks
        //mossy_granite_brick_slab
        //mossy_granite_brick_stairs
        //mossy_granite_brick_wall

    //Pillars and Chiseled
        //granite_pillar
        //cracked_granite_pillar
        //mossy_granite_pillar
        //chiseled_granite_bricks
        //cracked_chiseled_granite_bricks
        //mossy_chiseled_granite_bricks
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        //carved
        //cracked carved
        //mossy carved

    //h
        public static final Block NETHERITE_STAIRS = register("netherite_stairs", new BaseConsistencyStairBlock(NETHERITE_BLOCK.getDefaultState(),FabricBlockSettings.copy(NETHERITE_BLOCK)));
        public static final Block SUSPICIOUS_SLAB  = register("suspicious_slab", new SlabBlock(FabricBlockSettings.copy(CLAY)));
    //Clay
        public static final Block CLAY_SLAB  = register("clay_slab", new SlabBlock(FabricBlockSettings.copy(CLAY)));
        public static final Block CLAY_STAIRS = register("clay_stairs", new BaseConsistencyStairBlock(CLAY.getDefaultState(),FabricBlockSettings.copy(CLAY)));
        public static final Block CLAY_WALL = register("clay_wall", new WallBlock(FabricBlockSettings.copy(CLAY)));

        public static final Block POLISHED_CLAY = register("polished_clay", new Block(FabricBlockSettings.copy(CLAY)));
        public static final Block POLISHED_CLAY_SLAB  = register("polished_clay_slab", new SlabBlock(FabricBlockSettings.copy(CLAY)));
        public static final Block POLISHED_CLAY_STAIRS = register("polished_clay_stairs", new BaseConsistencyStairBlock(CLAY.getDefaultState(),FabricBlockSettings.copy(CLAY)));
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
        public static final Block CUT_CLAY_SLAB  = register("cut_clay_slab", new SlabBlock(FabricBlockSettings.copy(CLAY)));
        public static final Block CUT_CLAY_STAIRS = register("cut_clay_stairs", new BaseConsistencyStairBlock(CLAY.getDefaultState(),FabricBlockSettings.copy(CLAY)));
        public static final Block CUT_CLAY_WALL = register("cut_clay_wall", new WallBlock(FabricBlockSettings.copy(CLAY)));

        public static final Block SMOOTH_CLAY = register("smooth_clay", new Block(FabricBlockSettings.copy(CLAY)));
        public static final Block SMOOTH_CLAY_SLAB  = register("smooth_clay_slab", new SlabBlock(FabricBlockSettings.copy(CLAY)));
        public static final Block SMOOTH_CLAY_STAIRS = register("smooth_clay_stairs", new BaseConsistencyStairBlock(CLAY.getDefaultState(),FabricBlockSettings.copy(CLAY)));
        public static final Block SMOOTH_CLAY_WALL = register("smooth_clay_wall", new WallBlock(FabricBlockSettings.copy(CLAY)));

//Bricks
    //Cracked Bricks
        //cracked_bricks
        //cracked_brick_slab
        //cracked_brick_stairs
        //cracked_brick_wall

    //Mossy Bricks
        //mossy_bricks
        //mossy_brick_slab
        //mossy_brick_stairs
        //mossy_brick_wall

    //Pillars and Chiseled
        //chiseled_bricks
        //mossy_chiseled_bricks
        //cracked_chiseled_bricks
        //brick_pillar
        //mossy_brick_pillar
        //cracked_brick_pillar
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        //carved
        //cracked carved
        //mossy carved


//Nether Bricks

    //Cracked Bricks
        //cracked_nether_brick_slab
        //cracked_nether_brick_stairs
        //cracked_nether_brick_wall

    //Mossy Bricks
        //mossy_nether_bricks
        //mossy_nether_brick_slab
        //mossy_nether_brick_stairs
        //mossy_nether_brick_wall

    //Pillars and Chiseled
        //mossy_chiseled_nether_bricks
        //cracked_chiseled_nether_bricks
        //nether_brick_pillar
        //mossy_nether_brick_pillar
        //cracked_nether_brick_pillar

//Red Nether Bricks

    //Cracked Bricks
        //cracked_red_nether_bricks
        //cracked_red_nether_brick_slab
        //cracked_red_nether_brick_stairs
        //cracked_red_nether_brick_wall

    //Mossy Bricks
        //mossy_red_nether_bricks
        //mossy_red_nether_brick_slab
        //mossy_red_nether_brick_stairs
        //mossy_red_nether_brick_wall

    //Pillars and Chiseled
        //chiseled_red_nether_bricks
        //mossy_chiseled_red_nether_bricks
        //cracked_chiseled_red_nether_bricks
        //red_nether_brick_pillar
        //mossy_red_nether_brick_pillar
        //cracked_red_nether_brick_pillar
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        //carved
        //cracked carved
        //mossy carved


//Blue Nether Bricks

    //Bricks
        //blue_nether_bricks
        //blue_nether_brick_slab
        //blue_nether_brick_stairs
        //blue_nether_brick_wall

    //Cracked Bricks
        //cracked_blue_nether_bricks
        //cracked_blue_nether_brick_slab
        //cracked_blue_nether_brick_stairs
        //cracked_blue_nether_brick_wall

    //Mossy Bricks
        //mossy_blue_nether_bricks
        //mossy_blue_nether_brick_slab
        //mossy_blue_nether_brick_stairs
        //mossy_blue_nether_brick_wall

    //Pillars and Chiseled
        //chiseled_blue_nether_bricks
        //mossy_chiseled_blue_nether_bricks
        //cracked_chiseled_blue_nether_bricks
        //blue_nether_brick_pillar
        //mossy_blue_nether_brick_pillar
        //cracked_blue_nether_brick_pillar
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        //carved
        //cracked carved
        //mossy carved


//Prismarine

    //Polished
        public static final Block POLISHED_PRISMARINE = register("polished_prismarine", new Block(FabricBlockSettings.copy(PRISMARINE)));
        public static final Block POLISHED_PRISMARINE_SLAB = register("polished_prismarine_slab", new SlabBlock(FabricBlockSettings.copy(PRISMARINE)));
        public static final Block POLISHED_PRISMARINE_STAIRS = register("polished_prismarine_stairs", new BaseConsistencyStairBlock(POLISHED_PRISMARINE.getDefaultState(),FabricBlockSettings.copy(PRISMARINE)));
        public static final Block POLISHED_PRISMARINE_WALL = register("polished_prismarine_wall", new WallBlock(FabricBlockSettings.copy(PRISMARINE)));

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

    //Smooth
        public static final Block SMOOTH_PRISMARINE = register("smooth_prismarine", new Block(FabricBlockSettings.copy(PRISMARINE)));
        public static final Block SMOOTH_PRISMARINE_SLAB = register("smooth_prismarine_slab", new SlabBlock(FabricBlockSettings.copy(PRISMARINE)));
        public static final Block SMOOTH_PRISMARINE_STAIRS = register("smooth_prismarine_stairs", new BaseConsistencyStairBlock(SMOOTH_PRISMARINE.getDefaultState(),FabricBlockSettings.copy(PRISMARINE)));
        public static final Block SMOOTH_PRISMARINE_WALL = register("smooth_prismarine_wall", new WallBlock(FabricBlockSettings.copy(PRISMARINE)));


    //Cracked Smooth
        //block
        //slab
        //stairs
        //wall

    //Mossy Smooth
        //block
        //slab
        //stairs
        //wall

    //Cut
        public static final Block CUT_PRISMARINE = register("cut_prismarine", new Block(FabricBlockSettings.copy(PRISMARINE)));
        public static final Block CUT_PRISMARINE_SLAB = register("cut_prismarine_slab", new SlabBlock(FabricBlockSettings.copy(PRISMARINE)));
        public static final Block CUT_PRISMARINE_STAIRS = register("cut_prismarine_stairs", new BaseConsistencyStairBlock(CUT_PRISMARINE.getDefaultState(),FabricBlockSettings.copy(PRISMARINE)));
        public static final Block CUT_PRISMARINE_WALL = register("cut_prismarine_wall", new WallBlock(FabricBlockSettings.copy(PRISMARINE)));

    //Cracked Cut
        //block
        //slab
        //stairs
        //wall

    //Mossy Cut
        //block
        //slab
        //stairs
        //wall

    //Bricks
        public static final Block PRISMARINE_BRICK_WALL = register("prismarine_brick_wall", new WallBlock(FabricBlockSettings.copy(PRISMARINE_BRICKS)));

    //Cracked Bricks
        //cracked_prismarine_bricks
        //cracked_prismarine_brick_slab
        //cracked_prismarine_brick_stairs
        //cracked_prismarine_brick_wall

    //Mossy Bricks
        //mossy_prismarine_bricks
        //mossy_prismarine_brick_slab
        //mossy_prismarine_brick_stairs
        //mossy_prismarine_brick_wall

    //Pillar and Chiseled
        //chiseled_prismarine
        //mossy_chiseled_prismarine
        //cracked_chiseled_prismarine
        //prismarine_pillar
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
// I have made a colossal error in my judgement.

    //Polished
        public static final Block POLISHED_DARK_PRISMARINE = register("polished_dark_prismarine", new Block(FabricBlockSettings.copy(DARK_PRISMARINE)));
        public static final Block POLISHED_DARK_PRISMARINE_SLAB = register("polished_dark_prismarine_slab", new SlabBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));
        public static final Block POLISHED_DARK_PRISMARINE_STAIRS = register("polished_dark_prismarine_stairs", new BaseConsistencyStairBlock(DARK_PRISMARINE.getDefaultState(),FabricBlockSettings.copy(DARK_PRISMARINE)));
        public static final Block POLISHED_DARK_PRISMARINE_WALL = register("polished_dark_prismarine_wall", new WallBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));

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

    //Smooth
        public static final Block SMOOTH_DARK_PRISMARINE = register("smooth_dark_prismarine", new Block(FabricBlockSettings.copy(DARK_PRISMARINE)));
        public static final Block SMOOTH_DARK_PRISMARINE_SLAB = register("smooth_dark_prismarine_slab", new SlabBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));
        public static final Block SMOOTH_DARK_PRISMARINE_STAIRS = register("smooth_dark_prismarine_stairs", new BaseConsistencyStairBlock(SMOOTH_DARK_PRISMARINE.getDefaultState(),FabricBlockSettings.copy(DARK_PRISMARINE)));
        public static final Block SMOOTH_DARK_PRISMARINE_WALL = register("smooth_dark_prismarine_wall", new WallBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));


    //Cracked Smooth
        //block
        //slab
        //stairs
        //wall

    //Mossy Smooth
        //block
        //slab
        //stairs
        //wall

    //Cut
        public static final Block CUT_DARK_PRISMARINE = register("cut_dark_prismarine", new Block(FabricBlockSettings.copy(DARK_PRISMARINE)));
        public static final Block CUT_DARK_PRISMARINE_SLAB = register("cut_dark_prismarine_slab", new SlabBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));
        public static final Block CUT_DARK_PRISMARINE_STAIRS = register("cut_dark_prismarine_stairs", new BaseConsistencyStairBlock(DARK_PRISMARINE.getDefaultState(),FabricBlockSettings.copy(DARK_PRISMARINE)));
        public static final Block CUT_DARK_PRISMARINE_WALL = register("cut_dark_prismarine_wall", new WallBlock(FabricBlockSettings.copy(DARK_PRISMARINE)));

    //Cracked Cut
        //block
        //slab
        //stairs
        //wall

    //Mossy Cut
        //block
        //slab
        //stairs
        //wall

    //Bricks
        //dark_prismarine_bricks
        //dark_prismarine_brick_slab
        //dark_prismarine_brick_stairs
        //dark_prismarine_brick_wall

    //Cracked Bricks
        //cracked_dark_prismarine_bricks
        //cracked_dark_prismarine_brick_slab
        //cracked_dark_prismarine_brick_stairs
        //cracked_dark_prismarine_brick_wall

    //Mossy Bricks
        //mossy_dark_prismarine_bricks
        //mossy_dark_prismarine_brick_slab
        //mossy_dark_prismarine_brick_stairs
        //mossy_dark_prismarine_brick_wall

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
        //carved
        //cracked carved
        //mossy carved


//Purpur

    //Block
        public static final Block PURPUR_BLOCK = register("purpur_block", new Block(FabricBlockSettings.copy(PURPUR_PILLAR)));
        public static final Block PURPUR_SLAB = register("purpur_slab", new SlabBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block PURPUR_STAIRS = register("purpur_stairs", new BaseConsistencyStairBlock(PURPUR_BLOCK.getDefaultState(),FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block PURPUR_WALL = register("purpur_wall", new WallBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));

    //Smooth
        public static final Block SMOOTH_PURPUR_BLOCK = register("smooth_purpur_block", new Block(FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block SMOOTH_PURPUR_SLAB = register("smooth_purpur_slab", new SlabBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block SMOOTH_PURPUR_STAIRS = register("smooth_purpur_stairs", new BaseConsistencyStairBlock(PURPUR_BLOCK.getDefaultState(),FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block SMOOTH_PURPUR_WALL = register("smooth_purpur_wall", new WallBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));

    //Cracked Smooth
        //block
        //slab
        //stairs
        //wall

    //Mossy Smooth
        //block
        //slab
        //stairs
        //wall

    //Polished
        public static final Block POLISHED_PURPUR_BLOCK = register("polished_purpur_block", new Block(FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block POLISHED_PURPUR_SLAB = register("polished_purpur_slab", new SlabBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block POLISHED_PURPUR_STAIRS = register("polished_purpur_stairs", new BaseConsistencyStairBlock(PURPUR_BLOCK.getDefaultState(),FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block POLISHED_PURPUR_WALL = register("polished_purpur_wall", new WallBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));

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

    //Cut
        public static final Block CUT_PURPUR_WALL = register("cut_purpur_wall", new WallBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));

    //Cracked Cut
        //block
        //slab
        //stairs
        //wall

    //Mossy Cut
        //block
        //slab
        //stairs
        //wall

    //Bricks
        public static final Block PURPUR_BRICKS = register("purpur_bricks", new Block(FabricBlockSettings.copy(PURPUR_PILLAR)));
        public static final Block PURPUR_BRICK_SLAB = register("purpur_brick_slab", new SlabBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block PURPUR_BRICK_STAIRS = register("purpur_brick_stairs", new BaseConsistencyStairBlock(PURPUR_BLOCK.getDefaultState(),FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block PURPUR_BRICK_WALL = register("purpur_brick_wall", new WallBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));

    //Cracked Bricks
        public static final Block CRACKED_PURPUR_BRICKS = register("cracked_purpur_bricks", new Block(FabricBlockSettings.copy(PURPUR_PILLAR)));
        public static final Block CRACKED_PURPUR_BRICK_SLAB = register("cracked_purpur_brick_slab", new SlabBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block CRACKED_PURPUR_BRICK_STAIRS = register("cracked_purpur_brick_stairs", new BaseConsistencyStairBlock(PURPUR_BLOCK.getDefaultState(),FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block CRACKED_PURPUR_BRICK_WALL = register("cracked_purpur_brick_wall", new WallBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));

    //Mossy Bricks
        //mossy_purpur_bricks
        //mossy_purpur_brick_slab
        //mossy_purpur_brick_stairs
        //mossy_purpur_brick_wall

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

    //Block
        public static final Block END_STONE_SLAB = register("end_stone_slab", new SlabBlock(FabricBlockSettings.copy(END_STONE)));
        public static final Block END_STONE_STAIRS = register("end_stone_stairs", new BaseConsistencyStairBlock(END_STONE.getDefaultState(),FabricBlockSettings.copy(END_STONE)));
        public static final Block END_STONE_WALL = register("end_stone_wall", new WallBlock(FabricBlockSettings.copy(END_STONE)));

    //Smooth
        public static final Block SMOOTH_END_STONE = register("smooth_end_stone", new Block(FabricBlockSettings.copy(END_STONE)));
        public static final Block SMOOTH_END_STONE_SLAB = register("smooth_end_stone_slab", new SlabBlock(FabricBlockSettings.copy(END_STONE)));
        public static final Block SMOOTH_END_STONE_STAIRS = register("smooth_end_stone_stairs", new BaseConsistencyStairBlock(END_STONE.getDefaultState(),FabricBlockSettings.copy(END_STONE)));
        public static final Block SMOOTH_END_STONE_WALL = register("smooth_end_stone_wall", new WallBlock(FabricBlockSettings.copy(END_STONE)));

    //Cracked Smooth
        //block
        //slab
        //stairs
        //wall

    //Mossy Smooth
        //block
        //slab
        //stairs
        //wall

    //Polished
        public static final Block POLISHED_END_STONE = register("polished_end_stone", new Block(FabricBlockSettings.copy(END_STONE)));
        public static final Block POLISHED_END_STONE_SLAB = register("polished_end_stone_slab", new SlabBlock(FabricBlockSettings.copy(END_STONE)));
        public static final Block POLISHED_END_STONE_STAIRS = register("polished_end_stone_stairs", new BaseConsistencyStairBlock(END_STONE.getDefaultState(),FabricBlockSettings.copy(END_STONE)));
        public static final Block POLISHED_END_STONE_WALL = register("polished_end_stone_wall", new WallBlock(FabricBlockSettings.copy(END_STONE)));

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

    //Cut
        public static final Block CUT_END_STONE = register("cut_end_stone", new Block(FabricBlockSettings.copy(END_STONE)));
        public static final Block CUT_END_STONE_SLAB = register("cut_end_stone_slab", new SlabBlock(FabricBlockSettings.copy(END_STONE)));
        public static final Block CUT_END_STONE_STAIRS = register("cut_end_stone_stairs", new BaseConsistencyStairBlock(END_STONE.getDefaultState(),FabricBlockSettings.copy(END_STONE)));
        public static final Block CUT_END_STONE_WALL = register("cut_end_stone_wall", new WallBlock(FabricBlockSettings.copy(END_STONE)));

    //Cracked Cut
        //block
        //slab
        //stairs
        //wall

    //Mossy Cut
        //block
        //slab
        //stairs
        //wall

    //Cracked Bricks
        //cracked_end_stone_bricks
        //cracked_end_stone_brick_slab
        //cracked_end_stone_brick_stairs
        //cracked_end_stone_brick_wall

    //Mossy Bricks
        //mossy_end_stone_bricks
        //mossy_end_stone_brick_slab
        //mossy_end_stone_brick_stairs
        //mossy_end_stone_brick_wall

    //Pillars and Chiseled
        public static final Block CHISELED_END_STONE = register("chiseled_end_stone", new Block(FabricBlockSettings.copy(END_STONE)));
        //mossy_chiseled_end_stone_bricks
        //cracked_chiseled_end_stone_bricks
        //end_stone_brick_pillar
        //mossy_end_stone_brick_pillar
        //cracked_end_stone_brick_pillar
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        public static final Block CARVED_END_STONE = register("carved_end_stone", new Block(FabricBlockSettings.copy(END_STONE_BRICKS)));
        //cracked carved
        //mossy carved

//Terracotta

    //Terracotta Slab
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


    //Terracotta Stairs
        public static final Block RED_TERRACOTTA_STAIRS = register("red_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copy(TERRACOTTA)));
        public static final Block ORANGE_TERRACOTTA_STAIRS = register("orange_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copy(TERRACOTTA)));
        public static final Block YELLOW_TERRACOTTA_STAIRS = register("yellow_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copy(TERRACOTTA)));
        public static final Block LIME_TERRACOTTA_STAIRS = register("lime_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copy(TERRACOTTA)));
        public static final Block GREEN_TERRACOTTA_STAIRS = register("green_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copy(TERRACOTTA)));
        public static final Block BLUE_TERRACOTTA_STAIRS = register("blue_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copy(TERRACOTTA)));
        public static final Block CYAN_TERRACOTTA_STAIRS = register("cyan_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copy(TERRACOTTA)));
        public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = register("light_blue_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copy(TERRACOTTA)));
        public static final Block PURPLE_TERRACOTTA_STAIRS = register("purple_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copy(TERRACOTTA)));
        public static final Block MAGENTA_TERRACOTTA_STAIRS = register("magenta_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copy(TERRACOTTA)));
        public static final Block PINK_TERRACOTTA_STAIRS = register("pink_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copy(TERRACOTTA)));
        public static final Block WHITE_TERRACOTTA_STAIRS = register("white_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copy(TERRACOTTA)));
        public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = register("light_gray_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copy(TERRACOTTA)));
        public static final Block GRAY_TERRACOTTA_STAIRS = register("gray_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copy(TERRACOTTA)));
        public static final Block BLACK_TERRACOTTA_STAIRS = register("black_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copy(TERRACOTTA)));
        public static final Block BROWN_TERRACOTTA_STAIRS = register("brown_terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copy(TERRACOTTA)));
        public static final Block TERRACOTTA_STAIRS = register("terracotta_stairs", new BaseConsistencyStairBlock(TERRACOTTA.getDefaultState(),FabricBlockSettings.copy(TERRACOTTA)));

    //Terracotta Wall
        //red_terracotta_slab
        //orange_terracotta_slab
        //yellow_terracotta_slab
        //lime_terracotta_slab
        //green_terracotta_slab
        //blue_terracotta_slab
        //cyan_terracotta_slab
        //light_blue_terracotta_slab
        //purple_terracotta_slab
        //magenta_terracotta_slab
        //pink_terracotta_slab
        //white_terracotta_slab
        //light_gray_terracotta_slab
        //gray_terracotta_slab
        //black_terracotta_slab
        //brown_terracotta_slab


//Concrete

    //Concrete Slab
        //red_concrete_slab
        //orange_concrete_slab
        //yellow_concrete_slab
        //lime_concrete_slab
        //green_concrete_slab
        //blue_concrete_slab
        //cyan_concrete_slab
        //light_blue_concrete_slab
        //purple_concrete_slab
        //magenta_concrete_slab
        //pink_concrete_slab
        //white_concrete_slab
        //light_gray_concrete_slab
        //gray_concrete_slab
        //black_concrete_slab
        //brown_concrete_slab

    //Concrete Stairs
        //red_concrete_slab
        //orange_concrete_slab
        //yellow_concrete_slab
        //lime_concrete_slab
        //green_concrete_slab
        //blue_concrete_slab
        //cyan_concrete_slab
        //light_blue_concrete_slab
        //purple_concrete_slab
        //magenta_concrete_slab
        //pink_concrete_slab
        //white_concrete_slab
        //light_gray_concrete_slab
        //gray_concrete_slab
        //black_concrete_slab
        //brown_concrete_slab

    //Concrete Wall
        //red_concrete_slab
        //orange_concrete_slab
        //yellow_concrete_slab
        //lime_concrete_slab
        //green_concrete_slab
        //blue_concrete_slab
        //cyan_concrete_slab
        //light_blue_concrete_slab
        //purple_concrete_slab
        //magenta_concrete_slab
        //pink_concrete_slab
        //white_concrete_slab
        //light_gray_concrete_slab
        //gray_concrete_slab
        //black_concrete_slab
        //brown_concrete_slab


    // Oh god this isnt cursed idea at all nope
    public static final Block JACK_O_SOUL = register("jack_o_soul", new BaseConsistencyCarvedPumpkinBlock(FabricBlockSettings.of(Material.GOURD, MaterialColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD).luminance(10)));

    //public static final Block FORMAT_FENCE = register("format_fence", new FenceBlock(FabricBlockSettings.of(Material.STONE)));
    //public static final Block FORMAT_FENCE_GATE = register("format_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE)));//

    public static final Block DEVIN_BLOCKERA = register("devin_blockera", new Block(FabricBlockSettings.copy(STONE)));
    public static final Block BROKEN_MODIFIKATION = register("broken_modifikation", new Block(FabricBlockSettings.copy(BEDROCK)));

    private static Block register(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier("consistency_plus", name), block);
    }
    public static void init() {
    }
}

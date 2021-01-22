package net.consistencyteam.consistency_plus;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Items {
    /*
    templates:
    block item: public static final Item SMOOTH_STONE_WALL = register("smooth_stone_wall", new BlockItem(Blocks.SMOOTH_STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings()));
     */
//Stone
    //Smooth
        public static final Item SMOOTH_STONE_WALL = register("smooth_stone_wall", new BlockItem(Blocks.SMOOTH_STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item SMOOTH_STONE_STAIRS = register("smooth_stone_stairs", new BlockItem(Blocks.SMOOTH_STONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings()));

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

        public static final Item CUT_STONE = register("cut_stone", new BlockItem(Blocks.CUT_STONE, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item CUT_STONE_SLAB = register("cut_stone_slab", new BlockItem(Blocks.CUT_STONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item CUT_STONE_STAIRS = register("cut_stone_stairs", new BlockItem(Blocks.CUT_STONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item CUT_STONE_WALL = register("cut_stone_wall", new BlockItem(Blocks.CUT_STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings()));

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
        public static final Item POLISHED_STONE = register("polished_stone", new BlockItem(Blocks.POLISHED_STONE, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item POLISHED_STONE_WALL = register("polished_stone_wall", new BlockItem(Blocks.POLISHED_STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item POLISHED_STONE_STAIRS = register("polished_stone_stairs", new BlockItem(Blocks.POLISHED_STONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item POLISHED_STONE_SLAB = register("polished_stone_slab", new BlockItem(Blocks.POLISHED_STONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings()));

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

    //Cracked Bricks
        public static final Item CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab", new BlockItem(Blocks.CRACKED_STONE_BRICK_SLAB, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", new BlockItem(Blocks.CRACKED_STONE_BRICK_STAIRS, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", new BlockItem(Blocks.CRACKED_STONE_BRICK_WALL, ItemGroups.consistencyPlusStoneItemSettings()));

    //Pillar and Chiseled
        public static final Item STONE_BRICK_PILLAR = register("stone_brick_pillar", new BlockItem(Blocks.STONE_BRICK_PILLAR, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item MOSSY_STONE_BRICK_PILLAR = register("mossy_stone_brick_pillar", new BlockItem(Blocks.MOSSY_STONE_BRICK_PILLAR, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item CRACKED_STONE_BRICK_PILLAR = register("cracked_stone_brick_pillar", new BlockItem(Blocks.CRACKED_STONE_BRICK_PILLAR, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item CRACKED_CHISELED_STONE_BRICKS = register("cracked_chiseled_stone_bricks", new BlockItem(Blocks.CRACKED_CHISELED_STONE_BRICKS, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item MOSSY_CHISELED_STONE_BRICKS = register("mossy_chiseled_stone_bricks", new BlockItem(Blocks.MOSSY_CHISELED_STONE_BRICKS, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item STONE_WALL = register("stone_wall", new BlockItem(Blocks.STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings()));
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        public static final Item CARVED_STONE_BRICKS = register("carved_stone_bricks", new BlockItem(Blocks.CARVED_STONE_BRICKS, ItemGroups.consistencyPlusStoneItemSettings()));
        //cracked carved
        //mossy carved
//Blackstone

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
        public static final Item SMOOTH_BLACKSTONE = register("smooth_blackstone", new BlockItem(Blocks.SMOOTH_BLACKSTONE, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item SMOOTH_BLACKSTONE_SLAB = register("smooth_blackstone_slab", new BlockItem(Blocks.SMOOTH_BLACKSTONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item SMOOTH_BLACKSTONE_STAIRS = register("smooth_blackstone_stairs", new BlockItem(Blocks.SMOOTH_BLACKSTONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item SMOOTH_BLACKSTONE_WALL = register("smooth_blackstone_wall", new BlockItem(Blocks.SMOOTH_BLACKSTONE_WALL, ItemGroups.consistencyPlusStoneItemSettings()));

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
        public static final Item CUT_BLACKSTONE = register("cut_blackstone", new BlockItem(Blocks.CUT_BLACKSTONE, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item CUT_BLACKSTONE_SLAB = register("cut_blackstone_slab", new BlockItem(Blocks.CUT_BLACKSTONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item CUT_BLACKSTONE_STAIRS = register("cut_blackstone_stairs", new BlockItem(Blocks.CUT_BLACKSTONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item CUT_BLACKSTONE_WALL = register("cut_blackstone_wall", new BlockItem(Blocks.CUT_BLACKSTONE_WALL, ItemGroups.consistencyPlusStoneItemSettings()));

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
        public static final Item CRACKED_BLACKSTONE_BRICK_SLAB = register("cracked_blackstone_brick_slab", new BlockItem(Blocks.CRACKED_BLACKSTONE_BRICK_SLAB, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item CRACKED_BLACKSTONE_BRICK_STAIRS = register("cracked_blackstone_brick_stairs", new BlockItem(Blocks.CRACKED_BLACKSTONE_BRICK_STAIRS, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item CRACKED_BLACKSTONE_BRICK_WALL = register("cracked_blackstone_brick_wall", new BlockItem(Blocks.CRACKED_BLACKSTONE_BRICK_WALL, ItemGroups.consistencyPlusStoneItemSettings()));

    //Mossy Bricks
        public static final Item MOSSY_BLACKSTONE_BRICKS = register("mossy_blackstone_bricks", new BlockItem(Blocks.MOSSY_BLACKSTONE_BRICKS, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item MOSSY_BLACKSTONE_BRICK_SLAB = register("mossy_blackstone_brick_slab", new BlockItem(Blocks.MOSSY_BLACKSTONE_BRICK_SLAB, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item MOSSY_BLACKSTONE_BRICK_STAIRS = register("mossy_blackstone_brick_stairs", new BlockItem(Blocks.MOSSY_BLACKSTONE_BRICK_STAIRS, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item MOSSY_BLACKSTONE_BRICK_WALL = register("mossy_blackstone_brick_wall", new BlockItem(Blocks.MOSSY_BLACKSTONE_BRICK_WALL, ItemGroups.consistencyPlusStoneItemSettings()));

    //Pillars and Chiseled
        public static final Item CHISELED_BLACKSTONE = register("chiseled_blackstone", new BlockItem(Blocks.CHISELED_BLACKSTONE, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item MOSSY_CHISELED_BLACKSTONE = register("mossy_chiseled_blackstone", new BlockItem(Blocks.MOSSY_CHISELED_BLACKSTONE, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item CRACKED_CHISELED_BLACKSTONE = register("cracked_chiseled_blackstone", new BlockItem(Blocks.CRACKED_CHISELED_BLACKSTONE, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item BLACKSTONE_BRICK_PILLAR = register("blackstone_brick_pillar", new BlockItem(Blocks.BLACKSTONE_BRICK_PILLAR, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item CRACKED_BLACKSTONE_BRICK_PILLAR = register("cracked_blackstone_brick_pillar", new BlockItem(Blocks.CRACKED_BLACKSTONE_BRICK_PILLAR, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item MOSSY_BLACKSTONE_BRICK_PILLAR = register("mossy_blackstone_brick_pillar", new BlockItem(Blocks.MOSSY_BLACKSTONE_BRICK_PILLAR, ItemGroups.consistencyPlusStoneItemSettings()));
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        public static final Item CRACKED_CARVED_BLACKSTONE = register("cracked_carved_blackstone", new BlockItem(Blocks.CRACKED_CARVED_BLACKSTONE, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item MOSSY_CARVED_BLACKSTONE = register("mossy_carved_blackstone", new BlockItem(Blocks.MOSSY_CARVED_BLACKSTONE, ItemGroups.consistencyPlusStoneItemSettings()));


//Sandstone

    //Smooth
        public static final Item SMOOTH_SANDSTONE_WALL = register("smooth_sandstone_wall", new BlockItem(Blocks.SMOOTH_SANDSTONE_WALL, ItemGroups.consistencyPlusStoneItemSettings()));

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
        public static final Item CUT_SANDSTONE_STAIRS = register("cut_sandstone_stairs", new BlockItem(Blocks.CUT_SANDSTONE_STAIRS, ItemGroups.consistencyPlusSandstoneItemSettings()));
        public static final Item CUT_SANDSTONE_WALL = register("cut_sandstone_wall", new BlockItem(Blocks.CUT_SANDSTONE_WALL, ItemGroups.consistencyPlusSandstoneItemSettings()));

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
        public static final Item POLISHED_SANDSTONE = register("polished_sandstone", new BlockItem(Blocks.POLISHED_SANDSTONE, ItemGroups.consistencyPlusSandstoneItemSettings()));
        public static final Item POLISHED_SANDSTONE_SLAB = register("polished_sandstone_slab", new BlockItem(Blocks.POLISHED_SANDSTONE_SLAB, ItemGroups.consistencyPlusSandstoneItemSettings()));
        public static final Item POLISHED_SANDSTONE_STAIRS = register("polished_sandstone_stairs", new BlockItem(Blocks.POLISHED_SANDSTONE_STAIRS, ItemGroups.consistencyPlusSandstoneItemSettings()));
        public static final Item POLISHED_SANDSTONE_WALL = register("polished_sandstone_wall", new BlockItem(Blocks.POLISHED_SANDSTONE_WALL, ItemGroups.consistencyPlusSandstoneItemSettings()));

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
        public static final Item SANDSTONE_BRICKS = register("sandstone_bricks", new BlockItem(Blocks.SANDSTONE_BRICKS, ItemGroups.consistencyPlusSandstoneItemSettings()));
        public static final Item SANDSTONE_BRICK_SLAB = register("sandstone_brick_slab", new BlockItem(Blocks.SANDSTONE_BRICK_SLAB, ItemGroups.consistencyPlusSandstoneItemSettings()));
        public static final Item SANDSTONE_BRICk_STAIRS = register("sandstone_brick_stairs", new BlockItem(Blocks.SANDSTONE_BRICK_STAIRS, ItemGroups.consistencyPlusSandstoneItemSettings()));
        public static final Item SANDSTONE_BRICK_WALL = register("sandstone_brick_wall", new BlockItem(Blocks.SANDSTONE_BRICK_WALL, ItemGroups.consistencyPlusSandstoneItemSettings()));


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
        public static final Item SMOOTH_RED_SANDSTONE_WALL = register("smooth_red_sandstone_wall", new BlockItem(Blocks.SMOOTH_RED_SANDSTONE_WALL, ItemGroups.consistencyPlusSandstoneItemSettings()));

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
        public static final Item CUT_RED_SANDSTONE_STAIRS = register("cut_red_sandstone_stairs", new BlockItem(Blocks.CUT_RED_SANDSTONE_STAIRS, ItemGroups.consistencyPlusSandstoneItemSettings()));
        public static final Item CUT_RED_SANDSTONE_WALL = register("cut_red_sandstone_wall", new BlockItem(Blocks.CUT_RED_SANDSTONE_WALL, ItemGroups.consistencyPlusSandstoneItemSettings()));

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
        public static final Item POLISHED_RED_SANDSTONE = register("polished_red_sandstone", new BlockItem(Blocks.POLISHED_RED_SANDSTONE, ItemGroups.consistencyPlusSandstoneItemSettings()));
        public static final Item POLISHED_RED_SANDSTONE_SLAB = register("polished_red_sandstone_slab", new BlockItem(Blocks.POLISHED_RED_SANDSTONE_SLAB, ItemGroups.consistencyPlusSandstoneItemSettings()));
        public static final Item POLISHED_RED_SANDSTONE_STAIRS = register("polished_red_sandstone_stairs", new BlockItem(Blocks.POLISHED_RED_SANDSTONE_STAIRS, ItemGroups.consistencyPlusSandstoneItemSettings()));
        public static final Item POLISHED_RED_SANDSTONE_WALL = register("polished_red_sandstone_wall", new BlockItem(Blocks.POLISHED_RED_SANDSTONE_WALL, ItemGroups.consistencyPlusSandstoneItemSettings()));


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
        public static final Item RED_SANDSTONE_BRICKS = register("red_sandstone_bricks", new BlockItem(Blocks.RED_SANDSTONE_BRICKS, ItemGroups.consistencyPlusSandstoneItemSettings()));
        public static final Item RED_SANDSTONE_BRICK_SLAB = register("red_sandstone_brick_slab", new BlockItem(Blocks.RED_SANDSTONE_BRICK_SLAB, ItemGroups.consistencyPlusSandstoneItemSettings()));
        public static final Item RED_SANDSTONE_BRICk_STAIRS = register("red_sandstone_brick_stairs", new BlockItem(Blocks.RED_SANDSTONE_BRICK_STAIRS, ItemGroups.consistencyPlusSandstoneItemSettings()));
        public static final Item RED_SANDSTONE_BRICK_WALL = register("red_sandstone_brick_wall", new BlockItem(Blocks.RED_SANDSTONE_BRICK_WALL, ItemGroups.consistencyPlusSandstoneItemSettings()));

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
        public static final Item QUARTZ_WALL = register("quartz_wall", new BlockItem(Blocks.QUARTZ_WALL, ItemGroups.consistencyPlusMiscItemSettings()));

    //Smooth
        public static final Item SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall", new BlockItem(Blocks.SMOOTH_QUARTZ_WALL, ItemGroups.consistencyPlusMiscItemSettings()));

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
        public static final Item CUT_QUARTZ = register("cut_quartz", new BlockItem(Blocks.CUT_QUARTZ, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item CUT_QUARTZ_SLAB = register("cut_quartz_slab", new BlockItem(Blocks.CUT_QUARTZ_SLAB, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item CUT_QUARTZ_STAIRS = register("cut_quartz_stairs", new BlockItem(Blocks.CUT_QUARTZ_STAIRS, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item CUT_QUARTZ_WALL = register("cut_quartz_wall", new BlockItem(Blocks.CUT_QUARTZ_WALL, ItemGroups.consistencyPlusMiscItemSettings()));

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
        public static final Item POLISHED_QUARTZ = register("polished_quartz", new BlockItem(Blocks.POLISHED_QUARTZ, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item POLISHED_QUARTZ_SLAB = register("polished_quartz_slab", new BlockItem(Blocks.POLISHED_QUARTZ_SLAB, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item POLISHED_QUARTZ_STAIRS = register("polished_quartz_stairs", new BlockItem(Blocks.POLISHED_QUARTZ_STAIRS, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item POLISHED_QUARTZ_WALL = register("polished_quartz_wall", new BlockItem(Blocks.POLISHED_QUARTZ_WALL, ItemGroups.consistencyPlusMiscItemSettings()));


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
        public static final Item QUARTZ_BRICK_SLAB = register("quartz_brick_slab", new BlockItem(Blocks.QUARTZ_BRICK_SLAB, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs", new BlockItem(Blocks.QUARTZ_BRICK_STAIRS, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item QUARTZ_BRICK_WALL = register("quartz_brick_wall", new BlockItem(Blocks.QUARTZ_BRICK_WALL, ItemGroups.consistencyPlusMiscItemSettings()));

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
        public static final Item POLISHED_ANDESITE_WALL = register("polished_andesite_wall", new BlockItem(Blocks.POLISHED_ANDESITE_WALL, ItemGroups.consistencyPlusLesserStoneItemSettings()));

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
        public static final Item SMOOTH_ANDESITE = register("smooth_andesite", new BlockItem(Blocks.SMOOTH_ANDESITE, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item SMOOTH_ANDESITE_SLAB = register("smooth_andesite_slab", new BlockItem(Blocks.SMOOTH_ANDESITE_SLAB, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item SMOOTH_ANDESITE_STAIRS = register("smooth_andesite_stairs", new BlockItem(Blocks.SMOOTH_ANDESITE_STAIRS, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item SMOOTH_ANDESITE_WALL = register("smooth_andesite_wall", new BlockItem(Blocks.SMOOTH_ANDESITE_WALL, ItemGroups.consistencyPlusLesserStoneItemSettings()));

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
        public static final Item CUT_ANDESITE = register("cut_andesite", new BlockItem(Blocks.CUT_ANDESITE, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item CUT_ANDESITE_SLAB = register("cut_andesite_slab", new BlockItem(Blocks.CUT_ANDESITE_SLAB, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item CUT_ANDESITE_STAIRS = register("cut_andesite_stairs", new BlockItem(Blocks.CUT_ANDESITE_STAIRS, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item CUT_ANDESITE_WALL = register("cut_andesite_wall", new BlockItem(Blocks.CUT_ANDESITE_WALL, ItemGroups.consistencyPlusLesserStoneItemSettings()));

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
        public static final Item ANDESITE_BRICKS = register("andesite_bricks", new BlockItem(Blocks.ANDESITE_BRICKS, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item ANDESITE_BRICK_SLAB = register("andesite_brick_slab", new BlockItem(Blocks.ANDESITE_BRICK_SLAB, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item ANDESITE_BRICK_STAIRS = register("andesite_brick_stairs", new BlockItem(Blocks.ANDESITE_BRICKS_STAIRS, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item ANDESITE_BRICK_WALL = register("andesite_brick_wall", new BlockItem(Blocks.ANDESITE_BRICKS_WALL, ItemGroups.consistencyPlusLesserStoneItemSettings()));


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
        public static final Item POLISHED_DIORITE_WALL = register("polished_diorite_wall", new BlockItem(Blocks.POLISHED_DIORITE_WALL, ItemGroups.consistencyPlusLesserStoneItemSettings()));

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

    //Cut
        public static final Item CUT_DIORITE = register("cut_diorite", new BlockItem(Blocks.CUT_DIORITE, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item CUT_DIORITE_SLAB = register("cut_diorite_slab", new BlockItem(Blocks.CUT_DIORITE_SLAB, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item CUT_DIORITE_STAIRS = register("cut_diorite_stairs", new BlockItem(Blocks.CUT_DIORITE_STAIRS, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item CUT_DIORITE_WALL = register("cut_diorite_wall", new BlockItem(Blocks.CUT_DIORITE_WALL, ItemGroups.consistencyPlusLesserStoneItemSettings()));


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
        public static final Item POLISHED_GRANITE_WALL = register("polished_granite_wall", new BlockItem(Blocks.POLISHED_GRANITE_WALL, ItemGroups.consistencyPlusLesserStoneItemSettings()));

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
        public static final Item SMOOTH_GRANITE = register("smooth_granite", new BlockItem(Blocks.SMOOTH_GRANITE, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item SMOOTH_GRANITE_SLAB = register("smooth_granite_slab", new BlockItem(Blocks.SMOOTH_GRANITE_SLAB, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item SMOOTH_GRANITE_STAIRS = register("smooth_granite_stairs", new BlockItem(Blocks.SMOOTH_GRANITE_STAIRS, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item SMOOTH_GRANITE_WALL = register("smooth_granite_wall", new BlockItem(Blocks.SMOOTH_GRANITE_WALL, ItemGroups.consistencyPlusLesserStoneItemSettings()));


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
        public static final Item CUT_GRANITE = register("cut_granite", new BlockItem(Blocks.CUT_GRANITE, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item CUT_GRANITE_SLAB = register("cut_granite_slab", new BlockItem(Blocks.CUT_GRANITE_SLAB, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item CUT_GRANITE_STAIRS = register("cut_granite_stairs", new BlockItem(Blocks.CUT_GRANITE_STAIRS, ItemGroups.consistencyPlusLesserStoneItemSettings()));
        public static final Item CUT_GRANITE_WALL = register("cut_granite_wall", new BlockItem(Blocks.CUT_GRANITE_WALL, ItemGroups.consistencyPlusLesserStoneItemSettings()));

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
        public static final Item NETHERITE_STAIRS = register("netherite_stairs", new BlockItem(Blocks.NETHERITE_STAIRS, ItemGroups.consistencyPlusExtraItemSettings()));
        public static final Item SUSPICIOUS_SLAB = register("suspicious_slab", new BlockItem(Blocks.SUSPICIOUS_SLAB, new Item.Settings()));
    //clay
        public static final Item CLAY_SLAB = register("clay_slab", new BlockItem(Blocks.CLAY_SLAB, ItemGroups.consistencyPlusBrickItemSettings()));
        public static final Item CLAY_STAIRS = register("clay_stairs", new BlockItem(Blocks.CLAY_STAIRS, ItemGroups.consistencyPlusBrickItemSettings()));
        public static final Item CLAY_WALL = register("clay_wall", new BlockItem(Blocks.CLAY_WALL, ItemGroups.consistencyPlusBrickItemSettings()));

        public static final Item POLISHED_CLAY = register("polished_clay", new BlockItem(Blocks.POLISHED_CLAY, ItemGroups.consistencyPlusBrickItemSettings()));
        public static final Item POLISHED_CLAY_SLAB = register("polished_clay_slab", new BlockItem(Blocks.POLISHED_CLAY_SLAB, ItemGroups.consistencyPlusBrickItemSettings()));
        public static final Item POLISHED_CLAY_STAIRS = register("polished_clay_stairs", new BlockItem(Blocks.POLISHED_CLAY_STAIRS, ItemGroups.consistencyPlusBrickItemSettings()));
        public static final Item POLISHED_CLAY_WALL = register("polished_clay_wall", new BlockItem(Blocks.POLISHED_CLAY_WALL, ItemGroups.consistencyPlusBrickItemSettings()));

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

    public static final Item CUT_CLAY = register("cut_clay", new BlockItem(Blocks.CUT_CLAY, ItemGroups.consistencyPlusBrickItemSettings()));
        public static final Item CUT_CLAY_SLAB = register("cut_clay_slab", new BlockItem(Blocks.CUT_CLAY_SLAB, ItemGroups.consistencyPlusBrickItemSettings()));
        public static final Item CUT_CLAY_STAIRS = register("cut_clay_stairs", new BlockItem(Blocks.CUT_CLAY_STAIRS, ItemGroups.consistencyPlusBrickItemSettings()));
        public static final Item CUT_CLAY_WALL = register("cut_clay_wall", new BlockItem(Blocks.CUT_CLAY_WALL, ItemGroups.consistencyPlusBrickItemSettings()));

        public static final Item SMOOTH_CLAY = register("smooth_clay", new BlockItem(Blocks.SMOOTH_CLAY, ItemGroups.consistencyPlusBrickItemSettings()));
        public static final Item SMOOTH_CLAY_SLAB = register("smooth_clay_slab", new BlockItem(Blocks.SMOOTH_CLAY_SLAB, ItemGroups.consistencyPlusBrickItemSettings()));
        public static final Item SMOOTH_CLAY_STAIRS = register("smooth_clay_stairs", new BlockItem(Blocks.SMOOTH_CLAY_STAIRS, ItemGroups.consistencyPlusBrickItemSettings()));
        public static final Item SMOOTH_CLAY_WALL = register("smooth_clay_wall", new BlockItem(Blocks.SMOOTH_CLAY_WALL, ItemGroups.consistencyPlusBrickItemSettings()));

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
        public static final Item CRACKED_NETHER_BRICK_SLAB = register("cracked_nether_brick_slab", new BlockItem(Blocks.CRACKED_NETHER_BRICK_SLAB, ItemGroups.consistencyPlusBrickItemSettings()));
        public static final Item CRACKED_NETHER_BRICK_STAIRS = register("cracked_nether_brick_stairs", new BlockItem(Blocks.CRACKED_NETHER_BRICK_STAIRS, ItemGroups.consistencyPlusBrickItemSettings()));
        public static final Item CRACKED_NETHER_BRICK_WALL = register("cracked_nether_brick_wall", new BlockItem(Blocks.CRACKED_NETHER_BRICK_WALL, ItemGroups.consistencyPlusBrickItemSettings()));


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
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        //carved
        //cracked carved
        //mossy carved

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
        public static final Item BLUE_NETHER_BRICKS = register("blue_nether_bricks", new BlockItem(Blocks.BLUE_NETHER_BRICKS, ItemGroups.consistencyPlusBrickItemSettings()));
        public static final Item BLUE_NETHER_BRICK_SLAB = register("blue_nether_brick_slab", new BlockItem(Blocks.BLUE_NETHER_BRICK_SLAB, ItemGroups.consistencyPlusBrickItemSettings()));
        public static final Item BLUE_NETHER_BRICK_STAIRS = register("blue_nether_brick_stairs", new BlockItem(Blocks.BLUE_NETHER_BRICK_STAIRS, ItemGroups.consistencyPlusBrickItemSettings()));
        public static final Item BLUE_NETHER_BRICK_WALL = register("blue_nether_brick_wall", new BlockItem(Blocks.BLUE_NETHER_BRICK_WALL, ItemGroups.consistencyPlusBrickItemSettings()));


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
        public static final Item POLISHED_PRISMARINE = register("polished_prismarine", new BlockItem(Blocks.POLISHED_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item POLISHED_PRISMARINE_SLAB = register("polished_prismarine_slab", new BlockItem(Blocks.POLISHED_PRISMARINE_SLAB, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item POLISHED_PRISMARINE_STAIRS = register("polished_prismarine_stairs", new BlockItem(Blocks.POLISHED_PRISMARINE_STAIRS, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item POLISHED_PRISMARINE_WALL = register("polished_prismarine_wall", new BlockItem(Blocks.POLISHED_PRISMARINE_WALL, ItemGroups.consistencyPlusMiscItemSettings()));


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
        public static final Item SMOOTH_PRISMARINE = register("smooth_prismarine", new BlockItem(Blocks.SMOOTH_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item SMOOTH_PRISMARINE_SLAB = register("smooth_prismarine_slab", new BlockItem(Blocks.SMOOTH_PRISMARINE_SLAB, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item SMOOTH_PRISMARINE_STAIRS = register("smooth_prismarine_stairs", new BlockItem(Blocks.SMOOTH_PRISMARINE_STAIRS, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item SMOOTH_PRISMARINE_WALL = register("smooth_prismarine_wall", new BlockItem(Blocks.SMOOTH_PRISMARINE_WALL, ItemGroups.consistencyPlusMiscItemSettings()));

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
        public static final Item CUT_PRISMARINE = register("cut_prismarine", new BlockItem(Blocks.CUT_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item CUT_PRISMARINE_SLAB = register("cut_prismarine_slab", new BlockItem(Blocks.CUT_PRISMARINE_SLAB, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item CUT_PRISMARINE_STAIRS = register("cut_prismarine_stairs", new BlockItem(Blocks.CUT_PRISMARINE_STAIRS, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item CUT_PRISMARINE_WALL = register("cut_prismarine_wall", new BlockItem(Blocks.CUT_PRISMARINE_WALL, ItemGroups.consistencyPlusMiscItemSettings()));


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
        public static final Item PRISMARINE_BRICK_WALL = register("prismarine_brick_wall", new BlockItem(Blocks.PRISMARINE_BRICK_WALL, ItemGroups.consistencyPlusMiscItemSettings()));

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
        public static final Item CARVED_PRISMARINE = register("carved_prismarine", new BlockItem(Blocks.CARVED_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings()));
        //cracked carved
        //mossy carved

//Dark Prismarine

    //Block
        public static final Item DARK_PRISMARINE_WALL = register("dark_prismarine_wall", new BlockItem(Blocks.DARK_PRISMARINE_WALL, ItemGroups.consistencyPlusMiscItemSettings()));

    //Polished
        public static final Item POLISHED_DARK_PRISMARINE = register("polished_dark_prismarine", new BlockItem(Blocks.POLISHED_DARK_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item POLISHED_DARK_PRISMARINE_SLAB = register("polished_dark_prismarine_slab", new BlockItem(Blocks.POLISHED_DARK_PRISMARINE_SLAB, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item POLISHED_DARK_PRISMARINE_STAIRS = register("polished_dark_prismarine_stairs", new BlockItem(Blocks.POLISHED_DARK_PRISMARINE_STAIRS, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item POLISHED_DARK_PRISMARINE_WALL = register("polished_dark_prismarine_wall", new BlockItem(Blocks.POLISHED_DARK_PRISMARINE_WALL, ItemGroups.consistencyPlusMiscItemSettings()));

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
        public static final Item SMOOTH_DARK_PRISMARINE = register("smooth_dark_prismarine", new BlockItem(Blocks.SMOOTH_DARK_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item SMOOTH_DARK_PRISMARINE_SLAB = register("smooth_dark_prismarine_slab", new BlockItem(Blocks.SMOOTH_DARK_PRISMARINE_SLAB, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item SMOOTH_DARK_PRISMARINE_STAIRS = register("smooth_dark_prismarine_stairs", new BlockItem(Blocks.SMOOTH_DARK_PRISMARINE_STAIRS, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item SMOOTH_DARK_PRISMARINE_WALL = register("smooth_dark_prismarine_wall", new BlockItem(Blocks.SMOOTH_DARK_PRISMARINE_WALL, ItemGroups.consistencyPlusMiscItemSettings()));

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
        public static final Item CUT_DARK_PRISMARINE = register("cut_dark_prismarine", new BlockItem(Blocks.CUT_DARK_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item CUT_DARK_PRISMARINE_SLAB = register("cut_dark_prismarine_slab", new BlockItem(Blocks.CUT_DARK_PRISMARINE_SLAB, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item CUT_DARK_PRISMARINE_STAIRS = register("cut_dark_prismarine_stairs", new BlockItem(Blocks.CUT_DARK_PRISMARINE_STAIRS, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item CUT_DARK_PRISMARINE_WALL = register("cut_dark_prismarine_wall", new BlockItem(Blocks.CUT_DARK_PRISMARINE_WALL, ItemGroups.consistencyPlusMiscItemSettings()));

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
        public static final Item CHISELED_DARK_PRISMARINE = register("chiseled_dark_prismarine", new BlockItem(Blocks.CHISELED_DARK_PRISMARINE, ItemGroups.consistencyPlusMiscItemSettings()));
        //mossy_chiseled_dark_prismarine
        //cracked_chiseled_dark_prismarine
        public static final Item DARK_PRISMARINE_PILLAR = register("dark_prismarine_pillar", new BlockItem(Blocks.DARK_PRISMARINE_PILLAR, ItemGroups.consistencyPlusMiscItemSettings()));
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
        public static final Item PURPUR_BLOCK = register("purpur_block", new BlockItem(Blocks.PURPUR_BLOCK, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item PURPUR_SLAB = register("purpur_slab", new BlockItem(Blocks.PURPUR_SLAB, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item PURPUR_STAIRS = register("purpur_stairs", new BlockItem(Blocks.PURPUR_STAIRS, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item PURPUR_WALL = register("purpur_wall", new BlockItem(Blocks.PURPUR_WALL, ItemGroups.consistencyPlusMiscItemSettings()));

    //Smooth
        public static final Item SMOOTH_PURPUR_BLOCK = register("smooth_purpur_block", new BlockItem(Blocks.SMOOTH_PURPUR_BLOCK, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item SMOOTH_PURPUR_SLAB = register("smooth_purpur_slab", new BlockItem(Blocks.SMOOTH_PURPUR_SLAB, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item SMOOTH_PURPUR_STAIRS = register("smooth_purpur_stairs", new BlockItem(Blocks.SMOOTH_PURPUR_STAIRS, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item SMOOTH_PURPUR_WALL = register("smooth_purpur_wall", new BlockItem(Blocks.SMOOTH_PURPUR_WALL, ItemGroups.consistencyPlusMiscItemSettings()));

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
        public static final Item POLISHED_PURPUR_BLOCK = register("polished_purpur_block", new BlockItem(Blocks.POLISHED_PURPUR_BLOCK, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item POLISHED_PURPUR_SLAB = register("polished_purpur_slab", new BlockItem(Blocks.POLISHED_PURPUR_SLAB, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item POLISHED_PURPUR_STAIRS = register("polished_purpur_stairs", new BlockItem(Blocks.POLISHED_PURPUR_STAIRS, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item POLISHED_PURPUR_WALL = register("polished_purpur_wall", new BlockItem(Blocks.POLISHED_PURPUR_WALL, ItemGroups.consistencyPlusMiscItemSettings()));

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
        public static final Item CUT_PURPUR_WALL = register("cut_purpur_wall", new BlockItem(Blocks.CUT_PURPUR_WALL, ItemGroups.consistencyPlusMiscItemSettings()));

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
        public static final Item PURPUR_BRICKS = register("purpur_bricks", new BlockItem(Blocks.PURPUR_BRICKS, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item PURPUR_BRICK_SLAB = register("purpur_brick_slab", new BlockItem(Blocks.PURPUR_BRICK_SLAB, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item PURPUR_BRICK_STAIRS = register("purpur_brick_stairs", new BlockItem(Blocks.PURPUR_BRICK_STAIRS, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item PURPUR_BRICK_WALL = register("purpur_brick_wall", new BlockItem(Blocks.PURPUR_BRICK_WALL, ItemGroups.consistencyPlusMiscItemSettings()));

    //Cracked Bricks
        public static final Item CRACKED_PURPUR_BRICKS = register("cracked_purpur_bricks", new BlockItem(Blocks.CRACKED_PURPUR_BRICKS, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item CRACKED_PURPUR_BRICK_SLAB = register("cracked_purpur_brick_slab", new BlockItem(Blocks.CRACKED_PURPUR_BRICK_SLAB, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item CRACKED_PURPUR_BRICK_STAIRS = register("cracked_purpur_brick_stairs", new BlockItem(Blocks.CRACKED_PURPUR_BRICK_STAIRS, ItemGroups.consistencyPlusMiscItemSettings()));
        public static final Item CRACKED_PURPUR_BRICK_WALL = register("cracked_purpur_brick_wall", new BlockItem(Blocks.CRACKED_PURPUR_BRICK_WALL, ItemGroups.consistencyPlusMiscItemSettings()));

    //Mossy Bricks
        //mossy_purpur_bricks
        //mossy_purpur_brick_slab
        //mossy_purpur_brick_stairs
        //mossy_purpur_brick_wall

    //Pillars and Chiseled
        public static final Item CHISELED_PURPUR_BLOCK = register("chiseled_purpur_block", new BlockItem(Blocks.CHISELED_PURPUR_BLOCK, ItemGroups.consistencyPlusMiscItemSettings()));
        //mossy_chiseled_purpur
        //cracked_chiseled_purpur
        //mossy_purpur_pillar
        //cracked_purpur_pillar
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        public static final Item CARVED_PURPUR = register("carved_purpur", new BlockItem(Blocks.CARVED_PURPUR, ItemGroups.consistencyPlusMiscItemSettings()));
        //cracked carved
        //mossy carved

//End Stone

    //Block
        public static final Item END_STONE_SLAB = register("end_stone_slab", new BlockItem(Blocks.END_STONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item END_STONE_STAIRS = register("end_stone_stairs", new BlockItem(Blocks.END_STONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item END_STONE_WALL = register("end_stone_wall", new BlockItem(Blocks.END_STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings()));

    //Smooth
        public static final Item SMOOTH_END_STONE = register("smooth_end_stone", new BlockItem(Blocks.SMOOTH_END_STONE, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item SMOOTH_END_STONE_SLAB = register("smooth_end_stone_slab", new BlockItem(Blocks.SMOOTH_END_STONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item SMOOTH_END_STONE_STAIRS = register("smooth_end_stone_stairs", new BlockItem(Blocks.SMOOTH_END_STONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item SMOOTH_END_STONE_WALL = register("smooth_end_stone_wall", new BlockItem(Blocks.SMOOTH_END_STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings()));

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

    //CUT
        public static final Item CUT_END_STONE = register("cut_end_stone", new BlockItem(Blocks.CUT_END_STONE, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item CUT_END_STONE_SLAB = register("cut_end_stone_slab", new BlockItem(Blocks.CUT_END_STONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item CUT_END_STONE_STAIRS = register("cut_end_stone_stairs", new BlockItem(Blocks.CUT_END_STONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item CUT_END_STONE_WALL = register("cut_end_stone_wall", new BlockItem(Blocks.CUT_END_STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings()));

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
        public static final Item POLISHED_END_STONE = register("polished_end_stone", new BlockItem(Blocks.POLISHED_END_STONE, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item POLISHED_END_STONE_SLAB = register("polished_end_stone_slab", new BlockItem(Blocks.POLISHED_END_STONE_SLAB, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item POLISHED_END_STONE_STAIRS = register("polished_end_stone_stairs", new BlockItem(Blocks.POLISHED_END_STONE_STAIRS, ItemGroups.consistencyPlusStoneItemSettings()));
        public static final Item POLISHED_END_STONE_WALL = register("polished_end_stone_wall", new BlockItem(Blocks.POLISHED_END_STONE_WALL, ItemGroups.consistencyPlusStoneItemSettings()));

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
        public static final Item CHISELED_END_STONE = register("chiseled_end_stone", new BlockItem(Blocks.CHISELED_END_STONE, ItemGroups.consistencyPlusStoneItemSettings()));
        //mossy_chiseled_end_stone_bricks
        //cracked_chiseled_end_stone_bricks
        //end_stone_brick_pillar
        //mossy_end_stone_brick_pillar
        //cracked_end_stone_brick_pillar
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        public static final Item CARVED_END_STONE = register("carved_end_stone", new BlockItem(Blocks.CARVED_END_STONE, ItemGroups.consistencyPlusStoneItemSettings()));
        //cracked carved
        //mossy carved

//Terracotta

    //Terracotta Slab
        public static final Item RED_TERRACOTTA_SLAB = register("red_terracotta_slab", new BlockItem(Blocks.RED_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item ORANGE_TERRACOTTA_SLAB = register("orange_terracotta_slab", new BlockItem(Blocks.ORANGE_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item YELLOW_TERRACOTTA_SLAB = register("yellow_terracotta_slab", new BlockItem(Blocks.YELLOW_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIME_TERRACOTTA_SLAB = register("lime_terracotta_slab", new BlockItem(Blocks.LIME_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item GREEN_TERRACOTTA_SLAB = register("green_terracotta_slab", new BlockItem(Blocks.GREEN_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BLUE_TERRACOTTA_SLAB = register("blue_terracotta_slab", new BlockItem(Blocks.BLUE_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item CYAN_TERRACOTTA_SLAB = register("cyan_terracotta_slab", new BlockItem(Blocks.CYAN_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIGHT_BLUE_TERRACOTTA_SLAB = register("light_blue_terracotta_slab", new BlockItem(Blocks.LIGHT_BLUE_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item PURPLE_TERRACOTTA_SLAB = register("purple_terracotta_slab", new BlockItem(Blocks.PURPLE_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item MAGENTA_TERRACOTTA_SLAB = register("magenta_terracotta_slab", new BlockItem(Blocks.MAGENTA_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item PINK_TERRACOTTA_SLAB = register("pink_terracotta_slab", new BlockItem(Blocks.PINK_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item WHITE_TERRACOTTA_SLAB = register("white_terracotta_slab", new BlockItem(Blocks.WHITE_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIGHT_GRAY_TERRACOTTA_SLAB = register("light_gray_terracotta_slab", new BlockItem(Blocks.LIGHT_GRAY_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item GRAY_TERRACOTTA_SLAB = register("gray_terracotta_slab", new BlockItem(Blocks.GRAY_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BLACK_TERRACOTTA_SLAB = register("black_terracotta_slab", new BlockItem(Blocks.BLACK_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BROWN_TERRACOTTA_SLAB = register("brown_terracotta_slab", new BlockItem(Blocks.BROWN_TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item TERRACOTTA_SLAB = register("terracotta_slab", new BlockItem(Blocks.TERRACOTTA_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));


    //Terracotta Stairs
        public static final Item RED_TERRACOTTA_STAIRS = register("red_terracotta_stairs", new BlockItem(Blocks.RED_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item ORANGE_TERRACOTTA_STAIRS = register("orange_terracotta_stairs", new BlockItem(Blocks.ORANGE_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item YELLOW_TERRACOTTA_STAIRS = register("yellow_terracotta_stairs", new BlockItem(Blocks.YELLOW_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIME_TERRACOTTA_STAIRS = register("lime_terracotta_stairs", new BlockItem(Blocks.LIME_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item GREEN_TERRACOTTA_STAIRS = register("green_terracotta_stairs", new BlockItem(Blocks.GREEN_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BLUE_TERRACOTTA_STAIRS = register("blue_terracotta_stairs", new BlockItem(Blocks.BLUE_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item CYAN_TERRACOTTA_STAIRS = register("cyan_terracotta_stairs", new BlockItem(Blocks.CYAN_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIGHT_BLUE_TERRACOTTA_STAIRS = register("light_blue_terracotta_stairs", new BlockItem(Blocks.LIGHT_BLUE_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item PURPLE_TERRACOTTA_STAIRS = register("purple_terracotta_stairs", new BlockItem(Blocks.PURPLE_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item MAGENTA_TERRACOTTA_STAIRS = register("magenta_terracotta_stairs", new BlockItem(Blocks.MAGENTA_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item PINK_TERRACOTTA_STAIRS = register("pink_terracotta_stairs", new BlockItem(Blocks.PINK_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item WHITE_TERRACOTTA_STAIRS = register("white_terracotta_stairs", new BlockItem(Blocks.WHITE_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIGHT_GRAY_TERRACOTTA_STAIRS = register("light_gray_terracotta_stairs", new BlockItem(Blocks.LIGHT_GRAY_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item GRAY_TERRACOTTA_STAIRS = register("gray_terracotta_stairs", new BlockItem(Blocks.GRAY_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BLACK_TERRACOTTA_STAIRS = register("black_terracotta_stairs", new BlockItem(Blocks.BLACK_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BROWN_TERRACOTTA_STAIRS = register("brown_terracotta_stairs", new BlockItem(Blocks.BROWN_TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item TERRACOTTA_STAIRS = register("terracotta_stairs", new BlockItem(Blocks.TERRACOTTA_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));


    //Terracotta Wall
        public static final Item RED_TERRACOTTA_WALL = register("red_terracotta_wall", new BlockItem(Blocks.RED_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item ORANGE_TERRACOTTA_WALL = register("orange_terracotta_wall", new BlockItem(Blocks.ORANGE_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item YELLOW_TERRACOTTA_WALL = register("yellow_terracotta_wall", new BlockItem(Blocks.YELLOW_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIME_TERRACOTTA_WALL = register("lime_terracotta_wall", new BlockItem(Blocks.LIME_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item GREEN_TERRACOTTA_WALL = register("green_terracotta_wall", new BlockItem(Blocks.GREEN_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BLUE_TERRACOTTA_WALL = register("blue_terracotta_wall", new BlockItem(Blocks.BLUE_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item CYAN_TERRACOTTA_WALL = register("cyan_terracotta_wall", new BlockItem(Blocks.CYAN_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIGHT_BLUE_TERRACOTTA_WALL = register("light_blue_terracotta_wall", new BlockItem(Blocks.LIGHT_BLUE_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item PURPLE_TERRACOTTA_WALL = register("purple_terracotta_wall", new BlockItem(Blocks.PURPLE_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item MAGENTA_TERRACOTTA_WALL = register("magenta_terracotta_wall", new BlockItem(Blocks.MAGENTA_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item PINK_TERRACOTTA_WALL = register("pink_terracotta_wall", new BlockItem(Blocks.PINK_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item WHITE_TERRACOTTA_WALL = register("white_terracotta_wall", new BlockItem(Blocks.WHITE_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIGHT_GRAY_TERRACOTTA_WALL = register("light_gray_terracotta_wall", new BlockItem(Blocks.LIGHT_GRAY_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item GRAY_TERRACOTTA_WALL = register("gray_terracotta_wall", new BlockItem(Blocks.GRAY_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BLACK_TERRACOTTA_WALL = register("black_terracotta_wall", new BlockItem(Blocks.BLACK_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BROWN_TERRACOTTA_WALL = register("brown_terracotta_wall", new BlockItem(Blocks.BROWN_TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item TERRACOTTA_WALL = register("terracotta_wall", new BlockItem(Blocks.TERRACOTTA_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));



//Concrete

    //Terracotta Slab
        public static final Item RED_CONCRETE_SLAB = register("red_concrete_slab", new BlockItem(Blocks.RED_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item ORANGE_CONCRETE_SLAB = register("orange_concrete_slab", new BlockItem(Blocks.ORANGE_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab", new BlockItem(Blocks.YELLOW_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIME_CONCRETE_SLAB = register("lime_concrete_slab", new BlockItem(Blocks.LIME_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item GREEN_CONCRETE_SLAB = register("green_concrete_slab", new BlockItem(Blocks.GREEN_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BLUE_CONCRETE_SLAB = register("blue_concrete_slab", new BlockItem(Blocks.BLUE_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item CYAN_CONCRETE_SLAB = register("cyan_concrete_slab", new BlockItem(Blocks.CYAN_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab", new BlockItem(Blocks.LIGHT_BLUE_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item PURPLE_CONCRETE_SLAB = register("purple_concrete_slab", new BlockItem(Blocks.PURPLE_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab", new BlockItem(Blocks.MAGENTA_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item PINK_CONCRETE_SLAB = register("pink_concrete_slab", new BlockItem(Blocks.PINK_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item WHITE_CONCRETE_SLAB = register("white_concrete_slab", new BlockItem(Blocks.WHITE_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab", new BlockItem(Blocks.LIGHT_GRAY_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item GRAY_CONCRETE_SLAB = register("gray_concrete_slab", new BlockItem(Blocks.GRAY_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BLACK_CONCRETE_SLAB = register("black_concrete_slab", new BlockItem(Blocks.BLACK_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BROWN_CONCRETE_SLAB = register("brown_concrete_slab", new BlockItem(Blocks.BROWN_CONCRETE_SLAB, ItemGroups.consistencyPlusDyeableItemSettings()));

    //Terracotta Stairs
        public static final Item RED_CONCRETE_STAIRS = register("red_concrete_stairs", new BlockItem(Blocks.RED_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs", new BlockItem(Blocks.ORANGE_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs", new BlockItem(Blocks.YELLOW_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIME_CONCRETE_STAIRS = register("lime_concrete_stairs", new BlockItem(Blocks.LIME_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item GREEN_CONCRETE_STAIRS = register("green_concrete_stairs", new BlockItem(Blocks.GREEN_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs", new BlockItem(Blocks.BLUE_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs", new BlockItem(Blocks.CYAN_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs", new BlockItem(Blocks.LIGHT_BLUE_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item PURPLE_CONCRETE_STAIRS = register("purple_concrete_stairs", new BlockItem(Blocks.PURPLE_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item MAGENTA_CONCRETE_STAIRS = register("magenta_concrete_stairs", new BlockItem(Blocks.MAGENTA_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item PINK_CONCRETE_STAIRS = register("pink_concrete_stairs", new BlockItem(Blocks.PINK_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item WHITE_CONCRETE_STAIRS = register("white_concrete_stairs", new BlockItem(Blocks.WHITE_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIGHT_GRAY_CONCRETE_STAIRS = register("light_gray_concrete_stairs", new BlockItem(Blocks.LIGHT_GRAY_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item GRAY_CONCRETE_STAIRS = register("gray_concrete_stairs", new BlockItem(Blocks.GRAY_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BLACK_CONCRETE_STAIRS = register("black_concrete_stairs", new BlockItem(Blocks.BLACK_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BROWN_CONCRETE_STAIRS = register("brown_concrete_stairs", new BlockItem(Blocks.BROWN_CONCRETE_STAIRS, ItemGroups.consistencyPlusDyeableItemSettings()));


    //Terracotta Wall
        public static final Item RED_CONCRETE_WALL = register("red_concrete_wall", new BlockItem(Blocks.RED_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item ORANGE_CONCRETE_WALL = register("orange_concrete_wall", new BlockItem(Blocks.ORANGE_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item YELLOW_CONCRETE_WALL = register("yellow_concrete_wall", new BlockItem(Blocks.YELLOW_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIME_CONCRETE_WALL = register("lime_concrete_wall", new BlockItem(Blocks.LIME_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item GREEN_CONCRETE_WALL = register("green_concrete_wall", new BlockItem(Blocks.GREEN_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BLUE_CONCRETE_WALL = register("blue_concrete_wall", new BlockItem(Blocks.BLUE_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item CYAN_CONCRETE_WALL = register("cyan_concrete_wall", new BlockItem(Blocks.CYAN_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIGHT_BLUE_CONCRETE_WALL = register("light_blue_concrete_wall", new BlockItem(Blocks.LIGHT_BLUE_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item PURPLE_CONCRETE_WALL = register("purple_concrete_wall", new BlockItem(Blocks.PURPLE_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item MAGENTA_CONCRETE_WALL = register("magenta_concrete_wall", new BlockItem(Blocks.MAGENTA_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item PINK_CONCRETE_WALL = register("pink_concrete_wall", new BlockItem(Blocks.PINK_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item WHITE_CONCRETE_WALL = register("white_concrete_wall", new BlockItem(Blocks.WHITE_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item LIGHT_GRAY_CONCRETE_WALL = register("light_gray_concrete_wall", new BlockItem(Blocks.LIGHT_GRAY_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item GRAY_CONCRETE_WALL = register("gray_concrete_wall", new BlockItem(Blocks.GRAY_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BLACK_CONCRETE_WALL = register("black_concrete_wall", new BlockItem(Blocks.BLACK_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));
        public static final Item BROWN_CONCRETE_WALL = register("brown_concrete_wall", new BlockItem(Blocks.BROWN_CONCRETE_WALL, ItemGroups.consistencyPlusDyeableItemSettings()));

    //Obsidian
        public static final Item OBSIDIAN_WALL = register("obsidian_wall", new BlockItem(Blocks.OBSIDIAN_WALL, ItemGroups.consistencyPlusExtraItemSettings()));
        public static final Item OBSIDIAN_SLAB = register("obsidian_slab", new BlockItem(Blocks.OBSIDIAN_SLAB, ItemGroups.consistencyPlusExtraItemSettings()));
        public static final Item OBSIDIAN_STAIRS = register("obsidian_stairs", new BlockItem(Blocks.OBSIDIAN_STAIRS, ItemGroups.consistencyPlusExtraItemSettings()));

     //Crying Obsidian
        public static final Item CRYING_OBSIDIAN_WALL = register("crying_obsidian_wall", new BlockItem(Blocks.CRYING_OBSIDIAN_WALL, ItemGroups.consistencyPlusExtraItemSettings()));
        public static final Item CRYING_OBSIDIAN_SLAB = register("crying_obsidian_slab", new BlockItem(Blocks.CRYING_OBSIDIAN_SLAB, ItemGroups.consistencyPlusExtraItemSettings()));
        public static final Item CRYING_OBSIDIAN_STAIRS = register("crying_obsidian_stairs", new BlockItem(Blocks.CRYING_OBSIDIAN_STAIRS, ItemGroups.consistencyPlusExtraItemSettings()));

    //Soul o'Lantern
        public static final Item JACK_O_SOUL = register("jack_o_soul", new BlockItem(Blocks.JACK_O_SOUL, ItemGroups.consistencyPlusExtraItemSettings()));

    public static final Item DEVIN_BLOCKERA = register("devin_blockera", new BlockItem(Blocks.DEVIN_BLOCKERA, new Item.Settings()));
    public static final Item BROKEN_MODIFIKATION = register("broken_modifikation", new BlockItem(Blocks.BROKEN_MODIFIKATION, new Item.Settings()));

    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("consistency_plus", name), item);
    }
    public static void init() {
    }
}
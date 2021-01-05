package net.consistencyteam.consistency_plus;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Items {

//Stone

    //Smooth
        public static final Item SMOOTH_STONE_WALL = register("smooth_stone_wall", new BlockItem(Blocks.SMOOTH_STONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item SMOOTH_STONE_STAIRS = register("smooth_stone_stairs", new BlockItem(Blocks.SMOOTH_STONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Cut
        public static final Item CUT_STONE = register("cut_stone", new BlockItem(Blocks.CUT_STONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CUT_STONE_SLAB = register("cut_stone_slab", new BlockItem(Blocks.CUT_STONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CUT_STONE_STAIRS = register("cut_stone_stairs", new BlockItem(Blocks.CUT_STONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CUT_STONE_WALL = register("cut_stone_wall", new BlockItem(Blocks.CUT_STONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Polished
        public static final Item POLISHED_STONE = register("polished_stone", new BlockItem(Blocks.POLISHED_STONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item POLISHED_STONE_WALL = register("polished_stone_wall", new BlockItem(Blocks.POLISHED_STONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item POLISHED_STONE_STAIRS = register("polished_stone_stairs", new BlockItem(Blocks.POLISHED_STONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item POLISHED_STONE_SLAB = register("polished_stone_slab", new BlockItem(Blocks.POLISHED_STONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Cracked Bricks
        public static final Item CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab", new BlockItem(Blocks.CRACKED_STONE_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", new BlockItem(Blocks.CRACKED_STONE_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", new BlockItem(Blocks.CRACKED_STONE_BRICK_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Pillar and Chiseled
        public static final Item STONE_BRICK_PILLAR = register("stone_brick_pillar", new BlockItem(Blocks.STONE_BRICK_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item MOSSY_STONE_BRICK_PILLAR = register("mossy_stone_brick_pillar", new BlockItem(Blocks.MOSSY_STONE_BRICK_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CRACKED_STONE_BRICK_PILLAR = register("cracked_stone_brick_pillar", new BlockItem(Blocks.CRACKED_STONE_BRICK_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CRACKED_CHISELED_STONE_BRICKS = register("cracked_chiseled_stone_bricks", new BlockItem(Blocks.CRACKED_CHISELED_STONE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item MOSSY_CHISELED_STONE_BRICKS = register("mossy_chiseled_stone_bricks", new BlockItem(Blocks.MOSSY_CHISELED_STONE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item STONE_WALL = register("stone_wall", new BlockItem(Blocks.STONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
//Blackstone

    //Smooth
        public static final Item SMOOTH_BLACKSTONE = register("smooth_blackstone", new BlockItem(Blocks.SMOOTH_BLACKSTONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item SMOOTH_BLACKSTONE_SLAB = register("smooth_blackstone_slab", new BlockItem(Blocks.SMOOTH_BLACKSTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item SMOOTH_BLACKSTONE_STAIRS = register("smooth_blackstone_stairs", new BlockItem(Blocks.SMOOTH_BLACKSTONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item SMOOTH_BLACKSTONE_WALL = register("smooth_blackstone_wall", new BlockItem(Blocks.SMOOTH_BLACKSTONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Cut
        public static final Item CUT_BLACKSTONE = register("cut_blackstone", new BlockItem(Blocks.CUT_BLACKSTONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CUT_BLACKSTONE_SLAB = register("cut_blackstone_slab", new BlockItem(Blocks.CUT_BLACKSTONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CUT_BLACKSTONE_STAIRS = register("cut_blackstone_stairs", new BlockItem(Blocks.CUT_BLACKSTONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CUT_BLACKSTONE_WALL = register("cut_blackstone_wall", new BlockItem(Blocks.CUT_BLACKSTONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Cracked
        public static final Item CRACKED_BLACKSTONE_BRICK_SLAB = register("cracked_blackstone_brick_slab", new BlockItem(Blocks.CRACKED_BLACKSTONE_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CRACKED_BLACKSTONE_BRICK_STAIRS = register("cracked_blackstone_brick_stairs", new BlockItem(Blocks.CRACKED_BLACKSTONE_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CRACKED_BLACKSTONE_BRICK_WALL = register("cracked_blackstone_brick_wall", new BlockItem(Blocks.CRACKED_BLACKSTONE_BRICK_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Mossy
        public static final Item MOSSY_BLACKSTONE_BRICKS = register("mossy_blackstone_bricks", new BlockItem(Blocks.MOSSY_BLACKSTONE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item MOSSY_BLACKSTONE_BRICK_SLAB = register("mossy_blackstone_brick_slab", new BlockItem(Blocks.MOSSY_BLACKSTONE_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item MOSSY_BLACKSTONE_BRICK_STAIRS = register("mossy_blackstone_brick_stairs", new BlockItem(Blocks.MOSSY_BLACKSTONE_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item MOSSY_BLACKSTONE_BRICK_WALL = register("mossy_blackstone_brick_wall", new BlockItem(Blocks.MOSSY_BLACKSTONE_BRICK_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Pillars and Chiseled
        //mossy_chiseled_blackstone_bricks
        //cracked_chiseled_blackstone_bricks
        public static final Item BLACKSTONE_BRICK_PILLAR = register("blackstone_brick_pillar", new BlockItem(Blocks.BLACKSTONE_BRICK_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        //mossy_chiseled_blackstone_pillar
        //cracked_chiseled_blackstone_pillar


//Sandstone

    //Smooth
        //smooth_sandstone_wall

    //Cut
        //cut_sandstone_stairs
        //cut_sandstone_wall

    //Polished
        //polished_sandstone
        //polished_sandstone_slab
        //polished_sandstone_stairs
        //polished_sandstone_wall

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


//Red Sandstone

    //Smooth
        //smooth_red_sandstone_wall

    //Cut
        //cut_red_sandstone_stairs
        //cut_red_sandstone_wall

    //Polished
        //polished_red_sandstone
        //polished_red_sandstone_slab
        //polished_red_sandstone_stairs
        //polished_red_sandstone_wall

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

//Quartz

    //Block
        public static final Item QUARTZ_WALL = register("quartz_wall", new BlockItem(Blocks.QUARTZ_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));


    //Smooth
        public static final Item SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall", new BlockItem(Blocks.SMOOTH_QUARTZ_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Cut
        public static final Item CUT_QUARTZ = register("cut_quartz", new BlockItem(Blocks.CUT_QUARTZ, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CUT_QUARTZ_SLAB = register("cut_quartz_slab", new BlockItem(Blocks.CUT_QUARTZ_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CUT_QUARTZ_STAIRS = register("cut_quartz_stairs", new BlockItem(Blocks.CUT_QUARTZ_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CUT_QUARTZ_WALL = register("cut_quartz_wall", new BlockItem(Blocks.CUT_QUARTZ_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Polished
        //polished_quartz
        //polished_quartz_slab
        //polished_quartz_stairs
        //polished_quartz_wall

    //Bricks
        //quartz_brick_slab
        //quartz_brick_stairs
        //quartz_brick_wall

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


//Andesite

    //Polished
        //polished_andesite_wall

    //Smooth
        //smooth_andesite
        public static final Item SMOOTH_ANDESITE = register("smooth_andesite", new BlockItem(Blocks.SMOOTH_ANDESITE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item SMOOTH_ANDESITE_SLAB = register("smooth_andesite_slab", new BlockItem(Blocks.SMOOTH_ANDESITE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item SMOOTH_ANDESITE_STAIRS = register("smooth_andesite_stairs", new BlockItem(Blocks.SMOOTH_ANDESITE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item SMOOTH_ANDESITE_WALL = register("smooth_andesite_wall", new BlockItem(Blocks.SMOOTH_ANDESITE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Cut
        //cut_andesite
        //cut_andesite_slab
        //cut_andesite_stairs
        //cut_andesite_wall

    //Bricks
        //andesite_bricks
        //andesite_brick_slab
        //andesite_brick_stairs
        //andesite_brick_wall

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

//Diorite

    //Polished
        //polished_diorite_wall

    //Smooth
        //smooth_diorite
        //smooth_diorite_slab
        //smooth_diorite_stairs
        //smooth_diorite_wall

    //Cut
        //cut_diorite
        //cut_diorite_slab
        //cut_diorite_stairs
        //cut_diorite_wall

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


//Granite

    //Polished
        //polished_granite_wall

    //Smooth
        //smooth_granite
        //smooth_granite_slab
        //smooth_granite_stairs
        //smooth_granite_wall

    //Cut
        //cut_granite
        //cut_granite_slab
        //cut_granite_stairs
        //cut_granite_wall

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


//Prismarine

    //Polished
        //polished_prismarine
        //polished_prismarine_slabs
        //polished_prismarine_stairs
        //polished_prismarine_wall

    //Smooth
        //smooth_prismarine
        //smooth_prismarine_slab
        //smooth_prismarine_stairs
        //smooth_prismarine_wall

    //Cut
        //cut_prismarine
        //cut_prismarine_slab
        //cut_prismarine_stairs
        //cut_prismarine_wall

    //Bricks
        //prismarine_brick_wall

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


//Dark Prismarine

    //Block
        //dark_prismarine_wall

    //Polished
        //polished_dark_prismarine
        //polished_dark_prismarine_slabs
        //polished_dark_prismarine_stairs
        //polished_dark_prismarine_wall

    //Smooth
        //smooth_dark_prismarine
        //smooth_dark_prismarine_slab
        //smooth_dark_prismarine_stairs
        //smooth_dark_prismarine_wall

    //Cut
        //cut_dark_prismarine
        //cut_dark_prismarine_slab
        //cut_dark_prismarine_stairs
        //cut_dark_prismarine_wall

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
        //chiseled_dark_prismarine
        //mossy_chiseled_dark_prismarine
        //cracked_chiseled_dark_prismarine
        //dark_prismarine_pillar
        //mossy_dark_prismarine_pillar
        //cracked_dark_prismarine_pillar


//Purpur

    //Block
        public static final Item PURPUR_BLOCK = register("purpur_block", new BlockItem(Blocks.PURPUR_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item PURPUR_SLAB = register("purpur_slab", new BlockItem(Blocks.PURPUR_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item PURPUR_STAIRS = register("purpur_stairs", new BlockItem(Blocks.PURPUR_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item PURPUR_WALL = register("purpur_wall", new BlockItem(Blocks.PURPUR_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Smooth
        public static final Item SMOOTH_PURPUR_BLOCK = register("smooth_purpur_block", new BlockItem(Blocks.SMOOTH_PURPUR_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item SMOOTH_PURPUR_SLAB = register("smooth_purpur_slab", new BlockItem(Blocks.SMOOTH_PURPUR_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item SMOOTH_PURPUR_STAIRS = register("smooth_purpur_stairs", new BlockItem(Blocks.SMOOTH_PURPUR_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item SMOOTH_PURPUR_WALL = register("smooth_purpur_wall", new BlockItem(Blocks.SMOOTH_PURPUR_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Polished
        public static final Item POLISHED_PURPUR_BLOCK = register("polished_purpur_block", new BlockItem(Blocks.POLISHED_PURPUR_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item POLISHED_PURPUR_SLAB = register("polished_purpur_slab", new BlockItem(Blocks.POLISHED_PURPUR_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item POLISHED_PURPUR_STAIRS = register("polished_purpur_stairs", new BlockItem(Blocks.POLISHED_PURPUR_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item POLISHED_PURPUR_WALL = register("polished_purpur_wall", new BlockItem(Blocks.POLISHED_PURPUR_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));


    //Cut
        public static final Item CUT_PURPUR_WALL = register("cut_purpur_wall", new BlockItem(Blocks.CUT_PURPUR_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Bricks
        public static final Item PURPUR_BRICKS = register("purpur_bricks", new BlockItem(Blocks.PURPUR_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item PURPUR_BRICK_SLAB = register("purpur_brick_slab", new BlockItem(Blocks.PURPUR_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item PURPUR_BRICK_STAIRS = register("purpur_brick_stairs", new BlockItem(Blocks.PURPUR_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item PURPUR_BRICK_WALL = register("purpur_brick_wall", new BlockItem(Blocks.PURPUR_BRICK_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Cracked Bricks
        public static final Item CRACKED_PURPUR_BRICKS = register("cracked_purpur_bricks", new BlockItem(Blocks.CRACKED_PURPUR_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CRACKED_PURPUR_BRICK_SLAB = register("cracked_purpur_brick_slab", new BlockItem(Blocks.CRACKED_PURPUR_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CRACKED_PURPUR_BRICK_STAIRS = register("cracked_purpur_brick_stairs", new BlockItem(Blocks.CRACKED_PURPUR_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CRACKED_PURPUR_BRICK_WALL = register("cracked_purpur_brick_wall", new BlockItem(Blocks.CRACKED_PURPUR_BRICK_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Mossy Bricks
        //mossy_purpur_bricks
        //mossy_purpur_brick_slab
        //mossy_purpur_brick_stairs
        //mossy_purpur_brick_wall

    //Pillars and Chiseled
        public static final Item CHISELED_PURPUR_BLOCK = register("chiseled_purpur_block", new BlockItem(Blocks.CHISELED_PURPUR_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        //mossy_chiseled_purpur
        //cracked_chiseled_purpur
        //mossy_purpur_pillar
        //cracked_purpur_pillar


//End Stone

    //Block
        public static final Item END_STONE_SLAB = register("end_stone_slab", new BlockItem(Blocks.END_STONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item END_STONE_STAIRS = register("end_stone_stairs", new BlockItem(Blocks.END_STONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item END_STONE_WALL = register("end_stone_wall", new BlockItem(Blocks.END_STONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Smooth
        public static final Item SMOOTH_END_STONE = register("smooth_end_stone", new BlockItem(Blocks.SMOOTH_END_STONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item SMOOTH_END_STONE_SLAB = register("smooth_end_stone_slab", new BlockItem(Blocks.SMOOTH_END_STONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item SMOOTH_END_STONE_STAIRS = register("smooth_end_stone_stairs", new BlockItem(Blocks.SMOOTH_END_STONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item SMOOTH_END_STONE_WALL = register("smooth_end_stone_wall", new BlockItem(Blocks.SMOOTH_END_STONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //CUT
        public static final Item CUT_END_STONE = register("cut_end_stone", new BlockItem(Blocks.CUT_END_STONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CUT_END_STONE_SLAB = register("cut_end_stone_slab", new BlockItem(Blocks.CUT_END_STONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CUT_END_STONE_STAIRS = register("cut_end_stone_stairs", new BlockItem(Blocks.CUT_END_STONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item CUT_END_STONE_WALL = register("cut_end_stone_wall", new BlockItem(Blocks.CUT_END_STONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    //Polished
        public static final Item POLISHED_END_STONE = register("polished_end_stone", new BlockItem(Blocks.POLISHED_END_STONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item POLISHED_END_STONE_SLAB = register("polished_end_stone_slab", new BlockItem(Blocks.POLISHED_END_STONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item POLISHED_END_STONE_STAIRS = register("polished_end_stone_stairs", new BlockItem(Blocks.POLISHED_END_STONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        public static final Item POLISHED_END_STONE_WALL = register("polished_end_stone_wall", new BlockItem(Blocks.POLISHED_END_STONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

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
        public static final Item CHISELED_END_STONE = register("chiseled_end_stone", new BlockItem(Blocks.CHISELED_END_STONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        //mossy_chiseled_end_stone_bricks
        //cracked_chiseled_end_stone_bricks
        //end_stone_brick_pillar
        //mossy_end_stone_brick_pillar
        //cracked_end_stone_brick_pillar


    public static final Item DEVIN_BLOCKERA = register("devin_blockera", new BlockItem(Blocks.DEVIN_BLOCKERA, new Item.Settings()));
    public static final Item BROKEN_MODIFIKATION = register("broken_modifikation", new BlockItem(Blocks.BROKEN_MODIFIKATION, new Item.Settings()));

    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("consistency_plus", name), item);
    }
    public static void init() {
    }
}
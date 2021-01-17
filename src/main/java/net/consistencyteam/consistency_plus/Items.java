package net.consistencyteam.consistency_plus;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Items {

    private static final ItemGroup CONSISTENCY_PLUS_GROUP = FabricItemGroupBuilder.build(new Identifier("consistency_plus", "group"), () -> new ItemStack(Blocks.STONE_BRICK_PILLAR));

    public static Item.Settings itemSettings() {
        return new Item.Settings().group(CONSISTENCY_PLUS_GROUP);
    }

    /*
    templates:
    block item: public static final Item SMOOTH_STONE_WALL = register("smooth_stone_wall", new BlockItem(Blocks.SMOOTH_STONE_WALL, itemSettings()));
     */
//Stone
    //Smooth
        public static final Item SMOOTH_STONE_WALL = register("smooth_stone_wall", new BlockItem(Blocks.SMOOTH_STONE_WALL, itemSettings()));
        public static final Item SMOOTH_STONE_STAIRS = register("smooth_stone_stairs", new BlockItem(Blocks.SMOOTH_STONE_STAIRS, itemSettings()));

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

        public static final Item CUT_STONE = register("cut_stone", new BlockItem(Blocks.CUT_STONE, itemSettings()));
        public static final Item CUT_STONE_SLAB = register("cut_stone_slab", new BlockItem(Blocks.CUT_STONE_SLAB, itemSettings()));
        public static final Item CUT_STONE_STAIRS = register("cut_stone_stairs", new BlockItem(Blocks.CUT_STONE_STAIRS, itemSettings()));
        public static final Item CUT_STONE_WALL = register("cut_stone_wall", new BlockItem(Blocks.CUT_STONE_WALL, itemSettings()));

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
        public static final Item POLISHED_STONE = register("polished_stone", new BlockItem(Blocks.POLISHED_STONE, itemSettings()));
        public static final Item POLISHED_STONE_WALL = register("polished_stone_wall", new BlockItem(Blocks.POLISHED_STONE_WALL, itemSettings()));
        public static final Item POLISHED_STONE_STAIRS = register("polished_stone_stairs", new BlockItem(Blocks.POLISHED_STONE_STAIRS, itemSettings()));
        public static final Item POLISHED_STONE_SLAB = register("polished_stone_slab", new BlockItem(Blocks.POLISHED_STONE_SLAB, itemSettings()));

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
        public static final Item CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab", new BlockItem(Blocks.CRACKED_STONE_BRICK_SLAB, itemSettings()));
        public static final Item CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", new BlockItem(Blocks.CRACKED_STONE_BRICK_STAIRS, itemSettings()));
        public static final Item CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", new BlockItem(Blocks.CRACKED_STONE_BRICK_WALL, itemSettings()));

    //Pillar and Chiseled
        public static final Item STONE_BRICK_PILLAR = register("stone_brick_pillar", new BlockItem(Blocks.STONE_BRICK_PILLAR, itemSettings()));
        public static final Item MOSSY_STONE_BRICK_PILLAR = register("mossy_stone_brick_pillar", new BlockItem(Blocks.MOSSY_STONE_BRICK_PILLAR, itemSettings()));
        public static final Item CRACKED_STONE_BRICK_PILLAR = register("cracked_stone_brick_pillar", new BlockItem(Blocks.CRACKED_STONE_BRICK_PILLAR, itemSettings()));
        public static final Item CRACKED_CHISELED_STONE_BRICKS = register("cracked_chiseled_stone_bricks", new BlockItem(Blocks.CRACKED_CHISELED_STONE_BRICKS, itemSettings()));
        public static final Item MOSSY_CHISELED_STONE_BRICKS = register("mossy_chiseled_stone_bricks", new BlockItem(Blocks.MOSSY_CHISELED_STONE_BRICKS, itemSettings()));
        public static final Item STONE_WALL = register("stone_wall", new BlockItem(Blocks.STONE_WALL, itemSettings()));
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        public static final Item CARVED_STONE_BRICKS = register("carved_stone_bricks", new BlockItem(Blocks.CARVED_STONE_BRICKS, itemSettings()));
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
        public static final Item SMOOTH_BLACKSTONE = register("smooth_blackstone", new BlockItem(Blocks.SMOOTH_BLACKSTONE, itemSettings()));
        public static final Item SMOOTH_BLACKSTONE_SLAB = register("smooth_blackstone_slab", new BlockItem(Blocks.SMOOTH_BLACKSTONE_SLAB, itemSettings()));
        public static final Item SMOOTH_BLACKSTONE_STAIRS = register("smooth_blackstone_stairs", new BlockItem(Blocks.SMOOTH_BLACKSTONE_STAIRS, itemSettings()));
        public static final Item SMOOTH_BLACKSTONE_WALL = register("smooth_blackstone_wall", new BlockItem(Blocks.SMOOTH_BLACKSTONE_WALL, itemSettings()));

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
        public static final Item CUT_BLACKSTONE = register("cut_blackstone", new BlockItem(Blocks.CUT_BLACKSTONE, itemSettings()));
        public static final Item CUT_BLACKSTONE_SLAB = register("cut_blackstone_slab", new BlockItem(Blocks.CUT_BLACKSTONE_SLAB, itemSettings()));
        public static final Item CUT_BLACKSTONE_STAIRS = register("cut_blackstone_stairs", new BlockItem(Blocks.CUT_BLACKSTONE_STAIRS, itemSettings()));
        public static final Item CUT_BLACKSTONE_WALL = register("cut_blackstone_wall", new BlockItem(Blocks.CUT_BLACKSTONE_WALL, itemSettings()));

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
        public static final Item CRACKED_BLACKSTONE_BRICK_SLAB = register("cracked_blackstone_brick_slab", new BlockItem(Blocks.CRACKED_BLACKSTONE_BRICK_SLAB, itemSettings()));
        public static final Item CRACKED_BLACKSTONE_BRICK_STAIRS = register("cracked_blackstone_brick_stairs", new BlockItem(Blocks.CRACKED_BLACKSTONE_BRICK_STAIRS, itemSettings()));
        public static final Item CRACKED_BLACKSTONE_BRICK_WALL = register("cracked_blackstone_brick_wall", new BlockItem(Blocks.CRACKED_BLACKSTONE_BRICK_WALL, itemSettings()));

    //Mossy Bricks
        public static final Item MOSSY_BLACKSTONE_BRICKS = register("mossy_blackstone_bricks", new BlockItem(Blocks.MOSSY_BLACKSTONE_BRICKS, itemSettings()));
        public static final Item MOSSY_BLACKSTONE_BRICK_SLAB = register("mossy_blackstone_brick_slab", new BlockItem(Blocks.MOSSY_BLACKSTONE_BRICK_SLAB, itemSettings()));
        public static final Item MOSSY_BLACKSTONE_BRICK_STAIRS = register("mossy_blackstone_brick_stairs", new BlockItem(Blocks.MOSSY_BLACKSTONE_BRICK_STAIRS, itemSettings()));
        public static final Item MOSSY_BLACKSTONE_BRICK_WALL = register("mossy_blackstone_brick_wall", new BlockItem(Blocks.MOSSY_BLACKSTONE_BRICK_WALL, itemSettings()));

    //Pillars and Chiseled
        public static final Item CHISELED_BLACKSTONE = register("chiseled_blackstone", new BlockItem(Blocks.CHISELED_BLACKSTONE, itemSettings()));
        public static final Item MOSSY_CHISELED_BLACKSTONE = register("mossy_chiseled_blackstone", new BlockItem(Blocks.MOSSY_CHISELED_BLACKSTONE, itemSettings()));
        public static final Item CRACKED_CHISELED_BLACKSTONE = register("cracked_chiseled_blackstone", new BlockItem(Blocks.CRACKED_CHISELED_BLACKSTONE, itemSettings()));
        public static final Item BLACKSTONE_BRICK_PILLAR = register("blackstone_brick_pillar", new BlockItem(Blocks.BLACKSTONE_BRICK_PILLAR, itemSettings()));
        public static final Item CRACKED_BLACKSTONE_BRICK_PILLAR = register("cracked_blackstone_brick_pillar", new BlockItem(Blocks.CRACKED_BLACKSTONE_BRICK_PILLAR, itemSettings()));
        public static final Item MOSSY_BLACKSTONE_BRICK_PILLAR = register("mossy_blackstone_brick_pillar", new BlockItem(Blocks.MOSSY_BLACKSTONE_BRICK_PILLAR, itemSettings()));
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        public static final Item CRACKED_CARVED_BLACKSTONE = register("cracked_carved_blackstone", new BlockItem(Blocks.CRACKED_CARVED_BLACKSTONE, itemSettings()));
        public static final Item MOSSY_CARVED_BLACKSTONE = register("mossy_carved_blackstone", new BlockItem(Blocks.MOSSY_CARVED_BLACKSTONE, itemSettings()));


//Sandstone

    //Smooth
        public static final Item SMOOTH_SANDSTONE_WALL = register("smooth_sandstone_wall", new BlockItem(Blocks.SMOOTH_SANDSTONE_WALL, itemSettings()));

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
        public static final Item SMOOTH_RED_SANDSTONE_WALL = register("smooth_red_sandstone_wall", new BlockItem(Blocks.SMOOTH_RED_SANDSTONE_WALL, itemSettings()));

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
        public static final Item QUARTZ_WALL = register("quartz_wall", new BlockItem(Blocks.QUARTZ_WALL, itemSettings()));

    //Smooth
        public static final Item SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall", new BlockItem(Blocks.SMOOTH_QUARTZ_WALL, itemSettings()));

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
        public static final Item CUT_QUARTZ = register("cut_quartz", new BlockItem(Blocks.CUT_QUARTZ, itemSettings()));
        public static final Item CUT_QUARTZ_SLAB = register("cut_quartz_slab", new BlockItem(Blocks.CUT_QUARTZ_SLAB, itemSettings()));
        public static final Item CUT_QUARTZ_STAIRS = register("cut_quartz_stairs", new BlockItem(Blocks.CUT_QUARTZ_STAIRS, itemSettings()));
        public static final Item CUT_QUARTZ_WALL = register("cut_quartz_wall", new BlockItem(Blocks.CUT_QUARTZ_WALL, itemSettings()));

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
        public static final Item QUARTZ_BRICK_SLAB = register("quartz_bric_slab", new BlockItem(Blocks.QUARTZ_BRICK_SLAB, itemSettings()));
        public static final Item QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs", new BlockItem(Blocks.QUARTZ_BRICK_STAIRS, itemSettings()));
        public static final Item QUARTZ_BRICK_WALL = register("quartz_brick_wall", new BlockItem(Blocks.QUARTZ_BRICK_WALL, itemSettings()));

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
        public static final Item POLISHED_ANDESITE_WALL = register("polished_andesite_wall", new BlockItem(Blocks.POLISHED_ANDESITE_WALL, itemSettings()));

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
        public static final Item SMOOTH_ANDESITE = register("smooth_andesite", new BlockItem(Blocks.SMOOTH_ANDESITE, itemSettings()));
        public static final Item SMOOTH_ANDESITE_SLAB = register("smooth_andesite_slab", new BlockItem(Blocks.SMOOTH_ANDESITE_SLAB, itemSettings()));
        public static final Item SMOOTH_ANDESITE_STAIRS = register("smooth_andesite_stairs", new BlockItem(Blocks.SMOOTH_ANDESITE_STAIRS, itemSettings()));
        public static final Item SMOOTH_ANDESITE_WALL = register("smooth_andesite_wall", new BlockItem(Blocks.SMOOTH_ANDESITE_WALL, itemSettings()));

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
        public static final Item ANDESITE_BRICKS = register("andesite", new BlockItem(Blocks.ANDESITE_BRICKS, itemSettings()));
        public static final Item ANDESITE_BRICK_SLAB = register("andesite_slab", new BlockItem(Blocks.ANDESITE_BRICK_SLAB, itemSettings()));
        public static final Item ANDESITE_BRICK_STAIRS = register("andesite_stairs", new BlockItem(Blocks.ANDESITE_BRICKS_STAIRS, itemSettings()));
        public static final Item ANDESITE_BRICK_WALL = register("andesite_wall", new BlockItem(Blocks.ANDESITE_BRICKS_WALL, itemSettings()));


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
        public static final Item POLISHED_DIORITE_WALL = register("polished_diorite_wall", new BlockItem(Blocks.POLISHED_DIORITE_WALL, itemSettings()));

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
        public static final Item CUT_DIORITE = register("cut_diorite", new BlockItem(Blocks.CUT_DIORITE, itemSettings()));
        public static final Item CUT_DIORITE_SLAB = register("cut_diorite_slab", new BlockItem(Blocks.CUT_DIORITE_SLAB, itemSettings()));
        public static final Item CUT_DIORITE_STAIRS = register("cut_diorite_stairs", new BlockItem(Blocks.CUT_DIORITE_STAIRS, itemSettings()));
        public static final Item CUT_DIORITE_WALL = register("cut_diorite_wall", new BlockItem(Blocks.CUT_DIORITE_WALL, itemSettings()));


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
        public static final Item POLISHED_GRANITE_WALL = register("polished_granite_wall", new BlockItem(Blocks.POLISHED_GRANITE_WALL, itemSettings()));

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
        public static final Item SMOOTH_GRANITE = register("smooth_granite", new BlockItem(Blocks.SMOOTH_GRANITE, itemSettings()));
        public static final Item SMOOTH_GRANITE_SLAB = register("smooth_granite_slab", new BlockItem(Blocks.SMOOTH_GRANITE_SLAB, itemSettings()));
        public static final Item SMOOTH_GRANITE_STAIRS = register("smooth_granite_stairs", new BlockItem(Blocks.SMOOTH_GRANITE_STAIRS, itemSettings()));
        public static final Item SMOOTH_GRANITE_WALL = register("smooth_granite_wall", new BlockItem(Blocks.SMOOTH_GRANITE_WALL, itemSettings()));


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
        public static final Item NETHERITE_STAIRS = register("netherite_stairs", new BlockItem(Blocks.NETHERITE_STAIRS, itemSettings()));
        public static final Item SUSPICIOUS_SLAB = register("suspicious_slab", new BlockItem(Blocks.SUSPICIOUS_SLAB, new Item.Settings()));
    //clay
        public static final Item CLAY_SLAB = register("clay_slab", new BlockItem(Blocks.CLAY_SLAB, itemSettings()));
        public static final Item CLAY_STAIRS = register("clay_stairs", new BlockItem(Blocks.CLAY_STAIRS, itemSettings()));
        public static final Item CLAY_WALL = register("clay_wall", new BlockItem(Blocks.CLAY_WALL, itemSettings()));

        public static final Item POLISHED_CLAY = register("polished_clay", new BlockItem(Blocks.POLISHED_CLAY, itemSettings()));
        public static final Item POLISHED_CLAY_SLAB = register("polished_clay_slab", new BlockItem(Blocks.POLISHED_CLAY_SLAB, itemSettings()));
        public static final Item POLISHED_CLAY_STAIRS = register("polished_clay_stairs", new BlockItem(Blocks.POLISHED_CLAY_STAIRS, itemSettings()));
        public static final Item POLISHED_CLAY_WALL = register("polished_clay_wall", new BlockItem(Blocks.POLISHED_CLAY_WALL, itemSettings()));

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

    public static final Item CUT_CLAY = register("cut_clay", new BlockItem(Blocks.CUT_CLAY, itemSettings()));
        public static final Item CUT_CLAY_SLAB = register("cut_clay_slab", new BlockItem(Blocks.CUT_CLAY_SLAB, itemSettings()));
        public static final Item CUT_CLAY_STAIRS = register("cut_clay_stairs", new BlockItem(Blocks.CUT_CLAY_STAIRS, itemSettings()));
        public static final Item CUT_CLAY_WALL = register("cut_clay_wall", new BlockItem(Blocks.CUT_CLAY_WALL, itemSettings()));

        public static final Item SMOOTH_CLAY = register("smooth_clay", new BlockItem(Blocks.SMOOTH_CLAY, itemSettings()));
        public static final Item SMOOTH_CLAY_SLAB = register("smooth_clay_slab", new BlockItem(Blocks.SMOOTH_CLAY_SLAB, itemSettings()));
        public static final Item SMOOTH_CLAY_STAIRS = register("smooth_clay_stairs", new BlockItem(Blocks.SMOOTH_CLAY_STAIRS, itemSettings()));
        public static final Item SMOOTH_CLAY_WALL = register("smooth_clay_wall", new BlockItem(Blocks.SMOOTH_CLAY_WALL, itemSettings()));

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
        public static final Item POLISHED_PRISMARINE = register("polished_prismarine", new BlockItem(Blocks.POLISHED_PRISMARINE, itemSettings()));
        public static final Item POLISHED_PRISMARINE_SLAB = register("polished_prismarine_slab", new BlockItem(Blocks.POLISHED_PRISMARINE_SLAB, itemSettings()));
        public static final Item POLISHED_PRISMARINE_STAIRS = register("polished_prismarine_stairs", new BlockItem(Blocks.POLISHED_PRISMARINE_STAIRS, itemSettings()));
        public static final Item POLISHED_PRISMARINE_WALL = register("polished_prismarine_wall", new BlockItem(Blocks.POLISHED_PRISMARINE_WALL, itemSettings()));


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
        public static final Item SMOOTH_PRISMARINE = register("smooth_prismarine", new BlockItem(Blocks.SMOOTH_PRISMARINE, itemSettings()));
        public static final Item SMOOTH_PRISMARINE_SLAB = register("smooth_prismarine_slab", new BlockItem(Blocks.SMOOTH_PRISMARINE_SLAB, itemSettings()));
        public static final Item SMOOTH_PRISMARINE_STAIRS = register("smooth_prismarine_stairs", new BlockItem(Blocks.SMOOTH_PRISMARINE_STAIRS, itemSettings()));
        public static final Item SMOOTH_PRISMARINE_WALL = register("smooth_prismarine_wall", new BlockItem(Blocks.SMOOTH_PRISMARINE_WALL, itemSettings()));

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
        public static final Item CUT_PRISMARINE = register("cut_prismarine", new BlockItem(Blocks.CUT_PRISMARINE, itemSettings()));
        public static final Item CUT_PRISMARINE_SLAB = register("cut_prismarine_slab", new BlockItem(Blocks.CUT_PRISMARINE_SLAB, itemSettings()));
        public static final Item CUT_PRISMARINE_STAIRS = register("cut_prismarine_stairs", new BlockItem(Blocks.CUT_PRISMARINE_STAIRS, itemSettings()));
        public static final Item CUT_PRISMARINE_WALL = register("cut_prismarine_wall", new BlockItem(Blocks.CUT_PRISMARINE_WALL, itemSettings()));


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
        public static final Item PRISMARINE_BRICK_WALL = register("prismarine_brick_wall", new BlockItem(Blocks.PRISMARINE_BRICK_WALL, itemSettings()));

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
        public static final Item CARVED_PRISMARINE = register("carved_prismarine", new BlockItem(Blocks.CARVED_PRISMARINE, itemSettings()));
        //cracked carved
        //mossy carved

//Dark Prismarine

    //Block
        public static final Item DARK_PRISMARINE_WALL = register("dark_prismarine_wall", new BlockItem(Blocks.DARK_PRISMARINE_WALL, itemSettings()));

    //Polished
        public static final Item POLISHED_DARK_PRISMARINE = register("polished_dark_prismarine", new BlockItem(Blocks.POLISHED_DARK_PRISMARINE, itemSettings()));
        public static final Item POLISHED_DARK_PRISMARINE_SLAB = register("polished_dark_prismarine_slab", new BlockItem(Blocks.POLISHED_DARK_PRISMARINE_SLAB, itemSettings()));
        public static final Item POLISHED_DARK_PRISMARINE_STAIRS = register("polished_dark_prismarine_stairs", new BlockItem(Blocks.POLISHED_DARK_PRISMARINE_STAIRS, itemSettings()));
        public static final Item POLISHED_DARK_PRISMARINE_WALL = register("polished_dark_prismarine_wall", new BlockItem(Blocks.POLISHED_DARK_PRISMARINE_WALL, itemSettings()));

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
        public static final Item SMOOTH_DARK_PRISMARINE = register("smooth_dark_prismarine", new BlockItem(Blocks.SMOOTH_DARK_PRISMARINE, itemSettings()));
        public static final Item SMOOTH_DARK_PRISMARINE_SLAB = register("smooth_dark_prismarine_slab", new BlockItem(Blocks.SMOOTH_DARK_PRISMARINE_SLAB, itemSettings()));
        public static final Item SMOOTH_DARK_PRISMARINE_STAIRS = register("smooth_dark_prismarine_stairs", new BlockItem(Blocks.SMOOTH_DARK_PRISMARINE_STAIRS, itemSettings()));
        public static final Item SMOOTH_DARK_PRISMARINE_WALL = register("smooth_dark_prismarine_wall", new BlockItem(Blocks.SMOOTH_DARK_PRISMARINE_WALL, itemSettings()));

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
        public static final Item CUT_DARK_PRISMARINE = register("cut_dark_prismarine", new BlockItem(Blocks.CUT_DARK_PRISMARINE, itemSettings()));
        public static final Item CUT_DARK_PRISMARINE_SLAB = register("cut_dark_prismarine_slab", new BlockItem(Blocks.CUT_DARK_PRISMARINE_SLAB, itemSettings()));
        public static final Item CUT_DARK_PRISMARINE_STAIRS = register("cut_dark_prismarine_stairs", new BlockItem(Blocks.CUT_DARK_PRISMARINE_STAIRS, itemSettings()));
        public static final Item CUT_DARK_PRISMARINE_WALL = register("cut_dark_prismarine_wall", new BlockItem(Blocks.CUT_DARK_PRISMARINE_WALL, itemSettings()));

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
        public static final Item CHISELED_DARK_PRISMARINE = register("chiseled_dark_prismarine", new BlockItem(Blocks.CHISELED_DARK_PRISMARINE, itemSettings()));
        //mossy_chiseled_dark_prismarine
        //cracked_chiseled_dark_prismarine
        public static final Item DARK_PRISMARINE_PILLAR = register("dark_prismarine_pillar", new BlockItem(Blocks.DARK_PRISMARINE_PILLAR, itemSettings()));
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
        public static final Item PURPUR_BLOCK = register("purpur_block", new BlockItem(Blocks.PURPUR_BLOCK, itemSettings()));
        public static final Item PURPUR_SLAB = register("purpur_slab", new BlockItem(Blocks.PURPUR_SLAB, itemSettings()));
        public static final Item PURPUR_STAIRS = register("purpur_stairs", new BlockItem(Blocks.PURPUR_STAIRS, itemSettings()));
        public static final Item PURPUR_WALL = register("purpur_wall", new BlockItem(Blocks.PURPUR_WALL, itemSettings()));

    //Smooth
        public static final Item SMOOTH_PURPUR_BLOCK = register("smooth_purpur_block", new BlockItem(Blocks.SMOOTH_PURPUR_BLOCK, itemSettings()));
        public static final Item SMOOTH_PURPUR_SLAB = register("smooth_purpur_slab", new BlockItem(Blocks.SMOOTH_PURPUR_SLAB, itemSettings()));
        public static final Item SMOOTH_PURPUR_STAIRS = register("smooth_purpur_stairs", new BlockItem(Blocks.SMOOTH_PURPUR_STAIRS, itemSettings()));
        public static final Item SMOOTH_PURPUR_WALL = register("smooth_purpur_wall", new BlockItem(Blocks.SMOOTH_PURPUR_WALL, itemSettings()));

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
        public static final Item POLISHED_PURPUR_BLOCK = register("polished_purpur_block", new BlockItem(Blocks.POLISHED_PURPUR_BLOCK, itemSettings()));
        public static final Item POLISHED_PURPUR_SLAB = register("polished_purpur_slab", new BlockItem(Blocks.POLISHED_PURPUR_SLAB, itemSettings()));
        public static final Item POLISHED_PURPUR_STAIRS = register("polished_purpur_stairs", new BlockItem(Blocks.POLISHED_PURPUR_STAIRS, itemSettings()));
        public static final Item POLISHED_PURPUR_WALL = register("polished_purpur_wall", new BlockItem(Blocks.POLISHED_PURPUR_WALL, itemSettings()));

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
        public static final Item CUT_PURPUR_WALL = register("cut_purpur_wall", new BlockItem(Blocks.CUT_PURPUR_WALL, itemSettings()));

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
        public static final Item PURPUR_BRICKS = register("purpur_bricks", new BlockItem(Blocks.PURPUR_BRICKS, itemSettings()));
        public static final Item PURPUR_BRICK_SLAB = register("purpur_brick_slab", new BlockItem(Blocks.PURPUR_BRICK_SLAB, itemSettings()));
        public static final Item PURPUR_BRICK_STAIRS = register("purpur_brick_stairs", new BlockItem(Blocks.PURPUR_BRICK_STAIRS, itemSettings()));
        public static final Item PURPUR_BRICK_WALL = register("purpur_brick_wall", new BlockItem(Blocks.PURPUR_BRICK_WALL, itemSettings()));

    //Cracked Bricks
        public static final Item CRACKED_PURPUR_BRICKS = register("cracked_purpur_bricks", new BlockItem(Blocks.CRACKED_PURPUR_BRICKS, itemSettings()));
        public static final Item CRACKED_PURPUR_BRICK_SLAB = register("cracked_purpur_brick_slab", new BlockItem(Blocks.CRACKED_PURPUR_BRICK_SLAB, itemSettings()));
        public static final Item CRACKED_PURPUR_BRICK_STAIRS = register("cracked_purpur_brick_stairs", new BlockItem(Blocks.CRACKED_PURPUR_BRICK_STAIRS, itemSettings()));
        public static final Item CRACKED_PURPUR_BRICK_WALL = register("cracked_purpur_brick_wall", new BlockItem(Blocks.CRACKED_PURPUR_BRICK_WALL, itemSettings()));

    //Mossy Bricks
        //mossy_purpur_bricks
        //mossy_purpur_brick_slab
        //mossy_purpur_brick_stairs
        //mossy_purpur_brick_wall

    //Pillars and Chiseled
        public static final Item CHISELED_PURPUR_BLOCK = register("chiseled_purpur_block", new BlockItem(Blocks.CHISELED_PURPUR_BLOCK, itemSettings()));
        //mossy_chiseled_purpur
        //cracked_chiseled_purpur
        //mossy_purpur_pillar
        //cracked_purpur_pillar
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        public static final Item CARVED_PURPUR = register("carved_purpur", new BlockItem(Blocks.CARVED_PURPUR, itemSettings()));
        //cracked carved
        //mossy carved

//End Stone

    //Block
        public static final Item END_STONE_SLAB = register("end_stone_slab", new BlockItem(Blocks.END_STONE_SLAB, itemSettings()));
        public static final Item END_STONE_STAIRS = register("end_stone_stairs", new BlockItem(Blocks.END_STONE_STAIRS, itemSettings()));
        public static final Item END_STONE_WALL = register("end_stone_wall", new BlockItem(Blocks.END_STONE_WALL, itemSettings()));

    //Smooth
        public static final Item SMOOTH_END_STONE = register("smooth_end_stone", new BlockItem(Blocks.SMOOTH_END_STONE, itemSettings()));
        public static final Item SMOOTH_END_STONE_SLAB = register("smooth_end_stone_slab", new BlockItem(Blocks.SMOOTH_END_STONE_SLAB, itemSettings()));
        public static final Item SMOOTH_END_STONE_STAIRS = register("smooth_end_stone_stairs", new BlockItem(Blocks.SMOOTH_END_STONE_STAIRS, itemSettings()));
        public static final Item SMOOTH_END_STONE_WALL = register("smooth_end_stone_wall", new BlockItem(Blocks.SMOOTH_END_STONE_WALL, itemSettings()));

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
        public static final Item CUT_END_STONE = register("cut_end_stone", new BlockItem(Blocks.CUT_END_STONE, itemSettings()));
        public static final Item CUT_END_STONE_SLAB = register("cut_end_stone_slab", new BlockItem(Blocks.CUT_END_STONE_SLAB, itemSettings()));
        public static final Item CUT_END_STONE_STAIRS = register("cut_end_stone_stairs", new BlockItem(Blocks.CUT_END_STONE_STAIRS, itemSettings()));
        public static final Item CUT_END_STONE_WALL = register("cut_end_stone_wall", new BlockItem(Blocks.CUT_END_STONE_WALL, itemSettings()));

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
        public static final Item POLISHED_END_STONE = register("polished_end_stone", new BlockItem(Blocks.POLISHED_END_STONE, itemSettings()));
        public static final Item POLISHED_END_STONE_SLAB = register("polished_end_stone_slab", new BlockItem(Blocks.POLISHED_END_STONE_SLAB, itemSettings()));
        public static final Item POLISHED_END_STONE_STAIRS = register("polished_end_stone_stairs", new BlockItem(Blocks.POLISHED_END_STONE_STAIRS, itemSettings()));
        public static final Item POLISHED_END_STONE_WALL = register("polished_end_stone_wall", new BlockItem(Blocks.POLISHED_END_STONE_WALL, itemSettings()));

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
        public static final Item CHISELED_END_STONE = register("chiseled_end_stone", new BlockItem(Blocks.CHISELED_END_STONE, itemSettings()));
        //mossy_chiseled_end_stone_bricks
        //cracked_chiseled_end_stone_bricks
        //end_stone_brick_pillar
        //mossy_end_stone_brick_pillar
        //cracked_end_stone_brick_pillar
        //corner pillar
        //cracked corner pillar
        //mossy corner pillar
        public static final Item CARVED_END_STONE = register("carved_end_stone", new BlockItem(Blocks.CARVED_END_STONE, itemSettings()));
        //cracked carved
        //mossy carved

//Terracotta

    //Terracotta Slab
        public static final Item RED_TERRACOTTA_SLAB = register("red_terracotta_slab", new BlockItem(Blocks.RED_TERRACOTTA_SLAB, itemSettings()));
        public static final Item ORANGE_TERRACOTTA_SLAB = register("orange_terracotta_slab", new BlockItem(Blocks.ORANGE_TERRACOTTA_SLAB, itemSettings()));
        public static final Item YELLOW_TERRACOTTA_SLAB = register("yellow_terracotta_slab", new BlockItem(Blocks.YELLOW_TERRACOTTA_SLAB, itemSettings()));
        public static final Item LIME_TERRACOTTA_SLAB = register("lime_terracotta_slab", new BlockItem(Blocks.LIME_TERRACOTTA_SLAB, itemSettings()));
        public static final Item GREEN_TERRACOTTA_SLAB = register("green_terracotta_slab", new BlockItem(Blocks.GREEN_TERRACOTTA_SLAB, itemSettings()));
        public static final Item BLUE_TERRACOTTA_SLAB = register("blue_terracotta_slab", new BlockItem(Blocks.BLUE_TERRACOTTA_SLAB, itemSettings()));
        public static final Item CYAN_TERRACOTTA_SLAB = register("cyan_terracotta_slab", new BlockItem(Blocks.CYAN_TERRACOTTA_SLAB, itemSettings()));
        public static final Item LIGHT_BLUE_TERRACOTTA_SLAB = register("light_blue_terracotta_slab", new BlockItem(Blocks.LIGHT_BLUE_TERRACOTTA_SLAB, itemSettings()));
        public static final Item PURPLE_TERRACOTTA_SLAB = register("purple_terracotta_slab", new BlockItem(Blocks.PURPLE_TERRACOTTA_SLAB, itemSettings()));
        public static final Item MAGENTA_TERRACOTTA_SLAB = register("magenta_terracotta_slab", new BlockItem(Blocks.MAGENTA_TERRACOTTA_SLAB, itemSettings()));
        public static final Item PINK_TERRACOTTA_SLAB = register("pink_terracotta_slab", new BlockItem(Blocks.PINK_TERRACOTTA_SLAB, itemSettings()));
        public static final Item WHITE_TERRACOTTA_SLAB = register("white_terracotta_slab", new BlockItem(Blocks.WHITE_TERRACOTTA_SLAB, itemSettings()));
        public static final Item LIGHT_GRAY_TERRACOTTA_SLAB = register("light_gray_terracotta_slab", new BlockItem(Blocks.LIGHT_GRAY_TERRACOTTA_SLAB, itemSettings()));
        public static final Item GRAY_TERRACOTTA_SLAB = register("gray_terracotta_slab", new BlockItem(Blocks.GRAY_TERRACOTTA_SLAB, itemSettings()));
        public static final Item BLACK_TERRACOTTA_SLAB = register("black_terracotta_slab", new BlockItem(Blocks.BLACK_TERRACOTTA_SLAB, itemSettings()));
        public static final Item BROWN_TERRACOTTA_SLAB = register("brown_terracotta_slab", new BlockItem(Blocks.BROWN_TERRACOTTA_SLAB, itemSettings()));
        public static final Item TERRACOTTA_SLAB = register("terracotta_slab", new BlockItem(Blocks.TERRACOTTA_SLAB, itemSettings()));


    //Terracotta Stairs
        public static final Item RED_TERRACOTTA_STAIRS = register("red_terracotta_stairs", new BlockItem(Blocks.RED_TERRACOTTA_STAIRS, itemSettings()));
        public static final Item ORANGE_TERRACOTTA_STAIRS = register("orange_terracotta_stairs", new BlockItem(Blocks.ORANGE_TERRACOTTA_STAIRS, itemSettings()));
        public static final Item YELLOW_TERRACOTTA_STAIRS = register("yellow_terracotta_stairs", new BlockItem(Blocks.YELLOW_TERRACOTTA_STAIRS, itemSettings()));
        public static final Item LIME_TERRACOTTA_STAIRS = register("lime_terracotta_stairs", new BlockItem(Blocks.LIME_TERRACOTTA_STAIRS, itemSettings()));
        public static final Item GREEN_TERRACOTTA_STAIRS = register("green_terracotta_stairs", new BlockItem(Blocks.GREEN_TERRACOTTA_STAIRS, itemSettings()));
        public static final Item BLUE_TERRACOTTA_STAIRS = register("blue_terracotta_stairs", new BlockItem(Blocks.BLUE_TERRACOTTA_STAIRS, itemSettings()));
        public static final Item CYAN_TERRACOTTA_STAIRS = register("cyan_terracotta_stairs", new BlockItem(Blocks.CYAN_TERRACOTTA_STAIRS, itemSettings()));
        public static final Item LIGHT_BLUE_TERRACOTTA_STAIRS = register("light_blue_terracotta_stairs", new BlockItem(Blocks.LIGHT_BLUE_TERRACOTTA_STAIRS, itemSettings()));
        public static final Item PURPLE_TERRACOTTA_STAIRS = register("purple_terracotta_stairs", new BlockItem(Blocks.PURPLE_TERRACOTTA_STAIRS, itemSettings()));
        public static final Item MAGENTA_TERRACOTTA_STAIRS = register("magenta_terracotta_stairs", new BlockItem(Blocks.MAGENTA_TERRACOTTA_STAIRS, itemSettings()));
        public static final Item PINK_TERRACOTTA_STAIRS = register("pink_terracotta_stairs", new BlockItem(Blocks.PINK_TERRACOTTA_STAIRS, itemSettings()));
        public static final Item WHITE_TERRACOTTA_STAIRS = register("white_terracotta_stairs", new BlockItem(Blocks.WHITE_TERRACOTTA_STAIRS, itemSettings()));
        public static final Item LIGHT_GRAY_TERRACOTTA_STAIRS = register("light_gray_terracotta_stairs", new BlockItem(Blocks.LIGHT_GRAY_TERRACOTTA_STAIRS, itemSettings()));
        public static final Item GRAY_TERRACOTTA_STAIRS = register("gray_terracotta_stairs", new BlockItem(Blocks.GRAY_TERRACOTTA_STAIRS, itemSettings()));
        public static final Item BLACK_TERRACOTTA_STAIRS = register("black_terracotta_stairs", new BlockItem(Blocks.BLACK_TERRACOTTA_STAIRS, itemSettings()));
        public static final Item BROWN_TERRACOTTA_STAIRS = register("brown_terracotta_stairs", new BlockItem(Blocks.BROWN_TERRACOTTA_STAIRS, itemSettings()));
        public static final Item TERRACOTTA_STAIRS = register("terracotta_stairs", new BlockItem(Blocks.TERRACOTTA_STAIRS, itemSettings()));


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

    //Soul O Lantern
    public static final Item JACK_O_SOUL = register("jack_o_soul", new BlockItem(Blocks.JACK_O_SOUL, itemSettings()));

    public static final Item DEVIN_BLOCKERA = register("devin_blockera", new BlockItem(Blocks.DEVIN_BLOCKERA, new Item.Settings()));
    public static final Item BROKEN_MODIFIKATION = register("broken_modifikation", new BlockItem(Blocks.BROKEN_MODIFIKATION, new Item.Settings()));

    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("consistency_plus", name), item);
    }
    public static void init() {
    }
}
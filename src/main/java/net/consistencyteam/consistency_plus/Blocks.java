package net.consistencyteam.consistency_plus;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.block.enums.StairShape;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static net.minecraft.block.Blocks.*;

public class Blocks {

//Stone

    //Smooth
        public static final Block SMOOTH_STONE_STAIRS = register("smooth_stone_stairs", new BaseConsistencyStairBlock(STONE_BRICKS.getDefaultState(),FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block SMOOTH_STONE_WALL = register("smooth_stone_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block STONE_WALL = register("stone_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    //Polished
        public static final Block POLISHED_STONE = register("polished_stone", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block POLISHED_STONE_SLAB  = register("polished_stone_slab", new SlabBlock(FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block POLISHED_STONE_STAIRS = register("polished_stone_stairs", new BaseConsistencyStairBlock(STONE_BRICKS.getDefaultState(),FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block POLISHED_STONE_WALL = register("polished_stone_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    //Pillar and Chiseled
        public static final Block STONE_BRICK_PILLAR = register("stone_brick_pillar", new PillarBlock(FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block CRACKED_STONE_BRICK_PILLAR = register("cracked_stone_brick_pillar", new PillarBlock(FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block MOSSY_STONE_BRICK_PILLAR = register("mossy_stone_brick_pillar", new PillarBlock(FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block CRACKED_CHISELED_STONE_BRICKS = register("cracked_chiseled_stone_bricks", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block MOSSY_CHISELED_STONE_BRICKS = register("mossy_chiseled_stone_bricks", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
    //Cut
        public static final Block CUT_STONE = register("cut_stone", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block CUT_STONE_SLAB  = register("cut_stone_slab", new SlabBlock(FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block CUT_STONE_STAIRS = register("cut_stone_stairs", new BaseConsistencyStairBlock(STONE_BRICKS.getDefaultState(),FabricBlockSettings.copy(STONE_BRICKS)));
        public static final Block CUT_STONE_WALL = register("cut_stone_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));
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

    //Cut
        public static final Block CUT_BLACKSTONE = register("cut_blackstone", new Block(FabricBlockSettings.copy(BLACKSTONE)));
        public static final Block CUT_BLACKSTONE_SLAB = register("cut_blackstone_slab", new SlabBlock(FabricBlockSettings.copy(BLACKSTONE)));
        public static final Block CUT_BLACKSTONE_STAIRS = register("cut_blackstone_stairs", new BaseConsistencyStairBlock(BLACKSTONE.getDefaultState(),FabricBlockSettings.copy(BLACKSTONE)));
        public static final Block CUT_BLACKSTONE_WALL = register("cut_blackstone_wall", new WallBlock(FabricBlockSettings.copy(BLACKSTONE)));

    //Cracked
        //cracked_blackstone_brick_slab
        //cracked_blackstone_brick_stairs
        //cracked_blackstone_brick_wall

    //Mossy
        //mossy_blackstone_bricks
        //mossy_blackstone_brick_slab
        //mossy_blackstone_brick_stairs
        //mossy_blackstone_brick_wall

    //Pillars and Chiseled
        //mossy_chiseled_blackstone_bricks
        //cracked_chiseled_blackstone_bricks
        public static final Block BLACKSTONE_BRICK_PILLAR = register("blackstone_brick_pillar", new PillarBlock(FabricBlockSettings.copy(BLACKSTONE)));
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
        public static final Block QUARTZ_WALL = register("quartz_wall", new WallBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));


    //Smooth
        public static final Block SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall", new WallBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));

    //Cut
        public static final Block CUT_QUARTZ = register("cut_quartz", new Block(FabricBlockSettings.copy(QUARTZ_BLOCK)));
        public static final Block CUT_QUARTZ_SLAB = register("cut_quartz_slab", new SlabBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));
        public static final Block CUT_QUARTZ_STAIRS = register("cut_quartz_stairs", new BaseConsistencyStairBlock(QUARTZ_BLOCK.getDefaultState(),FabricBlockSettings.copy(QUARTZ_BLOCK)));
        public static final Block CUT_QUARTZ_WALL = register("cut_quartz_wall", new WallBlock(FabricBlockSettings.copy(QUARTZ_BLOCK)));

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
        //smooth_andesite_slab
        //smooth_andesite_stairs
        //smooth_andesite_wall

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
        public static final Block PURPUR_BLOCK = register("purpur_block", new Block(FabricBlockSettings.copy(PURPUR_PILLAR)));
        public static final Block PURPUR_SLAB = register("purpur_slab", new SlabBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block PURPUR_STAIRS = register("purpur_stairs", new BaseConsistencyStairBlock(PURPUR_BLOCK.getDefaultState(),FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block PURPUR_WALL = register("purpur_wall", new WallBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));

    //Smooth
        public static final Block SMOOTH_PURPUR_BLOCK = register("smooth_purpur_block", new Block(FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block SMOOTH_PURPUR_SLAB = register("smooth_purpur_slab", new SlabBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block SMOOTH_PURPUR_STAIRS = register("smooth_purpur_stairs", new BaseConsistencyStairBlock(PURPUR_BLOCK.getDefaultState(),FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block SMOOTH_PURPUR_WALL = register("smooth_purpur_wall", new WallBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));

    //Polished
        public static final Block POLISHED_PURPUR_BLOCK = register("polished_purpur_block", new Block(FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block POLISHED_PURPUR_SLAB = register("polished_purpur_slab", new SlabBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block POLISHED_PURPUR_STAIRS = register("polished_purpur_stairs", new BaseConsistencyStairBlock(PURPUR_BLOCK.getDefaultState(),FabricBlockSettings.copy(PURPUR_BLOCK)));
        public static final Block POLISHED_PURPUR_WALL = register("polished_purpur_wall", new WallBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));

    //Cut
        public static final Block CUT_PURPUR_WALL = register("cut_purpur_wall", new WallBlock(FabricBlockSettings.copy(PURPUR_BLOCK)));


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

    //Polished
    public static final Block POLISHED_END_STONE = register("polished_end_stone", new Block(FabricBlockSettings.copy(END_STONE)));
    public static final Block POLISHED_END_STONE_SLAB = register("polished_end_stone_slab", new SlabBlock(FabricBlockSettings.copy(END_STONE)));
    public static final Block POLISHED_END_STONE_STAIRS = register("polished_end_stone_stairs", new BaseConsistencyStairBlock(END_STONE.getDefaultState(),FabricBlockSettings.copy(END_STONE)));
    public static final Block POLISHED_END_STONE_WALL = register("polished_end_stone_wall", new WallBlock(FabricBlockSettings.copy(END_STONE)));

    //Cut
        public static final Block CUT_END_STONE = register("cut_end_stone", new Block(FabricBlockSettings.copy(END_STONE)));
        public static final Block CUT_END_STONE_SLAB = register("cut_end_stone_slab", new SlabBlock(FabricBlockSettings.copy(END_STONE)));
        public static final Block CUT_END_STONE_STAIRS = register("cut_end_stone_stairs", new BaseConsistencyStairBlock(END_STONE.getDefaultState(),FabricBlockSettings.copy(END_STONE)));
        public static final Block CUT_END_STONE_WALL = register("cut_end_stone_wall", new WallBlock(FabricBlockSettings.copy(END_STONE)));

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



    //public static final Block FORMAT_FENCE = register("format_fence", new FenceBlock(FabricBlockSettings.of(Material.STONE)));
    //public static final Block FORMAT_FENCE_GATE = register("format_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE)));//
    private static Block register(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier("consistency_plus", name), block);
    }
    public static void init() {
    }
}

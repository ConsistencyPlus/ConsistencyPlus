package net.carterj.consistency_plus;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Items {
    //  Stone-Related Blocks
    public static final Item STONE_BRICK_PILLAR = register("stone_brick_pillar", new BlockItem(Blocks.STONE_BRICK_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item MOSSY_STONE_BRICK_PILLAR = register("mossy_stone_brick_pillar", new BlockItem(Blocks.MOSSY_STONE_BRICK_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item CRACKED_STONE_BRICK_PILLAR = register("cracked_stone_brick_pillar", new BlockItem(Blocks.CRACKED_STONE_BRICK_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item POLISHED_STONE = register("polished_stone", new BlockItem(Blocks.POLISHED_STONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item CRACKED_CHISELED_STONE_BRICKS = register("cracked_chiseled_stone_bricks", new BlockItem(Blocks.CRACKED_CHISELED_STONE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item MOSSY_CHISELED_STONE_BRICKS = register("mossy_chiseled_stone_bricks", new BlockItem(Blocks.MOSSY_CHISELED_STONE_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item CUT_STONE = register("cut_stone", new BlockItem(Blocks.CUT_STONE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item CUT_STONE_SLAB = register("cut_stone_slab", new BlockItem(Blocks.CUT_STONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab", new BlockItem(Blocks.CRACKED_STONE_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item POLISHED_STONE_SLAB = register("polished_stone_slab", new BlockItem(Blocks.POLISHED_STONE_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item STONE_WALL = register("stone_wall", new BlockItem(Blocks.STONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item SMOOTH_STONE_WALL = register("smooth_stone_wall", new BlockItem(Blocks.SMOOTH_STONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item CUT_STONE_WALL = register("cut_stone_wall", new BlockItem(Blocks.CUT_STONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item POLISHED_STONE_WALL = register("polished_stone_wall", new BlockItem(Blocks.POLISHED_STONE_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item CUT_STONE_STAIRS = register("cut_stone_stairs", new BlockItem(Blocks.CUT_STONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item POLISHED_STONE_STAIRS = register("polished_stone_stairs", new BlockItem(Blocks.POLISHED_STONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", new BlockItem(Blocks.CRACKED_STONE_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item SMOOTH_STONE_STAIRS = register("smooth_stone_stairs", new BlockItem(Blocks.SMOOTH_STONE_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    public static final Item CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", new BlockItem(Blocks.CRACKED_STONE_BRICK_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));


    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier("consistency_plus", name), item);
    }
    public static void init() {
    }
}
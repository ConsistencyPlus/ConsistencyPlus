package net.carterj.consistency_plus;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.block.enums.StairShape;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import static net.minecraft.block.Blocks.STONE_BRICKS;
import static net.minecraft.block.Blocks.BLACKSTONE;

public class Blocks {
    // Stone-Related Blocks
    public static final Block POLISHED_STONE = register("polished_stone", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block MOSSY_CHISELED_STONE_BRICKS = register("mossy_chiseled_stone_bricks", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block CRACKED_CHISELED_STONE_BRICKS = register("cracked_chiseled_stone_bricks", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block CUT_STONE = register("cut_stone", new Block(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block CUT_STONE_SLAB  = register("cut_stone_slab", new SlabBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block POLISHED_STONE_SLAB  = register("polished_stone_slab", new SlabBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICK_SLAB  = register("cracked_stone_brick_slab", new SlabBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block CUT_STONE_STAIRS = register("cut_stone_stairs", new BaseConsistencyStairBlock(STONE_BRICKS.getDefaultState(),FabricBlockSettings.of(Material.STONE)));
    public static final Block SMOOTH_STONE_STAIRS = register("smooth_stone_stairs", new BaseConsistencyStairBlock(STONE_BRICKS.getDefaultState(),FabricBlockSettings.of(Material.STONE)));
    public static final Block CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", new BaseConsistencyStairBlock(STONE_BRICKS.getDefaultState(),FabricBlockSettings.of(Material.STONE)));
    public static final Block POLISHED_STONE_STAIRS = register("polished_stone_stairs", new BaseConsistencyStairBlock(STONE_BRICKS.getDefaultState(),FabricBlockSettings.of(Material.STONE)));
    public static final Block STONE_BRICK_PILLAR = register("stone_brick_pillar", new PillarBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICK_PILLAR = register("cracked_stone_brick_pillar", new PillarBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block MOSSY_STONE_BRICK_PILLAR = register("mossy_stone_brick_pillar", new PillarBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block STONE_WALL = register("stone_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block SMOOTH_STONE_WALL = register("smooth_stone_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block CUT_STONE_WALL = register("cut_stone_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block POLISHED_STONE_WALL = register("polished_stone_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));
    public static final Block CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", new WallBlock(FabricBlockSettings.copy(STONE_BRICKS)));
//Blackstone stuff
public static final Block SMOOTH_BLACKSTONE = register("smooth_blackstone", new Block(FabricBlockSettings.copy(BLACKSTONE)));
public static final Block SMOOTH_BLACKSTONE_SLAB = register("smooth_blackstone_slab", new SlabBlock(FabricBlockSettings.copy(BLACKSTONE)));


    //public static final Block FORMAT_FENCE = register("format_fence", new FenceBlock(FabricBlockSettings.of(Material.STONE)));
    //public static final Block FORMAT_FENCE_GATE = register("format_fence_gate", new FenceGateBlock(FabricBlockSettings.of(Material.STONE)));//
    private static Block register(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier("consistency_plus", name), block);
    }
    public static void init() {
    }
}

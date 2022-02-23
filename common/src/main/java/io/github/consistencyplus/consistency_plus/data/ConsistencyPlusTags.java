package io.github.consistencyplus.consistency_plus.data;

import dev.architectury.hooks.tags.TagHooks;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class ConsistencyPlusTags {
    public static class CommonBlocks {
        public static final List<Tag.Identified<Block>> ALL_COMMON_BLOCK_TAGS = new ArrayList<>();

        public static final Tag.Identified<Block> VALID_PORTAL_BLOCKS = TagHooks.optionalBlock(ConsistencyPlusMain.id("valid_portal_blocks"));
        public static final Tag.Identified<Block> VALID_CONDUIT_BLOCKS = TagHooks.optionalBlock(ConsistencyPlusMain.id("valid_conduit_blocks"));

        public static final Tag.Identified<Block> STAIRS = register(new Identifier(ConsistencyPlusMain.ID,"stairs"));
        public static final Tag.Identified<Block> SLABS = register(new Identifier(ConsistencyPlusMain.ID,"slabs"));
        public static final Tag.Identified<Block> WALLS = register(new Identifier(ConsistencyPlusMain.ID,"walls"));
        public static final Tag.Identified<Block> FENCE_GATES = register(new Identifier(ConsistencyPlusMain.ID,"fence_gates"));

        public static final Tag.Identified<Block> STONE_BRICKS = register(new Identifier(ConsistencyPlusMain.ID,"stone_bricks"));

        public static final Tag.Identified<Block> IMPERMEABLE = register(new Identifier(ConsistencyPlusMain.ID,"impermeable"));

        public static final Tag.Identified<Block> DRAGON_IMMUNE = register(new Identifier(ConsistencyPlusMain.ID,"dragon_immune"));

        public static final Tag.Identified<Block> NEEDS_DIAMOND_TOOL = register(new Identifier(ConsistencyPlusMain.ID,"needs_diamond_tool"));

        public static final Tag.Identified<Block> SOUL_SPEED_BLOCKS = register(new Identifier(ConsistencyPlusMain.ID,"soul_speed_blocks"));
        public static final Tag.Identified<Block> SOUL_FIRE_BASE_BLOCKS = register(new Identifier(ConsistencyPlusMain.ID,"soul_fire_base_blocks"));

        public static final Tag.Identified<Block> INFINIBURN_OVERWORLD = register(new Identifier(ConsistencyPlusMain.ID,"infiniburn_overworld"));
        public static final Tag.Identified<Block> INFINIBURN_NETHER = register(new Identifier(ConsistencyPlusMain.ID,"infiniburn_nether"));

        private static Tag.Identified<Block> register(Identifier id){
            Tag.Identified<Block> temp = TagHooks.optionalBlock(id);
            ALL_COMMON_BLOCK_TAGS.add(temp);
            return temp;
        }

        private static void init(){}
    }

    public static class DyeableBlocks {
        public static final List<Tag.Identified<Block>> ALL_DYEABLE_BLOCK_TAGS = new ArrayList<>();

        public static final Tag.Identified<Block> TERRACOTTA_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_slabs"));
        public static final Tag.Identified<Block> TERRACOTTA_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_stairs"));
        public static final Tag.Identified<Block> TERRACOTTA_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_walls"));
        public static final Tag.Identified<Block> TERRACOTTA_GATES = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_gates"));

        public static final Tag.Identified<Block> COBBLED_TERRACOTTA = register(new Identifier(ConsistencyPlusMain.ID, "cobbled_terracotta"));
        public static final Tag.Identified<Block> COBBLED_TERRACOTTA_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "cobbled_terracotta_slabs"));
        public static final Tag.Identified<Block> COBBLED_TERRACOTTA_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "cobbled_terracotta_stairs"));
        public static final Tag.Identified<Block> COBBLED_TERRACOTTA_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "cobbled_terracotta_walls"));
        public static final Tag.Identified<Block> COBBLED_TERRACOTTA_GATES = register(new Identifier(ConsistencyPlusMain.ID, "cobbled_terracotta_gates"));

        public static final Tag.Identified<Block> SMOOTH_TERRACOTTA = register(new Identifier(ConsistencyPlusMain.ID, "smooth_terracotta"));
        public static final Tag.Identified<Block> SMOOTH_TERRACOTTA_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "smooth_terracotta_slabs"));
        public static final Tag.Identified<Block> SMOOTH_TERRACOTTA_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "smooth_terracotta_stairs"));
        public static final Tag.Identified<Block> SMOOTH_TERRACOTTA_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "smooth_terracotta_walls"));
        public static final Tag.Identified<Block> SMOOTH_TERRACOTTA_GATES = register(new Identifier(ConsistencyPlusMain.ID, "smooth_terracotta_gates"));

        public static final Tag.Identified<Block> POLISHED_TERRACOTTA = register(new Identifier(ConsistencyPlusMain.ID, "polished_terracotta"));
        public static final Tag.Identified<Block> POLISHED_TERRACOTTA_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "polished_terracotta_slabs"));
        public static final Tag.Identified<Block> POLISHED_TERRACOTTA_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "polished_terracotta_stairs"));
        public static final Tag.Identified<Block> POLISHED_TERRACOTTA_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "polished_terracotta_walls"));
        public static final Tag.Identified<Block> POLISHED_TERRACOTTA_GATES = register(new Identifier(ConsistencyPlusMain.ID, "polished_terracotta_gates"));

        public static final Tag.Identified<Block> CUT_TERRACOTTA = register(new Identifier(ConsistencyPlusMain.ID, "cut_terracotta"));
        public static final Tag.Identified<Block> CUT_TERRACOTTA_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "cut_terracotta_slabs"));
        public static final Tag.Identified<Block> CUT_TERRACOTTA_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "cut_terracotta_stairs"));
        public static final Tag.Identified<Block> CUT_TERRACOTTA_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "cut_terracotta_walls"));
        public static final Tag.Identified<Block> CUT_TERRACOTTA_GATES = register(new Identifier(ConsistencyPlusMain.ID, "cut_terracotta_gates"));

        public static final Tag.Identified<Block> TERRACOTTA_BRICK = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_brick"));
        public static final Tag.Identified<Block> TERRACOTTA_BRICK_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_brick_slabs"));
        public static final Tag.Identified<Block> TERRACOTTA_BRICK_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_brick_stairs"));
        public static final Tag.Identified<Block> TERRACOTTA_BRICK_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_brick_walls"));
        public static final Tag.Identified<Block> TERRACOTTA_BRICK_GATES = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_brick_gates"));

        public static final Tag.Identified<Block> TERRACOTTA_TILES = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_tile"));
        public static final Tag.Identified<Block> TERRACOTTA_TILES_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_tile_slabs"));
        public static final Tag.Identified<Block> TERRACOTTA_TILES_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_tile_stairs"));
        public static final Tag.Identified<Block> TERRACOTTA_TILES_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_tile_walls"));
        public static final Tag.Identified<Block> TERRACOTTA_TILES_GATES = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_tile_gates"));

        public static final Tag.Identified<Block> TERRACOTTA_CORNER_PILLAR = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_corner_pillar"));
        public static final Tag.Identified<Block> TERRACOTTA_PILLAR = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_pillar"));
        public static final Tag.Identified<Block> CHISELED_TERRACOTTA = register(new Identifier(ConsistencyPlusMain.ID, "chiseled_terracotta"));
        public static final Tag.Identified<Block> CARVED_TERRACOTTA = register(new Identifier(ConsistencyPlusMain.ID, "carved_terracotta"));

        public static final Tag.Identified<Block> CONCRETE_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_slabs"));
        public static final Tag.Identified<Block> CONCRETE_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_stairs"));
        public static final Tag.Identified<Block> CONCRETE_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_walls"));
        public static final Tag.Identified<Block> CONCRETE_GATES = register(new Identifier(ConsistencyPlusMain.ID, "concrete_gates"));

        public static final Tag.Identified<Block> SMOOTH_CONCRETE = register(new Identifier(ConsistencyPlusMain.ID, "smooth_concrete"));
        public static final Tag.Identified<Block> SMOOTH_CONCRETE_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "smooth_concrete_slabs"));
        public static final Tag.Identified<Block> SMOOTH_CONCRETE_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "smooth_concrete_stairs"));
        public static final Tag.Identified<Block> SMOOTH_CONCRETE_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "smooth_concrete_walls"));
        public static final Tag.Identified<Block> SMOOTH_CONCRETE_GATES = register(new Identifier(ConsistencyPlusMain.ID, "smooth_concrete_gates"));

        public static final Tag.Identified<Block> POLISHED_CONCRETE = register(new Identifier(ConsistencyPlusMain.ID, "polished_concrete"));
        public static final Tag.Identified<Block> POLISHED_CONCRETE_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "polished_concrete_slabs"));
        public static final Tag.Identified<Block> POLISHED_CONCRETE_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "polished_concrete_stairs"));
        public static final Tag.Identified<Block> POLISHED_CONCRETE_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "polished_concrete_walls"));
        public static final Tag.Identified<Block> POLISHED_CONCRETE_GATES = register(new Identifier(ConsistencyPlusMain.ID, "polished_concrete_gates"));

        public static final Tag.Identified<Block> CUT_CONCRETE = register(new Identifier(ConsistencyPlusMain.ID, "cut_concrete"));
        public static final Tag.Identified<Block> CUT_CONCRETE_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "cut_concrete_slabs"));
        public static final Tag.Identified<Block> CUT_CONCRETE_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "cut_concrete_stairs"));
        public static final Tag.Identified<Block> CUT_CONCRETE_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "cut_concrete_walls"));
        public static final Tag.Identified<Block> CUT_CONCRETE_GATES = register(new Identifier(ConsistencyPlusMain.ID, "cut_concrete_gates"));

        public static final Tag.Identified<Block> CONCRETE_BRICK = register(new Identifier(ConsistencyPlusMain.ID, "concrete_brick"));
        public static final Tag.Identified<Block> CONCRETE_BRICK_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_brick_slabs"));
        public static final Tag.Identified<Block> CONCRETE_BRICK_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_brick_stairs"));
        public static final Tag.Identified<Block> CONCRETE_BRICK_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_brick_walls"));
        public static final Tag.Identified<Block> CONCRETE_BRICK_GATES = register(new Identifier(ConsistencyPlusMain.ID, "concrete_brick_gates"));

        public static final Tag.Identified<Block> CONCRETE_TILE = register(new Identifier(ConsistencyPlusMain.ID, "concrete_tile"));
        public static final Tag.Identified<Block> CONCRETE_TILE_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_tile_slabs"));
        public static final Tag.Identified<Block> CONCRETE_TILE_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_tile_stairs"));
        public static final Tag.Identified<Block> CONCRETE_TILE_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_tile_walls"));
        public static final Tag.Identified<Block> CONCRETE_TILE_GATES = register(new Identifier(ConsistencyPlusMain.ID, "concrete_tile_gates"));

        public static final Tag.Identified<Block> CONCRETE_CORNER_PILLAR = register(new Identifier(ConsistencyPlusMain.ID, "concrete_corner_pillar"));
        public static final Tag.Identified<Block> CONCRETE_PILLAR = register(new Identifier(ConsistencyPlusMain.ID, "concrete_pillar"));
        public static final Tag.Identified<Block> CHISELED_CONCRETE = register(new Identifier(ConsistencyPlusMain.ID, "chiseled_concrete"));
        public static final Tag.Identified<Block> CARVED_CONCRETE = register(new Identifier(ConsistencyPlusMain.ID, "carved_concrete"));

        public static final Tag.Identified<Block> ICE = register(new Identifier(ConsistencyPlusMain.ID, "ice"));
        public static final Tag.Identified<Block> ICE_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "ice_slabs"));
        public static final Tag.Identified<Block> ICE_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "ice_stairs"));
        public static final Tag.Identified<Block> ICE_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "ice_walls"));
        public static final Tag.Identified<Block> ICE_GATES = register(new Identifier(ConsistencyPlusMain.ID, "ice_gates"));

        public static final Tag.Identified<Block> GLOWSTONE = register(new Identifier(ConsistencyPlusMain.ID, "glowstone"));
        public static final Tag.Identified<Block> GLOWSTONE_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "glowstone_slabs"));
        public static final Tag.Identified<Block> GLOWSTONE_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "glowstone_stairs"));
        public static final Tag.Identified<Block> GLOWSTONE_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "glowstone_walls"));
        public static final Tag.Identified<Block> GLOWSTONE_GATES = register(new Identifier(ConsistencyPlusMain.ID, "glowstone_gates"));

        public static final Tag.Identified<Block> TINTED_GLASS_BLOCK = register(new Identifier(ConsistencyPlusMain.ID, "tinted_glass"));

        private static Tag.Identified<Block> register(Identifier id){
            Tag.Identified<Block> temp = TagHooks.optionalBlock(id);
            ALL_DYEABLE_BLOCK_TAGS.add(temp);
            return temp;
        }

        private static void init(){}

    }

    public static void init(){
        DyeableBlocks.init();
        CommonBlocks.init();
    }
}

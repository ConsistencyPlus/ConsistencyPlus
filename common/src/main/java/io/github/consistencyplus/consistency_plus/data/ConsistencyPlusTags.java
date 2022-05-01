package io.github.consistencyplus.consistency_plus.data;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.List;

public class ConsistencyPlusTags {
    public static class Common{
        public static final TagKey<Block> OBSIDIAN = register("obsidian");
        public static final TagKey<Block> NETHERRACK = register("netherrack");
        public static final TagKey<Block> SANDSTONE = register("sandstone");
        public static final TagKey<Block> STONE = register("stone");
        public static final TagKey<Block> TERRACOTTA = register("terracotta");
        public static final TagKey<Block> CONCRETE = register("concrete");
        public static final TagKey<Block> GLOWSTONE = register("glowstone");

        public static TagKey<Block> register(String name){
            return TagUtil.initBlockTag(name, Registry.BLOCK_KEY);
        }
    }

    public static class ConsistencySpecificTags {
        public static final List<TagKey<Block>> ALL_COMMON_BLOCK_TAGS = new ArrayList<>();

        public static final TagKey<Block> VALID_PORTAL_BLOCKS = register("valid_portal_blocks");
        public static final TagKey<Block> VALID_CONDUIT_BLOCKS = register("valid_conduit_blocks");

        public static final TagKey<Block> STAIRS = register("block_shape/stairs");
        public static final TagKey<Block> SLABS = register("block_shape/slab");
        public static final TagKey<Block> WALLS = register("block_shape/wall");
        public static final TagKey<Block> FENCE_GATES = register("block_shape/gate");

        public static final TagKey<Block> IMPERMEABLE = register("impermeable");

        public static final TagKey<Block> DRAGON_IMMUNE = register("dragon_immune");

        public static final TagKey<Block> NEEDS_DIAMOND_TOOL = register("needs_diamond_tool");

        public static final TagKey<Block> SOUL_SPEED_BLOCKS = register("soul_speed_blocks");
        public static final TagKey<Block> SOUL_FIRE_BASE_BLOCKS = register("soul_fire_base_blocks");

        public static final TagKey<Block> INFINIBURN_OVERWORLD = register("infiniburn_overworld");
        public static final TagKey<Block> INFINIBURN_NETHER = register("infiniburn_nether");

        public static final TagKey<Block> OBSIDIAN = register("material/obsidian");
        public static final TagKey<Block> NETHERRACK = register("material/netherrack");
        public static final TagKey<Block> SANDSTONE = register("material/sandstone");
        public static final TagKey<Block> STONE = register("material/stone");
        public static final TagKey<Block> TERRACOTTA = register("material/terracotta");
        public static final TagKey<Block> CONCRETE = register("material/concrete");
        public static final TagKey<Block> GLOWSTONE = register("material/glowstone");
        public static final TagKey<Block> SOUL_SANDSTONE = register("material/soul_sandstone");

        public static TagKey<Block> register(String string){
            TagKey<Block> temp = TagKey.of(Registry.BLOCK_KEY, new Identifier(ConsistencyPlusMain.ID, string));
            ALL_COMMON_BLOCK_TAGS.add(temp);
            return temp;
        }

        private static void init(){}
    }

    public static class DyeableBlocks {
        public static final List<TagKey<Block>> ALL_DYEABLE_BLOCK_TAGS = new ArrayList<>();

        public static final TagKey<Block> TERRACOTTA_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_slabs"));
        public static final TagKey<Block> TERRACOTTA_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_stairs"));
        public static final TagKey<Block> TERRACOTTA_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_walls"));
        public static final TagKey<Block> TERRACOTTA_GATES = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_gates"));

        public static final TagKey<Block> COBBLED_TERRACOTTA = register(new Identifier(ConsistencyPlusMain.ID, "cobbled_terracotta"));
        public static final TagKey<Block> COBBLED_TERRACOTTA_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "cobbled_terracotta_slabs"));
        public static final TagKey<Block> COBBLED_TERRACOTTA_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "cobbled_terracotta_stairs"));
        public static final TagKey<Block> COBBLED_TERRACOTTA_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "cobbled_terracotta_walls"));
        public static final TagKey<Block> COBBLED_TERRACOTTA_GATES = register(new Identifier(ConsistencyPlusMain.ID, "cobbled_terracotta_gates"));

        public static final TagKey<Block> SMOOTH_TERRACOTTA = register(new Identifier(ConsistencyPlusMain.ID, "smooth_terracotta"));
        public static final TagKey<Block> SMOOTH_TERRACOTTA_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "smooth_terracotta_slabs"));
        public static final TagKey<Block> SMOOTH_TERRACOTTA_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "smooth_terracotta_stairs"));
        public static final TagKey<Block> SMOOTH_TERRACOTTA_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "smooth_terracotta_walls"));
        public static final TagKey<Block> SMOOTH_TERRACOTTA_GATES = register(new Identifier(ConsistencyPlusMain.ID, "smooth_terracotta_gates"));

        public static final TagKey<Block> POLISHED_TERRACOTTA = register(new Identifier(ConsistencyPlusMain.ID, "polished_terracotta"));
        public static final TagKey<Block> POLISHED_TERRACOTTA_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "polished_terracotta_slabs"));
        public static final TagKey<Block> POLISHED_TERRACOTTA_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "polished_terracotta_stairs"));
        public static final TagKey<Block> POLISHED_TERRACOTTA_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "polished_terracotta_walls"));
        public static final TagKey<Block> POLISHED_TERRACOTTA_GATES = register(new Identifier(ConsistencyPlusMain.ID, "polished_terracotta_gates"));

        public static final TagKey<Block> CUT_TERRACOTTA = register(new Identifier(ConsistencyPlusMain.ID, "cut_terracotta"));
        public static final TagKey<Block> CUT_TERRACOTTA_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "cut_terracotta_slabs"));
        public static final TagKey<Block> CUT_TERRACOTTA_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "cut_terracotta_stairs"));
        public static final TagKey<Block> CUT_TERRACOTTA_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "cut_terracotta_walls"));
        public static final TagKey<Block> CUT_TERRACOTTA_GATES = register(new Identifier(ConsistencyPlusMain.ID, "cut_terracotta_gates"));

        public static final TagKey<Block> TERRACOTTA_BRICK = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_brick"));
        public static final TagKey<Block> TERRACOTTA_BRICK_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_brick_slabs"));
        public static final TagKey<Block> TERRACOTTA_BRICK_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_brick_stairs"));
        public static final TagKey<Block> TERRACOTTA_BRICK_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_brick_walls"));
        public static final TagKey<Block> TERRACOTTA_BRICK_GATES = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_brick_gates"));

        public static final TagKey<Block> TERRACOTTA_TILES = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_tile"));
        public static final TagKey<Block> TERRACOTTA_TILES_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_tile_slabs"));
        public static final TagKey<Block> TERRACOTTA_TILES_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_tile_stairs"));
        public static final TagKey<Block> TERRACOTTA_TILES_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_tile_walls"));
        public static final TagKey<Block> TERRACOTTA_TILES_GATES = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_tile_gates"));

        public static final TagKey<Block> TERRACOTTA_CORNER_PILLAR = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_corner_pillar"));
        public static final TagKey<Block> TERRACOTTA_PILLAR = register(new Identifier(ConsistencyPlusMain.ID, "terracotta_pillar"));
        public static final TagKey<Block> CHISELED_TERRACOTTA = register(new Identifier(ConsistencyPlusMain.ID, "chiseled_terracotta"));
        public static final TagKey<Block> CARVED_TERRACOTTA = register(new Identifier(ConsistencyPlusMain.ID, "carved_terracotta"));

        public static final TagKey<Block> CONCRETE_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_slabs"));
        public static final TagKey<Block> CONCRETE_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_stairs"));
        public static final TagKey<Block> CONCRETE_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_walls"));
        public static final TagKey<Block> CONCRETE_GATES = register(new Identifier(ConsistencyPlusMain.ID, "concrete_gates"));

        public static final TagKey<Block> SMOOTH_CONCRETE = register(new Identifier(ConsistencyPlusMain.ID, "smooth_concrete"));
        public static final TagKey<Block> SMOOTH_CONCRETE_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "smooth_concrete_slabs"));
        public static final TagKey<Block> SMOOTH_CONCRETE_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "smooth_concrete_stairs"));
        public static final TagKey<Block> SMOOTH_CONCRETE_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "smooth_concrete_walls"));
        public static final TagKey<Block> SMOOTH_CONCRETE_GATES = register(new Identifier(ConsistencyPlusMain.ID, "smooth_concrete_gates"));

        public static final TagKey<Block> POLISHED_CONCRETE = register(new Identifier(ConsistencyPlusMain.ID, "polished_concrete"));
        public static final TagKey<Block> POLISHED_CONCRETE_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "polished_concrete_slabs"));
        public static final TagKey<Block> POLISHED_CONCRETE_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "polished_concrete_stairs"));
        public static final TagKey<Block> POLISHED_CONCRETE_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "polished_concrete_walls"));
        public static final TagKey<Block> POLISHED_CONCRETE_GATES = register(new Identifier(ConsistencyPlusMain.ID, "polished_concrete_gates"));

        public static final TagKey<Block> CUT_CONCRETE = register(new Identifier(ConsistencyPlusMain.ID, "cut_concrete"));
        public static final TagKey<Block> CUT_CONCRETE_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "cut_concrete_slabs"));
        public static final TagKey<Block> CUT_CONCRETE_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "cut_concrete_stairs"));
        public static final TagKey<Block> CUT_CONCRETE_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "cut_concrete_walls"));
        public static final TagKey<Block> CUT_CONCRETE_GATES = register(new Identifier(ConsistencyPlusMain.ID, "cut_concrete_gates"));

        public static final TagKey<Block> CONCRETE_BRICK = register(new Identifier(ConsistencyPlusMain.ID, "concrete_brick"));
        public static final TagKey<Block> CONCRETE_BRICK_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_brick_slabs"));
        public static final TagKey<Block> CONCRETE_BRICK_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_brick_stairs"));
        public static final TagKey<Block> CONCRETE_BRICK_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_brick_walls"));
        public static final TagKey<Block> CONCRETE_BRICK_GATES = register(new Identifier(ConsistencyPlusMain.ID, "concrete_brick_gates"));

        public static final TagKey<Block> CONCRETE_TILE = register(new Identifier(ConsistencyPlusMain.ID, "concrete_tile"));
        public static final TagKey<Block> CONCRETE_TILE_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_tile_slabs"));
        public static final TagKey<Block> CONCRETE_TILE_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_tile_stairs"));
        public static final TagKey<Block> CONCRETE_TILE_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "concrete_tile_walls"));
        public static final TagKey<Block> CONCRETE_TILE_GATES = register(new Identifier(ConsistencyPlusMain.ID, "concrete_tile_gates"));

        public static final TagKey<Block> CONCRETE_CORNER_PILLAR = register(new Identifier(ConsistencyPlusMain.ID, "concrete_corner_pillar"));
        public static final TagKey<Block> CONCRETE_PILLAR = register(new Identifier(ConsistencyPlusMain.ID, "concrete_pillar"));
        public static final TagKey<Block> CHISELED_CONCRETE = register(new Identifier(ConsistencyPlusMain.ID, "chiseled_concrete"));
        public static final TagKey<Block> CARVED_CONCRETE = register(new Identifier(ConsistencyPlusMain.ID, "carved_concrete"));

        public static final TagKey<Block> ICE = register(new Identifier(ConsistencyPlusMain.ID, "ice"));
        public static final TagKey<Block> ICE_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "ice_slabs"));
        public static final TagKey<Block> ICE_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "ice_stairs"));
        public static final TagKey<Block> ICE_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "ice_walls"));
        public static final TagKey<Block> ICE_GATES = register(new Identifier(ConsistencyPlusMain.ID, "ice_gates"));

        public static final TagKey<Block> GLOWSTONE = register(new Identifier(ConsistencyPlusMain.ID, "glowstone"));
        public static final TagKey<Block> GLOWSTONE_SLABS = register(new Identifier(ConsistencyPlusMain.ID, "glowstone_slabs"));
        public static final TagKey<Block> GLOWSTONE_STAIRS = register(new Identifier(ConsistencyPlusMain.ID, "glowstone_stairs"));
        public static final TagKey<Block> GLOWSTONE_WALLS = register(new Identifier(ConsistencyPlusMain.ID, "glowstone_walls"));
        public static final TagKey<Block> GLOWSTONE_GATES = register(new Identifier(ConsistencyPlusMain.ID, "glowstone_gates"));

        public static final TagKey<Block> TINTED_GLASS_BLOCK = register(new Identifier(ConsistencyPlusMain.ID, "tinted_glass"));

        public static TagKey<Block> register(Identifier id){
            TagKey<Block> temp = TagKey.of(Registry.BLOCK_KEY, id);
            ALL_DYEABLE_BLOCK_TAGS.add(temp);
            return temp;
        }

        private static void init(){}

    }

    public static void init(){
        DyeableBlocks.init();
        ConsistencySpecificTags.init();
    }
}

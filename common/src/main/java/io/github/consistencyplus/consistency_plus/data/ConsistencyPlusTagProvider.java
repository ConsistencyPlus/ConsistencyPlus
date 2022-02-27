package io.github.consistencyplus.consistency_plus.data;

import dev.architectury.injectables.annotations.ExpectPlatform;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusFenceGateBlock;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import net.minecraft.block.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.server.AbstractTagProvider;
import net.minecraft.data.server.BlockTagsProvider;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.Tag;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

public class ConsistencyPlusTagProvider {

    public static class CommonBlockTagProvider extends BlockTagsProvider {

        private static final Logger LOGGER = LogManager.getLogger(CommonBlockTagProvider.class);

        public CommonBlockTagProvider(DataGenerator dataGenerator) {
            super(dataGenerator);
        }

        protected void configure() {}

        public static void createAndFillTags(Function<Tag.Identified<Block>, ObjectBuilder<Block>> getOrCreateTagBuilderFunc){
            Registry.BLOCK.getEntries().stream().filter((entry) -> Objects.equals(entry.getKey().getValue().getNamespace(), ConsistencyPlusMain.ID))
                    .forEach((entry) -> {
                        Identifier identifier = entry.getKey().getValue();
                        Block block = entry.getValue();

                        boolean isNormalBlock = true;

                        LOGGER.info("[CommonBlockTagProvider]: " + identifier + " / " + block);

                        if(block instanceof StairsBlock){
                            getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.STAIRS).add(block);
                            isNormalBlock = false;
                        }else if(block instanceof SlabBlock){
                            getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.SLABS).add(block);
                            isNormalBlock = false;
                        }else if(block instanceof WallBlock){
                            getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.WALLS).add(block);
                            isNormalBlock = false;
                        }else if(block instanceof CPlusFenceGateBlock){
                            getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.FENCE_GATES).add(block);
                            isNormalBlock = false;
                        }


                        String[] splitIdentifier = identifier.getPath().split("_");
                        boolean isCryingObs = false;

                        for(String string :  splitIdentifier){
                            switch(string) {
                                case "obsidian":
                                    getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.DRAGON_IMMUNE).add(block);
                                    getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.NEEDS_DIAMOND_TOOL).add(block);

                                    break;
                                case "crying":
                                    isCryingObs = true;
                                    break;
                                case "prismarine":
                                    getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.VALID_CONDUIT_BLOCKS).add(block);
                                    break;
                            }

                            if(isNormalBlock){
                                boolean shouldBreakForLoop = false;

//                                if(string.equals("bricks"))
//                                    getOrCreateTagBuilder.apply(ConsistencyPlusTags.CommonBlocks.BRICKS).add(block);

                                if(string.equals("terracotta"))
                                    getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.TERRACOTTA).add(block);

                                switch(string){
                                    case "obsidian":
                                        getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.OBSIDIAN).add(block);

                                        if(!isCryingObs)
                                            getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.VALID_PORTAL_BLOCKS).add(block);

                                        break;
                                    case "glass":
                                        getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.IMPERMEABLE).add(block);
                                        shouldBreakForLoop = true;
                                        break;
                                    case "end":
                                        getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.DRAGON_IMMUNE).add(block);
                                        shouldBreakForLoop = true;
                                        break;
                                    case "soul":
                                        getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.SOUL_FIRE_BASE_BLOCKS).add(block);
                                        getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.SOUL_SPEED_BLOCKS).add(block);
                                        shouldBreakForLoop = true;
                                        break;
                                    case "netherrack":
                                        getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.NETHERRACK).add(block);
                                    case "nether":
                                        getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.INFINIBURN_OVERWORLD).add(block);
                                        getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.INFINIBURN_NETHER).add(block);
                                        shouldBreakForLoop = true;
                                        break;
                                    case "sandstone":
                                        getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.SANDSTONE).add(block);
                                        shouldBreakForLoop = true;
                                        break;
                                    case "stone":
                                        getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.STONE).add(block);
                                        shouldBreakForLoop = true;
                                        break;
                                    case "concrete":
                                        getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.CONCRETE).add(block);
                                        shouldBreakForLoop = true;
                                        break;
                                }

                                if(shouldBreakForLoop){
                                    break;
                                }
                            }
                        }
                    });

            getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.NEEDS_DIAMOND_TOOL).add(CPlusBlocks.NETHERITE_STAIRS);

            getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.VALID_CONDUIT_BLOCKS).add(
                    Blocks.PRISMARINE,
                    Blocks.PRISMARINE_BRICK_SLAB,
                    Blocks.PRISMARINE_BRICK_STAIRS,
                    Blocks.PRISMARINE_BRICKS,
                    Blocks.PRISMARINE_SLAB,
                    Blocks.PRISMARINE_STAIRS,
                    Blocks.PRISMARINE_WALL,
                    Blocks.DARK_PRISMARINE,
                    Blocks.DARK_PRISMARINE_SLAB,
                    Blocks.DARK_PRISMARINE_STAIRS,
                    CPlusBlocks.NUBERT);

            getOrCreateTagBuilderFunc.apply(BlockTags.BEACON_BASE_BLOCKS).add(CPlusBlocks.NUBERT);
            getOrCreateTagBuilderFunc.apply(BlockTags.PIGLIN_REPELLENTS).add(CPlusBlocks.JACK_O_SOUL);

            getOrCreateTagBuilderFunc.apply(BlockTags.STAIRS).addTag(ConsistencyPlusTags.ConsistencySpecificTags.STAIRS);
            getOrCreateTagBuilderFunc.apply(BlockTags.SLABS).addTag(ConsistencyPlusTags.ConsistencySpecificTags.SLABS);
            getOrCreateTagBuilderFunc.apply(BlockTags.WALLS).addTag(ConsistencyPlusTags.ConsistencySpecificTags.WALLS);
            getOrCreateTagBuilderFunc.apply(BlockTags.FENCE_GATES).addTag(ConsistencyPlusTags.ConsistencySpecificTags.FENCE_GATES);

            getOrCreateTagBuilderFunc.apply(BlockTags.IMPERMEABLE).addTag(ConsistencyPlusTags.ConsistencySpecificTags.IMPERMEABLE);

            getOrCreateTagBuilderFunc.apply(BlockTags.DRAGON_IMMUNE).addTag(ConsistencyPlusTags.ConsistencySpecificTags.DRAGON_IMMUNE);

            getOrCreateTagBuilderFunc.apply(BlockTags.NEEDS_DIAMOND_TOOL).addTag(ConsistencyPlusTags.ConsistencySpecificTags.NEEDS_DIAMOND_TOOL);

            getOrCreateTagBuilderFunc.apply(BlockTags.SOUL_SPEED_BLOCKS).addTag(ConsistencyPlusTags.ConsistencySpecificTags.SOUL_SPEED_BLOCKS);
            getOrCreateTagBuilderFunc.apply(BlockTags.SOUL_FIRE_BASE_BLOCKS).addTag(ConsistencyPlusTags.ConsistencySpecificTags.SOUL_FIRE_BASE_BLOCKS);

            getOrCreateTagBuilderFunc.apply(BlockTags.INFINIBURN_OVERWORLD).addTag(ConsistencyPlusTags.ConsistencySpecificTags.INFINIBURN_OVERWORLD);
            getOrCreateTagBuilderFunc.apply(BlockTags.INFINIBURN_NETHER).addTag(ConsistencyPlusTags.ConsistencySpecificTags.INFINIBURN_NETHER);

            getOrCreateTagBuilderFunc.apply(BlockTags.TERRACOTTA).addTag(ConsistencyPlusTags.ConsistencySpecificTags.TERRACOTTA);

            //-----------------------------------------------------------------------------------------------------------------------------//

            getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.Common.OBSIDIAN).addTag(ConsistencyPlusTags.ConsistencySpecificTags.OBSIDIAN);
            getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.Common.NETHERRACK).addTag(ConsistencyPlusTags.ConsistencySpecificTags.NETHERRACK);
            getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.Common.SANDSTONE).addTag(ConsistencyPlusTags.ConsistencySpecificTags.SANDSTONE);
            getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.Common.STONE).addTag(ConsistencyPlusTags.ConsistencySpecificTags.STONE);
            getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.Common.TERRACOTTA).addTag(ConsistencyPlusTags.ConsistencySpecificTags.TERRACOTTA);
            getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.Common.CONCRETE).addTag(ConsistencyPlusTags.ConsistencySpecificTags.CONCRETE);

        }
    }

    public static class DyeableBlockTagProvider extends BlockTagsProvider {

        public DyeableBlockTagProvider(DataGenerator dataGenerator) {
            super(dataGenerator);
        }

        private static final Logger LOGGER = LogManager.getLogger(DyeableBlockTagProvider.class);

        private static final DyeColor[] DYE_VALUES = DyeColor.values();

        private static final List<String> BLOCK_PREFIXES = List.of("cobbled", "smooth", "cut", "chiseled", "carved", "polished");

        private static final Map<String, String> BLOCK_SUFFIXES = Map.of(
                "brick", "bricks",
                "tile", "tiles",
                "corner", "corner_pillar",
                "pillar", "pillar",
                "glass", "glass");

        private static final Map<String, String> BLOCK_TYPE = Map.of(
                "gates", "gate",
                "slabs", "slab",
                "stairs", "stairs",
                "walls", "wall");

        private static final Map<String, Identifier> TERRACOTA_BRICK_REMAP = Map.of(
                "brick", new Identifier("bricks"),
                "slabs", new Identifier("brick_slab"),
                "stairs", new Identifier("brick_stairs"),
                "walls", new Identifier("brick_wall"),
                "gates", new Identifier(ConsistencyPlusMain.ID, "brick_gate"));

        protected void configure() {
        }

        public static void createAndFillTag(Function<Tag.Identified<Block>, ObjectBuilder<Block>> getOrCreateTagBuilderFunc) {
            ConsistencyPlusTags.DyeableBlocks.ALL_DYEABLE_BLOCK_TAGS.forEach(identified -> createAndFillTags(identified, getOrCreateTagBuilderFunc));
        }

        private static void createAndFillTags(Tag.Identified<Block> identified, Function<Tag.Identified<Block>, ObjectBuilder<Block>> getOrCreateTagBuilderFunc){
            String[] nameParts = identified.getId().getPath().split("_");

            String blockNamePrefix;
            String blockNameSuffix;

            if(BLOCK_PREFIXES.contains(nameParts[0])){
                blockNamePrefix = nameParts[0];
                blockNameSuffix = nameParts[1];

                if(nameParts.length == 3){
                    blockNameSuffix = blockNameSuffix + "_" + BLOCK_TYPE.get(nameParts[nameParts.length - 1]);
                }
            }else if(nameParts.length > 1 && BLOCK_SUFFIXES.containsKey(nameParts[1])){
                blockNamePrefix = null;


                if(nameParts.length == 3 && !(Objects.equals(nameParts[1], "corner"))){
                    blockNameSuffix = nameParts[0] + "_" + nameParts[1];

                    blockNameSuffix = blockNameSuffix + "_" + BLOCK_TYPE.get(nameParts[nameParts.length - 1]);
                }else{
                    blockNameSuffix = nameParts[0] + "_" + BLOCK_SUFFIXES.get(nameParts[1]);
                }
            }else{
                blockNamePrefix = null;

                if(nameParts.length > 1){
                    blockNameSuffix = nameParts[0] + "_" + BLOCK_TYPE.get(nameParts[1]);
                }else{
                    blockNameSuffix = nameParts[0];
                }
            }

            Block defaultBlock;

            boolean minecraftNameSpace = Objects.equals(nameParts[0], "tinted") || (nameParts.length == 1 && (Objects.equals(nameParts[0], "ice") || Objects.equals(nameParts[0], "glowstone")));

            if(blockNamePrefix != null){
                defaultBlock = Registry.BLOCK.get(new Identifier(minecraftNameSpace ? "minecraft" : ConsistencyPlusMain.ID, blockNamePrefix + "_" + blockNameSuffix));
                LOGGER.info("[1]:" +  new Identifier(minecraftNameSpace ? "minecraft" : ConsistencyPlusMain.ID, blockNamePrefix + "_" + blockNameSuffix));
            }else{
                defaultBlock = Registry.BLOCK.get(new Identifier(minecraftNameSpace ? "minecraft" : ConsistencyPlusMain.ID, blockNameSuffix));
                LOGGER.info("[2]:" + new Identifier(minecraftNameSpace ? "minecraft" : ConsistencyPlusMain.ID, blockNameSuffix));
            }

            if(defaultBlock == Blocks.AIR) {
                if (nameParts.length >= 2 && nameParts[0].equals("terracotta")) {
                    if (Objects.equals(nameParts[1], "brick") || Objects.equals(nameParts[1], "bricks")) {
                        LOGGER.info("FUCKFUCKFUCKF");
                        defaultBlock = Registry.BLOCK.get(TERRACOTA_BRICK_REMAP.get(nameParts[nameParts.length - 1]));
                    }
                }
            }

            if(defaultBlock == Blocks.AIR){
                if(blockNamePrefix != null){
                    LOGGER.info("[1]:" + blockNamePrefix + "_" + blockNameSuffix);
                }else{
                    LOGGER.info("[2]:" + blockNameSuffix);
                }
            }

            for(int i = 0; i < DYE_VALUES.length; i++){
                boolean isItBlueIce = nameParts[0] == "ice" && DYE_VALUES[i].getName() == "blue";

                if(blockNamePrefix != null){
                    getOrCreateTagBuilderFunc.apply(identified).add(Registry.BLOCK.get(new Identifier(ConsistencyPlusMain.ID, blockNamePrefix + "_" + DYE_VALUES[i].getName() + "_" + blockNameSuffix)));
                    //this.getOrCreateTagBuilder(identified).add(Registry.BLOCK.get(new Identifier(ConsistencyPlusMain.ID, blockNamePrefix + "_" + DYE_VALUES[i].getName() + "_" + blockNameSuffix)));
                }else{

                    getOrCreateTagBuilderFunc.apply(identified).add(Registry.BLOCK.get(new Identifier(isItBlueIce ? "minecraft" : ConsistencyPlusMain.ID, DYE_VALUES[i].getName() + "_" + blockNameSuffix)));
                    //this.getOrCreateTagBuilder(identified).add(Registry.BLOCK.get(new Identifier(isItBlueIce ? "minecraft" : ConsistencyPlusMain.ID, DYE_VALUES[i].getName() + "_" + blockNameSuffix)));
                }
            }

            if(defaultBlock != Blocks.AIR){
                getOrCreateTagBuilderFunc.apply(identified).add(defaultBlock);
            }else{
                LOGGER.info(nameParts[0] + " / " + defaultBlock + " / " + identified.getId());
                //System.out.println(identified.getId() + " / " +  defaultBlock.toString());
            }

            if(identified == ConsistencyPlusTags.DyeableBlocks.GLOWSTONE){
                getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.Common.GLOWSTONE).addTag(ConsistencyPlusTags.DyeableBlocks.GLOWSTONE);
            }
        }
    }
}

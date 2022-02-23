package io.github.consistencyplus.consistency_plus.data.providers;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.data.ConsistencyPlusTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.tag.Tag;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ConsistencyPlusTagProvider {

    public static class DyeableBlockTagProvider extends FabricTagProvider.BlockTagProvider {

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
                "slabs",  new Identifier("brick_slab"),
                "stairs",  new Identifier("brick_stairs"),
                "walls", new Identifier("brick_wall"),
                "gates", new Identifier(ConsistencyPlusMain.ID,"brick_gate"));

        public DyeableBlockTagProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateTags() {
            ConsistencyPlusTags.DyeableBlocks.ALL_DYEABLE_BLOCK_TAGS.forEach(this::createAndFillTag);

//            ReflectionUtils.iterateAccessibleStaticFields(ConsistencyPlusTags.DyeableBlocks.class, Tag.Identified.class, (identified, s, field) -> {
//                createAndFillTag(identified);
//            });
        }

        private void createAndFillTag(Tag.Identified<Block> identified){
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
                    this.getOrCreateTagBuilder(identified).add(Registry.BLOCK.get(new Identifier(ConsistencyPlusMain.ID, blockNamePrefix + "_" + DYE_VALUES[i].getName() + "_" + blockNameSuffix)));
                }else{
                    this.getOrCreateTagBuilder(identified).add(Registry.BLOCK.get(new Identifier(isItBlueIce ? "minecraft" : ConsistencyPlusMain.ID, DYE_VALUES[i].getName() + "_" + blockNameSuffix)));
                }
            }

            if(defaultBlock != Blocks.AIR){
                this.getOrCreateTagBuilder(identified).add(defaultBlock);
            }else{
                LOGGER.info(nameParts[0] + " / " + defaultBlock + " / " + identified.getId());
                //System.out.println(identified.getId() + " / " +  defaultBlock.toString());
            }
        }
    }
}

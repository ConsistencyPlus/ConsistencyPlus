package io.github.consistencyplus.consistency_plus.data;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusEntries;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.server.AbstractTagProvider;
import net.minecraft.data.server.BlockTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConsistencyPlusTagProvider {

    private static final int MINIMUM_BLOCK_COUNT_FOR_TAG = 5;

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

        public static void createAndFillTag(Function<TagKey<Block>, ObjectBuilder<Block>> getOrCreateTagBuilderFunc) {
            ConsistencyPlusTags.DyeableBlocks.ALL_DYEABLE_BLOCK_TAGS.forEach(identified -> createAndFillTags(identified, getOrCreateTagBuilderFunc));
        }

        private static void createAndFillTags(TagKey<Block> identified, Function<TagKey<Block>, ObjectBuilder<Block>> getOrCreateTagBuilderFunc){
            String[] nameParts = identified.id().getPath().split("_");

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
                LOGGER.info(nameParts[0] + " / " + defaultBlock + " / " + identified.id());
                //System.out.println(identified.getId() + " / " +  defaultBlock.toString());
            }

            if(identified == ConsistencyPlusTags.DyeableBlocks.GLOWSTONE){
                getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.Common.GLOWSTONE).addTag(ConsistencyPlusTags.DyeableBlocks.GLOWSTONE);
            }
        }
    }

    public static class UltimateBlockTagProvider extends BaseConsitencyPlusTagProvider<Block>{

        public static UltimateBlockTagProvider INSTANCE = new UltimateBlockTagProvider();

        protected UltimateBlockTagProvider() {
            super(Registry.BLOCK);
        }

        public void createAndFillTags(Function<TagKey<Block>, ObjectBuilder<Block>> getOrCreateTagBuilderFunc) {
            LOGGER.info("");
            LOGGER.info("Starting Tag Creation for Block Tags!");
            LOGGER.info("-----------------------------------------------------------");

            for(Map.Entry<String, MasterKey> entry : MasterKey.ULTIMATE_KEY_RING.entrySet()){
                LOGGER.info("[" + entry.getKey() + "]: {" + entry.getValue() + "}" );

                Block block = Registry.BLOCK.get(ConsistencyPlusMain.id(entry.getKey()));

                if(block == Blocks.AIR){
                    block = Registry.BLOCK.get(new Identifier(entry.getKey()));

                    if(block != Blocks.AIR){
                        LOGGER.info("Found a minecraft Block... YEETING AND SKIPPING");
                        continue;
                    }else{
                        if(CPlusEntries.overrideMap.containsKey(entry.getKey())) {
                            block = Registry.BLOCK.get(new Identifier(CPlusEntries.overrideMap.get(entry.getKey())));

                            if (block != Blocks.AIR) {
                                LOGGER.info("Found a minecraft Block... YEETING AND SKIPPING");
                                continue;
                            } else {
                                block = Registry.BLOCK.get(ConsistencyPlusMain.id(CPlusEntries.overrideMap.get(entry.getKey())));
                            }
                        }

                        if (block == Blocks.AIR) {
                            LOGGER.info("O FUCK SOMETHING HAS GONE WRONG!... still YEETING AND SKIPPING");
                            continue;
                        }
                    }
                }

                this.createTagsFromKeyAndEntry(entry.getValue(), block);
            }


            LOGGER.info("-------------------------------------------------------------------");

            int removedTags = 0;
            int madeTags = 0;

            List<Map.Entry<String, Set<Block>>> entryList = new ArrayList<>(toBeCreatedTags.entrySet());

            for(int minBlockCount = 0; minBlockCount < MINIMUM_BLOCK_COUNT_FOR_TAG; minBlockCount++) {
                for (int index = 0; index < entryList.size(); index++) {
                    Map.Entry<String, Set<Block>> entry = entryList.get(index);

                    if(entry.getKey().contains("dirt")
                            || entry.getKey().contains("grass")
                            || entry.getKey().contains("mycelium")
                            || Objects.equals(entry.getKey(), "nether")
                    ){
                        continue;
                    }

                    if (entry.getValue().size() < minBlockCount) {
                        entryList.remove(entry);

                        removedTags++;
                        LOGGER.info("Removing -> [" + entry.getKey() + "] as it only contained a " + minBlockCount + " block.");
                    }
                }
            }

            for(Map.Entry<String, Set<Block>> entry : entryList){
                for (Block block : entry.getValue()) {
                    applyToBothTags(entry.getKey(), block, getOrCreateTagBuilderFunc);
                }
                madeTags += 2;
            }


            LOGGER.info("-------------------------------------------------------------------");

            LOGGER.info("Removed " + removedTags + " tags due to not meeting the minimum requirements for block count.");
            LOGGER.info("Made " + madeTags + " tags total(Is already doubled since were making common tags as well).");

            LOGGER.info("-------------------------------------------------------------------");

            Registry.BLOCK.getEntries().stream().filter((entry) -> Objects.equals(entry.getKey().getValue().getNamespace(), ConsistencyPlusMain.ID))
                    .forEach((entry) -> {
                        Identifier identifier = entry.getKey().getValue();
                        Block block = entry.getValue();

                        boolean isNormalBlock = true;

                        //LOGGER.info("[CommonBlockTagProvider]: " + identifier + " / " + block);

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
                                    case "nether":
                                        getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.INFINIBURN_OVERWORLD).add(block);
                                        getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.INFINIBURN_NETHER).add(block);
                                        shouldBreakForLoop = true;
                                        break;
                                }

                                if(shouldBreakForLoop){
                                    break;
                                }
                            }
                        }
                    });

            getOrCreateTagBuilderFunc.apply(ConsistencyPlusTags.ConsistencySpecificTags.NEEDS_DIAMOND_TOOL).add(CPlusBlocks.NETHERITE_STAIRS.get());

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
                    CPlusBlocks.NUBERT.get());

            getOrCreateTagBuilderFunc.apply(BlockTags.BEACON_BASE_BLOCKS).add(CPlusBlocks.NUBERT.get());
            getOrCreateTagBuilderFunc.apply(BlockTags.PIGLIN_REPELLENTS).add(CPlusBlocks.JACK_O_SOUL.get());

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
        }

        @Override
        protected void configure() {}

        @Override
        public String getName() {
            return "Item Tags";
        }
    }

    public static class UltimateItemTagProvider extends BaseConsitencyPlusTagProvider<Item>{

        public static UltimateItemTagProvider INSTANCE = new UltimateItemTagProvider();

        protected UltimateItemTagProvider() {
            super(Registry.ITEM);
        }

        public void createAndFillTags(Function<TagKey<Item>, ObjectBuilder<Item>> getOrCreateTagBuilderFunc) {
            LOGGER.info("");
            LOGGER.info("Starting Tag Creation for Block Tags!");
            LOGGER.info("-----------------------------------------------------------");

            for(Map.Entry<String, MasterKey> entry : MasterKey.ULTIMATE_KEY_RING.entrySet()){
                LOGGER.info("[" + entry.getKey() + "]: {" + entry.getValue() + "}" );

                Item item = Registry.ITEM.get(ConsistencyPlusMain.id(entry.getKey()));

                if(item == Items.AIR){
                    item = Registry.ITEM.get(new Identifier(entry.getKey()));

                    if(item != Items.AIR){
                        LOGGER.info("Found a minecraft Block... YEETING AND SKIPPING");
                        continue;
                    }else{
                        if(CPlusEntries.overrideMap.containsKey(entry.getKey())) {
                            item = Registry.ITEM.get(new Identifier(CPlusEntries.overrideMap.get(entry.getKey())));

                            if (item != Items.AIR) {
                                LOGGER.info("Found a minecraft Block... YEETING AND SKIPPING");
                                continue;
                            } else {
                                item = Registry.ITEM.get(ConsistencyPlusMain.id(CPlusEntries.overrideMap.get(entry.getKey())));
                            }
                        }

                        if (item == Items.AIR) {
                            LOGGER.info("O FUCK SOMETHING HAS GONE WRONG!... still YEETING AND SKIPPING");
                            continue;
                        }
                    }
                }

                this.createTagsFromKeyAndEntry(entry.getValue(), item);
            }


            LOGGER.info("-------------------------------------------------------------------");

            int removedTags = 0;
            int madeTags = 0;

            List<Map.Entry<String, Set<Item>>> entryList = new ArrayList<>(toBeCreatedTags.entrySet());

            for(int minBlockCount = 0; minBlockCount < MINIMUM_BLOCK_COUNT_FOR_TAG; minBlockCount++) {
                for (int index = 0; index < entryList.size(); index++) {
                    Map.Entry<String, Set<Item>> entry = entryList.get(index);

                    if(entry.getKey().contains("dirt")
                            || entry.getKey().contains("grass")
                            || entry.getKey().contains("mycelium")
                            || Objects.equals(entry.getKey(), "nether")
                    ){
                        continue;
                    }

                    if (entry.getValue().size() < minBlockCount) {
                        entryList.remove(entry);

                        removedTags++;
                        LOGGER.info("Removing -> [" + entry.getKey() + "] as it only contained a " + minBlockCount + " block.");
                    }
                }
            }

            for(Map.Entry<String, Set<Item>> entry : entryList){
                for (Item item : entry.getValue()) {
                    applyToBothTags(entry.getKey(), item, getOrCreateTagBuilderFunc);
                }
                madeTags += 2;
            }

            LOGGER.info("-------------------------------------------------------------------");

            LOGGER.info("Removed " + removedTags + " tags due to not meeting the minimum requirements for block count.");
            LOGGER.info("Made " + madeTags + " tags total(Is already doubled since were making common tags as well).");
        }

        @Override
        protected void configure() {}

        @Override
        public String getName() {
            return "Item Tags";
        }
    }

    public abstract static class BaseConsitencyPlusTagProvider<T> extends AbstractTagProvider<T>{

        protected static final Logger LOGGER = LogManager.getLogger(BaseConsitencyPlusTagProvider.class);

        protected final Set<TagKey<T>> ALREADY_MADE_COMMON_TAGS = new HashSet<>();
        protected final RegistryKey<? extends Registry<T>> registryKey;

        protected final HashMap<String, Set<T>> toBeCreatedTags = new HashMap<>();

        protected BaseConsitencyPlusTagProvider(Registry<T> registry) {
            super(null, registry);

            registryKey = registry.getKey();
        }

        public void createTagsFromKeyAndEntry(MasterKey key, T entry) {
            String material = key.material;
            String materialDir = "material/" + material + "/";

            addToTagMap("material/"+ material, entry);

            //--------------------------------------------------------------------

            if(!key.shape.isBase()) {
                addToTagMap("block_shape/" + key.shape.toString(), entry);

                if(!key.type.isBase()) {
                    addToTagMap(materialDir + key.shape.addShapes(key.type.addType(material), key.type), entry);
                }else{
                    addToTagMap(materialDir + key.shape.addShapes(material, BlockTypes.BASE), entry);
                }
            }else{
                addToTagMap("block_shape/" + "block", entry);

                if(!key.type.isBase()) {
                    addToTagMap(materialDir + key.shape.addShapes(key.type.addType(material), key.type) + "_block", entry);
                }else{
                    addToTagMap(materialDir + key.shape.addShapes(material, BlockTypes.BASE) + "_block", entry);
                }
            }

            //--------------------------------------------------------------------

            if(!key.type.isBase()) {
                addToTagMap("block_type/" + key.type.toString(), entry);

                addToTagMap(materialDir + key.type.addType(material), entry);
            }

            //--------------------------------------------------------------------

            if(!key.setModifiers.isBase()) {
                addToTagMap("set_modifier/" + key.setModifiers.toString(), entry);

                addToTagMap(materialDir + key.setModifiers.addModifier(material), entry);

                if(!key.type.isBase()) {
                    addToTagMap(materialDir + key.setModifiers.addModifier(key.type.addType(material)), entry);
                }

                if(!key.shape.isBase()){
                    addToTagMap(materialDir + key.setModifiers.addModifier(key.shape.addShapes(material, key.type)), entry);
                }
            }

            //--------------------------------------------------------------------

            if(!key.oxidization.isBase()) {
                addToTagMap("oxidization/" + key.oxidization.toString(), entry);

                if(!key.shape.isBase() && !key.type.isBase()) {
                    addToTagMap(materialDir + key.oxidization.addOxidization(key.shape.addShapes(key.type.addType(material), key.type)), entry);
                }
            }

            if(key.isWaxed) {
                addToTagMap(materialDir + "waxed", entry);
            }

            //--------------------------------------------------------------------

            if(key.dyeColor != null) {
                addToTagMap("color/" + key.dyeColor.toString(), entry);

                addToTagMap(materialDir + key.dyeColor.toString() + "_" + material, entry);

//                if(key.shape != BlockShapes.BLOCK) {
//                    addToTagMap(materialDir + key.shape.addShapes(key.dyeColor.toString() + "_" + material, key.type), entry);
//                }
//
//                if(key.type != BlockTypes.BASE){
//                    addToTagMap(materialDir + key.type.addType(key.dyeColor.toString() + "_" + material), entry);
//                }

            }else{
                //TODO: ENABLE GLASS TAG WHEN SUCH IS READY
                if(Objects.equals(material, "terracotta") /* || Objects.equals(material, "glass") */){
                    addToTagMap("color/" + "plain", entry);

                    addToTagMap(materialDir + "plain" + "_" + material, entry);
                }
            }

            //--------------------------------------------------------------------

        }

        protected void addToTagMap(String tag, T block){
            TagKey<T> common = getCommonTag(tag, registryKey);
            TagKey<T> consitencyPlus = getConsistencyTag(tag, registryKey);

            LOGGER.info("   ^- Making C-Plus: " + common);
            LOGGER.info("   ^- Making Common: " + consitencyPlus);

            if(toBeCreatedTags.containsKey(tag)){
                toBeCreatedTags.get(tag).add(block);
            }else{
                Set<T> blockSet = new HashSet<>();
                blockSet.add(block);

                toBeCreatedTags.put(tag, blockSet);
            }
        }

        protected void applyToBothTags(String tag, T block, Function<TagKey<T>, ObjectBuilder<T>> getOrCreateTagBuilderFunc){
            TagKey<T> common = getCommonTag(tag, registryKey);
            TagKey<T> consitencyPlus = getConsistencyTag(tag, registryKey);

            getOrCreateTagBuilderFunc.apply(consitencyPlus).add(block);

            if(!ALREADY_MADE_COMMON_TAGS.contains(common)) {
                getOrCreateTagBuilderFunc.apply(common).addTag(consitencyPlus);
                ALREADY_MADE_COMMON_TAGS.add(common);
            }
        }

        protected TagKey<T> getCommonTag(String path, RegistryKey<? extends Registry<T>> registryKey){
            return TagUtil.initTag(path, registryKey);
        }

        protected TagKey<T> getConsistencyTag(String path, RegistryKey<? extends Registry<T>> registryKey){
            return TagKey.of(registryKey, new Identifier(ConsistencyPlusMain.ID, path));
        }
    }
}

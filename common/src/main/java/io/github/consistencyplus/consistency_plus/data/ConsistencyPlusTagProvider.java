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

public class ConsistencyPlusTagProvider {

    private static final int MINIMUM_BLOCK_COUNT_FOR_TAG = 5;

    public static class UltimateBlockTagProvider extends BaseConsitencyPlusTagProvider<Block>{

        public static UltimateBlockTagProvider INSTANCE = new UltimateBlockTagProvider();

        protected UltimateBlockTagProvider() {
            super(Registry.BLOCK, Blocks.AIR);
        }

        public void createAndFillTags(Function<TagKey<Block>, ObjectBuilder<Block>> getOrCreateTagBuilderFunc) {

            LOGGER.info("");
            LOGGER.info("Starting Tag Creation for Block Tags!");
            LOGGER.info("-----------------------------------------------------------");

            for(Map.Entry<String, MasterKey> entry : MasterKey.ULTIMATE_KEY_RING.entrySet()){
                evaluateStringEntry(entry.getValue(), entry.getKey());
            }

            LOGGER.info("-------------------------------------------------------------------");

            //----------------------------------------------------------------------------------------------------------------------------------------
            //  Remove Tags that don't meet a defined minimum block count

            int removedTags = 0;

            List<Map.Entry<String, Set<Block>>> entryList = new ArrayList<>(bothTagEntries.entrySet());

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

            //----------------------------------------------------------------------------------------------------------------------------------------
            //  Both Tags but only Consistency Plus Tags / Blocks

            int madeTags = 0;

            for(Map.Entry<String, Set<Block>> entry : entryList){
                int tagsCreated = 0;

                for (Block block : entry.getValue())
                    tagsCreated = Math.max(applyToBothTags(entry.getKey(), block, getOrCreateTagBuilderFunc), tagsCreated);

                madeTags += tagsCreated;
            }

            //----------------------------------------------------------------------------------------------------------------------------------------
            //  Common Only Tags (i.e. Minecraft blocks being added to Consistency Plus based tags

            for(Map.Entry<String, Set<Block>> entry : commonOnlyEntries.entrySet()){
                for (Block block : entry.getValue()) {
                    applyToBothTags(entry.getKey(), block, true, getOrCreateTagBuilderFunc);
                }
            }

            LOGGER.info("-------------------------------------------------------------------");

            LOGGER.info("Removed " + removedTags + " tags due to not meeting the minimum requirements for block count.");
            LOGGER.info("Made " + madeTags + " tags total(Common and ModId based tags combined).");

            LOGGER.info("-------------------------------------------------------------------");

            //----------------------------------------------------------------------------------------------------------------------------------------
            // Rest if the hard tags to do with MasterKeys

            ConsistencyPlusMain.BLOCKS.forEach(blockRegistrySupplier -> {
                Block block = blockRegistrySupplier.get();
                Identifier identifier = blockRegistrySupplier.getId();

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

                    if(shouldBreakForLoop)
                        break;
                }
            });

            //----------------------------------------------------------------------------------------------------------------------------------------

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
            super(Registry.ITEM, Items.AIR);
        }

        public void createAndFillTags(Function<TagKey<Item>, ObjectBuilder<Item>> getOrCreateTagBuilderFunc) {
            LOGGER.info("");
            LOGGER.info("Starting Tag Creation for Block Tags!");
            LOGGER.info("-----------------------------------------------------------");

            for(Map.Entry<String, MasterKey> entry : MasterKey.ULTIMATE_KEY_RING.entrySet()){
                evaluateStringEntry(entry.getValue(), entry.getKey());
            }

            LOGGER.info("-------------------------------------------------------------------");

            //-------------------------------------------------------------------------------------------------------------------
            //  Remove Tags that don't meet a defined minimum block count

            int removedTags = 0;

            List<Map.Entry<String, Set<Item>>> entryList = new ArrayList<>(bothTagEntries.entrySet());

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

            //-------------------------------------------------------------------------------------------------------------------
            //  Both Tags but only Consistency Plus Tags / Blocks

            int madeTags = 0;

            for(Map.Entry<String, Set<Item>> entry : entryList){
                int tagsCreated = 0;

                for (Item item : entry.getValue()) {
                    tagsCreated = Math.max(applyToBothTags(entry.getKey(), item, getOrCreateTagBuilderFunc), tagsCreated);
                }

                madeTags += tagsCreated;
            }

            //-------------------------------------------------------------------------------------------------------------------
            //  Common Only Tags (i.e. Minecraft blocks being added to Consistency Plus based tags

            for(Map.Entry<String, Set<Item>> entry : commonOnlyEntries.entrySet()){
                for (Item item : entry.getValue()) {
                    applyToBothTags(entry.getKey(), item, true, getOrCreateTagBuilderFunc);
                }
            }

            LOGGER.info("-------------------------------------------------------------------");

            LOGGER.info("Removed " + removedTags + " tags due to not meeting the minimum requirements for block count.");
            LOGGER.info("Made " + madeTags + " tags total(Common and ModId based tags combined).");
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

        protected final RegistryKey<? extends Registry<T>> registryKey;
        protected final Registry<T> registry;

        protected final T defaultEntry;

        protected final Set<TagKey<T>> ALREADY_MADE_COMMON_TAGS = new HashSet<>();
        protected final Map<String, Boolean> restrictCommonTagCreation = new HashMap<>();

        protected final Map<String, Set<T>> commonOnlyEntries = new HashMap<>();
        protected final Map<String, Set<T>> bothTagEntries = new HashMap<>();


        protected BaseConsitencyPlusTagProvider(Registry<T> registry, T defaultEntry) {
            super(null, registry);

            this.registryKey = registry.getKey();
            this.defaultEntry = defaultEntry;
            this.registry = registry;
        }


        /**
         * Attempts to get a valid block from string entry to then make tags of
         * @param key
         * @param stringEntry
         */
        public void evaluateStringEntry(MasterKey key, String stringEntry){
            boolean commonOnly = false;

            LOGGER.info("[" + stringEntry + "]: {" + key + "}" );

            T entry = this.registry.get(ConsistencyPlusMain.id(stringEntry));

            if(entry == defaultEntry){
                if(Objects.equals(key.material, "copper")){
                    LOGGER.info(stringEntry);
                }

                entry = this.registry.get(new Identifier(stringEntry));

                if(entry != defaultEntry){
                    LOGGER.info("Found a minecraft Block... ONLY ADDING TO COMMON TAGS!");
                    commonOnly = true;
                }else{
                    if(CPlusEntries.overrideMap.containsKey(stringEntry)) {
                        entry = this.registry.get(new Identifier(CPlusEntries.overrideMap.get(stringEntry)));

                        if (entry != defaultEntry) {
                            LOGGER.info("Found a minecraft Block... ONLY ADDING TO COMMON TAGS!");
                            commonOnly = true;
                        } else {
                            entry = this.registry.get(ConsistencyPlusMain.id(CPlusEntries.overrideMap.get(stringEntry)));
                        }
                    }

                    if (entry == defaultEntry) {
                        LOGGER.info("O FUCK SOMETHING HAS GONE WRONG!... still YEETING AND SKIPPING");

                        return;
                    }
                }
            }

            this.createTagsFromKeyAndEntry(key, entry, commonOnly);
        }

        /**
         * Find what the Master Key fits into for a certain tag based on its block characteristic
         */
        public void createTagsFromKeyAndEntry(MasterKey key, T entry, boolean commonOnly) {
            String material = key.material;
            String materialDir = "material/" + material + "/";

            //--------------------------------------------------------------------

            addToTagMap("material/" + material, entry, true, commonOnly);

            //--------------------------------------------------------------------

            if(!commonOnly) {
                if (!key.shape.isBase()) {

                    //TODO: Change this within the future when block types and shapes get worked out
                    if (!isShapeAtype(key.shape)) {
                        addToTagMap("block_shape/" + key.shape.toString(), entry, true);
                    } else {
                        addToTagMap("block_type/" + key.shape.toString(), entry, false);
                    }

                    if (isAllowedMaterial(material)) {
                        if (!key.type.isBase()) {
                            addToTagMap(materialDir + key.shape.addShapes(key.type.addType(material), key.type), entry, true);
                        } else {
                            addToTagMap(materialDir + key.shape.addShapes(material, BlockTypes.BASE), entry, true);
                        }
                    }
                } else {
                    addToTagMap("block_shape/" + "block", entry, true);

                    if (isAllowedMaterial(material)) {
                        if (!key.type.isBase()) {
                            addToTagMap(materialDir + key.shape.addShapes(key.type.addType(material), key.type) + "_block", entry, true);
                        } else {
                            addToTagMap(materialDir + key.shape.addShapes(material, BlockTypes.BASE) + "_block", entry, true);
                        }
                    }
                }

                //--------------------------------------------------------------------

                if(!key.type.isBase()) {
                    addToTagMap("block_type/" + key.type.toString(), entry, false, commonOnly);
                }

                //--------------------------------------------------------------------

                if(!key.setModifiers.isBase()) {
                    addToTagMap("set_modifier/" + key.setModifiers.toString(), entry, false, commonOnly);
                }
            }

            //--------------------------------------------------------------------

            if(isOxidableBlock(material)) {
                if (!key.oxidization.isBase()) {
                    addToTagMap("oxidization/" + key.oxidization.toString(), entry, true, commonOnly);
                } else {
                    addToTagMap("oxidization/" + "none", entry, true, commonOnly);
                }

                if (key.isWaxed) {
                    addToTagMap("waxed", entry, true, commonOnly);
                } else {
                    addToTagMap("unwaxed", entry, true, commonOnly);
                }
            }

            //--------------------------------------------------------------------

            if(key.dyeColor != null) {
                addToTagMap("color/" + key.dyeColor.toString(), entry, true, commonOnly);
            }else{
                if(isAllowedMaterial(material)){
                    addToTagMap("color/" + "plain", entry, true, commonOnly);
                }
            }
        }

        //-------------------------------------------------------------------------------------------------------------------

        /**
         * Checks if a shape is really a type. (Should be removed in the future when this gets worked out)
         */
        public boolean isShapeAtype(BlockShapes shape){
            return shape == BlockShapes.CARVED || shape == BlockShapes.CHISELED || shape == BlockShapes.PILLAR || shape == BlockShapes.CORNER_PILLAR;
        }

        /**
         * Checks if the material is an oxidisable metal block
         */
        public boolean isOxidableBlock(String material){
            return Objects.equals("copper", material);
        }

        /**
         * Checks if the material is allowed for creating certain sub tags of a material
         */
        public boolean isAllowedMaterial(String material){
            //TODO: ENABLE GLASS TAG WHEN SUCH IS READY
            return Objects.equals("terracotta", material) || Objects.equals("concrete", material) || Objects.equals("ice", material) || Objects.equals("glowstone", material)/* || Objects.equals(material, "glass") */;
        }

        //-------------------------------------------------------------------------------------------------------------------

        protected void addToTagMap(String tag, T entry, boolean createCommon) {
            this.addToTagMap(tag, entry, createCommon,false);
        }

        protected void addToTagMap(String tag, T entry, boolean createCommon, boolean commonOnly){
            if (commonOnly && !createCommon)
                return;

            TagKey<T> common = getCommonTag(tag, registryKey);

            if(createCommon){
                if(commonOnly) {
                    LOGGER.info("   ^- Adding to Common: " + common);
                }else{
                    LOGGER.info("   ^- Making Common: " + common);
                }
            }

            if(!commonOnly) {
                TagKey<T> consitencyPlus = getConsistencyTag(tag, registryKey);

                LOGGER.info("   ^- Making C-Plus: " + consitencyPlus);

                if (!restrictCommonTagCreation.containsKey(tag)) {
                    if (createCommon) {
                        restrictCommonTagCreation.put(tag, true);
                    } else {
                        restrictCommonTagCreation.put(tag, false);
                    }
                }

                if (bothTagEntries.containsKey(tag)) {
                    bothTagEntries.get(tag).add(entry);
                } else {
                    Set<T> blockSet = new HashSet<>();
                    blockSet.add(entry);

                    bothTagEntries.put(tag, blockSet);
                }

            } else {

                if (commonOnlyEntries.containsKey(tag)) {
                    commonOnlyEntries.get(tag).add(entry);
                } else {
                    Set<T> blockSet = new HashSet<>();
                    blockSet.add(entry);

                    commonOnlyEntries.put(tag, blockSet);
                }
            }
        }

        //-------------------------------------------------------------------------------------------------------------------

        protected int applyToBothTags(String tag, T entry, Function<TagKey<T>, ObjectBuilder<T>> getOrCreateTagBuilderFunc){
            return this.applyToBothTags(tag, entry, false, getOrCreateTagBuilderFunc);
        }

        protected int applyToBothTags(String tag, T entry, boolean addDirectlyToCommonTagOnly, Function<TagKey<T>, ObjectBuilder<T>> getOrCreateTagBuilderFunc){
            int tagsCreated = 1;

            if(!addDirectlyToCommonTagOnly) {
                TagKey<T> consitencyPlus = getConsistencyTag(tag, registryKey);

                getOrCreateTagBuilderFunc.apply(consitencyPlus).add(entry);

                if(restrictCommonTagCreation.containsKey(tag) && restrictCommonTagCreation.get(tag)) {
                    TagKey<T> common = getCommonTag(tag, registryKey);

                    if (!ALREADY_MADE_COMMON_TAGS.contains(common)) {
                        getOrCreateTagBuilderFunc.apply(common).addTag(consitencyPlus);
                        ALREADY_MADE_COMMON_TAGS.add(common);

                        tagsCreated++;
                    }
                }
            }else{
                TagKey<T> common = getCommonTag(tag, registryKey);

                getOrCreateTagBuilderFunc.apply(common).add(entry);
            }

            return tagsCreated;
        }

        //-------------------------------------------------------------------------------------------------------------------

        protected TagKey<T> getCommonTag(String path, RegistryKey<? extends Registry<T>> registryKey){
            return TagUtil.initTag(path, registryKey);
        }

        protected TagKey<T> getConsistencyTag(String path, RegistryKey<? extends Registry<T>> registryKey){
            return TagKey.of(registryKey, new Identifier(ConsistencyPlusMain.ID, path));
        }
    }
}

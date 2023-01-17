package io.github.consistencyplus.consistency_plus.core.entries.v2;

import dev.architectury.registry.CreativeTabRegistry;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.*;
import io.github.consistencyplus.consistency_plus.registry.CPlusItemGroups;
import io.github.consistencyplus.consistency_plus.registry.CPlusNewEntries;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// todo: This Class is very much a WIP, Im currently still working on the code. If you want to help, ping me on our discord. - Siuol
public class RegistryEntryGroup {
    private static final boolean generate = false;
    public final String setId;
    public final RegistryEntrySettings setSettings;
    public final FalseBlock settingsBlock;
    public String watchForRollingRocks = "Done in 0.5x A Presses";

    public final Set<EntryKey> localRing = new HashSet<>();

    // Construct
    public RegistryEntryGroup(String setId, RegistryEntrySettings setSettings) {
        this.setId = setId;
        this.setSettings = setSettings;
        this.settingsBlock = new FalseBlock(setSettings.defaultBlockSettings);
        mainLoop();
    }

    // mainLoop handles what block should generate and runs the verification for each block
    public void mainLoop() {
        // if (setSettings.loopType !== NORMAL) switch
        for (BlockShapes shape : BlockShapes.values()) {
            for (BlockTypes type : BlockTypes.values()) {
                EntryKey key = EntryKey.createKey(type, shape);
                if (!verifyKey(key)) continue;
                String basicId = getBasicID(key);
                Identifier id;
                if (!setSettings.isSimple || key.isBaseKey()) {
                    id = verifyId(basicId);
                    if (id.getNamespace().equals("minecraft") || id.getNamespace().equals("nullv")) continue;
                } else {
                    id = new Identifier("consistency_plus", basicId);
                }

                register(id, key);
            }
        }

        if (setSettings.hasBrick && generate) {
            Item item = new Item(setSettings.category.settings);
            ConsistencyPlusMain.LOADER.registerItem(new Identifier("consistency_plus", setId + "_brick"), item);
        }
    }

    public boolean verifyKey(EntryKey key) {
        if (!key.shape().withTypes && key.type != BlockTypes.BASE) return false;
        if (key.getUniqueCount() > 1) return false;
        return true;
    }

    public String getBasicID(EntryKey key) {
        return key.shape().addShapes(key.type().addType(this.setId), key.type());
    }

    public Identifier verifyId(String id) {
            if (!setSettings.idReplacementRules.isEmpty()) {
                for (String input : setSettings.idReplacementRules.keySet()) {
                    if (id.contains(input)) {
                        id = id.replace(input, setSettings.idReplacementRules.get(input));
                    }
                }
            }
            Identifier fullID = CPlusNewEntries.nameToOverrideIdMap.getOrDefault(id, new Identifier("consistency_plus", id));
        return fullID;
    }

    public void register(Identifier id, EntryKey key) {
        if (generate) {
            Block block = key.shape.initializeBlock(AbstractBlock.Settings.copy(settingsBlock));
            Item item = new BlockItem(block, setSettings.category.settings);
            ConsistencyPlusMain.LOADER.registerBlock(id, block); // Block registering
            ConsistencyPlusMain.LOADER.registerItem(id, item); // Item registering
            // Add Item to the creative tabs
            // Register Key to the Set Keychain
        } else ConsistencyPlusMain.LOGGER.info("Generated " + id.getPath());
    }

    // The specific Settings that determine how things are generated.
    public static class RegistryEntrySettings {
        boolean hasBrick = true; // If true, a Brick Item is generated for the set.
        boolean hasCobblestone = true; // If ture, generates a cobblestone set.
        boolean isSimple = false; // Checks if the set is a "simple" one to generate or not.
        boolean isExperimental = false; // If true, makes it only appear when there are experimental features
        boolean appendBlockOnFirstGen = false; // Used to make stuff like "bone" be "bone_block".
        boolean hasBlockOverlays = false; // Used in generation process to determine how to gen.
       // boolean generateBaseShapesOnly = false; // If true, generates only the base shapes
        SetCategory category;
        AbstractBlock.Settings defaultBlockSettings;

        Map<String, String> idReplacementRules = new HashMap<>();

        public RegistryEntrySettings(SetCategory category, AbstractBlock.Settings defaultBlockSettings) {
            this.category = category;
            this.defaultBlockSettings = defaultBlockSettings;
        }

        public RegistryEntrySettings hasBrick(boolean bool) {
            hasBrick = bool;
            return this;
        }

        public RegistryEntrySettings hasCobblestone(boolean bool) {
            hasCobblestone = bool;
            return this;
        }

        public RegistryEntrySettings isSimple(boolean bool) {
            isSimple = bool;
            return this;
        }

        public RegistryEntrySettings isExperimental(boolean bool) {
            isExperimental = bool;
            return this;
        }

        public RegistryEntrySettings appendBlockOnFirstGen(boolean bool) {
            appendBlockOnFirstGen = bool;
            return this;
        }

        public RegistryEntrySettings hasBlockOverlays(boolean bool) {
            hasBlockOverlays = bool;
            return this;
        }

        public RegistryEntrySettings addIdReplacementRule(String str1, String str2) {
            idReplacementRules.put(str1, str2);
            return this;
        }
    }

    // Specific Categories of Each of the sets, determines a few things.
    public static enum SetCategory {
        STONE(CPlusItemGroups.consistencyPlusStoneItemSettings()),
        DYED(CPlusItemGroups.consistencyPlusDyeableItemSettings()),
        MISC(CPlusItemGroups.consistencyPlusMiscItemSettings()),
        ICE(CPlusItemGroups.consistencyPlusMiscItemSettings()),
        METAL(CPlusItemGroups.consistencyPlusMiscItemSettings()),
        UNIQUE(CPlusItemGroups.consistencyPlusMiscItemSettings());
        public final Item.Settings settings;
        SetCategory(Item.Settings settings) {
            this.settings = settings;
        }
    }

    public record EntryKey(BlockTypes type, BlockShapes shape, BlockOverlay overlay, CopperOxidization oxidization, Boolean waxed, DyeColor dye) {
        public static EntryKey createKey(BlockTypes type, BlockShapes shape) {
            return new EntryKey(type, shape, null, null, null, null);
        }
        public boolean isBaseKey() {
            return type() == BlockTypes.BASE && shape() == BlockShapes.BLOCK;
        }
        // Flag for if the key is an Ice key, to register for ice stuff.

        public int getUniqueCount() {
            int i = 0;
            if (overlay() != null) i++;
            if (oxidization() != null) i++;
            if (dye() != null) i++;
            return i;
        }
    }
}

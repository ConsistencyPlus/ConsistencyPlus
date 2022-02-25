package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.List;

public class CPlusItemsEnhanced {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ConsistencyPlusMain.ID, Registry.ITEM_KEY);

    public static final String DRIPSTONE = "dripstone";

    public static final List<String> blockTypes = List.of("Regular", "Polished", "Brick", "Cut", "Tile", "Cobbled");
    public static final List<String> blockVariations = List.of("Full", "Slab", "Stairs", "Wall", "Gate", "Pillar", "CornerPillar", "Carved", "Chiseled");
    public static final List<String> specialVariations = List.of("Pillar", "CornerPillar", "Carved", "Chiseled");
    public static List<String> blacklistedIDs = List.of("cobbled_stone");
    public static List<String> stoneTabMaterials = List.of("dripstone");

    public static String register(String id) {
        for (String blockType : blockTypes) {
            String typedId;
            String type = blockType;

            switch (type) {
                case "Regular" -> typedId = id;
                case "Polished" -> typedId = "polished_" + id;
                case "Brick" -> typedId = id + "_brick";
                case "Cut" -> typedId = "cut_" + id;
                case "Tile" -> typedId = id + "_tile";
                case "Cobbled" -> typedId = "cobbled_" + id;
                default -> typedId = null;
            }

            for (String blockVariation : blockVariations) {
                String variatedId = typedId;
                String variation = blockVariation;
                if (specialVariations.contains(variation) && type.equals("Regular")) {
                    switch (variation) {
                        case "Pillar" -> variatedId = typedId + "_pillar";
                        case "CornerPillar" ->  variatedId = typedId + "_corner_pillar";
                        case "Carved" -> variatedId = "carved_" + typedId;
                        case "Chiseled" -> variatedId = "chiseled_" + typedId;
                    }
                } else {
                    switch (variation) {
                        case "Full" -> variatedId = typedId;
                        case "Slab" ->  variatedId = typedId + "_slab";
                        case "Stairs" -> variatedId =  typedId + "_stairs";
                        case "Wall" -> variatedId = typedId + "_wall";
                        case "Gate" -> variatedId = typedId + "_gate";
                    }
                }
                Item.Settings itemSettings = getItemSettings(id);
                constructBlockItem(variatedId, itemSettings);
            }
        }

        return id;
    }

    public static void constructBlockItem(String itemId, Item.Settings itemSettings) {
        Identifier finishedID = ConsistencyPlusMain.id(itemId);
        if (Registry.ITEM.getOrEmpty(new Identifier("minecraft", itemId)).isPresent()) return;
        if (blacklistedIDs.contains(itemId)) return;
        //Todo: Replace the Registry.BLOCK.get() call with a check in a "Block Dictionary" or something of the sort.
        itemRegistration(itemId, new BlockItem(Registry.BLOCK.get(finishedID), itemSettings));
    }

    public static void itemRegistration(String name, Item item) {
        RegistrySupplier<Item> itemSupplied = ITEMS.register(name, () -> item);
    }

    public static Item.Settings getItemSettings(String material){
        //if (stoneTabMaterials.contains(material)) return CPlusItemGroups.consistencyPlusStoneItemSettings();
        return CPlusItemGroups.consistencyPlusStoneItemSettings();
    }
}

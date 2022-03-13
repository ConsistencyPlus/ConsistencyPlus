package io.github.consistencyplus.consistency_plus.core.entries.items;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.core.entries.interfaces.BasicRegistryInterface;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.consistencyplus.consistency_plus.registry.CPlusEnhancedRegistry.checkMinecraft;


public class AbstractItemRegistryEntry implements BasicRegistryInterface {
    public static String name;
    public static Item.Settings itemSettings;

    public AbstractItemRegistryEntry(String name, Item.Settings itemSettings) {
        AbstractItemRegistryEntry.name = name;
        AbstractItemRegistryEntry.itemSettings = itemSettings;
    }

    public void construct() {
       register(name, itemSettings);
    }

    public void register(String id, Item.Settings itemSettings) {
        RegistrySupplier<Item> b;
    }

    public Item getItem() {
        if (checkMinecraft(name)) return Registry.ITEM.get(new Identifier("minecraft", (name)));
        return Registry.ITEM.get(ConsistencyPlusMain.id(name));
    }
}

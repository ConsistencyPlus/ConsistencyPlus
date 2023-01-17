package io.github.consistencyplus.consistency_plus.core.entries.items;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.minecraft.item.BundleItem;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.consistencyplus.consistency_plus.registry.CPlusEntries.checkMinecraft;

public class DyedItemRegistryEntryGroup extends AbstractItemRegistryEntryGroup {
    public DyedItemRegistryEntryGroup(String name, Item.Settings itemSettings) {
        super(name, itemSettings);
    }

    @Override
    public void construct() {
        for (DyeColor color : DyeColor.values()) register(color.toString() + "_" + name, itemSettings);
    }

    public static void register(String id, Item.Settings itemSettings) {
        RegistrySupplier<Item> b;
        if (name.equals("dyed_bundle")) b = ConsistencyPlusMain.ITEMS.register(id, () -> new BundleItem(itemSettings));
        else b = ConsistencyPlusMain.ITEMS.register(id, () -> new Item(itemSettings));
    }

    public Item getDyedItem(DyeColor color) {
        if (checkMinecraft(color.toString() + "_" + name)) return Registry.ITEM.get(new Identifier("minecraft", (color.toString() + "_" + name)));
        return Registry.ITEM.get(ConsistencyPlusMain.id(color.toString() + "_" + name));
    }
}

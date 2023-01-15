package io.github.consistencyplus.consistency_plus.core;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 This class serves as a way to get around many tab restrictions that Minecraft and Forge/Fabric imposes on 1.19.3+.
 It acts as a cross-platform builder for CreativeTabs/ItemGroups of sorts
 */
public class TabSet {
    ItemStack icon = Items.STONE.getDefaultStack();
    public Set<ItemStack> itemGroup = new HashSet<>();
    public final Identifier id;
    public Set<RegistrySupplier<Item>> cursedItemGroup = new HashSet<>();
    private boolean isBuilt = false;

    public TabSet(Identifier id) {this.id = id;}

    public ItemStack getIcon() {
        return icon;
    }

    public void setIcon(ItemStack icon) {
        this.icon = icon;
    }

    public void addItem(ItemStack stack) {
        itemGroup.add(stack);
    }

    public void addItem(Item item) {
        itemGroup.add(item.getDefaultStack());
    }

    @Deprecated
    public void addItemSupplier(RegistrySupplier<Item> supplier) {
        cursedItemGroup.add(supplier);
    }

    public Set<ItemStack> getItemGroup() {
        if (!isBuilt) {
            for (RegistrySupplier<Item> suppliedItem : cursedItemGroup.stream().toList()) {
                itemGroup.add(suppliedItem.get().getDefaultStack());
            }
            isBuilt = true;
        }
        return itemGroup;
    }
}

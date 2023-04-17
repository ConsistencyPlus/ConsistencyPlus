package io.github.consistencyplus.consistency_plus.util;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

/**
 The goal of PseudoItemGroup is to act as a temporary ItemGroup until a point where
 an actual ItemGroup can be initialized on the loader.
 */
public class PseudoItemGroup {
    public static final List<PseudoItemGroup> itemGroupRegistry = new ArrayList<>();
    List<ItemStack> itemGroup = new ArrayList<>();
    ItemStack icon;
    Identifier id;

    public PseudoItemGroup(ItemStack icon, Identifier id) {
        this.icon = icon;
        this.id = id;
    }
    public void addToItemGroup(ItemStack itemStack) {
        itemGroup.add(itemStack);
    }
    public void addToItemGroup(Item itemStack) {
        itemGroup.add(itemStack.getDefaultStack());
    }
}

package io.github.consistencyplus.consistency_plus.core.util;

import io.github.consistencyplus.consistency_plus.core.TabSet;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class Fabric implements Loader {
    public Fabric() {}

    @Override
    public boolean devEnv() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public boolean checkForMod(String string) {
        return FabricLoader.getInstance().isModLoaded(string);
    }

    @Override
    public Block registerBlock(Identifier id, Block block) {
        return Registry.register(Registries.BLOCK, id, block);
    }

    @Override
    public Item registerItem(Identifier id, Item item) {
        return Registry.register(Registries.ITEM, id, item);
    }

    @Override
    public void createItemGroup(TabSet tabSet) {
        FabricItemGroup.builder(tabSet.id).icon(tabSet::getIcon).entries((enabledFeatures, entries, operatorEnabled) -> entries.addAll(tabSet.getItemGroup())).build();
    }
}

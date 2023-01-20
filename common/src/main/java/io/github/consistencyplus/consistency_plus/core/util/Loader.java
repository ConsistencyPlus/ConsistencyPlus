package io.github.consistencyplus.consistency_plus.core.util;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.core.TabSet;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

public interface Loader {
    boolean devEnv();
    boolean checkForMod(String string);
    Block registerBlock(Identifier id, Block block);
    Item registerItem(Identifier id, Item item);
    void createItemGroup(TabSet tabset);
    boolean registrationReady();
}

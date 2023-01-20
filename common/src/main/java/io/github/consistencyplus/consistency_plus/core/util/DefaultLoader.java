package io.github.consistencyplus.consistency_plus.core.util;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.core.TabSet;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class DefaultLoader implements Loader {
    public DefaultLoader() {}

    @Override
    public boolean devEnv() {
        ConsistencyPlusMain.LOGGER.fatal("ERR - LOADER CODE USED PRE-INITIALIZATION SOMEHOW");
        return false;
    }

    @Override
    public boolean checkForMod(String string) {
        ConsistencyPlusMain.LOGGER.fatal("ERR - LOADER CODE USED PRE-INITIALIZATION SOMEHOW");
        return false;
    }

    @Override
    public Block registerBlock(Identifier id, Block block) {
        ConsistencyPlusMain.LOGGER.fatal("ERR - LOADER CODE USED PRE-INITIALIZATION SOMEHOW");
        return null;
    }

    @Override
    public Item registerItem(Identifier id, Item item) {
        ConsistencyPlusMain.LOGGER.fatal("ERR - LOADER CODE USED PRE-INITIALIZATION SOMEHOW");
        return null;
    }

    @Override
    public void createItemGroup(TabSet tabset) {
        ConsistencyPlusMain.LOGGER.fatal("ERR - LOADER CODE USED PRE-INITIALIZATION SOMEHOW");
    }

    @Override
    public boolean registrationReady() {
        ConsistencyPlusMain.LOGGER.fatal("ERR - LOADER CODE USED PRE-INITIALIZATION SOMEHOW");
        return false;
    }
}

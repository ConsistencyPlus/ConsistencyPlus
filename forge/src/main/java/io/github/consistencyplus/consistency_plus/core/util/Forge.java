package io.github.consistencyplus.consistency_plus.core.util;

import io.github.consistencyplus.consistency_plus.core.TabSet;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashSet;
import java.util.Set;

public class Forge implements Loader {
    Set<TabSet> tabSetSet = new HashSet<>();
    public boolean registrationReady = false;

    @Override
    public boolean devEnv() {
        return !FMLLoader.isProduction();
    }

    @Override
    public boolean checkForMod(String string) {
        return ModList.get().isLoaded(string);
    }

    @Override
    public Block registerBlock(Identifier id, Block block) {
        ForgeRegistries.BLOCKS.register(id, block);
        return block;
    }

    @Override
    public Item registerItem(Identifier id, Item item) {
        ForgeRegistries.ITEMS.register(id, item);
        return item;
    }

    @Override
    public void createItemGroup(TabSet tabSet) {
        tabSetSet.add(tabSet);
    }

    @Override
    public boolean registrationReady() {
        return registrationReady;
    }

    //    @SubscribeEvent
//    public void buildContents(CreativeModeTabEvent.Register event) {
//        for (TabSet tabSet : tabSetSet) {
//            event.registerCreativeModeTab(tabSet.id, builder ->
//                    // Set name of tab to display
//                    builder.displayName(Text.translatable("item_group." + tabSet.id.getNamespace() + "." + tabSet.id.getPath()))
//                            // Set icon of creative tab
//                            .icon(tabSet::getIcon)
//                            .entries(((enabledFeatures, entries, operatorEnabled) -> entries.addAll(tabSet.itemGroup)))
//                            .build()
//            );
//        }
//    }
}

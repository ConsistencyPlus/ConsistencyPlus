package net.consistencyteam.consistency_plus;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ConsistencyPlus implements ModInitializer {
    public static final Item WARPED_NETHER_WART = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    @Override
	public void onInitialize() {
        Blocks.init();
        Items.init();
        //Items_new.init(); // for testing
        Registry.register(Registry.ITEM, new Identifier("consistency_plus", "warped_nether_wart"), WARPED_NETHER_WART);
    }
}

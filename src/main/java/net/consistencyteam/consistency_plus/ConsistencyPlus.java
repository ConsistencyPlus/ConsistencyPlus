package net.consistencyteam.consistency_plus;

import net.consistencyteam.consistency_plus.registry.Blocks;
import net.consistencyteam.consistency_plus.registry.Items;
import net.fabricmc.api.ModInitializer;

public class ConsistencyPlus implements ModInitializer {
    @Override
	public void onInitialize() {
        System.out.println("Consistency+ Main - Starting Initialization");
        System.out.println("Consistency+ Main - Beginning Block Initialization");
        Blocks.init();
        System.out.println("Consistency+ Main - Blocks Initialized");
        System.out.println("Consistency+ Main - Beginning Item Initialization");
        Items.init();
        System.out.println("Consistency+ Main - Items Initialized");
        System.out.println("Consistency+ Main - Finished Initialization");
    }
}

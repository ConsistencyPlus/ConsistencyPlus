package io.github.consistencyplus.consistency_plus;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.item.ModelPredicateProviderRegistry;

public class ConsistencyPlusClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ConsistencyPlusClientMain.init(ModelPredicateProviderRegistry::register);
	}
}

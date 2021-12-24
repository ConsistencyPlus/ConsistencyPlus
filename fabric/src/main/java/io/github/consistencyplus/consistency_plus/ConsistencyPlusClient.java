package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusClientMain;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;

public class ConsistencyPlusClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ConsistencyPlusClientMain.init();
	}
}

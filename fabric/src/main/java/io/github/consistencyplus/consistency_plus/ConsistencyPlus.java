package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.fabricmc.api.ModInitializer;

public class ConsistencyPlus implements ModInitializer {
	@Override
	public void onInitialize() {
		ConsistencyPlusMain.init();
	}
}

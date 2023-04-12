package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.util.LoaderHelper;
import net.fabricmc.api.ModInitializer;

public class ConsistencyPlus implements ModInitializer {
	//private static final Identifier WITHER_SKELE_LOOT = EntityType.WITHER_SKELETON.getLootTableId();
	LoaderHelper fabric = new LoaderVariant();
	@Override
	public void onInitialize() {
		ConsistencyPlusMain.init(fabric);

	}
}

package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.client.NubertHandler;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsistencyPlus implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("Consistency+");

	@Override
	public void onInitialize() {
		LOGGER.info("Consistency+ Main - Beginning initialization process");
		boolean DEVENV = FabricLoader.getInstance().isDevelopmentEnvironment();
		if (DEVENV) LOGGER.debug("Consistency+ Main - Beginning block initialization");
		CPlusBlocks.init();
		if (DEVENV) LOGGER.debug("Consistency+ Main - Blocks initialized, beginning item initialization");
		CPlusItems.init();
		if (DEVENV) LOGGER.debug("Consistency+ Main - Items initialized, beginning Nubert");
		NubertHandler.init();
		LOGGER.info("Consistency+ Main - Finished initialization process");
		// FuelRegistry.INSTANCE.add(CHARCOAL_BLOCK, 200);
	}
}

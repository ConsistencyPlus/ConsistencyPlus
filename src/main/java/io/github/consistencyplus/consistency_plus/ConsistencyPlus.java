package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.registry.Blocks;
import io.github.consistencyplus.consistency_plus.registry.Items;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsistencyPlus implements ModInitializer {
	private static final Logger LOGGER = LogManager.getLogger();
	
	@Override
	public void onInitialize() {
		LOGGER.info("Consistency+ Main - Version 0.4.0 - Starting initialization");
		LOGGER.debug("Consistency+ Main - Beginning block initialization");
		Blocks.init();
		LOGGER.debug("Consistency+ Main - Blocks initialized");
		LOGGER.debug("Consistency+ Main - Beginning item initialization");
		Items.init();
		LOGGER.debug("Consistency+ Main - Items initialized");
		LOGGER.info("Consistency+ Main - Finished initialization");
	}
}

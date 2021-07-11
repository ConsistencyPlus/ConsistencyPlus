package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsistencyPlus implements ModInitializer {
	private static final Logger LOGGER = LogManager.getLogger();

	@Override
	public void onInitialize() {
		ModContainer mod = FabricLoader.getInstance()
						.getModContainer("consistency_plus")
						.orElseThrow(NullPointerException::new);

		String MOD_VERSION = mod.getMetadata()
						.getVersion()
						.getFriendlyString();

		LOGGER.info("Consistency+ Main - Version " + MOD_VERSION + " - Starting initialization");

		// Loader and Environment sensing
		if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
			LOGGER.debug("Consistency+ Main - Developer Environment");
		} else {
			LOGGER.debug("Consistency+ Main - Production Environment");
		}
		if (FabricLoader.getInstance().isModLoaded("quilt_loader")) {
			LOGGER.debug("Consistency+ Main - Running on Quilt Loader with Fabric compat");
		} else if (FabricLoader.getInstance().isModLoaded("fabricloader")) {
			LOGGER.debug("Consistency+ Main - Running on Fabric Loader");
		} else {
			LOGGER.debug("Consistency+ Main - Running on an unknown loader, have to assume its up to spec with Fabric.");
		}

		LOGGER.debug("Consistency+ Main - Beginning block initialization");
		CPlusBlocks.init();
		LOGGER.debug("Consistency+ Main - CPlusBlocks initialized");
		LOGGER.debug("Consistency+ Main - Beginning item initialization");
		CPlusItems.init();
		LOGGER.debug("Consistency+ Main - CPlusItems initialized");
		LOGGER.info("Consistency+ Main - Finished initialization");


	}
}

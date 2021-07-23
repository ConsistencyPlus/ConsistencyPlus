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

		String MOD_VERSION;

		if (mod.getMetadata().getVersion().getFriendlyString().contentEquals("${version}"))
		{
			MOD_VERSION = "Error (Please ask Siuol to recompile.)";
		} else {
			MOD_VERSION = mod.getMetadata().getVersion().getFriendlyString();
		}

		LOGGER.info("Consistency+ Main - Version " + MOD_VERSION + " - Starting initialization");

		// Loader and Environment sensing
		if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
			LOGGER.info("Consistency+ Main - Developer Environment");
		} else {
			LOGGER.info("Consistency+ Main - Production Environment");
		}

		if (FabricLoader.getInstance().isModLoaded("quilt_loader")) {
			LOGGER.info("Consistency+ Main - Running on Quilt Loader with Fabric compat");
		} else if (FabricLoader.getInstance().isModLoaded("fabricloader")) {
			LOGGER.info("Consistency+ Main - Running on Fabric Loader");
		} else {
			LOGGER.info("Consistency+ Main - Running on an unknown loader, have to assume its up to spec with Fabric.");
		}

		if (FabricLoader.getInstance().isModLoaded("consistency_plus_core")) {
			LOGGER.warn("Consistency+ Main - Consistency+ Core is not supported on this version and this version cannot use its features. Please use Consistency+ 1.0.0 or newer.");
		}

		if (FabricLoader.getInstance().isModLoaded("consistency_plus_content")) {
			LOGGER.error("Consistency+ Main - Consistency+ Content is unsupported and there is major issues with using content and legacy together.");
		}

		if (FabricLoader.getInstance().isModLoaded("consistency_plus_extra")) {
			LOGGER.warn("Consistency+ Main - Consistency+ Extra is not supported on this version and this version cannot use its features. Please use Consistency+ 1.0.0 or newer.");
		}

		LOGGER.info("Consistency+ Main - Beginning initialization process");
		if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
			LOGGER.info("Consistency+ Main - Beginning block initialization");
		}
		CPlusBlocks.init();
		if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
			LOGGER.info("Consistency+ Main - CPlusBlocks initialized");
			LOGGER.info("Consistency+ Main - Beginning item initialization");
		}
		CPlusItems.init();
		if (FabricLoader.getInstance().isDevelopmentEnvironment()) {
			LOGGER.info("Consistency+ Main - CPlusItems initialized");
		}
		LOGGER.info("Consistency+ Main - Finished initialization process");


	}
}

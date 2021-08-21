package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// import static io.github.consistencyplus.consistency_plus.registry.CPlusItems.CHARCOAL_BLOCK;

public class ConsistencyPlus implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("Consistency+");
	public static final String ID = "consistency_plus";

	@Override
	public void onInitialize() {
		LOGGER.info("Consistency+ Main - Beginning initialization process");

		if (FabricLoader.getInstance().isModLoaded("consistency_plus_core")) {
			throw new RuntimeException("Consistency+ Main - Consistency+ Core is not supported on this version and this version cannot use its features. Please use Consistency+ 1.0.0 or newer.");
		} else if (FabricLoader.getInstance().isModLoaded("consistency_plus_content")) {
			throw new RuntimeException("Consistency+ Main - Consistency+ Content is unsupported and there is major issues with using content and legacy together.");
		} else if (FabricLoader.getInstance().isModLoaded("consistency_plus_extra")) {
			throw new RuntimeException("Consistency+ Main - Consistency+ Extra is not supported on this version and this version cannot use its features. Please use Consistency+ 1.0.0 or newer.");
		}

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



		// FuelRegistry.INSTANCE.add(CHARCOAL_BLOCK, 200);
	}
}

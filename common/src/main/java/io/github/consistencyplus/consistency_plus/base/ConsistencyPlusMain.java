package io.github.consistencyplus.consistency_plus.base;

import dev.architectury.platform.Platform;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsistencyPlusMain {
	public static final Logger LOGGER = LogManager.getLogger("Consistency+");
	public static final String ID = "consistency_plus";
	public static final boolean DEVENV = Platform.isDevelopmentEnvironment();

	public static void init() {
		LOGGER.info("Consistency+ Main - Beginning initialization process");
		
		CPlusBlocks.init();
		CPlusItems.init();
		
		LOGGER.info("Consistency+ Main - Finished initialization process");
		
		// FuelRegistry.INSTANCE.add(CHARCOAL_BLOCK, 200);
	}
	
	public static Identifier id(String name) {
		return new Identifier(ID, name);
	}
}

package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(ConsistencyPlus.ID)
public class ConsistencyPlus {
	public static final Logger LOGGER = LogManager.getLogger("Consistency+");
	public static final String ID = "consistency_plus";

	public void onInitialize() {
		LOGGER.info("Consistency+ Main - Beginning initialization process");


		CPlusBlocks.init();
		CPlusItems.init();

		LOGGER.info("Consistency+ Main - Finished initialization process");



		// FuelRegistry.INSTANCE.add(CHARCOAL_BLOCK, 200);
	}
}

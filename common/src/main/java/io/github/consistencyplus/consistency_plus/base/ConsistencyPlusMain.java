package io.github.consistencyplus.consistency_plus.base;

import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.DeferredRegister;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusCopperBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import io.github.consistencyplus.consistency_plus.registry.CPlusEntries;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsistencyPlusMain {
	public static final Logger LOGGER = LogManager.getLogger("Consistency+");
	public static final String ID = "consistency_plus";
	public static final boolean DEVENV = Platform.isDevelopmentEnvironment();
	public static final Boolean isSoulIceLoaded = Platform.isModLoaded("soul_ice");

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ConsistencyPlusMain.ID, Registry.BLOCK_KEY);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ConsistencyPlusMain.ID, Registry.ITEM_KEY);


	public static void init() {
		LOGGER.info("Consistency+ Main - Beginning initialization process");
		CPlusEntries.init();
		CPlusCopperBlocks.init();
		CPlusBlocks.init();
		CPlusItems.init();
		BLOCKS.register();
		ITEMS.register();
		LOGGER.info("Consistency+ Main - Finished initialization process");
	}
	
	public static Identifier id(String name) {
		return new Identifier(ID, name);
	}
}

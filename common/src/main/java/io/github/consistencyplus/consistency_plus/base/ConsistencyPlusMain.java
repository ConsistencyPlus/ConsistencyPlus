package io.github.consistencyplus.consistency_plus.base;

import dev.architectury.event.events.common.LifecycleEvent;
import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.DeferredRegister;
import io.github.consistencyplus.consistency_plus.blocks.growing.DirtGrowth;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertCartDispenserBehavior;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusEntities;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import io.github.consistencyplus.consistency_plus.registry.CPlusEntries;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
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
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ConsistencyPlusMain.ID, Registry.ENTITY_TYPE_KEY);


	public static void init() {
		LOGGER.info("Consistency+ beginning initialization!");
		CPlusEntries.init();
		CPlusBlocks.init();
		CPlusItems.init();
		CPlusEntities.init();
		BLOCKS.register();
		LOGGER.info("Consistency+ blocks registered");
		ITEMS.register();
		LOGGER.info("Consistency+ items registered");
		ENTITIES.register();
		LOGGER.info("Consistency+ entities registered");
		LifecycleEvent.SETUP.register(ConsistencyPlusMain::onRegistryReady);
		LOGGER.info("Consistency+ finished initialization successfully!");

	}

	private static void onRegistryReady() {
		NubertCartDispenserBehavior.register();
		DirtGrowth.registerDefaults();
	}
	
	public static Identifier id(String name) {
		return new Identifier(ID, name);
	}
}

package io.github.consistencyplus.consistency_plus.base;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertCartDispenserBehavior;
import io.github.consistencyplus.consistency_plus.registry.*;
import io.github.consistencyplus.consistency_plus.registry.CPlusEntities;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsistencyPlusMain {
	public static final Logger LOGGER = LogManager.getLogger("Consistency+");
	public static final String ID = "consistency_plus";

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ConsistencyPlusMain.ID, Registry.BLOCK_KEY);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ConsistencyPlusMain.ID, Registry.ITEM_KEY);
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ConsistencyPlusMain.ID, Registry.ENTITY_TYPE_KEY);

	public static Loader LOADER = new DefaultLoader();

	public static void init(Loader loader) {
		LOADER = loader;
		LOGGER.info("Consistency+ beginning initialization!");
		CPlusItemGroups.init();
		CPlusEntries.init();
		CPlusBlocks.init();
		CPlusItems.init();
		CPlusEntities.init();
		CPlusNewEntries.init();
		BLOCKS.register();
		LOGGER.info("Consistency+ blocks registered");
		ITEMS.register();
		LOGGER.info("Consistency+ items registered");
		ENTITIES.register();
		LOGGER.info("Consistency+ entities registered");
		CPlusItemGroups.postRegistry();
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

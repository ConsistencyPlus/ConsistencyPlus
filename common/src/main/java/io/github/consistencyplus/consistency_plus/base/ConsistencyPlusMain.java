package io.github.consistencyplus.consistency_plus.base;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertCartDispenserBehavior;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertDispenserBehavior;
import io.github.consistencyplus.consistency_plus.core.util.DefaultLoader;
import io.github.consistencyplus.consistency_plus.core.util.Loader;
import io.github.consistencyplus.consistency_plus.registry.*;
import net.minecraft.block.Block;
import net.minecraft.block.DispenserBlock;
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

	public static Loader LOADER = new DefaultLoader();

	public static void init(Loader loader) {
		LOADER = loader;
		LOGGER.info("Consistency+ Main - Beginning initialization process");
		CPlusItemGroups.init();
		CPlusEntries.init();
		CPlusBlocks.init();
		CPlusItems.init();
		CPlusNewEntries.init();
		nubertDispenserBehaviors();
		BLOCKS.register();
		LOGGER.info("Consistency+ Main - Registration Checkpoint 1");
		ITEMS.register();
		CPlusItemGroups.postRegistry();
		LOGGER.info("Consistency+ Main - Finished initialization process");
	}

	private static void nubertDispenserBehaviors() {
		Registrar<Item> registrar = ITEMS.getRegistrar();
		registrar.listen(CPlusItems.NUBERT, nubert -> DispenserBlock.registerBehavior(nubert, NubertDispenserBehavior.INSTANCE));
		registrar.listen(CPlusItems.WIGGED_NUBERT, nubert -> DispenserBlock.registerBehavior(nubert, NubertDispenserBehavior.INSTANCE));
		registrar.listen(CPlusItems.NUBERT_MINECART, nubert -> DispenserBlock.registerBehavior(nubert, NubertCartDispenserBehavior.INSTANCE));
		registrar.listen(CPlusItems.WIGGED_NUBERT_MINECART, nubert -> DispenserBlock.registerBehavior(nubert, NubertCartDispenserBehavior.INSTANCE));
	}
	
	public static Identifier id(String name) {
		return new Identifier(ID, name);
	}
}

package io.github.consistencyplus.consistency_plus.registry.fabric;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;

public class CPlusCopperBlocksImpl {
	// Welcome to "Siuol does utterly outrageous stuff in order to get a thing to work."

	public static void registerOxidizable(RegistrySupplier<Block> less, RegistrySupplier<Block> more) {
		OxidizableBlocksRegistry.registerOxidizableBlockPair(Registry.BLOCK.get(less.getId()), (Registry.BLOCK.get(more.getId())));
	}

	public static void registerWaxable(RegistrySupplier<Block> no, RegistrySupplier<Block> yes) {
		OxidizableBlocksRegistry.registerWaxableBlockPair(Registry.BLOCK.get(no.getId()), (Registry.BLOCK.get(yes.getId())));
	}
	
	public static void finish() {
		// no need because fabric good and best :)
		if (ConsistencyPlusMain.DEVENV) ConsistencyPlusMain.LOGGER.info("CPlusCopperBlocks - initialization point");
	}
}

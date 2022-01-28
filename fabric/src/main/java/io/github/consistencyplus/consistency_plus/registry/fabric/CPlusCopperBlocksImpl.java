package io.github.consistencyplus.consistency_plus.registry.fabric;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.Block;

public class CPlusCopperBlocksImpl {
	public static void registerOxidizable(Block less, Block more) {
		OxidizableBlocksRegistry.registerOxidizableBlockPair(less, more);
	}
	
	public static void registerWaxable(Block no, Block yes) {
		OxidizableBlocksRegistry.registerWaxableBlockPair(no, yes);
	}
	
	public static void finish() {
		// no need because fabric good and best :)
	}
}

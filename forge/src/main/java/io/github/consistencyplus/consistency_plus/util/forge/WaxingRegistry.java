package io.github.consistencyplus.consistency_plus.util.forge;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import net.minecraft.block.Block;
import net.minecraft.item.HoneycombItem;

public class WaxingRegistry {
	public static void register(Block from, Block to) {
		getMutableMap().put(from, to);
	}

	private static BiMap<Block, Block> getMutableMap() {
		BiMap<Block, Block> originalMap = HoneycombItem.UNWAXED_TO_WAXED_BLOCKS.get();
		if (mapsValid()) {
			return originalMap;
		} else {
			HashBiMap<Block, Block> newMap = HashBiMap.create(originalMap);
			HoneycombItem.UNWAXED_TO_WAXED_BLOCKS = Suppliers.memoize(() -> newMap);
			HoneycombItem.WAXED_TO_UNWAXED_BLOCKS = Suppliers.memoize(() -> HoneycombItem.UNWAXED_TO_WAXED_BLOCKS.get().inverse());
			return newMap;
		}
	}

	private static boolean mapsValid() {
		// must be mutable, two fields must be linked
		if (HoneycombItem.UNWAXED_TO_WAXED_BLOCKS.get() instanceof HashBiMap<Block, Block> hashBiMap) {
			return hashBiMap.inverse() == HoneycombItem.WAXED_TO_UNWAXED_BLOCKS.get();
		}
		return false;
	}
}

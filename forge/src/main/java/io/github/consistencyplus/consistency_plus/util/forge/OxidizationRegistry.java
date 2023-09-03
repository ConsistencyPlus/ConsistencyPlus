package io.github.consistencyplus.consistency_plus.util.forge;

import java.lang.reflect.Field;
import java.util.function.Supplier;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import net.minecraft.block.Block;
import net.minecraft.block.Oxidizable;

public class OxidizationRegistry {
	public static void register(Block from, Block to) {
		getMutableMap().put(from, to);
	}

	private static BiMap<Block, Block> getMutableMap() {
		BiMap<Block, Block> originalMap = Oxidizable.OXIDATION_LEVEL_INCREASES.get();
		if (mapsValid()) {
			return originalMap;
		} else {
			// map has been accessed now, set the internal value
			HashBiMap<Block, Block> newMap = HashBiMap.create(originalMap);
			setInternalValue(Oxidizable.OXIDATION_LEVEL_INCREASES, newMap);
			// initialize this delegate too
			Oxidizable.OXIDATION_LEVEL_DECREASES.get();
			setInternalValue(Oxidizable.OXIDATION_LEVEL_DECREASES, newMap.inverse());
			return newMap;
		}
	}

	private static boolean mapsValid() {
		// must be mutable, two fields must be linked
		if (Oxidizable.OXIDATION_LEVEL_INCREASES.get() instanceof HashBiMap<Block, Block> hashBiMap) {
			return hashBiMap.inverse() == Oxidizable.OXIDATION_LEVEL_DECREASES.get();
		}
		return false;
	}

	private static void setInternalValue(Supplier<BiMap<Block, Block>> supplier, BiMap<Block, Block> value) {
		try {
			Field valueField = supplier.getClass().getDeclaredField("value");
			valueField.setAccessible(true);
			valueField.set(supplier, value);
		} catch (NoSuchFieldException | IllegalAccessException e) {
			throw new RuntimeException("Consistency+ failed to set up copper oxidization", e);
		}
	}
}

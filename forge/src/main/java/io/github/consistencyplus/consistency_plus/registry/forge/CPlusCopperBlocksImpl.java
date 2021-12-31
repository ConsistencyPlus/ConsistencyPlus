package io.github.consistencyplus.consistency_plus.registry.forge;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.block.Block;
import net.minecraft.block.Oxidizable;
import net.minecraft.item.HoneycombItem;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class CPlusCopperBlocksImpl {
	private static final Map<Block, Block> WAXABLE = new HashMap<>();
	private static final Map<Block, Block> OXIDIZABLE = new HashMap<>();
	
	public static void registerOxidizable(Block less, Block more) {
		OXIDIZABLE.put(less, more);
	}
	
	public static void registerWaxable(Block no, Block yes) {
		WAXABLE.put(no, yes);
	}
	
	// this is yoinked from Create, which is licensed under MIT, so this is as well.
	// https://github.com/Creators-of-Create/Create/blob/mc1.18/dev/src/main/java/com/simibubi/create/foundation/block/CopperRegistries.java
	public static void finish() {
		try {
			Field delegateField = Oxidizable.OXIDATION_LEVEL_INCREASES.getClass().getDeclaredField("delegate");
			delegateField.setAccessible(true);
			// Get the original delegate to prevent an infinite loop
			@SuppressWarnings("unchecked")
			Supplier<BiMap<Block, Block>> originalWeatheringMapDelegate = (Supplier<BiMap<Block, Block>>) delegateField.get(Oxidizable.OXIDATION_LEVEL_INCREASES);
			com.google.common.base.Supplier<BiMap<Block, Block>> weatheringMapDelegate = () -> {
				ImmutableBiMap.Builder<Block, Block> builder = ImmutableBiMap.builder();
				builder.putAll(originalWeatheringMapDelegate.get());
				OXIDIZABLE.forEach(builder::put);
				return builder.build();
			};
			// Replace the memoized supplier's delegate, since interface fields cannot be reassigned
			delegateField.set(Oxidizable.OXIDATION_LEVEL_INCREASES, weatheringMapDelegate);
		} catch (Exception e) {
			throw new RuntimeException("Failed to initialize Consistency+ copper blocks", e);
		}
		
		Supplier<BiMap<Block, Block>> originalWaxableMapSupplier = HoneycombItem.UNWAXED_TO_WAXED_BLOCKS;
		Supplier<BiMap<Block, Block>> waxableMapSupplier = Suppliers.memoize(() -> {
			ImmutableBiMap.Builder<Block, Block> builder = ImmutableBiMap.builder();
			builder.putAll(originalWaxableMapSupplier.get());
			WAXABLE.forEach(builder::put);
			return builder.build();
		});
		HoneycombItem.UNWAXED_TO_WAXED_BLOCKS = waxableMapSupplier;
	}
	
	
}

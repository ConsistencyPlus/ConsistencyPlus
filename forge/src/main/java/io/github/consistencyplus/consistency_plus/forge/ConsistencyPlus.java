package io.github.consistencyplus.consistency_plus.forge;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.items.CPlusItemGroups;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Oxidizable;
import net.minecraft.data.DataOutput;
import net.minecraft.item.*;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

@Mod(ConsistencyPlusMain.MOD_ID)
public class ConsistencyPlus {
	LoaderHelper forge = new LoaderVariant();
	public static Map<Identifier, Identifier> oxidizationMap = new HashMap<>();
	public static Map<Identifier, Identifier> waxingMap = new HashMap<>();
	public static Map<Identifier, String> blockToRenderLayers = new HashMap<>();
	public static Map<Identifier, BlockData> blockDataMap;

	private static final DeferredRegister<Codec<? extends IGlobalLootModifier>> GLOBAL_LOOT = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, "consistency_plus");

	private static final RegistryObject<Codec<WitheredBonesModifier>> CPLUS_WITHERED_BONES = GLOBAL_LOOT.register("withered_bones", WitheredBonesModifier.CODEC);

	public static boolean hasAccessedRegistry = false;

	public ConsistencyPlus() {
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
		GLOBAL_LOOT.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

	private static Map<BlockItem, RegistryKey<ItemGroup>> creativeTabs = new LinkedHashMap<>();

	@SubscribeEvent
	public void onInitialize(RegisterEvent event) {
		ConsistencyPlusMain.init(forge);

		if (!hasAccessedRegistry) {
			blockDataMap = PseudoRegistry.export();
			hasAccessedRegistry = true;
		}
		event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
			for (Identifier id : blockDataMap.keySet()) {
				BlockData data = blockDataMap.get(id);
				if (forge.getIsClient() && data.settings().layer() != null) {
					blockToRenderLayers.put(id, data.settings().layer());
				}
				if (data.block() == BlockShape.PROVIDED) {
					accessRegistry(id, data, helper);
					continue;
				}
				helper.register(id, data.block().initFunc().apply(data.settings().settings()));
			}
		});

		event.register(ForgeRegistries.Keys.ITEMS, helper -> {
			for (Identifier id : blockDataMap.keySet()) {
				if (Objects.equals(id.getPath(), "warped_wart")) continue;
				BlockData data = blockDataMap.get(id);
				/*if (data.block() == BlockShape.PROVIDED) {
					helper.register(id, new BlockItem(RegistryObject.create(id, ForgeRegistries.BLOCKS).get(), new Item.Settings().group(getItemGroup(data.settings().additionalBlockSettings().itemGroup()))));
					continue;
				}*/
				BlockItem item = new BlockItem(RegistryObject.create(id, ForgeRegistries.BLOCKS).get(), new Item.Settings());

				helper.register(id, item);
				creativeTabs.put(item, getItemGroup(data.settings().additionalBlockSettings().itemGroup()));
			}

			for (Identifier id : CPlusBlocks.itemRegistry.keySet()) {
				helper.register(id, CPlusBlocks.itemRegistry.get(id).apply(new Item.Settings()));
			}

		});

		event.register(RegistryKeys.ITEM_GROUP, helper -> {
			helper.register(CPlusItemGroups.STONES.key(), ItemGroup.builder()
					.icon(CPlusItemGroups.STONES.icon()).displayName(CPlusItemGroups.STONES.name())
					.build()
			);
			helper.register(CPlusItemGroups.DYEABLES.key(), ItemGroup.builder()
					.icon(CPlusItemGroups.DYEABLES.icon()).displayName(CPlusItemGroups.DYEABLES.name())
					.withTabsBefore(CPlusItemGroups.STONES.key()).withTabsAfter(CPlusItemGroups.MISC.key()) // sorting
					.build()
			);
			helper.register(CPlusItemGroups.MISC.key(), ItemGroup.builder()
					.icon(CPlusItemGroups.MISC.icon()).displayName(CPlusItemGroups.MISC.name())
					.build()
			);
		});

		finish();


	}

	@SubscribeEvent
	public void buildContents(BuildCreativeModeTabContentsEvent event) {
		creativeTabs.forEach((item, group) -> {
			if (event.getTabKey() == group) {
				event.add(item);
			}
		});
	}

	@SubscribeEvent
	public static void lootEvent(GatherDataEvent event) {
		event.getGenerator().addProvider(event.includeServer(), new DataProvider(event.getGenerator().getPackOutput(), "consistency_plus"));
	}

	public void accessRegistry(Identifier id, BlockData data, RegisterEvent.RegisterHelper<Block> helper) {
		AdditionalBlockSettings addBloSet = data.settings().additionalBlockSettings();
		Function<AbstractBlock.Settings, Block> blockFunc = CPlusBlocks.registry.get(id);
		helper.register(id, blockFunc.apply(data.settings().settings()));

		if (addBloSet.oxidizeToBlock() != null) {
			oxidizationMap.put(id, new Identifier(addBloSet.oxidizeToBlock()));
		}

		if (addBloSet.waxToBlock() != null) {
			waxingMap.put(id, new Identifier(addBloSet.waxToBlock()));
		}
	}

	// this is based on code from Create, which is licensed under MIT, so this is as well.
	// https://github.com/Creators-of-Create/Create/blob/mc1.18/dev/src/main/java/com/simibubi/create/foundation/block/CopperRegistries.java
	public static void finish() {
		try {
			Field delegateField = Oxidizable.OXIDATION_LEVEL_INCREASES.getClass().getDeclaredField("delegate");
			delegateField.setAccessible(true);
			// Get the original delegate to prevent an infinite loop
			@SuppressWarnings("unchecked")
			Supplier<BiMap<Block, Block>> originalWeatheringMapDelegate = (Supplier<BiMap<Block, Block>>) delegateField.get(Oxidizable.OXIDATION_LEVEL_INCREASES);
			com.google.common.base.Supplier<BiMap<Block, Block>> weatheringMapDelegate = () -> {
				BiMap<Block, Block> newMap = HashBiMap.create(originalWeatheringMapDelegate.get());
				ConsistencyPlus.oxidizationMap.forEach((lesserID, greaterID) -> {
					Block lesser = ForgeRegistries.BLOCKS.getValue(lesserID);
					Block greater = ForgeRegistries.BLOCKS.getValue(greaterID);
					if (!newMap.containsKey(lesser) && !newMap.containsValue(greater))
						newMap.put(lesser, greater);
				});
				return newMap;
			};
			// Replace the memoized supplier's delegate, since interface fields cannot be reassigned
			delegateField.set(Oxidizable.OXIDATION_LEVEL_INCREASES, weatheringMapDelegate);
		} catch (Exception e) {
			throw new RuntimeException("Failed to initialize Consistency+ copper blocks", e);
		}

		Supplier<BiMap<Block, Block>> originalWaxableMapSupplier = HoneycombItem.UNWAXED_TO_WAXED_BLOCKS;
		Supplier<BiMap<Block, Block>> waxableMapSupplier = Suppliers.memoize(() -> {
			BiMap<Block, Block> newMap = HashBiMap.create(originalWaxableMapSupplier.get());
			ConsistencyPlus.waxingMap.forEach((unwaxedID, waxedID) -> {
				Block unwaxed = ForgeRegistries.BLOCKS.getValue(unwaxedID);
				Block waxed = ForgeRegistries.BLOCKS.getValue(waxedID);
				if (!newMap.containsKey(unwaxed) && !newMap.containsValue(waxed))
					newMap.put(unwaxed, waxed);
			});
			return newMap;
		});
		HoneycombItem.UNWAXED_TO_WAXED_BLOCKS = waxableMapSupplier;
	}

	public static RegistryKey<ItemGroup> getItemGroup(String string) {
		return string == null ? ItemGroups.INGREDIENTS : switch (string) {
			case "dyeables" -> CPlusItemGroups.DYEABLES.key();
			case "misc" -> CPlusItemGroups.MISC.key();
			default -> CPlusItemGroups.STONES.key();
		};
	}

	private static class DataProvider extends GlobalLootModifierProvider {
		public DataProvider(DataOutput output, String modid) {
			super(output, modid);
		}

		@Override
		protected void start() {
			add("withered_bones", new WitheredBonesModifier(new LootCondition[] {
					LootTableIdCondition.builder(new Identifier("entities/wither_skeleton")).build()
			}));
		}
	}
}

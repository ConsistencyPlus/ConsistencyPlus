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
import java.util.function.Supplier;

@Mod(ConsistencyPlusMain.MOD_ID)
public class ConsistencyPlus {
	public static Map<Identifier, Identifier> oxidizationMap = new HashMap<>();
	public static Map<Identifier, Identifier> waxingMap = new HashMap<>();

	private static final DeferredRegister<Codec<? extends IGlobalLootModifier>> GLOBAL_LOOT = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, "consistency_plus");

	private static final RegistryObject<Codec<WitheredBonesModifier>> CPLUS_WITHERED_BONES = GLOBAL_LOOT.register("withered_bones", WitheredBonesModifier.CODEC);

	public ConsistencyPlus() {
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
		GLOBAL_LOOT.register(FMLJavaModLoadingContext.get().getModEventBus());
	}

	private static Map<BlockItem, RegistryKey<ItemGroup>> creativeTabs = new LinkedHashMap<>();

	@SubscribeEvent
	public void onInitialize(RegisterEvent event) {
		ConsistencyPlusMain.init();

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

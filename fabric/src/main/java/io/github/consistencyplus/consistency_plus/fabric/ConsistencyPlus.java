package io.github.consistencyplus.consistency_plus.fabric;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.items.CPlusItemGroups;
import io.github.consistencyplus.consistency_plus.items.CPlusItemGroups.GroupInfo;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlockFamilies;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.util.RegistryDump;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

public class ConsistencyPlus implements ModInitializer {
	private static final Identifier WITHER_SKELE_LOOT = EntityType.WITHER_SKELETON.getLootTableId();

	@Override
	public void onInitialize() {
		ConsistencyPlusMain.init();

		lootModification();

		for (GroupInfo info : CPlusItemGroups.ALL) {
			ItemGroup group = FabricItemGroup.builder()
					.icon(info.icon())
					.displayName(info.name())
					.build();
			Registry.register(Registries.ITEM_GROUP, info.key(), group);
		}

		ServerWorldEvents.LOAD.register(((server, world) -> RegistryDump.run()));
	}

	public static void lootModification() {
		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if (source.isBuiltin() && WITHER_SKELE_LOOT.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.builder()
						.with(ItemEntry.builder(Registries.ITEM.get(new Identifier("consistency_plus", "withered_bone"))));

				tableBuilder.pool(poolBuilder);
			}
		});
	}

}

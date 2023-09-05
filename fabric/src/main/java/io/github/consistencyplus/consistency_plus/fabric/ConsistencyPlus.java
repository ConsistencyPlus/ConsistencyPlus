package io.github.consistencyplus.consistency_plus.fabric;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.items.CPlusItemGroups;
import io.github.consistencyplus.consistency_plus.items.CPlusItemGroups.GroupInfo;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlockFamilies;
import io.github.consistencyplus.consistency_plus.util.registry.DisplayBlocksCommand;
import io.github.consistencyplus.consistency_plus.util.registry.RegistryDump;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;

import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemGroup;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

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

		ItemGroupEvents.MODIFY_ENTRIES_ALL.register((group, entries) -> {
			RegistryKey<ItemGroup> key = Registries.ITEM_GROUP.getKey(group).orElseThrow();
			CPlusBlockFamilies.addItemsToGroup(key, entries);
		});

		ServerWorldEvents.LOAD.register(((server, world) -> RegistryDump.run()));
		CommandRegistrationCallback.EVENT.register((dispatcher, registries, env) -> {
			dispatcher.register(DisplayBlocksCommand.build());
		});
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

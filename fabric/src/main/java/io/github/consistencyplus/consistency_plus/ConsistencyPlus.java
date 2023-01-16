package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.core.entries.block.fabric.MetalRegistryEntryGroupImpl;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class ConsistencyPlus implements ModInitializer {
	private static final Identifier WITHER_SKELE_LOOT = EntityType.WITHER_SKELETON.getLootTableId();

	@Override
	public void onInitialize() {
		ConsistencyPlusMain.init();
		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, table, setter) -> {
			if (WITHER_SKELE_LOOT.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.builder()
						.rolls(ConstantLootNumberProvider.create(1))
						.with(ItemEntry.builder(CPlusItems.WITHERED_BONE.get()));
				table.pool(poolBuilder);
			}
		});


		MetalRegistryEntryGroupImpl.OXIDIZABLE.forEach((less, more) -> OxidizableBlocksRegistry.registerOxidizableBlockPair(less.get(), more.get()));
		MetalRegistryEntryGroupImpl.WAXABLE.forEach((no, yes) -> OxidizableBlocksRegistry.registerWaxableBlockPair(no.get(), yes.get()));
	}
}

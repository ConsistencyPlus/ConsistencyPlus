package io.github.consistencyplus.consistency_plus.util.registry;

import java.util.List;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry.Reference;
import net.minecraft.state.StateManager;

public class RegistrySummary {
	public static void print() {
		List<Block> blocks = Registries.BLOCK.streamEntries()
				.filter(holder -> holder.registryKey().getValue().getNamespace().equals(ConsistencyPlusMain.MOD_ID))
				.map(Reference::value)
				.toList();

		int states = blocks.stream().map(Block::getStateManager).map(StateManager::getStates).mapToInt(List::size).sum();

		List<Item> items = Registries.ITEM.streamEntries()
				.filter(holder -> holder.registryKey().getValue().getNamespace().equals(ConsistencyPlusMain.MOD_ID))
				.map(Reference::value)
				.toList();

		ConsistencyPlusMain.LOGGER.info(
				"Consistency+: Registered {} blocks ({} states) and {} items", blocks.size(), states, items.size()
		);
	}
}

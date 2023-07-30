package io.github.consistencyplus.consistency_plus.fabric;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.items.CPlusItemGroups;
import io.github.consistencyplus.consistency_plus.items.CPlusItemGroups.GroupInfo;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.util.AdditionalBlockSettings;
import io.github.consistencyplus.consistency_plus.util.BlockData;
import io.github.consistencyplus.consistency_plus.util.BlockShape;
import io.github.consistencyplus.consistency_plus.util.LoaderHelper;
import io.github.consistencyplus.consistency_plus.registry.PseudoRegistry;
import io.github.consistencyplus.consistency_plus.util.RegistryDump;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.loader.api.FabricLoader;

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
import net.minecraft.text.Text;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;
import net.minecraft.registry.Registry;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

public class ConsistencyPlus implements ModInitializer {
	private static final Identifier WITHER_SKELE_LOOT = EntityType.WITHER_SKELETON.getLootTableId();
	LoaderHelper fabric = new LoaderVariant();

	public static Map<Block, String> blockToRenderLayers = new HashMap<>();

	Map<Block, String> oxidizationMap = new HashMap<>();
	Map<Block, String> waxingMap = new HashMap<>();

	@Override
	public void onInitialize() {
		ConsistencyPlusMain.init(fabric);
		Map<Identifier, BlockData> blockDataMap = PseudoRegistry.export();
		for (Identifier id : blockDataMap.keySet()) {
			BlockData data = blockDataMap.get(id);
			if (data.block() == BlockShape.PROVIDED) {
				accessRegistry(id, data);
				continue;
			}

			FabricBlockSettings blockSettings = FabricBlockSettings.copyOf(data.settings().settings());
			AdditionalBlockSettings addBloSet = data.settings().additionalBlockSettings();

			Block block = Registry.register(Registries.BLOCK, id, data.block().initFunc().apply(blockSettings));
			Item item = new BlockItem(block, new Item.Settings());
			Registry.register(Registries.ITEM, id, item);
			ItemGroupEvents.modifyEntriesEvent(getItemGroup(addBloSet.itemGroup())).register(listener -> listener.add(item));
			if (fabric.getIsClient() && data.settings().layer() != null) {
				blockToRenderLayers.put(block, data.settings().layer());
			}
		}

		for (Block block : oxidizationMap.keySet()) {
			OxidizableBlocksRegistry.registerOxidizableBlockPair(block, Registries.BLOCK.get(new Identifier(oxidizationMap.get(block))));
		}
		for (Block block : waxingMap.keySet()) {
			OxidizableBlocksRegistry.registerWaxableBlockPair(block, Registries.BLOCK.get(new Identifier(waxingMap.get(block))));
		}

		for (Identifier id : CPlusBlocks.itemRegistry.keySet()) {
			Registry.register(Registries.ITEM, id, CPlusBlocks.itemRegistry.get(id).apply(new Item.Settings()));
		}

		lootModification();

		for (GroupInfo info : CPlusItemGroups.ALL) {
			ItemGroup group = FabricItemGroup.builder()
					.icon(info.icon())
					.displayName(info.name())
					.build();
			Registry.register(Registries.ITEM_GROUP, info.key(), group);
		}

//		ServerWorldEvents.LOAD.register(((server, world) -> RegistryDump.run()));
	}

	public void accessRegistry(Identifier id, BlockData data) {
		AdditionalBlockSettings addBloSet = data.settings().additionalBlockSettings();
		Function<AbstractBlock.Settings, Block> blockFunc = CPlusBlocks.registry.get(id);
		Block block = Registry.register(Registries.BLOCK, id, blockFunc.apply(data.settings().settings()));
		if (!Objects.equals(id.getPath(), "warped_wart")) {
			Item item = new BlockItem(block, new Item.Settings());
			Registry.register(Registries.ITEM, id, item);
			ItemGroupEvents.modifyEntriesEvent(getItemGroup(addBloSet.itemGroup())).register(listener -> listener.add(item));
		}
		if (fabric.getIsClient() && data.settings().layer() != null) {
			blockToRenderLayers.put(block, data.settings().layer());
		}

		if (addBloSet.oxidizeToBlock() != null) {
			oxidizationMap.put(block, addBloSet.oxidizeToBlock());
		}

		if (addBloSet.waxToBlock() != null) {
			waxingMap.put(block, addBloSet.waxToBlock());
		}
	}

	public static RegistryKey<ItemGroup> getItemGroup(String string) {
		return string == null ? ItemGroups.INGREDIENTS : switch (string) {
			case "dyeables" -> CPlusItemGroups.DYEABLES.key();
			case "misc" -> CPlusItemGroups.MISC.key();
			default -> CPlusItemGroups.STONES.key();
		};
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

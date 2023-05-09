package io.github.consistencyplus.consistency_plus.fabric;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.util.AdditionalBlockSettings;
import io.github.consistencyplus.consistency_plus.util.BlockData;
import io.github.consistencyplus.consistency_plus.util.BlockShape;
import io.github.consistencyplus.consistency_plus.util.LoaderHelper;
import io.github.consistencyplus.consistency_plus.registry.PseudoRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricMaterialBuilder;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.Registry;

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

			Block block = Registry.register(Registry.BLOCK, id, data.block().initFunc().apply(blockSettings));
			Registry.register(Registry.ITEM, id, new BlockItem(block, new Item.Settings().group(getItemGroup(addBloSet.itemGroup()))));
			if (fabric.getIsClient() && data.settings().layer() != null) {
				blockToRenderLayers.put(block, data.settings().layer());
			}
		}

		for (Block block : oxidizationMap.keySet()) {
			OxidizableBlocksRegistry.registerOxidizableBlockPair(block, Registry.BLOCK.get(new Identifier(oxidizationMap.get(block))));
		}
		for (Block block : waxingMap.keySet()) {
			OxidizableBlocksRegistry.registerWaxableBlockPair(block, Registry.BLOCK.get(new Identifier(waxingMap.get(block))));
		}

		for (Identifier id : CPlusBlocks.itemRegistry.keySet()) {
			Registry.register(Registry.ITEM, id, CPlusBlocks.itemRegistry.get(id).apply(new Item.Settings()));
		}
	}

	public void accessRegistry(Identifier id, BlockData data) {
		AdditionalBlockSettings addBloSet = data.settings().additionalBlockSettings();
		Function<AbstractBlock.Settings, Block> blockFunc = CPlusBlocks.registry.get(id);
		Block block = Registry.register(Registry.BLOCK, id, blockFunc.apply(data.settings().settings()));
		if (!Objects.equals(id.getPath(), "warped_wart")) Registry.register(Registry.ITEM, id, new BlockItem(block, new Item.Settings().group(getItemGroup(addBloSet.itemGroup()))));

		if (addBloSet.oxidizeToBlock() != null) {
			oxidizationMap.put(block, addBloSet.oxidizeToBlock());
		}

		if (addBloSet.waxToBlock() != null) {
			waxingMap.put(block, addBloSet.waxToBlock());
		}
	}

	public static ItemGroup getItemGroup(String string) {
		try {
			return switch (string) {
				case "stones" -> CPLUS_STONES;
				case "dyeables" -> CPLUS_DYEABLE;
				case "misc" -> CPLUS_MISC;
				default -> CPLUS_STONES;
			};
		} catch (NullPointerException npe) {
			return ItemGroup.BUILDING_BLOCKS;
		}
	}

	public static final ItemGroup CPLUS_STONES = FabricItemGroupBuilder.create(new Identifier("consistency_plus", "stone")).icon(() -> Registry.ITEM.get(new Identifier("consistency_plus", "polished_stone")).getDefaultStack()).build();

	public static final	ItemGroup CPLUS_DYEABLE = FabricItemGroupBuilder.create(new Identifier("consistency_plus", "dyeable")).icon(() -> Registry.ITEM.get(new Identifier("consistency_plus", "polished_" + DyeColor.byId(Random.create().nextBetween(0, 15)).getName() + "_concrete")).getDefaultStack()).build();

	public static final	ItemGroup CPLUS_MISC = FabricItemGroupBuilder.create(new Identifier("consistency_plus", "misc")).icon(() -> Registry.ITEM.get(new Identifier("consistency_plus", "polished_purpur")).getDefaultStack()).build();

	public static void lootModification() {
		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if (source.isBuiltin() && WITHER_SKELE_LOOT.equals(id)) {
				LootPool.Builder poolBuilder = LootPool.builder()
						.with(ItemEntry.builder(Registry.ITEM.get(new Identifier("consistency_plus", "withered_bone"))));

				tableBuilder.pool(poolBuilder);
			}
		});
	}

}

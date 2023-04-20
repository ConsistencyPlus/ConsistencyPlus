package io.github.consistencyplus.consistency_plus.fabric;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.util.AdditionalBlockSettings;
import io.github.consistencyplus.consistency_plus.util.BlockData;
import io.github.consistencyplus.consistency_plus.util.LoaderHelper;
import io.github.consistencyplus.consistency_plus.registry.PseudoRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ConsistencyPlus implements ModInitializer {
	//private static final Identifier WITHER_SKELE_LOOT = EntityType.WITHER_SKELETON.getLootTableId();
	LoaderHelper fabric = new LoaderVariant();

	Map<Block, String> oxidizationMap = new HashMap<>();
	Map<Block, String> waxingMap = new HashMap<>();

	@Override
	public void onInitialize() {
		ConsistencyPlusMain.init(fabric);
		Map<Identifier, BlockData> blockDataMap = PseudoRegistry.export();
		for (Identifier id : blockDataMap.keySet()) {
			BlockData data = blockDataMap.get(id);
			AdditionalBlockSettings addBloSet = data.settings().additionalBlockSettings();
			Block block = Registry.register(Registry.BLOCK, id, data.block().initFunc().apply(data.settings().settings()));
			Registry.register(Registry.ITEM, id, new BlockItem(block, new Item.Settings().group(getItemGroup(addBloSet.itemGroup()))));
			if (addBloSet.oxidizeToBlock() != null) {
				oxidizationMap.put(block, addBloSet.oxidizeToBlock());
			}
			if (addBloSet.waxToBlock() != null) {
				waxingMap.put(block, addBloSet.waxToBlock());
			}
		}
		for (Block block : oxidizationMap.keySet()) {
			OxidizableBlocksRegistry.registerOxidizableBlockPair(block, Registry.BLOCK.get(new Identifier(oxidizationMap.get(block))));
		}
		for (Block block : waxingMap.keySet()) {
			OxidizableBlocksRegistry.registerWaxableBlockPair(block, Registry.BLOCK.get(new Identifier(waxingMap.get(block))));
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

}

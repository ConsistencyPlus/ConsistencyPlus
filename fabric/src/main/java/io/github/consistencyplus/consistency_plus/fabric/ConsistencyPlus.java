package io.github.consistencyplus.consistency_plus.fabric;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.util.AdditionalBlockSettings;
import io.github.consistencyplus.consistency_plus.util.BlockData;
import io.github.consistencyplus.consistency_plus.util.LoaderHelper;
import io.github.consistencyplus.consistency_plus.registry.PseudoRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Map;
import java.util.function.Function;

public class ConsistencyPlus implements ModInitializer {
	//private static final Identifier WITHER_SKELE_LOOT = EntityType.WITHER_SKELETON.getLootTableId();
	LoaderHelper fabric = new LoaderVariant();

	@Override
	public void onInitialize() {
		ConsistencyPlusMain.init(fabric);
		Map<Identifier, BlockData> blockDataMap = PseudoRegistry.export();
		for (Identifier id : blockDataMap.keySet()) {
			BlockData data = blockDataMap.get(id);
			AdditionalBlockSettings addBloSet = data.settings().additionalBlockSettings();
			Block block = Registry.register(Registry.BLOCK, id, data.block().initFunc().apply(data.settings().settings()));
			Registry.register(Registry.ITEM, id, new BlockItem(block, new Item.Settings().group(getItemGroup(addBloSet.itemGroup()))));
		}
	}

	public static ItemGroup getItemGroup(String string) {
		try {
			return switch (string) {
				case "stones" -> CPLUS_STONES;
				case "dyables" -> CPLUS_DYABLES;
				case "misc" -> CPLUS_MISC;
				default -> CPLUS_STONES;
			};
		} catch (NullPointerException npe) {
			return ItemGroup.BUILDING_BLOCKS;
		}
	}

	public static final ItemGroup CPLUS_STONES = FabricItemGroupBuilder.create(new Identifier("consistency_plus", "consistency_plus_stones")).icon(() -> Registry.ITEM.get(new Identifier("consistency_plus", "soul_sandstone")).getDefaultStack()).build();

	public static final	ItemGroup CPLUS_DYABLES = FabricItemGroupBuilder.create(new Identifier("consistency_plus", "consistency_plus_dyables")).icon(() -> Registry.ITEM.get(new Identifier("consistency_plus", "soul_sandstone")).getDefaultStack()).build();

	public static final	ItemGroup CPLUS_MISC = FabricItemGroupBuilder.create(new Identifier("consistency_plus", "consistency_plus_misc")).icon(() -> Registry.ITEM.get(new Identifier("consistency_plus", "soul_sandstone")).getDefaultStack()).build();

}

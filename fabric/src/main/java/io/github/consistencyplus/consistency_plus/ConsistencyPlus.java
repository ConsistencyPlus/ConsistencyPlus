package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.registry.ConsistencyPlusBlocksLoader;
import io.github.consistencyplus.consistency_plus.util.LoaderHelper;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Map;

public class ConsistencyPlus implements ModInitializer {
	//private static final Identifier WITHER_SKELE_LOOT = EntityType.WITHER_SKELETON.getLootTableId();
	LoaderHelper fabric = new LoaderVariant();
	@Override
	public void onInitialize() {
		ConsistencyPlusMain.init(fabric);
		Map<String, ConsistencyPlusBlocksLoader.BlockData> blockDataMap = ConsistencyPlusBlocksLoader.exportBlockData();
		for (String string : blockDataMap.keySet()) {
			Block block = blockDataMap.get(string).block();
			Registry.register(Registry.BLOCK, new Identifier("consistency_plus", string), block);
			Registry.register(Registry.ITEM, new Identifier("consistency_plus", string), new BlockItem(block, new Item.Settings()));
		}
	}
}

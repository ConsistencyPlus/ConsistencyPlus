package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.util.BlockData;
import io.github.consistencyplus.consistency_plus.util.LoaderHelper;
import io.github.consistencyplus.consistency_plus.registry.PseudoRegistry;
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
		Map<Identifier, BlockData> blockDataMap = PseudoRegistry.export();
		for (Identifier id : blockDataMap.keySet()) {
			BlockData data = blockDataMap.get(id);
			Block block = Registry.register(Registry.BLOCK, id, data.block().initFunc().apply(data.blockSettings()));
			Registry.register(Registry.ITEM, id, new BlockItem(block, new Item.Settings()));
		}
	}
}

package io.github.consistencyplus.consistency_plus.fabric;

import com.google.common.collect.ImmutableMap;
import io.github.consistencyplus.consistency_plus.ConsistencyPlusClientMain;
import io.github.consistencyplus.consistency_plus.registry.ConsistencyPlusBlocksLoader;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.render.RenderLayer;

import java.util.Map;

public class ConsistencyPlusClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		Map<String, RenderLayer> renderLayers = ImmutableMap.<String, RenderLayer>builder()
				.put("cutout", RenderLayer.getCutout())
				.put("translucent", RenderLayer.getTranslucent())
				.build();

		for (Block block : ConsistencyPlus.blockToRenderLayers.keySet()) {
			BlockRenderLayerMap.INSTANCE.putBlock(block, renderLayers.get(ConsistencyPlus.blockToRenderLayers.get(block)));
		}
	}
}

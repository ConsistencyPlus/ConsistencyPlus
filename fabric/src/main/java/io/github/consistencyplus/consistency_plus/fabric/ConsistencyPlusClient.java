package io.github.consistencyplus.consistency_plus.fabric;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusClientMain;
import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.text.Text;

public class ConsistencyPlusClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ConsistencyPlusClientMain.init(() -> {
			ConsistencyPlus.blockToRenderLayers.forEach((block, layerName) -> {
				RenderLayer layer = ConsistencyPlusClientMain.SUPPORTED_LAYERS.get(layerName);
				if (layer != null) {
					BlockRenderLayerMap.INSTANCE.putBlock(block, layer);
				} else {
					ConsistencyPlusMain.LOGGER.error("Unknown/unsupported RenderLayer '{}', skipping", layerName);
				}
			});
		});

		ResourceManagerHelper.registerBuiltinResourcePack(
				ConsistencyPlusClientMain.VANILLA_CHANGES_PACK,
				FabricLoader.getInstance().getModContainer(ConsistencyPlusMain.MOD_ID).orElseThrow(),
				Text.literal(ConsistencyPlusClientMain.VANILLA_CHANGES_PACK_NAME),
				ResourcePackActivationType.DEFAULT_ENABLED
		);
	}
}

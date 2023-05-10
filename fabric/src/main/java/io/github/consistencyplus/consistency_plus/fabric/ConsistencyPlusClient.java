package io.github.consistencyplus.consistency_plus.fabric;

import com.google.common.collect.ImmutableMap;
import io.github.consistencyplus.consistency_plus.ConsistencyPlusClientMain;
import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;

import net.minecraft.block.Block;
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

		ResourceManagerHelper.registerBuiltinResourcePack(
				ConsistencyPlusClientMain.VANILLA_CHANGES_PACK,
				FabricLoader.getInstance().getModContainer(ConsistencyPlusMain.MOD_ID).orElseThrow(),
				ConsistencyPlusClientMain.VANILLA_CHANGES_PACK_NAME,
				ResourcePackActivationType.DEFAULT_ENABLED
		);
	}
}

package io.github.consistencyplus.consistency_plus.fabric;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusClientMain;
import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlockFamilies;
import io.github.consistencyplus.consistency_plus.registry.families.CPlusRenderType;
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
		ConsistencyPlusClientMain.init();

		ResourceManagerHelper.registerBuiltinResourcePack(
				ConsistencyPlusClientMain.VANILLA_CHANGES_PACK,
				FabricLoader.getInstance().getModContainer(ConsistencyPlusMain.MOD_ID).orElseThrow(),
				ConsistencyPlusClientMain.VANILLA_CHANGES_PACK_NAME,
				ResourcePackActivationType.DEFAULT_ENABLED
		);
	}
}

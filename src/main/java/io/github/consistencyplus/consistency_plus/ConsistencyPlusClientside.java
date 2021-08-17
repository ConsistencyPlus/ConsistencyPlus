package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.render.RenderLayer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsistencyPlusClientside implements ClientModInitializer {
	private static final Logger LOGGER = LogManager.getLogger();
	
	@Override
	public void onInitializeClient() {
		LOGGER.info("Consistency+ Main - Starting client initialization");
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.WARPED_WART, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.GRASS_SLAB, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.GRASS_STAIRS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(CPlusBlocks.GRASS_WALL, RenderLayer.getCutout());
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> GrassColors.getColor(0.5D, 1.0D),
				CPlusItems.GRASS_SLAB, CPlusItems.GRASS_STAIRS, CPlusItems.GRASS_WALL);
		LOGGER.info("Consistency+ Main - Finished client initialization");
	}
}

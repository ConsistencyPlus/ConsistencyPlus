package net.consistencyteam.consistency_plus;

import net.consistencyteam.consistency_plus.registry.Blocks;
import net.consistencyteam.consistency_plus.registry.Items;
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
        BlockRenderLayerMap.INSTANCE.putBlock(Blocks.WARPED_WART, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Blocks.GRASS_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Blocks.GRASS_STAIRS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Blocks.GRASS_WALL, RenderLayer.getCutout());
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> {
            return GrassColors.getColor(0.5D, 1.0D);
        }, Items.GRASS_SLAB, Items.GRASS_STAIRS, Items.GRASS_WALL);
        LOGGER.info("Consistency+ Main - Finished client initialization");
    }
}

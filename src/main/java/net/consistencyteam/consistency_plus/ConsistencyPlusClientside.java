package net.consistencyteam.consistency_plus;

import net.consistencyteam.consistency_plus.registry.Blocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ConsistencyPlusClientside implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("Consistency+ Main - Client Side Initalization Started.");
        BlockRenderLayerMap.INSTANCE.putBlock(Blocks.WARPED_WART, RenderLayer.getCutout());
        System.out.println("Consistency+ Main - Client Side Initalization Finished. Its just one line you know.");
    }
}

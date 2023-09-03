package io.github.consistencyplus.consistency_plus.util.fabric;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.loader.api.FabricLoader;

import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

public class LoaderUtilsImpl {
	public static boolean isDevEnv() {
		return FabricLoader.getInstance().isDevelopmentEnvironment();
	}

	public static Settings copySettings(Settings settings) {
		return FabricBlockSettings.copyOf(settings);
	}

	public static void registerOxidation(Block from, Block to) {
		OxidizableBlocksRegistry.registerOxidizableBlockPair(from, to);
	}

	public static void registerWaxing(Block from, Block to) {
		OxidizableBlocksRegistry.registerWaxableBlockPair(from, to);
	}

	@Environment(EnvType.CLIENT)
	public static void registerBlockRenderLayer(Block block, RenderLayer layer) {
		BlockRenderLayerMap.INSTANCE.putBlock(block, layer);
	}
}

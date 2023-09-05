package io.github.consistencyplus.consistency_plus.util.fabric;

import java.nio.file.Path;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.loader.api.FabricLoader;

import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class LoaderUtilsImpl {
	public static Path getGameDir() {
		return FabricLoader.getInstance().getGameDir();
	}

	public static boolean isDevEnv() {
		return FabricLoader.getInstance().isDevelopmentEnvironment();
	}

	public static Settings copySettings(Settings settings) {
		return FabricBlockSettings.copyOf(settings);
	}

	public static void registerBlock(Identifier id, Block block) {
		Registry.register(Registries.BLOCK, id, block);
	}

	public static void registerItem(Identifier id, Item item) {
		Registry.register(Registries.ITEM, id, item);
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

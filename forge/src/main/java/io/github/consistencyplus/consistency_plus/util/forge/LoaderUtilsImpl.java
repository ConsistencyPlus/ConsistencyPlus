package io.github.consistencyplus.consistency_plus.util.forge;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.loading.FMLEnvironment;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;
import net.minecraft.item.Item;

public class LoaderUtilsImpl {
	public static boolean isDevEnv() {
		return !FMLEnvironment.production;
	}

	public static Settings copySettings(Settings settings) {
		// gross
		AbstractBlock settingsHolder = new AbstractBlock(settings) {
			@Override
			public Item asItem() {
				throw new UnsupportedOperationException();
			}

			@Override
			protected Block asBlock() {
				throw new UnsupportedOperationException();
			}
		};

		return Settings.copy(settingsHolder);
	}

	public static void registerOxidation(Block from, Block to) {
		OxidizationRegistry.register(from, to);
	}

	public static void registerWaxing(Block from, Block to) {
		WaxingRegistry.register(from, to);
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerBlockRenderLayer(Block block, RenderLayer layer) {
		//noinspection deprecation
		RenderLayers.setRenderLayer(block, layer);
	}
}

package io.github.consistencyplus.consistency_plus.base;

import me.shedaniel.architectury.registry.ColorHandlers;
import me.shedaniel.architectury.registry.RenderTypes;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertHandler;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.item.ModelPredicateProvider;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.util.TriConsumer;

@Environment(EnvType.CLIENT)
public class ConsistencyPlusClientMain {
	public static void init() {
		ConsistencyPlusMain.LOGGER.info("Consistency+ Main - Starting client initialization");

		RenderTypes.register(RenderLayer.getCutout(), CPlusBlocks.WARPED_WART);
		RenderTypes.register(RenderLayer.getCutout(), CPlusBlocks.GRASS_SLAB);
		RenderTypes.register(RenderLayer.getCutout(), CPlusBlocks.GRASS_STAIRS);
		RenderTypes.register(RenderLayer.getCutout(), CPlusBlocks.GRASS_WALL);


		ColorHandlers.registerBlockColors((state, world, pos, tintIndex) ->
						world != null && pos != null
								? BiomeColors.getGrassColor(world, pos)
								: GrassColors.getColor(0.5D, 1.0D),
				CPlusBlocks.GRASS_SLAB, CPlusBlocks.GRASS_STAIRS, CPlusBlocks.GRASS_WALL);

		ColorHandlers.registerItemColors((stack, tintIndex) -> GrassColors.getColor(0.5D, 1.0D),
				CPlusItems.GRASS_SLAB, CPlusItems.GRASS_STAIRS, CPlusItems.GRASS_WALL);

		NubertHandler.init();

		ConsistencyPlusMain.LOGGER.info("Consistency+ Main - Finished client initialization");
	}
}

package io.github.consistencyplus.consistency_plus.base;

import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import io.github.consistencyplus.consistency_plus.blocks.BlockColors;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.BlockVariations;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertHandler;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusEnhancedRegistry;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.item.UnclampedModelPredicateProvider;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BundleItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.util.TriConsumer;

@Environment(EnvType.CLIENT)
public class ConsistencyPlusClientMain {
	public static void init(TriConsumer<Item, Identifier, UnclampedModelPredicateProvider> modelPredicateProviderFactory) {
		ConsistencyPlusMain.LOGGER.info("Consistency+ Main - Starting client initialization");
		
		RenderTypeRegistry.register(RenderLayer.getCutout(), CPlusBlocks.WARPED_WART);
		RenderTypeRegistry.register(RenderLayer.getCutout(), CPlusBlocks.GRASS_SLAB);
		RenderTypeRegistry.register(RenderLayer.getCutout(), CPlusBlocks.GRASS_STAIRS);
		RenderTypeRegistry.register(RenderLayer.getCutout(), CPlusBlocks.GRASS_WALL);

		for (BlockColors color : BlockColors.values()) {
			RenderTypeRegistry.register(RenderLayer.getTranslucent(), CPlusEnhancedRegistry.getDyedBlock("tinted_glass", BlockVariations.BLOCK, BlockTypes.BASE, color));
		}
		
		modelPredicateProviderFactory.accept(CPlusItems.RED_BUNDLE, new Identifier("filled"),
				(itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		modelPredicateProviderFactory.accept(CPlusItems.ORANGE_BUNDLE, new Identifier("filled"),
				(itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		modelPredicateProviderFactory.accept(CPlusItems.YELLOW_BUNDLE, new Identifier("filled"),
				(itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		modelPredicateProviderFactory.accept(CPlusItems.LIME_BUNDLE, new Identifier("filled"),
				(itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		modelPredicateProviderFactory.accept(CPlusItems.GREEN_BUNDLE, new Identifier("filled"),
				(itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		modelPredicateProviderFactory.accept(CPlusItems.LIGHT_BLUE_BUNDLE, new Identifier("filled"),
				(itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		modelPredicateProviderFactory.accept(CPlusItems.BLUE_BUNDLE, new Identifier("filled"),
				(itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		modelPredicateProviderFactory.accept(CPlusItems.CYAN_BUNDLE, new Identifier("filled"),
				(itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		modelPredicateProviderFactory.accept(CPlusItems.PURPLE_BUNDLE, new Identifier("filled"),
				(itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		modelPredicateProviderFactory.accept(CPlusItems.MAGENTA_BUNDLE, new Identifier("filled"),
				(itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		modelPredicateProviderFactory.accept(CPlusItems.PINK_BUNDLE, new Identifier("filled"),
				(itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		modelPredicateProviderFactory.accept(CPlusItems.WHITE_BUNDLE, new Identifier("filled"),
				(itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		modelPredicateProviderFactory.accept(CPlusItems.LIGHT_GRAY_BUNDLE, new Identifier("filled"),
				(itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		modelPredicateProviderFactory.accept(CPlusItems.GRAY_BUNDLE, new Identifier("filled"),
				(itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		modelPredicateProviderFactory.accept(CPlusItems.BROWN_BUNDLE, new Identifier("filled"),
				(itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		modelPredicateProviderFactory.accept(CPlusItems.BLACK_BUNDLE, new Identifier("filled"),
				(itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		
		ColorHandlerRegistry.registerBlockColors((state, world, pos, tintIndex) ->
						world != null && pos != null
								? BiomeColors.getGrassColor(world, pos)
								: GrassColors.getColor(0.5D, 1.0D),
				CPlusBlocks.GRASS_SLAB, CPlusBlocks.GRASS_STAIRS, CPlusBlocks.GRASS_WALL);
		
		ColorHandlerRegistry.registerItemColors((stack, tintIndex) -> GrassColors.getColor(0.5D, 1.0D),
				CPlusItems.GRASS_SLAB, CPlusItems.GRASS_STAIRS, CPlusItems.GRASS_WALL);
		
		NubertHandler.init();
		
		ConsistencyPlusMain.LOGGER.info("Consistency+ Main - Finished client initialization");
	}
}

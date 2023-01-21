package io.github.consistencyplus.consistency_plus.base;

import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertTooltips;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertMinecartEntity;
import io.github.consistencyplus.consistency_plus.core.entries.block.IceRegistryEntryGroup;
import io.github.consistencyplus.consistency_plus.mixin.EntityRenderersAccessor;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusEntities;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.item.UnclampedModelPredicateProvider;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.MinecartEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BundleItem;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.util.TriConsumer;

@Environment(EnvType.CLIENT)
public class ConsistencyPlusClientMain {
	public static final EntityModelLayer NUBERT_CART = new EntityModelLayer(ConsistencyPlusMain.id("nubert_minecart"), "main");
	public static final Identifier VANILLA_CHANGES_PACK = ConsistencyPlusMain.id("vanilla_changes");
	public static final String VANILLA_CHANGES_PACK_NAME = "Consistency+ Vanilla Changes";

	public static void init(TriConsumer<Item, Identifier, UnclampedModelPredicateProvider> modelPredicateProviderFactory) {
		ConsistencyPlusMain.LOGGER.info("Consistency+ Main - Starting client initialization");
		
		RenderTypeRegistry.register(RenderLayer.getCutout(), CPlusBlocks.WARPED_WART.get());
		RenderTypeRegistry.register(RenderLayer.getCutout(), CPlusBlocks.GRASS_SLAB.get());
		RenderTypeRegistry.register(RenderLayer.getCutout(), CPlusBlocks.GRASS_STAIRS.get());
		RenderTypeRegistry.register(RenderLayer.getCutout(), CPlusBlocks.GRASS_WALL.get());

		for (DyeColor color : DyeColor.values()) {
			RenderTypeRegistry.register(RenderLayer.getTranslucent(), Registry.BLOCK.get(ConsistencyPlusMain.id(color + "_" + "tinted_glass")));
		}

		for (RegistrySupplier<Block> block : IceRegistryEntryGroup.iceBlocks) {
			RenderTypeRegistry.register(RenderLayer.getTranslucent(), block.get());
		}

		for (DyeColor color : DyeColor.values()) {
			modelPredicateProviderFactory.accept(Registry.ITEM.get(ConsistencyPlusMain.id(color + "_" + "dyed_bundle")), new Identifier("filled"),
					(itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		}
		
		ColorHandlerRegistry.registerBlockColors((state, world, pos, tintIndex) ->
						world != null && pos != null
								? BiomeColors.getGrassColor(world, pos)
								: GrassColors.getColor(0.5D, 1.0D),
				CPlusBlocks.GRASS_SLAB.get(), CPlusBlocks.GRASS_STAIRS.get(), CPlusBlocks.GRASS_WALL.get());
		
		ColorHandlerRegistry.registerItemColors((stack, tintIndex) -> GrassColors.getColor(0.5D, 1.0D),
				CPlusItems.GRASS_SLAB.get(), CPlusItems.GRASS_STAIRS.get(), CPlusItems.GRASS_WALL.get());

		NubertTooltips.init();

		EntityType<NubertMinecartEntity> type = CPlusEntities.NUBERT_CART.get();
		EntityRenderersAccessor.cPlus$register(type, ctx -> new MinecartEntityRenderer<>(ctx, NUBERT_CART));
		
		ConsistencyPlusMain.LOGGER.info("Consistency+ Main - Finished client initialization");
	}
}

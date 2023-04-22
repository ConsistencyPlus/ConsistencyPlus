package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.ConsistencyPlusBlocksLoader;
import io.github.consistencyplus.consistency_plus.util.LoaderHelper;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.item.UnclampedModelPredicateProvider;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BundleItem;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.util.TriConsumer;

public class ConsistencyPlusClientMain {
    public static void init(TriConsumer<Item, Identifier, UnclampedModelPredicateProvider> modelPredicateProviderFactory) {
        ConsistencyPlusMain.LOGGER.info("Consistency+ Main - Starting client initialization");

        ConsistencyPlusMain.LOGGER.info("Consistency+ Main - Finished client initialization");
    }

}

package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.registry.ConsistencyPlusBlocksLoader;
import io.github.consistencyplus.consistency_plus.util.LoaderHelper;
import net.minecraft.client.item.UnclampedModelPredicateProvider;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.util.TriConsumer;

public class ConsistencyPlusClientMain {
    public static void init(TriConsumer<Item, Identifier, UnclampedModelPredicateProvider> modelPredicateProviderFactory) {

    }

}

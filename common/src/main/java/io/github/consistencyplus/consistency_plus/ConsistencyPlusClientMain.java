package io.github.consistencyplus.consistency_plus;

import net.minecraft.client.item.UnclampedModelPredicateProvider;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.util.TriConsumer;

public class ConsistencyPlusClientMain {
    // pack registered in client main of each loader
    public static final Identifier VANILLA_CHANGES_PACK = new Identifier(ConsistencyPlusMain.MOD_ID, "vanilla_changes");
    public static final String VANILLA_CHANGES_PACK_NAME = "Consistency+ Vanilla Changes";


    public static void init(TriConsumer<Item, Identifier, UnclampedModelPredicateProvider> modelPredicateProviderFactory) {
        ConsistencyPlusMain.LOGGER.info("Consistency+ Main - Starting client initialization");

        ConsistencyPlusMain.LOGGER.info("Consistency+ Main - Finished client initialization");
    }

}

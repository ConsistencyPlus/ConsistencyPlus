package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlockFamilies;

import net.minecraft.util.Identifier;

public class ConsistencyPlusClientMain {
    // pack registered in client main of each loader
    public static final Identifier VANILLA_CHANGES_PACK = new Identifier(ConsistencyPlusMain.MOD_ID, "vanilla_changes");
    public static final String VANILLA_CHANGES_PACK_NAME = "Consistency+ Vanilla Changes";

    public static void init() {
        ConsistencyPlusMain.LOGGER.info("Consistency+ Main - Starting client initialization");
        CPlusBlockFamilies.registerRenderLayers();
        ConsistencyPlusMain.LOGGER.info("Consistency+ Main - Finished client initialization");
    }

}

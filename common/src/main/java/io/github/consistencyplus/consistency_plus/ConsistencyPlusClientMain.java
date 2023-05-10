package io.github.consistencyplus.consistency_plus;

import java.util.Map;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class ConsistencyPlusClientMain {
    // pack registered in client main of each loader
    public static final Identifier VANILLA_CHANGES_PACK = new Identifier(ConsistencyPlusMain.MOD_ID, "vanilla_changes");
    public static final String VANILLA_CHANGES_PACK_NAME = "Consistency+ Vanilla Changes";
    public static final  Map<String, RenderLayer> SUPPORTED_LAYERS = Map.of(
            "cutout", RenderLayer.getCutout(),
            "translucent", RenderLayer.getTranslucent()
    );

    // TODO: make this do more stuff
    public static void init(Runnable loaderInit) {
        ConsistencyPlusMain.LOGGER.info("Consistency+ Main - Starting client initialization");
        loaderInit.run();
        ConsistencyPlusMain.LOGGER.info("Consistency+ Main - Finished client initialization");
    }

}

package io.github.consistencyplus.consistency_plus.registry;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.util.BlockData;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

// This class' purpose is to facilitate a way to store FalseBlock entries in a system that is similar to the Vanilla's Registries until they can reach a point where they can be registered safely on loader.
public class PseudoRegistry {
    private static final Map<Identifier, BlockData> registry = new HashMap<>();
    private static boolean initialized = false;

    public static void register(Identifier id, BlockData blockData) {
        registry.put(id, blockData);
    }

    public static Map<Identifier, BlockData> export() {
        if (initialized) {
            ConsistencyPlusMain.LOGGER.error("REGISTRY HAS BEEN INITIALIZED ATLEAST TWICE, PLEASE DO NOT DO THIS EVER EVER [[EVER]] unless you are Siuol and messing around");
            return registry;
        }

        initialized = true;
        return registry;
    }
}

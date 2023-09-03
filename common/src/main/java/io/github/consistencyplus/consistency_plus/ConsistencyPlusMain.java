package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlockFamilies;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;

import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import io.github.consistencyplus.consistency_plus.util.RegistryDiff;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsistencyPlusMain {
    public static Logger LOGGER = LogManager.getLogger("ConsistencyPlus");
    public static final String MOD_ID = "consistency_plus";

    public static void init() {
        CPlusBlockFamilies.init();
        CPlusBlocks.init();
        CPlusItems.init();
        RegistryDiff.run(Registries.BLOCK, "blocks");
        System.exit(0);
//        RegistryDiff.run(Registries.ITEM, "items");
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}

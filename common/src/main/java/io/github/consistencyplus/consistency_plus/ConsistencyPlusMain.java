package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlockFamilies;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsistencyPlusMain {
    public static Logger LOGGER = LogManager.getLogger("ConsistencyPlus");
    public static final String MOD_ID = "consistency_plus";

    public static void init() {
        CPlusBlockFamilies.init();
        CPlusBlocks.init();
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}

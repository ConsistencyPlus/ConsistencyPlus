package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.registry.ConsistencyPlusBlocksLoader;
import io.github.consistencyplus.consistency_plus.util.LoaderHelper;
import io.github.consistencyplus.consistency_plus.registry.PseudoRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsistencyPlusMain {
    public static Logger LOGGER = LogManager.getLogger("ConsistencyPlus");
    public static LoaderHelper LOADER_HELPER;

    public static final String MOD_ID = "consistency_plus";

    public static void init(LoaderHelper loaderInfo) {
        LOADER_HELPER = loaderInfo;
        ConsistencyPlusBlocksLoader.init();
    }
}

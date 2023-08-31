package io.github.consistencyplus.consistency_plus.util;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.block.AbstractBlock;

public class LoaderUtils {
    @ExpectPlatform
    public static AbstractBlock.Settings copySettings(AbstractBlock.Settings settings) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static boolean registrationReady() {
        throw new AssertionError();
    }
}

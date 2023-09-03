package io.github.consistencyplus.consistency_plus.util;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

public class LoaderUtils {
    @ExpectPlatform
    public static boolean isDevEnv() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static AbstractBlock.Settings copySettings(AbstractBlock.Settings settings) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void registerOxidation(Block from, Block to) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void registerWaxing(Block from, Block to) {
        throw new AssertionError();
    }

    @Environment(EnvType.CLIENT)
    @ExpectPlatform
    public static void registerBlockRenderLayer(Block block, RenderLayer layer) {
        throw new AssertionError();
    }
}

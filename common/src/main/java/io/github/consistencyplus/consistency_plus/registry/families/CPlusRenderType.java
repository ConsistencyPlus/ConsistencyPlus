package io.github.consistencyplus.consistency_plus.registry.families;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.client.render.RenderLayer;

public enum CPlusRenderType {
    SOLID, CUTOUT, TRANSLUCENT;

    @Environment(EnvType.CLIENT)
    public RenderLayer vanilla() {
        return switch (this) {
            case SOLID -> RenderLayer.getSolid();
            case CUTOUT -> RenderLayer.getCutout();
            case TRANSLUCENT -> RenderLayer.getTranslucent();
        };
    }
}

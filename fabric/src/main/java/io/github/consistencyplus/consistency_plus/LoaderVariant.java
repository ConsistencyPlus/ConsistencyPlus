package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.util.LoaderHelper;
import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class LoaderVariant implements LoaderHelper {

    @Override
    public boolean getIsInDevMode() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public boolean getIsClient() {
        return FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT;
    }

    @Override
    public String getLoader() {
        return "fabric";
    }

    @Override
    public Path getPath(String string) {
        return FabricLoader.getInstance().getModContainer("consistency_plus").get().findPath(string).get();
    }
}

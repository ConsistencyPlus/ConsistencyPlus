package io.github.consistencyplus.consistency_plus.forge;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;

import java.nio.file.Path;

public class LoaderVariant implements LoaderHelper {
    //Logger logger = LogManager.getLogger("Consistency Plus");

    @Override
    public boolean getIsInDevMode() {
        return !FMLLoader.isProduction();
    }

    @Override
    public boolean getIsClient() {
        return FMLLoader.getDist().isClient();
    }

    @Override
    public String getLoader() {
        return "forge";
    }

    @Override
    public Path getPath(String string) {
        Path path = ModList.get().getModFileById("consistency_plus").getFile().findResource(string);
        //logger.warn(path);
        return path;
    }
}

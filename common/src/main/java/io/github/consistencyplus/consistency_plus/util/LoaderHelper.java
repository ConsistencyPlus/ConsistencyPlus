package io.github.consistencyplus.consistency_plus.util;

import java.nio.file.Path;

public interface LoaderHelper {
    default boolean getIsInDevMode() {
        return false;
    }

    default boolean getIsClient() {
        return false;
    }

    default String getLoader() {
        return null;
    }

    default Path getPath(String string) {
        return null;
    }
    //
}

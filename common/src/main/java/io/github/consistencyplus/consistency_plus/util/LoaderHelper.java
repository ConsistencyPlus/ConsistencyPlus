package io.github.consistencyplus.consistency_plus.util;

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

    //getFile
    //
}

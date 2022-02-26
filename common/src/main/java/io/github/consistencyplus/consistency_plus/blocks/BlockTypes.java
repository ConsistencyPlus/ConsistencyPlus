package io.github.consistencyplus.consistency_plus.blocks;

import io.github.consistencyplus.consistency_plus.registry.CPlusEnhancedRegistry;

import java.util.Locale;

public enum BlockTypes {
    BASE, POLISHED, BRICK, CUT, TILE, COBBLED, SMOOTH;

    @Override
    public String toString() {
        if (this == BASE) return "";
        return name().toLowerCase(Locale.ROOT);
    }

    public boolean isASuffix() {
        return suffixCheck(this);
    }

    public boolean suffixCheck(BlockTypes type) {
        return type == BRICK || type == TILE;
    }

    public String addType(String id) {
        return switch (this) {
            case COBBLED, POLISHED, CUT, SMOOTH -> this + "_" + id;
            case BRICK, TILE -> id + "_" + this;
            default -> id;
        };
    }
}

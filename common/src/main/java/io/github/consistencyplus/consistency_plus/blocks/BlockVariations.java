package io.github.consistencyplus.consistency_plus.blocks;

import java.util.Locale;

public enum BlockVariations {
    BLOCK, SLAB, STAIRS, WALL, GATE, PILLAR, CORNER_PILLAR, CARVED, CHISELED;

    public boolean withTypes() {
        return this != CARVED && this != CHISELED && this != PILLAR && this != CORNER_PILLAR;
    }

    @Override
    public String toString() {
        if (this == BLOCK) return "";
        return name().toLowerCase(Locale.ROOT);
    }

    public String addVariations(String id, BlockTypes type) {
        if (this.withTypes()) {
            return switch (this) {
                case SLAB, STAIRS, WALL, GATE -> id + "_" + this;
                default -> (type.isASuffix()) ? id + "s" : id;
            };
        } else {
            return switch (this) {
                case PILLAR, CORNER_PILLAR -> id + "_" + this;
                default -> this + "_" + id;
            };
        }
    }
}

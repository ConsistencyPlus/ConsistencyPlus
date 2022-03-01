package io.github.consistencyplus.consistency_plus.blocks;

import net.minecraft.util.DyeColor;

import java.util.Locale;

public enum BlockVariations {
    BLOCK(true), SLAB(true), STAIRS(true), WALL(true), GATE(true), PILLAR(false), CORNER_PILLAR(false), CARVED(false), CHISELED(false);

    public boolean withTypes;

    BlockVariations(boolean hasTypes) {
        this.withTypes = hasTypes;
    }

    @Override
    public String toString() {
        if (this == BLOCK) return "";
        return name().toLowerCase(Locale.ROOT);
    }


    public String addVariations(String id, BlockTypes type) {
        if (this.withTypes) {
            return switch (this) {
                case SLAB, STAIRS, WALL, GATE -> id + "_" + this;
                default -> (type.suffixCheck(type)) ? id + "s" : id;
            };
        }
        else {
            return switch (this) {
                case PILLAR, CORNER_PILLAR -> id + "_" + this;
                default -> this + "_" + id;
            };
        }
    }
}

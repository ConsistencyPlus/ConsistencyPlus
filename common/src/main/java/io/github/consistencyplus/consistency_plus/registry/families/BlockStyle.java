package io.github.consistencyplus.consistency_plus.registry.families;

import java.util.Locale;

import static io.github.consistencyplus.consistency_plus.registry.families.BlockStyle.Attribute.*;

public enum BlockStyle {
    PLAIN(EMPTY),
    POLISHED,
    SMOOTH,
    BRICK(SUFFIX, BASE_PLURAL),
    CUT,
    TILE(SUFFIX, BASE_PLURAL),
    COBBLED,
    CHISELED,
    CARVED;

    public final boolean empty;
    public final boolean hasShapes;
    public final boolean suffix;
    public final boolean basePlural;

    BlockStyle(Attribute... attributes) {
        this.empty = arrayContains(attributes, EMPTY);
        this.hasShapes = !arrayContains(attributes, NO_SHAPES);
        this.suffix = arrayContains(attributes, SUFFIX);
        this.basePlural = arrayContains(attributes, BASE_PLURAL);
    }

    public String makeBlockName(String familyName, BlockShape shape) {
        if (empty) {
            return shape == BlockShape.CUBE ? familyName : familyName + "_" + shape;
        }
        boolean pluralize = basePlural && shape == BlockShape.CUBE;
        String name = pluralize ? this + "s" : toString();
        String prefix = this.suffix ? "" : name + "_";
        String suffix = this.suffix ? "_" + name : "";
        String shapeSuffix = shape == BlockShape.CUBE ? "" : "_" + shape;
        return prefix + familyName + suffix + shapeSuffix;
    }

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }

    protected enum Attribute {
        /**
         * Does not modify the name (Stone, not Plain Stone)
         */
        EMPTY,

        /**
         * No stairs, slabs, walls, etc
         */
        NO_SHAPES,

        /**
         * Name is a suffix (Calcite Bricks) instead of a prefix (Cut Calcite)
         */
        SUFFIX,

        /**
         * Base block is pluralized (Calcite Bricks, not Calcite Brick)
         */
        BASE_PLURAL
    }

    private static <T> boolean arrayContains(T[] array, T value) {
        for (T t : array) {
            if (t == value) {
                return true;
            }
        }
        return false;
    }
}

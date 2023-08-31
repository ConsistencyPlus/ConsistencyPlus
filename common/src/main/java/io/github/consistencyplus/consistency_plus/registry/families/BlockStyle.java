package io.github.consistencyplus.consistency_plus.registry.families;

import java.util.Locale;

import static io.github.consistencyplus.consistency_plus.registry.families.BlockStyle.Attribute.BASE_PLURAL;
import static io.github.consistencyplus.consistency_plus.registry.families.BlockStyle.Attribute.SUFFIX;

public enum BlockStyle {
    PLAIN,
    POLISHED,
    SMOOTH,
    BRICKS(SUFFIX, BASE_PLURAL),
    CUT,
    TILES(SUFFIX, BASE_PLURAL),
    COBBLED,
    CHISELED,
    CARVED,
    PILLAR(SUFFIX),
    CORNER_PILLAR(SUFFIX);

    public final boolean hasShapes;
    public final boolean suffix;
    public final boolean basePlural;

    BlockStyle(Attribute... attributes) {
        this.hasShapes = !arrayContains(attributes, Attribute.NO_SHAPES);
        this.suffix = arrayContains(attributes, SUFFIX);
        this.basePlural = arrayContains(attributes, BASE_PLURAL);
    }

    public String makeBlockName(String familyName, BlockShape shape) {
        boolean pluralize = basePlural && shape == BlockShape.CUBE;
        String name = pluralize ? this + "s" : toString();
        String prefix = this.suffix ? "" : name + "_";
        String suffix = this.suffix ? "_" + name : "";
        return prefix + familyName + suffix;
    }

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }

    protected enum Attribute {
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

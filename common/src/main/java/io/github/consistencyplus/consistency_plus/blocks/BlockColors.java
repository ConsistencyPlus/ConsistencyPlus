package io.github.consistencyplus.consistency_plus.blocks;

import net.minecraft.block.MapColor;

import java.util.Locale;

public enum BlockColors {
    RED, ORANGE, YELLOW, LIME, GREEN, BLUE, CYAN, LIGHT_BLUE, PURPLE, MAGENTA, PINK, WHITE, LIGHT_GRAY, GRAY, BLACK, BROWN;

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }

    public static MapColor toMapColor(BlockColors blockColors, boolean terracotta) {
        return switch (blockColors) {
            case RED -> (terracotta) ? MapColor.TERRACOTTA_RED : MapColor.RED;
            case ORANGE -> (terracotta) ? MapColor.TERRACOTTA_ORANGE : MapColor.ORANGE;
            case YELLOW -> (terracotta) ? MapColor.TERRACOTTA_YELLOW : MapColor.YELLOW;
            case LIME -> (terracotta) ? MapColor.TERRACOTTA_LIME : MapColor.LIME;
            case GREEN -> (terracotta) ? MapColor.TERRACOTTA_GREEN : MapColor.GREEN;
            case BLUE -> (terracotta) ? MapColor.TERRACOTTA_BLUE : MapColor.BLUE;
            case CYAN -> (terracotta) ? MapColor.TERRACOTTA_CYAN : MapColor.CYAN;
            case LIGHT_BLUE -> (terracotta) ? MapColor.TERRACOTTA_LIGHT_BLUE : MapColor.LIGHT_BLUE;
            case PURPLE -> (terracotta) ? MapColor.TERRACOTTA_PURPLE : MapColor.PURPLE;
            case MAGENTA -> (terracotta) ? MapColor.TERRACOTTA_MAGENTA : MapColor.MAGENTA;
            case PINK -> (terracotta) ? MapColor.TERRACOTTA_PINK : MapColor.PINK;
            case WHITE -> (terracotta) ? MapColor.TERRACOTTA_WHITE : MapColor.WHITE;
            case LIGHT_GRAY -> (terracotta) ? MapColor.TERRACOTTA_LIGHT_GRAY : MapColor.LIGHT_GRAY;
            case GRAY -> (terracotta) ? MapColor.TERRACOTTA_GRAY : MapColor.GRAY;
            case BLACK -> (terracotta) ? MapColor.TERRACOTTA_BLACK : MapColor.BLACK;
            case BROWN -> (terracotta) ? MapColor.TERRACOTTA_BROWN : MapColor.BROWN;
        };
    }
}

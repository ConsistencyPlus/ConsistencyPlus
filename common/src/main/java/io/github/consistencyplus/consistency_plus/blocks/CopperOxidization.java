package io.github.consistencyplus.consistency_plus.blocks;

import io.github.consistencyplus.consistency_plus.registry.CPlusCopperBlocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Oxidizable;

import java.util.Locale;

public enum CopperOxidization {
    BASE, EXPOSED, WEATHERED, OXIDIZED;

    public Oxidizable.OxidationLevel toVanilla() {
        return switch (this) {
            case BASE -> Oxidizable.OxidationLevel.UNAFFECTED;
            case EXPOSED -> Oxidizable.OxidationLevel.EXPOSED;
            case WEATHERED -> Oxidizable.OxidationLevel.WEATHERED;
            case OXIDIZED -> Oxidizable.OxidationLevel.OXIDIZED;
        };
    }

    public static CopperOxidization fromVanilla(Oxidizable.OxidationLevel level) {
        return switch (level) {
            case UNAFFECTED -> CopperOxidization.BASE;
            case EXPOSED -> CopperOxidization.EXPOSED;
            case OXIDIZED -> CopperOxidization.OXIDIZED;
            case WEATHERED -> CopperOxidization.WEATHERED;
        };
    }

    public MapColor getColor() {
        return switch (this) {
            case BASE -> MapColor.ORANGE;
            case EXPOSED -> MapColor.TERRACOTTA_LIGHT_GRAY;
            case OXIDIZED -> MapColor.TEAL;
            case WEATHERED -> MapColor.DARK_AQUA;
        };
    }

    public String addOxidization(String id) {
        return toString() + id;
    }

    @Override
    public String toString() {
        return this == BASE ? "" : name().toLowerCase(Locale.ROOT) + '_';
    }
}

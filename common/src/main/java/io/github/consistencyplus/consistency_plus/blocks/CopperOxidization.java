package io.github.consistencyplus.consistency_plus.blocks;

import net.minecraft.block.MapColor;
import net.minecraft.block.Oxidizable;
import net.minecraft.util.Pair;

import java.util.Locale;
import java.util.Objects;

public enum CopperOxidization {
    BASE, EXPOSED, WEATHERED, OXIDIZED;

    public Oxidizable.OxidizationLevel toVanilla() {
        return switch (this) {
            case BASE -> Oxidizable.OxidizationLevel.UNAFFECTED;
            case EXPOSED -> Oxidizable.OxidizationLevel.EXPOSED;
            case WEATHERED -> Oxidizable.OxidizationLevel.WEATHERED;
            case OXIDIZED -> Oxidizable.OxidizationLevel.OXIDIZED;
        };
    }

    public static CopperOxidization fromVanilla(Oxidizable.OxidizationLevel level) {
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
        return toString() + '_' + id;
    }

    @Override
    public String toString() {
        return this == BASE ? "" : name().toLowerCase(Locale.ROOT);
    }

    public boolean isBase(){
        return this == BASE;
    }

    public static Pair<CopperOxidization, String> getOxidizationFromString(String path){
        String[] pathParts = path.split("_");

        StringBuilder builder = new StringBuilder();
        CopperOxidization oxidization = BASE;

        for(int i = 0; i < pathParts.length; i++){
            String part = pathParts[i];

            if(oxidization == BASE) {
                for (CopperOxidization possibleOxidization : CopperOxidization.values()) {
                    if (Objects.equals(part, possibleOxidization.toString())) {
                        oxidization = possibleOxidization;
                        break;
                    }
                }
            }

            if(!Objects.equals(part, oxidization.toString())){
                builder.append(part);

                if(i != pathParts.length - 1) {
                    builder.append("_");
                }
            }
        }

        return new Pair<>(oxidization, builder.toString());
    }

    public static Pair<Boolean, String> isWaxed(String path){
        String[] pathParts = path.split("_");

        StringBuilder builder = new StringBuilder();
        boolean isWaxed = false;

        for(int i = 0; i < pathParts.length; i++){
            String part = pathParts[i];

            if(!isWaxed) {
                if (Objects.equals(part, "waxed")) {
                    isWaxed = true;
                }
            }

            if(!Objects.equals(part, "waxed")){
                builder.append(part);

                if(i != pathParts.length - 1) {
                    builder.append("_");
                }
            }
        }

        return new Pair<>(isWaxed, builder.toString());
    }
}

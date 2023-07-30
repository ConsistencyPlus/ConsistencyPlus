package io.github.consistencyplus.consistency_plus.util;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;

public class StringConverter {
    public static MapColor stringToMapColor(String string) {
        return switch (string) {
            case "clear" -> MapColor.CLEAR;
            case "pale_green" -> MapColor.PALE_GREEN;
            case "pale_yellow" -> MapColor.PALE_YELLOW;
            case "white_gray" -> MapColor.WHITE_GRAY;
            case "bright_red" -> MapColor.BRIGHT_RED;
            case "pale_purple" -> MapColor.PALE_PURPLE;
            case "iron_gray" -> MapColor.IRON_GRAY;
            case "dark_green" -> MapColor.DARK_GREEN;
            case "white" -> MapColor.WHITE;
            case "light_blue_gray" -> MapColor.LIGHT_BLUE_GRAY;
            case "dirt_brown" -> MapColor.DIRT_BROWN;
            case "stone_gray" -> MapColor.STONE_GRAY;
            case "water_blue" -> MapColor.WATER_BLUE;
            case "oak_tan" -> MapColor.OAK_TAN;
            case "off_white" -> MapColor.OFF_WHITE;
            case "orange" -> MapColor.ORANGE;
            case "magenta" -> MapColor.MAGENTA;
            case "light_blue" -> MapColor.LIGHT_BLUE;
            case "yellow" -> MapColor.YELLOW;
            case "lime" -> MapColor.LIME;
            case "pink" -> MapColor.PINK;
            case "gray" -> MapColor.GRAY;
            case "light_gray" -> MapColor.LIGHT_GRAY;
            case "cyan" -> MapColor.CYAN;
            case "purple" -> MapColor.PURPLE;
            case "blue" -> MapColor.BLUE;
            case "brown" -> MapColor.BROWN;
            case "green" -> MapColor.GREEN;
            case "red" -> MapColor.RED;
            case "black" -> MapColor.BLACK;
            case "gold" -> MapColor.GOLD;
            case "diamond_blue" -> MapColor.DIAMOND_BLUE;
            case "lapis_blue" -> MapColor.LAPIS_BLUE;
            case "emerald_green" -> MapColor.EMERALD_GREEN;
            case "spruce_brown" -> MapColor.SPRUCE_BROWN;
            case "dark_red" -> MapColor.DARK_RED;
            case "terracotta_white" -> MapColor.TERRACOTTA_WHITE;
            case "terracotta_orange" -> MapColor.TERRACOTTA_ORANGE;
            case "terracotta_magenta" -> MapColor.TERRACOTTA_MAGENTA;
            case "terracotta_light_blue" -> MapColor.TERRACOTTA_LIGHT_BLUE;
            case "terracotta_yellow" -> MapColor.TERRACOTTA_YELLOW;
            case "terracotta_lime" -> MapColor.TERRACOTTA_LIME;
            case "terracotta_pink" -> MapColor.TERRACOTTA_PINK;
            case "terracotta_gray" -> MapColor.TERRACOTTA_GRAY;
            case "terracotta_light_gray" -> MapColor.TERRACOTTA_LIGHT_GRAY;
            case "terracotta_cyan" -> MapColor.TERRACOTTA_CYAN;
            case "terracotta_purple" -> MapColor.TERRACOTTA_PURPLE;
            case "terracotta_blue" -> MapColor.TERRACOTTA_BLUE;
            case "terracotta_brown" -> MapColor.TERRACOTTA_BROWN;
            case "terracotta_green" -> MapColor.TERRACOTTA_GREEN;
            case "terracotta_red" -> MapColor.TERRACOTTA_RED;
            case "terracotta_black" -> MapColor.TERRACOTTA_BLACK;
            case "dull_red" -> MapColor.DULL_RED;
            case "dull_pink" -> MapColor.DULL_PINK;
            case "dark_crimson" -> MapColor.DARK_CRIMSON;
            case "teal" -> MapColor.TEAL;
            case "dark_aqua" -> MapColor.DARK_AQUA;
            case "dark_dull_pink" -> MapColor.DARK_DULL_PINK;
            case "bright_teal" -> MapColor.BRIGHT_TEAL;
            case "deepslate_gray" -> MapColor.DEEPSLATE_GRAY;
            case "raw_iron_pink" -> MapColor.RAW_IRON_PINK;
            case "lichen_green" -> MapColor.LICHEN_GREEN;
            default -> MapColor.CLEAR;
        };
    }

    public static Instrument stringToInstrument(String string) {
        //todo: I dont fully know if we need to loop through all of these like this, but eh. We could also do a switch like above.
        for (Instrument instrument : Instrument.values()) {
            if (instrument.asString().equals(string)) return instrument;
        }
        ConsistencyPlusMain.LOGGER.info("Instrument " + string + " not found! Did you format its id correctly? Using Banjo as a fill in");
        return Instrument.BANJO;
    }

    public static PistonBehavior stringToPistonBehavior(String string) {
        return switch (string) {
            case "normal" -> PistonBehavior.NORMAL;
            case "destroy" -> PistonBehavior.DESTROY;
            case "block" -> PistonBehavior.BLOCK;
            case "push_only" -> PistonBehavior.PUSH_ONLY;
            case "ignore" -> PistonBehavior.IGNORE;
            default -> PistonBehavior.BLOCK;
        };
    }
}

package io.github.consistencyplus.consistency_plus.registry;

import io.github.consistencyplus.consistency_plus.ConsistencyPlus;
import io.github.consistencyplus.consistency_plus.core.StonecutterTagRecipeHandler;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class CPlusStonecutterTags {
	public static final Tag<Item> STONECUTTER_STONE = register("stonecutter_stone");
	public static final Tag<Item> STONECUTTER_BLACKSTONE = register("stonecutter_blackstone");
	public static final Tag<Item> STONECUTTER_SANDSTONE = register("stonecutter_sandstone");
	public static final Tag<Item> STONECUTTER_RED_SANDSTONE = register("stonecutter_red_sandstone");
	public static final Tag<Item> STONECUTTER_SOUL_SANDSTONE = register("stonecutter_soul_sandstone");
	public static final Tag<Item> STONECUTTER_QUARTZ = register("stonecutter_quartz");
	public static final Tag<Item> STONECUTTER_ANDESITE = register("stonecutter_andesite");
	public static final Tag<Item> STONECUTTER_CRACKED_ANDESITE = register("stonecutter_cracked_andesite");
	public static final Tag<Item> STONECUTTER_MOSSY_ANDESITE = register("stonecutter_mossy_andesite");
	public static final Tag<Item> STONECUTTER_DIORITE = register("stonecutter_diorite");
	public static final Tag<Item> STONECUTTER_GRANITE = register("stonecutter_granite");
	public static final Tag<Item> STONECUTTER_PRISMARINE = register("stonecutter_prismarine");
	public static final Tag<Item> STONECUTTER_DARK_PRISMARINE = register("stonecutter_dark_prismarine");
	public static final Tag<Item> STONECUTTER_PURPUR = register("stonecutter_purpur");
	public static final Tag<Item> STONECUTTER_END_STONE = register("stonecutter_end_stone");
	public static final Tag<Item> STONECUTTER_OBSIDIAN = register("stonecutter_obsidian");
	public static final Tag<Item> STONECUTTER_CRYING_OBSIDIAN = register("stonecutter_crying_obsidian");
	public static final Tag<Item> STONECUTTER_CALCITE = register("stonecutter_calcite");
	public static final Tag<Item> STONECUTTER_TUFF = register("stonecutter_tuff");
	public static final Tag<Item> STONECUTTER_DRIPSTONE = register("stonecutter_dripstone");
	public static final Tag<Item> STONECUTTER_DEEPSLATE = register("stonecutter_deepslate");

	public static final Tag<Item> STONECUTTER_TERRACOTTA = register("stonecutter_terracotta");
	public static final Tag<Item> STONECUTTER_RED_TERRACOTTA = register("stonecutter_red_terracotta");
	public static final Tag<Item> STONECUTTER_YELLOW_TERRACOTTA = register("stonecutter_yellow_terracotta");
	public static final Tag<Item> STONECUTTER_ORANGE_TERRACOTTA = register("stonecutter_orange_terracotta");
	public static final Tag<Item> STONECUTTER_LIME_TERRACOTTA = register("stonecutter_lime_terracotta");
	public static final Tag<Item> STONECUTTER_GREEN_TERRACOTTA = register("stonecutter_green_terracotta");
	public static final Tag<Item> STONECUTTER_BLUE_TERRACOTTA = register("stonecutter_blue_terracotta");
	public static final Tag<Item> STONECUTTER_LIGHT_BLUE_TERRACOTTA = register("stonecutter_light_blue_terracotta");
	public static final Tag<Item> STONECUTTER_CYAN_TERRACOTTA = register("stonecutter_cyan_terracotta");
	public static final Tag<Item> STONECUTTER_BROWN_TERRACOTTA = register("stonecutter_brown_terracotta");
	public static final Tag<Item> STONECUTTER_PINK_TERRACOTTA = register("stonecutter_pink_terracotta");
	public static final Tag<Item> STONECUTTER_PURPLE_TERRACOTTA = register("stonecutter_purple_terracotta");
	public static final Tag<Item> STONECUTTER_MAGENTA_TERRACOTTA = register("stonecutter_magenta_terracotta");
	public static final Tag<Item> STONECUTTER_WHITE_TERRACOTTA = register("stonecutter_white_terracotta");
	public static final Tag<Item> STONECUTTER_LIGHT_GRAY_TERRACOTTA = register("stonecutter_light_gray_terracotta");
	public static final Tag<Item> STONECUTTER_GRAY_TERRACOTTA = register("stonecutter_gray_terracotta");
	public static final Tag<Item> STONECUTTER_BLACK_TERRACOTTA = register("stonecutter_black_terracotta");

	public static final Tag<Item> STONECUTTER_RED_CONCRETE = register("stonecutter_red_concrete");
	public static final Tag<Item> STONECUTTER_YELLOW_CONCRETE = register("stonecutter_yellow_concrete");
	public static final Tag<Item> STONECUTTER_ORANGE_CONCRETE = register("stonecutter_orange_concrete");
	public static final Tag<Item> STONECUTTER_LIME_CONCRETE = register("stonecutter_lime_concrete");
	public static final Tag<Item> STONECUTTER_GREEN_CONCRETE = register("stonecutter_green_concrete");
	public static final Tag<Item> STONECUTTER_BLUE_CONCRETE = register("stonecutter_blue_concrete");
	public static final Tag<Item> STONECUTTER_LIGHT_BLUE_CONCRETE = register("stonecutter_light_blue_concrete");
	public static final Tag<Item> STONECUTTER_CYAN_CONCRETE = register("stonecutter_cyan_concrete");
	public static final Tag<Item> STONECUTTER_BROWN_CONCRETE = register("stonecutter_brown_concrete");
	public static final Tag<Item> STONECUTTER_PINK_CONCRETE = register("stonecutter_pink_concrete");
	public static final Tag<Item> STONECUTTER_PURPLE_CONCRETE = register("stonecutter_purple_concrete");
	public static final Tag<Item> STONECUTTER_MAGENTA_CONCRETE = register("stonecutter_magenta_concrete");
	public static final Tag<Item> STONECUTTER_WHITE_CONCRETE = register("stonecutter_white_concrete");
	public static final Tag<Item> STONECUTTER_LIGHT_GRAY_CONCRETE = register("stonecutter_light_gray_concrete");
	public static final Tag<Item> STONECUTTER_GRAY_CONCRETE = register("stonecutter_gray_concrete");
	public static final Tag<Item> STONECUTTER_BLACK_CONCRETE = register("stonecutter_black_concrete");

	public static final Tag<Item> STONECUTTER_DIRT = register("stonecutter_dirt");
	
	private static Tag<Item> register(String path) {
		Tag<Item> tag = TagRegistry.item(new Identifier(ConsistencyPlus.ID, path));
		StonecutterTagRecipeHandler.register(tag);
		return tag;
	}
	
	public static void init() {
	}
}

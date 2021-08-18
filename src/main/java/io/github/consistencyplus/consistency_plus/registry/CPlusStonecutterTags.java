package io.github.consistencyplus.consistency_plus.registry;

import io.github.consistencyplus.consistency_plus.ConsistencyPlus;
import io.github.consistencyplus.consistency_plus.core.StonecutterTagRecipeHandler;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class CPlusStonecutterTags {
	public static final Tag<Item> STONECUTTER_STONE = register("stonecutter_stone");
	public static final Tag<Item> STONECUTTER_DIRT = register("stonecutter_dirt");
	
	private static Tag<Item> register(String path) {
		Tag<Item> tag = TagRegistry.item(new Identifier(ConsistencyPlus.ID, path));
		StonecutterTagRecipeHandler.register(tag);
		return tag;
	}
	
	public static void init() {
	}
}

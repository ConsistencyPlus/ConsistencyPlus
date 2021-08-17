package io.github.consistencyplus.consistency_plus.core;

import io.github.consistencyplus.consistency_plus.ConsistencyPlus;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StonecutterHandler {
	public static final Set<Tag<Item>> ALL_STONECUTTER_TAGS = new HashSet<>();
	public static final Tag<Item> STONECUTTER_STONE = register("stonecutter_stone");
	private static final Map<Item, Tag<Item>> cache = new HashMap<>();
	
	private static Tag<Item> register(String path) {
		Tag<Item> tag = TagRegistry.item(new Identifier(ConsistencyPlus.ID, path));
		ALL_STONECUTTER_TAGS.add(tag);
		return tag;
	}
	
	public static Pair<Boolean, Tag<Item>> blockHasOptimizedStonecutterRecipe(ItemStack stack) {
		return blockHasOptimizedStonecutterRecipe(stack.getItem());
	}
	
	public static Pair<Boolean, Tag<Item>> blockHasOptimizedStonecutterRecipe(Item item) {
		Tag<Item> cached = cache.get(item);
		if (cached != null) return new Pair<>(true, cached);
		for (Tag<Item> tag : ALL_STONECUTTER_TAGS) {
			if (tag.contains(item)) {
				cache.putIfAbsent(item, tag);
				return new Pair<>(true, tag);
			}
		}
		return new Pair<>(false, null);
	}
	
	public static int getCountForItem(ItemStack stack) {
		return getCountForItem(stack.getItem());
	}
	
	public static int getCountForItem(Item item) {
		if (item instanceof BlockItem blockItem) {
			Block block = blockItem.getBlock();
			if (block instanceof SlabBlock || BlockTags.SLABS.contains(block)) {
				return 2;
			}
		}
		return 1;
	}
}

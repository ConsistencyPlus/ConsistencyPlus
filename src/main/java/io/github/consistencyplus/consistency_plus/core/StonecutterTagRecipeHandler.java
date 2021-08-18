package io.github.consistencyplus.consistency_plus.core;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.Tag;

import java.util.*;

public class StonecutterTagRecipeHandler {
	public static final Set<Tag<Item>> ALL_STONECUTTER_TAGS = new HashSet<>();
	private static final Map<Item, Tag<Item>> cache = new HashMap<>();
	
	/**
	 * Tags fed into this method will be used as recipes.
	 * @param tag The tag to register
	 * @return The registered tag
	 */
	public static Tag<Item> register(Tag<Item> tag) {
		ALL_STONECUTTER_TAGS.add(tag);
		return tag;
	}
	
	/**
	 * Gets all stonecutter recipe tags the given item is in.
	 * @param item The item to check
	 * @return All stonecutter recipe tags the item is in
	 */
	public static List<Tag<Item>> getRecipeTags(Item item) {
		List<Tag<Item>> tags = new ArrayList<>();
		for (Tag<Item> tag : ALL_STONECUTTER_TAGS) {
			if (tag.contains(item)) {
				tags.add(tag);
			}
		}
		return tags;
	}
	
	public static List<Tag<Item>> getRecipeTags(ItemStack stack) {
		return getRecipeTags(stack.getItem());
	}
	
	/**
	 * Get the required amount of items needed to craft this item.<br>
	 * Slabs return 2, while all other items return 1.
	 * @param item The item to check
	 * @return The amount needed
	 */
	public static int getItemCraftCount(Item item) {
		if (item instanceof BlockItem blockItem) {
			Block block = blockItem.getBlock();
			if (block instanceof SlabBlock || BlockTags.SLABS.contains(block)) {
				return 2;
			}
		}
		return 1;
	}
	
	public static int getItemCraftCount(ItemStack stack) {
		return getItemCraftCount(stack.getItem());
	}
}

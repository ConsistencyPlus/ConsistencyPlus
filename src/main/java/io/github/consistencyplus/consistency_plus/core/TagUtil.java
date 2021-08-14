package io.github.consistencyplus.consistency_plus.core;

import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.util.HashSet;
import java.util.Set;

public class TagUtil {
	public static final Set<Tag<Block>> ALL_STONECUTTER_TAGS = new HashSet<>();
	public static final Tag<Block> STONECUTTER_STONE = register("stonecutter_stone");
	
	public static Pair<Boolean, Tag<Block>> blockHasOptimizedStonecutterRecipe(ItemStack stack) {
		return blockHasOptimizedStonecutterRecipe(stack.getItem());
	}
	
	public static Pair<Boolean, Tag<Block>> blockHasOptimizedStonecutterRecipe(Item item) {
		if (item instanceof BlockItem blockItem) {
			return blockHasOptimizedStonecutterRecipe(blockItem.getBlock());
		}
		return new Pair<>(false, null);
	}
	
	public static Pair<Boolean, Tag<Block>> blockHasOptimizedStonecutterRecipe(Block block) {
		for (Tag<Block> tag : ALL_STONECUTTER_TAGS) {
			if (tag.contains(block)) {
				return new Pair<>(true, tag);
			}
		}
		return new Pair<>(false, null);
	}
	
	private static Tag<Block> register(String path) {
		Tag<Block> tag = TagRegistry.block(new Identifier("consistency_plus", path));
		ALL_STONECUTTER_TAGS.add(tag);
		return tag;
	}
}

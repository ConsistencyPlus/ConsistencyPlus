package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.CreativeTabRegistry;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.BlockVariations;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CPlusItemGroups {
	public static final ItemGroup CONSISTENCY_PLUS_STONES = CreativeTabRegistry.create(ConsistencyPlusMain.id("stone"), () -> new ItemStack(CPlusEnhancedRegistry.getItem("stone", BlockVariations.BLOCK, BlockTypes.POLISHED)));
	public static final ItemGroup CONSISTENCY_PLUS_DYEABLES = CreativeTabRegistry.create(ConsistencyPlusMain.id("dyeable"), () -> new ItemStack(CPlusEnhancedRegistry.getItem("terracotta", BlockVariations.STAIRS, BlockTypes.BASE)));
	public static final ItemGroup CONSISTENCY_PLUS_MISC = CreativeTabRegistry.create(ConsistencyPlusMain.id("misc"), () -> new ItemStack(CPlusEnhancedRegistry.getItem("purpur", BlockVariations.STAIRS, BlockTypes.BASE)));



	public static Item.Settings consistencyPlusStoneItemSettings() {
		return new Item.Settings().group(CONSISTENCY_PLUS_STONES);
	}
	
	public static Item.Settings consistencyPlusDyeableItemSettings() {
		return new Item.Settings().group(CONSISTENCY_PLUS_DYEABLES);
	}
	
	public static Item.Settings consistencyPlusMiscItemSettings() {
		return new Item.Settings().group(CONSISTENCY_PLUS_MISC);
	}

	public static Item.Settings consistencyPlusDeprecatedSettings() {
		if (ConsistencyPlusMain.DEVENV) {
			return new Item.Settings().group(CONSISTENCY_PLUS_MISC);
		} else {
			return new Item.Settings();
		}
	}
}

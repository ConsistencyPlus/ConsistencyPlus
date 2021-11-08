package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.CreativeTabRegistry;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CPlusItemGroups {
	public static final ItemGroup CONSISTENCY_PLUS_STONES = CreativeTabRegistry.create(ConsistencyPlusMain.id("stone"), () -> new ItemStack(CPlusItems.POLISHED_STONE.get()));
	public static final ItemGroup CONSISTENCY_PLUS_DYEABLES = CreativeTabRegistry.create(ConsistencyPlusMain.id("dyeable"), () -> new ItemStack(CPlusItems.TERRACOTTA_STAIRS.get()));
	public static final ItemGroup CONSISTENCY_PLUS_MISC = CreativeTabRegistry.create(ConsistencyPlusMain.id("misc"), () -> new ItemStack(CPlusItems.PURPUR_BLOCK.get()));


	public static Item.Settings stones() {
		return new Item.Settings().group(CONSISTENCY_PLUS_STONES);
	}
	
	public static Item.Settings dyeables() {
		return new Item.Settings().group(CONSISTENCY_PLUS_DYEABLES);
	}
	
	public static Item.Settings misc() {
		return new Item.Settings().group(CONSISTENCY_PLUS_MISC);
	}
}

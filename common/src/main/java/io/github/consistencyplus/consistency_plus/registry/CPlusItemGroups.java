package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.CreativeTabRegistry;
import io.github.consistencyplus.consistency_plus.utils.IdHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CPlusItemGroups {
	public static final ItemGroup CONSISTENCY_PLUS_STONES = CreativeTabRegistry.create(IdHandler.IdFormat("stones"), () -> new ItemStack(CPlusItems.POLISHED_STONE.get()));
	public static final ItemGroup CONSISTENCY_PLUS_DYEABLES = CreativeTabRegistry.create(IdHandler.IdFormat("dyeables"), () -> new ItemStack(CPlusItems.TERRACOTTA_STAIRS.get()));
	public static final ItemGroup CONSISTENCY_PLUS_MISC = CreativeTabRegistry.create(IdHandler.IdFormat("misc"), () -> new ItemStack(CPlusItems.PURPUR_BLOCK.get()));


	public static Item.Settings consistencyPlusStoneItemSettings() {
		return new Item.Settings().group(CONSISTENCY_PLUS_STONES);
	}
	
	public static Item.Settings consistencyPlusDyeableItemSettings() {
		return new Item.Settings().group(CONSISTENCY_PLUS_DYEABLES);
	}
	
	public static Item.Settings consistencyPlusMiscItemSettings() {
		return new Item.Settings().group(CONSISTENCY_PLUS_MISC);
	}
}

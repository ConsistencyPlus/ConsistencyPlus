package io.github.consistencyplus.consistency_plus.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class CPlusItemGroups {
	/*public static final ItemGroup CONSISTENCY_PLUS_STONE = new ItemGroup();
	public static final ItemGroup CONSISTENCY_PLUS_DYEABLE = FabricItemGroupBuilder.build(new Identifier("consistency_plus", "dyeable"), () -> new ItemStack(CPlusBlocks.TERRACOTTA_STAIRS));
	public static final ItemGroup CONSISTENCY_PLUS_MISC = FabricItemGroupBuilder.build(new Identifier("consistency_plus", "misc"), () -> new ItemStack(CPlusBlocks.PURPUR_BLOCK));
    */

	public static Item.Settings consistencyPlusStoneItemSettings() {
		return new Item.Settings().group(ItemGroup.BUILDING_BLOCKS);
	}
	
	public static Item.Settings consistencyPlusDyeableItemSettings() {
		return new Item.Settings().group(ItemGroup.BUILDING_BLOCKS);
	}
	
	public static Item.Settings consistencyPlusMiscItemSettings() {
		return new Item.Settings().group(ItemGroup.BUILDING_BLOCKS);
	}
}

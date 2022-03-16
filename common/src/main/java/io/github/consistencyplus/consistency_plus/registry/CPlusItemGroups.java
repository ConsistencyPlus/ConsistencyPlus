package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.CreativeTabRegistry;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.registry.Registry;

public class CPlusItemGroups {
	public static final ItemGroup CONSISTENCY_PLUS_STONES = CreativeTabRegistry.create(ConsistencyPlusMain.id("stone"), () -> Registry.ITEM.get(ConsistencyPlusMain.id("polished_stone")).getDefaultStack());
	public static final ItemGroup CONSISTENCY_PLUS_DYEABLES = CreativeTabRegistry.create(ConsistencyPlusMain.id("dyeable"), () -> Registry.ITEM.get(ConsistencyPlusMain.id("pink_terracotta_tiles")).getDefaultStack());
	public static final ItemGroup CONSISTENCY_PLUS_MISC = CreativeTabRegistry.create(ConsistencyPlusMain.id("misc"), () -> Registry.ITEM.get(ConsistencyPlusMain.id("smooth_prismarine")).getDefaultStack());


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

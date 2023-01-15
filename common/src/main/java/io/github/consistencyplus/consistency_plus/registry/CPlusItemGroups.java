package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.CreativeTabRegistry;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.core.TabSet;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.DyeColor;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class CPlusItemGroups {
	public static final TabSet CONSISTENCY_PLUS_STONES = new TabSet(new Identifier("consistency_plus", "stones"));
	public static final TabSet CONSISTENCY_PLUS_DYEABLES = new TabSet(new Identifier("consistency_plus", "dyeables"));
	public static final TabSet CONSISTENCY_PLUS_MISC = new TabSet(new Identifier("consistency_plus", "misc"));


	public static Item.Settings consistencyPlusStoneItemSettings() {
		return new Item.Settings();
	}
	
	public static Item.Settings consistencyPlusDyeableItemSettings() {
		return new Item.Settings();
	}
	
	public static Item.Settings consistencyPlusMiscItemSettings() {
		return new Item.Settings();
	}

	public static Item.Settings consistencyPlusDeprecatedSettings() {
		if (ConsistencyPlusMain.LOADER.devEnv()) {
			return new Item.Settings();
		} else {
			return new Item.Settings();
		}
	}

	public static void init() {}

	public static void postRegistry() {
		ConsistencyPlusMain.LOADER.createItemGroup(CONSISTENCY_PLUS_STONES);
		ConsistencyPlusMain.LOADER.createItemGroup(CONSISTENCY_PLUS_DYEABLES);
		ConsistencyPlusMain.LOADER.createItemGroup(CONSISTENCY_PLUS_MISC);
	}
}

package io.github.consistencyplus.consistency_plus.registry;

import java.util.HashMap;
import java.util.Map;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.items.NetheriteHorseArmorItem;

import io.github.consistencyplus.consistency_plus.util.LoaderUtils;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorItem.Type;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class CPlusItems {
	private static final Map<String, Item> items = new HashMap<>();

	public static final Item WARPED_WART = register("warped_wart",
			new AliasedBlockItem(CPlusBlocks.WARPED_WART, new Settings().arch$tab(ItemGroups.INGREDIENTS))
	);

	public static final Item COPPER_NUGGET = registerIngredient("copper_nugget");
	public static final Item NETHERITE_NUGGET = registerIngredient("netherite_nugget");

	public static final Item NETHERITE_HORSE_ARMOR = register("netherite_horse_armor",
			new NetheriteHorseArmorItem(15, "netherite", new Settings().maxCount(1).fireproof().arch$tab(ItemGroups.COMBAT))
	);

	public static final Item WITHERED_BONE = registerIngredient("withered_bone");
	public static final Item WITHERED_BONE_MEAL = registerIngredient("withered_bone_meal");

	// 🐢
	public static final Item TURTLE_CHESTPLATE = registerTurtleArmor("turtle_chestplate", Type.CHESTPLATE);
	public static final Item TURTLE_LEGGINGS = registerTurtleArmor("turtle_leggings", Type.LEGGINGS);
	public static final Item TURTLE_BOOTS = registerTurtleArmor("turtle_boots", Type.BOOTS);

	private static Item registerTurtleArmor(String name, ArmorItem.Type type) {
		return register(name, new ArmorItem(ArmorMaterials.TURTLE, type, new Settings().arch$tab(ItemGroups.COMBAT)));
	}

	private static Item registerIngredient(String name) {
		return register(name, new Item(new Settings().arch$tab(ItemGroups.INGREDIENTS)));
	}

	private static Item register(String name, Item item) {
		items.put(name, item);
		return item;
	}

	public static void init() {
		items.forEach((name, item) -> LoaderUtils.registerItem(ConsistencyPlusMain.id(name), item));
	}
}

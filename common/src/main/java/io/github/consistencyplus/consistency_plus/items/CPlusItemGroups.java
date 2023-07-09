package io.github.consistencyplus.consistency_plus.items;

import java.util.function.Supplier;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CPlusItemGroups {
	public static final GroupInfo STONES = register("stone", "polished_stone");
	public static final GroupInfo DYEABLES = register(	"dyeable", "polished_orange_concrete");
	public static final GroupInfo MISC = register("misc", "polished_purpur");

	public static final GroupInfo[] ALL = new GroupInfo[] { STONES, DYEABLES, MISC };

	private static GroupInfo register(String name, String itemPath) {
		MutableText text = Text.translatable("itemGroup.consistency_plus." + name);
		RegistryKey<ItemGroup> key = RegistryKey.of(RegistryKeys.field_44688, new Identifier(ConsistencyPlusMain.MOD_ID, name));
		Identifier itemId = new Identifier(ConsistencyPlusMain.MOD_ID, itemPath);
		Supplier<ItemStack> supplier = () -> new ItemStack(Registries.ITEM.get(itemId));
		return new GroupInfo(text, key, supplier);
	}

	public record GroupInfo(Text name, RegistryKey<ItemGroup> key, Supplier<ItemStack> icon) {
	}
}

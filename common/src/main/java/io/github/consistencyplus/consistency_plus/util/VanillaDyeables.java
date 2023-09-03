package io.github.consistencyplus.consistency_plus.util;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class VanillaDyeables {
	public static final Map<DyeColor, Block> CONCRETE = findByName("concrete");
	public static final Map<DyeColor, Block> GLAZED_TERRACOTTA = findByName("glazed_terracotta");
	public static final ColoredSet<Block> TERRACOTTA = Util.make(() -> {
		Map<DyeColor, Block> dyedTerracotta = findByName("terracotta");
		return ColoredSet.of(color -> color == null ? Blocks.TERRACOTTA : dyedTerracotta.get(color));
	});

	private static Map<DyeColor, Block> findByName(String name) {
		Map<DyeColor, Block> map = new HashMap<>();
		for (DyeColor color : DyeColor.values()) {
			String blockName = color.getName() + "_" + name;
			Identifier id = new Identifier("minecraft", blockName);
			Block block = Registries.BLOCK.get(id);
			if (block == Blocks.AIR) {
				throw new IllegalStateException("Block not found: " + id);
			}
			map.put(color, block);
		}
		return map;
	}
}

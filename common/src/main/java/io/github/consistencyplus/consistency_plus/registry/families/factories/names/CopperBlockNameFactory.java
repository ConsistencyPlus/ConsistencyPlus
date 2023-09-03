package io.github.consistencyplus.consistency_plus.registry.families.factories.names;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlockFamilies;
import io.github.consistencyplus.consistency_plus.registry.families.BlockShape;
import io.github.consistencyplus.consistency_plus.registry.families.BlockStyle;

import net.minecraft.block.Oxidizable.OxidationLevel;

public class CopperBlockNameFactory extends StandardBlockNameFactory {
	public final OxidationLevel level;
	public final boolean waxed;

	private final String prefix;

	public CopperBlockNameFactory(OxidationLevel level, boolean waxed) {
		this.level = level;
		this.waxed = waxed;
		String levelPrefix = CPlusBlockFamilies.getOxidationLevelName(level);
		String waxedPrefix = waxed ? "waxed_" : "";
		this.prefix = waxedPrefix + levelPrefix;
	}

	@Override
	public String makeName(String familyName, BlockStyle style, BlockShape shape) {
		String name = super.makeName("copper", style, shape);
		return this.prefix + name;
	}
}

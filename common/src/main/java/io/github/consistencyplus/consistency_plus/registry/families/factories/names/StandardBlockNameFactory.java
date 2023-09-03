package io.github.consistencyplus.consistency_plus.registry.families.factories.names;

import io.github.consistencyplus.consistency_plus.registry.families.BlockShape;
import io.github.consistencyplus.consistency_plus.registry.families.BlockStyle;

public class StandardBlockNameFactory implements BlockNameFactory {
	public static final BlockNameFactory INSTANCE = new StandardBlockNameFactory();

	@Override
	public String makeName(String familyName, BlockStyle style, BlockShape shape) {
		if (style.empty) {
			return shape == BlockShape.CUBE ? familyName : familyName + "_" + shape;
		}
		boolean pluralize = style.basePlural && shape == BlockShape.CUBE;
		String name = pluralize ? style + "s" : style.toString();
		String prefix = style.suffix ? "" : name + "_";
		String suffix = style.suffix ? "_" + name : "";
		String shapeSuffix = shape == BlockShape.CUBE ? "" : "_" + shape;
		return prefix + familyName + suffix + shapeSuffix;
	}
}

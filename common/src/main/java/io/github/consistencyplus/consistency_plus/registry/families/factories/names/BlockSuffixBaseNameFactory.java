package io.github.consistencyplus.consistency_plus.registry.families.factories.names;

import io.github.consistencyplus.consistency_plus.registry.families.BlockShape;
import io.github.consistencyplus.consistency_plus.registry.families.BlockStyle;

public class BlockSuffixBaseNameFactory extends StandardBlockNameFactory {
	public static final BlockNameFactory INSTANCE = new BlockSuffixBaseNameFactory();

	@Override
	public String makeName(String familyName, BlockStyle style, BlockShape shape) {
		String suffix = style == BlockStyle.PLAIN && shape == BlockShape.CUBE ? "_block" : "";
		return super.makeName(familyName, style, shape) + suffix;
	}
}

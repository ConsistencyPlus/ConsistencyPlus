package io.github.consistencyplus.consistency_plus.registry.families.factories.names;

import io.github.consistencyplus.consistency_plus.registry.families.BlockShape;
import io.github.consistencyplus.consistency_plus.registry.families.BlockStyle;

public class CobblestoneNameFactory extends StandardBlockNameFactory {
	public static final BlockNameFactory INSTANCE = new CobblestoneNameFactory();

	@Override
	public String makeName(String familyName, BlockStyle style, BlockShape shape) {
		if (style == BlockStyle.COBBLED) {
			return shape == BlockShape.CUBE ? "cobblestone" : "cobblestone_" + shape;
		}
		return super.makeName(familyName, style, shape);
	}
}

package io.github.consistencyplus.consistency_plus.registry.families.factories.names;

import io.github.consistencyplus.consistency_plus.registry.families.BlockShape;
import io.github.consistencyplus.consistency_plus.registry.families.BlockStyle;

public class BrickNameFactory extends StandardBlockNameFactory {
	public static final BrickNameFactory INSTANCE = new BrickNameFactory();

	@Override
	public String makeName(String familyName, BlockStyle style, BlockShape shape) {
		if (style == BlockStyle.BRICK) {
			return shape == BlockShape.CUBE ? "bricks" : "brick_" + shape;
		}
		return super.makeName(familyName, style, shape);
	}
}

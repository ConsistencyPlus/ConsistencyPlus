package io.github.consistencyplus.consistency_plus.registry.families.filters;

import io.github.consistencyplus.consistency_plus.registry.families.BlockShape;
import io.github.consistencyplus.consistency_plus.registry.families.BlockStyle;

public class CopperFilter extends NotRegisteredBlockFilter {
	public static final BlockFilter INSTANCE = new CopperFilter();

	@Override
	public boolean shouldCreate(BlockStyle style, BlockShape shape, String familyName, String name) {
		// we rename vanilla's cut copper to tiles
		// register our cut, do not register some of our tiles
		return switch (style) {
			case CUT -> true;
			case TILE -> shape != BlockShape.CUBE && shape != BlockShape.SLAB && shape != BlockShape.STAIRS; // vanilla only has these 3 shapes
			default -> super.shouldCreate(style, shape, familyName, name);
		};
	}
}

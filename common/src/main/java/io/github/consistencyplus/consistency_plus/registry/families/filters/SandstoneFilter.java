package io.github.consistencyplus.consistency_plus.registry.families.filters;

import static io.github.consistencyplus.consistency_plus.registry.families.BlockShape.CUBE;
import static io.github.consistencyplus.consistency_plus.registry.families.BlockStyle.CARVED;
import static io.github.consistencyplus.consistency_plus.registry.families.BlockStyle.CHISELED;

import io.github.consistencyplus.consistency_plus.registry.families.BlockShape;
import io.github.consistencyplus.consistency_plus.registry.families.BlockStyle;

public class SandstoneFilter extends NotRegisteredBlockFilter {
	public static final BlockFilter INSTANCE = new SandstoneFilter();

	@Override
	public boolean shouldCreate(BlockStyle style, BlockShape shape, String familyName, String name) {
		if (style == CHISELED && shape == CUBE) {
			return true;
		} else if (style == CARVED && shape == CUBE) {
			return false;
		}
		return !BlockFilter.isRegistered(name);
	}
}

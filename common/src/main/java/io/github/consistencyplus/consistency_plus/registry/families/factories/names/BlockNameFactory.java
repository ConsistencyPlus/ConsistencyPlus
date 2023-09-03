package io.github.consistencyplus.consistency_plus.registry.families.factories.names;

import io.github.consistencyplus.consistency_plus.registry.families.BlockShape;
import io.github.consistencyplus.consistency_plus.registry.families.BlockStyle;

public interface BlockNameFactory {
	String makeName(String familyName, BlockStyle style, BlockShape shape);
}

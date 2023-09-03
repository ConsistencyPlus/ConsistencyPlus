package io.github.consistencyplus.consistency_plus.registry.families;

public interface BlockNameFactory {
	String makeName(String familyName, BlockStyle style, BlockShape shape);
}

package io.github.consistencyplus.consistency_plus.registry.families;

public interface BlockFilter {
    boolean shouldCreate(BlockStyle style, BlockShape shape, String familyName, String name);
}

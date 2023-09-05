package io.github.consistencyplus.consistency_plus.blocks;

/**
 * Marker interface for blocks which drop themselves when no loot table is present.
 * This is used by majority of C+'s blocks to minimize file size.
 */
public interface SelfDroppingBlock {
}

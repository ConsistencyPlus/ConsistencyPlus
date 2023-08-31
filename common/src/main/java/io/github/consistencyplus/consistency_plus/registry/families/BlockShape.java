package io.github.consistencyplus.consistency_plus.registry.families;

import net.minecraft.block.*;

import java.util.Arrays;
import java.util.function.Function;

public enum BlockShape {
    CUBE(Block::new),
    SLAB(SlabBlock::new),
    STAIR((s, b) -> new StairsBlock(b.getDefaultState(), s)),
    WALL(WallBlock::new),
    GATE((s, b) -> new FenceGateBlock(s, null)), // todo: wood??
    FENCE(FenceBlock::new),
    PILLAR(PillarBlock::new),
    /**
     * Like glazed terracotta
     */
    DIRECTIONAL(GlazedTerracottaBlock::new);

    public final BlockFactory defaultFactory;

    BlockShape(Function<AbstractBlock.Settings, Block> factory) {
        this((settings, base) -> factory.apply(settings));
    }

    BlockShape(BlockFactory factory) {
        this.defaultFactory = factory;
    }

    public static final BlockShape[] NON_CUBE = Arrays.stream(values())
            .filter(shape -> shape != CUBE).toArray(BlockShape[]::new);

}

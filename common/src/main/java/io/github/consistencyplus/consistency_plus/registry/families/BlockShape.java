package io.github.consistencyplus.consistency_plus.registry.families;

import net.minecraft.block.*;

import java.util.Arrays;
import java.util.Locale;
import java.util.function.Function;

import io.github.consistencyplus.consistency_plus.registry.families.factories.blocks.BlockFactory;

public enum BlockShape {
    CUBE(Block::new),
    SLAB(SlabBlock::new),
    STAIRS((style, settings, base) -> new StairsBlock(base.getDefaultState(), settings)),
    WALL(WallBlock::new),
    GATE((settings) -> new FenceGateBlock(settings, WoodType.OAK)), // todo: wood??
    FENCE(FenceBlock::new),
    PILLAR(PillarBlock::new),
    CORNER_PILLAR(Block::new);

    public final BlockFactory defaultFactory;

    BlockShape(Function<AbstractBlock.Settings, Block> factory) {
        this((style, settings, base) -> factory.apply(settings));
    }

    BlockShape(BlockFactory factory) {
        this.defaultFactory = factory;
    }

    public static final BlockShape[] NON_CUBE = Arrays.stream(values())
            .filter(shape -> shape != CUBE).toArray(BlockShape[]::new);

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}

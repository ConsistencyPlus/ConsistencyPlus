package io.github.consistencyplus.consistency_plus.registry.families;

import io.github.consistencyplus.consistency_plus.blocks.base.*;
import net.minecraft.block.*;

import java.util.Arrays;
import java.util.Locale;
import java.util.function.Function;

import io.github.consistencyplus.consistency_plus.registry.families.factories.blocks.BlockFactory;

public enum BlockShape {
    CUBE(CPlusBlock::new),
    SLAB(CPlusSlabBlock::new),
    STAIRS((style, settings, base) -> new CPlusStairsBlock(base.getDefaultState(), settings)),
    WALL(CPlusWallBlock::new),
    GATE((settings) -> new CPlusFenceGateBlock(settings, WoodType.OAK)), // todo: wood??
    FENCE(CPlusFenceBlock::new),
    PILLAR(CPlusPillarBlock::new),
    CORNER_PILLAR(CPlusBlock::new);

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

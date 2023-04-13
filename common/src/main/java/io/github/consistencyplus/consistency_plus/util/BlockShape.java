package io.github.consistencyplus.consistency_plus.util;

import io.github.consistencyplus.consistency_plus.blocks.CPlusStairsBlock;
import net.minecraft.block.*;

import java.util.function.Function;

public enum BlockShape {
        BLOCK("block", Block::new),
        SLAB("slab", SlabBlock::new),
        STAIRS("stairs", CPlusStairsBlock::new),
        WALL("wall", WallBlock::new),
        GATE("gate", FenceGateBlock::new),
        FENCE("fence", FenceBlock::new), // In case it is added, it is here.
        PILLAR("pillar", PillarBlock::new),
        DIRECTIONAL("directional", GlazedTerracottaBlock::new),
        PROVIDED("provided", settings -> null);

        private final String jsonString;
        private final Function<AbstractBlock.Settings, Block> initFunc;

        BlockShape(String jsonString, Function<AbstractBlock.Settings, Block> initializationFunction) {
            this.jsonString = jsonString;
            this.initFunc = initializationFunction;
        }

        public static BlockShape fromString(String string) {
            return switch (string) {
                case "block" -> BLOCK;
                case "slab" -> SLAB;
                case "stairs" -> STAIRS;
                case "wall" -> WALL;
                case "gate" -> GATE;
                case "fence" -> FENCE;
                case "pillar" -> PILLAR;
                case "directional" -> DIRECTIONAL;
                case "provided" -> PROVIDED;
                default -> throw new IllegalStateException("Unexpected value: " + string);
            };
        }
        
        public Function<AbstractBlock.Settings, Block> initFunc() {
            return initFunc;
        }
    }
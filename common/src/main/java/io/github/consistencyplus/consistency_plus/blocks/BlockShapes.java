package io.github.consistencyplus.consistency_plus.blocks;

import io.github.consistencyplus.consistency_plus.core.extensions.CPlusFenceGateBlock;
import net.minecraft.block.*;
import net.minecraft.util.Pair;

import java.util.Locale;
import java.util.Objects;

public enum BlockShapes {
    BLOCK(true) {
        @Override
        public Block initializeBlock(AbstractBlock.Settings settings) {
            return new Block(settings);
        }
    }, SLAB(true) {
        @Override
        public Block initializeBlock(AbstractBlock.Settings settings) {
            return new SlabBlock(settings);
        }
    }, STAIRS(true) {
        @Override
        public Block initializeBlock(AbstractBlock.Settings settings) {
            return new StairsBlock(Blocks.STONE.getDefaultState(), settings);
        }
    }, WALL(true) {
        @Override
        public Block initializeBlock(AbstractBlock.Settings settings) {
            return new WallBlock(settings);
        }
    }, GATE(true) {
        @Override
        public Block initializeBlock(AbstractBlock.Settings settings) {
            return new CPlusFenceGateBlock(settings);
        }
    }, PILLAR(false) {
        @Override
        public Block initializeBlock(AbstractBlock.Settings settings) {
            return new PillarBlock(settings);
        }
    }, CORNER_PILLAR(false) {
        @Override
        public Block initializeBlock(AbstractBlock.Settings settings) {
            return new Block(settings);
        }
    }, CARVED(false) {
        @Override
        public Block initializeBlock(AbstractBlock.Settings settings) {
            return new Block(settings);
        }
    }, CHISELED(false) {
        @Override
        public Block initializeBlock(AbstractBlock.Settings settings) {
            return new Block(settings);
        }
    };

    public final boolean withTypes;

    BlockShapes(boolean hasTypes) {
        this.withTypes = hasTypes;
    }

    @Override
    public String toString() {
        if (isBase()) return "";
        return name().toLowerCase(Locale.ROOT);
    }

    public abstract Block initializeBlock(AbstractBlock.Settings settings);


    public String addShapes(String id, BlockTypes type) {
        if (this.withTypes) {
            return switch (this) {
                case SLAB, STAIRS, WALL, GATE -> id + "_" + this;
                default -> (type.suffixCheck(type)) ? id + "s" : id;
            };
        }
        else {
            return switch (this) {
                case PILLAR, CORNER_PILLAR -> id + "_" + this;
                default -> this + "_" + id;
            };
        }
    }

    //TODO: Simplified Method? \/

//    public String addShapes(String id, BlockTypes type) {
//        return switch (this) {
//            case SLAB, STAIRS, WALL, GATE, PILLAR, CORNER_PILLAR -> id + "_" + this;
//            case CARVED, CHISELED -> this + "_" + id;
//            default -> (type.suffixCheck(type)) ? id + "s" : id;
//        };
//    }

    public boolean isBase(){
        return this == BLOCK;
    }

    public static Pair<BlockShapes, String> getBlockShapeFromString(String path){
        String[] pathParts = path.split("_");

        StringBuilder builder = new StringBuilder();
        BlockShapes shape = BLOCK;

        for(int i = 0; i < pathParts.length; i++){
            String part = pathParts[i];

            if(shape == BLOCK) {
                for (BlockShapes possibleShape : BlockShapes.values()) {
                    if(Objects.equals(part, "corner")){
                        shape = CORNER_PILLAR;
                        break;
                    }

                    if (Objects.equals(part, possibleShape.toString())) {
                        shape = possibleShape;
                        break;
                    }
                }
            }

            if(!Objects.equals(part, shape.toString())){
                if(!Objects.equals(part,"corner") && !Objects.equals(part,"pillar")) {
                    builder.append(part);

                    if (i != pathParts.length - 1) {
                        builder.append("_");
                    }
                }
            }
        }

        return new Pair<>(shape, builder.toString());
    }
}

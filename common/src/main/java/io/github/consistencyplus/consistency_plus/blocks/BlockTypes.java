package io.github.consistencyplus.consistency_plus.blocks;

import net.minecraft.util.Pair;

import java.util.Locale;
import java.util.Objects;

public enum BlockTypes {
    BRICK, TILE,

    //Prefixes the material
    BASE, POLISHED, CUT, COBBLED, SMOOTH;

    @Override
    public String toString() {
        if (this == BASE) return "";
        return name().toLowerCase(Locale.ROOT);
    }

    public boolean suffixCheck(BlockTypes type) {
        return type == BRICK || type == TILE;
    }

    public String addType(String id) {
        return switch (this) {
            case COBBLED, POLISHED, CUT, SMOOTH -> this + "_" + id;
            case BRICK, TILE -> id + "_" + this;
            default -> id;
        };
    }

    public boolean isBase(){
        return this == BASE;
    }

    public static Pair<BlockTypes, String> getBlockTypeFromString(String path){
        String[] pathParts = path.split("_");

        StringBuilder builder = new StringBuilder();
        BlockTypes type = BASE;

        for(int i = 0; i < pathParts.length; i++){
            String part = pathParts[i];

            if(type == BASE) {
                for (BlockTypes possibleType : BlockTypes.values()) {
                    if (Objects.equals(part, possibleType.toString())) {
                        type = possibleType;
                        break;
                    }
                }
            }

            if(!Objects.equals(part, type.toString())){
                builder.append(part);

                if(i != pathParts.length - 1) {
                    builder.append("_");
                }
            }
        }

        return new Pair<>(type, builder.toString());
    }
}

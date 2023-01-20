package io.github.consistencyplus.consistency_plus.blocks;

import net.minecraft.util.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

// RENAME TO BlockOverlay (More descriptive)
public enum BlockOverlay {
    BASE, CRACKED, MOSSY;

    public static final List<BlockOverlay> ALL = Arrays.stream(BlockOverlay.values()).toList();

    public boolean canGenerate(BlockTypes type, BlockShapes shape) {
        if ((this.equals(CRACKED) && type.equals(BlockTypes.BASE)) && shape.withTypes) return false;
        return !((this.equals(CRACKED) || this.equals(MOSSY)) && type.equals(BlockTypes.COBBLED));
    }

    @Override
    public String toString() {
        if (this == BASE) return "";
        return name().toLowerCase(Locale.ROOT);
    }

    public String addModifier(String id) {
        if (this.equals(BASE)) return id;
        else return this.toString() + "_" + id;
    }

    public boolean isBase(){
        return this == BASE;
    }

    public static Pair<BlockOverlay, String> getBlockOverlayFromString(String path){
        String[] pathParts = path.split("_");

        StringBuilder builder = new StringBuilder();
        BlockOverlay set = BASE;

        for(int i = 0; i < pathParts.length; i++){
            String part = pathParts[i];

            if(set == BASE) {
                for (BlockOverlay possibleSet : BlockOverlay.values()) {
                    if (Objects.equals(part, possibleSet.toString())) {
                        set = possibleSet;
                        break;
                    }
                }
            }

            if(!Objects.equals(part, set.toString())){
                builder.append(part);

                if(i != pathParts.length - 1) {
                    builder.append("_");
                }
            }
        }

        return new Pair<>(set, builder.toString());
    }
}

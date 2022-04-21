package io.github.consistencyplus.consistency_plus.blocks;

import net.minecraft.util.Pair;

import java.util.Locale;
import java.util.Objects;

public enum SetModifiers {
    //Todo: Rename these
    BASE, CRACKED, MOSSY;

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

    public static Pair<SetModifiers, String> getSetModifierFromString(String path){
        String[] pathParts = path.split("_");

        StringBuilder builder = new StringBuilder();
        SetModifiers set = BASE;

        for(int i = 0; i < pathParts.length; i++){
            String part = pathParts[i];

            if(set == BASE) {
                for (SetModifiers possibleSet : SetModifiers.values()) {
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

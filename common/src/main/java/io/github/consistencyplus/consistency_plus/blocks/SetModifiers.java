package io.github.consistencyplus.consistency_plus.blocks;

import java.util.Locale;

public enum SetModifiers {
    //Todo: Rename these
    BASE, CRACKED, MOSSY;

    public boolean canGenerate(BlockTypes type) {
        if (this.equals(CRACKED) && type.equals(BlockTypes.BASE)) return false;
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
}

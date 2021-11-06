package io.github.consistencyplus.consistency_plus.utils;

import net.minecraft.util.Identifier;

public class IdHandler {
    public static final String ID = "consistency_plus";

    public static Identifier IdFormat(String name) {
        return new Identifier(ID, name);
    }
}

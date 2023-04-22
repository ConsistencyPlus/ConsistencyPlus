package io.github.consistencyplus.consistency_plus.util;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public record AdditionalBlockSettings(@Nullable Boolean pistonPush, @Nullable Boolean pistonPull, @Nullable String itemGroup, @Nullable String oxidizeToBlock, @Nullable String waxToBlock){}


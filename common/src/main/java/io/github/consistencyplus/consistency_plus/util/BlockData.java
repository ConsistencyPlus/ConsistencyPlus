package io.github.consistencyplus.consistency_plus.util;

import io.github.consistencyplus.consistency_plus.registry.ConsistencyPlusBlocksLoader;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import org.jetbrains.annotations.Nullable;

public record BlockData(@Nullable BlockShape block, @Nullable SettingsBundle settings) { }


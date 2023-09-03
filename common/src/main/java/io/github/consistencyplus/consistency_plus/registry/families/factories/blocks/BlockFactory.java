package io.github.consistencyplus.consistency_plus.registry.families.factories.blocks;

import io.github.consistencyplus.consistency_plus.registry.families.BlockStyle;
import org.jetbrains.annotations.Nullable;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;

public interface BlockFactory {
    @Nullable
    Block create(BlockStyle style, AbstractBlock.Settings settings, Block baseBlock);
}

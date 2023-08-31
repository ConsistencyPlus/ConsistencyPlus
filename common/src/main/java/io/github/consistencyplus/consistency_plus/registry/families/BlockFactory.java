package io.github.consistencyplus.consistency_plus.registry.families;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;

public interface BlockFactory {
    Block create(AbstractBlock.Settings settings, Block baseBlock);
}

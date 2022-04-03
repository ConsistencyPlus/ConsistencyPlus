package io.github.consistencyplus.consistency_plus.core.entries.block;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.TintedGlassBlock;

public class TintedGlassRegistryEntryGroup extends DyedRegistryEntryGroup {
    public TintedGlassRegistryEntryGroup(String name, AbstractBlock.Settings blockSettings, Boolean withBase) {
        super(name, blockSettings, withBase);
    }

    @Override
    public RegistrySupplier<Block> blockRegistration(String name, BlockShapes blockShapes, AbstractBlock.Settings blockSettings) {
        return ConsistencyPlusMain.BLOCKS.register(name, () ->  new TintedGlassBlock(blockSettings));
    }
}

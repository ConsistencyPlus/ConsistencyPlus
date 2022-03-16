package io.github.consistencyplus.consistency_plus.core.entries.block;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.registry.CPlusItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class StoneRegistryEntryGroup extends RegistryEntryGroup {
    public StoneRegistryEntryGroup(String name, AbstractBlock.Settings blockSettings) {
        super(name, blockSettings);
    }

    public void register(String id, BlockShapes shape, AbstractBlock.Settings blockSettings) {
        RegistrySupplier<Block> a = blockRegistration(id, shape, blockSettings);
        RegistrySupplier<Item> b = ConsistencyPlusMain.ITEMS.register(id, () -> new BlockItem(a.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
    }
}

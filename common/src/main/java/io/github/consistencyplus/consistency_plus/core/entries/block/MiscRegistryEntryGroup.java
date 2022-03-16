package io.github.consistencyplus.consistency_plus.core.entries.block;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.registry.CPlusItemGroups;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class MiscRegistryEntryGroup extends RegistryEntryGroup {
    public MiscRegistryEntryGroup(String name, AbstractBlock.Settings blockSettings) {
        super(name, blockSettings);
    }

    public void register(String id, BlockShapes shape, AbstractBlock.Settings blockSettings) {
        RegistrySupplier<Block> a = (id.equals("withered_bone_block")) ? ConsistencyPlusMain.BLOCKS.register(id, () -> new PillarBlock(blockSettings)) : blockRegistration(id, shape, blockSettings);
        RegistrySupplier<Item> b = ConsistencyPlusMain.ITEMS.register(id, () -> new BlockItem(a.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
    }
}

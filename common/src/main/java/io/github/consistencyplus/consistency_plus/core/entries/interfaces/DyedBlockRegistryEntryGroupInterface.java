package io.github.consistencyplus.consistency_plus.core.entries.interfaces;

import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;

public interface DyedBlockRegistryEntryGroupInterface {
    Block getDyedBlock(DyeColor dyeColor, BlockShapes shapes, BlockTypes type);
    Item getDyedItem(DyeColor dyeColor, BlockShapes shapes, BlockTypes type);
}

package io.github.consistencyplus.consistency_plus.registry.families;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public record BlockEntry(Identifier id, Block block, Item item) {
}

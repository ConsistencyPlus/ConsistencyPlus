package io.github.consistencyplus.consistency_plus.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.IceBlock;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class FalseBlock extends AbstractBlock {
    // "Hi yes can I order 1 FalseBlock?"
    // The words of an delusional freak
    public FalseBlock(Settings settings) {
        super(settings);
    }

    @Override
    public Item asItem() {
        return Items.AIR;
    }

    @Override
    protected Block asBlock() {
        return Blocks.AIR;
    }
}

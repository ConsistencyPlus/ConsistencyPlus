package io.github.consistencyplus.consistency_plus.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import org.jetbrains.annotations.Nullable;

public class RedirectedBlockItem extends BlockItem {
    public Block fromBlock;

    public RedirectedBlockItem(Block block, Settings settings, Block fromBlock) {
        super(block, settings);
        this.fromBlock = fromBlock;
    }

    @Override
    public Block getBlock() {
        return this.fromBlock;
    }

    public Block getPlacedBlock() {
        return super.getBlock();
    }

    @Nullable
    protected BlockState getPlacementState(ItemPlacementContext context) {
        BlockState blockState = this.getPlacedBlock().getPlacementState(context);
        return blockState != null && this.canPlace(context, blockState) ? blockState : null;
    }
}

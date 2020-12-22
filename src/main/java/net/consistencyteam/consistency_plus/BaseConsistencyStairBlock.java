package net.consistencyteam.consistency_plus;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import static net.minecraft.block.Blocks.STONE_BRICKS;

class BaseConsistencyStairBlock extends StairsBlock {
    public BaseConsistencyStairBlock (BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }
}
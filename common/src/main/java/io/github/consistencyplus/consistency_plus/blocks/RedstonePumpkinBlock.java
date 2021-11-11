package io.github.consistencyplus.consistency_plus.blocks;

import io.github.consistencyplus.consistency_plus.core.extensions.CPlusCarvedPumpkinBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public class RedstonePumpkinBlock extends CPlusCarvedPumpkinBlock {
    public RedstonePumpkinBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    @Override
    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {return 15;}
}

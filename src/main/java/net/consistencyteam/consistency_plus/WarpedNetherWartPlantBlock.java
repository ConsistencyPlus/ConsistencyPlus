package net.consistencyteam.consistency_plus;

import net.minecraft.block.BlockState;
import net.minecraft.block.NetherWartBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class WarpedNetherWartPlantBlock extends NetherWartBlock {
    public WarpedNetherWartPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(Items.WARPED_NETHER_WART);
    }
}

package io.github.consistencyplus.consistency_plus.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.NetherWartBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.registry.Registry;
import net.minecraft.world.BlockView;

public class WarpedWartPlantBlock extends NetherWartBlock {
    public WarpedWartPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(Registries.ITEM.get(new Identifier("consistency_plus", "warped_wart")));
    }

}
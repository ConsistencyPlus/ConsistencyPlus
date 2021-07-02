package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.core.HasUngrownVariant;
import io.github.consistencyplus.consistency_plus.core.IsSpreadableGrassBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.SpreadableBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

import java.util.Random;

@Mixin(GrassBlock.class)
public abstract class GrassBlockMixin extends SpreadableBlock implements HasUngrownVariant, IsSpreadableGrassBlock {
    protected GrassBlockMixin(Settings settings) {
        super(settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        grow(state, world, pos, random);
    }

    @Override
    public BlockState getUngrownVariant(World world, BlockPos pos) {
        return Blocks.DIRT.getDefaultState();
    }
}

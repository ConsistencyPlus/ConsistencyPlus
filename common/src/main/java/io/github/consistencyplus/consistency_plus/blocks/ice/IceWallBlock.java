package io.github.consistencyplus.consistency_plus.blocks.ice;

import io.github.consistencyplus.consistency_plus.core.meltables.CanMeltIntoWater;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import net.minecraft.util.random.RandomGenerator;

public class IceWallBlock extends WallBlock implements CanMeltIntoWater {
    public IceWallBlock(Settings settings) {
        super(settings);
    }

    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {
        super.afterBreak(world, player, pos, state, blockEntity, stack);
        customAfterBreak(world, pos, stack);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, RandomGenerator random) {
        customRandomTick(state, world, pos);
    }
}

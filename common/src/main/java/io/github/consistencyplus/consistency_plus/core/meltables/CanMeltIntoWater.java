package io.github.consistencyplus.consistency_plus.core.meltables;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public interface CanMeltIntoWater {
    default void customAfterBreak(World world, BlockPos pos, @Nullable ItemStack stack) {
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            if (world.getDimension().ultrawarm()) {
                world.removeBlock(pos, false);
                return;
            }

            Material material = world.getBlockState(pos.down()).getMaterial();
            if (material.blocksMovement() || material.isLiquid()) {
                // It shouldnt be possible waterlog a full sized block should it? And I dont think theres other types of logging
                world.setBlockState(pos, Blocks.WATER.getDefaultState());
            }
        }
    }

    default void customRandomTick(BlockState state, ServerWorld world, BlockPos pos) {
        if (world.getLightLevel(LightType.BLOCK, pos) > 11 - state.getOpacity(world, pos)) {
            this.melt(world, pos);
        }

    }

    default void melt(World world, BlockPos pos) {
        if (world.getDimension().ultrawarm()) {
            world.removeBlock(pos, false);
        } else {
            world.setBlockState(pos, Blocks.WATER.getDefaultState());
            world.updateNeighbors(pos, Blocks.WATER);
        }
    }
}

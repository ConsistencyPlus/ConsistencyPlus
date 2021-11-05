package io.github.consistencyplus.consistency_plus.blocks.nubert;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static net.minecraft.state.property.Properties.WATERLOGGED;

public class WiggedNubertBlock extends NubertBlock {
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (player.getStackInHand(hand).isOf(Items.SHEARS)) {
            if (!world.isClient()) {
                world.setBlockState(pos,
                        CPlusBlocks.NUBERT.getDefaultState()
                                .with(FACING, state.get(FACING))
                                .with(WATERLOGGED, state.get(WATERLOGGED))
                );
            }
            world.playSound(pos.getX(),
                    pos.getY(),
                    pos.getZ(),
                    SoundEvents.ENTITY_SHEEP_SHEAR,
                    SoundCategory.BLOCKS,
                    1.0F,
                    1.0F,
                    false);

            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }
}
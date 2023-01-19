package io.github.consistencyplus.consistency_plus.blocks.nubert;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

import static net.minecraft.state.property.Properties.WATERLOGGED;

public class NubertBlock extends HorizontalFacingBlock implements Waterloggable, Nubert {
    public static final VoxelShape NUBERT_SHAPE = Block.createCuboidShape(2, 0, 2, 14, 12, 14);

    public final Item actionItem;
    public final SoundEvent actionSound;
    public final Supplier<? extends Block> counterpart;

    public NubertBlock(Item actionItem, SoundEvent actionSound, Supplier<? extends Block> counterpart, Settings settings) {
        super(settings);
        this.actionItem = actionItem;
        this.actionSound = actionSound;
        this.counterpart = counterpart;
        setDefaultState(getDefaultState().with(WATERLOGGED, false));
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.createAndScheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack held = player.getStackInHand(hand);
        if (hand == Hand.MAIN_HAND && held.isEmpty()) {
            world.playSound(player, pos, SoundEvents.BLOCK_SLIME_BLOCK_PLACE, SoundCategory.BLOCKS, 1, 1);
            return ActionResult.SUCCESS;
        } else if (!held.isOf(actionItem)) {
            return ActionResult.PASS;
        }
        if (!world.isClient()) {
            BlockState newbert = counterpart.get()
                    .getDefaultState()
                    .with(FACING, state.get(FACING))
                    .with(WATERLOGGED, state.get(WATERLOGGED));
            world.setBlockState(pos, newbert);

            if (!player.isCreative()) {
                ItemStack newHeld = applyAction(world, pos, held, player, hand);
                player.setStackInHand(hand, newHeld);
            }
        }
        world.playSound(player, pos, actionSound, SoundCategory.BLOCKS, 1, 1);
        return ActionResult.SUCCESS;
    }

    public ItemStack applyAction(World world, BlockPos pos, ItemStack held, PlayerEntity player, Hand hand) {
        held = held.copy();
        held.decrement(1);
        return held;
    }

    @Override
    public boolean isCart() {
        return false;
    }

    @Override
    public boolean hasWig() {
        return false;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return getDefaultState()
                .with(FACING, ctx.getPlayerFacing().getOpposite())
                .with(WATERLOGGED, ctx.getWorld().isWater(ctx.getBlockPos()));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return NUBERT_SHAPE;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return NUBERT_SHAPE;
    }

    @Override
    public VoxelShape getRaycastShape(BlockState state, BlockView world, BlockPos pos) {
        return NUBERT_SHAPE;
    }
}
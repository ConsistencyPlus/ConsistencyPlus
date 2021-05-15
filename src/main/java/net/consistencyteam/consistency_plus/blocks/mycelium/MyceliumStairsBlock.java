package net.consistencyteam.consistency_plus.blocks.mycelium;

import net.consistencyteam.consistency_plus.base.HasUngrownVariant;
import net.consistencyteam.consistency_plus.base.IsSpreadableMyceliumBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SnowBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;

import java.util.Random;

import static net.consistencyteam.consistency_plus.registry.Blocks.DIRT_STAIRS;

public class MyceliumStairsBlock extends StairsBlock implements HasUngrownVariant, IsSpreadableMyceliumBlock {
    public MyceliumStairsBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }

    @Override
    public BlockState getUngrownVariant(World world, BlockPos pos) {
        BlockState oldState = world.getBlockState(pos);
        return DIRT_STAIRS.getDefaultState().with(WATERLOGGED, oldState.get(WATERLOGGED)).with(FACING, oldState.get(FACING))
                .with(HALF, oldState.get(HALF)).with(SHAPE, oldState.get(SHAPE));
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        grow(state, world, pos, random);
    }

    @Override
    public boolean customCanSurvive(BlockState state, WorldView worldView, BlockPos pos) {
        BlockState stateAbove = worldView.getBlockState(pos.up());
        if (stateAbove.isOf(Blocks.SNOW) && stateAbove.get(SnowBlock.LAYERS) == 1) {
            return true;
        } else if (stateAbove.getFluidState().getLevel() == 8) {
            return false;
        } else {
            if (worldView.getBlockState(pos).getBlock() instanceof MyceliumStairsBlock) {
                if (worldView.getBlockState(pos).get(HALF) == BlockHalf.TOP) {
                    return true; // technically not correct but good enough
                }
            }
            int i = ChunkLightProvider.getRealisticOpacity(worldView, state, pos, stateAbove, pos.up(), Direction.UP, stateAbove.getOpacity(worldView, pos.up()));
            return i < worldView.getMaxLightLevel();
        }
    }
}

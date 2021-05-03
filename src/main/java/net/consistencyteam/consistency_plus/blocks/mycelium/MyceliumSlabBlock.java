package net.consistencyteam.consistency_plus.blocks.mycelium;

import net.consistencyteam.consistency_plus.base.HasUngrownVariant;
import net.consistencyteam.consistency_plus.base.IsSpreadableMyceliumBlock;
import net.consistencyteam.consistency_plus.blocks.grass.GrassSlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SnowBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;

import java.util.Random;

import static net.consistencyteam.consistency_plus.registry.Blocks.DIRT_SLAB;

public class MyceliumSlabBlock extends SlabBlock implements HasUngrownVariant, IsSpreadableMyceliumBlock {
	public MyceliumSlabBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public boolean customCanSurvive(BlockState state, WorldView worldView, BlockPos pos) {
		BlockState stateAbove = worldView.getBlockState(pos.up());
		if (stateAbove.isOf(Blocks.SNOW) && stateAbove.get(SnowBlock.LAYERS) == 1) {
			return true;
		} else if (stateAbove.getFluidState().getLevel() == 8) {
			return false;
		} else {
			if (worldView.getBlockState(pos).getBlock() instanceof MyceliumSlabBlock) {
				if (worldView.getBlockState(pos).get(TYPE) == SlabType.TOP) {
					return true; // technically not correct but good enough
				}
			}
			int i = ChunkLightProvider.getRealisticOpacity(worldView, state, pos, stateAbove, pos.up(), Direction.UP, stateAbove.getOpacity(worldView, pos.up()));
			return i < worldView.getMaxLightLevel();
		}
	}
	
	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		grow(state, world, pos, random);
	}
	
	@Override
	public BlockState getUngrownVariant(World world, BlockPos pos) {
		if (world.getBlockState(pos) == getDefaultState().with(TYPE, SlabType.BOTTOM)) {
			return DIRT_SLAB.getDefaultState().with(TYPE, SlabType.BOTTOM);
		} else if (world.getBlockState(pos) == getDefaultState().with(TYPE, SlabType.DOUBLE)) {
			return DIRT_SLAB.getDefaultState().with(TYPE, SlabType.DOUBLE);
		} else {
			return DIRT_SLAB.getDefaultState().with(TYPE, SlabType.TOP);
		}
	}
}

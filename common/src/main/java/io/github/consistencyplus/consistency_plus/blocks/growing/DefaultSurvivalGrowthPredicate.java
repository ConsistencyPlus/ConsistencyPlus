package io.github.consistencyplus.consistency_plus.blocks.growing;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SnowBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.WorldView;

public class DefaultSurvivalGrowthPredicate implements GrowthPredicate {
	private static final double[] offsets = new double[] { 0.25, 0.5, 0.75 };
	// state, above state -> survival allowed
	protected final Table<BlockState, BlockState, Boolean> survivalCache = HashBasedTable.create();

	@Override
	public boolean test(BlockState state, WorldView world, BlockPos blockPos) {
		BlockPos aboveBlockPos = blockPos.up();
		BlockState aboveState = world.getBlockState(aboveBlockPos);
		// first, check the cache
		Boolean survives = survivalCache.get(state, aboveState);
		if (survives != null)
			return survives;

		// not cached, calculate it.
		boolean dies = snowKills(aboveState) || waterKills(aboveState) || waterKills(state) // check the base state too, covers waterlogging
				|| topCovered(world, state, blockPos, aboveState, aboveBlockPos);
		survivalCache.put(state, aboveState, !dies);
		return !dies;
	}

	protected boolean snowKills(BlockState aboveState) {
		return aboveState.isOf(Blocks.SNOW) && aboveState.get(SnowBlock.LAYERS) > 1;
	}

	protected boolean waterKills(BlockState aboveState) {
		return aboveState.getFluidState().getLevel() == 8;
	}

	protected boolean topCovered(WorldView world,
								 BlockState state, BlockPos blockPos,
								 BlockState aboveState, BlockPos aboveBlockPos) {
		// vanilla checks if the combination of the opposing faces add to a full square, but that doesn't work with ex. slabs against air.
		// instead, use a series of checks to estimate coverage.
		VoxelShape shape = state.getCollisionShape(world, blockPos).getFace(Direction.UP);
		VoxelShape aboveShape = aboveState.getCollisionShape(world, aboveBlockPos).getFace(Direction.DOWN);
		// iterate over 9 total positions across the two shapes to see if there's collision there
		boolean blocked = false;
		x: for (double xOff : offsets) {
			for (double zOff : offsets) {
				Vec3d pos = new Vec3d(xOff, 0.9, zOff);
				if (shape.getBoundingBoxes().stream().anyMatch(box -> box.contains(pos))) {
					// pos is present, now check the above shape
					// positions are relative from 0-1, offset it down to the bottom of the above shape
					Vec3d abovePos = pos.subtract(0, 0.8, 0);
					if (aboveShape.getBoundingBoxes().stream().anyMatch(box -> box.contains(abovePos))) {
						// present here too. consider this point blocked.
						blocked = true;
						break x;
					}
				}
			}
		}
		// if any points were blocked, we consider the whole thing obscured and unsurvivable.
		survivalCache.put(state, aboveState, !blocked);
		return blocked;
	}
}

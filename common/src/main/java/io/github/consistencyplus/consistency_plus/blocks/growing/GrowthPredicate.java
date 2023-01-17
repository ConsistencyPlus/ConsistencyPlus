package io.github.consistencyplus.consistency_plus.blocks.growing;

import net.minecraft.block.BlockState;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

/**
 * A predicate that can determine if a spreading block can survive at or spread to the given location.
 */
public interface GrowthPredicate {
	/**
	 * Default survival behavior. Can survive if:
	 * <pre>
	 *     - 0 or 1 layers of snow above
	 *     - not a full block of water above
	 *     - top of the block is not fully occluded by the bottom of the block above it
	 * </pre>
	 * Based on the vanilla {@link net.minecraft.block.SpreadableBlock#canSurvive(BlockState, WorldView, BlockPos) SpreadableBlock},
	 * with changes to work with non-full blocks.
	 */
	@SuppressWarnings("JavadocReference")
	GrowthPredicate DEFAULT_SURVIVE = new DefaultSurvivalGrowthPredicate();

	/**
	 * The default spread behavior. An extension of the default survival behavior.
	 * Allows spread if all survival conditions are met, and there's no water present at all.
	 */
	GrowthPredicate DEFAULT_SPREAD = (state, world, pos) -> {
		BlockPos abovePos = pos.up();
		return DEFAULT_SURVIVE.test(state, world, pos) && !world.getFluidState(abovePos).isIn(FluidTags.WATER);
	};

	/**
	 * @return true if spread/survival is allowed at the given position
	 */
	boolean test(BlockState state, WorldView world, BlockPos pos);
}

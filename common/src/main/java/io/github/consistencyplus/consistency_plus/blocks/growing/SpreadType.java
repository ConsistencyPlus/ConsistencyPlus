package io.github.consistencyplus.consistency_plus.blocks.growing;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

public enum SpreadType {
	GRASS {
		@Override
		public BlockState getGrownState(GrowthEntry entry, BlockState dirtState) {
			return entry.getGrass(dirtState);
		}
	},
	MYCELIUM {
		@Override
		public BlockState getGrownState(GrowthEntry entry, BlockState dirtState) {
			return entry.getMycelium(dirtState);
		}
	};

	public abstract BlockState getGrownState(GrowthEntry entry, BlockState dirtState);

	public BlockState getAndProcessGrownState(GrowthEntry entry, BlockState dirtState, WorldView world, BlockPos pos) {
		BlockState grown = getGrownState(entry, dirtState);
		return entry.postProcess(grown, world, pos);
	}
}

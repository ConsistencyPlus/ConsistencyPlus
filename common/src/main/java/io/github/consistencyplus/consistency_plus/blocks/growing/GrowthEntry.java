package io.github.consistencyplus.consistency_plus.blocks.growing;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.WorldView;

import java.util.HashMap;
import java.util.Map;

public final class GrowthEntry {
	public final Block dirt;
	public final Block grass;
	public final Block mycelium;

	private final GrowthPredicate spreadPredicate;
	private final GrowthMapper stateMapper;
	private final GrowthMapper decayMapper;
	private final GrowthPostProcessor postProcessor;

	private final Map<BlockState, BlockState> dirtCache = new HashMap<>();
	private final Map<BlockState, BlockState> grassCache = new HashMap<>();
	private final Map<BlockState, BlockState> myceliumCache = new HashMap<>();

	private GrowthEntry(Block dirt, Block grass, Block mycelium, GrowthPredicate spreadPredicate,
						GrowthMapper stateMapper, GrowthMapper decayMapper, GrowthPostProcessor postProcessor) {
		this.dirt = dirt;
		this.grass = grass;
		this.mycelium = mycelium;
		this.spreadPredicate = spreadPredicate;
		this.stateMapper = stateMapper;
		this.decayMapper = decayMapper;
		this.postProcessor = postProcessor;
	}

	public BlockState getGrass(BlockState dirtState) {
		return grassCache.computeIfAbsent(dirtState, $ -> stateMapper.mapState(dirtState, grass));
	}

	public BlockState getMycelium(BlockState dirtState) {
		return myceliumCache.computeIfAbsent(dirtState, $ -> stateMapper.mapState(dirtState, mycelium));
	}

	public BlockState getDirt(BlockState grownState) {
		return dirtCache.computeIfAbsent(grownState, $ -> decayMapper.mapState(grownState, dirt));
	}

	public boolean allowsSpread(BlockState state, WorldView world, BlockPos pos) {
		return spreadPredicate.test(state, world, pos);
	}

	public BlockState postProcess(BlockState current, WorldView world, BlockPos pos) {
		return postProcessor.modifyState(current, world, pos);
	}

	public static class Builder {
		private final Block dirt;
		private Block grass = Blocks.AIR;
		private Block mycelium = Blocks.AIR;
		private GrowthPredicate spreadPredicate = GrowthPredicate.DEFAULT_SPREAD;
		private GrowthMapper growthMapper = GrowthMapper.COPY_PROPERTIES;
		private GrowthMapper decayMapper = GrowthMapper.COPY_PROPERTIES;
		private GrowthPostProcessor postProcessor = GrowthPostProcessor.SNOWIFY;

		public Builder(Block dirt) {
			this.dirt = dirt;
		}

		public Builder grass(Block grass) {
			this.grass = grass;
			return this;
		}

		public Builder mycelium(Block mycelium) {
			this.mycelium = mycelium;
			return this;
		}

		public Builder spreadsWhen(GrowthPredicate spreadPredicate) {
			this.spreadPredicate = spreadPredicate;
			return this;
		}

		public Builder mapGrowth(GrowthMapper stateMapper) {
			this.growthMapper = stateMapper;
			return this;
		}

		public Builder mapDecay(GrowthMapper stateMapper) {
			this.decayMapper = stateMapper;
			return this;
		}

		public Builder postProcess(GrowthPostProcessor postProcessor) {
			this.postProcessor = postProcessor;
			return this;
		}

		public void build() {
			if (grass == Blocks.AIR && mycelium == Blocks.AIR) {
				throw new IllegalStateException(
						"Both grass and mycelium are air for [" + Registry.BLOCK.getId(dirt) + "], at least 1 must be set."
				);
			}
			GrowthEntry entry = new GrowthEntry(dirt, grass, mycelium, spreadPredicate, growthMapper, decayMapper, postProcessor);
			DirtGrowth.putEntry(entry);
		}
	}
}

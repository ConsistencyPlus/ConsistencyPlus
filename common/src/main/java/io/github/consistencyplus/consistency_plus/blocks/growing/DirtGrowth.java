package io.github.consistencyplus.consistency_plus.blocks.growing;

import io.github.consistencyplus.consistency_plus.blocks.growing.GrowthEntry.Builder;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Map dirt blocks to their grown variants.
 */
public class DirtGrowth {
	private static final Map<Block, GrowthEntry> entries = new HashMap<>();

	public static GrowthEntry.Builder register(Block dirt) {
		return new Builder(dirt);
	}

	public static void registerSimple(Block dirt, Block grass, Block mycelium) {
		register(dirt).grass(grass).mycelium(mycelium).build();
	}

	public static void registerSimple(Supplier<Block> dirt, Supplier<Block> grass, Supplier<Block> mycelium) {
		registerSimple(dirt.get(), grass.get(), mycelium.get());
	}

	protected static void putEntry(GrowthEntry entry) {
		putSafely(entry.dirt, entry);
		putSafely(entry.grass, entry);
		putSafely(entry.mycelium, entry);
	}

	private static void putSafely(Block block, GrowthEntry entry) {
		if (block == Blocks.AIR)
			return;
		if (entries.containsKey(block))
			throw new IllegalStateException(Registry.BLOCK.getId(block) + " is already mapped to a growth entry");
		entries.put(block, entry);
	}

	/**
	 * Get the growth entry corresponding to the given block.
	 * The block may be the dirt variant, the grass variant, or the mycelium variant.
	 */
	@Nullable
	public static GrowthEntry getEntry(Block block) {
		return entries.get(block);
	}

	/**
	 * Provides a survival predicate with vanilla behavior.
	 * @see DirtGrowth#randomTickSpreadable(BlockState, ServerWorld, BlockPos, Random, GrowthPredicate, SpreadType)
	 */
	public static void randomTickSpreadable(BlockState state, ServerWorld world, BlockPos pos, Random random, SpreadType type) {
		randomTickSpreadable(state, world, pos, random, GrowthPredicate.DEFAULT_SURVIVE, type);
	}

	/**
	 * Default behavior for a custom spreadable block. Should be called on randomTick. Will check if the block can
	 * survive and spread. Based on
	 * {@link net.minecraft.block.SpreadableBlock#randomTick(BlockState, ServerWorld, BlockPos, Random)} .
	 *
	 * @param state the state of the spreadable block
	 * @param pos the block pos of the spreadable block
	 * @param survivePredicate a predicate determining if the spreadable block can survive at its current position
	 */
	public static void randomTickSpreadable(BlockState state, ServerWorld world, BlockPos pos, Random random,
											GrowthPredicate survivePredicate, SpreadType type) {
		if (!survivePredicate.test(state, world, pos)) {
			GrowthEntry entry = getEntry(state.getBlock());
			if (entry != null) {
				world.setBlockState(pos, entry.getDirt(state));
			}
		} else if (world.getLightLevel(pos.up()) >= 9) {
			for (int i = 0; i < 4; ++i) {
				BlockPos spreadPos = pos.add(
						random.nextInt(3) - 1,
						random.nextInt(5) - 3,
						random.nextInt(3) - 1
				);
				BlockState initialState = world.getBlockState(spreadPos);
				GrowthEntry entry = getEntry(initialState.getBlock());
				if (entry == null || initialState.getBlock() != entry.dirt) // only spread to dirt
					continue;
				if (entry.allowsSpread(initialState, world, spreadPos)) {
					BlockState grownState = type.getAndProcessGrownState(entry, initialState, world, spreadPos);
					world.setBlockState(spreadPos, grownState);
				}
			}
		}
	}

	@Internal
	public static void registerDefaults() {
		registerSimple(Blocks.DIRT, Blocks.GRASS_BLOCK, Blocks.MYCELIUM);
		registerSimple(CPlusBlocks.DIRT_SLAB, CPlusBlocks.GRASS_SLAB, CPlusBlocks.MYCELIUM_SLAB);
		registerSimple(CPlusBlocks.DIRT_STAIRS, CPlusBlocks.GRASS_STAIRS, CPlusBlocks.MYCELIUM_STAIRS);
		registerSimple(CPlusBlocks.DIRT_WALL, CPlusBlocks.GRASS_WALL, CPlusBlocks.MYCELIUM_WALL);
	}
}

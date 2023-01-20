package io.github.consistencyplus.consistency_plus.registry.family;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockOverlay;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.registry.CPlusSharedBlockSettings;
import net.minecraft.block.Blocks;

public class BlockFamilies {
	static {
		if (!ConsistencyPlusMain.LOADER.registrationReady())
			throw new IllegalStateException("Consistency+ registration initialized before it was ready!");
	}

	public static final BlockFamily STONE = BlockFamilyBuilder.create("stone")
			.withSettings(CPlusSharedBlockSettings.stone())
			.withExistingEntries(entries -> {
				entries.add(Blocks.STONE, BlockTypes.BASE, BlockShapes.BLOCK, BlockOverlay.BASE);
			})
			.withBlacklist(blacklist -> {
				blacklist.addAll(BlockTypes.BRICK);
			})
			.build();

	public static void init() {
	}
}

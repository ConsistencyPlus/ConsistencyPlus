package io.github.consistencyplus.consistency_plus.registry.family;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockOverlay;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

import java.util.*;
import java.util.function.Consumer;

/**
 * A builder for a {@link BlockFamily}
 */
public class BlockFamilyBuilder {
	public final Identifier id;
	private final Map<BlockEntryKey, Block> existingEntries = new HashMap<>();
	private final Set<BlockEntryKey> blacklist = new HashSet<>();
	private AbstractBlock settingsHolder = null;


	protected BlockFamilyBuilder(Identifier id) {
		this.id = id;
	}

	public static BlockFamilyBuilder create(Identifier id) {
		return new BlockFamilyBuilder(id);
	}

	public static BlockFamilyBuilder create(String name) {
		return create(ConsistencyPlusMain.id(name));
	}

	public BlockFamilyBuilder withExistingEntries(Consumer<BlockEntryAdder> consumer) {
		consumer.accept(((block, type, shape, overlay) -> {
			BlockEntryKey key = new BlockEntryKey(type, shape, overlay);
			existingEntries.put(key, block);
		}));
		return this;
	}

	public BlockFamilyBuilder withBlacklist(Consumer<BlockEntryBlacklist> consumer) {
		consumer.accept(((type, shape, overlay) -> {
			BlockEntryKey key = new BlockEntryKey(type, shape, overlay);
			blacklist.add(key);
		}));
		return this;
	}

	public BlockFamilyBuilder withSettings(Settings settings) {
		this.settingsHolder = new DummyAbstractBlock(settings);
		return this;
	}

	public BlockFamily build() {
		if (settingsHolder == null)
			throw new IllegalStateException("Cannot build BlockFamilyBuilder (" + id + ") with no default block settings");

		Map<BlockEntryKey, Block> blocks = new HashMap<>(existingEntries);
		for (BlockTypes type : BlockTypes.ALL) {
			for (BlockShapes shape : BlockShapes.ALL) {
				for (BlockOverlay overlay : BlockOverlay.ALL) {
					BlockEntryKey key = new BlockEntryKey(type, shape, overlay);
					if (blacklist.contains(key) || blocks.containsKey(key))
						continue;
					Block block = shape.initializeBlock(Settings.copy(settingsHolder));
					blocks.put(key, block);
				}
			}
		}
		return new BlockFamily(id, blocks);
	}
}

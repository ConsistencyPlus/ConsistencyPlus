package io.github.consistencyplus.consistency_plus.registry.families.factories.blocks;

import org.jetbrains.annotations.Nullable;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;

public interface JustSettingsBlockFactory {
	@Nullable
	Block create(AbstractBlock.Settings settings);
}
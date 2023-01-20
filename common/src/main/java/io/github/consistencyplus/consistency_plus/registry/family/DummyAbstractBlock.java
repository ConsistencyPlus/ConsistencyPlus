package io.github.consistencyplus.consistency_plus.registry.family;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class DummyAbstractBlock extends AbstractBlock {
	public DummyAbstractBlock(Settings settings) {
		super(settings);
	}

	@Override
	public Item asItem() {
		return null;
	}

	@Override
	protected Block asBlock() {
		return null;
	}
}

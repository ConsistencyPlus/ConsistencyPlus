package io.github.consistencyplus.consistency_plus.blocks.growing;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.property.Property;

/**
 * Maps dirt states to their corresponding grown variants, and vice versa. Expect results to be cached.
 */
public interface GrowthMapper {
	@SuppressWarnings("rawtypes, unchecked")
	GrowthMapper COPY_PROPERTIES = (from, to) -> {
		BlockState state = to.getDefaultState();

		// copy over the properties
		for (Property property : from.getProperties()) {
			if (!state.contains(property))
				continue; // skip mismatched properties, like grass block's snow
			Comparable value = from.get(property);
			state = state.with(property, value);
		}

		return state;
	};

	BlockState mapState(BlockState from, Block to);
}

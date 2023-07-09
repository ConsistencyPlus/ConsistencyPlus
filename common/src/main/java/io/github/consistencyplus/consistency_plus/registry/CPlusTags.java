package io.github.consistencyplus.consistency_plus.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CPlusTags {
	public static final TagKey<Block> VALID_PORTAL_BLOCKS = TagKey.of(Registry.BLOCK_KEY, new Identifier("consistency_plus", "valid_portal_blocks"));
	public static final TagKey<Block> VALID_CONDUIT_BLOCKS = TagKey.of(Registry.BLOCK_KEY, new Identifier("consistency_plus", "valid_conduit_blocks"));

	public static final TagKey<Block> BLOCKS_PISTONS = TagKey.of(Registry.BLOCK_KEY, new Identifier("consistency_plus", "blocks_pistons"));
	public static final TagKey<Block> PISTON_PUSH_ONLY = TagKey.of(Registry.BLOCK_KEY, new Identifier("consistency_plus", "piston_push_only"));

	public static final TagKey<Item> CHARGES_RESPAWN_ANCHOR = TagKey.of(Registry.ITEM_KEY, new Identifier("consistency_plus", "charges_respawn_anchor"));
}

package io.github.consistencyplus.consistency_plus.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class CPlusTags {
	public static final TagKey<Block> VALID_PORTAL_BLOCKS = TagKey.of(RegistryKeys.BLOCK, new Identifier("consistency_plus", "valid_portal_blocks"));
	public static final TagKey<Block> VALID_CONDUIT_BLOCKS = TagKey.of(RegistryKeys.BLOCK, new Identifier("consistency_plus", "valid_conduit_blocks"));

	public static final TagKey<Item> CHARGES_RESPAWN_ANCHOR = TagKey.of(RegistryKeys.ITEM, new Identifier("consistency_plus", "charges_respawn_anchor"));
}

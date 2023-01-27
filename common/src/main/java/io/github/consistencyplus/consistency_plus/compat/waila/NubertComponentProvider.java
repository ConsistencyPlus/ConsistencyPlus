package io.github.consistencyplus.consistency_plus.compat.waila;

import io.github.consistencyplus.consistency_plus.blocks.nubert.Nubert;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertMinecartEntity;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertTooltips;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;

public class NubertComponentProvider {
	protected BlockPos lastPos;

	public Text getNubertTooltip(Block block, BlockPos pos) {
		if (!(block instanceof Nubert nubert))
			return NubertTooltips.ERROR;
		if (!pos.equals(lastPos))
			NubertTooltips.refreshTooltip(); // new nubert, new tooltip
		lastPos = pos;
		return NubertTooltips.getCurrentTooltip(nubert);
	}

	public Item getNubertCartItem(Entity entity) {
		if (entity instanceof NubertMinecartEntity cart) {
			return cart.getItem();
		}
		return Items.BARRIER;
	}

	public Text getNubertCartName(Entity entity) {
		if (entity instanceof NubertMinecartEntity cart) {
			return Text.translatable(cart.getItem().getTranslationKey()).formatted(Formatting.WHITE);
		}
		return NubertTooltips.ERROR;
	}

	public Text getNubertTooltip(Entity entity) {
		if (entity instanceof NubertMinecartEntity cart) {
			return NubertTooltips.getCurrentTooltip(cart);
		}
		return NubertTooltips.ERROR;
	}
}

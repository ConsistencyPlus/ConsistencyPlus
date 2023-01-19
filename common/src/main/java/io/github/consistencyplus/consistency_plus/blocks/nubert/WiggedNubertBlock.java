package io.github.consistencyplus.consistency_plus.blocks.nubert;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.function.Supplier;

public class WiggedNubertBlock extends NubertBlock {
	public WiggedNubertBlock(Item actionItem, SoundEvent actionSound, Supplier<? extends Block> counterpart, Settings settings) {
		super(actionItem, actionSound, counterpart, settings);
	}

	@Override
	public ItemStack applyAction(World world, BlockPos pos, ItemStack held, PlayerEntity player, Hand hand) {
		if (player.isCreative())
			return held;
		held = held.copy();
		held.damage(1, player, user -> user.sendToolBreakStatus(hand));
		dropStack(world, pos, Direction.UP, Items.YELLOW_WOOL.getDefaultStack());
		return held;
	}

	@Override
	public boolean hasWig() {
		return true;
	}
}

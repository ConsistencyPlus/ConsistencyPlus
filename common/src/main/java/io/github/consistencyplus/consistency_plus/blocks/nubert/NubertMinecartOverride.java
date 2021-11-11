package io.github.consistencyplus.consistency_plus.blocks.nubert;

import io.github.consistencyplus.consistency_plus.core.MinecartEntityExtensions;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import mcp.mobius.waila.api.*;
import net.minecraft.block.Block;
import net.minecraft.entity.vehicle.MinecartEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NubertMinecartOverride implements IEntityComponentProvider, IServerDataProvider<MinecartEntity> {
	private BlockPos lastPos;
	private MinecartEntity lastCart;
	
	@Override
	public ItemStack getDisplayItem(IEntityAccessor accessor, IPluginConfig config) {
		NbtCompound data = accessor.getServerData();
		boolean nubert = data.getBoolean("Nubert");
		if (nubert) {
			boolean wig = data.getBoolean("Wigged");
			return (wig ? CPlusItems.WIGGED_NUBERT_MINECART : CPlusItems.NUBERT_MINECART).get().getDefaultStack();
		}
		return ItemStack.EMPTY;
	}
	
	@Override
	public void appendHead(ITooltip tooltip, IEntityAccessor accessor, IPluginConfig config) {
		NbtCompound data = accessor.getServerData();
		boolean nubert = data.getBoolean("Nubert");
		if (nubert) {
			boolean wig = data.getBoolean("Wigged");
			tooltip.set(WailaConstants.OBJECT_NAME_TAG, new TranslatableText("block.consistency_plus" + (wig ? ".wigged_nubert" : ".nubert")).formatted(Formatting.WHITE));
		}
	}
	
	@Override
	public void appendBody(ITooltip tooltip, IEntityAccessor accessor, IPluginConfig config) {
		NbtCompound data = accessor.getServerData();
		boolean nubert = data.getBoolean("Nubert");
		if (nubert) {
			MinecartEntity cart = accessor.getEntity();
			BlockPos pos = cart.getBlockPos();
			boolean wig = data.getBoolean("Wigged");
			tooltip.add(NubertHandler.getNubertText(wig, true));
			NubertHandler.TEXT_GOT_THIS_TICK = pos.equals(lastPos) || cart.equals(lastCart);
			lastPos = pos;
			lastCart = cart;
		}
	}
	
	@Override
	public void appendTail(ITooltip tooltip, IEntityAccessor accessor, IPluginConfig config) {
		NbtCompound data = accessor.getServerData();
		boolean nubert = data.getBoolean("Nubert");
		if (nubert) {
			tooltip.set(WailaConstants.MOD_NAME_TAG, new LiteralText("Consistency Plus").formatted(Formatting.BLUE, Formatting.ITALIC));
		}
	}
	
	@Override
	public void appendServerData(NbtCompound data, ServerPlayerEntity player, World world, MinecartEntity minecartEntity) {
		if (minecartEntity instanceof MinecartEntityExtensions cart) {
			Block block = cart.getCustomBlock().getBlock();
			data.putBoolean("Nubert", block instanceof NubertBlock);
			data.putBoolean("Wigged", block instanceof WiggedNubertBlock);
		}
	}
}

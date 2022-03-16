package io.github.consistencyplus.consistency_plus.items;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import net.minecraft.block.AbstractRailBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.RailShape;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.MinecartItem;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import static net.minecraft.block.Blocks.SLIME_BLOCK;

public class NubertMinecartItem extends MinecartItem {
	public final boolean wigged;
	public NubertMinecartItem(Settings settings, boolean wigged) {
		super(AbstractMinecartEntity.Type.RIDEABLE, settings);
		this.wigged = wigged;
	}
	
	@Override
	public ActionResult useOnBlock(ItemUsageContext context) {
		World world = context.getWorld();
		BlockPos blockPos = context.getBlockPos();
		BlockState blockState = world.getBlockState(blockPos);
		if (!blockState.isIn(BlockTags.RAILS)) {
			return ActionResult.FAIL;
		}
		ItemStack itemStack = context.getStack();
		if (!world.isClient) {
			RailShape railShape = blockState.getBlock() instanceof AbstractRailBlock rail ? blockState.get(rail.getShapeProperty()) : RailShape.NORTH_SOUTH;
			double d = 0.0;
			if (railShape.isAscending()) {
				d = 0.5;
			}
			
			AbstractMinecartEntity cart = AbstractMinecartEntity.create(
					world, blockPos.getX() + 0.5D,
					blockPos.getY() + 0.0625D + d,
					blockPos.getZ() + 0.5D,
					AbstractMinecartEntity.Type.RIDEABLE);
			
			cart.setCustomBlock((wigged ? CPlusBlocks.WIGGED_NUBERT : CPlusBlocks.NUBERT).get().getDefaultState());
			if (itemStack.hasCustomName()) {
				cart.setCustomName(itemStack.getName());
			}
			
			world.spawnEntity(cart);
			world.emitGameEvent(context.getPlayer(), GameEvent.ENTITY_PLACE, blockPos);
		}
		
		itemStack.decrement(1);
		return ActionResult.success(world.isClient);
	}
}

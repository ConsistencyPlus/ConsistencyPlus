package io.github.consistencyplus.consistency_plus.items;

import io.github.consistencyplus.consistency_plus.blocks.nubert.Nubert;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertMinecartEntity;
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

public class NubertMinecartItem extends MinecartItem implements Nubert {
	public final boolean wig;
	public final Block block;

	public NubertMinecartItem(Settings settings, Block block, boolean wig) {
		super(AbstractMinecartEntity.Type.RIDEABLE, settings);
		this.wig = wig;
		this.block = block;
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

			// only change from MinecartItem
			AbstractMinecartEntity cart = new NubertMinecartEntity(
					world, blockPos.getX() + 0.5D,
					blockPos.getY() + 0.0625D + d,
					blockPos.getZ() + 0.5D,
					wig);

			if (itemStack.hasCustomName()) {
				cart.setCustomName(itemStack.getName());
			}
			
			world.spawnEntity(cart);
			world.emitGameEvent(context.getPlayer(), GameEvent.ENTITY_PLACE, blockPos);
		}
		
		itemStack.decrement(1);
		return ActionResult.success(world.isClient);
	}

	@Override
	public boolean hasWig() {
		return wig;
	}

	@Override
	public boolean isCart() {
		return true;
	}
}

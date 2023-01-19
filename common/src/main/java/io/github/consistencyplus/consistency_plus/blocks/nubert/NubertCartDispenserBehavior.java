package io.github.consistencyplus.consistency_plus.blocks.nubert;

import io.github.consistencyplus.consistency_plus.items.NubertMinecartItem;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.minecraft.block.AbstractRailBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.ItemDispenserBehavior;
import net.minecraft.block.enums.RailShape;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class NubertCartDispenserBehavior extends ItemDispenserBehavior {
	public static final NubertCartDispenserBehavior INSTANCE = new NubertCartDispenserBehavior();
	private static final ItemDispenserBehavior defaultBehavior = new ItemDispenserBehavior();

	public ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {
		Direction direction = pointer.getBlockState().get(DispenserBlock.FACING);
		World world = pointer.getWorld();
		double xPos = pointer.getX() + direction.getOffsetX() * 1.125;
		double yPos = Math.floor(pointer.getY()) + direction.getOffsetY();
		double zPos = pointer.getZ() + direction.getOffsetZ() * 1.125;
		BlockPos railPos = pointer.getPos().offset(direction);
		BlockState blockState = world.getBlockState(railPos);
		RailShape railShape = blockState.getBlock() instanceof AbstractRailBlock
				? blockState.get(((AbstractRailBlock)blockState.getBlock()).getShapeProperty())
				: RailShape.NORTH_SOUTH;
		double yOffset;
		if (blockState.isIn(BlockTags.RAILS)) {
			if (railShape.isAscending()) {
				yOffset = 0.6;
			} else {
				yOffset = 0.1;
			}
		} else {
			if (!blockState.isAir() || !world.getBlockState(railPos.down()).isIn(BlockTags.RAILS)) {
				return defaultBehavior.dispense(pointer, stack);
			}

			BlockState belowRail = world.getBlockState(railPos.down());
			RailShape shapeBelow = belowRail.getBlock() instanceof AbstractRailBlock rail
					? belowRail.get(rail.getShapeProperty())
					: RailShape.NORTH_SOUTH;
			if (direction != Direction.DOWN && shapeBelow.isAscending()) {
				yOffset = -0.4;
			} else {
				yOffset = -0.9;
			}
		}

		// only change from the behavior in MinecartItem
		boolean wig = stack.getItem() instanceof NubertMinecartItem cart && cart.wig;
		NubertMinecartEntity entity = new NubertMinecartEntity(world, xPos, yPos + yOffset, zPos, wig);

		if (stack.hasCustomName()) {
			entity.setCustomName(stack.getName());
		}

		world.spawnEntity(entity);
		stack.decrement(1);
		return stack;
	}

	public static void register() {
		DispenserBlock.registerBehavior(CPlusItems.NUBERT_MINECART.get(), INSTANCE);
		DispenserBlock.registerBehavior(CPlusItems.WIGGED_NUBERT_MINECART.get(), INSTANCE);
	}
}

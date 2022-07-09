package io.github.consistencyplus.consistency_plus.blocks.nubert;

import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.ItemDispenserBehavior;
import net.minecraft.entity.vehicle.MinecartEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.List;

public class NubertDispenserBehavior extends ItemDispenserBehavior {
	public static final NubertDispenserBehavior INSTANCE = new NubertDispenserBehavior();
	public static final ItemDispenserBehavior DEFAULT_BEHAVIOR = new ItemDispenserBehavior();

	public ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {
		if (stack.getItem() instanceof BlockItem b && b.getBlock() instanceof NubertBlock nubert) {
			Direction direction = pointer.getBlockState().get(DispenserBlock.FACING);
			World world = pointer.getWorld();
			BlockPos targetPos = pointer.getPos().offset(direction);
			List<MinecartEntity> carts = world.getEntitiesByClass(MinecartEntity.class, new Box(targetPos), (e) -> !e.hasCustomBlock());
			for (MinecartEntity cart : carts) {
				cart.setCustomBlock(nubert.getDefaultState());
				stack.decrement(1);
				return stack; // exit early. only affect first cart
			}
		}
		return DEFAULT_BEHAVIOR.dispense(pointer, stack);
	}
}

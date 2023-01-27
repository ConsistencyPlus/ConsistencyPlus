package io.github.consistencyplus.consistency_plus.blocks.nubert;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusEntities;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class NubertMinecartEntity extends AbstractMinecartEntity implements Nubert {
	public static final TrackedData<Boolean> WIG = DataTracker.registerData(NubertMinecartEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
	public static final Type TYPE = Type.valueOf("CONSISTENCY_PLUS_NUBERT");
	public static final String WIG_KEY = "Wig";

	protected boolean wig = false;

	public NubertMinecartEntity(EntityType<?> entityType, World world) {
		super(entityType, world);
	}

	public NubertMinecartEntity(World world, double x, double y, double z, boolean wig) {
		super(CPlusEntities.NUBERT_CART.get(), world, x, y, z);
		setWig(wig);
	}

	@Override
	protected void initDataTracker() {
		super.initDataTracker();
		dataTracker.startTracking(WIG, false);
	}

	@Override
	public void onTrackedDataSet(TrackedData<?> data) {
		super.onTrackedDataSet(data);
		if (WIG.equals(data)) {
			wig = dataTracker.get(WIG);
		}
	}

	@Override
	public ActionResult interact(PlayerEntity player, Hand hand) {
		ItemStack held = player.getStackInHand(hand);
		if (player.world.isClient())
			return ActionResult.SUCCESS;
		if (held.isEmpty()) {
			return rotateNubert();
		} else if (wig && held.isOf(Items.SHEARS)) {
			return removeWig(player, hand, held);
		} else if (!wig && held.isOf(Items.YELLOW_WOOL)) {
			return addWig(held);
		}
		return ActionResult.PASS;
	}

	protected ActionResult rotateNubert() {
		BlockState current = getContainedBlock();
		Direction facing = current.get(NubertBlock.FACING);
		BlockState newbert = current.with(NubertBlock.FACING, facing.rotateYClockwise());
		setCustomBlock(newbert);
		playSound(SoundEvents.ENTITY_ITEM_FRAME_ROTATE_ITEM, 1, 1);
		return ActionResult.SUCCESS;
	}

	protected ActionResult addWig(ItemStack held) {
		BlockState current = getContainedBlock();
		Direction facing = current.get(NubertBlock.FACING);
		BlockState newbert = CPlusBlocks.WIGGED_NUBERT.get()
				.getDefaultState()
				.with(NubertBlock.FACING, facing);
		setCustomBlock(newbert);
		setWig(true);
		held.decrement(1);
		playSound(SoundEvents.BLOCK_WOOL_PLACE, 1, 1);
		return ActionResult.SUCCESS;
	}

	protected ActionResult removeWig(PlayerEntity player, Hand hand, ItemStack held) {
		BlockState current = getContainedBlock();
		Direction facing = current.get(NubertBlock.FACING);
		BlockState newbert = CPlusBlocks.NUBERT.get()
				.getDefaultState()
				.with(NubertBlock.FACING, facing);
		setCustomBlock(newbert);
		setWig(false);
		held.damage(1, player, user -> user.sendToolBreakStatus(hand));
		playSound(SoundEvents.ENTITY_SHEEP_SHEAR, 1, 1);
		if (!player.isCreative()) {
			dropItem(Items.YELLOW_WOOL);
		}
		return ActionResult.SUCCESS;
	}

	@Override
	protected void writeCustomDataToNbt(NbtCompound nbt) {
		super.writeCustomDataToNbt(nbt);
		nbt.putBoolean(WIG_KEY, wig);
	}

	@Override
	protected void readCustomDataFromNbt(NbtCompound nbt) {
		super.readCustomDataFromNbt(nbt);
		setWig(nbt.getBoolean(WIG_KEY));
	}

	@Override
	public BlockState getDefaultContainedBlock() {
		return (wig ? CPlusBlocks.WIGGED_NUBERT : CPlusBlocks.NUBERT).get().getDefaultState();
	}

	@Override
	public Item getItem() {
		return (wig ? CPlusItems.WIGGED_NUBERT_MINECART : CPlusItems.NUBERT_MINECART).get();
	}

	@Override
	public ItemStack getPickBlockStack() {
		return getItem().getDefaultStack();
	}

	@Override
	public Type getMinecartType() {
		return TYPE;
	}

	protected void setWig(boolean wig) {
		dataTracker.set(WIG, wig);
		// will call onTrackedDataSet
	}

	public boolean hasWig() {
		return wig;
	}

	@Override
	public boolean isCart() {
		return true;
	}
}

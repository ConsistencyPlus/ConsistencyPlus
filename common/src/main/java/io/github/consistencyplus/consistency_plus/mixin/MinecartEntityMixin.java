package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertBlock;
import io.github.consistencyplus.consistency_plus.blocks.nubert.WiggedNubertBlock;
import io.github.consistencyplus.consistency_plus.core.MinecartEntityExtensions;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.MinecartEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.minecraft.block.HorizontalFacingBlock.FACING;

@Mixin(MinecartEntity.class)
public abstract class MinecartEntityMixin extends AbstractMinecartEntityMixin implements MinecartEntityExtensions {
	public MinecartEntityMixin(EntityType<?> entityType, World world) {
		super(entityType, world);
	}
	
	@Inject(at = @At("HEAD"), method = "interact", cancellable = true)
	private void cPlus$handleNubertCartsOnInteract(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
		if (hand == Hand.MAIN_HAND) {
			ItemStack heldStack = player.getMainHandStack();
			if (customBlock.getBlock() instanceof NubertBlock) {
				if (heldStack.isEmpty()) {
					cir.setReturnValue(rotateNubert());
				} else if (heldStack.isOf(Items.YELLOW_WOOL)) {
					if (customBlock.isOf(CPlusBlocks.NUBERT.get())) {
						cir.setReturnValue(setWiggedNubert(false));
						return;
					}
				} else if (heldStack.isOf(Items.SHEARS)) {
					if (customBlock.isOf(CPlusBlocks.WIGGED_NUBERT.get())) {
						cir.setReturnValue(setNubert(true));
						return;
					}
				}
				cir.setReturnValue(ActionResult.PASS);
			} else if (customBlock.isAir()) {
				if (heldStack.isOf(CPlusItems.NUBERT.get())) {
					ActionResult result = setNubert(false);
					if (result == ActionResult.SUCCESS) {
						if (!world.isClient() && !player.isCreative()) {
							heldStack.decrement(1);
						}
						
					}
					cir.setReturnValue(result);
				} else if (heldStack.isOf(CPlusItems.WIGGED_NUBERT.get())) {
					ActionResult result = setWiggedNubert(true);
					if (result == ActionResult.SUCCESS) {
						if (!world.isClient() && !player.isCreative()) {
							heldStack.decrement(1);
						}
					}
					cir.setReturnValue(result);
					cir.cancel();
				}
			}
		}
	}
	
	@Nullable
	@Override
	public ItemStack getPickBlockStack() {
		if (customBlock.getBlock() instanceof NubertBlock nubert) {
			return (nubert instanceof WiggedNubertBlock ? CPlusItems.WIGGED_NUBERT : CPlusItems.NUBERT).get().getDefaultStack();
		}
		return super.getPickBlockStack();
	}
	
	@Override
	public void dropItems(DamageSource damageSource) {
		super.dropItems(damageSource);
		if (this.world.getGameRules().getBoolean(GameRules.DO_ENTITY_DROPS)) {
			if (customBlock.getBlock() instanceof NubertBlock nubert) {
				ItemStack toDrop = (nubert instanceof WiggedNubertBlock ? CPlusItems.WIGGED_NUBERT : CPlusItems.NUBERT).get().getDefaultStack();
				dropStack(toDrop);
			}
		}
	}
	
	private ActionResult rotateNubert() {
		if (!world.isClient()) {
			setCustomBlock(customBlock.with(FACING, customBlock.get(FACING).rotateYClockwise()));
		}
		world.playSound(null, getBlockPos(), SoundEvents.ENTITY_ITEM_FRAME_ADD_ITEM, SoundCategory.BLOCKS, 1.0F, 1.0F);
		return ActionResult.SUCCESS;
	}
	
	private ActionResult setNubert(boolean sheared) {
		if (customBlock.isOf(CPlusBlocks.NUBERT.get())) {
			return ActionResult.PASS;
		}
		if (!world.isClient()) {
			BlockState state = customBlock.getBlock() instanceof NubertBlock
					? CPlusBlocks.NUBERT.get().getDefaultState().with(FACING, customBlock.get(FACING))
					: CPlusBlocks.NUBERT.get().getDefaultState();
			setCustomBlock(state);
		}
		world.playSound(null, getBlockPos(),
				sheared ? SoundEvents.ENTITY_SHEEP_SHEAR : SoundEvents.BLOCK_SLIME_BLOCK_PLACE, // if not sheared, it was direct
				SoundCategory.BLOCKS, 1.0F, 1.0F);
		return ActionResult.SUCCESS;
	}
	
	private ActionResult setWiggedNubert(boolean direct) {
		if (customBlock.isOf(CPlusBlocks.WIGGED_NUBERT.get())) {
			return ActionResult.PASS;
		}
		if (!world.isClient()) {
			BlockState state = customBlock.getBlock() instanceof NubertBlock
					? CPlusBlocks.WIGGED_NUBERT.get().getDefaultState().with(FACING, customBlock.get(FACING))
					: CPlusBlocks.WIGGED_NUBERT.get().getDefaultState();
			setCustomBlock(state);
		}
		world.playSound(null, getBlockPos(),
				direct ? SoundEvents.BLOCK_SLIME_BLOCK_PLACE : SoundEvents.BLOCK_WOOL_PLACE, // if not direct, it was wool
				SoundCategory.BLOCKS, 1.0F, 1.0F);
		return ActionResult.SUCCESS;
	}
	
	@Override
	public BlockState getCustomBlock() {
		return customBlock;
	}
}

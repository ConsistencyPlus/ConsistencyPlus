package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertBlock;
import io.github.consistencyplus.consistency_plus.blocks.nubert.WiggedNubertBlock;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
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
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.minecraft.block.HorizontalFacingBlock.FACING;

@Mixin(MinecartEntity.class)
public abstract class MinecartEntityMixin extends AbstractMinecartEntityMixin {
	public MinecartEntityMixin(EntityType<?> entityType, World world) {
		super(entityType, world);
	}

	@Inject(at = @At("HEAD"), method = "interact", cancellable = true)
	private void cPlus$handleNubertCartsOnInteract(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> cir) {
		BlockState customBlock = getContainedBlock();
		ItemStack held = player.getStackInHand(hand);
		if (customBlock.getBlock() instanceof NubertBlock) {
			NubertBlock nubert = (NubertBlock)customBlock.getBlock();
			if (nubert instanceof WiggedNubertBlock) {
				if (held.isItemEqualIgnoreDamage(Items.SHEARS.getDefaultStack())) {
					cir.setReturnValue(setNubert(true, held));
					return;
				}
			} else {
				if (held.isItemEqual(Items.YELLOW_WOOL.getDefaultStack())) {
					cir.setReturnValue(setWiggedNubert(false, held));
					return;
				}
			}
			if (held.isEmpty() && hand == Hand.MAIN_HAND) {
				cir.setReturnValue(rotateNubert());
			}
			cir.setReturnValue(ActionResult.PASS);
		} else if (customBlock.isAir()) {
			if (held.isItemEqual(CPlusItems.NUBERT.getDefaultStack())) {
				cir.setReturnValue(setNubert(false, held));
			} else if (held.isItemEqual(CPlusItems.WIGGED_NUBERT.getDefaultStack())) {
				cir.setReturnValue(setWiggedNubert(true, held));
			}
		}
	}

	@Override
	public void dropItems(DamageSource damageSource) {
		super.dropItems(damageSource);
		if (this.world.getGameRules().getBoolean(GameRules.DO_ENTITY_DROPS)) {
			if (getContainedBlock().getBlock() instanceof NubertBlock) {
				NubertBlock nubert = (NubertBlock)getContainedBlock().getBlock();
				ItemStack toDrop = (nubert instanceof WiggedNubertBlock ? CPlusItems.WIGGED_NUBERT : CPlusItems.NUBERT).getDefaultStack();
				dropStack(toDrop);
			}
		}
	}

	private ActionResult rotateNubert() {
		BlockState customBlock = getContainedBlock();
		if (!world.isClient()) {
			setCustomBlock(customBlock.with(FACING, customBlock.get(FACING).rotateYClockwise()));
		}
		world.playSound(null, getBlockPos(), SoundEvents.ENTITY_ITEM_FRAME_ADD_ITEM, SoundCategory.BLOCKS, 1.0F, 1.0F);
		return ActionResult.SUCCESS;
	}

	private ActionResult setNubert(boolean sheared, ItemStack held) {
		BlockState customBlock = getContainedBlock();
		if (customBlock.isOf(CPlusBlocks.NUBERT)) {
			return ActionResult.PASS;
		}
		BlockState state = customBlock.getBlock() instanceof NubertBlock
				? CPlusBlocks.NUBERT.getDefaultState().with(FACING, customBlock.get(FACING))
				: CPlusBlocks.NUBERT.getDefaultState();
		setCustomBlock(state);
		world.playSound(null, getBlockPos(),
				sheared ? SoundEvents.ENTITY_SHEEP_SHEAR : SoundEvents.BLOCK_SLIME_BLOCK_PLACE, // if not sheared, it was direct
				SoundCategory.BLOCKS, 1.0F, 1.0F);
		if (!sheared) {
			held.decrement(1);
		}
		return ActionResult.SUCCESS;
	}

	private ActionResult setWiggedNubert(boolean direct, ItemStack held) {
		BlockState customBlock = getContainedBlock();
		if (customBlock.isOf(CPlusBlocks.WIGGED_NUBERT)) {
			return ActionResult.PASS;
		}
		BlockState state = customBlock.getBlock() instanceof NubertBlock
				? CPlusBlocks.WIGGED_NUBERT.getDefaultState().with(FACING, customBlock.get(FACING))
				: CPlusBlocks.WIGGED_NUBERT.getDefaultState();
		setCustomBlock(state);
		world.playSound(null, getBlockPos(),
				direct ? SoundEvents.BLOCK_SLIME_BLOCK_PLACE : SoundEvents.BLOCK_WOOL_PLACE, // if not direct, it was wool
				SoundCategory.BLOCKS, 1.0F, 1.0F);
		if (direct) {
			held.decrement(1);
		}
		return ActionResult.SUCCESS;
	}
}

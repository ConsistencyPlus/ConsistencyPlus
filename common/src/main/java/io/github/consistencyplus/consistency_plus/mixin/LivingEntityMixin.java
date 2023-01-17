package io.github.consistencyplus.consistency_plus.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.tag.BlockTags;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {
	private LivingEntityMixin(EntityType<?> entityType, World world) {
		super(entityType, world);
	}
	
	@Inject(at = @At("HEAD"), method = "isOnSoulSpeedBlock()Z", cancellable = true)
	protected void cPlus$handleSoulSpeedForSlabsAndFences(CallbackInfoReturnable<Boolean> cir) {
		// check feet pos block, not just the block below
		if (world.getBlockState(getBlockPos()).isIn(BlockTags.SOUL_SPEED_BLOCKS)) {
			cir.setReturnValue(true);
		}
	}
}

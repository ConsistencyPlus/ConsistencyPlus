package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {
	protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
		super(entityType, world);
	}
	
	@Inject(at = @At("TAIL"), method = "updateTurtleHelmet()V")
	private void cPlus$updateTurtleArmor(CallbackInfo ci) {
		if (getEquippedStack(EquipmentSlot.FEET).isOf(CPlusItems.TURTLE_BOOTS.get()) && !isSubmergedInWater()) {
			addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 200, 0, false, false, true));
		}
		if (getEquippedStack(EquipmentSlot.FEET).isOf(CPlusItems.TURTLE_BOOTS.get()) &&
				getEquippedStack(EquipmentSlot.LEGS).isOf(CPlusItems.TURTLE_LEGGINGS.get()) &&
				getEquippedStack(EquipmentSlot.CHEST).isOf(CPlusItems.TURTLE_CHESTPLATE.get()) &&
				getEquippedStack(EquipmentSlot.HEAD).isOf(Items.TURTLE_HELMET)
				&& !isSubmergedInWater()) {
			addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 0, false, false, true));
		}
	}
}

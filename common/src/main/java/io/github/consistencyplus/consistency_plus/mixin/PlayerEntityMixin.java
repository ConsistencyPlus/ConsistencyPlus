package io.github.consistencyplus.consistency_plus.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Supplier;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {
	protected PlayerEntityMixin(EntityType<? extends LivingEntity> entityType, World world) {
		super(entityType, world);
	}
	@Shadow
	public abstract ItemStack getEquippedStack(EquipmentSlot slot);

	@Unique
	private static final Map<EquipmentSlot, Item> cPlus$turtleEquipment = Map.of(
			EquipmentSlot.HEAD, Items.TURTLE_HELMET,
			EquipmentSlot.CHEST, Registry.ITEM.get(new Identifier("consistency_plus", "turtle_chestplate")),
			EquipmentSlot.LEGS, Registry.ITEM.get(new Identifier("consistency_plus", "turtle_leggings")),
			EquipmentSlot.FEET, Registry.ITEM.get(new Identifier("consistency_plus", "turtle_boots"))
	);
	
	@Inject(at = @At("TAIL"), method = "updateTurtleHelmet()V")
	private void cPlus$updateTurtleArmor(CallbackInfo ci) {
		// all effects are applied constantly out of water, so they have a 10-second timer in-water
		if (isSubmergedInWater())
			return;

		// turtle boots give dolphin's grace
		if (getEquippedStack(EquipmentSlot.FEET).isOf(Registry.ITEM.get(new Identifier("consistency_plus", "turtle_boots")))) {
			addStatusEffect(new StatusEffectInstance(
					StatusEffects.DOLPHINS_GRACE,
					200,
					0,
					false,
					false,
					true
			));
		}

		// full armor set gives resistance
		boolean allEquipped = true;
		for (Entry<EquipmentSlot, Item> entry : cPlus$turtleEquipment.entrySet()) {
			EquipmentSlot slot = entry.getKey();
			Item item = entry.getValue();
			if (!getEquippedStack(slot).isOf(item))
				allEquipped = false;
		}
		if (allEquipped) {
			addStatusEffect(new StatusEffectInstance(
					StatusEffects.RESISTANCE,
					200,
					0,
					false,
					false,
					true
			));
		}
	}
}

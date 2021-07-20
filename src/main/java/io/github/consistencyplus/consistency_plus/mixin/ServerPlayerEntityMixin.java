package io.github.consistencyplus.consistency_plus.mixin;

//import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
//import net.minecraft.entity.effect.StatusEffectInstance;
//import net.minecraft.entity.effect.StatusEffects;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.item.ItemStack;
//import net.minecraft.server.network.ServerPlayerEntity;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.Unique;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
//
//@Mixin(ServerPlayerEntity.class) // do not uncomment this it is not done let me finish it once I get back
//public class ServerPlayerEntityMixin extends PlayerEntity {
//	@Unique
//	private long ticksUntilEffectApplies = 1;
//	@Unique
//	private boolean wearingTurtleBoots = false;
//
//	@Inject(at = @At("HEAD"), method = "tick()V")
//	public void tick(CallbackInfo ci) {
//		for (ItemStack stack : getArmorItems()) {
//			if (stack.getItem().equals(CPlusItems.TURTLE_BOOTS)) {
//				wearingTurtleBoots = true;
//				break;
//			}
//			wearingTurtleBoots = false;
//		}
//
//		if (ticksUntilEffectApplies > 0) ticksUntilEffectApplies--;
//		if (wearingTurtleBoots) {
//			if (ticksUntilEffectApplies == 0) {
//				addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 200, 0));
//				ticksUntilEffectApplies = 199;
//			}
//		}
//	}
//}

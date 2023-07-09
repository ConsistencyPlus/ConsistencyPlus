package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.registry.CPlusTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.block.RespawnAnchorBlock;
import net.minecraft.item.ItemStack;

@Mixin(RespawnAnchorBlock.class)
public class RespawnAnchorBlockMixin {
	@Inject(method = "isChargeItem", at = @At("HEAD"), cancellable = true)
	private static void cPlus$glowstoneRecharges(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
		if (stack.isIn(CPlusTags.CHARGES_RESPAWN_ANCHOR))
			cir.setReturnValue(Boolean.TRUE);
	}
}

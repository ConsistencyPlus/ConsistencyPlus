package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.core.StonecutterHandler;
import io.github.consistencyplus.consistency_plus.core.StonecutterScreenHandlerExtensions;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.StonecutterScreenHandler;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "net.minecraft.screen.StonecutterScreenHandler$2")
public class StonecutterScreenHandlerOutputSlotMixin {
	@Dynamic
	@Shadow // this error is a lie
	private StonecutterScreenHandler field_17639;
	
	@ModifyConstant(method = "onTakeItem", constant = @Constant(intValue = 1))
	private int redirectIntToShrinkInput(int original) {
		ItemStack inputStack = field_17639.input.getStack(0);
		int toTake = StonecutterHandler.getCountForItem(inputStack);
		if (toTake > inputStack.getCount()) {
			return 0;
		}
		return StonecutterHandler.getCountForItem(inputStack.getItem());
	}
	
	@Inject(at = @At(value = "INVOKE", target = "Lnet/minecraft/screen/StonecutterScreenHandler;populateResult()V"), method = "onTakeItem")
	private void setCraftingPreCraft(PlayerEntity player, ItemStack stack, CallbackInfo ci) {
		((StonecutterScreenHandlerExtensions) field_17639).setCrafting(true);
	}
	
	@Inject(at = @At(value = "INVOKE", target = "Lnet/minecraft/screen/StonecutterScreenHandler;populateResult()V", shift = At.Shift.AFTER), method = "onTakeItem")
	private void setCraftingPostCraft(PlayerEntity player, ItemStack stack, CallbackInfo ci) {
		((StonecutterScreenHandlerExtensions) field_17639).setCrafting(false);
	}
}

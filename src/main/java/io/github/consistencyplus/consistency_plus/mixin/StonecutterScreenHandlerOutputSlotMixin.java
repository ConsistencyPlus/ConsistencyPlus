package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.core.StonecutterTagRecipeHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.StonecutterScreenHandler;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(targets = "net.minecraft.screen.StonecutterScreenHandler$2")
public class StonecutterScreenHandlerOutputSlotMixin {
	@Dynamic
	@Shadow // this error is a lie
	private StonecutterScreenHandler field_17639;
	
	@ModifyConstant(method = "onTakeItem", constant = @Constant(intValue = 1))
	private int redirectIntToShrinkInput(int original) {
		ItemStack inputStack = field_17639.input.getStack(0);
		int toTake = StonecutterTagRecipeHandler.getItemCraftCount(inputStack);
		if (toTake > inputStack.getCount()) {
			return 0;
		}
		return StonecutterTagRecipeHandler.getItemCraftCount(inputStack.getItem());
	}
}

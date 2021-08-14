package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.core.StonecutterScreenHandlerExtensions;
import io.github.consistencyplus.consistency_plus.core.TagUtil;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.StonecuttingRecipe;
import net.minecraft.screen.Property;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.StonecutterScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.tag.Tag;
import net.minecraft.util.Pair;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Mixin(StonecutterScreenHandler.class)
public abstract class StonecutterScreenHandlerMixin extends ScreenHandler implements StonecutterScreenHandlerExtensions {
	@Unique
	private final List<ItemStack> recipes = new ArrayList<>();
	@Shadow
	@Final
	private Property selectedRecipe;
	@Shadow
	@Final
	private Slot outputSlot;
	@Shadow
	private List<StonecuttingRecipe> availableRecipes;
	@Unique
	private ItemStack selectedStack;
	@Unique
	private boolean optimizedRecipeMode = false;
	protected StonecutterScreenHandlerMixin(@Nullable ScreenHandlerType<?> type, int syncId) {
		super(type, syncId);
	}

	@Shadow
	protected abstract boolean isInBounds(int id);
	
	@Shadow
	abstract void populateResult();
	
	@Shadow @Final private Slot inputSlot;
	
	@Inject(at = @At("HEAD"), method = "updateInput", cancellable = true)
	private void updateInput(Inventory input, ItemStack stack, CallbackInfo ci) {
		recipes.clear();
		if (!stack.isEmpty()) {
			Pair<Boolean, Tag<Block>> result = TagUtil.blockHasOptimizedStonecutterRecipe(stack);
			if (result.getLeft()) {
				for (Block block : result.getRight().values()) {
					if (!stack.isOf(block.asItem())) {
						recipes.add(new ItemStack(block.asItem()));
					}
				}
				optimizedRecipeMode = true;
				availableRecipes.clear();
				selectedRecipe.set(-1);
				outputSlot.setStack(ItemStack.EMPTY);
				ci.cancel();
			}
		}
		if (!ci.isCancelled()) {
			optimizedRecipeMode = false;
		}
	}
	
	@Inject(at = @At("HEAD"), method = "isInBounds", cancellable = true)
	private void isInBounds(int id, CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(optimizedRecipeMode()
				? id >= 0 && id < recipes.size()
				: id >= 0 && id < availableRecipes.size());
	}
	
	@Inject(at = @At("HEAD"), method = "onButtonClick", cancellable = true)
	private void onButtonClick(PlayerEntity player, int id, CallbackInfoReturnable<Boolean> cir) {
		if (optimizedRecipeMode()) {
			if (isInBounds(id)) {
				this.selectedRecipe.set(id);
				this.selectedStack = recipes.get(id);
				populateResult();
				cir.setReturnValue(true);
			}
		}
	}
	
	@Inject(at = @At("HEAD"), method = "populateResult", cancellable = true)
	private void populateResult(CallbackInfo ci) {
		if (optimizedRecipeMode()) {
			if (!this.recipes.isEmpty()) {
				this.outputSlot.setStack(recipes.get(selectedRecipe.get()).copy());
			} else {
				this.outputSlot.setStack(ItemStack.EMPTY);
			}
			
			this.sendContentUpdates();
			ci.cancel();
		}
	}
	
	@Inject(at = @At("HEAD"), method = "canCraft", cancellable = true)
	private void canCraft(CallbackInfoReturnable<Boolean> cir) {
		if (optimizedRecipeMode()) {
			cir.setReturnValue(inputSlot.hasStack() && !recipes.isEmpty());
		}
	}
	
	@Redirect(at = @At(value = "INVOKE", target = "Ljava/util/Optional;isPresent()Z"), method = "transferSlot")
	public boolean transferSlot(Optional optional) {
		return true;
	}
	
	@Override
	public boolean optimizedRecipeMode() {
		return optimizedRecipeMode;
	}
	
	@Override
	public List<ItemStack> getRecipeStacks() {
		return recipes;
	}
}

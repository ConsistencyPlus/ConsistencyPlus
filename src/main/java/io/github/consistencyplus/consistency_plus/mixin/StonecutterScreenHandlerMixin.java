package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.core.StonecutterTagRecipeHandler;
import io.github.consistencyplus.consistency_plus.core.StonecutterScreenHandlerExtensions;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
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
	private List<ItemStack> recipes = new ArrayList<>();
	@Shadow
	@Final
	Slot outputSlot;
	@Shadow
	@Final
	Slot inputSlot;
	@Shadow
	@Final
	private Property selectedRecipe;
	@Shadow
	private List<StonecuttingRecipe> availableRecipes;
	@Unique
	private boolean tagRecipeMode = false;
	@Shadow
	private ItemStack inputStack;
	
	protected StonecutterScreenHandlerMixin(@Nullable ScreenHandlerType<?> type, int syncId) {
		super(type, syncId);
	}
	
	@Shadow
	protected abstract boolean isInBounds(int id);
	
	@Shadow
	abstract void populateResult();
	
	@Inject(at = @At("HEAD"), method = "updateInput", cancellable = true)
	private void updateInput(Inventory input, ItemStack stack, CallbackInfo ci) {
		recipes = new ArrayList<>();
		if (!stack.isEmpty()) {
			List<Tag<Item>> tags = StonecutterTagRecipeHandler.getRecipeTags(stack);
			if (!tags.isEmpty() && StonecutterTagRecipeHandler.getItemCraftCount(stack) <= stack.getCount()) {
				List<Item> items = new ArrayList<>();
				for (Tag<Item> tag : tags) {
					for (Item item : tag.values()) {
						if (!stack.isOf(item) && !items.contains(item)) {
							items.add(item);
						}
					}
				}
				recipes = items.stream().map(ItemStack::new).toList();
				tagRecipeMode = true;
				availableRecipes.clear();
				selectedRecipe.set(-1);
				outputSlot.setStack(ItemStack.EMPTY);
				ci.cancel();
			}
		}
		if (!ci.isCancelled()) {
			tagRecipeMode = false;
		}
	}
	
	@Inject(at = @At("HEAD"), method = "isInBounds", cancellable = true)
	private void isInBounds(int id, CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(tagRecipeMode()
				? id >= 0 && id < recipes.size()
				: id >= 0 && id < availableRecipes.size());
	}
	
	@Inject(at = @At("HEAD"), method = "onButtonClick", cancellable = true)
	private void onButtonClick(PlayerEntity player, int id, CallbackInfoReturnable<Boolean> cir) {
		if (tagRecipeMode()) {
			int required = StonecutterTagRecipeHandler.getItemCraftCount(inputSlot.getStack());
			if (inputSlot.getStack().getCount() >= required) {
				if (isInBounds(id)) {
					this.selectedRecipe.set(id);
					populateResult();
				}
			}
			cir.setReturnValue(true);
		}
	}
	
	@Redirect(method = "onContentChanged", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
	private boolean onContentsChanged(ItemStack itemStack, Item item) {
		// inputStack is old item
		// itemStack is new item
		boolean differentItem = !itemStack.isOf(inputStack.getItem());
		int lastCount = inputStack.getCount();
		int lastRequiredCount = StonecutterTagRecipeHandler.getItemCraftCount(inputSlot.getStack());
		int newCount = itemStack.getCount();
		int newRequiredCount = StonecutterTagRecipeHandler.getItemCraftCount(itemStack);
		boolean nowMeetsCountRequirement = lastCount < lastRequiredCount && newCount >= newRequiredCount;
		boolean noLongerMeetsCountRequirement = newCount < newRequiredCount && lastCount >= lastRequiredCount;
		return !(differentItem || nowMeetsCountRequirement || noLongerMeetsCountRequirement); // redirected method is inverted, invert here to make it Good:tm:
	}
	
	@Inject(at = @At("HEAD"), method = "populateResult", cancellable = true)
	private void populateResult(CallbackInfo ci) {
		if (tagRecipeMode()) {
			int neededCount = StonecutterTagRecipeHandler.getItemCraftCount(inputSlot.getStack());
			if (!this.recipes.isEmpty() && inputSlot.getStack().getCount() >= neededCount) {
				ItemStack stack = recipes.get(selectedRecipe.get()).copy();
				stack.setCount(StonecutterTagRecipeHandler.getItemCraftCount(stack.getItem()));
				outputSlot.setStack(stack);
			} else {
				recipes.clear();
				outputSlot.setStack(ItemStack.EMPTY);
			}
			
			sendContentUpdates();
			ci.cancel();
		}
	}
	
	@Inject(at = @At("HEAD"), method = "canCraft", cancellable = true)
	private void canCraft(CallbackInfoReturnable<Boolean> cir) {
		if (tagRecipeMode()) {
			cir.setReturnValue(inputSlot.hasStack() && !recipes.isEmpty());
		}
	}
	
	@Redirect(at = @At(value = "INVOKE", target = "Ljava/util/Optional;isPresent()Z"), method = "transferSlot")
	public boolean transferSlot(Optional optional) {
		return true;
	}
	
	@Override
	public boolean tagRecipeMode() {
		return tagRecipeMode;
	}
	
	@Override
	public List<ItemStack> getRecipeStacks() {
		return recipes;
	}
}

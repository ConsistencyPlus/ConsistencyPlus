package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.core.StonecutterScreenHandlerExtensions;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.StonecutterScreen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.StonecutterScreenHandler;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Environment(EnvType.CLIENT)
@Mixin(StonecutterScreen.class)
public abstract class StonecutterScreenMixin extends HandledScreen<StonecutterScreenHandler> {
	@Shadow
	private int scrollOffset;
	
	@Shadow
	private boolean canCraft;
	
	public StonecutterScreenMixin(StonecutterScreenHandler handler, PlayerInventory inventory, Text title) {
		super(handler, inventory, title);
	}
	
	@Inject(at = @At("HEAD"), method = "renderRecipeIcons", cancellable = true)
	private void renderRecipeIcons(int x, int y, int scrollOffset, CallbackInfo ci) {
		StonecutterScreenHandlerExtensions extendedHandler = (StonecutterScreenHandlerExtensions) handler;
		if (extendedHandler.tagRecipeMode()) {
			List<ItemStack> list = extendedHandler.getRecipeStacks();
			for (int i = this.scrollOffset; i < scrollOffset && i < list.size(); i++) {
				ItemStack stack = list.get(i);
				int j = i - this.scrollOffset;
				int k = x + j % 4 * 16;
				int l = j / 4;
				int m = y + l * 18 + 2;
				this.client.getItemRenderer().renderInGuiWithOverrides(stack, k, m);
			}
			ci.cancel();
		}
	}
	
	@Inject(at = @At("HEAD"), method = "renderRecipeBackground")
	private void renderRecipeBackground(MatrixStack matrices, int mouseX, int mouseY, int x, int y, int scrollOffset, CallbackInfo ci) {
		StonecutterScreenHandlerExtensions extendedHandler = (StonecutterScreenHandlerExtensions) handler;
		if (extendedHandler.tagRecipeMode()) {
			List<ItemStack> stacks = extendedHandler.getRecipeStacks();
			
			for (int i = this.scrollOffset; i < scrollOffset && i < stacks.size(); ++i) {
				int j = i - this.scrollOffset;
				int k = x + j % 4 * 16;
				int l = j / 4;
				int m = y + l * 18 + 2;
				int n = this.backgroundHeight;
				if (i == this.handler.getSelectedRecipe()) {
					n += 18;
				} else if (mouseX >= k && mouseY >= m && mouseX < k + 16 && mouseY < m + 18) {
					n += 36;
				}
				
				this.drawTexture(matrices, k, m - 1, 0, n, 16, 18);
			}
		}
	}
	
	@Inject(at = @At("HEAD"), method = "drawMouseoverTooltip", cancellable = true)
	private void drawMouseoverTooltip(MatrixStack matrices, int x, int y, CallbackInfo ci) {
		StonecutterScreenHandlerExtensions extendedHandler = (StonecutterScreenHandlerExtensions) handler;
		if (extendedHandler.tagRecipeMode()) {
			super.drawMouseoverTooltip(matrices, x, y);
			if (canCraft) {
				int i = this.x + 52;
				int j = this.y + 14;
				int k = this.scrollOffset + 12;
				List<ItemStack> list = extendedHandler.getRecipeStacks();
				
				for (int l = this.scrollOffset; l < k && l < list.size(); ++l) {
					int m = l - this.scrollOffset;
					int n = i + m % 4 * 16;
					int o = j + m / 4 * 18 + 2;
					if (x >= n && x < n + 16 && y >= o && y < o + 18) {
						this.renderTooltip(matrices, list.get(l), x, y);
					}
				}
			}
			ci.cancel();
		}
	}
	
	@Inject(at = @At("HEAD"), method = "shouldScroll", cancellable = true)
	private void shouldScroll(CallbackInfoReturnable<Boolean> cir) {
		StonecutterScreenHandlerExtensions extendedHandler = (StonecutterScreenHandlerExtensions) handler;
		if (extendedHandler.tagRecipeMode()) {
			cir.setReturnValue(canCraft && extendedHandler.getRecipeStacks().size() > 12);
		}
	}
	
	@Inject(at = @At("HEAD"), method = "getMaxScroll", cancellable = true)
	private void getMaxScroll(CallbackInfoReturnable<Integer> cir) {
		StonecutterScreenHandlerExtensions extendedHandler = (StonecutterScreenHandlerExtensions) handler;
		if (extendedHandler.tagRecipeMode()) {
			cir.setReturnValue((extendedHandler.getRecipeStacks().size() + 4 - 1) / 4 - 3);
		}
	}
}

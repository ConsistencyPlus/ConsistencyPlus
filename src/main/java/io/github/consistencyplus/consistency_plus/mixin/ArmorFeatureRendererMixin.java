package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ArmorFeatureRenderer.class)
public abstract class ArmorFeatureRendererMixin {
	@Inject(at = @At("HEAD"), method = "getArmorTexture(Lnet/minecraft/item/ArmorItem;ZLjava/lang/String;)Lnet/minecraft/util/Identifier;", cancellable = true)
	private void cPlus$getTurtleArmorTexture(ArmorItem item, boolean legs, @Nullable String overlay, CallbackInfoReturnable<Identifier> cir) {
		if (item.equals(CPlusItems.TURTLE_BOOTS) || item.equals(CPlusItems.TURTLE_LEGGINGS) || item.equals(CPlusItems.TURTLE_CHESTPLATE)) {
			String string = "textures/models/armor/" + item.getMaterial().getName() + "_layer_" + (legs ? 2 : 1) + (overlay == null ? "" : "_" + overlay) + ".png";
			cir.setReturnValue(new Identifier("consistency_plus", string));
		}
	}
}

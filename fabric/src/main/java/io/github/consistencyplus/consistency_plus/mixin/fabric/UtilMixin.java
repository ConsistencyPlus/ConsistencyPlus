package io.github.consistencyplus.consistency_plus.mixin.fabric;

import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.types.Type;
import net.minecraft.util.Util;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Util.class)
public class UtilMixin {
	@Inject(
			method = "getChoiceTypeInternal",
			at = @At(
					value = "INVOKE",
					target = "Lorg/slf4j/Logger;error(Ljava/lang/String;Ljava/lang/Object;)V",
					remap = false
			),
			cancellable = true
	)
	private static void cPlus$silenceDatafixerWarning(TypeReference typeReference, String id, CallbackInfoReturnable<@Nullable Type<?>> cir) {
		if (id.startsWith("consistency_plus:"))
			cir.setReturnValue(null); // shut
	}
}

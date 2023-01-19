package io.github.consistencyplus.consistency_plus.mixin;

import com.google.common.collect.ImmutableMap.Builder;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusClientMain;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModels;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Map;

@Mixin(EntityModels.class)
public class EntityModelsMixin {
	@Inject(
			method = "getModels",
			at = @At(
					value = "INVOKE",
					target = "Lcom/google/common/collect/ImmutableMap$Builder;build()Lcom/google/common/collect/ImmutableMap;",
					remap = false
			),
			locals = LocalCapture.CAPTURE_FAILHARD
	)
	private static void cPlus$addNubertCartModel(CallbackInfoReturnable<Map<EntityModelLayer, TexturedModelData>> cir,
												 Builder<EntityModelLayer, TexturedModelData> builder,
												 TexturedModelData zombie, TexturedModelData zombieOuterArmor,
												 TexturedModelData piglinOuterArmor, TexturedModelData bipedInnerArmor,
												 TexturedModelData minecart) {
		builder.put(ConsistencyPlusClientMain.NUBERT_CART, minecart);
	}
}

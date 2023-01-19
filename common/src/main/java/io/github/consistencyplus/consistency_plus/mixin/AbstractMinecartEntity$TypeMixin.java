package io.github.consistencyplus.consistency_plus.mixin;

import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.entity.vehicle.AbstractMinecartEntity.Type;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;

@Mixin(value = AbstractMinecartEntity.Type.class, priority = 2395) // random priority to hopefully apply in a consistent order, extra safety
public class AbstractMinecartEntity$TypeMixin {
	@Final
	@Mutable
	@Shadow(aliases = { "field_7673", "f_vsosozul" }) // yarn, qm
	private static Type[] $VALUES; // moj

	@Invoker("<init>")
	private static Type cPlus$createType(String name, int ordinal) {
		throw new IllegalStateException("mixin failed");
	}

	@Inject(
			method = "<clinit>",
			at = @At("TAIL")
	)
	private static void cPlus$addNubertType(CallbackInfo ci) {
		ArrayList<Type> types = new ArrayList<>(List.of($VALUES));
		types.add(cPlus$createType("CONSISTENCY_PLUS_NUBERT", $VALUES.length));
		$VALUES = types.toArray(Type[]::new);
	}
}

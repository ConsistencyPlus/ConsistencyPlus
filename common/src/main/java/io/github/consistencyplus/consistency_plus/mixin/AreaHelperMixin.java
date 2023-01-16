package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.dimension.AreaHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AreaHelper.class)
public abstract class AreaHelperMixin {
	@Inject(
			method = { // IS_VALID_FRAME_BLOCK predicate
					"method_30487", // yarn
					"m_uenhrluo", // qm
					"lambda$static$0" // moj
			},
			at = @At("RETURN"),
			cancellable = true,
			remap = false
	)
	private static void cPlus$allowPortalsFromCustomObsidian(BlockState state, BlockView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
		if (CPlusBlocks.isValidPortalBlock(state)) {
			cir.setReturnValue(true);
		}
	}
}

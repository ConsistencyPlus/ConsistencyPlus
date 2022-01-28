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
public class AreaHelperMixin {
	// IS_VALID_FRAME_BLOCK predicate				// fabric			// forge
	@Inject(at = @At("RETURN"), require = 0, method = {"method_30487", "lambda$static$0"}, cancellable = true, remap = false)
	private static void cPlus$allowPortalsFromCustomObsidian(BlockState state, BlockView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
		if (CPlusBlocks.isValidPortalBlock(state)) {
			cir.setReturnValue(true);
		}
	}
}

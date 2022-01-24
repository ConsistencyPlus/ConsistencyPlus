package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.blocks.obsidian.ObsidianBlock;
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
	// IS_VALID_FRAME_BLOCK predicate
	@Inject(at = @At("RETURN"), method = "method_30487", cancellable = true, remap = false)
	private static void cPlus$allowPortalsFromCustomObsidian(BlockState state, BlockView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
		if (ObsidianBlock.isValidPortalBlock(state)) {
			cir.setReturnValue(true);
		}
	}
}

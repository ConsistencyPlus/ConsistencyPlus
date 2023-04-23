package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.PistonBlock;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Debug(export = true)
@Mixin(PistonBlock.class)
public class PistonBlockMixin {
    @Inject(at = @At("HEAD"), method = "isMovable(Lnet/minecraft/block/BlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Direction;ZLnet/minecraft/util/math/Direction;)Z", cancellable = true)
    private static void cPlus$injectOurTag(BlockState state, World world, BlockPos pos, Direction direction, boolean canBreak, Direction pistonDir, CallbackInfoReturnable<Boolean> cir) {
        if (state.isIn(CPlusBlocks.BLOCKS_PISTONS)) {
            cir.setReturnValue(false);
        } else if (state.isIn(CPlusBlocks.PISTON_PUSH_ONLY)) {
            cir.setReturnValue(direction == pistonDir);
        }
    }
}

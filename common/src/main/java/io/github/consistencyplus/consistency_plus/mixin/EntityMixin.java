package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.blocks.base.CPlusSlabBlock;
import io.github.consistencyplus.consistency_plus.blocks.base.CPlusStairsBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = Entity.class, priority = 999)
public abstract class EntityMixin {
    @Inject(method = "getVelocityAffectingPos()Lnet/minecraft/util/math/BlockPos;", at = @At("RETURN"), cancellable = true)
    private void consistencyPlus$UseSlabsAndStairsForVelocity(CallbackInfoReturnable<BlockPos> cir) {
        Entity self = (Entity) (Object) this;
        BlockPos inPos = new BlockPos(self.getBlockPos());
        Block inBlock = self.getWorld().getBlockState(inPos).getBlock();
        if (inBlock instanceof CPlusSlabBlock || inBlock instanceof CPlusStairsBlock) {
            cir.setReturnValue(inPos);
        }
    }
}
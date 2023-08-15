package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.blocks.*;
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
    private void consistencyPlus$UseSlabsAndWallsForVelocity(CallbackInfoReturnable<BlockPos> cir) {
        Entity self = (Entity)((Object) this);
        Block inBlock = self.getWorld().getBlockState(self.getBlockPos()).getBlock();
        if (inBlock instanceof CPlusSlabBlock || inBlock instanceof CPlusStairsBlock) {
            Block underBlock = self.getWorld().getBlockState(self.getBlockPos().down()).getBlock();
            cir.setReturnValue(new BlockPos(self.getBlockPos().getX(), (int) Math.floor(self.getBoundingBox().minY - (underBlock instanceof CPlusFenceBlock || underBlock instanceof CPlusFenceGateBlock || underBlock instanceof CPlusWallBlock ? 0.5000001 : 0.2500001)), self.getBlockPos().getZ()));
        }
    }
}
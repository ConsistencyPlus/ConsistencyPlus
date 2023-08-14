package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.blocks.CPlusFenceBlock;
import io.github.consistencyplus.consistency_plus.blocks.CPlusFenceGateBlock;
import io.github.consistencyplus.consistency_plus.blocks.CPlusWallBlock;
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
    private void consistencyPlus$UseTallBlocksForVelocity(CallbackInfoReturnable<BlockPos> cir) {
        Entity self = (Entity)((Object) this);
        Block underBlock = self.getWorld().getBlockState(self.getBlockPos().down()).getBlock();
        if (underBlock instanceof CPlusFenceBlock || underBlock instanceof CPlusFenceGateBlock || underBlock instanceof CPlusWallBlock) {
            cir.setReturnValue(new BlockPos(self.getBlockPos().getX(), (int) Math.floor(self.getBoundingBox().minY - 0.5000001), self.getBlockPos().getZ()));
        }
    }
}
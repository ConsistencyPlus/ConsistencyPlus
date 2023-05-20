package io.github.consistencyplus.consistency_plus.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = Entity.class, priority = 999)
public abstract class EntityMixin {
    @Inject(method = "getVelocityAffectingPos()Lnet/minecraft/util/math/BlockPos;", at = @At("RETURN"), cancellable = true)
    private void consistencyPlus$nullifiedVelocity(CallbackInfoReturnable<BlockPos> cir) {
        BlockPos velocityAffectingPos = velocityFix(((Entity)((Object) this)));
        cir.setReturnValue(velocityAffectingPos);
    }

    private static BlockPos velocityFix(Entity entity) {
        double yvalue = entity.getBoundingBox().minY - 0.2500001;
        BlockState underBlock = entity.getWorld().getBlockState(entity.getBlockPos().down());
        BlockPos velocityAffectingPos;
        if (underBlock.isIn(BlockTags.WALLS) || underBlock.isIn(BlockTags.FENCE_GATES) || underBlock.isIn(BlockTags.FENCES)) yvalue = entity.getBoundingBox().minY - 0.5000001;
        velocityAffectingPos = new BlockPos(entity.getBlockPos().getX(), yvalue, entity.getBlockPos().getZ());
        return velocityAffectingPos;
    }
}
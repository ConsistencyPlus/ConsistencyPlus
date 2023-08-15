package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = Entity.class, priority = 999)
public abstract class EntityMixin {
    @Inject(method = "getVelocityAffectingPos()Lnet/minecraft/util/math/BlockPos;", at = @At("RETURN"), cancellable = true)
    private void consistencyPlus$UseSlabsAndStairsForVelocity(CallbackInfoReturnable<BlockPos> cir) {
        Entity self = (Entity) (Object) this;
        World world = self.getWorld();
        BlockPos inPos = self.getBlockPos();
        Block inBlock = world.getBlockState(inPos).getBlock();
        if (inBlock instanceof CPlusSlabBlock || inBlock instanceof CPlusStairsBlock) {
            BlockPos underPos = inPos.down();
            BlockState underBlockState = world.getBlockState(underPos);
            Box underBlockBox = underBlockState.getCollisionShape(world, underPos, ShapeContext.of(self)).getBoundingBox();
            if (underBlockBox.getYLength() != 1.5 /* Use vanilla behaviour over ANY wall */) {
                cir.setReturnValue(self.getBlockPos().withY((int) Math.floor(self.getBoundingBox().minY - 0.2500001)));
            }
        }
    }
}
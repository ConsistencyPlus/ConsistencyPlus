package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.SlabType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = PlantBlock.class)
public class PlantBlockMixin {
    @Inject(
            method = "canPlantOnTop(Lnet/minecraft/block/BlockState;Lnet/minecraft/world/BlockView;Lnet/minecraft/util/math/BlockPos;)Z",
            at = @At("HEAD"),
            cancellable = true
    )
    private void cPlus$placeOnSlabsAndStairs(BlockState floor, BlockView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (floor.isIn(CPlusBlocks.DIRT_SLABS_TAG)) {
            if (floor.contains(SlabBlock.TYPE)) {
                if (floor.get(SlabBlock.TYPE).equals(SlabType.DOUBLE) || floor.get(SlabBlock.TYPE).equals(SlabType.TOP)) {
                    cir.setReturnValue(true);
                }
            }
        } else if (floor.isIn(CPlusBlocks.DIRT_STAIRS_TAG)) {
            if (floor.contains(StairsBlock.HALF)) {
                if (floor.get(StairsBlock.HALF).equals(BlockHalf.TOP)) {
                    cir.setReturnValue(true);
                }
            }
        }
    }
}

package net.consistencyteam.consistency_plus.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.consistencyteam.consistency_plus.ConsistencyPlus.DIRT_ID;

@Mixin(Block.class)
public abstract class BlockMixin {
    @Inject(at = @At("HEAD"), method = "Lnet/minecraft/block/Block;getDefaultState()Lnet/minecraft/block/BlockState;", cancellable = true)
    public final void getDefaultState(CallbackInfoReturnable<BlockState> cir) {
        if (((Block) ((Object) this)) == Blocks.DIRT) {
            cir.setReturnValue(Registry.BLOCK.get(DIRT_ID).getDefaultState());
        }
    }
}

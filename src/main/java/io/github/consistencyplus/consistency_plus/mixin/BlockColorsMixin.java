package io.github.consistencyplus.consistency_plus.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.GrassColors;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static io.github.consistencyplus.consistency_plus.registry.CPlusBlocks.*;

// couldn't figure out how to get grass working with the regular color provider method so here we are
@Environment(EnvType.CLIENT)
@Mixin(BlockColors.class)
public abstract class BlockColorsMixin {
    @Inject(at = @At("TAIL"), method = "Lnet/minecraft/client/color/block/BlockColors;create()Lnet/minecraft/client/color/block/BlockColors;")
    private static void create(CallbackInfoReturnable<BlockColors> cir) {
        cir.getReturnValue().registerColorProvider((state, world, pos, tintIndex) -> {
            return world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.getColor(0.5D, 1.0D);
        }, GRASS_SLAB, GRASS_STAIRS, GRASS_WALL);

    }
}

package net.consistencyteam.consistency_plus.mixin;

import net.consistencyteam.consistency_plus.base.HasGrownGrassVariant;
import net.consistencyteam.consistency_plus.base.HasUngrownVariant;
import net.consistencyteam.consistency_plus.base.IsSpreadableGrassBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SnowyBlock;
import net.minecraft.block.SpreadableBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(SpreadableBlock.class)
public abstract class SpreadableBlockMixin extends SnowyBlock implements HasUngrownVariant, IsSpreadableGrassBlock {
	protected SpreadableBlockMixin(Settings settings) {
		super(settings);
	}

	@Inject(at = @At("HEAD"), method = "Lnet/minecraft/block/SpreadableBlock;randomTick(Lnet/minecraft/block/BlockState;Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", cancellable = true)
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random, CallbackInfo ci) {
		grow(state, world, pos, random);
		ci.cancel();
	}
}

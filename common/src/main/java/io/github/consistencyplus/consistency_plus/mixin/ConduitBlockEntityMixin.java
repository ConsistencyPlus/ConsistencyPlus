package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import net.minecraft.block.entity.ConduitBlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(ConduitBlockEntity.class)
public abstract class ConduitBlockEntityMixin {
	// thank you forge, very cool
	// regression preventing ModifyArgs requires this evil.
	private static final ThreadLocal<List<BlockPos>> cPlus$captureActivatingBlocks = new ThreadLocal<>();
	private static final ThreadLocal<World> cPlus$captureWorld = new ThreadLocal<>();
	
	@Inject(method = "updateActivatingBlocks", at = @At("HEAD"))
	private static void cPlus$updateActivatingBlocks(World world, BlockPos pos, List<BlockPos> activatingBlocks, CallbackInfoReturnable<Boolean> cir) {
		cPlus$captureActivatingBlocks.set(activatingBlocks);
		cPlus$captureWorld.set(world);
	}
	
	@ModifyArg(
			method = "updateActivatingBlocks",
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/world/World;getBlockState(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockState;"
			)
	)
	private static BlockPos cPlus$updateActivatingBlocks(BlockPos blockPos2) {
		if (CPlusBlocks.isValidConduitBlock(cPlus$captureWorld.get().getBlockState(blockPos2))) {
			cPlus$captureActivatingBlocks.get().add(blockPos2);
		}
		return blockPos2;
	}
}

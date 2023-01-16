package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.blocks.growing.DirtGrowth;
import io.github.consistencyplus.consistency_plus.blocks.growing.GrowthEntry;
import io.github.consistencyplus.consistency_plus.blocks.growing.SpreadType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SpreadableBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(SpreadableBlock.class)
public abstract class SpreadableBlockMixin {
	@Inject(
			method = "randomTick",
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/server/world/ServerWorld;getBlockState(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/BlockState;",
					ordinal = 0
			),
			locals = LocalCapture.CAPTURE_FAILHARD
	)
	@SuppressWarnings("ConstantConditions")
	private void cPlus$spreadOtherBlockTypes(BlockState state, ServerWorld world, BlockPos pos, Random random, CallbackInfo ci,
											 BlockState thisDefaultState, int i, BlockPos spreadPos) {
		boolean grass = (Object) this == Blocks.GRASS_BLOCK;
		boolean mycelium = (Object) this == Blocks.MYCELIUM;
		if (!grass && !mycelium)
			return; // only affect vanilla's grass and mycelium
		BlockState initialState = world.getBlockState(spreadPos);
		if (initialState.isOf(Blocks.DIRT))
			return; // vanilla logic will handle it, do nothing
		GrowthEntry entry = DirtGrowth.getEntry(initialState.getBlock());
		if (entry == null || initialState.getBlock() != entry.dirt) // only spread to dirt
			return;
		if (entry.allowsSpread(initialState, world, spreadPos)) {
			SpreadType type = grass ? SpreadType.GRASS : SpreadType.MYCELIUM;
			BlockState grownState = type.getAndProcessGrownState(entry, initialState, world, spreadPos);
			world.setBlockState(spreadPos, grownState);
		}
	}
}

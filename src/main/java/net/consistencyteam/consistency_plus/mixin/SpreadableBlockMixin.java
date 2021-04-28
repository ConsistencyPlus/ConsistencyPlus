package net.consistencyteam.consistency_plus.mixin;

import net.consistencyteam.consistency_plus.base.HasGrownGrassVariant;
import net.consistencyteam.consistency_plus.base.HasUngrownVariant;
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
public abstract class SpreadableBlockMixin extends SnowyBlock implements HasUngrownVariant {
	protected SpreadableBlockMixin(Settings settings) {
		super(settings);
	}
	
	@Shadow
	private static boolean canSurvive(BlockState state, WorldView worldView, BlockPos pos) {
		return false;
	}
	
	@Shadow
	private static boolean canSpread(BlockState state, WorldView worldView, BlockPos pos) {
		return false;
	}
	
	@Inject(at = @At("HEAD"), method = "Lnet/minecraft/block/SpreadableBlock;randomTick(Lnet/minecraft/block/BlockState;Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", cancellable = true)
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random, CallbackInfo ci) {
		if (!canSurvive(state, world, pos)) {
			world.setBlockState(pos, getUngrownVariant(world, pos));
		} else {
			if (world.getLightLevel(pos.up()) >= 9) {
				BlockState blockState = this.getDefaultState();
				
				for (int i = 0; i < 4; ++i) {
					BlockPos blockPos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
					if (world.getBlockState(blockPos).isOf(Blocks.DIRT) && canSpread(blockState, world, blockPos)) {
						if (world.getBlockState(blockPos.up()).isOf(Blocks.SNOW_BLOCK) || world.getBlockState(blockPos.up()).isOf(Blocks.SNOW)) {
							world.setBlockState(blockPos, Blocks.GRASS_BLOCK.getDefaultState().with(SNOWY, true));
							continue;
						}
						world.setBlockState(blockPos, Blocks.GRASS_BLOCK.getDefaultState());
						continue;
					}
					
					if (world.getBlockState(blockPos).getBlock() instanceof HasGrownGrassVariant && canSpread(blockState, world, blockPos)) {
						HasGrownGrassVariant targetBlock = (HasGrownGrassVariant) world.getBlockState(blockPos).getBlock();
						if (world.getBlockState(blockPos.up()).isOf(Blocks.SNOW_BLOCK) || world.getBlockState(blockPos.up()).isOf(Blocks.SNOW)) {
							world.setBlockState(blockPos, targetBlock.getGrownGrassVariant(world, blockPos).with(SNOWY, true));
							continue;
						}
						world.setBlockState(blockPos, targetBlock.getGrownGrassVariant(world, blockPos));
						continue;
					}
				}
			}
		}
	}
}

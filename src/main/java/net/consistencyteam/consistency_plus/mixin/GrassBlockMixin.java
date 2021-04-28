package net.consistencyteam.consistency_plus.mixin;

import net.consistencyteam.consistency_plus.base.HasUngrownVariant;
import net.minecraft.block.BlockState;
import net.minecraft.block.GrassBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

import static net.minecraft.block.Blocks.DIRT;

@Mixin(GrassBlock.class)
public abstract class GrassBlockMixin implements HasUngrownVariant {
	@Override
	public BlockState getUngrownVariant(World world, BlockPos pos) {
		return Registry.BLOCK.get(Registry.BLOCK.getRawId(DIRT)).getDefaultState();
	}
}

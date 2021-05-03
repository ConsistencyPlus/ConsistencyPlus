package net.consistencyteam.consistency_plus.mixin;

import net.consistencyteam.consistency_plus.base.HasUngrownVariant;
import net.consistencyteam.consistency_plus.base.IsSpreadableGrassBlock;
import net.consistencyteam.consistency_plus.base.IsSpreadableMyceliumBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.MyceliumBlock;
import net.minecraft.block.SpreadableBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;

import java.util.Random;

import static net.consistencyteam.consistency_plus.ConsistencyPlus.DIRT_ID;

@Mixin(MyceliumBlock.class)
public class MyceliumBlockMixin extends SpreadableBlock implements HasUngrownVariant, IsSpreadableMyceliumBlock {
	
	protected MyceliumBlockMixin(Settings settings) {
		super(settings);
	}
	
	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		grow(state, world, pos, random);
	}
	
	@Override
	public BlockState getUngrownVariant(World world, BlockPos pos) {
		return Registry.BLOCK.get(DIRT_ID).getDefaultState();
	}
}

package net.consistencyteam.consistency_plus.blocks.grass;

import net.consistencyteam.consistency_plus.base.HasGrownGrassVariant;
import net.consistencyteam.consistency_plus.base.HasUngrownVariant;
import net.consistencyteam.consistency_plus.base.IsSpreadableGrassBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.chunk.light.ChunkLightProvider;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

import static net.consistencyteam.consistency_plus.registry.Blocks.DIRT_SLAB;

// i think a lot of this class is unnecessary but please for the love of god do not touch it
public class GrassSlabBlock extends SlabBlock implements HasUngrownVariant, IsSpreadableGrassBlock {
	public GrassSlabBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public boolean canSurvive(BlockState state, WorldView worldView, BlockPos pos) {
		BlockState stateAbove = worldView.getBlockState(pos.up());
		if (stateAbove.isOf(Blocks.SNOW) && stateAbove.get(SnowBlock.LAYERS) == 1) {
			return true;
		} else if (stateAbove.getFluidState().getLevel() == 8) {
			return false;
		} else {
			if (worldView.getBlockState(pos).get(TYPE) == SlabType.TOP) {
				return true; // technically not correct but good enough
			}
			int i = ChunkLightProvider.getRealisticOpacity(worldView, state, pos, stateAbove, pos.up(), Direction.UP, stateAbove.getOpacity(worldView, pos.up()));
			return i < worldView.getMaxLightLevel();
		}
	}

	@Override
	public BlockState getUngrownVariant(World world, BlockPos pos) {
		if (world.getBlockState(pos) == getDefaultState().with(TYPE, SlabType.BOTTOM)) {
			return DIRT_SLAB.getDefaultState().with(TYPE, SlabType.BOTTOM);
		} else if (world.getBlockState(pos) == getDefaultState().with(TYPE, SlabType.DOUBLE)) {
			return DIRT_SLAB.getDefaultState().with(TYPE, SlabType.DOUBLE);
		} else {
			return DIRT_SLAB.getDefaultState().with(TYPE, SlabType.TOP);
		}
	}
}

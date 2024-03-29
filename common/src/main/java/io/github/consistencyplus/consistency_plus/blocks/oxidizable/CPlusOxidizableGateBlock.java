package io.github.consistencyplus.consistency_plus.blocks.oxidizable;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class CPlusOxidizableGateBlock extends FenceGateBlock implements Oxidizable {
    private final Oxidizable.OxidationLevel oxidationLevel;

    public CPlusOxidizableGateBlock(Oxidizable.OxidationLevel level, AbstractBlock.Settings settings) {
        super(settings);
        this.oxidationLevel = level;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    @Override
    public Oxidizable.OxidationLevel getDegradationLevel() {
        return this.oxidationLevel;
    }
}
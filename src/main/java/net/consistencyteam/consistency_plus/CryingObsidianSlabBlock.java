package net.consistencyteam.consistency_plus;

import java.util.Random;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CryingObsidianSlabBlock extends SlabBlock {

    public CryingObsidianSlabBlock (AbstractBlock.Settings settings) {
        super(settings);
    }

    public void randomDisplayTick(BlockState obsidianState, World world, BlockPos position, Random random) {
        if (random.nextInt(5) == 0) {
            for (int int_1 = 0; int_1 < random.nextInt(1) + 1; ++int_1) {
                world.addParticle(ParticleTypes.DRIPPING_OBSIDIAN_TEAR, (float) position.getX() + 0.5F, (float) position.getY(), (float) position.getZ() + 0.5F, random.nextFloat() / 2.0F, 5.0E-5D, random.nextFloat() / 2.0F);
            }
        }
    }
}

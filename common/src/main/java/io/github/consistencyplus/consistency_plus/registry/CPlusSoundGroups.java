package io.github.consistencyplus.consistency_plus.registry;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class CPlusSoundGroups {
    public static final BlockSoundGroup WITHER_BONES = new BlockSoundGroup(
            1.0F, 0.5F,
            SoundEvents.BLOCK_BONE_BLOCK_BREAK,
            SoundEvents.BLOCK_BONE_BLOCK_STEP,
            SoundEvents.BLOCK_BONE_BLOCK_PLACE,
            SoundEvents.BLOCK_BONE_BLOCK_HIT,
            SoundEvents.BLOCK_BONE_BLOCK_FALL
    );
}

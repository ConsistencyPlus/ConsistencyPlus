package io.github.consistencyplus.consistency_plus.registry;

import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import static net.minecraft.block.AbstractBlock.Settings;

public class CPlusBlockSettings {
    public static final Settings CALCITE = Settings.of(Material.STONE, MapColor.TERRACOTTA_WHITE).sounds(BlockSoundGroup.CALCITE).requiresTool().strength(0.75F);
    public static final Settings DRIPSTONE = Settings.of(Material.STONE, MapColor.TERRACOTTA_BROWN).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).requiresTool().strength(1.5F, 1.0F);
    public static final Settings TUFF = Settings.copy(Blocks.TUFF);
    public static final Settings SOUL_SANDSTONE = Settings.of(Material.STONE).strength(0.8F);
    public static final Settings WITHERED_BONE = Settings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(2.0F).sounds(CPlusSoundGroups.WITHER_BONES);

}

package io.github.consistencyplus.consistency_plus.registry;

import io.github.consistencyplus.consistency_plus.blocks.oxidizable.CPlusOxidizableFenceBlock;
import io.github.consistencyplus.consistency_plus.blocks.oxidizable.CPlusOxidizableGateBlock;
import io.github.consistencyplus.consistency_plus.blocks.oxidizable.CPlusOxidizablePillarBlock;
import io.github.consistencyplus.consistency_plus.blocks.oxidizable.CPlusOxidizableWallBlock;
import io.github.consistencyplus.consistency_plus.items.CPlusItemGroups;
import io.github.consistencyplus.consistency_plus.registry.families.BlockEntry;
import io.github.consistencyplus.consistency_plus.registry.families.BlockFamily;
import io.github.consistencyplus.consistency_plus.registry.families.BlockFamilyBuilder;
import io.github.consistencyplus.consistency_plus.util.LoaderUtils;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable.OxidationLevel;
import net.minecraft.block.OxidizableBlock;
import net.minecraft.block.OxidizableSlabBlock;
import net.minecraft.block.OxidizableStairsBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Util;

import static io.github.consistencyplus.consistency_plus.registry.families.BlockShape.*;
import static io.github.consistencyplus.consistency_plus.registry.families.BlockStyle.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CPlusBlockFamilies {
    public static final List<BlockFamily> ALL_FAMILIES = new ArrayList<>();

    public static final BlockFamily STONE = BlockFamily.builder("stone")
            .baseSettingsFrom(Blocks.STONE)
            // cobblestone is cobblestone, not cobbled_stone, so it needs to be explicitly defined
            .addKnownVariant(Blocks.COBBLESTONE, COBBLED, CUBE)
            .addKnownVariant(Blocks.COBBLESTONE_SLAB, COBBLED, SLAB)
            .addKnownVariant(Blocks.COBBLESTONE_STAIRS, COBBLED, STAIR)
            .addKnownVariant(Blocks.COBBLESTONE_WALL, COBBLED, WALL)
            .itemGroup(CPlusItemGroups.STONES)
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily CALCITE = BlockFamily.builder("calcite")
            .baseSettingsFrom(Blocks.CALCITE)
            .addKnownVariant(Blocks.CALCITE, PLAIN, CUBE)
            .itemGroup(CPlusItemGroups.STONES)
            .buildTo(ALL_FAMILIES);

    public static final Map<OxidationLevel, BlockFamily> COPPER = Util.make(new HashMap<>(), finalMap -> {
        BlockFamilyBuilder unaffectedBuilder = makeCopperFamily(OxidationLevel.UNAFFECTED);
        BlockFamilyBuilder exposedBuilder = makeCopperFamily(OxidationLevel.EXPOSED);
        BlockFamilyBuilder weatheredBuilder = makeCopperFamily(OxidationLevel.WEATHERED);
        BlockFamilyBuilder oxidizedBuilder = makeCopperFamily(OxidationLevel.OXIDIZED);

        BlockFamily unaffected = unaffectedBuilder.buildTo(ALL_FAMILIES);
        finalMap.put(OxidationLevel.UNAFFECTED, unaffected);
        BlockFamily exposed = exposedBuilder.oxidizedOf(unaffected).buildTo(ALL_FAMILIES);
        finalMap.put(OxidationLevel.EXPOSED, exposed);
        BlockFamily weathered = weatheredBuilder.oxidizedOf(exposed).buildTo(ALL_FAMILIES);
        finalMap.put(OxidationLevel.WEATHERED, weathered);
        BlockFamily oxidized = oxidizedBuilder.oxidizedOf(weathered).buildTo(ALL_FAMILIES);
        finalMap.put(OxidationLevel.OXIDIZED, oxidized);
    });

    public static final Map<OxidationLevel, BlockFamily> WAXED_COPPER = Util.make(new HashMap<>(), map -> {
        for (OxidationLevel level : OxidationLevel.values()) {
            map.put(level, BlockFamily.builder("waxed_" + getOxidationLevelName(level) + "_copper")
                    .baseSettingsFrom(Blocks.WAXED_COPPER_BLOCK)
                    .itemGroup(CPlusItemGroups.MISC)
                    .waxedOf(COPPER.get(level))
                    .buildTo(ALL_FAMILIES)
            );
        }
    });

    public static void init() {
        ALL_FAMILIES.forEach(BlockFamily::register);
    }

    @Environment(EnvType.CLIENT)
    public static void registerRenderLayers() {
        // no lambdas, they will explode
        for (BlockFamily family : ALL_FAMILIES) {
            RenderLayer layer = family.renderLayer.vanilla();
            for (BlockEntry entry : family.blockTable.values()) {
                LoaderUtils.registerBlockRenderLayer(entry.block(), layer);
            }
        }
    }

    private static BlockFamilyBuilder makeCopperFamily(OxidationLevel level) {
        return BlockFamily.builder(getOxidationLevelName(level) + "_copper")
                .baseSettingsFrom(Blocks.COPPER_BLOCK)
                .itemGroup(CPlusItemGroups.MISC)
                .setShapeFactory(CUBE, (settings, base) -> new OxidizableBlock(level, settings))
                .setShapeFactory(SLAB, (settings, base) -> new OxidizableSlabBlock(level, settings))
                .setShapeFactory(STAIR, (settings, base) -> new OxidizableStairsBlock(level, base.getDefaultState(), settings))
                .setShapeFactory(WALL, (settings, base) -> new CPlusOxidizableWallBlock(level, settings))
                .setShapeFactory(GATE, (settings, base) -> new CPlusOxidizableGateBlock(level, settings))
                .setShapeFactory(FENCE, (settings, base) -> new CPlusOxidizableFenceBlock(level, settings))
                .setShapeFactory(PILLAR, (settings, base) -> new CPlusOxidizablePillarBlock(level, settings));
    }

    private static String getOxidationLevelName(OxidationLevel level) {
        // obfuscated and not StringRepresentable
        return switch (level) {
            case UNAFFECTED -> "unaffected";
            case EXPOSED -> "exposed";
            case WEATHERED -> "weathered";
            case OXIDIZED -> "oxidized";
        };
    }
}

package io.github.consistencyplus.consistency_plus.registry;

import io.github.consistencyplus.consistency_plus.blocks.base.CPlusBlock;
import io.github.consistencyplus.consistency_plus.blocks.base.CPlusPillarBlock;
import io.github.consistencyplus.consistency_plus.blocks.oxidizable.*;
import io.github.consistencyplus.consistency_plus.items.CPlusItemGroups;
import io.github.consistencyplus.consistency_plus.items.CPlusItemGroups.GroupInfo;
import io.github.consistencyplus.consistency_plus.registry.families.BlockEntry;
import io.github.consistencyplus.consistency_plus.registry.families.BlockFamily;
import io.github.consistencyplus.consistency_plus.registry.families.BlockFamilyBuilder;
import io.github.consistencyplus.consistency_plus.registry.families.BlockShape;
import io.github.consistencyplus.consistency_plus.registry.families.CPlusRenderType;
import io.github.consistencyplus.consistency_plus.registry.families.factories.names.BlockSuffixBaseNameFactory;
import io.github.consistencyplus.consistency_plus.registry.families.factories.names.BrickNameFactory;
import io.github.consistencyplus.consistency_plus.registry.families.factories.names.CobblestoneNameFactory;
import io.github.consistencyplus.consistency_plus.registry.families.factories.names.CopperBlockNameFactory;
import io.github.consistencyplus.consistency_plus.registry.families.filters.BlockFilter;
import io.github.consistencyplus.consistency_plus.registry.families.filters.CopperFilter;
import io.github.consistencyplus.consistency_plus.registry.families.filters.SandstoneFilter;
import io.github.consistencyplus.consistency_plus.util.ColoredSet;
import io.github.consistencyplus.consistency_plus.util.LoaderUtils;
import io.github.consistencyplus.consistency_plus.util.VanillaDyeables;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Oxidizable.OxidationLevel;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Util;

import static io.github.consistencyplus.consistency_plus.registry.families.BlockFamily.builder;
import static io.github.consistencyplus.consistency_plus.registry.families.BlockShape.*;
import static io.github.consistencyplus.consistency_plus.registry.families.BlockStyle.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CPlusBlockFamilies {
    public static final List<BlockFamily> ALL_FAMILIES = new ArrayList<>();

    public static final BlockFamily STONE = builder("stone")
            .baseSettingsFrom(Blocks.STONE)
            .nameFactory(CobblestoneNameFactory.INSTANCE)
            .itemGroup(CPlusItemGroups.STONES)
            .buildTo(ALL_FAMILIES);

    // TODO: base is a pillar
    public static final BlockFamily DEEPSLATE = standardStone("deepslate", Blocks.DEEPSLATE);
    public static final BlockFamily BLACKSTONE = standardStone("blackstone", Blocks.BLACKSTONE);
    public static final BlockFamily GILDED_BLACKSTONE = standardStone("gilded_blackstone", Blocks.GILDED_BLACKSTONE);
    public static final BlockFamily ANDESITE = standardStone("andesite", Blocks.ANDESITE);
    public static final BlockFamily DIORITE = standardStone("diorite", Blocks.DIORITE);
    public static final BlockFamily GRANITE = standardStone("granite", Blocks.GRANITE);
    public static final BlockFamily TUFF = standardStone("tuff", Blocks.TUFF);
    public static final BlockFamily CALCITE = standardStone("calcite", Blocks.CALCITE);

    public static final BlockFamily DRIPSTONE = builder("dripstone")
            .baseSettingsFrom(Blocks.DRIPSTONE_BLOCK)
            .addKnownVariant(Blocks.DRIPSTONE_BLOCK, PLAIN, CUBE)
            .itemGroup(CPlusItemGroups.STONES)
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily SANDSTONE = builder("sandstone")
            .baseSettingsFrom(Blocks.SANDSTONE)
            .addKnownVariant(Blocks.CHISELED_SANDSTONE, CARVED, CUBE)
            // chiseled is renamed to carved
            .filter(SandstoneFilter.INSTANCE)
            .itemGroup(CPlusItemGroups.STONES)
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily RED_SANDSTONE = builder("red_sandstone")
            .baseSettingsFrom(Blocks.RED_SANDSTONE)
            .addKnownVariant(Blocks.CHISELED_RED_SANDSTONE, CARVED, CUBE)
            // chiseled is renamed to carved
            .filter(SandstoneFilter.INSTANCE)
            .itemGroup(CPlusItemGroups.STONES)
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily SOUL_SANDSTONE = standardStone("soul_sandstone", Blocks.SANDSTONE);
    public static final BlockFamily END_STONE = standardStone("end_stone", Blocks.END_STONE);

    public static final BlockFamily FLINT = builder("flint")
            .baseSettingsFrom(Blocks.BASALT)
            .nameFactory(BlockSuffixBaseNameFactory.INSTANCE)
            .itemGroup(CPlusItemGroups.STONES)
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily BEDROCK = standardStone("bedrock", Blocks.BEDROCK);

    public static final ColoredSet<BlockFamily> TERRACOTTA = ColoredSet.of(color -> {
       String name = color == null ? "terracotta" : color.getName() + "_terracotta";
       Block base = VanillaDyeables.TERRACOTTA.get(color);
       return color != null ? standardDyed(name, base) : builder(name)
               .baseSettingsFrom(base)
               .itemGroup(CPlusItemGroups.DYEABLES)
               .nameFactory(BrickNameFactory.INSTANCE)
               .noBrickItem()
               .buildTo(ALL_FAMILIES);
    });

    public static final ColoredSet<BlockFamily> GLAZED_TERRACOTTA = ColoredSet.of(color -> {
        String name = color == null ? "glazed_terracotta" : color.getName() + "_glazed_terracotta";
        Block base = color == null ? Blocks.WHITE_GLAZED_TERRACOTTA : VanillaDyeables.GLAZED_TERRACOTTA.get(color);
        return builder(name)
                .baseSettingsFrom(base)
                .setShapeFactory(CUBE, (style, settings, b) -> style == PLAIN ? new GlazedTerracottaBlock(settings) : new Block(settings))
                .itemGroup(CPlusItemGroups.DYEABLES)
                .buildTo(ALL_FAMILIES);
    });

    public static final ColoredSet<BlockFamily> CONCRETE = ColoredSet.of(color -> {
        String name = color == null ? "concrete" : color.getName() + "_concrete";
        Block base = color == null ? Blocks.WHITE_CONCRETE : VanillaDyeables.CONCRETE.get(color);
        return standardDyed(name, base);
    });

    // TODO: tinted glass

    public static final BlockFamily NETHERRACK = BlockFamily.builder("netherrack")
            .baseSettingsFrom(Blocks.NETHER_BRICKS) // TODO: ???
            .itemGroup(CPlusItemGroups.MISC)
            .noBrickItem()
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily CRIMSON_WART = builder("crimson_wart")
            .baseSettingsFrom(Blocks.NETHER_WART_BLOCK)
            .addKnownVariant(Blocks.NETHER_WART_BLOCK, PLAIN, CUBE)
            .itemGroup(CPlusItemGroups.MISC)
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily WARPED_WART = builder("warped_wart")
            .baseSettingsFrom(Blocks.WARPED_WART_BLOCK)
            .settings(settings -> settings.mapColor(MapColor.CYAN))
            .addKnownVariant(Blocks.WARPED_WART_BLOCK, PLAIN, CUBE)
            .itemGroup(CPlusItemGroups.MISC)
            .buildTo(ALL_FAMILIES);

    // TODO: not stones? and base is a pillar
    public static final BlockFamily BASALT = builder("basalt")
            .baseSettingsFrom(Blocks.BASALT)
            .addKnownVariant(Blocks.POLISHED_BASALT, PLAIN, PILLAR)
            // we rename polished basalt to basalt pillar
            .filter((style, shape, familyName, name) -> {
                if (style == POLISHED && shape == CUBE) {
                    return true;
                } else if (style == PLAIN && shape == PILLAR) {
                    return false;
                }
                return !BlockFilter.isRegistered(name);
            })
            .itemGroup(CPlusItemGroups.MISC)
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily GLOWSTONE = builder("glowstone")
            .baseSettingsFrom(Blocks.GLOWSTONE)
            .settings(settings -> settings.luminance(state -> 15))
            .itemGroup(CPlusItemGroups.MISC)
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily QUARTZ = builder("quartz")
            .baseSettingsFrom(Blocks.QUARTZ_BLOCK)
            .addKnownVariant(Blocks.QUARTZ_BLOCK, PLAIN, CUBE)
            .addKnownVariant(Blocks.CHISELED_QUARTZ_BLOCK, CHISELED, CUBE)
            .itemGroup(CPlusItemGroups.MISC)
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily BONE = builder("bone")
            .baseSettingsFrom(Blocks.BONE_BLOCK)
            .nameFactory(BlockSuffixBaseNameFactory.INSTANCE)
            .itemGroup(CPlusItemGroups.MISC)
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily WITHERED_BONE = builder("withered_bone")
            .baseSettingsFrom(Blocks.BONE_BLOCK)
            .nameFactory(BlockSuffixBaseNameFactory.INSTANCE) // base is withered_bone_block
            // base block is a pillar, matches bone
            .setShapeFactory(CUBE, (style, settings, base) -> style == PLAIN ? new CPlusPillarBlock(settings) : new CPlusBlock(settings))
            .settings(settings -> settings
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .sounds(new BlockSoundGroup(
                            1, 0.5f,
                            SoundEvents.BLOCK_BONE_BLOCK_BREAK,
                            SoundEvents.BLOCK_BONE_BLOCK_STEP,
                            SoundEvents.BLOCK_BONE_BLOCK_PLACE,
                            SoundEvents.BLOCK_BONE_BLOCK_HIT,
                            SoundEvents.BLOCK_BONE_BLOCK_FALL
                    ))
            )
            .itemGroup(CPlusItemGroups.MISC)
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily OBSIDIAN = builder("obsidian")
            .baseSettingsFrom(Blocks.OBSIDIAN)
            .settings(settings -> settings.pistonBehavior(PistonBehavior.BLOCK))
            .itemGroup(CPlusItemGroups.MISC)
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily CRYING_OBSIDIAN = builder("crying_obsidian")
            .baseSettingsFrom(Blocks.CRYING_OBSIDIAN)
            .settings(settings -> settings
                    .pistonBehavior(PistonBehavior.BLOCK)
                    .luminance(state -> 10)
            )
            .itemGroup(CPlusItemGroups.MISC)
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily PURPUR = builder("purpur")
            .baseSettingsFrom(Blocks.PURPUR_BLOCK)
            .addKnownVariant(Blocks.PURPUR_BLOCK, TILE, CUBE)
            .addKnownVariant(Blocks.PURPUR_SLAB, TILE, SLAB)
            .addKnownVariant(Blocks.PURPUR_STAIRS, TILE, STAIRS)
            // we rename vanilla's plain purpur to tiles
            // register our plain in its place, do not register some of our tiles
            .filter((style, shape, familyName, name) -> switch (style) {
                case PLAIN -> true;
                case TILE -> shape != BlockShape.CUBE && shape != BlockShape.SLAB && shape != BlockShape.STAIRS;
                default -> !BlockFilter.isRegistered(name);
            })
            .nameFactory(BlockSuffixBaseNameFactory.INSTANCE) // purpur_block
            .itemGroup(CPlusItemGroups.MISC)
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily PRISMARINE = builder("prismarine")
            .baseSettingsFrom(Blocks.PRISMARINE)
            .settings(settings -> settings.mapColor(MapColor.DIAMOND_BLUE)) // TODO: why?
            .itemGroup(CPlusItemGroups.MISC)
            .noBrickItem()
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily DARK_PRISMARINE = builder("dark_prismarine")
            .baseSettingsFrom(Blocks.DARK_PRISMARINE)
            .settings(settings -> settings.mapColor(MapColor.CYAN)) // TODO: why?
            .itemGroup(CPlusItemGroups.MISC)
            .buildTo(ALL_FAMILIES);

    public static final Map<OxidationLevel, BlockFamily> COPPER = Util.make(new HashMap<>(), finalMap -> {
        // we rename vanilla's cut to tiles, need to add those variants
        BlockFamilyBuilder unaffectedBuilder = makeCopperFamily(OxidationLevel.UNAFFECTED)
                .addKnownVariant(Blocks.CUT_COPPER, TILE, CUBE);
        BlockFamilyBuilder exposedBuilder = makeCopperFamily(OxidationLevel.EXPOSED)
                .addKnownVariant(Blocks.EXPOSED_CUT_COPPER, TILE, CUBE);
        BlockFamilyBuilder weatheredBuilder = makeCopperFamily(OxidationLevel.WEATHERED)
                .addKnownVariant(Blocks.WEATHERED_CUT_COPPER, TILE, CUBE);
        BlockFamilyBuilder oxidizedBuilder = makeCopperFamily(OxidationLevel.OXIDIZED)
                .addKnownVariant(Blocks.OXIDIZED_CUT_COPPER, TILE, CUBE);

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
        // we rename vanilla's cut to tiles, need to add those variants
        Map<OxidationLevel, Block> baseTiles = Map.of(
                OxidationLevel.UNAFFECTED, Blocks.WAXED_CUT_COPPER,
                OxidationLevel.WEATHERED, Blocks.WAXED_WEATHERED_COPPER,
                OxidationLevel.EXPOSED, Blocks.WAXED_EXPOSED_CUT_COPPER,
                OxidationLevel.OXIDIZED, Blocks.WAXED_OXIDIZED_CUT_COPPER
        );
        for (OxidationLevel level : OxidationLevel.values()) {
            map.put(level, builder("waxed_" + getOxidationLevelName(level) + "copper")
                    .baseSettingsFrom(Blocks.WAXED_COPPER_BLOCK)
                    .addKnownVariant(baseTiles.get(level), TILE, CUBE)
                    .filter(CopperFilter.INSTANCE)
                    .nameFactory(new CopperBlockNameFactory(level, true))
                    .itemGroup(CPlusItemGroups.MISC)
                    .waxedOf(COPPER.get(level))
                    .buildTo(ALL_FAMILIES)
            );
        }
    });

    public static final BlockFamily SNOW = builder("snow")
            .baseSettingsFrom(Blocks.SNOW_BLOCK)
            .addKnownVariant(Blocks.SNOW_BLOCK, PLAIN, CUBE)
            .itemGroup(CPlusItemGroups.MISC)
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily ICE = builder("ice")
            .baseSettingsFrom(Blocks.ICE)
            .settings(Settings::nonOpaque) // TODO: why?
            .renderType(CPlusRenderType.TRANSLUCENT)
            .itemGroup(CPlusItemGroups.MISC)
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily PACKED_ICE = standardMisc("packed_ice", Blocks.PACKED_ICE);
    public static final BlockFamily BLUE_ICE = standardMisc("blue_ice", Blocks.BLUE_ICE);
    public static final BlockFamily CLAY = standardMisc("clay", Blocks.CLAY);
    public static final BlockFamily MUD = builder("mud")
            .baseSettingsFrom(Blocks.MUD)
            .filter((style, shape, familyName, name) -> {
                if (style == BRICK) {
                    return true; // vanilla has mud bricks, which will be automatically detected. They're for packed mud though
                }
                return !BlockFilter.isRegistered(name);
            })
            .itemGroup(CPlusItemGroups.MISC)
            .buildTo(ALL_FAMILIES);

    public static final BlockFamily PACKED_MUD = builder("packed_mud")
            .baseSettingsFrom(Blocks.MUD_BRICKS)
            // named wrong, won't be detected automatically
            .addKnownVariant(Blocks.MUD_BRICKS, BRICK, CUBE)
            .addKnownVariant(Blocks.MUD_BRICK_SLAB, BRICK, SLAB)
            .addKnownVariant(Blocks.MUD_BRICK_STAIRS, BRICK, STAIRS)
            .addKnownVariant(Blocks.MUD_BRICK_WALL, BRICK, WALL)
            .itemGroup(CPlusItemGroups.MISC)
            .buildTo(ALL_FAMILIES);

    // utils and stuff

    public static void init() {
        ALL_FAMILIES.forEach(BlockFamily::register);
    }

    public static void addItemsToGroup(RegistryKey<ItemGroup> groupKey, ItemGroup.Entries entries) {
        ALL_FAMILIES.forEach(family -> family.addItemsToGroup(groupKey, entries));
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

    private static BlockFamily standardStone(String name, Block base) {
        return standard(name, base, CPlusItemGroups.STONES);
    }

    private static BlockFamily standardDyed(String name, Block base) {
        return standard(name, base, CPlusItemGroups.DYEABLES);
    }

    private static BlockFamily standardMisc(String name, Block base) {
        return standard(name, base, CPlusItemGroups.MISC);
    }

    private static BlockFamily standard(String name, Block base, GroupInfo group) {
        return builder(name).baseSettingsFrom(base).itemGroup(group).buildTo(ALL_FAMILIES);
    }

    private static BlockFamilyBuilder makeCopperFamily(OxidationLevel level) {
        return builder(getOxidationLevelName(level) + "copper")
                .baseSettingsFrom(Blocks.COPPER_BLOCK)
                .itemGroup(CPlusItemGroups.MISC)
                .filter(CopperFilter.INSTANCE)
                .nameFactory(new CopperBlockNameFactory(level, false))
                .setShapeFactory(CUBE, (settings) -> new CPlusOxidizableBlock(level, settings))
                .setShapeFactory(SLAB, (settings) -> new CPlusOxidizableSlabBlock(level, settings))
                .setShapeFactory(STAIRS, (settings, base) -> new CPlusOxidizableStairsBlock(level, base.getDefaultState(), settings))
                .setShapeFactory(WALL, (settings) -> new CPlusOxidizableWallBlock(level, settings))
                .setShapeFactory(GATE, (settings) -> new CPlusOxidizableGateBlock(level, settings))
                .setShapeFactory(FENCE, (settings) -> new CPlusOxidizableFenceBlock(level, settings))
                .setShapeFactory(PILLAR, (settings) -> new CPlusOxidizablePillarBlock(level, settings))
                .setShapeFactory(CORNER_PILLAR, (settings -> new CPlusOxidizableBlock(level, settings)));
    }

    public static String getOxidationLevelName(OxidationLevel level) {
        // note: obfuscated and not StringRepresentable
        return switch (level) {
            case UNAFFECTED -> "";
            case EXPOSED -> "exposed_";
            case WEATHERED -> "weathered_";
            case OXIDIZED -> "oxidized_";
        };
    }
}

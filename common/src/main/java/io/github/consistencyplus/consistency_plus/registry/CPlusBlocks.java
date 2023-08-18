package io.github.consistencyplus.consistency_plus.registry;

import io.github.consistencyplus.consistency_plus.blocks.CPlusSlabBlock;
import io.github.consistencyplus.consistency_plus.blocks.CPlusStairsBlock;
import io.github.consistencyplus.consistency_plus.blocks.WarpedWartPlantBlock;
import io.github.consistencyplus.consistency_plus.blocks.oxidizable.CPlusOxidizableGateBlock;
import io.github.consistencyplus.consistency_plus.blocks.oxidizable.CPlusOxidizablePillarBlock;
import io.github.consistencyplus.consistency_plus.blocks.oxidizable.CPlusOxidizableWallBlock;
import io.github.consistencyplus.consistency_plus.items.NetheriteHorseArmorItem;
import net.minecraft.block.*;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

public class CPlusBlocks {
    // Todo: Make a better solution for this. Perhaps custom class that takes Identifier, and possibly a nullable Block.
    public static Map<Identifier, Function<AbstractBlock.Settings, Block>> registry = new TreeMap<>();
    public static Map<Identifier, Function<Item.Settings, Item>> itemRegistry = new LinkedHashMap<>();
    //block only
    //item only

    static {
        copper();
        waxedCopper();
        exposedCopper();
        waxedExposedCopper();
        weatheredCopper();
        waxedWeatheredExposedCopper();
        oxidizedCopper();
        waxedOxidizedExposedCopper();
        dyedTintedGlass();
        miscItems();
    }

    private static void copper() {
        registry.put(new Identifier("consistency_plus", "copper_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "copper_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "copper_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "copper_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "polished_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "polished_copper_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "polished_copper_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "polished_copper_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "polished_copper_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "copper_bricks"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "copper_brick_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "copper_brick_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "copper_brick_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "copper_brick_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "cut_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "cut_copper_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "cut_copper_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "cut_copper_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "cut_copper_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "copper_tile_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "copper_tile_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "smooth_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "smooth_copper_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "smooth_copper_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "smooth_copper_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "smooth_copper_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "chiseled_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "carved_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "copper_pillar"), settings -> new CPlusOxidizablePillarBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
        registry.put(new Identifier("consistency_plus", "copper_corner_pillar"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, settings));
    }

    private static void waxedCopper() {
        // TODO: Fix WoodType
        registry.put(new Identifier("consistency_plus", "waxed_copper_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_copper_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_copper_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_copper_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_polished_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_polished_copper_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_polished_copper_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_polished_copper_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_polished_copper_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_copper_bricks"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_copper_brick_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_copper_brick_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_copper_brick_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_copper_brick_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_cut_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_cut_copper_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_cut_copper_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_cut_copper_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_cut_copper_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_copper_tile_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_copper_tile_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_smooth_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_smooth_copper_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_smooth_copper_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_smooth_copper_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_smooth_copper_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_chiseled_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_carved_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_copper_pillar"), PillarBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_copper_corner_pillar"), Block::new);
    }

    private static void exposedCopper() {
        registry.put(new Identifier("consistency_plus", "exposed_copper_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_copper_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "exposed_copper_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_copper_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_polished_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_polished_copper_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_polished_copper_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "exposed_polished_copper_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_polished_copper_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_copper_bricks"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_copper_brick_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_copper_brick_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "exposed_copper_brick_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_copper_brick_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_cut_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_cut_copper_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_cut_copper_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "exposed_cut_copper_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_cut_copper_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_copper_tile_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_copper_tile_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_smooth_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_smooth_copper_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_smooth_copper_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "exposed_smooth_copper_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_smooth_copper_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_chiseled_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_carved_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_copper_pillar"), settings -> new CPlusOxidizablePillarBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
        registry.put(new Identifier("consistency_plus", "exposed_copper_corner_pillar"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.EXPOSED, settings));
    }

    private static void waxedExposedCopper() {
        registry.put(new Identifier("consistency_plus", "waxed_exposed_copper_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_copper_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_copper_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_copper_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_exposed_polished_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_polished_copper_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_polished_copper_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_polished_copper_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_polished_copper_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_exposed_copper_bricks"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_copper_brick_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_copper_brick_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_copper_brick_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_copper_brick_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_exposed_cut_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_cut_copper_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_cut_copper_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_cut_copper_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_cut_copper_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_exposed_copper_tile_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_copper_tile_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_exposed_smooth_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_smooth_copper_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_smooth_copper_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_smooth_copper_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_smooth_copper_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_exposed_chiseled_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_carved_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_copper_pillar"), PillarBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_exposed_copper_corner_pillar"), Block::new);
    }

    private static void weatheredCopper() {
        registry.put(new Identifier("consistency_plus", "weathered_copper_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_copper_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "weathered_copper_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_copper_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_polished_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_polished_copper_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_polished_copper_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "weathered_polished_copper_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_polished_copper_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_copper_bricks"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_copper_brick_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_copper_brick_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "weathered_copper_brick_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_copper_brick_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_cut_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_cut_copper_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_cut_copper_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "weathered_cut_copper_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_cut_copper_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_copper_tile_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_copper_tile_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_smooth_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_smooth_copper_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_smooth_copper_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "weathered_smooth_copper_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_smooth_copper_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_chiseled_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_carved_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_copper_pillar"), settings -> new CPlusOxidizablePillarBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
        registry.put(new Identifier("consistency_plus", "weathered_copper_corner_pillar"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, settings));
    }

    private static void waxedWeatheredExposedCopper() {
        registry.put(new Identifier("consistency_plus", "waxed_weathered_copper_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_copper_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_copper_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_copper_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_weathered_polished_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_polished_copper_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_polished_copper_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_polished_copper_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_polished_copper_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_weathered_copper_bricks"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_copper_brick_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_copper_brick_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_copper_brick_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_copper_brick_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_weathered_cut_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_cut_copper_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_cut_copper_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_cut_copper_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_cut_copper_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_weathered_copper_tile_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_copper_tile_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_weathered_smooth_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_smooth_copper_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_smooth_copper_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_smooth_copper_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_smooth_copper_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_weathered_chiseled_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_carved_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_copper_pillar"), PillarBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_weathered_copper_corner_pillar"), Block::new);
    }

    private static void oxidizedCopper() {
        registry.put(new Identifier("consistency_plus", "oxidized_copper_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_copper_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "oxidized_copper_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_copper_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_polished_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_polished_copper_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_polished_copper_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "oxidized_polished_copper_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_polished_copper_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_copper_bricks"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_copper_brick_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_copper_brick_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "oxidized_copper_brick_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_copper_brick_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_cut_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_cut_copper_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_cut_copper_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "oxidized_cut_copper_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_cut_copper_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_copper_tile_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_copper_tile_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_smooth_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_smooth_copper_slab"), settings -> new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_smooth_copper_stairs"), settings -> new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, Blocks.COPPER_BLOCK.getDefaultState(), settings));
        registry.put(new Identifier("consistency_plus", "oxidized_smooth_copper_wall"), settings -> new CPlusOxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_smooth_copper_gate"), settings -> new CPlusOxidizableGateBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_chiseled_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_carved_copper"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_copper_pillar"), settings -> new CPlusOxidizablePillarBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
        registry.put(new Identifier("consistency_plus", "oxidized_copper_corner_pillar"), settings -> new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, settings));
    }

    private static void waxedOxidizedExposedCopper() {
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_copper_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_copper_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_copper_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_copper_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_polished_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_polished_copper_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_polished_copper_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_polished_copper_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_polished_copper_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_copper_bricks"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_copper_brick_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_copper_brick_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_copper_brick_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_copper_brick_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_cut_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_cut_copper_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_cut_copper_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_cut_copper_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_cut_copper_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_copper_tile_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_copper_tile_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_smooth_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_smooth_copper_slab"), CPlusSlabBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_smooth_copper_stairs"), CPlusStairsBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_smooth_copper_wall"), WallBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_smooth_copper_gate"), (settings) -> new FenceGateBlock(settings, WoodType.SPRUCE));
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_chiseled_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_carved_copper"), Block::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_copper_pillar"), PillarBlock::new);
        registry.put(new Identifier("consistency_plus", "waxed_oxidized_copper_corner_pillar"), Block::new);
    }

    private static void dyedTintedGlass() {
        registry.put(new Identifier("consistency_plus", "red_tinted_glass"), TintedGlassBlock::new);
        registry.put(new Identifier("consistency_plus", "yellow_tinted_glass"), TintedGlassBlock::new);
        registry.put(new Identifier("consistency_plus", "orange_tinted_glass"), TintedGlassBlock::new);
        registry.put(new Identifier("consistency_plus", "lime_tinted_glass"), TintedGlassBlock::new);
        registry.put(new Identifier("consistency_plus", "green_tinted_glass"), TintedGlassBlock::new);
        registry.put(new Identifier("consistency_plus", "blue_tinted_glass"), TintedGlassBlock::new);
        registry.put(new Identifier("consistency_plus", "cyan_tinted_glass"), TintedGlassBlock::new);
        registry.put(new Identifier("consistency_plus", "light_blue_tinted_glass"), TintedGlassBlock::new);
        registry.put(new Identifier("consistency_plus", "magenta_tinted_glass"), TintedGlassBlock::new);
        registry.put(new Identifier("consistency_plus", "purple_tinted_glass"), TintedGlassBlock::new);
        registry.put(new Identifier("consistency_plus", "pink_tinted_glass"), TintedGlassBlock::new);
        registry.put(new Identifier("consistency_plus", "white_tinted_glass"), TintedGlassBlock::new);
        registry.put(new Identifier("consistency_plus", "light_gray_tinted_glass"), TintedGlassBlock::new);
        registry.put(new Identifier("consistency_plus", "gray_tinted_glass"), TintedGlassBlock::new);
        registry.put(new Identifier("consistency_plus", "black_tinted_glass"), TintedGlassBlock::new);
        registry.put(new Identifier("consistency_plus", "brown_tinted_glass"), TintedGlassBlock::new);
    }

    private static void miscItems() {
       registry.put(new Identifier("consistency_plus", "warped_wart"), WarpedWartPlantBlock::new);
       registry.put(new Identifier("consistency_plus", "concrete_powder"), a -> new ConcretePowderBlock((Registries.BLOCK.get(new Identifier("consistency_plus", "concrete"))), a));
       itemRegistry.put(new Identifier("consistency_plus", "warped_wart"), (a) -> new AliasedBlockItem(Registries.BLOCK.get(new Identifier("consistency_plus", "warped_wart")), new Item.Settings().arch$tab(ItemGroups.INGREDIENTS)));
	     itemRegistry.put(new Identifier("consistency_plus", "copper_nugget"), (a) -> new Item(new Item.Settings().arch$tab(ItemGroups.INGREDIENTS)));
	     itemRegistry.put(new Identifier("consistency_plus", "netherite_nugget"), (a) -> new Item(new Item.Settings().arch$tab(ItemGroups.INGREDIENTS).fireproof()));
	     itemRegistry.put(new Identifier("consistency_plus", "netherite_horse_armor"), (a) -> new NetheriteHorseArmorItem(15, "netherite", new Item.Settings().maxCount(1).fireproof().arch$tab(ItemGroups.COMBAT)));
	     itemRegistry.put(new Identifier("consistency_plus", "withered_bone"), (a) -> new Item(new Item.Settings().arch$tab(ItemGroups.INGREDIENTS)));
	     itemRegistry.put(new Identifier("consistency_plus", "withered_bone_meal"), (a) -> new Item(new Item.Settings().arch$tab(ItemGroups.INGREDIENTS)));

	// 🐢
	    itemRegistry.put(new Identifier("consistency_plus", "turtle_chestplate"), (a) -> new ArmorItem(ArmorMaterials.TURTLE, ArmorItem.Type.CHESTPLATE, new Item.Settings().arch$tab(ItemGroups.COMBAT)));
	    itemRegistry.put(new Identifier("consistency_plus", "turtle_leggings"), (a) -> new ArmorItem(ArmorMaterials.TURTLE, ArmorItem.Type.LEGGINGS, new Item.Settings().arch$tab(ItemGroups.COMBAT)));
	    itemRegistry.put(new Identifier("consistency_plus", "turtle_boots"), (a) -> new ArmorItem(ArmorMaterials.TURTLE, ArmorItem.Type.BOOTS, new Item.Settings().arch$tab(ItemGroups.COMBAT)));
    }

    public static boolean isValidPortalBlock(BlockState state) {
        if ((state.isIn(CPlusTags.VALID_PORTAL_BLOCKS))) {
            if (state.contains(SlabBlock.TYPE)) {
                return state.get(SlabBlock.TYPE) == SlabType.DOUBLE;
            } return true;
        } return false;
    }

    public static boolean isValidConduitBlock(BlockState state) {
        return state.isIn(CPlusTags.VALID_CONDUIT_BLOCKS);
    }

    public static void init() {}
}

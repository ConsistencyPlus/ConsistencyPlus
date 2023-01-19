package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.growing.SpreadType;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertBlock;
import io.github.consistencyplus.consistency_plus.blocks.WarpedNetherWartPlantBlock;
import io.github.consistencyplus.consistency_plus.blocks.growing.blocks.SpreadableSlabBlock;
import io.github.consistencyplus.consistency_plus.blocks.growing.blocks.SpreadableStairsBlock;
import io.github.consistencyplus.consistency_plus.blocks.growing.blocks.SpreadableWallBlock;
import io.github.consistencyplus.consistency_plus.blocks.nubert.WiggedNubertBlock;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusCarvedPumpkinBlock;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusFenceGateBlock;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusStairBlock;
import io.github.consistencyplus.consistency_plus.data.ConsistencyPlusTags;
import io.github.consistencyplus.consistency_plus.data.MasterKey;
import net.minecraft.block.*;
import net.minecraft.block.enums.SlabType;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.TagKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

import static net.minecraft.block.Blocks.*;

public class CPlusBlocks {
	public static final TagKey<Block> DIRT_SLABS_TAG = TagKey.of(Registry.BLOCK_KEY, ConsistencyPlusMain.id("dirt_slabs"));
	public static final TagKey<Block> DIRT_STAIRS_TAG = TagKey.of(Registry.BLOCK_KEY, ConsistencyPlusMain.id("dirt_stairs"));

	public static final Set<RegistrySupplier<Block>> ALL_BLOCKS = new HashSet<>();

	public static final RegistrySupplier<Block> MOSSY_COBBLESTONE_GATE = register("mossy_cobblestone_gate", () -> new CPlusFenceGateBlock(Block.Settings.copy(MOSSY_COBBLESTONE)));

	// Cracked
	public static final RegistrySupplier<Block> CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab", () -> new SlabBlock(Block.Settings.copy(CRACKED_STONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", () -> new CPlusStairBlock(CRACKED_STONE_BRICKS.getDefaultState(), Block.Settings.copy(CRACKED_STONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", () -> new WallBlock(Block.Settings.copy(CRACKED_STONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_STONE_BRICK_GATE = register("cracked_stone_brick_gate", () -> new CPlusFenceGateBlock(Block.Settings.copy(CRACKED_STONE_BRICKS)));

	// Mossy
	public static final RegistrySupplier<Block> MOSSY_STONE_BRICK_GATE = register("mossy_stone_brick_gate", () -> new CPlusFenceGateBlock(Block.Settings.copy(MOSSY_STONE_BRICKS)));

	// Pillar and Chiseled
	public static final RegistrySupplier<Block> CRACKED_STONE_PILLAR = register("cracked_stone_pillar", () -> new PillarBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_STONE_PILLAR = register("mossy_stone_pillar", () -> new PillarBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_STONE_CORNER_PILLAR = register("cracked_stone_corner_pillar", () -> new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_STONE_CORNER_PILLAR = register("mossy_stone_corner_pillar", () -> new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_CHISELED_STONE = register("cracked_chiseled_stone", () -> new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_CHISELED_STONE = register("mossy_chiseled_stone", () -> new Block(Block.Settings.copy(STONE_BRICKS)));

	//Cracked
	public static final RegistrySupplier<Block> CRACKED_BLACKSTONE_BRICK_SLAB = register("cracked_blackstone_brick_slab", () -> new SlabBlock(Block.Settings.copy(CRACKED_POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLACKSTONE_BRICK_STAIRS = register("cracked_blackstone_brick_stairs", () -> new CPlusStairBlock(CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), Block.Settings.copy(CRACKED_STONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLACKSTONE_BRICK_WALL = register("cracked_blackstone_brick_wall", () -> new WallBlock(Block.Settings.copy(CRACKED_POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLACKSTONE_BRICK_GATE = register("cracked_blackstone_brick_gate", () -> new CPlusFenceGateBlock(Block.Settings.copy(CRACKED_POLISHED_BLACKSTONE_BRICKS)));

	//Mossy
	public static final RegistrySupplier<Block> MOSSY_BLACKSTONE_BRICKS = register("mossy_blackstone_bricks", () -> new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_BLACKSTONE_BRICK_SLAB = register("mossy_blackstone_brick_slab", () -> new SlabBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_BLACKSTONE_BRICK_STAIRS = register("mossy_blackstone_brick_stairs", () -> new CPlusStairBlock(POLISHED_BLACKSTONE_BRICKS.getDefaultState(), Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_BLACKSTONE_BRICK_WALL = register("mossy_blackstone_brick_wall", () -> new WallBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_BLACKSTONE_BRICK_GATE = register("mossy_blackstone_brick_gate", () -> new CPlusFenceGateBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));

	//Pillars and Chiseled
	public static final RegistrySupplier<Block> MOSSY_BLACKSTONE_PILLAR = register("mossy_blackstone_pillar", () -> new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLACKSTONE_PILLAR = register("cracked_blackstone_pillar", () -> new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_BLACKSTONE_CORNER_PILLAR = register("mossy_blackstone_corner_pillar", () -> new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLACKSTONE_CORNER_PILLAR = register("cracked_blackstone_corner_pillar", () -> new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_CHISELED_BLACKSTONE = register("mossy_chiseled_blackstone", () -> new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_CHISELED_BLACKSTONE = register("cracked_chiseled_blackstone", () -> new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_CARVED_BLACKSTONE = register("mossy_carved_blackstone", () -> new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_CARVED_BLACKSTONE = register("cracked_carved_blackstone", () -> new Block(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));

	//Nether Bricks
	//Cracked Bricks
	public static final RegistrySupplier<Block> CRACKED_NETHER_BRICK_SLAB = register("cracked_nether_brick_slab", () -> new SlabBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_NETHER_BRICK_STAIRS = register("cracked_nether_brick_stairs", () -> new CPlusStairBlock(NETHER_BRICKS.getDefaultState(), Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_NETHER_BRICK_WALL = register("cracked_nether_brick_wall", () -> new WallBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_NETHER_BRICK_FENCE_GATE = register("cracked_nether_brick_fence_gate", () -> new CPlusFenceGateBlock(Block.Settings.copy(NETHER_BRICKS)));

	//Blue Nether Bricks
	public static final RegistrySupplier<Block> CRACKED_PURPUR_BRICKS = register("cracked_purpur_bricks", () -> new Block(Block.Settings.copy(PURPUR_PILLAR)));
	public static final RegistrySupplier<Block> CRACKED_PURPUR_BRICK_SLAB = register("cracked_purpur_brick_slab", () -> new SlabBlock(Block.Settings.copy(PURPUR_BLOCK)));
	public static final RegistrySupplier<Block> CRACKED_PURPUR_BRICK_STAIRS = register("cracked_purpur_brick_stairs", () -> new CPlusStairBlock(PURPUR_BLOCK.getDefaultState(), Block.Settings.copy(PURPUR_BLOCK)));
	public static final RegistrySupplier<Block> CRACKED_PURPUR_BRICK_WALL = register("cracked_purpur_brick_wall", () -> new WallBlock(Block.Settings.copy(PURPUR_BLOCK)));
	public static final RegistrySupplier<Block> CRACKED_PURPUR_BRICK_GATE = register("cracked_purpur_brick_gate", () -> new CPlusFenceGateBlock(Block.Settings.copy(PURPUR_BLOCK)));

	public static final RegistrySupplier<Block> CRACKED_DEEPSLATE_BRICK_SLAB = register("cracked_deepslate_brick_slab", () -> new SlabBlock(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> CRACKED_DEEPSLATE_BRICK_STAIRS = register("cracked_deepslate_brick_stairs", () -> new CPlusStairBlock(DEEPSLATE.getDefaultState(), Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> CRACKED_DEEPSLATE_BRICK_WALL = register("cracked_deepslate_brick_wall", () -> new WallBlock(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> CRACKED_DEEPSLATE_BRICK_GATE = register("cracked_deepslate_brick_gate", () -> new CPlusFenceGateBlock(Block.Settings.copy(DEEPSLATE)));

	public static final RegistrySupplier<Block> CRACKED_DEEPSLATE_TILE_SLAB = register("cracked_deepslate_tile_slab", () -> new SlabBlock(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> CRACKED_DEEPSLATE_TILE_STAIRS = register("cracked_deepslate_tile_stairs", () -> new CPlusStairBlock(DEEPSLATE.getDefaultState(), Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> CRACKED_DEEPSLATE_TILE_WALL = register("cracked_deepslate_tile_wall", () -> new WallBlock(Block.Settings.copy(DEEPSLATE)));
	public static final RegistrySupplier<Block> CRACKED_DEEPSLATE_TILE_GATE = register("cracked_deepslate_tile_gate", () -> new CPlusFenceGateBlock(Block.Settings.copy(DEEPSLATE)));


	public static final RegistrySupplier<Block> SOUL_ICE = ConsistencyPlusMain.BLOCKS.register("soul_ice", () -> new Block(Block.Settings.of(Material.DENSE_ICE, MapColor.LIGHT_BLUE).strength(3.0F).slipperiness(1.1f).sounds(BlockSoundGroup.GLASS)));
	public static final RegistrySupplier<Block> SOUL_ICE_SLAB = ConsistencyPlusMain.BLOCKS.register("soul_ice_slab", () -> new SlabBlock(Block.Settings.copy(SOUL_ICE.get())));
	public static final RegistrySupplier<Block> SOUL_ICE_STAIRS = ConsistencyPlusMain.BLOCKS.register("soul_ice_stairs", () -> new CPlusStairBlock(SOUL_ICE.get().getDefaultState(), Block.Settings.copy(SOUL_ICE.get())));
	public static final RegistrySupplier<Block> SOUL_ICE_WALL = ConsistencyPlusMain.BLOCKS.register("soul_ice_wall", () -> new WallBlock(Block.Settings.copy(SOUL_ICE.get())));
	public static final RegistrySupplier<Block> SOUL_ICE_GATE = ConsistencyPlusMain.BLOCKS.register("soul_ice_gate", () -> new CPlusFenceGateBlock(Block.Settings.copy(SOUL_ICE.get())));


	//Glowstone
	public static final RegistrySupplier<Block> SOUL_GLOWSTONE = ConsistencyPlusMain.BLOCKS.register("soul_glowstone", () -> new Block(Block.Settings.of(Material.GLASS, MapColor.LIGHT_BLUE).strength(0.3f).sounds(BlockSoundGroup.GLASS).luminance((state) -> 10).nonOpaque()));
	public static final RegistrySupplier<Block> SOUL_GLOWSTONE_SLAB = ConsistencyPlusMain.BLOCKS.register("soul_glowstone_slab", () -> new SlabBlock(Block.Settings.copy(SOUL_GLOWSTONE.get())));
	public static final RegistrySupplier<Block> SOUL_GLOWSTONE_STAIRS = ConsistencyPlusMain.BLOCKS.register("soul_glowstone_stairs", () -> new CPlusStairBlock(SOUL_GLOWSTONE.get().getDefaultState(), Block.Settings.copy(SOUL_GLOWSTONE.get())));
	public static final RegistrySupplier<Block> SOUL_GLOWSTONE_WALL = ConsistencyPlusMain.BLOCKS.register("soul_glowstone_wall", () -> new WallBlock(Block.Settings.copy(SOUL_GLOWSTONE.get())));
	public static final RegistrySupplier<Block> SOUL_GLOWSTONE_GATE = ConsistencyPlusMain.BLOCKS.register("soul_glowstone_gate", () -> new CPlusFenceGateBlock(Block.Settings.copy(SOUL_GLOWSTONE.get())));

	// Dirt
	public static final RegistrySupplier<Block> DIRT_SLAB = register("dirt_slab", () -> new SlabBlock(Block.Settings.copy(DIRT)));
	public static final RegistrySupplier<Block> DIRT_STAIRS = register("dirt_stairs", () -> new StairsBlock(DIRT.getDefaultState(), Block.Settings.copy(DIRT)));
	public static final RegistrySupplier<Block> DIRT_WALL = register("dirt_wall", () -> new WallBlock(Block.Settings.copy(DIRT)));

	// Grass
	public static final RegistrySupplier<Block> GRASS_SLAB = register("grass_slab", () -> new SpreadableSlabBlock(SpreadType.GRASS, Block.Settings.copy(GRASS_BLOCK)));
	public static final RegistrySupplier<Block> GRASS_STAIRS = register("grass_stairs", () -> new SpreadableStairsBlock(SpreadType.GRASS, GRASS_BLOCK.getDefaultState(), Block.Settings.copy(GRASS_BLOCK)));
	public static final RegistrySupplier<Block> GRASS_WALL = register("grass_wall", () -> new SpreadableWallBlock(SpreadType.GRASS, Block.Settings.copy(GRASS_BLOCK)));

	// Mycelium
	public static final RegistrySupplier<Block> MYCELIUM_SLAB = register("mycelium_slab", () -> new SpreadableSlabBlock(SpreadType.MYCELIUM, Block.Settings.copy(MYCELIUM)));
	public static final RegistrySupplier<Block> MYCELIUM_STAIRS = register("mycelium_stairs", () -> new SpreadableStairsBlock(SpreadType.MYCELIUM, MYCELIUM.getDefaultState(), Block.Settings.copy(MYCELIUM)));
	public static final RegistrySupplier<Block> MYCELIUM_WALL = register("mycelium_wall", () -> new SpreadableWallBlock(SpreadType.MYCELIUM, Block.Settings.copy(MYCELIUM)));

	// Miscellaneous
	// public static final RegistrySupplier<Block> JACK_O_RED = register("jack_o_red", () -> new RedstonePumpkinBlock(Block.Settings.of(Material.GOURD, MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD).luminance(13)));
	public static final RegistrySupplier<Block> JACK_O_SOUL = ConsistencyPlusMain.BLOCKS.register("jack_o_soul", () -> new CPlusCarvedPumpkinBlock(Block.Settings.of(Material.GOURD, MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD).luminance((state) ->10)));
	public static final RegistrySupplier<Block> WARPED_WART = ConsistencyPlusMain.BLOCKS.register("warped_wart", () -> new WarpedNetherWartPlantBlock(Block.Settings.of(Material.PLANT, MapColor.BLUE).noCollision().ticksRandomly().sounds(BlockSoundGroup.NETHER_WART).nonOpaque()));
	//	public static final RegistrySupplier<Block> CHARCOAL_BLOCK = ConsistencyPlusMain.BLOCKS.register("charcoal_block", () -> new Block(Block.Settings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(5.0F, 6.0F)));
	public static final RegistrySupplier<Block> PINEAPPLE = ConsistencyPlusMain.BLOCKS.register("pineapple", () -> new CPlusCarvedPumpkinBlock(Block.Settings.of(Material.GOURD, MapColor.ORANGE).strength(1.0F).sounds(BlockSoundGroup.WOOD)));
	public static final RegistrySupplier<Block> NETHERITE_STAIRS = ConsistencyPlusMain.BLOCKS.register("netherite_stairs", () -> new CPlusStairBlock(NETHERITE_BLOCK.getDefaultState(), Block.Settings.copy(NETHERITE_BLOCK)));
	public static final RegistrySupplier<Block> SUSPICIOUS_SLAB = ConsistencyPlusMain.BLOCKS.register("suspicious_slab", () -> new SlabBlock(Block.Settings.copy(CLAY)));
	public static final RegistrySupplier<Block> JET = ConsistencyPlusMain.BLOCKS.register("jet", () -> new Block(Block.Settings.copy(BEDROCK)));
	public static final RegistrySupplier<Block> NUBERT = ConsistencyPlusMain.BLOCKS.register("nubert", () -> new NubertBlock(Items.YELLOW_WOOL, SoundEvents.BLOCK_WOOL_PLACE, CPlusBlocks.WIGGED_NUBERT, AbstractBlock.Settings.copy(SLIME_BLOCK).nonOpaque().allowsSpawning(CPlusBlocks::never).breakInstantly().mapColor(MapColor.BRIGHT_RED).luminance(state -> 7)));
	public static final RegistrySupplier<Block> WIGGED_NUBERT = ConsistencyPlusMain.BLOCKS.register("wigged_nubert", () -> new WiggedNubertBlock(Items.SHEARS, SoundEvents.ENTITY_SHEEP_SHEAR, CPlusBlocks.NUBERT, AbstractBlock.Settings.copy(CPlusBlocks.NUBERT.get())));

	// Deprecated Blocks
	public static final RegistrySupplier<Block> STONE_BRICK_PILLAR = ConsistencyPlusMain.BLOCKS.register("stone_brick_pillar", () -> new PillarBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_STONE_BRICK_PILLAR = ConsistencyPlusMain.BLOCKS.register("cracked_stone_brick_pillar", () -> new PillarBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_STONE_BRICK_PILLAR = ConsistencyPlusMain.BLOCKS.register("mossy_stone_brick_pillar", () -> new PillarBlock(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> CARVED_STONE_BRICKS = ConsistencyPlusMain.BLOCKS.register("carved_stone_bricks", () -> new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_CHISELED_STONE_BRICKS = ConsistencyPlusMain.BLOCKS.register("cracked_chiseled_stone_bricks", () -> new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_CHISELED_STONE_BRICKS = ConsistencyPlusMain.BLOCKS.register("mossy_chiseled_stone_bricks", () -> new Block(Block.Settings.copy(STONE_BRICKS)));
	public static final RegistrySupplier<Block> MOSSY_BLACKSTONE_BRICK_PILLAR = ConsistencyPlusMain.BLOCKS.register("mossy_blackstone_brick_pillar", () -> new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLACKSTONE_BRICK_PILLAR = ConsistencyPlusMain.BLOCKS.register("cracked_blackstone_brick_pillar", () -> new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> BLACKSTONE_BRICK_PILLAR = ConsistencyPlusMain.BLOCKS.register("blackstone_brick_pillar", () -> new PillarBlock(Block.Settings.copy(POLISHED_BLACKSTONE_BRICKS)));
	public static final RegistrySupplier<Block> CHISELED_BRICKS = ConsistencyPlusMain.BLOCKS.register("chiseled_bricks", () -> new Block(Block.Settings.copy(BRICKS)));
	public static final RegistrySupplier<Block> BRICK_PILLAR = ConsistencyPlusMain.BLOCKS.register("brick_pillar", () -> new PillarBlock(Block.Settings.copy(BRICKS)));
	public static final RegistrySupplier<Block> CARVED_BRICKS = ConsistencyPlusMain.BLOCKS.register("carved_bricks", () -> new Block(Block.Settings.copy(BRICKS)));
	public static final RegistrySupplier<Block> END_STONE_BRICK_PILLAR = ConsistencyPlusMain.BLOCKS.register("end_stone_brick_pillar", () -> new PillarBlock(Block.Settings.copy(END_STONE_BRICKS)));
	public static final RegistrySupplier<Block> SMOOTH_PURPUR_BLOCK = ConsistencyPlusMain.BLOCKS.register("smooth_purpur_block", () -> new Block(Block.Settings.copy(PURPUR_BLOCK)));
	public static final RegistrySupplier<Block> POLISHED_PURPUR_BLOCK = ConsistencyPlusMain.BLOCKS.register("polished_purpur_block", () -> new Block(Block.Settings.copy(PURPUR_BLOCK)));
	public static final RegistrySupplier<Block> CHISELED_PURPUR_BLOCK = ConsistencyPlusMain.BLOCKS.register("chiseled_purpur_block", () -> new Block(Block.Settings.copy(PURPUR_BLOCK)));
	public static final RegistrySupplier<Block> BLUE_NETHER_BRICKS = ConsistencyPlusMain.BLOCKS.register("blue_nether_bricks", () -> new Block(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> BLUE_NETHER_BRICK_SLAB = ConsistencyPlusMain.BLOCKS.register("blue_nether_brick_slab", () -> new SlabBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> BLUE_NETHER_BRICK_STAIRS = ConsistencyPlusMain.BLOCKS.register("blue_nether_brick_stairs", () -> new CPlusStairBlock(NETHER_BRICKS.getDefaultState(), Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> BLUE_NETHER_BRICK_WALL = ConsistencyPlusMain.BLOCKS.register("blue_nether_brick_wall", () -> new WallBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> BLUE_NETHER_BRICK_FENCE_GATE = ConsistencyPlusMain.BLOCKS.register("blue_nether_brick_fence_gate", () -> new CPlusFenceGateBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLUE_NETHER_BRICKS = ConsistencyPlusMain.BLOCKS.register("cracked_blue_nether_bricks", () -> new Block(Block.Settings.copy(CRACKED_NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLUE_NETHER_BRICK_SLAB = ConsistencyPlusMain.BLOCKS.register("cracked_blue_nether_brick_slab", () -> new SlabBlock(Block.Settings.copy(CRACKED_NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLUE_NETHER_BRICK_STAIRS = ConsistencyPlusMain.BLOCKS.register("cracked_blue_nether_brick_stairs", () -> new CPlusStairBlock(CRACKED_NETHER_BRICKS.getDefaultState(), Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLUE_NETHER_BRICK_WALL = ConsistencyPlusMain.BLOCKS.register("cracked_blue_nether_brick_wall", () -> new WallBlock(Block.Settings.copy(CRACKED_NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CRACKED_BLUE_NETHER_BRICK_FENCE_GATE = ConsistencyPlusMain.BLOCKS.register("cracked_blue_nether_brick_fence_gate", () -> new CPlusFenceGateBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CHISELED_BLUE_NETHER_BRICKS = ConsistencyPlusMain.BLOCKS.register("chiseled_blue_nether_bricks", () -> new Block(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> BLUE_NETHER_BRICK_PILLAR = ConsistencyPlusMain.BLOCKS.register("blue_nether_brick_pillar", () -> new PillarBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CARVED_BLUE_NETHER_BRICKS = ConsistencyPlusMain.BLOCKS.register("carved_blue_nether_bricks", () -> new Block(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CHISELED_NETHER_BRICKS = ConsistencyPlusMain.BLOCKS.register("chiseled_nether_bricks", () -> new Block(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> NETHER_BRICK_PILLAR = ConsistencyPlusMain.BLOCKS.register("nether_brick_pillar", () -> new PillarBlock(Block.Settings.copy(NETHER_BRICKS)));
	public static final RegistrySupplier<Block> RED_NETHER_BRICK_FENCE_GATE = ConsistencyPlusMain.BLOCKS.register("red_nether_brick_fence_gate", () -> new CPlusFenceGateBlock(Block.Settings.copy(RED_NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CHISELED_RED_NETHER_BRICKS = ConsistencyPlusMain.BLOCKS.register("chiseled_red_nether_bricks", () -> new Block(Block.Settings.copy(RED_NETHER_BRICKS)));
	public static final RegistrySupplier<Block> RED_NETHER_BRICK_PILLAR = ConsistencyPlusMain.BLOCKS.register("red_nether_brick_pillar", () -> new PillarBlock(Block.Settings.copy(RED_NETHER_BRICKS)));
	public static final RegistrySupplier<Block> CARVED_RED_NETHER_BRICKS = ConsistencyPlusMain.BLOCKS.register("carved_red_nether_bricks", () -> new Block(Block.Settings.copy(RED_NETHER_BRICKS)));

	// Siuol's selection regex syntax machine (?=")(.*)(?<=____")
	// Per Thing regex selection machine (?=")(.*)(____.*)(?<=")

	protected static RegistrySupplier<Block> register(String name, Supplier<Block> block) {
		RegistrySupplier<Block> blockSupplied = ConsistencyPlusMain.BLOCKS.register(name, block);
		ConsistencyPlusMain.LOGGER.info("Registered " + name + " as a Block");

		ALL_BLOCKS.add(blockSupplied);

		return blockSupplied;
	}

	public static boolean never(BlockState blockState, BlockView blockView, BlockPos blockPos, EntityType<?> entityType) {
		return false;
	}

	public static void init() {
		MasterKey.addCPlusBlocksToKeyring();
	}

	public static boolean isValidPortalBlock(BlockState state) {
		if ((state.isIn(ConsistencyPlusTags.ConsistencySpecificTags.VALID_PORTAL_BLOCKS))) {
			if (state.contains(SlabBlock.TYPE)) {
				return state.get(SlabBlock.TYPE) == SlabType.DOUBLE;
			} return true;
		} return false;
	}
	
	public static boolean isValidConduitBlock(BlockState state) {
		return state.isIn(ConsistencyPlusTags.ConsistencySpecificTags.VALID_CONDUIT_BLOCKS);
	}
}
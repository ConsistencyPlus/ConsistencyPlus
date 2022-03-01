package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.registry.registries.DeferredRegister;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.copper.OxidizableGateBlock;
import io.github.consistencyplus.consistency_plus.blocks.copper.OxidizableLightningRodBlock;
import io.github.consistencyplus.consistency_plus.blocks.copper.OxidizablePillarBlock;
import io.github.consistencyplus.consistency_plus.blocks.copper.OxidizableWallBlock;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusStairBlock;
import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Oxidizable.OxidationLevel;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

public class CPlusCopperBlocks {
	public static final Map<Key, Pair<Block, BlockItem>> BLOCKS = new HashMap<>();
	
	public static Block getBlock(CopperOxidization oxidization, Variant variant, Shape shape, boolean waxed) {
		return get(oxidization, variant, shape, waxed).getLeft();
	}
	
	public static BlockItem getItem(CopperOxidization oxidization, Variant variant, Shape shape, boolean waxed) {
		return get(oxidization, variant, shape, waxed).getRight();
	}
	
	public static Pair<Block, BlockItem> get(CopperOxidization oxidization, Variant variant, Shape shape, boolean waxed) {
		return BLOCKS.get(new Key(oxidization, variant, shape, waxed));
	}
	
	public enum CopperOxidization {
		BASE, EXPOSED, WEATHERED, OXIDIZED;
		
		public OxidationLevel toVanilla() {
			return switch (this) {
				case BASE -> OxidationLevel.UNAFFECTED;
				case EXPOSED -> OxidationLevel.EXPOSED;
				case WEATHERED -> OxidationLevel.WEATHERED;
				case OXIDIZED -> OxidationLevel.OXIDIZED;
			};
		}
		
		public static CopperOxidization fromVanilla(OxidationLevel level) {
			return switch (level) {
				case UNAFFECTED -> CopperOxidization.BASE;
				case EXPOSED -> CopperOxidization.EXPOSED;
				case OXIDIZED -> CopperOxidization.OXIDIZED;
				case WEATHERED -> CopperOxidization.WEATHERED;
			};
		}
		
		public MapColor getColor() {
			return switch (this) {
				case BASE -> MapColor.ORANGE;
				case EXPOSED -> MapColor.TERRACOTTA_LIGHT_GRAY;
				case OXIDIZED -> MapColor.TEAL;
				case WEATHERED -> MapColor.DARK_AQUA;
			};
		}
		
		@Override
		public String toString() {
			return this == BASE ? "" : name().toLowerCase(Locale.ROOT) + '_';
		}
	}
	
	public enum Variant {
		BASE, POLISHED, SMOOTH, BRICK, CUT, TILE, PILLAR, CORNER_PILLAR, CHISELED, CARVED;

		
		public String createName(CopperOxidization oxidization) {
			boolean prefix = this != BASE && this != BRICK && this != TILE && this != PILLAR && this != CORNER_PILLAR;
			return prefix ? oxidization.toString() + this + "_copper" : oxidization.toString() + "copper" + (this.toString().isEmpty() ? "" : "_") + this;
		}

		public boolean hasAdditionalShapes() {
			return this != CARVED && this != CHISELED && this != PILLAR && this != CORNER_PILLAR;
		}
		
		@Override
		public String toString() {
			if (this == BASE) return "";
			return name().toLowerCase(Locale.ROOT);
		}
	}
	
	public enum Shape {
		BLOCK, SLAB, STAIRS, WALL, GATE
	}

	private record Key(CopperOxidization oxidization, Variant variant, Shape shape, boolean waxed) {
	}
	
	public static void init(DeferredRegister<Block> blockRegistry, DeferredRegister<Item> itemRegistry) {
		for (CopperOxidization oxidization : CopperOxidization.values()) {
			for (Variant var : Variant.values()) {
				String name = var.createName(oxidization);
				AbstractBlock.Settings settings = AbstractBlock.Settings.of(Material.METAL, oxidization.getColor())
						.requiresTool()
						.strength(3.0f, 6.0f)
						.ticksRandomly()
						.sounds(BlockSoundGroup.COPPER);
				Item.Settings itemSettings = CPlusItemGroups.consistencyPlusMiscItemSettings();
				
				OxidationLevel level = oxidization.toVanilla();
				boolean baseVar = var == Variant.BASE;
				
				if (var != Variant.TILE) { // MOJAAAAAAAAAAAANG
					
					// --- base ---
					
					Block base = baseVar ? Blocks.COPPER_BLOCK : var == Variant.PILLAR ? new OxidizablePillarBlock(level, settings) : new OxidizableBlock(level, settings);
					BlockItem baseItem = baseVar ? (BlockItem) Items.COPPER_BLOCK : new BlockItem(base, itemSettings);
					BLOCKS.put(new Key(oxidization, var, Shape.BLOCK, false), Pair.of(base, baseItem));
					if (!baseVar) {
						Identifier baseId = ConsistencyPlusMain.id(name + (var == Variant.BRICK ? 's' : ""));
						blockRegistry.register(baseId, () -> base);
						itemRegistry.register(baseId, () -> baseItem);
						tryRegisterOxidizable(base, oxidization, var, Shape.BLOCK);
					}
					
					Block waxedBase = baseVar ? Blocks.WAXED_COPPER_BLOCK : var == Variant.PILLAR ? new PillarBlock(settings) : new Block(settings);
					BlockItem waxedBaseItem = baseVar ? (BlockItem) Items.WAXED_COPPER_BLOCK : new BlockItem(waxedBase, itemSettings);
					BLOCKS.put(new Key(oxidization, var, Shape.BLOCK, true), Pair.of(waxedBase, waxedBaseItem));
					if (!baseVar) {
						Identifier waxedBaseId = ConsistencyPlusMain.id("waxed_" + name + (var == Variant.BRICK ? 's' : ""));
						blockRegistry.register(waxedBaseId, () -> waxedBase);
						itemRegistry.register(waxedBaseId, () -> waxedBaseItem);
						registerWaxable(base, waxedBase);
					}
					
					if (!var.hasAdditionalShapes()) continue;
					
					// --- slabs ---
					
					OxidizableSlabBlock slab = new OxidizableSlabBlock(level, settings);
					BlockItem slabItem = new BlockItem(slab, itemSettings);
					BLOCKS.put(new Key(oxidization, var, Shape.SLAB, false), Pair.of(slab, slabItem));
					Identifier slabId = ConsistencyPlusMain.id(name + "_slab");
					blockRegistry.register(slabId, () -> slab);
					itemRegistry.register(slabId, () -> slabItem);
					
					tryRegisterOxidizable(slab, oxidization, var, Shape.SLAB);
					
					SlabBlock waxedSlab = new SlabBlock(settings);
					BlockItem waxedSlabItem = new BlockItem(waxedSlab, itemSettings);
					BLOCKS.put(new Key(oxidization, var, Shape.SLAB, true), Pair.of(waxedSlab, waxedSlabItem));
					Identifier waxedSlabId = ConsistencyPlusMain.id("waxed_" + name + "_slab");
					blockRegistry.register(waxedSlabId, () -> waxedSlab);
					itemRegistry.register(waxedSlabId, () -> waxedSlabItem);
					
					registerWaxable(slab, waxedSlab);
					
					// --- stairs ---
					
					OxidizableStairsBlock stairs = new OxidizableStairsBlock(level, base.getDefaultState(), settings);
					BlockItem stairsItem = new BlockItem(stairs, itemSettings);
					Identifier stairsId = ConsistencyPlusMain.id(name + "_stairs");
					BLOCKS.put(new Key(oxidization, var, Shape.STAIRS, false), Pair.of(stairs, stairsItem));
					blockRegistry.register(stairsId, () -> stairs);
					itemRegistry.register(stairsId, () -> stairsItem);
					
					tryRegisterOxidizable(stairs, oxidization, var, Shape.STAIRS);
					
					StairsBlock waxedStairs = new CPlusStairBlock(waxedBase.getDefaultState(), settings);
					BlockItem waxedStairsItem = new BlockItem(waxedStairs, itemSettings);
					Identifier waxedStairsId = ConsistencyPlusMain.id("waxed_" + name + "_stairs");
					BLOCKS.put(new Key(oxidization, var, Shape.STAIRS, true), Pair.of(waxedStairs, waxedStairsItem));
					blockRegistry.register(waxedStairsId, () -> waxedStairs);
					itemRegistry.register(waxedStairsId, () -> waxedStairsItem);
					
					registerWaxable(stairs, waxedStairs);
				}
				
				// --- walls ---
				
				OxidizableWallBlock wall = new OxidizableWallBlock(level, settings);
				BlockItem wallItem = new BlockItem(wall, itemSettings);
				Identifier wallId = ConsistencyPlusMain.id(name + "_wall");
				BLOCKS.put(new Key(oxidization, var, Shape.WALL, false), Pair.of(wall, wallItem));
				blockRegistry.register(wallId, () -> wall);
				itemRegistry.register(wallId, () -> wallItem);
				
				tryRegisterOxidizable(wall, oxidization, var, Shape.WALL);
				
				WallBlock waxedWall = new WallBlock(settings);
				BlockItem waxedWallItem = new BlockItem(waxedWall, itemSettings);
				Identifier waxedWallId = ConsistencyPlusMain.id("waxed_" + name + "_wall");
				BLOCKS.put(new Key(oxidization, var, Shape.WALL, true), Pair.of(waxedWall, waxedWallItem));
				blockRegistry.register(waxedWallId, () -> waxedWall);
				itemRegistry.register(waxedWallId, () -> waxedWallItem);
				
				registerWaxable(wall, waxedWall);
				
				// --- gates ---
				
				OxidizableGateBlock gate = new OxidizableGateBlock(level, settings);
				BlockItem gateItem = new BlockItem(gate, itemSettings);
				Identifier gateId = ConsistencyPlusMain.id(name + "_gate");
				BLOCKS.put(new Key(oxidization, var, Shape.GATE, false), Pair.of(gate, gateItem));
				blockRegistry.register(gateId, () -> gate);
				itemRegistry.register(gateId, () -> gateItem);
				
				tryRegisterOxidizable(gate, oxidization, var, Shape.GATE);
				
				FenceGateBlock waxedGate = new FenceGateBlock(settings);
				BlockItem waxedGateItem = new BlockItem(waxedGate, itemSettings);
				Identifier waxedGateId = ConsistencyPlusMain.id("waxed_" + name + "_gate");
				BLOCKS.put(new Key(oxidization, var, Shape.GATE, true), Pair.of(waxedGate, waxedGateItem));
				blockRegistry.register(waxedGateId, () -> waxedGate);
				itemRegistry.register(waxedGateId, () -> waxedGateItem);
				
				registerWaxable(gate, waxedGate);
				
				// --- rods ---
				// maybe one day...
				
//				OxidizableLightningRodBlock rod = new OxidizableLightningRodBlock(level, settings.nonOpaque());
//				BlockItem rodItem = new BlockItem(rod, itemSettings);
//				Identifier rodId = ConsistencyPlusMain.id(name + "_lightning_rod");
//				BLOCKS.put(new Key(oxidization, var, Shape.ROD, false), Pair.of(rod, rodItem));
//				blockRegistry.register(rodId, () -> rod);
//				itemRegistry.register(rodId, () -> rodItem);
//
//				tryRegisterOxidizable(rod, oxidization, var, Shape.ROD);
//
//				LightningRodBlock waxedRod = new LightningRodBlock(settings.nonOpaque());
//				BlockItem waxedRodItem = new BlockItem(waxedRod, itemSettings);
//				Identifier waxedRodId = ConsistencyPlusMain.id("waxed_" + name + "_lightning_rod");
//				BLOCKS.put(new Key(oxidization, var, Shape.ROD, true), Pair.of(waxedRod, waxedRodItem));
//				blockRegistry.register(waxedRodId, () -> waxedRod);
//				itemRegistry.register(waxedRodId, () -> waxedRodItem);
//
//				registerWaxable(rod, waxedRod);
			}
		}
		finish();
	}
	
	private static void tryRegisterOxidizable(Block more, CopperOxidization current, Variant var, Shape shape) {
		if (current == CopperOxidization.BASE) return;
		CopperOxidization last = CopperOxidization.values()[current.ordinal() - 1];
		Block less = getBlock(last, var, shape, false);
		registerOxidizable(less, more);
	}

	@ExpectPlatform
	private static void registerOxidizable(Block less, Block more) {
		throw new RuntimeException("Architectury failed!");
	}
	
	@ExpectPlatform
	private static void registerWaxable(Block no, Block yes) {
		throw new RuntimeException("Architectury failed!");
	}
	
	@ExpectPlatform
	private static void finish() {
		throw new RuntimeException("Architectury failed!");
	}
	//Jay what the fuck is this.
}

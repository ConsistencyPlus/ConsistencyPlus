package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.CopperOxidization;
import io.github.consistencyplus.consistency_plus.blocks.copper.OxidizableGateBlock;
import io.github.consistencyplus.consistency_plus.blocks.copper.OxidizablePillarBlock;
import io.github.consistencyplus.consistency_plus.blocks.copper.OxidizableWallBlock;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusFenceGateBlock;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusStairBlock;
import net.minecraft.block.*;
import net.minecraft.block.Oxidizable.OxidationLevel;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;

public class CPlusCopperBlocks {
	public static final Map<Key, Pair<Block, BlockItem>> BLOCKS = new HashMap<>();

	public static Block getBlock(CopperOxidization oxidization, BlockTypes type, BlockShapes shape, boolean waxed) {
		return get(oxidization, type, shape, waxed).getLeft();
	}

	public static BlockItem getItem(CopperOxidization oxidization, BlockTypes type, BlockShapes shape, boolean waxed) {
		return get(oxidization, type, shape, waxed).getRight();
	}

	public static Pair<Block, BlockItem> get(CopperOxidization oxidization, BlockTypes type, BlockShapes shape, boolean waxed) {
		return BLOCKS.get(new Key(oxidization, type, shape, waxed));
	}

	private record Key(CopperOxidization oxidization, BlockTypes type, BlockShapes shape, boolean waxed) {}

	public static void init() {
		for (CopperOxidization oxidization : CopperOxidization.values()) {
			for (BlockTypes type : BlockTypes.values()) {
				for (BlockShapes shape : BlockShapes.values()) {
					if (!type.equals(BlockTypes.BASE) && !shape.withTypes) break;
					if (type.equals(BlockTypes.TILE) && (shape.equals(BlockShapes.BLOCK) || shape.equals(BlockShapes.SLAB) || shape.equals(BlockShapes.STAIRS))) continue;
					if (type.equals(BlockTypes.BASE) && shape.equals(BlockShapes.BLOCK)) continue;
					if (type.equals(BlockTypes.COBBLED)) break;
					String id = getOxiID(oxidization, shape, type);
					if (CPlusEnhancedRegistry.checkMinecraft(id)) continue;
					if (CPlusEnhancedRegistry.blacklistedIDs.contains(id)) continue;

					register(id, shape, CPlusSharedBlockSettings.copper(oxidization), oxidization.toVanilla(), type);
				}
			}
		}

		finish();
	}

	public static void register(String name, BlockShapes shape, AbstractBlock.Settings blockSettings, OxidationLevel level, BlockTypes type) {
		RegistrySupplier<Block> unwaxedBlock = unwaxedBlockRegistration(name + "_block", shape, blockSettings, level);
		RegistrySupplier<Item> unwaxedItem =  ConsistencyPlusMain.ITEMS.register(name + "_item", () -> new BlockItem(unwaxedBlock.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
		if (unwaxedBlock.isPresent()) BLOCKS.put(new Key(CopperOxidization.fromVanilla(level), type, shape, false), Pair.of(unwaxedBlock.get(), (BlockItem)unwaxedItem.get()));
		else ConsistencyPlusMain.LOGGER.info("Help.");

		ConsistencyPlusMain.LOGGER.info("on Copper's trial");
		tryRegisterOxidizable(unwaxedBlock.get(), CopperOxidization.fromVanilla(level), type, shape);

		String waxedID = "waxed_" + name;
		RegistrySupplier<Block> waxedBlock = blockRegistration(waxedID, shape, blockSettings);
		RegistrySupplier<Item> waxedItem = ConsistencyPlusMain.ITEMS.register(waxedID, () -> new BlockItem(waxedBlock.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
		BLOCKS.put(new Key(CopperOxidization.fromVanilla(level), type, shape, true), Pair.of(waxedBlock.get(), (BlockItem)waxedItem.get()));

		registerWaxable(unwaxedBlock.get(), waxedBlock.get());
	}

	public static RegistrySupplier<Item> itemRegistration(String name, Block block) {
		return ConsistencyPlusMain.ITEMS.register(name, () -> new BlockItem(block, CPlusItemGroups.consistencyPlusMiscItemSettings()));
	}

	public static RegistrySupplier<Block> blockRegistration(String name, BlockShapes blockShapes, AbstractBlock.Settings blockSettings) {
		return switch (blockShapes) {
			default -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new Block(blockSettings));
			case SLAB -> ConsistencyPlusMain.BLOCKS.register(name, () -> new SlabBlock(blockSettings));
			case STAIRS -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new CPlusStairBlock(Blocks.STONE.getDefaultState(), blockSettings));
			//case STAIRS -> new CPlusStairBlock(getBlock(material, BlockVariations.BLOCK, type).getDefaultState(), blockSettings);
			case WALL -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new WallBlock(blockSettings));
			case GATE -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new CPlusFenceGateBlock(blockSettings));
			case PILLAR -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new PillarBlock(blockSettings));
		};
	}

	public static RegistrySupplier<Block> unwaxedBlockRegistration(String name, BlockShapes blockShapes, AbstractBlock.Settings blockSettings, OxidationLevel level) {
		return switch (blockShapes) {
			default -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new OxidizableBlock(level, blockSettings));
			case SLAB -> ConsistencyPlusMain.BLOCKS.register(name, () -> new OxidizableSlabBlock(level, blockSettings));
			case STAIRS -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new OxidizableStairsBlock(level, Blocks.COPPER_BLOCK.getDefaultState(), blockSettings));
			//case STAIRS -> new CPlusStairBlock(getBlock(material, BlockVariations.BLOCK, type).getDefaultState(), blockSettings);
			case WALL -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new OxidizableWallBlock(level, blockSettings));
			case GATE -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new OxidizableGateBlock(level, blockSettings));
			case PILLAR -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new OxidizablePillarBlock(level, blockSettings));
		};
	}

	private static void tryRegisterOxidizable(Block more, CopperOxidization current, BlockTypes type, BlockShapes shape) {
		ConsistencyPlusMain.LOGGER.info("Trying to register Oxidizables");
		if (current == CopperOxidization.BASE) return;
		CopperOxidization last = CopperOxidization.values()[current.ordinal() - 1];
		Block less = getBlock(last, type, shape, false);
		registerOxidizable(less, more);
	}

	private static String getOxiID(CopperOxidization oxidization, BlockShapes shape, BlockTypes type){
		String id = oxidization.addOxidization(shape.addShapes(type.addType("copper"), type));
		return CPlusEnhancedRegistry.overrideMap.getOrDefault(id, id);
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

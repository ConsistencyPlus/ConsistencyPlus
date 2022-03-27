package io.github.consistencyplus.consistency_plus.core.entries.block;

import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.CopperOxidization;
import net.minecraft.block.AbstractBlock;

import static io.github.consistencyplus.consistency_plus.registry.CPlusEntries.checkMinecraft;

public class MetalRegistryEntryGroup extends RegistryEntryGroup {
    //todo: This class replacing old CPlusCopperBlocks
    public MetalRegistryEntryGroup(String name, AbstractBlock.Settings blockSettings) {
        super(name, blockSettings);
    }

    public void construct() {
        for (CopperOxidization oxidization : CopperOxidization.values()) {
            for (BlockTypes type : BlockTypes.values()) {
                for (BlockShapes shape : BlockShapes.values()) {
                    if (!type.equals(BlockTypes.BASE) && !shape.withTypes) break;
                    if (type.equals(BlockTypes.COBBLED)) break;
                    if (type.equals(BlockTypes.TILE)) break; //todo: Replace this with a blacklist thing
                    String id = getID(shape, type);
                    checkset2(id);
                    register(id, shape, specialCasing(type, shape));
                }
            }
        }

        /*
        for (CopperOxidization oxidization : CopperOxidization.values()) {
			for (BlockTypes type : BlockTypes.values()) {
				for (BlockShapes shape : BlockShapes.values()) {
					if (!type.equals(BlockTypes.BASE) && !shape.withTypes) break;
					if (type.equals(BlockTypes.TILE) && (shape.equals(BlockShapes.BLOCK) || shape.equals(BlockShapes.SLAB) || shape.equals(BlockShapes.STAIRS))) continue;
					if (type.equals(BlockTypes.BASE) && shape.equals(BlockShapes.BLOCK)) continue;
					if (type.equals(BlockTypes.COBBLED)) break;
					String id = getOxiID(oxidization, shape, type);
					if (CPlusEntries.checkMinecraft(id)) continue;
					if (CPlusEntries.blacklistedIDs.contains(id)) continue;

					register(id, shape, CPlusSharedBlockSettings.copper(oxidization), oxidization.toVanilla(), type);
				}
			}
		}

		finish();

			@ExpectPlatform
	private static void registerOxidizable(RegistrySupplier<Block> less, RegistrySupplier<Block> more) {
		throw new RuntimeException("Architectury failed!");
	}

	@ExpectPlatform
	private static void registerWaxable(RegistrySupplier<Block> no, RegistrySupplier<Block> yes) {
		throw new RuntimeException("Architectury failed!");
	}

	@ExpectPlatform
	private static void finish() {
		throw new RuntimeException("Architectury failed!");
	}
         */


    }
}

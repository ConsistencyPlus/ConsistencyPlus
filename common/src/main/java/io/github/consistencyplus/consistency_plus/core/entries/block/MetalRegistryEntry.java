package io.github.consistencyplus.consistency_plus.core.entries.block;

import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.CopperOxidization;
import io.github.consistencyplus.consistency_plus.registry.CPlusEnhancedRegistry;
import net.minecraft.block.AbstractBlock;

import static io.github.consistencyplus.consistency_plus.registry.CPlusEnhancedRegistry.checkMinecraft;

public class MetalRegistryEntry extends AbstractRegistryEntry {
    //todo: This class replacing old CPlusCopperBlocks
    public MetalRegistryEntry(String name, AbstractBlock.Settings blockSettings) {
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
                    if (checkMinecraft(id)) break;
                    if (CPlusEnhancedRegistry.blacklistedIDs.contains(id)) break;
                    AbstractBlock.Settings specialCased;
                    if (checkMinecraft(type.addType(name))) specialCased = AbstractBlock.Settings.copy(getBlock(BlockShapes.BLOCK, type));
                    else specialCased = blockSettings;
                    register(id, shape, specialCased);
                }
            }
        }
    }
}

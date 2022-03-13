package io.github.consistencyplus.consistency_plus.core.entries.block;

import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.registry.CPlusEnhancedRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.util.DyeColor;

import static io.github.consistencyplus.consistency_plus.registry.CPlusEnhancedRegistry.checkMinecraft;

public class PolishedGlazedTerracottaRegistryEntry extends DyedRegistryEntry {
    public PolishedGlazedTerracottaRegistryEntry(String name, AbstractBlock.Settings blockSettings) {
        super(name, blockSettings, false);
    }

    @Override
    public void construct() {
        for (DyeColor color : DyeColor.values()) {
            for (BlockTypes type : BlockTypes.values()) {
                for (BlockShapes shape : BlockShapes.values()) {
                    if (!shape.withTypes || !type.equals(BlockTypes.POLISHED)) break;
                    String id = getDyedID(color, shape, type);
                    if (checkMinecraft(id)) break;
                    if (CPlusEnhancedRegistry.blacklistedIDs.contains(id)) break;
                    register(id, shape, blockSettings.mapColor(color.getMapColor()));
                }
            }
        }
    }
}

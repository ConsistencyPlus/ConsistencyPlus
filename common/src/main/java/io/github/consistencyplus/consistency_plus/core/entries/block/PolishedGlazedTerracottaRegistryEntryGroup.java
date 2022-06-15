package io.github.consistencyplus.consistency_plus.core.entries.block;

import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import net.minecraft.block.AbstractBlock;
import net.minecraft.util.DyeColor;

public class PolishedGlazedTerracottaRegistryEntryGroup extends DyedRegistryEntryGroup {
    public PolishedGlazedTerracottaRegistryEntryGroup(String name, AbstractBlock.Settings blockSettings) {
        super(name, blockSettings, false);
    }

    @Override
    public void construct() {
        for (DyeColor color : DyeColor.values()) {
            for (BlockTypes type : BlockTypes.values()) {
                for (BlockShapes shape : BlockShapes.values()) {
                    if (!shape.withTypes || !type.equals(BlockTypes.POLISHED)) break;
                    String id = getDyedID(color, shape, type);
                    if (!postIDChecks(id)) continue;
                    register(id, shape, blockSettings.mapColor(color.getMapColor()));
                }
            }
        }
    }
}

package io.github.consistencyplus.consistency_plus.core.entries.block.deprecated;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.core.entries.block.DyedRegistryEntryGroup;
import io.github.consistencyplus.consistency_plus.registry.CPlusItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SnowBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;

import static io.github.consistencyplus.consistency_plus.registry.CPlusEntries.checkMinecraft;

public class DyedIceRegistryEntryGroup extends DyedRegistryEntryGroup {
    public DyedIceRegistryEntryGroup(String name, AbstractBlock.Settings blockSettings) {
        super(name, blockSettings, true);
    }

    @Override
    public void construct() {
        for (DyeColor color : DyeColor.values()) {
            for (BlockShapes shape : BlockShapes.values()) {
                if (!shape.withTypes) break;
                if (color.equals(DyeColor.BLUE)) continue;
                String id = getDyedID(color, shape, BlockTypes.BASE);
                if (checkMinecraft(id)) continue;
                register(id, shape, getBlockSettings().mapColor(color.getMapColor()));
            }
        }
    }

    public void register(String id, BlockShapes shape, AbstractBlock.Settings blockSettings) {
        RegistrySupplier<Block> a = blockRegistration(id, shape, blockSettings);
        RegistrySupplier<Item> b = ConsistencyPlusMain.ITEMS.register(id, () -> new BlockItem(a.get(), (id.contains("blue_ice")) ? CPlusItemGroups.consistencyPlusMiscItemSettings() : CPlusItemGroups.consistencyPlusDeprecatedSettings()));
    }
}

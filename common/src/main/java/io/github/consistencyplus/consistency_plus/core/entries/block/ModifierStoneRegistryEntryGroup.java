package io.github.consistencyplus.consistency_plus.core.entries.block;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.SetModifiers;
import io.github.consistencyplus.consistency_plus.registry.CPlusEntries;
import io.github.consistencyplus.consistency_plus.registry.CPlusItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import static io.github.consistencyplus.consistency_plus.registry.CPlusEntries.checkMinecraft;

public class ModifierStoneRegistryEntryGroup extends RegistryEntryGroup {
    public ModifierStoneRegistryEntryGroup(String name, AbstractBlock.Settings blockSettings) {
        super(name, blockSettings, false);
        construct();
    }

    public void construct() {
        for (SetModifiers modifier : SetModifiers.values()) {
            for (BlockTypes type : BlockTypes.values()) {
                for (BlockShapes shape : BlockShapes.values()) {
                    if (!type.equals(BlockTypes.BASE) && !shape.withTypes) continue;
                    if (!modifier.canGenerate(type, shape)) continue;
                    String id = getSetModifiedID(modifier, shape, type);
                    if (!checkset2(id)) continue;
                    register(id, shape, specialCasing(type,shape));
                }
            }
        }
        if (checkset2(name + "_brick")) ConsistencyPlusMain.ITEMS.register(name + "_brick", () -> new Item(new Item.Settings().group(ItemGroup.MISC)));
    }

    public String getSetModifiedID(SetModifiers modifier, BlockShapes shapes, BlockTypes type) {
        String id = modifier.addModifier(shapes.addShapes(type.addType(name), type));
        return CPlusEntries.overrideMap.getOrDefault(id, id);
    }

    public void register(String id, BlockShapes shape, AbstractBlock.Settings blockSettings) {
        RegistrySupplier<Block> a = blockRegistration(id, shape, blockSettings);
        RegistrySupplier<Item> b = ConsistencyPlusMain.ITEMS.register(id, () -> new BlockItem(a.get(), CPlusItemGroups.consistencyPlusStoneItemSettings()));
    }
}
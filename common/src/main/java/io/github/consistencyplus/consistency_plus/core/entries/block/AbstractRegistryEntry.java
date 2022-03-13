package io.github.consistencyplus.consistency_plus.core.entries.block;


import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.core.entries.interfaces.BlockRegistryInterface;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusFenceGateBlock;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusStairBlock;
import io.github.consistencyplus.consistency_plus.registry.CPlusEnhancedRegistry;
import net.minecraft.block.*;
import net.minecraft.item.Item;

import static io.github.consistencyplus.consistency_plus.registry.CPlusEnhancedRegistry.checkMinecraft;

public abstract class AbstractRegistryEntry implements BlockRegistryInterface {
    // This note is more towards Jay than anyone else.
    // For now, this is the solution Im choosing, however, after 0.5, we can change the way these are registered.
    public static String name;
    public static AbstractBlock.Settings blockSettings;

    public AbstractRegistryEntry(String name, AbstractBlock.Settings blockSettings) {
        AbstractRegistryEntry.name = name;
        AbstractRegistryEntry.blockSettings = blockSettings;
        construct();
    }

    public AbstractRegistryEntry(String name, AbstractBlock.Settings blockSettings, boolean construct) {
        //Use this as a way to reference the code without constructing the actual blocks. Useful for DyedRegistryEntry
        AbstractRegistryEntry.name = name;
        AbstractRegistryEntry.blockSettings = blockSettings;
        if (construct) construct();
    }

    public void construct() {
        for (BlockTypes type : BlockTypes.values()) {
            for (BlockShapes shape : BlockShapes.values()) {
                if ((!shape.withTypes || !type.equals(BlockTypes.BASE)) && CPlusEnhancedRegistry.baseOnlyIDs.contains(name)) break;
                if (!type.equals(BlockTypes.BASE) && !shape.withTypes) break;
                if (type.equals(BlockTypes.COBBLED) && CPlusEnhancedRegistry.cobblelessMaterials.contains(name)) break;
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

    public RegistrySupplier<Block> blockRegistration(String name, BlockShapes blockShapes, AbstractBlock.Settings blockSettings) {
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

    public void register(String id, BlockShapes blockShapes, AbstractBlock.Settings blockSettings) {
        RegistrySupplier<Block> a;// = blockRegistration(id, shape, blockSettings);
        RegistrySupplier<Item> b; // = ConsistencyPlusMain.ITEMS.register(id, () -> new BlockItem(a.get(), itemSettings));
    }

    public String getID(BlockShapes shapes, BlockTypes type) {
        String id = shapes.addShapes(type.addType(name), type);
        return CPlusEnhancedRegistry.overrideMap.getOrDefault(id, id);
    }
}

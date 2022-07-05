package io.github.consistencyplus.consistency_plus.core.entries.block;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.ice.*;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusFenceGateBlock;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusStairBlock;
import net.minecraft.block.*;

import java.util.ArrayList;

public class IceRegistryEntryGroup extends MiscRegistryEntryGroup {
    // This is static because Im lazy
    public static ArrayList<RegistrySupplier<Block>> iceBlocks = new ArrayList<>();

    public IceRegistryEntryGroup(String name, AbstractBlock.Settings blockSettings) {
        super(name, blockSettings);
    }

    // Todo: Yeah this is why I need to redo this
    public RegistrySupplier<Block> blockRegistration(String name, BlockShapes blockShapes, AbstractBlock.Settings blockSettings) {
        RegistrySupplier<Block> a = switch (blockShapes) {
            default -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new IceBlock(blockSettings));
            case SLAB -> ConsistencyPlusMain.BLOCKS.register(name, () -> new IceSlabBlock(blockSettings));
            case STAIRS -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new IceStairsBlock(Blocks.ICE.getDefaultState(), blockSettings));
            //case STAIRS -> new CPlusStairBlock(getBlock(material, BlockVariations.BLOCK, type).getDefaultState(), blockSettings);
            case WALL -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new IceWallBlock(blockSettings));
            case GATE -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new IceGateBlock(blockSettings));
            case PILLAR -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new IcePillarBlock(blockSettings));
        };
        iceBlocks.add(a);
        return a;
    }
}

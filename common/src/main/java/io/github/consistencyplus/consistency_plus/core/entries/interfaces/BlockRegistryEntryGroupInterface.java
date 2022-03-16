package io.github.consistencyplus.consistency_plus.core.entries.interfaces;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.consistencyplus.consistency_plus.registry.CPlusEntries.checkMinecraft;

public interface BlockRegistryEntryGroupInterface extends BasicRegistryEntryGroupInterface {
    void register(String id, BlockShapes shape, AbstractBlock.Settings blockSettings);
    RegistrySupplier<Block> blockRegistration(String name, BlockShapes blockShapes, AbstractBlock.Settings blockSettings);
    String getID(BlockShapes shapes, BlockTypes type);
    default Block getBlock(BlockShapes shapes, BlockTypes type) {
        String id = getID(shapes, type);
        if (checkMinecraft(id)) return Registry.BLOCK.get(new Identifier("minecraft", (id)));
        return Registry.BLOCK.get(ConsistencyPlusMain.id(id));
    }

    default Item getItem(BlockShapes shapes, BlockTypes type) {
        String id = getID(shapes, type);
        if (checkMinecraft(id)) return Registry.ITEM.get(new Identifier("minecraft", (id)));
        return Registry.ITEM.get(ConsistencyPlusMain.id(id));
    }
}

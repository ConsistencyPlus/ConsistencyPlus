package io.github.consistencyplus.consistency_plus.registry.families;

import com.google.common.collect.Table;
import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import org.jetbrains.annotations.Nullable;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockFamily {
    public final String name;
    public final Table<BlockStyle, BlockShape, BlockEntry> blockTable;
    public final CPlusRenderType renderLayer;
    @Nullable
    public final Item brickItem;

    protected BlockFamily(String name, Table<BlockStyle, BlockShape, BlockEntry> blockTable, @Nullable Item brickItem, CPlusRenderType renderLayer) {
        this.name = name;
        this.blockTable = blockTable;
        this.brickItem = brickItem;
        this.renderLayer = renderLayer;
    }

    public BlockEntry get(BlockStyle style, BlockShape shape) {
        return blockTable.get(style, shape);
    }

    public Block getBlock(BlockStyle style, BlockShape shape) {
        BlockEntry entry = get(style, shape);
        return entry == null ? null : entry.block();
    }

    public Block getBaseBlock() {
        return getBlock(BlockStyle.PLAIN, BlockShape.CUBE);
    }

    public static BlockFamilyBuilder builder(String name) {
        return new BlockFamilyBuilder(name);
    }

    public void register() {
        blockTable.values().forEach(entry -> {
            Registry.register(Registries.BLOCK, entry.id(), entry.block());
            Registry.register(Registries.ITEM, entry.id(), entry.item());
        });
        if (this.brickItem != null) {
            Identifier id = ConsistencyPlusMain.id(this.name + "_brick");
            Registry.register(Registries.ITEM, id, this.brickItem);
        }
    }
}

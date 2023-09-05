package io.github.consistencyplus.consistency_plus.registry.families;

import com.google.common.collect.Table;
import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.util.LoaderUtils;
import org.jetbrains.annotations.Nullable;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class BlockFamily {
    public final String name;
    public final Table<BlockStyle, BlockShape, BlockEntry> blockTable;
    @Nullable
    public final Item brickItem;
    public final RegistryKey<ItemGroup> groupKey;
    public final CPlusRenderType renderLayer;

    protected BlockFamily(String name, Table<BlockStyle, BlockShape, BlockEntry> blockTable, @Nullable Item brickItem, RegistryKey<ItemGroup> groupKey, CPlusRenderType renderLayer) {
        this.name = name;
        this.blockTable = blockTable;
        this.brickItem = brickItem;
        this.groupKey = groupKey;
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
            LoaderUtils.registerBlock(entry.id(), entry.block());
            LoaderUtils.registerItem(entry.id(), entry.item());
        });
        if (this.brickItem != null) {
            Identifier id = ConsistencyPlusMain.id(this.name + "_brick");
            LoaderUtils.registerItem(id, this.brickItem);
        }
    }

    public void addItemsToGroup(RegistryKey<ItemGroup> groupKey, ItemGroup.Entries entries) {
        if (groupKey.equals(this.groupKey)) {
            blockTable.values().forEach(entry -> entries.add(entry.item()));
            if (this.brickItem != null) {
                entries.add(brickItem);
            }
        }
    }
}

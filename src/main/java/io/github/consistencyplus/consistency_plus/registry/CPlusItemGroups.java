package io.github.consistencyplus.consistency_plus.registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CPlusItemGroups {
    public static final ItemGroup CONSISTENCY_PLUS_STONE = FabricItemGroupBuilder.build(new Identifier("consistency_plus", "stone"), () -> new ItemStack(CPlusBlocks.CARVED_STONE));
    public static final ItemGroup CONSISTENCY_PLUS_DYEABLE = FabricItemGroupBuilder.build(new Identifier("consistency_plus", "dyeable"), () -> new ItemStack(CPlusBlocks.TERRACOTTA_STAIRS));
    public static final ItemGroup CONSISTENCY_PLUS_MISC = FabricItemGroupBuilder.build(new Identifier("consistency_plus", "misc"), () -> new ItemStack(CPlusBlocks.PURPUR_BLOCK));

    public static Item.Settings consistencyPlusStoneItemSettings() {
        return new Item.Settings().group(CONSISTENCY_PLUS_STONE);
    }

    public static Item.Settings consistencyPlusDyeableItemSettings() {
        return new Item.Settings().group(CONSISTENCY_PLUS_DYEABLE);
    }

    public static Item.Settings consistencyPlusMiscItemSettings() {
        return new Item.Settings().group(CONSISTENCY_PLUS_MISC);
    }
}

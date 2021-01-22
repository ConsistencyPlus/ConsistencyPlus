package net.consistencyteam.consistency_plus;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroups {
    public static final ItemGroup CONSISTENCY_PLUS_STONE = FabricItemGroupBuilder.build(new Identifier("consistency_plus", "stone"), () -> new ItemStack(Blocks.STONE_BRICK_PILLAR));
    public static Item.Settings consistencyPlusStoneItemSettings() {
        return new Item.Settings().group(CONSISTENCY_PLUS_STONE);
    }

    public static final ItemGroup CONSISTENCY_PLUS_SANDSTONE = FabricItemGroupBuilder.build(new Identifier("consistency_plus", "sandstone"), () -> new ItemStack(Blocks.SANDSTONE_BRICKS));
    public static Item.Settings consistencyPlusSandstoneItemSettings() {
        return new Item.Settings().group(CONSISTENCY_PLUS_SANDSTONE);
    }

    public static final ItemGroup CONSISTENCY_PLUS_BRICK = FabricItemGroupBuilder.build(new Identifier("consistency_plus", "brick"), () -> new ItemStack(Blocks.BLUE_NETHER_BRICKS));
    public static Item.Settings consistencyPlusBrickItemSettings() {
        return new Item.Settings().group(CONSISTENCY_PLUS_BRICK);
    }

    public static final ItemGroup CONSISTENCY_PLUS_LESSER_STONE = FabricItemGroupBuilder.build(new Identifier("consistency_plus", "lesser_stone"), () -> new ItemStack(Blocks.ANDESITE_BRICKS));
    public static Item.Settings consistencyPlusLesserStoneItemSettings() {
        return new Item.Settings().group(CONSISTENCY_PLUS_LESSER_STONE);
    }

    public static final ItemGroup CONSISTENCY_PLUS_DYEABLE = FabricItemGroupBuilder.build(new Identifier("consistency_plus", "dyeable"), () -> new ItemStack(Blocks.TERRACOTTA_STAIRS));
    public static Item.Settings consistencyPlusDyeableItemSettings() {
        return new Item.Settings().group(CONSISTENCY_PLUS_DYEABLE);
    }

    public static final ItemGroup CONSISTENCY_PLUS_MISC = FabricItemGroupBuilder.build(new Identifier("consistency_plus", "misc"), () -> new ItemStack(Blocks.PURPUR_BLOCK));
    public static Item.Settings consistencyPlusMiscItemSettings() {
        return new Item.Settings().group(CONSISTENCY_PLUS_MISC);
    }

    public static final ItemGroup CONSISTENCY_PLUS_EXTRA = FabricItemGroupBuilder.build(new Identifier("consistency_plus", "extra"), () -> new ItemStack(Blocks.JACK_O_SOUL));
    public static Item.Settings consistencyPlusExtraItemSettings() {
        return new Item.Settings().group(CONSISTENCY_PLUS_EXTRA);
    }
}

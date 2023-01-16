package io.github.consistencyplus.consistency_plus.core.entries.block;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.core.entries.interfaces.DyedBlockRegistryEntryGroupInterface;
import io.github.consistencyplus.consistency_plus.data.MasterKey;
import io.github.consistencyplus.consistency_plus.registry.CPlusEntries;
import io.github.consistencyplus.consistency_plus.registry.CPlusItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.github.consistencyplus.consistency_plus.registry.CPlusEntries.checkMinecraft;

public class DyedRegistryEntryGroup extends RegistryEntryGroup implements DyedBlockRegistryEntryGroupInterface {
    boolean withBase;

    public static final List<DyedRegistryEntryGroup> ALL_DYED_ENTRY_GROUPS = new ArrayList<>();

    protected Map<DyeColor, RegistrySupplier<Item>> DYED_BRICKS = new HashMap<>();

    public DyedRegistryEntryGroup(String name, AbstractBlock.Settings blockSettings, Boolean withBase) {
        super(name, blockSettings, false);
        this.withBase = withBase;
        construct();

        ALL_DYED_ENTRY_GROUPS.add(this);
    }

    @Override
    public void construct() {
        if (withBase) super.construct();
        for (DyeColor color : DyeColor.values()) {
            for (BlockTypes type : BlockTypes.values()) {
                for (BlockShapes shape : BlockShapes.values()) {
                    if (!preIDChecks(shape, type)) break;
                    if (!shape.equals(BlockShapes.BLOCK) && name.equals("tinted_glass")) break;
                    String id = getDyedID(color, shape, type);
                    if (!postIDChecks(id)) continue;
                    // Block Setting Code is here.
                    AbstractBlock.Settings dyedBlockSettings = getBlockSettings();
                    dyedBlockSettings = (name.equals("terracotta")) ? dyedBlockSettings.mapColor(CPlusEntries.toTerracottaMapColor(color)) : dyedBlockSettings.mapColor(color.getMapColor());
                    register(id, shape, dyedBlockSettings);
                }
            }

            if (!(name.equals("glowstone") || name.equals("tinted_glass"))){
                RegistrySupplier<Item> dyed_brick = ConsistencyPlusMain.ITEMS.register(color.toString() + "_" + name + "_brick", () -> new Item(new Item.Settings().group(ItemGroup.MISC)));

                DYED_BRICKS.put(color, dyed_brick);
            }
        }
    }

    public void register(String id, BlockShapes shape, AbstractBlock.Settings blockSettings) {
        RegistrySupplier<Block> a = blockRegistration(id, shape, blockSettings);
        RegistrySupplier<Item> b = ConsistencyPlusMain.ITEMS.register(id, () -> new BlockItem(a.get(), CPlusItemGroups.consistencyPlusDyeableItemSettings()));
    }

    public Block getDyedBlock(DyeColor dyeColor, BlockShapes shapes, BlockTypes type) {
        String id = getDyedID(dyeColor, shapes, type);
        if (checkMinecraft(id)) return Registry.BLOCK.get(new Identifier("minecraft", (id)));
        return Registry.BLOCK.get(ConsistencyPlusMain.id(id));
    }

    public Item getDyedItem(DyeColor dyeColor, BlockShapes shapes, BlockTypes type) {
        String id = getDyedID(dyeColor, shapes, type);
        if (checkMinecraft(id)) return Registry.ITEM.get(new Identifier("minecraft", (id)));
        return Registry.ITEM.get(ConsistencyPlusMain.id(id));
    }

    @Nullable
    public Item getDyedBrick(DyeColor color){
        return !this.DYED_BRICKS.isEmpty() ? DYED_BRICKS.get(color).get() : null;
    }

    public String getDyedID(DyeColor color, BlockShapes shapes, BlockTypes type) {
        String id = shapes.addShapes(type.addType(color.toString() + "_" + name), type);

        MasterKey.ULTIMATE_KEY_RING.put(CPlusEntries.overrideMap.getOrDefault(id, id), MasterKey.createDyedKey(shapes, type, color, this.name));

        return CPlusEntries.overrideMap.getOrDefault(id, id);
    }

    public Block getBlock(BlockShapes shapes, BlockTypes type) {
        if (withBase) {
            String id = getID(shapes, type);
            if (checkMinecraft(id)) return Registry.BLOCK.get(new Identifier("minecraft", (id)));
            return Registry.BLOCK.get(ConsistencyPlusMain.id(id));
        } else return getDyedBlock(DyeColor.WHITE, shapes, type);
    }

    public Item getItem(BlockShapes shapes, BlockTypes type) {
        if (withBase) {
            String id = getID(shapes, type);
            if (checkMinecraft(id)) return Registry.ITEM.get(new Identifier("minecraft", (id)));
            return Registry.ITEM.get(ConsistencyPlusMain.id(id));
        } else return getDyedItem(DyeColor.WHITE, shapes, type);
    }


    //dyeColor.toString() + "_" +
}

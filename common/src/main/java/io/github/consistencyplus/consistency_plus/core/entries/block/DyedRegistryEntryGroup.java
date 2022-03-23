package io.github.consistencyplus.consistency_plus.core.entries.block;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.core.entries.interfaces.DyedBlockRegistryEntryGroupInterface;
import io.github.consistencyplus.consistency_plus.registry.CPlusEntries;
import io.github.consistencyplus.consistency_plus.registry.CPlusItemGroups;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.consistencyplus.consistency_plus.registry.CPlusEntries.checkMinecraft;

public class DyedRegistryEntryGroup extends RegistryEntryGroup implements DyedBlockRegistryEntryGroupInterface {
    boolean withBase;
    AbstractBlock.Settings dyedSettings;

    public DyedRegistryEntryGroup(String name, AbstractBlock.Settings blockSettings, Boolean withBase) {
        super(name, blockSettings, false);
        this.withBase = withBase;
        this.dyedSettings = blockSettings;
        construct();
    }

    @Override
    public void construct() {
        for (DyeColor color : DyeColor.values()) {
            for (BlockTypes type : BlockTypes.values()) {
                for (BlockShapes shape : BlockShapes.values()) {
                    if ((!shape.withTypes || !type.equals(BlockTypes.BASE)) && CPlusEntries.baseOnlyIDs.contains(name)) break;
                    if (!type.equals(BlockTypes.BASE) && !shape.withTypes) break;
                    if (type.equals(BlockTypes.COBBLED) && CPlusEntries.cobblelessMaterials.contains(name)) break;
                    if (!shape.equals(BlockShapes.BLOCK) && name.equals("tinted_glass")) break;
                    String id = getDyedID(color, shape, type);
                    if (!checkset2(id)) continue;
                    final AbstractBlock.Settings settings = specialCasing(type, color, id, shape);
                    final MapColor colorFinal = color.getMapColor();
                    register(id, shape, dyedSettings.mapColor(colorFinal));
                }
            }
        }

        if (withBase) super.construct();
    }

    public AbstractBlock.Settings specialCasing(BlockTypes type, DyeColor color, String id, BlockShapes shape) {
        AbstractBlock.Settings settings;
        if (checkMinecraft(type.addType(color.toString().toLowerCase() + "_" + name))) {
            settings = AbstractBlock.Settings.copy(getDyedBlock(color, BlockShapes.BLOCK, type));
        } else settings = dyedSettings;
        final AbstractBlock.Settings finalSettings = settings;
        return finalSettings.mapColor(color.getMapColor()); //Color.getMapColor for some reason makes the block color black
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

    public String getDyedID(DyeColor color, BlockShapes shapes, BlockTypes type) {
        String id = shapes.addShapes(type.addType(color.toString().toLowerCase() + "_" + name), type);
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

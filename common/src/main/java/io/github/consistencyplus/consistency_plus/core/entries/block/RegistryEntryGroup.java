package io.github.consistencyplus.consistency_plus.core.entries.block;


import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.FalseBlock;
import io.github.consistencyplus.consistency_plus.core.entries.interfaces.BlockRegistryEntryGroupInterface;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusFenceGateBlock;
import io.github.consistencyplus.consistency_plus.core.extensions.CPlusStairBlock;
import io.github.consistencyplus.consistency_plus.data.MasterKey;
import io.github.consistencyplus.consistency_plus.registry.CPlusEntries;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

import static io.github.consistencyplus.consistency_plus.registry.CPlusEntries.checkMinecraft;

public abstract class RegistryEntryGroup implements BlockRegistryEntryGroupInterface {

    public static final List<RegistryEntryGroup> ALL_ENTRY_GROUPS = new ArrayList<>();

    public String name;
    public AbstractBlock.Settings blockSettings;
    public FalseBlock settingsStorage; // My pride and joy

    protected @Nullable RegistrySupplier<Item> BRICK_ITEM = null;

    public RegistryEntryGroup(String name, AbstractBlock.Settings blockSettings) {
        this.name = name;
        this.blockSettings = blockSettings;
        settingsStorage = new FalseBlock(blockSettings);
        construct();

        ALL_ENTRY_GROUPS.add(this);
    }

    public RegistryEntryGroup(String name, AbstractBlock.Settings blockSettings, boolean construct) {
        //Use this as a way to reference the code without constructing the actual blocks. Useful for DyedRegistryEntry
        this.name = name;
        this.blockSettings = blockSettings;
        settingsStorage = new FalseBlock(blockSettings);
        if (construct) construct();
    }

    public void construct() {
        for (BlockTypes type : BlockTypes.values()) {
            for (BlockShapes shape : BlockShapes.values()) {
                if (!preIDChecks(shape, type)) break;
                String id = getID(shape, type);
                if (!postIDChecks(id)) continue;
                register(id, shape, specialCasing(type,shape));
            }
        }

        if (postIDChecks(name + "_brick")){
            BRICK_ITEM = ConsistencyPlusMain.ITEMS.register(name + "_brick", () -> new Item(new Item.Settings().group(ItemGroup.MISC)));
        }
    }

    public AbstractBlock.Settings getBlockSettings() {
        return AbstractBlock.Settings.copy(settingsStorage);
    }

    public boolean preIDChecks(BlockShapes shape, BlockTypes type) {
        if ((!shape.withTypes || !type.equals(BlockTypes.BASE)) && CPlusEntries.baseOnlyIDs.contains(name)) return false;
        if (!type.equals(BlockTypes.BASE) && !shape.withTypes) return false;
        if (type.equals(BlockTypes.COBBLED) && CPlusEntries.cobblelessMaterials.contains(name)) return false;
        return true;
    }

    public boolean postIDChecks(String id) {
        if (checkMinecraft(id)) return false;
        if (CPlusEntries.blacklistedIDs.contains(id)) return false;
        return true;
    }

    public AbstractBlock.Settings specialCasing(BlockTypes type, BlockShapes shape) {
        if (name.equals("crying_obsidian") && (shape.equals(BlockShapes.SLAB) || shape.equals(BlockShapes.STAIRS))) return getBlockSettings().nonOpaque();
        if (name.equals("netherrack") && (shape.withTypes)) return getBlockSettings();
        if (!this.name.equals("snow") && checkMinecraft(type.addType(name))) return AbstractBlock.Settings.copy(getBlock(BlockShapes.BLOCK, type));
        return getBlockSettings();
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

    public Block getBlock(BlockShapes shapes, BlockTypes type) {
        String id = getID(shapes, type);
        if (checkMinecraft(id)) return Registry.BLOCK.get(new Identifier("minecraft", (id)));
        return Registry.BLOCK.get(ConsistencyPlusMain.id(id));
    }

    public Item getItem(BlockShapes shapes, BlockTypes type) {
        String id = getID(shapes, type);
        if (checkMinecraft(id)) return Registry.ITEM.get(new Identifier("minecraft", (id)));
        return Registry.ITEM.get(ConsistencyPlusMain.id(id));
    }

    @Nullable
    public Item getBrickItem(){
        return this.BRICK_ITEM != null ? this.BRICK_ITEM.get() : null;
    }

    public String getID(BlockShapes shapes, BlockTypes type) {
        String id = shapes.addShapes(type.addType(name), type);

        MasterKey.ULTIMATE_KEY_RING.put(CPlusEntries.overrideMap.getOrDefault(id, id), MasterKey.createKey(shapes, type, this.name));

        return CPlusEntries.overrideMap.getOrDefault(id, id);
    }
}

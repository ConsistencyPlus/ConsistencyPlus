package io.github.consistencyplus.consistency_plus.core.entries.block;

import dev.architectury.injectables.annotations.ExpectPlatform;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.CopperOxidization;
import io.github.consistencyplus.consistency_plus.blocks.copper.OxidizableGateBlock;
import io.github.consistencyplus.consistency_plus.blocks.copper.OxidizablePillarBlock;
import io.github.consistencyplus.consistency_plus.blocks.copper.OxidizableWallBlock;
import io.github.consistencyplus.consistency_plus.data.MasterKey;
import io.github.consistencyplus.consistency_plus.registry.CPlusEntries;
import io.github.consistencyplus.consistency_plus.registry.CPlusItemGroups;
import io.github.consistencyplus.consistency_plus.registry.CPlusSharedBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Pair;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetalRegistryEntryGroup extends RegistryEntryGroup {

    public static final List<MetalRegistryEntryGroup> ALL_METAL_ENTRY_GROUPS = new ArrayList<>();

    protected Map<CopperOxidization, Pair<RegistrySupplier<Item>, RegistrySupplier<Item>>> ALL_METAL_INGOTS;

    public MetalRegistryEntryGroup(String name, AbstractBlock.Settings blockSettings) {
        super(name, blockSettings);

        ALL_METAL_ENTRY_GROUPS.add(this);
    }

    //todo: Make this work non-statically (FOR THE OTHER TYPES OF METALS) and decide what happens to this system.
    public static final Map<Key, Pair<RegistrySupplier<Block>, RegistrySupplier<Item>>> BLOCKS = new HashMap<>();

    public RegistrySupplier<Block> getBlock(CopperOxidization oxidization, BlockTypes type, BlockShapes shape, boolean waxed) {
        return get(oxidization, type, shape, waxed).getLeft();
    }

    public RegistrySupplier<Item> getItem(CopperOxidization oxidization, BlockTypes type, BlockShapes shape, boolean waxed) {
        return get(oxidization, type, shape, waxed).getRight();
    }

    public Pair<RegistrySupplier<Block>, RegistrySupplier<Item>> get(CopperOxidization oxidization, BlockTypes type, BlockShapes shape, boolean waxed) {
        return BLOCKS.get(new Key(oxidization, type, shape, waxed));
    }

    private record Key(CopperOxidization oxidization, BlockTypes type, BlockShapes shape, boolean waxed) {}

    //todo: Dehardcodeify this
    public void construct() {
        ALL_METAL_INGOTS = new HashMap<>();

        for (CopperOxidization oxidization : CopperOxidization.values()) {
            for (BlockTypes type : BlockTypes.values()) {
                for (BlockShapes shape : BlockShapes.values()) {

                    if (!preIDChecks(shape, type)) break;
                    if (type.equals(BlockTypes.TILE) && (shape.equals(BlockShapes.BLOCK) || shape.equals(BlockShapes.SLAB) || shape.equals(BlockShapes.STAIRS))) continue;
                    if (type.equals(BlockTypes.BASE) && shape.equals(BlockShapes.BLOCK)) continue;

                    String id = getOxiID(oxidization, shape, type);
                    if (!postIDChecks(id)) continue;

                    register(id, shape, CPlusSharedBlockSettings.copper(oxidization), oxidization.toVanilla(), type);
                }
            }

            if (postIDChecks(name + "_brick")){
                Pair<RegistrySupplier<Item>, RegistrySupplier<Item>> pair = new Pair<>(
                        ConsistencyPlusMain.ITEMS.register(oxidization.addOxidization(name) + "_brick", () -> new Item(new Item.Settings().group(ItemGroup.MISC))),
                        ConsistencyPlusMain.ITEMS.register("waxed_" + oxidization.addOxidization(name) + "_brick", () -> new Item(new Item.Settings().group(ItemGroup.MISC))));

                ALL_METAL_INGOTS.put(oxidization, pair);
            }

        }
        finish();
    }

    public void register(String name, BlockShapes shape, AbstractBlock.Settings blockSettings, Oxidizable.OxidationLevel level, BlockTypes type) {
        RegistrySupplier<Block> unwaxedBlock = unwaxedBlockRegistration(name, shape, blockSettings, level);
        RegistrySupplier<Item> unwaxedItem =  ConsistencyPlusMain.ITEMS.register(name, () -> new BlockItem(unwaxedBlock.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
        BLOCKS.put(new Key(CopperOxidization.fromVanilla(level), type, shape, false), new Pair<>(unwaxedBlock, unwaxedItem));
        tryRegisterOxidizable(unwaxedBlock, CopperOxidization.fromVanilla(level), type, shape);

        String waxedID = "waxed_" + name;
        RegistrySupplier<Block> waxedBlock = blockRegistration(waxedID, shape, blockSettings);
        RegistrySupplier<Item> waxedItem = ConsistencyPlusMain.ITEMS.register(waxedID, () -> new BlockItem(waxedBlock.get(), CPlusItemGroups.consistencyPlusMiscItemSettings()));
        BLOCKS.put(new Key(CopperOxidization.fromVanilla(level), type, shape, true), new Pair<>(waxedBlock, waxedItem));

        registerWaxable(unwaxedBlock, waxedBlock);
    }

    public RegistrySupplier<Block> unwaxedBlockRegistration(String name, BlockShapes blockShapes, AbstractBlock.Settings blockSettings, Oxidizable.OxidationLevel level) {
        return switch (blockShapes) {
            default -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new OxidizableBlock(level, blockSettings));
            case SLAB -> ConsistencyPlusMain.BLOCKS.register(name, () -> new OxidizableSlabBlock(level, blockSettings));
            case STAIRS -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new OxidizableStairsBlock(level, Blocks.COPPER_BLOCK.getDefaultState(), blockSettings));
            case WALL -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new OxidizableWallBlock(level, blockSettings));
            case GATE -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new OxidizableGateBlock(level, blockSettings));
            case PILLAR -> ConsistencyPlusMain.BLOCKS.register(name, () ->  new OxidizablePillarBlock(level, blockSettings));
        };
    }

    private void tryRegisterOxidizable(RegistrySupplier<Block> more, CopperOxidization current, BlockTypes type, BlockShapes shape) {
        if (current.equals(CopperOxidization.BASE)) return;
        CopperOxidization last = CopperOxidization.values()[current.ordinal() - 1];
        RegistrySupplier<Block> less = getBlock(last, type, shape, false);
        registerOxidizable(less, more);
    }

    @Nullable
    public Pair<Item, Item> getMetalIngotItems(CopperOxidization oxidization){
        if(ALL_METAL_INGOTS.containsKey(oxidization)) {
            Pair<RegistrySupplier<Item>, RegistrySupplier<Item>> pair1 = ALL_METAL_INGOTS.get(oxidization);

            return new Pair<>(pair1.getLeft().get(), pair1.getRight().get());
        } else {
            return null;
        }
    }

    private String getOxiID(CopperOxidization oxidization, BlockShapes shape, BlockTypes type){
        String id = oxidization.addOxidization(shape.addShapes(type.addType(name), type));

        MasterKey.ULTIMATE_KEY_RING.put(CPlusEntries.overrideMap.getOrDefault(id, id), MasterKey.createOxidKey(shape, type, oxidization, this.name));
        MasterKey.ULTIMATE_KEY_RING.put("waxed_" + CPlusEntries.overrideMap.getOrDefault(id, id), MasterKey.createOxidKey(shape, type, oxidization, this.name).waxed(true));

        return CPlusEntries.overrideMap.getOrDefault(id, id);
    }

    @ExpectPlatform
    private static void registerOxidizable(RegistrySupplier<Block> less, RegistrySupplier<Block> more) {
        throw new RuntimeException("Architectury failed!");
    }

    @ExpectPlatform
    private static void registerWaxable(RegistrySupplier<Block> no, RegistrySupplier<Block> yes) {
        throw new RuntimeException("Architectury failed!");
    }

    @ExpectPlatform
    private static void finish() {
        throw new RuntimeException("Architectury failed!");
    }
}

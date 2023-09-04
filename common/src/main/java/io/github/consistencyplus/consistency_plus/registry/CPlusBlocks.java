package io.github.consistencyplus.consistency_plus.registry;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.WarpedWartPlantBlock;
import io.github.consistencyplus.consistency_plus.registry.families.BlockShape;
import io.github.consistencyplus.consistency_plus.registry.families.BlockStyle;
import io.github.consistencyplus.consistency_plus.util.ColoredSet;
import io.github.consistencyplus.consistency_plus.util.VanillaDyeables;

import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.enums.SlabType;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class CPlusBlocks {
    private static final Map<String, Block> blocks = new HashMap<>();
    private static final Map<String, Item> items = new HashMap<>();

    public static final ColoredSet<Block> TINTED_GLASS = ColoredSet.of(color -> {
        if (color == null) {
            return Blocks.TINTED_GLASS;
        } else {
            String name = color.getName() + "_tinted_glass";
            Settings settings = Settings.copy(Blocks.TINTED_GLASS).mapColor(color);
            return registerWithItem(name, new TintedGlassBlock(settings));
        }
    });

    public static final Block WARPED_WART = register("warped_wart",
            new WarpedWartPlantBlock(Settings.copy(Blocks.NETHER_WART).mapColor(MapColor.BRIGHT_TEAL))
    );

    public static final ColoredSet<Block> CONCRETE_POWDER = ColoredSet.of(color -> {
        if (color != null) {
            return VanillaDyeables.CONCRETE_POWDER.get(color);
        } else {
            Settings settings = Settings.copy(Blocks.WHITE_CONCRETE_POWDER).mapColor(MapColor.OFF_WHITE);
            Block hardened = CPlusBlockFamilies.CONCRETE.getColorless().getBaseBlock();
            if (hardened == null) {
                throw new IllegalStateException("Colorless concrete does not exist");
            }
            return registerWithItem("concrete_powder", new ConcretePowderBlock(hardened, settings));
        }
    });

    private static Block register(String name, Block block) {
        blocks.put(name, block);
        return block;
    }

    private static Block registerWithItem(String name, Block block) {
        register(name, block);
        BlockItem item = new BlockItem(block, new Item.Settings());
        items.put(name, item);
        return block;
    }

    public static boolean isValidPortalBlock(BlockState state) {
        if ((state.isIn(CPlusTags.VALID_PORTAL_BLOCKS))) {
            if (state.contains(SlabBlock.TYPE)) {
                return state.get(SlabBlock.TYPE) == SlabType.DOUBLE;
            } return true;
        } return false;
    }

    public static boolean isValidConduitBlock(BlockState state) {
        return state.isIn(CPlusTags.VALID_CONDUIT_BLOCKS);
    }

    public static void init() {
        blocks.forEach((name, block) -> Registry.register(Registries.BLOCK, ConsistencyPlusMain.id(name), block));
        items.forEach((name, item) -> Registry.register(Registries.ITEM, ConsistencyPlusMain.id(name), item));
    }
}

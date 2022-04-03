package io.github.consistencyplus.consistency_plus.core.entries.block.fabric;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.minecraft.block.Block;

import java.util.HashMap;
import java.util.Map;

public class MetalRegistryEntryGroupImpl {
    // Welcome to "Siuol does utterly outrageous stuff in order to get a thing to work."

    public static final Map<RegistrySupplier<Block>, RegistrySupplier<Block>> WAXABLE = new HashMap<>();
    public static final Map<RegistrySupplier<Block>, RegistrySupplier<Block>> OXIDIZABLE = new HashMap<>();

    public static void registerOxidizable(RegistrySupplier<Block> less, RegistrySupplier<Block> more) {
        OXIDIZABLE.put(less, more);
    }

    public static void registerWaxable(RegistrySupplier<Block> no, RegistrySupplier<Block> yes) {
        WAXABLE.put(no, yes);
    }

    public static void finish() {
        // no need because fabric good and best :)
    }
}

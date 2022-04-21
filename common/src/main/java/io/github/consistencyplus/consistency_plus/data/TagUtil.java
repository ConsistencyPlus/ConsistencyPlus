package io.github.consistencyplus.consistency_plus.data;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;

public class TagUtil {

    @ExpectPlatform
    public static <T> TagKey<T> initTag(String name, RegistryKey<? extends Registry<T>> registryKey) {
        throw new AssertionError();
    }

    public static TagKey<Block> initBlockTag(String name, RegistryKey<Registry<Block>> registryKey) {
        return initTag(name, registryKey);
    }

    public static TagKey<Item> initItemTag(String name, RegistryKey<Registry<Item>> registryKey) {
        return initTag(name, registryKey);
    }
}

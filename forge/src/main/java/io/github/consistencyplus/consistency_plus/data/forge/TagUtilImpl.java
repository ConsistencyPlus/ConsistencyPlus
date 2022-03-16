package io.github.consistencyplus.consistency_plus.data.forge;

import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;

public class TagUtilImpl<T>
{
    public static <T> TagKey<T> initTag(String name, RegistryKey<? extends Registry<T>> registryKey)
    {
        return TagKey.of(registryKey, new Identifier("forge", name));
    }
}

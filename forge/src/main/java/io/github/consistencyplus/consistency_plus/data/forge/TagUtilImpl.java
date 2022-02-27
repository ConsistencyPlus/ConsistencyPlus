package io.github.consistencyplus.consistency_plus.data.forge;

import dev.architectury.hooks.tags.TagHooks;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagGroup;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class TagUtilImpl
{
    public static <T> Tag.Identified<T> initTag(String name, Supplier<TagGroup<T>> collection)
    {
        return TagHooks.optional(new Identifier("forge", name), collection);
    }
}

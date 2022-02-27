package io.github.consistencyplus.consistency_plus.data;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagGroup;

import java.util.function.Supplier;

public class TagUtil {

    @ExpectPlatform
    public static <T> Tag.Identified<T> initTag(String name, Supplier<TagGroup<T>> collection) {
        throw new AssertionError();
    }

    public static Tag.Identified<Block> initBlockTag(String name) {
        return initTag(name, BlockTags::getTagGroup);
    }
}

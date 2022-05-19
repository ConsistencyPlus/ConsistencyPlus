package io.github.consistencyplus.consistency_plus.data.providers;

import io.github.consistencyplus.consistency_plus.data.ConsistencyPlusTagProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.server.BlockTagsProvider;
import net.minecraft.data.server.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ConsistencyPlusTagProviderForge {

    public static class UltimateBlockTagProvider extends BlockTagsProvider {

        public UltimateBlockTagProvider(DataGenerator arg, String modId, @Nullable ExistingFileHelper existingFileHelper) {
            super(arg, modId, existingFileHelper);
        }

        @Override
        protected void configure() {
            ConsistencyPlusTagProvider.UltimateBlockTagProvider.INSTANCE.createAndFillTags(this::getOrCreateTagBuilder);
        }
    }

    public static class UltimateItemTagProvider extends ItemTagsProvider {

        public UltimateItemTagProvider(DataGenerator arg, BlockTagsProvider provider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
            super(arg, provider,  modId, existingFileHelper);
        }

        @Override
        protected void configure() {
            ConsistencyPlusTagProvider.UltimateItemTagProvider.INSTANCE.createAndFillTags(this::getOrCreateTagBuilder);
        }
    }
}
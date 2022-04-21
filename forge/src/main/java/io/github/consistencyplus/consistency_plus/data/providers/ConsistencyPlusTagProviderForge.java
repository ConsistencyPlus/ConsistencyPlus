package io.github.consistencyplus.consistency_plus.data.providers;

import io.github.consistencyplus.consistency_plus.data.ConsistencyPlusTagProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.server.BlockTagProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ConsistencyPlusTagProviderForge {

    public static class CommonBlockTagProviderImpl extends BlockTagProvider {

        public CommonBlockTagProviderImpl(DataGenerator arg, String modId, @Nullable ExistingFileHelper existingFileHelper) {
            super(arg, modId, existingFileHelper);
        }

        @Override
        protected void configure() {
            ConsistencyPlusTagProvider.CommonBlockTagProvider.createAndFillTags(this::getOrCreateTagBuilder);
        }
    }

    public static class DyeableBlockTagProviderImpl extends BlockTagProvider {

        public DyeableBlockTagProviderImpl(DataGenerator arg, String modId, @Nullable ExistingFileHelper existingFileHelper) {
            super(arg, modId, existingFileHelper);
        }

        @Override
        protected void configure() {
            ConsistencyPlusTagProvider.DyeableBlockTagProvider.createAndFillTag(this::getOrCreateTagBuilder);
        }
    }

    public static class UltimateBlockTagProvider extends BlockTagProvider {

        public UltimateBlockTagProvider(DataGenerator arg, String modId, @Nullable ExistingFileHelper existingFileHelper) {
            super(arg, modId, existingFileHelper);
        }

        @Override
        protected void configure() {
            ConsistencyPlusTagProvider.UltimateBlockTagProvider.createAndFillTags(this::getOrCreateTagBuilder);
        }
    }
}

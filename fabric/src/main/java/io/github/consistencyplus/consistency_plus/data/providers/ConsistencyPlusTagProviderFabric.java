package io.github.consistencyplus.consistency_plus.data.providers;

import io.github.consistencyplus.consistency_plus.data.ConsistencyPlusTagProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import org.jetbrains.annotations.Nullable;

public class ConsistencyPlusTagProviderFabric {

    public static class UltimateBlockTagProvider extends FabricTagProvider.BlockTagProvider {

        public UltimateBlockTagProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateTags() {
            ConsistencyPlusTagProvider.UltimateBlockTagProvider.INSTANCE.createAndFillTags(this::getOrCreateTagBuilder);
        }
    }

    public static class UltimateItemTagProvider extends FabricTagProvider.ItemTagProvider {

        public UltimateItemTagProvider(FabricDataGenerator dataGenerator, @Nullable BlockTagProvider blockTagProvider) {
            super(dataGenerator, blockTagProvider);
        }

        @Override
        protected void generateTags() {
            ConsistencyPlusTagProvider.UltimateItemTagProvider.INSTANCE.createAndFillTags(this::getOrCreateTagBuilder, this::copy);
        }
    }
}

package io.github.consistencyplus.consistency_plus.data.providers;

import io.github.consistencyplus.consistency_plus.data.ConsistencyPlusTagProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class ConsistencyPlusTagProviderFabric {

    public static class CommonBlockTagProvider extends FabricTagProvider.BlockTagProvider {

        public CommonBlockTagProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateTags() {
            ConsistencyPlusTagProvider.CommonBlockTagProvider.createAndFillTags(this::getOrCreateTagBuilder);
        }

    }

    public static class DyeableBlockTagProvider extends FabricTagProvider.BlockTagProvider {

        public DyeableBlockTagProvider(FabricDataGenerator dataGenerator) {
            super(dataGenerator);
        }

        @Override
        protected void generateTags() {
            ConsistencyPlusTagProvider.DyeableBlockTagProvider.createAndFillTag(this::getOrCreateTagBuilder);
        }
    }
}

package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.data.ConsistencyPlusTags;
import io.github.consistencyplus.consistency_plus.data.providers.ConsistencyPlusTagProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ConsistencyPlusDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        ConsistencyPlusTags.init();
        fabricDataGenerator.addProvider(new ConsistencyPlusTagProvider.DyeableBlockTagProvider(fabricDataGenerator));
    }
}

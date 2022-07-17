package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.data.ConsistencyPlusTags;
import io.github.consistencyplus.consistency_plus.data.providers.ConsistencyPlusTagProviderFabric;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class ConsistencyPlusDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

        long startTime = System.currentTimeMillis();

        ConsistencyPlusTags.init();

        FabricTagProvider.BlockTagProvider tagProvider = fabricDataGenerator.addProvider(ConsistencyPlusTagProviderFabric.UltimateBlockTagProvider::new);
        fabricDataGenerator.addProvider(fabricDataGenerator1 -> new ConsistencyPlusTagProviderFabric.UltimateItemTagProvider(fabricDataGenerator1, tagProvider));

        long finishTime = System.currentTimeMillis();

        System.out.printf("It took %f seconds for ConsistencyPlus CommonBlockTagProvider generating tags\n", (finishTime - startTime) / 1000.0F);
    }
}

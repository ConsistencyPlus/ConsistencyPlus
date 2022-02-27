package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.data.providers.ConsistencyPlusTagProviderForge;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.*;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

public class ConsistencyPlusDatagen {

    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        if (event.includeServer()) {
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

            gen.addProvider(new ConsistencyPlusTagProviderForge.CommonBlockTagProviderImpl(gen, ConsistencyPlusMain.ID, existingFileHelper));
            gen.addProvider(new ConsistencyPlusTagProviderForge.DyeableBlockTagProviderImpl(gen, ConsistencyPlusMain.ID, existingFileHelper));
        }
    }
}

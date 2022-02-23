package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

public class ConsistencyPlusDatagen {

    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        if (event.includeServer()) {
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        }

    }


}

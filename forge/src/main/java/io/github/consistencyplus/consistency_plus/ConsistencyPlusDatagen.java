package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = ConsistencyPlusMain.ID)
public class ConsistencyPlusDatagen {

    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        if (event.includeServer()) {
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
            //ForgeBlockTagsProvider blockTags = new ForgeBlockTagsProvider(gen, existingFileHelper);

//            gen.addProvider(blockTags);
//            gen.addProvider(new ForgeItemTagsProvider(gen, blockTags, existingFileHelper));
//            gen.addProvider(new ForgeFluidTagsProvider(gen, existingFileHelper));
//            gen.addProvider(new ForgeRecipeProvider(gen));
//            gen.addProvider(new ForgeLootTableProvider(gen));
        }

    }


}

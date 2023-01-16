package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.data.ConsistencyPlusTags;
import io.github.consistencyplus.consistency_plus.data.providers.ConsistencyPlusTagProviderForge;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.server.BlockTagProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ConsistencyPlusDatagen {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();

        if (event.includeServer()) {
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
//            gen.addProvider(new ConsistencyPlusTagProviderForge.DyeableBlockTagProviderImpl(gen, ConsistencyPlusMain.ID, existingFileHelper));

            ConsistencyPlusTags.init();

            BlockTagProvider tagProvider = new ConsistencyPlusTagProviderForge.UltimateBlockTagProvider(gen, ConsistencyPlusMain.ID, existingFileHelper);

            gen.addProvider(true, tagProvider);
            gen.addProvider(true, new ConsistencyPlusTagProviderForge.UltimateItemTagProvider(gen, tagProvider, ConsistencyPlusMain.ID, existingFileHelper));

            //gen.addProvider(new ConsistencyPlusTagProviderForge.CommonBlockTagProviderImpl(gen, ConsistencyPlusMain.ID, existingFileHelper));
        }
    }
}

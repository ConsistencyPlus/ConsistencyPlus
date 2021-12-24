package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusClientMain;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ConsistencyPlusMain.ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ConsistencyPlusClient {
	@SubscribeEvent
	public static void onInitializeClient(final FMLClientSetupEvent event) {
		ConsistencyPlusClientMain.init();
	}
}

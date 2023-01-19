package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusClientMain;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertTooltips;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ConsistencyPlusMain.ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ConsistencyPlusClient {
	@SubscribeEvent
	public static void onInitializeClient(final FMLClientSetupEvent event) {
		event.enqueueWork(() -> ConsistencyPlusClientMain.init(ModelPredicateProviderRegistry::register));
	}

	@SubscribeEvent
	public static void addClientReloadListeners(RegisterClientReloadListenersEvent event) {
		NubertTooltips.registerTooltipListener(
				(listener, id, dependencies) -> event.registerReloadListener(listener)
		);
	}
}

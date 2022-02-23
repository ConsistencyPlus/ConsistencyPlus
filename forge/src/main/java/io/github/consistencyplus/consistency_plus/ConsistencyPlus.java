package io.github.consistencyplus.consistency_plus;

import dev.architectury.platform.forge.EventBuses;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.Optional;

@Mod(ConsistencyPlusMain.ID)
public class ConsistencyPlus {
	public ConsistencyPlus() {
		EventBuses.registerModEventBus(ConsistencyPlusMain.ID, FMLJavaModLoadingContext.get().getModEventBus());

		Optional<IEventBus> eventBus = EventBuses.getModEventBus(ConsistencyPlusMain.ID);
		eventBus.ifPresent(iEventBus -> iEventBus.addListener(ConsistencyPlusDatagen::gatherData));

		ConsistencyPlusMain.init();
	}
}

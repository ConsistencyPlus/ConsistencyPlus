package io.github.consistencyplus.consistency_plus;

import dev.architectury.platform.forge.EventBuses;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ConsistencyPlusMain.ID)
public class ConsistencyPlus {
	public ConsistencyPlus() {
		EventBuses.registerModEventBus(ConsistencyPlusMain.ID, FMLJavaModLoadingContext.get().getModEventBus());
		ConsistencyPlusMain.init();
	}
}

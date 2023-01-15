package io.github.consistencyplus.consistency_plus;

import dev.architectury.platform.forge.EventBuses;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.core.util.Forge;
import io.github.consistencyplus.consistency_plus.core.util.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ConsistencyPlusMain.ID)
public class ConsistencyPlus {
	public static Loader LOADER = new Forge();
	public ConsistencyPlus() {
		EventBuses.registerModEventBus(ConsistencyPlusMain.ID, FMLJavaModLoadingContext.get().getModEventBus());
		ConsistencyPlusMain.init(LOADER);
	}
}

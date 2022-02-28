package io.github.consistencyplus.consistency_plus;

import dev.architectury.platform.forge.EventBuses;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.util.Identifier;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ConsistencyPlusMain.ID)
public class ConsistencyPlus {
	public ConsistencyPlus() {
		EventBuses.registerModEventBus(ConsistencyPlusMain.ID, FMLJavaModLoadingContext.get().getModEventBus());
		ConsistencyPlusMain.init();
	}
}

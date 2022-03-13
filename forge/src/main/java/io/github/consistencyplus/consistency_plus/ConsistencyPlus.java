package io.github.consistencyplus.consistency_plus;

import dev.architectury.platform.forge.EventBuses;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusCopperBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusEnhancedRegistry;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.util.Identifier;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.lang.reflect.InvocationTargetException;

@Mod(ConsistencyPlusMain.ID)
public class ConsistencyPlus {
	public ConsistencyPlus() {
		EventBuses.registerModEventBus(ConsistencyPlusMain.ID, FMLJavaModLoadingContext.get().getModEventBus());
		ConsistencyPlusMain.init();
	}
}

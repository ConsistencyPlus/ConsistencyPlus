package io.github.consistencyplus.consistency_plus.forge;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.registry.ConsistencyPlusBlocksLoader;
import io.github.consistencyplus.consistency_plus.registry.PseudoRegistry;
import io.github.consistencyplus.consistency_plus.util.BlockData;
import io.github.consistencyplus.consistency_plus.util.LoaderHelper;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

import java.util.Map;

@Mod(ConsistencyPlusMain.MOD_ID)
public class ConsistencyPlus {
	LoaderHelper forge = new LoaderVariant();

	public ConsistencyPlus() {
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void onInitialize(RegisterEvent event) {
		ConsistencyPlusMain.init(forge);
		Map<Identifier, BlockData> blockDataMap = PseudoRegistry.export();

		event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
			for (Identifier id : blockDataMap.keySet()) {
				BlockData data = blockDataMap.get(id);
				helper.register(id, data.block().initFunc().apply(data.blockSettings()));
			}
		});

		event.register(ForgeRegistries.Keys.ITEMS, helper -> {
			for (Identifier id : blockDataMap.keySet()) {
				BlockData data = blockDataMap.get(id);
				helper.register(id, new BlockItem(RegistryObject.create(id, ForgeRegistries.BLOCKS).get(), new Item.Settings()));
			}
		});
	}
}

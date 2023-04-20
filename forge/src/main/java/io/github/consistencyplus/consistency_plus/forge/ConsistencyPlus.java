package io.github.consistencyplus.consistency_plus.forge;

import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.registry.PseudoRegistry;
import io.github.consistencyplus.consistency_plus.util.BlockData;
import io.github.consistencyplus.consistency_plus.util.LoaderHelper;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;
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
				helper.register(id, data.block().initFunc().apply(data.settings().settings()));
			}
		});

		event.register(ForgeRegistries.Keys.ITEMS, helper -> {
			for (Identifier id : blockDataMap.keySet()) {
				BlockData data = blockDataMap.get(id);
				helper.register(id, new BlockItem(RegistryObject.create(id, ForgeRegistries.BLOCKS).get(), new Item.Settings().group(getItemGroup(data.settings().additionalBlockSettings().itemGroup()))));
			}
		});
	}

	public static ItemGroup getItemGroup(String string) {
		return switch (string) {
			case "stones" -> CPLUS_STONES;
			case "dyeable" -> CPLUS_DYABLE;
			case "misc" -> CPLUS_MISC;
			default -> CPLUS_STONES;
		};
	}


	public static final	ItemGroup CPLUS_STONES = new ItemGroup("stones") {
		@Override
		public ItemStack createIcon() {
			return RegistryObject.create(new Identifier("consistency_plus", "polished_stone"), ForgeRegistries.ITEMS).get().getDefaultStack();
		}
	};

	public static final	ItemGroup CPLUS_DYABLE = new ItemGroup("dyeable") {
		@Override
		public ItemStack createIcon() {
			return RegistryObject.create(new Identifier("consistency_plus", "polished_" + DyeColor.byId(Random.create().nextBetween(0, 15)).getName() + "_concrete"), ForgeRegistries.ITEMS).get().getDefaultStack();
		}
	};

	public static final	ItemGroup CPLUS_MISC = new ItemGroup("misc") {
		@Override
		public ItemStack createIcon() {
			return RegistryObject.create(new Identifier("consistency_plus", "polished_netherrack"), ForgeRegistries.ITEMS).get().getDefaultStack();
		}
	};
}

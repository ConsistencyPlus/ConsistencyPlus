package io.github.consistencyplus.consistency_plus.forge;

import com.google.common.collect.ImmutableMap;
import io.github.consistencyplus.consistency_plus.ConsistencyPlusClientMain;
import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;
import net.minecraft.resource.ResourcePackProfile;
import net.minecraft.resource.ResourcePackProfile.InsertionPosition;
import net.minecraft.resource.ResourcePackSource;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.forgespi.language.IModFileInfo;
import net.minecraftforge.forgespi.locating.IModFile;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Map;
import java.util.Objects;

@Mod.EventBusSubscriber(modid = ConsistencyPlusMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ConsistencyPlusClient {
	@SubscribeEvent
	public static void onInitializeClient(final FMLClientSetupEvent event) {
		event.enqueueWork(() -> ConsistencyPlusClientMain.init(ModelPredicateProviderRegistry::register));

		Map<String, RenderLayer> renderLayers = ImmutableMap.<String, RenderLayer>builder()
				.put("cutout", RenderLayer.getCutout())
				.put("translucent", RenderLayer.getTranslucent())
				.build();

		for (Identifier id : ConsistencyPlus.blockToRenderLayers.keySet()) {
			RenderLayers.setRenderLayer(RegistryObject.create(id, ForgeRegistries.BLOCKS).get(), Objects.requireNonNull(renderLayers.get(ConsistencyPlus.blockToRenderLayers.get(id))));
		}


	}



	// based on Create's copper legacy pack impl
	@SubscribeEvent
	public static void addBuiltinPacks(AddPackFindersEvent event) {
		if (event.getPackType() != ResourceType.CLIENT_RESOURCES)
			return;
		IModFileInfo mod = ModList.get().getModFileById(ConsistencyPlusMain.MOD_ID);
		IModFile file = mod.getFile();
		event.addRepositorySource((adder, factory) ->
				adder.accept(ResourcePackProfile.of(
						ConsistencyPlusClientMain.VANILLA_CHANGES_PACK.toString(),
						true,
						() -> new ModFilePackResources(
								ConsistencyPlusClientMain.VANILLA_CHANGES_PACK_NAME,
								file,
								"resourcepacks/vanilla_changes"
						),
						factory,
						InsertionPosition.TOP,
						ResourcePackSource.PACK_SOURCE_BUILTIN
				))
		);
	}
}

package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusClientMain;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertTooltips;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceReloader;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class ConsistencyPlusClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ConsistencyPlusClientMain.init(ModelPredicateProviderRegistry::register);
		NubertTooltips.registerTooltipListener((listener, id, dependencies) -> {
			ResourceManagerHelper helper = ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES);
			helper.registerReloadListener(new SimpleReloadListenerWrapper(listener, id, dependencies));
		});
	}

	public record SimpleReloadListenerWrapper(
			ResourceReloader listener,
			Identifier id,
			List<Identifier> dependencies
	) implements IdentifiableResourceReloadListener {
		@Override
		public Identifier getFabricId() {
			return id;
		}

		@Override
		public Collection<Identifier> getFabricDependencies() {
			return dependencies;
		}

		@Override
		public CompletableFuture<Void> reload(Synchronizer synchronizer, ResourceManager manager,
											  Profiler prepareProfiler, Profiler applyProfiler,
											  Executor prepareExecutor, Executor applyExecutor) {
			return listener.reload(synchronizer, manager, prepareProfiler, applyProfiler, prepareExecutor, applyExecutor);
		}
	}
}

package io.github.consistencyplus.consistency_plus.registry;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertMinecartEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

public class CPlusEntities {
	public static final RegistrySupplier<EntityType<NubertMinecartEntity>> NUBERT_CART = ConsistencyPlusMain.ENTITIES.register(
			"nubert_minecart",
			() -> EntityType.Builder.<NubertMinecartEntity>create(NubertMinecartEntity::new, SpawnGroup.MISC)
					.setDimensions(0.98F, 0.7F)
					.maxTrackingRange(8)
					.build("consistency_plus:nubert_minecart")
	);

	public static void init() {
	}
}

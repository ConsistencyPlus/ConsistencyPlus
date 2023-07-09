package io.github.consistencyplus.consistency_plus.util;

import net.minecraft.block.AbstractBlock;

// Based on the Json Registry in PortalCubed, found at https://github.com/Fusion-Flux/Portal-Cubed/blob/1.19.2/src/main/java/com/fusionflux/portalcubed/blocks/PortalBlocksLoader.java.
// The PortalCubed code is licensed under MIT.
public record SettingsBundle(AbstractBlock.Settings settings, String layer, AdditionalBlockSettings additionalBlockSettings) { }
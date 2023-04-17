package io.github.consistencyplus.consistency_plus.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.registry.Registry;

// Based on the Json Registry in PortalCubed, found at https://github.com/Fusion-Flux/Portal-Cubed/blob/1.19.2/src/main/java/com/fusionflux/portalcubed/blocks/PortalBlocksLoader.java.
// The PortalCubed code is licensed under MIT.
public record SettingsBundle(AbstractBlock.Settings settings, String layer, AdditionalBlockSettings additionalBlockSettings) { }
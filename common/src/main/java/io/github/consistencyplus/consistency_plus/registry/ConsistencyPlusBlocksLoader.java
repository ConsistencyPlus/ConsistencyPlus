package io.github.consistencyplus.consistency_plus.registry;

import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.util.*;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.registry.Registry;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Based on the Json Registry in PortalCubed, found at https://github.com/Fusion-Flux/Portal-Cubed/blob/1.19.2/src/main/java/com/fusionflux/portalcubed/blocks/PortalBlocksLoader.java.
// The PortalCubed code is licensed under MIT.
public final class ConsistencyPlusBlocksLoader {
    @Environment(EnvType.CLIENT)
    private static Map<String, RenderLayer> renderLayers;
    private static final PseudoItemGroup ITEM_GROUP = new PseudoItemGroup(Items.STICK.getDefaultStack(), new Identifier("consistency_plus", "itemgroup"));

    static {
        if (ConsistencyPlusMain.LOADER_HELPER.getIsClient()) {
            clinitClient();
        }
    }
    private ConsistencyPlusBlocksLoader() {}

    @Environment(EnvType.CLIENT)
    private static void clinitClient() {
        renderLayers = ImmutableMap.<String, RenderLayer>builder()
            .put("cutout", RenderLayer.getCutout())
            .put("translucent", RenderLayer.getTranslucent())
            .build();
    }

    /** CHANGE TO CROSS LOADED*/
    public static void init() {
        try (Reader reader = Files.newBufferedReader(ConsistencyPlusMain.LOADER_HELPER.getPath("materials.json"), StandardCharsets.UTF_8)) {
            loadMaterials(JsonHelper.deserialize(reader));
        } catch (IOException e) {
            ConsistencyPlusMain.LOGGER.error("Failed to load block data", e);
        }
    }
    /*public static Map<String, BlockData> exportBlockData() {
        return BLOCK_DATA;
    }*/

    private static BlockSoundGroup parseBlockSounds(JsonElement sounds) {
        if (sounds.isJsonPrimitive()) {
            return Registry.BLOCK.getOrEmpty(new Identifier(JsonHelper.asString(sounds, "sounds")))
                    .map(b -> b.getSoundGroup(b.getDefaultState()))
                    .orElseThrow(() -> new IllegalArgumentException("Unknown block " + sounds));
        }
        final JsonObject object = JsonHelper.asObject(sounds, "sounds");
        return new BlockSoundGroup(
                JsonHelper.getFloat(object, "volume", 1f),
                JsonHelper.getFloat(object, "pitch", 1f),
                new SoundEvent(new Identifier(JsonHelper.getString(object, "break"))),
                new SoundEvent(new Identifier(JsonHelper.getString(object, "step"))),
                new SoundEvent(new Identifier(JsonHelper.getString(object, "place"))),
                new SoundEvent(new Identifier(JsonHelper.getString(object, "hit"))),
                new SoundEvent(new Identifier(JsonHelper.getString(object, "fall")))
        );
    }

    private static void loadMaterials(JsonObject json) {
        for (final var entry : json.entrySet()) {
            boolean hasBrick = true;
            JsonObject jsonCool = entry.getValue().getAsJsonObject();
            final AbstractBlock.Settings settings = jsonCool.has("inherit")
                    ? Registry.BLOCK.getOrEmpty(new Identifier(JsonHelper.getString(jsonCool, "inherit")))
                    .map(AbstractBlock.Settings::copy)
                    .orElseThrow(() -> new IllegalArgumentException("Unknown block " + jsonCool.get("inherit")))
                    : AbstractBlock.Settings.of(Material.STONE)
                    .strength(3.5f, 3.5f)
                    .requiresTool();
            //json.remove("inherit");
            jsonCool.remove("inherit");
            if (jsonCool.has("has_brick")) {
                hasBrick = JsonHelper.getBoolean(jsonCool, "has_brick");
            }
            jsonCool.remove("has_brick");
            SettingsBundle settingsBundle = fromJson(jsonCool, settings);

            try (Reader reader = Files.newBufferedReader(ConsistencyPlusMain.LOADER_HELPER.getPath("materials/" + entry.getKey() + ".json"), StandardCharsets.UTF_8)) {
                load(JsonHelper.deserialize(reader), settingsBundle);
            } catch (IOException e) {
                ConsistencyPlusMain.LOGGER.error("Failed to load block data", e);
            }

            if (hasBrick) {
                CPlusBlocks.itemRegistry.put(new Identifier("consistency_plus", entry.getKey() + "_brick"), (a) -> new Item(new Item.Settings().group(ItemGroup.MISC)));
            }
        }
    }

    private static void load(JsonObject json, SettingsBundle settingsBundle) {
        for (final var entry : json.entrySet()) {
            PseudoRegistry.register(new Identifier("consistency_plus", entry.getKey()), parseBlock(entry.getValue().getAsJsonObject(), settingsBundle));
        }
    }

    private static BlockData parseBlock(JsonObject json, SettingsBundle setSettings) {
        final var type = BlockShape.fromString(JsonHelper.getString(json, "type", "block"));
        if (type == null) {
            throw new IllegalArgumentException("Unknown type " + json.get("type"));
        }
        json.remove("type");

        final AbstractBlock.Settings settings = json.has("inherit")
                ? Registry.BLOCK.getOrEmpty(new Identifier(JsonHelper.getString(json, "inherit")))
                .map(AbstractBlock.Settings::copy)
                .orElseThrow(() -> new IllegalArgumentException("Unknown block " + json.get("inherit")))
                : setSettings.settings();
        json.remove("inherit");


        return new BlockData(type, fromJson(json, settings, setSettings));
    }

    private static SettingsBundle fromJson(JsonObject json, AbstractBlock.Settings settings) {
        return fromJson(json, settings, new SettingsBundle(settings, null, new AdditionalBlockSettings(null, null, null, null, null)));
    }

    private static SettingsBundle fromJson(JsonObject json, AbstractBlock.Settings settings, SettingsBundle settingsBundle) {
        String renderLayer = settingsBundle.layer();
        boolean pistonPush = Boolean.TRUE.equals(settingsBundle.additionalBlockSettings().pistonPush());
        boolean pistonPull = Boolean.TRUE.equals(settingsBundle.additionalBlockSettings().pistonPull());
        String itemGroup = settingsBundle.additionalBlockSettings().itemGroup();
        String oxidizeToBlock = settingsBundle.additionalBlockSettings().oxidizeToBlock();
        String waxToBlock = settingsBundle.additionalBlockSettings().waxToBlock();
        for (final var entry : json.entrySet()) {
            final JsonElement value = entry.getValue();
            switch (entry.getKey()) {
                case "hardness" -> settings.hardness(JsonHelper.asFloat(value, "hardness"));
                case "blast_resistance" -> settings.resistance(JsonHelper.asFloat(value, "blast_resistance"));
                case "jump_velocity_multiplier" -> settings.jumpVelocityMultiplier(JsonHelper.asFloat(value, "jump_velocity_multiplier"));
                case "slipperiness" -> settings.slipperiness(JsonHelper.asFloat(value, "slipperiness"));
                case "sounds" -> settings.sounds(parseBlockSounds(value));
                case "light_level" -> settings.luminance((lum) -> JsonHelper.asInt(value, "light_level"));
                case "render_layer" -> {
                    renderLayer = JsonHelper.asString(value, "render_layer");
                }
                case "map_color" -> settings.mapColor(StringToMapColor.stringToMapColor(JsonHelper.asString(value, "map_color")));
                case "opaque" -> {
                    if (!JsonHelper.asBoolean(value, "opaque")) settings.nonOpaque();
                }

                // EXTRA SETTINGS
                case "piston_push" -> pistonPush = JsonHelper.asBoolean(value, "piston_push"); // Used in 1.20, 1.19 uses tags
                case "piston_pull" -> pistonPull = JsonHelper.asBoolean(value, "piston_pull"); // Used in 1.20, 1.19 uses tags
                case "item_group" -> itemGroup = JsonHelper.asString(value, "item_group");
                case "oxidize_into" -> oxidizeToBlock = JsonHelper.asString(value, "oxidize_into");
                case "wax_into" -> waxToBlock = JsonHelper.asString(value, "wax_into");
                default -> throw new IllegalArgumentException("Unknown Consistency Plus Block field " + entry.getKey());
            }
        }

        return new SettingsBundle(settings, renderLayer, new AdditionalBlockSettings(pistonPush, pistonPull, itemGroup, oxidizeToBlock, waxToBlock));
    }

}

package io.github.consistencyplus.consistency_plus.registry;

import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import io.github.consistencyplus.consistency_plus.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.CPlusStairsBlock;
import io.github.consistencyplus.consistency_plus.util.PseudoItemGroup;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

// Based on the Json Registry in PortalCubed, found at https://github.com/Fusion-Flux/Portal-Cubed/blob/1.19.2/src/main/java/com/fusionflux/portalcubed/blocks/PortalBlocksLoader.java.
// The PortalCubed code is licensed under MIT.
public final class PortalBlocksLoader {
    private static final Map<String, Function<AbstractBlock.Settings, Block>> BLOCK_TYPES =
        ImmutableMap.<String, Function<AbstractBlock.Settings, Block>>builder()
            .put("full", Block::new)
            .put("slab", SlabBlock::new)
            .put("stairs", CPlusStairsBlock::new)
            .put("wall", WallBlock::new)
            .put("gate", FenceGateBlock::new)
            .put("fence", FenceBlock::new) // In case it is added, it is here.
            .put("pillar", PillarBlock::new)
            .put("directional", GlazedTerracottaBlock::new)
            .put("provided", settings -> null)
            .build();
    @Environment(EnvType.CLIENT)
    private static Map<String, RenderLayer> renderLayers;
    private static final Map<String, BlockData> BLOCK_DATA = new LinkedHashMap<>();
    private static final PseudoItemGroup ITEM_GROUP = new PseudoItemGroup(Items.STICK.getDefaultStack(), new Identifier("consistency_plus", "itemgroup"));

    static {
        if (ConsistencyPlusMain.LOADER_HELPER.getIsClient()) {
            clinitClient();
        }
    }
    private PortalBlocksLoader() {}

    @Environment(EnvType.CLIENT)
    private static void clinitClient() {
        renderLayers = ImmutableMap.<String, RenderLayer>builder()
            .put("cutout", RenderLayer.getCutout())
            .put("translucent", RenderLayer.getTranslucent())
            .build();
    }

    /** CHANGE TO CROSS LOADED*/
    /*public static void init(ModContainer mod) {
        try (Reader reader = Files.newBufferedReader(mod.getPath("portal_blocks.json"), StandardCharsets.UTF_8)) {
            load(JsonHelper.deserialize(reader));
        } catch (IOException e) {
            PortalCubed.LOGGER.error("Failed to load block data", e);
        }
    }*/

    /*public static void initCommon() {
        BLOCK_DATA.forEach((key, value) -> {
            if (value.block == null) return;
            final Identifier id = id(key);
            Registry.register(Registry.BLOCK, id, value.block);
            Registry.register(Registry.ITEM, id, new BlockItem(value.block, new Item.Settings().group(ITEM_GROUP)));
        });
    }*/

   @Environment(EnvType.CLIENT)
    public static void initClient() {
        BLOCK_DATA.forEach((key, value) -> {
            final Identifier id = new Identifier("consistency_plus", key);
            if (value.renderLayer != null) {
                final RenderLayer renderLayer = renderLayers.get(value.renderLayer);
                if (renderLayer == null) {
                    throw new IllegalArgumentException("Unknown render_layer " + value.renderLayer);
                }
                /*BlockRenderLayerMap.put(
                    renderLayer,
                    Registry.BLOCK.getOrEmpty(id) //TODO: REPLACE WITH KEYCHAINS (OLDER REGISTRY REFERENCE)
                        .orElseThrow(() -> new IllegalArgumentException("Unknown block in portal_blocks.json " + id))
                );*/
            }
        });
    }

    public static Map<String, BlockData> exportBlockData() {
        return BLOCK_DATA;
    }
    private static void load(JsonObject json) {
        for (final var entry : json.entrySet()) {
            BLOCK_DATA.put(entry.getKey(), parseBlock(entry.getValue().getAsJsonObject()));
        }
    }

    private static BlockData parseBlock(JsonObject json) {
        final var type = BLOCK_TYPES.get(JsonHelper.getString(json, "type", "default"));
        if (type == null) {
            throw new IllegalArgumentException("Unknown type " + json.get("type"));
        }
        json.remove("type");
        final AbstractBlock.Settings settings = json.has("inherit")
            ? Registry.BLOCK.getOrEmpty(new Identifier(JsonHelper.getString(json, "inherit")))
                .map(AbstractBlock.Settings::copy)
                .orElseThrow(() -> new IllegalArgumentException("Unknown block " + json.get("inherit")))
            : AbstractBlock.Settings.of(Material.STONE)
                .strength(3.5f, 3.5f)
                .requiresTool();
        json.remove("inherit");
        String renderLayer = null;
        String mapColor = null;
        boolean opacity = false;
        boolean pistonPush = true;
        boolean pistonPull = true;
        for (final var entry : json.entrySet()) {
            final JsonElement value = entry.getValue();
            switch (entry.getKey()) {
                case "hardness" -> settings.hardness(JsonHelper.asFloat(value, "hardness"));
                case "blast_resistance" -> settings.resistance(JsonHelper.asFloat(value, "blast_resistance"));
                case "jump_velocity_multiplier" -> settings.jumpVelocityMultiplier(JsonHelper.asFloat(value, "jump_velocity_multiplier"));
                case "slipperiness" -> settings.slipperiness(JsonHelper.asFloat(value, "slipperiness"));
                case "sounds" -> settings.sounds(parseBlockSounds(value));
                case "light_level" -> settings.luminance((lum) -> JsonHelper.asInt(value, "light_level"));
                case "render_layer" -> renderLayer = JsonHelper.asString(value, "render_layer");
                case "mapColor" -> mapColor = JsonHelper.asString(value, "mapColor");


                // EXTRA SETTINGS
                case "opaque" -> opacity = JsonHelper.asBoolean(value, "opaque");
                case "pistonPush" -> pistonPush = JsonHelper.asBoolean(value, "pistonPush");
                case "pistonPull" -> pistonPull = JsonHelper.asBoolean(value, "pistonPull");
                default -> throw new IllegalArgumentException("Unknown Portal Block field " + entry.getKey());
            }
        }

        return new BlockData(type.apply(settings), renderLayer, new AdditionalBlockSettings(opacity, pistonPush, pistonPull, mapColor));
    }

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

    private record BlockData(@Nullable Block block, @Nullable String renderLayer, @Nullable AdditionalBlockSettings additionalBlockSettings) {}

    private record AdditionalBlockSettings(@Nullable Boolean opacity, @Nullable Boolean pistonPush, @Nullable Boolean pistonPull, @Nullable String mapColor){}
}

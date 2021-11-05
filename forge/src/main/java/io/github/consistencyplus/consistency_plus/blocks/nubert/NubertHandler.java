package io.github.consistencyplus.consistency_plus.blocks.nubert;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;

import java.util.List;

@Environment(EnvType.CLIENT)
public class NubertHandler {
    public static boolean TEXT_NEEDS_UPDATE = true;
    public static boolean TEXT_GOT_THIS_TICK = false;
    public static final int TOTAL_NUBERT_PHRASES = 6;
    public static MutableText CURRENT_TEXT = null;

    public static void onTooltip(ItemStack stack, TooltipContext context, List<Text> lines) {
        if (stack.getItem() instanceof BlockItem blockItem) {
            if (blockItem.getBlock() instanceof NubertBlock nubert) {
                lines.add(1, getNubertText(nubert instanceof WiggedNubertBlock));
                TEXT_GOT_THIS_TICK = true;
            }
        } else TEXT_NEEDS_UPDATE = true;
    }

    public static MutableText getNubertText(boolean wig) {
        if (TEXT_NEEDS_UPDATE) {
            CURRENT_TEXT = new TranslatableText("nubert.phrase." + MinecraftClient.getInstance().world.random.nextInt(TOTAL_NUBERT_PHRASES + (wig ? 1 : 0))).formatted(Formatting.GOLD, Formatting.ITALIC);
            TEXT_NEEDS_UPDATE = false;
        }
        return CURRENT_TEXT;
    }

    public static void init() {
        ItemTooltipCallback.EVENT.register(NubertHandler::onTooltip);
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (!TEXT_GOT_THIS_TICK) {
                TEXT_NEEDS_UPDATE = true;
            }
            TEXT_GOT_THIS_TICK = false;
        });
    }
}
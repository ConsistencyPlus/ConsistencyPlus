package io.github.consistencyplus.consistency_plus.client;

import dev.architectury.event.events.client.ClientTickEvent;
import dev.architectury.event.events.client.ClientTooltipEvent;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertBlock;
import io.github.consistencyplus.consistency_plus.blocks.nubert.WiggedNubertBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;

import java.util.List;

public class NubertHandler {
    public static boolean TEXT_NEEDS_UPDATE = true;
    public static boolean TEXT_GOT_THIS_TICK = false;
    public static final int TOTAL_NUBERT_PHRASES = 6;
    public static MutableText CURRENT_TEXT = null;

    public static void onTooltip(ItemStack stack, List<Text> texts, TooltipContext context) {
        if (stack.getItem() instanceof BlockItem blockItem) {
            if (blockItem.getBlock() instanceof NubertBlock nubert) {
                texts.add(1, getNubertText(nubert instanceof WiggedNubertBlock));
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
        ClientTooltipEvent.ITEM.register(NubertHandler::onTooltip);
        ClientTickEvent.CLIENT_POST.register(client -> {
            if (!TEXT_GOT_THIS_TICK) {
                TEXT_NEEDS_UPDATE = true;
            }
            TEXT_GOT_THIS_TICK = false;
        });
    }
}
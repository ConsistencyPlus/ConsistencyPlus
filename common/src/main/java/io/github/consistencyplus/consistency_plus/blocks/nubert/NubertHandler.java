package io.github.consistencyplus.consistency_plus.blocks.nubert;

import dev.architectury.event.events.client.ClientTickEvent;
import dev.architectury.event.events.client.ClientTooltipEvent;
import io.github.consistencyplus.consistency_plus.items.NubertMinecartItem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class NubertHandler {
    public static boolean TEXT_NEEDS_UPDATE = true;
    public static boolean TEXT_GOT_THIS_TICK = false;
    public static MutableText CURRENT_TEXT = new LiteralText("Nubert init went wrong! If you see this, report it!");
    public static int[] PLAIN = new int[] {0, 1, 2, 3, 4, 5, 6};
    public static int[] WIG = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] CART = new int[] {0, 1, 2, 3, 4, 5, 6, 10, 11, 12, 13, 14};
    public static int[] WIG_CART = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    
    public static void onTooltip(ItemStack stack, List<Text> texts, TooltipContext context) {
        if (stack.getItem() instanceof BlockItem blockItem) {
            if (blockItem.getBlock() instanceof NubertBlock nubert) {
                texts.add(1, getNubertText(nubert instanceof WiggedNubertBlock, false));
                TEXT_GOT_THIS_TICK = true;
            }
        } else if (stack.getItem() instanceof NubertMinecartItem item) {
            texts.add(1, getNubertText(item.wigged, false));
            TEXT_GOT_THIS_TICK = true;
        } else TEXT_NEEDS_UPDATE = true;
    }

    public static MutableText getNubertText(boolean wig, boolean cart) {
        if (TEXT_NEEDS_UPDATE) {
            int[] getFrom = !wig
                    ? !cart
                        ? PLAIN
                        : CART
                    : !cart
                        ? WIG
                        : WIG_CART;
            World world = MinecraftClient.getInstance().world;
            if (world != null) {
                int index = world.random.nextInt(getFrom.length);
                int num = getFrom[index];
                String key = "nubert.phrase." + num;
                CURRENT_TEXT = new TranslatableText(key).formatted(Formatting.GOLD, Formatting.ITALIC);
                TEXT_NEEDS_UPDATE = false;
            }
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
package io.github.consistencyplus.consistency_plus.blocks.nubert;

import dev.architectury.event.events.client.ClientTickEvent;
import dev.architectury.event.events.client.ClientTooltipEvent;
import dev.architectury.registry.ReloadListenerRegistry;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceReloader;
import net.minecraft.resource.ResourceType;
import net.minecraft.resource.SinglePreparationResourceReloader;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Language;
import net.minecraft.util.Unit;
import net.minecraft.util.profiler.Profiler;
import org.apache.logging.log4j.util.TriConsumer;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class NubertTooltips {
    public static final String KEY_PREFIX = "nubert.phrase.";
    public static final Text ERROR = Text.translatable("nubert.tooltip.error").formatted(Formatting.GRAY, Formatting.ITALIC);

    private static final Random random = new Random();

    private static boolean gotTooltipThisTick = false;
    private static Text currentTooltip = null;
    private static Nubert lastSeenNubert = null;

    public static void onItemTooltip(ItemStack stack, List<Text> texts, TooltipContext context) {
        Nubert nubert = getNubert(stack);
        if (nubert == null)
            return;
        Text tooltip = getCurrentTooltip(nubert);
        texts.add(1, tooltip);
    }

    public static Text getCurrentTooltip(Nubert nubert) {
        if (lastSeenNubert != nubert) {
            // nubert changed, get a new tooltip
            currentTooltip = null;
        }
        lastSeenNubert = nubert;
        if (currentTooltip == null) {
            boolean wig = nubert.hasWig();
            boolean cart = nubert.isCart();
            NubertTooltipSet tooltips = NubertTooltipSet.of(wig, cart);
            currentTooltip = getRandomTooltip(tooltips);
        }
        gotTooltipThisTick = true;
        return currentTooltip;
    }

    public static void refreshTooltip() {
        currentTooltip = null;
    }

    @Nullable
    public static Nubert getNubert(ItemStack stack) {
        Item item = stack.getItem();
        if (item instanceof Nubert nubert)
            return nubert;
        if (item instanceof BlockItem block && block.getBlock() instanceof Nubert nubert)
            return nubert;
        return null;
    }

    public static Text getRandomTooltip(NubertTooltipSet tooltips) {
        if (tooltips.keys.isEmpty())
            return ERROR;
        int index = random.nextInt(tooltips.keys.size());
        return Text.translatable(tooltips.keys.get(index)).formatted(Formatting.GOLD);
    }

    public static void init() {
        ClientTooltipEvent.ITEM.register(NubertTooltips::onItemTooltip);
        ClientTickEvent.CLIENT_POST.register(client -> {
            if (!gotTooltipThisTick) {
                // did not get the tooltip this tick, meaning it was not viewed.
                // next tooltip viewing will get a new one.
                refreshTooltip();
            }
            gotTooltipThisTick = false;
        });

        ReloadListenerRegistry.register(
                ResourceType.CLIENT_RESOURCES,
                TooltipReloadListener.INSTANCE,
                TooltipReloadListener.ID,
                TooltipReloadListener.DEPENDENCIES
        );
    }

    // cannot use ReloadListenerRegistry, seems to be busted on Forge
    public static void registerTooltipListener(TriConsumer<ResourceReloader, Identifier, List<Identifier>> consumer) {
        consumer.accept(
                TooltipReloadListener.INSTANCE,
                TooltipReloadListener.ID,
                TooltipReloadListener.DEPENDENCIES
        );
    }

    public enum NubertTooltipSet {
        BASE, WIG, CART, WIG_CART;

        public static final List<NubertTooltipSet> ALL = List.of(BASE, WIG, CART, WIG_CART);
        /**
         * Map of sets to all sets that contain their type of phrase
         */
        public static final Map<NubertTooltipSet, List<NubertTooltipSet>> SUPERSETS = Map.of(
                BASE, ALL,
                WIG, List.of(WIG, WIG_CART),
                CART, List.of(CART, WIG_CART),
                WIG_CART, List.of(WIG_CART)
        );

        private final String suffix = name().equals("BASE") ? "" : name().toLowerCase(Locale.ROOT) + ".";
        private final List<String> keys = new ArrayList<>();

        public static NubertTooltipSet of(boolean wig, boolean cart) {
            if (wig) {
                return cart ? WIG_CART : WIG;
            } else {
                return cart ? CART : BASE;
            }
        }
    }

    public static class TooltipReloadListener extends SinglePreparationResourceReloader<Unit> {
        public static final TooltipReloadListener INSTANCE = new TooltipReloadListener();
        public static final Identifier ID = ConsistencyPlusMain.id("tooltip_reload_listener");
        public static final List<Identifier> DEPENDENCIES = List.of(new Identifier("minecraft:languages"));
        public static final int MAX_QUOTES = 1_000;

        @Override
        protected Unit prepare(ResourceManager manager, Profiler profiler) {
            return Unit.INSTANCE;
        }

        @Override
        protected void apply(Unit prepared, ResourceManager manager, Profiler profiler) {
            Language lang = Language.getInstance();
            NubertTooltipSet.ALL.forEach(set -> set.keys.clear());
            for (int i = 0; i < MAX_QUOTES; i++) {
                boolean noneFound = true;
                for (NubertTooltipSet set : NubertTooltipSet.ALL) {
                    String key = KEY_PREFIX + set.suffix + i;
                    if (lang.hasTranslation(key)) {
                        List<NubertTooltipSet> toAddTo = NubertTooltipSet.SUPERSETS.get(set);
                        toAddTo.forEach(superset -> superset.keys.add(key));
                        noneFound = false;
                    }
                }
                if (noneFound) {
                    break;
                }
            }
        }
    }
}
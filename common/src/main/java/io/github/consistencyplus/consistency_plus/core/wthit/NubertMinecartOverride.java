package io.github.consistencyplus.consistency_plus.core.wthit;

import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertBlock;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertHandler;
import io.github.consistencyplus.consistency_plus.blocks.nubert.WiggedNubertBlock;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import mcp.mobius.waila.api.*;
import net.minecraft.entity.vehicle.MinecartEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class NubertMinecartOverride implements IEntityComponentProvider {
    private BlockPos lastPos;
    private MinecartEntity lastCart;

    @Override
    public ItemStack getDisplayItem(IEntityAccessor accessor, IPluginConfig config) {
        NbtCompound data = accessor.getServerData();
        boolean nubert = data.getBoolean("Nubert");
        if (nubert) {
            boolean wig = data.getBoolean("Wigged");
            return (wig ? CPlusItems.WIGGED_NUBERT_MINECART : CPlusItems.NUBERT_MINECART).getDefaultStack();
        }
        return ItemStack.EMPTY;
    }

    @Override
    public void appendHead(List<Text> tooltip, IEntityAccessor accessor, IPluginConfig config) {
        if (accessor.getEntity() instanceof MinecartEntity) {
            MinecartEntity cart = (MinecartEntity)accessor.getEntity();
            if (cart.getContainedBlock().getBlock() instanceof NubertBlock) {
                NubertBlock nubert = (NubertBlock) cart.getContainedBlock().getBlock();
                boolean wig = nubert instanceof WiggedNubertBlock;
                tooltip.add(new TranslatableText("block.consistency_plus" + (wig ? ".wigged_nubert" : ".nubert")).formatted(Formatting.WHITE));
            }
        }
    }

    @Override
    public void appendBody(List<Text> tooltip, IEntityAccessor accessor, IPluginConfig config) {
        if (accessor.getEntity() instanceof MinecartEntity) {
            MinecartEntity cart = (MinecartEntity)accessor.getEntity();
            if (cart.getContainedBlock().getBlock() instanceof NubertBlock) {
                NubertBlock nubert = (NubertBlock) cart.getContainedBlock().getBlock();
                net.minecraft.util.math.BlockPos pos = cart.getBlockPos();
                tooltip.add(NubertHandler.getNubertText(nubert instanceof WiggedNubertBlock, true));
                NubertHandler.TEXT_GOT_THIS_TICK = pos.equals(lastPos) || cart.equals(lastCart);
                lastPos = pos;
                lastCart = cart;
            }
        }
    }

    @Override
    public void appendTail(List<Text> tooltip, IEntityAccessor accessor, IPluginConfig config) {
        if (accessor.getEntity() instanceof MinecartEntity) {
            MinecartEntity cart = (MinecartEntity)accessor.getEntity();
            if (cart.getContainedBlock().getBlock() instanceof NubertBlock) {
                NubertBlock nubert = (NubertBlock) cart.getContainedBlock().getBlock();
                tooltip.add(new LiteralText("Consistency Plus").formatted(Formatting.BLUE, Formatting.ITALIC));

            }
        }
    }
}

package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertBlock;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertMinecartOverride;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertOverride;
import mcp.mobius.waila.api.IRegistrar;
import mcp.mobius.waila.api.IWailaPlugin;
import mcp.mobius.waila.api.TooltipPosition;
import mcp.mobius.waila.api.internal.ApiSide;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.vehicle.MinecartEntity;

public class ConsistencyPlusWailaPlugin implements IWailaPlugin {
  @Override
  public void register(IRegistrar registrar) {
    registrar.addComponent(new NubertOverride(), TooltipPosition.BODY, NubertBlock.class);
    NubertMinecartOverride cart = new NubertMinecartOverride();
    registrar.addEntityData(cart, MinecartEntity.class);
    registrar.addDisplayItem(cart, MinecartEntity.class);
    registrar.addComponent(cart, TooltipPosition.HEAD, MinecartEntity.class);
    registrar.addComponent(cart, TooltipPosition.BODY, MinecartEntity.class);
    registrar.addComponent(cart, TooltipPosition.TAIL, MinecartEntity.class);
  }
}

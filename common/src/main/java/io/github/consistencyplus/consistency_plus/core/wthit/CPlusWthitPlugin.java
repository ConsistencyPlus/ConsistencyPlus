package io.github.consistencyplus.consistency_plus.core.wthit;

import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertBlock;
import mcp.mobius.waila.api.IRegistrar;
import mcp.mobius.waila.api.IWailaPlugin;
import mcp.mobius.waila.api.TooltipPosition;
import net.minecraft.entity.vehicle.MinecartEntity;

public class CPlusWthitPlugin implements IWailaPlugin {
	@Override
	public void register(IRegistrar registrar) {
		registrar.addComponent(new NubertOverride(), TooltipPosition.BODY, NubertBlock.class);
		NubertMinecartOverride cart = new NubertMinecartOverride();
		registrar.addDisplayItem(cart, MinecartEntity.class);
		registrar.addComponent(cart, TooltipPosition.HEAD, MinecartEntity.class);
		registrar.addComponent(cart, TooltipPosition.BODY, MinecartEntity.class);
		registrar.addComponent(cart, TooltipPosition.TAIL, MinecartEntity.class);
	}
}

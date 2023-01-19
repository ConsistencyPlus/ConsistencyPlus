package io.github.consistencyplus.consistency_plus.core.wthit;

import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertBlock;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertMinecartEntity;
import mcp.mobius.waila.api.IRegistrar;
import mcp.mobius.waila.api.IWailaPlugin;
import mcp.mobius.waila.api.TooltipPosition;

public class CPlusWthitPlugin implements IWailaPlugin {
	@Override
	public void register(IRegistrar registrar) {
		registrar.addComponent(NubertOverride.INSTANCE, TooltipPosition.BODY, NubertBlock.class);
		registrar.addComponent(NubertMinecartOverride.INSTANCE, TooltipPosition.HEAD, NubertMinecartEntity.class);
		registrar.addComponent(NubertMinecartOverride.INSTANCE, TooltipPosition.BODY, NubertMinecartEntity.class);
	}
}

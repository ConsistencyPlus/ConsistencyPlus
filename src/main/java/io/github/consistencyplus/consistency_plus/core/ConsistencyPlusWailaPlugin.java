package io.github.consistencyplus.consistency_plus.core;

import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertBlock;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertOverride;
import mcp.mobius.waila.api.IRegistrar;
import mcp.mobius.waila.api.IWailaPlugin;
import mcp.mobius.waila.api.TooltipPosition;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class ConsistencyPlusWailaPlugin implements IWailaPlugin {
	@Override
	public void register(IRegistrar registrar) {
		registrar.addComponent(new NubertOverride(), TooltipPosition.BODY, NubertBlock.class);
	}
}

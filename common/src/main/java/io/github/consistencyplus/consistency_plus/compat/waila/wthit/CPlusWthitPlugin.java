package io.github.consistencyplus.consistency_plus.compat.waila.wthit;

import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertBlock;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertMinecartEntity;
import mcp.mobius.waila.api.*;

public class CPlusWthitPlugin implements IWailaPlugin {
	@Override
	public void register(IRegistrar registrar) {
		IBlockComponentProvider blockProvider = WthitNubertComponentProvider.INSTANCE;
		registrar.addComponent(blockProvider, TooltipPosition.BODY, NubertBlock.class);

		IEntityComponentProvider entityProvider = WthitNubertComponentProvider.INSTANCE;
		registrar.addIcon(entityProvider, NubertMinecartEntity.class);
		registrar.addComponent(entityProvider, TooltipPosition.HEAD, NubertMinecartEntity.class);
		registrar.addComponent(entityProvider, TooltipPosition.BODY, NubertMinecartEntity.class);
	}
}

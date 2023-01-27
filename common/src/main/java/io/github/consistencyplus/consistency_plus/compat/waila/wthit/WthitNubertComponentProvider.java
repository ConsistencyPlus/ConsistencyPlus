package io.github.consistencyplus.consistency_plus.compat.waila.wthit;

import io.github.consistencyplus.consistency_plus.compat.waila.NubertComponentProvider;
import mcp.mobius.waila.api.*;
import mcp.mobius.waila.api.component.ItemComponent;

public class WthitNubertComponentProvider extends NubertComponentProvider implements IBlockComponentProvider, IEntityComponentProvider {
	public static final WthitNubertComponentProvider INSTANCE = new WthitNubertComponentProvider();

	// block

	@Override
	public void appendBody(ITooltip tooltip, IBlockAccessor accessor, IPluginConfig config) {
		tooltip.addLine(getNubertTooltip(accessor.getBlock(), accessor.getPosition()));
	}

	// cart entity

	@Override
	public ITooltipComponent getIcon(IEntityAccessor accessor, IPluginConfig config) {
		return new ItemComponent(getNubertCartItem(accessor.getEntity()));
	}

	@Override
	public void appendHead(ITooltip tooltip, IEntityAccessor accessor, IPluginConfig config) {
		tooltip.setLine(WailaConstants.OBJECT_NAME_TAG, getNubertCartName(accessor.getEntity()));
	}

	@Override
	public void appendBody(ITooltip tooltip, IEntityAccessor accessor, IPluginConfig config) {
		tooltip.addLine(getNubertTooltip(accessor.getEntity()));
	}
}

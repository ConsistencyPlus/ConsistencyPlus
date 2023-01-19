package io.github.consistencyplus.consistency_plus.core.compat.wthit;

import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertMinecartEntity;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertTooltips;
import mcp.mobius.waila.api.*;
import mcp.mobius.waila.api.component.ItemComponent;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class NubertMinecartOverride implements IEntityComponentProvider {
	public static final NubertMinecartOverride INSTANCE = new NubertMinecartOverride();

	@Override
	public ITooltipComponent getIcon(IEntityAccessor accessor, IPluginConfig config) {
		NubertMinecartEntity cart = accessor.getEntity();
		return new ItemComponent(cart.getItem());
	}

	@Override
	public void appendHead(ITooltip tooltip, IEntityAccessor accessor, IPluginConfig config) {
		NubertMinecartEntity cart = accessor.getEntity();
		Text name = Text.translatable(cart.getItem().getTranslationKey()).formatted(Formatting.WHITE);
		tooltip.setLine(WailaConstants.OBJECT_NAME_TAG, name);
	}

	@Override
	public void appendBody(ITooltip tooltip, IEntityAccessor accessor, IPluginConfig config) {
		NubertMinecartEntity cart = accessor.getEntity();
		tooltip.addLine(NubertTooltips.getCurrentTooltip(cart));
	}
}

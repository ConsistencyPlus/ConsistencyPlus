package io.github.consistencyplus.consistency_plus.core.wthit;

import io.github.consistencyplus.consistency_plus.blocks.nubert.Nubert;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertTooltips;
import mcp.mobius.waila.api.IBlockAccessor;
import mcp.mobius.waila.api.IBlockComponentProvider;
import mcp.mobius.waila.api.IPluginConfig;
import mcp.mobius.waila.api.ITooltip;
import net.minecraft.util.math.BlockPos;

public class NubertOverride implements IBlockComponentProvider {
	public static final NubertOverride INSTANCE = new NubertOverride();

	private BlockPos lastPos;

	@Override
	public void appendBody(ITooltip tooltip, IBlockAccessor accessor, IPluginConfig config) {
		if (!(accessor.getBlock() instanceof Nubert nubert))
			return;
		BlockPos pos = accessor.getPosition();
		if (!pos.equals(lastPos))
			NubertTooltips.refreshTooltip(); // new nubert, new tooltip
		lastPos = accessor.getPosition();
		tooltip.addLine(NubertTooltips.getCurrentTooltip(nubert));
	}
}

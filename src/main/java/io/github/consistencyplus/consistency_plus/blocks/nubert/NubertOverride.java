package io.github.consistencyplus.consistency_plus.blocks.nubert;

import mcp.mobius.waila.api.IBlockAccessor;
import mcp.mobius.waila.api.IBlockComponentProvider;
import mcp.mobius.waila.api.IPluginConfig;
import mcp.mobius.waila.api.ITooltip;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.BlockPos;

@Environment(EnvType.CLIENT)
public class NubertOverride implements IBlockComponentProvider {
	private BlockPos lastPos;
	@Override
	public void appendBody(ITooltip tooltip, IBlockAccessor accessor, IPluginConfig config) {
		BlockPos pos = accessor.getPosition();
		boolean wigged = accessor.getBlock() instanceof WiggedNubertBlock;
		tooltip.add(NubertHandler.getNubertText(wigged));
		NubertHandler.TEXT_GOT_THIS_TICK = pos.equals(lastPos);
		lastPos = accessor.getPosition();
	}
}

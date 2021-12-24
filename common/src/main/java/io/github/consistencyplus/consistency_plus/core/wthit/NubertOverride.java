package io.github.consistencyplus.consistency_plus.core.wthit;

import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertHandler;
import io.github.consistencyplus.consistency_plus.blocks.nubert.WiggedNubertBlock;
import mcp.mobius.waila.api.IBlockAccessor;
import mcp.mobius.waila.api.IBlockComponentProvider;
import mcp.mobius.waila.api.IPluginConfig;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

import java.util.List;

public class NubertOverride implements IBlockComponentProvider {
  private BlockPos lastPos;

  @Override
  public void appendBody(List<Text> tooltip, IBlockAccessor accessor, IPluginConfig config) {
    BlockPos pos = accessor.getPosition();
    boolean wigged = accessor.getBlock() instanceof WiggedNubertBlock;
    tooltip.add(NubertHandler.getNubertText(wigged, false));
    NubertHandler.TEXT_GOT_THIS_TICK = pos.equals(lastPos);
    lastPos = accessor.getPosition();
  }
}

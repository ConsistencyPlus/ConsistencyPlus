package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertBlock;
import io.github.consistencyplus.consistency_plus.core.wthit.NubertOverride;
import mcp.mobius.waila.api.IRegistrar;
import mcp.mobius.waila.api.IWailaPlugin;
import mcp.mobius.waila.api.TooltipPosition;
import mcp.mobius.waila.api.internal.ApiSide;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@SuppressWarnings("UnstableApiUsage")
@ApiSide.ClientOnly
@Environment(EnvType.CLIENT)
public class ConsistencyPlusWailaPlugin implements IWailaPlugin {
  @Override
  public void register(IRegistrar registrar) {
    registrar.addComponent(new NubertOverride(), TooltipPosition.BODY, NubertBlock.class);
  }
}

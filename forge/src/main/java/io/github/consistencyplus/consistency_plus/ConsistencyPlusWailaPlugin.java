package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertBlock;
import io.github.consistencyplus.consistency_plus.core.wthit.NubertOverride;
import mcp.mobius.waila.api.IRegistrar;
import mcp.mobius.waila.api.IWailaPlugin;
import mcp.mobius.waila.api.TooltipPosition;
import mcp.mobius.waila.api.WailaPlugin;
import mcp.mobius.waila.api.internal.ApiSide;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@SuppressWarnings("UnstableApiUsage")
@ApiSide.ClientOnly
@OnlyIn(Dist.CLIENT)
@WailaPlugin("consistency_plus")
public class ConsistencyPlusWailaPlugin implements IWailaPlugin {
  @Override
  public void register(IRegistrar registrar) {
    registrar.addComponent(new NubertOverride(), TooltipPosition.BODY, NubertBlock.class);
  }
}

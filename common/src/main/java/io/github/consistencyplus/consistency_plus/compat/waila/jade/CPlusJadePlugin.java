package io.github.consistencyplus.consistency_plus.compat.waila.jade;

import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertBlock;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertMinecartEntity;
import snownee.jade.api.IWailaClientRegistration;
import snownee.jade.api.IWailaPlugin;
import snownee.jade.api.WailaPlugin;

@WailaPlugin
public class CPlusJadePlugin implements IWailaPlugin {
	@Override
	public void registerClient(IWailaClientRegistration registration) {
		registration.registerBlockComponent(JadeNubertComponentProvider.INSTANCE, NubertBlock.class);
		registration.registerEntityComponent(JadeNubertComponentProvider.INSTANCE, NubertMinecartEntity.class);
		registration.registerEntityIcon(JadeNubertComponentProvider.INSTANCE, NubertMinecartEntity.class);
	}
}

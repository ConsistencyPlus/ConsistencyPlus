package io.github.consistencyplus.consistency_plus.compat.waila.jade;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertMinecartEntity;
import io.github.consistencyplus.consistency_plus.compat.waila.NubertComponentProvider;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import snownee.jade.api.*;
import snownee.jade.api.config.IPluginConfig;
import snownee.jade.api.ui.IElement;
import snownee.jade.api.ui.IElementHelper;

public class JadeNubertComponentProvider extends NubertComponentProvider implements IBlockComponentProvider, IEntityComponentProvider {
	public static final JadeNubertComponentProvider INSTANCE = new JadeNubertComponentProvider();
	public static final Identifier ID = ConsistencyPlusMain.id("nubert_component_provider");

	// block

	@Override
	public void appendTooltip(ITooltip iTooltip, BlockAccessor blockAccessor, IPluginConfig iPluginConfig) {
		iTooltip.add(getNubertTooltip(blockAccessor.getBlock(), blockAccessor.getPosition()));
	}

	// cart entity

	@Override
	@Nullable
	public IElement getIcon(EntityAccessor accessor, IPluginConfig config, IElement currentIcon) {
		return IElementHelper.get().item(getNubertCartItem(accessor.getEntity()).getDefaultStack());
	}

	@Override
	public void appendTooltip(ITooltip iTooltip, EntityAccessor entityAccessor, IPluginConfig iPluginConfig) {
		Entity entity = entityAccessor.getEntity();
		iTooltip.remove(Identifiers.CORE_OBJECT_NAME);
		iTooltip.add(getNubertCartName(entity), Identifiers.CORE_OBJECT_NAME);
		iTooltip.add(getNubertTooltip(entity));
	}

	@Override
	public Identifier getUid() {
		return ID;
	}
}

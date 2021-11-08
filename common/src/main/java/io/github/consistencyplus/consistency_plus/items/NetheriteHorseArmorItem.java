package io.github.consistencyplus.consistency_plus.items;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.util.Identifier;

public class NetheriteHorseArmorItem extends HorseArmorItem {
    private final String texturePath;

    public NetheriteHorseArmorItem(int bonus, String materialName, Settings settings) {
        super(bonus, null, settings);
        texturePath = String.format("textures/entity/horse/armor/horse_armor_%s.png", materialName);
       
    }
    
    @Override
    public Identifier getEntityTexture() {
        return ConsistencyPlusMain.id(texturePath);
    }
}

package io.github.consistencyplus.consistency_plus.data;

import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.CopperOxidization;
import io.github.consistencyplus.consistency_plus.blocks.SetModifiers;
import net.minecraft.util.DyeColor;

import javax.annotation.Nullable;

public class MasterKey {

    public BlockShapes shape;
    public BlockTypes type;

    @Nullable public String material;
    @Nullable public CopperOxidization oxidization;
    @Nullable public SetModifiers setModifiers;
    @Nullable public DyeColor dyeColor;

    public boolean isWaxed = false;

    public MasterKey(BlockShapes shape, BlockTypes type, @Nullable String material, @Nullable CopperOxidization oxidization, @Nullable SetModifiers setModifiers, @Nullable DyeColor dyeColor){
        this.shape = shape;
        this.type = type;
        this.material = material;

        this.oxidization = oxidization;
        this.setModifiers = setModifiers;
        this.dyeColor = dyeColor;
    }

    public static MasterKey createDyedKey(BlockShapes shape, BlockTypes type, DyeColor dyeColor, String material){
        return new MasterKey(shape, type, material, null, null, dyeColor);
    }

    public static MasterKey createOxidKey(BlockShapes shape, BlockTypes type, CopperOxidization oxidization, String material){
        return new MasterKey(shape, type, material, oxidization, null, null);
    }

    public static MasterKey createKey(BlockShapes shape, BlockTypes type, SetModifiers setModifiers, String material){
        return new MasterKey(shape, type, material,null, setModifiers, null);
    }

    public static MasterKey createKey(BlockShapes shape, BlockTypes type, String material){
        return new MasterKey(shape, type, material,null, null, null);
    }

    public MasterKey waxed(boolean isWaxed){
        this.isWaxed = isWaxed;
        return this;
    }
}

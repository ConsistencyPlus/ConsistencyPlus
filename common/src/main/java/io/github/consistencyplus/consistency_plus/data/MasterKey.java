package io.github.consistencyplus.consistency_plus.data;

import dev.architectury.registry.registries.RegistrySupplier;
import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import io.github.consistencyplus.consistency_plus.blocks.BlockShapes;
import io.github.consistencyplus.consistency_plus.blocks.BlockTypes;
import io.github.consistencyplus.consistency_plus.blocks.CopperOxidization;
import io.github.consistencyplus.consistency_plus.blocks.SetModifiers;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Pair;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class MasterKey {

    public static Map<String, MasterKey> ULTIMATE_KEY_RING = new HashMap<>();

    public BlockShapes shape;
    public BlockTypes type;

    public String material;
    public CopperOxidization oxidization;
    public SetModifiers setModifiers;
    @Nullable
    public DyeColor dyeColor;

    public boolean isWaxed = false;

    /*
        "{this.isWaxed}()
        + {this.setModifiers}(BASE, CRACKED, MOSSY) or
            {this.dyeColor}(Any of the 16 dye colors) or
            {this.oxidization}(BASE, EXPOSED, WEATHERED, OXIDIZED)
        + {1: this.shape}(CARVED or CHISELED) or
            {1: this.type}(BASE, POLISHED, CUT, COBBLED or SMOOTH)
        + this.material
        + {2: this.shape}(BLOCK, SLAB, STAIRS, WALL, GATE, PILLAR or CORNER_PILLAR)
            or {2: this.type}(BRICK or TILE)"
     */

    public MasterKey(BlockShapes shape, BlockTypes type, String material, CopperOxidization oxidization, SetModifiers setModifiers, @Nullable DyeColor dyeColor){
        this.shape = shape;
        this.type = type;
        this.material = material;

        this.oxidization = oxidization;
        this.setModifiers = setModifiers;
        this.dyeColor = dyeColor;
    }

    public static MasterKey createDyedKey(BlockShapes shape, BlockTypes type, DyeColor dyeColor, String material){
        return new MasterKey(shape, type, material, CopperOxidization.BASE, SetModifiers.BASE, dyeColor);
    }

    public static MasterKey createOxidKey(BlockShapes shape, BlockTypes type, CopperOxidization oxidization, String material){
        return new MasterKey(shape, type, material, oxidization, SetModifiers.BASE, null);
    }

    public static MasterKey createKey(BlockShapes shape, BlockTypes type, SetModifiers setModifiers, String material){
        return new MasterKey(shape, type, material, CopperOxidization.BASE, setModifiers, null);
    }

    public static MasterKey createKey(BlockShapes shape, BlockTypes type, String material){
        return new MasterKey(shape, type, material, CopperOxidization.BASE, SetModifiers.BASE, null);
    }

    public MasterKey waxed(boolean isWaxed){
        this.isWaxed = isWaxed;
        return this;
    }

    @Override
    public String toString() {
        List<String> keyValues = new ArrayList<>();

        if(!this.shape.isBase()) {
            keyValues.add(this.shape.toString());
        }

        if(!this.type.isBase()) {
            keyValues.add(this.type.toString());
        }

        keyValues.add(this.material);

        if(!this.oxidization.isBase()) {
            keyValues.add(this.oxidization.toString());
        }

        if(this.isWaxed) {
            keyValues.add("waxed");
        }

        if(!this.setModifiers.isBase()) {
            keyValues.add(this.setModifiers.toString());
        }

        if(this.dyeColor != null){
            keyValues.add(this.dyeColor.toString());
        }

        StringBuilder stringOut = new StringBuilder();
        for(int i = 0; i < keyValues.size(); i++){
            if(i == keyValues.size() - 1) {
                stringOut.append(keyValues.get(i));
            }else{
                stringOut.append(keyValues.get(i));
                stringOut.append(", ");
            }
        }

        return stringOut.toString();
    }

    public static void addCPlusBlocksToKeyring(){
        ConsistencyPlusMain.LOGGER.info("Filling the Ultimate Keyring from CPlus Blocks!");
        for(RegistrySupplier<Block> block : CPlusBlocks.ALL_BLOCKS){
            String path = block.getId().getPath();

            Pair<BlockShapes, String> shapePair = BlockShapes.getBlockShapeFromString(path);
            Pair<BlockTypes, String> typePair = BlockTypes.getBlockTypeFromString(shapePair.getRight());
            Pair<SetModifiers, String> setPair = SetModifiers.getSetModifierFromString(typePair.getRight());
            Pair<CopperOxidization, String> oxidization = CopperOxidization.getOxidizationFromString(setPair.getRight());
            Pair<Boolean, String> isWaxed = CopperOxidization.isWaxed(oxidization.getRight());
            Pair<DyeColor, String> dyecolor = getDyeColorFromPath(isWaxed.getRight());

            String material = dyecolor.getRight();

            MasterKey key = new MasterKey(shapePair.getLeft(),
                    typePair.getLeft(),
                    material,
                    oxidization.getLeft(),
                    setPair.getLeft(),
                    dyecolor.getLeft());

            MasterKey.ULTIMATE_KEY_RING.put(path, key);

            ConsistencyPlusMain.LOGGER.info("CPlus Blocks Key Ring: " + path + "[" + key + "]");
        }
    }

    public static Pair<DyeColor, String> getDyeColorFromPath(String path){
        String[] pathParts = path.split("_");

        StringBuilder builder = new StringBuilder();
        DyeColor color = null;

        for(int i = 0; i < pathParts.length; i++){
            String part = pathParts[i];

            if(color == null) {
                for (DyeColor possibleColor : DyeColor.values()) {
                    if (Objects.equals(part, possibleColor.toString())) {
                        color = possibleColor;
                        break;
                    }
                }
            }

            if(!Objects.equals(part, (color != null ? color.toString() : ""))){
                builder.append(part);

                if(i != pathParts.length - 1) {
                    builder.append("_");
                }
            }
        }

        return new Pair<>(color, builder.toString());
    }

}

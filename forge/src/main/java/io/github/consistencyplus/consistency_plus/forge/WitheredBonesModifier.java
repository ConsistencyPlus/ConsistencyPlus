package io.github.consistencyplus.consistency_plus.forge;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.WitherSkeletonEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.util.Identifier;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class WitheredBonesModifier extends LootModifier {
    public static final Identifier WITHERED_BONE_ID = new Identifier("consistency_plus", "withered_bone");

    public static final Supplier<Codec<WitheredBonesModifier>> CODEC = Suppliers.memoize(() -> RecordCodecBuilder.create(inst -> codecStart(inst)
            .apply(inst, WitheredBonesModifier::new)
    ));

    public WitheredBonesModifier(final LootCondition[] conditionsIn) {
        super(conditionsIn);
    }

    @Override
    @NotNull
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        Entity entity = context.get(LootContextParameters.THIS_ENTITY);
        if (entity instanceof WitherSkeletonEntity) {
            Item bone = ForgeRegistries.ITEMS.getValue(WITHERED_BONE_ID);
            if (bone == null) {
                throw new IllegalStateException("Withered Bone does not exist?");
            }
            generatedLoot.add(new ItemStack(bone));
        }

        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}


package io.github.consistencyplus.consistency_plus.forge;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.util.Identifier;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LootTest {
    // INTO INIT FILE


    private static class DataProvider extends GlobalLootModifierProvider {
        public DataProvider(DataGenerator output, String modid) {
            super(output, modid);
        }

        @Override
        protected void start() {
            add("withered_bones", new WitheredBonesModifier(new LootCondition[] {
                    LootTableIdCondition.builder(new Identifier("entities/wither_skeleton")).build()
            }));
        }
    }
}

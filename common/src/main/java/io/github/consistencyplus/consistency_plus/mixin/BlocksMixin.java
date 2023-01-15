package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.blocks.dirt.DirtBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.registry.Registries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

//Credits to Ordana's Immersive Weathering mod, licensed under LGPLv3. Found at: https://github.com/AstralOrdana/Immersive-Weathering-Fabric/blob/main/src/main/java/com/ordana/immersive_weathering/mixin/BlocksMixin.java
//Ty massively for the help with that code as thats the same method we use. :)
@Mixin(Blocks.class)
public abstract class BlocksMixin {
	@Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/block/Block", ordinal = 0), slice = @Slice(from = @At(value = "CONSTANT", args="stringValue=dirt")))
	private static Block dirt(AbstractBlock.Settings settings) {
		return new DirtBlock(AbstractBlock.Settings.of(Material.SOIL).strength(0.5F).sounds(BlockSoundGroup.GRAVEL));
	}
}

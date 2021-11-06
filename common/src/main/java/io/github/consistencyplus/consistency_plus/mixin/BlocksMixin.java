package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.blocks.dirt.DirtBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Blocks.class)
public abstract class BlocksMixin {
	@Inject(at = @At("HEAD"),
			method = "register(Ljava/lang/String;Lnet/minecraft/block/Block;)Lnet/minecraft/block/Block;", cancellable = true)
	private static void cPlus$replaceDirt(String id, Block block, CallbackInfoReturnable<Block> cir) {
		if (id.equals("dirt")) {
			cir.setReturnValue(Registry.register(Registry.BLOCK, id,
					new DirtBlock(AbstractBlock.Settings.of(Material.SOIL).strength(0.5F).sounds(BlockSoundGroup.GRAVEL))));
		}
	}
}

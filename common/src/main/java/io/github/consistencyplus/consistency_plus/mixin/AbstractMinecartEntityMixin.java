package io.github.consistencyplus.consistency_plus.mixin;

import io.github.consistencyplus.consistency_plus.blocks.nubert.NubertBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

@Mixin(AbstractMinecartEntity.class)
public abstract class AbstractMinecartEntityMixin extends Entity {
	@Shadow
	public abstract void setCustomBlock(BlockState state);
	
	@Shadow
	public void dropItems(DamageSource damageSource) {
	}
	
	@Shadow public abstract BlockState getContainedBlock();
	
	public AbstractMinecartEntityMixin(EntityType<?> entityType, World world) {
		super(entityType, world);
	}

	@Redirect(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;getOtherEntities(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Box;Ljava/util/function/Predicate;)Ljava/util/List;"))
	private List<Entity> cPlus$redirectGetOtherEntitesNubertCheck(World instance, Entity except, Box box, Predicate<? super Entity> predicate) {
		if (getContainedBlock().getBlock() instanceof NubertBlock) {
			return Collections.emptyList(); // no entities to check, prevent riding
		}
		return instance.getOtherEntities(except, box, predicate);
	}
}

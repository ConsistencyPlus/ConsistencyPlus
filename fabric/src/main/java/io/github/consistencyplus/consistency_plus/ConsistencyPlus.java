package io.github.consistencyplus.consistency_plus;

import io.github.consistencyplus.consistency_plus.base.ConsistencyPlusMain;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.tutorial.FindTreeTutorialStepHandler;
import net.minecraft.client.tutorial.TutorialManager;
import net.minecraft.entity.ai.brain.sensor.PiglinSpecificSensor;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.screen.StonecutterScreenHandler;

public class ConsistencyPlus implements ModInitializer {
	@Override
	public void onInitialize() {
		ConsistencyPlusMain.init();
	}
}

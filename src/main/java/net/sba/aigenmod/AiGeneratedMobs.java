package net.sba.aigenmod;

import net.fabricmc.api.ModInitializer;

import net.sba.aigenmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AiGeneratedMobs implements ModInitializer {
	public static final String MOD_ID = "ai-generated-mobs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
package net.ratmediagroup.ic2test;

import net.fabricmc.api.ModInitializer;
import net.ratmediagroup.ic2test.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ic2hammer implements ModInitializer {
	public static final String MOD_ID = "ic2hammer";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
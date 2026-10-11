package com.milyasmuhammad306.ben10omniversemod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ben10OmniverseMod implements ModInitializer {
    public static final String MOD_ID = "ben10omniversemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Ben 10 Omniverse Mod");
        // Register items, blocks, entities, etc.
    }
}

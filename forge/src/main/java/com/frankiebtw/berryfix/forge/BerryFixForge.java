package com.frankiebtw.berryfix.forge;

import com.frankiebtw.berryfix.BerryFix;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = BerryFix.MOD_ID)
public class BerryFixForge {
    public BerryFixForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(BerryFix.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
    }
}

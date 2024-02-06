package com.frankiebtw.berryfix.forge;

import com.frankiebtw.berryfix.BerryFix;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = BerryFix.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class Keybinds {
    @SubscribeEvent
    public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
        event.register(BerryFix.BERRY_OVERRIDE_MAPPING);
    }
}

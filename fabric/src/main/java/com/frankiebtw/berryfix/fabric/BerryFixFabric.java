package com.frankiebtw.berryfix.fabric;

import com.frankiebtw.berryfix.BerryFix;
import com.frankiebtw.berryfix.fabriclike.Keybinds;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;

public class BerryFixFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Keybinds.BERRY_OVERRIDE = KeyBindingHelper.registerKeyBinding(
                BerryFix.BERRY_OVERRIDE_MAPPING
        );
    }
}

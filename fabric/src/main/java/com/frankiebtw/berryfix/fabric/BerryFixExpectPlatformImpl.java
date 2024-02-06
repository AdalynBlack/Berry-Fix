package com.frankiebtw.berryfix.fabric;

import com.frankiebtw.berryfix.fabriclike.Keybinds;

public class BerryFixExpectPlatformImpl {
    public static boolean isOverrideHeld() {
        return Keybinds.BERRY_OVERRIDE.isDown();
    }
}

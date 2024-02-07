package com.frankiebtw.berryfix.fabric;

public class BerryFixExpectPlatformImpl {
    public static boolean isOverrideHeld() {
        return Keybinds.BERRY_OVERRIDE.isDown();
    }
}

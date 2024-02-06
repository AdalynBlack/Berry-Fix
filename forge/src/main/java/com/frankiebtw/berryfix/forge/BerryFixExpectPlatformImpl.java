package com.frankiebtw.berryfix.forge;

import com.frankiebtw.berryfix.BerryFix;

public class BerryFixExpectPlatformImpl {
    public static boolean isOverrideHeld() {
        return BerryFix.BERRY_OVERRIDE_MAPPING.isDown();
    }
}

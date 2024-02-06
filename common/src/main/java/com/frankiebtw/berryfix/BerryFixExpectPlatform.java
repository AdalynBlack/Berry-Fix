package com.frankiebtw.berryfix;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class BerryFixExpectPlatform {
    @ExpectPlatform
    public static boolean isOverrideHeld() {
        throw new AssertionError();
    }
}

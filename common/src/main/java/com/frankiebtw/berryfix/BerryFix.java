package com.frankiebtw.berryfix;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

import static net.minecraft.client.KeyMapping.CATEGORY_MISC;

public class BerryFix {
    public static final String MOD_ID = "berryfix";

    public static KeyMapping BERRY_OVERRIDE_MAPPING = new KeyMapping(
            "key.berry_override",
            InputConstants.Type.KEYSYM,
            GLFW.GLFW_KEY_LEFT_ALT,
            CATEGORY_MISC
    );
}

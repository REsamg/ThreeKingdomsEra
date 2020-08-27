package com.re_she.mod.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class KeyLoader
{
    public static KeyBinding Openthemenu;

    public KeyLoader()
    {
        KeyLoader.Openthemenu = new KeyBinding("key.fmltutor.showTime", Keyboard.KEY_V, "key.categories.fmltutor");

        ClientRegistry.registerKeyBinding(KeyLoader.Openthemenu);
    }
}

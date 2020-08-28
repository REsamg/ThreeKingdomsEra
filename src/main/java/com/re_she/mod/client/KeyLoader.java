package com.re_she.mod.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class KeyLoader
{
    //KEY_V 按V
    public static KeyBinding Openthemenu = new KeyBinding(
            "key.fmltutor.showtime",
            Keyboard.KEY_V,
            "key.categories.fmltutor");


    public KeyLoader()
    {
        ClientRegistry.registerKeyBinding(KeyLoader.Openthemenu);
    }
}

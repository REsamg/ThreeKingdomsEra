package com.re_she.mod.inventory;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.client.gui.GuiContainerDemo;
import com.re_she.mod.client.gui.GuiRedPacket;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiElementLoader implements IGuiHandler
{
    public static final int GUI_DEMO = 0;
    public static final int GUI_REDPACKET = 1;
    public static final int GUI_BAG = 2;

    public GuiElementLoader()
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(Fmltutor.instance, this);
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID)
        {
            case GUI_DEMO:
                return new ContainerDemo(player);

            case GUI_REDPACKET:
                return new ContainerRedPacket(player);

            case GUI_BAG:
                return null;
            default:
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID)
        {
            case GUI_DEMO:
                return new GuiContainerDemo(player);

            case GUI_REDPACKET:
                return new GuiRedPacket(player);

            case GUI_BAG:
                return null;
            default:
                return null;
        }
    }
}

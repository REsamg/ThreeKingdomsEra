package com.re_she.mod.inventory;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.client.gui.GuiContainerDemo;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/*
public class GuiElementLoader implements IGuiHandler
{
    public static final int GUI_DEMO = 1;

    public GuiElementLoader()
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(Fmltutor.instance, this);
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        switch (ID)
        {
            case GUI_DEMO:
                return new ContainerDemo();
            default:
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        switch (ID)
        {
            case GUI_DEMO:
                return new GuiContainerDemo(new ContainerDemo());
            default:
                return null;
        }
    }
}

 */

/*
package com.github.ustc_zzzz.fmltutor.inventory;

import com.github.ustc_zzzz.fmltutor.FMLTutor;
import com.github.ustc_zzzz.fmltutor.client.gui.GuiContainerDemo;
import com.github.ustc_zzzz.fmltutor.client.gui.GuiMetalFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
*/

public class GuiElementLoader implements IGuiHandler
{
    public static final int GUI_DEMO = 1;

    public GuiElementLoader()
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(Fmltutor.instance, this);
        //Fmltutor.instance
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        switch (ID)
        {
        case GUI_DEMO:
            return new ContainerDemo(player);
            /*
        case GUI_METAL_FURNACE:
            return new ContainerMetalFurnace(player, world.getTileEntity(new BlockPos(x, y, z)));
            */
        default:
            return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        switch (ID)
        {
        case GUI_DEMO:
            return new GuiContainerDemo(new ContainerDemo(player));
            /*
        case GUI_METAL_FURNACE:
            return new GuiMetalFurnace(new ContainerMetalFurnace(player, world.getTileEntity(new BlockPos(x, y, z))));
            */
        default:
            return null;
        }
    }
}

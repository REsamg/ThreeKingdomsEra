package com.re_she.tke.common;

import com.re_she.tke.entity.EntityLoader;
import com.re_she.tke.inventory.GuiElementLoader;
import com.re_she.tke.item.ItemLoader;
import com.re_she.tke.world.WorldProviderPollute;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.DimensionManager;

public class CommonProxy
{

    public void preInit(FMLPreInitializationEvent event)
    {
        //new CreativeTabsLoader(event);
        new ItemLoader(event);
        new com.re_she.tke.block.BlockLoader(event);
        new EntityLoader();
        new EventLoader();
        new GuiElementLoader();
    }
    public void init(FMLInitializationEvent event)
    {
        DimensionManager.registerProviderType(21, WorldProviderPollute.class, true);
        DimensionManager.registerDimension(21, 21);
    }


    public void postInit (FMLPostInitializationEvent event)
    {

    }

}

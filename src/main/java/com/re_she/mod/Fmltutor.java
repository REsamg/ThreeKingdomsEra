package com.re_she.mod;


import com.re_she.mod.common.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Fmltutor.MODID, name = Fmltutor.NAME, version = Fmltutor.VERSION)
public class Fmltutor
{
    public static final String MODID = "fmltutor";      //MODID是要小写！！！！！ 可以加_   比如：   fmang_dsab
    public static final String NAME = "FML Tutor";      //名字 可以大小写
    public static final String VERSION = "1.0.0";       //版本

    @Mod.Instance(Fmltutor.MODID)
    public static Fmltutor instance;

    @SidedProxy(clientSide = "com.re_she.mod.client.ClientProxy",
            serverSide = "com.re_she.mod.common.CommonProxy")

    public static CommonProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}

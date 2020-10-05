package com.re_she.tke.item;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemLoader
{
    public static Item copper_cash = new ItemCopperCash();
    public static Item iron_broadsword = new ItemIronBroadSword();
    public static Item iron_halberd = new ItemIronHalberd();
    public static Item copper_ingot = new ItemCopperIngot();
    public static Item tin_ingot = new ItemTinIngot();
    public static Item bronze_ingot = new ItemBronzeIngot();
    public static Item copper_picks = new ItemCopperPicks();
    public static Item copper_axe = new ItemCopperAxe();
    public static Item copper_hoe = new ItemCopperHoe();
    public static Item copper_spade = new ItemCopperSpade();
    public static Item copper_sword = new ItemCopperSword();

    public static Item safety_buckle = new ItemSafetyBuckle();


    public static Item bag = new ItemBag();

    public static Item red_packet = new ItemRedPacket();



    public ItemLoader(FMLPreInitializationEvent event)
    {


        GameRegistry.registerItem(copper_cash,"copper_cash");

        GameRegistry.registerItem(iron_broadsword, "iron_broadsword");

        GameRegistry.registerItem(iron_halberd, "iron_halberd");

        GameRegistry.registerItem(copper_ingot,"copper_ingot");

        GameRegistry.registerItem(tin_ingot,"tin_ingot");

        GameRegistry.registerItem(bronze_ingot,"bronze_ingot");

        GameRegistry.registerItem(copper_picks,"copper_picks");

        GameRegistry.registerItem(copper_axe,"copper_axe");

        GameRegistry.registerItem(copper_hoe,"copper_hoe");

        GameRegistry.registerItem(copper_spade,"copper_spade");

        GameRegistry.registerItem(copper_sword,"copper_sword");



        GameRegistry.registerItem(safety_buckle,"safety_buckle");

        //-------------------------------------------------------------------



        GameRegistry.registerItem(red_packet,"red_packet");

        GameRegistry.registerItem(bag,"bag");
    }



    //ModelResourceLocation model = new ModelResourceLocation(goldenEgg.getRegistryName(), "inventory");

       //s ModelLoader.setCustomModelResourceLocation(item, 0, model);

}

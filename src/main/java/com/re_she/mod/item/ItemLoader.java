package com.re_she.mod.item;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemLoader
{
    public static Item copper_cash = new TKEItemCopperCash();
    public static Item iron_broadsword = new TKEItemIronBroadSword();
    public static Item iron_halberd = new TKEItemIronHalberd();
    public static Item copper_ingot = new TKEItemCopperIngot();
    public static Item tin_ingot = new TKEItemTinIngot();
    public static Item bronze_ingot = new TKEItemBronzeIngot();
    public static Item copper_picks = new TKEItemCopperPicks();
    public static Item copper_axe = new TKEItemCopperAxe();
    public static Item copper_hoe = new TKEItemCopperHoe();
    public static Item copper_spade = new TKEItemCopperSpade();
    public static Item copper_sword = new TKEItemCopperSword();

    public static Item safety_buckle = new TKEItemSafetyBuckle();


    public static Item bag = new TKEItemBag();

    public static Item red_packet = new TKEItemRedPacket();



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

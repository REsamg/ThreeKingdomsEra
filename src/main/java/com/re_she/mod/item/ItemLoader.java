package com.re_she.mod.item;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemLoader
{
    public static Item copper_cash = new Itemcoppercash();
    public static Item ironbroadsword = new ItemIronBroadSword();
    public static Item ironhalberd = new ItemIronHalberd();
    public static Item copperingot = new Itemcopperingot();
    public static Item tiningot = new Itemtiningot();
    public static Item bronzeingot = new Itembronzeingot();
    public static Item copper_picks = new Itemcopperpicks();
    public static Item copper_axe = new Itemcopperaxe();
    public static Item copper_hoe = new Itemcopperhoe();
    public static Item copper_spade = new Itemcopperspade();
    public static Item copper_sword = new Itemcoppersword();

    public static Item csnn_hattt = new ItemSafetyBuckle();



    public ItemLoader(FMLPreInitializationEvent event)
    {


        GameRegistry.registerItem(copper_cash,"copper_cash");

        GameRegistry.registerItem(ironbroadsword, "ironbroadsword");

        GameRegistry.registerItem(ironhalberd, "ironhalberd");

        GameRegistry.registerItem(copperingot,"copperingot");

        GameRegistry.registerItem(tiningot,"tiningot");

        GameRegistry.registerItem(bronzeingot,"bronzeingot");

        GameRegistry.registerItem(copper_picks,"copper_picks");

        GameRegistry.registerItem(copper_axe,"copper_axe");

        GameRegistry.registerItem(copper_hoe,"copper_hoe");

        GameRegistry.registerItem(copper_spade,"copper_spade");

        GameRegistry.registerItem(copper_sword,"copper_sword");



        GameRegistry.registerItem(csnn_hattt,"safety_buckle");
    }



    //ModelResourceLocation model = new ModelResourceLocation(goldenEgg.getRegistryName(), "inventory");

       //s ModelLoader.setCustomModelResourceLocation(item, 0, model);

}

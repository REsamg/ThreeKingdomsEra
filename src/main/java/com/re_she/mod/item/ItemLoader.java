package com.re_she.mod.item;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemLoader
{
    public static Item copper_cash = new Itemcoppercash();
    public static Item ironbroadsword = new ItemIronBroadSword();
    public static Item ironhalberd = new ItemIronHalberd();
    public static Item copperingot = new Itemcopperingot();
    public static Item tiningot = new Itemtiningot();
    public static Item bronzeingot = new Itembronzeingot();
    public static Item copper_picks = new Itemcopperpicks();

    public ItemLoader(FMLPreInitializationEvent event)
    {


        GameRegistry.registerItem(copper_cash,"copper_cash");

        GameRegistry.registerItem(ironbroadsword, "ironbroadsword");

        GameRegistry.registerItem(ironhalberd, "ironhalberd");

        GameRegistry.registerItem(copperingot,"copperingot");

        GameRegistry.registerItem(tiningot,"tiningot");

        GameRegistry.registerItem(bronzeingot,"bronzeingot");

        GameRegistry.registerItem(copper_picks,"copper_picks");
    }



    //ModelResourceLocation model = new ModelResourceLocation(goldenEgg.getRegistryName(), "inventory");

       //s ModelLoader.setCustomModelResourceLocation(item, 0, model);

}

package com.re_she.mod.block;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class TKEBlockLoader
{
    public static Block grass_Block = new TKEBlockGrassBlock();
    public static Block ore_copper = new TKEBlockCopper();
    public static Block ore_tin = new TKEBlockOreTin();
    public static Block bronze_Block = new TKEBlockBronzeBlock();
    public static Block copper_Block = new TKEBlockCopperBlock();


    public TKEBlockLoader(FMLPreInitializationEvent event)
    {

        GameRegistry.registerBlock(grass_Block, "grass_block");
        GameRegistry.registerBlock(ore_copper, "ore_copper");
        GameRegistry.registerBlock(ore_tin, "ore_tin");
        GameRegistry.registerBlock(bronze_Block, "bronze_block");
        GameRegistry.registerBlock(copper_Block, "copper_block");

       // register(grassBlock, "grass_block");
    }

    /*
    private static void register(Block block, String name)
    {
        GameRegistry.registerBlock(block.setRegistryName(name));
    }*/

}

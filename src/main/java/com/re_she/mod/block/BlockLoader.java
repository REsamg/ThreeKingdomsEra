package com.re_she.mod.block;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockLoader
{
    public static Block grassBlock = new BlockAGrassBlock();
    public static Block orecopper = new BlockAcopper();
    public static Block oretin = new BlockAoretin();


    public BlockLoader(FMLPreInitializationEvent event)
    {

        GameRegistry.registerBlock(grassBlock, "grass_block");
        GameRegistry.registerBlock(orecopper, "orecopper");
        GameRegistry.registerBlock(oretin, "oretin");

       // register(grassBlock, "grass_block");
    }

    /*
    private static void register(Block block, String name)
    {
        GameRegistry.registerBlock(block.setRegistryName(name));
    }*/

}

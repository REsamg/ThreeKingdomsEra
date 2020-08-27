package com.re_she.mod.creativetab;

import com.re_she.mod.block.BlockLoader;
import com.re_she.mod.item.ItemLoader;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class CreativeTabsLoader
{

    public static final CreativeTabs re_tabFMLTutor = new CreativeTabs( "Sanguo_sundries")
    {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return ItemLoader.copper_cash;//Item.getItemFromBlock(Blocks.brick_block);
        }
    };

    public static final CreativeTabs re_equip = new CreativeTabs( "Sanguo_equip")
    {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return ItemLoader.ironbroadsword;//Item.getItemFromBlock(Blocks.brick_block);
        }
    };
    public static final CreativeTabs re_block = new CreativeTabs( "Sanguo_block")
    {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(BlockLoader.orecopper);
        }
    };





}

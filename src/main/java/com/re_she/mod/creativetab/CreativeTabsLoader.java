package com.re_she.mod.creativetab;

import com.re_she.mod.block.TKEBlockLoader;
import com.re_she.mod.item.ItemLoader;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsLoader
{

    public static final CreativeTabs re_tabFMLTutor = new CreativeTabs( "SanGuo_sundries")
    {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return ItemLoader.copper_cash;//Item.getItemFromBlock(Blocks.brick_block);
        }
    };

    public static final CreativeTabs re_equip = new CreativeTabs( "SanGuo_equip")
    {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return ItemLoader.iron_broadsword;//Item.getItemFromBlock(Blocks.brick_block);
        }
    };
    public static final CreativeTabs re_block = new CreativeTabs( "SanGuo_block")
    {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(TKEBlockLoader.ore_copper);
        }
    };





}

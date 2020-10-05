package com.re_she.tke.item;

import com.re_she.tke.Fmltutor;
import com.re_she.tke.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemCopperIngot extends Item
{
    public ItemCopperIngot()
    {
        super();
        this.setUnlocalizedName(Fmltutor.MODID + "." + "copper_ingot");
        this.setTextureName(Fmltutor.MODID + ":" + "copper_ingot");
        this.setCreativeTab(CreativeTabsLoader.re_tabFMLTutor);
    }
}

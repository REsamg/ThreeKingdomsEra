package com.re_she.mod.item;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class Itemcopperingot extends Item
{
    public Itemcopperingot()
    {
        super();
        this.setUnlocalizedName(Fmltutor.MODID + "." + "copperingot");
        this.setTextureName(Fmltutor.MODID + ":" + "copperingot");
        this.setCreativeTab(CreativeTabsLoader.re_tabFMLTutor);
    }
}

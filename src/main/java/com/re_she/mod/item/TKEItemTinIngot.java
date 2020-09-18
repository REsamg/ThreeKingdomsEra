package com.re_she.mod.item;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class TKEItemTinIngot extends Item
{
    public TKEItemTinIngot()
    {
        super();
        this.setUnlocalizedName(Fmltutor.MODID + "." + "tin_ingot");
        this.setTextureName(Fmltutor.MODID + ":" + "tin_ingot");
        this.setCreativeTab(CreativeTabsLoader.re_tabFMLTutor);
    }
}

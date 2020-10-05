package com.re_she.tke.item;

import com.re_she.tke.Fmltutor;
import com.re_she.tke.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemTinIngot extends Item
{
    public ItemTinIngot()
    {
        super();
        this.setUnlocalizedName(Fmltutor.MODID + "." + "tin_ingot");
        this.setTextureName(Fmltutor.MODID + ":" + "tin_ingot");
        this.setCreativeTab(CreativeTabsLoader.re_tabFMLTutor);
    }
}

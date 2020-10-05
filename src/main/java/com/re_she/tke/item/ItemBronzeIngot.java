package com.re_she.tke.item;

import com.re_she.tke.Fmltutor;
import com.re_she.tke.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemBronzeIngot extends Item
{
    public ItemBronzeIngot()
    {
        super();
        this.setUnlocalizedName(Fmltutor.MODID + "." + "bronze_ingot");
        this.setTextureName(Fmltutor.MODID + ":" + "bronze_ingot");
        this.setCreativeTab(CreativeTabsLoader.re_tabFMLTutor);
    }
}

package com.re_she.mod.item;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class TKEItemBronzeIngot extends Item
{
    public TKEItemBronzeIngot()
    {
        super();
        this.setUnlocalizedName(Fmltutor.MODID + "." + "bronze_ingot");
        this.setTextureName(Fmltutor.MODID + ":" + "bronze_ingot");
        this.setCreativeTab(CreativeTabsLoader.re_tabFMLTutor);
    }


    
}

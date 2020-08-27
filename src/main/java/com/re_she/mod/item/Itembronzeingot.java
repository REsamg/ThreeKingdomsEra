package com.re_she.mod.item;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class Itembronzeingot extends Item
{
    public Itembronzeingot()
    {
        super();
        this.setUnlocalizedName(Fmltutor.MODID + "." + "bronzeingot");
        this.setTextureName(Fmltutor.MODID + ":" + "bronzeingot");
        this.setCreativeTab(CreativeTabsLoader.re_tabFMLTutor);
    }


    
}

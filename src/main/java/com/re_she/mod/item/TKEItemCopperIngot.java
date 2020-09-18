package com.re_she.mod.item;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class TKEItemCopperIngot extends Item
{
    public TKEItemCopperIngot()
    {
        super();
        this.setUnlocalizedName(Fmltutor.MODID + "." + "copper_ingot");
        this.setTextureName(Fmltutor.MODID + ":" + "copper_ingot");
        this.setCreativeTab(CreativeTabsLoader.re_tabFMLTutor);
    }
}

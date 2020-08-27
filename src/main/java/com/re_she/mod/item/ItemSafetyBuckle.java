package com.re_she.mod.item;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class ItemSafetyBuckle extends Item
{
    public ItemSafetyBuckle()
    {
        super();
        this.setUnlocalizedName(Fmltutor.MODID + "." + "safety_buckle");
        this.setTextureName(Fmltutor.MODID + ":" + "safety_buckle");
        this.setCreativeTab(CreativeTabsLoader.re_tabFMLTutor);
    }
}

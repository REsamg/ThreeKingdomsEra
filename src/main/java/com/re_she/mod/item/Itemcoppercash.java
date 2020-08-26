package com.re_she.mod.item;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;

public class Itemcoppercash extends Item
{
    public Itemcoppercash()
    {
        super();
        this.setUnlocalizedName(Fmltutor.MODID + "." + "copper_cash");
//设置物品id
        this.setTextureName(Fmltutor.MODID + ":" + "copper_cash");
//设置材质
        this.setCreativeTab(CreativeTabsLoader.re_tabFMLTutor);

    }
}

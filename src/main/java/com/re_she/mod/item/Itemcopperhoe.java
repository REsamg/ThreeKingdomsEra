package com.re_she.mod.item;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.common.util.EnumHelper;

public class Itemcopperhoe extends ItemHoe
{
    public static final Item.ToolMaterial copper = EnumHelper.addToolMaterial("copper", 1, 250, 4.0F, 2.0F, 10);

    public Itemcopperhoe()
    {
        super(copper);
        this.setUnlocalizedName("copper_hoe");
        this.setTextureName(Fmltutor.MODID + ":" + "copper_hoe");
        this.setCreativeTab(CreativeTabsLoader.re_equip);
    }
}
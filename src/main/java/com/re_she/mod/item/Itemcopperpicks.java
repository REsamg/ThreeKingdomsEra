package com.re_she.mod.item;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

public class Itemcopperpicks extends ItemPickaxe
{
    public static final Item.ToolMaterial copperiron = EnumHelper.addToolMaterial("copperiron", 1, 250, 6.0F, 2.0F, 10);

    public Itemcopperpicks()
    {
        super(copperiron);
        this.setUnlocalizedName("copper_picks");
        this.setTextureName(Fmltutor.MODID + ":" + "copper_picks");
        this.setCreativeTab(CreativeTabsLoader.re_equip);
    }
}

package com.re_she.mod.item;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.common.util.EnumHelper;

public class TKEItemCopperSpade extends ItemSpade
{
    public static final Item.ToolMaterial copper = EnumHelper.addToolMaterial("copper", 1, 250, 4.0F, 2.0F, 10);

    public TKEItemCopperSpade()
    {
        super(copper);
        this.setUnlocalizedName(Fmltutor.MODID + "." + "copper_spade");
        this.setTextureName(Fmltutor.MODID + ":" + "copper_spade");
        this.setCreativeTab(CreativeTabsLoader.re_equip);
    }
}
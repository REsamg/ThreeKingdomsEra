package com.re_she.tke.item;

import com.re_she.tke.Fmltutor;
import com.re_she.tke.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemCopperSword extends ItemSword
{
    public static final Item.ToolMaterial copper = EnumHelper.addToolMaterial("copper", 1, 250, 4.0F, 2.0F, 10);

    public ItemCopperSword()
    {
        super(copper);
        this.setUnlocalizedName(Fmltutor.MODID + "." + "copper_sword");
        this.setTextureName(Fmltutor.MODID + ":" + "copper_sword");
        this.setCreativeTab(CreativeTabsLoader.re_equip);
    }
}

package com.re_she.mod.item;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class TKEItemIronHalberd extends ItemSword {
    public static final Item.ToolMaterial Iron = EnumHelper.addToolMaterial("Iron", 0, 550, 0.0F, 1.0F, 10);

    public TKEItemIronHalberd()
    {
        super(Iron);
        this.setUnlocalizedName(Fmltutor.MODID + "." + "iron_halberd");
        this.setTextureName(Fmltutor.MODID + ":" + "iron_halberd");
        this.setCreativeTab(CreativeTabsLoader.re_equip);
    }

}

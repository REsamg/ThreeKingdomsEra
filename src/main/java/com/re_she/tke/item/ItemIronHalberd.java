package com.re_she.tke.item;

import com.re_she.tke.Fmltutor;
import com.re_she.tke.creativetab.CreativeTabsLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemIronHalberd extends ItemSword {
    public static final Item.ToolMaterial Iron = EnumHelper.addToolMaterial("Iron", 0, 550, 0.0F, 1.0F, 10);

    public ItemIronHalberd()
    {
        super(Iron);
        this.setUnlocalizedName(Fmltutor.MODID + "." + "iron_halberd");
        this.setTextureName(Fmltutor.MODID + ":" + "iron_halberd");
        this.setCreativeTab(CreativeTabsLoader.re_equip);
    }

}

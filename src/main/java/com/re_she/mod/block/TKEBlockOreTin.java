package com.re_she.mod.block;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TKEBlockOreTin extends Block {
    public TKEBlockOreTin()
    {
        super(Material.ground);
        this.setUnlocalizedName("ore_tin");
        this.setHardness(2.5F);
        this.setStepSound(soundTypeStone);

        this.setUnlocalizedName(Fmltutor.MODID + ".ore_tin");
        this.setTextureName(Fmltutor.MODID + ":ore_tin");
        this.setCreativeTab(CreativeTabsLoader.re_block);
    }
}

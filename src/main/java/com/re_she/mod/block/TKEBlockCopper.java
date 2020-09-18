package com.re_she.mod.block;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TKEBlockCopper extends Block {
    public TKEBlockCopper()
    {
        super(Material.ground);
        this.setUnlocalizedName("ore_copper");
        this.setHardness(2.0F);
        this.setStepSound(soundTypeStone);

        this.setUnlocalizedName(Fmltutor.MODID + ".ore_copper");
        this.setTextureName(Fmltutor.MODID + ":ore_copper");
        this.setCreativeTab(CreativeTabsLoader.re_block);
    }

}

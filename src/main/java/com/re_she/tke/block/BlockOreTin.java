package com.re_she.tke.block;

import com.re_she.tke.Fmltutor;
import com.re_she.tke.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOreTin extends Block {
    public BlockOreTin()
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

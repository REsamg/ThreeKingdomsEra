package com.re_she.tke.block;

import com.re_she.tke.Fmltutor;
import com.re_she.tke.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCopper extends Block {
    public BlockCopper()
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

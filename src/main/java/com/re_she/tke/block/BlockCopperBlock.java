package com.re_she.tke.block;

import com.re_she.tke.Fmltutor;
import com.re_she.tke.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCopperBlock extends Block
{
    public BlockCopperBlock()
    {
        super(Material.ground);
        this.setUnlocalizedName("copper_block");
        this.setHardness(2.0F);
        this.setStepSound(soundTypeStone);

        this.setUnlocalizedName(Fmltutor.MODID + ".copper_block");
        this.setTextureName(Fmltutor.MODID + ":copper_block");
        this.setCreativeTab(CreativeTabsLoader.re_block);
    }
}

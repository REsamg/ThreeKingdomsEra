package com.re_she.mod.block;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAcopperBlock extends Block
{
    public BlockAcopperBlock()
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

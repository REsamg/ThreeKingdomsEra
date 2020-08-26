package com.re_she.mod.block;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAcopper extends Block {
    public BlockAcopper()
    {
        super(Material.ground);
        this.setUnlocalizedName("orecopper");
        this.setHardness(2.0F);
        this.setStepSound(soundTypeStone);

        this.setUnlocalizedName(Fmltutor.MODID + ".orecopper");
        this.setTextureName(Fmltutor.MODID + ":orecopper");
        this.setCreativeTab(CreativeTabsLoader.re_block);
    }

}

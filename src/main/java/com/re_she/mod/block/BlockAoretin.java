package com.re_she.mod.block;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAoretin extends Block {
    public BlockAoretin()
    {
        super(Material.ground);
        this.setUnlocalizedName("oretin");
        this.setHardness(2.5F);
        this.setStepSound(soundTypeStone);

        this.setUnlocalizedName(Fmltutor.MODID + ".oretin");
        this.setTextureName(Fmltutor.MODID + ":oretin");
        this.setCreativeTab(CreativeTabsLoader.re_block);
    }
}

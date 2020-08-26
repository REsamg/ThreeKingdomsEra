package com.re_she.mod.block;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockAGrassBlock extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon field_150116_a;
    @SideOnly(Side.CLIENT)
    private IIcon field_150115_b;
    public BlockAGrassBlock()
    {
        super(Material.ground);

        //this.setUnlocalizedName("grassBlock");
        this.setCreativeTab(CreativeTabsLoader.re_block);

        this.setUnlocalizedName(Fmltutor.MODID + ".grass_block");
        this.setTextureName(Fmltutor.MODID + ":grass_block");



        this.setHardness(0.5F);
        this.setStepSound(soundTypeGrass);


    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return side == 0 ? this.field_150115_b : (side == 1 ? this.field_150116_a : this.blockIcon);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister reg)
    {
        this.blockIcon = reg.registerIcon(this.getTextureName() + "_side");
        this.field_150116_a = reg.registerIcon(this.getTextureName() + "_top");
        this.field_150115_b = reg.registerIcon(this.getTextureName() + "_bottom");
    }
}

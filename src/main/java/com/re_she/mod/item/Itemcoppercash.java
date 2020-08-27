package com.re_she.mod.item;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import com.re_she.mod.inventory.GuiElementLoader;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class Itemcoppercash extends Item {
    public Itemcoppercash() {
        super();
        this.setUnlocalizedName(Fmltutor.MODID + "." + "copper_cash");//设置物品id
        this.setTextureName(Fmltutor.MODID + ":" + "copper_cash");//设置材质
        this.setCreativeTab(CreativeTabsLoader.re_tabFMLTutor);
    }
    /*
    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
        return itemStackIn;
    }

     */
}
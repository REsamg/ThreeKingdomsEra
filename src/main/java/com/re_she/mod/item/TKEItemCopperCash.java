package com.re_she.mod.item;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import com.re_she.mod.inventory.GuiElementLoader;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class TKEItemCopperCash extends Item {
    public TKEItemCopperCash() {
        super();
        this.setUnlocalizedName(Fmltutor.MODID + "." + "copper_cash");//设置物品id
        this.setTextureName(Fmltutor.MODID + ":" + "copper_cash");//设置材质
        this.setCreativeTab(CreativeTabsLoader.re_tabFMLTutor);
        this.setMaxStackSize(1);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
        if (!playerIn.capabilities.isCreativeMode)
        {
            --itemStackIn.stackSize;
        }
        if (!worldIn.isRemote)
        {
            if (playerIn.isSneaking())
            {
                playerIn.openGui(Fmltutor.instance, GuiElementLoader.GUI_DEMO, worldIn,
                        playerIn.chunkCoordX, playerIn.chunkCoordY, playerIn.chunkCoordZ);

                playerIn.addChatComponentMessage((IChatComponent)new ChatComponentText("Open Gui"));
            }
        }
        return itemStackIn;
    }
}
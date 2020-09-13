package com.re_she.mod.item;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import com.re_she.mod.inventory.GuiElementLoader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

/**
 * 红包
 * */
public class ItemRedPacket extends Item {
    public ItemRedPacket() {
        super();
        this.setUnlocalizedName(Fmltutor.MODID + "." + "red_packet");
        this.setTextureName(Fmltutor.MODID + ":" + "red_packet");
        this.setCreativeTab(CreativeTabsLoader.re_tabFMLTutor);
        this.setMaxStackSize(1);
    }


    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
        if (!worldIn.isRemote)
        {
                playerIn.openGui(Fmltutor.instance, GuiElementLoader.GUI_REDPACKET, worldIn,
                        playerIn.chunkCoordX, playerIn.chunkCoordY, playerIn.chunkCoordZ);
        }
        return itemStackIn;
    }
}
package com.re_she.tke.item;

import com.re_she.tke.Fmltutor;
import com.re_she.tke.creativetab.CreativeTabsLoader;
import com.re_she.tke.inventory.GuiElementLoader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

/**
 * 袋子
 * */
public class ItemBag extends Item {
    public ItemBag()
    {
        super();
        this.setUnlocalizedName(Fmltutor.MODID + "." + "bag");
        this.setTextureName(Fmltutor.MODID + ":" + "bag");
        this.setCreativeTab(CreativeTabsLoader.re_tabFMLTutor);
        this.setMaxStackSize(1);
    }


    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
        if (!worldIn.isRemote)
        {
                playerIn.openGui(Fmltutor.instance, GuiElementLoader.GUI_BAG, worldIn,
                        playerIn.chunkCoordX, playerIn.chunkCoordY, playerIn.chunkCoordZ);
        }
        return itemStackIn;
    }

}

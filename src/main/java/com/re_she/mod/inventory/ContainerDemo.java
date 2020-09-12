package com.re_she.mod.inventory;

import com.re_she.mod.item.ItemLoader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;

public class ContainerDemo extends Container
{
    public ContainerDemo()
    {
        super();
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn)
    {
        return new ItemStack(ItemLoader.copper_cash).isItemEqual(playerIn.getCurrentEquippedItem());
    }
}

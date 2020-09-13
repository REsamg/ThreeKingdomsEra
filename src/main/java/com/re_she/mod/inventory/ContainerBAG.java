package com.re_she.mod.inventory;

import com.re_she.mod.item.ItemLoader;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ContainerBAG extends Container {

    private ItemStack itemStack;


    public ContainerBAG(EntityPlayer player) {

        this.itemStack = player.getHeldItem();

        for (int is = 0; is < 5; ++is)
        {
            this.addSlotToContainer(new Slot(new InventoryBasic("bag", false, 1 + is),
                    is,  44 + is * 18, 20));
        }


        load(player);

        byte b0 = 51;
        int i;



        for (i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(player.inventory, j + i * 9 + 9, 8 + j * 18, i * 18 + b0));
            }
        }

        for (i = 0; i < 9; ++i)
        {
            if (i == player.inventory.currentItem) {
                this.addSlotToContainer(new Slot(player.inventory, i, 8 + i * 18, 58 + b0) {
                    @Override
                    public boolean canTakeStack(EntityPlayer player) {
                        return false;
                    }
                    @Override
                    public boolean isItemValid(ItemStack stack) {
                        return false;
                    }
                });
            } else {
                this.addSlotToContainer(new Slot(player.inventory, i, 8 + i * 18, 58 + b0));
            }
        }
    }


    private void load(EntityPlayer player){
        //不知道有没有用的防刷物品措施
        if(player.getEntityWorld().isRemote) return;

        if (itemStack.hasTagCompound() && itemStack.getTagCompound().hasKey("itemaaa")) {

            NBTTagCompound aaitemnbt = itemStack.getTagCompound().getCompoundTag("itemaaa");

            itemStack.getTagCompound().setTag("itemaaa",new NBTTagCompound());

            ItemStack item = ItemStack.loadItemStackFromNBT(aaitemnbt);

            getSlot(0).putStack(item);
        }
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return new ItemStack(ItemLoader.bag).isItemEqual(playerIn.getCurrentEquippedItem());
    }

    @Override
    public void onContainerClosed(EntityPlayer playerIn) {
        super.onContainerClosed(playerIn);
        if (playerIn.getHeldItem() == null || !playerIn.getHeldItem().getItem().equals(ItemLoader.bag)) return;

        NBTTagCompound aaitemnbt = new NBTTagCompound();
        if (getSlot(0).getStack() != null) getSlot(0).getStack().writeToNBT(aaitemnbt);
        playerIn.getHeldItem().setTagInfo("itemaaa", aaitemnbt);
    }


    /**
     * Take a stack from the specified inventory slot.
     */

    /*
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int index)
    {
        ItemStack itemstack = null;

        Slot slot = (Slot)this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            //if (var4 != null && var4.getHasStack()) {

            if (index < this.field_94538_a.getSizeInventory())
            {
                if (!this.mergeItemStack(itemstack1, this.field_94538_a.getSizeInventory(), this.inventorySlots.size(), true))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 0, this.field_94538_a.getSizeInventory(), false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }
        }

        return itemstack;
    }

     */


    @Override
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2) {
        ItemStack var3 = null;
        Slot var4 = (Slot) this.inventorySlots.get(par2);
        if (var4 != null && var4.getHasStack()) {
            ItemStack var5 = var4.getStack();
            var3 = var5.copy();
            // 点击到Slot的ID为0的时候，将物品送回玩家的背包中
            if (par2 == 0) {
                if (!this.mergeItemStack(var5, 1, 28, false)) {
                    return null;
                }
                var4.onSlotChange(var5, var3);
            }
            // 点击到玩家的背包的时候将物品送到玩家的快捷栏中
            else if (par2 > 0 && par2 < 28) {
                if (!this.mergeItemStack(var5, 28, 37, false)) {
                    return null;
                }
            }
            // 点击到玩家的快捷栏的时候将物品送到背包中
            else if (par2 >= 28 && par2 < 37) {
                if (!this.mergeItemStack(var5, 1, 28, false)) {
                    return null;
                }
            }
            if (var5.stackSize == 0) {
                var4.putStack((ItemStack) null);
            } else {
                var4.onSlotChanged();
            }
            if (var5.stackSize == var3.stackSize) {
                return null;
            }
            var4.onPickupFromSlot(par1EntityPlayer, var5);
        }

        return var3;
    }



}

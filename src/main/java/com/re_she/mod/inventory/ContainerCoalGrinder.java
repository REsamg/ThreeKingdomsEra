/*
package com.re_she.mod.inventory;

import com.re_she.mod.tileentity.TileEntityCoalGrinder;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Container;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;


public class ContainerCoalGrinder extends Container {

    private TileEntityCoalGrinder tileCoalGrinder;
    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;
    private static final String __OBFID = "CL_00001748";

    public ContainerCoalGrinder(InventoryPlayer invPlayer, TileEntityCoalGrinder p_i1812_2_) {
        this.tileCoalGrinder = p_i1812_2_;
        this.addSlotToContainer(new Slot(p_i1812_2_, 0, 56, 17));
        this.addSlotToContainer(new Slot(p_i1812_2_, 1, 56, 53));
        this.addSlotToContainer(new SlotFurnace(invPlayer.player, p_i1812_2_, 2, 116, 35));

        int i;
        for(i = 0; i < 3; ++i) {
            for(int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(invPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for(i = 0; i < 9; ++i) {
            this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18, 142));
        }

    }

    public void onCraftGuiOpened(ICrafting p_75132_1_) {
        super.onCraftGuiOpened(p_75132_1_);
        p_75132_1_.sendProgressBarUpdate(this, 0, this.tileCoalGrinder.grindCookTime);
        p_75132_1_.sendProgressBarUpdate(this, 1, this.tileCoalGrinder.grindBurnTime);
        p_75132_1_.sendProgressBarUpdate(this, 2, this.tileCoalGrinder.currentItemBurnTime);
    }

    public void detectAndSendChanges() {
        super.detectAndSendChanges();

        for(int i = 0; i < this.crafters.size(); ++i) {
            ICrafting icrafting = (ICrafting)this.crafters.get(i);
            if(this.lastCookTime != this.tileCoalGrinder.grindCookTime) {
                icrafting.sendProgressBarUpdate(this, 0, this.tileCoalGrinder.grindCookTime);
            }

            if(this.lastBurnTime != this.tileCoalGrinder.grindBurnTime) {
                icrafting.sendProgressBarUpdate(this, 1, this.tileCoalGrinder.grindBurnTime);
            }

            if(this.lastItemBurnTime != this.tileCoalGrinder.currentItemBurnTime) {
                icrafting.sendProgressBarUpdate(this, 2, this.tileCoalGrinder.currentItemBurnTime);
            }
        }

        this.lastCookTime = this.tileCoalGrinder.grindCookTime;
        this.lastBurnTime = this.tileCoalGrinder.grindBurnTime;
        this.lastItemBurnTime = this.tileCoalGrinder.currentItemBurnTime;
    }

    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int p_75137_1_, int p_75137_2_) {
        if(p_75137_1_ == 0) {
            this.tileCoalGrinder.grindCookTime = p_75137_2_;
        }

        if(p_75137_1_ == 1) {
            this.tileCoalGrinder.grindBurnTime = p_75137_2_;
        }

        if(p_75137_1_ == 2) {
            this.tileCoalGrinder.currentItemBurnTime = p_75137_2_;
        }

    }

    public boolean canInteractWith(EntityPlayer player) {
        return this.tileCoalGrinder.isUseableByPlayer(player);
    }

    public ItemStack transferStackInSlot(EntityPlayer player, int index) {

        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(index);
        if(slot != null && slot.getHasStack()) {

            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();
            if(index == 2) {
                if(!this.mergeItemStack(itemstack1, 3, 39, true)) {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            } else if(index != 1 && index != 0) {
                if(GrindRecipes.grinding().getSmeltingResult(itemstack1) != null) {
                    if(!this.mergeItemStack(itemstack1, 0, 1, false)) {
                        return null;
                    }
                } else if(TileEntityCoalGrinder.isItemFuel(itemstack1)) {
                    if(!this.mergeItemStack(itemstack1, 1, 2, false)) {
                        return null;
                    }
                } else if(index >= 3 && index < 30) {
                    if(!this.mergeItemStack(itemstack1, 30, 39, false)) {
                        return null;
                    }
                } else if(index >= 30 && index < 39 && !this.mergeItemStack(itemstack1, 3, 30, false)) {
                    return null;
                }
            } else if(!this.mergeItemStack(itemstack1, 3, 39, false)) {
                return null;
            }

            if(itemstack1.stackSize == 0) {
                slot.putStack((ItemStack)null);
            } else {
                slot.onSlotChanged();
            }

            if(itemstack1.stackSize == itemstack.stackSize) {
                return null;
            }

            slot.onPickupFromSlot(player, itemstack1);
        }

        return itemstack;
    }
}

 */

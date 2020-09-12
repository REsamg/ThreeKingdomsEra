package com.re_she.mod.inventory;

import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

import java.util.UUID;

public class InventoryKuroNeko extends InventoryBasic
{
    public static final String TITLE = "黑猫";
    public static final int SLOTS_PER_LINE = 9;
    public static final int LINES = 2;

    private ItemStack itemStack;

    private String id;

    public InventoryKuroNeko(ItemStack itemStack) {
        super(TITLE, true, LINES * SLOTS_PER_LINE);

        this.itemStack = itemStack;

        if (!itemStack.hasTagCompound()) {
            itemStack.setTagCompound(new NBTTagCompound());
            id = UUID.randomUUID().toString();
        }
        readFromNBT(itemStack.getTagCompound());
    }

    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        NBTTagList items = new NBTTagList();

        for (int i = 0; i < getSizeInventory(); i++) {
            ItemStack itemStack = getStackInSlot(i);
            if (itemStack != null) {
                NBTTagCompound item = new NBTTagCompound();
                item.setInteger("slot", i);
                itemStack.writeToNBT(item);
                items.appendTag(item);
            }
        }
        compound.setTag("items", items);

        compound.setString("id", id);

        return compound;
    }
    public void readFromNBT(NBTTagCompound compound) {
        if (id == null) {
            id = compound.getString("id");
        }
        if (id == null) {
            id = UUID.randomUUID().toString();
        }

        NBTTagList items = compound.getTagList("items", 10);

        for (int i = 0; i < items.tagCount(); i++) {
            NBTTagCompound item = items.getCompoundTagAt(i);

            int slot = item.getInteger("slot");
            if (slot >= 0 && slot < getSizeInventory()) {
                ItemStack itemStack = ItemStack.loadItemStackFromNBT(item);
                setInventorySlotContents(slot, itemStack);
            }
        }
    }
    @Override
    public void markDirty() {
        super.markDirty();
        writeToNBT(this.itemStack.stackTagCompound);
    }

}

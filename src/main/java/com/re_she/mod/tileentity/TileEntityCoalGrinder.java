/*
package com.re_she.mod.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityCoalGrinder extends TileEntity implements ISidedInventory {

    private static final int[] slotsTop = new int[]{0};
    private static final int[] slotsBottom = new int[]{2, 1};
    private static final int[] slotsSides = new int[]{1};
    private ItemStack[] grindItemStacks = new ItemStack[3];
    public int grindBurnTime;
    public int currentItemBurnTime;
    public int grindCookTime;
    private String furnaceCustomName; //furnaceCustomName
    private static final String __OBFID = "CL_00000357";

    public int getSizeInventory() {
        return this.grindItemStacks.length;
    }

    public ItemStack getStackInSlot(int slotIn) {
        return this.grindItemStacks[slotIn];
    }

    public ItemStack decrStackSize(int index, int count) {
        if(this.grindItemStacks[index] != null) {
            ItemStack itemstack;
            if(this.grindItemStacks[index].stackSize <= count) {
                itemstack = this.grindItemStacks[index];
                this.grindItemStacks[index] = null;
                return itemstack;
            } else {
                itemstack = this.grindItemStacks[index].splitStack(count);
                if(this.grindItemStacks[index].stackSize == 0) {
                    this.grindItemStacks[index] = null;
                }

                return itemstack;
            }
        } else {
            return null;
        }
    }

    public ItemStack getStackInSlotOnClosing(int index) {
        if(this.grindItemStacks[index] != null) {
            ItemStack itemstack = this.grindItemStacks[index];
            this.grindItemStacks[index] = null;
            return itemstack;
        } else {
            return null;
        }
    }

    public void setInventorySlotContents(int index, ItemStack stack) {
        this.grindItemStacks[index] = stack;
        if(stack != null && stack.stackSize > this.getInventoryStackLimit()) {
            stack.stackSize = this.getInventoryStackLimit();
        }

    }

    public String getInventoryName() {
        return this.isCustomInventoryName()?this.furnaceCustomName:"container.Coal Grinder";
    }

    public boolean isCustomInventoryName() {
        return this.furnaceCustomName != null && this.furnaceCustomName.length() > 0;
    }

    public void setCustomInventoryName(String p_145951_1_) {
        this.furnaceCustomName = p_145951_1_;
    }

    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        NBTTagList nbttaglist = compound.getTagList("Items", 10);
        this.grindItemStacks = new ItemStack[this.getSizeInventory()];

        for(int i = 0; i < nbttaglist.tagCount(); ++i) {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            byte b0 = nbttagcompound1.getByte("Slot");
            if(b0 >= 0 && b0 < this.grindItemStacks.length) {
                this.grindItemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }

        this.grindBurnTime = compound.getShort("BurnTime");
        this.grindCookTime = compound.getShort("CookTime");
        this.currentItemBurnTime = getItemBurnTime(this.grindItemStacks[1]);
        if(compound.hasKey("CustomName", 8)) {
            this.furnaceCustomName = compound.getString("CustomName");
        }

    }

    public void writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setShort("BurnTime", (short)this.grindBurnTime);
        compound.setShort("CookTime", (short)this.grindCookTime);
        NBTTagList nbttaglist = new NBTTagList();

        for(int i = 0; i < this.grindItemStacks.length; ++i) {
            if(this.grindItemStacks[i] != null) {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                this.grindItemStacks[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }

        compound.setTag("Items", nbttaglist);
        if(this.isCustomInventoryName()) {
            compound.setString("CustomName", this.furnaceCustomName);
        }

    }

    public int getInventoryStackLimit() {
        return 64;
    }

    @SideOnly(Side.CLIENT)
    public int getCookProgressScaled(int p_145953_1_) {
        return this.grindCookTime * p_145953_1_ / 250;
    }

    @SideOnly(Side.CLIENT)
    public int getBurnTimeRemainingScaled(int p_145955_1_) {
        if(this.currentItemBurnTime == 0) {
            this.currentItemBurnTime = 250;
        }

        return this.grindBurnTime * p_145955_1_ / this.currentItemBurnTime;
    }

    public boolean isBurning() {
        return this.grindBurnTime > 0;
    }

    public void updateEntity() {
        boolean flag = this.grindBurnTime > 0;
        boolean flag1 = false;
        if(this.grindBurnTime > 0) {
            --this.grindBurnTime;
        }

        if(!this.field_145850_b.field_72995_K && (this.grindBurnTime != 0 || this.grindItemStacks[1] != null && this.grindItemStacks[0] != null)) {
            if(this.grindBurnTime == 0 && this.canGrind()) {
                this.currentItemBurnTime = this.grindBurnTime = getItemBurnTime(this.grindItemStacks[1]);
                if(this.grindBurnTime > 0) {
                    flag1 = true;
                    if(this.grindItemStacks[1] != null) {
                        --this.grindItemStacks[1].stackSize;
                        if(this.grindItemStacks[1].stackSize == 0) {
                            this.grindItemStacks[1] = this.grindItemStacks[1].func_77973_b().getContainerItem(this.grindItemStacks[1]);
                        }
                    }
                }
            }

            if(this.isBurning() && this.canGrind()) {
                ++this.grindCookTime;
                if(this.grindCookTime == 250) {
                    this.grindCookTime = 0;
                    this.grindItem();
                    flag1 = true;
                }
            } else {
                this.grindCookTime = 0;
            }

            if(flag != this.grindBurnTime > 0) {
                flag1 = true;
                CoalGrinder.updateGrindBlockState(this.grindBurnTime > 0, this.field_145850_b, this.field_145851_c, this.field_145848_d, this.field_145849_e);
            }
        }

        if(flag1) {
            this.func_70296_d();
        }

    }

    private boolean canGrind() {
        if(this.grindItemStacks[0] == null) {
            return false;
        } else {
            ItemStack itemstack = GrindRecipes.grinding().getSmeltingResult(this.grindItemStacks[0]);
            if(itemstack == null) {
                return false;
            } else if(this.grindItemStacks[2] == null) {
                return true;
            } else if(!this.grindItemStacks[2].func_77969_a(itemstack)) {
                return false;
            } else {
                int result = this.grindItemStacks[2].stackSize + itemstack.stackSize;
                return result <= this.func_70297_j_() && result <= this.grindItemStacks[2].func_77976_d();
            }
        }
    }

    public void grindItem() {
        if(this.canGrind()) {
            ItemStack itemstack = GrindRecipes.grinding().getSmeltingResult(this.grindItemStacks[0]);
            if(this.grindItemStacks[2] == null) {
                this.grindItemStacks[2] = itemstack.func_77946_l();
            } else if(this.grindItemStacks[2].func_77973_b() == itemstack.func_77973_b()) {
                this.grindItemStacks[2].stackSize += itemstack.stackSize;
            }

            --this.grindItemStacks[0].stackSize;
            if(this.grindItemStacks[0].stackSize <= 0) {
                this.grindItemStacks[0] = null;
            }
        }

    }

    public static int getItemBurnTime(ItemStack p_145952_0_) {
        if(p_145952_0_ == null) {
            return 0;
        } else {
            Item item = p_145952_0_.func_77973_b();
            if(item instanceof ItemBlock && Block.func_149634_a(item) != Blocks.field_150350_a) {
                Block block = Block.func_149634_a(item);
                if(block == Blocks.field_150376_bx) {
                    return 150;
                }

                if(block.func_149688_o() == Material.field_151575_d) {
                    return 300;
                }

                if(block == Blocks.field_150402_ci) {
                    return 16000;
                }
            }

            return item instanceof ItemTool && ((ItemTool)item).func_77861_e().equals("WOOD")?150:(item instanceof ItemSword && ((ItemSword)item).func_150932_j().equals("WOOD")?150:(item instanceof ItemHoe && ((ItemHoe)item).func_77842_f().equals("WOOD")?150:(item == Items.field_151055_y?50:(item == Items.field_151044_h?1550:(item == Items.field_151129_at?15000:(item == Item.func_150898_a(Blocks.field_150345_g)?50:(item == Items.field_151072_bj?2200:GameRegistry.getFuelValue(p_145952_0_))))))));
        }
    }

    public static boolean isItemFuel(ItemStack p_145954_0_) {
        return getItemBurnTime(p_145954_0_) > 0;
    }

    public boolean isUseableByPlayer(EntityPlayer player) {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this?false:player.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
    }

    public void openChest() {
    }

    public void closeChest() {
    }

    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return p_94041_1_ == 2?false:(p_94041_1_ == 1?isItemFuel(p_94041_2_):true);
    }

    public int[] getSlotsForFace(int p_94128_1_) {
        return p_94128_1_ == 0?slotsBottom:(p_94128_1_ == 1?slotsTop:slotsSides);
    }

    public boolean canInsertItem(int p_102007_1_, ItemStack p_102007_2_, int p_102007_3_) {
        return this.isItemValidForSlot(p_102007_1_, p_102007_2_);
    }

    public boolean canExtractItem(int p_102008_1_, ItemStack p_102008_2_, int p_102008_3_) {
        return p_102008_3_ != 0 || p_102008_1_ != 1 || p_102008_2_.func_77973_b() == Items.field_151133_ar;
    }
}


 */
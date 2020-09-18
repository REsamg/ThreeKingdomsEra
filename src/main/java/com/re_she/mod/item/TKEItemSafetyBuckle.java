package com.re_she.mod.item;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.creativetab.CreativeTabsLoader;
import com.re_she.mod.entity.EntitySafetyBuckle;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class TKEItemSafetyBuckle extends Item
{
    public TKEItemSafetyBuckle()
    {
        super();
        this.setUnlocalizedName(Fmltutor.MODID + "." + "safety_buckle");
        this.setTextureName(Fmltutor.MODID + ":" + "safety_buckle");
        this.setCreativeTab(CreativeTabsLoader.re_tabFMLTutor);
    }


    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer player)
    {
        MovingObjectPosition m = this.getMovingObjectPositionFromPlayer(worldIn, player, true);
        if (m != null && m.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK)
        {
            int i = m.blockX;
            int j = m.blockY;
            int k = m.blockZ;

            if (worldIn.getBlock(i, j, k).getMaterial() == Material.water)
            {
                --itemStackIn.stackSize;
                if (itemStackIn.stackSize <= 0)
                {
                    return new ItemStack(ItemLoader.safety_buckle);
                }
                if (!player.inventory.addItemStackToInventory(new ItemStack(ItemLoader.safety_buckle)))
                {
                    player.dropPlayerItemWithRandomChoice(new ItemStack(ItemLoader.safety_buckle, 1, 0), false);
                }

            }
            else
                {
                    if (!player.capabilities.isCreativeMode)
                    {
                        --itemStackIn.stackSize;
                    }
                    worldIn.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
                    if (!worldIn.isRemote)
                    {
                        worldIn.spawnEntityInWorld(new EntitySafetyBuckle(worldIn, player));
                    }
                    return itemStackIn;
                }
        }
        else
            {
                if (!player.capabilities.isCreativeMode)
                {
                    --itemStackIn.stackSize;
                }
                worldIn.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
                if(!worldIn.isRemote)
                {
                    worldIn.spawnEntityInWorld(new EntitySafetyBuckle(worldIn, player));
                }

                return itemStackIn;
            }


        return itemStackIn;


    }







    /*



    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer player)
    {

        if (!player.capabilities.isCreativeMode)
        {
            --itemStackIn.stackSize;
        }

        //worldIn.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!worldIn.isRemote)
        {
            worldIn.spawnEntityInWorld(new EntitySnowball(worldIn, player));
            player.addChatComponentMessage((IChatComponent) new ChatComponentText("扔你的东西成功，穿越三国！！！"));
        }




        if (!player.capabilities.isCreativeMode)
        {
            --itemStackIn.stackSize;
        }
        if (!worldIn.isRemote)
        {
            player.addChatComponentMessage((IChatComponent) new ChatComponentText("就找到了？！"));
        }
        worldIn.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));



        //return itemStackIn;
    }

    */

     /*
        if (!playerIn.capabilities.isCreativeMode)
                {
                    --itemStackIn.stackSize;
                }

        if (!worldIn.isRemote)
        {
            if (playerIn.isSneaking())
            {
                int id = GuiElementLoader.GUI_DEMO;
                playerIn.openGui(Fmltutor.instance, id, worldIn, (int) playerIn.posX, (int) playerIn.posY, (int) playerIn.posZ);
                playerIn.addChatComponentMessage((IChatComponent) new ChatComponentText("Open Gui"));}
            }
            return itemStackIn;
        }*/
}

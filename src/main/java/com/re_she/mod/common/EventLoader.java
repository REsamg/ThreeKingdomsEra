package com.re_she.mod.common;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.client.KeyLoader;
import com.re_she.mod.entity.EntitySafetyBuckle;
import com.re_she.mod.inventory.GuiElementLoader;
import com.re_she.mod.item.ItemLoader;
import com.re_she.mod.world.WorldTeleporterPollute;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPackedIce;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import java.util.List;


public class EventLoader
{
    public EventLoader()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }


    @SubscribeEvent
    public void ofsmgh(PlayerInteractEvent event)
    {







        /*
        if (!event.world.isRemote)
        {
            if(KeyLoader.Openthemenu.isPressed())
            {
                System.out.println("按C！");
*/
                /*
                IInventory iinventory = this.getInventory(worldIn, x, y, z);

                if (iinventory != null)
                {


                }
                */
                /*
                event.entityPlayer.displayGUIChest(10,10,10);

               // if (event.entityPlayer.isSneaking()) {
                    int id = GuiElementLoader.GUI_DEMO;
                    event.entityPlayer.openGui(Fmltutor.instance, id, event.world,
                            (int) event.entityPlayer.posX,
                            (int) event.entityPlayer.posY,
                            (int) event.entityPlayer.posZ);
                    event.entityPlayer.addChatComponentMessage((IChatComponent) new ChatComponentText("Open Gui"));
               // }
                 */
       //     }

      //  }
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










    @SubscribeEvent
    public void onLivingUpdate(LivingEvent.LivingUpdateEvent e)
    {
        /*
        if(e.entity instanceof EntityPlayer)
        {
            EntityPlayer pl = (EntityPlayer) e.entity;
            //worldIn.spawnEntityInWorld(new EntityLightningBolt(worldIn, player.posX, player.posY, player.posZ));
            //new EntityLightningBolt(pl.worldObj, pl.posX, pl.posY, pl.posZ);
            //实体雷电
            pl.worldObj.spawnEntityInWorld(new EntityLightningBolt(pl.worldObj, pl.posX, pl.posY, pl.posZ));
        }
        */
    }





    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent event)
    {
        /*
        EntityPlayer entity = event.entityPlayer;
        World world = entity.worldObj;
        if (!event.world.isRemote) {
            if(entity instanceof EntityPlayerMP){
                ServerConfigurationManager scm = MinecraftServer.getServer().getConfigurationManager();
                WorldTeleporterPollute teleporter = new WorldTeleporterPollute(MinecraftServer.getServer().worldServerForDimension(21));
                scm.transferPlayerToDimension((EntityPlayerMP) entity, 21, teleporter);
            }else {
                ServerConfigurationManager scm = MinecraftServer.getServer().getConfigurationManager();
                WorldTeleporterPollute teleporter = new WorldTeleporterPollute(MinecraftServer.getServer().worldServerForDimension(21));
                scm.transferEntityToWorld(entity, 21,(WorldServer) world,MinecraftServer.getServer().worldServerForDimension(21),teleporter);
            }
            String info = String.format("%s interacts with: %s", event.entityPlayer.getDisplayName(), (event.entityPlayer));
        }*/
    }



    public static void transferEntityToWorld(WorldServer currentWorld, Entity entity, int newDimensions, Teleporter teleporter)
    {

    }
}


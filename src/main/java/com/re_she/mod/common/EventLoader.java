package com.re_she.mod.common;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.inventory.GuiElementLoader;
import com.re_she.mod.world.WorldTeleporterPollute;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Name;

public class EventLoader
{
    public EventLoader() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onLivingUpdate(LivingEvent.LivingUpdateEvent e)
    {
        /*
        if(e.entity instanceof EntityPlayer)
        {
            EntityPlayer pl = (EntityPlayer) e.entity;

            //worldIn.spawnEntityInWorld(new EntityLightningBolt(worldIn, player.posX, player.posY, player.posZ));

            //new EntityLightningBolt(pl.worldObj, pl.posX, pl.posY, pl.posZ);


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


package com.re_she.mod.world;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.multiplayer.ChunkProviderClient;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderFlat;

public class WorldProviderPollute extends WorldProvider
{
    public void registerWorldChunkManager()
    {
        this.worldChunkMgr = new WorldChunkManager(worldObj);
        this.dimensionId = 21;
    }
    public void setWorldTime(long time)
    {
        worldObj.getWorldInfo().setWorldTime(time/1);
    }
    @Override
    public long getWorldTime() {
        return worldObj.getWorldInfo().getWorldTime()*1;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Vec3 getSkyColor(Entity cameraEntity, float partialTicks)
    {
        return Vec3.createVectorHelper(0.20000000298023224D, 0.029999999329447746D, 0.029999999329447746D);
    }

    /*
    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderPollute(this.worldObj, this.worldObj.getSeed());
    }
    */

    public boolean isSurfaceWorld()
    {
        return true;
    }
    public String getDimensionName()
    {
        return "pulluteWorld-"+dimensionId;
    }

}

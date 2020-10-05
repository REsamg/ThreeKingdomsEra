package com.re_she.tke.world;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderPollute extends WorldProvider {
    /**
     * 注册世界和维度id和设置管理者
     *
     */
    public void registerWorldChunkManager()
    {
        this.worldChunkMgr = new WorldChunkManager(worldObj);
        this.dimensionId = 21;
    }
    /**
     * 设置世界时间的函数，你设置world时间会调用这个函数,我设置是平常时间两倍速度
     */
    public void setWorldTime(long time)
    {
        worldObj.getWorldInfo().setWorldTime(time/2);
    }
    /**
     * 返回世界时间，同理
     */
    @Override
    public long getWorldTime() {
        return worldObj.getWorldInfo().getWorldTime()*2;
    }
    /**
     * 返回天空颜色，三个值是rgb值我也不知道为啥要用Vec3表示...，mc源码就是这样
     */
    @Override
    @SideOnly(Side.CLIENT)
    public Vec3 getSkyColor(Entity cameraEntity, float partialTicks) {
        return Vec3.createVectorHelper(0.20000000298023224D, 0.029999999329447746D, 0.029999999329447746D);
    }
    /**
     * 返回chunk供应者后面会写到
     */
    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderPollute(this.worldObj, this.worldObj.getSeed());
    }
    /**
     * 是否是平常世界
     */
    public boolean isSurfaceWorld()
    {
        return true;
    }
    /**
     * 世界存档文件夹名称
     */
    public String getDimensionName()
    {
        return "pulluteWorld-"+dimensionId;
    }
}
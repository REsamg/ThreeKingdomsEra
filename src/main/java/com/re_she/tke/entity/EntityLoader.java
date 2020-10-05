package com.re_she.tke.entity;

import com.re_she.tke.Fmltutor;
import com.re_she.tke.item.ItemLoader;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;

public class EntityLoader
{
    private static int nextID = 0;

    // 注册实体
    public EntityLoader()
    {
        registerEntity(EntitySafetyBuckle.class, "safety_buckle", 64, 10, true);
    }

    // 方法:注册实体
    private static void registerEntity(Class<? extends Entity> entityClass, String name, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates)
    {
        EntityRegistry.registerModEntity(entityClass, name, nextID++, Fmltutor.instance, trackingRange, updateFrequency,
                sendsVelocityUpdates);
    }

    // 注册渲染
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntitySafetyBuckle.class, new RenderSnowball(ItemLoader.safety_buckle));
    }
}
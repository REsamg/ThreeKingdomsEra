package com.re_she.tke.entity;

//import com.qinglongmp.chemistry.item.ItemContainer;
import net.minecraft.client.audio.SoundCategory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySafetyBuckle extends EntityThrowable
{
    public double damage = 4;

    public EntitySafetyBuckle(World worldIn)
    {
        super(worldIn);
    }

    public EntitySafetyBuckle(World worldIn, EntityLivingBase throwerIn)
    {
        super(worldIn, throwerIn);
    }

    public EntitySafetyBuckle(World worldIn, double x, double y, double z, int damage)
    {
        super(worldIn, x, y, z);
        this.damage = damage;

    }

    protected float getGravityVelocity()
    {
        return 0.04F;
    }//重力

    protected float func_70182_d()
    {
        return 1.0F;
    }//速度

    protected float func_70183_g()
    {
        return 1.0F;
    }//角度，负值向上

    protected void onImpact(MovingObjectPosition m)
    {
        if (m.entityHit != null)
        {
            m.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)damage);
        }
        /*if(this.worldObj.rand.nextInt(3)==1)
        {
            EntityLivingBase e;
            if(this.getThrower()!=null)
                e=this.getThrower();
            else
                e=null;
            this.worldObj.createExplosion(e, m.blockX, m.blockY, m.blockZ, (float) damage, false);

        }*/

        for (int i = 0; i < 15; ++i)
        {
            this.worldObj.spawnParticle("", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }//flame箭


        if (!this.worldObj.isRemote)
        {
            this.playSound("dig.glass", 1.0F, ((this.rand.nextFloat() - this.rand.nextFloat()) * 1.0F + 1.0F) * 1.0F);
            this.setDead();
        }

        //雷电
        float var4 = 1.0F;
        int i = (int)(this.prevPosX + (this.posX - this.prevPosX) * var4);
        int j = (int)(this.prevPosY + (this.posY - this.prevPosY) * var4 + 1.62D - this.yOffset) - 1;
        int k = (int)(this.prevPosZ + (this.posZ - this.prevPosZ) * var4);

        //System.out.println( "X:" + i + " Y:" + j + " Z:" + k );
        this.worldObj.spawnEntityInWorld((Entity)new EntityLightningBolt(this.worldObj, i, j, k));
    }

    public void setDamage(double d)
    {
        this.damage=d;
    } // 砸中物体后效果
}
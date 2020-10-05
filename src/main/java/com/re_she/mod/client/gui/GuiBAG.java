package com.re_she.mod.client.gui;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.inventory.ContainerBAG;
import com.re_she.mod.inventory.ContainerRedPacket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class GuiBAG extends GuiContainer {

    private static final String TEXTURE_PATH = Fmltutor.MODID + ":" + "textures/gui/container/gui_bag.png";
    private static final ResourceLocation TEXTURE = new ResourceLocation(TEXTURE_PATH);



    public GuiBAG(EntityPlayer player) {
        super(new ContainerBAG(player));
        this.xSize = 176;
        this.ySize = 133;
    }



    @Override
    protected void drawGuiContainerForegroundLayer(int par1, int par2) {
        //GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        //this.fontRendererObj.drawString(this.field_147083_w.isCustomInventoryName() ? this.field_147083_w.getInventoryName() : I18n.format(this.field_147083_w.getInventoryName(), new Object[0]), 8, 6, 4210752);
        //this.fontRendererObj.drawString(this.field_147084_v.isCustomInventoryName() ? this.field_147084_v.getInventoryName() : I18n.format(this.field_147084_v.getInventoryName(), new Object[0]), 8, this.ySize - 96 + 2, 4210752);

    }


    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(TEXTURE);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
    }
}

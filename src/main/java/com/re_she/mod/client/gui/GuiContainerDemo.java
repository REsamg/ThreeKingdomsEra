package com.re_she.mod.client.gui;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.inventory.ContainerDemo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class GuiContainerDemo extends GuiContainer
{
    public GuiContainerDemo(ContainerDemo inventorySlotsIn)
    {
        super(inventorySlotsIn);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {

        //private static final String TEXTURE_PATH = Fmltutor.MODID + ":" + "textures/gui/container/gui_demo.png";
        //private static final ResourceLocation TEXTURE = new ResourceLocation(TEXTURE_PATH);
        //GlStateManager.color(1.0F, 1.0F, 1.0F);

        //this.mc.getTextureManager().bindTexture(TEXTURE);
        //int offsetX = (this.width - this.xSize) / 2, offsetY = (this.height - this.ySize) / 2;

        //this.drawTexturedModalRect(offsetX, offsetY, 0, 0, this.xSize, this.ySize);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {


    }
}

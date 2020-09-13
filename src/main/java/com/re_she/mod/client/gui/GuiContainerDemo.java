package com.re_she.mod.client.gui;

import com.re_she.mod.Fmltutor;
import com.re_she.mod.inventory.ContainerDemo;
import com.re_she.mod.item.ItemLoader;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.init.Items;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.io.IOException;

@SideOnly(Side.CLIENT)
public class GuiContainerDemo extends GuiContainer
{
    private static final String TEXTURE_PATH = Fmltutor.MODID + ":" + "textures/gui/container/gui_demo.png";


    private static final ResourceLocation TEXTURE = new ResourceLocation(TEXTURE_PATH);

    private static final int BUTTON_UP = 0;
    private static final int BUTTON_DOWN = 1;

    private Slot ironSlot;

    public GuiContainerDemo(ContainerDemo inventorySlotsIn)
    {
        super(inventorySlotsIn);
        this.xSize = 176;
        this.ySize = 133;

        //this.ironSlot = inventorySlotsIn.getIronSlot();
    }

    @Override
    public void initGui()
    {
        super.initGui();
        int offsetX = (this.width - this.xSize) / 2, offsetY = (this.height - this.ySize) / 2;
        this.buttonList.add(new GuiButton(BUTTON_UP, offsetX + 153, offsetY + 17, 15, 10, "")
        {
            @Override
            public void drawButton(Minecraft mc, int mouseX, int mouseY)
            {
                if (this.visible)
                {
                    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

                    //GlStateManager.color(1.0F, 1.0F, 1.0F);

                    mc.getTextureManager().bindTexture(TEXTURE);
                    int x = mouseX - this.xPosition, y = mouseY - this.yPosition;

                    if (x >= 0 && y >= 0 && x < this.width && y < this.height)
                    {
                        this.drawTexturedModalRect(this.xPosition, this.yPosition, 1, 146, this.width, this.height);
                    }
                    else
                    {
                        this.drawTexturedModalRect(this.xPosition, this.yPosition, 1, 134, this.width, this.height);
                    }
                }
            }
        });
        this.buttonList.add(new GuiButton(BUTTON_DOWN, offsetX + 153, offsetY + 29, 15, 10, "")
        {
            @Override
            public void drawButton(Minecraft mc, int mouseX, int mouseY)
            {
                if (this.visible)
                {
                    //GlStateManager.color(1.0F, 1.0F, 1.0F);
                    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);


                    mc.getTextureManager().bindTexture(TEXTURE);
                    int x = mouseX - this.xPosition, y = mouseY - this.yPosition;

                    if (x >= 0 && y >= 0 && x < this.width && y < this.height)
                    {
                        this.drawTexturedModalRect(this.xPosition, this.yPosition, 20, 146, this.width, this.height);
                    }
                    else
                    {
                        this.drawTexturedModalRect(this.xPosition, this.yPosition, 20, 134, this.width, this.height);
                    }
                }
            }
        });
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        ItemStack stack = this.ironSlot.getStack();
        int amount = stack == null ? 0 : stack.stackSize;

        switch (button.id)
        {
            case BUTTON_DOWN:
                amount = (amount + 64) % 65;
                break;
            case BUTTON_UP:
                amount = (amount + 1) % 65;
                break;
            default:
                super.actionPerformed(button);
                return;
        }

        this.ironSlot.putStack(amount == 0 ? null : new ItemStack(Items.iron_ingot, amount));
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY)
    {
        //GlStateManager.color(1.0F, 1.0F, 1.0F);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);


        this.mc.getTextureManager().bindTexture(TEXTURE);
        int offsetX = (this.width - this.xSize) / 2, offsetY = (this.height - this.ySize) / 2;

        this.drawTexturedModalRect(offsetX, offsetY, 0, 0, this.xSize, this.ySize);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY)
    {
        this.drawVerticalLine(30, 19, 36, 0xFF000000);
        this.drawHorizontalLine(8, 167, 43, 0xFF000000);

        String title = I18n.format("container.fmltutor.demo");
        this.fontRendererObj.drawString(title, (this.xSize - this.fontRendererObj.getStringWidth(title)) / 2, 6, 0x404040);

        ItemStack item = new ItemStack(ItemLoader.safety_buckle);

        //this.itemRender.renderItemAndEffectIntoGUI(item, 8, 20);


        // this.itemRender.renderItemAndEffectIntoGUI(0,0 ,item, 8, 20);

        //this.itemRender.renderItemAndEffectIntoGUI(item, 8, 20,5,5);
    }
}
package com.miraculum.smite.gui;

import org.lwjgl.opengl.GL11;

import com.miraculum.smite.extprops.SmitePlayer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiHealthManaBars extends Gui
{
	private Minecraft mc;
	private static final ResourceLocation texture = new ResourceLocation("smitemod:textures/gui/healthManaBar");
	
	public GuiHealthManaBars(Minecraft mc)
	{
		this.mc = mc;
	}
	
	@SubscribeEvent
	public void onRenderExperienceBar(RenderGameOverlayEvent event)
	{
		if (event.isCancelable() || event.type != ElementType.EXPERIENCE)
		{
			return;
		}
		
		SmitePlayer props = SmitePlayer.get(this.mc.thePlayer);
		
		if (props == null)
		{
			return;
		}
		
		int xPos = 2;
		int yPos = 2;
		
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glDisable(GL11.GL_LIGHTING);
		this.mc.renderEngine.bindTexture(texture);
		this.drawTexturedModalRect(xPos, yPos, 0, 0, 51, 4);
		
		int width = (int)(((float)props.getMana() / props.getMaxMana()) * 49);
		this.drawTexturedModalRect(xPos, yPos, 0, 10, width, 10);
	}
}
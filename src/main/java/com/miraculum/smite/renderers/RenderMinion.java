package com.miraculum.smite.renderers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderMinion extends RenderLiving
{
	public final ResourceLocation minionTexture = new ResourceLocation("smitemod:textures/entity/minion/normal.png");
	
	public RenderMinion(ModelBase model, float shadowSize)
	{
		super(Minecraft.getMinecraft().getRenderManager(), model, shadowSize);
	}
	
	public ResourceLocation getEntityTexture(Entity entity)
	{
		return minionTexture;
	}
}
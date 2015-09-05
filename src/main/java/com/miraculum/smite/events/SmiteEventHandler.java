package com.miraculum.smite.events;

import com.miraculum.smite.extprops.SmitePlayer;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class SmiteEventHandler
{
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event)
	{
		if (event.entity instanceof EntityPlayer && SmitePlayer.get((EntityPlayer)event.entity) == null)
		{
			SmitePlayer.register((EntityPlayer)event.entity);
		}
	}
	
	@SubscribeEvent
	public void onRenderOverlay(RenderGameOverlayEvent event)
	{
		
	}
}
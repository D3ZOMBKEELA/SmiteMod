package com.miraculum.smite.entities;

import com.miraculum.smite.SmiteMod;
import com.miraculum.smite.models.ModelMinion;
import com.miraculum.smite.renderers.RenderMinion;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class SmiteEntities
{
	/*
	 * How to add an entity:
	 * 
	 */
	
	private static int entityId = 100;
	
	public static void init()
	{
		registerRenderer(EntityMinion.class, new RenderMinion(new ModelMinion(), 0.3F), "Minion", 0x999999, 0xFFFFFF);
	}
	
	private static void registerRenderer(Class<? extends Entity> entityClass, RenderLiving render, String name, int eggColor, int spotsColor)
	{
		EntityRegistry.registerModEntity(entityClass, name, entityId++, SmiteMod.instance, 80, 3, true);
		RenderingRegistry.registerEntityRenderingHandler(entityClass, render);
		EntityRegistry.registerEgg(entityClass, eggColor, spotsColor);
	}
}
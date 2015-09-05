package com.miraculum.smite;

import com.miraculum.smite.blocks.SmiteBlocks;
import com.miraculum.smite.entities.SmiteEntities;
import com.miraculum.smite.events.SmiteEventHandler;
import com.miraculum.smite.items.SmiteItems;
import com.miraculum.smite.proxy.IProxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "smitemod", name = "Smite Mod", version = "0.0e")
public class SmiteMod
{
	@Instance("smitemod")
	public static SmiteMod instance;
	
	@SidedProxy(clientSide = "com.miraculum.smite.proxy.ClientProxy", serverSide = "com.miraculum.smite.proxy.ServerProxy")
	public static IProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		SmiteBlocks.preInit();
		SmiteItems.preInit();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenderers();
		MinecraftForge.EVENT_BUS.register(new SmiteEventHandler());
		SmiteBlocks.init();
		SmiteItems.init();
		SmiteEntities.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
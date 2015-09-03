package com.miraculum.smite;

import com.miraculum.smite.blocks.SmiteBlocks;
import com.miraculum.smite.items.SmiteItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "smitemod", name = "Smite Mod", version = "0.0c")
public class SmiteMod
{
	@Instance("smitemod")
	public static SmiteMod instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		SmiteBlocks.preInit();
		SmiteItems.preInit();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		SmiteBlocks.init();
		SmiteItems.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
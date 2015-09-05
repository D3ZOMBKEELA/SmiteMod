package com.miraculum.smite.items;


import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmiteItems
{
	/*
	 * How to make an item:
	 * 	public static Item testItem;
	 * 
	 * In preInit() type:
	 *  initAndRegister(testItem = new TestItem(), "testItem");
	 *  
	 * In init() type:
	 * 	registerModel(testItem, "testItem");
	 */
	public static Item healthPot;
	
	public static void preInit()
	{
		initAndRegister(healthPot = new ItemHealthPot(), "healthPot");
	}
	
	public static void init()
	{
		registerModel(healthPot, "healthPot");
	}
	
	private static void initAndRegister(Item item, String name)
	{
		item.setUnlocalizedName(name);
		GameRegistry.registerItem(item, name);
	}
	
	private static void registerModel(Item item, String name)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("smitemod:" + name, "inventory"));
	}
}
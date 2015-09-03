package com.miraculum.smite.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmiteBlocks
{
	/*
	 * How to make a block:
	 * 	public static Block testBlock;
	 * 
	 * In preInit() type:
	 * 	initAndRegister(testBlock = new TestBlock(), "testBlock");
	 * 
	 * In init() type:
	 * 	registerModel(testBlock, "testBlock");
	 */
	
	public static void preInit()
	{
		
	}
	
	public static void init()
	{
		
	}
	
	private static void initAndRegister(Block block, String name)
	{
		block.setUnlocalizedName(name);
		GameRegistry.registerBlock(block, name);
	}
	
	private static void registerModel(Block block, String name)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation("smitemod:" + name, "inventory"));
	}
}
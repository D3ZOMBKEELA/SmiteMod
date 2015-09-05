package com.miraculum.smite.proxy;

import com.miraculum.smite.gui.GuiHealthManaBars;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy
{
	public void registerRenderers()
	{
		MinecraftForge.EVENT_BUS.register(new GuiHealthManaBars(Minecraft.getMinecraft()));
	}
}
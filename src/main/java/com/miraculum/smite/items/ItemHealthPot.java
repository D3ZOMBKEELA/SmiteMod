package com.miraculum.smite.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemHealthPot extends ItemFood
{

	public ItemHealthPot()
	{
		super(0, 0.0F, false);


		this.setAlwaysEdible();
		this.maxStackSize=5;
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setPotionEffect(Potion.regeneration.id, 25 , 0, 1.0f);
		
		
	}

	public int getMaxItemUseDuration(ItemStack stack)
	{
		return 1;
	}

}

package com.miraculum.smite.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

public class ItemElixirPower extends ItemFood{

	public ItemElixirPower(){
		super(0, 0.0F, false);

		this.setAlwaysEdible();
		this.maxStackSize=5;
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setPotionEffect(Potion.damageBoost.id, 300 , 1, 1.0f);
		
	}
	
	public int getMaxItemUseDuration(ItemStack stack)
	{
		return 7;
	}
	
}

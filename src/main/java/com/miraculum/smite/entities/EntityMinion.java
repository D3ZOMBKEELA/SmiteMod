package com.miraculum.smite.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityMinion extends EntityLivingBase
{
	public EntityMinion(World world)
	{
		super(world);
	}
	
	public ItemStack getHeldItem()
	{
		return new ItemStack(Items.bow);
	}
	
	public ItemStack getEquipmentInSlot(int slotIn)
	{
		return null;
	}
	
	public ItemStack getCurrentArmor(int slotIn)
	{
		return null;
	}
	
	public void setCurrentItemOrArmor(int slotIn, ItemStack stack)
	{
		
	}
	
	public ItemStack[] getInventory()
	{
		return null;
	}
}
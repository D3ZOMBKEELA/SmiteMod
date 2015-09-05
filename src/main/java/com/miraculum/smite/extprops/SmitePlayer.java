package com.miraculum.smite.extprops;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class SmitePlayer
	implements IExtendedEntityProperties
{
	public static final String PROPS_NAME = "SmitePlayer";
	
	private final EntityPlayer player;
	
	private int mana;
	private int maxMana;
	private float mp5;
	
	private int health;
	private int maxHealth;
	private float hp5;
	
	public SmitePlayer(EntityPlayer player)
	{
		this.player = player;
		this.mana = maxMana = 100;
		this.mp5 = 1.0F;
		this.health = maxHealth = 400;
		this.hp5 = 4.0F;
	}
	
	public static final void register(EntityPlayer player)
	{
		player.registerExtendedProperties(PROPS_NAME, new SmitePlayer(player));
	}
	
	public static final SmitePlayer get(EntityPlayer player)
	{
		return (SmitePlayer)player.getExtendedProperties(PROPS_NAME);
	}
	
	public void saveNBTData(NBTTagCompound compound)
	{
		NBTTagCompound props = new NBTTagCompound();
		
		props.setInteger("Mana", this.mana);
		props.setInteger("MaxMana", this.maxMana);
		props.setFloat("MP5", this.mp5);
		
		props.setInteger("Health", this.health);
		props.setInteger("MaxHealth", this.maxHealth);
		props.setFloat("HP5", this.hp5);
		
		compound.setTag(PROPS_NAME, props);
	}
	
	public void loadNBTData(NBTTagCompound compound)
	{
		NBTTagCompound props = (NBTTagCompound)compound.getTag(PROPS_NAME);
		
		this.mana = props.getInteger("Mana");
		this.maxMana = props.getInteger("MaxMana");
		this.mp5 = props.getFloat("MP5");
		
		this.health = props.getInteger("Health");
		this.maxHealth = props.getInteger("MaxHealth");
		this.hp5 = props.getFloat("HP5");
	}
	
	public void init(Entity entity, World world)
	{
	}
	
	public int getHealth()
	{
		return this.health;
	}
	
	public int getMaxHealth()
	{
		return this.maxHealth;
	}
	
	public float getHP5()
	{
		return this.hp5;
	}
	
	public int getMana()
	{
		return this.mana;
	}
	
	public int getMaxMana()
	{
		return this.maxMana;
	}
	
	public float getMP5()
	{
		return this.mp5;
	}
	
	public boolean consumeMana(int amount)
	{
		boolean sufficient = amount <= this.mana;
		this.mana -= (amount < this.mana ? amount : this.mana);
		return sufficient;
	}
	
	public void replenishMana()
	{
		this.mana = this.maxMana;
	}
}
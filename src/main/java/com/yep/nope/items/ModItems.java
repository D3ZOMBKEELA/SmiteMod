package com.yep.nope.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
		
	public static Item tutorialItem;
	
	public static void createItems(){
		GameRegistry.registerItem(tutorialItem = new BasicItem("ItemThing"), "ItemThing");
		
	}
}

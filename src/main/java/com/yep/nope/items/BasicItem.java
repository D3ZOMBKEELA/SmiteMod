package com.yep.nope.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BasicItem extends Item {

		public BasicItem(String ItemThing) {
			super();
			
			this.setUnlocalizedName(ItemThing);
			this.setCreativeTab(CreativeTabs.tabMaterials);
			
		}
}

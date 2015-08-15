package io.github.derpsquad.portalmod.tabs;

import io.github.derpsquad.portalmod.item.PortalModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemTab extends CreativeTabs {

	public ItemTab(int index, String label) {
		super(index, label);
		// TODO Auto-generated constructor stub
	}

	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		return PortalModItems.teleportationCore;
	}
}

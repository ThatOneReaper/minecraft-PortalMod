package io.github.derpsquad.portalmod.item;

import io.github.derpsquad.portalmod.PortalMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItem extends Item {
	private String name;
	
	protected ModItem(String name) {
		super();
		this.name = name;
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(PortalMod.MODID + "_" + name);
		setCreativeTab(PortalMod.itemTab); // TODO new creative tab
	}
	
	public String getName() {
		return name;
	}
}
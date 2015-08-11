package io.github.derpsquad.portalmod.item;

import io.github.derpsquad.portalmod.PortalMod;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItem extends Item {
	
	protected ModItem(String name) {
		super();
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(PortalMod.MODID + "_" + name);
		setCreativeTab(CreativeTabs.tabRedstone); // TODO new creative tab
	}
}
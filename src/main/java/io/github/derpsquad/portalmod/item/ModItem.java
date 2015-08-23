package io.github.derpsquad.portalmod.item;

import net.minecraft.item.Item;


public class ModItem extends Item implements INamedItem {
	private String name;
	
	protected ModItem(String name) {
		super();
		this.name = name;
		PortalModItems.initializeItem(this);
	}
	
	@Override
	public String getName() {
		return name;
	}
}
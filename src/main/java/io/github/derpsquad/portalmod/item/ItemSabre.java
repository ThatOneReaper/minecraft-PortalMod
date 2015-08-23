package io.github.derpsquad.portalmod.item;

import net.minecraft.item.ItemSword;


public class ItemSabre extends ItemSword implements INamedItem {
	
	private String name;

	protected ItemSabre(ToolMaterial material, String name) {
		super(material);
		this.name = name;
		PortalModItems.initializeItem(this);
	}

	@Override
	public String getName() {
		return name;
	}

}

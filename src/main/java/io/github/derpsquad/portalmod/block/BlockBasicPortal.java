package io.github.derpsquad.portalmod.block;

import net.minecraft.block.material.Material;

public class BlockBasicPortal extends ModBlock {
	
	private static final String name = "portalBasic";

	protected BlockBasicPortal() {
		super(Material.rock, name);
	}

	public String getName() {
		return name;
	}
}

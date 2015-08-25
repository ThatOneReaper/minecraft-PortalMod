package io.github.derpsquad.portalmod.block;

import net.minecraft.block.material.Material;

public class BlockKiln extends ModBlock {

	private static final String name = "kiln";

	protected BlockKiln() {
		super(Material.glass, name);
	}

	public String getName() {
		return name;
	}
}
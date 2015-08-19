package io.github.derpsquad.portalmod.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockQuartzGlass extends ModBlock {

	private static final String name = "quartzGlass";

	protected BlockQuartzGlass() {
		super(Material.glass, name);
	}

	public String getName() {
		return name;
	}
}
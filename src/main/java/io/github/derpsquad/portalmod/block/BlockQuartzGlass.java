package io.github.derpsquad.portalmod.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockQuartzGlass extends ModBlock {

	private static final String name = "quartzGlass";

	protected BlockQuartzGlass() {
		super(Material.glass, name);
		setResistance(64);
		setHardness(1.0f);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
    public int quantityDropped(Random random) {
        return 1;
    }

	@Override
    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT_MIPPED;
    }
    
    @Override
    public boolean isOpaqueCube() {
    	return false;
    }
    
    @Override
    public boolean isFullCube() {
    	return false;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        Block block = iblockstate.getBlock();

        if (worldIn.getBlockState(pos.offset(side.getOpposite())) != iblockstate)
        {
            return true;
        }

        if (block == this || block.getMaterial() == Material.glass)
        {
            return false;
        }
        
        return super.shouldSideBeRendered(worldIn, pos, side);
    }
    
    @Override
    public int getLightOpacity() {
    	return 0;
    }
}
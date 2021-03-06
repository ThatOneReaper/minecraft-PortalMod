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

public class BlockSpawnTeleporter extends ModBlock {

	private static final String name = "teleporterSpawn";

	protected BlockSpawnTeleporter() {
		super(Material.rock, name);
	}

	public String getName() {
		return name;
	}
	
	// Called when adjacent block updates
	@Override
    public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock)
    {
        if (worldIn.isBlockPowered(pos))
        {
        	// Creates a bounding box which is a point in the center of the block above this one
        	// If player bounding boxes intersect with this one, they are on top of this block or just above it
        	AxisAlignedBB box = new AxisAlignedBB(pos, pos).addCoord(0.5, 1.5, 0.5);
        	List<Entity> players = worldIn.getEntitiesWithinAABB(EntityPlayer.class, box);
        	if(players.size() == 0) // no one standing on it
        		return;
        	
        	BlockPos spawnPos = worldIn.getSpawnPoint();
        	for(Entity entity : players) {
        		entity.setPositionAndUpdate((double)spawnPos.getX() + 0.5D, (double)(spawnPos.getY() + 1), (double)spawnPos.getZ() + 0.5D);
        		while(!worldIn.getCollidingBoundingBoxes(entity, entity.getEntityBoundingBox()).isEmpty()) {
        			entity.setPositionAndUpdate(entity.posX, entity.posY + 1, entity.posZ);
        		}
        	}
        }
    }
}
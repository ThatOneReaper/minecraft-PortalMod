package io.github.derpsquad.portalmod.block;

import net.minecraft.block.Block;
import io.github.derpsquad.portalmod.PortalMod;

public class PortalModBlocks {
	
	public static Block basicPortal;
	
	public static void init() {
		basicPortal = new BlockSpawnTeleporter();
	}
}

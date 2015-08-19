package io.github.derpsquad.portalmod.block;


public class PortalModBlocks {
	
	public static ModBlock basicPortal;

	public static ModBlock quartzGlass;
	
	public static void init() {
		basicPortal = new BlockSpawnTeleporter();
		quartzGlass = new BlockQuartzGlass();
	}
}

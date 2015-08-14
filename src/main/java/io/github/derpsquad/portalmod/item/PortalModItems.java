package io.github.derpsquad.portalmod.item;


public class PortalModItems {
	
	public static ModItem teleportationCore;
	public static ModItem nuggetGlass;
	
	public static void init() {
		teleportationCore = new ItemTeleportationCore();
		nuggetGlass = new ModItem("nuggetGlass");
	}
}

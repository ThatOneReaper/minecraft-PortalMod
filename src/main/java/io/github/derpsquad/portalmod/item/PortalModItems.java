package io.github.derpsquad.portalmod.item;



public class PortalModItems {
	
	public static ModItem teleportationCore;
	public static ModItem nuggetGlass;
	public static ModItem glassArrowhead;
	public static ModItem glassRod;
	public static ModItem nuggetQuartzGlass;
	
	public static void init() {
		teleportationCore = new ItemTeleportationCore();
		nuggetGlass = new ModItem("nuggetGlass");
		glassArrowhead = new ModItem("glassArrowhead");
		glassRod = new ModItem("glassRod");
		nuggetQuartzGlass = new ModItem("nuggetQuartzGlass");
	}
}
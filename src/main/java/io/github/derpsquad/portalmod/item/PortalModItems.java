package io.github.derpsquad.portalmod.item;

import net.minecraft.item.Item;
import io.github.derpsquad.portalmod.PortalMod;

public class PortalModItems {
	
	public static Item teleportationCore;
	
	public static void init() {
		teleportationCore = new ItemTeleportationCore();
	}
}

package io.github.derpsquad.portalmod;

import io.github.derpsquad.portalmod.block.PortalModBlocks;
import io.github.derpsquad.portalmod.item.PortalModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {

	}

	public void init(FMLInitializationEvent event) {
		PortalModBlocks.init();
		PortalModItems.init();
	}

	public void postInit(FMLPreInitializationEvent event) {

	}
}

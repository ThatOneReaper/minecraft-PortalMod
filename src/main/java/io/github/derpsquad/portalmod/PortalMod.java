package io.github.derpsquad.portalmod;

import io.github.derpsquad.portalmod.tabs.ItemTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

@Mod(modid = PortalMod.MODID, name = PortalMod.NAME, version = PortalMod.VERSION)
public class PortalMod {
	public static final String MODID = "portalmod";
	public static final String VERSION = "0.0.3";
	public static final String NAME = "Portal Mod";
	
	@SidedProxy(clientSide = "io.github.derpsquad.portalmod.client.ClientProxy", serverSide = "io.github.derpsquad.portalmod.CommonProxy")
	public static CommonProxy proxy;
	
	public static Logger logger;
	public static CreativeTabs itemTab = new ItemTab(CreativeTabs.getNextID(),"portalTab");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		logger.info("Hello World!");
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPreInitializationEvent event) {
		proxy.postInit(event);
	}
}
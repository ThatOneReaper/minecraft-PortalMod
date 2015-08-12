package io.github.derpsquad.portalmod;

import io.github.derpsquad.portalmod.block.*;
import io.github.derpsquad.portalmod.item.*;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import net.minecraft.init.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = PortalMod.MODID, version = PortalMod.VERSION)
public class PortalMod
{
    public static final String MODID = "portalmod";
    public static final String VERSION = "0.0.1";
    
    public static Logger logger;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	logger = event.getModLog();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		logger.info("Hello World!");
		PortalModBlocks.init();
		PortalModItems.init();
		
		if(event.getSide() == Side.CLIENT)
		{
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
			renderItem.getItemModelMesher().register(PortalModItems.teleportationCore,0,new ModelResourceLocation(PortalMod.MODID + ":" + ((ItemTeleportationCore)PortalModItems.teleportationCore).getName()));
			logger.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			logger.info(PortalMod.MODID + ":" + ((ItemTeleportationCore)PortalModItems.teleportationCore).getName());
		}
    }
}
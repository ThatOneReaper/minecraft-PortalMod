package io.github.derpsquad.portalmod.client;

import io.github.derpsquad.portalmod.CommonProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		super.preInit(event);
		
	}

	@Override
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
		ModRenders.registerAll();
	}

	@Override
	public void postInit(FMLPreInitializationEvent event)
	{
		super.postInit(event);
		
	}

}

package io.github.derpsquad.portalmod.client;

import io.github.derpsquad.portalmod.block.ModBlock;
import io.github.derpsquad.portalmod.block.PortalModBlocks;
import io.github.derpsquad.portalmod.item.ModItem;
import io.github.derpsquad.portalmod.item.PortalModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenders {
	public static void registerAll() {
		// Blocks
		registerBlock(PortalModBlocks.basicPortal);
		
		// Items
		registerItem(PortalModItems.teleportationCore);
	}
	
	private static void registerItem(ModItem item) {
		ModelResourceLocation itemModelResourceLocation =
				new ModelResourceLocation("portalmod:" + item.getName(), "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				itemModelResourceLocation);
	}
	
	private static void registerBlock(ModBlock block) {
		ModelResourceLocation itemModelResourceLocation =
				new ModelResourceLocation("portalmod:" + block.getName(), "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
				Item.getItemFromBlock(block), 0, itemModelResourceLocation);
	}
}

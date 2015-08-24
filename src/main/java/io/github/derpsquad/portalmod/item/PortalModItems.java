package io.github.derpsquad.portalmod.item;

import io.github.derpsquad.portalmod.PortalMod;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PortalModItems {
	
	private static ToolMaterial toolGlass = EnumHelper.addToolMaterial("QUARTZ_GLASS", 2, 131, 9.0f, 3.0f, 5);
	
	public static ModItem teleportationCore;
	public static ModItem nuggetGlass;
	public static ModItem glassArrowhead;
	public static ModItem glassRod;
	public static ModItem nuggetQuartzGlass;
	
	//items derived from vanilla/other mod items
	public static ItemSabre ironSabre;
	public static ItemSabre glassSabre;
	
	public static void init() {
		teleportationCore = new ItemTeleportationCore();
		nuggetGlass = new ModItem("nuggetGlass");
		glassArrowhead = new ModItem("glassArrowhead");
		glassRod = new ModItem("glassRod");
		nuggetQuartzGlass = new ModItem("nuggetQuartzGlass");
		ironSabre = new ItemSabre(ToolMaterial.IRON, "ironSabre");
		glassSabre = new ItemSabre(toolGlass, "glassSabre");
	}
	
	public static <T extends Item & INamedItem> void initializeItem(T item) {
		GameRegistry.registerItem(item, item.getName());
		item.setUnlocalizedName(PortalMod.MODID + "_" + item.getName());
		item.setCreativeTab(PortalMod.itemTab);
	}
}
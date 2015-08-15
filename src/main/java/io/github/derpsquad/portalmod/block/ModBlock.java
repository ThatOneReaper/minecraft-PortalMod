package io.github.derpsquad.portalmod.block;
import io.github.derpsquad.portalmod.PortalMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModBlock extends Block {
	
	private String name;

	protected ModBlock(Material materialIn, String name) {
		super(materialIn);
		this.name = name;
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(PortalMod.MODID + "_" + name);
		setCreativeTab(PortalMod.itemTab); // TODO new creative tab
	}
	
	public String getName() {
		return name;
	}
}

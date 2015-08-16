package io.github.derpsquad.portalmod.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class PortalModRecipes {
	public static void init() {
		final ItemStack nuggetGlass = new ItemStack(PortalModItems.nuggetGlass, 4);
		final ItemStack glassBlock = new ItemStack(Blocks.glass);
		final ItemStack glassArrowhead = new ItemStack(PortalModItems.glassArrowhead);
		final ItemStack glassRod = new ItemStack(PortalModItems.glassRod);
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(
				nuggetGlass, "blockGlass"));
		GameRegistry.addRecipe(glassBlock,
				"nn", "nn", 
				'n', nuggetGlass);
		GameRegistry.addRecipe(glassArrowhead,
				" n ", "n n",
				'n', nuggetGlass);
		GameRegistry.addRecipe(glassRod,
				"n", "n", "n",
				'n', nuggetGlass);
	}
}


package fr.thearty.machinetryallium.item.crafting;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import fr.thearty.machinetryallium.item.ItemAzuriteIngot;
import fr.thearty.machinetryallium.block.BlockAzuriteOre;

@ElementsMachinetryalliumMod.ModElement.Tag
public class RecipeAzuriteOreSmelting extends ElementsMachinetryalliumMod.ModElement {
	public RecipeAzuriteOreSmelting(ElementsMachinetryalliumMod instance) {
		super(instance, 44);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockAzuriteOre.block, (int) (1)), new ItemStack(ItemAzuriteIngot.block, (int) (1)), 0.7F);
	}
}

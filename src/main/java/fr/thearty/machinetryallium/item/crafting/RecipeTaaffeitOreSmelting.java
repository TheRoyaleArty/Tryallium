
package fr.thearty.machinetryallium.item.crafting;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import fr.thearty.machinetryallium.item.ItemTaaffeitIngot;
import fr.thearty.machinetryallium.block.BlockTaaffeitOre;

@ElementsMachinetryalliumMod.ModElement.Tag
public class RecipeTaaffeitOreSmelting extends ElementsMachinetryalliumMod.ModElement {
	public RecipeTaaffeitOreSmelting(ElementsMachinetryalliumMod instance) {
		super(instance, 34);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTaaffeitOre.block, (int) (1)), new ItemStack(ItemTaaffeitIngot.block, (int) (1)), 0.7F);
	}
}


package fr.thearty.machinetryallium.item.crafting;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import fr.thearty.machinetryallium.item.ItemTryalliumGem;
import fr.thearty.machinetryallium.block.BlockTryalliumOre;

@ElementsMachinetryalliumMod.ModElement.Tag
public class RecipeTryalliumOreSmelting extends ElementsMachinetryalliumMod.ModElement {
	public RecipeTryalliumOreSmelting(ElementsMachinetryalliumMod instance) {
		super(instance, 19);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTryalliumOre.block, (int) (1)), new ItemStack(ItemTryalliumGem.block, (int) (1)), 0.7F);
	}
}

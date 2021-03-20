
package fr.thearty.machinetryallium.creativetab;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import fr.thearty.machinetryallium.item.ItemTryalliumGem;

@ElementsMachinetryalliumMod.ModElement.Tag
public class TabTryalliummod extends ElementsMachinetryalliumMod.ModElement {
	public TabTryalliummod(ElementsMachinetryalliumMod instance) {
		super(instance, 96);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabtryalliummod") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemTryalliumGem.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}

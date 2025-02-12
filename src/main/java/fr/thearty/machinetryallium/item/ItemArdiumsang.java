
package fr.thearty.machinetryallium.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import fr.thearty.machinetryallium.creativetab.TabTryalliummod;
import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ItemArdiumsang extends ElementsMachinetryalliumMod.ModElement {
	@GameRegistry.ObjectHolder("machinetryallium:ardiumsang")
	public static final Item block = null;
	public ItemArdiumsang(ElementsMachinetryalliumMod instance) {
		super(instance, 194);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("machinetryallium:ardiumsang", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("ardiumsang");
			setRegistryName("ardiumsang");
			setCreativeTab(TabTryalliummod.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}

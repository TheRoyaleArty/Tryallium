
package fr.thearty.machinetryallium.item;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import fr.thearty.machinetryallium.creativetab.TabTryalliummod;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ItemTaaffeitIngot extends ElementsMachinetryalliumMod.ModElement {
	@GameRegistry.ObjectHolder("machinetryallium:taaffeitingot")
	public static final Item block = null;
	public ItemTaaffeitIngot(ElementsMachinetryalliumMod instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("machinetryallium:taaffeitingot", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("taaffeitingot");
			setRegistryName("taaffeitingot");
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


package fr.thearty.machinetryallium.item;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import fr.thearty.machinetryallium.creativetab.TabTryalliummod;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ItemTryalliumpickaxe extends ElementsMachinetryalliumMod.ModElement {
	@GameRegistry.ObjectHolder("machinetryallium:tryalliumpickaxe")
	public static final Item block = null;
	public ItemTryalliumpickaxe(ElementsMachinetryalliumMod instance) {
		super(instance, 60);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("TRYALLIUMPICKAXE", 1, 1200, 12f, 0f, 14)) {
			{
				this.attackSpeed = 14f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 1);
				return ret.keySet();
			}
		}.setUnlocalizedName("tryalliumpickaxe").setRegistryName("tryalliumpickaxe").setCreativeTab(TabTryalliummod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("machinetryallium:tryalliumpickaxe", "inventory"));
	}
}

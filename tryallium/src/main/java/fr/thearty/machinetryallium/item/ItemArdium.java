
package fr.thearty.machinetryallium.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import fr.thearty.machinetryallium.creativetab.TabTryalliummod;
import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ItemArdium extends ElementsMachinetryalliumMod.ModElement {
	@GameRegistry.ObjectHolder("machinetryallium:ardiumhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("machinetryallium:ardiumbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("machinetryallium:ardiumlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("machinetryallium:ardiumboots")
	public static final Item boots = null;
	public ItemArdium(ElementsMachinetryalliumMod instance) {
		super(instance, 193);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ARDIUM", "machinetryallium:ardium__", 25, new int[]{2, 7, 8, 5}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("ardiumhelmet").setRegistryName("ardiumhelmet")
				.setCreativeTab(TabTryalliummod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("ardiumbody").setRegistryName("ardiumbody")
				.setCreativeTab(TabTryalliummod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("ardiumlegs").setRegistryName("ardiumlegs")
				.setCreativeTab(TabTryalliummod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("ardiumboots").setRegistryName("ardiumboots")
				.setCreativeTab(TabTryalliummod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("machinetryallium:ardiumhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("machinetryallium:ardiumbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("machinetryallium:ardiumlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("machinetryallium:ardiumboots", "inventory"));
	}
}

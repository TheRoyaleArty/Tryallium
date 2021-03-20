
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
public class ItemAzuriteArmor extends ElementsMachinetryalliumMod.ModElement {
	@GameRegistry.ObjectHolder("machinetryallium:azuritearmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("machinetryallium:azuritearmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("machinetryallium:azuritearmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("machinetryallium:azuritearmorboots")
	public static final Item boots = null;
	public ItemAzuriteArmor(ElementsMachinetryalliumMod instance) {
		super(instance, 55);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("AZURITEARMOR", "machinetryallium:azurite_", 15, new int[]{4, 7, 7, 4}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 1f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("azuritearmorhelmet")
				.setRegistryName("azuritearmorhelmet").setCreativeTab(TabTryalliummod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("azuritearmorbody")
				.setRegistryName("azuritearmorbody").setCreativeTab(TabTryalliummod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("azuritearmorlegs")
				.setRegistryName("azuritearmorlegs").setCreativeTab(TabTryalliummod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("azuritearmorboots")
				.setRegistryName("azuritearmorboots").setCreativeTab(TabTryalliummod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("machinetryallium:azuritearmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("machinetryallium:azuritearmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("machinetryallium:azuritearmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("machinetryallium:azuritearmorboots", "inventory"));
	}
}

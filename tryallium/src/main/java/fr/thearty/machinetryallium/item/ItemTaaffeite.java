
package fr.thearty.machinetryallium.item;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import fr.thearty.machinetryallium.creativetab.TabTryalliummod;
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

@ElementsMachinetryalliumMod.ModElement.Tag
public class ItemTaaffeite extends ElementsMachinetryalliumMod.ModElement {
	@GameRegistry.ObjectHolder("machinetryallium:taaffeitehelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("machinetryallium:taaffeitebody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("machinetryallium:taaffeitelegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("machinetryallium:taaffeiteboots")
	public static final Item boots = null;
	public ItemTaaffeite(ElementsMachinetryalliumMod instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("TAAFFEITE", "machinetryallium:taaffeite_", 42, new int[]{3, 6, 7, 4}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("taaffeitehelmet")
				.setRegistryName("taaffeitehelmet").setCreativeTab(TabTryalliummod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("taaffeitebody")
				.setRegistryName("taaffeitebody").setCreativeTab(TabTryalliummod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("taaffeitelegs")
				.setRegistryName("taaffeitelegs").setCreativeTab(TabTryalliummod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("taaffeiteboots")
				.setRegistryName("taaffeiteboots").setCreativeTab(TabTryalliummod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("machinetryallium:taaffeitehelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("machinetryallium:taaffeitebody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("machinetryallium:taaffeitelegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("machinetryallium:taaffeiteboots", "inventory"));
	}
}


package fr.thearty.machinetryallium.item;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import fr.thearty.machinetryallium.creativetab.TabTryalliummod;
import fr.thearty.machinetryallium.procedure.ProcedureTryalliumBodyTickEvent;
import fr.thearty.machinetryallium.procedure.ProcedureTryalliumBootsTickEvent;
import fr.thearty.machinetryallium.procedure.ProcedureTryalliumHelmetTickEvent;
import fr.thearty.machinetryallium.procedure.ProcedureTryalliumLeggingsTickEvent;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.SoundEvent;

import java.util.Map;
import java.util.HashMap;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ItemTryallium extends ElementsMachinetryalliumMod.ModElement {
	@GameRegistry.ObjectHolder("machinetryallium:tryalliumhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("machinetryallium:tryalliumbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("machinetryallium:tryalliumlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("machinetryallium:tryalliumboots")
	public static final Item boots = null;
	public ItemTryallium(ElementsMachinetryalliumMod instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("TRYALLIUM", "machinetryallium:tryallium_", 30, new int[]{4, 7, 10, 5}, 9,
				(SoundEvent) SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureTryalliumHelmetTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("tryalliumhelmet").setRegistryName("tryalliumhelmet").setCreativeTab(TabTryalliummod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureTryalliumBodyTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("tryalliumbody").setRegistryName("tryalliumbody").setCreativeTab(TabTryalliummod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureTryalliumLeggingsTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("tryalliumlegs").setRegistryName("tryalliumlegs").setCreativeTab(TabTryalliummod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					ProcedureTryalliumBootsTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("tryalliumboots").setRegistryName("tryalliumboots").setCreativeTab(TabTryalliummod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("machinetryallium:tryalliumhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("machinetryallium:tryalliumbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("machinetryallium:tryalliumlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("machinetryallium:tryalliumboots", "inventory"));
	}
}

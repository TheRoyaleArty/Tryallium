package fr.thearty.machinetryallium.procedure;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import fr.thearty.machinetryallium.item.ItemTryallium;
import fr.thearty.machinetryallium.item.ItemStrenghtstick;

import java.util.Map;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ProcedureStrenghtstickRightClickedInAir extends ElementsMachinetryalliumMod.ModElement {
	public ProcedureStrenghtstickRightClickedInAir(ElementsMachinetryalliumMod instance) {
		super(instance, 127);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure StrenghtstickRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure StrenghtstickRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double strenghtsticks = 0;
		double timerstrenghtsticks = 0;
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemStrenghtstick.block, (int) (1)).getItem(), -1, (int) 1, null);
		strenghtsticks = (double) 1;
		while ((Math.random() < 0.5)) {
			if ((((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemTryallium.helmet, (int) (1)).getItem())
					&& (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(2) : ItemStack.EMPTY)
							.getItem() == new ItemStack(ItemTryallium.body, (int) (1)).getItem()))
					&& ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(1) : ItemStack.EMPTY)
							.getItem() == new ItemStack(ItemTryallium.legs, (int) (1)).getItem())
							&& (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(0) : ItemStack.EMPTY)
									.getItem() == new ItemStack(ItemTryallium.boots, (int) (1)).getItem())))) {
				while ((Math.random() < 0.1)) {
					strenghtsticks = (double) 2;
				}
				if (((strenghtsticks) == 1)) {
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 300);
				} else if (((strenghtsticks) == 2)) {
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 1);
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (int) 500, (int) 2));
				}
			}
			if ((((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(3) : ItemStack.EMPTY)
					.getItem() == new ItemStack(ItemTryallium.helmet, (int) (1)).getItem())
					&& ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(2) : ItemStack.EMPTY)
							.getItem() == new ItemStack(ItemTryallium.body, (int) (1)).getItem())
							&& ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(1) : ItemStack.EMPTY)
									.getItem() == new ItemStack(ItemTryallium.legs, (int) (1)).getItem())
									&& (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(0) : ItemStack.EMPTY)
											.getItem() == new ItemStack(ItemTryallium.boots, (int) (1))
													.getItem())))) != ((((entity instanceof EntityPlayer)
															? ((EntityPlayer) entity).inventory.armorInventory.get(3)
															: ItemStack.EMPTY).getItem() == new ItemStack(ItemTryallium.helmet, (int) (1)).getItem())
															&& ((((entity instanceof EntityPlayer)
																	? ((EntityPlayer) entity).inventory.armorInventory.get(2)
																	: ItemStack.EMPTY)
																			.getItem() == new ItemStack(ItemTryallium.body, (int) (1)).getItem())
																	&& ((((entity instanceof EntityPlayer)
																			? ((EntityPlayer) entity).inventory.armorInventory.get(1)
																			: ItemStack.EMPTY)
																					.getItem() == new ItemStack(ItemTryallium.legs, (int) (1))
																							.getItem())
																			&& (((entity instanceof EntityPlayer)
																					? ((EntityPlayer) entity).inventory.armorInventory.get(0)
																					: ItemStack.EMPTY)
																							.getItem() == new ItemStack(ItemTryallium.boots,
																									(int) (1)).getItem())))))) {
				timerstrenghtsticks = (double) 1;
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 300);
			}
			timerstrenghtsticks = (double) 2;
			if (((timerstrenghtsticks) == 2)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (int) 500, (int) 2));
			}
		}
	}
}

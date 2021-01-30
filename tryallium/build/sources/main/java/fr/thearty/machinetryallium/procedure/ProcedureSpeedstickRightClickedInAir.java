package fr.thearty.machinetryallium.procedure;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import fr.thearty.machinetryallium.item.ItemTryallium;
import fr.thearty.machinetryallium.item.ItemSpeedstick;

import java.util.Map;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ProcedureSpeedstickRightClickedInAir extends ElementsMachinetryalliumMod.ModElement {
	public ProcedureSpeedstickRightClickedInAir(ElementsMachinetryalliumMod instance) {
		super(instance, 124);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SpeedstickRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure SpeedstickRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double speedsticks = 0;
		double timerspeedsticks = 0;
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemSpeedstick.block, (int) (1)).getItem(), -1, (int) 1, null);
		speedsticks = (double) 1;
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
					speedsticks = (double) 2;
				}
				if (((speedsticks) == 1)) {
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 300);
				} else if (((speedsticks) == 2)) {
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 1);
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 500, (int) 2));
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
				timerspeedsticks = (double) 1;
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 300);
			}
			timerspeedsticks = (double) 2;
			if (((timerspeedsticks) == 2)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 500, (int) 2));
			}
		}
	}
}

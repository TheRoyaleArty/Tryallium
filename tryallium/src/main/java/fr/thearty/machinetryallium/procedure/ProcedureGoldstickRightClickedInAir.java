package fr.thearty.machinetryallium.procedure;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import fr.thearty.machinetryallium.item.ItemTryallium;
import fr.thearty.machinetryallium.item.ItemGoldstick;

import java.util.Map;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ProcedureGoldstickRightClickedInAir extends ElementsMachinetryalliumMod.ModElement {
	public ProcedureGoldstickRightClickedInAir(ElementsMachinetryalliumMod instance) {
		super(instance, 130);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure GoldstickRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure GoldstickRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double goldstick = 0;
		double timergoldstick = 0;
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemGoldstick.block, (int) (1)).getItem(), -1, (int) 1, null);
		goldstick = (double) 3;
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
					goldstick = (double) 2;
				}
				if (((goldstick) == 1)) {
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 300);
				} else if (((goldstick) == 2)) {
					if (entity instanceof EntityPlayer)
						((EntityPlayer) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 1);
					if (entity instanceof EntityLivingBase)
						((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 400, (int) 2));
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
				timergoldstick = (double) 1;
				if (entity instanceof EntityPlayer)
					((EntityPlayer) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 300);
			}
			timergoldstick = (double) 2;
			if (((timergoldstick) == 2)) {
				if (entity instanceof EntityLivingBase)
					((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, (int) 250, (int) 2));
			}
		}
	}
}

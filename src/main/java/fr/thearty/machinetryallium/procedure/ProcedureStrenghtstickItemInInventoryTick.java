package fr.thearty.machinetryallium.procedure;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Collection;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ProcedureStrenghtstickItemInInventoryTick extends ElementsMachinetryalliumMod.ModElement {
	public ProcedureStrenghtstickItemInInventoryTick(ElementsMachinetryalliumMod instance) {
		super(instance, 154);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure StrenghtstickItemInInventoryTick!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure StrenghtstickItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((new Object() {
			boolean check() {
				if (entity instanceof EntityLivingBase) {
					Collection<PotionEffect> effects = ((EntityLivingBase) entity).getActivePotionEffects();
					for (PotionEffect effect : effects) {
						if (effect.getPotion() == MobEffects.STRENGTH)
							return true;
					}
				}
				return false;
			}
		}.check())) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 300);
		}
	}
}

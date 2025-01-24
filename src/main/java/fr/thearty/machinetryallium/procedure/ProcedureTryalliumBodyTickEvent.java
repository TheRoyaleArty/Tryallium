package fr.thearty.machinetryallium.procedure;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import fr.thearty.machinetryallium.item.ItemTryallium;

import java.util.Map;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ProcedureTryalliumBodyTickEvent extends ElementsMachinetryalliumMod.ModElement {
	public ProcedureTryalliumBodyTickEvent(ElementsMachinetryalliumMod instance) {
		super(instance, 132);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TryalliumBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.armorInventory.get(2) : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemTryallium.body, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase)
				((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.STRENGTH, (int) 800, (int) 2));
		}
	}
}

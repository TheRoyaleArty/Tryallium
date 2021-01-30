package fr.thearty.machinetryallium.procedure;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import net.minecraft.potion.PotionEffect;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import fr.thearty.machinetryallium.potion.PotionAntichute;

import java.util.Map;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ProcedurePotionantichuteFoodEaten extends ElementsMachinetryalliumMod.ModElement {
	public ProcedurePotionantichuteFoodEaten(ElementsMachinetryalliumMod instance) {
		super(instance, 180);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PotionantichuteFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(PotionAntichute.potion, (int) 1, (int) 1));
	}
}

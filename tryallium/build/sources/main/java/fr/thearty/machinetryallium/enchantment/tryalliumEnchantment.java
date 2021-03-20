package fr.thearty.machinetryallium.enchantment;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import fr.thearty.machinetryallium.enchantment.tryalliumEnchantment.CustomEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.DamageSource;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ElementsMachinetryalliumMod.ModElement.Tag
public class tryalliumEnchantment extends ElementsMachinetryalliumMod.ModElement {
	@ObjectHolder("machinetryallium:tryalliumenchantments")
	public static final Enchantment enchantment = null;
	public tryalliumEnchantment(ElementsMachinetryalliumMod instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EntityEquipmentSlot.MAINHAND).setRegistryName("tryalliumenchantments"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EntityEquipmentSlot... slots) {
			super(Enchantment.Rarity.UNCOMMON, EnumEnchantmentType.ARMOR, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 5;
		}
		

		@Override
		public int calcModifierDamage(int level, DamageSource source) {
			return level * 6;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}
		
		@Override
		public String getName() {
			return "Tryallium Enchantment";
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}
	}
}
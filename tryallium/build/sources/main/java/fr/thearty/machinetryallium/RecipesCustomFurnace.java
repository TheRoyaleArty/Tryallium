package fr.thearty.machinetryallium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import fr.thearty.machinetryallium.block.BlockTryalliumblock;
import fr.thearty.machinetryallium.item.ItemCompressedTryallium;
import fr.thearty.machinetryallium.item.ItemFortuneupgrade;
import fr.thearty.machinetryallium.item.ItemHammer;
import fr.thearty.machinetryallium.item.ItemHammer_fortune_1_smelt;
import fr.thearty.machinetryallium.item.ItemHammer_fortune_2;
import fr.thearty.machinetryallium.item.ItemHammer_fortune_2_smelt;
import fr.thearty.machinetryallium.item.ItemHammer_fortune_3;
import fr.thearty.machinetryallium.item.ItemHammer_fortune_3_smelt;
import fr.thearty.machinetryallium.item.ItemHammer_speed_2;
import fr.thearty.machinetryallium.item.ItemHammer_speed_3;
import fr.thearty.machinetryallium.item.ItemHammerfortune1;
import fr.thearty.machinetryallium.item.ItemHammerorb;
import fr.thearty.machinetryallium.item.ItemHammersmelt;
import fr.thearty.machinetryallium.item.ItemHammerspeed;
import fr.thearty.machinetryallium.item.ItemSmeltupgrade;
import fr.thearty.machinetryallium.item.ItemSpeedupgrade;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipesCustomFurnace {

	static Item ItemCustom = ItemSmeltupgrade.block;
	
	private static final HashMap <ItemStack[], ItemStack>recipes = new HashMap<ItemStack[], ItemStack>();
	static {
	    addRecipe(Items.APPLE, Items.ARROW, Items.BAKED_POTATO);
	    
		addRecipe(ItemCustom, Items.ARROW, Items.APPLE);
		
		addRecipe(ItemHammerorb.block, ItemCompressedTryallium.block, ItemHammer.block);
		
		addRecipe(ItemHammer.block, ItemSpeedupgrade.block, ItemHammerspeed.block);
		
		addRecipe(ItemHammerspeed.block, ItemSpeedupgrade.block, ItemHammer_speed_2.block);
		
		addRecipe(ItemHammer_speed_2.block, ItemSpeedupgrade.block, ItemHammer_speed_3.block);
		
		addRecipe(ItemHammer.block, ItemFortuneupgrade.block, ItemHammerfortune1.block);
		
		addRecipe(ItemHammerfortune1.block, ItemFortuneupgrade.block, ItemHammer_fortune_2.block);
		
		addRecipe(ItemHammer_fortune_2.block, ItemFortuneupgrade.block, ItemHammer_fortune_3.block);
		
		addRecipe(ItemHammer.block, ItemSmeltupgrade.block, ItemHammersmelt.block);
		
		addRecipe(ItemHammersmelt.block, ItemFortuneupgrade.block, ItemHammer_fortune_1_smelt.block);
		
		addRecipe(ItemHammer_fortune_1_smelt.block, ItemFortuneupgrade.block, ItemHammer_fortune_2_smelt.block);
		
		addRecipe(ItemHammer_fortune_2_smelt.block, ItemFortuneupgrade.block, ItemHammer_fortune_3_smelt.block);
	}
	
	private static void addRecipe(Item ingredient1, Item ingredient2, Item resultat1) {
	    addRecipe(new ItemStack(ingredient1), new ItemStack(ingredient2), new ItemStack(resultat1));
	}
	 
	private static void addRecipe(ItemStack ingredient1, ItemStack ingredient2, ItemStack resultat1) {
	    recipes.put(new ItemStack[]{ingredient1, ingredient2}, resultat1);
	}
	
	
	
	
	private static boolean areKeysEqual(ItemStack[] key1, ItemStack[] key2) {
	    if(key1.length != key2.length) return false;
	 
	    for(int i = 0; i < key1.length; i++) {
	        ItemStack s1 = key1[i];
	        ItemStack s2 = key2[i];
	        if(s1.isEmpty() && !s2.isEmpty()) return false;
	        if(!s1.isEmpty() && s2.isEmpty()) return false;
	        if(s1.getItem() != s2.getItem()) return false;
	        if(s1.getItemDamage() != s2.getItemDamage()) return false;
	    }
	    return true;
	}
	
	
	public static ItemStack getRecipeResult(ItemStack[] ingredients) {
	    Iterator<Entry<ItemStack[], ItemStack>> it = recipes.entrySet().iterator();
	    while(it.hasNext()) {
	        Entry <ItemStack[], ItemStack>entry = it.next();
	        if(areKeysEqual(entry.getKey(), ingredients)) {
	            return entry.getValue();
	        }
	    }
	    return null;
	}
	
	
	
}

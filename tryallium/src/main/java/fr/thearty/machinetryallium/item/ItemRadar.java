
package fr.thearty.machinetryallium.item;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import fr.thearty.machinetryallium.creativetab.TabTryalliummod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ItemRadar extends ElementsMachinetryalliumMod.ModElement {
	@GameRegistry.ObjectHolder("machinetryallium:itemradar")
	public static final Item block = null;
	   private static EntityPlayer player;
	   public static int durabilite = 90*20*60;
	public ItemRadar(ElementsMachinetryalliumMod instance) {
		super(instance, 187);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("machinetryallium:radar", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(durabilite);
			maxStackSize = 1;
			setUnlocalizedName("itemradar");
			setRegistryName("itemradar");
			setCreativeTab(TabTryalliummod.tab);
		}
		
		@Override
	    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
	    {
	        player = (EntityPlayer)entityIn;
	        
	        stack = player.getHeldItem(EnumHand.MAIN_HAND);
	        
	        if(player.getHeldItem(EnumHand.MAIN_HAND).getItem() instanceof ItemCustom)
	        {
	                if(durabilite >= 0)
	                {
	                    durabilite --;
	                    stack.damageItem(1, player);
	                }
	                    
	        }
	        super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	    }
	    
	}
}


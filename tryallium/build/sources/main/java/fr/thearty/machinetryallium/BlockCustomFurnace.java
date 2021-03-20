package fr.thearty.machinetryallium;

import fr.thearty.machinetryallium.block.BlockAzuriteOre.BlockCustom;
import fr.thearty.machinetryallium.creativetab.TabTryalliummod;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



@ElementsMachinetryalliumMod.ModElement.Tag
public class BlockCustomFurnace extends ElementsMachinetryalliumMod.ModElement {
	@GameRegistry.ObjectHolder("machinetryallium:custom_furnace")
	public static final Block block = null;
	
	
	public BlockCustomFurnace(ElementsMachinetryalliumMod instance) {
		super(instance, 96);

	}

	
	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("custom_furnace"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}
	
	
	@SuppressWarnings("deprecation")
	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerTileEntity(TileCustomFurnace.class, "machinetryallium:tile_custom_furnace");
	}
	
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("machinetryallium:blockstates/custom_furnace.json"));
	}

	
	
	public static class BlockCustom extends Block implements ITileEntityProvider {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("custom_furnace");
			setSoundType(SoundType.METAL);
			setHardness(4F);
			setResistance(12F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabTryalliummod.tab);
		}
	
	
	@Override
	public boolean hasTileEntity() {
	    return true;
	}
	 
	@Override
	public TileEntity createNewTileEntity(World world, int metadata)  {
	    return new TileCustomFurnace();
	}
	
	
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
	    TileEntity tileentity = worldIn.getTileEntity(pos);
	 
	    if (tileentity instanceof TileCustomFurnace) {
	        InventoryHelper.dropInventoryItems(worldIn, pos,
	                (TileCustomFurnace) tileentity);
	    }
	 
	    super.breakBlock(worldIn, pos, state);
	}
	
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
	    if (world.isRemote) {
	        return true;
	    } else {
	        TileEntity tileentity = world.getTileEntity(pos);
	 
	        if (tileentity instanceof TileCustomFurnace) {
	            player.openGui(MachinetryalliumMod.instance, 0, world, pos.getX(),
	                    pos.getY(), pos.getZ());
	        }
	 
	        return true;
	    }
	}
	
	
	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
	    return EnumBlockRenderType.MODEL;
	}
	
	
	
	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
	    if (stack.hasDisplayName()) {
	        TileEntity tileentity = worldIn.getTileEntity(pos);
	 
	        if (tileentity instanceof TileCustomFurnace) {
	            ((TileCustomFurnace) tileentity).setCustomName(stack
	                    .getDisplayName());
	        }
	    }
	}

	
	
	
	
}
}

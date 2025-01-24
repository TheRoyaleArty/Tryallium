
package fr.thearty.machinetryallium.item;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import fr.thearty.machinetryallium.creativetab.TabTryalliummod;
import fr.thearty.machinetryallium.procedure.ProcedureHammerBlockDestroyedWithTool;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ItemHammer extends ElementsMachinetryalliumMod.ModElement {
	@GameRegistry.ObjectHolder("machinetryallium:hammer")
	public static final Item block = null;
	public ItemHammer(ElementsMachinetryalliumMod instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("HAMMER", 1, 1000, 3f, 0f, 0)) {
			{
				this.attackSpeed = 3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 1);
				return ret.keySet();
			}

			public RayTraceResult rayTrace(double blockReachDistance, float partialTicks, World world, EntityLivingBase e)
		    {
		        Vec3d vec3d = e.getPositionEyes(partialTicks);
		        Vec3d vec3d1 = e.getLook(partialTicks);
		        Vec3d vec3d2 = vec3d.addVector(vec3d1.x * blockReachDistance, vec3d1.y * blockReachDistance, vec3d1.z * blockReachDistance);
		        return world.rayTraceBlocks(vec3d, vec3d2, false, false, true);
		    }

			@Override
		    public boolean onBlockDestroyed(ItemStack breaker, World w, IBlockState state, BlockPos pos, EntityLivingBase e)
		    {
		        if(e instanceof EntityPlayer && !w.isRemote)
		        {
		            EntityPlayer p = (EntityPlayer)e;
		            RayTraceResult r = this.rayTrace(5.0D, 0.0f, w, e);

		            if(r.typeOfHit == RayTraceResult.Type.BLOCK)
		            {
		                int x = pos.getX();
		                int y = pos.getY();
		                int z = pos.getZ();

		                EnumFacing side = r.sideHit;

		                if(side == EnumFacing.DOWN || side == EnumFacing.UP)
		                {
		                    this.destroyAndDropBlock(w, p, breaker, x + 1, y, z - 1);
		                    this.destroyAndDropBlock(w, p, breaker, x + 1, y, z);
		                    this.destroyAndDropBlock(w, p, breaker, x + 1, y, z + 1);
		                    this.destroyAndDropBlock(w, p, breaker, x, y, z - 1);
		                    // Middle block
		                    this.destroyAndDropBlock(w, p, breaker, x, y, z + 1);
		                    this.destroyAndDropBlock(w, p, breaker, x - 1, y, z - 1);
		                    this.destroyAndDropBlock(w, p, breaker, x - 1, y, z);
		                    this.destroyAndDropBlock(w, p, breaker, x - 1, y, z + 1);
		                }
		                // Z
		                // NORTH - SOUTH
		                else if(side == EnumFacing.NORTH || side == EnumFacing.SOUTH)
		                {
		                    this.destroyAndDropBlock(w, p, breaker, x + 1, y + 1, z);
		                    this.destroyAndDropBlock(w, p, breaker, x, y + 1, z);
		                    this.destroyAndDropBlock(w, p, breaker, x - 1, y + 1, z);
		                    this.destroyAndDropBlock(w, p, breaker, x + 1, y, z);
		                    // Middle block
		                    this.destroyAndDropBlock(w, p, breaker, x - 1, y, z);
		                    this.destroyAndDropBlock(w, p, breaker, x + 1, y - 1, z);
		                    this.destroyAndDropBlock(w, p, breaker, x, y - 1, z);
		                    this.destroyAndDropBlock(w, p, breaker, x - 1, y - 1, z);
		                }
		                // X
		                // EAST - WEST
		                else if(side == EnumFacing.EAST || side == EnumFacing.WEST)
		                {
		                    this.destroyAndDropBlock(w, p, breaker, x, y + 1, z + 1);
		                    this.destroyAndDropBlock(w, p, breaker, x, y + 1, z);
		                    this.destroyAndDropBlock(w, p, breaker, x, y + 1, z - 1);
		                    this.destroyAndDropBlock(w, p, breaker, x, y, z + 1);
		                    // Middle block
		                    this.destroyAndDropBlock(w, p, breaker, x, y, z - 1);
		                    this.destroyAndDropBlock(w, p, breaker, x, y - 1, z + 1);
		                    this.destroyAndDropBlock(w, p, breaker, x, y - 1, z);
		                    this.destroyAndDropBlock(w, p, breaker, x, y - 1, z - 1);
		                }
		                return true;
		            }
		        }
		        
		        breaker.damageItem(1, e);
		        return super.onBlockDestroyed(breaker, w, state, pos, e);
		    }
			
			private void destroyAndDropBlock(World w, EntityPlayer p, ItemStack breaker, int x, int y, int z)
		    {
		        BlockPos pos = new BlockPos(x, y, z);

		        if(w.getBlockState(pos).getBlockHardness(w, pos) >= 0 && w.getBlockState(pos).getBlock().getMaterial(w.getBlockState(pos).getBlock().getDefaultState()) == Material.ROCK)
		        {
		            w.getBlockState(pos).getBlock().harvestBlock(w, p, pos, w.getBlockState(pos), w.getTileEntity(pos), breaker);
		            w.setBlockToAir(pos);
		        }
		    }
			
		}.setUnlocalizedName("hammer").setRegistryName("hammer").setCreativeTab(TabTryalliummod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("machinetryallium:hammer", "inventory"));
	}
}

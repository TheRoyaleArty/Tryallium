package fr.thearty.machinetryallium.procedure;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import fr.thearty.machinetryallium.item.ItemHammerspeed;
import fr.thearty.machinetryallium.item.ItemHammersmelt;
import fr.thearty.machinetryallium.item.ItemHammer_fortune_3_smelt;
import fr.thearty.machinetryallium.item.ItemHammer_fortune_2_smelt;
import fr.thearty.machinetryallium.item.ItemHammer_fortune_1_smelt;
import fr.thearty.machinetryallium.item.ItemHammer;
import fr.thearty.machinetryallium.item.ItemAzuriteIngot;
import fr.thearty.machinetryallium.block.BlockAzuriteOre;

import java.util.Map;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ProcedureAzuriteOreBlockDestroyedByPlayer extends ElementsMachinetryalliumMod.ModElement {
	public ProcedureAzuriteOreBlockDestroyedByPlayer(ElementsMachinetryalliumMod instance) {
		super(instance, 81);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AzuriteOreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AzuriteOreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AzuriteOreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AzuriteOreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AzuriteOreBlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemHammersmelt.block, (int) (1)).getItem())) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z,
						(FurnaceRecipes.instance().getSmeltingResult(new ItemStack(BlockAzuriteOre.block, (int) (1))).copy()));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(BlockAzuriteOre.block, (int) (1)).getItem(), -1, (int) 1, null);
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemHammer_fortune_2_smelt.block, (int) (1)).getItem())) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z,
						(FurnaceRecipes.instance().getSmeltingResult(new ItemStack(BlockAzuriteOre.block, (int) (1))).copy()));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(BlockAzuriteOre.block, (int) (1)).getItem(), -1, (int) 1, null);
			if ((Math.random() < 0.5)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemAzuriteIngot.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemHammer_fortune_3_smelt.block, (int) (1)).getItem())) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z,
						(FurnaceRecipes.instance().getSmeltingResult(new ItemStack(BlockAzuriteOre.block, (int) (1))).copy()));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(BlockAzuriteOre.block, (int) (1)).getItem(), -1, (int) 1, null);
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemAzuriteIngot.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if ((Math.random() < 0.5)) {
				if (!world.isRemote) {
					EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(ItemAzuriteIngot.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemHammer_fortune_1_smelt.block, (int) (1)).getItem())) {
			if (!world.isRemote) {
				EntityItem entityToSpawn = new EntityItem(world, x, y, z,
						(FurnaceRecipes.instance().getSmeltingResult(new ItemStack(BlockAzuriteOre.block, (int) (1))).copy()));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(BlockAzuriteOre.block, (int) (1)).getItem(), -1, (int) 1, null);
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemHammersmelt.block, (int) (1)).getItem())) {
			if (((((entity.rotationYaw) > 315) && ((entity.rotationYaw) < 360)) || (((entity.rotationYaw) > 0) && ((entity.rotationYaw) < 45)))) {
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) (y + 1), (int) z),
							world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) z));
				}
			}
			if ((((entity.rotationYaw) > 135) && ((entity.rotationYaw) < 225))) {
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) (y + 1), (int) z),
							world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) z));
				}
			}
			if ((((entity.rotationYaw) > 225) && ((entity.rotationYaw) < 315))) {
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) (z - 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) (z - 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) (z + 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) (z + 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) (z + 1)), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) (z - 1)), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z - 1)));
				}
			}
			if ((((entity.rotationYaw) > 45) && ((entity.rotationYaw) < 135))) {
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) (z - 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) (z - 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) (z + 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) (z + 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) (z + 1)), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) (z - 1)), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z - 1)));
				}
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemHammer.block, (int) (1)).getItem())) {
			if (((((entity.rotationYaw) > 315) && ((entity.rotationYaw) < 360)) || (((entity.rotationYaw) > 0) && ((entity.rotationYaw) < 45)))) {
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) (y + 1), (int) z),
							world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) z));
				}
			}
			if ((((entity.rotationYaw) > 135) && ((entity.rotationYaw) < 225))) {
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) (y + 1), (int) z),
							world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) z));
				}
			}
			if ((((entity.rotationYaw) > 225) && ((entity.rotationYaw) < 315))) {
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) (z - 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) (z - 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) (z + 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) (z + 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) (z + 1)), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) (z - 1)), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z - 1)));
				}
			}
			if ((((entity.rotationYaw) > 45) && ((entity.rotationYaw) < 135))) {
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) (z - 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) (z - 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) (z + 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) (z + 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) (z + 1)), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) (z - 1)), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z - 1)));
				}
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemHammerspeed.block, (int) (1)).getItem())) {
			if (((((entity.rotationYaw) > 315) && ((entity.rotationYaw) < 360)) || (((entity.rotationYaw) > 0) && ((entity.rotationYaw) < 45)))) {
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) (y + 1), (int) z),
							world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) z));
				}
			}
			if ((((entity.rotationYaw) > 135) && ((entity.rotationYaw) < 225))) {
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) (y - 1), (int) z),
							world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) (y + 1), (int) z),
							world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x + 1), (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) (x - 1), (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) z));
				}
			}
			if ((((entity.rotationYaw) > 225) && ((entity.rotationYaw) < 315))) {
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) (z - 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) (z - 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) (z + 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) (z + 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) (z + 1)), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) (z - 1)), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z - 1)));
				}
			}
			if ((((entity.rotationYaw) > 45) && ((entity.rotationYaw) < 135))) {
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) z));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) (z - 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) (z - 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y - 1), (int) (z + 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) (y + 1), (int) (z + 1)),
							world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) (z + 1)), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z + 1)));
				}
				if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock()
						.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))) > (-1))
						&& ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock()
								.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))) < 4))) {
					world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))).getBlock().dropBlockAsItem(world,
							new BlockPos((int) x, (int) y, (int) (z - 1)), world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), 1);
					world.setBlockToAir(new BlockPos((int) x, (int) y, (int) (z - 1)));
				}
			}
		}
	}
}

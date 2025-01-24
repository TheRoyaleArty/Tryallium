package fr.thearty.machinetryallium.procedure;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ProcedureHammerspeed2BlockDestroyedWithTool extends ElementsMachinetryalliumMod.ModElement {
	public ProcedureHammerspeed2BlockDestroyedWithTool(ElementsMachinetryalliumMod instance) {
		super(instance, 116);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Hammerspeed2BlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Hammerspeed2BlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Hammerspeed2BlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Hammerspeed2BlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Hammerspeed2BlockDestroyedWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
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
						new BlockPos((int) (x - 1), (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)),
						1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
							.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) < 4))) {
				world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x - 1), (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)),
						1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 1), (int) z));
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock()
							.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) < 4))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x + 1), (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)),
						1);
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock()
							.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) < 4))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x + 1), (int) (y + 1), (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)),
						1);
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
						new BlockPos((int) (x - 1), (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)),
						1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
			}
			if ((((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock()
							.getHarvestLevel(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))) < 4))) {
				world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x - 1), (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)),
						1);
				world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 1), (int) z));
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock()
							.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))) < 4))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x + 1), (int) (y - 1), (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)),
						1);
				world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
			}
			if ((((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) > (-1))
					&& ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock()
							.getHarvestLevel(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))) < 4))) {
				world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
						new BlockPos((int) (x + 1), (int) (y + 1), (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)),
						1);
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
						new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))),
						1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock()
							.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) < 4))) {
				world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))),
						1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)));
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock()
							.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) < 4))) {
				world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))),
						1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock()
							.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) < 4))) {
				world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))),
						1);
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
						new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))),
						1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock()
							.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))) < 4))) {
				world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))),
						1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)));
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock()
							.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))) < 4))) {
				world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))),
						1);
				world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
			}
			if ((((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock()
					.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) > (-1))
					&& ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock()
							.getHarvestLevel(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))) < 4))) {
				world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
						new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))),
						1);
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

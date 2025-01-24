package fr.thearty.machinetryallium.procedure;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import fr.thearty.machinetryallium.MachinetryalliumModVariables;
import net.minecraft.world.World;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import fr.thearty.machinetryallium.block.BlockFlower1;

import java.util.Map;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ProcedureTestirrigateur extends ElementsMachinetryalliumMod.ModElement {
	public ProcedureTestirrigateur(ElementsMachinetryalliumMod instance) {
		super(instance, 185);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Testirrigateur!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Testirrigateur!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Testirrigateur!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Testirrigateur!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Testirrigateur!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		boolean irrigateur = false;
		MachinetryalliumModVariables.MapVariables.get(world).timerstickrouge = (double) (-3);
		MachinetryalliumModVariables.MapVariables.get(world).syncData(world);
		irrigateur = (boolean) (false);
		for (int index0 = 0; index0 < (int) (6); index0++) {
			MachinetryalliumModVariables.MapVariables.get(world).timerstickrouge = (double) (-3);
			MachinetryalliumModVariables.MapVariables.get(world).syncData(world);
			for (int index1 = 0; index1 < (int) (6); index1++) {
				MachinetryalliumModVariables.MapVariables.get(world).timerstickrouge = (double) (-3);
				MachinetryalliumModVariables.MapVariables.get(world).syncData(world);
				for (int index2 = 0; index2 < (int) (6); index2++) {
					if (((world.getBlockState(new BlockPos((int) (x + (MachinetryalliumModVariables.MapVariables.get(world).timerstickrouge)),
							(int) (y + (MachinetryalliumModVariables.MapVariables.get(world).timerstickrouge)),
							(int) (z + (MachinetryalliumModVariables.MapVariables.get(world).timerstickrouge)))))
									.getBlock() == BlockFlower1.block.getDefaultState().getBlock())) {
						irrigateur = (boolean) (true);
						MachinetryalliumModVariables.MapVariables
								.get(world).timerstickrouge = (double) ((MachinetryalliumModVariables.MapVariables.get(world).timerstickrouge) + 1);
						MachinetryalliumModVariables.MapVariables.get(world).syncData(world);
					}
				}
				MachinetryalliumModVariables.MapVariables
						.get(world).timerstickrouge = (double) ((MachinetryalliumModVariables.MapVariables.get(world).timerstickrouge) + 1);
				MachinetryalliumModVariables.MapVariables.get(world).syncData(world);
			}
			MachinetryalliumModVariables.MapVariables
					.get(world).timerstickrouge = (double) ((MachinetryalliumModVariables.MapVariables.get(world).timerstickrouge) + 1);
			MachinetryalliumModVariables.MapVariables.get(world).syncData(world);
		}
		if (((irrigateur) == (true))) {
			if (entity instanceof EntityPlayer && !entity.world.isRemote) {
				((EntityPlayer) entity).sendStatusMessage(new TextComponentString("trouver"), (true));
			}
		}
	}
}

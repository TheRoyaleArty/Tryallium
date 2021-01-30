package fr.thearty.machinetryallium.procedure;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import fr.thearty.machinetryallium.block.BlockFlower1;

import java.util.Map;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ProcedureTryalliumseedUpdateTick extends ElementsMachinetryalliumMod.ModElement {
	public ProcedureTryalliumseedUpdateTick(ElementsMachinetryalliumMod instance) {
		super(instance, 93);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure TryalliumseedUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure TryalliumseedUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure TryalliumseedUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TryalliumseedUpdateTick!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockFlower1.block.getDefaultState(), 3);
	}
}

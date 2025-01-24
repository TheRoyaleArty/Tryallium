package fr.thearty.machinetryallium.procedure;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ProcedureAntichuteOnPotionActiveTick extends ElementsMachinetryalliumMod.ModElement {
	public ProcedureAntichuteOnPotionActiveTick(ElementsMachinetryalliumMod instance) {
		super(instance, 179);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AntichuteOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure AntichuteOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure AntichuteOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure AntichuteOnPotionActiveTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AntichuteOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.AIR.getDefaultState().getBlock())) {
			entity.setPositionAndUpdate(x, ((entity.posY) + 5), z);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.COBBLESTONE.getDefaultState(), 3);
		}
	}
}

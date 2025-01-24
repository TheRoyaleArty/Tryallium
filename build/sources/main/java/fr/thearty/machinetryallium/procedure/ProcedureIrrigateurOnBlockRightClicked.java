package fr.thearty.machinetryallium.procedure;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import fr.thearty.machinetryallium.MachinetryalliumMod;
import fr.thearty.machinetryallium.gui.GuiIrrigateurgui;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ProcedureIrrigateurOnBlockRightClicked extends ElementsMachinetryalliumMod.ModElement {
	public ProcedureIrrigateurOnBlockRightClicked(ElementsMachinetryalliumMod instance) {
		super(instance, 178);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure IrrigateurOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure IrrigateurOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure IrrigateurOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure IrrigateurOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure IrrigateurOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(MachinetryalliumMod.instance, GuiIrrigateurgui.GUIID, world, x, y, z);
	}
}

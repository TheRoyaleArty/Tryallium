package fr.thearty.machinetryallium.procedure;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;

import java.util.Map;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ProcedureUnclaim extends ElementsMachinetryalliumMod.ModElement {
	public ProcedureUnclaim(ElementsMachinetryalliumMod instance) {
		super(instance, 99);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		double tileentity = 0;
		tileentity = (double) 1;
	}
}

package fr.thearty.machinetryallium.procedure;

import fr.thearty.machinetryallium.ElementsMachinetryalliumMod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.Entity;

import fr.thearty.machinetryallium.block.BlockTryalliumseed;

import java.util.Map;

@ElementsMachinetryalliumMod.ModElement.Tag
public class ProcedureGrainespawn extends ElementsMachinetryalliumMod.ModElement {
	public ProcedureGrainespawn(ElementsMachinetryalliumMod instance) {
		super(instance, 192);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Grainespawn!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Grainespawn!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Grainespawn!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Grainespawn!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.DOUBLE_PLANT.getStateFromMeta(2).getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.TALLGRASS.getStateFromMeta(1).getBlock()))) {
			if ((Math.random() < 0.1)) {
				if ((Math.random() < 0.1)) {
					if ((Math.random() < 0.1)) {
						if ((Math.random() < 0.1)) {
							if ((Math.random() < 0.1)) {
								if ((Math.random() < 0.1)) {
									if ((Math.random() < 0.1)) {
										if ((Math.random() < 0.1)) {
											if ((Math.random() < 0.1)) {
												if ((Math.random() < 0.1)) {
													if ((Math.random() < 0.1)) {
														if ((Math.random() < 0.1)) {
															if ((Math.random() < 0.1)) {
																if ((Math.random() < 0.1)) {
																	if ((Math.random() < 0.1)) {
																		if ((Math.random() < 0.1)) {
																			if ((Math.random() < 0.1)) {
																				if ((Math.random() < 0.1)) {
																					if ((Math.random() < 0.1)) {
																						if ((Math.random() < 0.1)) {
																							if (!world.isRemote) {
																								EntityItem entityToSpawn = new EntityItem(world, x, y,
																										z, new ItemStack(BlockTryalliumseed.block,
																												(int) (1)));
																								entityToSpawn.setPickupDelay(10);
																								world.spawnEntity(entityToSpawn);
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onBlockBreak(BlockEvent.BreakEvent event) {
		Entity entity = event.getPlayer();
		java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
		dependencies.put("xpAmount", event.getExpToDrop());
		dependencies.put("x", (int) event.getPos().getX());
		dependencies.put("y", (int) event.getPos().getY());
		dependencies.put("z", (int) event.getPos().getZ());
		dependencies.put("px", (int) entity.posX);
		dependencies.put("py", (int) entity.posY);
		dependencies.put("pz", (int) entity.posZ);
		dependencies.put("world", event.getWorld());
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}

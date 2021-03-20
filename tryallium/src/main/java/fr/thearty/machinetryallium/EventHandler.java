package fr.thearty.machinetryallium;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EventHandler {
	
	
	

	/*@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onRenderPre(RenderGameOverlayEvent.Pre event)
	{
		if(event.getType() == RenderGameOverlayEvent.ElementType.DEBUG)
		{
		    event.setCanceled(true);
		}
		
	}
	 
	public void drawString(FontRenderer par1FontRenderer, String fpsString, int par3, int par4, int par5)
	{
	    par1FontRenderer.drawStringWithShadow(fpsString, par3, par4, par5);
	    Minecraft mc = FMLClientHandler.instance().getClient();
	    fpsString = mc.debug.split(",", 2)[0];
	    par3 = ('3');
	    this.drawString(Minecraft.getMinecraft().fontRenderer, fpsString, 10, 50, 14737632);
	    
	    
	    
	}*/
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onRenderPre(RenderGameOverlayEvent.Pre event)
	{
	if(event.getType() == RenderGameOverlayEvent.ElementType.DEBUG)
	{
	Minecraft mc = Minecraft.getMinecraft();
	event.setCanceled(true);
	  this.drawString(Minecraft.getMinecraft().fontRenderer, mc.debug.split(",", 2)[0], 5, 50, 0xFF0000);
	}
	}
	 
	@SideOnly(Side.CLIENT)
	   public void drawString(FontRenderer fontRenderer, String str, int x, int y, int color)
	   {
	       fontRenderer.drawStringWithShadow(str, x, y, color);
	    }
	}
	
	

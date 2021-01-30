package fr.thearty.machinetryallium.gui;

import java.time.Duration;

import fr.thearty.machinetryallium.MachinetryalliumMod;
import fr.thearty.machinetryallium.item.ItemRadar;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RadarHandler {
	
	private static Minecraft mc;
    
    public static int amountTiles = 0;
                  
    
    FontRenderer fontRender;
    
    final ResourceLocation bg = new ResourceLocation(MachinetryalliumMod.MODID + ":textures/items/radar2.png");
 
    public RadarHandler()
    {
        
    }
    
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onRenderPre(RenderGameOverlayEvent.Pre event)
    {
    	this.mc = Minecraft.getMinecraft();
        this.fontRender = this.mc.fontRenderer;
      
        if(event.getType() == RenderGameOverlayEvent.ElementType.HELMET && mc.player.getHeldItem(EnumHand.MAIN_HAND).getItem() == ItemRadar.block /*&& ItemRadar.isUsed == 1*/)
        {
             mc.getTextureManager().bindTexture(this.bg);
                
            // Minecraft.getMinecraft().fontRenderer.drawModalRectWithCustomSizedTexture(5,5,0,0,32,32,32,32);        
                
             amountTiles = mc.world.getChunkFromChunkCoords(mc.player.chunkCoordX + 0,
                        mc.player.chunkCoordZ + 0).getTileEntityMap().values().size();
                
             amountTiles = amountTiles + mc.world.getChunkFromChunkCoords(mc.player.chunkCoordX + 0,
                        mc.player.chunkCoordZ + 1).getTileEntityMap().values().size();
                
             amountTiles = amountTiles + mc.world.getChunkFromChunkCoords(mc.player.chunkCoordX + 0,
                        mc.player.chunkCoordZ - 1).getTileEntityMap().values().size();
                
             amountTiles = amountTiles + mc.world.getChunkFromChunkCoords(mc.player.chunkCoordX + 1,
                        mc.player.chunkCoordZ).getTileEntityMap().values().size();
                
             amountTiles = amountTiles + mc.world.getChunkFromChunkCoords(mc.player.chunkCoordX - 1,
                        mc.player.chunkCoordZ).getTileEntityMap().values().size();   
 
             Minecraft.getMinecraft().fontRenderer.drawString(this.amountTiles + "%", 23, 39, -1);
             Minecraft.getMinecraft().fontRenderer.drawString(this.formatDuration(), 23, 48, -1);
 
             
             event.setCanceled(true);
        }
    }
    
    public static String formatDuration()
    {
        ItemStack stack = mc.player.getHeldItem(EnumHand.MAIN_HAND);
        
        int maxD = stack.getMaxDamage();
        int itemD = stack.getItemDamage();                
        
        int damage = maxD - itemD;
        
        Duration duration = Duration.ofSeconds(damage / 20);
        long seconds = duration.getSeconds();
        long absSeconds = Math.abs(seconds);
        String positive = String.format(
            "%d:%02d:%02d",
            absSeconds / 3600,
            (absSeconds % 3600) / 60,
            absSeconds % 60);
        return seconds < 0 ? "-" + positive : positive;
    }
	

}

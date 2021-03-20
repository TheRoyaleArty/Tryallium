package fr.thearty.machinetryallium;

import java.awt.Color;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(modid = MachinetryalliumMod.MODID, value = {Side.CLIENT})
public class GameOverlayHandler
{
    /*private static final ResourceLocation emptyLife = new ResourceLocation("machinetryallium\\textures\\badlife.png");
    private static final ResourceLocation fullLife = new ResourceLocation("machinetryallium\\textures\\fulllife.png");

    public static final Minecraft MC = Minecraft.getMinecraft();

    @SubscribeEvent
    public static void renderGameOverlayPre(RenderGameOverlayEvent.Pre event)
    {
        if(event.getType().equals(ElementType.HEALTH))
            event.setCanceled(true);
    }

    @SubscribeEvent
    public static void renderGameOverlayPost(RenderGameOverlayEvent.Post event)
    {
        if(event.getType().equals(ElementType.ALL))
        {
            GL11.glColor4f(1, 1, 1, 1);
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(770, 771);
            int width = event.getResolution().getScaledWidth();

            if(!MC.player.capabilities.disableDamage)
                drawHealth(event.getResolution(), MC.player);

            String s = MC.getConnection().getPlayerInfoMap().size() + "/" + MC.getConnection().currentServerMaxPlayers + " joueurs";
            Gui.drawRect(width - 5 - MC.fontRenderer.getStringWidth(s), 2, width - 2, 4 + MC.fontRenderer.FONT_HEIGHT, Integer.MIN_VALUE);
            MC.fontRenderer.drawString(s, width - 3 - MC.fontRenderer.getStringWidth(s), 4, Color.WHITE.getRGB());
        }
    }

    private static void drawHealth(ScaledResolution res, EntityPlayer player)
    {
        MC.getTextureManager().bindTexture(emptyLife);
        Gui.drawScaledCustomSizeModalRect(res.getScaledWidth() - 70, res.getScaledHeight() - 76, 0, 0, 64, 64, 64, 64, 64, 64);

        int percent = (int)(player.getHealth() * 64 / player.getMaxHealth());
        if(percent > 0)
        {
            MC.getTextureManager().bindTexture(fullLife);
            Gui.drawScaledCustomSizeModalRect(res.getScaledWidth() - 70, res.getScaledHeight() - 76 + (64 - percent), 0, 64 - percent, 64, percent, 64, percent, 64, 64);
        }
    }*/
}
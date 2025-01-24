package fr.thearty.machinetryallium.gui;

import fr.thearty.machinetryallium.currency.CurrencyHandler;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

public class GuiHDV extends GuiContainer {
    private static final ResourceLocation texture = new ResourceLocation("machinetryallium:textures/hdv_gui.png");
    private final EntityPlayer player;
    public static int GUIID = 15;
    private final World world;

    public GuiHDV(EntityPlayer player, World world, Container container) {
        super(container);
        this.player = player;
        this.world = world;
        this.xSize = 176;
        this.ySize = 166;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(texture);
        int guiLeft = (this.width - this.xSize) / 2;
        int guiTop = (this.height - this.ySize) / 2;
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, this.xSize, this.ySize);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        this.fontRenderer.drawString(I18n.format("Hôtel Des Ventes"), 8, 6, 0x404040);
        this.fontRenderer.drawString(I18n.format("Solde: " + CurrencyHandler.getBalance(player)), 8, 20, 0x404040);
    }

    @Override
    public void initGui() {
        super.initGui();
        int guiLeft = (this.width - this.xSize) / 2;
        int guiTop = (this.height - this.ySize) / 2;

        this.buttonList.add(new GuiButton(0, guiLeft + 10, guiTop + 50, 75, 20, "Acheter"));
        this.buttonList.add(new GuiButton(1, guiLeft + 90, guiTop + 50, 75, 20, "Vendre"));
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if (button.id == 0) {
            player.sendMessage(new TextComponentTranslation("Vous avez cliqué sur 'Acheter'."));
        }
        if (button.id == 1) {
            player.sendMessage(new TextComponentTranslation("Vous avez cliqué sur 'Acheter'."));
        }
    }
}
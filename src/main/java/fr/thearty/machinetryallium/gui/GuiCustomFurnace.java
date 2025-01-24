package fr.thearty.machinetryallium.gui;

import org.lwjgl.opengl.GL11;

import fr.thearty.machinetryallium.ContainerCustomFurnace;
import fr.thearty.machinetryallium.TileCustomFurnace;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiCustomFurnace extends GuiContainer {
	
	
	private static final ResourceLocation background = new ResourceLocation("machinetryallium:textures/custom_furnace.png");
	private TileCustomFurnace tile;
	
	
	public GuiCustomFurnace(TileCustomFurnace tile, InventoryPlayer playerInv) {
        super(new ContainerCustomFurnace(tile, playerInv));
        this.tile = tile;
        
  }
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		this.drawDefaultBackground();
		super.drawScreen(mouseX, mouseY, partialTicks);
		this.renderHoveredToolTip(mouseX, mouseY);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		int i = (this.width - this.xSize) / 2;
	    int j = (this.height - this.ySize) / 2;
	    //this.drawDefaultBackground();
	    this.mc.renderEngine.bindTexture(background);
	    this.drawTexturedModalRect(i, j, 0, 0, this.xSize, this.ySize);
	 
	    int timePassed = this.tile.getField(1);
	    int textureWidth = (int) (23f / 200f * timePassed);
	    this.drawTexturedModalRect(i + 81, j + 24, 177, 18, textureWidth, 7);
	 
	    if (this.tile.isBurning()) {
	        int burningTime = this.tile.getField(0);
	        int textureHeight = (int) (12f / this.tile.getFullBurnTime() * burningTime);
	        this.drawTexturedModalRect(i + 37, j + 26 + 12 - textureHeight,
	                177, 12 - textureHeight, 27, textureHeight);
	    }
	 
	    this.fontRenderer.drawString(this.tile.getName(), i + 80, j + 45, 0xFFFFFF);
	}
	
	
	
}
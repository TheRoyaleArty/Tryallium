package fr.thearty.machinetryallium.gui;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import fr.thearty.machinetryallium.MachinetryalliumMod;
import fr.thearty.machinetryallium.ModTutorielConfig;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.config.DummyConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

public class ModTutorielGuiFactory implements IModGuiFactory
{
 
    @Override
    public void initialize(Minecraft minecraftInstance)
    {}
 
    @Override
    public boolean hasConfigGui() {
    return true;
    }
     
    @Override
    public GuiScreen createConfigGui(GuiScreen parentScreen) {
    return new ModTutorielConfigGui(parentScreen);
    }
 
    @Override
    public Set <RuntimeOptionCategoryElement>runtimeGuiCategories()
    {
        return null;
    }
 
    
    public RuntimeOptionCategoryElement getHandlerFor(RuntimeOptionCategoryElement element)
    {
        return null;
    }
    
    
    
    
    public static class ModTutorielConfigGui extends GuiConfig
    {
        public ModTutorielConfigGui(GuiScreen parent)
        {
            super(parent, getConfigElements(), MachinetryalliumMod.MODID, false, false, I18n.format("machinetryallium.config.gui.mainTitle", new Object[] {}));
        }
 
        private static List <IConfigElement>getConfigElements()
        {
            List <IConfigElement>list = new ArrayList<IConfigElement>();
            list.add(new DummyConfigElement("modtutoConfig", "machinetryallium.config.gui.generalTitle", null,  null, new ConfigElement(ModTutorielConfig.getConfig().getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), list));
            return list;
        }
    }


	
    
    
    
    
    
    
}
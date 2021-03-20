package fr.thearty.machinetryallium;



import java.util.ArrayList;
import java.util.List;
 
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
 
public class ModTutorielConfig
{
    private static Configuration config;
 
    public static String welcomeMessage = "";
    public static boolean showWelcomeMessage = true;
 
    public static void preInit(FMLPreInitializationEvent event)
    {
        config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
 
        syncConfig();
    }
 
    public static Configuration getConfig()
    {
        return config;
    }
 
    public static void onConfigChanged(OnConfigChangedEvent event)
    {
        if(event.getModID().equals(MachinetryalliumMod.MODID))
        {
            syncConfig();
        }
    }
 
    public static void syncConfig()
    {
        Property prop;
 
        List <String>propOrder = new ArrayList<String>();
 
        prop = config.get(Configuration.CATEGORY_GENERAL, "welcomeMessage", "Bienvenue � toi %player%");
        prop.setComment("The code %player% will be replaced by player's name");
        prop.setLanguageKey("modtuto.config.welcomeMessage.title");
 
        welcomeMessage = prop.getString();
        if(welcomeMessage.equals(""))
        {
            welcomeMessage = "Bienvenue � toi %player%";
            prop.setValue("Bienvenue � toi %player%");
        }
        propOrder.add(prop.getName());
 
        prop = config.get(Configuration.CATEGORY_GENERAL, "showWelcomeMessage", true);
        prop.setComment("Set to false to disable welcome's message");
        prop.setLanguageKey("modtuto.config.showWelcomeMessage.title");
 
        showWelcomeMessage = prop.getBoolean();
        propOrder.add(prop.getName());
 
        config.setCategoryPropertyOrder(Configuration.CATEGORY_GENERAL, propOrder);
 
        if(config.hasChanged())
        {
            config.save();
        }
    }
}

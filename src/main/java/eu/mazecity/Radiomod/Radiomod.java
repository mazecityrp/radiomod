package eu.mazecity.Radiomod;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = "radiomod", name = "Radiomod", version = "0.1.0", acceptedMinecraftVersions = "[1.12,1.12.2]")
public class Radiomod
{
    public static final String MODID = "radiomod";
    @Instance(Radiomod.MODID)
    public static Radiomod instance;

    @SidedProxy(clientSide = "eu.mazecity.Radiomod.RadiomodClient", serverSide = "eu.mazecity.Radiomod.RadiomodServer")
    public static RadiomodCommon proxy;

    public static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        proxy.preInit(event.getSuggestedConfigurationFile());
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }

};


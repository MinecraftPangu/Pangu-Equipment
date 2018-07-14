package cn.mccraft.pangu.tools;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = PanguTools.ID, name = PanguTools.NAME, version = PanguTools.VERSION, dependencies = "required:pangu@[1.0.3,)")
public class PanguTools {
    public static final String ID = "pangu-tools";
    public static final String NAME = "Pangu Tools";
    public static final String VERSION = "1.0.0";

    private static final Logger logger = LogManager.getLogger("Pangu-Tools");

    public static Logger getLogger() {
        return logger;
    }

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) { }
}

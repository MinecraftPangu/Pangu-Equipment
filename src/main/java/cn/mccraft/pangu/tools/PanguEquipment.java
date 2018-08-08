package cn.mccraft.pangu.tools;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = PanguEquipment.ID,
        name = PanguEquipment.NAME,
        version = PanguEquipment.VERSION,
        dependencies = "required:pangu@[1.0.3,)",
        acceptedMinecraftVersions = "[1.12.2,1.13)"
)
public class PanguEquipment {
    public static final String ID = "panguequipment";
    public static final String NAME = "Pangu Equipment";
    public static final String VERSION = "@MOD_VERSION@";

    private static final Logger logger = LogManager.getLogger("Pangu-Tools");

    public static Logger getLogger() {
        return logger;
    }

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) { }
}

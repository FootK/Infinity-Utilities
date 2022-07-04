package infinityutilities;

import com.mojang.logging.LogUtils;
import infinityutilities.blocks.MBlocks;
import infinityutilities.data.worldgen.WorldDataGenerator;
import infinityutilities.handler.ConfigHandler;
import infinityutilities.init.MItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.slf4j.Logger;


@Mod("infinityutilities")
public class infinityutilities {
    public static final String MOD_ID = "infinityutilities";

    private static final Logger LOGGER = LogUtils.getLogger();

    public infinityutilities() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHandler.COMMON_CONFIG);
        ConfigHandler.loadConfig(ConfigHandler.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve("infinityutilities-common.toml"));


        MItems.register(eventBus);
        MBlocks.register(eventBus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        eventBus.addListener(WorldDataGenerator::generateWorldData);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }
}

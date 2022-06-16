package infinityutilities;

import com.mojang.logging.LogUtils;
import infinityutilities.init.MBlocks;
import infinityutilities.init.MItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod("infinityutilities")
public class infinityutilities {
    public static final String MOD_ID = "infinityutilities";

    private static final Logger LOGGER = LogUtils.getLogger();

    public infinityutilities() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MItems.register(eventBus);
        MBlocks.register(eventBus);
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }
}

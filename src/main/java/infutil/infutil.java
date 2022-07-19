package infutil;

import com.mojang.logging.LogUtils;
import infutil.blocks.MBlocks;
import infutil.client.CuriosSuperpower;
import infutil.init.MItems;
//import infutil.worldgen.TestRegion;
//import infutil.worldgen.TestSurfaceRuleData;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotTypeMessage;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;


@Mod(infutil.MOD_ID)
public class infutil {
    public static final String MOD_ID = "infutil";

    public static infutil instance;
    public static infutil eventBus;

    public static final Logger LOGGER = LogUtils.getLogger();

    // /fill ~16 100 ~16 ~ 30 ~ air replace #forge:stone
    public infutil() {
        instance = this;

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::enqueue);

        MItems.register(eventBus);
        MBlocks.register(eventBus);

//        ModBiomeCodecs.BIOME_MODIFIER_SERIALIZERS.register(eventBus);

    }
    private void enqueue(InterModEnqueueEvent event) {
        InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("superpower")
                .icon(CuriosSuperpower.SLOT_TEXTURE)
                .build());
    }
}
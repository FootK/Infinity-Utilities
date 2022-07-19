package infutil.client;

import infutil.infutil;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

@Mod.EventBusSubscriber(modid = infutil.MOD_ID, value = Dist.CLIENT, bus = MOD)
public class CuriosSuperpower {

    public static final ResourceLocation SLOT_TEXTURE = new ResourceLocation(infutil.MOD_ID, "slots/empty_superpower");

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void textureStitch(final TextureStitchEvent.Pre evt) {
        evt.addSprite(CuriosSuperpower.SLOT_TEXTURE);
    }
}
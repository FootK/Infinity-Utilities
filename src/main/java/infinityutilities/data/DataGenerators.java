package infinityutilities.data;


import infinityutilities.data.tags.BlockTagGenerator;
import infinityutilities.infinityutilities;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = infinityutilities.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent evt) {
        if (evt.includeServer()) {
        //    evt.getGenerator().addProvider(true, new CraftingRecipeBuilder(evt.getGenerator()));
        //    evt.getGenerator().addProvider(true, new LootTableGenerator(evt.getGenerator()));
            BlockTagsProvider blocktags = new BlockTagGenerator(evt.getGenerator(), evt.getExistingFileHelper());
            evt.getGenerator().addProvider(true, blocktags);
        }
    }
}
